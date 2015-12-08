.class public Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;
.super Ljava/io/FilterOutputStream;
.source "Base64.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/java_websocket/util/Base64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OutputStream"
.end annotation


# instance fields
.field private b4:[B

.field private breakLines:Z

.field private buffer:[B

.field private bufferLength:I

.field private decodabet:[B

.field private encode:Z

.field private lineLength:I

.field private options:I

.field private position:I

.field private suspendEncoding:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 1877
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 1878
    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 4
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "options"    # I

    .prologue
    const/4 v3, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1901
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1902
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->breakLines:Z

    .line 1903
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->encode:Z

    .line 1904
    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->encode:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    :goto_2
    iput v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->bufferLength:I

    .line 1905
    iget v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->bufferLength:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    .line 1906
    iput v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    .line 1907
    iput v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->lineLength:I

    .line 1908
    iput-boolean v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->suspendEncoding:Z

    .line 1909
    new-array v0, v3, [B

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->b4:[B

    .line 1910
    iput p2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->options:I

    .line 1911
    # invokes: Lcom/mixpanel/android/java_websocket/util/Base64;->getDecodabet(I)[B
    invoke-static {p2}, Lcom/mixpanel/android/java_websocket/util/Base64;->access$0(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->decodabet:[B

    .line 1912
    return-void

    :cond_0
    move v0, v2

    .line 1902
    goto :goto_0

    :cond_1
    move v1, v2

    .line 1903
    goto :goto_1

    :cond_2
    move v0, v3

    .line 1904
    goto :goto_2
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 2026
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->flushBase64()V

    .line 2030
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 2032
    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    .line 2033
    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    .line 2034
    return-void
.end method

.method public flushBase64()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2005
    iget v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    if-lez v0, :cond_0

    .line 2006
    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->encode:Z

    if-eqz v0, :cond_1

    .line 2007
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->b4:[B

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    iget v3, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    iget v4, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->options:I

    # invokes: Lcom/mixpanel/android/java_websocket/util/Base64;->encode3to4([B[BII)[B
    invoke-static {v1, v2, v3, v4}, Lcom/mixpanel/android/java_websocket/util/Base64;->access$3([B[BII)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2008
    const/4 v0, 0x0

    iput v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    .line 2015
    :cond_0
    return-void

    .line 2011
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Base64 input not properly padded."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public resumeEncoding()V
    .locals 1

    .prologue
    .line 2060
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->suspendEncoding:Z

    .line 2061
    return-void
.end method

.method public suspendEncoding()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2047
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->flushBase64()V

    .line 2048
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->suspendEncoding:Z

    .line 2049
    return-void
.end method

.method public write(I)V
    .locals 7
    .param p1, "theByte"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, -0x5

    const/4 v6, 0x0

    .line 1931
    iget-boolean v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->suspendEncoding:Z

    if-eqz v1, :cond_1

    .line 1932
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V

    .line 1969
    :cond_0
    :goto_0
    return-void

    .line 1937
    :cond_1
    iget-boolean v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->encode:Z

    if-eqz v1, :cond_3

    .line 1938
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    iget v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    int-to-byte v3, p1

    aput-byte v3, v1, v2

    .line 1939
    iget v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    iget v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->bufferLength:I

    if-lt v1, v2, :cond_0

    .line 1941
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->b4:[B

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    iget v4, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->bufferLength:I

    iget v5, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->options:I

    # invokes: Lcom/mixpanel/android/java_websocket/util/Base64;->encode3to4([B[BII)[B
    invoke-static {v2, v3, v4, v5}, Lcom/mixpanel/android/java_websocket/util/Base64;->access$3([B[BII)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 1943
    iget v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->lineLength:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->lineLength:I

    .line 1944
    iget-boolean v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->breakLines:Z

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->lineLength:I

    const/16 v2, 0x4c

    if-lt v1, v2, :cond_2

    .line 1945
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 1946
    iput v6, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->lineLength:I

    .line 1949
    :cond_2
    iput v6, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    goto :goto_0

    .line 1956
    :cond_3
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->decodabet:[B

    and-int/lit8 v2, p1, 0x7f

    aget-byte v1, v1, v2

    if-le v1, v3, :cond_4

    .line 1957
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    iget v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    int-to-byte v3, p1

    aput-byte v3, v1, v2

    .line 1958
    iget v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    iget v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->bufferLength:I

    if-lt v1, v2, :cond_0

    .line 1960
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->buffer:[B

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->b4:[B

    iget v3, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->options:I

    # invokes: Lcom/mixpanel/android/java_websocket/util/Base64;->decode4to3([BI[BII)I
    invoke-static {v1, v6, v2, v6, v3}, Lcom/mixpanel/android/java_websocket/util/Base64;->access$2([BI[BII)I

    move-result v0

    .line 1961
    .local v0, "len":I
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->b4:[B

    invoke-virtual {v1, v2, v6, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 1962
    iput v6, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->position:I

    goto :goto_0

    .line 1965
    .end local v0    # "len":I
    :cond_4
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->decodabet:[B

    and-int/lit8 v2, p1, 0x7f

    aget-byte v1, v1, v2

    if-eq v1, v3, :cond_0

    .line 1966
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid character in Base64 data."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public write([BII)V
    .locals 2
    .param p1, "theBytes"    # [B
    .param p2, "off"    # I
    .param p3, "len"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1986
    iget-boolean v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->suspendEncoding:Z

    if-eqz v1, :cond_1

    .line 1987
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 1995
    :cond_0
    return-void

    .line 1991
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_0

    .line 1992
    add-int v1, p2, v0

    aget-byte v1, p1, v1

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/java_websocket/util/Base64$OutputStream;->write(I)V

    .line 1991
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
