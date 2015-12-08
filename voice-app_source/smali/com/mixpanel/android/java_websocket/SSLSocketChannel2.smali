.class public Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;
.super Ljava/lang/Object;
.source "SSLSocketChannel2.java"

# interfaces
.implements Ljava/nio/channels/ByteChannel;
.implements Lcom/mixpanel/android/java_websocket/WrappedByteChannel;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field protected static emptybuffer:Ljava/nio/ByteBuffer;


# instance fields
.field protected bufferallocations:I

.field protected exec:Ljava/util/concurrent/ExecutorService;

.field protected inCrypt:Ljava/nio/ByteBuffer;

.field protected inData:Ljava/nio/ByteBuffer;

.field protected outCrypt:Ljava/nio/ByteBuffer;

.field protected readEngineResult:Ljavax/net/ssl/SSLEngineResult;

.field protected selectionKey:Ljava/nio/channels/SelectionKey;

.field protected socketChannel:Ljava/nio/channels/SocketChannel;

.field protected sslEngine:Ljavax/net/ssl/SSLEngine;

.field protected tasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Future",
            "<*>;>;"
        }
    .end annotation
.end field

.field protected writeEngineResult:Ljavax/net/ssl/SSLEngineResult;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 36
    const-class v0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->$assertionsDisabled:Z

    .line 40
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->emptybuffer:Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    move v0, v1

    .line 36
    goto :goto_0
.end method

