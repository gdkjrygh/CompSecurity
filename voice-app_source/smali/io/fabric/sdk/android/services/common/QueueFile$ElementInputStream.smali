.class final Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;
.super Ljava/io/InputStream;
.source "QueueFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/QueueFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ElementInputStream"
.end annotation


# instance fields
.field private position:I

.field private remaining:I

.field final synthetic this$0:Lio/fabric/sdk/android/services/common/QueueFile;


# direct methods
.method private constructor <init>(Lio/fabric/sdk/android/services/common/QueueFile;Lio/fabric/sdk/android/services/common/QueueFile$Element;)V
    .locals 1
    .param p2, "element"    # Lio/fabric/sdk/android/services/common/QueueFile$Element;

    .prologue
    .line 465
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->this$0:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 466
    iget v0, p2, Lio/fabric/sdk/android/services/common/QueueFile$Element;->position:I

    add-int/lit8 v0, v0, 0x4

    # invokes: Lio/fabric/sdk/android/services/common/QueueFile;->wrapPosition(I)I
    invoke-static {p1, v0}, Lio/fabric/sdk/android/services/common/QueueFile;->access$100(Lio/fabric/sdk/android/services/common/QueueFile;I)I

    move-result v0

    iput v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    .line 467
    iget v0, p2, Lio/fabric/sdk/android/services/common/QueueFile$Element;->length:I

    iput v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    .line 468
    return-void
.end method

.method synthetic constructor <init>(Lio/fabric/sdk/android/services/common/QueueFile;Lio/fabric/sdk/android/services/common/QueueFile$Element;Lio/fabric/sdk/android/services/common/QueueFile$1;)V
    .locals 0
    .param p1, "x0"    # Lio/fabric/sdk/android/services/common/QueueFile;
    .param p2, "x1"    # Lio/fabric/sdk/android/services/common/QueueFile$Element;
    .param p3, "x2"    # Lio/fabric/sdk/android/services/common/QueueFile$1;

    .prologue
    .line 461
    invoke-direct {p0, p1, p2}, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;-><init>(Lio/fabric/sdk/android/services/common/QueueFile;Lio/fabric/sdk/android/services/common/QueueFile$Element;)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 491
    iget v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    if-nez v1, :cond_0

    .line 492
    const/4 v0, -0x1

    .line 498
    :goto_0
    return v0

    .line 494
    :cond_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->this$0:Lio/fabric/sdk/android/services/common/QueueFile;

    # getter for: Lio/fabric/sdk/android/services/common/QueueFile;->raf:Ljava/io/RandomAccessFile;
    invoke-static {v1}, Lio/fabric/sdk/android/services/common/QueueFile;->access$400(Lio/fabric/sdk/android/services/common/QueueFile;)Ljava/io/RandomAccessFile;

    move-result-object v1

    iget v2, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 495
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->this$0:Lio/fabric/sdk/android/services/common/QueueFile;

    # getter for: Lio/fabric/sdk/android/services/common/QueueFile;->raf:Ljava/io/RandomAccessFile;
    invoke-static {v1}, Lio/fabric/sdk/android/services/common/QueueFile;->access$400(Lio/fabric/sdk/android/services/common/QueueFile;)Ljava/io/RandomAccessFile;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    .line 496
    .local v0, "b":I
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->this$0:Lio/fabric/sdk/android/services/common/QueueFile;

    iget v2, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    add-int/lit8 v2, v2, 0x1

    # invokes: Lio/fabric/sdk/android/services/common/QueueFile;->wrapPosition(I)I
    invoke-static {v1, v2}, Lio/fabric/sdk/android/services/common/QueueFile;->access$100(Lio/fabric/sdk/android/services/common/QueueFile;I)I

    move-result v1

    iput v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    .line 497
    iget v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    goto :goto_0
.end method

.method public read([BII)I
    .locals 2
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 472
    const-string v0, "buffer"

    # invokes: Lio/fabric/sdk/android/services/common/QueueFile;->nonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    invoke-static {p1, v0}, Lio/fabric/sdk/android/services/common/QueueFile;->access$200(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 473
    or-int v0, p2, p3

    if-ltz v0, :cond_0

    array-length v0, p1

    sub-int/2addr v0, p2

    if-le p3, v0, :cond_1

    .line 474
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0

    .line 476
    :cond_1
    iget v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    if-lez v0, :cond_3

    .line 477
    iget v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    if-le p3, v0, :cond_2

    .line 478
    iget p3, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    .line 480
    :cond_2
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->this$0:Lio/fabric/sdk/android/services/common/QueueFile;

    iget v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    # invokes: Lio/fabric/sdk/android/services/common/QueueFile;->ringRead(I[BII)V
    invoke-static {v0, v1, p1, p2, p3}, Lio/fabric/sdk/android/services/common/QueueFile;->access$300(Lio/fabric/sdk/android/services/common/QueueFile;I[BII)V

    .line 481
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->this$0:Lio/fabric/sdk/android/services/common/QueueFile;

    iget v1, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    add-int/2addr v1, p3

    # invokes: Lio/fabric/sdk/android/services/common/QueueFile;->wrapPosition(I)I
    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/common/QueueFile;->access$100(Lio/fabric/sdk/android/services/common/QueueFile;I)I

    move-result v0

    iput v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->position:I

    .line 482
    iget v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    sub-int/2addr v0, p3

    iput v0, p0, Lio/fabric/sdk/android/services/common/QueueFile$ElementInputStream;->remaining:I

    move v0, p3

    .line 485
    :goto_0
    return v0

    :cond_3
    const/4 v0, -0x1

    goto :goto_0
.end method
