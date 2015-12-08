.class public Lcom/urbanairship/push/BasicPushNotificationBuilder;
.super Ljava/lang/Object;
.source "BasicPushNotificationBuilder.java"

# interfaces
.implements Lcom/urbanairship/push/PushNotificationBuilder;


# instance fields
.field public appName:Ljava/lang/String;

.field public constantNotificationId:I

.field public iconDrawableId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppIcon()I

    move-result v0

    iput v0, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->iconDrawableId:I

    .line 60
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->appName:Ljava/lang/String;

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->constantNotificationId:I

    return-void
.end method


# virtual methods
.method public buildNotification(Ljava/lang/String;Ljava/util/Map;)Landroid/app/Notification;
    .locals 6
    .param p1, "alert"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    .prologue
    .local p2, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v2, 0x0

    .line 83
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    move-object v0, v2

    .line 104
    :cond_1
    :goto_0
    return-object v0

    .line 87
    :cond_2
    new-instance v0, Landroid/app/Notification;

    iget v3, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->iconDrawableId:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v0, v3, p1, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 88
    .local v0, "n":Landroid/app/Notification;
    const/16 v3, 0x10

    iput v3, v0, Landroid/app/Notification;->flags:I

    .line 89
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->appName:Ljava/lang/String;

    invoke-virtual {v0, v3, v4, p1, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 90
    const/4 v2, 0x0

    iput v2, v0, Landroid/app/Notification;->defaults:I

    .line 92
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v1

    .line 94
    .local v1, "prefs":Lcom/urbanairship/push/PushPreferences;
    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isInQuietTime()Z

    move-result v2

    if-nez v2, :cond_1

    .line 95
    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isVibrateEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 96
    iget v2, v0, Landroid/app/Notification;->defaults:I

    or-int/lit8 v2, v2, 0x2

    iput v2, v0, Landroid/app/Notification;->defaults:I

    .line 99
    :cond_3
    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isSoundEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 100
    iget v2, v0, Landroid/app/Notification;->defaults:I

    or-int/lit8 v2, v2, 0x1

    iput v2, v0, Landroid/app/Notification;->defaults:I

    goto :goto_0
.end method

.method public getNextId(Ljava/lang/String;Ljava/util/Map;)I
    .locals 1
    .param p1, "alert"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 113
    .local p2, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget v0, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->constantNotificationId:I

    if-lez v0, :cond_0

    .line 114
    iget v0, p0, Lcom/urbanairship/push/BasicPushNotificationBuilder;->constantNotificationId:I

    .line 116
    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lcom/urbanairship/util/NotificationIDGenerator;->nextID()I

    move-result v0

    goto :goto_0
.end method
