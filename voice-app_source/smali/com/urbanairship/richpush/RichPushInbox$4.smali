.class Lcom/urbanairship/richpush/RichPushInbox$4;
.super Ljava/lang/Object;
.source "RichPushInbox.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/richpush/RichPushInbox;->notifyListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/richpush/RichPushInbox;


# direct methods
.method constructor <init>(Lcom/urbanairship/richpush/RichPushInbox;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/urbanairship/richpush/RichPushInbox$4;->this$0:Lcom/urbanairship/richpush/RichPushInbox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 349
    iget-object v2, p0, Lcom/urbanairship/richpush/RichPushInbox$4;->this$0:Lcom/urbanairship/richpush/RichPushInbox;

    # getter for: Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;
    invoke-static {v2}, Lcom/urbanairship/richpush/RichPushInbox;->access$100(Lcom/urbanairship/richpush/RichPushInbox;)Ljava/util/List;

    move-result-object v3

    monitor-enter v3

    .line 350
    :try_start_0
    iget-object v2, p0, Lcom/urbanairship/richpush/RichPushInbox$4;->this$0:Lcom/urbanairship/richpush/RichPushInbox;

    # getter for: Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;
    invoke-static {v2}, Lcom/urbanairship/richpush/RichPushInbox;->access$100(Lcom/urbanairship/richpush/RichPushInbox;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/urbanairship/richpush/RichPushInbox$Listener;

    .line 351
    .local v1, "listener":Lcom/urbanairship/richpush/RichPushInbox$Listener;
    invoke-interface {v1}, Lcom/urbanairship/richpush/RichPushInbox$Listener;->onUpdateInbox()V

    goto :goto_0

    .line 353
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "listener":Lcom/urbanairship/richpush/RichPushInbox$Listener;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_0
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    return-void
.end method
