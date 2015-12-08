.class public Lcom/urbanairship/location/LocationService;
.super Landroid/app/Service;
.source "LocationService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/location/LocationService$ProviderListener;
    }
.end annotation


# static fields
.field public static final ACTION_LOCATION_CHANGED:Ljava/lang/String; = "com.urbanairship.location.ACTION_LOCATION_CHANGED"

.field public static final ACTION_RECORD_CURRENT_LOCATION:Ljava/lang/String; = "com.urbanairship.location.RECORD_CURRENT_LOCATION"

.field public static final ACTION_SINGLE_LOCATION_CHANGED:Ljava/lang/String; = "com.urbanairship.location.ACTION_SINGLE_LOCATION_CHANGED"

.field public static final ACTION_START:Ljava/lang/String; = "com.urbanairship.location.START"

.field public static final ACTION_STOP:Ljava/lang/String; = "com.urbanairship.location.STOP"

.field private static final NETWORK_PROVIDER:Ljava/lang/String;

.field public static final REQUESTED_ACCURACY_KEY:Ljava/lang/String; = "com.urbanairship.location.REQUESTED_ACCURACY"

.field public static final REQUESTED_CRITERIA:Ljava/lang/String; = "com.urbanairship.location.REQUESTED_CRITERIA"

.field private static bound:Z

.field private static started:Z


# instance fields
.field private bestProvider:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field criteria:Landroid/location/Criteria;

.field private currentProvider:Ljava/lang/String;

.field private gpsListener:Lcom/urbanairship/location/LocationService$ProviderListener;

.field private lastLocationFinder:Lcom/urbanairship/location/LastLocationFinder;

.field private location:Landroid/location/Location;

.field private final locationBinder:Lcom/urbanairship/location/ILocationService$Stub;

.field private locationChangedPendingIntent:Landroid/app/PendingIntent;

.field private locationManager:Landroid/location/LocationManager;

.field private networkListener:Lcom/urbanairship/location/LocationService$ProviderListener;

.field private singleLocationChangedPendingIntent:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 101
    sget-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->NETWORK:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    invoke-virtual {v0}, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/urbanairship/location/LocationService;->NETWORK_PROVIDER:Ljava/lang/String;

    .line 112
    sput-boolean v2, Lcom/urbanairship/location/LocationService;->started:Z

    .line 113
    sput-boolean v2, Lcom/urbanairship/location/LocationService;->bound:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 381
    new-instance v0, Lcom/urbanairship/location/LocationService$2;

    invoke-direct {v0, p0}, Lcom/urbanairship/location/LocationService$2;-><init>(Lcom/urbanairship/location/LocationService;)V

    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->locationBinder:Lcom/urbanairship/location/ILocationService$Stub;

    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/location/LocationService;)Lcom/urbanairship/location/LastLocationFinder;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->lastLocationFinder:Lcom/urbanairship/location/LastLocationFinder;

    return-object v0
.end method

