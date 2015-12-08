.class public Lcom/urbanairship/push/PushManager;
.super Ljava/lang/Object;
.source "PushManager.java"


# static fields
.field public static final ACTION_NOTIFICATION_OPENED:Ljava/lang/String; = "com.urbanairship.push.NOTIFICATION_OPENED"

.field public static final ACTION_NOTIFICATION_OPENED_PROXY:Ljava/lang/String; = "com.urbanairship.push.NOTIFICATION_OPENED_PROXY"

.field public static final ACTION_PUSH_RECEIVED:Ljava/lang/String; = "com.urbanairship.push.PUSH_RECEIVED"

.field public static final ACTION_REGISTRATION_FINISHED:Ljava/lang/String; = "com.urbanairship.push.REGISTRATION_FINISHED"

.field static final APID_REREGISTRATION_INTERVAL_MS:J = 0x5265c00L

.field public static final EXTRA_ACTIONS_PAYLOAD:Ljava/lang/String; = "com.urbanairship.actions"

.field public static final EXTRA_ALERT:Ljava/lang/String; = "com.urbanairship.push.ALERT"

.field public static final EXTRA_APID:Ljava/lang/String; = "com.urbanairship.push.APID"

.field public static final EXTRA_CONTENT_INTENT:Ljava/lang/String; = "com.urbanairship.push.CONTENT_INTENT"

.field public static final EXTRA_EXPIRATION:Ljava/lang/String; = "com.urbanairship.push.EXPIRATION"

.field public static final EXTRA_NOTIFICATION_ID:Ljava/lang/String; = "com.urbanairship.push.NOTIFICATION_ID"

.field static final EXTRA_PING:Ljava/lang/String; = "com.urbanairship.push.PING"

.field public static final EXTRA_PUSH_ID:Ljava/lang/String; = "com.urbanairship.push.CANONICAL_PUSH_ID"

.field public static final EXTRA_REGISTRATION_ERROR:Ljava/lang/String; = "com.urbanairship.push.REGISTRATION_ERROR"

.field public static final EXTRA_REGISTRATION_VALID:Ljava/lang/String; = "com.urbanairship.push.REGISTRATION_VALID"

.field public static final EXTRA_SEND_ID:Ljava/lang/String; = "com.urbanairship.push.PUSH_ID"

.field public static final EXTRA_STRING_EXTRA:Ljava/lang/String; = "com.urbanairship.push.STRING_EXTRA"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final MAX_CANONICAL_IDS:I = 0xa

.field private static final RICH_PUSH_REFRESH_WAIT_TIME_MS:I = 0xea60

.field private static final instance:Lcom/urbanairship/push/PushManager;


# instance fields
.field private deviceTagsEnabled:Z

.field private intentReceiver:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Landroid/content/BroadcastReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private notificationBuilder:Lcom/urbanairship/push/PushNotificationBuilder;

.field private preferences:Lcom/urbanairship/push/PushPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 209
    new-instance v0, Lcom/urbanairship/push/PushManager;

    invoke-direct {v0}, Lcom/urbanairship/push/PushManager;-><init>()V

    sput-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/urbanairship/push/PushManager;->deviceTagsEnabled:Z

    .line 227
    return-void
.end method

.method private alertHostApplication(Lcom/urbanairship/push/PushMessage;I)V
    .locals 3
    .param p1, "message"    # Lcom/urbanairship/push/PushMessage;
    .param p2, "notificationId"    # I

    .prologue
    .line 688
    invoke-virtual {p0}, Lcom/urbanairship/push/PushManager;->getIntentReceiver()Ljava/lang/Class;

    move-result-object v1

    .line 689
    .local v1, "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-eqz v1, :cond_0

    .line 690
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.urbanairship.push.PUSH_RECEIVED"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 691
    .local v0, "extIntent":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 692
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getPushBundle()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 693
    const-string v2, "com.urbanairship.push.NOTIFICATION_ID"

    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 694
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 696
    .end local v0    # "extIntent":Landroid/content/Intent;
    :cond_0
    return-void
.end method

