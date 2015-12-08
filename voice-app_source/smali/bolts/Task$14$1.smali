.class Lbolts/Task$14$1;
.super Ljava/lang/Object;
.source "Task.java"

# interfaces
.implements Lbolts/Continuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/Task$14;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/Continuation",
        "<TTContinuationResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbolts/Task$14;


# direct methods
.method constructor <init>(Lbolts/Task$14;)V
    .locals 0

    .prologue
    .line 800
    iput-object p1, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic then(Lbolts/Task;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lbolts/Task;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 800
    invoke-virtual {p0, p1}, Lbolts/Task$14$1;->then(Lbolts/Task;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public then(Lbolts/Task;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbolts/Task",
            "<TTContinuationResult;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .prologue
    .local p1, "task":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    const/4 v2, 0x0

    .line 803
    iget-object v0, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    iget-object v0, v0, Lbolts/Task$14;->val$ct:Lbolts/CancellationToken;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    iget-object v0, v0, Lbolts/Task$14;->val$ct:Lbolts/CancellationToken;

    invoke-virtual {v0}, Lbolts/CancellationToken;->isCancellationRequested()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 804
    iget-object v0, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    iget-object v0, v0, Lbolts/Task$14;->val$tcs:Lbolts/Task$TaskCompletionSource;

    invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->setCancelled()V

    .line 815
    :goto_0
    return-object v2

    .line 808
    :cond_0
    invoke-virtual {p1}, Lbolts/Task;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 809
    iget-object v0, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    iget-object v0, v0, Lbolts/Task$14;->val$tcs:Lbolts/Task$TaskCompletionSource;

    invoke-virtual {v0}, Lbolts/Task$TaskCompletionSource;->setCancelled()V

    goto :goto_0

    .line 810
    :cond_1
    invoke-virtual {p1}, Lbolts/Task;->isFaulted()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 811
    iget-object v0, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    iget-object v0, v0, Lbolts/Task$14;->val$tcs:Lbolts/Task$TaskCompletionSource;

    invoke-virtual {p1}, Lbolts/Task;->getError()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V

    goto :goto_0

    .line 813
    :cond_2
    iget-object v0, p0, Lbolts/Task$14$1;->this$0:Lbolts/Task$14;

    iget-object v0, v0, Lbolts/Task$14;->val$tcs:Lbolts/Task$TaskCompletionSource;

    invoke-virtual {p1}, Lbolts/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method
