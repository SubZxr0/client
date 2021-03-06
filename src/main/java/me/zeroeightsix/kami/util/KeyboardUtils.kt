package me.zeroeightsix.kami.util

import me.zeroeightsix.kami.util.text.MessageSendHelper
import me.zeroeightsix.kami.util.text.formatValue
import org.lwjgl.input.Keyboard

object KeyboardUtils {
    fun sendUnknownKeyError(bind: String) {
        MessageSendHelper.sendErrorMessage("Unknown key [${formatValue(bind)}]! " +
            "Right shift is ${formatValue("rshift")}, " +
            "left Control is ${formatValue("lcontrol")}, " +
            "and ` is ${formatValue("grave")}. " +
            "You cannot bind the ${formatValue("meta")} key."
        )
    }

    fun getKey(keyName: String): Int {
        return Keyboard.getKeyIndex(keyName.toUpperCase())
    }

    fun getKeyName(keycode: Int): String {
        return Keyboard.getKeyName(keycode)
    }
}