.method private static createPushArrivedEvent(Ljava/lang/String;)V
    .locals 2
    .param p0, "sendId"    # Ljava/lang/String;

    .prologue
    .line 638
    invoke-static {p0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    .line 639
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    new-instance v1, Lcom/urbanairship/analytics/PushArrivedEvent;

    invoke-direct {v1, p0}, Lcom/urbanairship/analytics/PushArrivedEvent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 640
    return-void
.end method

.method public static disablePush()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 299
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v1, v1, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 300
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v1, v1, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1, v3}, Lcom/urbanairship/push/PushPreferences;->setPushEnabled(Z)V

    .line 303
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v1, v1, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v0

    .line 304
    .local v0, "gcmId":Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 305
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v1, v1, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/urbanairship/push/PushPreferences;->setGcmId(Ljava/lang/String;)V

    .line 306
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->unregister()V

    .line 310
    :cond_0
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    sget-object v2, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v2, v2, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/urbanairship/push/PushManager;->deleteApid(Ljava/lang/String;)V

    .line 311
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v1, v1, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1, v3}, Lcom/urbanairship/push/PushPreferences;->setAPIDReady(Z)V

    .line 314
    sget-object v1, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v1, v1, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/urbanairship/push/PushPreferences;->setLastApidRegistrationTime(J)V

    .line 316
    :cond_1
    return-void
.end method

.method public static enablePush()V
    .locals 2

    .prologue
    .line 280
    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v0, v0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 281
    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v0, v0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/urbanairship/push/PushPreferences;->setPushEnabled(Z)V

    .line 284
    invoke-static {}, Lcom/urbanairship/push/PushManager;->startService()V

    .line 286
    :cond_0
    return-void
.end method

.method public static init()V
    .locals 2

    .prologue
    .line 237
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->isFlying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    const-string v0, "PushManager init"

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 240
    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    new-instance v1, Lcom/urbanairship/push/PushPreferences;

    invoke-direct {v1}, Lcom/urbanairship/push/PushPreferences;-><init>()V

    iput-object v1, v0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    .line 241
    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    new-instance v1, Lcom/urbanairship/push/BasicPushNotificationBuilder;

    invoke-direct {v1}, Lcom/urbanairship/push/BasicPushNotificationBuilder;-><init>()V

    iput-object v1, v0, Lcom/urbanairship/push/PushManager;->notificationBuilder:Lcom/urbanairship/push/PushNotificationBuilder;

    .line 243
    invoke-static {}, Lcom/urbanairship/push/PushManager;->startService()V

    .line 247
    return-void

    .line 245
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UAirship.takeOff must be called before PushManager.init!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static isCorrectApid(Ljava/lang/String;)Z
    .locals 1
    .param p0, "pushApid"    # Ljava/lang/String;

    .prologue
    .line 644
    if-eqz p0, :cond_0

    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v0, v0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isPushEnabled()Z
    .locals 1

    .prologue
    .line 649
    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    iget-object v0, v0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v0

    return v0
.end method

.method private isUniqueCanonicalId(Ljava/lang/String;)Z
    .locals 5
    .param p1, "canonicalId"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    .line 659
    if-nez p1, :cond_0

    .line 676
    :goto_0
    return v2

    .line 662
    :cond_0
    iget-object v3, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getCanonicalIds()Ljava/util/List;

    move-result-object v0

    .line 664
    .local v0, "canonicalIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 665
    const/4 v2, 0x0

    goto :goto_0

    .line 668
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 669
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0xa

    if-le v3, v4, :cond_2

    .line 670
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0xa

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v0, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    .line 671
    .local v1, "subList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v3, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3, v1}, Lcom/urbanairship/push/PushPreferences;->setCanonicalIds(Ljava/util/List;)V

    goto :goto_0

    .line 673
    .end local v1    # "subList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_2
    iget-object v3, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3, v0}, Lcom/urbanairship/push/PushPreferences;->setCanonicalIds(Ljava/util/List;)V

    goto :goto_0
.end method

