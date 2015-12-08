.class final Lcom/crashlytics/android/core/CodedOutputStream;
.super Ljava/lang/Object;
.source "CodedOutputStream.java"

# interfaces
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/crashlytics/android/core/CodedOutputStream$OutOfSpaceException;
    }
.end annotation


# static fields
.field public static final DEFAULT_BUFFER_SIZE:I = 0x1000

.field public static final LITTLE_ENDIAN_32_SIZE:I = 0x4

.field public static final LITTLE_ENDIAN_64_SIZE:I = 0x8


# instance fields
.field private final buffer:[B

.field private final limit:I

.field private final output:Ljava/io/OutputStream;

.field private position:I


# direct methods
.method private constructor <init>(Ljava/io/OutputStream;[B)V
    .locals 1
    .param p1, "output"    # Ljava/io/OutputStream;
    .param p2, "buffer"    # [B

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    .line 89
    iput-object p2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 91
    array-length v0, p2

    iput v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    .line 92
    return-void
.end method

.method private constructor <init>([BII)V
    .locals 1
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    .line 82
    iput-object p1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    .line 83
    iput p2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 84
    add-int v0, p2, p3

    iput v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    .line 85
    return-void
.end method

.method public static computeBoolSize(IZ)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # Z

    .prologue
    .line 428
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBoolSizeNoTag(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeBoolSizeNoTag(Z)I
    .locals 1
    .param p0, "value"    # Z

    .prologue
    .line 580
    const/4 v0, 0x1

    return v0
.end method

.method public static computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # Lcom/crashlytics/android/core/ByteString;

    .prologue
    .line 446
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSizeNoTag(Lcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeBytesSizeNoTag(Lcom/crashlytics/android/core/ByteString;)I
    .locals 2
    .param p0, "value"    # Lcom/crashlytics/android/core/ByteString;

    .prologue
    .line 602
    invoke-virtual {p0}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v0

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeDoubleSize(ID)I
    .locals 3
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # D

    .prologue
    .line 369
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeDoubleSizeNoTag(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeDoubleSizeNoTag(D)I
    .locals 1
    .param p0, "value"    # D

    .prologue
    .line 519
    const/16 v0, 0x8

    return v0
.end method

.method public static computeEnumSize(II)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # I

    .prologue
    .line 463
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeEnumSizeNoTag(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeEnumSizeNoTag(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 619
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    return v0
.end method

.method public static computeFixed32Size(II)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # I

    .prologue
    .line 419
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeFixed32SizeNoTag(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeFixed32SizeNoTag(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 572
    const/4 v0, 0x4

    return v0
.end method

.method public static computeFixed64Size(IJ)I
    .locals 3
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # J

    .prologue
    .line 410
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeFixed64SizeNoTag(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeFixed64SizeNoTag(J)I
    .locals 1
    .param p0, "value"    # J

    .prologue
    .line 564
    const/16 v0, 0x8

    return v0
.end method

.method public static computeFloatSize(IF)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # F

    .prologue
    .line 377
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeFloatSizeNoTag(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeFloatSizeNoTag(F)I
    .locals 1
    .param p0, "value"    # F

    .prologue
    .line 527
    const/4 v0, 0x4

    return v0
.end method

.method public static computeInt32Size(II)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # I

    .prologue
    .line 401
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeInt32SizeNoTag(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 551
    if-ltz p0, :cond_0

    .line 552
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v0

    .line 555
    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static computeInt64Size(IJ)I
    .locals 3
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # J

    .prologue
    .line 393
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeInt64SizeNoTag(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeInt64SizeNoTag(J)I
    .locals 2
    .param p0, "value"    # J

    .prologue
    .line 543
    invoke-static {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint64Size(J)I

    move-result v0

    return v0
.end method

.method static computePreferredBufferSize(I)I
    .locals 1
    .param p0, "dataLength"    # I

    .prologue
    const/16 v0, 0x1000

    .line 75
    if-le p0, v0, :cond_0

    move p0, v0

    .line 76
    .end local p0    # "dataLength":I
    :cond_0
    return p0
.end method

.method public static computeRawMessageSetExtensionSize(ILcom/crashlytics/android/core/ByteString;)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # Lcom/crashlytics/android/core/ByteString;

    .prologue
    .line 507
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-static {v1, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeRawVarint32Size(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 859
    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 863
    :goto_0
    return v0

    .line 860
    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    .line 861
    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    .line 862
    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr v0, p0

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    .line 863
    :cond_3
    const/4 v0, 0x5

    goto :goto_0
.end method

.method public static computeRawVarint64Size(J)I
    .locals 4
    .param p0, "value"    # J

    .prologue
    const-wide/16 v2, 0x0

    .line 881
    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 890
    :goto_0
    return v0

    .line 882
    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    .line 883
    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    .line 884
    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    .line 885
    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 v0, 0x5

    goto :goto_0

    .line 886
    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 v0, 0x6

    goto :goto_0

    .line 887
    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 v0, 0x7

    goto :goto_0

    .line 888
    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 v0, 0x8

    goto :goto_0

    .line 889
    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    const/16 v0, 0x9

    goto :goto_0

    .line 890
    :cond_8
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static computeSFixed32Size(II)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # I

    .prologue
    .line 472
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeSFixed32SizeNoTag(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeSFixed32SizeNoTag(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 627
    const/4 v0, 0x4

    return v0
.end method

.method public static computeSFixed64Size(IJ)I
    .locals 3
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # J

    .prologue
    .line 481
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeSFixed64SizeNoTag(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeSFixed64SizeNoTag(J)I
    .locals 1
    .param p0, "value"    # J

    .prologue
    .line 635
    const/16 v0, 0x8

    return v0
.end method

.method public static computeSInt32Size(II)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # I

    .prologue
    .line 489
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeSInt32SizeNoTag(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeSInt32SizeNoTag(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 643
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->encodeZigZag32(I)I

    move-result v0

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v0

    return v0
.end method

.method public static computeSInt64Size(IJ)I
    .locals 3
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # J

    .prologue
    .line 497
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeSInt64SizeNoTag(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeSInt64SizeNoTag(J)I
    .locals 2
    .param p0, "value"    # J

    .prologue
    .line 651
    invoke-static {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->encodeZigZag64(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint64Size(J)I

    move-result v0

    return v0
.end method

.method public static computeStringSize(ILjava/lang/String;)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 437
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeStringSizeNoTag(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeStringSizeNoTag(Ljava/lang/String;)I
    .locals 4
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 589
    :try_start_0
    const-string v2, "UTF-8"

    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 590
    .local v0, "bytes":[B
    array-length v2, v0

    invoke-static {v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v2

    array-length v3, v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v2, v3

    return v2

    .line 592
    .end local v0    # "bytes":[B
    :catch_0
    move-exception v1

    .line 593
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "UTF-8 not supported."

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static computeTagSize(I)I
    .locals 1
    .param p0, "fieldNumber"    # I

    .prologue
    .line 834
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/crashlytics/android/core/WireFormat;->makeTag(II)I

    move-result v0

    invoke-static {v0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v0

    return v0
.end method

.method public static computeUInt32Size(II)I
    .locals 2
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # I

    .prologue
    .line 454
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32SizeNoTag(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeUInt32SizeNoTag(I)I
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 611
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint32Size(I)I

    move-result v0

    return v0
.end method

.method public static computeUInt64Size(IJ)I
    .locals 3
    .param p0, "fieldNumber"    # I
    .param p1, "value"    # J

    .prologue
    .line 385
    invoke-static {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->computeTagSize(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64SizeNoTag(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static computeUInt64SizeNoTag(J)I
    .locals 2
    .param p0, "value"    # J

    .prologue
    .line 535
    invoke-static {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeRawVarint64Size(J)I

    move-result v0

    return v0
.end method

.method public static encodeZigZag32(I)I
    .locals 2
    .param p0, "n"    # I

    .prologue
    .line 929
    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 v1, p0, 0x1f

    xor-int/2addr v0, v1

    return v0
.end method

.method public static encodeZigZag64(J)J
    .locals 4
    .param p0, "n"    # J

    .prologue
    .line 944
    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long v2, p0, v2

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method public static newInstance(Ljava/io/OutputStream;)Lcom/crashlytics/android/core/CodedOutputStream;
    .locals 1
    .param p0, "output"    # Ljava/io/OutputStream;

    .prologue
    .line 99
    const/16 v0, 0x1000

    invoke-static {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->newInstance(Ljava/io/OutputStream;I)Lcom/crashlytics/android/core/CodedOutputStream;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance(Ljava/io/OutputStream;I)Lcom/crashlytics/android/core/CodedOutputStream;
    .locals 2
    .param p0, "output"    # Ljava/io/OutputStream;
    .param p1, "bufferSize"    # I

    .prologue
    .line 108
    new-instance v0, Lcom/crashlytics/android/core/CodedOutputStream;

    new-array v1, p1, [B

    invoke-direct {v0, p0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;-><init>(Ljava/io/OutputStream;[B)V

    return-object v0
.end method

.method public static newInstance([B)Lcom/crashlytics/android/core/CodedOutputStream;
    .locals 2
    .param p0, "flatArray"    # [B

    .prologue
    .line 119
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->newInstance([BII)Lcom/crashlytics/android/core/CodedOutputStream;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance([BII)Lcom/crashlytics/android/core/CodedOutputStream;
    .locals 1
    .param p0, "flatArray"    # [B
    .param p1, "offset"    # I
    .param p2, "length"    # I

    .prologue
    .line 132
    new-instance v0, Lcom/crashlytics/android/core/CodedOutputStream;

    invoke-direct {v0, p0, p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;-><init>([BII)V

    return-object v0
.end method

.method private refreshBuffer()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 661
    iget-object v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    .line 663
    new-instance v0, Lcom/crashlytics/android/core/CodedOutputStream$OutOfSpaceException;

    invoke-direct {v0}, Lcom/crashlytics/android/core/CodedOutputStream$OutOfSpaceException;-><init>()V

    throw v0

    .line 668
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    iget v2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 669
    iput v3, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 670
    return-void
.end method


# virtual methods
.method public checkNoSpaceLeft()V
    .locals 2

    .prologue
    .line 704
    invoke-virtual {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->spaceLeft()I

    move-result v0

    if-eqz v0, :cond_0

    .line 705
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 708
    :cond_0
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 677
    iget-object v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 678
    invoke-direct {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->refreshBuffer()V

    .line 680
    :cond_0
    return-void
.end method

.method public spaceLeft()I
    .locals 2

    .prologue
    .line 687
    iget-object v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    .line 688
    iget v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    sub-int/2addr v0, v1

    return v0

    .line 690
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public writeBool(IZ)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 189
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 190
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBoolNoTag(Z)V

    .line 191
    return-void
.end method

.method public writeBoolNoTag(Z)V
    .locals 1
    .param p1, "value"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 309
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 310
    return-void

    .line 309
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeBytes(ILcom/crashlytics/android/core/ByteString;)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 203
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 204
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytesNoTag(Lcom/crashlytics/android/core/ByteString;)V

    .line 205
    return-void
.end method

.method public writeBytesNoTag(Lcom/crashlytics/android/core/ByteString;)V
    .locals 1
    .param p1, "value"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 324
    invoke-virtual {p1}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 325
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawBytes(Lcom/crashlytics/android/core/ByteString;)V

    .line 326
    return-void
.end method

.method public writeDouble(ID)V
    .locals 2
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # D
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 140
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 141
    invoke-virtual {p0, p2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeDoubleNoTag(D)V

    .line 142
    return-void
.end method

.method public writeDoubleNoTag(D)V
    .locals 3
    .param p1, "value"    # D
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 269
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawLittleEndian64(J)V

    .line 270
    return-void
.end method

.method public writeEnum(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 220
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 221
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeEnumNoTag(I)V

    .line 222
    return-void
.end method

.method public writeEnumNoTag(I)V
    .locals 0
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 338
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeInt32NoTag(I)V

    .line 339
    return-void
.end method

.method public writeFixed32(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 182
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 183
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeFixed32NoTag(I)V

    .line 184
    return-void
.end method

.method public writeFixed32NoTag(I)V
    .locals 0
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 304
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawLittleEndian32(I)V

    .line 305
    return-void
.end method

.method public writeFixed64(IJ)V
    .locals 2
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 175
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 176
    invoke-virtual {p0, p2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeFixed64NoTag(J)V

    .line 177
    return-void
.end method

.method public writeFixed64NoTag(J)V
    .locals 1
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 299
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawLittleEndian64(J)V

    .line 300
    return-void
.end method

.method public writeFloat(IF)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # F
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 147
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 148
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeFloatNoTag(F)V

    .line 149
    return-void
.end method

.method public writeFloatNoTag(F)V
    .locals 1
    .param p1, "value"    # F
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 274
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawLittleEndian32(I)V

    .line 275
    return-void
.end method

.method public writeInt32(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 168
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 169
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeInt32NoTag(I)V

    .line 170
    return-void
.end method

.method public writeInt32NoTag(I)V
    .locals 2
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 289
    if-ltz p1, :cond_0

    .line 290
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 295
    :goto_0
    return-void

    .line 293
    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint64(J)V

    goto :goto_0
.end method

.method public writeInt64(IJ)V
    .locals 2
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 161
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 162
    invoke-virtual {p0, p2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeInt64NoTag(J)V

    .line 163
    return-void
.end method

.method public writeInt64NoTag(J)V
    .locals 1
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 284
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint64(J)V

    .line 285
    return-void
.end method

.method public writeRawByte(B)V
    .locals 3
    .param p1, "value"    # B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 726
    iget v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    if-ne v0, v1, :cond_0

    .line 727
    invoke-direct {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->refreshBuffer()V

    .line 730
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    aput-byte p1, v0, v1

    .line 731
    return-void
.end method

.method public writeRawByte(I)V
    .locals 1
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 735
    int-to-byte v0, p1

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(B)V

    .line 736
    return-void
.end method

.method public writeRawBytes(Lcom/crashlytics/android/core/ByteString;)V
    .locals 2
    .param p1, "value"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 740
    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawBytes(Lcom/crashlytics/android/core/ByteString;II)V

    .line 741
    return-void
.end method

.method public writeRawBytes(Lcom/crashlytics/android/core/ByteString;II)V
    .locals 9
    .param p1, "value"    # Lcom/crashlytics/android/core/ByteString;
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 782
    iget v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iget v5, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    sub-int/2addr v4, v5

    if-lt v4, p3, :cond_1

    .line 784
    iget-object v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    iget v5, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    invoke-virtual {p1, v4, p2, v5, p3}, Lcom/crashlytics/android/core/ByteString;->copyTo([BIII)V

    .line 785
    iget v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    add-int/2addr v4, p3

    iput v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 824
    :cond_0
    :goto_0
    return-void

    .line 789
    :cond_1
    iget v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iget v5, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    sub-int v2, v4, v5

    .line 790
    .local v2, "bytesWritten":I
    iget-object v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    iget v5, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    invoke-virtual {p1, v4, p2, v5, v2}, Lcom/crashlytics/android/core/ByteString;->copyTo([BIII)V

    .line 791
    add-int/2addr p2, v2

    .line 792
    sub-int/2addr p3, v2

    .line 793
    iget v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iput v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 794
    invoke-direct {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->refreshBuffer()V

    .line 799
    iget v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    if-gt p3, v4, :cond_2

    .line 801
    iget-object v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    invoke-virtual {p1, v4, p2, v8, p3}, Lcom/crashlytics/android/core/ByteString;->copyTo([BIII)V

    .line 802
    iput p3, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    goto :goto_0

    .line 808
    :cond_2
    invoke-virtual {p1}, Lcom/crashlytics/android/core/ByteString;->newInput()Ljava/io/InputStream;

    move-result-object v3

    .line 809
    .local v3, "inputStreamFrom":Ljava/io/InputStream;
    int-to-long v4, p2

    int-to-long v6, p2

    invoke-virtual {v3, v6, v7}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_4

    .line 810
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "Skip failed."

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 819
    .local v0, "bytesRead":I
    .local v1, "bytesToRead":I
    :cond_3
    iget-object v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    iget-object v5, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    invoke-virtual {v4, v5, v8, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 820
    sub-int/2addr p3, v0

    .line 813
    .end local v0    # "bytesRead":I
    .end local v1    # "bytesToRead":I
    :cond_4
    if-lez p3, :cond_0

    .line 814
    iget v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 815
    .restart local v1    # "bytesToRead":I
    iget-object v4, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    invoke-virtual {v3, v4, v8, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 816
    .restart local v0    # "bytesRead":I
    if-eq v0, v1, :cond_3

    .line 817
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "Read failed."

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public writeRawBytes([B)V
    .locals 2
    .param p1, "value"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 745
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawBytes([BII)V

    .line 746
    return-void
.end method

.method public writeRawBytes([BII)V
    .locals 3
    .param p1, "value"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 751
    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iget v2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    sub-int/2addr v1, v2

    if-lt v1, p3, :cond_0

    .line 753
    iget-object v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    iget v2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 754
    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    add-int/2addr v1, p3

    iput v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 777
    :goto_0
    return-void

    .line 758
    :cond_0
    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iget v2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    sub-int v0, v1, v2

    .line 759
    .local v0, "bytesWritten":I
    iget-object v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    iget v2, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 760
    add-int/2addr p2, v0

    .line 761
    sub-int/2addr p3, v0

    .line 762
    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    iput v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    .line 763
    invoke-direct {p0}, Lcom/crashlytics/android/core/CodedOutputStream;->refreshBuffer()V

    .line 768
    iget v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->limit:I

    if-gt p3, v1, :cond_1

    .line 770
    iget-object v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->buffer:[B

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 771
    iput p3, p0, Lcom/crashlytics/android/core/CodedOutputStream;->position:I

    goto :goto_0

    .line 774
    :cond_1
    iget-object v1, p0, Lcom/crashlytics/android/core/CodedOutputStream;->output:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method public writeRawLittleEndian32(I)V
    .locals 1
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 895
    and-int/lit16 v0, p1, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 896
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 897
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 898
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 899
    return-void
.end method

.method public writeRawLittleEndian64(J)V
    .locals 3
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 905
    long-to-int v0, p1

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 906
    const/16 v0, 0x8

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 907
    const/16 v0, 0x10

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 908
    const/16 v0, 0x18

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 909
    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 910
    const/16 v0, 0x28

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 911
    const/16 v0, 0x30

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 912
    const/16 v0, 0x38

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 913
    return-void
.end method

.method public writeRawMessageSetExtension(ILcom/crashlytics/android/core/ByteString;)V
    .locals 3
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # Lcom/crashlytics/android/core/ByteString;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x1

    .line 259
    invoke-virtual {p0, v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 260
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 261
    invoke-virtual {p0, v2, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 262
    const/4 v0, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 263
    return-void
.end method

.method public writeRawVarint32(I)V
    .locals 1
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 843
    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    .line 844
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 845
    return-void

    .line 847
    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 848
    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public writeRawVarint64(J)V
    .locals 5
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 869
    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 870
    long-to-int v0, p1

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 871
    return-void

    .line 873
    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawByte(I)V

    .line 874
    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public writeSFixed32(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 227
    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 228
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeSFixed32NoTag(I)V

    .line 229
    return-void
.end method

.method public writeSFixed32NoTag(I)V
    .locals 0
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 343
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawLittleEndian32(I)V

    .line 344
    return-void
.end method

.method public writeSFixed64(IJ)V
    .locals 2
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 234
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 235
    invoke-virtual {p0, p2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeSFixed64NoTag(J)V

    .line 236
    return-void
.end method

.method public writeSFixed64NoTag(J)V
    .locals 1
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 348
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawLittleEndian64(J)V

    .line 349
    return-void
.end method

.method public writeSInt32(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 241
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 242
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeSInt32NoTag(I)V

    .line 243
    return-void
.end method

.method public writeSInt32NoTag(I)V
    .locals 1
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 353
    invoke-static {p1}, Lcom/crashlytics/android/core/CodedOutputStream;->encodeZigZag32(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 354
    return-void
.end method

.method public writeSInt64(IJ)V
    .locals 2
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 248
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 249
    invoke-virtual {p0, p2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeSInt64NoTag(J)V

    .line 250
    return-void
.end method

.method public writeSInt64NoTag(J)V
    .locals 3
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 358
    invoke-static {p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->encodeZigZag64(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint64(J)V

    .line 359
    return-void
.end method

.method public writeString(ILjava/lang/String;)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 196
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 197
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeStringNoTag(Ljava/lang/String;)V

    .line 198
    return-void
.end method

.method public writeStringNoTag(Ljava/lang/String;)V
    .locals 2
    .param p1, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 317
    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 318
    .local v0, "bytes":[B
    array-length v1, v0

    invoke-virtual {p0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 319
    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawBytes([B)V

    .line 320
    return-void
.end method

.method public writeTag(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "wireType"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 829
    invoke-static {p1, p2}, Lcom/crashlytics/android/core/WireFormat;->makeTag(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 830
    return-void
.end method

.method public writeUInt32(II)V
    .locals 1
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 210
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 211
    invoke-virtual {p0, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 212
    return-void
.end method

.method public writeUInt32NoTag(I)V
    .locals 0
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 330
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint32(I)V

    .line 331
    return-void
.end method

.method public writeUInt64(IJ)V
    .locals 2
    .param p1, "fieldNumber"    # I
    .param p2, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 154
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeTag(II)V

    .line 155
    invoke-virtual {p0, p2, p3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64NoTag(J)V

    .line 156
    return-void
.end method

.method public writeUInt64NoTag(J)V
    .locals 1
    .param p1, "value"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 279
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/core/CodedOutputStream;->writeRawVarint64(J)V

    .line 280
    return-void
.end method
