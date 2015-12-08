.class public Lcom/kochava/android/tracker/DbAdapter;
.super Ljava/lang/Object;
.source "DbAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;
    }
.end annotation


# static fields
.field private static final DATABASE_CREATE:Ljava/lang/String; = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL,created_at INTEGER NOT NULL);"

.field private static final DATABASE_CREATE_2:Ljava/lang/String; = "CREATE TABLE keys (id STRING NOT NULL PRIMARY KEY, data STRING NOT NULL);"

.field private static final DATABASE_INDEX:Ljava/lang/String; = "CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);"

.field private static final DATABASE_NAME:Ljava/lang/String; = "KochavaFeatureTracker"

.field private static final DATABASE_TABLE:Ljava/lang/String; = "events"

.field private static final DATABASE_TABLE_2:Ljava/lang/String; = "keys"

.field private static final DATABASE_VERSION:I = 0x2

.field public static final KEY_CREATED_AT:Ljava/lang/String; = "created_at"

.field public static final KEY_DATA:Ljava/lang/String; = "data"

.field private static final LOGTAG:Ljava/lang/String; = "KochavaDbAdapter"


# instance fields
.field private kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-direct {v0, p1}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    .line 92
    return-void
.end method


# virtual methods
.method public addEvent(Lorg/json/JSONObject;Z)I
    .locals 8
    .param p1, "j"    # Lorg/json/JSONObject;
    .param p2, "isInitial"    # Z

    .prologue
    .line 103
    monitor-enter p0

    .line 105
    :try_start_0
    const-string v5, "addEvent"

    invoke-static {v5}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    const/4 v0, 0x0

    .line 108
    .local v0, "c":Landroid/database/Cursor;
    const/4 v1, -0x1

    .line 111
    .local v1, "count":I
    :try_start_1
    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 113
    .local v3, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 114
    .local v2, "cv":Landroid/content/ContentValues;
    const-string v5, "data"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    if-eqz p2, :cond_1

    .line 117
    const-string v5, "created_at"

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 121
    :goto_0
    const-string v5, "events"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 123
    const-string v5, "SELECT * FROM events"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 124
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v1

    .line 128
    :try_start_2
    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 129
    if-eqz v0, :cond_0

    .line 130
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 133
    .end local v2    # "cv":Landroid/content/ContentValues;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_0
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v1

    .line 119
    .restart local v2    # "cv":Landroid/content/ContentValues;
    .restart local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_1
    :try_start_3
    const-string v5, "created_at"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 125
    .end local v2    # "cv":Landroid/content/ContentValues;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :catch_0
    move-exception v4

    .line 126
    .local v4, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "addEvent "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 128
    :try_start_5
    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 129
    if-eqz v0, :cond_0

    .line 130
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 134
    .end local v0    # "c":Landroid/database/Cursor;
    .end local v1    # "count":I
    .end local v4    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v5

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v5

    .line 128
    .restart local v0    # "c":Landroid/database/Cursor;
    .restart local v1    # "count":I
    :catchall_1
    move-exception v5

    :try_start_6
    iget-object v6, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v6}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 129
    if-eqz v0, :cond_2

    .line 130
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
.end method

