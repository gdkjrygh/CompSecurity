.class public Lcom/mixpanel/android/java_websocket/drafts/Draft_17;
.super Lcom/mixpanel/android/java_websocket/drafts/Draft_10;
.source "Draft_17.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;-><init>()V

    return-void
.end method


# virtual methods
.method public acceptHandshakeAsServer(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 2
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshake;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidHandshakeException;
        }
    .end annotation

    .prologue
    .line 10
    invoke-static {p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;->readVersion(Lcom/mixpanel/android/java_websocket/handshake/Handshakedata;)I

    move-result v0

    .line 11
    .local v0, "v":I
    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    .line 12
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 13
    :goto_0
    return-object v1

    :cond_0
    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    goto :goto_0
.end method

.method public copyInstance()Lcom/mixpanel/android/java_websocket/drafts/Draft;
    .locals 1

    .prologue
    .line 25
    new-instance v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;-><init>()V

    return-object v0
.end method

.method public postProcessHandshakeRequestAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;
    .locals 2
    .param p1, "request"    # Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;

    .prologue
    .line 18
    invoke-super {p0, p1}, Lcom/mixpanel/android/java_websocket/drafts/Draft_10;->postProcessHandshakeRequestAsClient(Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;)Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;

    .line 19
    const-string v0, "Sec-WebSocket-Version"

    const-string v1, "13"

    invoke-interface {p1, v0, v1}, Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    return-object p1
.end method
