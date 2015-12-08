.class Lcom/kochava/android/tracker/Feature$10$2;
.super Ljava/util/TimerTask;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature$10;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/kochava/android/tracker/Feature$10;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature$10;)V
    .locals 0
    .param p1, "this$1"    # Lcom/kochava/android/tracker/Feature$10;

    .prologue
    .line 2463
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$10$2;->this$1:Lcom/kochava/android/tracker/Feature$10;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2467
    const-string v0, "Scheduling timer to que initial event if needed."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2468
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$10$2;->this$1:Lcom/kochava/android/tracker/Feature$10;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$10;->this$0:Lcom/kochava/android/tracker/Feature;

    const/4 v1, 0x0

    # invokes: Lcom/kochava/android/tracker/Feature;->queInitial(Z)V
    invoke-static {v0, v1}, Lcom/kochava/android/tracker/Feature;->access$3400(Lcom/kochava/android/tracker/Feature;Z)V

    .line 2469
    return-void
.end method
