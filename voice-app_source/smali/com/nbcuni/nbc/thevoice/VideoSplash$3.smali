.class Lcom/nbcuni/nbc/thevoice/VideoSplash$3;
.super Ljava/lang/Object;
.source "VideoSplash.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/VideoSplash;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/VideoSplash;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/VideoSplash;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->this$0:Lcom/nbcuni/nbc/thevoice/VideoSplash;

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/nbcuni/nbc/thevoice/VideoSplash$3;)Lcom/nbcuni/nbc/thevoice/VideoSplash;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/VideoSplash$3;->this$0:Lcom/nbcuni/nbc/thevoice/VideoSplash;

    return-object v0
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 6
    .param p1, "mp"    # Landroid/media/MediaPlayer;

    .prologue
    .line 86
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    add-int/lit16 v0, v1, -0x1f4

    .line 87
    .local v0, "fadeDelay":I
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/nbcuni/nbc/thevoice/VideoSplash$3$1;

    invoke-direct {v2, p0}, Lcom/nbcuni/nbc/thevoice/VideoSplash$3$1;-><init>(Lcom/nbcuni/nbc/thevoice/VideoSplash$3;)V

    .line 96
    int-to-long v4, v0

    .line 87
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 98
    return-void
.end method
