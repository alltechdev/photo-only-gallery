package org.fossify.gallery.activities

import android.os.Bundle
import org.fossify.gallery.helpers.ColorModeHelper

class PhotoActivity : PhotoVideoActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        ColorModeHelper.resetColorMode(this)
    }
}
