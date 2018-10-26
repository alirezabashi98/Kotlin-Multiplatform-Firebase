package com.rubylich.ktmp.notifications.di

import android.app.NotificationManager
import android.content.Context
import com.rubylich.ktmp.notifications.*
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.Module
import org.koin.dsl.module.module
import rubylich.ktmp.notifications.NotificationItemResolver
import rubylich.ktmp.notifications.NotificationItemResolverImpl

/**
 * Created by rl98880 on 05/07/2018.
 */
fun notificationsModule(): Module = module {
    single { androidContext().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager }
    single { PushNotification(get(), get(), get()) }
    single { NotificationItemResolverImpl() as NotificationItemResolver }
    single { NotificationBuilderImpl() as NotificationBuilder }
//    single { NotificationsUnreadMessagesCounter() }
}