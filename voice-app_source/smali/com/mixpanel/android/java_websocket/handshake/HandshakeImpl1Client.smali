.class public Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Client;
.super Lcom/mixpanel/android/java_websocket/handshake/HandshakedataImpl1;
.source "HandshakeImpl1Client.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/handshake/ClientHandshakeBuilder;


# instance fields
.field private resourceDescriptor:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/mixpanel/android/java_websocket/handshake/HandshakedataImpl1;-><init>()V

    .line 4
    const-string v0, "*"

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Client;->resourceDescriptor:Ljava/lang/String;

    .line 7
    return-void
.end method


# virtual methods
.method public getResourceDescriptor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Client;->resourceDescriptor:Ljava/lang/String;

    return-object v0
.end method

.method public setResourceDescriptor(Ljava/lang/String;)V
    .locals 2
    .param p1, "resourceDescriptor"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    .line 10
    if-nez p1, :cond_0

    .line 11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "http resource descriptor must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_0
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/handshake/HandshakeImpl1Client;->resourceDescriptor:Ljava/lang/String;

    .line 13
    return-void
.end method
