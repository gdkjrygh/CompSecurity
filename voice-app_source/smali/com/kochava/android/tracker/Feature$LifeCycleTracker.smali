.class public Lcom/kochava/android/tracker/Feature$LifeCycleTracker;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "LifeCycleTracker"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method protected constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 3442
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$LifeCycleTracker;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 3485
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 3480
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 3472
    const-string v0, "LifeCycleTracker - Tracking Activity lost focus"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3473
    const-string v0, "is_in_background"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->changeStatus(Ljava/lang/String;)V

    .line 3474
    const/4 v0, 0x1

    # setter for: Lcom/kochava/android/tracker/Feature;->is_in_background:Z
    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->access$3002(Z)Z

    .line 3475
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 3465
    const-string v0, "LifeCycleTracker - Tracking Activity Resumed"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3466
    const-string v0, "is_focused"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->changeStatus(Ljava/lang/String;)V

    .line 3467
    const/4 v0, 0x0

    # setter for: Lcom/kochava/android/tracker/Feature;->is_in_background:Z
    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->access$3002(Z)Z

    .line 3468
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 3461
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 3456
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 3450
    return-void
.end method
