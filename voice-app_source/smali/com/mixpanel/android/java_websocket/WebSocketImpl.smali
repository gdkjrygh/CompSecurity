.class public Lcom/mixpanel/android/java_websocket/WebSocketImpl;
.super Ljava/lang/Object;
.source "WebSocketImpl.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/WebSocket;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static DEBUG:Z

.field public static RCVBUF:I

.field public static final defaultdraftlist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public channel:Ljava/nio/channels/ByteChannel;

.field private closecode:Ljava/lang/Integer;

.field private closedremotely:Ljava/lang/Boolean;

.field private closemessage:Ljava/lang/String;

.field private current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

.field private draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

.field private volatile flushandclosestate:Z

.field private handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

.field public final inQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public key:Ljava/nio/channels/SelectionKey;

.field private knownDrafts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;"
        }
    .end annotation
.end field

.field public final outQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field private readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

.field private resourceDescriptor:Ljava/lang/String;

.field private role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

.field private tmpHandshakeBytes:Ljava/nio/ByteBuffer;

.field public volatile workerThread:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

.field private final wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 48
    const-class v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    .line 50
    const/16 v0, 0x4000

    sput v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->RCVBUF:I

    .line 52
    sput-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->defaultdraftlist:Ljava/util/List;

    .line 56
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->defaultdraftlist:Ljava/util/List;

    new-instance v1, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;

    invoke-direct {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->defaultdraftlist:Ljava/util/List;

    new-instance v1, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;

    invoke-direct {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->defaultdraftlist:Ljava/util/List;

    new-instance v1, Lcom/mixpanel/android/java_websocket/drafts/Draft_76;

    invoke-direct {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_76;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->defaultdraftlist:Ljava/util/List;

    new-instance v1, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;

    invoke-direct {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_75;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    return-void

    :cond_0
    move v0, v1

    .line 48
    goto :goto_0
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Lcom/mixpanel/android/java_websocket/drafts/Draft;)V
    .locals 3
    .param p1, "listener"    # Lcom/mixpanel/android/java_websocket/WebSocketListener;
    .param p2, "draft"    # Lcom/mixpanel/android/java_websocket/drafts/Draft;

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-boolean v2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z

    .line 83
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->NOT_YET_CONNECTED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    .line 92
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    .line 96
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 99
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    .line 102
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    .line 104
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closemessage:Ljava/lang/String;

    .line 105
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closecode:Ljava/lang/Integer;

    .line 106
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closedremotely:Ljava/lang/Boolean;

    .line 108
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->resourceDescriptor:Ljava/lang/String;

    .line 131
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->SERVER:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v0, v1, :cond_1

    .line 132
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "parameters must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_1
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    .line 134
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->inQueue:Ljava/util/concurrent/BlockingQueue;

    .line 135
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    .line 136
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->CLIENT:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    .line 137
    if-eqz p2, :cond_2

    .line 138
    invoke-virtual {p2}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->copyInstance()Lcom/mixpanel/android/java_websocket/drafts/Draft;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    .line 139
    :cond_2
    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)V
    .locals 0
    .param p1, "listener"    # Lcom/mixpanel/android/java_websocket/WebSocketListener;
    .param p2, "draft"    # Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .param p3, "socket"    # Ljava/net/Socket;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 143
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;-><init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Lcom/mixpanel/android/java_websocket/drafts/Draft;)V

    .line 144
    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Ljava/util/List;)V
    .locals 1
    .param p1, "listener"    # Lcom/mixpanel/android/java_websocket/WebSocketListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/java_websocket/WebSocketListener;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 114
    .local p2, "drafts":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;-><init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Lcom/mixpanel/android/java_websocket/drafts/Draft;)V

    .line 115
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->SERVER:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    .line 117
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    :cond_0
    sget-object v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->defaultdraftlist:Ljava/util/List;

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->knownDrafts:Ljava/util/List;

    .line 122
    :goto_0
    return-void

    .line 120
    :cond_1
    iput-object p2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->knownDrafts:Ljava/util/List;

    goto :goto_0
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Ljava/util/List;Ljava/net/Socket;)V
    .locals 0
    .param p1, "listener"    # Lcom/mixpanel/android/java_websocket/WebSocketListener;
    .param p3, "socket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/java_websocket/WebSocketListener;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;",
            "Ljava/net/Socket;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 148
    .local p2, "drafts":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;-><init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Ljava/util/List;)V

    .line 149
    return-void
.end method

