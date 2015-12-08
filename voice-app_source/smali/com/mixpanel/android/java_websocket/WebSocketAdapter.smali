.class public abstract Lcom/mixpanel/android/java_websocket/WebSocketAdapter;
.super Ljava/lang/Object;
.source "WebSocketAdapter.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/WebSocketListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFlashPolicy(Lcom/mixpanel/android/java_websocket/WebSocket;)Ljava/lang/String;
    .locals 4
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 91
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/WebSocket;->getLocalSocketAddress()Ljava/net/InetSocketAddress;

    move-result-object v0

    .line 92
    .local v0, "adr":Ljava/net/InetSocketAddress;
    if-nez v0, :cond_0

    .line 93
    new-instance v2, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;

    const-string v3, "socket not bound"

    invoke-direct {v2, v3}, Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 96
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    const/16 v2, 0x5a

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 97
    .local v1, "sb":Ljava/lang/StringBuffer;
    const-string v2, "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 98
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 99
    const-string v2, "\" /></cross-domain-policy>\u0000"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public onWebsocketHandshakeReceivedAsClient(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .param p3, "response"    # Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 33
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
    .line 28
    new-instance v0, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Server;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Server;-><init>()V

    return-object v0
.end method

.method public onWebsocketHandshakeSentAsClient(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 42
    return-void
.end method

.method public onWebsocketMessageFragment(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "frame"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 51
    return-void
.end method

.method public onWebsocketPing(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 2
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "f"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 61
    new-instance v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;

    invoke-direct {v0, p2}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;-><init>(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V

    .line 62
    .local v0, "resp":Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;
    sget-object v1, Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;->PONG:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V

    .line 63
    invoke-interface {p1, v0}, Lcom/mixpanel/android/java_websocket/WebSocket;->sendFrame(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V

    .line 64
    return-void
.end method

.method public onWebsocketPong(Lcom/mixpanel/android/java_websocket/WebSocket;Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 0
    .param p1, "conn"    # Lcom/mixpanel/android/java_websocket/WebSocket;
    .param p2, "f"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 73
    return-void
.end method
