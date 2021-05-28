package com.shivam.philipschatapp.helper

import java.text.SimpleDateFormat

import java.util.*


object DateUtils {

    fun isSameDay(date1: Long, date2: Long?): Boolean {
        if (date2 == null) return false
        val calendar1 = Calendar.getInstance()
        calendar1.timeInMillis = date1
        val calendar2 = Calendar.getInstance()
        calendar2.timeInMillis = date2
        return calendar1[Calendar.YEAR] == calendar2[Calendar.YEAR] && calendar1[Calendar.MONTH] == calendar2[Calendar.MONTH] && calendar1[Calendar.DAY_OF_MONTH] == calendar2[Calendar.DAY_OF_MONTH]
    }

    fun getFormattedDate(date: Long): String {
        val fmt = SimpleDateFormat("dd MMM", Locale.getDefault())
        return fmt.format(Date(date))
    }

    fun getFormattedTime(date: Long): String {
        val fmt = SimpleDateFormat("hh:mm a", Locale.getDefault())
        return fmt.format(Date(date))
    }
}