.method private close(ILjava/lang/String;Z)V
    .locals 6
    .param p1, "code"    # I
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "remote"    # Z

    .prologue
    const/16 v5, 0x3ee

    const/4 v4, -0x3

    const/4 v3, 0x0

    .line 400
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-eq v1, v2, :cond_1

    .line 401
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->OPEN:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v1, v2, :cond_6

    .line 402
    if-ne p1, v5, :cond_2

    .line 403
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    if-eqz p3, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 404
    :cond_0
    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    .line 405
    invoke-virtual {p0, p1, p2, v3}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 436
    :cond_1
    :goto_0
    return-void

    .line 408
    :cond_2
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    move-result-object v1

    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;->NONE:Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    if-eq v1, v2, :cond_4

    .line 410
    if-nez p3, :cond_3

    .line 412
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, p1, p2}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketCloseInitiated(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_1

    .line 417
    :cond_3
    :goto_1
    :try_start_1
    new-instance v1, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;

    invoke-direct {v1, p1, p2}, Lcom/mixpanel/android/java_websocket/framing/CloseFrameBuilder;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->sendFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    :try_end_1
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_1 .. :try_end_1} :catch_1

    .line 423
    :cond_4
    :goto_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 430
    :goto_3
    const/16 v1, 0x3ea

    if-ne p1, v1, :cond_5

    .line 431
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 432
    :cond_5
    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    .line 433
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 413
    :catch_0
    move-exception v0

    .line 414
    .local v0, "e":Ljava/lang/RuntimeException;
    :try_start_2
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    :try_end_2
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 418
    .end local v0    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v0

    .line 419
    .local v0, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 420
    const-string v1, "generated frame is invalid"

    invoke-virtual {p0, v5, v1, v3}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    goto :goto_2

    .line 424
    .end local v0    # "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    :cond_6
    if-ne p1, v4, :cond_8

    .line 425
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v1, :cond_7

    if-nez p3, :cond_7

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 426
    :cond_7
    const/4 v1, 0x1

    invoke-virtual {p0, v4, p2, v1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    goto :goto_3

    .line 428
    :cond_8
    const/4 v1, -0x1

    invoke-virtual {p0, v1, p2, v3}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    goto :goto_3
.end method

.method private decodeFrames(Ljava/nio/ByteBuffer;)V
    .locals 14
    .param p1, "socketBuffer"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 324
    :try_start_0
    iget-object v10, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v10, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->translateFrame(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v8

    .line 325
    .local v8, "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_0

    .line 397
    .end local v8    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    :goto_1
    return-void

    .line 325
    .restart local v8    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .line 326
    .local v6, "f":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    sget-boolean v11, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    if-eqz v11, :cond_1

    .line 327
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "matched frame: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 328
    :cond_1
    invoke-interface {v6}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getOpcode()Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-result-object v3

    .line 329
    .local v3, "curop":Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    invoke-interface {v6}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->isFin()Z

    move-result v7

    .line 331
    .local v7, "fin":Z
    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CLOSING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne v3, v11, :cond_5

    .line 332
    const/16 v2, 0x3ed

    .line 333
    .local v2, "code":I
    const-string v9, ""

    .line 334
    .local v9, "reason":Ljava/lang/String;
    instance-of v11, v6, Lcom/mixpanel/android/java_websocket/framing/CloseFrame;

    if-eqz v11, :cond_2

    .line 335
    move-object v0, v6

    check-cast v0, Lcom/mixpanel/android/java_websocket/framing/CloseFrame;

    move-object v1, v0

    .line 336
    .local v1, "cf":Lcom/mixpanel/android/java_websocket/framing/CloseFrame;
    invoke-interface {v1}, Lcom/mixpanel/android/java_websocket/framing/CloseFrame;->getCloseCode()I

    move-result v2

    .line 337
    invoke-interface {v1}, Lcom/mixpanel/android/java_websocket/framing/CloseFrame;->getMessage()Ljava/lang/String;

    move-result-object v9

    .line 339
    .end local v1    # "cf":Lcom/mixpanel/android/java_websocket/framing/CloseFrame;
    :cond_2
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v12, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v11, v12, :cond_3

    .line 341
    const/4 v11, 0x1

    invoke-virtual {p0, v2, v9, v11}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(ILjava/lang/String;Z)V
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 392
    .end local v2    # "code":I
    .end local v3    # "curop":Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .end local v6    # "f":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    .end local v7    # "fin":Z
    .end local v8    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    .end local v9    # "reason":Ljava/lang/String;
    :catch_0
    move-exception v5

    .line 393
    .local v5, "e1":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    iget-object v10, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v10, p0, v5}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 394
    invoke-virtual {p0, v5}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;)V

    goto :goto_1

    .line 344
    .end local v5    # "e1":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    .restart local v2    # "code":I
    .restart local v3    # "curop":Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .restart local v6    # "f":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    .restart local v7    # "fin":Z
    .restart local v8    # "frames":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    .restart local v9    # "reason":Ljava/lang/String;
    :cond_3
    :try_start_1
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v11}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    move-result-object v11

    sget-object v12, Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;->TWOWAY:Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    if-ne v11, v12, :cond_4

    .line 345
    const/4 v11, 0x1

    invoke-direct {p0, v2, v9, v11}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;Z)V

    goto :goto_0

    .line 347
    :cond_4
    const/4 v11, 0x0

    invoke-virtual {p0, v2, v9, v11}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    goto :goto_0

    .line 350
    .end local v2    # "code":I
    .end local v9    # "reason":Ljava/lang/String;
    :cond_5
    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PING:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne v3, v11, :cond_6

    .line 351
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v6}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketPing(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V

    goto :goto_0

    .line 353
    :cond_6
    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PONG:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne v3, v11, :cond_7

    .line 354
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v6}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketPong(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V

    goto/16 :goto_0

    .line 356
    :cond_7
    if-eqz v7, :cond_8

    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CONTINUOUS:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-ne v3, v11, :cond_e

    .line 357
    :cond_8
    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->CONTINUOUS:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eq v3, v11, :cond_b

    .line 358
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eqz v11, :cond_9

    .line 359
    new-instance v10, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v11, 0x3ea

    const-string v12, "Previous continuous frame sequence not completed."

    invoke-direct {v10, v11, v12}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v10

    .line 360
    :cond_9
    iput-object v3, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    :try_end_1
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_1 .. :try_end_1} :catch_0

    .line 369
    :cond_a
    :goto_2
    :try_start_2
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v6}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketMessageFragment(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 370
    :catch_1
    move-exception v4

    .line 371
    .local v4, "e":Ljava/lang/RuntimeException;
    :try_start_3
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v4}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 361
    .end local v4    # "e":Ljava/lang/RuntimeException;
    :cond_b
    if-eqz v7, :cond_d

    .line 362
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-nez v11, :cond_c

    .line 363
    new-instance v10, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v11, 0x3ea

    const-string v12, "Continuous frame sequence was not started."

    invoke-direct {v10, v11, v12}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v10

    .line 364
    :cond_c
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    goto :goto_2

    .line 365
    :cond_d
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-nez v11, :cond_a

    .line 366
    new-instance v10, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v11, 0x3ea

    const-string v12, "Continuous frame sequence was not started."

    invoke-direct {v10, v11, v12}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v10

    .line 374
    :cond_e
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->current_continuous_frame_opcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    if-eqz v11, :cond_f

    .line 375
    new-instance v10, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v11, 0x3ea

    const-string v12, "Continuous frame sequence not completed."

    invoke-direct {v10, v11, v12}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v10

    .line 376
    :cond_f
    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->TEXT:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    :try_end_3
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_3 .. :try_end_3} :catch_0

    if-ne v3, v11, :cond_10

    .line 378
    :try_start_4
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v6}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v12

    invoke-static {v12}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->stringUtf8(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, p0, v12}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    .line 379
    :catch_2
    move-exception v4

    .line 380
    .restart local v4    # "e":Ljava/lang/RuntimeException;
    :try_start_5
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v4}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 382
    .end local v4    # "e":Ljava/lang/RuntimeException;
    :cond_10
    sget-object v11, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->BINARY:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    :try_end_5
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_5 .. :try_end_5} :catch_0

    if-ne v3, v11, :cond_11

    .line 384
    :try_start_6
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v6}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v12

    invoke-interface {v11, p0, v12}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/nio/ByteBuffer;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_0

    .line 385
    :catch_3
    move-exception v4

    .line 386
    .restart local v4    # "e":Ljava/lang/RuntimeException;
    :try_start_7
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v4}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 389
    .end local v4    # "e":Ljava/lang/RuntimeException;
    :cond_11
    new-instance v10, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    const/16 v11, 0x3ea

    const-string v12, "non control or continious frame expected"

    invoke-direct {v10, v11, v12}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;-><init>(ILjava/lang/String;)V

    throw v10
    :try_end_7
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_7 .. :try_end_7} :catch_0
.end method

