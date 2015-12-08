.class public Lcom/adobe/mobile/AnalyticsWorker$ReferrerTimeoutTask;
.super Ljava/util/TimerTask;
.source "AnalyticsWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/AnalyticsWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "ReferrerTimeoutTask"
.end annotation


# instance fields
.field private kickFlag:Z

.field final synthetic this$0:Lcom/adobe/mobile/AnalyticsWorker;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/AnalyticsWorker;Z)V
    .locals 1
    .param p1, "this$0"    # Lcom/adobe/mobile/AnalyticsWorker;
    .param p2, "flag"    # Z

    .prologue
    .line 618
    iput-object p1, p0, Lcom/adobe/mobile/AnalyticsWorker$ReferrerTimeoutTask;->this$0:Lcom/adobe/mobile/AnalyticsWorker;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 616
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/adobe/mobile/AnalyticsWorker$ReferrerTimeoutTask;->kickFlag:Z

    .line 619
    iput-boolean p2, p0, Lcom/adobe/mobile/AnalyticsWorker$ReferrerTimeoutTask;->kickFlag:Z

    .line 620
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 624
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/adobe/mobile/ReferrerHandler;->setReferrerProcessed(Z)V

    .line 625
    const-string v0, "Analytics - Referrer timeout has expired without referrer data"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    iget-object v0, p0, Lcom/adobe/mobile/AnalyticsWorker$ReferrerTimeoutTask;->this$0:Lcom/adobe/mobile/AnalyticsWorker;

    iget-boolean v1, p0, Lcom/adobe/mobile/AnalyticsWorker$ReferrerTimeoutTask;->kickFlag:Z

    invoke-virtual {v0, v1}, Lcom/adobe/mobile/AnalyticsWorker;->kick(Z)V

    .line 627
    return-void
.end method
