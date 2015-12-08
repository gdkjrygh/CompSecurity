.class final Lcom/urbanairship/location/UALocationManager$1;
.super Landroid/content/BroadcastReceiver;
.source "UALocationManager.java"


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
    .line 117
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 122
    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v3

    # getter for: Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;
    invoke-static {v3}, Lcom/urbanairship/location/UALocationManager;->access$100(Lcom/urbanairship/location/UALocationManager;)Lcom/urbanairship/location/LocationPreferences;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v2

    .line 123
    .local v2, "locationEnabled":Z
    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v3

    # getter for: Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;
    invoke-static {v3}, Lcom/urbanairship/location/UALocationManager;->access$100(Lcom/urbanairship/location/UALocationManager;)Lcom/urbanairship/location/LocationPreferences;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/location/LocationPreferences;->isBackgroundLocationEnabled()Z

    move-result v0

    .line 124
    .local v0, "backgroundLocationEnabled":Z
    # getter for: Lcom/urbanairship/location/UALocationManager;->instance:Lcom/urbanairship/location/UALocationManager;
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$000()Lcom/urbanairship/location/UALocationManager;

    move-result-object v3

    # getter for: Lcom/urbanairship/location/UALocationManager;->preferences:Lcom/urbanairship/location/LocationPreferences;
    invoke-static {v3}, Lcom/urbanairship/location/UALocationManager;->access$100(Lcom/urbanairship/location/UALocationManager;)Lcom/urbanairship/location/LocationPreferences;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/location/LocationPreferences;->isForegroundLocationEnabled()Z

    move-result v1

    .line 127
    .local v1, "foregroundLocationEnabled":Z
    if-eqz v2, :cond_0

    if-eqz v0, :cond_1

    .line 136
    :cond_0
    :goto_0
    return-void

    .line 131
    :cond_1
    sget-object v3, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_BACKGROUND:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 132
    # invokes: Lcom/urbanairship/location/UALocationManager;->stopAndUnbindService()V
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$200()V

    goto :goto_0

    .line 133
    :cond_2
    sget-object v3, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz v1, :cond_0

    .line 134
    # invokes: Lcom/urbanairship/location/UALocationManager;->startAndBindService()V
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->access$300()V

    goto :goto_0
.end method
