.class Lcom/urbanairship/location/LocationService$1;
.super Landroid/os/AsyncTask;
.source "LocationService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/location/LocationService;->invokeLastLocationFinder()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/location/LocationService;


# direct methods
.method constructor <init>(Lcom/urbanairship/location/LocationService;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Lcom/urbanairship/location/LocationService$1;->this$0:Lcom/urbanairship/location/LocationService;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 262
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/location/LocationService$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 10
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 266
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v3

    iget-object v2, v3, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    .line 267
    .local v2, "options":Lcom/urbanairship/LocationOptions;
    iget-object v3, p0, Lcom/urbanairship/location/LocationService$1;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->lastLocationFinder:Lcom/urbanairship/location/LastLocationFinder;
    invoke-static {v3}, Lcom/urbanairship/location/LocationService;->access$000(Lcom/urbanairship/location/LocationService;)Lcom/urbanairship/location/LastLocationFinder;

    move-result-object v3

    iget-wide v4, v2, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iget-object v6, p0, Lcom/urbanairship/location/LocationService$1;->this$0:Lcom/urbanairship/location/LocationService;

    iget-object v6, v6, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v3, v4, v5, v6}, Lcom/urbanairship/location/LastLocationFinder;->getLastBestLocation(JLandroid/location/Criteria;)Landroid/location/Location;

    move-result-object v1

    .line 270
    .local v1, "newLocation":Landroid/location/Location;
    if-eqz v1, :cond_0

    .line 271
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Last best location found at lat: %f, long: %f with provider: %s"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x2

    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 275
    new-instance v0, Lcom/urbanairship/analytics/LocationEvent;

    sget-object v3, Lcom/urbanairship/analytics/LocationEvent$UpdateType;->CONTINUOUS:Lcom/urbanairship/analytics/LocationEvent$UpdateType;

    iget-object v4, p0, Lcom/urbanairship/location/LocationService$1;->this$0:Lcom/urbanairship/location/LocationService;

    iget-object v4, v4, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v4}, Landroid/location/Criteria;->getAccuracy()I

    move-result v4

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v5

    iget-object v5, v5, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    iget v5, v5, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/urbanairship/analytics/LocationEvent;-><init>(Landroid/location/Location;Lcom/urbanairship/analytics/LocationEvent$UpdateType;II)V

    .line 279
    .local v0, "event":Lcom/urbanairship/analytics/LocationEvent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 280
    iget-object v3, p0, Lcom/urbanairship/location/LocationService$1;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->notifyNewLocation(Landroid/location/Location;)V
    invoke-static {v3, v1}, Lcom/urbanairship/location/LocationService;->access$100(Lcom/urbanairship/location/LocationService;Landroid/location/Location;)V

    .line 284
    .end local v0    # "event":Lcom/urbanairship/analytics/LocationEvent;
    :goto_0
    const/4 v3, 0x0

    return-object v3

    .line 282
    :cond_0
    const-string v3, "No last best location found."

    invoke-static {v3}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_0
.end method
