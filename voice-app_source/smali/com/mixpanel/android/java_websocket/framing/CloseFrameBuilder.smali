.class public Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;
.super Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;
.source "CloseFrameBuilder.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/framing/CloseFrame;


# static fields
.field static final emptybytebuffer:Ljava/nio/ByteBuffer;


# instance fields
.field private code:I

.field private reason:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->emptybytebuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 18
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->setFin(Z)V

    .line 19
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "code"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 22
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 23
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->setFin(Z)V

    .line 24
    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->setCodeAndMessage(ILjava/lang/String;)V

    .line 25
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1
    .param p1, "code"    # I
    .param p2, "m"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 28
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 29
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->setFin(Z)V

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->setCodeAndMessage(ILjava/lang/String;)V

    .line 31
    return-void
.end method

.method private initCloseCode()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;
        }
    .end annotation

    .prologue
    const/16 v4, 0x3ed

    const/4 v3, 0x2

    .line 61
    iput v4, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    .line 62
    invoke-super {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 63
    .local v1, "payload":Ljava/nio/ByteBuffer;
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 64
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    if-lt v2, v3, :cond_1

    .line 65
    const/4 v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 66
    .local v0, "bb":Ljava/nio/ByteBuffer;
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 67
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 68
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 69
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    iput v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    .line 71
    iget v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v3, 0x3ee

    if-eq v2, v3, :cond_0

    iget v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v3, 0x3f7

    if-eq v2, v3, :cond_0

    iget v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    if-eq v2, v4, :cond_0

    iget v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v3, 0x1387

    if-gt v2, v3, :cond_0

    iget v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v3, 0x3e8

    if-lt v2, v3, :cond_0

    iget v2, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v3, 0x3ec

    if-ne v2, v3, :cond_1

    .line 72
    :cond_0
    new-instance v2, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "closecode must not be sent over the wire: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 75
    .end local v0    # "bb":Ljava/nio/ByteBuffer;
    :cond_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 76
    return-void
.end method

.method private initMessage()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 84
    iget v3, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v4, 0x3ed

    if-ne v3, v4, :cond_0

    .line 85
    invoke-super {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v3}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->stringUtf8(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->reason:Ljava/lang/String;

    .line 98
    :goto_0
    return-void

    .line 87
    :cond_0
    invoke-super {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 88
    .local v0, "b":Ljava/nio/ByteBuffer;
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    .line 90
    .local v2, "mark":I
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 91
    invoke-static {v0}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->stringUtf8(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->reason:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    .line 92
    :catch_0
    move-exception v1

    .line 93
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    :try_start_1
    new-instance v3, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    invoke-direct {v3, v1}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    :catchall_0
    move-exception v3

    .line 95
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 96
    throw v3
.end method

.method private setCodeAndMessage(ILjava/lang/String;)V
    .locals 6
    .param p1, "code"    # I
    .param p2, "m"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 34
    if-nez p2, :cond_0

    .line 35
    const-string p2, ""

    .line 38
    :cond_0
    const/16 v3, 0x3f7

    if-ne p1, v3, :cond_1

    .line 39
    const/16 p1, 0x3ed

    .line 40
    const-string p2, ""

    .line 42
    :cond_1
    const/16 v3, 0x3ed

    if-ne p1, v3, :cond_2

    .line 43
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_3

    .line 44
    new-instance v3, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v4, 0x3ea

    const-string v5, "A close frame must have a closecode if it has a reason"

    invoke-direct {v3, v4, v5}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v3

    .line 49
    :cond_2
    invoke-static {p2}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->utf8Bytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 50
    .local v1, "by":[B
    const/4 v3, 0x4

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 51
    .local v0, "buf":Ljava/nio/ByteBuffer;
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 52
    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 53
    array-length v3, v1

    add-int/lit8 v3, v3, 0x2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 54
    .local v2, "pay":Ljava/nio/ByteBuffer;
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 55
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 56
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 57
    invoke-virtual {p0, v2}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 58
    .end local v0    # "buf":Ljava/nio/ByteBuffer;
    .end local v1    # "by":[B
    .end local v2    # "pay":Ljava/nio/ByteBuffer;
    :cond_3
    return-void
.end method


# virtual methods
.method public getCloseCode()I
    .locals 1

    .prologue
    .line 80
    iget v0, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public getPayloadData()Ljava/nio/ByteBuffer;
    .locals 2

    .prologue
    .line 118
    iget v0, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    const/16 v1, 0x3ed

    if-ne v0, v1, :cond_0

    .line 119
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->emptybytebuffer:Ljava/nio/ByteBuffer;

    .line 120
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v0

    goto :goto_0
.end method

.method public setPayload(Ljava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "payload"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 112
    invoke-super {p0, p1}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 113
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->initCloseCode()V

    .line 114
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->initMessage()V

    .line 115
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