.method private decodeHandshake(Ljava/nio/ByteBuffer;)Z
    .locals 15
    .param p1, "socketBufferNew"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 181
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v11

    if-nez v11, :cond_0

    .line 182
    move-object/from16 v9, p1

    .line 195
    .local v9, "socketBuffer":Ljava/nio/ByteBuffer;
    :goto_0
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 197
    :try_start_0
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    if-nez v11, :cond_4

    .line 198
    invoke-direct {p0, v9}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->isFlashEdgeCase(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    move-result-object v6

    .line 199
    .local v6, "isflashedgecase":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    sget-object v11, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_0 .. :try_end_0} :catch_1

    if-ne v6, v11, :cond_4

    .line 201
    :try_start_1
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->getFlashPolicy(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->utf8Bytes(Ljava/lang/String;)[B

    move-result-object v11

    invoke-static {v11}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v11

    invoke-direct {p0, v11}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->write(Ljava/nio/ByteBuffer;)V

    .line 202
    const/4 v11, -0x3

    const-string v12, ""

    invoke-virtual {p0, v11, v12}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;)V
    :try_end_1
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 206
    :goto_1
    const/4 v11, 0x0

    .line 317
    .end local v6    # "isflashedgecase":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :goto_2
    return v11

    .line 184
    .end local v9    # "socketBuffer":Ljava/nio/ByteBuffer;
    :cond_0
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v12

    if-ge v11, v12, :cond_1

    .line 185
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v12

    add-int/2addr v11, v12

    invoke-static {v11}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 186
    .local v1, "buf":Ljava/nio/ByteBuffer;
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 187
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 188
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    .line 191
    .end local v1    # "buf":Ljava/nio/ByteBuffer;
    :cond_1
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 192
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 193
    iget-object v9, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    .restart local v9    # "socketBuffer":Ljava/nio/ByteBuffer;
    goto :goto_0

    .line 203
    .restart local v6    # "isflashedgecase":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :catch_0
    move-exception v3

    .line 204
    .local v3, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    const/16 v11, 0x3ee

    :try_start_2
    const-string v12, "remote peer closed connection before flashpolicy could be transmitted"

    const/4 v13, 0x1

    invoke-direct {p0, v11, v12, v13}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;Z)V
    :try_end_2
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 299
    .end local v3    # "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    .end local v6    # "isflashedgecase":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :catch_1
    move-exception v3

    .line 300
    .local v3, "e":Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v11

    if-nez v11, :cond_10

    .line 301
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 302
    invoke-virtual {v3}, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;->getPreferedSize()I

    move-result v7

    .line 303
    .local v7, "newsize":I
    if-nez v7, :cond_f

    .line 304
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v11

    add-int/lit8 v7, v11, 0x10

    .line 308
    :cond_2
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v11

    iput-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    .line 310
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 317
    .end local v3    # "e":Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;
    .end local v7    # "newsize":I
    :cond_3
    :goto_3
    const/4 v11, 0x0

    goto :goto_2

    .line 209
    :cond_4
    const/4 v5, 0x0

    .line 212
    .local v5, "handshakestate":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :try_start_3
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v12, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->SERVER:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v11, v12, :cond_c

    .line 213
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    if-nez v11, :cond_9

    .line 214
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->knownDrafts:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_5
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_7

    .line 248
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    if-nez v11, :cond_6

    .line 249
    const/16 v11, 0x3ea

    const-string v12, "no draft matches"

    invoke-virtual {p0, v11, v12}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;)V

    .line 251
    :cond_6
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 214
    :cond_7
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mixpanel/android/java_websocket/drafts/Draft;

    .line 215
    .local v2, "d":Lcom/mixpanel/android/java_websocket/drafts/Draft;
    invoke-virtual {v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->copyInstance()Lcom/mixpanel/android/java_websocket/drafts/Draft;
    :try_end_3
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v2

    .line 217
    :try_start_4
    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    invoke-virtual {v2, v12}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->setParseMode(Lcom/mixpanel/android/java_websocket/WebSocket$Role;)V

    .line 218
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 219
    invoke-virtual {v2, v9}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->translateHandshake(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    move-result-object v10

    .line 220
    .local v10, "tmphandshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    instance-of v12, v10, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    if-nez v12, :cond_8

    .line 221
    const/16 v12, 0x3ea

    const-string v13, "wrong http function"

    const/4 v14, 0x0

    invoke-virtual {p0, v12, v13, v14}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 222
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 224
    :cond_8
    move-object v0, v10

    check-cast v0, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    move-object v4, v0

    .line 225
    .local v4, "handshake":Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    invoke-virtual {v2, v4}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->acceptHandshakeAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    move-result-object v5

    .line 226
    sget-object v12, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    if-ne v5, v12, :cond_5

    .line 227
    invoke-interface {v4}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;->getResourceDescriptor()Ljava/lang/String;

    move-result-object v12

    iput-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->resourceDescriptor:Ljava/lang/String;
    :try_end_4
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 230
    :try_start_5
    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v12, p0, v2, v4}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketHandshakeReceivedAsServer(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/drafts/Draft;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    :try_end_5
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_5 .. :try_end_5} :catch_1

    move-result-object v8

    .line 239
    .local v8, "response":Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    :try_start_6
    invoke-virtual {v2, v4, v8}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->postProcessHandshakeResponseAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/HandshakeBuilder;

    move-result-object v12

    iget-object v13, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    invoke-virtual {v2, v12, v13}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->createHandshake(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;Lcom/mixpanel/android/java_websocket/WebSocket$Role;)Ljava/util/List;

    move-result-object v12

    invoke-direct {p0, v12}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->write(Ljava/util/List;)V

    .line 240
    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    .line 241
    invoke-direct {p0, v4}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->open(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)V

    .line 242
    const/4 v11, 0x1

    goto/16 :goto_2

    .line 231
    .end local v8    # "response":Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    :catch_2
    move-exception v3

    .line 232
    .local v3, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    invoke-virtual {v3}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;->getCloseCode()I

    move-result v12

    invoke-virtual {v3}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;->getMessage()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {p0, v12, v13, v14}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 233
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 234
    .end local v3    # "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    :catch_3
    move-exception v3

    .line 235
    .local v3, "e":Ljava/lang/RuntimeException;
    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v12, p0, v3}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 236
    const/4 v12, -0x1

    invoke-virtual {v3}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {p0, v12, v13, v14}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V
    :try_end_6
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_6 .. :try_end_6} :catch_1

    .line 237
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 254
    .end local v2    # "d":Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .end local v3    # "e":Ljava/lang/RuntimeException;
    .end local v4    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .end local v10    # "tmphandshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    :cond_9
    :try_start_7
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v11, v9}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->translateHandshake(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    move-result-object v10

    .line 255
    .restart local v10    # "tmphandshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    instance-of v11, v10, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    if-nez v11, :cond_a

    .line 256
    const/16 v11, 0x3ea

    const-string v12, "wrong http function"

    const/4 v13, 0x0

    invoke-virtual {p0, v11, v12, v13}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 257
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 259
    :cond_a
    move-object v0, v10

    check-cast v0, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    move-object v4, v0

    .line 260
    .restart local v4    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v11, v4}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->acceptHandshakeAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    move-result-object v5

    .line 262
    sget-object v11, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    if-ne v5, v11, :cond_b

    .line 263
    invoke-direct {p0, v4}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->open(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)V

    .line 264
    const/4 v11, 0x1

    goto/16 :goto_2

    .line 266
    :cond_b
    const/16 v11, 0x3ea

    const-string v12, "the handshake did finaly not match"

    invoke-virtual {p0, v11, v12}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;)V

    .line 268
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 270
    .end local v4    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .end local v10    # "tmphandshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    :cond_c
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v12, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->CLIENT:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v11, v12, :cond_3

    .line 271
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    invoke-virtual {v11, v12}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->setParseMode(Lcom/mixpanel/android/java_websocket/WebSocket$Role;)V

    .line 272
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v11, v9}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->translateHandshake(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    move-result-object v10

    .line 273
    .restart local v10    # "tmphandshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    instance-of v11, v10, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;

    if-nez v11, :cond_d

    .line 274
    const/16 v11, 0x3ea

    const-string v12, "wrong http function"

    const/4 v13, 0x0

    invoke-virtual {p0, v11, v12, v13}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 275
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 277
    :cond_d
    move-object v0, v10

    check-cast v0, Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;

    move-object v4, v0

    .line 278
    .local v4, "handshake":Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    invoke-virtual {v11, v12, v4}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->acceptHandshakeAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    move-result-object v5

    .line 279
    sget-object v11, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :try_end_7
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_7 .. :try_end_7} :catch_1

    if-ne v5, v11, :cond_e

    .line 281
    :try_start_8
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    invoke-interface {v11, p0, v12, v4}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketHandshakeReceivedAsClient(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)V
    :try_end_8
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_8 .. :try_end_8} :catch_1

    .line 290
    :try_start_9
    invoke-direct {p0, v4}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->open(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)V

    .line 291
    const/4 v11, 0x1

    goto/16 :goto_2

    .line 282
    :catch_4
    move-exception v3

    .line 283
    .local v3, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    invoke-virtual {v3}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;->getCloseCode()I

    move-result v11

    invoke-virtual {v3}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;->getMessage()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {p0, v11, v12, v13}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 284
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 285
    .end local v3    # "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    :catch_5
    move-exception v3

    .line 286
    .local v3, "e":Ljava/lang/RuntimeException;
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v11, p0, v3}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 287
    const/4 v11, -0x1

    invoke-virtual {v3}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {p0, v11, v12, v13}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushAndClose(ILjava/lang/String;Z)V

    .line 288
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 293
    .end local v3    # "e":Ljava/lang/RuntimeException;
    :cond_e
    const/16 v11, 0x3ea

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "draft "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v13, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " refuses handshake"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p0, v11, v12}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;)V
    :try_end_9
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_3

    .line 296
    .end local v4    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;
    .end local v10    # "tmphandshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    :catch_6
    move-exception v3

    .line 297
    .local v3, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
    :try_start_a
    invoke-virtual {p0, v3}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;)V
    :try_end_a
    .catch Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException; {:try_start_a .. :try_end_a} :catch_1

    goto/16 :goto_3

    .line 306
    .end local v5    # "handshakestate":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .local v3, "e":Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;
    .restart local v7    # "newsize":I
    :cond_f
    sget-boolean v11, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v11, :cond_2

    invoke-virtual {v3}, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;->getPreferedSize()I

    move-result v11

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v12

    if-ge v11, v12, :cond_2

    new-instance v11, Ljava/lang/AssertionError;

    invoke-direct {v11}, Ljava/lang/AssertionError;-><init>()V

    throw v11

    .line 313
    .end local v7    # "newsize":I
    :cond_10
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->limit()I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 314
    iget-object v11, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    iget-object v12, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    goto/16 :goto_3

    .line 244
    .end local v3    # "e":Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;
    .restart local v2    # "d":Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .restart local v5    # "handshakestate":Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    :catch_7
    move-exception v12

    goto/16 :goto_4
