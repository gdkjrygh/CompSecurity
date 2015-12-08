.class public Lcom/mixpanel/android/java_websocket/server/DefaultWebSocketServerFactory;
.super Ljava/lang/Object;
.source "DefaultWebSocketServerFactory.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocket;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/server/DefaultWebSocketServerFactory;->createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocket;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/java_websocket/server/DefaultWebSocketServerFactory;->createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v0

    return-object v0
.end method

.method public createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .locals 1
    .param p1, "a"    # Lcom/mixpanel/android/java_websocket/WebSocketAdapter;
    .param p2, "d"    # Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .param p3, "s"    # Ljava/net/Socket;

    .prologue
    .line 16
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
    .line 20
    .local p2, "d":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/java_websocket/drafts/Draft;>;"
    new-instance v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    invoke-direct {v0, p1, p2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;-><init>(Lcom/mixpanel/android/java_websocket/WebSocketListener;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/mixpanel/android/java_websocket/server/DefaultWebSocketServerFactory;->wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/SocketChannel;

    move-result-object v0

    return-object v0
.end method

.method public wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/SocketChannel;
    .locals 0
    .param p1, "channel"    # Ljava/nio/channels/SocketChannel;
    .param p2, "key"    # Ljava/nio/channels/SelectionKey;

    .prologue
    .line 24
    return-object p1
.end method
