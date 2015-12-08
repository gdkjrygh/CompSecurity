.class public Lcom/urbanairship/push/PushPreferences;
.super Lcom/urbanairship/Preferences;
.source "PushPreferences.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/push/PushPreferences$QuietTime;
    }
.end annotation


# static fields
.field private static final ALIAS_KEY:Ljava/lang/String; = "com.urbanairship.push.ALIAS"

.field private static final APID_KEY:Ljava/lang/String; = "com.urbanairship.push.APID"

.field private static final APID_READY_KEY:Ljava/lang/String; = "com.urbanairship.push.APID_READY"

.field private static final APID_UPDATE_NEEDED_KEY:Ljava/lang/String; = "com.urbanairship.push.APID_UPDATE_NEEDED"

.field private static final APP_VERSION_KEY:Ljava/lang/String; = "com.urbanairship.push.APP_VERSION"

.field private static final BOX_OFFICE_SECRET_KEY:Ljava/lang/String; = "com.urbanairship.push.BOX_OFFICE_SECRET"

.field private static final DEVICE_ID_KEY:Ljava/lang/String; = "com.urbanairship.push.DEVICE_ID"

.field private static final GCM_REGISTRATION_ID_KEY:Ljava/lang/String; = "com.urbanairship.push.GCM_REGISTRATION_ID_KEY"

.field private static final KEY_PREFIX:Ljava/lang/String; = "com.urbanairship.push"

.field private static final LAST_APID_REGISTRATION_TIME_KEY:Ljava/lang/String; = "com.urbanairship.push.LAST_APID_REGISTRATION_TIME"

.field private static final LAST_CANONICAL_IDS_KEY:Ljava/lang/String; = "com.urbanairship.push.LAST_CANONICAL_IDS"

.field private static final LAST_RECEIVED_SEND_ID:Ljava/lang/String; = "com.urbanairship.push.LAST_RECEIVED_SEND_ID"

.field private static final PUSH_ENABLED_KEY:Ljava/lang/String; = "com.urbanairship.push.PUSH_ENABLED"

.field private static final RETRY_AFTER_KEY:Ljava/lang/String; = "com.urbanairship.push.RETRY_AFTER"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final SOUND_ENABLED_KEY:Ljava/lang/String; = "com.urbanairship.push.SOUND_ENABLED"

.field private static final TAGS_KEY:Ljava/lang/String; = "com.urbanairship.push.TAGS"

