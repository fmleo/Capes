package me.cael.capes.utils

import java.net.URL
import java.util.UUID

class MeteorUtils {
    fun getAccountByUuid(id: UUID): String {
        val url = URL("https://meteorclient.com/api/capeowners")
        println(id.toString())
        for (line in url.readText().lines()) {
            if (line.substring(0, 36) == id.toString()) {
                return line.substring(37, line.length)
            }
        }
        return "null"
    }

}
