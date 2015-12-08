.class public Lcom/urbanairship/location/UALocationManager;
.super Ljava/lang/Object;
.source "UALocationManager.java"


# static fields
.field public static final ACTION_LOCATION_SERVICE_BOUND:Ljava/lang/String; = "com.urbanairship.location.LOCATION_SERVICE_BOUND"

.field public static final ACTION_LOCATION_SERVICE_UNBOUND:Ljava/lang/String; = "com.urbanairship.location.LOCATION_SERVICE_UNBOUND"

.field public static final ACTION_LOCATION_UPDATE:Ljava/lang/String; = ".urbanairship.location.LOCATION_UPDATE"

.field public static final LOCATION_KEY:Ljava/lang/String; = "com.urbanairship.location.LOCATION"

.field private static bound:Z

.field private static context:Landroid/content/Context;

.field private static final instance:Lcom/urbanairship/location/UALocationManager;

.field private static locationService:Lcom/urbanairship/location/ILocationService;


# instance fields
.field private appStateChangeReceiver:Landroid/content/BroadcastReceiver;

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

.field private locationConnection:Landroid/content/ServiceConnection;

.field private preferences:Lcom/urbanairship/location/LocationPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/urbanairship/location/UALocationManager;

    invoke-direct {v0}, Lcom/urbanairship/location/UALocationManager;-><init>()V

    sput-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    .line 56
    const/4 v0, 0x0

    sput-boolean v0, Lcom/urbanairship/location/UALocationManager;->bound:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    return-void
.end method

.method static synthetic access$000()Lcom/urbanairship/location/UALocationManager;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    return-object v0
.end method

.method static synthetic access$100(Lcom/urbanairship/location/UALocationManager;)Lcom/urbanairship/location/LocationPreferences;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/UALocationManager;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    return-object v0
.end method

.method static synthetic access$200()V
    .locals 0

    .prologue
    .line 52
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->stopAndUnbindService()V

    return-void
.end method

.method static synthetic access$300()V
    .locals 0

    .prologue
    .line 52
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->startAndBindService()V

    return-void
.end method

.method static synthetic access$402(Lcom/urbanairship/location/ILocationService;)Lcom/urbanairship/location/ILocationService;
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/ILocationService;

    .prologue
    .line 52
    sput-object p0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    return-object p0
.end method

