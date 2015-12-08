.class Lcom/urbanairship/push/PushManager$1;
.super Ljava/lang/Object;
.source "PushManager.java"

# interfaces
.implements Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/push/PushManager;->refreshRichPushMessages()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/push/PushManager;

.field final synthetic val$semaphore:Ljava/util/concurrent/Semaphore;


# direct methods
.method constructor <init>(Lcom/urbanairship/push/PushManager;Ljava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 761
    iput-object p1, p0, Lcom/urbanairship/push/PushManager$1;->this$0:Lcom/urbanairship/push/PushManager;

    iput-object p2, p0, Lcom/urbanairship/push/PushManager$1;->val$semaphore:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefreshMessages(Z)V
    .locals 1
    .param p1, "success"    # Z

    .prologue
    .line 764
    iget-object v0, p0, Lcom/urbanairship/push/PushManager$1;->val$semaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 765
    return-void
.end method
