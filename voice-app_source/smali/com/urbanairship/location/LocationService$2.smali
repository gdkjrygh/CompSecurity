.class Lcom/urbanairship/location/LocationService$2;
.super Lcom/urbanairship/location/ILocationService$Stub;
.source "LocationService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/location/LocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/location/LocationService;


# direct methods
.method constructor <init>(Lcom/urbanairship/location/LocationService;)V
    .locals 0

    .prologue
    .line 381
    iput-object p1, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    invoke-direct {p0}, Lcom/urbanairship/location/ILocationService$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public createLocationEvent(Landroid/location/Location;II)V
    .locals 4
    .param p1, "newLocation"    # Landroid/location/Location;
    .param p2, "accuracy"    # I
    .param p3, "distance"    # I

    .prologue
    .line 390
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # setter for: Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;
    invoke-static {v0, p1}, Lcom/urbanairship/location/LocationService;->access$702(Lcom/urbanairship/location/LocationService;Landroid/location/Location;)Landroid/location/Location;

    .line 391
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    new-instance v1, Lcom/urbanairship/analytics/LocationEvent;

    iget-object v2, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;
    invoke-static {v2}, Lcom/urbanairship/location/LocationService;->access$700(Lcom/urbanairship/location/LocationService;)Landroid/location/Location;

    move-result-object v2

    sget-object v3, Lcom/urbanairship/analytics/LocationEvent$UpdateType;->SINGLE:Lcom/urbanairship/analytics/LocationEvent$UpdateType;

    invoke-direct {v1, v2, v3, p2, p3}, Lcom/urbanairship/analytics/LocationEvent;-><init>(Landroid/location/Location;Lcom/urbanairship/analytics/LocationEvent$UpdateType;II)V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 393
    return-void
.end method

.method public getBestProvider()Ljava/lang/String;
    .locals 1

    .prologue
    .line 422
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$600(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCriteria()Landroid/location/Criteria;
    .locals 1

    .prologue
    .line 397
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    iget-object v0, v0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    return-object v0
.end method

.method public getCurrentProvider()Ljava/lang/String;
    .locals 1

    .prologue
    .line 417
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->location:Landroid/location/Location;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$700(Lcom/urbanairship/location/LocationService;)Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public requestSingleLocationUpdate(Landroid/location/Criteria;)V
    .locals 7
    .param p1, "singleCriteria"    # Landroid/location/Criteria;

    .prologue
    .line 427
    const-string v0, "Requesting a single update."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 429
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->initializeCriteria()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$1000(Lcom/urbanairship/location/LocationService;)V

    .line 432
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->setProviders()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$400(Lcom/urbanairship/location/LocationService;)V

    .line 436
    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    iget-object v0, v0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    invoke-virtual {v0}, Landroid/location/Criteria;->getAccuracy()I

    move-result v6

    .line 438
    .local v6, "accuracy":I
    :goto_0
    if-nez p1, :cond_2

    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v1

    .line 441
    .local v1, "provider":Ljava/lang/String;
    :goto_1
    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 443
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->createSingleLocationChangedPendingIntent(I)V
    invoke-static {v0, v6}, Lcom/urbanairship/location/LocationService;->access$1200(Lcom/urbanairship/location/LocationService;I)V

    .line 444
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$1100(Lcom/urbanairship/location/LocationService;)Landroid/location/LocationManager;

    move-result-object v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->singleLocationChangedPendingIntent:Landroid/app/PendingIntent;
    invoke-static {v5}, Lcom/urbanairship/location/LocationService;->access$1300(Lcom/urbanairship/location/LocationService;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/app/PendingIntent;)V

    .line 449
    :goto_2
    return-void

    .line 436
    .end local v1    # "provider":Ljava/lang/String;
    .end local v6    # "accuracy":I
    :cond_1
    invoke-virtual {p1}, Landroid/location/Criteria;->getAccuracy()I

    move-result v6

    goto :goto_0

    .line 438
    .restart local v6    # "accuracy":I
    :cond_2
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->locationManager:Landroid/location/LocationManager;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$1100(Lcom/urbanairship/location/LocationService;)Landroid/location/LocationManager;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 446
    .restart local v1    # "provider":Ljava/lang/String;
    :cond_3
    const-string v0, "There are no available location providers. Retrieving last known location."

    invoke-static {v0}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 447
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->invokeLastLocationFinder()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$1400(Lcom/urbanairship/location/LocationService;)V

    goto :goto_2
.end method

.method public resetProviders()V
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->setProviders()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$400(Lcom/urbanairship/location/LocationService;)V

    .line 412
    # getter for: Lcom/urbanairship/location/LocationService;->started:Z
    invoke-static {}, Lcom/urbanairship/location/LocationService;->access$900()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->initializeLocationUpdates()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$500(Lcom/urbanairship/location/LocationService;)V

    .line 413
    :cond_0
    return-void
.end method

.method public setCriteria(Landroid/location/Criteria;)V
    .locals 1
    .param p1, "newCriteria"    # Landroid/location/Criteria;

    .prologue
    .line 402
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    iput-object p1, v0, Lcom/urbanairship/location/LocationService;->criteria:Landroid/location/Criteria;

    .line 403
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$2;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->createLocationChangedPendingIntent()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$800(Lcom/urbanairship/location/LocationService;)V

    .line 404
    return-void
.end method
