.class public Lcom/urbanairship/push/GCMPushReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GCMPushReceiver.java"


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
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x0

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    invoke-static {v2}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 61
    const-string v2, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    .line 64
    .local v0, "dataString":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Package ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") was replaced. Resetting GCM ID."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 68
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v2

    const/high16 v3, -0x80000000

    invoke-virtual {v2, v3}, Lcom/urbanairship/push/PushPreferences;->setAppVersionCode(I)V

    .line 72
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/urbanairship/push/PushService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 73
    .local v1, "startServiceInsurance":Landroid/content/Intent;
    const-string v2, "com.urbanairship.push.START_SERVICE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    const/4 v2, 0x0

    const-wide/32 v4, 0xea60

    invoke-static {p1, p2, v2, v4, v5}, Lcom/urbanairship/util/IntentUtils;->scheduleIntent(Landroid/content/Context;Landroid/content/Intent;IJ)V

    .line 82
    .end local v0    # "dataString":Ljava/lang/String;
    .end local v1    # "startServiceInsurance":Landroid/content/Intent;
    :cond_0
    :goto_0
    return-void

    .line 80
    :cond_1
    invoke-static {p1, p2}, Lcom/urbanairship/push/PushService;->runGcmIntentInService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 81
    const/4 v2, -0x1

    invoke-virtual {p0, v2, v4, v4}, Lcom/urbanairship/push/GCMPushReceiver;->setResult(ILjava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0
.end method
