.class public Lcom/mixpanel/android/mpmetrics/GCMReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GCMReceiver.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
    }
.end annotation


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.GCMReceiver"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private buildNotification(Landroid/content/Context;Landroid/content/Intent;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Landroid/app/Notification;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "inboundIntent"    # Landroid/content/Intent;
    .param p3, "iconIds"    # Lcom/mixpanel/android/mpmetrics/ResourceIds;

    .prologue
    .line 191
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->readInboundIntent(Landroid/content/Context;Landroid/content/Intent;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;

    move-result-object v2

    .line 192
    .local v2, "notificationData":Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
    if-nez v2, :cond_0

    .line 193
    const/4 v1, 0x0

    .line 213
    :goto_0
    return-object v1

    .line 196
    :cond_0
    sget-boolean v3, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v3, :cond_1

    const-string v3, "MixpanelAPI.GCMReceiver"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MP GCM notification received: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v2, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    :cond_1
    const/4 v3, 0x0

    .line 200
    iget-object v4, v2, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->intent:Landroid/content/Intent;

    .line 201
    const/high16 v5, 0x8000000

    .line 197
    invoke-static {p1, v3, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 205
    .local v0, "contentIntent":Landroid/app/PendingIntent;
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x10

    if-lt v3, v4, :cond_2

    .line 206
    invoke-direct {p0, p1, v0, v2}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->makeNotificationSDK16OrHigher(Landroid/content/Context;Landroid/app/PendingIntent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)Landroid/app/Notification;

    move-result-object v1

    .line 207
    .local v1, "notification":Landroid/app/Notification;
    goto :goto_0

    .end local v1    # "notification":Landroid/app/Notification;
    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-lt v3, v4, :cond_3

    .line 208
    invoke-direct {p0, p1, v0, v2}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->makeNotificationSDK11OrHigher(Landroid/content/Context;Landroid/app/PendingIntent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)Landroid/app/Notification;

    move-result-object v1

    .line 209
    .restart local v1    # "notification":Landroid/app/Notification;
    goto :goto_0

    .line 210
    .end local v1    # "notification":Landroid/app/Notification;
    :cond_3
    invoke-direct {p0, p1, v0, v2}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->makeNotificationSDKLessThan11(Landroid/content/Context;Landroid/app/PendingIntent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)Landroid/app/Notification;

    move-result-object v1

    .restart local v1    # "notification":Landroid/app/Notification;
    goto :goto_0
.end method

.method private buildNotificationIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "uriString"    # Ljava/lang/String;

    .prologue
    .line 175
    const/4 v1, 0x0

    .line 176
    .local v1, "uri":Landroid/net/Uri;
    if-eqz p2, :cond_0

    .line 177
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 181
    :cond_0
    if-nez v1, :cond_1

    .line 182
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->getDefaultIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 187
    .local v0, "ret":Landroid/content/Intent;
    :goto_0
    return-object v0

    .line 184
    .end local v0    # "ret":Landroid/content/Intent;
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .restart local v0    # "ret":Landroid/content/Intent;
    goto :goto_0
.end method

.method private handleNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 240
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v1

    .line 241
    .local v1, "config":Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getResourcePackageName()Ljava/lang/String;

    move-result-object v5

    .line 242
    .local v5, "resourcePackage":Ljava/lang/String;
    if-nez v5, :cond_0

    .line 243
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 246
    :cond_0
    new-instance v2, Lcom/mixpanel/android/mpmetrics/ResourceReader$Drawables;

    invoke-direct {v2, v5, p1}, Lcom/mixpanel/android/mpmetrics/ResourceReader$Drawables;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 247
    .local v2, "drawableIds":Lcom/mixpanel/android/mpmetrics/ResourceIds;
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 248
    .local v0, "applicationContext":Landroid/content/Context;
    invoke-direct {p0, v0, p2, v2}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->buildNotification(Landroid/content/Context;Landroid/content/Intent;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Landroid/app/Notification;

    move-result-object v3

    .line 250
    .local v3, "notification":Landroid/app/Notification;
    if-eqz v3, :cond_1

    .line 251
    const-string v6, "notification"

    invoke-virtual {p1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/NotificationManager;

    .line 252
    .local v4, "notificationManager":Landroid/app/NotificationManager;
    const/4 v6, 0x0

    invoke-virtual {v4, v6, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 254
    .end local v4    # "notificationManager":Landroid/app/NotificationManager;
    :cond_1
    return-void
.end method

.method private handleRegistrationIntent(Landroid/content/Intent;)V
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 217
    const-string v1, "registration_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 218
    .local v0, "registration":Ljava/lang/String;
    const-string v1, "error"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 219
    const-string v1, "MixpanelAPI.GCMReceiver"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error when registering for GCM: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "error"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    :cond_0
    :goto_0
    return-void

    .line 220
    :cond_1
    if-eqz v0, :cond_3

    .line 221
    sget-boolean v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v1, :cond_2

    const-string v1, "MixpanelAPI.GCMReceiver"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Registering GCM ID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    :cond_2
    new-instance v1, Lcom/mixpanel/android/mpmetrics/GCMReceiver$1;

    invoke-direct {v1, p0, v0}, Lcom/mixpanel/android/mpmetrics/GCMReceiver$1;-><init>(Lcom/mixpanel/android/mpmetrics/GCMReceiver;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->allInstances(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;)V

    goto :goto_0

    .line 228
    :cond_3
    const-string v1, "unregistered"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 229
    sget-boolean v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v1, :cond_4

    const-string v1, "MixpanelAPI.GCMReceiver"

    const-string v2, "Unregistering from GCM"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    :cond_4
    new-instance v1, Lcom/mixpanel/android/mpmetrics/GCMReceiver$2;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/mpmetrics/GCMReceiver$2;-><init>(Lcom/mixpanel/android/mpmetrics/GCMReceiver;)V

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->allInstances(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;)V

    goto :goto_0
.end method

.method private makeNotificationSDK11OrHigher(Landroid/content/Context;Landroid/app/PendingIntent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)Landroid/app/Notification;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/app/PendingIntent;
    .param p3, "notificationData"    # Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 268
    new-instance v2, Landroid/app/Notification$Builder;

    invoke-direct {v2, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 269
    iget v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->icon:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 270
    iget-object v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 271
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 272
    iget-object v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->title:Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 273
    iget-object v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 274
    invoke-virtual {v2, p2}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 276
    .local v0, "builder":Landroid/app/Notification$Builder;
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v1

    .line 277
    .local v1, "n":Landroid/app/Notification;
    iget v2, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v2, v2, 0x10

    iput v2, v1, Landroid/app/Notification;->flags:I

    .line 278
    return-object v1
.end method

.method private makeNotificationSDK16OrHigher(Landroid/content/Context;Landroid/app/PendingIntent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)Landroid/app/Notification;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/app/PendingIntent;
    .param p3, "notificationData"    # Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 284
    new-instance v2, Landroid/app/Notification$Builder;

    invoke-direct {v2, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 285
    iget v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->icon:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 286
    iget-object v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 287
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 288
    iget-object v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->title:Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 289
    iget-object v3, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 290
    invoke-virtual {v2, p2}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 291
    new-instance v3, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v3}, Landroid/app/Notification$BigTextStyle;-><init>()V

    iget-object v4, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 293
    .local v0, "builder":Landroid/app/Notification$Builder;
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    .line 294
    .local v1, "n":Landroid/app/Notification;
    iget v2, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v2, v2, 0x10

    iput v2, v1, Landroid/app/Notification;->flags:I

    .line 295
    return-object v1
.end method

.method private makeNotificationSDKLessThan11(Landroid/content/Context;Landroid/app/PendingIntent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)Landroid/app/Notification;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/app/PendingIntent;
    .param p3, "notificationData"    # Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 259
    new-instance v0, Landroid/app/Notification;

    iget v1, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->icon:I

    iget-object v2, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v0, v1, v2, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 260
    .local v0, "n":Landroid/app/Notification;
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 261
    iget-object v1, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->title:Ljava/lang/CharSequence;

    iget-object v2, p3, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2, p2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 262
    return-object v0
.end method


# virtual methods
.method getDefaultIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 123
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 124
    .local v0, "manager":Landroid/content/pm/PackageManager;
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    return-object v1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 96
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 97
    .local v0, "action":Ljava/lang/String;
    const-string v1, "com.google.android.c2dm.intent.REGISTRATION"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 98
    invoke-direct {p0, p2}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->handleRegistrationIntent(Landroid/content/Intent;)V

    .line 102
    :cond_0
    :goto_0
    return-void

    .line 99
    :cond_1
    const-string v1, "com.google.android.c2dm.intent.RECEIVE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->handleNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0
.end method

.method readInboundIntent(Landroid/content/Context;Landroid/content/Intent;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "inboundIntent"    # Landroid/content/Intent;
    .param p3, "iconIds"    # Lcom/mixpanel/android/mpmetrics/ResourceIds;

    .prologue
    .line 128
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    .line 130
    .local v9, "manager":Landroid/content/pm/PackageManager;
    const-string v0, "mp_message"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 131
    .local v3, "message":Ljava/lang/String;
    const-string v0, "mp_icnm"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 132
    .local v8, "iconName":Ljava/lang/String;
    const-string v0, "mp_cta"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 133
    .local v10, "uriString":Ljava/lang/String;
    const-string v0, "mp_title"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 135
    .local v2, "notificationTitle":Ljava/lang/CharSequence;
    if-nez v3, :cond_0

    .line 136
    const/4 v0, 0x0

    .line 171
    :goto_0
    return-object v0

    .line 139
    :cond_0
    const/4 v1, -0x1

    .line 140
    .local v1, "notificationIcon":I
    if-eqz v8, :cond_1

    .line 141
    invoke-interface {p3, v8}, Lcom/mixpanel/android/mpmetrics/ResourceIds;->knownIdName(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    invoke-interface {p3, v8}, Lcom/mixpanel/android/mpmetrics/ResourceIds;->idFromName(Ljava/lang/String;)I

    move-result v1

    .line 148
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v9, v0, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 153
    .local v6, "appInfo":Landroid/content/pm/ApplicationInfo;
    :goto_1
    const/4 v0, -0x1

    if-ne v1, v0, :cond_2

    if-eqz v6, :cond_2

    .line 154
    iget v1, v6, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 157
    :cond_2
    const/4 v0, -0x1

    if-ne v1, v0, :cond_3

    .line 158
    const v1, 0x1080093

    .line 161
    :cond_3
    if-nez v2, :cond_4

    if-eqz v6, :cond_4

    .line 162
    invoke-virtual {v9, v6}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 165
    :cond_4
    if-nez v2, :cond_5

    .line 166
    const-string v2, "A message for you"

    .line 169
    :cond_5
    invoke-direct {p0, p1, v10}, Lcom/mixpanel/android/mpmetrics/GCMReceiver;->buildNotificationIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 171
    .local v4, "notificationIntent":Landroid/content/Intent;
    new-instance v0, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;-><init>(ILjava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)V

    goto :goto_0

    .line 149
    .end local v4    # "notificationIntent":Landroid/content/Intent;
    .end local v6    # "appInfo":Landroid/content/pm/ApplicationInfo;
    :catch_0
    move-exception v7

    .line 150
    .local v7, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const/4 v6, 0x0

    .restart local v6    # "appInfo":Landroid/content/pm/ApplicationInfo;
    goto :goto_1
.end method
