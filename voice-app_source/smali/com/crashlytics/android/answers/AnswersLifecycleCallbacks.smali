.class Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;
.super Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;
.source "AnswersLifecycleCallbacks.java"


# instance fields
.field private final analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/answers/SessionAnalyticsManager;)V
    .locals 0
    .param p1, "analyticsManager"    # Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    .prologue
    .line 12
    invoke-direct {p0}, Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    .line 14
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 18
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->CREATE:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 19
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 49
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->DESTROY:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 50
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 33
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->PAUSE:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 34
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 28
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->RESUME:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 29
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->SAVE_INSTANCE_STATE:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 45
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 23
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->START:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 24
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 38
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->STOP:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onLifecycle(Landroid/app/Activity;Lcom/crashlytics/android/answers/SessionEvent$Type;)V

    .line 39
    return-void
.end method
