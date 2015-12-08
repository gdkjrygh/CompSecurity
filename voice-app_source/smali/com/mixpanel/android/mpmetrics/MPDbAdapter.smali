.class Lcom/mixpanel/android/mpmetrics/MPDbAdapter;
.super Ljava/lang/Object;
.source "MPDbAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;,
        Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;
    }
.end annotation


# static fields
.field private static final CREATE_EVENTS_TABLE:Ljava/lang/String;

.field private static final CREATE_PEOPLE_TABLE:Ljava/lang/String;

.field private static final DATABASE_NAME:Ljava/lang/String; = "mixpanel"

.field private static final DATABASE_VERSION:I = 0x4

.field public static final DB_OUT_OF_MEMORY_ERROR:I = -0x2

.field public static final DB_UNDEFINED_CODE:I = -0x3

.field public static final DB_UPDATE_ERROR:I = -0x1

.field private static final EVENTS_TIME_INDEX:Ljava/lang/String;

.field public static final KEY_CREATED_AT:Ljava/lang/String; = "created_at"

.field public static final KEY_DATA:Ljava/lang/String; = "data"

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.Database"

.field private static final PEOPLE_TIME_INDEX:Ljava/lang/String;


# instance fields
.field private final mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->EVENTS:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 54
    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " STRING NOT NULL, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 55
    const-string v1, "created_at"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER NOT NULL);"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 52
    sput-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->CREATE_EVENTS_TABLE:Ljava/lang/String;

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->PEOPLE:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 58
    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " STRING NOT NULL, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 59
    const-string v1, "created_at"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER NOT NULL);"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 56
    sput-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->CREATE_PEOPLE_TABLE:Ljava/lang/String;

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE INDEX IF NOT EXISTS time_idx ON "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->EVENTS:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 62
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "created_at"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 60
    sput-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->EVENTS_TIME_INDEX:Ljava/lang/String;

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE INDEX IF NOT EXISTS time_idx ON "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->PEOPLE:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 65
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "created_at"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 63
    sput-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->PEOPLE_TIME_INDEX:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 122
    const-string v0, "mixpanel"

    invoke-direct {p0, p1, v0}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "dbName"    # Ljava/lang/String;

    .prologue
    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-direct {v0, p1, p2}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    .line 127
    return-void
.end method

.method static synthetic access$0()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->CREATE_EVENTS_TABLE:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->CREATE_PEOPLE_TABLE:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->EVENTS_TIME_INDEX:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$3()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->PEOPLE_TIME_INDEX:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public addJSON(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)I
    .locals 10
    .param p1, "j"    # Lorg/json/JSONObject;
    .param p2, "table"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->belowMemThreshold()Z

    move-result v6

    if-nez v6, :cond_0

    .line 140
    const-string v6, "MixpanelAPI.Database"

    const-string v7, "There is not enough space left on the device to store Mixpanel data, so data was discarded"

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    const/4 v1, -0x2

    .line 178
    :goto_0
    return v1

    .line 144
    :cond_0
    invoke-virtual {p2}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v5

    .line 146
    .local v5, "tableName":Ljava/lang/String;
    const/4 v0, 0x0

    .line 147
    .local v0, "c":Landroid/database/Cursor;
    const/4 v1, -0x1

    .line 150
    .local v1, "count":I
    :try_start_0
    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v6}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 152
    .local v3, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 153
    .local v2, "cv":Landroid/content/ContentValues;
    const-string v6, "data"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v6, "created_at"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 155
    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 157
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SELECT COUNT(*) FROM "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 158
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 159
    const/4 v6, 0x0

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    .line 173
    if-eqz v0, :cond_1

    .line 174
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 176
    :cond_1
    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v6}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    goto :goto_0

    .line 160
    .end local v2    # "cv":Landroid/content/ContentValues;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :catch_0
    move-exception v4

    .line 161
    .local v4, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_1
    const-string v6, "MixpanelAPI.Database"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Could not add Mixpanel data to table "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ". Re-initializing database."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 167
    if-eqz v0, :cond_2

    .line 168
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 169
    const/4 v0, 0x0

    .line 171
    :cond_2
    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v6}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->deleteDatabase()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    if-eqz v0, :cond_3

    .line 174
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 176
    :cond_3
    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v6}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    goto/16 :goto_0

    .line 172
    .end local v4    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v6

    .line 173
    if-eqz v0, :cond_4

    .line 174
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 176
    :cond_4
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v7}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 177
    throw v6
.end method

.method protected belowMemThreshold()Z
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->belowMemThreshold()Z

    move-result v0

    return v0
.end method

