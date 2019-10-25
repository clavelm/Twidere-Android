/*
 *             Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2017 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.view.iface

import android.support.v4.view.WindowInsetsCompat
import android.view.MotionEvent
import android.view.View

interface IExtendedView {

    var touchInterceptor: IExtendedView.TouchInterceptor?
    var onSizeChangedListener: IExtendedView.OnSizeChangedListener?
    var onApplyWindowInsetsCompatListener: IExtendedView.OnApplyWindowInsetsCompatListener?

    interface OnApplyWindowInsetsCompatListener {
        fun onApplyWindowInsets(insets: WindowInsetsCompat)
    }

    interface OnSizeChangedListener {
        fun onSizeChanged(view: View, w: Int, h: Int, oldw: Int, oldh: Int)
    }

    interface TouchInterceptor {

        fun dispatchTouchEvent(view: View, event: MotionEvent): Boolean

        fun onInterceptTouchEvent(view: View, event: MotionEvent): Boolean

        fun onTouchEvent(view: View, event: MotionEvent): Boolean

    }
}
