.class Lcom/urbanairship/analytics/LifeCycleCallbacks;
.super Ljava/lang/Object;
.source "LifeCycleCallbacks.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public static registerCallback(Landroid/app/Application;Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;)V
    .locals 1
    .param p0, "application"    # Landroid/app/Application;
    .param p1, "callback"    # Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;

    .prologue
    .line 32
    new-instance v0, Lcom/urbanairship/analytics/LifeCycleCallbacks$1;

    invoke-direct {v0, p1}, Lcom/urbanairship/analytics/LifeCycleCallbacks$1;-><init>(Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;)V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 58
    return-void
.end method
