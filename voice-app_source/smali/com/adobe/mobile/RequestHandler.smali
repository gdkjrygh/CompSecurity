.class final Lcom/adobe/mobile/RequestHandler;
.super Ljava/lang/Object;
.source "RequestHandler.java"


# static fields
.field private static final BUF_SIZE:I = 0x400

.field private static final CONNECTION_TIMEOUT:I = 0x7d0

.field private static final _hostnameVerifierMutex:Ljava/lang/Object;

.field private static _strictHostnameVerifier:Lorg/apache/http/conn/ssl/StrictHostnameVerifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 210
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/RequestHandler;->_hostnameVerifierMutex:Ljava/lang/Object;

    .line 211
    const/4 v0, 0x0

    sput-object v0, Lcom/adobe/mobile/RequestHandler;->_strictHostnameVerifier:Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static requestConnect(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 7
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 215
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 217
    .local v1, "requestURL":Ljava/net/URL;
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    const-string v4, "https"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 219
    sget-object v4, Lcom/adobe/mobile/RequestHandler;->_hostnameVerifierMutex:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    :try_start_1
    sget-object v3, Lcom/adobe/mobile/RequestHandler;->_strictHostnameVerifier:Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    if-nez v3, :cond_0

    .line 221
    new-instance v3, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-direct {v3}, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;-><init>()V

    sput-object v3, Lcom/adobe/mobile/RequestHandler;->_strictHostnameVerifier:Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    .line 223
    :cond_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    :try_start_2
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 226
    .local v2, "secureConnection":Ljavax/net/ssl/HttpsURLConnection;
    sget-object v3, Lcom/adobe/mobile/RequestHandler;->_strictHostnameVerifier:Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-virtual {v2, v3}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 235
    .end local v1    # "requestURL":Ljava/net/URL;
    .end local v2    # "secureConnection":Ljavax/net/ssl/HttpsURLConnection;
    :goto_0
    return-object v2

    .line 223
    .restart local v1    # "requestURL":Ljava/net/URL;
    :catchall_0
    move-exception v3

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 231
    .end local v1    # "requestURL":Ljava/net/URL;
    :catch_0
    move-exception v0

    .line 232
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "Adobe Mobile - Exception opening URL(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const/4 v2, 0x0

    goto :goto_0

    .line 229
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v1    # "requestURL":Ljava/net/URL;
    :cond_1
    :try_start_5
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-object v2, v3

    goto :goto_0
.end method

.method protected static retrieveData(Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)[B
    .locals 12
    .param p0, "url"    # Ljava/lang/String;
    .param p2, "readTimeout"    # I
    .param p3, "source"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")[B"
        }
    .end annotation

    .prologue
    .line 37
    .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 38
    invoke-static {p0, p1, p2, p3}, Lcom/adobe/mobile/WearableFunctionBridge;->retrieveData(Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)[B

    move-result-object v7

    .line 98
    :cond_0
    :goto_0
    return-object v7

    .line 41
    :cond_1
    const/4 v2, 0x0

    .line 42
    .local v2, "connection":Ljava/net/HttpURLConnection;
    const/4 v6, 0x0

    .line 46
    .local v6, "inStream":Ljava/io/InputStream;
    :try_start_0
    invoke-static {p0}, Lcom/adobe/mobile/RequestHandler;->requestConnect(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v2

    .line 47
    const/16 v7, 0x7d0

    invoke-virtual {v2, v7}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 48
    invoke-virtual {v2, p2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 51
    if-eqz p1, :cond_3

    .line 52
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 53
    .local v3, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 75
    .end local v3    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_0
    move-exception v5

    .line 76
    .local v5, "ex":Ljava/io/IOException;
    :try_start_1
    const-string v7, "%s - IOException while sending request (%s)"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object p3, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    const/4 v7, 0x0

    .line 85
    if-eqz v2, :cond_2

    .line 86
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    :cond_2
    if-eqz v6, :cond_0

    .line 91
    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 92
    :catch_1
    move-exception v5

    .line 93
    const-string v8, "%s - Unable to close stream (%s)"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p3, v9, v10

    const/4 v10, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 57
    .end local v5    # "ex":Ljava/io/IOException;
    :cond_3
    :try_start_3
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    const/16 v8, 0xc8

    if-ne v7, v8, :cond_7

    .line 58
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    .line 60
    const/16 v7, 0x400

    new-array v1, v7, [B

    .line 62
    .local v1, "buffer":[B
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 65
    .local v0, "baos":Ljava/io/ByteArrayOutputStream;
    :goto_2
    invoke-virtual {v6, v1}, Ljava/io/InputStream;->read([B)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_5

    .line 66
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 78
    .end local v0    # "baos":Ljava/io/ByteArrayOutputStream;
    .end local v1    # "buffer":[B
    :catch_2
    move-exception v5

    .line 79
    .local v5, "ex":Ljava/lang/Exception;
    :try_start_4
    const-string v7, "%s - Exception while sending request (%s)"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object p3, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v5}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 80
    const/4 v7, 0x0

    .line 85
    if-eqz v2, :cond_4

    .line 86
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    :cond_4
    if-eqz v6, :cond_0

    .line 91
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto/16 :goto_0

    .line 92
    :catch_3
    move-exception v5

    .line 93
    .local v5, "ex":Ljava/io/IOException;
    const-string v8, "%s - Unable to close stream (%s)"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p3, v9, v10

    const/4 v10, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 70
    .end local v5    # "ex":Ljava/io/IOException;
    .restart local v0    # "baos":Ljava/io/ByteArrayOutputStream;
    .restart local v1    # "buffer":[B
    :cond_5
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 73
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v7

    .line 85
    if-eqz v2, :cond_6

    .line 86
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    :cond_6
    if-eqz v6, :cond_0

    .line 91
    :try_start_7
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto/16 :goto_0

    .line 92
    :catch_4
    move-exception v5

    .line 93
    .restart local v5    # "ex":Ljava/io/IOException;
    const-string v8, "%s - Unable to close stream (%s)"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p3, v9, v10

    const/4 v10, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 85
    .end local v0    # "baos":Ljava/io/ByteArrayOutputStream;
    .end local v1    # "buffer":[B
    .end local v5    # "ex":Ljava/io/IOException;
    :cond_7
    if-eqz v2, :cond_8

    .line 86
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    :cond_8
    if-eqz v6, :cond_9

    .line 91
    :try_start_8
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 98
    :cond_9
    :goto_3
    const/4 v7, 0x0

    goto/16 :goto_0

    .line 92
    :catch_5
    move-exception v5

    .line 93
    .restart local v5    # "ex":Ljava/io/IOException;
    const-string v7, "%s - Unable to close stream (%s)"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object p3, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 81
    .end local v5    # "ex":Ljava/io/IOException;
    :catch_6
    move-exception v4

    .line 82
    .local v4, "er":Ljava/lang/Error;
    :try_start_9
    const-string v7, "%s - Unexpected error while sending request (%s)"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object p3, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v4}, Ljava/lang/Error;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 83
    const/4 v7, 0x0

    .line 85
    if-eqz v2, :cond_a

    .line 86
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    :cond_a
    if-eqz v6, :cond_0

    .line 91
    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    goto/16 :goto_0

    .line 92
    :catch_7
    move-exception v5

    .line 93
    .restart local v5    # "ex":Ljava/io/IOException;
    const-string v8, "%s - Unable to close stream (%s)"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p3, v9, v10

    const/4 v10, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 85
    .end local v4    # "er":Ljava/lang/Error;
    .end local v5    # "ex":Ljava/io/IOException;
    :catchall_0
    move-exception v7

    if-eqz v2, :cond_b

    .line 86
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 89
    :cond_b
    if-eqz v6, :cond_c

    .line 91
    :try_start_b
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    .line 94
    :cond_c
    :goto_4
    throw v7

    .line 92
    :catch_8
    move-exception v5

    .line 93
    .restart local v5    # "ex":Ljava/io/IOException;
    const-string v8, "%s - Unable to close stream (%s)"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p3, v9, v10

    const/4 v10, 0x1

    invoke-virtual {v5}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4
.end method

.method protected static sendAnalyticsRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Z
    .locals 12
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "postBody"    # Ljava/lang/String;
    .param p3, "timeout"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)Z"
        }
    .end annotation

    .prologue
    .local p2, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 151
    if-nez p0, :cond_0

    move v7, v9

    .line 206
    :goto_0
    return v7

    .line 154
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 155
    invoke-static {p0, p1, p2, p3}, Lcom/adobe/mobile/WearableFunctionBridge;->sendAnalyticsRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Z

    move-result v7

    goto :goto_0

    .line 159
    :cond_1
    invoke-static {p0}, Lcom/adobe/mobile/RequestHandler;->requestConnect(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v1

    .line 161
    .local v1, "connection":Ljava/net/HttpURLConnection;
    if-nez v1, :cond_2

    move v7, v9

    .line 162
    goto :goto_0

    .line 167
    :cond_2
    :try_start_0
    invoke-virtual {v1, p3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 168
    invoke-virtual {v1, p3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 169
    const-string v7, "POST"

    invoke-virtual {v1, v7}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 171
    const-string v7, "UTF-8"

    invoke-virtual {p1, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 172
    .local v5, "outputBytes":[B
    array-length v7, v5

    invoke-virtual {v1, v7}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 173
    const-string v7, "Content-Type"

    const-string v8, "application/x-www-form-urlencoded"

    invoke-virtual {v1, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    if-eqz p2, :cond_3

    .line 177
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 178
    .local v3, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_1

    .line 194
    .end local v3    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v5    # "outputBytes":[B
    :catch_0
    move-exception v2

    .line 195
    .local v2, "e":Ljava/net/SocketTimeoutException;
    const-string v7, "Analytics - Timed out sending request(%s)"

    new-array v8, v10, [Ljava/lang/Object;

    aput-object p1, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move v7, v9

    .line 196
    goto :goto_0

    .line 183
    .end local v2    # "e":Ljava/net/SocketTimeoutException;
    .restart local v5    # "outputBytes":[B
    :cond_3
    :try_start_1
    new-instance v6, Ljava/io/BufferedOutputStream;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 184
    .local v6, "postBodyStream":Ljava/io/OutputStream;
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write([B)V

    .line 185
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 188
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 189
    .local v4, "inputStream":Ljava/io/InputStream;
    const/16 v7, 0xa

    new-array v0, v7, [B

    .line 190
    .local v0, "b":[B
    :cond_4
    invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-gtz v7, :cond_4

    .line 191
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 193
    const-string v7, "Analytics - Request Sent(%s)"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object p1, v8, v11

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .end local v0    # "b":[B
    .end local v4    # "inputStream":Ljava/io/InputStream;
    .end local v5    # "outputBytes":[B
    .end local v6    # "postBodyStream":Ljava/io/OutputStream;
    :goto_2
    move v7, v10

    .line 206
    goto/16 :goto_0

    .line 197
    :catch_1
    move-exception v2

    .line 198
    .local v2, "e":Ljava/io/IOException;
    const-string v7, "Analytics - IOException while sending request, may retry(%s)"

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move v7, v9

    .line 199
    goto/16 :goto_0

    .line 200
    .end local v2    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v2

    .line 201
    .local v2, "e":Ljava/lang/Exception;
    const-string v7, "Analytics - Exception while attempting to send hit, will not retry(%s)"

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 202
    .end local v2    # "e":Ljava/lang/Exception;
    :catch_3
    move-exception v2

    .line 203
    .local v2, "e":Ljava/lang/Error;
    const-string v7, "Analytics - Exception while attempting to send hit, will not retry(%s)"

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Error;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method protected static sendGenericRequest(Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)V
    .locals 11
    .param p0, "url"    # Ljava/lang/String;
    .param p2, "timeout"    # I
    .param p3, "source"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 103
    if-nez p0, :cond_1

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 107
    :cond_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 108
    invoke-static {p0, p1, p2, p3}, Lcom/adobe/mobile/WearableFunctionBridge;->sendGenericRequest(Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)V

    goto :goto_0

    .line 114
    :cond_2
    :try_start_0
    invoke-static {p0}, Lcom/adobe/mobile/RequestHandler;->requestConnect(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 115
    .local v0, "connection":Ljava/net/HttpURLConnection;
    if-eqz v0, :cond_0

    .line 116
    invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 117
    invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 119
    if-eqz p1, :cond_4

    .line 121
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 122
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 123
    .local v4, "value":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_3

    .line 124
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_1

    .line 137
    .end local v0    # "connection":Ljava/net/HttpURLConnection;
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v4    # "value":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 138
    .local v1, "e":Ljava/net/SocketTimeoutException;
    const-string v5, "%s - Timed out sending request(%s)"

    new-array v6, v10, [Ljava/lang/Object;

    aput-object p3, v6, v8

    aput-object p0, v6, v9

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 129
    .end local v1    # "e":Ljava/net/SocketTimeoutException;
    .restart local v0    # "connection":Ljava/net/HttpURLConnection;
    :cond_4
    :try_start_1
    const-string v5, "%s - Request Sent(%s)"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p3, v6, v7

    const/4 v7, 0x1

    aput-object p0, v6, v7

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 133
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    .line 134
    .local v3, "stream":Ljava/io/InputStream;
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 135
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_0

    .line 139
    .end local v0    # "connection":Ljava/net/HttpURLConnection;
    .end local v3    # "stream":Ljava/io/InputStream;
    :catch_1
    move-exception v1

    .line 140
    .local v1, "e":Ljava/io/IOException;
    const-string v5, "%s - IOException while sending request, may retry(%s)"

    new-array v6, v10, [Ljava/lang/Object;

    aput-object p3, v6, v8

    invoke-virtual {v1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v9

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 141
    .end local v1    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v1

    .line 142
    .local v1, "e":Ljava/lang/Exception;
    const-string v5, "%s - Exception while attempting to send hit, will not retry(%s)"

    new-array v6, v10, [Ljava/lang/Object;

    aput-object p3, v6, v8

    invoke-virtual {v1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v9

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 143
    .end local v1    # "e":Ljava/lang/Exception;
    :catch_3
    move-exception v1

    .line 144
    .local v1, "e":Ljava/lang/Error;
    const-string v5, "%s - Exception while attempting to send hit, will not retry(%s)"

    new-array v6, v10, [Ljava/lang/Object;

    aput-object p3, v6, v8

    invoke-virtual {v1}, Ljava/lang/Error;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v9

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