.method static synthetic access$100(Lcom/urbanairship/location/LocationService;Landroid/location/Location;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;
    .param p1, "x1"    # Landroid/location/Location;

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/urbanairship/location/LocationService;->notifyNewLocation(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/urbanairship/location/LocationService;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->initializeCriteria()V

    return-void
.end method

.method static synthetic access$1100(Lcom/urbanairship/location/LocationService;)Landroid/location/LocationManager;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/urbanairship/location/LocationService;I)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;
    .param p1, "x1"    # I

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/urbanairship/location/LocationService;->createSingleLocationChangedPendingIntent(I)V

    return-void
.end method

.method static synthetic access$1300(Lcom/urbanairship/location/LocationService;)Landroid/app/PendingIntent;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->singleLocationChangedPendingIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/urbanairship/location/LocationService;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->invokeLastLocationFinder()V

    return-void
.end method

.method static synthetic access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Lcom/urbanairship/location/LocationService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 58
    iput-object p1, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lcom/urbanairship/location/LocationService;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->setProviders()V

    return-void
.end method

.method static synthetic access$500(Lcom/urbanairship/location/LocationService;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->initializeLocationUpdates()V

    return-void
.end method

.method static synthetic access$600(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/urbanairship/location/LocationService;)Landroid/location/Location;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;

    return-object v0
.end method

.method static synthetic access$702(Lcom/urbanairship/location/LocationService;Landroid/location/Location;)Landroid/location/Location;
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;
    .param p1, "x1"    # Landroid/location/Location;

    .prologue
    .line 58
    iput-object p1, p0, Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$800(Lcom/urbanairship/location/LocationService;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/location/LocationService;

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->createLocationChangedPendingIntent()V

    return-void
.end method

.method static synthetic access$900()Z
    .locals 1

    .prologue
    .line 58
    sget-boolean v0, Lcom/urbanairship/location/LocationService;->started:Z

    return v0
.end method

.method private createLocationChangedPendingIntent()V
    .locals 4

    .prologue
    .line 320
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/urbanairship/location/LocationService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/urbanairship/location/LocationService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.urbanairship.location.ACTION_LOCATION_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "com.urbanairship.location.REQUESTED_ACCURACY"

    iget-object v3, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v3}, Landroid/location/Criteria;->getAccuracy()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 324
    .local v0, "locationChangedIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0x10000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, p0, Lcom/urbanairship/location/LocationService;->locationChangedPendingIntent:Landroid/app/PendingIntent;

    .line 327
    return-void
.end method

.method private declared-synchronized createService()V
    .locals 2

    .prologue
    .line 179
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lcom/urbanairship/location/LocationService;->bound:Z

    .line 181
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    .line 182
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    .line 184
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->initializeCriteria()V

    .line 185
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v0}, Landroid/location/Criteria;->getAccuracy()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/urbanairship/location/LocationService;->createSingleLocationChangedPendingIntent(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    monitor-exit p0

    return-void

    .line 179
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private createSingleLocationChangedPendingIntent(I)V
    .locals 4
    .param p1, "requestedAccuracy"    # I

    .prologue
    .line 310
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/urbanairship/location/LocationService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/urbanairship/location/LocationService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.urbanairship.location.ACTION_SINGLE_LOCATION_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "com.urbanairship.location.REQUESTED_ACCURACY"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 314
    .local v0, "singleLocationChangedIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0x10000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, p0, Lcom/urbanairship/location/LocationService;->singleLocationChangedPendingIntent:Landroid/app/PendingIntent;

    .line 317
    return-void
.end method

.method private initializeCriteria()V
    .locals 3

    .prologue
    .line 220
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v0, v1, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    .line 221
    .local v0, "options":Lcom/urbanairship/LocationOptions;
    invoke-virtual {v0}, Lcom/urbanairship/LocationOptions;->isValid()Z

    .line 223
    new-instance v1, Landroid/location/Criteria;

    invoke-direct {v1}, Landroid/location/Criteria;-><init>()V

    iput-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    .line 225
    iget v1, v0, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    if-nez v1, :cond_0

    .line 226
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget v2, v0, Lcom/urbanairship/LocationOptions;->accuracy:I

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 230
    :goto_0
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget v2, v0, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setPowerRequirement(I)V

    .line 231
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget-boolean v2, v0, Lcom/urbanairship/LocationOptions;->costAllowed:Z

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setCostAllowed(Z)V

    .line 232
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget-boolean v2, v0, Lcom/urbanairship/LocationOptions;->altitudeRequired:Z

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAltitudeRequired(Z)V

    .line 233
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget-boolean v2, v0, Lcom/urbanairship/LocationOptions;->speedRequired:Z

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setSpeedRequired(Z)V

    .line 234
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget-boolean v2, v0, Lcom/urbanairship/LocationOptions;->bearingRequired:Z

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setBearingRequired(Z)V

    .line 235
    return-void

    .line 228
    :cond_0
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    iget v2, v0, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAccuracy(I)V

    goto :goto_0
.end method

.method private initializeLocationUpdates()V
    .locals 3

    .prologue
    .line 330
    const-string v1, "Removing location update requests with the old provider"

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 332
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->locationChangedPendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->removeUpdates(Landroid/app/PendingIntent;)V

    .line 334
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/urbanairship/location/LocationService;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 335
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v0, v1, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    .line 337
    .local v0, "options":Lcom/urbanairship/LocationOptions;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requesting location updates with the new provider: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 340
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->locationChangedPendingIntent:Landroid/app/PendingIntent;

    invoke-direct {p0, v1, v0, v2}, Lcom/urbanairship/location/LocationService;->requestLocationUpdates(Ljava/lang/String;Lcom/urbanairship/LocationOptions;Landroid/app/PendingIntent;)V

    .line 344
    .end local v0    # "options":Lcom/urbanairship/LocationOptions;
    :goto_0
    return-void

    .line 342
    :cond_0
    const-string v1, "There are no available providers, waiting to request updates."

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private initializeProviderListeners()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 296
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v0, v1, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    .line 298
    .local v0, "options":Lcom/urbanairship/LocationOptions;
    iget-boolean v1, v0, Lcom/urbanairship/LocationOptions;->allowGPSForLocationTracking:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/urbanairship/location/LocationService;->isProviderAvailable(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 299
    new-instance v1, Lcom/urbanairship/location/LocationService$ProviderListener;

    invoke-direct {v1, p0, v3}, Lcom/urbanairship/location/LocationService$ProviderListener;-><init>(Lcom/urbanairship/location/LocationService;Lcom/urbanairship/location/LocationService$1;)V

    iput-object v1, p0, Lcom/urbanairship/location/LocationService;->gpsListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    .line 300
    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->gpsListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    invoke-direct {p0, v1, v0, v2}, Lcom/urbanairship/location/LocationService;->requestLocationUpdates(Ljava/lang/String;Lcom/urbanairship/LocationOptions;Lcom/urbanairship/location/LocationService$ProviderListener;)V

    .line 303
    :cond_0
    sget-object v1, Lcom/urbanairship/location/LocationService;->NETWORK_PROVIDER:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/urbanairship/location/LocationService;->isProviderAvailable(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 304
    new-instance v1, Lcom/urbanairship/location/LocationService$ProviderListener;

    invoke-direct {v1, p0, v3}, Lcom/urbanairship/location/LocationService$ProviderListener;-><init>(Lcom/urbanairship/location/LocationService;Lcom/urbanairship/location/LocationService$1;)V

    iput-object v1, p0, Lcom/urbanairship/location/LocationService;->networkListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    .line 305
    sget-object v1, Lcom/urbanairship/location/LocationService;->NETWORK_PROVIDER:Ljava/lang/String;

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->networkListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    invoke-direct {p0, v1, v0, v2}, Lcom/urbanairship/location/LocationService;->requestLocationUpdates(Ljava/lang/String;Lcom/urbanairship/LocationOptions;Lcom/urbanairship/location/LocationService$ProviderListener;)V

    .line 307
    :cond_1
    return-void
.end method

.method private invokeLastLocationFinder()V
    .locals 4

    .prologue
    .line 259
    const-string v2, "Invoking last location finder."

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 261
    new-instance v2, Lcom/urbanairship/location/LastLocationFinder;

    iget-object v3, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/urbanairship/location/LastLocationFinder;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/urbanairship/location/LocationService;->lastLocationFinder:Lcom/urbanairship/location/LastLocationFinder;

    .line 262
    new-instance v1, Lcom/urbanairship/location/LocationService$1;

    invoke-direct {v1, p0}, Lcom/urbanairship/location/LocationService$1;-><init>(Lcom/urbanairship/location/LocationService;)V

    .line 289
    .local v1, "findLastLocationTask":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    const/4 v2, 0x0

    :try_start_0
    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 293
    :goto_0
    return-void

    .line 290
    :catch_0
    move-exception v0

    .line 291
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Unable to execute findLastLocationTask."

    invoke-static {v2, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private isProviderAvailable(Ljava/lang/String;)Z
    .locals 3
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 560
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 564
    :cond_0
    :goto_0
    return v1

    .line 563
    :cond_1
    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    invoke-virtual {v2, v1}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v0

    .line 564
    .local v0, "providers":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0
.end method

.method private isProviderEnabled(Ljava/lang/String;)Z
    .locals 1
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 550
    invoke-direct {p0, p1}, Lcom/urbanairship/location/LocationService;->isProviderAvailable(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private notifyNewLocation(Landroid/location/Location;)V
    .locals 4
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 497
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->shared()Lcom/urbanairship/location/UALocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/location/UALocationManager;->getIntentReceiver()Ljava/lang/Class;

    move-result-object v0

    .line 499
    .local v0, "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/content/BroadcastReceiver;>;"
    if-eqz v0, :cond_0

    .line 500
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, ".urbanairship.location.LOCATION_UPDATE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.urbanairship.location.LOCATION"

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v1

    .line 503
    .local v1, "locationUpdateIntent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 505
    .end local v1    # "locationUpdateIntent":Landroid/content/Intent;
    :cond_0
    return-void
.end method

.method private onLocationChange(Landroid/content/Intent;)V
    .locals 8
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 459
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "location"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    .line 460
    .local v1, "newLocation":Landroid/location/Location;
    if-nez v1, :cond_0

    .line 494
    :goto_0
    return-void

    .line 463
    :cond_0
    const-string v4, "Received a location update."

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 464
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Location: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Landroid/location/Location;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 466
    sget-object v3, Lcom/urbanairship/analytics/LocationEvent$UpdateType;->CONTINUOUS:Lcom/urbanairship/analytics/LocationEvent$UpdateType;

    .line 469
    .local v3, "updateType":Lcom/urbanairship/analytics/LocationEvent$UpdateType;
    const-string v4, "com.urbanairship.location.ACTION_SINGLE_LOCATION_CHANGED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 470
    const-string v4, "Received a single-shot location update."

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 471
    iget-object v4, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v5, p0, Lcom/urbanairship/location/LocationService;->singleLocationChangedPendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->removeUpdates(Landroid/app/PendingIntent;)V

    .line 473
    sget-object v3, Lcom/urbanairship/analytics/LocationEvent$UpdateType;->SINGLE:Lcom/urbanairship/analytics/LocationEvent$UpdateType;

    .line 474
    const/4 v0, 0x0

    .line 476
    .local v0, "distance":I
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->shared()Lcom/urbanairship/location/UALocationManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/location/UALocationManager;->getPreferences()Lcom/urbanairship/location/LocationPreferences;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/location/LocationPreferences;->isForegroundLocationEnabled()Z

    move-result v4

    if-nez v4, :cond_1

    .line 477
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->unbindService()V

    .line 478
    new-instance v2, Landroid/content/Intent;

    iget-object v4, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    const-class v5, Lcom/urbanairship/location/LocationService;

    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 479
    .local v2, "stopServiceIntent":Landroid/content/Intent;
    const-string v4, "com.urbanairship.location.STOP"

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 480
    const-string v4, "LocationService stopService"

    invoke-static {v4}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 481
    iget-object v4, p0, Lcom/urbanairship/location/LocationService;->context:Landroid/content/Context;

    invoke-virtual {v4, v2}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 487
    .end local v2    # "stopServiceIntent":Landroid/content/Intent;
    :cond_1
    :goto_1
    iput-object v1, p0, Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;

    .line 489
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v4

    new-instance v5, Lcom/urbanairship/analytics/LocationEvent;

    const-string v6, "com.urbanairship.location.REQUESTED_ACCURACY"

    const/4 v7, -0x1

    invoke-virtual {p1, v6, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    invoke-direct {v5, v1, v3, v6, v0}, Lcom/urbanairship/analytics/LocationEvent;-><init>(Landroid/location/Location;Lcom/urbanairship/analytics/LocationEvent$UpdateType;II)V

    invoke-virtual {v4, v5}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 492
    iget-object v4, p0, Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;

    invoke-direct {p0, v4}, Lcom/urbanairship/location/LocationService;->notifyNewLocation(Landroid/location/Location;)V

    goto/16 :goto_0

    .line 484
    .end local v0    # "distance":I
    :cond_2
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v4

    iget-object v4, v4, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    iget v0, v4, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    .restart local v0    # "distance":I
    goto :goto_1
.end method

.method private requestLocationUpdates(Ljava/lang/String;Lcom/urbanairship/LocationOptions;Landroid/app/PendingIntent;)V
    .locals 7
    .param p1, "provider"    # Ljava/lang/String;
    .param p2, "options"    # Lcom/urbanairship/LocationOptions;
    .param p3, "pendingIntent"    # Landroid/app/PendingIntent;

    .prologue
    .line 534
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-wide v2, p2, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    iget v1, p2, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    int-to-float v4, v1

    move-object v1, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 541
    :goto_0
    return-void

    .line 538
    :catch_0
    move-exception v6

    .line 539
    .local v6, "ex":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to request location updates for provider "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private requestLocationUpdates(Ljava/lang/String;Lcom/urbanairship/LocationOptions;Lcom/urbanairship/location/LocationService$ProviderListener;)V
    .locals 7
    .param p1, "provider"    # Ljava/lang/String;
    .param p2, "options"    # Lcom/urbanairship/LocationOptions;
    .param p3, "listener"    # Lcom/urbanairship/location/LocationService$ProviderListener;

    .prologue
    .line 516
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-wide v2, p2, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    iget v1, p2, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    int-to-float v4, v1

    move-object v1, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 523
    :goto_0
    return-void

    .line 520
    :catch_0
    move-exception v6

    .line 521
    .local v6, "ex":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to request location updates for provider "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private setProviders()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 244
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v0

    iget-object v0, v0, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    iget-boolean v0, v0, Lcom/urbanairship/LocationOptions;->allowGPSForLocationTracking:Z

    if-eqz v0, :cond_1

    .line 247
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v0, v1, v3}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    .line 248
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/urbanairship/location/LocationService;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    .line 253
    :goto_1
    const-string v0, "Current location provider: %s, best location provider: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 254
    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v0, v1, v4}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 250
    :cond_1
    sget-object v0, Lcom/urbanairship/location/LocationService;->NETWORK_PROVIDER:Ljava/lang/String;

    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    .line 251
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/urbanairship/location/LocationService;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;

    :goto_2
    iput-object v0, p0, Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method private declared-synchronized setupService()V
    .locals 1

    .prologue
    .line 192
    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/urbanairship/location/LocationService;->started:Z

    if-eqz v0, :cond_0

    .line 193
    const-string v0, "Location service already started."

    invoke-static {v0}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    :goto_0
    monitor-exit p0

    return-void

    .line 197
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    sput-boolean v0, Lcom/urbanairship/location/LocationService;->started:Z

    .line 199
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->setProviders()V

    .line 200
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->invokeLastLocationFinder()V

    .line 201
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->createLocationChangedPendingIntent()V

    .line 202
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->initializeProviderListeners()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 192
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized teardownService()V
    .locals 2

    .prologue
    .line 208
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->networkListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->networkListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->gpsListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->gpsListener:Lcom/urbanairship/location/LocationService$ProviderListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 212
    :cond_1
    sget-boolean v0, Lcom/urbanairship/location/LocationService;->started:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/urbanairship/location/LocationService;->locationChangedPendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/app/PendingIntent;)V

    .line 214
    :cond_2
    const/4 v0, 0x0

    sput-boolean v0, Lcom/urbanairship/location/LocationService;->started:Z

    .line 215
    const/4 v0, 0x0

    sput-boolean v0, Lcom/urbanairship/location/LocationService;->bound:Z

    .line 216
    invoke-virtual {p0}, Lcom/urbanairship/location/LocationService;->stopSelf()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    monitor-exit p0

    return-void

    .line 208
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 454
    iget-object v0, p0, Lcom/urbanairship/location/LocationService;->locationBinder:Lcom/urbanairship/location/ILocationService$Stub;

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/urbanairship/location/LocationService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 120
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->isFlying()Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    const-string v0, "LocationService started prior to a UAirship.takeOff() call."

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 122
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UAirship.takeOff() must be called every time Application.onCreate() is invoked."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 127
    sget-boolean v0, Lcom/urbanairship/location/LocationService;->bound:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->createService()V

    .line 128
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 174
    const-string v0, "Location service destroyed"

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 175
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->teardownService()V

    .line 176
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 5
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "startId"    # I

    .prologue
    .line 133
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    .line 135
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 170
    :cond_0
    :goto_0
    return-void

    .line 139
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 141
    .local v0, "action":Ljava/lang/String;
    const-string v3, "com.urbanairship.location.STOP"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 142
    const-string v3, "Location Service stopping."

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 143
    sget-boolean v3, Lcom/urbanairship/location/LocationService;->started:Z

    if-eqz v3, :cond_0

    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->teardownService()V

    goto :goto_0

    .line 144
    :cond_2
    const-string v3, "com.urbanairship.location.START"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 145
    const-string v3, "Location Service starting."

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 146
    sget-boolean v3, Lcom/urbanairship/location/LocationService;->started:Z

    if-nez v3, :cond_3

    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->setupService()V

    .line 147
    :cond_3
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->shared()Lcom/urbanairship/location/UALocationManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/location/UALocationManager;->getPreferences()Lcom/urbanairship/location/LocationPreferences;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/location/LocationPreferences;->isForegroundLocationEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 148
    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->initializeLocationUpdates()V

    goto :goto_0

    .line 150
    :cond_4
    const-string v3, "com.urbanairship.location.RECORD_CURRENT_LOCATION"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 151
    const-string v3, "Location Service recording current location."

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 153
    sget-boolean v3, Lcom/urbanairship/location/LocationService;->started:Z

    if-nez v3, :cond_5

    invoke-direct {p0}, Lcom/urbanairship/location/LocationService;->setupService()V

    .line 155
    :cond_5
    :try_start_0
    const-string v3, "com.urbanairship.location.REQUESTED_CRITERIA"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 156
    const-string v3, "com.urbanairship.location.REQUESTED_CRITERIA"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/location/Criteria;

    .line 157
    .local v2, "newCriteria":Landroid/location/Criteria;
    iget-object v3, p0, Lcom/urbanairship/location/LocationService;->locationBinder:Lcom/urbanairship/location/ILocationService$Stub;

    invoke-virtual {v3, v2}, Lcom/urbanairship/location/ILocationService$Stub;->requestSingleLocationUpdate(Landroid/location/Criteria;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 161
    .end local v2    # "newCriteria":Landroid/location/Criteria;
    :catch_0
    move-exception v1

    .line 162
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 159
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_6
    :try_start_1
    iget-object v3, p0, Lcom/urbanairship/location/LocationService;->locationBinder:Lcom/urbanairship/location/ILocationService$Stub;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/urbanairship/location/ILocationService$Stub;->requestSingleLocationUpdate(Landroid/location/Criteria;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 164
    :cond_7
    const-string v3, "com.urbanairship.location.ACTION_SINGLE_LOCATION_CHANGED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    const-string v3, "com.urbanairship.location.ACTION_LOCATION_CHANGED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 165
    :cond_8
    invoke-direct {p0, p1}, Lcom/urbanairship/location/LocationService;->onLocationChange(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 167
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown action: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto/16 :goto_0
.end method
