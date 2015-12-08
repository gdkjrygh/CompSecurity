.class Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;
.super Ljava/lang/Object;
.source "WebSocketClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/java_websocket/client/WebSocketClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WebsocketWriteThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/java_websocket/client/WebSocketClient;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;->this$0:Lcom/mixpanel/android/java_websocket/client/WebSocketClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;)V
    .locals 0

    .prologue
    .line 348
    invoke-direct {p0, p1}, Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;-><init>(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 351
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    const-string v3, "WebsocketWriteThread"

    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 353
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 363
    :goto_1
    return-void

    .line 354
    :cond_0
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;->this$0:Lcom/mixpanel/android/java_websocket/client/WebSocketClient;

    # getter for: Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->engine:Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    invoke-static {v2}, Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->access$0(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v2

    iget-object v2, v2, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 355
    .local v0, "buffer":Ljava/nio/ByteBuffer;
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;->this$0:Lcom/mixpanel/android/java_websocket/client/WebSocketClient;

    # getter for: Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->ostream:Ljava/io/OutputStream;
    invoke-static {v2}, Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->access$1(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;)Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 356
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;->this$0:Lcom/mixpanel/android/java_websocket/client/WebSocketClient;

    # getter for: Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->ostream:Ljava/io/OutputStream;
    invoke-static {v2}, Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->access$1(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;)Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 358
    .end local v0    # "buffer":Ljava/nio/ByteBuffer;
    :catch_0
    move-exception v1

    .line 359
    .local v1, "e":Ljava/io/IOException;
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/client/WebSocketClient$WebsocketWriteThread;->this$0:Lcom/mixpanel/android/java_websocket/client/WebSocketClient;

    # getter for: Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->engine:Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    invoke-static {v2}, Lcom/mixpanel/android/java_websocket/client/WebSocketClient;->access$0(Lcom/mixpanel/android/java_websocket/client/WebSocketClient;)Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->eot()V

    goto :goto_1

    .line 360
    .end local v1    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v2

    goto :goto_1
.end method
