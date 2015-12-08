.class public Lio/fabric/sdk/android/services/events/QueueFileEventStorage;
.super Ljava/lang/Object;
.source "QueueFileEventStorage.java"

# interfaces
.implements Lio/fabric/sdk/android/services/events/EventsStorage;


# instance fields
.field private final context:Landroid/content/Context;

.field private queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

.field private targetDirectory:Ljava/io/File;

.field private final targetDirectoryName:Ljava/lang/String;

.field private final workingDirectory:Ljava/io/File;

.field private final workingFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "workingDirectory"    # Ljava/io/File;
    .param p3, "workingFileName"    # Ljava/lang/String;
    .param p4, "targetDirectoryName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->context:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingDirectory:Ljava/io/File;

    .line 54
    iput-object p4, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectoryName:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingDirectory:Ljava/io/File;

    invoke-direct {v0, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingFile:Ljava/io/File;

    .line 58
    new-instance v0, Lio/fabric/sdk/android/services/common/QueueFile;

    iget-object v1, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingFile:Ljava/io/File;

    invoke-direct {v0, v1}, Lio/fabric/sdk/android/services/common/QueueFile;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    .line 60
    invoke-direct {p0}, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->createTargetDirectory()V

    .line 61
    return-void
.end method

.method private createTargetDirectory()V
    .locals 3

    .prologue
    .line 64
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingDirectory:Ljava/io/File;

    iget-object v2, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectoryName:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    .line 65
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 68
    :cond_0
    return-void
.end method

.method private move(Ljava/io/File;Ljava/io/File;)V
    .locals 5
    .param p1, "sourceFile"    # Ljava/io/File;
    .param p2, "targetFile"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 100
    const/4 v2, 0x0

    .line 101
    .local v2, "fos":Ljava/io/OutputStream;
    const/4 v0, 0x0

    .line 104
    .local v0, "fis":Ljava/io/FileInputStream;
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .end local v0    # "fis":Ljava/io/FileInputStream;
    .local v1, "fis":Ljava/io/FileInputStream;
    :try_start_1
    invoke-virtual {p0, p2}, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->getMoveOutputStream(Ljava/io/File;)Ljava/io/OutputStream;

    move-result-object v2

    .line 106
    const/16 v3, 0x400

    new-array v3, v3, [B

    invoke-static {v1, v2, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    const-string v3, "Failed to close file input stream"

    invoke-static {v1, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 109
    const-string v3, "Failed to close output stream"

    invoke-static {v2, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 110
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 112
    return-void

    .line 108
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v0    # "fis":Ljava/io/FileInputStream;
    :catchall_0
    move-exception v3

    :goto_0
    const-string v4, "Failed to close file input stream"

    invoke-static {v0, v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 109
    const-string v4, "Failed to close output stream"

    invoke-static {v2, v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 110
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw v3

    .line 108
    .end local v0    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    :catchall_1
    move-exception v3

    move-object v0, v1

    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v0    # "fis":Ljava/io/FileInputStream;
    goto :goto_0
.end method


# virtual methods
.method public add([B)V
    .locals 1
    .param p1, "data"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-virtual {v0, p1}, Lio/fabric/sdk/android/services/common/QueueFile;->add([B)V

    .line 73
    return-void
.end method

.method public canWorkingFileStore(II)Z
    .locals 1
    .param p1, "newEventSizeInBytes"    # I
    .param p2, "maxByteSizePerFile"    # I

    .prologue
    .line 176
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-virtual {v0, p1, p2}, Lio/fabric/sdk/android/services/common/QueueFile;->hasSpaceFor(II)Z

    move-result v0

    return v0
.end method

.method public deleteFilesInRollOverDirectory(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 148
    .local p1, "files":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 149
    .local v0, "file":Ljava/io/File;
    iget-object v2, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->context:Landroid/content/Context;

    const-string v3, "deleting sent analytics file %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 151
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 153
    .end local v0    # "file":Ljava/io/File;
    :cond_0
    return-void
.end method

.method public deleteWorkingFile()V
    .locals 1

    .prologue
    .line 163
    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/QueueFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :goto_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 167
    return-void

    .line 164
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getAllFilesInRollOverDirectory()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 157
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBatchOfFilesToSend(I)Ljava/util/List;
    .locals 6
    .param p1, "maxBatchSize"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .local v1, "batch":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    iget-object v5, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .local v0, "arr$":[Ljava/io/File;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_0

    aget-object v2, v0, v3

    .line 138
    .local v2, "file":Ljava/io/File;
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lt v5, p1, :cond_1

    .line 143
    .end local v2    # "file":Ljava/io/File;
    :cond_0
    return-object v1

    .line 137
    .restart local v2    # "file":Ljava/io/File;
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public getMoveOutputStream(Ljava/io/File;)Ljava/io/OutputStream;
    .locals 1
    .param p1, "targetFile"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 120
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public getRollOverDirectory()Ljava/io/File;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    return-object v0
.end method

.method public getWorkingDirectory()Ljava/io/File;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingDirectory:Ljava/io/File;

    return-object v0
.end method

.method public getWorkingFileUsedSizeInBytes()I
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/QueueFile;->usedBytes()I

    move-result v0

    return v0
.end method

.method public isWorkingFileEmpty()Z
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/QueueFile;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public rollOver(Ljava/lang/String;)V
    .locals 3
    .param p1, "targetName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 82
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/QueueFile;->close()V

    .line 84
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingFile:Ljava/io/File;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->targetDirectory:Ljava/io/File;

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->move(Ljava/io/File;Ljava/io/File;)V

    .line 86
    new-instance v0, Lio/fabric/sdk/android/services/common/QueueFile;

    iget-object v1, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->workingFile:Ljava/io/File;

    invoke-direct {v0, v1}, Lio/fabric/sdk/android/services/common/QueueFile;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;->queueFile:Lio/fabric/sdk/android/services/common/QueueFile;

    .line 87
    return-void
.end method
