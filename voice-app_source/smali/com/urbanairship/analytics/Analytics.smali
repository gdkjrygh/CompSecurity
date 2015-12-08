.class public Lcom/urbanairship/analytics/Analytics;
.super Ljava/lang/Object;
.source "Analytics.java"


# static fields
.field public static final ACTION_APP_BACKGROUND:Ljava/lang/String;

.field public static final ACTION_APP_FOREGROUND:Ljava/lang/String;


# instance fields
.field private final activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

.field private analyticsEnabled:Z

.field private appStateChangeReceiver:Landroid/content/BroadcastReceiver;

.field private conversionPushId:Ljava/lang/String;

.field private final dataManager:Lcom/urbanairship/analytics/EventDataManager;

.field executor:Ljava/util/concurrent/Executor;

.field private inBackground:Z

.field private minSdkVersion:I

.field private final preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

.field private sessionId:Ljava/lang/String;

.field private stickyBroadcastAllowed:Z

.field private useLifeCycleCallbacks:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".urbanairship.analytics.APP_FOREGROUND"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".urbanairship.analytics.APP_BACKGROUND"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_BACKGROUND:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1
    .param p1, "application"    # Landroid/app/Application;

    .prologue
    .line 81
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/urbanairship/analytics/Analytics;-><init>(Landroid/app/Application;Lcom/urbanairship/analytics/ActivityMonitor;)V

    .line 82
    return-void
.end method

.method constructor <init>(Landroid/app/Application;Lcom/urbanairship/analytics/ActivityMonitor;)V
    .locals 5
    .param p1, "application"    # Landroid/app/Application;
    .param p2, "activityMonitor"    # Lcom/urbanairship/analytics/ActivityMonitor;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/urbanairship/analytics/Analytics;->executor:Ljava/util/concurrent/Executor;

    .line 72
    iput-boolean v2, p0, Lcom/urbanairship/analytics/Analytics;->stickyBroadcastAllowed:Z

    .line 73
    iput-boolean v2, p0, Lcom/urbanairship/analytics/Analytics;->useLifeCycleCallbacks:Z

    .line 307
    new-instance v1, Lcom/urbanairship/analytics/Analytics$4;

    invoke-direct {v1, p0}, Lcom/urbanairship/analytics/Analytics$4;-><init>(Lcom/urbanairship/analytics/Analytics;)V

    iput-object v1, p0, Lcom/urbanairship/analytics/Analytics;->appStateChangeReceiver:Landroid/content/BroadcastReceiver;

    .line 90
    new-instance v1, Lcom/urbanairship/analytics/EventDataManager;

    invoke-direct {v1}, Lcom/urbanairship/analytics/EventDataManager;-><init>()V

    iput-object v1, p0, Lcom/urbanairship/analytics/Analytics;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    .line 91
    new-instance v1, Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-direct {v1}, Lcom/urbanairship/analytics/AnalyticsPreferences;-><init>()V

    iput-object v1, p0, Lcom/urbanairship/analytics/Analytics;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    .line 93
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget v1, v1, Lcom/urbanairship/AirshipConfigOptions;->minSdkVersion:I

    iput v1, p0, Lcom/urbanairship/analytics/Analytics;->minSdkVersion:I

    .line 94
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->analyticsEnabled:Z

    iput-boolean v1, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    .line 95
    iput-boolean v3, p0, Lcom/urbanairship/analytics/Analytics;->inBackground:Z

    .line 98
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v0, v1, Lcom/urbanairship/AirshipConfigOptions;->analyticsServer:Ljava/lang/String;

    .line 99
    .local v0, "server":Ljava/lang/String;
    iget-boolean v1, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    const-string v1, "Unable to send analytics to an empty server. Disabling analytics."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 101
    iput-boolean v2, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    .line 105
    :cond_0
    invoke-direct {p0}, Lcom/urbanairship/analytics/Analytics;->generateNewSessionId()V

    .line 108
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_1

    .line 109
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Analytics;->registerLifeCycleCallbacks(Landroid/app/Application;)V

    .line 110
    iput-boolean v3, p0, Lcom/urbanairship/analytics/Analytics;->useLifeCycleCallbacks:Z

    .line 113
    :cond_1
    if-nez p2, :cond_2

    .line 114
    new-instance v1, Lcom/urbanairship/analytics/ActivityMonitor;

    iget v2, p0, Lcom/urbanairship/analytics/Analytics;->minSdkVersion:I

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-boolean v4, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    invoke-direct {v1, v2, v3, v4}, Lcom/urbanairship/analytics/ActivityMonitor;-><init>(IIZ)V

    iput-object v1, p0, Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

    .line 119
    :goto_0
    iget-object v1, p0, Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

    new-instance v2, Lcom/urbanairship/analytics/Analytics$1;

    invoke-direct {v2, p0}, Lcom/urbanairship/analytics/Analytics$1;-><init>(Lcom/urbanairship/analytics/Analytics;)V

    invoke-virtual {v1, v2}, Lcom/urbanairship/analytics/ActivityMonitor;->setListener(Lcom/urbanairship/analytics/ActivityMonitor$Listener;)V

    .line 143
    invoke-direct {p0}, Lcom/urbanairship/analytics/Analytics;->registerBroadcastReceiver()V

    .line 144
    return-void

    .line 116
    :cond_2
    iput-object p2, p0, Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

    goto :goto_0