.end method

.method private isFlashEdgeCase(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 3
    .param p1, "request"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;
        }
    .end annotation

    .prologue
    .line 600
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 601
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft;->FLASH_POLICY_REQUEST:[B

    array-length v2, v2

    if-le v1, v2, :cond_0

    .line 602
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 613
    :goto_0
    return-object v1

    .line 603
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft;->FLASH_POLICY_REQUEST:[B

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 604
    new-instance v1, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;

    sget-object v2, Lcom/mixpanel/android/java_websocket/drafts/Draft;->FLASH_POLICY_REQUEST:[B

    array-length v2, v2

    invoke-direct {v1, v2}, Lcom/mixpanel/android/java_websocket/exceptions/IncompleteHandshakeException;-><init>(I)V

    throw v1

    .line 607
    :cond_1
    const/4 v0, 0x0

    .local v0, "flash_policy_index":I
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_2

    .line 613
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0

    .line 608
    :cond_2
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft;->FLASH_POLICY_REQUEST:[B

    aget-byte v1, v1, v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    if-eq v1, v2, :cond_3

    .line 609
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 610
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0

    .line 607
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private open(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)V
    .locals 4
    .param p1, "d"    # Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    .prologue
    .line 663
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    if-eqz v1, :cond_0

    .line 664
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "open using draft: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 665
    :cond_0
    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->OPEN:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    .line 667
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, p1}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketOpen(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 671
    :goto_0
    return-void

    .line 668
    :catch_0
    move-exception v0

    .line 669
    .local v0, "e":Ljava/lang/RuntimeException;
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private send(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/mixpanel/android/java_websocket/framing/Framedata;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 575
    .local p1, "frames":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/mixpanel/android/java_websocket/framing/Framedata;>;"
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    .line 576
    new-instance v1, Lcom/mixpanel/android/java_websocket/exceptions/WebsocketNotConnectedException;

    invoke-direct {v1}, Lcom/mixpanel/android/java_websocket/exceptions/WebsocketNotConnectedException;-><init>()V

    throw v1

    .line 577
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 580
    return-void

    .line 577
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .line 578
    .local v0, "f":Lcom/mixpanel/android/java_websocket/framing/Framedata;
    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->sendFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V

    goto :goto_0
.end method

.method private write(Ljava/nio/ByteBuffer;)V
    .locals 4
    .param p1, "buf"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 642
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 643
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "write("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "): {"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v3, 0x3e8

    if-le v0, v3, :cond_1

    const-string v0, "too big to display"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "}"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 645
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 653
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v0, p0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWriteDemand(Lcom/mixpanel/android/java_websocket/WebSocket;)V

    .line 654
    return-void

    .line 643
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method private write(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 657
    .local p1, "bufs":Ljava/util/List;, "Ljava/util/List<Ljava/nio/ByteBuffer;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 660
    return-void

    .line 657
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 658
    .local v0, "b":Ljava/nio/ByteBuffer;
    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->write(Ljava/nio/ByteBuffer;)V

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 732
    const/16 v0, 0x3e8

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(I)V

    .line 733
    return-void
.end method

.method public close(I)V
    .locals 2
    .param p1, "code"    # I

    .prologue
    .line 536
    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;Z)V

    .line 537
    return-void
.end method

.method public close(ILjava/lang/String;)V
    .locals 1
    .param p1, "code"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 440
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;Z)V

    .line 441
    return-void
.end method

.method public close(Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;)V
    .locals 3
    .param p1, "e"    # Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;

    .prologue
    .line 540
    invoke-virtual {p1}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;->getCloseCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->close(ILjava/lang/String;Z)V

    .line 541
    return-void
.end method

.method public closeConnection()V
    .locals 3

    .prologue
    .line 486
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closedremotely:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 487
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "this method must be used in conjuction with flushAndClose"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closecode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closemessage:Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closedremotely:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(ILjava/lang/String;Z)V

    .line 490
    return-void
.end method

.method public closeConnection(ILjava/lang/String;)V
    .locals 1
    .param p1, "code"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 493
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(ILjava/lang/String;Z)V

    .line 494
    return-void
.end method

.method protected declared-synchronized closeConnection(ILjava/lang/String;Z)V
    .locals 3
    .param p1, "code"    # I
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "remote"    # Z

    .prologue
    .line 453
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_0

    .line 479
    :goto_0
    monitor-exit p0

    return-void

    .line 457
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->key:Ljava/nio/channels/SelectionKey;

    if-eqz v1, :cond_1

    .line 459
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->key:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 461
    :cond_1
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    .line 463
    :try_start_2
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    invoke-interface {v1}, Ljava/nio/channels/ByteChannel;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 469
    :cond_2
    :goto_1
    :try_start_3
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketClose(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 473
    :goto_2
    :try_start_4
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    if-eqz v1, :cond_3

    .line 474
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->reset()V

    .line 475
    :cond_3
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    .line 477
    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    .line 478
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 453
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 464
    :catch_0
    move-exception v0

    .line 465
    .local v0, "e":Ljava/io/IOException;
    :try_start_5
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto :goto_1

    .line 470
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 471
    .local v0, "e":Ljava/lang/RuntimeException;
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2
.end method

.method protected closeConnection(IZ)V
    .locals 1
    .param p1, "code"    # I
    .param p2, "remote"    # Z

    .prologue
    .line 482
    const-string v0, ""

    invoke-virtual {p0, p1, v0, p2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(ILjava/lang/String;Z)V

    .line 483
    return-void
.end method

.method public decode(Ljava/nio/ByteBuffer;)V
    .locals 6
    .param p1, "socketBuffer"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 155
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 157
    :cond_0
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    if-eqz v0, :cond_1

    .line 158
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "process("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "): {"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v3, 0x3e8

    if-le v0, v3, :cond_3

    const-string v0, "too big to display"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "}"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->NOT_YET_CONNECTED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-eq v0, v1, :cond_4

    .line 161
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->decodeFrames(Ljava/nio/ByteBuffer;)V

    .line 173
    :cond_2
    :goto_1
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->isClosing()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->isFlushAndClose()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 158
    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    invoke-direct {v0, v3, v4, v5}, Ljava/lang/String;-><init>([BII)V

    goto :goto_0

    .line 163
    :cond_4
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->decodeHandshake(Ljava/nio/ByteBuffer;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 166
    :cond_5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 167
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->decodeFrames(Ljava/nio/ByteBuffer;)V

    goto :goto_1

    .line 168
    :cond_6
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->tmpHandshakeBytes:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->decodeFrames(Ljava/nio/ByteBuffer;)V

    goto :goto_1

    .line 174
    :cond_7
    return-void
.end method

.method public eot()V
    .locals 5

    .prologue
    const/16 v4, 0x3ee

    const/16 v3, 0x3e8

    const/4 v2, 0x1

    .line 518
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->getReadyState()Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    move-result-object v0

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->NOT_YET_CONNECTED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v0, v1, :cond_0

    .line 519
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(IZ)V

    .line 532
    :goto_0
    return-void

    .line 520
    :cond_0
    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z

    if-eqz v0, :cond_1

    .line 521
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closecode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closemessage:Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closedremotely:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(ILjava/lang/String;Z)V

    goto :goto_0

    .line 522
    :cond_1
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    move-result-object v0

    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;->NONE:Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    if-ne v0, v1, :cond_2

    .line 523
    invoke-virtual {p0, v3, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(IZ)V

    goto :goto_0

    .line 524
    :cond_2
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->getCloseHandshakeType()Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    move-result-object v0

    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;->ONEWAY:Lcom/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType;

    if-ne v0, v1, :cond_4

    .line 525
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->SERVER:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v0, v1, :cond_3

    .line 526
    invoke-virtual {p0, v4, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(IZ)V

    goto :goto_0

    .line 528
    :cond_3
    invoke-virtual {p0, v3, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(IZ)V

    goto :goto_0

    .line 530
    :cond_4
    invoke-virtual {p0, v4, v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection(IZ)V

    goto :goto_0
.end method

.method protected declared-synchronized flushAndClose(ILjava/lang/String;Z)V
    .locals 2
    .param p1, "code"    # I
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "remote"    # Z

    .prologue
    .line 497
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 515
    :goto_0
    monitor-exit p0

    return-void

    .line 500
    :cond_0
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closecode:Ljava/lang/Integer;

    .line 501
    iput-object p2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closemessage:Ljava/lang/String;

    .line 502
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closedremotely:Ljava/lang/Boolean;

    .line 504
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z

    .line 506
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWriteDemand(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 508
    :try_start_2
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketClosing(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 512
    :goto_1
    :try_start_3
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    if-eqz v1, :cond_1

    .line 513
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v1}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->reset()V

    .line 514
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 497
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 509
    :catch_0
    move-exception v0

    .line 510
    .local v0, "e":Ljava/lang/RuntimeException;
    :try_start_4
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1
.end method

.method public getDraft()Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .locals 1

    .prologue
    .line 727
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    return-object v0
.end method

.method public getLocalSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .prologue
    .line 722
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v0, p0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->getLocalSocketAddress(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public getReadyState()Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;
    .locals 1

    .prologue
    .line 702
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    return-object v0
.end method

.method public getRemoteSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .prologue
    .line 717
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v0, p0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->getRemoteSocketAddress(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public getResourceDescriptor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 737
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->resourceDescriptor:Ljava/lang/String;

    return-object v0
.end method

.method public hasBufferedData()Z
    .locals 1

    .prologue
    .line 596
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 707
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isClosed()Z
    .locals 2

    .prologue
    .line 697
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSED:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isClosing()Z
    .locals 2

    .prologue
    .line 687
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CLOSING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isConnecting()Z
    .locals 2

    .prologue
    .line 675
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CONNECTING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 676
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CONNECTING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isFlushAndClose()Z
    .locals 1

    .prologue
    .line 692
    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z

    return v0
.end method

.method public isOpen()Z
    .locals 2

    .prologue
    .line 681
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->OPEN:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->flushandclosestate:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 682
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v1, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->OPEN:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public send(Ljava/lang/String;)V
    .locals 3
    .param p1, "text"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/WebsocketNotConnectedException;
        }
    .end annotation

    .prologue
    .line 551
    if-nez p1, :cond_0

    .line 552
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot send \'null\' data to a WebSocketImpl."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 553
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->CLIENT:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, p1, v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->createFrames(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->send(Ljava/util/Collection;)V

    .line 554
    return-void

    .line 553
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public send(Ljava/nio/ByteBuffer;)V
    .locals 3
    .param p1, "bytes"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lcom/mixpanel/android/java_websocket/exceptions/WebsocketNotConnectedException;
        }
    .end annotation

    .prologue
    .line 564
    if-nez p1, :cond_0

    .line 565
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot send \'null\' data to a WebSocketImpl."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 566
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->CLIENT:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, p1, v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->createFrames(Ljava/nio/ByteBuffer;Z)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->send(Ljava/util/Collection;)V

    .line 567
    return-void

    .line 566
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public send([B)V
    .locals 1
    .param p1, "bytes"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Lcom/mixpanel/android/java_websocket/exceptions/WebsocketNotConnectedException;
        }
    .end annotation

    .prologue
    .line 571
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->send(Ljava/nio/ByteBuffer;)V

    .line 572
    return-void
.end method

.method public sendFragmentedFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;Ljava/nio/ByteBuffer;Z)V
    .locals 1
    .param p1, "op"    # Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .param p2, "buffer"    # Ljava/nio/ByteBuffer;
    .param p3, "fin"    # Z

    .prologue
    .line 584
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->continuousFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;Ljava/nio/ByteBuffer;Z)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->send(Ljava/util/Collection;)V

    .line 585
    return-void
.end method

.method public sendFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 3
    .param p1, "framedata"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 589
    sget-boolean v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 590
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "send frame: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 591
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->createBinaryFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->write(Ljava/nio/ByteBuffer;)V

    .line 592
    return-void
.end method

.method public startHandshake(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)V
    .locals 4
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 618
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->readystate:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    sget-object v2, Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;->CONNECTING:Lcom/mixpanel/android/java_websocket/WebSocket$READYSTATE;

    if-ne v1, v2, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "shall only be called once"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 621
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    invoke-virtual {v1, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->postProcessHandshakeRequestAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    .line 623
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->getResourceDescriptor()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->resourceDescriptor:Ljava/lang/String;

    .line 624
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->$assertionsDisabled:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->resourceDescriptor:Ljava/lang/String;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 628
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    invoke-interface {v1, p0, v2}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketHandshakeSentAsClient(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)V
    :try_end_0
    .catch Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 638
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->draft:Lcom/mixpanel/android/java_websocket/drafts/Draft;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->handshakerequest:Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->role:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    invoke-virtual {v1, v2, v3}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->createHandshake(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;Lcom/mixpanel/android/java_websocket/WebSocket$Role;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->write(Ljava/util/List;)V

    .line 639
    return-void

    .line 629
    :catch_0
    move-exception v0

    .line 631
    .local v0, "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    new-instance v1, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;

    const-string v2, "Handshake data rejected by client."

    invoke-direct {v1, v2}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 632
    .end local v0    # "e":Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
    :catch_1
    move-exception v0

    .line 633
    .local v0, "e":Ljava/lang/RuntimeException;
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->wsl:Lcom/mixpanel/android/java_websocket/WebSocketListener;

    invoke-interface {v1, p0, v0}, Lcom/mixpanel/android/java_websocket/WebSocketListener;->onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 634
    new-instance v1, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "rejected because of"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 712
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
