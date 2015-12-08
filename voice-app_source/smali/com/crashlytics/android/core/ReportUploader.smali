.class Lcom/crashlytics/android/core/ReportUploader;
.super Ljava/lang/Object;
.source "ReportUploader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/crashlytics/android/core/ReportUploader$Worker;
    }
.end annotation


# static fields
.field private static final CLS_FILE_EXT:Ljava/lang/String; = ".cls"

.field static final HEADER_INVALID_CLS_FILE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final RETRY_INTERVALS:[S

.field private static final crashFileFilter:Ljava/io/FilenameFilter;


# instance fields
.field private final createReportCall:Lcom/crashlytics/android/core/CreateReportSpiCall;

.field private final fileAccessLock:Ljava/lang/Object;

.field private uploadThread:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lcom/crashlytics/android/core/ReportUploader$1;

    invoke-direct {v0}, Lcom/crashlytics/android/core/ReportUploader$1;-><init>()V

    sput-object v0, Lcom/crashlytics/android/core/ReportUploader;->crashFileFilter:Ljava/io/FilenameFilter;

    .line 32
    const-string v0, "X-CRASHLYTICS-INVALID-SESSION"

    const-string v1, "1"

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/core/ReportUploader;->HEADER_INVALID_CLS_FILE:Ljava/util/Map;

    .line 35
    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/crashlytics/android/core/ReportUploader;->RETRY_INTERVALS:[S

    return-void

    :array_0
    .array-data 2
        0xas
        0x14s
        0x1es
        0x3cs
        0x78s
        0x12cs
    .end array-data
.end method

.method public constructor <init>(Lcom/crashlytics/android/core/CreateReportSpiCall;)V
    .locals 2
    .param p1, "createReportCall"    # Lcom/crashlytics/android/core/CreateReportSpiCall;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/core/ReportUploader;->fileAccessLock:Ljava/lang/Object;

    .line 43
    if-nez p1, :cond_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "createReportCall must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    iput-object p1, p0, Lcom/crashlytics/android/core/ReportUploader;->createReportCall:Lcom/crashlytics/android/core/CreateReportSpiCall;

    .line 47
    return-void
.end method

.method static synthetic access$002(Lcom/crashlytics/android/core/ReportUploader;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0
    .param p0, "x0"    # Lcom/crashlytics/android/core/ReportUploader;
    .param p1, "x1"    # Ljava/lang/Thread;

    .prologue
    .line 23
    iput-object p1, p0, Lcom/crashlytics/android/core/ReportUploader;->uploadThread:Ljava/lang/Thread;

    return-object p1
.end method

.method static synthetic access$100()[S
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/crashlytics/android/core/ReportUploader;->RETRY_INTERVALS:[S

    return-object v0
.end method


# virtual methods
.method findReports()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/crashlytics/android/core/Report;",
            ">;"
        }
    .end annotation

    .prologue
    .line 101
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "CrashlyticsCore"

    const-string v8, "Checking for crash reports..."

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v7, p0, Lcom/crashlytics/android/core/ReportUploader;->fileAccessLock:Ljava/lang/Object;

    monitor-enter v7

    .line 105
    :try_start_0
    invoke-static {}, Lcom/crashlytics/android/core/CrashlyticsCore;->getInstance()Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v6

    invoke-virtual {v6}, Lcom/crashlytics/android/core/CrashlyticsCore;->getSdkDirectory()Ljava/io/File;

    move-result-object v6

    sget-object v8, Lcom/crashlytics/android/core/ReportUploader;->crashFileFilter:Ljava/io/FilenameFilter;

    invoke-virtual {v6, v8}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 106
    .local v1, "clsFiles":[Ljava/io/File;
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 109
    .local v5, "reports":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/Report;>;"
    move-object v0, v1

    .local v0, "arr$":[Ljava/io/File;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_0

    aget-object v2, v0, v3

    .line 110
    .local v2, "file":Ljava/io/File;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "CrashlyticsCore"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Found crash report "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    new-instance v6, Lcom/crashlytics/android/core/SessionReport;

    invoke-direct {v6, v2}, Lcom/crashlytics/android/core/SessionReport;-><init>(Ljava/io/File;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 106
    .end local v0    # "arr$":[Ljava/io/File;
    .end local v1    # "clsFiles":[Ljava/io/File;
    .end local v2    # "file":Ljava/io/File;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .end local v5    # "reports":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/Report;>;"
    :catchall_0
    move-exception v6

    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v6

    .line 114
    .restart local v0    # "arr$":[Ljava/io/File;
    .restart local v1    # "clsFiles":[Ljava/io/File;
    .restart local v3    # "i$":I
    .restart local v4    # "len$":I
    .restart local v5    # "reports":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/Report;>;"
    :cond_0
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 115
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "CrashlyticsCore"

    const-string v8, "No reports found."

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_1
    return-object v5
.end method

.method forceUpload(Lcom/crashlytics/android/core/Report;)Z
    .locals 10
    .param p1, "report"    # Lcom/crashlytics/android/core/Report;

    .prologue
    .line 74
    const/4 v2, 0x0

    .line 75
    .local v2, "removed":Z
    iget-object v6, p0, Lcom/crashlytics/android/core/ReportUploader;->fileAccessLock:Ljava/lang/Object;

    monitor-enter v6

    .line 77
    :try_start_0
    invoke-static {}, Lcom/crashlytics/android/core/CrashlyticsCore;->getInstance()Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v5

    invoke-virtual {v5}, Lcom/crashlytics/android/core/CrashlyticsCore;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 79
    .local v0, "context":Landroid/content/Context;
    new-instance v3, Lcom/crashlytics/android/core/CreateReportRequest;

    new-instance v5, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v5}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    invoke-virtual {v5, v0}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, p1}, Lcom/crashlytics/android/core/CreateReportRequest;-><init>(Ljava/lang/String;Lcom/crashlytics/android/core/Report;)V

    .line 81
    .local v3, "requestData":Lcom/crashlytics/android/core/CreateReportRequest;
    iget-object v5, p0, Lcom/crashlytics/android/core/ReportUploader;->createReportCall:Lcom/crashlytics/android/core/CreateReportSpiCall;

    invoke-interface {v5, v3}, Lcom/crashlytics/android/core/CreateReportSpiCall;->invoke(Lcom/crashlytics/android/core/CreateReportRequest;)Z

    move-result v4

    .line 83
    .local v4, "sent":Z
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "CrashlyticsCore"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Crashlytics report upload "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    if-eqz v4, :cond_1

    const-string v5, "complete: "

    :goto_0
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {p1}, Lcom/crashlytics/android/core/Report;->getFileName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v8, v5}, Lio/fabric/sdk/android/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    if-eqz v4, :cond_0

    .line 87
    invoke-interface {p1}, Lcom/crashlytics/android/core/Report;->remove()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    const/4 v2, 0x1

    .line 96
    .end local v0    # "context":Landroid/content/Context;
    .end local v3    # "requestData":Lcom/crashlytics/android/core/CreateReportRequest;
    .end local v4    # "sent":Z
    :cond_0
    :goto_1
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    return v2

    .line 83
    .restart local v0    # "context":Landroid/content/Context;
    .restart local v3    # "requestData":Lcom/crashlytics/android/core/CreateReportRequest;
    .restart local v4    # "sent":Z
    :cond_1
    :try_start_2
    const-string v5, "FAILED: "
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 90
    .end local v0    # "context":Landroid/content/Context;
    .end local v3    # "requestData":Lcom/crashlytics/android/core/CreateReportRequest;
    .end local v4    # "sent":Z
    :catch_0
    move-exception v1

    .line 93
    .local v1, "e":Ljava/lang/Exception;
    :try_start_3
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v5

    const-string v7, "CrashlyticsCore"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Error occurred sending report "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v7, v8, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 96
    .end local v1    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v5

    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v5
.end method

.method isUploading()Z
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/crashlytics/android/core/ReportUploader;->uploadThread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public uploadReports()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/core/ReportUploader;->uploadReports(F)V

    .line 51
    return-void
.end method

.method public declared-synchronized uploadReports(F)V
    .locals 3
    .param p1, "delay"    # F

    .prologue
    .line 54
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/core/ReportUploader;->uploadThread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/crashlytics/android/core/ReportUploader$Worker;

    invoke-direct {v1, p0, p1}, Lcom/crashlytics/android/core/ReportUploader$Worker;-><init>(Lcom/crashlytics/android/core/ReportUploader;F)V

    const-string v2, "Crashlytics Report Uploader"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/crashlytics/android/core/ReportUploader;->uploadThread:Ljava/lang/Thread;

    .line 56
    iget-object v0, p0, Lcom/crashlytics/android/core/ReportUploader;->uploadThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    :cond_0
    monitor-exit p0

    return-void

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
