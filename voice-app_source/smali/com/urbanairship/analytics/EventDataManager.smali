.class Lcom/urbanairship/analytics/EventDataManager;
.super Lcom/urbanairship/util/DataManager;
.source "EventDataManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/analytics/EventDataManager$Events;
    }
.end annotation


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "ua_analytics.db"

.field private static final DATABASE_VERSION:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 97
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ua_analytics.db"

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/urbanairship/util/DataManager;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 98
    return-void
.end method

.method private static repeat(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "repeater"    # Ljava/lang/String;
    .param p1, "times"    # I
    .param p2, "separator"    # Ljava/lang/String;

    .prologue
    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .local v0, "builder":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, p1, :cond_1

    .line 224
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    add-int/lit8 v2, v1, 0x1

    if-eq v2, p1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 227
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method


# virtual methods
.method protected bindValuesToSqlLiteStatment(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V
    .locals 2
    .param p1, "statement"    # Landroid/database/sqlite/SQLiteStatement;
    .param p2, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 128
    const/4 v0, 0x1

    const-string v1, "type"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 129
    const/4 v0, 0x2

    const-string v1, "event_id"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 130
    const/4 v0, 0x3

    const-string v1, "data"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 131
    const/4 v0, 0x4

    const-string v1, "time"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;II)V

    .line 132
    const/4 v0, 0x5

    const-string v1, "session_id"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 133
    const/4 v0, 0x6

    const-string v1, "event_size"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;II)V

    .line 134
    return-void
.end method

