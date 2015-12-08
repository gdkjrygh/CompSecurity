.class Lcom/adobe/mobile/WearableDataResponse$CacheResponse;
.super Lcom/adobe/mobile/WearableDataResponse;
.source "WearableDataResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/WearableDataResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CacheResponse"
.end annotation


# instance fields
.field final result:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/wearable/DataMap;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 6
    .param p1, "dataMap"    # Lcom/google/android/gms/wearable/DataMap;
    .param p2, "mGoogleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;

    .prologue
    .line 73
    invoke-direct {p0}, Lcom/adobe/mobile/WearableDataResponse;-><init>()V

    .line 74
    const-string v4, "FileFound"

    invoke-virtual {p1, v4}, Lcom/google/android/gms/wearable/DataMap;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 75
    .local v2, "fileFound":Z
    if-nez v2, :cond_1

    .line 76
    const-string v4, "adbdownloadcache"

    invoke-static {v4}, Lcom/adobe/mobile/RemoteDownload;->deleteFilesInDirectory(Ljava/lang/String;)V

    .line 77
    const/4 v4, 0x0

    iput-boolean v4, p0, Lcom/adobe/mobile/WearableDataResponse$CacheResponse;->result:Z

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 80
    :cond_1
    const-string v4, "Updated"

    invoke-virtual {p1, v4}, Lcom/google/android/gms/wearable/DataMap;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, p0, Lcom/adobe/mobile/WearableDataResponse$CacheResponse;->result:Z

    .line 81
    iget-boolean v4, p0, Lcom/adobe/mobile/WearableDataResponse$CacheResponse;->result:Z

    if-eqz v4, :cond_0

    .line 82
    const-string v4, "adbdownloadcache"

    invoke-static {v4}, Lcom/adobe/mobile/RemoteDownload;->deleteFilesInDirectory(Ljava/lang/String;)V

    .line 86
    const-string v4, "FileContent"

    invoke-virtual {p1, v4}, Lcom/google/android/gms/wearable/DataMap;->getAsset(Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;

    move-result-object v0

    .line 87
    .local v0, "asset":Lcom/google/android/gms/wearable/Asset;
    const-string v4, "FileName"

    invoke-virtual {p1, v4}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 88
    .local v3, "fileName":Ljava/lang/String;
    const-string v4, "adbdownloadcache"

    invoke-static {v4}, Lcom/adobe/mobile/RemoteDownload;->getDownloadCacheDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 89
    .local v1, "dir":Ljava/io/File;
    if-eqz v1, :cond_0

    .line 92
    const-string v4, "adbdownloadcache"

    invoke-static {v4}, Lcom/adobe/mobile/RemoteDownload;->deleteFilesInDirectory(Ljava/lang/String;)V

    .line 93
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    # invokes: Lcom/adobe/mobile/WearableDataResponse;->saveFileFromAsset(Lcom/google/android/gms/wearable/Asset;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    invoke-static {v0, v4, p2}, Lcom/adobe/mobile/WearableDataResponse;->access$000(Lcom/google/android/gms/wearable/Asset;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    goto :goto_0
.end method


# virtual methods
.method protected getResult()Z
    .locals 1

    .prologue
    .line 97
    iget-boolean v0, p0, Lcom/adobe/mobile/WearableDataResponse$CacheResponse;->result:Z

    return v0
.end method
