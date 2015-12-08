.class Lcom/crashlytics/android/core/SessionDataWriter;
.super Ljava/lang/Object;
.source "SessionDataWriter.java"


# static fields
.field private static final SIGNAL_DEFAULT:Ljava/lang/String; = "0"

.field private static final SIGNAL_DEFAULT_BYTE_STRING:Lcom/crashlytics/android/core/ByteString;


# instance fields
.field private final context:Landroid/content/Context;

.field private exceptionStack:[Ljava/lang/StackTraceElement;

.field private final maxChainedExceptionsDepth:I

.field private final optionalBuildIdBytes:Lcom/crashlytics/android/core/ByteString;

.field private final packageNameBytes:Lcom/crashlytics/android/core/ByteString;

.field private runningAppProcessInfo:Landroid/app/ActivityManager$RunningAppProcessInfo;

.field private stacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<[",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation
.end field

.field private threads:[Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-string v0, "0"

    invoke-static {v0}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/core/SessionDataWriter;->SIGNAL_DEFAULT_BYTE_STRING:Lcom/crashlytics/android/core/ByteString;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "buildId"    # Ljava/lang/String;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/16 v0, 0x8

    iput v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->maxChainedExceptionsDepth:I

    .line 48
    iput-object p1, p0, Lcom/crashlytics/android/core/SessionDataWriter;->context:Landroid/content/Context;

    .line 49
    invoke-static {p3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->packageNameBytes:Lcom/crashlytics/android/core/ByteString;

    .line 50
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->optionalBuildIdBytes:Lcom/crashlytics/android/core/ByteString;

    .line 52
    return-void

    .line 50
    :cond_0
    const-string v0, "-"

    const-string v1, ""

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    goto :goto_0
.end method

.method private getBinaryImageSize()I
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 452
    const/4 v0, 0x0

    .line 454
    .local v0, "size":I
    const/4 v1, 0x1

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 455
    const/4 v1, 0x2

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 456
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/crashlytics/android/core/SessionDataWriter;->packageNameBytes:Lcom/crashlytics/android/core/ByteString;

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 457
    iget-object v1, p0, Lcom/crashlytics/android/core/SessionDataWriter;->optionalBuildIdBytes:Lcom/crashlytics/android/core/ByteString;

    if-eqz v1, :cond_0

    .line 458
    const/4 v1, 0x4

    iget-object v2, p0, Lcom/crashlytics/android/core/SessionDataWriter;->optionalBuildIdBytes:Lcom/crashlytics/android/core/ByteString;

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 461
    :cond_0
    return v0
.end method

.method private getDeviceIdentifierSize(Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)I
    .locals 3
    .param p1, "type"    # Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 417
    const/4 v1, 0x1

    iget v2, p1, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->protobufIndex:I

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeEnumSize(II)I

    move-result v0

    .line 418
    .local v0, "size":I
    const/4 v1, 0x2

    invoke-static {p2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 420
    return v0
.end method

.method private getEventAppCustomAttributeSize(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 549
    const/4 v1, 0x1

    invoke-static {p1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v0

    .line 550
    .local v0, "size":I
    const/4 v1, 0x2

    if-nez p2, :cond_0

    const-string p2, ""

    .end local p2    # "value":Ljava/lang/String;
    :cond_0
    invoke-static {p2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 552
    return v0
.end method

.method private getEventAppExecutionExceptionSize(Ljava/lang/Throwable;I)I
    .locals 13
    .param p1, "ex"    # Ljava/lang/Throwable;
    .param p2, "chainDepth"    # I

    .prologue
    const/4 v12, 0x1

    .line 578
    const/4 v9, 0x0

    .line 580
    .local v9, "size":I
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v10

    invoke-static {v12, v10}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v10

    add-int/2addr v9, v10

    .line 584
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    .line 585
    .local v7, "message":Ljava/lang/String;
    if-eqz v7, :cond_0

    .line 586
    const/4 v10, 0x3

    invoke-static {v7}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v10

    add-int/2addr v9, v10

    .line 589
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/StackTraceElement;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v6, :cond_1

    aget-object v2, v0, v5

    .line 590
    .local v2, "element":Ljava/lang/StackTraceElement;
    invoke-direct {p0, v2, v12}, Lcom/crashlytics/android/core/SessionDataWriter;->getFrameSize(Ljava/lang/StackTraceElement;Z)I

    move-result v4

    .line 591
    .local v4, "frameSize":I
    const/4 v10, 0x4

    invoke-static {v10}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v10

    invoke-static {v4}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v11

    add-int/2addr v10, v11

    add-int/2addr v10, v4

    add-int/2addr v9, v10

    .line 589
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 597
    .end local v2    # "element":Ljava/lang/StackTraceElement;
    .end local v4    # "frameSize":I
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 598
    .local v1, "cause":Ljava/lang/Throwable;
    if-eqz v1, :cond_2

    .line 599
    iget v10, p0, Lcom/crashlytics/android/core/SessionDataWriter;->maxChainedExceptionsDepth:I

    if-ge p2, v10, :cond_3

    .line 600
    add-int/lit8 v10, p2, 0x1

    invoke-direct {p0, v1, v10}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionExceptionSize(Ljava/lang/Throwable;I)I

    move-result v3

    .line 602
    .local v3, "exceptionSize":I
    const/4 v10, 0x6

    invoke-static {v10}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v10

    invoke-static {v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v11

    add-int/2addr v10, v11

    add-int/2addr v10, v3

    add-int/2addr v9, v10

    .line 617
    .end local v3    # "exceptionSize":I
    :cond_2
    :goto_1
    return v9

    .line 607
    :cond_3
    const/4 v8, 0x0

    .line 608
    .local v8, "overflowCount":I
    :goto_2
    if-eqz v1, :cond_4

    .line 609
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 610
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 613
    :cond_4
    const/4 v10, 0x7

    invoke-static {v10, v8}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v10

    add-int/2addr v9, v10

    goto :goto_1
.end method

.method private getEventAppExecutionSignalSize()I
    .locals 4

    .prologue
    .line 621
    const/4 v0, 0x0

    .line 623
    .local v0, "size":I
    const/4 v1, 0x1

    sget-object v2, Lcom/crashlytics/android/core/SessionDataWriter;->SIGNAL_DEFAULT_BYTE_STRING:Lcom/crashlytics/android/core/ByteString;

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 624
    const/4 v1, 0x2

    sget-object v2, Lcom/crashlytics/android/core/SessionDataWriter;->SIGNAL_DEFAULT_BYTE_STRING:Lcom/crashlytics/android/core/ByteString;

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 625
    const/4 v1, 0x3

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 627
    return v0
.end method

.method private getEventAppExecutionSize(Ljava/lang/Thread;Ljava/lang/Throwable;)I
    .locals 13
    .param p1, "exceptionThread"    # Ljava/lang/Thread;
    .param p2, "ex"    # Ljava/lang/Throwable;

    .prologue
    const/4 v12, 0x3

    const/4 v11, 0x0

    const/4 v10, 0x1

    .line 519
    const/4 v5, 0x0

    .line 521
    .local v5, "size":I
    iget-object v8, p0, Lcom/crashlytics/android/core/SessionDataWriter;->exceptionStack:[Ljava/lang/StackTraceElement;

    const/4 v9, 0x4

    invoke-direct {p0, p1, v8, v9, v10}, Lcom/crashlytics/android/core/SessionDataWriter;->getThreadSize(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I

    move-result v7

    .line 522
    .local v7, "threadSize":I
    invoke-static {v10}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v8

    invoke-static {v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v9

    add-int/2addr v8, v9

    add-int/2addr v8, v7

    add-int/2addr v5, v8

    .line 525
    iget-object v8, p0, Lcom/crashlytics/android/core/SessionDataWriter;->threads:[Ljava/lang/Thread;

    array-length v3, v8

    .line 526
    .local v3, "len":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v3, :cond_0

    .line 527
    iget-object v8, p0, Lcom/crashlytics/android/core/SessionDataWriter;->threads:[Ljava/lang/Thread;

    aget-object v6, v8, v2

    .line 528
    .local v6, "thread":Ljava/lang/Thread;
    iget-object v8, p0, Lcom/crashlytics/android/core/SessionDataWriter;->stacks:Ljava/util/List;

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/StackTraceElement;

    invoke-direct {p0, v6, v8, v11, v11}, Lcom/crashlytics/android/core/SessionDataWriter;->getThreadSize(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I

    move-result v7

    .line 529
    invoke-static {v10}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v8

    invoke-static {v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v9

    add-int/2addr v8, v9

    add-int/2addr v8, v7

    add-int/2addr v5, v8

    .line 526
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 533
    .end local v6    # "thread":Ljava/lang/Thread;
    :cond_0
    invoke-direct {p0, p2, v10}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionExceptionSize(Ljava/lang/Throwable;I)I

    move-result v1

    .line 534
    .local v1, "exceptionSize":I
    const/4 v8, 0x2

    invoke-static {v8}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v8

    invoke-static {v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v9

    add-int/2addr v8, v9

    add-int/2addr v8, v1

    add-int/2addr v5, v8

    .line 537
    invoke-direct {p0}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionSignalSize()I

    move-result v4

    .line 538
    .local v4, "signalSize":I
    invoke-static {v12}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v8

    invoke-static {v4}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v9

    add-int/2addr v8, v9

    add-int/2addr v8, v4

    add-int/2addr v5, v8

    .line 541
    invoke-direct {p0}, Lcom/crashlytics/android/core/SessionDataWriter;->getBinaryImageSize()I

    move-result v0

    .line 542
    .local v0, "binaryImageSize":I
    invoke-static {v12}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v8

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v9

    add-int/2addr v8, v9

    add-int/2addr v8, v0

    add-int/2addr v5, v8

    .line 545
    return v5
.end method

.method private getEventAppSize(Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)I
    .locals 9
    .param p1, "thread"    # Ljava/lang/Thread;
    .param p2, "ex"    # Ljava/lang/Throwable;
    .param p3, "orientation"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            "I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .local p4, "customAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v7, 0x1

    .line 492
    const/4 v4, 0x0

    .line 494
    .local v4, "size":I
    invoke-direct {p0, p1, p2}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionSize(Ljava/lang/Thread;Ljava/lang/Throwable;)I

    move-result v2

    .line 495
    .local v2, "executionSize":I
    invoke-static {v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v5

    invoke-static {v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, v2

    add-int/2addr v4, v5

    .line 498
    if-eqz p4, :cond_0

    .line 499
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 500
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {p0, v5, v6}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppCustomAttributeSize(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 502
    .local v1, "entrySize":I
    const/4 v5, 0x2

    invoke-static {v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v5

    invoke-static {v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, v1

    add-int/2addr v4, v5

    .line 504
    goto :goto_0

    .line 508
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v1    # "entrySize":I
    .end local v3    # "i$":Ljava/util/Iterator;
    :cond_0
    iget-object v5, p0, Lcom/crashlytics/android/core/SessionDataWriter;->runningAppProcessInfo:Landroid/app/ActivityManager$RunningAppProcessInfo;

    if-eqz v5, :cond_1

    .line 509
    const/4 v6, 0x3

    iget-object v5, p0, Lcom/crashlytics/android/core/SessionDataWriter;->runningAppProcessInfo:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v5, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v8, 0x64

    if-eq v5, v8, :cond_2

    move v5, v7

    :goto_1
    invoke-static {v6, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v5

    add-int/2addr v4, v5

    .line 513
    :cond_1
    const/4 v5, 0x4

    invoke-static {v5, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v5

    add-int/2addr v4, v5

    .line 515
    return v4

    .line 509
    :cond_2
    const/4 v5, 0x0

    goto :goto_1
.end method

.method private getEventDeviceSize(FIZIJJ)I
    .locals 3
    .param p1, "batteryLevel"    # F
    .param p2, "batterVelocity"    # I
    .param p3, "proximityEnabled"    # Z
    .param p4, "orientation"    # I
    .param p5, "heapAllocatedSize"    # J
    .param p7, "diskUsed"    # J

    .prologue
    .line 558
    const/4 v0, 0x0

    .line 560
    .local v0, "size":I
    const/4 v1, 0x1

    invoke-static {v1, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeFloatSize(IF)I

    move-result v1

    add-int/2addr v0, v1

    .line 561
    const/4 v1, 0x2

    invoke-static {v1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeSInt32Size(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 562
    const/4 v1, 0x3

    invoke-static {v1, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 563
    const/4 v1, 0x4

    invoke-static {v1, p4}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 564
    const/4 v1, 0x5

    invoke-static {v1, p5, p6}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 565
    const/4 v1, 0x6

    invoke-static {v1, p7, p8}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 567
    return v0
.end method

.method private getEventLogSize(Lcom/crashlytics/android/core/ByteString;)I
    .locals 1
    .param p1, "log"    # Lcom/crashlytics/android/core/ByteString;

    .prologue
    .line 574
    const/4 v0, 0x1

    invoke-static {v0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v0

    return v0
.end method

.method private getFrameSize(Ljava/lang/StackTraceElement;Z)I
    .locals 7
    .param p1, "element"    # Ljava/lang/StackTraceElement;
    .param p2, "isCrashedThread"    # Z

    .prologue
    const/4 v1, 0x2

    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 631
    const/4 v0, 0x0

    .line 633
    .local v0, "size":I
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 635
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v3

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-long v4, v3

    invoke-static {v6, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v3

    add-int/2addr v0, v3

    .line 640
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v3

    add-int/2addr v0, v3

    .line 643
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 644
    const/4 v3, 0x3

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v3

    add-int/2addr v0, v3

    .line 648
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v3

    if-lez v3, :cond_1

    .line 650
    const/4 v3, 0x4

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v3

    add-int/2addr v0, v3

    .line 652
    :cond_1
    const/4 v3, 0x5

    if-eqz p2, :cond_3

    :goto_1
    invoke-static {v3, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 654
    return v0

    .line 637
    :cond_2
    const-wide/16 v4, 0x0

    invoke-static {v6, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_0

    :cond_3
    move v1, v2

    .line 652
    goto :goto_1
.end method

.method private getSessionAppOrgSize()I
    .locals 4

    .prologue
    .line 398
    const/4 v0, 0x0

    .line 399
    .local v0, "size":I
    const/4 v1, 0x1

    new-instance v2, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v2}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    iget-object v3, p0, Lcom/crashlytics/android/core/SessionDataWriter;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 402
    return v0
.end method

.method private getSessionAppSize(Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;I)I
    .locals 4
    .param p1, "packageName"    # Lcom/crashlytics/android/core/ByteString;
    .param p2, "versionCode"    # Lcom/crashlytics/android/core/ByteString;
    .param p3, "versionName"    # Lcom/crashlytics/android/core/ByteString;
    .param p4, "installUuid"    # Lcom/crashlytics/android/core/ByteString;
    .param p5, "deliveryMechanism"    # I

    .prologue
    .line 383
    const/4 v1, 0x0

    .line 385
    .local v1, "size":I
    const/4 v2, 0x1

    invoke-static {v2, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v2

    add-int/2addr v1, v2

    .line 386
    const/4 v2, 0x2

    invoke-static {v2, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v2

    add-int/2addr v1, v2

    .line 387
    const/4 v2, 0x3

    invoke-static {v2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v2

    add-int/2addr v1, v2

    .line 388
    invoke-direct {p0}, Lcom/crashlytics/android/core/SessionDataWriter;->getSessionAppOrgSize()I

    move-result v0

    .line 389
    .local v0, "orgSize":I
    const/4 v2, 0x5

    invoke-static {v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v2

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v2, v0

    add-int/2addr v1, v2

    .line 391
    const/4 v2, 0x6

    invoke-static {v2, p4}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v2

    add-int/2addr v1, v2

    .line 392
    const/16 v2, 0xa

    invoke-static {v2, p5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeEnumSize(II)I

    move-result v2

    add-int/2addr v1, v2

    .line 394
    return v1
.end method

.method private getSessionDeviceSize(ILcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;IJJZLjava/util/Map;ILcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;)I
    .locals 7
    .param p1, "arch"    # I
    .param p2, "clsDeviceID"    # Lcom/crashlytics/android/core/ByteString;
    .param p3, "model"    # Lcom/crashlytics/android/core/ByteString;
    .param p4, "availableProcessors"    # I
    .param p5, "totalRam"    # J
    .param p7, "diskSpace"    # J
    .param p9, "isEmulator"    # Z
    .param p11, "state"    # I
    .param p12, "manufacturer"    # Lcom/crashlytics/android/core/ByteString;
    .param p13, "modelClass"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/crashlytics/android/core/ByteString;",
            "Lcom/crashlytics/android/core/ByteString;",
            "IJJZ",
            "Ljava/util/Map",
            "<",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/crashlytics/android/core/ByteString;",
            "Lcom/crashlytics/android/core/ByteString;",
            ")I"
        }
    .end annotation

    .prologue
    .line 428
    .local p10, "ids":Ljava/util/Map;, "Ljava/util/Map<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    const/4 v4, 0x0

    .line 430
    .local v4, "size":I
    const/4 v5, 0x1

    invoke-static {v5, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v5

    add-int/2addr v4, v5

    .line 431
    const/4 v5, 0x3

    invoke-static {v5, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeEnumSize(II)I

    move-result v5

    add-int/2addr v4, v5

    .line 432
    if-nez p3, :cond_0

    const/4 v5, 0x0

    :goto_0
    add-int/2addr v4, v5

    .line 433
    const/4 v5, 0x5

    invoke-static {v5, p4}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v5

    add-int/2addr v4, v5

    .line 434
    const/4 v5, 0x6

    invoke-static {v5, p5, p6}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v5

    add-int/2addr v4, v5

    .line 435
    const/4 v5, 0x7

    invoke-static {v5, p7, p8}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v5

    add-int/2addr v4, v5

    .line 436
    const/16 v5, 0xa

    move/from16 v0, p9

    invoke-static {v5, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v5

    add-int/2addr v4, v5

    .line 437
    if-eqz p10, :cond_1

    .line 438
    invoke-interface/range {p10 .. p10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 439
    .local v2, "id":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {p0, v5, v6}, Lcom/crashlytics/android/core/SessionDataWriter;->getDeviceIdentifierSize(Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)I

    move-result v3

    .line 440
    .local v3, "idSize":I
    const/16 v5, 0xb

    invoke-static {v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v5

    invoke-static {v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, v3

    add-int/2addr v4, v5

    .line 442
    goto :goto_1

    .line 432
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v2    # "id":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    .end local v3    # "idSize":I
    :cond_0
    const/4 v5, 0x4

    invoke-static {v5, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v5

    goto :goto_0

    .line 444
    :cond_1
    const/16 v5, 0xc

    move/from16 v0, p11

    invoke-static {v5, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v5

    add-int/2addr v4, v5

    .line 445
    if-nez p12, :cond_2

    const/4 v5, 0x0

    :goto_2
    add-int/2addr v4, v5

    .line 446
    if-nez p13, :cond_3

    const/4 v5, 0x0

    :goto_3
    add-int/2addr v4, v5

    .line 448
    return v4

    .line 445
    :cond_2
    const/16 v5, 0xd

    move-object/from16 v0, p12

    invoke-static {v5, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v5

    goto :goto_2

    .line 446
    :cond_3
    const/16 v5, 0xe

    move-object/from16 v0, p13

    invoke-static {v5, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v5

    goto :goto_3
.end method

.method private getSessionEventSize(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;JLjava/util/Map;FIZIJJLcom/crashlytics/android/core/ByteString;)I
    .locals 19
    .param p1, "thread"    # Ljava/lang/Thread;
    .param p2, "ex"    # Ljava/lang/Throwable;
    .param p3, "eventType"    # Ljava/lang/String;
    .param p4, "eventTime"    # J
    .param p7, "batteryLevel"    # F
    .param p8, "batterVelocity"    # I
    .param p9, "proximityEnabled"    # Z
    .param p10, "orientation"    # I
    .param p11, "heapAllocatedSize"    # J
    .param p13, "diskUsed"    # J
    .param p15, "log"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;FIZIJJ",
            "Lcom/crashlytics/android/core/ByteString;",
            ")I"
        }
    .end annotation

    .prologue
    .line 469
    .local p6, "custAttrs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/16 v18, 0x0

    .line 471
    .local v18, "size":I
    const/4 v7, 0x1

    move-wide/from16 v0, p4

    invoke-static {v7, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v7

    add-int v18, v18, v7

    .line 472
    const/4 v7, 0x2

    invoke-static/range {p3 .. p3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v7

    add-int v18, v18, v7

    .line 473
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p10

    move-object/from16 v4, p6

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppSize(Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)I

    move-result v6

    .line 474
    .local v6, "eventAppSize":I
    const/4 v7, 0x3

    invoke-static {v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v7

    invoke-static {v6}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int/2addr v7, v6

    add-int v18, v18, v7

    move-object/from16 v7, p0

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    .line 476
    invoke-direct/range {v7 .. v15}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventDeviceSize(FIZIJJ)I

    move-result v16

    .line 478
    .local v16, "eventDeviceSize":I
    const/4 v7, 0x5

    invoke-static {v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v7

    invoke-static/range {v16 .. v16}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int v7, v7, v16

    add-int v18, v18, v7

    .line 481
    if-eqz p15, :cond_0

    .line 482
    move-object/from16 v0, p0

    move-object/from16 v1, p15

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventLogSize(Lcom/crashlytics/android/core/ByteString;)I

    move-result v17

    .line 483
    .local v17, "logSize":I
    const/4 v7, 0x6

    invoke-static {v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v7

    invoke-static/range {v17 .. v17}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int v7, v7, v17

    add-int v18, v18, v7

    .line 487
    .end local v17    # "logSize":I
    :cond_0
    return v18
.end method

.method private getSessionOSSize(Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;Z)I
    .locals 3
    .param p1, "release"    # Lcom/crashlytics/android/core/ByteString;
    .param p2, "codeName"    # Lcom/crashlytics/android/core/ByteString;
    .param p3, "isRooted"    # Z

    .prologue
    const/4 v2, 0x3

    .line 406
    const/4 v0, 0x0

    .line 408
    .local v0, "size":I
    const/4 v1, 0x1

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeEnumSize(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 409
    const/4 v1, 0x2

    invoke-static {v1, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 410
    invoke-static {v2, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 411
    const/4 v1, 0x4

    invoke-static {v1, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 413
    return v0
.end method

.method private getThreadSize(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I
    .locals 8
    .param p1, "thread"    # Ljava/lang/Thread;
    .param p2, "stackTraceElements"    # [Ljava/lang/StackTraceElement;
    .param p3, "importance"    # I
    .param p4, "isCrashedThread"    # Z

    .prologue
    .line 659
    const/4 v6, 0x1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v4

    .line 660
    .local v4, "size":I
    const/4 v6, 0x2

    invoke-static {v6, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v6

    add-int/2addr v4, v6

    .line 662
    move-object v0, p2

    .local v0, "arr$":[Ljava/lang/StackTraceElement;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v5, v0, v2

    .line 663
    .local v5, "stackTraceElement":Ljava/lang/StackTraceElement;
    invoke-direct {p0, v5, p4}, Lcom/crashlytics/android/core/SessionDataWriter;->getFrameSize(Ljava/lang/StackTraceElement;Z)I

    move-result v1

    .line 664
    .local v1, "frameSize":I
    const/4 v6, 0x3

    invoke-static {v6}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v6

    invoke-static {v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v6, v1

    add-int/2addr v4, v6

    .line 662
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 668
    .end local v1    # "frameSize":I
    .end local v5    # "stackTraceElement":Ljava/lang/StackTraceElement;
    :cond_0
    return v4
.end method

.method private stringToByteString(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;
    .locals 1
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 672
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    goto :goto_0
.end method

.method private writeFrame(Lcom/crashlytics/android/core/CodedOutputStream;ILjava/lang/StackTraceElement;Z)V
    .locals 6
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "fieldIndex"    # I
    .param p3, "element"    # Ljava/lang/StackTraceElement;
    .param p4, "isCrashedThread"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v0, 0x4

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 327
    invoke-virtual {p1, p2, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 328
    invoke-direct {p0, p3, p4}, Lcom/crashlytics/android/core/SessionDataWriter;->getFrameSize(Ljava/lang/StackTraceElement;Z)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 330
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 333
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v4, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 338
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-virtual {p1, v5, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 341
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 342
    const/4 v2, 0x3

    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 347
    :cond_0
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    if-lez v2, :cond_1

    .line 348
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 354
    :cond_1
    const/4 v2, 0x5

    if-eqz p4, :cond_3

    :goto_1
    invoke-virtual {p1, v2, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 355
    return-void

    .line 335
    :cond_2
    const-wide/16 v2, 0x0

    invoke-virtual {p1, v4, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 354
    goto :goto_1
.end method

.method private writeSessionEventApp(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)V
    .locals 3
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "thread"    # Ljava/lang/Thread;
    .param p3, "ex"    # Ljava/lang/Throwable;
    .param p4, "orientation"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/crashlytics/android/core/CodedOutputStream;",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            "I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .local p5, "customAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v2, 0x3

    .line 210
    const/4 v0, 0x2

    invoke-virtual {p1, v2, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 211
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppSize(Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 213
    invoke-direct {p0, p1, p2, p3}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventAppExecution(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 215
    if-eqz p5, :cond_0

    invoke-interface {p5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    invoke-direct {p0, p1, p5}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventAppCustomAttributes(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/util/Map;)V

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->runningAppProcessInfo:Landroid/app/ActivityManager$RunningAppProcessInfo;

    if-eqz v0, :cond_1

    .line 222
    iget-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->runningAppProcessInfo:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v2, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBool(IZ)V

    .line 226
    :cond_1
    const/4 v0, 0x4

    invoke-virtual {p1, v0, p4}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 227
    return-void

    .line 222
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private writeSessionEventAppCustomAttributes(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/util/Map;)V
    .locals 6
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/crashlytics/android/core/CodedOutputStream;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .local p2, "customAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v5, 0x2

    .line 266
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 267
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {p1, v5, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 268
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppCustomAttributeSize(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 271
    const/4 v4, 0x1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v3

    invoke-virtual {p1, v4, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 272
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 273
    .local v2, "value":Ljava/lang/String;
    if-nez v2, :cond_0

    const-string v2, ""

    .end local v2    # "value":Ljava/lang/String;
    :cond_0
    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v3

    invoke-virtual {p1, v5, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    goto :goto_0

    .line 275
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    return-void
.end method

.method private writeSessionEventAppExecution(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "exceptionThread"    # Ljava/lang/Thread;
    .param p3, "ex"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 231
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 232
    invoke-direct {p0, p2, p3}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionSize(Ljava/lang/Thread;Ljava/lang/Throwable;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 234
    iget-object v3, p0, Lcom/crashlytics/android/core/SessionDataWriter;->exceptionStack:[Ljava/lang/StackTraceElement;

    const/4 v4, 0x4

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/core/SessionDataWriter;->writeThread(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)V

    .line 238
    iget-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->threads:[Ljava/lang/Thread;

    array-length v7, v0

    .line 239
    .local v7, "len":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_0
    if-ge v6, v7, :cond_0

    .line 240
    iget-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->threads:[Ljava/lang/Thread;

    aget-object v2, v0, v6

    .line 241
    .local v2, "thread":Ljava/lang/Thread;
    iget-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->stacks:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/StackTraceElement;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/core/SessionDataWriter;->writeThread(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)V

    .line 239
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 244
    .end local v2    # "thread":Ljava/lang/Thread;
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-direct {p0, p1, p3, v0, v1}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventAppExecutionException(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Throwable;II)V

    .line 246
    const/4 v0, 0x3

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 247
    invoke-direct {p0}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionSignalSize()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 248
    const/4 v0, 0x1

    sget-object v1, Lcom/crashlytics/android/core/SessionDataWriter;->SIGNAL_DEFAULT_BYTE_STRING:Lcom/crashlytics/android/core/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 249
    const/4 v0, 0x2

    sget-object v1, Lcom/crashlytics/android/core/SessionDataWriter;->SIGNAL_DEFAULT_BYTE_STRING:Lcom/crashlytics/android/core/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 250
    const/4 v0, 0x3

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v0, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 252
    const/4 v0, 0x4

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 253
    invoke-direct {p0}, Lcom/crashlytics/android/core/SessionDataWriter;->getBinaryImageSize()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 254
    const/4 v0, 0x1

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v0, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 255
    const/4 v0, 0x2

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v0, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 256
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/crashlytics/android/core/SessionDataWriter;->packageNameBytes:Lcom/crashlytics/android/core/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 257
    iget-object v0, p0, Lcom/crashlytics/android/core/SessionDataWriter;->optionalBuildIdBytes:Lcom/crashlytics/android/core/ByteString;

    if-eqz v0, :cond_1

    .line 258
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/crashlytics/android/core/SessionDataWriter;->optionalBuildIdBytes:Lcom/crashlytics/android/core/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 260
    :cond_1
    return-void
.end method

.method private writeSessionEventAppExecutionException(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Throwable;II)V
    .locals 10
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "ex"    # Ljava/lang/Throwable;
    .param p3, "chainDepth"    # I
    .param p4, "field"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    .line 280
    const/4 v7, 0x2

    invoke-virtual {p1, p4, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 281
    invoke-direct {p0, p2, v9}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventAppExecutionExceptionSize(Ljava/lang/Throwable;I)I

    move-result v7

    invoke-virtual {p1, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 283
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v7

    invoke-virtual {p1, v9, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 284
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v5

    .line 285
    .local v5, "message":Ljava/lang/String;
    if-eqz v5, :cond_0

    .line 286
    const/4 v7, 0x3

    invoke-static {v5}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v8

    invoke-virtual {p1, v7, v8}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 289
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/StackTraceElement;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_1

    aget-object v2, v0, v3

    .line 290
    .local v2, "element":Ljava/lang/StackTraceElement;
    const/4 v7, 0x4

    invoke-direct {p0, p1, v7, v2, v9}, Lcom/crashlytics/android/core/SessionDataWriter;->writeFrame(Lcom/crashlytics/android/core/CodedOutputStream;ILjava/lang/StackTraceElement;Z)V

    .line 289
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 293
    .end local v2    # "element":Ljava/lang/StackTraceElement;
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 294
    .local v1, "cause":Ljava/lang/Throwable;
    if-eqz v1, :cond_2

    .line 295
    iget v7, p0, Lcom/crashlytics/android/core/SessionDataWriter;->maxChainedExceptionsDepth:I

    if-ge p3, v7, :cond_3

    .line 296
    add-int/lit8 v7, p3, 0x1

    const/4 v8, 0x6

    invoke-direct {p0, p1, v1, v7, v8}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventAppExecutionException(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Throwable;II)V

    .line 308
    :cond_2
    :goto_1
    return-void

    .line 300
    :cond_3
    const/4 v6, 0x0

    .line 301
    .local v6, "overflowCount":I
    :goto_2
    if-eqz v1, :cond_4

    .line 302
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 303
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 305
    :cond_4
    const/4 v7, 0x7

    invoke-virtual {p1, v7, v6}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    goto :goto_1
.end method

.method private writeSessionEventDevice(Lcom/crashlytics/android/core/CodedOutputStream;FIZIJJ)V
    .locals 12
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "batteryLevel"    # F
    .param p3, "batterVelocity"    # I
    .param p4, "proximityEnabled"    # Z
    .param p5, "orientation"    # I
    .param p6, "heapAllocatedSize"    # J
    .param p8, "diskUsed"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 361
    const/4 v2, 0x5

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    move-object v3, p0

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    .line 362
    invoke-direct/range {v3 .. v11}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventDeviceSize(FIZIJJ)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 364
    const/4 v2, 0x1

    invoke-virtual {p1, v2, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeFloat(IF)V

    .line 365
    const/4 v2, 0x2

    invoke-virtual {p1, v2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeSInt32(II)V

    .line 366
    const/4 v2, 0x3

    move/from16 v0, p4

    invoke-virtual {p1, v2, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBool(IZ)V

    .line 367
    const/4 v2, 0x4

    move/from16 v0, p5

    invoke-virtual {p1, v2, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 368
    const/4 v2, 0x5

    move-wide/from16 v0, p6

    invoke-virtual {p1, v2, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 369
    const/4 v2, 0x6

    move-wide/from16 v0, p8

    invoke-virtual {p1, v2, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 370
    return-void
.end method

.method private writeSessionEventLog(Lcom/crashlytics/android/core/CodedOutputStream;Lcom/crashlytics/android/core/ByteString;)V
    .locals 2
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "log"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 373
    if-eqz p2, :cond_0

    .line 374
    const/4 v0, 0x6

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 375
    invoke-direct {p0, p2}, Lcom/crashlytics/android/core/SessionDataWriter;->getEventLogSize(Lcom/crashlytics/android/core/ByteString;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 376
    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 378
    :cond_0
    return-void
.end method

.method private writeThread(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)V
    .locals 8
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "thread"    # Ljava/lang/Thread;
    .param p3, "stackTraceElements"    # [Ljava/lang/StackTraceElement;
    .param p4, "importance"    # I
    .param p5, "isCrashedThread"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    .line 314
    invoke-virtual {p1, v6, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 315
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/crashlytics/android/core/SessionDataWriter;->getThreadSize(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;IZ)I

    move-result v3

    .line 316
    .local v3, "s":I
    invoke-virtual {p1, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 317
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v5

    invoke-virtual {p1, v6, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 318
    invoke-virtual {p1, v7, p4}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 320
    move-object v0, p3

    .local v0, "arr$":[Ljava/lang/StackTraceElement;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v4, v0, v1

    .line 321
    .local v4, "stackTraceElement":Ljava/lang/StackTraceElement;
    const/4 v5, 0x3

    invoke-direct {p0, p1, v5, v4, p5}, Lcom/crashlytics/android/core/SessionDataWriter;->writeFrame(Lcom/crashlytics/android/core/CodedOutputStream;ILjava/lang/StackTraceElement;Z)V

    .line 320
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 323
    .end local v4    # "stackTraceElement":Ljava/lang/StackTraceElement;
    :cond_0
    return-void
.end method


# virtual methods
.method public writeBeginSession(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "sessionId"    # Ljava/lang/String;
    .param p3, "generator"    # Ljava/lang/String;
    .param p4, "startedAtSeconds"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 56
    const/4 v0, 0x1

    invoke-static {p3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 57
    const/4 v0, 0x2

    invoke-static {p2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 58
    const/4 v0, 0x3

    invoke-virtual {p1, v0, p4, p5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 59
    return-void
.end method

.method public writeSessionApp(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "packageName"    # Ljava/lang/String;
    .param p3, "versionCode"    # Ljava/lang/String;
    .param p4, "versionName"    # Ljava/lang/String;
    .param p5, "installUuid"    # Ljava/lang/String;
    .param p6, "deliveryMechanism"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x2

    .line 64
    invoke-static {p2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    .line 65
    .local v1, "packageNameBytes":Lcom/crashlytics/android/core/ByteString;
    invoke-static {p3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    .line 66
    .local v2, "versionCodeBytes":Lcom/crashlytics/android/core/ByteString;
    invoke-static {p4}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v3

    .line 67
    .local v3, "versionNameBytes":Lcom/crashlytics/android/core/ByteString;
    invoke-static {p5}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v4

    .line 70
    .local v4, "installIdBytes":Lcom/crashlytics/android/core/ByteString;
    const/4 v0, 0x7

    invoke-virtual {p1, v0, v6}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    move-object v0, p0

    move v5, p6

    .line 71
    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/core/SessionDataWriter;->getSessionAppSize(Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 73
    invoke-virtual {p1, v7, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 74
    invoke-virtual {p1, v6, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 75
    const/4 v0, 0x3

    invoke-virtual {p1, v0, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 78
    const/4 v0, 0x5

    invoke-virtual {p1, v0, v6}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 79
    invoke-direct {p0}, Lcom/crashlytics/android/core/SessionDataWriter;->getSessionAppOrgSize()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 80
    new-instance v0, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    iget-object v5, p0, Lcom/crashlytics/android/core/SessionDataWriter;->context:Landroid/content/Context;

    invoke-virtual {v0, v5}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v7, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeString(ILjava/lang/String;)V

    .line 83
    const/4 v0, 0x6

    invoke-virtual {p1, v0, v4}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 84
    const/16 v0, 0xa

    invoke-virtual {p1, v0, p6}, Lcom/crashlytics/android/core/CodedOutputStream;->writeEnum(II)V

    .line 85
    return-void
.end method

.method public writeSessionDevice(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/String;ILjava/lang/String;IJJZLjava/util/Map;ILjava/lang/String;Ljava/lang/String;)V
    .locals 20
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "clsDeviceId"    # Ljava/lang/String;
    .param p3, "arch"    # I
    .param p4, "model"    # Ljava/lang/String;
    .param p5, "availableProcessors"    # I
    .param p6, "totalRam"    # J
    .param p8, "diskSpace"    # J
    .param p10, "isEmulator"    # Z
    .param p12, "state"    # I
    .param p13, "manufacturer"    # Ljava/lang/String;
    .param p14, "modelClass"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/crashlytics/android/core/CodedOutputStream;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "IJJZ",
            "Ljava/util/Map",
            "<",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 105
    .local p11, "ids":Ljava/util/Map;, "Ljava/util/Map<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    invoke-static/range {p2 .. p2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v7

    .line 106
    .local v7, "clsDeviceIDBytes":Lcom/crashlytics/android/core/ByteString;
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/SessionDataWriter;->stringToByteString(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v8

    .line 107
    .local v8, "modelBytes":Lcom/crashlytics/android/core/ByteString;
    move-object/from16 v0, p0

    move-object/from16 v1, p14

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/SessionDataWriter;->stringToByteString(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v18

    .line 108
    .local v18, "modelClassBytes":Lcom/crashlytics/android/core/ByteString;
    move-object/from16 v0, p0

    move-object/from16 v1, p13

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/SessionDataWriter;->stringToByteString(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v17

    .line 110
    .local v17, "manufacturerBytes":Lcom/crashlytics/android/core/ByteString;
    const/16 v5, 0x9

    const/4 v6, 0x2

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v6}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    move-object/from16 v5, p0

    move/from16 v6, p3

    move/from16 v9, p5

    move-wide/from16 v10, p6

    move-wide/from16 v12, p8

    move/from16 v14, p10

    move-object/from16 v15, p11

    move/from16 v16, p12

    .line 112
    invoke-direct/range {v5 .. v18}, Lcom/crashlytics/android/core/SessionDataWriter;->getSessionDeviceSize(ILcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;IJJZLjava/util/Map;ILcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;)I

    move-result v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 116
    const/4 v5, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 118
    const/4 v5, 0x3

    move-object/from16 v0, p1

    move/from16 v1, p3

    invoke-virtual {v0, v5, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeEnum(II)V

    .line 119
    const/4 v5, 0x4

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v8}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 120
    const/4 v5, 0x5

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v5, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 121
    const/4 v5, 0x6

    move-object/from16 v0, p1

    move-wide/from16 v1, p6

    invoke-virtual {v0, v5, v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 122
    const/4 v5, 0x7

    move-object/from16 v0, p1

    move-wide/from16 v1, p8

    invoke-virtual {v0, v5, v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 123
    const/16 v5, 0xa

    move-object/from16 v0, p1

    move/from16 v1, p10

    invoke-virtual {v0, v5, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBool(IZ)V

    .line 125
    invoke-interface/range {p11 .. p11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/util/Map$Entry;

    .line 126
    .local v19, "id":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    const/16 v5, 0xb

    const/4 v6, 0x2

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v6}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 127
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v5, v6}, Lcom/crashlytics/android/core/SessionDataWriter;->getDeviceIdentifierSize(Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 129
    const/4 v6, 0x1

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    iget v5, v5, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->protobufIndex:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v6, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeEnum(II)V

    .line 130
    const/4 v6, 0x2

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v6, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    goto :goto_0

    .line 132
    .end local v19    # "id":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    :cond_0
    const/16 v5, 0xc

    move-object/from16 v0, p1

    move/from16 v1, p12

    invoke-virtual {v0, v5, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 134
    if-eqz v17, :cond_1

    .line 135
    const/16 v5, 0xd

    move-object/from16 v0, p1

    move-object/from16 v1, v17

    invoke-virtual {v0, v5, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 137
    :cond_1
    if-eqz v18, :cond_2

    .line 138
    const/16 v5, 0xe

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v5, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 140
    :cond_2
    return-void
.end method

.method public writeSessionEvent(Lcom/crashlytics/android/core/CodedOutputStream;JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Thread;FIZIJJLandroid/app/ActivityManager$RunningAppProcessInfo;Ljava/util/List;[Ljava/lang/StackTraceElement;Lcom/crashlytics/android/core/LogFileManager;Ljava/util/Map;)V
    .locals 22
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "eventTime"    # J
    .param p4, "thread"    # Ljava/lang/Thread;
    .param p5, "ex"    # Ljava/lang/Throwable;
    .param p6, "eventType"    # Ljava/lang/String;
    .param p7, "threads"    # [Ljava/lang/Thread;
    .param p8, "batteryLevel"    # F
    .param p9, "batteryVelocity"    # I
    .param p10, "proximityEnabled"    # Z
    .param p11, "orientation"    # I
    .param p12, "usedRamBytes"    # J
    .param p14, "diskUsedBytes"    # J
    .param p16, "runningAppProcessInfo"    # Landroid/app/ActivityManager$RunningAppProcessInfo;
    .param p18, "exceptionStack"    # [Ljava/lang/StackTraceElement;
    .param p19, "logFileManager"    # Lcom/crashlytics/android/core/LogFileManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/crashlytics/android/core/CodedOutputStream;",
            "J",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Thread;",
            "FIZIJJ",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/StackTraceElement;",
            ">;[",
            "Ljava/lang/StackTraceElement;",
            "Lcom/crashlytics/android/core/LogFileManager;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 180
    .local p17, "stacks":Ljava/util/List;, "Ljava/util/List<[Ljava/lang/StackTraceElement;>;"
    .local p20, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p16

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/crashlytics/android/core/SessionDataWriter;->runningAppProcessInfo:Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 181
    move-object/from16 v0, p17

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/crashlytics/android/core/SessionDataWriter;->stacks:Ljava/util/List;

    .line 182
    move-object/from16 v0, p18

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/crashlytics/android/core/SessionDataWriter;->exceptionStack:[Ljava/lang/StackTraceElement;

    .line 183
    move-object/from16 v0, p7

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/crashlytics/android/core/SessionDataWriter;->threads:[Ljava/lang/Thread;

    .line 185
    invoke-virtual/range {p19 .. p19}, Lcom/crashlytics/android/core/LogFileManager;->getByteStringForLog()Lcom/crashlytics/android/core/ByteString;

    move-result-object v20

    .line 187
    .local v20, "logByteString":Lcom/crashlytics/android/core/ByteString;
    if-nez v20, :cond_0

    .line 188
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v4

    const-string v5, "CrashlyticsCore"

    const-string v6, "No log data to include with this event."

    invoke-interface {v4, v5, v6}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    :cond_0
    invoke-virtual/range {p19 .. p19}, Lcom/crashlytics/android/core/LogFileManager;->clearLog()V

    .line 194
    const/16 v4, 0xa

    const/4 v5, 0x2

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    move-object/from16 v5, p0

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-wide/from16 v9, p2

    move-object/from16 v11, p20

    move/from16 v12, p8

    move/from16 v13, p9

    move/from16 v14, p10

    move/from16 v15, p11

    move-wide/from16 v16, p12

    move-wide/from16 v18, p14

    .line 195
    invoke-direct/range {v5 .. v20}, Lcom/crashlytics/android/core/SessionDataWriter;->getSessionEventSize(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;JLjava/util/Map;FIZIJJLcom/crashlytics/android/core/ByteString;)I

    move-result v4

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 198
    const/4 v4, 0x1

    move-object/from16 v0, p1

    move-wide/from16 v1, p2

    invoke-virtual {v0, v4, v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 199
    const/4 v4, 0x2

    invoke-static/range {p6 .. p6}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p11

    move-object/from16 v9, p20

    .line 201
    invoke-direct/range {v4 .. v9}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventApp(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/Thread;Ljava/lang/Throwable;ILjava/util/Map;)V

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p10

    move/from16 v9, p11

    move-wide/from16 v10, p12

    move-wide/from16 v12, p14

    .line 202
    invoke-direct/range {v4 .. v13}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventDevice(Lcom/crashlytics/android/core/CodedOutputStream;FIZIJJ)V

    .line 204
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Lcom/crashlytics/android/core/SessionDataWriter;->writeSessionEventLog(Lcom/crashlytics/android/core/CodedOutputStream;Lcom/crashlytics/android/core/ByteString;)V

    .line 205
    return-void
.end method

.method public writeSessionOS(Lcom/crashlytics/android/core/CodedOutputStream;Z)V
    .locals 5
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "isRooted"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x2

    .line 88
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    .line 89
    .local v1, "releaseBytes":Lcom/crashlytics/android/core/ByteString;
    sget-object v2, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    .line 91
    .local v0, "codeNameBytes":Lcom/crashlytics/android/core/ByteString;
    const/16 v2, 0x8

    invoke-virtual {p1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 92
    invoke-direct {p0, v1, v0, p2}, Lcom/crashlytics/android/core/SessionDataWriter;->getSessionOSSize(Lcom/crashlytics/android/core/ByteString;Lcom/crashlytics/android/core/ByteString;Z)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 93
    const/4 v2, 0x1

    invoke-virtual {p1, v2, v4}, Lcom/crashlytics/android/core/CodedOutputStream;->writeEnum(II)V

    .line 94
    invoke-virtual {p1, v3, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 95
    invoke-virtual {p1, v4, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 96
    const/4 v2, 0x4

    invoke-virtual {p1, v2, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBool(IZ)V

    .line 97
    return-void
.end method

.method public writeSessionUser(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .param p2, "id"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "email"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v5, 0x2

    .line 145
    if-nez p2, :cond_0

    const-string p2, ""

    .end local p2    # "id":Ljava/lang/String;
    :cond_0
    invoke-static {p2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    .line 146
    .local v1, "idBytes":Lcom/crashlytics/android/core/ByteString;
    invoke-direct {p0, p3}, Lcom/crashlytics/android/core/SessionDataWriter;->stringToByteString(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    .line 147
    .local v2, "nameBytes":Lcom/crashlytics/android/core/ByteString;
    invoke-direct {p0, p4}, Lcom/crashlytics/android/core/SessionDataWriter;->stringToByteString(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    .line 149
    .local v0, "emailBytes":Lcom/crashlytics/android/core/ByteString;
    const/4 v3, 0x0

    .line 150
    .local v3, "size":I
    invoke-static {v6, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v4

    add-int/2addr v3, v4

    .line 151
    if-eqz p3, :cond_1

    .line 152
    invoke-static {v5, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v4

    add-int/2addr v3, v4

    .line 154
    :cond_1
    if-eqz p4, :cond_2

    .line 155
    invoke-static {v7, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v4

    add-int/2addr v3, v4

    .line 158
    :cond_2
    const/4 v4, 0x6

    invoke-virtual {p1, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 159
    invoke-virtual {p1, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 160
    invoke-virtual {p1, v6, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 161
    if-eqz p3, :cond_3

    .line 162
    invoke-virtual {p1, v5, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 164
    :cond_3
    if-eqz p4, :cond_4

    .line 165
    invoke-virtual {p1, v7, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 167
    :cond_4
    return-void
.end method
