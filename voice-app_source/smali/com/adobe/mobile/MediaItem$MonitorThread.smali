.class Lcom/adobe/mobile/MediaItem$MonitorThread;
.super Ljava/lang/Thread;
.source "MediaItem.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/MediaItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MonitorThread"
.end annotation


# instance fields
.field protected canceled:Z

.field delay:J

.field protected monitorMediaItem:Lcom/adobe/mobile/MediaItem;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 116
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/adobe/mobile/MediaItem$MonitorThread;->delay:J

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaItem$MonitorThread;->canceled:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/adobe/mobile/MediaItem$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/adobe/mobile/MediaItem$1;

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem$MonitorThread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 122
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lcom/adobe/mobile/MediaItem$MonitorThread;->canceled:Z

    if-nez v1, :cond_0

    .line 124
    iget-wide v2, p0, Lcom/adobe/mobile/MediaItem$MonitorThread;->delay:J

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 126
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/adobe/mobile/MediaItem$MonitorThread$1;

    invoke-direct {v2, p0}, Lcom/adobe/mobile/MediaItem$MonitorThread$1;-><init>(Lcom/adobe/mobile/MediaItem$MonitorThread;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 132
    :catch_0
    move-exception v0

    .line 133
    .local v0, "e":Ljava/lang/InterruptedException;
    const-string v1, "Media - Background Thread Interrupted : %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :cond_0
    return-void
.end method
