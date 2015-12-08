.class Lcom/urbanairship/analytics/Analytics$1;
.super Lcom/urbanairship/analytics/ActivityMonitor$Listener;
.source "Analytics.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/analytics/Analytics;-><init>(Landroid/app/Application;Lcom/urbanairship/analytics/ActivityMonitor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/analytics/Analytics;


# direct methods
.method constructor <init>(Lcom/urbanairship/analytics/Analytics;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    invoke-direct {p0}, Lcom/urbanairship/analytics/ActivityMonitor$Listener;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackground()V
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    const/4 v1, 0x1

    # setter for: Lcom/urbanairship/analytics/Analytics;->inBackground:Z
    invoke-static {v0, v1}, Lcom/urbanairship/analytics/Analytics;->access$102(Lcom/urbanairship/analytics/Analytics;Z)Z

    .line 133
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    new-instance v1, Lcom/urbanairship/analytics/AppBackgroundEvent;

    invoke-direct {v1}, Lcom/urbanairship/analytics/AppBackgroundEvent;-><init>()V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 135
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    # invokes: Lcom/urbanairship/analytics/Analytics;->sendBackgroundBroadcast()V
    invoke-static {v0}, Lcom/urbanairship/analytics/Analytics;->access$300(Lcom/urbanairship/analytics/Analytics;)V

    .line 139
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    const/4 v1, 0x0

    # setter for: Lcom/urbanairship/analytics/Analytics;->conversionPushId:Ljava/lang/String;
    invoke-static {v0, v1}, Lcom/urbanairship/analytics/Analytics;->access$402(Lcom/urbanairship/analytics/Analytics;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    return-void
.end method

.method public onForeground()V
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    # invokes: Lcom/urbanairship/analytics/Analytics;->generateNewSessionId()V
    invoke-static {v0}, Lcom/urbanairship/analytics/Analytics;->access$000(Lcom/urbanairship/analytics/Analytics;)V

    .line 124
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    const/4 v1, 0x0

    # setter for: Lcom/urbanairship/analytics/Analytics;->inBackground:Z
    invoke-static {v0, v1}, Lcom/urbanairship/analytics/Analytics;->access$102(Lcom/urbanairship/analytics/Analytics;Z)Z

    .line 125
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    # invokes: Lcom/urbanairship/analytics/Analytics;->sendForegroundBroadcast()V
    invoke-static {v0}, Lcom/urbanairship/analytics/Analytics;->access$200(Lcom/urbanairship/analytics/Analytics;)V

    .line 127
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$1;->this$0:Lcom/urbanairship/analytics/Analytics;

    new-instance v1, Lcom/urbanairship/analytics/AppForegroundEvent;

    invoke-direct {v1}, Lcom/urbanairship/analytics/AppForegroundEvent;-><init>()V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 128
    return-void
.end method
