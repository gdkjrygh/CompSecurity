.class Lcom/urbanairship/RichPushDataManager;
.super Lcom/urbanairship/util/DataManager;
.source "RichPushDataManager.java"


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "ua_richpush.db"

.field private static final DATABASE_VERSION:I = 0x3

.field public static final TABLE_NAME:Ljava/lang/String; = "richpush"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 24
    const-string v0, "ua_richpush.db"

    const/4 v1, 0x3

    invoke-direct {p0, p1, v0, v1}, Lcom/urbanairship/util/DataManager;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 25
    return-void
.end method


# virtual methods
.method protected bindValuesToSqlLiteStatment(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V
    .locals 4
    .param p1, "statement"    # Landroid/database/sqlite/SQLiteStatement;
    .param p2, "values"    # Landroid/content/ContentValues;

    .prologue
    const/4 v3, 0x1

    .line 47
    const-string v0, "message_id"

    invoke-virtual {p2, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v3, v0}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 48
    const/4 v0, 0x2

    const-string v1, "message_url"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 49
    const/4 v0, 0x3

    const-string v1, "message_body_url"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 50
    const/4 v0, 0x4

    const-string v1, "message_read_url"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 51
    const/4 v0, 0x5

    const-string v1, "title"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 52
    const/4 v0, 0x6

    const-string v1, "extra"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 53
    const/4 v0, 0x7

    const-string v1, "unread"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 54
    const/16 v0, 0x8

    const-string v1, "unread_orig"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 55
    const/16 v0, 0x9

    const-string v1, "deleted"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 56
    const/16 v0, 0xa

    const-string v1, "timestamp"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 57
    const/16 v0, 0xb

    const-string v1, "raw_message_object"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 58
    const/16 v0, 0xc

    const-string v1, "expiration_timestamp"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/RichPushDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 59
    return-void
.end method

.method protected getInsertStatement(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/sqlite/SQLiteStatement;
    .locals 4
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 63
    const/16 v1, 0xc

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "message_id"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "message_url"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "message_body_url"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "message_read_url"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "title"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "extra"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "unread"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string v3, "unread_orig"

    aput-object v3, v1, v2

    const/16 v2, 0x8

    const-string v3, "deleted"

    aput-object v3, v1, v2

    const/16 v2, 0x9

    const-string v3, "timestamp"

    aput-object v3, v1, v2

    const/16 v2, 0xa

    const-string v3, "raw_message_object"

    aput-object v3, v1, v2

    const/16 v2, 0xb

    const-string v3, "expiration_timestamp"

    aput-object v3, v1, v2

    invoke-virtual {p0, p1, v1}, Lcom/urbanairship/RichPushDataManager;->buildInsertStatement(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 69
    .local v0, "sql":Ljava/lang/String;
    invoke-virtual {p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    return-object v1
.end method

.method protected onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 29
    const-string v0, "CREATE TABLE IF NOT EXISTS richpush (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id TEXT UNIQUE, message_url TEXT, message_body_url TEXT, message_read_url TEXT, title TEXT, extra TEXT, unread INTEGER, unread_orig INTEGER, deleted INTEGER, timestamp TEXT, raw_message_object TEXT,expiration_timestamp TEXT);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 43
    return-void
.end method

.method protected onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 88
    const-string v0, "DROP TABLE IF EXISTS richpush"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0, p1}, Lcom/urbanairship/RichPushDataManager;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 90
    return-void
.end method

.method protected onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 74
    packed-switch p2, :pswitch_data_0

    .line 81
    const-string v0, "DROP TABLE IF EXISTS richpush"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 83
    :goto_0
    return-void

    .line 76
    :pswitch_0
    const-string v0, "ALTER TABLE richpush ADD COLUMN raw_message_object TEXT;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 78
    :pswitch_1
    const-string v0, "ALTER TABLE richpush ADD COLUMN expiration_timestamp TEXT;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    .line 74
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
