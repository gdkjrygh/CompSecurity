.class public Lcom/comscore/utils/task/TaskExecutor;
.super Ljava/lang/Object;


# static fields
.field private static final b:I = 0x1

.field private static final c:I = 0x1

.field private static final d:J = 0x4e20L


# instance fields
.field a:Lcom/comscore/analytics/Core;

.field private e:Ljava/util/concurrent/BlockingQueue;

.field private f:Lcom/comscore/utils/task/CustomThreadPoolExecutor;


# direct methods
.method public constructor <init>(Lcom/comscore/analytics/Core;)V
    .locals 8

    const/4 v2, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/comscore/utils/task/TaskExecutor;->e:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lcom/comscore/utils/task/CustomThreadPoolExecutor;

    const-wide/16 v4, 0x4e20

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v7, p0, Lcom/comscore/utils/task/TaskExecutor;->e:Ljava/util/concurrent/BlockingQueue;

    move v3, v2

    invoke-direct/range {v1 .. v7}, Lcom/comscore/utils/task/CustomThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/comscore/utils/task/TaskExecutor;->f:Lcom/comscore/utils/task/CustomThreadPoolExecutor;

    iput-object p1, p0, Lcom/comscore/utils/task/TaskExecutor;->a:Lcom/comscore/analytics/Core;

    return-void
.end method

.method private a(Lcom/comscore/utils/task/CustomThreadPoolExecutor;)V
    .locals 2

    :goto_0
    invoke-virtual {p1}, Lcom/comscore/utils/task/CustomThreadPoolExecutor;->getTasksRunning()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/comscore/utils/task/CustomThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x64

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/task/TaskExecutor;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V

    return-void
.end method

.method public execute(Ljava/lang/Runnable;Z)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/comscore/utils/task/TaskExecutor;->f:Lcom/comscore/utils/task/CustomThreadPoolExecutor;

    invoke-virtual {v1, p1}, Lcom/comscore/utils/task/CustomThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    sget-boolean v1, Lcom/comscore/utils/Constants;->DEBUG:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Unable to queue a task: "

    invoke-static {v1, v2}, Lcom/comscore/utils/CSLog;->e(Ljava/lang/Class;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/comscore/utils/CSLog;->printStackTrace(Ljava/lang/Exception;)V

    throw v0

    :catch_1
    move-exception v0

    sget-boolean v1, Lcom/comscore/utils/Constants;->DEBUG:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Unexpected null error: "

    invoke-static {v1, v2}, Lcom/comscore/utils/CSLog;->e(Ljava/lang/Class;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/comscore/utils/CSLog;->printStackTrace(Ljava/lang/Exception;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public waitForTasks()V
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/task/TaskExecutor;->f:Lcom/comscore/utils/task/CustomThreadPoolExecutor;

    invoke-direct {p0, v0}, Lcom/comscore/utils/task/TaskExecutor;->a(Lcom/comscore/utils/task/CustomThreadPoolExecutor;)V

    return-void
.end method
