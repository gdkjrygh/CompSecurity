.class public Lcom/urbanairship/richpush/RichPushInbox;
.super Ljava/lang/Object;
.source "RichPushInbox.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;,
        Lcom/urbanairship/richpush/RichPushInbox$Listener;
    }
.end annotation


# static fields
.field private static instance:Lcom/urbanairship/richpush/RichPushInbox;

.field private static final richPushMessageComparator:Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;


# instance fields
.field executor:Ljava/util/concurrent/ExecutorService;

.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/urbanairship/richpush/RichPushInbox$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

.field private final pendingDeletionMessageIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    new-instance v0, Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;

    invoke-direct {v0}, Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;-><init>()V

    sput-object v0, Lcom/urbanairship/richpush/RichPushInbox;->richPushMessageComparator:Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->pendingDeletionMessageIds:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;

    .line 61
    new-instance v0, Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-direct {v0}, Lcom/urbanairship/richpush/RichPushMessageCache;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    .line 63
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->executor:Ljava/util/concurrent/ExecutorService;

    .line 66
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushInbox;->updateCacheFromDB()V

    .line 67
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/richpush/RichPushInbox;)Ljava/util/List;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/richpush/RichPushInbox;

    .prologue
    .line 53
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->pendingDeletionMessageIds:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$100(Lcom/urbanairship/richpush/RichPushInbox;)Ljava/util/List;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/richpush/RichPushInbox;

    .prologue
    .line 53
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;

    return-object v0
.end method

.method private messageFromCursor(Landroid/database/Cursor;)Lcom/urbanairship/richpush/RichPushMessage;
    .locals 2
    .param p1, "cursor"    # Landroid/database/Cursor;

    .prologue
    .line 332
    :try_start_0
    invoke-static {p1}, Lcom/urbanairship/richpush/RichPushMessage;->messageFromCursor(Landroid/database/Cursor;)Lcom/urbanairship/richpush/RichPushMessage;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 336
    :goto_0
    return-object v1

    .line 333
    :catch_0
    move-exception v0

    .line 334
    .local v0, "e":Lorg/json/JSONException;
    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/Throwable;)V

    .line 336
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private notifyListeners()V
    .locals 3

    .prologue
    .line 344
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 345
    .local v0, "context":Landroid/content/Context;
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 346
    .local v1, "handler":Landroid/os/Handler;
    new-instance v2, Lcom/urbanairship/richpush/RichPushInbox$4;

    invoke-direct {v2, p0}, Lcom/urbanairship/richpush/RichPushInbox$4;-><init>(Lcom/urbanairship/richpush/RichPushInbox;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 356
    return-void
.end method

.method public static declared-synchronized shared()Lcom/urbanairship/richpush/RichPushInbox;
    .locals 2

    .prologue
    .line 76
    const-class v1, Lcom/urbanairship/richpush/RichPushInbox;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/urbanairship/richpush/RichPushInbox;->instance:Lcom/urbanairship/richpush/RichPushInbox;

    if-nez v0, :cond_0

    .line 77
    new-instance v0, Lcom/urbanairship/richpush/RichPushInbox;

    invoke-direct {v0}, Lcom/urbanairship/richpush/RichPushInbox;-><init>()V

    sput-object v0, Lcom/urbanairship/richpush/RichPushInbox;->instance:Lcom/urbanairship/richpush/RichPushInbox;

    .line 79
    :cond_0
    sget-object v0, Lcom/urbanairship/richpush/RichPushInbox;->instance:Lcom/urbanairship/richpush/RichPushInbox;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 76
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private updateCacheFromDB()V
    .locals 7

    .prologue
    .line 281
    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->pendingDeletionMessageIds:Ljava/util/List;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 282
    .local v0, "deletedIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v4, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v4}, Lcom/urbanairship/richpush/RichPushResolver;->getAllMessages()Landroid/database/Cursor;

    move-result-object v1

    .line 284
    .local v1, "inboxCursor":Landroid/database/Cursor;
    if-nez v1, :cond_0

    .line 321
    :goto_0
    return-void

    .line 288
    :cond_0
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 289
    invoke-direct {p0, v1}, Lcom/urbanairship/richpush/RichPushInbox;->messageFromCursor(Landroid/database/Cursor;)Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v2

    .line 290
    .local v2, "message":Lcom/urbanairship/richpush/RichPushMessage;
    if-eqz v2, :cond_0

    .line 294
    iget-object v5, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    monitor-enter v5

    .line 296
    :try_start_0
    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushMessage;->isDeleted()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushMessage;->isExpired()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 297
    :cond_1
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v4, v2}, Lcom/urbanairship/richpush/RichPushMessageCache;->removeMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 298
    monitor-exit v5

    goto :goto_1

    .line 317
    :catchall_0
    move-exception v4

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4

    .line 301
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 302
    monitor-exit v5

    goto :goto_1

    .line 305
    :cond_3
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessage(Ljava/lang/String;)Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v3

    .line 308
    .local v3, "oldCachedMessage":Lcom/urbanairship/richpush/RichPushMessage;
    if-nez v3, :cond_4

    .line 309
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v4, v2}, Lcom/urbanairship/richpush/RichPushMessageCache;->addMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 310
    monitor-exit v5

    goto :goto_1

    .line 314
    :cond_4
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v4, v3}, Lcom/urbanairship/richpush/RichPushMessageCache;->removeMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 315
    iget-boolean v4, v3, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    iput-boolean v4, v2, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    .line 316
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v4, v2}, Lcom/urbanairship/richpush/RichPushMessageCache;->addMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 317
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 320
    .end local v2    # "message":Lcom/urbanairship/richpush/RichPushMessage;
    .end local v3    # "oldCachedMessage":Lcom/urbanairship/richpush/RichPushMessage;
    :cond_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0
