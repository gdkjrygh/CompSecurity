.class final Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;
.super Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Sync"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;"
    }
.end annotation


# static fields
.field static final CANCELLED:I = 0x4

.field static final COMPLETED:I = 0x2

.field static final COMPLETING:I = 0x1

.field static final INTERRUPTED:I = 0x8

.field static final RUNNING:I

.field private static final serialVersionUID:J


# instance fields
.field private exception:Ljava/lang/Throwable;

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 217
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-direct {p0}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;-><init>()V

    return-void
.end method

.method private complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z
    .locals 3
    .param p2, "t"    # Ljava/lang/Throwable;
    .param p3, "finalState"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/Throwable;",
            "I)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    .local p1, "v":Ljava/lang/Object;, "TV;"
    const/4 v2, 0x1

    .line 363
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v2}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->compareAndSetState(II)Z

    move-result v0

    .line 364
    .local v0, "doCompletion":Z
    if-eqz v0, :cond_2

    .line 367
    iput-object p1, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->value:Ljava/lang/Object;

    .line 369
    and-int/lit8 v1, p3, 0xc

    if-eqz v1, :cond_0

    new-instance p2, Ljava/util/concurrent/CancellationException;

    .end local p2    # "t":Ljava/lang/Throwable;
    const-string v1, "Future.cancel() was called."

    invoke-direct {p2, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    iput-object p2, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    .line 371
    invoke-virtual {p0, p3}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->releaseShared(I)Z

    .line 377
    :cond_1
    :goto_0
    return v0

    .line 372
    .restart local p2    # "t":Ljava/lang/Throwable;
    :cond_2
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v1

    if-ne v1, v2, :cond_1

    .line 375
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->acquireShared(I)V

    goto :goto_0
.end method

.method private getValue()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/CancellationException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .prologue
    .line 286
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    .line 287
    .local v0, "state":I
    sparse-switch v0, :sswitch_data_0

    .line 301
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error, synchronizer in invalid state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 289
    :sswitch_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    .line 290
    new-instance v1, Ljava/util/concurrent/ExecutionException;

    iget-object v2, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    invoke-direct {v1, v2}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 292
    :cond_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->value:Ljava/lang/Object;

    return-object v1

    .line 297
    :sswitch_1
    const-string v1, "Task was cancelled."

    iget-object v2, p0, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->exception:Ljava/lang/Throwable;

    invoke-static {v1, v2}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture;->cancellationExceptionWithCause(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v1

    throw v1

    .line 287
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method cancel(Z)Z
    .locals 2
    .param p1, "interrupt"    # Z

    .prologue
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    const/4 v1, 0x0

    .line 346
    if-eqz p1, :cond_0

    const/16 v0, 0x8

    :goto_0
    invoke-direct {p0, v1, v1, v0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x4

    goto :goto_0
.end method

.method get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/CancellationException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 276
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->acquireSharedInterruptibly(I)V

    .line 277
    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method get(J)Ljava/lang/Object;
    .locals 3
    .param p1, "nanos"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/TimeoutException;,
            Ljava/util/concurrent/CancellationException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 259
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1, p2}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->tryAcquireSharedNanos(IJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "Timeout waiting for task."

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_0
    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method isCancelled()Z
    .locals 1

    .prologue
    .line 318
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    and-int/lit8 v0, v0, 0xc

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method isDone()Z
    .locals 1

    .prologue
    .line 311
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    and-int/lit8 v0, v0, 0xe

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method set(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .prologue
    .line 332
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    .local p1, "v":Ljava/lang/Object;, "TV;"
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z

    move-result v0

    return v0
.end method

.method setException(Ljava/lang/Throwable;)Z
    .locals 2
    .param p1, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 339
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, v0, p1, v1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->complete(Ljava/lang/Object;Ljava/lang/Throwable;I)Z

    move-result v0

    return v0
.end method

.method protected tryAcquireShared(I)I
    .locals 1
    .param p1, "ignored"    # I

    .prologue
    .line 234
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    const/4 v0, 0x1

    .line 237
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method protected tryReleaseShared(I)Z
    .locals 1
    .param p1, "finalState"    # I

    .prologue
    .line 246
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->setState(I)V

    .line 247
    const/4 v0, 0x1

    return v0
.end method

.method wasInterrupted()Z
    .locals 2

    .prologue
    .line 325
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;, "Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync<TV;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;->getState()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
