.class Lcom/urbanairship/analytics/Analytics$2;
.super Ljava/lang/Object;
.source "Analytics.java"

# interfaces
.implements Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/analytics/Analytics;->registerLifeCycleCallbacks(Landroid/app/Application;)V
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
    .line 160
    iput-object p1, p0, Lcom/urbanairship/analytics/Analytics$2;->this$0:Lcom/urbanairship/analytics/Analytics;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStart(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 169
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$2;->this$0:Lcom/urbanairship/analytics/Analytics;

    new-instance v1, Lcom/urbanairship/analytics/ActivityStartedEvent;

    invoke-direct {v1, p1}, Lcom/urbanairship/analytics/ActivityStartedEvent;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 170
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$2;->this$0:Lcom/urbanairship/analytics/Analytics;

    # getter for: Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;
    invoke-static {v0}, Lcom/urbanairship/analytics/Analytics;->access$500(Lcom/urbanairship/analytics/Analytics;)Lcom/urbanairship/analytics/ActivityMonitor;

    move-result-object v0

    sget-object v1, Lcom/urbanairship/analytics/ActivityMonitor$Source;->AUTO_INSTRUMENTATION:Lcom/urbanairship/analytics/ActivityMonitor$Source;

    invoke-virtual {v0, p1, v1}, Lcom/urbanairship/analytics/ActivityMonitor;->activityStarted(Landroid/app/Activity;Lcom/urbanairship/analytics/ActivityMonitor$Source;)V

    .line 171
    return-void
.end method

.method public onStop(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 163
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$2;->this$0:Lcom/urbanairship/analytics/Analytics;

    new-instance v1, Lcom/urbanairship/analytics/ActivityStoppedEvent;

    invoke-direct {v1, p1}, Lcom/urbanairship/analytics/ActivityStoppedEvent;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V

    .line 164
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$2;->this$0:Lcom/urbanairship/analytics/Analytics;

    # getter for: Lcom/urbanairship/analytics/Analytics;->activityMonitor:Lcom/urbanairship/analytics/ActivityMonitor;
    invoke-static {v0}, Lcom/urbanairship/analytics/Analytics;->access$500(Lcom/urbanairship/analytics/Analytics;)Lcom/urbanairship/analytics/ActivityMonitor;

    move-result-object v0

    sget-object v1, Lcom/urbanairship/analytics/ActivityMonitor$Source;->AUTO_INSTRUMENTATION:Lcom/urbanairship/analytics/ActivityMonitor$Source;

    invoke-virtual {v0, p1, v1}, Lcom/urbanairship/analytics/ActivityMonitor;->activityStopped(Landroid/app/Activity;Lcom/urbanairship/analytics/ActivityMonitor$Source;)V

    .line 165
    return-void
.end method