.method public deleteEvent(Ljava/lang/String;)Z
    .locals 5
    .param p1, "eventId"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 189
    const-string v2, "events"

    const-string v3, "event_id = ?"

    new-array v4, v0, [Ljava/lang/String;

    aput-object p1, v4, v1

    invoke-virtual {p0, v2, v3, v4}, Lcom/urbanairship/analytics/EventDataManager;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public deleteEventType(Ljava/lang/String;)Z
    .locals 5
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 199
    const-string v2, "events"

    const-string v3, "type = ?"

    new-array v4, v0, [Ljava/lang/String;

    aput-object p1, v4, v1

    invoke-virtual {p0, v2, v3, v4}, Lcom/urbanairship/analytics/EventDataManager;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public deleteEvents(Ljava/util/Set;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "eventIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const/4 v4, 0x0

    .line 208
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-nez v3, :cond_1

    .line 209
    :cond_0
    const-string v3, "Nothing to delete. Returning."

    invoke-static {v3}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    move v3, v4

    .line 218
    :goto_0
    return v3

    .line 213
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    .line 214
    .local v2, "numOfEventIds":I
    const-string v3, "?"

    const-string v5, ", "

    invoke-static {v3, v2, v5}, Lcom/urbanairship/analytics/EventDataManager;->repeat(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 215
    .local v1, "inStatement":Ljava/lang/String;
    const-string v5, "events"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "event_id IN ( "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " )"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v3, v2, [Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {p0, v5, v6, v3}, Lcom/urbanairship/analytics/EventDataManager;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 218
    .local v0, "deleted":I
    if-lez v0, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    move v3, v4

    goto :goto_0
.end method

.method public deleteSession(Ljava/lang/String;)Z
    .locals 6
    .param p1, "sessionId"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 237
    const-string v3, "events"

    const-string v4, "session_id = ?"

    new-array v5, v1, [Ljava/lang/String;

    aput-object p1, v5, v2

    invoke-virtual {p0, v3, v4, v5}, Lcom/urbanairship/analytics/EventDataManager;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 239
    .local v0, "deleted":I
    if-lez v0, :cond_0

    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Deleted "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " rows with session id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 244
    :goto_0
    return v1

    :cond_0
    move v1, v2

    goto :goto_0
.end method

.method public getDatabaseSize()I
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v9, -0x1

    const/4 v3, 0x0

    .line 301
    const/4 v8, 0x0

    .line 302
    .local v8, "result":Ljava/lang/Integer;
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "SUM(event_size) as _size"

    aput-object v0, v2, v10

    .line 303
    .local v2, "columns":[Ljava/lang/String;
    const-string v1, "events"

    move-object v0, p0

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    invoke-virtual/range {v0 .. v6}, Lcom/urbanairship/analytics/EventDataManager;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 305
    .local v7, "cursor":Landroid/database/Cursor;
    if-nez v7, :cond_0

    .line 306
    const-string v0, "Unable to query database"

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 315
    :goto_0
    return v9

    .line 310
    :cond_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 311
    invoke-interface {v7, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 312
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 315
    :cond_1
    if-nez v8, :cond_2

    move v0, v9

    :goto_1
    move v9, v0

    goto :goto_0

    :cond_2
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1
.end method

.method public getEventCount()I
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v9, -0x1

    const/4 v3, 0x0

    .line 277
    const/4 v8, 0x0

    .line 278
    .local v8, "result":Ljava/lang/Integer;
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "COUNT(*) as _cnt"

    aput-object v0, v2, v10

    .line 279
    .local v2, "columns":[Ljava/lang/String;
    const-string v1, "events"

    move-object v0, p0

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    invoke-virtual/range {v0 .. v6}, Lcom/urbanairship/analytics/EventDataManager;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 281
    .local v7, "cursor":Landroid/database/Cursor;
    if-nez v7, :cond_0

    .line 282
    const-string v0, "Unable to query database"

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 292
    :goto_0
    return v9

    .line 286
    :cond_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    invoke-interface {v7, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 290
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 292
    if-nez v8, :cond_2

    move v0, v9

    :goto_1
    move v9, v0

    goto :goto_0

    :cond_2
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1
.end method

.method public getEvents(I)Ljava/util/Map;
    .locals 11
    .param p1, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 159
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8, p1}, Ljava/util/HashMap;-><init>(I)V

    .line 161
    .local v8, "events":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "event_id"

    aput-object v0, v2, v9

    const-string v0, "data"

    aput-object v0, v2, v10

    .line 166
    .local v2, "columns":[Ljava/lang/String;
    const-string v1, "events"

    const-string v5, "_id ASC"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "0, "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v4, v3

    invoke-virtual/range {v0 .. v6}, Lcom/urbanairship/analytics/EventDataManager;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 168
    .local v7, "c":Landroid/database/Cursor;
    if-nez v7, :cond_0

    .line 179
    :goto_0
    return-object v8

    .line 172
    :cond_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 173
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_1

    .line 177
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0
.end method

.method protected getInsertStatement(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/sqlite/SQLiteStatement;
    .locals 4
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 138
    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "type"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "event_id"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "data"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "time"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "session_id"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "event_size"

    aput-object v3, v1, v2

    invoke-virtual {p0, p1, v1}, Lcom/urbanairship/analytics/EventDataManager;->buildInsertStatement(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 142
    .local v0, "sql":Ljava/lang/String;
    invoke-virtual {p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    return-object v1
.end method

.method public getOldestSessionId()Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v3, 0x0

    .line 254
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "session_id"

    aput-object v0, v2, v9

    .line 255
    .local v2, "columns":[Ljava/lang/String;
    const-string v1, "events"

    const-string v5, "_id ASC"

    const-string v6, "0, 1"

    move-object v0, p0

    move-object v4, v3

    invoke-virtual/range {v0 .. v6}, Lcom/urbanairship/analytics/EventDataManager;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 257
    .local v7, "cursor":Landroid/database/Cursor;
    if-nez v7, :cond_0

    .line 258
    const-string v0, "Unable to query database"

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 268
    :goto_0
    return-object v3

    .line 262
    :cond_0
    const/4 v8, 0x0

    .line 263
    .local v8, "sessionId":Ljava/lang/String;
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 266
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    move-object v3, v8

    .line 268
    goto :goto_0
.end method

.method public insertEvent(Landroid/content/ContentValues;)J
    .locals 2
    .param p1, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 333
    const-string v0, "events"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/analytics/EventDataManager;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public insertEvent(Lcom/urbanairship/analytics/Event;)J
    .locals 2
    .param p1, "event"    # Lcom/urbanairship/analytics/Event;

    .prologue
    .line 324
    invoke-virtual {p1}, Lcom/urbanairship/analytics/Event;->getContentValues()Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/urbanairship/analytics/EventDataManager;->insertEvent(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method protected onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 115
    const-string v0, "CREATE TABLE IF NOT EXISTS events (_id INTEGER PRIMARY KEY AUTOINCREMENT,type TEXT,event_id TEXT,time INTEGER,data TEXT,session_id TEXT,event_size INTEGER);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 124
    return-void
.end method

.method protected onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 148
    const-string v0, "DROP TABLE IF EXISTS events"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 149
    invoke-virtual {p0, p1}, Lcom/urbanairship/analytics/EventDataManager;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 150
    return-void
.end method

.method protected onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Upgrading analytics database from version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", which will destroy all old data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 107
    const-string v0, "DROP TABLE IF EXISTS events"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p0, p1}, Lcom/urbanairship/analytics/EventDataManager;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 111
    return-void
.end method