.method static synthetic access$502(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 52
    sput-boolean p0, Lcom/urbanairship/location/UALocationManager;->bound:Z

    return p0
.end method

.method static synthetic access$600(Lcom/urbanairship/location/UALocationManager;)Ljava/lang/Class;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/UALocationManager;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic access$700()Landroid/content/Context;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    return-object v0
.end method

.method public static bindService()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 359
    sget-boolean v1, Lcom/urbanairship/location/UALocationManager;->bound:Z

    if-nez v1, :cond_0

    .line 360
    sput-boolean v3, Lcom/urbanairship/location/UALocationManager;->bound:Z

    .line 361
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/urbanairship/location/LocationService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 362
    .local v0, "intent":Landroid/content/Intent;
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    sget-object v2, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v2, v2, Lcom/urbanairship/location/UALocationManager;->locationConnection:Landroid/content/ServiceConnection;

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 364
    :cond_0
    return-void
.end method

.method public static disableBackgroundLocation()V
    .locals 2

    .prologue
    .line 330
    const-string v0, "Set background location preference to False."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 331
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/urbanairship/location/LocationPreferences;->setBackgroundLocationEnabled(Z)V

    .line 334
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->stopAndUnbindService()V

    .line 337
    const-string v0, "Disabling background location"

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 339
    :cond_0
    return-void
.end method

.method public static disableForegroundLocation()V
    .locals 2

    .prologue
    .line 312
    const-string v0, "Set foreground location preference to False."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 313
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/urbanairship/location/LocationPreferences;->setForegroundLocationEnabled(Z)V

    .line 316
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/location/LocationPreferences;->isForegroundLocationEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 319
    const-string v0, "Disabling foreground location"

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 320
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->stopAndUnbindService()V

    .line 322
    :cond_0
    return-void
.end method

.method public static disableLocation()V
    .locals 2

    .prologue
    .line 262
    const-string v0, "Set location preference to False."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 263
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/urbanairship/location/LocationPreferences;->setLocationEnabled(Z)V

    .line 264
    const-string v0, "Disable location."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 265
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->stopAndUnbindService()V

    .line 266
    return-void
.end method

.method public static enableBackgroundLocation()V
    .locals 2

    .prologue
    .line 282
    const-string v0, "Set background location preference to True."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 283
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/urbanairship/location/LocationPreferences;->setBackgroundLocationEnabled(Z)V

    .line 286
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    const-string v0, "Enabling background location."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 289
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->startAndBindService()V

    .line 291
    :cond_0
    return-void
.end method

.method public static enableForegroundLocation()V
    .locals 2

    .prologue
    .line 297
    const-string v0, "Set foreground location preference to True."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 298
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/urbanairship/location/LocationPreferences;->setForegroundLocationEnabled(Z)V

    .line 301
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-string v0, "Enabling foreground location"

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 304
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->startAndBindService()V

    .line 306
    :cond_0
    return-void
.end method

.method public static enableLocation()V
    .locals 2

    .prologue
    .line 236
    const-string v0, "Set location preference to True."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 237
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/urbanairship/location/LocationPreferences;->setLocationEnabled(Z)V

    .line 241
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/location/LocationPreferences;->isBackgroundLocationEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    :cond_0
    const-string v0, "Enable location."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 244
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->startAndBindService()V

    .line 246
    :cond_1
    return-void
.end method

.method private exceptIfNotBound()V
    .locals 2

    .prologue
    .line 520
    sget-boolean v0, Lcom/urbanairship/location/UALocationManager;->bound:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/urbanairship/util/ServiceNotBoundException;

    const-string v1, "You must call bindService or enableLocation and wait for the LOCATION_SERVICE_BOUND broadcast before using this method."

    invoke-direct {v0, v1}, Lcom/urbanairship/util/ServiceNotBoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 521
    :cond_0
    return-void
.end method

.method public static init()V
    .locals 3

    .prologue
    .line 102
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->isFlying()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sput-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    .line 105
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    new-instance v2, Lcom/urbanairship/location/LocationPreferences;

    invoke-direct {v2}, Lcom/urbanairship/location/LocationPreferences;-><init>()V

    iput-object v2, v1, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    .line 111
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v1, v1, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v1}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v1, v1, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v1}, Lcom/urbanairship/location/LocationPreferences;->isBackgroundLocationEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 112
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->startService()V

    .line 117
    :goto_0
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    new-instance v2, Lcom/urbanairship/location/UALocationManager$1;

    invoke-direct {v2}, Lcom/urbanairship/location/UALocationManager$1;-><init>()V

    iput-object v2, v1, Lcom/urbanairship/location/UALocationManager;->appStateChangeReceiver:Landroid/content/BroadcastReceiver;

    .line 140
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    new-instance v2, Lcom/urbanairship/location/UALocationManager$2;

    invoke-direct {v2}, Lcom/urbanairship/location/UALocationManager$2;-><init>()V

    iput-object v2, v1, Lcom/urbanairship/location/UALocationManager;->locationConnection:Landroid/content/ServiceConnection;

    .line 163
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 164
    .local v0, "filter":Landroid/content/IntentFilter;
    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_BACKGROUND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 165
    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 166
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 167
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v2, v2, Lcom/urbanairship/location/UALocationManager;->appStateChangeReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 173
    return-void

    .line 114
    .end local v0    # "filter":Landroid/content/IntentFilter;
    :cond_0
    const-string v1, "Location or background location are not enabled - deferring service start until foreground event."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 171
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "UAirship.takeOff must be called before UALocationManager.init!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static isServiceBound()Z
    .locals 1

    .prologue
    .line 386
    sget-boolean v0, Lcom/urbanairship/location/UALocationManager;->bound:Z

    return v0
.end method

.method public static shared()Lcom/urbanairship/location/UALocationManager;
    .locals 1

    .prologue
    .line 219
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    return-object v0
.end method

.method private static startAndBindService()V
    .locals 0

    .prologue
    .line 269
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->startService()V

    .line 270
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->bindService()V

    .line 271
    return-void
.end method

.method private static startService()V
    .locals 3

    .prologue
    .line 342
    const-string v1, "UALocationManager startService"

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 343
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/urbanairship/location/LocationService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 344
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.urbanairship.location.START"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 345
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 346
    return-void
.end method

.method private static stopAndUnbindService()V
    .locals 0

    .prologue
    .line 274
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->unbindService()V

    .line 275
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->stopService()V

    .line 276
    return-void
.end method

.method private static stopService()V
    .locals 3

    .prologue
    .line 349
    const-string v1, "UALocationManager stopService"

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 350
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/urbanairship/location/LocationService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 351
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.urbanairship.location.STOP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 352
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 353
    return-void
.end method

