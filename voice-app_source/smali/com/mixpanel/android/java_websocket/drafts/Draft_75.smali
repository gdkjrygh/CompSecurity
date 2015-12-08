.class public Lcom/mixpanel/android/java_websocket/drafts/Draft_75;
.super Lcom/mixpanel/android/java_websocket/drafts/Draft;
.source "Draft_75.java"


# static fields
.field public static final CR:B = 0xdt

.field public static final END_OF_FRAME:B = -0x1t

.field public static final LF:B = 0xat

.field public static final START_OF_FRAME:B


# instance fields
.field protected currentFrame:Ljava/nio/ByteBuffer;

.field protected readingState:Z

.field protected readyframes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata;",
            ">;"
        }
    .end annotation
.end field

.field private final reuseableRandom:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    .line 48
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readyframes:Ljava/util/List;

    .line 51
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->reuseableRandom:Ljava/util/Random;

    .line 26
    return-void
.end method


# virtual methods
.method public acceptHandshakeAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 2
    .param p1, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .param p2, "response"    # Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;

    .prologue
    .line 55
    const-string v0, "WebSocket-Origin"

    invoke-interface {p1, v0}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Origin"

    invoke-interface {p2, v1}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->basicAccept(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0
.end method

.method public acceptHandshakeAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 1
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    .prologue
    .line 60
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->hasFieldValue(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->basicAccept(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 63
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0
.end method

.method public copyInstance()Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .locals 1

    .prologue
    .line 204
    new-instance v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;-><init>()V

    return-object v0
.end method

.method public createBinaryFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)Ljava/nio/ByteBuffer;
    .locals 4
    .param p1, "framedata"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 68
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getOpcode()Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-result-object v2

    sget-object v3, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eq v2, v3, :cond_0

    .line 69
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "only text frames supported"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 72
    :cond_0
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 73
    .local v1, "pay":Ljava/nio/ByteBuffer;
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 74
    .local v0, "b":Ljava/nio/ByteBuffer;
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 75
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 76
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 77
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 78
    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 79
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 80
    return-object v0
.end method

.method public createBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 192
    sget v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->INITIAL_FAMESIZE:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

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
    .line 90
    new-instance v1, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    invoke-direct {v1}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>()V

    .line 92
    .local v1, "frame":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :try_start_0
    invoke-static {p1}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->utf8Bytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setFin(Z)V

    .line 97
    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-interface {v1, v2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 98
    invoke-interface {v1, p2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setTransferemasked(Z)V

    .line 99
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 93
    :catch_0
    move-exception v0

    .line 94
    .local v0, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    new-instance v2, Lcom/mixpanel/android/java_websocket/exceptions/NotSendableException;

    invoke-direct {v2, v0}, Lcom/mixpanel/android/java_websocket/exceptions/NotSendableException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public createFrames(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 2
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
    .line 85
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not yet implemented"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;
    .locals 1

    .prologue
    .line 188
    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;->NONE:Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    return-object v0
.end method

.method public increaseBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "full"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/LimitExedeedException;,
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 196
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 197
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->checkAlloc(I)I

    move-result v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 198
    .local v0, "newbuffer":Ljava/nio/ByteBuffer;
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 199
    return-object v0
.end method

.method public postProcessHandshakeRequestAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    .locals 3
    .param p1, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 104
    const-string v0, "Upgrade"

    const-string v1, "WebSocket"

    invoke-interface {p1, v0, v1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v0, "Connection"

    const-string v1, "Upgrade"

    invoke-interface {p1, v0, v1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->hasFieldValue(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    const-string v0, "Origin"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "random"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->reuseableRandom:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :cond_0
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
    .line 115
    const-string v1, "Web Socket Protocol Handshake"

    invoke-interface {p2, v1}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->setHttpStatusMessage(Ljava/lang/String;)V

    .line 116
    const-string v1, "Upgrade"

    const-string v2, "WebSocket"

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v1, "Connection"

    const-string v2, "Connection"

    invoke-interface {p1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v1, "WebSocket-Origin"

    const-string v2, "Origin"

    invoke-interface {p1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ws://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "Host"

    invoke-interface {p1, v2}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getResourceDescriptor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 120
    .local v0, "location":Ljava/lang/String;
    const-string v1, "WebSocket-Location"

    invoke-interface {p2, v1, v0}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    return-object p2
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 182
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    .line 184
    return-void
.end method

.method public translateFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 3
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
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 173
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->translateRegularFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v0

    .line 174
    .local v0, "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    if-nez v0, :cond_0

    .line 175
    new-instance v1, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v2, 0x3ea

    invoke-direct {v1, v2}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(I)V

    throw v1

    .line 177
    :cond_0
    return-object v0
.end method

.method protected translateRegularFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 5
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
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x1

    .line 127
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-nez v3, :cond_1

    .line 166
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readyframes:Ljava/util/List;

    .line 167
    .local v1, "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    iput-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readyframes:Ljava/util/List;

    .line 168
    .end local v1    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    :cond_0
    return-object v1

    .line 128
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    .line 129
    .local v2, "newestByte":B
    if-nez v2, :cond_3

    .line 130
    iget-boolean v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    if-eqz v3, :cond_2

    .line 131
    new-instance v3, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    const-string v4, "unexpected START_OF_FRAME"

    invoke-direct {v3, v4}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 132
    :cond_2
    iput-boolean v4, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    goto :goto_0

    .line 133
    :cond_3
    const/4 v3, -0x1

    if-ne v2, v3, :cond_6

    .line 134
    iget-boolean v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    if-nez v3, :cond_4

    .line 135
    new-instance v3, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;

    const-string v4, "unexpected END_OF_FRAME"

    invoke-direct {v3, v4}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 138
    :cond_4
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    if-eqz v3, :cond_5

    .line 139
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 140
    new-instance v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>()V

    .line 141
    .local v0, "curframe":Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v3}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 142
    invoke-virtual {v0, v4}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->setFin(Z)V

    .line 143
    sget-object v3, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-virtual {v0, v3}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 144
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readyframes:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    .line 146
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 148
    .end local v0    # "curframe":Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;
    :cond_5
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    goto :goto_0

    .line 149
    :cond_6
    iget-boolean v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->readingState:Z

    if-eqz v3, :cond_0

    .line 150
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    if-nez v3, :cond_8

    .line 151
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->createBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    .line 155
    :cond_7
    :goto_1
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 152
    :cond_8
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-nez v3, :cond_7

    .line 153
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v3}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->increaseBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;->currentFrame:Ljava/nio/ByteBuffer;

    goto :goto_1
.end method