.end method


# virtual methods
.method public addListener(Lcom/urbanairship/richpush/RichPushInbox$Listener;)V
    .locals 2
    .param p1, "listener"    # Lcom/urbanairship/richpush/RichPushInbox$Listener;

    .prologue
    .line 94
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 95
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    monitor-exit v1

    .line 97
    return-void

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public deleteMessages(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 247
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->pendingDeletionMessageIds:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 248
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/urbanairship/richpush/RichPushInbox$3;

    invoke-direct {v4, p0, p1}, Lcom/urbanairship/richpush/RichPushInbox$3;-><init>(Lcom/urbanairship/richpush/RichPushInbox;Ljava/util/Set;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 256
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    monitor-enter v4

    .line 257
    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 258
    .local v2, "messageId":Ljava/lang/String;
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v3, v2}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessage(Ljava/lang/String;)Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v1

    .line 259
    .local v1, "message":Lcom/urbanairship/richpush/RichPushMessage;
    if-eqz v1, :cond_0

    .line 260
    const/4 v3, 0x1

    iput-boolean v3, v1, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    .line 261
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v3, v1}, Lcom/urbanairship/richpush/RichPushMessageCache;->removeMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    goto :goto_0

    .line 264
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "message":Lcom/urbanairship/richpush/RichPushMessage;
    .end local v2    # "messageId":Ljava/lang/String;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 266
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushInbox;->notifyListeners()V

    .line 267
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessageCount()I

    move-result v0

    return v0
.end method

.method public getMessage(Ljava/lang/String;)Lcom/urbanairship/richpush/RichPushMessage;
    .locals 1
    .param p1, "messageId"    # Ljava/lang/String;

    .prologue
    .line 178
    if-nez p1, :cond_0

    .line 179
    const/4 v0, 0x0

    .line 181
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v0, p1}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessage(Ljava/lang/String;)Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v0

    goto :goto_0
.end method

.method public getMessageIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 122
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessageIds()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getMessages()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/urbanairship/richpush/RichPushMessage;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessages()Ljava/util/List;

    move-result-object v0

    .line 147
    .local v0, "messages":Ljava/util/List;, "Ljava/util/List<Lcom/urbanairship/richpush/RichPushMessage;>;"
    sget-object v1, Lcom/urbanairship/richpush/RichPushInbox;->richPushMessageComparator:Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 148
    return-object v0
.end method

.method public getReadCount()I
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessageCache;->getReadMessageCount()I

    move-result v0

    return v0
.end method

