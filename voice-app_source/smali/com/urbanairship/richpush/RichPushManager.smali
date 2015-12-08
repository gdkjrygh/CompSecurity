.class public Lcom/urbanairship/richpush/RichPushManager;
.super Ljava/lang/Object;
.source "RichPushManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/richpush/RichPushManager$UpdateResultReceiver;,
        Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;,
        Lcom/urbanairship/richpush/RichPushManager$Listener;
    }
.end annotation


# static fields
.field public static final RICH_PUSH_KEY:Ljava/lang/String; = "_uamid"

.field static final USER_UPDATE_INTERVAL_MS:J = 0x5265c00L

.field private static final instance:Lcom/urbanairship/richpush/RichPushManager;

.field static resolver:Lcom/urbanairship/richpush/RichPushResolver;


# instance fields
.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/urbanairship/richpush/RichPushManager$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private refreshMessageRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private user:Lcom/urbanairship/richpush/RichPushUser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/urbanairship/richpush/RichPushManager;

    invoke-direct {v0}, Lcom/urbanairship/richpush/RichPushManager;-><init>()V

    sput-object v0, Lcom/urbanairship/richpush/RichPushManager;->instance:Lcom/urbanairship/richpush/RichPushManager;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->refreshMessageRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    .line 72
    new-instance v0, Lcom/urbanairship/richpush/RichPushResolver;

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/urbanairship/richpush/RichPushResolver;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    .line 73
    return-void
.end method

.method static synthetic access$000()Lcom/urbanairship/richpush/RichPushManager;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/urbanairship/richpush/RichPushManager;->instance:Lcom/urbanairship/richpush/RichPushManager;

    return-object v0
.end method

