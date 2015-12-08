.class public abstract Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;
.super Ljava/lang/Object;
.source "EnabledEventsStrategy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/events/EventsStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/events/EventsStrategy",
        "<TT;>;"
    }
.end annotation


# static fields
.field static final UNDEFINED_ROLLOVER_INTERVAL_SECONDS:I = -0x1


# instance fields
.field protected final context:Landroid/content/Context;

.field final executorService:Ljava/util/concurrent/ScheduledExecutorService;

.field protected final filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/services/events/EventsFilesManager",
            "<TT;>;"
        }
    .end annotation
.end field

.field volatile rolloverIntervalSeconds:I

.field final scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lio/fabric/sdk/android/services/events/EventsFilesManager;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "executorService"    # Ljava/util/concurrent/ScheduledExecutorService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lio/fabric/sdk/android/services/events/EventsFilesManager",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 49
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    .local p3, "filesManager":Lio/fabric/sdk/android/services/events/EventsFilesManager;, "Lio/fabric/sdk/android/services/events/EventsFilesManager<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    .line 50
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 52
    iput-object p3, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    .line 53
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 54
    return-void
.end method


# virtual methods
.method public cancelTimeBasedFileRollOver()V
    .locals 2

    .prologue
    .line 72
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    const-string v1, "Cancelling time-based rollover because no events are currently being generated."

    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 77
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 79
    :cond_0
    return-void
.end method

.method protected configureRollover(I)V
    .locals 4
    .param p1, "rolloverIntervalSeconds"    # I

    .prologue
    .line 108
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    iput p1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    .line 109
    const-wide/16 v0, 0x0

    iget v2, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    int-to-long v2, v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduleTimeBasedFileRollOver(JJ)V

    .line 110
    return-void
.end method

.method public deleteAllEvents()V
    .locals 1

    .prologue
    .line 83
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->deleteAllEventsFiles()V

    .line 84
    return-void
.end method

.method public getRollover()I
    .locals 1

    .prologue
    .line 113
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    iget v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    return v0
.end method

.method public recordEvent(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 88
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    .local p1, "event":Ljava/lang/Object;, "TT;"
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 90
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v1, p1}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->writeEvent(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :goto_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduleTimeBasedRollOverIfNeeded()V

    .line 95
    return-void

    .line 91
    :catch_0
    move-exception v0

    .line 92
    .local v0, "e":Ljava/io/IOException;
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    const-string v2, "Failed to write event."

    invoke-static {v1, v2, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public rollFileOver()Z
    .locals 3

    .prologue
    .line 100
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->rollFileOver()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 104
    :goto_0
    return v1

    .line 101
    :catch_0
    move-exception v0

    .line 102
    .local v0, "e":Ljava/io/IOException;
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    const-string v2, "Failed to roll file over."

    invoke-static {v1, v2, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    const/4 v1, 0x0

    goto :goto_0
.end method

.method scheduleTimeBasedFileRollOver(JJ)V
    .locals 11
    .param p1, "initialDelaySecs"    # J
    .param p3, "frequencySecs"    # J

    .prologue
    .line 117
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v8, 0x1

    .line 118
    .local v8, "noRollOverIsScheduled":Z
    :goto_0
    if-eqz v8, :cond_0

    .line 119
    new-instance v1, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;

    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    invoke-direct {v1, v0, p0}, Lio/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;-><init>(Landroid/content/Context;Lio/fabric/sdk/android/services/events/FileRollOverManager;)V

    .line 120
    .local v1, "rollOverRunnable":Ljava/lang/Runnable;
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scheduling time based file roll over every "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " seconds"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    :try_start_0
    iget-object v9, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduledRolloverFutureRef:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .end local v1    # "rollOverRunnable":Ljava/lang/Runnable;
    :cond_0
    :goto_1
    return-void

    .line 117
    .end local v8    # "noRollOverIsScheduled":Z
    :cond_1
    const/4 v8, 0x0

    goto :goto_0

    .line 125
    .restart local v1    # "rollOverRunnable":Ljava/lang/Runnable;
    .restart local v8    # "noRollOverIsScheduled":Z
    :catch_0
    move-exception v7

    .line 126
    .local v7, "e":Ljava/util/concurrent/RejectedExecutionException;
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    const-string v2, "Failed to schedule time based file roll over"

    invoke-static {v0, v2, v7}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public scheduleTimeBasedRollOverIfNeeded()V
    .locals 6

    .prologue
    .line 58
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    iget v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    const/4 v0, 0x1

    .line 60
    .local v0, "hasRollOverInterval":Z
    :goto_0
    if-eqz v0, :cond_0

    .line 61
    iget v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    int-to-long v2, v1

    iget v1, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->rolloverIntervalSeconds:I

    int-to-long v4, v1

    invoke-virtual {p0, v2, v3, v4, v5}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->scheduleTimeBasedFileRollOver(JJ)V

    .line 63
    :cond_0
    return-void

    .line 58
    .end local v0    # "hasRollOverInterval":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method sendAndCleanUpIfSuccess()V
    .locals 11

    .prologue
    .line 143
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->getFilesSender()Lio/fabric/sdk/android/services/events/FilesSender;

    move-result-object v3

    .line 144
    .local v3, "filesSender":Lio/fabric/sdk/android/services/events/FilesSender;
    if-nez v3, :cond_1

    .line 145
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    const-string v6, "skipping files send because we don\'t yet know the target endpoint"

    invoke-static {v5, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 179
    :cond_0
    :goto_0
    return-void

    .line 149
    :cond_1
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    const-string v6, "Sending all files"

    invoke-static {v5, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 151
    const/4 v4, 0x0

    .line 152
    .local v4, "filesSent":I
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v5}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->getBatchOfFilesToSend()Ljava/util/List;

    move-result-object v0

    .line 155
    .local v0, "batch":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    :goto_1
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_3

    .line 156
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "attempt to send batch of %d files"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 158
    invoke-interface {v3, v0}, Lio/fabric/sdk/android/services/events/FilesSender;->send(Ljava/util/List;)Z

    move-result v1

    .line 160
    .local v1, "cleanup":Z
    if-eqz v1, :cond_2

    .line 161
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v4, v5

    .line 162
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v5, v0}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->deleteSentFiles(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    :cond_2
    if-nez v1, :cond_4

    .line 176
    .end local v1    # "cleanup":Z
    :cond_3
    :goto_2
    if-nez v4, :cond_0

    .line 177
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v5}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->deleteOldestInRollOverIfOverMax()V

    goto :goto_0

    .line 169
    .restart local v1    # "cleanup":Z
    :cond_4
    :try_start_1
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-virtual {v5}, Lio/fabric/sdk/android/services/events/EventsFilesManager;->getBatchOfFilesToSend()Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 170
    goto :goto_1

    .line 171
    .end local v1    # "cleanup":Z
    :catch_0
    move-exception v2

    .line 172
    .local v2, "e":Ljava/lang/Exception;
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->context:Landroid/content/Context;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to send batch of analytics files to server: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public sendEvents()V
    .locals 0

    .prologue
    .line 67
    .local p0, "this":Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<TT;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;->sendAndCleanUpIfSuccess()V

    .line 68
    return-void
.end method