.method private refreshRichPushMessages()V
    .locals 5

    .prologue
    .line 760
    new-instance v1, Ljava/util/concurrent/Semaphore;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 761
    .local v1, "semaphore":Ljava/util/concurrent/Semaphore;
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v2

    new-instance v3, Lcom/urbanairship/push/PushManager$1;

    invoke-direct {v3, p0, v1}, Lcom/urbanairship/push/PushManager$1;-><init>(Lcom/urbanairship/push/PushManager;Ljava/util/concurrent/Semaphore;)V

    invoke-virtual {v2, v3}, Lcom/urbanairship/richpush/RichPushManager;->refreshMessages(Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V

    .line 769
    const-wide/32 v2, 0xea60

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 773
    :goto_0
    return-void

    .line 770
    :catch_0
    move-exception v0

    .line 771
    .local v0, "e":Ljava/lang/InterruptedException;
    const-string v2, "Interrupted while waiting for rich push messages to refresh"

    invoke-static {v2}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static shared()Lcom/urbanairship/push/PushManager;
    .locals 1

    .prologue
    .line 255
    sget-object v0, Lcom/urbanairship/push/PushManager;->instance:Lcom/urbanairship/push/PushManager;

    return-object v0
.end method

.method public static startService()V
    .locals 3

    .prologue
    .line 262
    const-string v2, "PushManager startService"

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 263
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 264
    .local v0, "ctx":Landroid/content/Context;
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/urbanairship/push/PushService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 265
    .local v1, "i":Landroid/content/Intent;
    const-string v2, "com.urbanairship.push.START_SERVICE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 267
    return-void
.end method

.method public static validateManifest()V
    .locals 0

    .prologue
    .line 753
    invoke-static {}, Lcom/urbanairship/push/GCMRegistrar;->validateManifest()V

    .line 754
    return-void
.end method


# virtual methods
.method deleteApid(Ljava/lang/String;)V
    .locals 4
    .param p1, "apid"    # Ljava/lang/String;

    .prologue
    .line 465
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Deleting APID: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 467
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 468
    const-string v2, "No APID. Cannot delete."

    invoke-static {v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 479
    :goto_0
    return-void

    .line 472
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 473
    .local v0, "context":Landroid/content/Context;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 474
    .local v1, "i":Landroid/content/Intent;
    const-class v2, Lcom/urbanairship/push/PushService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 475
    const-string v2, "com.urbanairship.push.DELETE_APID"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 476
    const-string v2, "com.urbanairship.push.APID"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 478
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method

.method deliverPush(Lcom/urbanairship/push/PushMessage;)V
    .locals 3
    .param p1, "message"    # Lcom/urbanairship/push/PushMessage;

    .prologue
    .line 707
    invoke-static {}, Lcom/urbanairship/push/PushManager;->isPushEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 708
    const-string v1, "Received a push when push is disabled! Ignoring."

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 747
    :goto_0
    return-void

    .line 712
    :cond_0
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getPushApid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/push/PushManager;->isCorrectApid(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 713
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received a push addressed to a different APID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getPushApid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 714
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getPushApid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/urbanairship/push/PushManager;->deleteApid(Ljava/lang/String;)V

    goto :goto_0

    .line 718
    :cond_1
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getCanonicalPushId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/urbanairship/push/PushManager;->isUniqueCanonicalId(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 719
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received a duplicate push with canonical ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getCanonicalPushId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    .line 723
    :cond_2
    iget-object v1, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getSendId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/urbanairship/push/PushPreferences;->setLastReceivedSendId(Ljava/lang/String;)V

    .line 724
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getSendId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/push/PushManager;->createPushArrivedEvent(Ljava/lang/String;)V

    .line 727
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getPushBundle()Landroid/os/Bundle;

    move-result-object v1

    sget-object v2, Lcom/urbanairship/actions/Situation;->PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

    invoke-static {v1, v2}, Lcom/urbanairship/actions/ActionService;->runActionsForPushBundle(Landroid/os/Bundle;Lcom/urbanairship/actions/Situation;)V

    .line 730
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->isPing()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 731
    const-string v1, "Received UA Ping"

    invoke-static {v1}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    goto :goto_0

    .line 735
    :cond_3
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->isExpired()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 736
    const-string v1, "Notification expired, ignoring."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 740
    :cond_4
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->getRichPushMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 741
    const-string v1, "Received a Rich Push."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 742
    invoke-direct {p0}, Lcom/urbanairship/push/PushManager;->refreshRichPushMessages()V

    .line 745
    :cond_5
    invoke-virtual {p1}, Lcom/urbanairship/push/PushMessage;->buildAndDisplayNotification()I

    move-result v0

    .line 746
    .local v0, "notificationId":I
    invoke-direct {p0, p1, v0}, Lcom/urbanairship/push/PushManager;->alertHostApplication(Lcom/urbanairship/push/PushMessage;I)V

    goto/16 :goto_0
.end method

.method public getAPID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 570
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->isAPIDReady()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAlias()Ljava/lang/String;
    .locals 1

    .prologue
    .line 579
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getAlias()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceTagsEnabled()Z
    .locals 1

    .prologue
    .line 625
    iget-boolean v0, p0, Lcom/urbanairship/push/PushManager;->deviceTagsEnabled:Z

    return v0
.end method

.method public getGcmId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 598
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIntentReceiver()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 391
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->intentReceiver:Ljava/lang/Class;

    return-object v0
.end method

.method public getNotificationBuilder()Lcom/urbanairship/push/PushNotificationBuilder;
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->notificationBuilder:Lcom/urbanairship/push/PushNotificationBuilder;

    return-object v0
.end method

.method public getPreferences()Lcom/urbanairship/push/PushPreferences;
    .locals 1

    .prologue
    .line 400
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    return-object v0
.end method

.method public getTags()Ljava/util/Set;
    .locals 1
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
    .line 590
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getTags()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method sendRegistrationFinishedBroadcast(Z)V
    .locals 7
    .param p1, "valid"    # Z

    .prologue
    .line 409
    iget-object v5, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->isAPIDReady()Z

    move-result v0

    .line 410
    .local v0, "apidPreviouslyReady":Z
    iget-object v5, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v5, p1}, Lcom/urbanairship/push/PushPreferences;->setAPIDReady(Z)V

    .line 412
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v5

    iget-boolean v5, v5, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    if-eqz v5, :cond_0

    .line 413
    if-nez v0, :cond_3

    .line 414
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/richpush/RichPushManager;->updateUser()V

    .line 420
    :cond_0
    :goto_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 421
    .local v1, "context":Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/push/PushManager;->getIntentReceiver()Ljava/lang/Class;

    move-result-object v4

    .line 422
    .local v4, "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-eqz v4, :cond_2

    .line 423
    new-instance v2, Landroid/content/Intent;

    const-string v5, "com.urbanairship.push.REGISTRATION_FINISHED"

    invoke-direct {v2, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 424
    .local v2, "extIntent":Landroid/content/Intent;
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 425
    const-string v5, "com.urbanairship.push.APID"

    iget-object v6, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v6}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 426
    const-string v5, "com.urbanairship.push.REGISTRATION_VALID"

    invoke-virtual {v2, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 428
    iget-object v5, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v5}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v3

    .line 429
    .local v3, "gcmId":Ljava/lang/String;
    invoke-static {v3}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 430
    const-string v5, "com.urbanairship.push.GCM_REGISTRATION_ID"

    invoke-virtual {v2, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 433
    :cond_1
    invoke-virtual {v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 435
    .end local v2    # "extIntent":Landroid/content/Intent;
    .end local v3    # "gcmId":Ljava/lang/String;
    :cond_2
    return-void

    .line 416
    .end local v1    # "context":Landroid/content/Context;
    .end local v4    # "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_3
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/richpush/RichPushManager;->updateUserIfNecessary()V

    goto :goto_0
.end method

.method public setAlias(Ljava/lang/String;)V
    .locals 1
    .param p1, "alias"    # Ljava/lang/String;

    .prologue
    .line 530
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getAlias()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/urbanairship/util/UAStringUtil;->equals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 531
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0, p1}, Lcom/urbanairship/push/PushPreferences;->setAlias(Ljava/lang/String;)V

    .line 532
    invoke-virtual {p0}, Lcom/urbanairship/push/PushManager;->updateApid()V

    .line 534
    :cond_0
    return-void
.end method

.method public setAliasAndTags(Ljava/lang/String;Ljava/util/Set;)V
    .locals 3
    .param p1, "alias"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 491
    .local p2, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-nez p2, :cond_0

    .line 492
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Tags must be non-null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 497
    :cond_0
    const/4 v0, 0x0

    .line 500
    .local v0, "updateServer":Z
    iget-object v1, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getAlias()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/urbanairship/util/UAStringUtil;->equals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 501
    iget-object v1, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1, p1}, Lcom/urbanairship/push/PushPreferences;->setAlias(Ljava/lang/String;)V

    .line 502
    const/4 v0, 0x1

    .line 506
    :cond_1
    iget-object v1, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getTags()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 507
    iget-object v1, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v1, p2}, Lcom/urbanairship/push/PushPreferences;->setTags(Ljava/util/Set;)V

    .line 508
    const/4 v0, 0x1

    .line 511
    :cond_2
    if-eqz v0, :cond_3

    .line 512
    invoke-virtual {p0}, Lcom/urbanairship/push/PushManager;->updateApid()V

    .line 514
    :cond_3
    return-void
.end method

.method public setDeviceTagsEnabled(Z)V
    .locals 0
    .param p1, "b"    # Z

    .prologue
    .line 634
    iput-boolean p1, p0, Lcom/urbanairship/push/PushManager;->deviceTagsEnabled:Z

    .line 635
    return-void
.end method

.method public setGcmId(Ljava/lang/String;)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 609
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v0, v1}, Lcom/urbanairship/push/PushPreferences;->setAppVersionCode(I)V

    .line 610
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-static {}, Lcom/urbanairship/util/Device;->getHashedDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/urbanairship/push/PushPreferences;->setDeviceId(Ljava/lang/String;)V

    .line 612
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/urbanairship/util/UAStringUtil;->equals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 613
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0, p1}, Lcom/urbanairship/push/PushPreferences;->setGcmId(Ljava/lang/String;)V

    .line 614
    invoke-virtual {p0}, Lcom/urbanairship/push/PushManager;->updateApid()V

    .line 616
    :cond_0
    return-void
