.class Lcom/adobe/mobile/AnalyticsWorker$1;
.super Landroid/content/BroadcastReceiver;
.source "AnalyticsWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/AnalyticsWorker;->startNotifier()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/AnalyticsWorker;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/AnalyticsWorker;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/AnalyticsWorker;

    .prologue
    .line 552
    iput-object p1, p0, Lcom/adobe/mobile/AnalyticsWorker$1;->this$0:Lcom/adobe/mobile/AnalyticsWorker;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x0

    .line 555
    invoke-static {p1}, Lcom/adobe/mobile/AnalyticsWorker;->networkConnectivity(Landroid/content/Context;)Z

    move-result v0

    # setter for: Lcom/adobe/mobile/AnalyticsWorker;->networkAvailable:Z
    invoke-static {v0}, Lcom/adobe/mobile/AnalyticsWorker;->access$002(Z)Z

    .line 557
    # getter for: Lcom/adobe/mobile/AnalyticsWorker;->networkAvailable:Z
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->access$000()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 558
    const-string v0, "Analytics - Network status changed (reachable)"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->sharedInstance()Lcom/adobe/mobile/AnalyticsWorker;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/adobe/mobile/AnalyticsWorker;->kick(Z)V

    .line 564
    :goto_0
    return-void

    .line 562
    :cond_0
    const-string v0, "Analytics - Network status changed (unreachable)"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
