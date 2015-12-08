.class public Lcom/mixpanel/android/java_websocket/SocketChannelIOHelper;
.super Ljava/lang/Object;
.source "SocketChannelIOHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static batch(Lcom/mixpanel/android/java_websocket/WebSocketImpl;Ljava/nio/channels/ByteChannel;)Z
    .locals 6
    .param p0, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .param p1, "sockchannel"    # Ljava/nio/channels/ByteChannel;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 42
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 43
    .local v0, "buffer":Ljava/nio/ByteBuffer;
    const/4 v1, 0x0

    .line 45
    .local v1, "c":Lcom/mixpanel/android/java_websocket/WrappedByteChannel;
    if-nez v0, :cond_3

    .line 46
    instance-of v4, p1, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    if-eqz v4, :cond_0

    move-object v1, p1

    .line 47
    check-cast v1, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    .line 48
    invoke-interface {v1}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isNeedWrite()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 49
    invoke-interface {v1}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->writeMore()V

    .line 64
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->isFlushAndClose()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->getDraft()Lcom/mixpanel/android/java_websocket/drafts/Draft;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mixpanel/android/java_websocket/drafts/Draft;->getRole()Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    move-result-object v4

    sget-object v5, Lcom/mixpanel/android/java_websocket/WebSocket$Role;->SERVER:Lcom/mixpanel/android/java_websocket/WebSocket$Role;

    if-ne v4, v5, :cond_1

    .line 65
    monitor-enter p0

    .line 66
    :try_start_0
    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->closeConnection()V

    .line 65
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_1
    if-eqz v1, :cond_5

    check-cast p1, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;

    .end local p1    # "sockchannel":Ljava/nio/channels/ByteChannel;
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isNeedWrite()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    :goto_1
    return v2

    .line 54
    .restart local p1    # "sockchannel":Ljava/nio/channels/ByteChannel;
    :cond_3
    invoke-interface {p1, v0}, Ljava/nio/channels/ByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 55
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    if-gtz v4, :cond_2

    .line 58
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    .line 59
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "buffer":Ljava/nio/ByteBuffer;
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 61
    .restart local v0    # "buffer":Ljava/nio/ByteBuffer;
    if-nez v0, :cond_3

    goto :goto_0

    .line 65
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2

    .end local p1    # "sockchannel":Ljava/nio/channels/ByteChannel;
    :cond_4
    move v2, v3

    .line 69
    goto :goto_1

    .restart local p1    # "sockchannel":Ljava/nio/channels/ByteChannel;
    :cond_5
    move v2, v3

    goto :goto_1
.end method

.method public static read(Ljava/nio/ByteBuffer;Lcom/mixpanel/android/java_websocket/WebSocketImpl;Ljava/nio/channels/ByteChannel;)Z
    .locals 3
    .param p0, "buf"    # Ljava/nio/ByteBuffer;
    .param p1, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .param p2, "channel"    # Ljava/nio/channels/ByteChannel;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 14
    invoke-interface {p2, p0}, Ljava/nio/channels/ByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 15
    .local v0, "read":I
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 17
    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    .line 18
    invoke-virtual {p1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->eot()V

    .line 21
    :cond_0
    :goto_0
    return v1

    :cond_1
    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0
.end method

.method public static readMore(Ljava/nio/ByteBuffer;Lcom/mixpanel/android/java_websocket/WebSocketImpl;Lcom/mixpanel/android/java_websocket/WrappedByteChannel;)Z
    .locals 2
    .param p0, "buf"    # Ljava/nio/ByteBuffer;
    .param p1, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .param p2, "channel"    # Lcom/mixpanel/android/java_websocket/WrappedByteChannel;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 29
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 30
    invoke-interface {p2, p0}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->readMore(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 31
    .local v0, "read":I
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 33
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 34
    invoke-virtual {p1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->eot()V

    .line 35
    const/4 v1, 0x0

    .line 37
    :goto_0
    return v1

    :cond_0
    invoke-interface {p2}, Lcom/mixpanel/android/java_websocket/WrappedByteChannel;->isNeedRead()Z

    move-result v1

    goto :goto_0
.end method
