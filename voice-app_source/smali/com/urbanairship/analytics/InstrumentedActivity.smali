.class public Lcom/urbanairship/analytics/InstrumentedActivity;
.super Landroid/app/Activity;
.source "InstrumentedActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 44
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    invoke-virtual {p0}, Lcom/urbanairship/analytics/InstrumentedActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 46
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 51
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/urbanairship/analytics/Analytics;->activityStarted(Landroid/app/Activity;)V

    .line 52
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 56
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 57
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/urbanairship/analytics/Analytics;->activityStopped(Landroid/app/Activity;)V

    .line 58
    return-void
.end method
