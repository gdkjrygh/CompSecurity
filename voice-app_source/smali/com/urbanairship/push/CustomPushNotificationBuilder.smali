.class public Lcom/urbanairship/push/CustomPushNotificationBuilder;
.super Ljava/lang/Object;
.source "CustomPushNotificationBuilder.java"

# interfaces
.implements Lcom/urbanairship/push/PushNotificationBuilder;


# instance fields
.field public constantNotificationId:I

.field public layout:I

.field public layoutIconDrawableId:I

.field public layoutIconId:I

.field public layoutMessageId:I

.field public layoutSubjectId:I

.field public soundUri:Landroid/net/Uri;

.field public statusBarIconDrawableId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppIcon()I

    move-result v0

    iput v0, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutIconDrawableId:I

    .line 230
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppIcon()I

    move-result v0

    iput v0, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->statusBarIconDrawableId:I

    .line 245
    const/4 v0, -0x1

    iput v0, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->constantNotificationId:I

    return-void
.end method


# virtual methods
.method public buildNotification(Ljava/lang/String;Ljava/util/Map;)Landroid/app/Notification;
    .locals 8
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
    .line 262
    .local p2, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    .line 263
    :cond_0
    const/4 v2, 0x0

    .line 301
    :cond_1
    :goto_0
    return-object v2

    .line 268
    :cond_2
    new-instance v2, Landroid/app/Notification;

    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->statusBarIconDrawableId:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v2, v4, p1, v6, v7}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 269
    .local v2, "n":Landroid/app/Notification;
    const/16 v4, 0x10

    iput v4, v2, Landroid/app/Notification;->flags:I

    .line 270
    const/4 v4, 0x0

    iput v4, v2, Landroid/app/Notification;->defaults:I

    .line 272
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 274
    .local v1, "ctx":Landroid/content/Context;
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layout:I

    invoke-direct {v0, v4, v5}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 275
    .local v0, "contentView":Landroid/widget/RemoteViews;
    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutIconId:I

    if-eqz v4, :cond_3

    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutSubjectId:I

    if-eqz v4, :cond_3

    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutMessageId:I

    if-nez v4, :cond_4

    .line 276
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "The CustomPushNotificationBuilder object contains an invalid identifier (value of 0). layoutIconId: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutIconId:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " layoutSubjectId: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutSubjectId:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " layoutMessageId: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutMessageId:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 278
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Unable to build notification. NotificationBuilder missing required parameter."

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 280
    :cond_4
    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutSubjectId:I

    invoke-static {}, Lcom/urbanairship/UAirship;->getAppName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 281
    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutMessageId:I

    invoke-virtual {v0, v4, p1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 282
    iget v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutIconId:I

    iget v5, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->layoutIconDrawableId:I

    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 283
    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 285
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v3

    .line 287
    .local v3, "prefs":Lcom/urbanairship/push/PushPreferences;
    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->isInQuietTime()Z

    move-result v4

    if-nez v4, :cond_1

    .line 288
    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->isVibrateEnabled()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 289
    iget v4, v2, Landroid/app/Notification;->defaults:I

    or-int/lit8 v4, v4, 0x2

    iput v4, v2, Landroid/app/Notification;->defaults:I

    .line 292
    :cond_5
    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->isSoundEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 293
    iget-object v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->soundUri:Landroid/net/Uri;

    if-eqz v4, :cond_6

    .line 294
    iget-object v4, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->soundUri:Landroid/net/Uri;

    iput-object v4, v2, Landroid/app/Notification;->sound:Landroid/net/Uri;

    goto/16 :goto_0

    .line 296
    :cond_6
    iget v4, v2, Landroid/app/Notification;->defaults:I

    or-int/lit8 v4, v4, 0x1

    iput v4, v2, Landroid/app/Notification;->defaults:I

    goto/16 :goto_0
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
    .line 306
    .local p2, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget v0, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->constantNotificationId:I

    if-lez v0, :cond_0

    .line 307
    iget v0, p0, Lcom/urbanairship/push/CustomPushNotificationBuilder;->constantNotificationId:I

    .line 309
    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lcom/urbanairship/util/NotificationIDGenerator;->nextID()I

    move-result v0

    goto :goto_0
.end method
