.class final Lcom/crashlytics/android/core/ByteString;
.super Ljava/lang/Object;
.source "ByteString.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/crashlytics/android/core/ByteString$1;,
        Lcom/crashlytics/android/core/ByteString$CodedBuilder;,
        Lcom/crashlytics/android/core/ByteString$Output;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/crashlytics/android/core/ByteString;


# instance fields
.field private final bytes:[B

.field private volatile hash:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 85
    new-instance v0, Lcom/crashlytics/android/core/ByteString;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V

    sput-object v0, Lcom/crashlytics/android/core/ByteString;->EMPTY:Lcom/crashlytics/android/core/ByteString;

    return-void
.end method

.method private constructor <init>([B)V
    .locals 1
    .param p1, "bytes"    # [B

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    const/4 v0, 0x0

    iput v0, p0, Lcom/crashlytics/android/core/ByteString;->hash:I

    .line 53
    iput-object p1, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    .line 54
    return-void
.end method

.method synthetic constructor <init>([BLcom/crashlytics/android/core/ByteString$1;)V
    .locals 0
    .param p1, "x0"    # [B
    .param p2, "x1"    # Lcom/crashlytics/android/core/ByteString$1;

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V

    return-void
.end method

.method public static copyFrom(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;
    .locals 2
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "charsetName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 128
    new-instance v0, Lcom/crashlytics/android/core/ByteString;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V

    return-object v0
.end method

.method public static copyFrom(Ljava/nio/ByteBuffer;)Lcom/crashlytics/android/core/ByteString;
    .locals 1
    .param p0, "bytes"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 119
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    invoke-static {p0, v0}, Lcom/crashlytics/android/core/ByteString;->copyFrom(Ljava/nio/ByteBuffer;I)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public static copyFrom(Ljava/nio/ByteBuffer;I)Lcom/crashlytics/android/core/ByteString;
    .locals 2
    .param p0, "bytes"    # Ljava/nio/ByteBuffer;
    .param p1, "size"    # I

    .prologue
    .line 109
    new-array v0, p1, [B

    .line 110
    .local v0, "copy":[B
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 111
    new-instance v1, Lcom/crashlytics/android/core/ByteString;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V

    return-object v1
.end method

.method public static copyFrom(Ljava/util/List;)Lcom/crashlytics/android/core/ByteString;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/crashlytics/android/core/ByteString;",
            ">;)",
            "Lcom/crashlytics/android/core/ByteString;"
        }
    .end annotation

    .prologue
    .local p0, "list":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/ByteString;>;"
    const/4 v7, 0x0

    .line 152
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_0

    .line 153
    sget-object v5, Lcom/crashlytics/android/core/ByteString;->EMPTY:Lcom/crashlytics/android/core/ByteString;

    .line 168
    :goto_0
    return-object v5

    .line 154
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    .line 155
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/crashlytics/android/core/ByteString;

    goto :goto_0

    .line 158
    :cond_1
    const/4 v3, 0x0

    .line 159
    .local v3, "size":I
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/crashlytics/android/core/ByteString;

    .line 160
    .local v4, "str":Lcom/crashlytics/android/core/ByteString;
    invoke-virtual {v4}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v5

    add-int/2addr v3, v5

    .line 161
    goto :goto_1

    .line 162
    .end local v4    # "str":Lcom/crashlytics/android/core/ByteString;
    :cond_2
    new-array v0, v3, [B

    .line 163
    .local v0, "bytes":[B
    const/4 v2, 0x0

    .line 164
    .local v2, "pos":I
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/crashlytics/android/core/ByteString;

    .line 165
    .restart local v4    # "str":Lcom/crashlytics/android/core/ByteString;
    iget-object v5, v4, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    invoke-virtual {v4}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v6

    invoke-static {v5, v7, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 166
    invoke-virtual {v4}, Lcom/crashlytics/android/core/ByteString;->size()I

    move-result v5

    add-int/2addr v2, v5

    .line 167
    goto :goto_2

    .line 168
    .end local v4    # "str":Lcom/crashlytics/android/core/ByteString;
    :cond_3
    new-instance v5, Lcom/crashlytics/android/core/ByteString;

    invoke-direct {v5, v0}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V

    goto :goto_0
.end method

.method public static copyFrom([B)Lcom/crashlytics/android/core/ByteString;
    .locals 2
    .param p0, "bytes"    # [B

    .prologue
    .line 101
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/crashlytics/android/core/ByteString;->copyFrom([BII)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public static copyFrom([BII)Lcom/crashlytics/android/core/ByteString;
    .locals 2
    .param p0, "bytes"    # [B
    .param p1, "offset"    # I
    .param p2, "size"    # I

    .prologue
    .line 92
    new-array v0, p2, [B

    .line 93
    .local v0, "copy":[B
    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    new-instance v1, Lcom/crashlytics/android/core/ByteString;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V

    return-object v1
.end method

.method public static copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;
    .locals 3
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 137
    :try_start_0
    new-instance v1, Lcom/crashlytics/android/core/ByteString;

    const-string v2, "UTF-8"

    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/crashlytics/android/core/ByteString;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 138
    :catch_0
    move-exception v0

    .line 139
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "UTF-8 not supported."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method static newCodedBuilder(I)Lcom/crashlytics/android/core/ByteString$CodedBuilder;
    .locals 2
    .param p0, "size"    # I

    .prologue
    .line 368
    new-instance v0, Lcom/crashlytics/android/core/ByteString$CodedBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/crashlytics/android/core/ByteString$CodedBuilder;-><init>(ILcom/crashlytics/android/core/ByteString$1;)V

    return-object v0
.end method

.method public static newOutput()Lcom/crashlytics/android/core/ByteString$Output;
    .locals 1

    .prologue
    .line 327
    const/16 v0, 0x20

    invoke-static {v0}, Lcom/crashlytics/android/core/ByteString;->newOutput(I)Lcom/crashlytics/android/core/ByteString$Output;

    move-result-object v0

    return-object v0
.end method

.method public static newOutput(I)Lcom/crashlytics/android/core/ByteString$Output;
    .locals 3
    .param p0, "initialCapacity"    # I

    .prologue
    .line 320
    new-instance v0, Lcom/crashlytics/android/core/ByteString$Output;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/crashlytics/android/core/ByteString$Output;-><init>(Ljava/io/ByteArrayOutputStream;Lcom/crashlytics/android/core/ByteString$1;)V

    return-object v0
.end method


# virtual methods
.method public asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .prologue
    .line 225
    iget-object v1, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 226
    .local v0, "byteBuffer":Ljava/nio/ByteBuffer;
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    return-object v1
.end method

.method public byteAt(I)B
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 62
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    aget-byte v0, v0, p1

    return v0
.end method

.method public copyTo(Ljava/nio/ByteBuffer;)V
    .locals 3
    .param p1, "target"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 207
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v2, v2

    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 208
    return-void
.end method

.method public copyTo([BI)V
    .locals 3
    .param p1, "target"    # [B
    .param p2, "offset"    # I

    .prologue
    .line 181
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v2, v2

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    return-void
.end method

.method public copyTo([BIII)V
    .locals 1
    .param p1, "target"    # [B
    .param p2, "sourceOffset"    # I
    .param p3, "targetOffset"    # I
    .param p4, "size"    # I

    .prologue
    .line 195
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    invoke-static {v0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 196
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 254
    if-ne p1, p0, :cond_1

    .line 276
    :cond_0
    :goto_0
    return v5

    .line 258
    :cond_1
    instance-of v7, p1, Lcom/crashlytics/android/core/ByteString;

    if-nez v7, :cond_2

    move v5, v6

    .line 259
    goto :goto_0

    :cond_2
    move-object v1, p1

    .line 262
    check-cast v1, Lcom/crashlytics/android/core/ByteString;

    .line 263
    .local v1, "other":Lcom/crashlytics/android/core/ByteString;
    iget-object v7, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v3, v7

    .line 264
    .local v3, "size":I
    iget-object v7, v1, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v7, v7

    if-eq v3, v7, :cond_3

    move v5, v6

    .line 265
    goto :goto_0

    .line 268
    :cond_3
    iget-object v4, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    .line 269
    .local v4, "thisBytes":[B
    iget-object v2, v1, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    .line 270
    .local v2, "otherBytes":[B
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v3, :cond_0

    .line 271
    aget-byte v7, v4, v0

    aget-byte v8, v2, v0

    if-eq v7, v8, :cond_4

    move v5, v6

    .line 272
    goto :goto_0

    .line 270
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public hashCode()I
    .locals 6

    .prologue
    .line 283
    iget v0, p0, Lcom/crashlytics/android/core/ByteString;->hash:I

    .line 285
    .local v0, "h":I
    if-nez v0, :cond_2

    .line 286
    iget-object v3, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    .line 287
    .local v3, "thisBytes":[B
    iget-object v4, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v2, v4

    .line 289
    .local v2, "size":I
    move v0, v2

    .line 290
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v2, :cond_0

    .line 291
    mul-int/lit8 v4, v0, 0x1f

    aget-byte v5, v3, v1

    add-int v0, v4, v5

    .line 290
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 293
    :cond_0
    if-nez v0, :cond_1

    .line 294
    const/4 v0, 0x1

    .line 297
    :cond_1
    iput v0, p0, Lcom/crashlytics/android/core/ByteString;->hash:I

    .line 300
    .end local v1    # "i":I
    .end local v2    # "size":I
    .end local v3    # "thisBytes":[B
    :cond_2
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public newInput()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 310
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v0, v0

    return v0
.end method

.method public toByteArray()[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 214
    iget-object v2, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    array-length v1, v2

    .line 215
    .local v1, "size":I
    new-array v0, v1, [B

    .line 216
    .local v0, "copy":[B
    iget-object v2, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 217
    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "charsetName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 235
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    invoke-direct {v0, v1, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public toStringUtf8()Ljava/lang/String;
    .locals 4

    .prologue
    .line 243
    :try_start_0
    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/crashlytics/android/core/ByteString;->bytes:[B

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 244
    :catch_0
    move-exception v0

    .line 245
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "UTF-8 not supported?"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
