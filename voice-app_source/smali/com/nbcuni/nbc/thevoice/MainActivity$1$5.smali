.class Lcom/nbcuni/nbc/thevoice/MainActivity$1$5;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity$1;->playAudio(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$5;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2
    .param p1, "mp"    # Landroid/media/MediaPlayer;

    .prologue
    .line 325
    :try_start_0
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$5;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v1

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->reset()V

    .line 326
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$5;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v1

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->fis:Ljava/io/FileInputStream;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$11(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/io/FileInputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    :goto_0
    return-void

    .line 327
    :catch_0
    move-exception v0

    .line 328
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