.field private static final VIBRATE_ENABLED_KEY:Ljava/lang/String; = "com.urbanairship.push.VIBRATE_ENABLED"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 91
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/urbanairship/Preferences;-><init>(Landroid/content/Context;)V

    .line 92
    const-string v0, "com.urbanairship.push"

    invoke-virtual {p0, v0}, Lcom/urbanairship/push/PushPreferences;->migratePreferencesFromFileToDb(Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method private sendPrefsChangedEvent()V
    .locals 2

    .prologue
    .line 96
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    new-instance v1, Lcom/urbanairship/analytics/PushPreferencesChangedEvent;

    invoke-direct {v1}, Lcom/urbanairship/analytics/PushPreferencesChangedEvent;-><init>()V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 97
    return-void
.end method


# virtual methods
.method public getAlias()Ljava/lang/String;
    .locals 2

    .prologue
    .line 379
    const-string v0, "com.urbanairship.push.ALIAS"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppVersionCode()I
    .locals 2

    .prologue
    .line 487
    const-string v0, "com.urbanairship.push.APP_VERSION"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getCanonicalIds()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 544
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 545
    .local v2, "ids":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v4, "com.urbanairship.push.LAST_CANONICAL_IDS"

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 547
    .local v1, "idString":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 549
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 550
    .local v3, "jsonArray":Lorg/json/JSONArray;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_0

    .line 551
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 550
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 553
    .end local v0    # "i":I
    .end local v3    # "jsonArray":Lorg/json/JSONArray;
    :catch_0
    move-exception v4

    .line 558
    :cond_0
    return-object v2
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 503
    const-string v0, "com.urbanairship.push.DEVICE_ID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGcmId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 454
    const-string v0, "com.urbanairship.push.GCM_REGISTRATION_ID_KEY"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getLastApidRegistrationTime()J
    .locals 4

    .prologue
    .line 512
    const-string v0, "com.urbanairship.push.LAST_APID_REGISTRATION_TIME"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lcom/urbanairship/push/PushPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLastReceivedSendId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 536
    const-string v0, "com.urbanairship.push.LAST_RECEIVED_SEND_ID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPushId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 172
    const-string v0, "com.urbanairship.push.APID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPushSecret()Ljava/lang/String;
    .locals 2

    .prologue
    .line 194
    const-string v0, "com.urbanairship.push.BOX_OFFICE_SECRET"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQuietTimeInterval()[Ljava/util/Date;
    .locals 13

    .prologue
    const/16 v12, 0xc

    const/16 v11, 0xb

    const/4 v10, 0x1

    const/4 v9, 0x0

    const/4 v8, -0x1

    .line 309
    const-string v7, "com.urbanairship.push.QuietTime.START_HOUR"

    invoke-virtual {p0, v7, v8}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 310
    .local v5, "startHr":I
    const-string v7, "com.urbanairship.push.QuietTime.START_MINUTE"

    invoke-virtual {p0, v7, v8}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 311
    .local v6, "startMin":I
    const-string v7, "com.urbanairship.push.QuietTime.END_HOUR"

    invoke-virtual {p0, v7, v8}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 312
    .local v2, "endHr":I
    const-string v7, "com.urbanairship.push.QuietTime.END_MINUTE"

    invoke-virtual {p0, v7, v8}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 314
    .local v3, "endMin":I
    if-eq v5, v8, :cond_0

    if-eq v6, v8, :cond_0

    if-eq v2, v8, :cond_0

    if-ne v3, v8, :cond_1

    .line 316
    :cond_0
    const/4 v7, 0x0

    .line 337
    :goto_0
    return-object v7

    .line 320
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 321
    .local v0, "cal":Ljava/util/Calendar;
    invoke-virtual {v0, v11, v5}, Ljava/util/Calendar;->set(II)V

    .line 322
    invoke-virtual {v0, v12, v6}, Ljava/util/Calendar;->set(II)V

    .line 323
    const/16 v7, 0xd

    invoke-virtual {v0, v7, v9}, Ljava/util/Calendar;->set(II)V

    .line 324
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    .line 327
    .local v4, "startDate":Ljava/util/Date;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 328
    invoke-virtual {v0, v11, v2}, Ljava/util/Calendar;->set(II)V

    .line 329
    invoke-virtual {v0, v12, v3}, Ljava/util/Calendar;->set(II)V

    .line 330
    const/16 v7, 0xd

    invoke-virtual {v0, v7, v9}, Ljava/util/Calendar;->set(II)V

    .line 335
    if-ge v2, v5, :cond_2

    const/4 v7, 0x5

    invoke-virtual {v0, v7, v10}, Ljava/util/Calendar;->add(II)V

    .line 336
    :cond_2
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    .line 337
    .local v1, "endDate":Ljava/util/Date;
    const/4 v7, 0x2

    new-array v7, v7, [Ljava/util/Date;

    aput-object v4, v7, v9

    aput-object v1, v7, v10

    goto :goto_0
.end method

.method public getRetryAfter()J
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 215
    const-string v0, "com.urbanairship.push.RETRY_AFTER"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lcom/urbanairship/push/PushPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getTags()Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 405
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 407
    .local v4, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const-string v5, "com.urbanairship.push.TAGS"

    const-string v6, "[]"

    invoke-virtual {p0, v5, v6}, Lcom/urbanairship/push/PushPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 409
    .local v3, "serializedTags":Ljava/lang/String;
    if-eqz v3, :cond_0

    .line 413
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 415
    .local v0, "a":Lorg/json/JSONArray;
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 416
    .local v2, "len":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v2, :cond_0

    .line 417
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 416
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 420
    .end local v0    # "a":Lorg/json/JSONArray;
    .end local v1    # "i":I
    .end local v2    # "len":I
    :catch_0
    move-exception v5

    .line 426
    :cond_0
    return-object v4
.end method

.method isAPIDReady()Z
    .locals 2

    .prologue
    .line 160
    const-string v0, "com.urbanairship.push.APID_READY"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method isApidUpdateNeeded()Z
    .locals 2

    .prologue
    .line 471
    const-string v0, "com.urbanairship.push.APID_UPDATE_NEEDED"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isInQuietTime()Z
    .locals 13

    .prologue
    const/16 v12, 0xb

    const/4 v11, 0x6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v10, -0x1

    .line 254
    invoke-virtual {p0}, Lcom/urbanairship/push/PushPreferences;->isQuietTimeEnabled()Z

    move-result v9

    if-nez v9, :cond_1

    .line 296
    :cond_0
    :goto_0
    return v8

    .line 256
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 258
    .local v3, "now":Ljava/util/Calendar;
    const-string v9, "com.urbanairship.push.QuietTime.START_HOUR"

    invoke-virtual {p0, v9, v10}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 259
    .local v5, "startHr":I
    const-string v9, "com.urbanairship.push.QuietTime.START_MINUTE"

    invoke-virtual {p0, v9, v10}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 260
    .local v6, "startMin":I
    const-string v9, "com.urbanairship.push.QuietTime.END_HOUR"

    invoke-virtual {p0, v9, v10}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 261
    .local v1, "endHr":I
    const-string v9, "com.urbanairship.push.QuietTime.END_MINUTE"

    invoke-virtual {p0, v9, v10}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 263
    .local v2, "endMin":I
    if-eq v10, v5, :cond_0

    if-eq v10, v6, :cond_0

    if-eq v10, v1, :cond_0

    if-eq v10, v2, :cond_0

    .line 272
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 273
    .local v4, "start":Ljava/util/Calendar;
    invoke-virtual {v4, v12, v5}, Ljava/util/Calendar;->set(II)V

    .line 274
    const/16 v9, 0xc

    invoke-virtual {v4, v9, v6}, Ljava/util/Calendar;->set(II)V

    .line 275
    const/16 v9, 0xd

    invoke-virtual {v4, v9, v8}, Ljava/util/Calendar;->set(II)V

    .line 277
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 278
    .local v0, "end":Ljava/util/Calendar;
    invoke-virtual {v0, v12, v1}, Ljava/util/Calendar;->set(II)V

    .line 279
    const/16 v9, 0xc

    invoke-virtual {v0, v9, v2}, Ljava/util/Calendar;->set(II)V

    .line 280
    const/16 v9, 0xd

    invoke-virtual {v0, v9, v8}, Ljava/util/Calendar;->set(II)V

    .line 285
    invoke-virtual {v4, v3}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v0, v4}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 286
    invoke-virtual {v4, v11, v10}, Ljava/util/Calendar;->add(II)V

    .line 292
    :cond_2
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 293
    invoke-virtual {v0, v11, v7}, Ljava/util/Calendar;->add(II)V

    .line 296
    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    :goto_1
    move v8, v7

    goto :goto_0

    :cond_4
    move v7, v8

    goto :goto_1
.end method

.method public isPushEnabled()Z
    .locals 2

    .prologue
    .line 105
    const-string v0, "com.urbanairship.push.PUSH_ENABLED"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isQuietTimeEnabled()Z
    .locals 2

    .prologue
    .line 234
    const-string v0, "com.urbanairship.push.QuietTime.ENABLED"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isSoundEnabled()Z
    .locals 2

    .prologue
    .line 126
    const-string v0, "com.urbanairship.push.SOUND_ENABLED"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isVibrateEnabled()Z
    .locals 2

    .prologue
    .line 145
    const-string v0, "com.urbanairship.push.VIBRATE_ENABLED"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method setAPIDReady(Z)V
    .locals 2
    .param p1, "ready"    # Z

    .prologue
    .line 164
    const-string v0, "com.urbanairship.push.APID_READY"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 165
    return-void
.end method

.method public setAlias(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 395
    const-string v0, "com.urbanairship.push.ALIAS"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 396
    return-void
.end method

.method setApidUpdateNeeded(Z)V
    .locals 2
    .param p1, "needed"    # Z

    .prologue
    .line 466
    const-string v0, "com.urbanairship.push.APID_UPDATE_NEEDED"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 467
    return-void
.end method

.method public setAppVersionCode(I)V
    .locals 2
    .param p1, "appVersion"    # I

    .prologue
    .line 479
    const-string v0, "com.urbanairship.push.APP_VERSION"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 480
    return-void
.end method

.method public setCanonicalIds(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 566
    .local p1, "canonicalIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 567
    .local v0, "array":Lorg/json/JSONArray;
    const-string v1, "com.urbanairship.push.LAST_CANONICAL_IDS"

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 568
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 1
    .param p1, "deviceId"    # Ljava/lang/String;

    .prologue
    .line 495
    const-string v0, "com.urbanairship.push.DEVICE_ID"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 496
    return-void
.end method

.method public setGcmId(Ljava/lang/String;)V
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 462
    const-string v0, "com.urbanairship.push.GCM_REGISTRATION_ID_KEY"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 463
    return-void
.end method

.method setLastApidRegistrationTime(J)V
    .locals 3
    .param p1, "lastApidRegistrationTimeMs"    # J

    .prologue
    .line 520
    const-string v0, "com.urbanairship.push.LAST_APID_REGISTRATION_TIME"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 521
    return-void
.end method

.method public setLastReceivedSendId(Ljava/lang/String;)V
    .locals 1
    .param p1, "sendId"    # Ljava/lang/String;

    .prologue
    .line 528
    const-string v0, "com.urbanairship.push.LAST_RECEIVED_SEND_ID"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 529
    return-void
.end method

.method setPushEnabled(Z)V
    .locals 2
    .param p1, "enabled"    # Z

    .prologue
    .line 115
    invoke-virtual {p0}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 116
    const-string v0, "com.urbanairship.push.PUSH_ENABLED"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 117
    invoke-direct {p0}, Lcom/urbanairship/push/PushPreferences;->sendPrefsChangedEvent()V

    .line 119
    :cond_0
    return-void
.end method

.method public setPushId(Ljava/lang/String;)Z
    .locals 2
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 182
    const-string v1, "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 183
    .local v0, "p":Ljava/util/regex/Pattern;
    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 184
    :cond_0
    const-string v1, "com.urbanairship.push.APID"

    invoke-virtual {p0, v1, p1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v1

    .line 187
    :goto_0
    return v1

    .line 186
    :cond_1
    const-string v1, "PushPreferences - attempted to save malformed APID."

    invoke-static {v1}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 187
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setPushSecret(Ljava/lang/String;)Z
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 198
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 199
    :cond_0
    const-string v0, "com.urbanairship.push.BOX_OFFICE_SECRET"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 200
    const/4 v0, 0x1

    .line 203
    :goto_0
    return v0

    .line 202
    :cond_1
    const-string v0, "PushPreferences - attempted to save malformed secret."

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 203
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setQuietTimeEnabled(Z)V
    .locals 2
    .param p1, "value"    # Z

    .prologue
    .line 242
    invoke-virtual {p0}, Lcom/urbanairship/push/PushPreferences;->isQuietTimeEnabled()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 243
    const-string v0, "com.urbanairship.push.QuietTime.ENABLED"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 244
    invoke-direct {p0}, Lcom/urbanairship/push/PushPreferences;->sendPrefsChangedEvent()V

    .line 246
    :cond_0
    return-void
.end method

.method public setQuietTimeInterval(Ljava/util/Date;Ljava/util/Date;)V
    .locals 12
    .param p1, "startTime"    # Ljava/util/Date;
    .param p2, "endTime"    # Ljava/util/Date;

    .prologue
    .line 348
    const-string v10, "com.urbanairship.push.QuietTime.START_HOUR"

    const/4 v11, -0x1

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 349
    .local v5, "oldStartHr":I
    const-string v10, "com.urbanairship.push.QuietTime.START_MINUTE"

    const/4 v11, -0x1

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 350
    .local v6, "oldStartMin":I
    const-string v10, "com.urbanairship.push.QuietTime.END_HOUR"

    const/4 v11, -0x1

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 351
    .local v3, "oldEndHr":I
    const-string v10, "com.urbanairship.push.QuietTime.END_MINUTE"

    const/4 v11, -0x1

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 353
    .local v4, "oldEndMin":I
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 354
    .local v7, "startCal":Ljava/util/Calendar;
    invoke-virtual {v7, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 355
    const/16 v10, 0xb

    invoke-virtual {v7, v10}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 356
    .local v8, "startHr":I
    const/16 v10, 0xc

    invoke-virtual {v7, v10}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 358
    .local v9, "startMin":I
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 359
    .local v0, "endCal":Ljava/util/Calendar;
    invoke-virtual {v0, p2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 360
    const/16 v10, 0xb

    invoke-virtual {v0, v10}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 361
    .local v1, "endHr":I
    const/16 v10, 0xc

    invoke-virtual {v0, v10}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 363
    .local v2, "endMin":I
    if-ne v5, v8, :cond_0

    if-ne v6, v9, :cond_0

    if-ne v3, v1, :cond_0

    if-eq v4, v2, :cond_1

    .line 365
    :cond_0
    const-string v10, "com.urbanairship.push.QuietTime.START_HOUR"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 366
    const-string v10, "com.urbanairship.push.QuietTime.START_MINUTE"

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 367
    const-string v10, "com.urbanairship.push.QuietTime.END_HOUR"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 368
    const-string v10, "com.urbanairship.push.QuietTime.END_MINUTE"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {p0, v10, v11}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 370
    invoke-direct {p0}, Lcom/urbanairship/push/PushPreferences;->sendPrefsChangedEvent()V

    .line 372
    :cond_1
    return-void
.end method

.method public setRetryAfter(J)V
    .locals 3
    .param p1, "value"    # J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 226
    const-string v0, "com.urbanairship.push.RETRY_AFTER"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 227
    return-void
.end method

.method public setSoundEnabled(Z)V
    .locals 2
    .param p1, "enabled"    # Z

    .prologue
    .line 134
    invoke-virtual {p0}, Lcom/urbanairship/push/PushPreferences;->isSoundEnabled()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 135
    const-string v0, "com.urbanairship.push.SOUND_ENABLED"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 136
    invoke-direct {p0}, Lcom/urbanairship/push/PushPreferences;->sendPrefsChangedEvent()V

    .line 138
    :cond_0
    return-void
.end method

.method public setTags(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 442
    .local p1, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-nez p1, :cond_0

    .line 447
    :goto_0
    return-void

    .line 444
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 446
    .local v0, "jsonTags":Lorg/json/JSONArray;
    const-string v1, "com.urbanairship.push.TAGS"

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public setVibrateEnabled(Z)V
    .locals 2
    .param p1, "enabled"    # Z

    .prologue
    .line 153
    invoke-virtual {p0}, Lcom/urbanairship/push/PushPreferences;->isVibrateEnabled()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 154
    const-string v0, "com.urbanairship.push.VIBRATE_ENABLED"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/push/PushPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 155
    invoke-direct {p0}, Lcom/urbanairship/push/PushPreferences;->sendPrefsChangedEvent()V

    .line 157
    :cond_0
    return-void
.end method
