.class abstract Lcom/adobe/mobile/WearableDataRequest;
.super Ljava/lang/Object;
.source "WearableDataRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/WearableDataRequest$Cache;,
        Lcom/adobe/mobile/WearableDataRequest$ShareConfig;,
        Lcom/adobe/mobile/WearableDataRequest$Post;,
        Lcom/adobe/mobile/WearableDataRequest$Get;
    }
.end annotation


# instance fields
.field protected timeOut:I

.field protected uuid:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/WearableDataRequest;->uuid:Ljava/lang/String;

    .line 50
    return-void
.end method

.method protected constructor <init>(I)V
    .locals 0
    .param p1, "timeOut"    # I

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/adobe/mobile/WearableDataRequest;-><init>()V

    .line 54
    iput p1, p0, Lcom/adobe/mobile/WearableDataRequest;->timeOut:I

    .line 55
    return-void
.end method

.method static synthetic access$000(Ljava/io/File;)[B
    .locals 1
    .param p0, "x0"    # Ljava/io/File;

    .prologue
    .line 40
    invoke-static {p0}, Lcom/adobe/mobile/WearableDataRequest;->readFile(Ljava/io/File;)[B

    move-result-object v0

    return-object v0
.end method

.method protected static createFileRequest(Ljava/lang/String;Ljava/lang/String;I)Lcom/adobe/mobile/WearableDataRequest;
    .locals 1
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "fileName"    # Ljava/lang/String;
    .param p2, "timeOut"    # I

    .prologue
    .line 297
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$Cache;

    invoke-direct {v0, p0, p1, p2}, Lcom/adobe/mobile/WearableDataRequest$Cache;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method protected static createGetRequest(Ljava/lang/String;I)Lcom/adobe/mobile/WearableDataRequest;
    .locals 1
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "timeOut"    # I

    .prologue
    .line 285
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$Get;

    invoke-direct {v0, p0, p1}, Lcom/adobe/mobile/WearableDataRequest$Get;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method protected static createPostRequest(Ljava/lang/String;Ljava/lang/String;I)Lcom/adobe/mobile/WearableDataRequest;
    .locals 1
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "body"    # Ljava/lang/String;
    .param p2, "timeOut"    # I

    .prologue
    .line 289
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$Post;

    invoke-direct {v0, p0, p1, p2}, Lcom/adobe/mobile/WearableDataRequest$Post;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method protected static createRequestFromDataMap(Lcom/google/android/gms/wearable/DataMap;)Lcom/adobe/mobile/WearableDataRequest;
    .locals 2
    .param p0, "dataMap"    # Lcom/google/android/gms/wearable/DataMap;

    .prologue
    .line 301
    const-string v0, "Type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$Post;

    invoke-direct {v0, p0}, Lcom/adobe/mobile/WearableDataRequest$Post;-><init>(Lcom/google/android/gms/wearable/DataMap;)V

    .line 313
    :goto_0
    return-object v0

    .line 304
    :cond_0
    const-string v0, "Type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 305
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$Get;

    invoke-direct {v0, p0}, Lcom/adobe/mobile/WearableDataRequest$Get;-><init>(Lcom/google/android/gms/wearable/DataMap;)V

    goto :goto_0

    .line 307
    :cond_1
    const-string v0, "Type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Config"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 308
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$ShareConfig;

    invoke-direct {v0, p0}, Lcom/adobe/mobile/WearableDataRequest$ShareConfig;-><init>(Lcom/google/android/gms/wearable/DataMap;)V

    goto :goto_0

    .line 310
    :cond_2
    const-string v0, "Type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "File"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 311
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$Cache;

    invoke-direct {v0, p0}, Lcom/adobe/mobile/WearableDataRequest$Cache;-><init>(Lcom/google/android/gms/wearable/DataMap;)V

    goto :goto_0

    .line 313
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static createShareConfigRequest(I)Lcom/adobe/mobile/WearableDataRequest;
    .locals 1
    .param p0, "timeOut"    # I

    .prologue
    .line 293
    new-instance v0, Lcom/adobe/mobile/WearableDataRequest$ShareConfig;

    invoke-direct {v0, p0}, Lcom/adobe/mobile/WearableDataRequest$ShareConfig;-><init>(I)V

    return-object v0
.end method

.method private static readFile(Ljava/io/File;)[B
    .locals 9
    .param p0, "file"    # Ljava/io/File;

    .prologue
    const/4 v4, 0x0

    const/4 v8, 0x0

    .line 259
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v6

    long-to-int v5, v6

    new-array v0, v5, [B

    .line 260
    .local v0, "buffer":[B
    const/4 v2, 0x0

    .line 262
    .local v2, "ios":Ljava/io/InputStream;
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    .end local v2    # "ios":Ljava/io/InputStream;
    .local v3, "ios":Ljava/io/InputStream;
    :try_start_1
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    .line 274
    if-eqz v3, :cond_0

    .line 275
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    :goto_0
    move-object v2, v3

    .end local v3    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    move-object v0, v4

    .line 281
    .end local v0    # "buffer":[B
    :goto_1
    return-object v0

    .line 276
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v0    # "buffer":[B
    .restart local v3    # "ios":Ljava/io/InputStream;
    :catch_0
    move-exception v1

    .line 277
    .local v1, "e":Ljava/io/IOException;
    const-string v5, "Wearable - Failed to close the file input stream"

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 274
    .end local v1    # "e":Ljava/io/IOException;
    :cond_1
    if-eqz v3, :cond_2

    .line 275
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_2
    :goto_2
    move-object v2, v3

    .line 281
    .end local v3    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    goto :goto_1

    .line 276
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v3    # "ios":Ljava/io/InputStream;
    :catch_1
    move-exception v1

    .line 277
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v4, "Wearable - Failed to close the file input stream"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 266
    .end local v1    # "e":Ljava/io/IOException;
    .end local v3    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    :catch_2
    move-exception v1

    .line 267
    .restart local v1    # "e":Ljava/io/IOException;
    :goto_3
    :try_start_4
    const-string v5, "Wearable - Failed to read cached file"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 274
    if-eqz v2, :cond_3

    .line 275
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :cond_3
    :goto_4
    move-object v0, v4

    .line 278
    goto :goto_1

    .line 276
    :catch_3
    move-exception v1

    .line 277
    const-string v5, "Wearable - Failed to close the file input stream"

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 269
    .end local v1    # "e":Ljava/io/IOException;
    :catch_4
    move-exception v1

    .line 270
    .local v1, "e":Ljava/lang/Exception;
    :goto_5
    :try_start_6
    const-string v5, "Wearable - Failed to read cached file"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 274
    if-eqz v2, :cond_4

    .line 275
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .end local v1    # "e":Ljava/lang/Exception;
    :cond_4
    :goto_6
    move-object v0, v4

    .line 278
    goto :goto_1

    .line 276
    .restart local v1    # "e":Ljava/lang/Exception;
    :catch_5
    move-exception v1

    .line 277
    .local v1, "e":Ljava/io/IOException;
    const-string v5, "Wearable - Failed to close the file input stream"

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    .line 273
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 274
    :goto_7
    if-eqz v2, :cond_5

    .line 275
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 278
    :cond_5
    :goto_8
    throw v4

    .line 276
    :catch_6
    move-exception v1

    .line 277
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v5, "Wearable - Failed to close the file input stream"

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_8

    .line 273
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v3    # "ios":Ljava/io/InputStream;
    :catchall_1
    move-exception v4

    move-object v2, v3

    .end local v3    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    goto :goto_7

    .line 269
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v3    # "ios":Ljava/io/InputStream;
    :catch_7
    move-exception v1

    move-object v2, v3

    .end local v3    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    goto :goto_5

    .line 266
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v3    # "ios":Ljava/io/InputStream;
    :catch_8
    move-exception v1

    move-object v2, v3

    .end local v3    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    goto :goto_3
.end method


# virtual methods
.method protected abstract getDataMap()Lcom/google/android/gms/wearable/DataMap;
.end method

.method protected getTimeOut()I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/adobe/mobile/WearableDataRequest;->timeOut:I

    return v0
.end method

.method protected getUUID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/adobe/mobile/WearableDataRequest;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract handle(Landroid/content/Context;)Lcom/google/android/gms/wearable/DataMap;
.end method
