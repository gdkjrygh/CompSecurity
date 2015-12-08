.class Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker$1;
.super Ljava/lang/Object;
.source "WebSocketServer.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;-><init>(Lcom/mixpanel/android/java_websocket/server/WebSocketServer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker$1;->this$1:Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;

    .line 690
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "t"    # Ljava/lang/Thread;
    .param p2, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 693
    invoke-static {}, Lcom/mixpanel/android/java_websocket/server/WebSocketServer$WebSocketWorker;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 694
    return-void
.end method