.end method

.method static synthetic access$000(Lcom/urbanairship/analytics/Analytics;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/analytics/Analytics;

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/urbanairship/analytics/Analytics;->generateNewSessionId()V

    return-void
.end method

.method static synthetic access$102(Lcom/urbanairship/analytics/Analytics;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/analytics/Analytics;
    .param p1, "x1"    # Z

    .prologue
    .line 50
    iput-boolean p1, p0, Lcom/urbanairship/analytics/Analytics;->inBackground:Z

    return p1
.end method

.method static synthetic access$200(Lcom/urbanairship/analytics/Analytics;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/analytics/Analytics;

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/urbanairship/analytics/Analytics;->sendForegroundBroadcast()V

    return-void
.end method

.method static synthetic access$300(Lcom/urbanairship/analytics/Analytics;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/analytics/Analytics;

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/urbanairship/analytics/Analytics;->sendBackgroundBroadcast()V

    return-void
.end method

.method static synthetic access$402(Lcom/urbanairship/analytics/Analytics;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/analytics/Analytics;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 50
    iput-object p1, p0, Lcom/urbanairship/analytics/Analytics;->conversionPushId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$500(Lcom/urbanairship/analytics/Analytics;)Lcom/urbanairship/analytics/ActivityMonitor;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/analytics/Analytics;

    .prologue
    .line 50
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

    return-object v0
.end method

.method private generateNewSessionId()V
    .locals 2

    .prologue
    .line 301
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/Analytics;->sessionId:Ljava/lang/String;

    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "New session: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/analytics/Analytics;->sessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 303
    return-void
.end method

.method private registerBroadcastReceiver()V
    .locals 4

    .prologue
    .line 147
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.permission.BROADCAST_STICKY"

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 149
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/urbanairship/analytics/Analytics;->stickyBroadcastAllowed:Z

    .line 152
    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 153
    .local v0, "filter":Landroid/content/IntentFilter;
    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_BACKGROUND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 154
    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 155
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 156
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/urbanairship/analytics/Analytics;->appStateChangeReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 157
    return-void
.end method

.method private registerLifeCycleCallbacks(Landroid/app/Application;)V
    .locals 1
    .param p1, "application"    # Landroid/app/Application;

    .prologue
    .line 160
    new-instance v0, Lcom/urbanairship/analytics/Analytics$2;

    invoke-direct {v0, p0}, Lcom/urbanairship/analytics/Analytics$2;-><init>(Lcom/urbanairship/analytics/Analytics;)V

    invoke-static {p1, v0}, Lcom/urbanairship/analytics/LifeCycleCallbacks;->registerCallback(Landroid/app/Application;Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;)V

    .line 173
    return-void
.end method

.method private sendBackgroundBroadcast()V
    .locals 2

    .prologue
    .line 186
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_BACKGROUND:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 187
    .local v0, "background":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    iget-boolean v1, p0, Lcom/urbanairship/analytics/Analytics;->stickyBroadcastAllowed:Z

    if-eqz v1, :cond_0

    .line 189
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendStickyBroadcast(Landroid/content/Intent;)V

    .line 193
    :goto_0
    return-void

    .line 191
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private sendForegroundBroadcast()V
    .locals 2

    .prologue
    .line 176
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 177
    .local v0, "foreground":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    iget-boolean v1, p0, Lcom/urbanairship/analytics/Analytics;->stickyBroadcastAllowed:Z

    if-eqz v1, :cond_0

    .line 179
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendStickyBroadcast(Landroid/content/Intent;)V

    .line 183
    :goto_0
    return-void

    .line 181
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method


# virtual methods
.method public activityStarted(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 202
    iget-boolean v0, p0, Lcom/urbanairship/analytics/Analytics;->useLifeCycleCallbacks:Z

    if-nez v0, :cond_1

    .line 203
    new-instance v0, Lcom/urbanairship/analytics/ActivityStartedEvent;

    invoke-direct {v0, p1}, Lcom/urbanairship/analytics/ActivityStartedEvent;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 208
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

    sget-object v1, Lcom/urbanairship/analytics/ActivityMonitor$Source;->MANUAL_INSTRUMENTATION:Lcom/urbanairship/analytics/ActivityMonitor$Source;

    invoke-virtual {v0, p1, v1}, Lcom/urbanairship/analytics/ActivityMonitor;->activityStarted(Landroid/app/Activity;Lcom/urbanairship/analytics/ActivityMonitor$Source;)V

    .line 209
    return-void

    .line 204
    :cond_1
    iget v0, p0, Lcom/urbanairship/analytics/Analytics;->minSdkVersion:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    if-eqz v0, :cond_0

    .line 205
    const-string v0, "activityStarted call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you."

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public activityStopped(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 218
    iget-boolean v0, p0, Lcom/urbanairship/analytics/Analytics;->useLifeCycleCallbacks:Z

    if-nez v0, :cond_1

    .line 219
    new-instance v0, Lcom/urbanairship/analytics/ActivityStoppedEvent;

    invoke-direct {v0, p1}, Lcom/urbanairship/analytics/ActivityStoppedEvent;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0, v0}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 224
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;

    sget-object v1, Lcom/urbanairship/analytics/ActivityMonitor$Source;->MANUAL_INSTRUMENTATION:Lcom/urbanairship/analytics/ActivityMonitor$Source;

    invoke-virtual {v0, p1, v1}, Lcom/urbanairship/analytics/ActivityMonitor;->activityStopped(Landroid/app/Activity;Lcom/urbanairship/analytics/ActivityMonitor$Source;)V

    .line 225
    return-void

    .line 220
    :cond_1
    iget v0, p0, Lcom/urbanairship/analytics/Analytics;->minSdkVersion:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    if-eqz v0, :cond_0

    .line 221
    const-string v0, "activityStopped call is no longer necessary starting with SDK 14 - ICE CREAM SANDWICH. Analytics is auto-instrumented for you."

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public addEvent(Lcom/urbanairship/analytics/Event;)V
    .locals 2
    .param p1, "event"    # Lcom/urbanairship/analytics/Event;

    .prologue
    .line 241
    iget-boolean v0, p0, Lcom/urbanairship/analytics/Analytics;->analyticsEnabled:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 246
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/urbanairship/analytics/Analytics$3;

    invoke-direct {v1, p0, p1}, Lcom/urbanairship/analytics/Analytics$3;-><init>(Lcom/urbanairship/analytics/Analytics;Lcom/urbanairship/analytics/Event;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 254
    :cond_0
    return-void
.end method

.method public getConversionPushId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->conversionPushId:Ljava/lang/String;

    return-object v0
.end method

.method getDataManager()Lcom/urbanairship/analytics/EventDataManager;
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    return-object v0
.end method

.method getPreferences()Lcom/urbanairship/analytics/AnalyticsPreferences;
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    return-object v0
.end method

.method getSessionId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public isAppInForeground()Z
    .locals 1

    .prologue
    .line 233
    iget-boolean v0, p0, Lcom/urbanairship/analytics/Analytics;->inBackground:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setConversionPushId(Ljava/lang/String;)V
    .locals 2
    .param p1, "pushId"    # Ljava/lang/String;

    .prologue
    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting push conversion id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 262
    iput-object p1, p0, Lcom/urbanairship/analytics/Analytics;->conversionPushId:Ljava/lang/String;

    .line 263
    return-void
.end method
