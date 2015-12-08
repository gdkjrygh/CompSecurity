.class public Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;
.super Ljava/lang/Object;
.source "DefaultSSLWebSocketServerFactory.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;


# instance fields
.field protected exec:Ljava/util/concurrent/ExecutorService;

.field protected sslcontext:Ljavax/net/ssl/SSLContext;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLContext;)V
    .locals 1
    .param p1, "sslContext"    # Ljavax/net/ssl/SSLContext;

    .prologue
    .line 25
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;-><init>(Ljavax/net/ssl/SSLContext;Ljava/util/concurrent/ExecutorService;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLContext;Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .param p1, "sslContext"    # Ljavax/net/ssl/SSLContext;
    .param p2, "exec"    # Ljava/util/concurrent/ExecutorService;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 31
    :cond_1
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;->sslcontext:Ljavax/net/ssl/SSLContext;

    .line 32
    iput-object p2, p0, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;->exec:Ljava/util/concurrent/ExecutorService;

    .line 33
    return-void
.end method


# virtual methods
.method public bridge synthetic createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocket;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;->createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocket;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;->createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v0

    return-object v0
.end method

.method public createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .locals 1
    .param p1, "a"    # Lcom/mixpanel/android/java_websocket/WebSocketAdapter;
    .param p2, "d"    # Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .param p3, "c"    # Ljava/net/Socket;

    .prologue
    .line 44
    new-instance v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    invoke-direct {v0, p1, p2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;-><init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Lcom/mixpanel/android/java_websocket/drafts/Draft;)V

    return-object v0
.end method

.method public createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .locals 1
    .param p1, "a"    # Lcom/mixpanel/android/java_websocket/WebSocketAdapter;
    .param p3, "s"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/java_websocket/WebSocketAdapter;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/java_websocket/drafts/Draft;",
            ">;",
            "Ljava/net/Socket;",
            ")",
            "Lcom/mixpanel/android/java_websocket/WebSocketImpl;"
        }
    .end annotation

    .prologue
    .line 49
    .local p2, "d":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    new-instance v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    invoke-direct {v0, p1, p2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;-><init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Ljava/util/List;)V

    return-object v0
.end method

.method public wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
    .locals 3
    .param p1, "channel"    # Ljava/nio/channels/SocketChannel;
    .param p2, "key"    # Ljava/nio/channels/SelectionKey;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 37
    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;->sslcontext:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->createSSLEngine()Ljavax/net/ssl/SSLEngine;

    move-result-object v0

    .line 38
    .local v0, "e":Ljavax/net/ssl/SSLEngine;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLEngine;->setUseClientMode(Z)V

    .line 39
    new-instance v1, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/server/DefaultSSLWebSocketServerFactory;->exec:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v1, p1, v0, v2, p2}, Lcom/mixpanel/android/java_websocket/SSLSocketChannel2;-><init>(Ljava/nio/channels/SocketChannel;Ljavax/net/ssl/SSLEngine;Ljava/util/concurrent/ExecutorService;Ljava/nio/channels/SelectionKey;)V

    return-object v1
.end method