.method public getReadMessages()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/urbanairship/richpush/RichPushMessage;",
            ">;"
        }
    .end annotation

    .prologue
    .line 166
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushMessageCache;->getReadMessages()Ljava/util/List;

    move-result-object v0

    .line 167
    .local v0, "messages":Ljava/util/List;, "Ljava/util/List<Lcom/urbanairship/richpush/RichPushMessage;>;"
    sget-object v1, Lcom/urbanairship/richpush/RichPushInbox;->richPushMessageComparator:Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 168
    return-object v0
.end method

.method public getUnreadCount()I
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessageCache;->getUnreadMessageCount()I

    move-result v0

    return v0
.end method

.method public getUnreadMessages()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/urbanairship/richpush/RichPushMessage;",
            ">;"
        }
    .end annotation

    .prologue
    .line 156
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushMessageCache;->getUnreadMessages()Ljava/util/List;

    move-result-object v0

    .line 157
    .local v0, "messages":Ljava/util/List;, "Ljava/util/List<Lcom/urbanairship/richpush/RichPushMessage;>;"
    sget-object v1, Lcom/urbanairship/richpush/RichPushInbox;->richPushMessageComparator:Lcom/urbanairship/richpush/RichPushInbox$SentAtRichPushMessageComparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 158
    return-object v0
.end method

.method public markMessagesRead(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 192
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/urbanairship/richpush/RichPushInbox$1;

    invoke-direct {v4, p0, p1}, Lcom/urbanairship/richpush/RichPushInbox$1;-><init>(Lcom/urbanairship/richpush/RichPushInbox;Ljava/util/Set;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 199
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    monitor-enter v4

    .line 200
    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 201
    .local v2, "messageId":Ljava/lang/String;
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v3, v2}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessage(Ljava/lang/String;)Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v1

    .line 202
    .local v1, "message":Lcom/urbanairship/richpush/RichPushMessage;
    if-eqz v1, :cond_0

    .line 203
    const/4 v3, 0x0

    iput-boolean v3, v1, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    .line 204
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v3, v1}, Lcom/urbanairship/richpush/RichPushMessageCache;->addMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    goto :goto_0

    .line 207
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "message":Lcom/urbanairship/richpush/RichPushMessage;
    .end local v2    # "messageId":Ljava/lang/String;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushInbox;->notifyListeners()V

    .line 210
    return-void
.end method

.method public markMessagesUnread(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 218
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/urbanairship/richpush/RichPushInbox$2;

    invoke-direct {v4, p0, p1}, Lcom/urbanairship/richpush/RichPushInbox$2;-><init>(Lcom/urbanairship/richpush/RichPushInbox;Ljava/util/Set;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 225
    iget-object v4, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    monitor-enter v4

    .line 226
    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 227
    .local v2, "messageId":Ljava/lang/String;
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v3, v2}, Lcom/urbanairship/richpush/RichPushMessageCache;->getMessage(Ljava/lang/String;)Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v1

    .line 228
    .local v1, "message":Lcom/urbanairship/richpush/RichPushMessage;
    if-eqz v1, :cond_0

    .line 229
    const/4 v3, 0x1

    iput-boolean v3, v1, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    .line 230
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushInbox;->messageCache:Lcom/urbanairship/richpush/RichPushMessageCache;

    invoke-virtual {v3, v1}, Lcom/urbanairship/richpush/RichPushMessageCache;->addMessage(Lcom/urbanairship/richpush/RichPushMessage;)V

    goto :goto_0

    .line 233
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "message":Lcom/urbanairship/richpush/RichPushMessage;
    .end local v2    # "messageId":Ljava/lang/String;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushInbox;->notifyListeners()V

    .line 236
    return-void
.end method

.method public removeListener(Lcom/urbanairship/richpush/RichPushInbox$Listener;)V
    .locals 2
    .param p1, "listener"    # Lcom/urbanairship/richpush/RichPushInbox$Listener;

    .prologue
    .line 104
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushInbox;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 106
    monitor-exit v1

    .line 107
    return-void

    .line 106
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method updateCache()V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushInbox;->updateCacheFromDB()V

    .line 274
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushInbox;->notifyListeners()V

    .line 275
    return-void
.end method
