.class Lcom/crashlytics/android/core/CLSUUID;
.super Ljava/lang/Object;
.source "CLSUUID.java"


# static fields
.field private static _clsId:Ljava/lang/String;

.field private static final _sequenceNumber:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/crashlytics/android/core/CLSUUID;->_sequenceNumber:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 11
    .param p1, "idManager"    # Lio/fabric/sdk/android/services/common/IdManager;

    .prologue
    const/16 v10, 0x10

    const/16 v9, 0xc

    const/4 v8, 0x0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/16 v3, 0xa

    new-array v0, v3, [B

    .line 34
    .local v0, "bytes":[B
    invoke-direct {p0, v0}, Lcom/crashlytics/android/core/CLSUUID;->populateTime([B)V

    .line 35
    invoke-direct {p0, v0}, Lcom/crashlytics/android/core/CLSUUID;->populateSequenceNumber([B)V

    .line 36
    invoke-direct {p0, v0}, Lcom/crashlytics/android/core/CLSUUID;->populatePID([B)V

    .line 41
    invoke-virtual {p1}, Lio/fabric/sdk/android/services/common/IdManager;->getAppInstallIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->sha1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    .local v1, "idSha":Ljava/lang/String;
    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->hexify([B)Ljava/lang/String;

    move-result-object v2

    .line 44
    .local v2, "timeSeqPid":Ljava/lang/String;
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "%s-%s-%s-%s"

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    const/4 v6, 0x1

    invoke-virtual {v2, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x2

    const/16 v7, 0x14

    invoke-virtual {v2, v10, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x3

    invoke-virtual {v1, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/crashlytics/android/core/CLSUUID;->_clsId:Ljava/lang/String;

    .line 47
    return-void
.end method

.method private static convertLongToFourByteBuffer(J)[B
    .locals 2
    .param p0, "value"    # J

    .prologue
    .line 79
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 80
    .local v0, "buf":Ljava/nio/ByteBuffer;
    long-to-int v1, p0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 81
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 82
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 84
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    return-object v1
.end method

.method private static convertLongToTwoByteBuffer(J)[B
    .locals 2
    .param p0, "value"    # J

    .prologue
    .line 88
    const/4 v1, 0x2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 89
    .local v0, "buf":Ljava/nio/ByteBuffer;
    long-to-int v1, p0

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 90
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 91
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 93
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    return-object v1
.end method

.method private populatePID([B)V
    .locals 4
    .param p1, "bytes"    # [B

    .prologue
    .line 72
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 73
    .local v0, "pid":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->shortValue()S

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Lcom/crashlytics/android/core/CLSUUID;->convertLongToTwoByteBuffer(J)[B

    move-result-object v1

    .line 74
    .local v1, "pidBytes":[B
    const/16 v2, 0x8

    const/4 v3, 0x0

    aget-byte v3, v1, v3

    aput-byte v3, p1, v2

    .line 75
    const/16 v2, 0x9

    const/4 v3, 0x1

    aget-byte v3, v1, v3

    aput-byte v3, p1, v2

    .line 76
    return-void
.end method

.method private populateSequenceNumber([B)V
    .locals 4
    .param p1, "bytes"    # [B

    .prologue
    .line 66
    sget-object v1, Lcom/crashlytics/android/core/CLSUUID;->_sequenceNumber:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/crashlytics/android/core/CLSUUID;->convertLongToTwoByteBuffer(J)[B

    move-result-object v0

    .line 67
    .local v0, "sequenceBytes":[B
    const/4 v1, 0x6

    const/4 v2, 0x0

    aget-byte v2, v0, v2

    aput-byte v2, p1, v1

    .line 68
    const/4 v1, 0x7

    const/4 v2, 0x1

    aget-byte v2, v0, v2

    aput-byte v2, p1, v1

    .line 69
    return-void
.end method

.method private populateTime([B)V
    .locals 12
    .param p1, "bytes"    # [B

    .prologue
    .line 50
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 51
    .local v0, "date":Ljava/util/Date;
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 52
    .local v2, "time":J
    const-wide/16 v10, 0x3e8

    div-long v6, v2, v10

    .line 53
    .local v6, "tvSec":J
    const-wide/16 v10, 0x3e8

    rem-long v8, v2, v10

    .line 54
    .local v8, "tvUsec":J
    invoke-static {v6, v7}, Lcom/crashlytics/android/core/CLSUUID;->convertLongToFourByteBuffer(J)[B

    move-result-object v4

    .line 55
    .local v4, "timeBytes":[B
    const/4 v5, 0x0

    const/4 v10, 0x0

    aget-byte v10, v4, v10

    aput-byte v10, p1, v5

    .line 56
    const/4 v5, 0x1

    const/4 v10, 0x1

    aget-byte v10, v4, v10

    aput-byte v10, p1, v5

    .line 57
    const/4 v5, 0x2

    const/4 v10, 0x2

    aget-byte v10, v4, v10

    aput-byte v10, p1, v5

    .line 58
    const/4 v5, 0x3

    const/4 v10, 0x3

    aget-byte v10, v4, v10

    aput-byte v10, p1, v5

    .line 60
    invoke-static {v8, v9}, Lcom/crashlytics/android/core/CLSUUID;->convertLongToTwoByteBuffer(J)[B

    move-result-object v1

    .line 61
    .local v1, "msecsBytes":[B
    const/4 v5, 0x4

    const/4 v10, 0x0

    aget-byte v10, v1, v10

    aput-byte v10, p1, v5

    .line 62
    const/4 v5, 0x5

    const/4 v10, 0x1

    aget-byte v10, v1, v10

    aput-byte v10, p1, v5

    .line 63
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    sget-object v0, Lcom/crashlytics/android/core/CLSUUID;->_clsId:Ljava/lang/String;

    return-object v0
.end method
