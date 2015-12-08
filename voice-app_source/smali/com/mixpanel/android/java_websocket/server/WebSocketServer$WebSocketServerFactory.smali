.class public interface abstract Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketServerFactory;
.super Ljava/lang/Object;
.source "WebSocketServer.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/WebSocketFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/java_websocket/server/WebSocketServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "WebSocketServerFactory"
.end annotation


# virtual methods
.method public abstract createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;
.end method

.method public abstract createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;
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
.end method

.method public abstract wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
