.class public Lcom/urbanairship/analytics/DefaultEnvironment;
.super Lcom/urbanairship/analytics/Environment;
.source "DefaultEnvironment.java"


# instance fields
.field conversionPushId:Ljava/lang/String;

.field lastSendId:Ljava/lang/String;

.field sessionId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/urbanairship/analytics/Environment;-><init>()V

    .line 33
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->getConversionPushId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/DefaultEnvironment;->conversionPushId:Ljava/lang/String;

    .line 34
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->getSessionId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/DefaultEnvironment;->sessionId:Ljava/lang/String;

    .line 36
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v0

    iget-boolean v0, v0, Lcom/urbanairship/AirshipConfigOptions;->pushServiceEnabled:Z

    if-eqz v0, :cond_0

    .line 37
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getLastReceivedSendId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/DefaultEnvironment;->lastSendId:Ljava/lang/String;

    .line 39
    :cond_0
    return-void
.end method


# virtual methods
.method public getApid()Ljava/lang/String;
    .locals 2

    .prologue
    .line 161
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    .line 163
    .local v0, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v0, :cond_0

    .line 164
    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v1

    .line 167
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getCarrier()Ljava/lang/String;
    .locals 3

    .prologue
    .line 93
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "phone"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 94
    .local v0, "tm":Landroid/telephony/TelephonyManager;
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getConnectionSubType()Ljava/lang/String;
    .locals 4

    .prologue
    .line 81
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 82
    .local v0, "cm":Landroid/net/ConnectivityManager;
    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 84
    .local v1, "ni":Landroid/net/NetworkInfo;
    if-eqz v1, :cond_0

    .line 85
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v2

    .line 88
    .end local v1    # "ni":Landroid/net/NetworkInfo;
    :goto_0
    return-object v2

    :cond_0
    const-string v2, ""

    goto :goto_0
.end method

.method public getConnectionType()Ljava/lang/String;
    .locals 6

    .prologue
    .line 44
    const/4 v2, -0x1

    .line 49
    .local v2, "type":I
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "connectivity"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 50
    .local v0, "cm":Landroid/net/ConnectivityManager;
    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 52
    .local v1, "ni":Landroid/net/NetworkInfo;
    if-eqz v1, :cond_0

    .line 53
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    .line 58
    .end local v1    # "ni":Landroid/net/NetworkInfo;
    :cond_0
    sparse-switch v2, :sswitch_data_0

    .line 69
    const-string v3, "none"

    .line 72
    .local v3, "typeString":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 60
    .end local v3    # "typeString":Ljava/lang/String;
    :sswitch_0
    const-string v3, "cell"

    .line 61
    .restart local v3    # "typeString":Ljava/lang/String;
    goto :goto_0

    .line 63
    .end local v3    # "typeString":Ljava/lang/String;
    :sswitch_1
    const-string v3, "wifi"

    .line 64
    .restart local v3    # "typeString":Ljava/lang/String;
    goto :goto_0

    .line 66
    .end local v3    # "typeString":Ljava/lang/String;
    :sswitch_2
    const-string v3, "wimax"

    .line 67
    .restart local v3    # "typeString":Ljava/lang/String;
    goto :goto_0

    .line 58
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x6 -> :sswitch_2
    .end sparse-switch
.end method

.method public getConversionPushId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/urbanairship/analytics/DefaultEnvironment;->conversionPushId:Ljava/lang/String;

    return-object v0
.end method

.method public getLastSendId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/urbanairship/analytics/DefaultEnvironment;->lastSendId:Ljava/lang/String;

    return-object v0
.end method

.method public getLibVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    invoke-static {}, Lcom/urbanairship/UAirship;->getVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNotificationTypes()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .local v0, "notificationTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v1

    .line 130
    .local v1, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 131
    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isSoundEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 132
    const-string v2, "sound"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_0
    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isVibrateEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 134
    const-string v2, "vibrate"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    :cond_1
    return-object v0
.end method

.method public getOsVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public getPushTransport()Ljava/lang/String;
    .locals 1

    .prologue
    .line 156
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/AirshipConfigOptions;->getTransport()Lcom/urbanairship/AirshipConfigOptions$TransportType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/AirshipConfigOptions$TransportType;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQuietTimeInterval()[Ljava/util/Date;
    .locals 2

    .prologue
    .line 207
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    .line 209
    .local v0, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getQuietTimeInterval()[Ljava/util/Date;

    move-result-object v1

    .line 212
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/urbanairship/analytics/DefaultEnvironment;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeMillis()J
    .locals 2

    .prologue
    .line 182
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTimezone()J
    .locals 4

    .prologue
    .line 114
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    .line 115
    .local v0, "tz":Ljava/util/TimeZone;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    int-to-long v2, v1

    return-wide v2
.end method

.method public isAppInForeground()Z
    .locals 1

    .prologue
    .line 187
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v0

    return v0
.end method

.method public isDaylightSavingsTime()Z
    .locals 2

    .prologue
    .line 120
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v0

    return v0
.end method

.method public isPushEnabled()Z
    .locals 2

    .prologue
    .line 172
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    .line 174
    .local v0, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v1

    .line 177
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public isQuietTimeEnabled()Z
    .locals 2

    .prologue
    .line 197
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    .line 199
    .local v0, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v0, :cond_0

    .line 200
    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v1

    .line 202
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method
