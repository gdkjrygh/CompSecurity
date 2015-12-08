.class public Lcom/mixpanel/android/java_websocket/drafts/Draft_10;
.super Lcom/mixpanel/android/java_websocket/drafts/Draft;
.source "Draft_10.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert",
        "UseValueOf"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private fragmentedframe:Lcom/mixpanel/android/java_websocket/framing/Framedata;

.field private incompleteframe:Ljava/nio/ByteBuffer;

.field private final reuseableRandom:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;-><init>()V

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->fragmentedframe:Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .line 69
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->reuseableRandom:Ljava/util/Random;

    .line 34
    return-void
.end method

.method private fromOpcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)B
    .locals 3
    .param p1, "opcode"    # Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .prologue
    .line 163
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CONTINUOUS:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne p1, v0, :cond_0

    .line 164
    const/4 v0, 0x0

    .line 174
    :goto_0
    return v0

    .line 165
    :cond_0
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne p1, v0, :cond_1

    .line 166
    const/4 v0, 0x1

    goto :goto_0

    .line 167
    :cond_1
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->BINARY:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne p1, v0, :cond_2

    .line 168
    const/4 v0, 0x2

    goto :goto_0

    .line 169
    :cond_2
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne p1, v0, :cond_3

    .line 170
    const/16 v0, 0x8

    goto :goto_0

    .line 171
    :cond_3
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne p1, v0, :cond_4

    .line 172
    const/16 v0, 0x9

    goto :goto_0

    .line 173
    :cond_4
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PONG:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne p1, v0, :cond_5

    .line 174
    const/16 v0, 0xa

    goto :goto_0

    .line 175
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Don\'t know how to handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private generateFinalKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "in"    # Ljava/lang/String;

    .prologue
    .line 179
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 180
    .local v2, "seckey":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 183
    .local v0, "acc":Ljava/lang/String;
    :try_start_0
    const-string v4, "SHA1"

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 187
    .local v3, "sh1":Ljava/security/MessageDigest;
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    invoke-static {v4}, Lcom/mixpanel/android/java_websocket/util/Base64;->encodeBytes([B)Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 184
    .end local v3    # "sh1":Ljava/security/MessageDigest;
    :catch_0
    move-exception v1

    .line 185
    .local v1, "e":Ljava/security/NoSuchAlgorithmException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method

.method public static readVersion(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)I
    .locals 5
    .param p0, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    .prologue
    const/4 v1, -0x1

    .line 53
    const-string v3, "Sec-WebSocket-Version"

    invoke-interface {p0, v3}, Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 54
    .local v2, "vers":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 57
    :try_start_0
    new-instance v3, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 63
    :cond_0
    :goto_0
    return v1

    .line 59
    :catch_0
    move-exception v0

    .line 60
    .local v0, "e":Ljava/lang/NumberFormatException;
    goto :goto_0
.end method

.method private toByteArray(JI)[B
    .locals 7
    .param p1, "val"    # J
    .param p3, "bytecount"    # I

    .prologue
    .line 216
    new-array v0, p3, [B

    .line 217
    .local v0, "buffer":[B
    mul-int/lit8 v3, p3, 0x8

    add-int/lit8 v1, v3, -0x8

    .line 218
    .local v1, "highest":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-lt v2, p3, :cond_0

    .line 221
    return-object v0

    .line 219
    :cond_0
    mul-int/lit8 v3, v2, 0x8

    sub-int v3, v1, v3

    ushr-long v4, p1, v3

    long-to-int v3, v4

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    .line 218
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private toOpcode(B)Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .locals 3
    .param p1, "opcode"    # B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;
        }
    .end annotation

    .prologue
    .line 225
    packed-switch p1, :pswitch_data_0

    .line 241
    :pswitch_0
    new-instance v0, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknow optcode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-short v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :pswitch_1
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CONTINUOUS:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 238
    :goto_0
    return-object v0

    .line 229
    :pswitch_2
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_0

    .line 231
    :pswitch_3
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->BINARY:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_0

    .line 234
    :pswitch_4
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_0

    .line 236
    :pswitch_5
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_0

    .line 238
    :pswitch_6
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PONG:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_0

    .line 225
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method


# virtual methods
.method public acceptHandshakeAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 3
    .param p1, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .param p2, "response"    # Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 73
    const-string v2, "Sec-WebSocket-Key"

    invoke-interface {p1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->hasFieldValue(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Sec-WebSocket-Accept"

    invoke-interface {p2, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;->hasFieldValue(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 74
    :cond_0
    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 82
    :goto_0
    return-object v2

    .line 76
    :cond_1
    const-string v2, "Sec-WebSocket-Accept"

    invoke-interface {p2, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    .local v0, "seckey_answere":Ljava/lang/String;
    const-string v2, "Sec-WebSocket-Key"

    invoke-interface {p1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 78
    .local v1, "seckey_challenge":Ljava/lang/String;
    invoke-direct {p0, v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->generateFinalKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 81
    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0

    .line 82
    :cond_2
    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0
.end method

.method public acceptHandshakeAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 2
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 88
    invoke-static {p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->readVersion(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)I

    move-result v0

    .line 89
    .local v0, "v":I
    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 90
    :cond_0
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->basicAccept(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 91
    :goto_0
    return-object v1

    .line 90
    :cond_1
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0

    .line 91
    :cond_2
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0
.end method

.method public copyInstance()Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .locals 1

    .prologue
    .line 393
    new-instance v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;-><init>()V

    return-object v0
.end method

.method public createBinaryFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)Ljava/nio/ByteBuffer;
    .locals 12
    .param p1, "framedata"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 96
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 97
    .local v4, "mes":Ljava/nio/ByteBuffer;
    iget-object v9, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v10, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->CLIENT:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v9, v10, :cond_0

    const/4 v2, 0x1

    .line 98
    .local v2, "mask":Z
    :goto_0
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v9

    const/16 v10, 0x7d

    if-gt v9, v10, :cond_1

    const/4 v8, 0x1

    .line 99
    .local v8, "sizebytes":I
    :goto_1
    const/4 v9, 0x1

    if-le v8, v9, :cond_3

    add-int/lit8 v9, v8, 0x1

    :goto_2
    add-int/lit8 v10, v9, 0x1

    if-eqz v2, :cond_4

    const/4 v9, 0x4

    :goto_3
    add-int/2addr v9, v10

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v10

    add-int/2addr v9, v10

    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 100
    .local v0, "buf":Ljava/nio/ByteBuffer;
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getOpcode()Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-result-object v9

    invoke-direct {p0, v9}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->fromOpcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)B

    move-result v6

    .line 101
    .local v6, "optcode":B
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->isFin()Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, -0x80

    :goto_4
    int-to-byte v5, v9

    .line 102
    .local v5, "one":B
    or-int v9, v5, v6

    int-to-byte v5, v9

    .line 103
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 104
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v9

    int-to-long v10, v9

    invoke-direct {p0, v10, v11, v8}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->toByteArray(JI)[B

    move-result-object v7

    .line 105
    .local v7, "payloadlengthbytes":[B
    sget-boolean v9, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->$assertionsDisabled:Z

    if-nez v9, :cond_6

    array-length v9, v7

    if-eq v9, v8, :cond_6

    new-instance v9, Ljava/lang/AssertionError;

    invoke-direct {v9}, Ljava/lang/AssertionError;-><init>()V

    throw v9

    .line 97
    .end local v0    # "buf":Ljava/nio/ByteBuffer;
    .end local v2    # "mask":Z
    .end local v5    # "one":B
    .end local v6    # "optcode":B
    .end local v7    # "payloadlengthbytes":[B
    .end local v8    # "sizebytes":I
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 98
    .restart local v2    # "mask":Z
    :cond_1
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v9

    const v10, 0xffff

    if-gt v9, v10, :cond_2

    const/4 v8, 0x2

    goto :goto_1

    :cond_2
    const/16 v8, 0x8

    goto :goto_1

    .restart local v8    # "sizebytes":I
    :cond_3
    move v9, v8

    .line 99
    goto :goto_2

    :cond_4
    const/4 v9, 0x0

    goto :goto_3

    .line 101
    .restart local v0    # "buf":Ljava/nio/ByteBuffer;
    .restart local v6    # "optcode":B
    :cond_5
    const/4 v9, 0x0

    goto :goto_4

    .line 107
    .restart local v5    # "one":B
    .restart local v7    # "payloadlengthbytes":[B
    :cond_6
    const/4 v9, 0x1

    if-ne v8, v9, :cond_8

    .line 108
    const/4 v9, 0x0

    aget-byte v10, v7, v9

    if-eqz v2, :cond_7

    const/16 v9, -0x80

    :goto_5
    or-int/2addr v9, v10

    int-to-byte v9, v9

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 118
    :goto_6
    if-eqz v2, :cond_e

    .line 119
    const/4 v9, 0x4

    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 120
    .local v3, "maskkey":Ljava/nio/ByteBuffer;
    iget-object v9, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->reuseableRandom:Ljava/util/Random;

    invoke-virtual {v9}, Ljava/util/Random;->nextInt()I

    move-result v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 121
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 122
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_7
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v9

    if-nez v9, :cond_d

    .line 128
    .end local v1    # "i":I
    .end local v3    # "maskkey":Ljava/nio/ByteBuffer;
    :goto_8
    sget-boolean v9, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->$assertionsDisabled:Z

    if-nez v9, :cond_f

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v9

    if-eqz v9, :cond_f

    new-instance v9, Ljava/lang/AssertionError;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/lang/AssertionError;-><init>(I)V

    throw v9

    .line 108
    :cond_7
    const/4 v9, 0x0

    goto :goto_5

    .line 109
    :cond_8
    const/4 v9, 0x2

    if-ne v8, v9, :cond_a

    .line 110
    if-eqz v2, :cond_9

    const/16 v9, -0x80

    :goto_9
    or-int/lit8 v9, v9, 0x7e

    int-to-byte v9, v9

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 111
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_6

    .line 110
    :cond_9
    const/4 v9, 0x0

    goto :goto_9

    .line 112
    :cond_a
    const/16 v9, 0x8

    if-ne v8, v9, :cond_c

    .line 113
    if-eqz v2, :cond_b

    const/16 v9, -0x80

    :goto_a
    or-int/lit8 v9, v9, 0x7f

    int-to-byte v9, v9

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 114
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_6

    .line 113
    :cond_b
    const/4 v9, 0x0

    goto :goto_a

    .line 116
    :cond_c
    new-instance v9, Ljava/lang/RuntimeException;

    const-string v10, "Size representation not supported/specified"

    invoke-direct {v9, v10}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 123
    .restart local v1    # "i":I
    .restart local v3    # "maskkey":Ljava/nio/ByteBuffer;
    :cond_d
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    rem-int/lit8 v10, v1, 0x4

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v10

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 122
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 126
    .end local v1    # "i":I
    .end local v3    # "maskkey":Ljava/nio/ByteBuffer;
    :cond_e
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_8

    .line 129
    :cond_f
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 131
    return-object v0
.end method

.method public createFrames(Ljava/lang/String;Z)Ljava/util/List;
    .locals 3
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "mask"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata;",
            ">;"
        }
    .end annotation

    .prologue
    .line 150
    new-instance v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>()V

    .line 152
    .local v0, "curframe":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :try_start_0
    invoke-static {p1}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->utf8Bytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    const/4 v2, 0x1

    invoke-interface {v0, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setFin(Z)V

    .line 157
    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-interface {v0, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 158
    invoke-interface {v0, p2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setTransferemasked(Z)V

    .line 159
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 153
    :catch_0
    move-exception v1

    .line 154
    .local v1, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    new-instance v2, Lcom/mixpanel/android/java_websocket/exceptions/NotSendableException;

    invoke-direct {v2, v1}, Lcom/mixpanel/android/java_websocket/exceptions/NotSendableException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public createFrames(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 3
    .param p1, "binary"    # Ljava/nio/ByteBuffer;
    .param p2, "mask"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    new-instance v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>()V

    .line 138
    .local v0, "curframe":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :try_start_0
    invoke-interface {v0, p1}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    const/4 v2, 0x1

    invoke-interface {v0, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setFin(Z)V

    .line 143
    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->BINARY:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-interface {v0, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 144
    invoke-interface {v0, p2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setTransferemasked(Z)V

    .line 145
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 139
    :catch_0
    move-exception v1

    .line 140
    .local v1, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    new-instance v2, Lcom/mixpanel/android/java_websocket/exceptions/NotSendableException;

    invoke-direct {v2, v1}, Lcom/mixpanel/android/java_websocket/exceptions/NotSendableException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;
    .locals 1

    .prologue
    .line 398
    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;->TWOWAY:Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    return-object v0
.end method

.method public postProcessHandshakeRequestAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    .locals 3
    .param p1, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;

    .prologue
    .line 192
    const-string v1, "Upgrade"

    const-string v2, "websocket"

    invoke-interface {p1, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v1, "Connection"

    const-string v2, "Upgrade"

    invoke-interface {p1, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v1, "Sec-WebSocket-Version"

    const-string v2, "8"

    invoke-interface {p1, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const/16 v1, 0x10

    new-array v0, v1, [B

    .line 197
    .local v0, "random":[B
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->reuseableRandom:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    .line 198
    const-string v1, "Sec-WebSocket-Key"

    invoke-static {v0}, Lcom/mixpanel/android/java_websocket/util/Base64;->encodeBytes([B)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    return-object p1
.end method

.method public postProcessHandshakeResponseAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;
    .locals 3
    .param p1, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .param p2, "response"    # Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 205
    const-string v1, "Upgrade"

    const-string v2, "websocket"

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const-string v1, "Connection"

    const-string v2, "Connection"

    invoke-interface {p1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v1, "Switching Protocols"

    invoke-interface {p2, v1}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->setHttpStatusMessage(Ljava/lang/String;)V

    .line 208
    const-string v1, "Sec-WebSocket-Key"

    invoke-interface {p1, v1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 209
    .local v0, "seckey":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 210
    new-instance v1, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;

    const-string v2, "missing Sec-WebSocket-Key"

    invoke-direct {v1, v2}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 211
    :cond_0
    const-string v1, "Sec-WebSocket-Accept"

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->generateFinalKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    return-object p2
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 388
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    .line 389
    return-void
.end method

.method public translateFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 11
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/LimitExedeedException;,
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 247
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 250
    .local v5, "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    if-eqz v8, :cond_2

    .line 254
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 255
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 256
    .local v0, "available_next_byte_count":I
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    .line 258
    .local v3, "expected_next_byte_count":I
    if-le v3, v0, :cond_1

    .line 260
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v10

    invoke-virtual {v8, v9, v10, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 261
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v8

    add-int/2addr v8, v0

    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 262
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 299
    .end local v0    # "available_next_byte_count":I
    .end local v3    # "expected_next_byte_count":I
    .end local v5    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    :cond_0
    :goto_0
    return-object v5

    .line 264
    .restart local v0    # "available_next_byte_count":I
    .restart local v3    # "expected_next_byte_count":I
    .restart local v5    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    :cond_1
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v10

    invoke-virtual {v8, v9, v10, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 265
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v8

    add-int/2addr v8, v3

    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 267
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v8

    check-cast v8, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v8}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->translateSingleFrame(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/framing/Framedata;

    move-result-object v1

    .line 268
    .local v1, "cur":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    const/4 v8, 0x0

    iput-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException; {:try_start_0 .. :try_end_0} :catch_1

    .line 285
    .end local v0    # "available_next_byte_count":I
    .end local v1    # "cur":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    .end local v3    # "expected_next_byte_count":I
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 286
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 288
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->translateSingleFrame(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/framing/Framedata;

    move-result-object v1

    .line 289
    .restart local v1    # "cur":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 290
    .end local v1    # "cur":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    :catch_0
    move-exception v2

    .line 292
    .local v2, "e":Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 293
    invoke-virtual {v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;->getPreferedSize()I

    move-result v7

    .line 294
    .local v7, "pref":I
    invoke-virtual {p0, v7}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->checkAlloc(I)I

    move-result v8

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    iput-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    .line 295
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v8, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 271
    .end local v2    # "e":Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;
    .end local v7    # "pref":I
    :catch_1
    move-exception v2

    .line 273
    .restart local v2    # "e":Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->limit()I

    move-result v6

    .line 274
    .local v6, "oldsize":I
    invoke-virtual {v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;->getPreferedSize()I

    move-result v8

    invoke-virtual {p0, v8}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->checkAlloc(I)I

    move-result v8

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 275
    .local v4, "extendedframe":Ljava/nio/ByteBuffer;
    sget-boolean v8, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->$assertionsDisabled:Z

    if-nez v8, :cond_3

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->limit()I

    move-result v8

    iget-object v9, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->limit()I

    move-result v9

    if-gt v8, v9, :cond_3

    new-instance v8, Ljava/lang/AssertionError;

    invoke-direct {v8}, Ljava/lang/AssertionError;-><init>()V

    throw v8

    .line 276
    :cond_3
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 277
    iget-object v8, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 278
    iput-object v4, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->incompleteframe:Ljava/nio/ByteBuffer;

    .line 280
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->translateFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_0
.end method

.method public translateSingleFrame(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/framing/Framedata;
    .locals 24
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;,
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 303
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v14

    .line 304
    .local v14, "maxpacketsize":I
    const/16 v18, 0x2

    .line 305
    .local v18, "realpacketsize":I
    move/from16 v0, v18

    if-ge v14, v0, :cond_0

    .line 306
    new-instance v21, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    move/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;-><init>(Lcom/mixpanel/android/java_websocket/drafts/Draft_10;I)V

    throw v21

    .line 307
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v6

    .line 308
    .local v6, "b1":B
    shr-int/lit8 v21, v6, 0x8

    if-eqz v21, :cond_1

    const/4 v4, 0x1

    .line 309
    .local v4, "FIN":Z
    :goto_0
    and-int/lit8 v21, v6, 0x7f

    shr-int/lit8 v21, v21, 0x4

    move/from16 v0, v21

    int-to-byte v0, v0

    move/from16 v19, v0

    .line 310
    .local v19, "rsv":B
    if-eqz v19, :cond_2

    .line 311
    new-instance v21, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    new-instance v22, Ljava/lang/StringBuilder;

    const-string v23, "bad rsv "

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v22

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-direct/range {v21 .. v22}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v21

    .line 308
    .end local v4    # "FIN":Z
    .end local v19    # "rsv":B
    :cond_1
    const/4 v4, 0x0

    goto :goto_0

    .line 312
    .restart local v4    # "FIN":Z
    .restart local v19    # "rsv":B
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    .line 313
    .local v7, "b2":B
    and-int/lit8 v21, v7, -0x80

    if-eqz v21, :cond_4

    const/4 v5, 0x1

    .line 314
    .local v5, "MASK":Z
    :goto_1
    and-int/lit8 v21, v7, 0x7f

    move/from16 v0, v21

    int-to-byte v0, v0

    move/from16 v17, v0

    .line 315
    .local v17, "payloadlength":I
    and-int/lit8 v21, v6, 0xf

    move/from16 v0, v21

    int-to-byte v0, v0

    move/from16 v21, v0

    move-object/from16 v0, p0

    move/from16 v1, v21

    invoke-direct {v0, v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->toOpcode(B)Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-result-object v15

    .line 317
    .local v15, "optcode":Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    if-nez v4, :cond_5

    .line 318
    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-eq v15, v0, :cond_3

    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PONG:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-eq v15, v0, :cond_3

    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-ne v15, v0, :cond_5

    .line 319
    :cond_3
    new-instance v21, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    const-string v22, "control frames may no be fragmented"

    invoke-direct/range {v21 .. v22}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v21

    .line 313
    .end local v5    # "MASK":Z
    .end local v15    # "optcode":Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .end local v17    # "payloadlength":I
    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    .line 323
    .restart local v5    # "MASK":Z
    .restart local v15    # "optcode":Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .restart local v17    # "payloadlength":I
    :cond_5
    if-ltz v17, :cond_6

    const/16 v21, 0x7d

    move/from16 v0, v17

    move/from16 v1, v21

    if-le v0, v1, :cond_a

    .line 325
    :cond_6
    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-eq v15, v0, :cond_7

    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PONG:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-eq v15, v0, :cond_7

    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-ne v15, v0, :cond_8

    .line 326
    :cond_7
    new-instance v21, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    const-string v22, "more than 125 octets"

    invoke-direct/range {v21 .. v22}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v21

    .line 328
    :cond_8
    const/16 v21, 0x7e

    move/from16 v0, v17

    move/from16 v1, v21

    if-ne v0, v1, :cond_b

    .line 329
    add-int/lit8 v18, v18, 0x2

    .line 330
    move/from16 v0, v18

    if-ge v14, v0, :cond_9

    .line 331
    new-instance v21, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    move/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;-><init>(Lcom/mixpanel/android/java_websocket/drafts/Draft_10;I)V

    throw v21

    .line 332
    :cond_9
    const/16 v21, 0x3

    move/from16 v0, v21

    new-array v0, v0, [B

    move-object/from16 v20, v0

    .line 333
    .local v20, "sizebytes":[B
    const/16 v21, 0x1

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v22

    aput-byte v22, v20, v21

    .line 334
    const/16 v21, 0x2

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v22

    aput-byte v22, v20, v21

    .line 335
    new-instance v21, Ljava/math/BigInteger;

    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual/range {v21 .. v21}, Ljava/math/BigInteger;->intValue()I

    move-result v17

    .line 354
    .end local v20    # "sizebytes":[B
    :cond_a
    :goto_2
    if-eqz v5, :cond_f

    const/16 v21, 0x4

    :goto_3
    add-int v18, v18, v21

    .line 356
    add-int v18, v18, v17

    .line 358
    move/from16 v0, v18

    if-ge v14, v0, :cond_10

    .line 359
    new-instance v21, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    move/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;-><init>(Lcom/mixpanel/android/java_websocket/drafts/Draft_10;I)V

    throw v21

    .line 337
    :cond_b
    add-int/lit8 v18, v18, 0x8

    .line 338
    move/from16 v0, v18

    if-ge v14, v0, :cond_c

    .line 339
    new-instance v21, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    move/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10$IncompleteException;-><init>(Lcom/mixpanel/android/java_websocket/drafts/Draft_10;I)V

    throw v21

    .line 340
    :cond_c
    const/16 v21, 0x8

    move/from16 v0, v21

    new-array v8, v0, [B

    .line 341
    .local v8, "bytes":[B
    const/4 v10, 0x0

    .local v10, "i":I
    :goto_4
    const/16 v21, 0x8

    move/from16 v0, v21

    if-lt v10, v0, :cond_d

    .line 344
    new-instance v21, Ljava/math/BigInteger;

    move-object/from16 v0, v21

    invoke-direct {v0, v8}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual/range {v21 .. v21}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v12

    .line 345
    .local v12, "length":J
    const-wide/32 v22, 0x7fffffff

    cmp-long v21, v12, v22

    if-lez v21, :cond_e

    .line 346
    new-instance v21, Lcom/mixpanel/android/java_websocket/exceptions/LimitExedeedException;

    const-string v22, "Payloadsize is to big..."

    invoke-direct/range {v21 .. v22}, Lcom/mixpanel/android/java_websocket/exceptions/LimitExedeedException;-><init>(Ljava/lang/String;)V

    throw v21

    .line 342
    .end local v12    # "length":J
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v21

    aput-byte v21, v8, v10

    .line 341
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 348
    .restart local v12    # "length":J
    :cond_e
    long-to-int v0, v12

    move/from16 v17, v0

    goto :goto_2

    .line 354
    .end local v8    # "bytes":[B
    .end local v10    # "i":I
    .end local v12    # "length":J
    :cond_f
    const/16 v21, 0x0

    goto :goto_3

    .line 361
    :cond_10
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->checkAlloc(I)I

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v16

    .line 362
    .local v16, "payload":Ljava/nio/ByteBuffer;
    if-eqz v5, :cond_12

    .line 363
    const/16 v21, 0x4

    move/from16 v0, v21

    new-array v11, v0, [B

    .line 364
    .local v11, "maskskey":[B
    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 365
    const/4 v10, 0x0

    .restart local v10    # "i":I
    :goto_5
    move/from16 v0, v17

    if-lt v10, v0, :cond_11

    .line 374
    .end local v10    # "i":I
    .end local v11    # "maskskey":[B
    :goto_6
    sget-object v21, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-object/from16 v0, v21

    if-ne v15, v0, :cond_13

    .line 375
    new-instance v9, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;

    invoke-direct {v9}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;-><init>()V

    .line 381
    .local v9, "frame":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :goto_7
    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 382
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 383
    return-object v9

    .line 366
    .end local v9    # "frame":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    .restart local v10    # "i":I
    .restart local v11    # "maskskey":[B
    :cond_11
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v21

    rem-int/lit8 v22, v10, 0x4

    aget-byte v22, v11, v22

    xor-int v21, v21, v22

    move/from16 v0, v21

    int-to-byte v0, v0

    move/from16 v21, v0

    move-object/from16 v0, v16

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 365
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 369
    .end local v10    # "i":I
    .end local v11    # "maskskey":[B
    :cond_12
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v22

    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->limit()I

    move-result v23

    move-object/from16 v0, v16

    move-object/from16 v1, v21

    move/from16 v2, v22

    move/from16 v3, v23

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 370
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v21

    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->limit()I

    move-result v22

    add-int v21, v21, v22

    move-object/from16 v0, p1

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_6

    .line 377
    :cond_13
    new-instance v9, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    invoke-direct {v9}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>()V

    .line 378
    .restart local v9    # "frame":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    invoke-interface {v9, v4}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setFin(Z)V

    .line 379
    invoke-interface {v9, v15}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    goto :goto_7
.end method
