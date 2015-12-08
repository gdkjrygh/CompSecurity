.class public Lcom/nbcuni/nbc/thevoice/UATakeOff;
.super Landroid/app/Application;
.source "UATakeOff.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public getTimeZone()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 16
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v3, v3, v2}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 17
    .local v0, "timeZone":Ljava/lang/String;
    return-object v0
.end method

.method public onCreate()V
    .locals 5

    .prologue
    .line 23
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 24
    const/4 v2, 0x1

    new-array v2, v2, [Lio/fabric/sdk/android/Kit;

    const/4 v3, 0x0

    new-instance v4, Lcom/crashlytics/android/Crashlytics;

    invoke-direct {v4}, Lcom/crashlytics/android/Crashlytics;-><init>()V

    aput-object v4, v2, v3

    invoke-static {p0, v2}, Lio/fabric/sdk/android/Fabric;->with(Landroid/content/Context;[Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric;

    .line 26
    invoke-static {p0}, Lcom/urbanairship/AirshipConfigOptions;->loadDefaultOptions(Landroid/content/Context;)Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v0

    .line 28
    .local v0, "options":Lcom/urbanairship/AirshipConfigOptions;
    invoke-static {p0, v0}, Lcom/urbanairship/UAirship;->takeOff(Landroid/app/Application;Lcom/urbanairship/AirshipConfigOptions;)V

    .line 30
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 31
    .local v1, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/UATakeOff;->getTimeZone()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/urbanairship/push/PushManager;->setTags(Ljava/util/Set;)V

    .line 34
    invoke-static {}, Lcom/urbanairship/push/PushManager;->enablePush()V

    .line 35
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    const-class v3, Lcom/nbcuni/nbc/thevoice/IntentReceiver;

    invoke-virtual {v2, v3}, Lcom/urbanairship/push/PushManager;->setIntentReceiver(Ljava/lang/Class;)V

    .line 37
    return-void
.end method
