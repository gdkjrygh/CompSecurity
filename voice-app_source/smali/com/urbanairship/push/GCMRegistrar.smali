.class abstract Lcom/urbanairship/push/GCMRegistrar;
.super Ljava/lang/Object;
.source "GCMRegistrar.java"


# static fields
.field private static final ACTION_GCM_REGISTER:Ljava/lang/String; = "com.google.android.c2dm.intent.REGISTER"

.field static final ACTION_GCM_REGISTRATION_RESPONSE:Ljava/lang/String; = "com.google.android.c2dm.intent.REGISTRATION"

.field private static final ACTION_GCM_UNREGISTER:Ljava/lang/String; = "com.google.android.c2dm.intent.UNREGISTER"

.field public static final EXTRA_GCM_REGISTRATION_ID:Ljava/lang/String; = "com.urbanairship.push.GCM_REGISTRATION_ID"

.field private static final GSF_PACKAGE:Ljava/lang/String; = "com.google.android.gsf"

.field private static final MAX_BACKOFF_TIME:J = 0x4e2000L

.field private static final PERMISSION_RECEIVE:Ljava/lang/String; = "com.google.android.c2dm.permission.RECEIVE"

.field private static final STARTING_BACKOFF_TIME:J = 0x2710L

.field private static backoffTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 72
    const-wide/16 v0, 0x2710

    sput-wide v0, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    return-void
.end method