.method public cleanupEvents(JLcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)V
    .locals 7
    .param p1, "time"    # J
    .param p3, "table"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    .prologue
    .line 211
    invoke-virtual {p3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v2

    .line 214
    .local v2, "tableName":Ljava/lang/String;
    :try_start_0
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 215
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "created_at <= "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 227
    .end local v0    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :goto_0
    return-void

    .line 216
    :catch_0
    move-exception v1

    .line 217
    .local v1, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_1
    const-string v3, "MixpanelAPI.Database"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Could not clean timed-out Mixpanel records from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ". Re-initializing database."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 223
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->deleteDatabase()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    goto :goto_0

    .line 224
    .end local v1    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v3

    .line 225
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 226
    throw v3
.end method

.method public cleanupEvents(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)V
    .locals 6
    .param p1, "last_id"    # Ljava/lang/String;
    .param p2, "table"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    .prologue
    .line 187
    invoke-virtual {p2}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v2

    .line 190
    .local v2, "tableName":Ljava/lang/String;
    :try_start_0
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 191
    .local v0, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "_id <= "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 203
    .end local v0    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :goto_0
    return-void

    .line 192
    :catch_0
    move-exception v1

    .line 193
    .local v1, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_1
    const-string v3, "MixpanelAPI.Database"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Could not clean sent Mixpanel records from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ". Re-initializing database."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 199
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->deleteDatabase()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    goto :goto_0

    .line 200
    .end local v1    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v3

    .line 201
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 202
    throw v3
.end method

.method public deleteDB()V
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->deleteDatabase()V

    .line 231
    return-void
.end method

.method public generateDataString(Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)[Ljava/lang/String;
    .locals 12
    .param p1, "table"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    .prologue
    const/4 v7, 0x0

    .line 243
    const/4 v1, 0x0

    .line 244
    .local v1, "c":Landroid/database/Cursor;
    const/4 v2, 0x0

    .line 245
    .local v2, "data":Ljava/lang/String;
    const/4 v6, 0x0

    .line 246
    .local v6, "last_id":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->getName()Ljava/lang/String;

    move-result-object v8

    .line 249
    .local v8, "tableName":Ljava/lang/String;
    :try_start_0
    iget-object v9, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v9}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 250
    .local v3, "db":Landroid/database/sqlite/SQLiteDatabase;
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SELECT * FROM "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 251
    const-string v10, " ORDER BY "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "created_at"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " ASC LIMIT 50"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    .line 250
    invoke-virtual {v3, v9, v10}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 252
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 254
    .local v0, "arr":Lorg/json/JSONArray;
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v9

    if-nez v9, :cond_3

    .line 266
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-lez v9, :cond_0

    .line 267
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 279
    :cond_0
    iget-object v9, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v9}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 280
    if-eqz v1, :cond_1

    .line 281
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 285
    .end local v0    # "arr":Lorg/json/JSONArray;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_1
    :goto_1
    if-eqz v6, :cond_2

    if-eqz v2, :cond_2

    .line 286
    const/4 v9, 0x2

    new-array v7, v9, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v6, v7, v9

    const/4 v9, 0x1

    aput-object v2, v7, v9

    .line 289
    :cond_2
    return-object v7

    .line 255
    .restart local v0    # "arr":Lorg/json/JSONArray;
    .restart local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :cond_3
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->isLast()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 256
    const-string v9, "_id"

    invoke-interface {v1, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v1, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v6

    .line 259
    :cond_4
    :try_start_2
    new-instance v5, Lorg/json/JSONObject;

    const-string v9, "data"

    invoke-interface {v1, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v1, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v5, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 260
    .local v5, "j":Lorg/json/JSONObject;
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 261
    .end local v5    # "j":Lorg/json/JSONObject;
    :catch_0
    move-exception v9

    goto :goto_0

    .line 269
    .end local v0    # "arr":Lorg/json/JSONArray;
    .end local v3    # "db":Landroid/database/sqlite/SQLiteDatabase;
    :catch_1
    move-exception v4

    .line 270
    .local v4, "e":Landroid/database/sqlite/SQLiteException;
    :try_start_3
    const-string v9, "MixpanelAPI.Database"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Could not pull records for Mixpanel out of database "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ". Waiting to send."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 276
    const/4 v6, 0x0

    .line 277
    const/4 v2, 0x0

    .line 279
    iget-object v9, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v9}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 280
    if-eqz v1, :cond_1

    .line 281
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 278
    .end local v4    # "e":Landroid/database/sqlite/SQLiteException;
    :catchall_0
    move-exception v9

    .line 279
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->mDb:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;

    invoke-virtual {v10}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$MPDatabaseHelper;->close()V

    .line 280
    if-eqz v1, :cond_5

    .line 281
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 283
    :cond_5
    throw v9
.end method
