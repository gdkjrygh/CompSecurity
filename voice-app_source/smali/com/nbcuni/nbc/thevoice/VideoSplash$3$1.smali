.class Lcom/nbcuni/nbc/thevoice/VideoSplash$3$1;
.super Ljava/lang/Object;
.source "VideoSplash.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->onPrepared(Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/VideoSplash$3;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/VideoSplash$3;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash$3$1;->this$1:Lcom/nbcuni/nbc/thevoice/VideoSplash$3;

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 92
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash$3$1;->this$1:Lcom/nbcuni/nbc/thevoice/VideoSplash$3;

    # getter for: Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->this$0:Lcom/nbcuni/nbc/thevoice/VideoSplash;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->access$0(Lcom/nbcuni/nbc/thevoice/VideoSplash$3;)Lcom/nbcuni/nbc/thevoice/VideoSplash;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->finish()V

    .line 93
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash$3$1;->this$1:Lcom/nbcuni/nbc/thevoice/VideoSplash$3;

    # getter for: Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->this$0:Lcom/nbcuni/nbc/thevoice/VideoSplash;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->access$0(Lcom/nbcuni/nbc/thevoice/VideoSplash$3;)Lcom/nbcuni/nbc/thevoice/VideoSplash;

    move-result-object v0

    const v1, 0x7f040003

    const v2, 0x7f040004

    invoke-virtual {v0, v1, v2}, Lcom/nbcuni/nbc/thevoice/VideoSplash;->overridePendingTransition(II)V

    .line 95
    return-void
.end method
