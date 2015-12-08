.class public Lcom/urbanairship/richpush/RichPushMessage;
.super Ljava/lang/Object;
.source "RichPushMessage.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/urbanairship/richpush/RichPushMessage;",
        ">;"
    }
.end annotation


# static fields
.field static final UA_DATE_FORMATTER:Ljava/text/SimpleDateFormat;


# instance fields
.field deleted:Z

.field expirationMS:Ljava/lang/Long;

.field extras:Landroid/os/Bundle;

.field messageBodyUrl:Ljava/lang/String;

.field messageId:Ljava/lang/String;

.field messageReadUrl:Ljava/lang/String;

.field messageUrl:Ljava/lang/String;

.field rawMessageJSON:Lorg/json/JSONObject;

.field sentMS:J

.field title:Ljava/lang/String;

.field unreadClient:Z

.field unreadOrigin:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 56
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/urbanairship/richpush/RichPushMessage;->UA_DATE_FORMATTER:Ljava/text/SimpleDateFormat;

    .line 74
    sget-object v0, Lcom/urbanairship/richpush/RichPushMessage;->UA_DATE_FORMATTER:Ljava/text/SimpleDateFormat;

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 75
    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "messageId"    # Ljava/lang/String;

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    .line 78
    iput-object p1, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    .line 79
    return-void
.end method

.method private areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;

    .prologue
    .line 365
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 366
    const/4 v0, 0x1

    .line 373
    :goto_0
    return v0

    .line 369
    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    .line 370
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 373
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private getInbox()Lcom/urbanairship/richpush/RichPushInbox;
    .locals 1

    .prologue
    .line 381
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUser;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v0

    return-object v0
.end method

