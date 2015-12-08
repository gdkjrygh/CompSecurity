.class Lcom/urbanairship/richpush/RichPushResolver;
.super Lcom/urbanairship/UrbanAirshipResolver;
.source "RichPushResolver.java"


# static fields
.field private static final FALSE_VALUE:Ljava/lang/String; = "0"

.field private static final NEWEST_FIRST:Ljava/lang/String; = "timestamp DESC"

.field private static final TRUE_VALUE:Ljava/lang/String; = "1"

.field private static final WHERE_CLAUSE_CHANGED:Ljava/lang/String; = "unread <> unread_orig"

.field private static final WHERE_CLAUSE_MESSAGE_ID:Ljava/lang/String; = "message_id = ?"

.field private static final WHERE_CLAUSE_READ:Ljava/lang/String; = "unread = ?"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipResolver;-><init>(Landroid/content/Context;)V

    .line 59
    return-void
.end method

.method private appendMessageIdToUri(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 156
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private appendMessageIdsToUri(Ljava/util/Collection;)Landroid/net/Uri;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/net/Uri;"
        }
    .end annotation

    .prologue
    .line 151
    .local p1, "ids":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "|"

    invoke-static {p1, v1}, Lcom/urbanairship/util/UAStringUtil;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method deleteMessage(Ljava/lang/String;)I
    .locals 4
    .param p1, "messageId"    # Ljava/lang/String;

    .prologue
    .line 117
    invoke-direct {p0, p1}, Lcom/urbanairship/richpush/RichPushResolver;->appendMessageIdToUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "message_id = ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/urbanairship/richpush/RichPushResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method deleteMessages(Ljava/util/Set;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 122
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    .line 123
    .local v0, "numberOfmessageIds":I
    invoke-direct {p0, p1}, Lcom/urbanairship/richpush/RichPushResolver;->appendMessageIdsToUri(Ljava/util/Collection;)Landroid/net/Uri;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "message_id IN ( "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "?"

    const-string v4, ", "

    invoke-static {v3, v0, v4}, Lcom/urbanairship/util/UAStringUtil;->repeat(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " )"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v0, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {p0, v2, v3, v1}, Lcom/urbanairship/richpush/RichPushResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    return v1
.end method

.method getAllMessages()Landroid/database/Cursor;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 67
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v1

    const-string v5, "timestamp DESC"

    move-object v0, p0

    move-object v3, v2

    move-object v4, v2

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/richpush/RichPushResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method getDeletedMessages()Landroid/database/Cursor;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 86
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v1

    const-string v3, "deleted = ?"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v5, "1"

    aput-object v5, v4, v0

    move-object v0, p0

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/richpush/RichPushResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method getMessage(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6
    .param p1, "messageId"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 62
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v1

    const-string v3, "message_id = ?"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v4, v0

    move-object v0, p0

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/richpush/RichPushResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method getReadMessages()Landroid/database/Cursor;
    .locals 6

    .prologue
    .line 71
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "unread = ?"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v5, "0"

    aput-object v5, v4, v0

    const-string v5, "timestamp DESC"

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/richpush/RichPushResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method getReadUpdatedMessages()Landroid/database/Cursor;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 81
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v1

    const-string v3, "unread = ? AND unread <> unread_orig"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v5, "0"

    aput-object v5, v4, v0

    move-object v0, p0

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/richpush/RichPushResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method getUnreadMessages()Landroid/database/Cursor;
    .locals 6

    .prologue
    .line 76
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "unread = ?"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v5, "1"

    aput-object v5, v4, v0

    const-string v5, "timestamp DESC"

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/richpush/RichPushResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method insertMessages([Landroid/content/ContentValues;)I
    .locals 1
    .param p1, "values"    # [Landroid/content/ContentValues;

    .prologue
    .line 131
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/richpush/RichPushResolver;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v0

    return v0
.end method

.method markMessageRead(Ljava/lang/String;)I
    .locals 3
    .param p1, "messageId"    # Ljava/lang/String;

    .prologue
    .line 92
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 93
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "unread"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 94
    invoke-virtual {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushResolver;->updateMessage(Ljava/lang/String;Landroid/content/ContentValues;)I

    move-result v1

    return v1
.end method

.method markMessagesDeleted(Ljava/util/Set;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 111
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 112
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "deleted"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 113
    invoke-virtual {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushResolver;->updateMessages(Ljava/util/Set;Landroid/content/ContentValues;)I

    move-result v1

    return v1
.end method

.method markMessagesRead(Ljava/util/Set;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 98
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 99
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "unread"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 100
    invoke-virtual {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushResolver;->updateMessages(Ljava/util/Set;Landroid/content/ContentValues;)I

    move-result v1

    return v1
.end method

.method markMessagesUnread(Ljava/util/Set;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 105
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 106
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "unread"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 107
    invoke-virtual {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushResolver;->updateMessages(Ljava/util/Set;Landroid/content/ContentValues;)I

    move-result v1

    return v1
.end method

.method updateMessage(Ljava/lang/String;Landroid/content/ContentValues;)I
    .locals 4
    .param p1, "messageId"    # Ljava/lang/String;
    .param p2, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lcom/urbanairship/richpush/RichPushResolver;->appendMessageIdToUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "message_id = ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v0, p2, v1, v2}, Lcom/urbanairship/richpush/RichPushResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method updateMessages(Ljava/util/Set;Landroid/content/ContentValues;)I
    .locals 5
    .param p2, "values"    # Landroid/content/ContentValues;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/ContentValues;",
            ")I"
        }
    .end annotation

    .prologue
    .line 141
    .local p1, "messageIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    .line 142
    .local v0, "numberOfmessageIds":I
    invoke-direct {p0, p1}, Lcom/urbanairship/richpush/RichPushResolver;->appendMessageIdsToUri(Ljava/util/Collection;)Landroid/net/Uri;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "message_id IN ( "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "?"

    const-string v4, ", "

    invoke-static {v3, v0, v4}, Lcom/urbanairship/util/UAStringUtil;->repeat(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " )"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v0, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {p0, v2, p2, v3, v1}, Lcom/urbanairship/richpush/RichPushResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    return v1
.end method
