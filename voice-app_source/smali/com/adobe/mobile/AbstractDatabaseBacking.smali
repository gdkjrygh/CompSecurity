.class abstract Lcom/adobe/mobile/AbstractDatabaseBacking;
.super Ljava/lang/Object;
.source "AbstractDatabaseBacking.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    }
.end annotation


# instance fields
.field private _dbFile:Ljava/io/File;

.field protected database:Landroid/database/sqlite/SQLiteDatabase;

.field protected final dbMutex:Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->dbMutex:Ljava/lang/Object;

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->_dbFile:Ljava/io/File;

    .line 80
    return-void
.end method

.method private createDatabase()V
    .locals 6

    .prologue
    .line 33
    const v0, 0x10000010

    .line 37
    .local v0, "flags":I
    :try_start_0
    iget-object v2, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->_dbFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->database:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :goto_0
    return-void

    .line 38
    :catch_0
    move-exception v1

    .line 39
    .local v1, "x":Landroid/database/SQLException;
    const-string v2, "Analytics - Unable to open database(%s)."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v1}, Landroid/database/SQLException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method protected initDatabaseBacking(Ljava/io/File;)V
    .locals 2
    .param p1, "databaseFile"    # Ljava/io/File;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->_dbFile:Ljava/io/File;

    .line 17
    iget-object v1, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->dbMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 18
    :try_start_0
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->preMigrate()V

    .line 20
    invoke-direct {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->createDatabase()V

    .line 22
    iget-object v0, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->postMigrate()V

    .line 24
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->initializeDatabase()V

    .line 25
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->prepareStatements()V

    .line 27
    :cond_0
    monitor-exit v1

    .line 28
    return-void

    .line 27
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected abstract initializeDatabase()V
.end method

.method protected postMigrate()V
    .locals 0

    .prologue
    .line 77
    return-void
.end method

.method protected postReset()V
    .locals 0

    .prologue
    .line 67
    return-void
.end method

.method protected preMigrate()V
    .locals 0

    .prologue
    .line 72
    return-void
.end method

.method protected abstract prepareStatements()V
.end method

.method protected final resetDatabase(Ljava/lang/Exception;)V
    .locals 5
    .param p1, "reason"    # Ljava/lang/Exception;

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 48
    const-string v0, "Analytics - Database in unrecoverable state(%s), resetting."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v1, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->dbMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 52
    :try_start_0
    iget-object v0, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->_dbFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    const-string v0, "Analytics - Database file(%s) was not found."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->_dbFile:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_0
    invoke-direct {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->createDatabase()V

    .line 60
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->initializeDatabase()V

    .line 61
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->prepareStatements()V

    .line 63
    invoke-virtual {p0}, Lcom/adobe/mobile/AbstractDatabaseBacking;->postReset()V

    .line 64
    monitor-exit v1

    .line 65
    return-void

    .line 55
    :cond_0
    const-string v0, "Analytics - Database file(%s) was corrupt and had to be deleted."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/adobe/mobile/AbstractDatabaseBacking;->_dbFile:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