.end method

.method public setIntentReceiver(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Landroid/content/BroadcastReceiver;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 358
    .local p1, "receiver":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/content/BroadcastReceiver;>;"
    new-instance v1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .local v1, "receiverComponent":Landroid/content/ComponentName;
    :try_start_0
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getReceiverInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    iput-object p1, p0, Lcom/urbanairship/push/PushManager;->intentReceiver:Ljava/lang/Class;

    .line 374
    :goto_0
    return-void

    .line 364
    :catch_0
    move-exception v0

    .line 366
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v2, "The receiver class passed to PushManager.setIntentReceiver() is not declared in the manifest."

    invoke-static {v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AndroidManifest.xml missing required receiver: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setNotificationBuilder(Lcom/urbanairship/push/PushNotificationBuilder;)V
    .locals 0
    .param p1, "builder"    # Lcom/urbanairship/push/PushNotificationBuilder;

    .prologue
    .line 335
    iput-object p1, p0, Lcom/urbanairship/push/PushManager;->notificationBuilder:Lcom/urbanairship/push/PushNotificationBuilder;

    .line 336
    return-void
.end method

.method public setTags(Ljava/util/Set;)V
    .locals 2
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
    .line 554
    .local p1, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-nez p1, :cond_0

    .line 555
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tags must be non-null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 558
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->getTags()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 559
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0, p1}, Lcom/urbanairship/push/PushPreferences;->setTags(Ljava/util/Set;)V

    .line 560
    invoke-virtual {p0}, Lcom/urbanairship/push/PushManager;->updateApid()V

    .line 562
    :cond_1
    return-void
.end method

.method updateApid()V
    .locals 4

    .prologue
    .line 453
    iget-object v2, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/urbanairship/push/PushPreferences;->setApidUpdateNeeded(Z)V

    .line 455
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 456
    .local v0, "context":Landroid/content/Context;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 457
    .local v1, "i":Landroid/content/Intent;
    const-class v2, Lcom/urbanairship/push/PushService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 458
    const-string v2, "com.urbanairship.push.UPDATE_APID"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 460
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 461
    return-void
.end method

.method public updateApidIfNecessary()V
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/urbanairship/push/PushManager;->preferences:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/push/PushPreferences;->isApidUpdateNeeded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 444
    invoke-virtual {p0}, Lcom/urbanairship/push/PushManager;->updateApid()V

    .line 446
    :cond_0
    return-void
.end method
