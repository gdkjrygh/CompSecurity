.class public Lcom/urbanairship/CoreReceiver;
.super Landroid/content/BroadcastReceiver;
.source "CoreReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v5, Landroid/app/Application;

    invoke-static {v5}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 52
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 54
    .local v0, "action":Ljava/lang/String;
    const-string v5, "com.urbanairship.push.NOTIFICATION_OPENED_PROXY"

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 56
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    sget-object v6, Lcom/urbanairship/actions/Situation;->PUSH_OPENED:Lcom/urbanairship/actions/Situation;

    invoke-static {v5, v6}, Lcom/urbanairship/actions/ActionService;->runActionsForPushBundle(Landroid/os/Bundle;Lcom/urbanairship/actions/Situation;)V

    .line 60
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v5

    const-string v6, "com.urbanairship.push.PUSH_ID"

    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/urbanairship/analytics/Analytics;->setConversionPushId(Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/push/PushManager;->getIntentReceiver()Ljava/lang/Class;

    move-result-object v3

    .line 64
    .local v3, "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-eqz v3, :cond_2

    .line 66
    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.urbanairship.push.NOTIFICATION_OPENED"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 67
    .local v4, "openedIntent":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/urbanairship/push/PushManager;->getIntentReceiver()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 68
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 69
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 72
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 77
    .end local v4    # "openedIntent":Landroid/content/Intent;
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "com.urbanairship.push.CONTENT_INTENT"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/PendingIntent;

    .line 78
    .local v1, "contentIntent":Landroid/app/PendingIntent;
    if-eqz v1, :cond_1

    .line 80
    :try_start_0
    invoke-virtual {v1}, Landroid/app/PendingIntent;->send()V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .end local v1    # "contentIntent":Landroid/app/PendingIntent;
    .end local v3    # "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_1
    :goto_1
    return-void

    .line 74
    .restart local v3    # "intentReceiver":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_2
    const-string v5, "No intent receiver set, not sending ACTION_NOTIFICATION_OPENED"

    invoke-static {v5}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 81
    .restart local v1    # "contentIntent":Landroid/app/PendingIntent;
    :catch_0
    move-exception v2

    .line 82
    .local v2, "e":Landroid/app/PendingIntent$CanceledException;
    const-string v5, "Failed to send notification\'s contentIntent, already canceled."

    invoke-static {v5}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1
.end method
