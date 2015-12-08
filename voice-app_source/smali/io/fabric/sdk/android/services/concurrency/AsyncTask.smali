.class public abstract Lio/fabric/sdk/android/services/concurrency/AsyncTask;
.super Ljava/lang/Object;
.source "AsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/concurrency/AsyncTask$4;,
        Lio/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;,
        Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;,
        Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;,
        Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;,
        Lio/fabric/sdk/android/services/concurrency/AsyncTask$SerialExecutor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final CORE_POOL_SIZE:I

.field private static final CPU_COUNT:I

.field private static final KEEP_ALIVE:I = 0x1

.field private static final LOG_TAG:Ljava/lang/String; = "AsyncTask"

.field private static final MAXIMUM_POOL_SIZE:I

.field private static final MESSAGE_POST_PROGRESS:I = 0x2

.field private static final MESSAGE_POST_RESULT:I = 0x1

.field public static final SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

.field public static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static volatile defaultExecutor:Ljava/util/concurrent/Executor;

.field private static final handler:Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;

.field private static final poolWorkQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final threadFactory:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private final cancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final future:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<TResult;>;"
        }
    .end annotation
.end field

.field private volatile status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

.field private final taskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final worker:Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable",
            "<TParams;TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 203
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->CPU_COUNT:I

    .line 204
    sget v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->CPU_COUNT:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->CORE_POOL_SIZE:I

    .line 205
    sget v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->CPU_COUNT:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->MAXIMUM_POOL_SIZE:I

    .line 208
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$1;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$1;-><init>()V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->threadFactory:Ljava/util/concurrent/ThreadFactory;

    .line 216
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->poolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    .line 222
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->CORE_POOL_SIZE:I

    sget v3, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->MAXIMUM_POOL_SIZE:I

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->poolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->threadFactory:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 230
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$SerialExecutor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$SerialExecutor;-><init>(Lio/fabric/sdk/android/services/concurrency/AsyncTask$1;)V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 235
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;-><init>()V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->handler:Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;

    .line 237
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->defaultExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 304
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;->PENDING:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    .line 243
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->cancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 244
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->taskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 305
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$2;

    invoke-direct {v0, p0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$2;-><init>(Lio/fabric/sdk/android/services/concurrency/AsyncTask;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->worker:Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;

    .line 315
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$3;

    iget-object v1, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->worker:Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$3;-><init>(Lio/fabric/sdk/android/services/concurrency/AsyncTask;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->future:Ljava/util/concurrent/FutureTask;

    .line 330
    return-void
.end method

.method static synthetic access$200(Lio/fabric/sdk/android/services/concurrency/AsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1
    .param p0, "x0"    # Lio/fabric/sdk/android/services/concurrency/AsyncTask;

    .prologue
    .line 200
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->taskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$300(Lio/fabric/sdk/android/services/concurrency/AsyncTask;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lio/fabric/sdk/android/services/concurrency/AsyncTask;
    .param p1, "x1"    # Ljava/lang/Object;

    .prologue
    .line 200
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lio/fabric/sdk/android/services/concurrency/AsyncTask;Ljava/lang/Object;)V
    .locals 0
    .param p0, "x0"    # Lio/fabric/sdk/android/services/concurrency/AsyncTask;
    .param p1, "x1"    # Ljava/lang/Object;

    .prologue
    .line 200
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->postResultIfNotInvoked(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$500(Lio/fabric/sdk/android/services/concurrency/AsyncTask;Ljava/lang/Object;)V
    .locals 0
    .param p0, "x0"    # Lio/fabric/sdk/android/services/concurrency/AsyncTask;
    .param p1, "x1"    # Ljava/lang/Object;

    .prologue
    .line 200
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->finish(Ljava/lang/Object;)V

    return-void
.end method

.method public static execute(Ljava/lang/Runnable;)V
    .locals 1
    .param p0, "runnable"    # Ljava/lang/Runnable;

    .prologue
    .line 628
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->defaultExecutor:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 629
    return-void
.end method

.method private finish(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 653
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "result":Ljava/lang/Object;, "TResult;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 654
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    .line 658
    :goto_0
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;->FINISHED:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    .line 659
    return-void

    .line 656
    :cond_0
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static init()V
    .locals 1

    .prologue
    .line 293
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->handler:Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;->getLooper()Landroid/os/Looper;

    .line 294
    return-void
.end method

.method private postResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)TResult;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "result":Ljava/lang/Object;, "TResult;"
    const/4 v5, 0x1

    .line 341
    sget-object v1, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->handler:Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;

    new-instance v2, Lio/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;

    new-array v3, v5, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-direct {v2, p0, v3}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;-><init>(Lio/fabric/sdk/android/services/concurrency/AsyncTask;[Ljava/lang/Object;)V

    invoke-virtual {v1, v5, v2}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 343
    .local v0, "message":Landroid/os/Message;
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 344
    return-object p1
.end method

.method private postResultIfNotInvoked(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 333
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "result":Ljava/lang/Object;, "TResult;"
    iget-object v1, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->taskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 334
    .local v0, "wasTaskInvoked":Z
    if-nez v0, :cond_0

    .line 335
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    :cond_0
    return-void
.end method

.method public static setDefaultExecutor(Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p0, "exec"    # Ljava/util/concurrent/Executor;

    .prologue
    .line 298
    sput-object p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->defaultExecutor:Ljava/util/concurrent/Executor;

    .line 299
    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 2
    .param p1, "mayInterruptIfRunning"    # Z

    .prologue
    .line 490
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->cancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 491
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->future:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result v0

    return v0
.end method

.method protected varargs abstract doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation
.end method

.method public final varargs execute([Ljava/lang/Object;)Lio/fabric/sdk/android/services/concurrency/AsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)",
            "Lio/fabric/sdk/android/services/concurrency/AsyncTask",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 558
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "params":[Ljava/lang/Object;, "[TParams;"
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->defaultExecutor:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lio/fabric/sdk/android/services/concurrency/AsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public final varargs executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lio/fabric/sdk/android/services/concurrency/AsyncTask;
    .locals 2
    .param p1, "exec"    # Ljava/util/concurrent/Executor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "Lio/fabric/sdk/android/services/concurrency/AsyncTask",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 596
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p2, "params":[Ljava/lang/Object;, "[TParams;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    sget-object v1, Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;->PENDING:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 597
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$4;->$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status:[I

    iget-object v1, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 609
    :cond_0
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;->RUNNING:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    iput-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    .line 611
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->onPreExecute()V

    .line 613
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->worker:Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;

    iput-object p2, v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;->params:[Ljava/lang/Object;

    .line 614
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->future:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 616
    return-object p0

    .line 599
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 602
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 597
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .prologue
    .line 506
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->future:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .param p1, "timeout"    # J
    .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .prologue
    .line 526
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->future:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getStatus()Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;
    .locals 1

    .prologue
    .line 353
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->status:Lio/fabric/sdk/android/services/concurrency/AsyncTask$Status;

    return-object v0
.end method

.method public final isCancelled()Z
    .locals 1

    .prologue
    .line 457
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->cancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method protected onCancelled()V
    .locals 0

    .prologue
    .line 444
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    return-void
.end method

.method protected onCancelled(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 428
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "result":Ljava/lang/Object;, "TResult;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->onCancelled()V

    .line 429
    return-void
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 397
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "result":Ljava/lang/Object;, "TResult;"
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 381
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 410
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "values":[Ljava/lang/Object;, "[TProgress;"
    return-void
.end method

.method protected final varargs publishProgress([Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 646
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask<TParams;TProgress;TResult;>;"
    .local p1, "values":[Ljava/lang/Object;, "[TProgress;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 647
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/AsyncTask;->handler:Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;

    const/4 v1, 0x2

    new-instance v2, Lio/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;

    invoke-direct {v2, p0, p1}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;-><init>(Lio/fabric/sdk/android/services/concurrency/AsyncTask;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 650
    :cond_0
    return-void
.end method
