.class Lcom/kochava/android/tracker/Feature$10;
.super Landroid/os/Handler;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->initHandler()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 2437
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 2444
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "sendonstart"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 2446
    .local v0, "sendOnStart":Z
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    # invokes: Lcom/kochava/android/tracker/Feature;->initialHandlerActions()V
    invoke-static {v1}, Lcom/kochava/android/tracker/Feature;->access$3300(Lcom/kochava/android/tracker/Feature;)V

    .line 2448
    if-nez v0, :cond_0

    .line 2450
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    # getter for: Lcom/kochava/android/tracker/Feature;->initTimer:Ljava/util/Timer;
    invoke-static {v1}, Lcom/kochava/android/tracker/Feature;->access$3500(Lcom/kochava/android/tracker/Feature;)Ljava/util/Timer;

    move-result-object v1

    new-instance v2, Lcom/kochava/android/tracker/Feature$10$1;

    invoke-direct {v2, p0}, Lcom/kochava/android/tracker/Feature$10$1;-><init>(Lcom/kochava/android/tracker/Feature$10;)V

    const-wide/32 v4, 0x927c0

    invoke-virtual {v1, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 2480
    :goto_0
    return-void

    .line 2462
    :cond_0
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    # getter for: Lcom/kochava/android/tracker/Feature;->initTimer:Ljava/util/Timer;
    invoke-static {v1}, Lcom/kochava/android/tracker/Feature;->access$3500(Lcom/kochava/android/tracker/Feature;)Ljava/util/Timer;

    move-result-object v1

    new-instance v2, Lcom/kochava/android/tracker/Feature$10$2;

    invoke-direct {v2, p0}, Lcom/kochava/android/tracker/Feature$10$2;-><init>(Lcom/kochava/android/tracker/Feature$10;)V

    const-wide/16 v4, 0x7d0

    invoke-virtual {v1, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 2472
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    # setter for: Lcom/kochava/android/tracker/Feature;->mTimerSendOnBegin:Ljava/util/Timer;
    invoke-static {v1, v2}, Lcom/kochava/android/tracker/Feature;->access$3602(Lcom/kochava/android/tracker/Feature;Ljava/util/Timer;)Ljava/util/Timer;

    .line 2473
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    # getter for: Lcom/kochava/android/tracker/Feature;->mTimerSendOnBegin:Ljava/util/Timer;
    invoke-static {v1}, Lcom/kochava/android/tracker/Feature;->access$3600(Lcom/kochava/android/tracker/Feature;)Ljava/util/Timer;

    move-result-object v1

    new-instance v2, Lcom/kochava/android/tracker/Feature$10$3;

    invoke-direct {v2, p0}, Lcom/kochava/android/tracker/Feature$10$3;-><init>(Lcom/kochava/android/tracker/Feature$10;)V

    const-wide/16 v4, 0xfa0

    invoke-virtual {v1, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_0
.end method
