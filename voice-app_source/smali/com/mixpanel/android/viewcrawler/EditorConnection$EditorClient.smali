.class Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;
.super Lcom/mixpanel/android/java_websocket/client/WebSocketClient;
.source "EditorConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/EditorConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EditorClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/viewcrawler/EditorConnection;Ljava/net/URI;ILjava/net/Socket;)V
    .locals 2
    .param p2, "uri"    # Ljava/net/URI;
    .param p3, "connectTimeout"    # I
    .param p4, "sslSocket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 68
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    .line 69
    new-instance v0, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;

    invoke-direct {v0}, Lcom/mixpanel/android/java_websocket/drafts/Draft_17;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p2, v0, v1, p3}, Lcom/mixpanel/android/java_websocket/client/WebSocketClient;-><init>(Ljava/net/URI;Lcom/mixpanel/android/java_websocket/drafts/Draft;Ljava/util/Map;I)V

    .line 70
    invoke-virtual {p0, p4}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->setSocket(Ljava/net/Socket;)V

    .line 71
    return-void
.end method


# virtual methods
.method public onClose(ILjava/lang/String;Z)V
    .locals 3
    .param p1, "code"    # I
    .param p2, "reason"    # Ljava/lang/String;
    .param p3, "remote"    # Z

    .prologue
    .line 108
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 109
    const-string v0, "MixpanelAPI.EditorCnctn"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WebSocket closed. Code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nURI: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mURI:Ljava/net/URI;
    invoke-static {v2}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$1(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v0}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v0

    invoke-interface {v0}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->cleanup()V

    .line 112
    return-void
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 3
    .param p1, "ex"    # Ljava/lang/Exception;

    .prologue
    .line 116
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    const-string v0, "MixpanelAPI.EditorCnctn"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Websocket Error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    :goto_0
    return-void

    .line 119
    :cond_0
    const-string v0, "MixpanelAPI.EditorCnctn"

    const-string v1, "Unknown websocket error occurred"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public onMessage(Ljava/lang/String;)V
    .locals 6
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 82
    sget-boolean v3, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v3, :cond_0

    .line 83
    const-string v3, "MixpanelAPI.EditorCnctn"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Received message from editor:\n"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 87
    .local v1, "messageJson":Lorg/json/JSONObject;
    const-string v3, "type"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 88
    .local v2, "type":Ljava/lang/String;
    const-string v3, "device_info_request"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 89
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v3

    invoke-interface {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->sendDeviceInfo()V

    .line 104
    .end local v1    # "messageJson":Lorg/json/JSONObject;
    .end local v2    # "type":Ljava/lang/String;
    :cond_1
    :goto_0
    return-void

    .line 90
    .restart local v1    # "messageJson":Lorg/json/JSONObject;
    .restart local v2    # "type":Ljava/lang/String;
    :cond_2
    const-string v3, "snapshot_request"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 91
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->sendSnapshot(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 101
    .end local v1    # "messageJson":Lorg/json/JSONObject;
    .end local v2    # "type":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 102
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.EditorCnctn"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Bad JSON received:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 92
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "messageJson":Lorg/json/JSONObject;
    .restart local v2    # "type":Ljava/lang/String;
    :cond_3
    :try_start_1
    const-string v3, "change_request"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 93
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->performEdit(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 94
    :cond_4
    const-string v3, "event_binding_request"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 95
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->bindEvents(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 96
    :cond_5
    const-string v3, "clear_request"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 97
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->clearEdits(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 98
    :cond_6
    const-string v3, "tweak_request"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 99
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    # getter for: Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;->setTweaks(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public onOpen(Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;)V
    .locals 2
    .param p1, "handshakedata"    # Lcom/mixpanel/android/java_websocket/handshake/ServerHandshake;

    .prologue
    .line 75
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 76
    const-string v0, "MixpanelAPI.EditorCnctn"

    const-string v1, "Websocket connected"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    :cond_0
    return-void
.end method
