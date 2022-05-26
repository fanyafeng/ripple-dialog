package com.ripple.dialog.config

import android.content.Context
import android.view.Gravity
import android.view.View

/**
 * Author： fanyafeng
 * Date： 2019-12-27 14:41
 * Email: fanyafeng@live.cn
 */

class RippleDialogConfig private constructor(builder: Builder) {
    /**
     * 上下文对象
     */
    var context: Context? = null

    /**
     * 主题
     */
    var themeResId: Int? = null

    /**
     * 显示位置
     */
    var gravity: Int? = null

    /**
     * 显示内容
     */
    var contentView: View? = null

    /**
     * 出现和消失动画
     */
    var animation: Int? = null

    /**
     * 点击外围是否解散
     */
    var isCancel = true

    init {
        context = builder.context
        themeResId = builder.themeResId
        gravity = builder.gravity
        animation = builder.animation
        contentView = builder.contentView
        isCancel = builder.isCancel
    }


    class Builder {
        var context: Context? = null
            private set

        var themeResId: Int? = null
            private set

        var gravity: Int? = Gravity.CENTER
            private set

        var contentView: View? = null
            private set

        var animation: Int? = null
            private set

        var isCancel = true
            private set

        fun setContext(context: Context): Builder {
            this.context = context
            return this
        }

        fun setThemeResId(themeResId: Int): Builder {
            this.themeResId = themeResId
            return this
        }

        fun setGravity(gravity: Int): Builder {
            this.gravity = gravity
            return this
        }

        fun setContentView(contentView: View): Builder {
            this.contentView = contentView
            return this
        }

        fun setAnimation(animation: Int): Builder {
            this.animation = animation
            return this
        }

//        fun setCancel(isCancel: Boolean): Builder {
//            this.isCancel = isCancel
//            return this
//        }

        /**
         * 优化后的代码
         */
        fun setCancel(isCancel: Boolean): Builder = apply {
            this.isCancel = isCancel
        }

        fun build(): RippleDialogConfig {
            return RippleDialogConfig(this)
        }

    }

}