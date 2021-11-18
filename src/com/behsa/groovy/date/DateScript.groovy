package com.behsa.groovy.date

Date today = new Date()
println today
println '-----------'


Date bdate = new Date("08/21/1982")
println bdate
println bdate.format('M-d-Y')
println '-----------'

Date oneWeekFromToday = today + 7
Date oneWeekAgo = today - 7
println oneWeekFromToday
println oneWeekAgo
println '-----------'

oneWeekFromToday.downto(today){
    println it
}
println '-----------'


Date nextYear = new Date("11/18/2022")
println nextYear.next()
println nextYear.previous()
println '-----------'

