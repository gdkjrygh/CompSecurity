.class final Lcom/adobe/mobile/Messages;
.super Ljava/lang/Object;
.source "Messages.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/Messages$MessageShowRule;
    }
.end annotation


# static fields
.field protected static final MESSAGE_ACTION_NAME:Ljava/lang/String; = "In-App Message"

.field protected static final MESSAGE_CLICKED:Ljava/lang/String; = "a.message.clicked"

.field protected static final MESSAGE_ID:Ljava/lang/String; = "a.message.id"

.field protected static final MESSAGE_LOCAL_ADB_CODE:Ljava/lang/String; = "adbMessageCode"

.field protected static final MESSAGE_LOCAL_IDENTIFIER:Ljava/lang/Integer;

.field protected static final MESSAGE_LOCAL_PAYLOAD:Ljava/lang/String; = "alarm_message"

.field protected static final MESSAGE_LOCAL_REQUEST_CODE:Ljava/lang/String; = "requestCode"

.field protected static final MESSAGE_TOKEN_LIFETIME_VALUE:Ljava/lang/String; = "{lifetimeValue}"

.field protected static final MESSAGE_TOKEN_MESSAGE_ID:Ljava/lang/String; = "{messageId}"

.field protected static final MESSAGE_TOKEN_TRACKING_ID:Ljava/lang/String; = "{trackingId}"

.field protected static final MESSAGE_TOKEN_USER_ID:Ljava/lang/String; = "{userId}"

.field protected static final MESSAGE_VIEWED:Ljava/lang/String; = "a.message.viewed"

.field private static _currentMessage:Lcom/adobe/mobile/Message;

.field private static final _currentMessageMutex:Ljava/lang/Object;

.field private static _largeIconResourceId:I

.field private static _messageFullScreen:Lcom/adobe/mobile/MessageFullScreen;

.field private static final _messageFullScreenMutex:Ljava/lang/Object;

.field private static _smallIconResourceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 46
    const v0, 0xb7267

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/adobe/mobile/Messages;->MESSAGE_LOCAL_IDENTIFIER:Ljava/lang/Integer;

    .line 120
    sput-object v2, Lcom/adobe/mobile/Messages;->_messageFullScreen:Lcom/adobe/mobile/MessageFullScreen;

    .line 121
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/Messages;->_messageFullScreenMutex:Ljava/lang/Object;

    .line 150
    sput v1, Lcom/adobe/mobile/Messages;->_smallIconResourceId:I

    .line 158
    sput v1, Lcom/adobe/mobile/Messages;->_largeIconResourceId:I

    .line 166
    sput-object v2, Lcom/adobe/mobile/Messages;->_currentMessage:Lcom/adobe/mobile/Message;

    .line 167
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/Messages;->_currentMessageMutex:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method

.method protected static checkForInAppMessage(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 74
    .local p0, "vars":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .local p1, "cdata":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .local p2, "lifecycleData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    :goto_0
    return-void

    .line 77
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMessagesExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Messages$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/adobe/mobile/Messages$1;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method protected static getCurrentFullscreenMessage()Lcom/adobe/mobile/MessageFullScreen;
    .locals 2

    .prologue
    .line 129
    sget-object v1, Lcom/adobe/mobile/Messages;->_messageFullScreenMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 130
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/Messages;->_messageFullScreen:Lcom/adobe/mobile/MessageFullScreen;

    monitor-exit v1

    return-object v0

    .line 131
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected static getCurrentMessage()Lcom/adobe/mobile/Message;
    .locals 2

    .prologue
    .line 169
    sget-object v1, Lcom/adobe/mobile/Messages;->_currentMessageMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 170
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/Messages;->_currentMessage:Lcom/adobe/mobile/Message;

    monitor-exit v1

    return-object v0

    .line 171
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected static getLargeIconResourceId()I
    .locals 1

    .prologue
    .line 163
    sget v0, Lcom/adobe/mobile/Messages;->_largeIconResourceId:I

    return v0
.end method

.method protected static getSmallIconResourceId()I
    .locals 1

    .prologue
    .line 155
    sget v0, Lcom/adobe/mobile/Messages;->_smallIconResourceId:I

    return v0
.end method

.method protected static resetAllInAppMessages()V
    .locals 2

    .prologue
    .line 135
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMessagesExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Messages$2;

    invoke-direct {v1}, Lcom/adobe/mobile/Messages$2;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 148
    return-void
.end method

.method protected static setCurrentMessage(Lcom/adobe/mobile/Message;)V
    .locals 2
    .param p0, "message"    # Lcom/adobe/mobile/Message;

    .prologue
    .line 175
    sget-object v1, Lcom/adobe/mobile/Messages;->_currentMessageMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 176
    :try_start_0
    sput-object p0, Lcom/adobe/mobile/Messages;->_currentMessage:Lcom/adobe/mobile/Message;

    .line 177
    monitor-exit v1

    .line 178
    return-void

    .line 177
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected static setCurrentMessageFullscreen(Lcom/adobe/mobile/MessageFullScreen;)V
    .locals 2
    .param p0, "message"    # Lcom/adobe/mobile/MessageFullScreen;

    .prologue
    .line 123
    sget-object v1, Lcom/adobe/mobile/Messages;->_messageFullScreenMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 124
    :try_start_0
    sput-object p0, Lcom/adobe/mobile/Messages;->_messageFullScreen:Lcom/adobe/mobile/MessageFullScreen;

    .line 125
    monitor-exit v1

    .line 126
    return-void

    .line 125
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected static setLargeIconResourceId(I)V
    .locals 0
    .param p0, "resourceId"    # I

    .prologue
    .line 160
    sput p0, Lcom/adobe/mobile/Messages;->_largeIconResourceId:I

    .line 161
    return-void
.end method

.method protected static setSmallIconResourceId(I)V
    .locals 0
    .param p0, "resourceId"    # I

    .prologue
    .line 152
    sput p0, Lcom/adobe/mobile/Messages;->_smallIconResourceId:I

    .line 153
    return-void
.end method
