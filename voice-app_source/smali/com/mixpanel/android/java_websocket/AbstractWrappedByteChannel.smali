.class public Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;
.super Ljava/lang/Object;
.source "AbstractWrappedByteChannel.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/WrappedByteChannel;


# instance fields
.field private final channel:Ljava/nio/channels/ByteChannel;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/java_websocket/WrappedByteChannel;)V
    .locals 0
    .param p1, "towrap"    # Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    .line 21
    return-void
.end method

.method public constructor <init>(Ljava/nio/channels/ByteChannel;)V
    .locals 0
    .param p1, "towrap"    # Ljava/nio/channels/ByteChannel;

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    .line 17
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0}, Ljava/nio/channels/ByteChannel;->close()V

    .line 36
    return-void
.end method

.method public isBlocking()Z
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v0, v0, Ljava/nio/channels/SocketChannel;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v0, Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isBlocking()Z

    move-result v0

    .line 72
    :goto_0
    return v0

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v0, v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    invoke-interface {v0}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isBlocking()Z

    move-result v0

    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isNeedRead()Z
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v0, v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    invoke-interface {v0}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isNeedRead()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isNeedWrite()Z
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v0, v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    invoke-interface {v0}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isNeedWrite()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOpen()Z
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0}, Ljava/nio/channels/ByteChannel;->isOpen()Z

    move-result v0

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 1
    .param p1, "dst"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 25
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0, p1}, Ljava/nio/channels/ByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v0

    return v0
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
    .line 63
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v0, v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    invoke-interface {v0, p1}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->readMore(Ljava/nio/ByteBuffer;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1
    .param p1, "src"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0, p1}, Ljava/nio/channels/ByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method public writeMore()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    instance-of v0, v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/AbstractWrappedByteChannel;->channel:Ljava/nio/channels/ByteChannel;

    check-cast v0, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    invoke-interface {v0}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->writeMore()V

    .line 53
    :cond_0
    return-void
.end method
