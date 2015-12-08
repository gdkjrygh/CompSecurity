.class public abstract Lcom/mixpanel/android/java_websocket/drafts/Draft;
.super Ljava/lang/Object;
.source "Draft.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;,
        Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    }
.end annotation


# static fields
.field public static final FLASH_POLICY_REQUEST:[B

.field public static INITIAL_FAMESIZE:I

.field public static MAX_FAME_SIZE:I


# instance fields
.field protected continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

.field protected role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    const/16 v0, 0x3e8

    sput v0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->MAX_FAME_SIZE:I

    .line 45
    const/16 v0, 0x40

    sput v0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->INITIAL_FAMESIZE:I

    .line 47
    const-string v0, "<policy-file-request/>\u0000"

    invoke-static {v0}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->utf8Bytes(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->FLASH_POLICY_REQUEST:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    .line 52
    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 32
    return-void
.end method

.method public static readLine(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 5
    .param p0, "buf"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 55
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 56
    .local v2, "sbuf":Ljava/nio/ByteBuffer;
    const/16 v1, 0x30

    .line 57
    .local v1, "prev":B
    const/16 v0, 0x30

    .line 58
    .local v0, "cur":B
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-nez v3, :cond_1

    .line 70
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 71
    const/4 v2, 0x0

    .end local v2    # "sbuf":Ljava/nio/ByteBuffer;
    :goto_0
    return-object v2

    .line 59
    .restart local v2    # "sbuf":Ljava/nio/ByteBuffer;
    :cond_1
    move v1, v0

    .line 60
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 61
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 62
    const/16 v3, 0xd

    if-ne v1, v3, :cond_0

    const/16 v3, 0xa

    if-ne v0, v3, :cond_0

    .line 63
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 64
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0
.end method

.method public static readStringLine(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 4
    .param p0, "buf"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 75
    invoke-static {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->readLine(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 76
    .local v0, "b":Ljava/nio/ByteBuffer;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->stringAscii([BII)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static translateHandshakeHttp(Ljava/nio/ByteBuffer;Lcom/mixpanel/android/java_websocket/WebSocket$Role;)Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;
    .locals 12
    .param p0, "buf"    # Ljava/nio/ByteBuffer;
    .param p1, "role"    # Lcom/mixpanel/android/java_websocket/WebSocket$Role;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;,
            Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x3

    const/4 v11, 0x2

    const/4 v10, 0x1

    .line 82
    invoke-static {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->readStringLine(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v3

    .line 83
    .local v3, "line":Ljava/lang/String;
    if-nez v3, :cond_0

    .line 84
    new-instance v6, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v7

    add-int/lit16 v7, v7, 0x80

    invoke-direct {v6, v7}, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;-><init>(I)V

    throw v6

    .line 86
    :cond_0
    const-string v6, " "

    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    .line 87
    .local v1, "firstLineTokens":[Ljava/lang/String;
    array-length v6, v1

    if-eq v6, v7, :cond_1

    .line 88
    new-instance v6, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;

    invoke-direct {v6}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;-><init>()V

    throw v6

    .line 91
    :cond_1
    sget-object v6, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->CLIENT:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne p1, v6, :cond_3

    .line 93
    new-instance v2, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Server;

    invoke-direct {v2}, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Server;-><init>()V

    .local v2, "handshake":Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;
    move-object v5, v2

    .line 94
    check-cast v5, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;

    .line 95
    .local v5, "serverhandshake":Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    aget-object v6, v1, v10

    invoke-static {v6}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v6

    invoke-interface {v5, v6}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->setHttpStatus(S)V

    .line 96
    aget-object v6, v1, v11

    invoke-interface {v5, v6}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;->setHttpStatusMessage(Ljava/lang/String;)V

    .line 104
    .end local v5    # "serverhandshake":Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    :goto_0
    invoke-static {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->readStringLine(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v3

    .line 105
    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-gtz v6, :cond_4

    .line 112
    :cond_2
    if-nez v3, :cond_6

    .line 113
    new-instance v6, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;

    invoke-direct {v6}, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;-><init>()V

    throw v6

    .line 99
    .end local v2    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;
    :cond_3
    new-instance v0, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Client;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Client;-><init>()V

    .line 100
    .local v0, "clienthandshake":Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    aget-object v6, v1, v10

    invoke-interface {v0, v6}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->setResourceDescriptor(Ljava/lang/String;)V

    .line 101
    move-object v2, v0

    .restart local v2    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;
    goto :goto_0

    .line 106
    .end local v0    # "clienthandshake":Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    :cond_4
    const-string v6, ":"

    invoke-virtual {v3, v6, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 107
    .local v4, "pair":[Ljava/lang/String;
    array-length v6, v4

    if-eq v6, v11, :cond_5

    .line 108
    new-instance v6, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;

    const-string v7, "not an http header"

    invoke-direct {v6, v7}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 109
    :cond_5
    const/4 v6, 0x0

    aget-object v6, v4, v6

    aget-object v7, v4, v10

    const-string v8, "^ +"

    const-string v9, ""

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v6, v7}, Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    invoke-static {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->readStringLine(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 114
    .end local v4    # "pair":[Ljava/lang/String;
    :cond_6
    return-object v2
.end method


# virtual methods
.method public abstract acceptHandshakeAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation
.end method

.method public abstract acceptHandshakeAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation
.end method

.method protected basicAccept(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)Z
    .locals 2
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    .prologue
    .line 122
    const-string v0, "Upgrade"

    invoke-interface {p1, v0}, Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "websocket"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connection"

    invoke-interface {p1, v0}, Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "upgrade"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public checkAlloc(I)I
    .locals 3
    .param p1, "bytecount"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/LimitExedeedException;,
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 215
    if-gez p1, :cond_0

    .line 216
    new-instance v0, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v1, 0x3ea

    const-string v2, "Negative count"

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 217
    :cond_0
    return p1
.end method

.method public continuousFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 4
    .param p1, "op"    # Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .param p2, "buffer"    # Ljava/nio/ByteBuffer;
    .param p3, "fin"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata;",
            ">;"
        }
    .end annotation

    .prologue
    .line 132
    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->BINARY:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eq p1, v2, :cond_0

    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eq p1, v2, :cond_0

    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eq p1, v2, :cond_0

    .line 133
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Only Opcode.BINARY or  Opcode.TEXT are allowed"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 136
    :cond_0
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eqz v2, :cond_1

    .line 137
    sget-object v2, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CONTINUOUS:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 142
    :goto_0
    new-instance v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-direct {v0, v2}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 144
    .local v0, "bui":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :try_start_0
    invoke-interface {v0, p2}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    invoke-interface {v0, p3}, Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;->setFin(Z)V

    .line 149
    if-eqz p3, :cond_2

    .line 150
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 154
    :goto_1
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 139
    .end local v0    # "bui":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :cond_1
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_0

    .line 145
    .restart local v0    # "bui":Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;
    :catch_0
    move-exception v1

    .line 146
    .local v1, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 152
    .end local v1    # "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    :cond_2
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrameType:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_1
.end method

.method public abstract copyInstance()Lcom/mixpanel/android/java_websocket/drafts/Draft;
.end method

.method public abstract createBinaryFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)Ljava/nio/ByteBuffer;
.end method

.method public abstract createFrames(Ljava/lang/String;Z)Ljava/util/List;
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
.end method

.method public abstract createFrames(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
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
.end method

.method public createHandshake(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;Lcom/mixpanel/android/java_websocket/WebSocket$Role;)Ljava/util/List;
    .locals 1
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    .param p2, "ownrole"    # Lcom/mixpanel/android/java_websocket/WebSocket$Role;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;",
            "Lcom/mixpanel/android/java_websocket/WebSocket$Role;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 160
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->createHandshake(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;Lcom/mixpanel/android/java_websocket/WebSocket$Role;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public createHandshake(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;Lcom/mixpanel/android/java_websocket/WebSocket$Role;Z)Ljava/util/List;
    .locals 9
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    .param p2, "ownrole"    # Lcom/mixpanel/android/java_websocket/WebSocket$Role;
    .param p3, "withcontent"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;",
            "Lcom/mixpanel/android/java_websocket/WebSocket$Role;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v7, 0x64

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 165
    .local v0, "bui":Ljava/lang/StringBuilder;
    instance-of v7, p1, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    if-eqz v7, :cond_1

    .line 166
    const-string v7, "GET "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, p1

    .line 167
    check-cast v7, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    invoke-interface {v7}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getResourceDescriptor()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    const-string v7, " HTTP/1.1"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    :goto_0
    const-string v7, "\r\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;->iterateHttpFields()Ljava/util/Iterator;

    move-result-object v6

    .line 176
    .local v6, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3

    .line 184
    const-string v7, "\r\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->asciiBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 187
    .local v5, "httpheader":[B
    if-eqz p3, :cond_4

    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;->getContent()[B

    move-result-object v2

    .line 188
    .local v2, "content":[B
    :goto_2
    if-nez v2, :cond_5

    const/4 v7, 0x0

    :goto_3
    array-length v8, v5

    add-int/2addr v7, v8

    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 189
    .local v1, "bytebuffer":Ljava/nio/ByteBuffer;
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 190
    if-eqz v2, :cond_0

    .line 191
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 192
    :cond_0
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 193
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    return-object v7

    .line 169
    .end local v1    # "bytebuffer":Ljava/nio/ByteBuffer;
    .end local v2    # "content":[B
    .end local v5    # "httpheader":[B
    .end local v6    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_1
    instance-of v7, p1, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;

    if-eqz v7, :cond_2

    .line 170
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v7, "HTTP/1.1 101 "

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v7, p1

    check-cast v7, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;

    invoke-interface {v7}, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;->getHttpStatusMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 172
    :cond_2
    new-instance v7, Ljava/lang/RuntimeException;

    const-string v8, "unknow role"

    invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 177
    .restart local v6    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 178
    .local v3, "fieldname":Ljava/lang/String;
    invoke-interface {p1, v3}, Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;->getFieldValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 179
    .local v4, "fieldvalue":Ljava/lang/String;
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    const-string v7, ": "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    const-string v7, "\r\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 187
    .end local v3    # "fieldname":Ljava/lang/String;
    .end local v4    # "fieldvalue":Ljava/lang/String;
    .restart local v5    # "httpheader":[B
    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    .line 188
    .restart local v2    # "content":[B
    :cond_5
    array-length v7, v2

    goto :goto_3
.end method

.method public abstract getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;
.end method

.method public getRole()Lcom/mixpanel/android/java_websocket/WebSocket$Role;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    return-object v0
.end method

.method public abstract postProcessHandshakeRequestAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation
.end method

.method public abstract postProcessHandshakeResponseAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public setParseMode(Lcom/mixpanel/android/java_websocket/WebSocket$Role;)V
    .locals 0
    .param p1, "role"    # Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    .prologue
    .line 221
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    .line 222
    return-void
.end method

.method public abstract translateFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;
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
.end method

.method public translateHandshake(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    .locals 1
    .param p1, "buf"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 211
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/drafts/Draft;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    invoke-static {p1, v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->translateHandshakeHttp(Ljava/nio/ByteBuffer;Lcom/mixpanel/android/java_websocket/WebSocket$Role;)Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;

    move-result-object v0

    return-object v0
.end method
