package com.example.android.hilt.data

import javax.security.auth.callback.Callback

interface LoggerDataSource {

    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}