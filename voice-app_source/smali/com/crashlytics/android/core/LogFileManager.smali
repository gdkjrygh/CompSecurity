.class Lcom/crashlytics/android/core/LogFileManager;
.super Ljava/lang/Object;
.source "LogFileManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/crashlytics/android/core/LogFileManager$1;,
        Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;
    }
.end annotation


# static fields
.field private static final DIRECTORY_NAME:Ljava/lang/String; = "log-files"

.field private static final LOGFILE_EXT:Ljava/lang/String; = ".temp"

.field private static final LOGFILE_PREFIX:Ljava/lang/String; = "crashlytics-userlog-"

.field static final MAX_LOG_SIZE:I = 0x10000

.field private static final NOOP_LOG_STORE:Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;


# instance fields
.field private final context:Landroid/content/Context;

.field private currentLog:Lcom/crashlytics/android/core/FileLogStore;

.field private final logFileDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 20
    new-instance v0, Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;-><init>(Lcom/crashlytics/android/core/LogFileManager$1;)V

    sput-object v0, Lcom/crashlytics/android/core/LogFileManager;->NOOP_LOG_STORE:Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "filesDir"    # Ljava/io/File;

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/crashlytics/android/core/LogFileManager;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "filesDir"    # Ljava/io/File;
    .param p3, "currentSessionId"    # Ljava/lang/String;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/crashlytics/android/core/LogFileManager;->context:Landroid/content/Context;

    .line 35
    new-instance v0, Ljava/io/File;

    const-string v1, "log-files"

    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->logFileDir:Ljava/io/File;

    .line 36
    sget-object v0, Lcom/crashlytics/android/core/LogFileManager;->NOOP_LOG_STORE:Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;

    iput-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    .line 37
    invoke-virtual {p0, p3}, Lcom/crashlytics/android/core/LogFileManager;->setCurrentSession(Ljava/lang/String;)V

    .line 38
    return-void
.end method

.method private ensureTargetDirectoryExists()V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->logFileDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->logFileDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 123
    :cond_0
    return-void
.end method

.method private getSessionIdForFile(Ljava/io/File;)Ljava/lang/String;
    .locals 3
    .param p1, "workingFile"    # Ljava/io/File;

    .prologue
    .line 111
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 112
    .local v0, "filename":Ljava/lang/String;
    const-string v2, ".temp"

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 113
    .local v1, "indexOfExtension":I
    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 116
    .end local v0    # "filename":Ljava/lang/String;
    :goto_0
    return-object v0

    .restart local v0    # "filename":Ljava/lang/String;
    :cond_0
    const-string v2, "crashlytics-userlog-"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private getWorkingFileForSession(Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p1, "sessionId"    # Ljava/lang/String;

    .prologue
    .line 105
    invoke-direct {p0}, Lcom/crashlytics/android/core/LogFileManager;->ensureTargetDirectoryExists()V

    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "crashlytics-userlog-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".temp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 107
    .local v0, "fileName":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/crashlytics/android/core/LogFileManager;->logFileDir:Ljava/io/File;

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method private isLoggingEnabled()Z
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->context:Landroid/content/Context;

    const-string v1, "com.crashlytics.CollectCustomLogs"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public clearLog()V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    invoke-interface {v0}, Lcom/crashlytics/android/core/FileLogStore;->deleteLogFile()V

    .line 80
    return-void
.end method

.method public discardOldLogFiles(Ljava/util/Set;)V
    .locals 6
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
    .line 87
    .local p1, "sessionIdsToKeep":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v5, p0, Lcom/crashlytics/android/core/LogFileManager;->logFileDir:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 88
    .local v4, "logFiles":[Ljava/io/File;
    if-eqz v4, :cond_1

    .line 89
    move-object v0, v4

    .local v0, "arr$":[Ljava/io/File;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v1, v0, v2

    .line 90
    .local v1, "file":Ljava/io/File;
    invoke-direct {p0, v1}, Lcom/crashlytics/android/core/LogFileManager;->getSessionIdForFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 91
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 89
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 95
    .end local v0    # "arr$":[Ljava/io/File;
    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    :cond_1
    return-void
.end method

.method public getByteStringForLog()Lcom/crashlytics/android/core/ByteString;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    invoke-interface {v0}, Lcom/crashlytics/android/core/FileLogStore;->getLogAsByteString()Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public final setCurrentSession(Ljava/lang/String;)V
    .locals 3
    .param p1, "sessionId"    # Ljava/lang/String;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    invoke-interface {v0}, Lcom/crashlytics/android/core/FileLogStore;->closeLogFile()V

    .line 46
    sget-object v0, Lcom/crashlytics/android/core/LogFileManager;->NOOP_LOG_STORE:Lcom/crashlytics/android/core/LogFileManager$NoopLogStore;

    iput-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    .line 48
    if-nez p1, :cond_0

    .line 59
    :goto_0
    return-void

    .line 52
    :cond_0
    invoke-direct {p0}, Lcom/crashlytics/android/core/LogFileManager;->isLoggingEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 53
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "CrashlyticsCore"

    const-string v2, "Preferences requested no custom logs. Aborting log file creation."

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 58
    :cond_1
    invoke-direct {p0, p1}, Lcom/crashlytics/android/core/LogFileManager;->getWorkingFileForSession(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/core/LogFileManager;->setLogFile(Ljava/io/File;I)V

    goto :goto_0
.end method

.method setLogFile(Ljava/io/File;I)V
    .locals 1
    .param p1, "workingFile"    # Ljava/io/File;
    .param p2, "maxLogSize"    # I

    .prologue
    .line 101
    new-instance v0, Lcom/crashlytics/android/core/QueueFileLogStore;

    invoke-direct {v0, p1, p2}, Lcom/crashlytics/android/core/QueueFileLogStore;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    .line 102
    return-void
.end method

.method public writeToLog(JLjava/lang/String;)V
    .locals 1
    .param p1, "timestamp"    # J
    .param p3, "msg"    # Ljava/lang/String;

    .prologue
    .line 65
    iget-object v0, p0, Lcom/crashlytics/android/core/LogFileManager;->currentLog:Lcom/crashlytics/android/core/FileLogStore;

    invoke-interface {v0, p1, p2, p3}, Lcom/crashlytics/android/core/FileLogStore;->writeToLog(JLjava/lang/String;)V

    .line 66
    return-void
.end method
