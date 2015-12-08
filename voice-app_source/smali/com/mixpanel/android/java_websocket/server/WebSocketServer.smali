.class public abstract Lcom/mixpanel/android/java_websocket/server/WebSocketServer;
.super Lcom/mixpanel/android/java_websocket/WebSocketAdapter;
.source "WebSocketServer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;,
        Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static DECODERS:I


# instance fields
.field private final address:Ljava/net/InetSocketAddress;

.field private buffers:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field private final connections:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/mixpanel/android/java_websocket/WebSocket;",
            ">;"
        }
    .end annotation
.end field

.field private decoders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;",
            ">;"
        }
    .end annotation
.end field

.field private drafts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;"
        }
    .end annotation
.end field

.field private iqueue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/WebSocketImpl;",
            ">;"
        }
    .end annotation
.end field

.field private volatile isclosed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private queueinvokes:I

.field private queuesize:Ljava/util/concurrent/atomic/AtomicInteger;

.field private selector:Ljava/nio/channels/Selector;

.field private selectorthread:Ljava/lang/Thread;

.field private server:Ljava/nio/channels/ServerSocketChannel;

.field private wsf:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->$assertionsDisabled:Z

    .line 56
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->DECODERS:I

    return-void

    .line 54
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .prologue
    .line 101
    new-instance v0, Ljava/net/InetSocketAddress;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/net/InetSocketAddress;-><init>(I)V

    sget v1, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->DECODERS:I

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 2
    .param p1, "address"    # Ljava/net/InetSocketAddress;

    .prologue
    .line 110
    sget v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->DECODERS:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    .line 111
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;I)V
    .locals 1
    .param p1, "address"    # Ljava/net/InetSocketAddress;
    .param p2, "decoders"    # I

    .prologue
    .line 117
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    .line 118
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V
    .locals 1
    .param p1, "address"    # Ljava/net/InetSocketAddress;
    .param p2, "decodercount"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/InetSocketAddress;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 131
    .local p3, "drafts":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;Ljava/util/Collection;)V

    .line 132
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;ILjava/util/List;Ljava/util/Collection;)V
    .locals 4
    .param p1, "address"    # Ljava/net/InetSocketAddress;
    .param p2, "decodercount"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/InetSocketAddress;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "Lcom/mixpanel/android/java_websocket/WebSocket;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p3, "drafts":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    .local p4, "connectionscontainer":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    const/4 v3, 0x0

    .line 154
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/WebSocketAdapter;-><init>()V

    .line 83
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->isclosed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    iput v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queueinvokes:I

    .line 90
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queuesize:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 92
    new-instance v2, Lcom/mixpanel/android/java_websocket/server/DefaultWebSocketServerFactory;

    invoke-direct {v2}, Lcom/mixpanel/android/java_websocket/server/DefaultWebSocketServerFactory;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->wsf:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;

    .line 155
    if-eqz p1, :cond_0

    const/4 v2, 0x1

    if-lt p2, v2, :cond_0

    if-nez p4, :cond_1

    .line 156
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "address and connectionscontainer must not be null and you need at least 1 decoder"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 159
    :cond_1
    if-nez p3, :cond_2

    .line 160
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->drafts:Ljava/util/List;

    .line 164
    :goto_0
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->address:Ljava/net/InetSocketAddress;

    .line 165
    iput-object p4, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    .line 167
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->iqueue:Ljava/util/List;

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    .line 170
    new-instance v2, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v2}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->buffers:Ljava/util/concurrent/BlockingQueue;

    .line 171
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    if-lt v1, p2, :cond_3

    .line 176
    return-void

    .line 162
    .end local v1    # "i":I
    :cond_2
    iput-object p3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->drafts:Ljava/util/List;

    goto :goto_0

    .line 172
    .restart local v1    # "i":I
    :cond_3
    new-instance v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;-><init>(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;)V

    .line 173
    .local v0, "ex":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    invoke-virtual {v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->start()V

    .line 171
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Ljava/util/List;)V
    .locals 1
    .param p1, "address"    # Ljava/net/InetSocketAddress;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/InetSocketAddress;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 124
    .local p2, "drafts":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    sget v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->DECODERS:I

    invoke-direct {p0, p1, v0, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    .line 125
    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;Ljava/nio/ByteBuffer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 440
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method static synthetic access$1(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    .locals 0

    .prologue
    .line 464
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->handleFatal(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    return-void
.end method

.method private getSocket(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/Socket;
    .locals 2
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;

    .prologue
    .line 627
    move-object v0, p1

    check-cast v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    .line 628
    .local v0, "impl":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    iget-object v1, v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->key:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v1

    check-cast v1, Ljava/nio/channels/SocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v1

    return-object v1
.end method

.method private handleFatal(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    .locals 3
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "e"    # Ljava/lang/Exception;

    .prologue
    const/4 v2, 0x0

    .line 465
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 467
    :try_start_0
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->stop()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 474
    :goto_0
    return-void

    .line 468
    :catch_0
    move-exception v0

    .line 469
    .local v0, "e1":Ljava/io/IOException;
    invoke-virtual {p0, v2, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto :goto_0

    .line 470
    .end local v0    # "e1":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 471
    .local v0, "e1":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 472
    invoke-virtual {p0, v2, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private handleIOException(Ljava/nio/channels/SelectionKey;Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/io/IOException;)V
    .locals 4
    .param p1, "key"    # Ljava/nio/channels/SelectionKey;
    .param p2, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p3, "ex"    # Ljava/io/IOException;

    .prologue
    .line 448
    if-eqz p2, :cond_1

    .line 449
    const/16 v1, 0x3ee

    invoke-virtual {p3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Lcom/mixpanel/android/java_websocket/WebSocket;->closeConnection(ILjava/lang/String;)V

    .line 462
    :cond_0
    :goto_0
    return-void

    .line 450
    :cond_1
    if-eqz p1, :cond_0

    .line 451
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    .line 452
    .local v0, "channel":Ljava/nio/channels/SelectableChannel;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->isOpen()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 454
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 458
    :goto_1
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->DEBUG:Z

    if-eqz v1, :cond_0

    .line 459
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Connection closed because of"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 455
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private pushBuffer(Ljava/nio/ByteBuffer;)V
    .locals 2
    .param p1, "buf"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 441
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->buffers:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queuesize:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 444
    :goto_0
    return-void

    .line 443
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->buffers:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private queue(Lcom/mixpanel/android/java_websocket/WebSocketImpl;)V
    .locals 3
    .param p1, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 429
    iget-object v0, p1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->workerThread:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    if-nez v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    iget v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queueinvokes:I

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    iput-object v0, p1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->workerThread:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 431
    iget v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queueinvokes:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queueinvokes:I

    .line 433
    :cond_0
    iget-object v0, p1, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->workerThread:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->put(Lcom/mixpanel/android/java_websocket/WebSocketImpl;)V

    .line 434
    return-void
.end method

.method private takeBuffer()Ljava/nio/ByteBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 437
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->buffers:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method


# virtual methods
.method protected addConnection(Lcom/mixpanel/android/java_websocket/WebSocket;)Z
    .locals 3
    .param p1, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocket;

    .prologue
    .line 557
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->isclosed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_1

    .line 558
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    monitor-enter v2

    .line 559
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 560
    .local v0, "succ":Z
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 558
    .end local v0    # "succ":Z
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 561
    .restart local v0    # "succ":Z
    :cond_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 566
    .end local v0    # "succ":Z
    :goto_0
    return v0

    .line 565
    :cond_1
    const/16 v1, 0x3e9

    invoke-interface {p1, v1}, Lcom/mixpanel/android/java_websocket/WebSocket;->close(I)V

    .line 566
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected allocateBuffers(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    .locals 2
    .param p1, "c"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 412
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queuesize:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    if-lt v0, v1, :cond_0

    .line 417
    :goto_0
    return-void

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queuesize:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 416
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->buffers:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->createBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public connections()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/mixpanel/android/java_websocket/WebSocket;",
            ">;"
        }
    .end annotation

    .prologue
    .line 249
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    return-object v0
.end method

.method public createBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 425
    sget v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->RCVBUF:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public getAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->address:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public getDraft()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;"
        }
    .end annotation

    .prologue
    .line 270
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->drafts:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getFlashSecurityPolicy()Ljava/lang/String;
    .locals 2

    .prologue
    .line 490
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" /></cross-domain-policy>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocalSocketAddress(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/InetSocketAddress;
    .locals 1
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;

    .prologue
    .line 633
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->getSocket(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public getPort()I
    .locals 2

    .prologue
    .line 262
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->getAddress()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    .line 263
    .local v0, "port":I
    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v1, :cond_0

    .line 264
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v0

    .line 266
    :cond_0
    return v0
.end method

.method public getRemoteSocketAddress(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/InetSocketAddress;
    .locals 1
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;

    .prologue
    .line 638
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->getSocket(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public final getWebSocketFactory()Lcom/mixpanel/android/java_websocket/WebSocketFactory;
    .locals 1

    .prologue
    .line 613
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->wsf:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;

    return-object v0
.end method

.method public abstract onClose(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
.end method

.method public onCloseInitiated(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "code"    # I
    .param p3, "reason"    # Ljava/lang/String;

    .prologue
    .line 602
    return-void
.end method

.method public onClosing(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "code"    # I
    .param p3, "reason"    # Ljava/lang/String;
    .param p4, "remote"    # Z

    .prologue
    .line 606
    return-void
.end method

.method protected onConnect(Ljava/nio/channels/SelectionKey;)Z
    .locals 1
    .param p1, "key"    # Ljava/nio/channels/SelectionKey;

    .prologue
    .line 623
    const/4 v0, 0x1

    return v0
.end method

.method public abstract onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
.end method

.method public onFragment(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "fragment"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 681
    return-void
.end method

.method public abstract onMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/String;)V
.end method

.method public onMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "message"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 675
    return-void
.end method

.method public abstract onOpen(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)V
.end method

.method public final onWebsocketClose(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
    .locals 3
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "code"    # I
    .param p3, "reason"    # Ljava/lang/String;
    .param p4, "remote"    # Z

    .prologue
    .line 518
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 520
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->removeConnection(Lcom/mixpanel/android/java_websocket/WebSocket;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 521
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onClose(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 525
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->releaseBuffers(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 531
    :goto_0
    return-void

    .line 523
    :catchall_0
    move-exception v1

    .line 525
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->releaseBuffers(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 529
    :goto_1
    throw v1

    .line 526
    :catch_0
    move-exception v0

    .line 527
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    .line 526
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :catch_1
    move-exception v0

    .line 527
    .restart local v0    # "e":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0
.end method

.method public onWebsocketCloseInitiated(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "code"    # I
    .param p3, "reason"    # Ljava/lang/String;

    .prologue
    .line 592
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onCloseInitiated(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;)V

    .line 593
    return-void
.end method

.method public onWebsocketClosing(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "code"    # I
    .param p3, "reason"    # Ljava/lang/String;
    .param p4, "remote"    # Z

    .prologue
    .line 597
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onClosing(Lcom/mixpanel/android/java_websocket/WebSocket;ILjava/lang/String;Z)V

    .line 599
    return-void
.end method

.method public final onWebsocketError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "ex"    # Ljava/lang/Exception;

    .prologue
    .line 575
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    .line 576
    return-void
.end method

.method public onWebsocketHandshakeReceivedAsServer(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/drafts/Draft;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;
    .locals 1
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "draft"    # Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .param p3, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 552
    invoke-super {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/WebSocketAdapter;->onWebsocketHandshakeReceivedAsServer(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/drafts/Draft;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/handshake/ServerHandshakeBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final onWebsocketMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/String;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 495
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/String;)V

    .line 496
    return-void
.end method

.method public final onWebsocketMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "blob"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 506
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onMessage(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/nio/ByteBuffer;)V

    .line 507
    return-void
.end method

.method public onWebsocketMessageFragment(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "frame"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 501
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onFragment(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V

    .line 502
    return-void
.end method

.method public final onWebsocketOpen(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)V
    .locals 1
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "handshake"    # Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;

    .prologue
    .line 511
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->addConnection(Lcom/mixpanel/android/java_websocket/WebSocket;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 512
    check-cast p2, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;

    .end local p2    # "handshake":Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onOpen(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)V

    .line 514
    :cond_0
    return-void
.end method

.method public final onWriteDemand(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    .locals 4
    .param p1, "w"    # Lcom/mixpanel/android/java_websocket/WebSocket;

    .prologue
    .line 580
    move-object v0, p1

    check-cast v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    .line 582
    .local v0, "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    :try_start_0
    iget-object v2, v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->key:Ljava/nio/channels/SelectionKey;

    const/4 v3, 0x5

    invoke-virtual {v2, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 587
    :goto_0
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v2}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 588
    return-void

    .line 583
    :catch_0
    move-exception v1

    .line 585
    .local v1, "e":Ljava/nio/channels/CancelledKeyException;
    iget-object v2, v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->clear()V

    goto :goto_0
.end method

.method protected releaseBuffers(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    .locals 0
    .param p1, "c"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 422
    return-void
.end method

.method protected removeConnection(Lcom/mixpanel/android/java_websocket/WebSocket;)Z
    .locals 3
    .param p1, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocket;

    .prologue
    .line 541
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    monitor-enter v2

    .line 542
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 543
    .local v0, "removed":Z
    sget-boolean v1, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 541
    .end local v0    # "removed":Z
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .restart local v0    # "removed":Z
    :cond_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 545
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->isclosed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 546
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 548
    :cond_1
    return v0
.end method

.method public run()V
    .locals 18

    .prologue
    .line 275
    monitor-enter p0

    .line 276
    :try_start_0
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    if-eqz v13, :cond_0

    .line 277
    new-instance v13, Ljava/lang/IllegalStateException;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v15, " can only be started once."

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v13

    .line 275
    :catchall_0
    move-exception v13

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v13

    .line 278
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v13

    move-object/from16 v0, p0

    iput-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    .line 279
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->isclosed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v13

    if-eqz v13, :cond_2

    .line 280
    monitor-exit p0

    .line 410
    :cond_1
    :goto_0
    return-void

    .line 275
    :cond_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 283
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "WebsocketSelector"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    invoke-virtual {v15}, Ljava/lang/Thread;->getId()J

    move-result-wide v16

    move-wide/from16 v0, v16

    invoke-virtual {v14, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 285
    :try_start_2
    invoke-static {}, Ljava/nio/channels/ServerSocketChannel;->open()Ljava/nio/channels/ServerSocketChannel;

    move-result-object v13

    move-object/from16 v0, p0

    iput-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    .line 286
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Ljava/nio/channels/ServerSocketChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 287
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v11

    .line 288
    .local v11, "socket":Ljava/net/ServerSocket;
    sget v13, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->RCVBUF:I

    invoke-virtual {v11, v13}, Ljava/net/ServerSocket;->setReceiveBufferSize(I)V

    .line 289
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->address:Ljava/net/InetSocketAddress;

    invoke-virtual {v11, v13}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V

    .line 290
    invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;

    move-result-object v13

    move-object/from16 v0, p0

    iput-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    .line 291
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v15}, Ljava/nio/channels/ServerSocketChannel;->validOps()I

    move-result v15

    invoke-virtual {v13, v14, v15}, Ljava/nio/channels/ServerSocketChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 297
    :cond_3
    :goto_1
    :try_start_3
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    invoke-virtual {v13}, Ljava/lang/Thread;->isInterrupted()Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v13

    if-eqz v13, :cond_5

    .line 397
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    if-eqz v13, :cond_4

    .line 398
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_19

    .line 402
    :cond_4
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v13, :cond_1

    .line 404
    :try_start_4
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    .line 405
    :catch_0
    move-exception v6

    .line 406
    .local v6, "e":Ljava/io/IOException;
    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v6}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 292
    .end local v6    # "e":Ljava/io/IOException;
    .end local v11    # "socket":Ljava/net/ServerSocket;
    :catch_1
    move-exception v7

    .line 293
    .local v7, "ex":Ljava/io/IOException;
    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v13, v7}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->handleFatal(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 298
    .end local v7    # "ex":Ljava/io/IOException;
    .restart local v11    # "socket":Ljava/net/ServerSocket;
    :cond_5
    const/4 v9, 0x0

    .line 299
    .local v9, "key":Ljava/nio/channels/SelectionKey;
    const/4 v5, 0x0

    .line 301
    .local v5, "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    :try_start_5
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v13}, Ljava/nio/channels/Selector;->select()I

    .line 302
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v13}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    move-result-object v10

    .line 303
    .local v10, "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 305
    .local v8, "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    :cond_6
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_8

    .line 361
    :goto_4
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->iqueue:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_3

    .line 362
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->iqueue:Ljava/util/List;

    const/4 v14, 0x0

    invoke-interface {v13, v14}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-object v5, v0

    .line 363
    iget-object v3, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v3, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    .line 364
    .local v3, "c":Lcom/mixpanel/android/java_websocket/WrappedByteChannel;
    invoke-direct/range {p0 .. p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->takeBuffer()Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v2

    .line 366
    .local v2, "buf":Ljava/nio/ByteBuffer;
    :try_start_6
    invoke-static {v2, v5, v3}, Lcom/mixpanel/android/java_websocket/SocketChannelIOHelper;->readMore(Ljava/nio/ByteBuffer;Lcom/mixpanel/android/java_websocket/WebSocketImpl;Lcom/mixpanel/android/java_websocket/WrappedByteChannel;)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 367
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->iqueue:Ljava/util/List;

    invoke-interface {v13, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 368
    :cond_7
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v13

    if-eqz v13, :cond_14

    .line 369
    iget-object v13, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v13, v2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 370
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queue(Lcom/mixpanel/android/java_websocket/WebSocketImpl;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    .line 374
    :catch_2
    move-exception v6

    .line 375
    .restart local v6    # "e":Ljava/io/IOException;
    :try_start_7
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V

    .line 376
    throw v6

    .line 380
    .end local v2    # "buf":Ljava/nio/ByteBuffer;
    .end local v3    # "c":Lcom/mixpanel/android/java_websocket/WrappedByteChannel;
    .end local v6    # "e":Ljava/io/IOException;
    .end local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .end local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :catch_3
    move-exception v13

    goto/16 :goto_1

    .line 306
    .restart local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .restart local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/nio/channels/SelectionKey;

    move-object v9, v0

    .line 308
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->isValid()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 313
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    move-result v13

    if-eqz v13, :cond_d

    .line 314
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onConnect(Ljava/nio/channels/SelectionKey;)Z

    move-result v13

    if-nez v13, :cond_a

    .line 315
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->cancel()V
    :try_end_7
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_3

    .line 382
    .end local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .end local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :catch_4
    move-exception v6

    .line 397
    .local v6, "e":Ljava/nio/channels/ClosedByInterruptException;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    if-eqz v13, :cond_9

    .line 398
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_15

    .line 402
    :cond_9
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v13, :cond_1

    .line 404
    :try_start_8
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto/16 :goto_0

    .line 405
    :catch_5
    move-exception v6

    .line 406
    .local v6, "e":Ljava/io/IOException;
    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v6}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 319
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .restart local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :cond_a
    :try_start_9
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    move-result-object v4

    .line 320
    .local v4, "channel":Ljava/nio/channels/SocketChannel;
    const/4 v13, 0x0

    invoke-virtual {v4, v13}, Ljava/nio/channels/SocketChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 321
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->wsf:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->drafts:Ljava/util/List;

    invoke-virtual {v4}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v15

    move-object/from16 v0, p0

    invoke-interface {v13, v0, v14, v15}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;->createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v12

    .line 322
    .local v12, "w":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selector:Ljava/nio/channels/Selector;

    const/4 v14, 0x1

    invoke-virtual {v4, v13, v14, v12}, Ljava/nio/channels/SocketChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;

    move-result-object v13

    iput-object v13, v12, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->key:Ljava/nio/channels/SelectionKey;

    .line 323
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->wsf:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;

    iget-object v14, v12, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->key:Ljava/nio/channels/SelectionKey;

    invoke-interface {v13, v4, v14}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;->wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;

    move-result-object v13

    iput-object v13, v12, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    .line 324
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 325
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->allocateBuffers(Lcom/mixpanel/android/java_websocket/WebSocket;)V
    :try_end_9
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto/16 :goto_3

    .line 384
    .end local v4    # "channel":Ljava/nio/channels/SocketChannel;
    .end local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .end local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    .end local v12    # "w":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    :catch_6
    move-exception v7

    .line 385
    .restart local v7    # "ex":Ljava/io/IOException;
    if-eqz v9, :cond_b

    .line 386
    :try_start_a
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 387
    :cond_b
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v5, v7}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->handleIOException(Ljava/nio/channels/SelectionKey;Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/io/IOException;)V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto/16 :goto_1

    .line 393
    .end local v5    # "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .end local v7    # "ex":Ljava/io/IOException;
    .end local v9    # "key":Ljava/nio/channels/SelectionKey;
    :catch_7
    move-exception v6

    .line 395
    .local v6, "e":Ljava/lang/RuntimeException;
    const/4 v13, 0x0

    :try_start_b
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v6}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->handleFatal(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 397
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    if-eqz v13, :cond_c

    .line 398
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_17

    .line 402
    :cond_c
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v13, :cond_1

    .line 404
    :try_start_c
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8

    goto/16 :goto_0

    .line 405
    :catch_8
    move-exception v6

    .line 406
    .local v6, "e":Ljava/io/IOException;
    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v6}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 329
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v5    # "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .restart local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .restart local v9    # "key":Ljava/nio/channels/SelectionKey;
    .restart local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :cond_d
    :try_start_d
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    move-result v13

    if-eqz v13, :cond_e

    .line 330
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-object v5, v0

    .line 331
    invoke-direct/range {p0 .. p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->takeBuffer()Ljava/nio/ByteBuffer;
    :try_end_d
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_d .. :try_end_d} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_d .. :try_end_d} :catch_4
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    move-result-object v2

    .line 333
    .restart local v2    # "buf":Ljava/nio/ByteBuffer;
    :try_start_e
    iget-object v13, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    invoke-static {v2, v5, v13}, Lcom/mixpanel/android/java_websocket/SocketChannelIOHelper;->read(Ljava/nio/ByteBuffer;Lcom/mixpanel/android/java_websocket/WebSocketImpl;Ljava/nio/channels/ByteChannel;)Z

    move-result v13

    if-eqz v13, :cond_13

    .line 334
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v13

    if-eqz v13, :cond_10

    .line 335
    iget-object v13, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v13, v2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 336
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->queue(Lcom/mixpanel/android/java_websocket/WebSocketImpl;)V

    .line 337
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 338
    iget-object v13, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v13, v13, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v13, :cond_e

    .line 339
    iget-object v13, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v13, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    invoke-interface {v13}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isNeedRead()Z

    move-result v13

    if-eqz v13, :cond_e

    .line 340
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->iqueue:Ljava/util/List;

    invoke-interface {v13, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_e .. :try_end_e} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 353
    .end local v2    # "buf":Ljava/nio/ByteBuffer;
    :cond_e
    :goto_7
    :try_start_f
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 354
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-object v5, v0

    .line 355
    iget-object v13, v5, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->channel:Ljava/nio/channels/ByteChannel;

    invoke-static {v5, v13}, Lcom/mixpanel/android/java_websocket/SocketChannelIOHelper;->batch(Lcom/mixpanel/android/java_websocket/WebSocketImpl;Ljava/nio/channels/ByteChannel;)Z

    move-result v13

    if-eqz v13, :cond_6

    .line 356
    invoke-virtual {v9}, Ljava/nio/channels/SelectionKey;->isValid()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 357
    const/4 v13, 0x1

    invoke-virtual {v9, v13}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_f
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_f .. :try_end_f} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_f .. :try_end_f} :catch_4
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto/16 :goto_3

    .line 388
    .end local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .end local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :catch_9
    move-exception v6

    .line 397
    .local v6, "e":Ljava/lang/InterruptedException;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    if-eqz v13, :cond_f

    .line 398
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_16

    .line 402
    :cond_f
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v13, :cond_1

    .line 404
    :try_start_10
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a

    goto/16 :goto_0

    .line 405
    :catch_a
    move-exception v6

    .line 406
    .local v6, "e":Ljava/io/IOException;
    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v6}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 344
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v2    # "buf":Ljava/nio/ByteBuffer;
    .restart local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .restart local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :cond_10
    :try_start_11
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_b
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_11 .. :try_end_11} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_11 .. :try_end_11} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    goto :goto_7

    .line 348
    :catch_b
    move-exception v6

    .line 349
    .restart local v6    # "e":Ljava/io/IOException;
    :try_start_12
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V

    .line 350
    throw v6
    :try_end_12
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_12 .. :try_end_12} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_12 .. :try_end_12} :catch_4
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_12 .. :try_end_12} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 396
    .end local v2    # "buf":Ljava/nio/ByteBuffer;
    .end local v5    # "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .end local v6    # "e":Ljava/io/IOException;
    .end local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .end local v9    # "key":Ljava/nio/channels/SelectionKey;
    .end local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :catchall_1
    move-exception v13

    .line 397
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    if-eqz v14, :cond_11

    .line 398
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->decoders:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_18

    .line 402
    :cond_11
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v14, :cond_12

    .line 404
    :try_start_13
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->server:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v14}, Ljava/nio/channels/ServerSocketChannel;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_c

    .line 409
    :cond_12
    :goto_a
    throw v13

    .line 346
    .restart local v2    # "buf":Ljava/nio/ByteBuffer;
    .restart local v5    # "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .restart local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .restart local v9    # "key":Ljava/nio/channels/SelectionKey;
    .restart local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    :cond_13
    :try_start_14
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_b
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_14 .. :try_end_14} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_14 .. :try_end_14} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_14 .. :try_end_14} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    goto/16 :goto_7

    .line 372
    .restart local v3    # "c":Lcom/mixpanel/android/java_websocket/WrappedByteChannel;
    :cond_14
    :try_start_15
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_15 .. :try_end_15} :catch_3
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_15 .. :try_end_15} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_15 .. :try_end_15} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    goto/16 :goto_4

    .line 398
    .end local v2    # "buf":Ljava/nio/ByteBuffer;
    .end local v3    # "c":Lcom/mixpanel/android/java_websocket/WrappedByteChannel;
    .end local v8    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/nio/channels/SelectionKey;>;"
    .end local v10    # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/nio/channels/SelectionKey;>;"
    .local v6, "e":Ljava/nio/channels/ClosedByInterruptException;
    :cond_15
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 399
    .local v12, "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    invoke-virtual {v12}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->interrupt()V

    goto/16 :goto_5

    .line 398
    .end local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    .local v6, "e":Ljava/lang/InterruptedException;
    :cond_16
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 399
    .restart local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    invoke-virtual {v12}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->interrupt()V

    goto :goto_8

    .line 398
    .end local v5    # "conn":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .end local v9    # "key":Ljava/nio/channels/SelectionKey;
    .end local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    .local v6, "e":Ljava/lang/RuntimeException;
    :cond_17
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 399
    .restart local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    invoke-virtual {v12}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->interrupt()V

    goto/16 :goto_6

    .line 398
    .end local v6    # "e":Ljava/lang/RuntimeException;
    .end local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    :cond_18
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 399
    .restart local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    invoke-virtual {v12}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->interrupt()V

    goto :goto_9

    .line 405
    .end local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    :catch_c
    move-exception v6

    .line 406
    .local v6, "e":Ljava/io/IOException;
    const/4 v14, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v6}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->onError(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto :goto_a

    .line 398
    .end local v6    # "e":Ljava/io/IOException;
    :cond_19
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 399
    .restart local v12    # "w":Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
    invoke-virtual {v12}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->interrupt()V

    goto/16 :goto_2
.end method

.method public final setWebSocketFactory(Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;)V
    .locals 0
    .param p1, "wsf"    # Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;

    .prologue
    .line 609
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->wsf:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;

    .line 610
    return-void
.end method

.method public start()V
    .locals 3

    .prologue
    .line 188
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 189
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " can only be started once."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 191
    return-void
.end method

.method public stop()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 238
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->stop(I)V

    .line 239
    return-void
.end method

.method public stop(I)V
    .locals 6
    .param p1, "timeout"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 208
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->isclosed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v3

    if-nez v3, :cond_0

    .line 236
    :goto_0
    return-void

    .line 212
    :cond_0
    const/4 v0, 0x0

    .line 215
    .local v0, "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    monitor-enter v4

    .line 216
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->connections:Ljava/util/Collection;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 215
    .end local v0    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    .local v1, "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 219
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    .line 223
    monitor-enter p0

    .line 224
    :try_start_2
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    if-eqz v3, :cond_2

    .line 225
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 228
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-eq v3, v4, :cond_2

    .line 229
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 230
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    int-to-long v4, p1

    invoke-virtual {v3, v4, v5}, Ljava/lang/Thread;->join(J)V

    .line 231
    :cond_1
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 232
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->selectorthread:Ljava/lang/Thread;

    invoke-virtual {v3}, Ljava/lang/Thread;->join()V

    .line 223
    :cond_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v3

    .line 215
    .end local v1    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    .restart local v0    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    :catchall_1
    move-exception v3

    :goto_2
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v3

    .line 219
    .end local v0    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    .restart local v1    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mixpanel/android/java_websocket/WebSocket;

    .line 220
    .local v2, "ws":Lcom/mixpanel/android/java_websocket/WebSocket;
    const/16 v4, 0x3e9

    invoke-interface {v2, v4}, Lcom/mixpanel/android/java_websocket/WebSocket;->close(I)V

    goto :goto_1

    .line 215
    .end local v2    # "ws":Lcom/mixpanel/android/java_websocket/WebSocket;
    :catchall_2
    move-exception v3

    move-object v0, v1

    .end local v1    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    .restart local v0    # "socketsToClose":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/WebSocket;>;"
    goto :goto_2
.end method