.method public cleanupEvents(J)V
    .locals 5
    .param p1, "time"    # J

    .prologue
    .line 143
    monitor-enter p0

    .line 145
    :try_start_0
    const-string v2, "cleanupEvent"

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    :try_start_1
    iget-object v2, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v2}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 149
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v2, "events"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "created_at <= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    :try_start_2
    iget-object v2, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v2}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 156
    .end local v0    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    return-void

    .line 150
    :catch_0
    move-exception v1

    .line 152
    .local v1, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cleanupEvents"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 154
    :try_start_4
    iget-object v2, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v2}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    goto :goto_0

    .line 156
    .end local v1    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v2

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v2

    .line 154
    :catchall_1
    move-exception v2

    :try_start_5
    iget-object v3, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v3}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method public generateDataString()Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 263
    monitor-enter p0

    .line 264
    const/4 v1, 0x0

    .line 265
    .local v1, "c":Landroid/database/Cursor;
    const/4 v2, 0x0

    .line 266
    .local v2, "data":Ljava/lang/String;
    const/4 v6, 0x0

    .line 269
    .local v6, "timestamp":Ljava/lang/String;
    :try_start_0
    iget-object v8, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v8}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 270
    .local v3, "db":Landroid/database/sqlite/SQLiteDatabase;
    const-string v8, "SELECT * FROM events ORDER BY created_at ASC"

    const/4 v9, 0x0

    invoke-virtual {v3, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 272
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 274
    .local v0, "arr":Lorg/json/JSONArray;
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 276
    const-string v8, "created_at"

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "0"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 278
    const-string v8, "created_at"

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v6

    .line 281
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    const-string v8, "data"

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 282
    .local v5, "j":Lorg/json/JSONObject;
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 289
    .end local v5    # "j":Lorg/json/JSONObject;
    :goto_1
    :try_start_2
    const-string v8, "generateDataString called, Grabbing only initial from database"

    invoke-static {v8}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 306
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-lez v8, :cond_1

    .line 308
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "[JSON DATA VER 4] : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 310
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/kochava/android/util/Base64Coder;->encodeString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v2

    .line 316
    :cond_1
    :try_start_3
    iget-object v8, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v8}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 317
    if-eqz v1, :cond_2

    .line 318
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 322
    .end local v0    # "arr":Lorg/json/JSONArray;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_2
    :goto_2
    if-eqz v6, :cond_6

    if-eqz v2, :cond_6

    .line 324
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 326
    :goto_3
    return-object v7

    .line 284
    .restart local v0    # "arr":Lorg/json/JSONArray;
    .restart local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :catch_0
    move-exception v4

    .line 286
    .local v4, "e":Lorg/json/JSONException;
    :try_start_4
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "generateDataString called, an error occured when creating initial json object: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v4}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 313
    .end local v0    # "arr":Lorg/json/JSONArray;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    .end local v4    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v4

    .line 314
    .local v4, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "generateDataString"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 316
    :try_start_6
    iget-object v8, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v8}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 317
    if-eqz v1, :cond_2

    .line 318
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    .line 327
    .end local v4    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v7

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v7

    .line 294
    .restart local v0    # "arr":Lorg/json/JSONArray;
    .restart local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_3
    :try_start_7
    invoke-interface {v1}, Landroid/database/Cursor;->isLast()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 296
    const-string v8, "created_at"

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result-object v6

    .line 299
    :cond_4
    :try_start_8
    new-instance v5, Lorg/json/JSONObject;

    const-string v8, "data"

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 300
    .restart local v5    # "j":Lorg/json/JSONObject;
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto/16 :goto_0

    .line 301
    .end local v5    # "j":Lorg/json/JSONObject;
    :catch_2
    move-exception v8

    goto/16 :goto_0

    .line 316
    .end local v0    # "arr":Lorg/json/JSONArray;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :catchall_1
    move-exception v7

    :try_start_9
    iget-object v8, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v8}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 317
    if-eqz v1, :cond_5

    .line 318
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v7

    .line 326
    :cond_6
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_3
.end method

