.class Lcom/urbanairship/PreferencesDataManager;
.super Lcom/urbanairship/util/DataManager;
.source "PreferencesDataManager.java"


# static fields
.field static final COLUMN_NAME_KEY:Ljava/lang/String; = "_id"

.field static final COLUMN_NAME_VALUE:Ljava/lang/String; = "value"

.field static final DATABASE_NAME:Ljava/lang/String; = "ua_preferences.db"

.field static final DATABASE_VERSION:I = 0x1

.field static final TABLE_NAME:Ljava/lang/String; = "preferences"

.field protected static final WHERE_CLAUSE_KEY:Ljava/lang/String; = "_id = ?"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 26
    const-string v0, "ua_preferences.db"

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/urbanairship/util/DataManager;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 27
    return-void
.end method


# virtual methods
.method protected bindValuesToSqlLiteStatment(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V
    .locals 2
    .param p1, "statement"    # Landroid/database/sqlite/SQLiteStatement;
    .param p2, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 38
    const/4 v0, 0x1

    const-string v1, "_id"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/PreferencesDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 39
    const/4 v0, 0x2

    const-string v1, "value"

    invoke-virtual {p2, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/urbanairship/PreferencesDataManager;->bind(Landroid/database/sqlite/SQLiteStatement;ILjava/lang/String;)V

    .line 40
    return-void
.end method

.method protected getInsertStatement(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/sqlite/SQLiteStatement;
    .locals 4
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 44
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "_id"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "value"

    aput-object v3, v1, v2

    invoke-virtual {p0, p1, v1}, Lcom/urbanairship/PreferencesDataManager;->buildInsertStatement(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    .local v0, "sql":Ljava/lang/String;
    invoke-virtual {p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    return-object v1
.end method

.method protected onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 31
    const-string v0, "CREATE TABLE IF NOT EXISTS preferences (_id TEXT PRIMARY KEY, value TEXT);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 34
    return-void
.end method

.method protected onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 51
    const-string v0, "DROP TABLE IF EXISTS preferences"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, p1}, Lcom/urbanairship/PreferencesDataManager;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 53
    return-void
.end method