.method static synthetic access$100(Lcom/urbanairship/richpush/RichPushManager;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/richpush/RichPushManager;

    .prologue
    .line 50
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->refreshMessageRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic access$200(Lcom/urbanairship/richpush/RichPushManager;Z)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/richpush/RichPushManager;
    .param p1, "x1"    # Z

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/urbanairship/richpush/RichPushManager;->onMessagesUpdate(Z)V

    return-void
.end method

.method static synthetic access$300(Lcom/urbanairship/richpush/RichPushManager;Z)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/richpush/RichPushManager;
    .param p1, "x1"    # Z

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/urbanairship/richpush/RichPushManager;->onUserUpdate(Z)V

    return-void
.end method

.method private getListeners()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/urbanairship/richpush/RichPushManager$Listener;",
            ">;"
        }
    .end annotation

    .prologue
    .line 283
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 284
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v1

    return-object v0

    .line 285
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static declared-synchronized init()V
    .locals 4

    .prologue
    .line 149
    const-class v2, Lcom/urbanairship/richpush/RichPushManager;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    if-eqz v1, :cond_0

    .line 150
    const-string v1, "Initializing Rich Push."

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 151
    sget-object v1, Lcom/urbanairship/richpush/RichPushManager;->instance:Lcom/urbanairship/richpush/RichPushManager;

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushManager;->updateUserIfNecessary()V

    .line 153
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 154
    .local v0, "filter":Landroid/content/IntentFilter;
    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 155
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 156
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Lcom/urbanairship/richpush/RichPushManager$1;

    invoke-direct {v3}, Lcom/urbanairship/richpush/RichPushManager$1;-><init>()V

    invoke-virtual {v1, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    :cond_0
    monitor-exit v2

    return-void

    .line 149
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static isRichPushMessage(Landroid/os/Bundle;)Z
    .locals 1
    .param p0, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 344
    const-string v0, "_uamid"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isRichPushMessage(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 332
    .local p0, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v0, "_uamid"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private onMessagesUpdate(Z)V
    .locals 4
    .param p1, "success"    # Z

    .prologue
    .line 308
    if-eqz p1, :cond_0

    .line 309
    const-string v3, "Messages update succeeded"

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 314
    :goto_0
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushManager;->getListeners()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/urbanairship/richpush/RichPushManager$Listener;

    .line 316
    .local v2, "l":Lcom/urbanairship/richpush/RichPushManager$Listener;
    :try_start_0
    invoke-interface {v2, p1}, Lcom/urbanairship/richpush/RichPushManager$Listener;->onUpdateMessages(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 317
    :catch_0
    move-exception v0

    .line 318
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "RichPushManager unable to complete onUpdateMessages() callback."

    invoke-static {v3, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 311
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v2    # "l":Lcom/urbanairship/richpush/RichPushManager$Listener;
    :cond_0
    const-string v3, "Messages update failed"

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 321
    .restart local v1    # "i$":Ljava/util/Iterator;
    :cond_1
    return-void
.end method

.method private onUserUpdate(Z)V
    .locals 6
    .param p1, "success"    # Z

    .prologue
    .line 289
    if-eqz p1, :cond_0

    .line 290
    const-string v3, "User update succeeded"

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 291
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushManager;->user:Lcom/urbanairship/richpush/RichPushUser;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/urbanairship/richpush/RichPushUser;->setLastUpdateTime(J)V

    .line 298
    :goto_0
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushManager;->getListeners()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/urbanairship/richpush/RichPushManager$Listener;

    .line 300
    .local v2, "l":Lcom/urbanairship/richpush/RichPushManager$Listener;
    :try_start_0
    invoke-interface {v2, p1}, Lcom/urbanairship/richpush/RichPushManager$Listener;->onUpdateUser(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 301
    :catch_0
    move-exception v0

    .line 302
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "RichPushManager unable to complete onUpdateUser() callback."

    invoke-static {v3, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 293
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v2    # "l":Lcom/urbanairship/richpush/RichPushManager$Listener;
    :cond_0
    const-string v3, "User update failed"

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 295
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushManager;->user:Lcom/urbanairship/richpush/RichPushUser;

    const-wide/16 v4, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/urbanairship/richpush/RichPushUser;->setLastUpdateTime(J)V

    goto :goto_0

    .line 305
    .restart local v1    # "i$":Ljava/util/Iterator;
    :cond_1
    return-void
.end method

.method private refreshMessages(ZLcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V
    .locals 3
    .param p1, "force"    # Z
    .param p2, "callback"    # Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;

    .prologue
    .line 217
    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushManager;->isRefreshingMessages()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez p1, :cond_0

    .line 218
    const-string v1, "Skipping refreshing messages, already refreshing."

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 239
    :goto_0
    return-void

    .line 222
    :cond_0
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushManager;->refreshMessageRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 224
    .local v0, "requestNumber":I
    const-string v1, "com.urbanairship.richpush.MESSAGES_UPDATE"

    new-instance v2, Lcom/urbanairship/richpush/RichPushManager$2;

    invoke-direct {v2, p0, v0, p2}, Lcom/urbanairship/richpush/RichPushManager$2;-><init>(Lcom/urbanairship/richpush/RichPushManager;ILcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V

    invoke-direct {p0, v1, v2}, Lcom/urbanairship/richpush/RichPushManager;->startUpdateService(Ljava/lang/String;Landroid/os/ResultReceiver;)V

    goto :goto_0
.end method

.method public static shared()Lcom/urbanairship/richpush/RichPushManager;
    .locals 1

    .prologue
    .line 128
    sget-object v0, Lcom/urbanairship/richpush/RichPushManager;->instance:Lcom/urbanairship/richpush/RichPushManager;

    return-object v0
.end method

.method private startUpdateService(Ljava/lang/String;Landroid/os/ResultReceiver;)V
    .locals 3
    .param p1, "intentAction"    # Ljava/lang/String;
    .param p2, "receiver"    # Landroid/os/ResultReceiver;

    .prologue
    .line 266
    const-string v2, "RichPushManager startUpdateService"

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 267
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 268
    .local v0, "context":Landroid/content/Context;
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/urbanairship/richpush/RichPushUpdateService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 269
    .local v1, "intent":Landroid/content/Intent;
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    if-eqz p2, :cond_0

    .line 272
    const-string v2, "com.urbanairship.richpush.RESULT_RECEIVER"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 275
    :cond_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 276
    return-void
.end method


# virtual methods
.method public addListener(Lcom/urbanairship/richpush/RichPushManager$Listener;)V
    .locals 2
    .param p1, "listener"    # Lcom/urbanairship/richpush/RichPushManager$Listener;

    .prologue
    .line 89
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    monitor-exit v1

    .line 92
    return-void

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public declared-synchronized getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;
    .locals 1

    .prologue
    .line 137
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->user:Lcom/urbanairship/richpush/RichPushUser;

    if-nez v0, :cond_0

    .line 138
    new-instance v0, Lcom/urbanairship/richpush/RichPushUser;

    invoke-direct {v0}, Lcom/urbanairship/richpush/RichPushUser;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->user:Lcom/urbanairship/richpush/RichPushUser;

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->user:Lcom/urbanairship/richpush/RichPushUser;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 137
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isRefreshingMessages()Z
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->refreshMessageRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public refreshMessages()V
    .locals 1

    .prologue
    .line 171
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/urbanairship/richpush/RichPushManager;->refreshMessages(Z)V

    .line 172
    return-void
.end method

.method public refreshMessages(Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V
    .locals 1
    .param p1, "callback"    # Lcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;

    .prologue
    .line 199
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/urbanairship/richpush/RichPushManager;->refreshMessages(ZLcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V

    .line 200
    return-void
.end method

.method public refreshMessages(Z)V
    .locals 1
    .param p1, "force"    # Z

    .prologue
    .line 183
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushManager;->refreshMessages(ZLcom/urbanairship/richpush/RichPushManager$RefreshMessagesCallback;)V

    .line 184
    return-void
.end method

.method public removeListener(Lcom/urbanairship/richpush/RichPushManager$Listener;)V
    .locals 2
    .param p1, "listener"    # Lcom/urbanairship/richpush/RichPushManager$Listener;

    .prologue
    .line 99
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 100
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 101
    monitor-exit v1

    .line 102
    return-void

    .line 101
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public updateUser()V
    .locals 2

    .prologue
    .line 245
    const-string v0, "com.urbanairship.richpush.USER_UPDATE"

    new-instance v1, Lcom/urbanairship/richpush/RichPushManager$3;

    invoke-direct {v1, p0}, Lcom/urbanairship/richpush/RichPushManager$3;-><init>(Lcom/urbanairship/richpush/RichPushManager;)V

    invoke-direct {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushManager;->startUpdateService(Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 251
    return-void
.end method

.method public updateUserIfNecessary()V
    .locals 6

    .prologue
    .line 258
    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/richpush/RichPushUser;->getLastUpdateTime()J

    move-result-wide v0

    .line 259
    .local v0, "lastUpdateTime":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 260
    .local v2, "now":J
    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const-wide/32 v4, 0x5265c00

    add-long/2addr v4, v0

    cmp-long v4, v4, v2

    if-gez v4, :cond_1

    .line 261
    :cond_0
    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushManager;->updateUser()V

    .line 263
    :cond_1
    return-void
.end method