.method public getApplicationData(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 219
    monitor-enter p0

    .line 221
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    .line 222
    :cond_0
    const-string v3, ""

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :goto_0
    return-object v3

    .line 223
    :cond_1
    const/4 v0, 0x0

    .line 226
    .local v0, "c":Landroid/database/Cursor;
    :try_start_1
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 227
    .local v1, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT * FROM keys WHERE id=\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 228
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 230
    const-string v4, "data"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v3

    .line 239
    :try_start_2
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 240
    if-eqz v0, :cond_2

    .line 242
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    monitor-exit p0

    goto :goto_0

    .line 246
    .end local v0    # "c":Landroid/database/Cursor;
    .end local v1    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :catchall_0
    move-exception v3

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v3

    .line 239
    .restart local v0    # "c":Landroid/database/Cursor;
    .restart local v1    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_3
    :try_start_3
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 240
    if-eqz v0, :cond_4

    .line 242
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 245
    .end local v1    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_4
    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 233
    :catch_0
    move-exception v2

    .line 235
    .local v2, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "generateDataString"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 239
    :try_start_5
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 240
    if-eqz v0, :cond_4

    .line 242
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 239
    .end local v2    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_1
    move-exception v3

    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 240
    if-eqz v0, :cond_5

    .line 242
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method public insertApplicationData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;

    .prologue
    .line 190
    monitor-enter p0

    .line 192
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    .line 193
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    :goto_0
    return-void

    .line 194
    :cond_1
    const/4 v0, 0x0

    .line 197
    .local v0, "c":Landroid/database/Cursor;
    :try_start_1
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 198
    .local v2, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 199
    .local v1, "cv":Landroid/content/ContentValues;
    const-string v4, "id"

    invoke-virtual {v1, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const-string v4, "data"

    invoke-virtual {v1, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    const-string v4, "keys"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    :try_start_2
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 210
    if-eqz v0, :cond_2

    .line 212
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 215
    .end local v1    # "cv":Landroid/content/ContentValues;
    .end local v2    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_2
    :goto_1
    monitor-exit p0

    goto :goto_0

    .end local v0    # "c":Landroid/database/Cursor;
    :catchall_0
    move-exception v4

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v4

    .line 203
    .restart local v0    # "c":Landroid/database/Cursor;
    :catch_0
    move-exception v3

    .line 205
    .local v3, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "addEvent"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 209
    :try_start_4
    iget-object v4, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v4}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 210
    if-eqz v0, :cond_2

    .line 212
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 209
    .end local v3    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_1
    move-exception v4

    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 210
    if-eqz v0, :cond_3

    .line 212
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public updateApplicationData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;

    .prologue
    .line 160
    monitor-enter p0

    .line 162
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    .line 163
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    :goto_0
    return-void

    .line 164
    :cond_1
    const/4 v0, 0x0

    .line 167
    .local v0, "c":Landroid/database/Cursor;
    :try_start_1
    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 168
    .local v2, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 169
    .local v1, "cv":Landroid/content/ContentValues;
    const-string v5, "data"

    invoke-virtual {v1, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "id=\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 172
    .local v4, "whereClause":Ljava/lang/String;
    const-string v5, "keys"

    const/4 v6, 0x0

    invoke-virtual {v2, v5, v1, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    :try_start_2
    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 181
    if-eqz v0, :cond_2

    .line 183
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 186
    .end local v1    # "cv":Landroid/content/ContentValues;
    .end local v2    # "db":Landroid/database/sqlite/SQLiteDatabase;
    .end local v4    # "whereClause":Ljava/lang/String;
    :cond_2
    :goto_1
    monitor-exit p0

    goto :goto_0

    .end local v0    # "c":Landroid/database/Cursor;
    :catchall_0
    move-exception v5

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v5

    .line 174
    .restart local v0    # "c":Landroid/database/Cursor;
    :catch_0
    move-exception v3

    .line 176
    .local v3, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "addEvent"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 180
    :try_start_4
    iget-object v5, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v5}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 181
    if-eqz v0, :cond_2

    .line 183
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 180
    .end local v3    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_1
    move-exception v5

    iget-object v6, p0, Lcom/kochava/android/tracker/DbAdapter;->kDb:Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;

    invoke-virtual {v6}, Lcom/kochava/android/tracker/DbAdapter$DatabaseHelper;->close()V

    .line 181
    if-eqz v0, :cond_3

    .line 183
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method
