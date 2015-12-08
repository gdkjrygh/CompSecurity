.class public Lcom/comscore/utils/CacheFlusher;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Lcom/comscore/analytics/Core;

.field protected b:Landroid/os/Handler;

.field protected c:Z

.field protected d:J


# direct methods
.method public constructor <init>(Lcom/comscore/analytics/Core;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/utils/CacheFlusher;->d:J

    iput-object p1, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getStorage()Lcom/comscore/utils/Storage;

    move-result-object v0

    const-string v1, "plannedFlushTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->has(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getStorage()Lcom/comscore/utils/Storage;

    move-result-object v0

    const-string v1, "plannedFlushTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/utils/CacheFlusher;->d:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected a(J)V
    .locals 3

    iput-wide p1, p0, Lcom/comscore/utils/CacheFlusher;->d:J

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getStorage()Lcom/comscore/utils/Storage;

    move-result-object v0

    const-string v1, "plannedFlushTime"

    const/16 v2, 0xa

    invoke-static {p1, p2, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected b()V
    .locals 6

    iget-wide v0, p0, Lcom/comscore/utils/CacheFlusher;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v2}, Lcom/comscore/analytics/Core;->getCacheFlushingInterval()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/comscore/utils/CacheFlusher;->a(J)V

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/comscore/utils/CacheFlusher;->d:J

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected declared-synchronized c()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getCacheFlushingInterval()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v2}, Lcom/comscore/analytics/Core;->getCacheFlushingInterval()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/comscore/utils/CacheFlusher;->a(J)V

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    const-wide/16 v0, -0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected d()V
    .locals 2

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CacheFlusher"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->a()V

    return-void
.end method

.method protected e()V
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public declared-synchronized run()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "run(): Flushing the cache"

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->flush(Z)V

    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/comscore/utils/CacheFlusher;->a(J)V

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized start()V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "start()"

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/comscore/utils/CacheFlusher;->c:Z

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getCacheFlushingInterval()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getCustomerC2()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->d()V

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized stop()V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "stop()"

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/comscore/utils/CacheFlusher;->c:Z

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized update()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getCacheFlushingInterval()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getCustomerC2()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/comscore/utils/CacheFlusher;->c:Z

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/comscore/utils/CacheFlusher;->a(J)V

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/comscore/utils/CacheFlusher;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    const-wide/16 v0, -0x1

    :try_start_2
    invoke-virtual {p0, v0, v1}, Lcom/comscore/utils/CacheFlusher;->a(J)V

    invoke-virtual {p0}, Lcom/comscore/utils/CacheFlusher;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method
