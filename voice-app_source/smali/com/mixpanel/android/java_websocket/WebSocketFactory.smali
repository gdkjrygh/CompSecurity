.class public interface abstract Lcom/mixpanel/android/java_websocket/WebSocketFactory;
.super Ljava/lang/Object;
.source "WebSocketFactory.java"


# virtual methods
.method public abstract createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocket;
.end method

.method public abstract createWebSocket(Lcom/mixpanel/android/java_websocket/WebSocketAdapter;Ljava/util/List;Ljava/net/Socket;)Lcom/mixpanel/android/java_websocket/WebSocket;
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
            "Lcom/mixpanel/android/java_websocket/WebSocket;"
        }
    .end annotation
.end method
