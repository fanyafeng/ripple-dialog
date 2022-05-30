package com.ripple.dialog.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.ripple.dialog.R
import com.ripple.dialog.widget.impl.RippleDialog


/**
 * Author: fanyafeng
 * Date: 2022/5/30 13:27
 * Email: fanyafeng@live.cn
 * Description:
 */
class LoadingSimpleDialog(val context: Context) {

    private var loadingDialog: RippleDialog? = null
    private var loadingView: View? = null

    init {
        if (loadingView == null) {
            loadingView =
                LayoutInflater.from(context).inflate(R.layout.rippple_dialog_custom_loading, null)
        }

        if (loadingDialog == null) {
            loadingDialog = RippleDialog(context, loadingView!!)
            loadingDialog?.setCancel(false)
        }
    }

    fun show() {
        loadingDialog?.show()
    }

    fun dismiss() {
        loadingDialog?.dismiss()
    }

}