.method public constructor <init>(Ljava/nio/channels/SocketChannel;Ljavax/net/ssl/SSLEngine;Ljava/util/concurrent/ExecutorService;Ljava/nio/channels/SelectionKey;)V
    .locals 4
    .param p1, "channel"    # Ljava/nio/channels/SocketChannel;
    .param p2, "sslEngine"    # Ljavax/net/ssl/SSLEngine;
    .param p3, "exec"    # Ljava/util/concurrent/ExecutorService;
    .param p4, "key"    # Ljava/nio/channels/SelectionKey;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->bufferallocations:I

    .line 69
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    .line 70
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "parameter must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_1
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 73
    iput-object p2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 74
    iput-object p3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->exec:Ljava/util/concurrent/ExecutorService;

    .line 76
    new-instance v0, Ljavax/net/ssl/SSLEngineResult;

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v2

    invoke-direct {v0, v1, v2, v3, v3}, Ljavax/net/ssl/SSLEngineResult;-><init>(Ljavax/net/ssl/SSLEngineResult$Status;Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;II)V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->writeEngineResult:Ljavax/net/ssl/SSLEngineResult;

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->tasks:Ljava/util/List;

    .line 79
    if-eqz p4, :cond_2

    .line 80
    invoke-virtual {p4}, Ljava/nio/channels/SelectionKey;->interestOps()I

    move-result v0

    or-int/lit8 v0, v0, 0x4

    invoke-virtual {p4, v0}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 81
    iput-object p4, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->selectionKey:Ljava/nio/channels/SelectionKey;

    .line 83
    :cond_2
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->createBuffers(Ljavax/net/ssl/SSLSession;)V

    .line 85
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    sget-object v1, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->emptybuffer:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->wrap(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 86
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->processHandshake()V

    .line 87
    return-void
.end method

.method private consumeFutureUninterruptible(Ljava/util/concurrent/Future;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 91
    .local p1, "f":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<*>;"
    const/4 v1, 0x0

    .line 94
    .local v1, "interrupted":Z
    :goto_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 100
    if-eqz v1, :cond_0

    .line 101
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    :cond_0
    return-void

    .line 96
    :catch_0
    move-exception v0

    .line 97
    .local v0, "e":Ljava/lang/InterruptedException;
    const/4 v1, 0x1

    .line 92
    goto :goto_0

    .line 102
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :catch_1
    move-exception v0

    .line 103
    .local v0, "e":Ljava/util/concurrent/ExecutionException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method private isHandShakeComplete()Z
    .locals 2

    .prologue
    .line 312
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v0

    .line 313
    .local v0, "status":Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->FINISHED:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private declared-synchronized processHandshake()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 112
    monitor-enter p0

    :try_start_0
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v4, :cond_1

    .line 155
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 114
    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->tasks:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 115
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->tasks:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 116
    .local v1, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/concurrent/Future<*>;>;"
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_4

    .line 128
    .end local v1    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/concurrent/Future<*>;>;"
    :cond_2
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_UNWRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v3, v4, :cond_8

    .line 129
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isBlocking()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    if-ne v3, v4, :cond_7

    .line 130
    :cond_3
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 131
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v4}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    .line 132
    .local v2, "read":I
    const/4 v3, -0x1

    if-ne v2, v3, :cond_6

    .line 133
    new-instance v3, Ljava/io/IOException;

    const-string v4, "connection closed unexpectedly by peer"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .end local v2    # "read":I
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3

    .line 117
    .restart local v1    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/concurrent/Future<*>;>;"
    :cond_4
    :try_start_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    .line 118
    .local v0, "f":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<*>;"
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 121
    :cond_5
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isBlocking()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 122
    invoke-direct {p0, v0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->consumeFutureUninterruptible(Ljava/util/concurrent/Future;)V

    goto :goto_0

    .line 135
    .end local v0    # "f":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<*>;"
    .end local v1    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/concurrent/Future<*>;>;"
    .restart local v2    # "read":I
    :cond_6
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 137
    .end local v2    # "read":I
    :cond_7
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 138
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->unwrap()Ljava/nio/ByteBuffer;

    .line 139
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->FINISHED:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v3, v4, :cond_8

    .line 140
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->createBuffers(Ljavax/net/ssl/SSLSession;)V

    goto/16 :goto_0

    .line 144
    :cond_8
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->consumeDelegatedTasks()V

    .line 145
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->tasks:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_WRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v3, v4, :cond_a

    .line 146
    :cond_9
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    sget-object v4, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->emptybuffer:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v4}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->wrap(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 147
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->writeEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->FINISHED:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v3, v4, :cond_a

    .line 148
    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->createBuffers(Ljavax/net/ssl/SSLSession;)V

    goto/16 :goto_0

    .line 152
    :cond_a
    sget-boolean v3, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->$assertionsDisabled:Z

    if-nez v3, :cond_b

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v3

    sget-object v4, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v3, v4, :cond_b

    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 154
    :cond_b
    const/4 v3, 0x1

    iput v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->bufferallocations:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method private readRemaining(Ljava/nio/ByteBuffer;)I
    .locals 2
    .param p1, "dst"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLException;
        }
    .end annotation

    .prologue
    .line 283
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 284
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v1, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->transfereTo(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 295
    :cond_0
    :goto_0
    return v0

    .line 286
    :cond_1
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_2

    .line 287
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 289
    :cond_2
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 290
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->unwrap()Ljava/nio/ByteBuffer;

    .line 291
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v1, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->transfereTo(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 292
    .local v0, "amount":I
    if-gtz v0, :cond_0

    .line 295
    .end local v0    # "amount":I
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private transfereTo(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I
    .locals 5
    .param p1, "from"    # Ljava/nio/ByteBuffer;
    .param p2, "to"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 362
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 363
    .local v0, "fremain":I
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    .line 364
    .local v3, "toremain":I
    if-le v0, v3, :cond_1

    .line 366
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 367
    .local v2, "limit":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v2, :cond_0

    .line 373
    .end local v1    # "i":I
    .end local v2    # "limit":I
    :goto_1
    return v2

    .line 368
    .restart local v1    # "i":I
    .restart local v2    # "limit":I
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 367
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 372
    .end local v1    # "i":I
    .end local v2    # "limit":I
    :cond_1
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move v2, v0

    .line 373
    goto :goto_1
.end method

.method private declared-synchronized unwrap()Ljava/nio/ByteBuffer;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLException;
        }
    .end annotation

    .prologue
    .line 169
    monitor-enter p0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 170
    .local v0, "rem":I
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v2, v3}, Ljavax/net/ssl/SSLEngine;->unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v1

    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    .line 171
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v1

    sget-object v2, Ljavax/net/ssl/SSLEngineResult$Status;->OK:Ljavax/net/ssl/SSLEngineResult$Status;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v1

    sget-object v2, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_UNWRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-eq v1, v2, :cond_0

    .line 172
    :cond_1
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 173
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    .line 169
    .end local v0    # "rem":I
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private declared-synchronized wrap(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2
    .param p1, "b"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLException;
        }
    .end annotation

    .prologue
    .line 157
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 158
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, v1}, Ljavax/net/ssl/SSLEngine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->writeEngineResult:Ljavax/net/ssl/SSLEngineResult;

    .line 159
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 160
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 157
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 303
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->closeOutbound()V

    .line 304
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v0

    invoke-interface {v0}, Ljavax/net/ssl/SSLSession;->invalidate()V

    .line 305
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    sget-object v1, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->emptybuffer:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->wrap(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->close()V

    .line 308
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->exec:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 309
    return-void
.end method

.method public configureBlocking(Z)Ljava/nio/channels/SelectableChannel;
    .locals 1
    .param p1, "b"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 317
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0, p1}, Ljava/nio/channels/SocketChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    return-object v0
.end method

.method public connect(Ljava/net/SocketAddress;)Z
    .locals 1
    .param p1, "remote"    # Ljava/net/SocketAddress;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 321
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0, p1}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    move-result v0

    return v0
.end method

