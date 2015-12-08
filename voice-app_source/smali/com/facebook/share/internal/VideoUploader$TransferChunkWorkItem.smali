.class Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;
.super Lcom/facebook/share/internal/VideoUploader$UploadWorkItemBase;
.source "VideoUploader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/internal/VideoUploader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TransferChunkWorkItem"
.end annotation


# static fields
.field static final transientErrorCodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private chunkEnd:Ljava/lang/String;

.field private chunkStart:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 400
    new-instance v0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem$1;

    invoke-direct {v0}, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem$1;-><init>()V

    sput-object v0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->transientErrorCodes:Ljava/util/Set;

    .line 406
    return-void
.end method

.method public constructor <init>(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .param p1, "uploadContext"    # Lcom/facebook/share/internal/VideoUploader$UploadContext;
    .param p2, "chunkStart"    # Ljava/lang/String;
    .param p3, "chunkEnd"    # Ljava/lang/String;
    .param p4, "completedRetries"    # I

    .prologue
    .line 416
    invoke-direct {p0, p1, p4}, Lcom/facebook/share/internal/VideoUploader$UploadWorkItemBase;-><init>(Lcom/facebook/share/internal/VideoUploader$UploadContext;I)V

    .line 417
    iput-object p2, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkStart:Ljava/lang/String;

    .line 418
    iput-object p3, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkEnd:Ljava/lang/String;

    .line 419
    return-void
.end method


# virtual methods
.method protected enqueueRetry(I)V
    .locals 3
    .param p1, "retriesCompleted"    # I

    .prologue
    .line 471
    iget-object v0, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->uploadContext:Lcom/facebook/share/internal/VideoUploader$UploadContext;

    iget-object v1, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkStart:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkEnd:Ljava/lang/String;

    # invokes: Lcom/facebook/share/internal/VideoUploader;->enqueueUploadChunk(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;I)V
    invoke-static {v0, v1, v2, p1}, Lcom/facebook/share/internal/VideoUploader;->access$0(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;I)V

    .line 472
    return-void
.end method

.method public getParameters()Landroid/os/Bundle;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 424
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 425
    .local v1, "parameters":Landroid/os/Bundle;
    const-string v2, "upload_phase"

    const-string v3, "transfer"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    const-string v2, "upload_session_id"

    iget-object v3, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->uploadContext:Lcom/facebook/share/internal/VideoUploader$UploadContext;

    iget-object v3, v3, Lcom/facebook/share/internal/VideoUploader$UploadContext;->sessionId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    const-string v2, "start_offset"

    iget-object v3, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkStart:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    iget-object v2, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->uploadContext:Lcom/facebook/share/internal/VideoUploader$UploadContext;

    iget-object v3, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkStart:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->chunkEnd:Ljava/lang/String;

    # invokes: Lcom/facebook/share/internal/VideoUploader;->getChunk(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;)[B
    invoke-static {v2, v3, v4}, Lcom/facebook/share/internal/VideoUploader;->access$3(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    .line 430
    .local v0, "chunk":[B
    if-eqz v0, :cond_0

    .line 431
    const-string v2, "video_file_chunk"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 436
    return-object v1

    .line 433
    :cond_0
    new-instance v2, Lcom/facebook/FacebookException;

    const-string v3, "Error reading video"

    invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method protected getTransientErrorCodes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 466
    sget-object v0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->transientErrorCodes:Ljava/util/Set;

    return-object v0
.end method

.method protected handleError(Lcom/facebook/FacebookException;)V
    .locals 4
    .param p1, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 460
    const-string v0, "Error uploading video \'%s\'"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->uploadContext:Lcom/facebook/share/internal/VideoUploader$UploadContext;

    iget-object v3, v3, Lcom/facebook/share/internal/VideoUploader$UploadContext;->videoId:Ljava/lang/String;

    aput-object v3, v1, v2

    # invokes: Lcom/facebook/share/internal/VideoUploader;->logError(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V
    invoke-static {p1, v0, v1}, Lcom/facebook/share/internal/VideoUploader;->access$1(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->endUploadWithFailure(Lcom/facebook/FacebookException;)V

    .line 462
    return-void
.end method

.method protected handleSuccess(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "jsonObject"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 442
    const-string v2, "start_offset"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 443
    .local v1, "startOffset":Ljava/lang/String;
    const-string v2, "end_offset"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 445
    .local v0, "endOffset":Ljava/lang/String;
    invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 447
    iget-object v2, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->uploadContext:Lcom/facebook/share/internal/VideoUploader$UploadContext;

    .line 446
    # invokes: Lcom/facebook/share/internal/VideoUploader;->enqueueUploadFinish(Lcom/facebook/share/internal/VideoUploader$UploadContext;I)V
    invoke-static {v2, v3}, Lcom/facebook/share/internal/VideoUploader;->access$4(Lcom/facebook/share/internal/VideoUploader$UploadContext;I)V

    .line 456
    :goto_0
    return-void

    .line 451
    :cond_0
    iget-object v2, p0, Lcom/facebook/share/internal/VideoUploader$TransferChunkWorkItem;->uploadContext:Lcom/facebook/share/internal/VideoUploader$UploadContext;

    .line 450
    # invokes: Lcom/facebook/share/internal/VideoUploader;->enqueueUploadChunk(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;I)V
    invoke-static {v2, v1, v0, v3}, Lcom/facebook/share/internal/VideoUploader;->access$0(Lcom/facebook/share/internal/VideoUploader$UploadContext;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0
.end method
