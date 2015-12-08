.class public Lbolts/Task$TaskCompletionSource;
.super Ljava/lang/Object;
.source "Task.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TaskCompletionSource"
.end annotation


# instance fields
.field final synthetic this$0:Lbolts/Task;


# direct methods
.method private constructor <init>(Lbolts/Task;)V
    .locals 0

    .prologue
    .line 850
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    iput-object p1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 851
    return-void
.end method

.method synthetic constructor <init>(Lbolts/Task;Lbolts/Task$1;)V
    .locals 0
    .param p1, "x0"    # Lbolts/Task;
    .param p2, "x1"    # Lbolts/Task$1;

    .prologue
    .line 849
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    invoke-direct {p0, p1}, Lbolts/Task$TaskCompletionSource;-><init>(Lbolts/Task;)V

    return-void
.end method


# virtual methods
.method public getTask()Lbolts/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbolts/Task",
            "<TTResult;>;"
        }
    .end annotation

    .prologue
    .line 857
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    iget-object v0, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    return-object v0
.end method

.method public setCancelled()V
    .locals 2

    .prologue
    .line 912
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    invoke-virtual {p0}, Lbolts/Task$TaskCompletionSource;->trySetCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 913
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot cancel a completed task."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 915
    :cond_0
    return-void
.end method

.method public setError(Ljava/lang/Exception;)V
    .locals 2
    .param p1, "error"    # Ljava/lang/Exception;

    .prologue
    .line 930
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    invoke-virtual {p0, p1}, Lbolts/Task$TaskCompletionSource;->trySetError(Ljava/lang/Exception;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 931
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set the error on a completed task."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 933
    :cond_0
    return-void
.end method

.method public setResult(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    .prologue
    .line 921
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    .local p1, "result":Ljava/lang/Object;, "TTResult;"
    invoke-virtual {p0, p1}, Lbolts/Task$TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 922
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set the result of a completed task."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 924
    :cond_0
    return-void
.end method

.method public trySetCancelled()Z
    .locals 4

    .prologue
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    const/4 v0, 0x1

    .line 864
    iget-object v1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->lock:Ljava/lang/Object;
    invoke-static {v1}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 865
    :try_start_0
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->complete:Z
    invoke-static {v2}, Lbolts/Task;->access$400(Lbolts/Task;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 866
    const/4 v0, 0x0

    monitor-exit v1

    .line 872
    :goto_0
    return v0

    .line 868
    :cond_0
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    const/4 v3, 0x1

    # setter for: Lbolts/Task;->complete:Z
    invoke-static {v2, v3}, Lbolts/Task;->access$402(Lbolts/Task;Z)Z

    .line 869
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    const/4 v3, 0x1

    # setter for: Lbolts/Task;->cancelled:Z
    invoke-static {v2, v3}, Lbolts/Task;->access$502(Lbolts/Task;Z)Z

    .line 870
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->lock:Ljava/lang/Object;
    invoke-static {v2}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 871
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # invokes: Lbolts/Task;->runContinuations()V
    invoke-static {v2}, Lbolts/Task;->access$600(Lbolts/Task;)V

    .line 872
    monitor-exit v1

    goto :goto_0

    .line 873
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public trySetError(Ljava/lang/Exception;)Z
    .locals 4
    .param p1, "error"    # Ljava/lang/Exception;

    .prologue
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    const/4 v0, 0x1

    .line 896
    iget-object v1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->lock:Ljava/lang/Object;
    invoke-static {v1}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 897
    :try_start_0
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->complete:Z
    invoke-static {v2}, Lbolts/Task;->access$400(Lbolts/Task;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 898
    const/4 v0, 0x0

    monitor-exit v1

    .line 904
    :goto_0
    return v0

    .line 900
    :cond_0
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    const/4 v3, 0x1

    # setter for: Lbolts/Task;->complete:Z
    invoke-static {v2, v3}, Lbolts/Task;->access$402(Lbolts/Task;Z)Z

    .line 901
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # setter for: Lbolts/Task;->error:Ljava/lang/Exception;
    invoke-static {v2, p1}, Lbolts/Task;->access$802(Lbolts/Task;Ljava/lang/Exception;)Ljava/lang/Exception;

    .line 902
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->lock:Ljava/lang/Object;
    invoke-static {v2}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 903
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # invokes: Lbolts/Task;->runContinuations()V
    invoke-static {v2}, Lbolts/Task;->access$600(Lbolts/Task;)V

    .line 904
    monitor-exit v1

    goto :goto_0

    .line 905
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public trySetResult(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<TTResult;>.TaskCompletionSource;"
    .local p1, "result":Ljava/lang/Object;, "TTResult;"
    const/4 v0, 0x1

    .line 880
    iget-object v1, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->lock:Ljava/lang/Object;
    invoke-static {v1}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 881
    :try_start_0
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->complete:Z
    invoke-static {v2}, Lbolts/Task;->access$400(Lbolts/Task;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 882
    const/4 v0, 0x0

    monitor-exit v1

    .line 888
    :goto_0
    return v0

    .line 884
    :cond_0
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    const/4 v3, 0x1

    # setter for: Lbolts/Task;->complete:Z
    invoke-static {v2, v3}, Lbolts/Task;->access$402(Lbolts/Task;Z)Z

    .line 885
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # setter for: Lbolts/Task;->result:Ljava/lang/Object;
    invoke-static {v2, p1}, Lbolts/Task;->access$702(Lbolts/Task;Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # getter for: Lbolts/Task;->lock:Ljava/lang/Object;
    invoke-static {v2}, Lbolts/Task;->access$300(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 887
    iget-object v2, p0, Lbolts/Task$TaskCompletionSource;->this$0:Lbolts/Task;

    # invokes: Lbolts/Task;->runContinuations()V
    invoke-static {v2}, Lbolts/Task;->access$600(Lbolts/Task;)V

    .line 888
    monitor-exit v1

    goto :goto_0

    .line 889
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
