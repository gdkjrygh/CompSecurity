.class public Lio/fabric/sdk/android/services/concurrency/PriorityTask;
.super Ljava/lang/Object;
.source "PriorityTask.java"

# interfaces
.implements Lio/fabric/sdk/android/services/concurrency/Dependency;
.implements Lio/fabric/sdk/android/services/concurrency/PriorityProvider;
.implements Lio/fabric/sdk/android/services/concurrency/Task;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/concurrency/Dependency",
        "<",
        "Lio/fabric/sdk/android/services/concurrency/Task;",
        ">;",
        "Lio/fabric/sdk/android/services/concurrency/PriorityProvider;",
        "Lio/fabric/sdk/android/services/concurrency/Task;"
    }
.end annotation


# instance fields
.field private final dependencies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">;"
        }
    .end annotation
.end field

.field private final hasRun:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final throwable:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->dependencies:Ljava/util/List;

    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->hasRun:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->throwable:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static isProperDelegate(Ljava/lang/Object;)Z
    .locals 6
    .param p0, "object"    # Ljava/lang/Object;

    .prologue
    const/4 v5, 0x0

    .line 91
    :try_start_0
    move-object v0, p0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-object v1, v0

    .line 92
    .local v1, "dep":Lio/fabric/sdk/android/services/concurrency/Dependency;, "Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;"
    move-object v0, p0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Task;

    move-object v4, v0

    .line 93
    .local v4, "task":Lio/fabric/sdk/android/services/concurrency/Task;
    move-object v0, p0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    move-object v3, v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .local v3, "provider":Lio/fabric/sdk/android/services/concurrency/PriorityProvider;
    if-eqz v1, :cond_0

    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    const/4 v5, 0x1

    .line 98
    .end local v1    # "dep":Lio/fabric/sdk/android/services/concurrency/Dependency;, "Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;"
    .end local v3    # "provider":Lio/fabric/sdk/android/services/concurrency/PriorityProvider;
    .end local v4    # "task":Lio/fabric/sdk/android/services/concurrency/Task;
    :cond_0
    :goto_0
    return v5

    .line 97
    :catch_0
    move-exception v2

    .line 98
    .local v2, "ex":Ljava/lang/ClassCastException;
    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V
    .locals 1
    .param p1, "task"    # Lio/fabric/sdk/android/services/concurrency/Task;

    .prologue
    .line 43
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->dependencies:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit p0

    return-void

    .line 43
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public bridge synthetic addDependency(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 31
    check-cast p1, Lio/fabric/sdk/android/services/concurrency/Task;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V

    return-void
.end method

.method public areDependenciesMet()Z
    .locals 3

    .prologue
    .line 48
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->getDependencies()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/fabric/sdk/android/services/concurrency/Task;

    .line 49
    .local v1, "task":Lio/fabric/sdk/android/services/concurrency/Task;
    invoke-interface {v1}, Lio/fabric/sdk/android/services/concurrency/Task;->isFinished()Z

    move-result v2

    if-nez v2, :cond_0

    .line 50
    const/4 v2, 0x0

    .line 53
    .end local v1    # "task":Lio/fabric/sdk/android/services/concurrency/Task;
    :goto_0
    return v2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 83
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/concurrency/Priority;->compareTo(Lio/fabric/sdk/android/services/concurrency/PriorityProvider;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public declared-synchronized getDependencies()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">;"
        }
    .end annotation

    .prologue
    .line 38
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->dependencies:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getError()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->throwable:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public getPriority()Lio/fabric/sdk/android/services/concurrency/Priority;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->NORMAL:Lio/fabric/sdk/android/services/concurrency/Priority;

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->hasRun:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public setError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 73
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->throwable:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 74
    return-void
.end method

.method public declared-synchronized setFinished(Z)V
    .locals 1
    .param p1, "finished"    # Z

    .prologue
    .line 58
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->hasRun:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit p0

    return-void

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
