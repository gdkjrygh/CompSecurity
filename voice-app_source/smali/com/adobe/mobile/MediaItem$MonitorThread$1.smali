.class Lcom/adobe/mobile/MediaItem$MonitorThread$1;
.super Ljava/lang/Object;
.source "MediaItem.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/MediaItem$MonitorThread;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/MediaItem$MonitorThread;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/MediaItem$MonitorThread;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/MediaItem$MonitorThread;

    .prologue
    .line 126
    iput-object p1, p0, Lcom/adobe/mobile/MediaItem$MonitorThread$1;->this$0:Lcom/adobe/mobile/MediaItem$MonitorThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 128
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem$MonitorThread$1;->this$0:Lcom/adobe/mobile/MediaItem$MonitorThread;

    iget-object v0, v0, Lcom/adobe/mobile/MediaItem$MonitorThread;->monitorMediaItem:Lcom/adobe/mobile/MediaItem;

    iget-object v0, v0, Lcom/adobe/mobile/MediaItem;->mediaAnalytics:Lcom/adobe/mobile/MediaAnalytics;

    iget-object v1, p0, Lcom/adobe/mobile/MediaItem$MonitorThread$1;->this$0:Lcom/adobe/mobile/MediaItem$MonitorThread;

    iget-object v1, v1, Lcom/adobe/mobile/MediaItem$MonitorThread;->monitorMediaItem:Lcom/adobe/mobile/MediaItem;

    iget-object v1, v1, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    invoke-virtual {v0, v1, v2, v3}, Lcom/adobe/mobile/MediaAnalytics;->monitor(Ljava/lang/String;D)V

    .line 129
    return-void
.end method
