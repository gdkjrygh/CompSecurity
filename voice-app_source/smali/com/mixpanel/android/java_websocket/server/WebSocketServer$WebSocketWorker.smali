.class public Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;
.super Ljava/lang/Thread;
.source "WebSocketServer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/java_websocket/server/WebSocketServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WebSocketWorker"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private iqueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/mixpanel/android/java_websocket/WebSocketImpl;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/mixpanel/android/java_websocket/server/WebSocketServer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 683
    const-class v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;)V
    .locals 4

    .prologue
    .line 687
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->this$0:Lcom/mixpanel/android/java_websocket/server/WebSocketServer;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 688
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->iqueue:Ljava/util/concurrent/BlockingQueue;

    .line 689
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WebSocketWorker-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->getId()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->setName(Ljava/lang/String;)V

    .line 690
    new-instance v0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker$1;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker$1;-><init>(Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;)V

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 696
    return-void
.end method


# virtual methods
.method public put(Lcom/mixpanel/android/java_websocket/WebSocketImpl;)V
    .locals 1
    .param p1, "ws"    # Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 699
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->iqueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 700
    return-void
.end method

.method public run()V
    .locals 6

    .prologue
    .line 704
    const/4 v3, 0x0

    .line 707
    .local v3, "ws":Lcom/mixpanel/android/java_websocket/WebSocketImpl;
    :goto_0
    const/4 v1, 0x0

    .line 708
    .local v1, "buf":Ljava/nio/ByteBuffer;
    :try_start_0
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->iqueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Lcom/mixpanel/android/java_websocket/WebSocketImpl;

    move-object v3, v0

    .line 709
    iget-object v4, v3, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/nio/ByteBuffer;

    move-object v1, v0

    .line 710
    sget-boolean v4, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->$assertionsDisabled:Z

    if-nez v4, :cond_0

    if-nez v1, :cond_0

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 717
    :catch_0
    move-exception v4

    .line 721
    :goto_1
    return-void

    .line 712
    :cond_0
    :try_start_1
    invoke-virtual {v3, v1}, Lcom/mixpanel/android/java_websocket/WebSocketImpl;->decode(Ljava/nio/ByteBuffer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 714
    :try_start_2
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->this$0:Lcom/mixpanel/android/java_websocket/server/WebSocketServer;

    # invokes: Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V
    invoke-static {v4, v1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->access$0(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;Ljava/nio/ByteBuffer;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 718
    :catch_1
    move-exception v2

    .line 719
    .local v2, "e":Ljava/lang/RuntimeException;
    iget-object v4, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->this$0:Lcom/mixpanel/android/java_websocket/server/WebSocketServer;

    # invokes: Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->handleFatal(Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V
    invoke-static {v4, v3, v2}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->access$1(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;Lcom/mixpanel/android/java_websocket/WebSocket;Ljava/lang/Exception;)V

    goto :goto_1

    .line 713
    .end local v2    # "e":Ljava/lang/RuntimeException;
    :catchall_0
    move-exception v4

    .line 714
    :try_start_3
    iget-object v5, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->this$0:Lcom/mixpanel/android/java_websocket/server/WebSocketServer;

    # invokes: Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->pushBuffer(Ljava/nio/ByteBuffer;)V
    invoke-static {v5, v1}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer;->access$0(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;Ljava/nio/ByteBuffer;)V

    .line 715
    throw v4
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
.end method