.method static getMillisecondsFromTimeStamp(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 4
    .param p0, "timeStamp"    # Ljava/lang/String;
    .param p1, "defaultValue"    # Ljava/lang/Long;

    .prologue
    .line 119
    if-eqz p0, :cond_0

    .line 120
    :try_start_0
    sget-object v2, Lcom/urbanairship/richpush/RichPushMessage;->UA_DATE_FORMATTER:Ljava/text/SimpleDateFormat;

    invoke-virtual {v2, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 121
    .local v0, "date":Ljava/util/Date;
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p1

    .line 127
    .end local v0    # "date":Ljava/util/Date;
    .end local p1    # "defaultValue":Ljava/lang/Long;
    :cond_0
    :goto_0
    return-object p1

    .line 123
    .restart local p1    # "defaultValue":Ljava/lang/Long;
    :catch_0
    move-exception v1

    .line 124
    .local v1, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Couldn\'t parse message date: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", defaulting to:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static jsonToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    .locals 4
    .param p0, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 132
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 133
    .local v0, "extras":Landroid/os/Bundle;
    if-eqz p0, :cond_0

    .line 134
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "keysIterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 135
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 136
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 139
    .end local v1    # "key":Ljava/lang/String;
    .end local v2    # "keysIterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_0
    return-object v0
.end method

.method static messageFromCursor(Landroid/database/Cursor;)Lcom/urbanairship/richpush/RichPushMessage;
    .locals 10
    .param p0, "cursor"    # Landroid/database/Cursor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 85
    new-instance v1, Lcom/urbanairship/richpush/RichPushMessage;

    const-string v4, "message_id"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/urbanairship/richpush/RichPushMessage;-><init>(Ljava/lang/String;)V

    .line 87
    .local v1, "message":Lcom/urbanairship/richpush/RichPushMessage;
    const-string v4, "message_url"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->messageUrl:Ljava/lang/String;

    .line 88
    const-string v4, "message_body_url"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->messageBodyUrl:Ljava/lang/String;

    .line 89
    const-string v4, "message_read_url"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->messageReadUrl:Ljava/lang/String;

    .line 90
    const-string v4, "unread"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-ne v4, v5, :cond_0

    move v4, v5

    :goto_0
    iput-boolean v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    .line 93
    const-string v4, "unread_orig"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-ne v4, v5, :cond_1

    move v4, v5

    :goto_1
    iput-boolean v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->unreadOrigin:Z

    .line 95
    new-instance v4, Lorg/json/JSONObject;

    const-string v7, "extra"

    invoke-interface {p0, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {p0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/urbanairship/richpush/RichPushMessage;->jsonToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v4

    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->extras:Landroid/os/Bundle;

    .line 97
    const-string v4, "title"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->title:Ljava/lang/String;

    .line 100
    const-string v4, "timestamp"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 101
    .local v3, "timeStamp":Ljava/lang/String;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/urbanairship/richpush/RichPushMessage;->getMillisecondsFromTimeStamp(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iput-wide v8, v1, Lcom/urbanairship/richpush/RichPushMessage;->sentMS:J

    .line 103
    const-string v4, "deleted"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-ne v4, v5, :cond_2

    :goto_2
    iput-boolean v5, v1, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    .line 106
    const-string v4, "raw_message_object"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 107
    .local v2, "rawMessageJSON":Ljava/lang/String;
    if-nez v2, :cond_3

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :goto_3
    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->rawMessageJSON:Lorg/json/JSONObject;

    .line 109
    const-string v4, "expiration_timestamp"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 110
    .local v0, "expiryTimeStamp":Ljava/lang/String;
    const/4 v4, 0x0

    invoke-static {v0, v4}, Lcom/urbanairship/richpush/RichPushMessage;->getMillisecondsFromTimeStamp(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v1, Lcom/urbanairship/richpush/RichPushMessage;->expirationMS:Ljava/lang/Long;

    .line 112
    return-object v1

    .end local v0    # "expiryTimeStamp":Ljava/lang/String;
    .end local v2    # "rawMessageJSON":Ljava/lang/String;
    .end local v3    # "timeStamp":Ljava/lang/String;
    :cond_0
    move v4, v6

    .line 90
    goto/16 :goto_0

    :cond_1
    move v4, v6

    .line 93
    goto :goto_1

    .restart local v3    # "timeStamp":Ljava/lang/String;
    :cond_2
    move v5, v6

    .line 103
    goto :goto_2

    .line 107
    .restart local v2    # "rawMessageJSON":Ljava/lang/String;
    :cond_3
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_3
.end method


# virtual methods
.method public compareTo(Lcom/urbanairship/richpush/RichPushMessage;)I
    .locals 2
    .param p1, "another"    # Lcom/urbanairship/richpush/RichPushMessage;

    .prologue
    .line 325
    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 49
    check-cast p1, Lcom/urbanairship/richpush/RichPushMessage;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/richpush/RichPushMessage;->compareTo(Lcom/urbanairship/richpush/RichPushMessage;)I

    move-result v0

    return v0
.end method

.method public delete()V
    .locals 2

    .prologue
    .line 294
    iget-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    if-nez v1, :cond_0

    .line 295
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    .line 296
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 297
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 298
    .local v0, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 299
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/urbanairship/richpush/RichPushInbox;->deleteMessages(Ljava/util/Set;)V

    .line 302
    .end local v0    # "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 330
    if-eqz p1, :cond_0

    instance-of v3, p1, Lcom/urbanairship/richpush/RichPushMessage;

    if-nez v3, :cond_2

    :cond_0
    move v1, v2

    .line 340
    :cond_1
    :goto_0
    return v1

    :cond_2
    move-object v0, p1

    .line 334
    check-cast v0, Lcom/urbanairship/richpush/RichPushMessage;

    .line 336
    .local v0, "that":Lcom/urbanairship/richpush/RichPushMessage;
    if-eq p0, v0, :cond_1

    .line 340
    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    iget-object v4, v0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/urbanairship/richpush/RichPushMessage;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageBodyUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/urbanairship/richpush/RichPushMessage;->messageBodyUrl:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/urbanairship/richpush/RichPushMessage;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageReadUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/urbanairship/richpush/RichPushMessage;->messageReadUrl:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/urbanairship/richpush/RichPushMessage;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/urbanairship/richpush/RichPushMessage;->messageUrl:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/urbanairship/richpush/RichPushMessage;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/urbanairship/richpush/RichPushMessage;->extras:Landroid/os/Bundle;

    iget-object v4, v0, Lcom/urbanairship/richpush/RichPushMessage;->extras:Landroid/os/Bundle;

    invoke-direct {p0, v3, v4}, Lcom/urbanairship/richpush/RichPushMessage;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-boolean v3, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    iget-boolean v4, v0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    if-ne v3, v4, :cond_3

    iget-wide v4, p0, Lcom/urbanairship/richpush/RichPushMessage;->sentMS:J

    iget-wide v6, v0, Lcom/urbanairship/richpush/RichPushMessage;->sentMS:J

    cmp-long v3, v4, v6

    if-eqz v3, :cond_1

    :cond_3
    move v1, v2

    goto :goto_0
.end method

.method public getExpirationDate()Ljava/util/Date;
    .locals 4

    .prologue
    .line 223
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->expirationMS:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 224
    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->expirationMS:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 226
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getExpirationDateMS()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->expirationMS:Ljava/lang/Long;

    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->extras:Landroid/os/Bundle;

    return-object v0
.end method

.method public getMessageBodyUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageBodyUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageReadUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageReadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRawMessageJSON()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->rawMessageJSON:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getSentDate()Ljava/util/Date;
    .locals 4

    .prologue
    .line 204
    new-instance v0, Ljava/util/Date;

    iget-wide v2, p0, Lcom/urbanairship/richpush/RichPushMessage;->sentMS:J

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public getSentDateMS()J
    .locals 2

    .prologue
    .line 213
    iget-wide v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->sentMS:J

    return-wide v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 351
    const/16 v0, 0x11

    .line 352
    .local v0, "result":I
    iget-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    if-eqz v1, :cond_0

    move v1, v2

    :goto_0
    add-int/lit16 v0, v1, 0x275

    .line 353
    mul-int/lit8 v1, v0, 0x25

    iget-boolean v4, p0, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    if-eqz v4, :cond_1

    :goto_1
    add-int v0, v1, v2

    .line 354
    mul-int/lit8 v1, v0, 0x25

    iget-object v2, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    return v1

    :cond_0
    move v1, v3

    .line 352
    goto :goto_0

    :cond_1
    move v2, v3

    .line 353
    goto :goto_1
.end method

.method public isDeleted()Z
    .locals 1

    .prologue
    .line 318
    iget-boolean v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->deleted:Z

    return v0
.end method

.method public isExpired()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 245
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->expirationMS:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 248
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->expirationMS:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isRead()Z
    .locals 1

    .prologue
    .line 195
    iget-boolean v0, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public markRead()V
    .locals 2

    .prologue
    .line 266
    iget-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    if-eqz v1, :cond_0

    .line 267
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    .line 268
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 269
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 270
    .local v0, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 271
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/urbanairship/richpush/RichPushInbox;->markMessagesRead(Ljava/util/Set;)V

    .line 274
    .end local v0    # "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_0
    return-void
.end method

.method public markUnread()V
    .locals 2

    .prologue
    .line 280
    iget-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    if-nez v1, :cond_0

    .line 281
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->unreadClient:Z

    .line 282
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 283
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 284
    .local v0, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushMessage;->messageId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 285
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushMessage;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/urbanairship/richpush/RichPushInbox;->markMessagesUnread(Ljava/util/Set;)V

    .line 288
    .end local v0    # "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    :cond_0
    return-void
.end method
