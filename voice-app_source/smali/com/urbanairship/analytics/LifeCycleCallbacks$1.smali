.class final Lcom/urbanairship/analytics/LifeCycleCallbacks$1;
.super Ljava/lang/Object;
.source "LifeCycleCallbacks.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/analytics/LifeCycleCallbacks;->registerCallback(Landroid/app/Application;Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;


# direct methods
.method constructor <init>(Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/urbanairship/analytics/LifeCycleCallbacks$1;->val$callback:Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 41
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 44
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 35
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 38
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 47
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 51
    iget-object v0, p0, Lcom/urbanairship/analytics/LifeCycleCallbacks$1;->val$callback:Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;

    invoke-interface {v0, p1}, Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;->onStart(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 55
    iget-object v0, p0, Lcom/urbanairship/analytics/LifeCycleCallbacks$1;->val$callback:Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;

    invoke-interface {v0, p1}, Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;->onStop(Landroid/app/Activity;)V

    return-void
.end method
