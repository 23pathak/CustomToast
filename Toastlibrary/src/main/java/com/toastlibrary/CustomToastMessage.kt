package com.toastlibrary

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class CustomToastMessage : LinearLayout {
    constructor(context: Context?) : super(context){
        initialize(context!!)
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        initialize(context!!)
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ){
        initialize(context!!)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes){
        initialize(context!!)
    }

    private fun initialize(context: Context) {
        inflate(context, R.layout.custom_toast, this)
    }
}