.method public static unbindService()V
    .locals 4

    .prologue
    .line 370
    sget-boolean v0, Lcom/urbanairship/location/UALocationManager;->bound:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v1, v1, Lcom/urbanairship/location/UALocationManager;->locationConnection:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 372
    :cond_0
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v0, v0, Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 373
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    sget-object v3, Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;

    iget-object v3, v3, Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.urbanairship.location.LOCATION_SERVICE_UNBOUND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 376
    :cond_1
    const/4 v0, 0x0

    sput-boolean v0, Lcom/urbanairship/location/UALocationManager;->bound:Z

    .line 377
    return-void
.end method


# virtual methods
.method public getBestProvider()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 475
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 476
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0}, Lcom/urbanairship/location/ILocationService;->getBestProvider()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCriteria()Landroid/location/Criteria;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 437
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 438
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0}, Lcom/urbanairship/location/ILocationService;->getCriteria()Landroid/location/Criteria;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentProvider()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 463
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 464
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0}, Lcom/urbanairship/location/ILocationService;->getCurrentProvider()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIntentReceiver()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Landroid/content/BroadcastReceiver;",
            ">;"
        }
    .end annotation

    .prologue
    .line 254
    iget-object v0, p0, Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 399
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 400
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0}, Lcom/urbanairship/location/ILocationService;->getLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public getPreferences()Lcom/urbanairship/location/LocationPreferences;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;

    return-object v0
.end method

.method public recordCurrentLocation()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 487
    sget-boolean v1, Lcom/urbanairship/location/UALocationManager;->bound:Z

    if-nez v1, :cond_0

    .line 488
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/urbanairship/location/LocationService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 489
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.urbanairship.location.RECORD_CURRENT_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 490
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 494
    .end local v0    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 492
    :cond_0
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/urbanairship/location/ILocationService;->requestSingleLocationUpdate(Landroid/location/Criteria;)V

    goto :goto_0
.end method

.method public recordCurrentLocation(Landroid/location/Criteria;)V
    .locals 3
    .param p1, "criteria"    # Landroid/location/Criteria;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 507
    sget-boolean v1, Lcom/urbanairship/location/UALocationManager;->bound:Z

    if-nez v1, :cond_0

    .line 508
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/urbanairship/location/LocationService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 509
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.urbanairship.location.RECORD_CURRENT_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 510
    const-string v1, "com.urbanairship.location.REQUESTED_CRITERIA"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 511
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 515
    .end local v0    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 513
    :cond_0
    sget-object v1, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v1, p1}, Lcom/urbanairship/location/ILocationService;->requestSingleLocationUpdate(Landroid/location/Criteria;)V

    goto :goto_0
.end method

.method public recordLocation(Landroid/location/Location;)V
    .locals 1
    .param p1, "newLocation"    # Landroid/location/Location;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    const/4 v0, -0x1

    .line 411
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 412
    invoke-virtual {p0, p1, v0, v0}, Lcom/urbanairship/location/UALocationManager;->recordLocation(Landroid/location/Location;II)V

    .line 413
    return-void
.end method

.method public recordLocation(Landroid/location/Location;II)V
    .locals 1
    .param p1, "newLocation"    # Landroid/location/Location;
    .param p2, "accuracy"    # I
    .param p3, "minDistance"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 427
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 428
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0, p1, p2, p3}, Lcom/urbanairship/location/ILocationService;->createLocationEvent(Landroid/location/Location;II)V

    .line 429
    return-void
.end method

.method public resetProviders(Landroid/location/Criteria;)V
    .locals 1
    .param p1, "criteria"    # Landroid/location/Criteria;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/urbanairship/util/ServiceNotBoundException;
        }
    .end annotation

    .prologue
    .line 450
    invoke-direct {p0}, Lcom/urbanairship/location/UALocationManager;->exceptIfNotBound()V

    .line 451
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0, p1}, Lcom/urbanairship/location/ILocationService;->setCriteria(Landroid/location/Criteria;)V

    .line 452
    sget-object v0, Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;

    invoke-interface {v0}, Lcom/urbanairship/location/ILocationService;->resetProviders()V

    .line 453
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
    .line 195
    .local p1, "receiver":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/content/BroadcastReceiver;>;"
    new-instance v1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .local v1, "receiverComponent":Landroid/content/ComponentName;
    :try_start_0
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getReceiverInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    iput-object p1, p0, Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;

    .line 211
    :goto_0
    return-void

    .line 201
    :catch_0
    move-exception v0

    .line 203
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v2, "The receiver class passed to UALocationManager.setIntentReceiver() is not declared in the manifest."

    invoke-static {v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 204
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
