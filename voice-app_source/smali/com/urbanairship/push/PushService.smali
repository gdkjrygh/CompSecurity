.class public Lcom/urbanairship/push/PushService;
.super Landroid/app/IntentService;
.source "PushService.java"


# static fields
.field protected static final ACTION_DELETE_APID:Ljava/lang/String; = "com.urbanairship.push.DELETE_APID"

.field protected static final ACTION_GCM_REGISTRATION:Ljava/lang/String; = "com.urbanairship.push.GCM_REGISTRATION"

.field protected static final ACTION_START_PUSH_SERVICE:Ljava/lang/String; = "com.urbanairship.push.START_SERVICE"

.field protected static final ACTION_UPDATE_APID:Ljava/lang/String; = "com.urbanairship.push.UPDATE_APID"

.field private static final API_RETRY_INTERVAL_MS:J = 0x927c0L

.field protected static final EXTRA_WAKE_LOCK_ID:Ljava/lang/String; = "com.urbanairship.push.WAKE_LOCK_ID"

.field private static final WAKE_LOCK_TIMEOUT_MS:J = 0xea60L

.field private static nextWakeLockID:I

.field private static final wakeLocks:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/PowerManager$WakeLock;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private preferences:Lcom/urbanairship/push/PushPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 94
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/urbanairship/push/PushService;->wakeLocks:Landroid/util/SparseArray;

    .line 95
    const/4 v0, 0x0

    sput v0, Lcom/urbanairship/push/PushService;->nextWakeLockID:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 101
    const-string v0, "PushService"

    invoke-direct {p0, v0}, Lcom/urbanairship/push/PushService;-><init>(Ljava/lang/String;)V

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 109
    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method static declared-synchronized acquireWakeLock()I
    .locals 8

    .prologue
    .line 340
    const-class v4, Lcom/urbanairship/push/PushService;

    monitor-enter v4

    :try_start_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 341
    .local v0, "context":Landroid/content/Context;
    const-string v3, "power"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    .line 343
    .local v1, "pm":Landroid/os/PowerManager;
    const/4 v3, 0x1

    const-string v5, "UA_GCM_WAKE_LOCK"

    invoke-virtual {v1, v3, v5}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v2

    .line 344
    .local v2, "wakeLock":Landroid/os/PowerManager$WakeLock;
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 345
    const-wide/32 v6, 0xea60

    invoke-virtual {v2, v6, v7}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 347
    sget-object v3, Lcom/urbanairship/push/PushService;->wakeLocks:Landroid/util/SparseArray;

    sget v5, Lcom/urbanairship/push/PushService;->nextWakeLockID:I

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/urbanairship/push/PushService;->nextWakeLockID:I

    invoke-virtual {v3, v5, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 348
    sget v3, Lcom/urbanairship/push/PushService;->nextWakeLockID:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return v3

    .line 340
    .end local v1    # "pm":Landroid/os/PowerManager;
    .end local v2    # "wakeLock":Landroid/os/PowerManager$WakeLock;
    :catchall_0
    move-exception v3

    monitor-exit v4

    throw v3
.end method

.method private deleteApid(Ljava/lang/String;)V
    .locals 7
    .param p1, "apid"    # Ljava/lang/String;

    .prologue
    .line 255
    iget-object v5, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 285
    :goto_0
    return-void

    .line 260
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    .line 261
    .local v1, "options":Lcom/urbanairship/AirshipConfigOptions;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v1, Lcom/urbanairship/AirshipConfigOptions;->hostURL:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "api/apids/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 262
    .local v4, "url":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 264
    new-instance v0, Lcom/urbanairship/restclient/AppAuthenticatedRequest;

    const-string v5, "DELETE"

    invoke-direct {v0, v5, v4}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .local v0, "deleteRequest":Lcom/urbanairship/restclient/AppAuthenticatedRequest;
    invoke-virtual {v0}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v2

    .line 268
    .local v2, "response":Lcom/urbanairship/restclient/Response;
    if-nez v2, :cond_1

    .line 269
    const-string v5, "Error deleting APID. Scheduling retry."

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 270
    const-string v5, "com.urbanairship.push.DELETE_APID"

    invoke-direct {p0, v5, p1}, Lcom/urbanairship/push/PushService;->scheduleAction(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 273
    :cond_1
    invoke-virtual {v2}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v3

    .line 274
    .local v3, "status":I
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Delete APID status code: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 276
    const/16 v5, 0xcc

    if-eq v3, v5, :cond_2

    const/16 v5, 0x194

    if-ne v3, v5, :cond_3

    .line 277
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Delete request succeeded with status: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 278
    :cond_3
    const/16 v5, 0x1f4

    if-lt v3, v5, :cond_4

    const/16 v5, 0x258

    if-ge v3, v5, :cond_4

    .line 279
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Delete request failed. Response status: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " (will retry)."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 280
    const-string v5, "com.urbanairship.push.DELETE_APID"

    invoke-direct {p0, v5, p1}, Lcom/urbanairship/push/PushService;->scheduleAction(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 282
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Delete request failed. Response status: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method static declared-synchronized releaseWakeLock(I)V
    .locals 3
    .param p0, "wakeLockId"    # I

    .prologue
    .line 324
    const-class v2, Lcom/urbanairship/push/PushService;

    monitor-enter v2

    :try_start_0
    sget-object v1, Lcom/urbanairship/push/PushService;->wakeLocks:Landroid/util/SparseArray;

    invoke-virtual {v1, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager$WakeLock;

    .line 326
    .local v0, "wakeLock":Landroid/os/PowerManager$WakeLock;
    if-eqz v0, :cond_0

    .line 327
    sget-object v1, Lcom/urbanairship/push/PushService;->wakeLocks:Landroid/util/SparseArray;

    invoke-virtual {v1, p0}, Landroid/util/SparseArray;->remove(I)V

    .line 329
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 330
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 333
    :cond_0
    monitor-exit v2

    return-void

    .line 324
    .end local v0    # "wakeLock":Landroid/os/PowerManager$WakeLock;
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method static runGcmIntentInService(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 156
    const-string v0, "PushService startService"

    invoke-static {v0}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 157
    const-class v0, Lcom/urbanairship/push/PushService;

    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 160
    const-string v0, "com.urbanairship.push.WAKE_LOCK_ID"

    invoke-static {}, Lcom/urbanairship/push/PushService;->acquireWakeLock()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 162
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 163
    return-void
.end method

.method private scheduleAction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "apid"    # Ljava/lang/String;

    .prologue
    .line 167
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 168
    .local v0, "i":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/urbanairship/push/PushService;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 169
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    const-string v1, "com.urbanairship.push.APID"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-wide/32 v2, 0x927c0

    invoke-static {v1, v0, v2, v3}, Lcom/urbanairship/util/IntentUtils;->scheduleIntent(Landroid/content/Context;Landroid/content/Intent;J)V

    .line 173
    return-void
.end method

.method private startPushService()V
    .locals 10

    .prologue
    .line 288
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v5

    .line 289
    .local v5, "prefs":Lcom/urbanairship/push/PushPreferences;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Push enabled: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 291
    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v7

    if-nez v7, :cond_0

    .line 292
    const-string v7, "Push is disabled.  Not starting Push Service."

    invoke-static {v7}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 317
    :goto_0
    return-void

    .line 296
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v4

    .line 298
    .local v4, "options":Lcom/urbanairship/AirshipConfigOptions;
    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->getLastApidRegistrationTime()J

    move-result-wide v0

    .line 299
    .local v0, "lastRegistration":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 301
    .local v2, "now":J
    cmp-long v7, v0, v2

    if-gtz v7, :cond_1

    const-wide/32 v8, 0x5265c00

    add-long/2addr v8, v0

    cmp-long v7, v8, v2

    if-gez v7, :cond_2

    .line 302
    :cond_1
    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Lcom/urbanairship/push/PushPreferences;->setApidUpdateNeeded(Z)V

    .line 305
    :cond_2
    invoke-virtual {v4}, Lcom/urbanairship/AirshipConfigOptions;->getTransport()Lcom/urbanairship/AirshipConfigOptions$TransportType;

    move-result-object v6

    .line 308
    .local v6, "transportType":Lcom/urbanairship/AirshipConfigOptions$TransportType;
    sget-object v7, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HELIUM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    if-ne v6, v7, :cond_3

    .line 309
    const-string v7, "The Helium transport is no longer supported."

    invoke-static {v7}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 311
    :cond_3
    sget-object v7, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HYBRID:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    if-ne v6, v7, :cond_4

    .line 312
    const-string v7, "The Hybrid transport is no longer supported. Using GCM."

    invoke-static {v7}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 315
    :cond_4
    const-string v7, "Starting GCM"

    invoke-static {v7}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 316
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->register()V

    goto :goto_0
.end method

.method private updateApid()V
    .locals 14

    .prologue
    .line 176
    iget-object v11, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v11}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v0

    .line 179
    .local v0, "apid":Ljava/lang/String;
    iget-object v11, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v11}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v11

    if-nez v11, :cond_0

    .line 180
    const-string v11, "Push is not enabled, so skipping stale APID update."

    invoke-static {v11}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 249
    :goto_0
    return-void

    .line 184
    :cond_0
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Updating APID: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 186
    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 187
    const-string v11, "No APID. Cannot update."

    invoke-static {v11}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 191
    :cond_1
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v11

    invoke-virtual {v11}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v4

    .line 192
    .local v4, "options":Lcom/urbanairship/AirshipConfigOptions;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v4, Lcom/urbanairship/AirshipConfigOptions;->hostURL:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "api/apids/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 193
    .local v10, "url":Ljava/lang/String;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "URL: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 195
    invoke-static {}, Lcom/urbanairship/push/PushRegistrationBuilder;->buildWithCurrentPreferences()Lcom/urbanairship/push/PushRegistrationPayload;

    move-result-object v5

    .line 200
    .local v5, "payload":Lcom/urbanairship/push/PushRegistrationPayload;
    :try_start_0
    invoke-virtual {v5}, Lcom/urbanairship/push/PushRegistrationPayload;->asJSON()Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 207
    .local v1, "body":Lorg/json/JSONObject;
    new-instance v6, Lcom/urbanairship/restclient/AppAuthenticatedRequest;

    const-string v11, "PUT"

    invoke-direct {v6, v11, v10}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .local v6, "registrationRequest":Lcom/urbanairship/restclient/AppAuthenticatedRequest;
    :try_start_1
    new-instance v3, Lorg/apache/http/entity/StringEntity;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "UTF-8"

    invoke-direct {v3, v11, v12}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .local v3, "entity":Lorg/apache/http/entity/StringEntity;
    const-string v11, "application/json"

    invoke-virtual {v3, v11}, Lorg/apache/http/entity/StringEntity;->setContentType(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v6, v3}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 214
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Body: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 220
    .end local v3    # "entity":Lorg/apache/http/entity/StringEntity;
    :goto_1
    invoke-virtual {v6}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v7

    .line 221
    .local v7, "response":Lcom/urbanairship/restclient/Response;
    if-nez v7, :cond_2

    .line 223
    const-string v11, "Error registering APID. Scheduling a retry."

    invoke-static {v11}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 224
    const-string v11, "com.urbanairship.push.UPDATE_APID"

    invoke-direct {p0, v11, v0}, Lcom/urbanairship/push/PushService;->scheduleAction(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 202
    .end local v1    # "body":Lorg/json/JSONObject;
    .end local v6    # "registrationRequest":Lcom/urbanairship/restclient/AppAuthenticatedRequest;
    .end local v7    # "response":Lcom/urbanairship/restclient/Response;
    :catch_0
    move-exception v2

    .line 203
    .local v2, "e":Lorg/json/JSONException;
    const-string v11, "Error creating JSON Registration body."

    invoke-static {v11, v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 215
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v1    # "body":Lorg/json/JSONObject;
    .restart local v6    # "registrationRequest":Lcom/urbanairship/restclient/AppAuthenticatedRequest;
    :catch_1
    move-exception v2

    .line 216
    .local v2, "e":Ljava/io/UnsupportedEncodingException;
    const-string v11, "Error setting registrationRequest entity."

    invoke-static {v11}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 228
    .end local v2    # "e":Ljava/io/UnsupportedEncodingException;
    .restart local v7    # "response":Lcom/urbanairship/restclient/Response;
    :cond_2
    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v8

    .line 229
    .local v8, "responseString":Ljava/lang/String;
    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v9

    .line 230
    .local v9, "status":I
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Registration status code: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 231
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Registration result "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 233
    const/16 v11, 0xc8

    if-ne v9, v11, :cond_3

    .line 234
    const-string v11, "Registration request succeeded."

    invoke-static {v11}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 235
    iget-object v11, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lcom/urbanairship/push/PushPreferences;->setApidUpdateNeeded(Z)V

    .line 236
    iget-object v11, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Lcom/urbanairship/push/PushPreferences;->setLastApidRegistrationTime(J)V

    .line 239
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v11

    const/4 v12, 0x1

    invoke-virtual {v11, v12}, Lcom/urbanairship/push/PushManager;->sendRegistrationFinishedBroadcast(Z)V

    goto/16 :goto_0

    .line 240
    :cond_3
    const/16 v11, 0x1f4

    if-lt v9, v11, :cond_4

    const/16 v11, 0x258

    if-ge v9, v11, :cond_4

    .line 241
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Registration request response status: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " (will retry)"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 242
    const-string v11, "com.urbanairship.push.UPDATE_APID"

    invoke-direct {p0, v11, v0}, Lcom/urbanairship/push/PushService;->scheduleAction(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 244
    :cond_4
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Registration request response status: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .prologue
    .line 114
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 115
    invoke-virtual {p0}, Lcom/urbanairship/push/PushService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 116
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/push/PushService;->preferences:Lcom/urbanairship/push/PushPreferences;

    .line 117
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 5
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 121
    if-nez p1, :cond_1

    .line 122
    const-string v3, "PushService started with a null intent. Ending task."

    invoke-static {v3}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 153
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 128
    .local v0, "action":Ljava/lang/String;
    const-string v3, "com.urbanairship.push.WAKE_LOCK_ID"

    const/4 v4, -0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 129
    .local v2, "wakeLockId":I
    const-string v3, "com.urbanairship.push.WAKE_LOCK_ID"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 132
    :try_start_0
    const-string v3, "com.urbanairship.push.DELETE_APID"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 133
    const-string v3, "com.urbanairship.push.APID"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 134
    .local v1, "apid":Ljava/lang/String;
    if-eqz v1, :cond_2

    .line 135
    invoke-direct {p0, v1}, Lcom/urbanairship/push/PushService;->deleteApid(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .end local v1    # "apid":Ljava/lang/String;
    :cond_2
    :goto_1
    if-ltz v2, :cond_0

    .line 150
    invoke-static {v2}, Lcom/urbanairship/push/PushService;->releaseWakeLock(I)V

    goto :goto_0

    .line 137
    :cond_3
    :try_start_1
    const-string v3, "com.urbanairship.push.UPDATE_APID"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 138
    invoke-direct {p0}, Lcom/urbanairship/push/PushService;->updateApid()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 149
    :catchall_0
    move-exception v3

    if-ltz v2, :cond_4

    .line 150
    invoke-static {v2}, Lcom/urbanairship/push/PushService;->releaseWakeLock(I)V

    :cond_4
    throw v3

    .line 139
    :cond_5
    :try_start_2
    const-string v3, "com.google.android.c2dm.intent.REGISTRATION"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 140
    invoke-static {p1}, Lcom/urbanairship/push/GCMRegistrar;->handleRegistrationIntent(Landroid/content/Intent;)V

    goto :goto_1

    .line 141
    :cond_6
    const-string v3, "com.google.android.c2dm.intent.RECEIVE"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 142
    invoke-static {p1}, Lcom/urbanairship/push/GCMMessageHandler;->handleIntentMessage(Landroid/content/Intent;)V

    goto :goto_1

    .line 143
    :cond_7
    const-string v3, "com.urbanairship.push.GCM_REGISTRATION"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 144
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->register()V

    goto :goto_1

    .line 145
    :cond_8
    const-string v3, "com.urbanairship.push.START_SERVICE"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 146
    invoke-direct {p0}, Lcom/urbanairship/push/PushService;->startPushService()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method
