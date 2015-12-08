.class Lcom/urbanairship/richpush/RichPushManager$2;
.super Lcom/urbanairship/richpush/RichPushManager$UpdateResultReceiver;
.source "RichPushManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/richpush/RichPushManager;->refreshMessages(ZLcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/richpush/RichPushManager;

.field final synthetic val$callback:Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;

.field final synthetic val$requestNumber:I


# direct methods
.method constructor <init>(Lcom/urbanairship/richpush/RichPushManager;ILcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/urbanairship/richpush/RichPushManager$2;->this$0:Lcom/urbanairship/richpush/RichPushManager;

    iput p2, p0, Lcom/urbanairship/richpush/RichPushManager$2;->val$requestNumber:I

    iput-object p3, p0, Lcom/urbanairship/richpush/RichPushManager$2;->val$callback:Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushManager$UpdateResultReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onUpdate(Z)V
    .locals 3
    .param p1, "success"    # Z

    .prologue
    .line 230
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager$2;->this$0:Lcom/urbanairship/richpush/RichPushManager;

    # getter for: Lcom/urbanairship/richpush/RichPushManager;->refreshMessageRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;
    invoke-static {v0}, Lcom/urbanairship/richpush/RichPushManager;->access$100(Lcom/urbanairship/richpush/RichPushManager;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    iget v1, p0, Lcom/urbanairship/richpush/RichPushManager$2;->val$requestNumber:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager$2;->this$0:Lcom/urbanairship/richpush/RichPushManager;

    # invokes: Lcom/urbanairship/richpush/RichPushManager;->onMessagesUpdate(Z)V
    invoke-static {v0, p1}, Lcom/urbanairship/richpush/RichPushManager;->access$200(Lcom/urbanairship/richpush/RichPushManager;Z)V

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager$2;->val$callback:Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;

    if-eqz v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager$2;->val$callback:Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;

    invoke-interface {v0, p1}, Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;->onRefreshMessages(Z)V

    .line 237
    :cond_1
    return-void
.end method
