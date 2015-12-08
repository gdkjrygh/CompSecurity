.class Lio/fabric/sdk/android/FabricKitsFinder;
.super Ljava/lang/Object;
.source "FabricKitsFinder.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/Map",
        "<",
        "Ljava/lang/String;",
        "Lio/fabric/sdk/android/KitInfo;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final FABRIC_BUILD_TYPE_KEY:Ljava/lang/String; = "fabric-build-type"

.field static final FABRIC_DIR:Ljava/lang/String; = "fabric/"

.field private static final FABRIC_IDENTIFIER_KEY:Ljava/lang/String; = "fabric-identifier"

.field private static final FABRIC_VERSION_KEY:Ljava/lang/String; = "fabric-version"


# instance fields
.field final apkFileName:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "apkFileName"    # Ljava/lang/String;

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lio/fabric/sdk/android/FabricKitsFinder;->apkFileName:Ljava/lang/String;

    .line 45
    return-void
.end method

.method private loadKitInfo(Ljava/util/zip/ZipEntry;Ljava/util/zip/ZipFile;)Lio/fabric/sdk/android/KitInfo;
    .locals 10
    .param p1, "fabricFile"    # Ljava/util/zip/ZipEntry;
    .param p2, "apk"    # Ljava/util/zip/ZipFile;

    .prologue
    .line 82
    const/4 v3, 0x0

    .line 84
    .local v3, "inputStream":Ljava/io/InputStream;
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v3

    .line 85
    new-instance v4, Ljava/util/Properties;

    invoke-direct {v4}, Ljava/util/Properties;-><init>()V

    .line 86
    .local v4, "properties":Ljava/util/Properties;
    invoke-virtual {v4, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 87
    const-string v6, "fabric-identifier"

    invoke-virtual {v4, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 88
    .local v1, "id":Ljava/lang/String;
    const-string v6, "fabric-version"

    invoke-virtual {v4, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 89
    .local v5, "version":Ljava/lang/String;
    const-string v6, "fabric-build-type"

    invoke-virtual {v4, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    .local v0, "buildType":Ljava/lang/String;
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 91
    :cond_0
    new-instance v6, Ljava/lang/IllegalStateException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Invalid format of fabric file,"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .end local v0    # "buildType":Ljava/lang/String;
    .end local v1    # "id":Ljava/lang/String;
    .end local v4    # "properties":Ljava/util/Properties;
    .end local v5    # "version":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 96
    .local v2, "ie":Ljava/io/IOException;
    :try_start_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "Fabric"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Error when parsing fabric properties "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8, v2}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    invoke-static {v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 101
    const/4 v6, 0x0

    .end local v2    # "ie":Ljava/io/IOException;
    :goto_0
    return-object v6

    .line 94
    .restart local v0    # "buildType":Ljava/lang/String;
    .restart local v1    # "id":Ljava/lang/String;
    .restart local v4    # "properties":Ljava/util/Properties;
    .restart local v5    # "version":Ljava/lang/String;
    :cond_1
    :try_start_2
    new-instance v6, Lio/fabric/sdk/android/KitInfo;

    invoke-direct {v6, v1, v5, v0}, Lio/fabric/sdk/android/KitInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    invoke-static {v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .end local v0    # "buildType":Ljava/lang/String;
    .end local v1    # "id":Ljava/lang/String;
    .end local v4    # "properties":Ljava/util/Properties;
    .end local v5    # "version":Ljava/lang/String;
    :catchall_0
    move-exception v6

    invoke-static {v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v6
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 35
    invoke-virtual {p0}, Lio/fabric/sdk/android/FabricKitsFinder;->call()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 49
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 50
    .local v5, "kitInfos":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lio/fabric/sdk/android/KitInfo;>;"
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 51
    .local v6, "startScan":J
    const/4 v1, 0x0

    .line 52
    .local v1, "count":I
    invoke-virtual {p0}, Lio/fabric/sdk/android/FabricKitsFinder;->loadApkFile()Ljava/util/zip/ZipFile;

    move-result-object v0

    .line 53
    .local v0, "apkFile":Ljava/util/zip/ZipFile;
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v2

    .line 54
    .local v2, "entries":Ljava/util/Enumeration;, "Ljava/util/Enumeration<+Ljava/util/zip/ZipEntry;>;"
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/zip/ZipEntry;

    .line 57
    .local v3, "entry":Ljava/util/zip/ZipEntry;
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "fabric/"

    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 58
    invoke-direct {p0, v3, v0}, Lio/fabric/sdk/android/FabricKitsFinder;->loadKitInfo(Ljava/util/zip/ZipEntry;Ljava/util/zip/ZipFile;)Lio/fabric/sdk/android/KitInfo;

    move-result-object v4

    .line 59
    .local v4, "kitInfo":Lio/fabric/sdk/android/KitInfo;
    if-eqz v4, :cond_0

    .line 60
    invoke-virtual {v4}, Lio/fabric/sdk/android/KitInfo;->getIdentifier()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v8

    const-string v9, "Fabric"

    const-string v10, "Found kit:[%s] version:[%s]"

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    invoke-virtual {v4}, Lio/fabric/sdk/android/KitInfo;->getIdentifier()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v11, v12

    const/4 v12, 0x1

    invoke-virtual {v4}, Lio/fabric/sdk/android/KitInfo;->getVersion()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Lio/fabric/sdk/android/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 70
    .end local v3    # "entry":Ljava/util/zip/ZipEntry;
    .end local v4    # "kitInfo":Lio/fabric/sdk/android/KitInfo;
    :cond_1
    if-eqz v0, :cond_2

    .line 71
    :try_start_0
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :cond_2
    :goto_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v8

    const-string v9, "Fabric"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "finish scanning in "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    sub-long/2addr v12, v6

    invoke-virtual {v10, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " reading:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Lio/fabric/sdk/android/Logger;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    return-object v5

    .line 73
    :catch_0
    move-exception v8

    goto :goto_1
.end method

.method protected loadApkFile()Ljava/util/zip/ZipFile;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 105
    new-instance v0, Ljava/util/zip/ZipFile;

    iget-object v1, p0, Lio/fabric/sdk/android/FabricKitsFinder;->apkFileName:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
