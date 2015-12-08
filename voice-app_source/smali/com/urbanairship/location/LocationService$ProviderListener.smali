.class Lcom/urbanairship/location/LocationService$ProviderListener;
.super Ljava/lang/Object;
.source "LocationService.java"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/location/LocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProviderListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/location/LocationService;


# direct methods
.method private constructor <init>(Lcom/urbanairship/location/LocationService;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/urbanairship/location/LocationService;Lcom/urbanairship/location/LocationService$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/urbanairship/location/LocationService;
    .param p2, "x1"    # Lcom/urbanairship/location/LocationService$1;

    .prologue
    .line 346
    invoke-direct {p0, p1}, Lcom/urbanairship/location/LocationService$ProviderListener;-><init>(Lcom/urbanairship/location/LocationService;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 350
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 2
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Location provider disabled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 359
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Current provider ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") disabled, resetting providers."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 361
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->setProviders()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$400(Lcom/urbanairship/location/LocationService;)V

    .line 362
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->initializeLocationUpdates()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$500(Lcom/urbanairship/location/LocationService;)V

    .line 364
    :cond_0
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 2
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Location provider enabled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 369
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->bestProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$600(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # getter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$300(Lcom/urbanairship/location/LocationService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 372
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Best provider ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") now available; resetting providers."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 373
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # setter for: Lcom/urbanairship/location/LocationService;->currentProvider:Ljava/lang/String;
    invoke-static {v0, p1}, Lcom/urbanairship/location/LocationService;->access$302(Lcom/urbanairship/location/LocationService;Ljava/lang/String;)Ljava/lang/String;

    .line 374
    iget-object v0, p0, Lcom/urbanairship/location/LocationService$ProviderListener;->this$0:Lcom/urbanairship/location/LocationService;

    # invokes: Lcom/urbanairship/location/LocationService;->initializeLocationUpdates()V
    invoke-static {v0}, Lcom/urbanairship/location/LocationService;->access$500(Lcom/urbanairship/location/LocationService;)V

    .line 376
    :cond_2
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;
    .param p2, "status"    # I
    .param p3, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 354
    return-void
.end method
