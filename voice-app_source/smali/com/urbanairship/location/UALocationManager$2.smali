.class final Lcom/urbanairship/location/UALocationManager$2;
.super Ljava/lang/Object;
.source "UALocationManager.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/location/UALocationManager;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4
    .param p1, "className"    # Landroid/content/ComponentName;
    .param p2, "binder"    # Landroid/os/IBinder;

    .prologue
    .line 144
    invoke-static {p2}, Lcom/urbanairship/location/ILocationService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/urbanairship/location/ILocationService;

    move-result-object v0

    # setter for: Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;
    invoke-static {v0}, Lcom/urbanairship/location/UALocationManager;->access$402(Lcom/urbanairship/location/ILocationService;)Lcom/urbanairship/location/ILocationService;

    .line 145
    const/4 v0, 0x1

    # setter for: Lcom/urbanairship/location/UALocationManager;->bound:Z
    invoke-static {v0}, Lcom/urbanairship/location/UALocationManager;->access$502(Z)Z

    .line 146
    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v0

    # getter for: Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;
    invoke-static {v0}, Lcom/urbanairship/location/UALocationManager;->access$600(Lcom/urbanairship/location/UALocationManager;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 147
    # getter for: Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$700()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    # getter for: Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$700()Landroid/content/Context;

    move-result-object v2

    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v3

    # getter for: Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;
    invoke-static {v3}, Lcom/urbanairship/location/UALocationManager;->access$600(Lcom/urbanairship/location/UALocationManager;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.urbanairship.location.LOCATION_SERVICE_BOUND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 149
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4
    .param p1, "className"    # Landroid/content/ComponentName;

    .prologue
    .line 153
    const/4 v0, 0x0

    # setter for: Lcom/urbanairship/location/UALocationManager;->locationService:Lcom/urbanairship/location/ILocationService;
    invoke-static {v0}, Lcom/urbanairship/location/UALocationManager;->access$402(Lcom/urbanairship/location/ILocationService;)Lcom/urbanairship/location/ILocationService;

    .line 154
    const/4 v0, 0x0

    # setter for: Lcom/urbanairship/location/UALocationManager;->bound:Z
    invoke-static {v0}, Lcom/urbanairship/location/UALocationManager;->access$502(Z)Z

    .line 155
    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v0

    # getter for: Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;
    invoke-static {v0}, Lcom/urbanairship/location/UALocationManager;->access$600(Lcom/urbanairship/location/UALocationManager;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    # getter for: Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$700()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    # getter for: Lcom/urbanairship/location/UALocationManager;->context:Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$700()Landroid/content/Context;

    move-result-object v2

    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v3

    # getter for: Lcom/urbanairship/location/UALocationManager;->intentReceiver:Ljava/lang/Class;
    invoke-static {v3}, Lcom/urbanairship/location/UALocationManager;->access$600(Lcom/urbanairship/location/UALocationManager;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.urbanairship.location.LOCATION_SERVICE_UNBOUND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 158
    :cond_0
    const-string v0, "LocationService unbound."

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 159
    return-void
.end method
