.class Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor$1;
.super Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;
.source "PriorityAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask",
        "<TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0
    .param p2, "x0"    # Ljava/lang/Runnable;

    .prologue
    .line 114
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor$1;, "Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor.1;"
    .local p3, "x1":Ljava/lang/Object;, "TResult;"
    iput-object p1, p0, Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor$1;->this$0:Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;

    invoke-direct {p0, p2, p3}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lio/fabric/sdk/android/services/concurrency/Dependency",
            "<",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">;:",
            "Lio/fabric/sdk/android/services/concurrency/PriorityProvider;",
            ":",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 119
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor$1;, "Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor.1;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor$1;->this$0:Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;

    # getter for: Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;->task:Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask;
    invoke-static {v0}, Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;->access$000(Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;)Lio/fabric/sdk/android/services/concurrency/PriorityAsyncTask;

    move-result-object v0

    return-object v0
.end method