.method protected consumeDelegatedTasks()V
    .locals 3

    .prologue
    .line 178
    :goto_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngine;->getDelegatedTask()Ljava/lang/Runnable;

    move-result-object v0

    .local v0, "task":Ljava/lang/Runnable;
    if-nez v0, :cond_0

    .line 182
    return-void

    .line 179
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->tasks:Ljava/util/List;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->exec:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method protected createBuffers(Ljavax/net/ssl/SSLSession;)V
    .locals 3
    .param p1, "session"    # Ljavax/net/ssl/SSLSession;

    .prologue
    .line 185
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getApplicationBufferSize()I

    move-result v0

    .line 186
    .local v0, "appBufferMax":I
    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getPacketBufferSize()I

    move-result v1

    .line 188
    .local v1, "netBufferMax":I
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    if-nez v2, :cond_1

    .line 189
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    .line 190
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    .line 191
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    .line 200
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 201
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 202
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 203
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 204
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 205
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 206
    iget v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->bufferallocations:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->bufferallocations:I

    .line 207
    return-void

    .line 193
    :cond_1
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    if-eq v2, v0, :cond_2

    .line 194
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    .line 195
    :cond_2
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    if-eq v2, v1, :cond_3

    .line 196
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    .line 197
    :cond_3
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    if-eq v2, v1, :cond_0

    .line 198
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    goto :goto_0
.end method

.method public finishConnect()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 325
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    move-result v0

    return v0
.end method

.method public isBlocking()Z
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isBlocking()Z

    move-result v0

    return v0
.end method

.method public isConnected()Z
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    move-result v0

    return v0
.end method

.method public isInboundDone()Z
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->isInboundDone()Z

    move-result v0

    return v0
.end method

.method public isNeedRead()Z
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->CLOSED:Ljavax/net/ssl/SSLEngineResult$Status;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isNeedWrite()Z
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isHandShakeComplete()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isOpen()Z
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isOpen()Z

    move-result v0

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 4
    .param p1, "dst"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v1, -0x1

    .line 230
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-nez v2, :cond_1

    .line 277
    :cond_0
    :goto_0
    return v0

    .line 232
    :cond_1
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isHandShakeComplete()Z

    move-result v2

    if-nez v2, :cond_2

    .line 233
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isBlocking()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 234
    :goto_1
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isHandShakeComplete()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 245
    :cond_2
    iget v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->bufferallocations:I

    const/4 v3, 0x1

    if-gt v2, v3, :cond_3

    .line 246
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->createBuffers(Ljavax/net/ssl/SSLSession;)V

    .line 251
    :cond_3
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readRemaining(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 252
    .local v0, "purged":I
    if-nez v0, :cond_0

    .line 258
    sget-boolean v2, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->$assertionsDisabled:Z

    if-nez v2, :cond_6

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    if-eqz v2, :cond_6

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 235
    .end local v0    # "purged":I
    :cond_4
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->processHandshake()V

    goto :goto_1

    .line 238
    :cond_5
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->processHandshake()V

    .line 239
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isHandShakeComplete()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 259
    .restart local v0    # "purged":I
    :cond_6
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 261
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-nez v2, :cond_8

    .line 262
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 266
    :goto_2
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isBlocking()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readEngineResult:Ljavax/net/ssl/SSLEngineResult;

    invoke-virtual {v2}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v2

    sget-object v3, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    if-ne v2, v3, :cond_9

    .line 267
    :cond_7
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    if-ne v2, v1, :cond_9

    move v0, v1

    .line 268
    goto :goto_0

    .line 264
    :cond_8
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    goto :goto_2

    .line 270
    :cond_9
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 271
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->unwrap()Ljava/nio/ByteBuffer;

    .line 273
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->inData:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v2, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->transfereTo(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 274
    .local v1, "transfered":I
    if-nez v1, :cond_a

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isBlocking()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 275
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->read(Ljava/nio/ByteBuffer;)I

    move-result v0

    goto/16 :goto_0

    :cond_a
    move v0, v1

    .line 277
    goto/16 :goto_0
.end method

.method public readMore(Ljava/nio/ByteBuffer;)I
    .locals 1
    .param p1, "dst"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLException;
        }
    .end annotation

    .prologue
    .line 358
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->readRemaining(Ljava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public socket()Ljava/net/Socket;
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p1, "src"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 210
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->isHandShakeComplete()Z

    move-result v1

    if-nez v1, :cond_0

    .line 211
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->processHandshake()V

    .line 212
    const/4 v0, 0x0

    .line 219
    :goto_0
    return v0

    .line 215
    :cond_0
    iget v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->bufferallocations:I

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    .line 216
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->createBuffers(Ljavax/net/ssl/SSLSession;)V

    .line 218
    :cond_1
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->wrap(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 219
    .local v0, "num":I
    goto :goto_0
.end method

.method public writeMore()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 348
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->outCrypt:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;->write(Ljava/nio/ByteBuffer;)I

    .line 349
    return-void
.end method
