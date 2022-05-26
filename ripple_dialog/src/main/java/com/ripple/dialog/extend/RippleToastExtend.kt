@file:JvmName("RippleToastKT")

package com.ripple.dialog.extend

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.annotation.StringRes
import com.ripple.dialog.widget.impl.RippleToast

/**
 * Author： fanyafeng
 * Date： 2020-01-03 16:18
 * Email: fanyafeng@live.cn
 */


@JvmOverloads
fun View.showToast(
    charSequence: CharSequence = "",
    view: View? = null,
    duration: Int = Toast.LENGTH_SHORT,
    gravity: Int = RippleToast.GRAVITY_DEFAULT,
    xOffset: Int = 0,
    yOffset: Int = 0
) {
    context.showToast(charSequence, view, duration, gravity, xOffset, yOffset)
}

@JvmOverloads
fun View.showToast(
    @StringRes messageInt: Int,
    view: View? = null,
    duration: Int = Toast.LENGTH_SHORT,
    gravity: Int = RippleToast.GRAVITY_DEFAULT,
    xOffset: Int = 0,
    yOffset: Int = 0
) {
    context.showToast(messageInt, view, duration, gravity, xOffset, yOffset)
}

@JvmOverloads
fun Activity.showToast(
    charSequence: CharSequence = "",
    view: View? = null,
    duration: Int = Toast.LENGTH_SHORT,
    gravity: Int = RippleToast.GRAVITY_DEFAULT,
    xOffset: Int = 0,
    yOffset: Int = 0
) {
    baseContext.showToast(charSequence, view, duration, gravity, xOffset, yOffset)
}

@JvmOverloads
fun Activity.showToast(
    @StringRes messageInt: Int,
    view: View? = null,
    duration: Int = Toast.LENGTH_SHORT,
    gravity: Int = RippleToast.GRAVITY_DEFAULT,
    xOffset: Int = 0,
    yOffset: Int = 0
) {
    baseContext.showToast(messageInt, view, duration, gravity, xOffset, yOffset)
}

@JvmOverloads
fun Context.showToast(
    charSequence: CharSequence = "",
    view: View? = null,
    duration: Int = Toast.LENGTH_SHORT,
    gravity: Int = RippleToast.GRAVITY_DEFAULT,
    xOffset: Int = 0,
    yOffset: Int = 0
) {
    RippleToast.show(this, charSequence, view, duration, gravity, xOffset, yOffset)
}

@JvmOverloads
fun Context.showToast(
    @StringRes messageInt: Int,
    view: View? = null,
    duration: Int = Toast.LENGTH_SHORT,
    gravity: Int = RippleToast.GRAVITY_DEFAULT,
    xOffset: Int = 0,
    yOffset: Int = 0
) {
    RippleToast.show(
        this,
        this.resources.getString(messageInt),
        view,
        duration,
        gravity,
        xOffset,
        yOffset
    )
}