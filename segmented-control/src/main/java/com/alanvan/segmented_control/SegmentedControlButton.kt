package com.alanvan.segmented_control

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView

@Suppress("deprecation")
class SegmentedControlButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        textAlignment = View.TEXT_ALIGNMENT_CENTER

    }
}