.method static handleRegistrationIntent(Landroid/content/Intent;)V
    .locals 8
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    const-wide/16 v6, 0x2710

    .line 150
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v1

    .line 152
    .local v1, "pushEnabled":Z
    const-string v4, "registration_id"

    invoke-virtual {p0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 153
    .local v2, "registration":Ljava/lang/String;
    const-string v4, "error"

    invoke-virtual {p0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 154
    .local v0, "error":Ljava/lang/String;
    const-string v4, "unregistered"

    invoke-virtual {p0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 156
    .local v3, "unregistered":Ljava/lang/String;
    if-eqz v0, :cond_2

    .line 162
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Received GCM error: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 163
    if-eqz v1, :cond_1

    .line 164
    const-string v4, "Failed to register with GCM."

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 165
    invoke-static {v0}, Lcom/urbanairship/push/GCMRegistrar;->registrationFailed(Ljava/lang/String;)V

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 168
    :cond_1
    const-string v4, "Failed to unregister with GCM."

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 171
    :cond_2
    if-eqz v3, :cond_3

    .line 172
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unregistered from GCM: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 173
    sput-wide v6, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    goto :goto_0

    .line 174
    :cond_3
    if-eqz v2, :cond_0

    .line 175
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Received GCM Registration ID:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 176
    if-eqz v1, :cond_4

    .line 178
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v4

    new-instance v5, Lcom/urbanairship/analytics/PushServiceStartedEvent;

    invoke-direct {v5}, Lcom/urbanairship/analytics/PushServiceStartedEvent;-><init>()V

    invoke-virtual {v4, v5}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 179
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/urbanairship/push/PushManager;->setGcmId(Ljava/lang/String;)V

    .line 181
    :cond_4
    sput-wide v6, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    goto :goto_0
.end method

.method private static isGCMAvailable()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 346
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    .line 347
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GCM not supported in API level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 378
    :goto_0
    return v0

    .line 352
    :cond_0
    const-string v1, "qnx"

    const-string v2, "os.name"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "BlackBerry"

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "RIM"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 355
    :cond_1
    const-string v1, "Urban Airship Android library does not support BlackBerry. Canceling GCM registration."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 361
    :cond_2
    const-string v1, "com.google.android.c2dm.permission.RECEIVE"

    invoke-static {v1}, Lcom/urbanairship/push/GCMRegistrar;->isPermissionKnown(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 362
    const-string v1, "com.google.android.c2dm.permission.RECEIVE is unknown to PackageManager. Note that an AVD emulator may not support GCM."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 365
    const-string v1, "If you\'re running in an emulator, you need to install the appropriate image through the Android SDK and AVM manager. See http://developer.android.com/guide/google/gcm/ for further details."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 373
    :cond_3
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v1, v1, Lcom/urbanairship/AirshipConfigOptions;->gcmSender:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 374
    const-string v1, "The GCM sender ID is not set. Unable to register."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 378
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static isNewAppOrDevice()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 250
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    .line 251
    .local v0, "prefs":Lcom/urbanairship/push/PushPreferences;
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getAppVersionCode()I

    move-result v3

    if-eq v2, v3, :cond_0

    .line 252
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Version code changed to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ". GCM re-registration required."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 259
    :goto_0
    return v1

    .line 254
    :cond_0
    invoke-static {}, Lcom/urbanairship/util/Device;->getHashedDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getDeviceId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 255
    const-string v2, "Device ID changed. GCM re-registration required."

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    goto :goto_0

    .line 259
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private static isPermissionKnown(Ljava/lang/String;)Z
    .locals 4
    .param p0, "permission"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 390
    :try_start_0
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, p0, v3}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 391
    const/4 v1, 0x1

    .line 393
    :goto_0
    return v1

    .line 392
    :catch_0
    move-exception v0

    .line 393
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    goto :goto_0
.end method

.method static register()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 81
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v4

    .line 82
    .local v4, "prefs":Lcom/urbanairship/push/PushPreferences;
    invoke-virtual {v4}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v7

    if-nez v7, :cond_1

    .line 83
    const-string v7, "Push is not enabled. Canceling GCM registration."

    invoke-static {v7}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 129
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->isNewAppOrDevice()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v4}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 89
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Using GCM Registration ID: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v4}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/push/PushManager;->updateApidIfNecessary()V

    goto :goto_0

    .line 95
    :cond_2
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->isGCMAvailable()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 99
    invoke-virtual {v4}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v0

    .line 100
    .local v0, "apid":Ljava/lang/String;
    if-nez v0, :cond_3

    .line 102
    :try_start_0
    new-instance v1, Lcom/urbanairship/push/embedded/BoxOfficeClient;

    invoke-direct {v1}, Lcom/urbanairship/push/embedded/BoxOfficeClient;-><init>()V

    .line 103
    .local v1, "c":Lcom/urbanairship/push/embedded/BoxOfficeClient;
    invoke-virtual {v1}, Lcom/urbanairship/push/embedded/BoxOfficeClient;->firstRun()Ljava/lang/String;
    :try_end_0
    .catch Lcom/urbanairship/push/embedded/BoxOfficeClient$FirstRunForbiddenException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 118
    .end local v1    # "c":Lcom/urbanairship/push/embedded/BoxOfficeClient;
    :cond_3
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 119
    .local v2, "ctx":Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v7

    iget-object v6, v7, Lcom/urbanairship/AirshipConfigOptions;->gcmSender:Ljava/lang/String;

    .line 121
    .local v6, "sender":Ljava/lang/String;
    new-instance v5, Landroid/content/Intent;

    const-string v7, "com.google.android.c2dm.intent.REGISTER"

    invoke-direct {v5, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    .local v5, "registrationIntent":Landroid/content/Intent;
    const-string v7, "app"

    new-instance v8, Landroid/content/Intent;

    const-class v9, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-direct {v8, v2, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v2, v10, v8, v10}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 123
    const-string v7, "com.google.android.gsf"

    invoke-virtual {v5, v7}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string v7, "sender"

    invoke-virtual {v5, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    invoke-static {v5}, Lcom/urbanairship/push/GCMRegistrar;->startService(Landroid/content/Intent;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 127
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Sent GCM registration, sender: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 104
    .end local v2    # "ctx":Landroid/content/Context;
    .end local v5    # "registrationIntent":Landroid/content/Intent;
    .end local v6    # "sender":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 109
    .local v3, "e":Lcom/urbanairship/push/embedded/BoxOfficeClient$FirstRunForbiddenException;
    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 111
    .end local v3    # "e":Lcom/urbanairship/push/embedded/BoxOfficeClient$FirstRunForbiddenException;
    :catch_1
    move-exception v3

    .line 112
    .local v3, "e":Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Firstrun failed, will retry. Error: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 113
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->retryRegistration()V

    goto/16 :goto_0
.end method

.method private static registrationFailed(Ljava/lang/String;)V
    .locals 6
    .param p0, "errorString"    # Ljava/lang/String;

    .prologue
    .line 206
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "GCM Failure: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 220
    const-string v4, "INVALID_SENDER"

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 221
    const-string v4, "Your GCM sender ID is invalid. Please check your AirshipConfig."

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 224
    :cond_0
    const-string v4, "SERVICE_NOT_AVAILABLE"

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 225
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->retryRegistration()V

    .line 231
    :goto_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 232
    .local v0, "context":Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/push/PushManager;->getIntentReceiver()Ljava/lang/Class;

    move-result-object v2

    .line 233
    .local v2, "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v3

    .line 234
    .local v3, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v2, :cond_1

    .line 235
    new-instance v1, Landroid/content/Intent;

    const-string v4, "com.urbanairship.push.REGISTRATION_FINISHED"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 236
    .local v1, "extIntent":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v1, v4, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 237
    const-string v4, "com.urbanairship.push.APID"

    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    const-string v4, "com.urbanairship.push.REGISTRATION_VALID"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 239
    const-string v4, "com.urbanairship.push.REGISTRATION_ERROR"

    invoke-virtual {v1, v4, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 242
    .end local v1    # "extIntent":Landroid/content/Intent;
    :cond_1
    return-void

    .line 227
    .end local v0    # "context":Landroid/content/Context;
    .end local v2    # "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "prefs":Lcom/urbanairship/push/PushPreferences;
    :cond_2
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/urbanairship/push/PushManager;->setGcmId(Ljava/lang/String;)V

    .line 228
    const-wide/16 v4, 0x2710

    sput-wide v4, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    goto :goto_0
.end method

.method private static retryRegistration()V
    .locals 6

    .prologue
    .line 189
    sget-wide v2, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    const-wide/16 v4, 0x2

    mul-long/2addr v2, v4

    const-wide/32 v4, 0x4e2000

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sput-wide v2, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Scheduling GCM registration in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-wide v2, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " seconds"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 192
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 193
    .local v0, "i":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/urbanairship/push/PushService;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 194
    const-string v1, "com.urbanairship.push.GCM_REGISTRATION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-wide v2, Lcom/urbanairship/push/GCMRegistrar;->backoffTime:J

    invoke-static {v1, v0, v2, v3}, Lcom/urbanairship/util/IntentUtils;->scheduleIntent(Landroid/content/Context;Landroid/content/Intent;J)V

    .line 197
    return-void
.end method

.method static startService(Landroid/content/Intent;)Z
    .locals 6
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v3, 0x0

    .line 398
    const-string v4, "GCMRegistrar startService"

    invoke-static {v4}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 399
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 401
    .local v0, "ctx":Landroid/content/Context;
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 402
    const/4 v3, 0x1

    .line 408
    :goto_0
    return v3

    .line 403
    :catch_0
    move-exception v2

    .line 404
    .local v2, "se":Ljava/lang/SecurityException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "A security exception occurred when starting service: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 406
    .end local v2    # "se":Ljava/lang/SecurityException;
    :catch_1
    move-exception v1

    .line 407
    .local v1, "e":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "An exception occurred when starting service: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static unregister()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 135
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 137
    .local v0, "ctx":Landroid/content/Context;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.c2dm.intent.UNREGISTER"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 138
    .local v1, "unregIntent":Landroid/content/Intent;
    const-string v2, "app"

    new-instance v3, Landroid/content/Intent;

    const-class v4, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-direct {v3, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v0, v5, v3, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 139
    const-string v2, "com.google.android.gsf"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    invoke-static {v1}, Lcom/urbanairship/push/GCMRegistrar;->startService(Landroid/content/Intent;)Z

    .line 142
    return-void
.end method

.method static validateManifest()V
    .locals 11

    .prologue
    const/16 v9, 0x10

    const/4 v10, 0x0

    .line 266
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 267
    .local v5, "pm":Landroid/content/pm/PackageManager;
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 269
    .local v2, "packageName":Ljava/lang/String;
    const-string v8, "android.permission.WAKE_LOCK"

    invoke-static {v8}, Lcom/urbanairship/util/ManifestUtils;->checkRequiredPermission(Ljava/lang/String;)V

    .line 270
    const-string v8, "android.permission.GET_ACCOUNTS"

    invoke-static {v8}, Lcom/urbanairship/util/ManifestUtils;->checkRequiredPermission(Ljava/lang/String;)V

    .line 272
    const-string v8, "com.google.android.c2dm.permission.RECEIVE"

    invoke-static {v8}, Lcom/urbanairship/push/GCMRegistrar;->isPermissionKnown(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 273
    const-string v8, "com.google.android.c2dm.permission.RECEIVE"

    invoke-static {v8}, Lcom/urbanairship/util/ManifestUtils;->checkRequiredPermission(Ljava/lang/String;)V

    .line 280
    :goto_0
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v8

    iget-object v0, v8, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 281
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v8

    invoke-virtual {v8}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v8

    iget v8, v8, Lcom/urbanairship/AirshipConfigOptions;->minSdkVersion:I

    if-lt v8, v9, :cond_1

    if-eqz v0, :cond_0

    iget v8, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-lt v8, v9, :cond_1

    :cond_0
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v8, v9, :cond_2

    .line 284
    :cond_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".permission.C2D_MESSAGE"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 286
    .local v4, "permission":Ljava/lang/String;
    invoke-static {v4}, Lcom/urbanairship/push/GCMRegistrar;->isPermissionKnown(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 287
    invoke-static {v4}, Lcom/urbanairship/util/ManifestUtils;->checkRequiredPermission(Ljava/lang/String;)V

    .line 294
    .end local v4    # "permission":Ljava/lang/String;
    :cond_2
    :goto_1
    const-class v8, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-static {v8}, Lcom/urbanairship/util/ManifestUtils;->getReceiverInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    .line 296
    .local v1, "gcmReceiver":Landroid/content/pm/ComponentInfo;
    if-eqz v1, :cond_8

    .line 298
    new-instance v6, Landroid/content/Intent;

    const-string v8, "com.google.android.c2dm.intent.RECEIVE"

    invoke-direct {v6, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 299
    .local v6, "receiveIntent":Landroid/content/Intent;
    invoke-virtual {v6, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    invoke-virtual {v5, v6, v10}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 302
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "AndroidManifest.xml\'s "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-class v9, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " declaration missing required "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v6}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " filter with category = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 308
    :cond_3
    new-instance v7, Landroid/content/Intent;

    const-string v8, "com.google.android.c2dm.intent.REGISTRATION"

    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 309
    .local v7, "registrationIntent":Landroid/content/Intent;
    invoke-virtual {v7, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 311
    invoke-virtual {v5, v7, v10}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 312
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "AndroidManifest.xml\'s "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-class v9, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " declaration missing required "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v7}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " filter with category="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 319
    :cond_4
    new-instance v3, Landroid/content/Intent;

    const-string v8, "android.intent.action.PACKAGE_REPLACED"

    invoke-direct {v3, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 320
    .local v3, "packageReplacedIntent":Landroid/content/Intent;
    const-string v8, "package"

    const/4 v9, 0x0

    invoke-static {v8, v2, v9}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 321
    const-class v8, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v2, v8}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 324
    invoke-virtual {v5, v3, v10}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 325
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "AndroidManifest.xml\'s "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-class v9, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " declaration missing required filter "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ". Your app may "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "not be able to reset the GCM ID on app upgrade."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 333
    .end local v3    # "packageReplacedIntent":Landroid/content/Intent;
    .end local v6    # "receiveIntent":Landroid/content/Intent;
    .end local v7    # "registrationIntent":Landroid/content/Intent;
    :cond_5
    :goto_2
    return-void

    .line 275
    .end local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .end local v1    # "gcmReceiver":Landroid/content/pm/ComponentInfo;
    :cond_6
    const-string v8, "Required permission com.google.android.c2dm.permission.RECEIVE is unknown to PackageManager."

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 289
    .restart local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .restart local v4    # "permission":Ljava/lang/String;
    :cond_7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Required permission "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " is unknown to PackageManager."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 331
    .end local v4    # "permission":Ljava/lang/String;
    .restart local v1    # "gcmReceiver":Landroid/content/pm/ComponentInfo;
    :cond_8
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "AndroidManifest.xml missing required receiver: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-class v9, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_2
.end method
