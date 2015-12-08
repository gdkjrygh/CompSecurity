.class final Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "BinaryImageMessage"
.end annotation


# static fields
.field private static final PROTOBUF_TAG:I = 0x4


# instance fields
.field private final baseAddr:J

.field private final filePath:Ljava/lang/String;

.field private final imageSize:J

.field private final uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/internal/models/BinaryImageData;)V
    .locals 2
    .param p1, "binaryImageData"    # Lcom/crashlytics/android/core/internal/models/BinaryImageData;

    .prologue
    .line 426
    const/4 v0, 0x4

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 427
    iget-wide v0, p1, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->baseAddress:J

    iput-wide v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->baseAddr:J

    .line 428
    iget-wide v0, p1, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->size:J

    iput-wide v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->imageSize:J

    .line 429
    iget-object v0, p1, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->path:Ljava/lang/String;

    iput-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->filePath:Ljava/lang/String;

    .line 430
    iget-object v0, p1, Lcom/crashlytics/android/core/internal/models/BinaryImageData;->id:Ljava/lang/String;

    iput-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->uuid:Ljava/lang/String;

    .line 431
    return-void
.end method


# virtual methods
.method public getPropertiesSize()I
    .locals 8

    .prologue
    .line 435
    const/4 v4, 0x1

    iget-wide v6, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->baseAddr:J

    invoke-static {v4, v6, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v0

    .line 436
    .local v0, "addrSize":I
    const/4 v4, 0x2

    iget-wide v6, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->imageSize:J

    invoke-static {v4, v6, v7}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    .line 437
    .local v1, "imgSize":I
    const/4 v4, 0x3

    iget-object v5, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->filePath:Ljava/lang/String;

    invoke-static {v5}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v2

    .line 439
    .local v2, "pathSize":I
    const/4 v4, 0x4

    iget-object v5, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->uuid:Ljava/lang/String;

    invoke-static {v5}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v3

    .line 442
    .local v3, "uuidSize":I
    add-int v4, v2, v0

    add-int/2addr v4, v1

    add-int/2addr v4, v3

    return v4
.end method

.method public writeProperties(Lcom/crashlytics/android/core/CodedOutputStream;)V
    .locals 4
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 447
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->baseAddr:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 448
    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->imageSize:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 449
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->filePath:Ljava/lang/String;

    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 450
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$BinaryImageMessage;->uuid:Ljava/lang/String;

    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 451
    return-void
.end method
