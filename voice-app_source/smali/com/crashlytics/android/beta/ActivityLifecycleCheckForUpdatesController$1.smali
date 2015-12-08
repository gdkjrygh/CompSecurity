.class Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1;
.super Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;
.source "ActivityLifecycleCheckForUpdatesController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;)V
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1;->this$0:Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;

    invoke-direct {p0}, Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 21
    iget-object v0, p0, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1;->this$0:Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;

    invoke-virtual {v0}, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;->signalExternallyReady()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1;->this$0:Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;

    # getter for: Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;->executorService:Ljava/util/concurrent/ExecutorService;
    invoke-static {v0}, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;->access$000(Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1$1;

    invoke-direct {v1, p0}, Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1$1;-><init>(Lcom/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 31
    :cond_0
    return-void
.end method
