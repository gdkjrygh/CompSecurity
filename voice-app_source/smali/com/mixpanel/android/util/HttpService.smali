.class public Lcom/mixpanel/android/util/HttpService;
.super Ljava/lang/Object;
.source "HttpService.java"

# interfaces
.implements Lcom/mixpanel/android/util/RemoteService;


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.Message"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static slurp(Ljava/io/InputStream;)[B
    .locals 5
    .param p0, "inputStream"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 123
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 126
    .local v0, "buffer":Ljava/io/ByteArrayOutputStream;
    const/16 v3, 0x2000

    new-array v1, v3, [B

    .line 128
    .local v1, "data":[B
    :goto_0
    array-length v3, v1

    invoke-virtual {p0, v1, v4, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    .local v2, "nRead":I
    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 132
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 133
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    return-object v3

    .line 129
    :cond_0
    invoke-virtual {v0, v1, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method


# virtual methods
.method public isOnline(Landroid/content/Context;)Z
    .locals 7
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 33
    :try_start_0
    const-string v4, "connectivity"

    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 34
    .local v0, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 35
    .local v3, "netInfo":Landroid/net/NetworkInfo;
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v2, 0x1

    .line 36
    .local v2, "isOnline":Z
    :goto_0
    sget-boolean v4, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v4, :cond_0

    .line 37
    const-string v5, "MixpanelAPI.Message"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v4, "ConnectivityManager says we "

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v2, :cond_2

    const-string v4, "are"

    :goto_1
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " online"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .end local v0    # "cm":Landroid/net/ConnectivityManager;
    .end local v3    # "netInfo":Landroid/net/NetworkInfo;
    :cond_0
    :goto_2
    return v2

    .line 35
    .end local v2    # "isOnline":Z
    .restart local v0    # "cm":Landroid/net/ConnectivityManager;
    .restart local v3    # "netInfo":Landroid/net/NetworkInfo;
    :cond_1
    const/4 v2, 0x0

    goto :goto_0

    .line 37
    .restart local v2    # "isOnline":Z
    :cond_2
    const-string v4, "are not"
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 39
    .end local v0    # "cm":Landroid/net/ConnectivityManager;
    .end local v2    # "isOnline":Z
    .end local v3    # "netInfo":Landroid/net/NetworkInfo;
    :catch_0
    move-exception v1

    .line 40
    .local v1, "e":Ljava/lang/SecurityException;
    const/4 v2, 0x1

    .line 41
    .restart local v2    # "isOnline":Z
    sget-boolean v4, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v4, :cond_0

    .line 42
    const-string v4, "MixpanelAPI.Message"

    const-string v5, "Don\'t have permission to check connectivity, will assume we are online"

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2
.end method

.method public performRequest(Ljava/lang/String;Ljava/util/List;)[B
    .locals 16
    .param p1, "endpointUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;)[B"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    .local p2, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    sget-boolean v13, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v13, :cond_0

    .line 51
    const-string v13, "MixpanelAPI.Message"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Attempting request to "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    :cond_0
    const/4 v9, 0x0

    .line 59
    .local v9, "response":[B
    const/4 v10, 0x0

    .line 60
    .local v10, "retries":I
    const/4 v11, 0x0

    .line 61
    .local v11, "succeeded":Z
    :cond_1
    :goto_0
    const/4 v13, 0x3

    if-ge v10, v13, :cond_2

    if-eqz v11, :cond_4

    .line 113
    :cond_2
    sget-boolean v13, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v13, :cond_3

    .line 114
    const/4 v13, 0x3

    if-lt v10, v13, :cond_3

    .line 115
    const-string v13, "MixpanelAPI.Message"

    const-string v14, "Could not connect to Mixpanel service after three retries."

    invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    :cond_3
    return-object v9

    .line 62
    :cond_4
    const/4 v7, 0x0

    .line 63
    .local v7, "in":Ljava/io/InputStream;
    const/4 v8, 0x0

    .line 64
    .local v8, "out":Ljava/io/OutputStream;
    const/4 v2, 0x0

    .line 65
    .local v2, "bout":Ljava/io/BufferedOutputStream;
    const/4 v4, 0x0

    .line 68
    .local v4, "connection":Ljava/net/HttpURLConnection;
    :try_start_0
    new-instance v12, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 69
    .local v12, "url":Ljava/net/URL;
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v4, v0

    .line 70
    const/16 v13, 0x7d0

    invoke-virtual {v4, v13}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 71
    const/16 v13, 0x2710

    invoke-virtual {v4, v13}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 72
    if-eqz p2, :cond_5

    .line 73
    const/4 v13, 0x1

    invoke-virtual {v4, v13}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 74
    new-instance v6, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v13, "UTF-8"

    move-object/from16 v0, p2

    invoke-direct {v6, v0, v13}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 75
    .local v6, "form":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    const-string v13, "POST"

    invoke-virtual {v4, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v6}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->getContentLength()J

    move-result-wide v14

    long-to-int v13, v14

    invoke-virtual {v4, v13}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 77
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v8

    .line 78
    new-instance v3, Ljava/io/BufferedOutputStream;

    invoke-direct {v3, v8}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .end local v2    # "bout":Ljava/io/BufferedOutputStream;
    .local v3, "bout":Ljava/io/BufferedOutputStream;
    :try_start_1
    invoke-virtual {v6, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 80
    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_b
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    const/4 v2, 0x0

    .line 82
    .end local v3    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v2    # "bout":Ljava/io/BufferedOutputStream;
    :try_start_2
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V

    .line 83
    const/4 v8, 0x0

    .line 85
    .end local v6    # "form":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :cond_5
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    .line 86
    invoke-static {v7}, Lcom/mixpanel/android/util/HttpService;->slurp(Ljava/io/InputStream;)[B

    move-result-object v9

    .line 87
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v11, 0x1

    .line 103
    if-eqz v2, :cond_6

    .line 104
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8

    .line 105
    :cond_6
    :goto_1
    if-eqz v8, :cond_7

    .line 106
    :try_start_4
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_9

    .line 107
    :cond_7
    :goto_2
    if-eqz v7, :cond_8

    .line 108
    :try_start_5
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_a

    .line 109
    :cond_8
    :goto_3
    if-eqz v4, :cond_1

    .line 110
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 90
    .end local v12    # "url":Ljava/net/URL;
    :catch_0
    move-exception v5

    .line 91
    .local v5, "e":Ljava/io/EOFException;
    :goto_4
    :try_start_6
    sget-boolean v13, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v13, :cond_9

    .line 92
    const-string v13, "MixpanelAPI.Message"

    const-string v14, "Failure to connect, likely caused by a known issue with Android lib. Retrying."

    invoke-static {v13, v14}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 94
    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 103
    if-eqz v2, :cond_a

    .line 104
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 105
    :cond_a
    :goto_5
    if-eqz v8, :cond_b

    .line 106
    :try_start_8
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 107
    :cond_b
    :goto_6
    if-eqz v7, :cond_c

    .line 108
    :try_start_9
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 109
    :cond_c
    :goto_7
    if-eqz v4, :cond_1

    .line 110
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 95
    .end local v5    # "e":Ljava/io/EOFException;
    :catch_1
    move-exception v5

    .line 96
    .local v5, "e":Ljava/io/IOException;
    :goto_8
    const/16 v13, 0x1f7

    :try_start_a
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v14

    if-ne v13, v14, :cond_11

    .line 97
    new-instance v13, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;

    const-string v14, "Service Unavailable"

    const-string v15, "Retry-After"

    invoke-virtual {v4, v15}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v13
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 102
    .end local v5    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v13

    .line 103
    :goto_9
    if-eqz v2, :cond_d

    .line 104
    :try_start_b
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 105
    :cond_d
    :goto_a
    if-eqz v8, :cond_e

    .line 106
    :try_start_c
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 107
    :cond_e
    :goto_b
    if-eqz v7, :cond_f

    .line 108
    :try_start_d
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 109
    :cond_f
    :goto_c
    if-eqz v4, :cond_10

    .line 110
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 111
    :cond_10
    throw v13

    .line 99
    .restart local v5    # "e":Ljava/io/IOException;
    :cond_11
    :try_start_e
    throw v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 104
    .local v5, "e":Ljava/io/EOFException;
    :catch_2
    move-exception v13

    goto :goto_5

    .line 106
    :catch_3
    move-exception v13

    goto :goto_6

    .line 108
    :catch_4
    move-exception v13

    goto :goto_7

    .line 104
    .end local v5    # "e":Ljava/io/EOFException;
    :catch_5
    move-exception v14

    goto :goto_a

    .line 106
    :catch_6
    move-exception v14

    goto :goto_b

    .line 108
    :catch_7
    move-exception v14

    goto :goto_c

    .line 104
    .restart local v12    # "url":Ljava/net/URL;
    :catch_8
    move-exception v13

    goto :goto_1

    .line 106
    :catch_9
    move-exception v13

    goto :goto_2

    .line 108
    :catch_a
    move-exception v13

    goto :goto_3

    .line 102
    .end local v2    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v3    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v6    # "form":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :catchall_1
    move-exception v13

    move-object v2, v3

    .end local v3    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v2    # "bout":Ljava/io/BufferedOutputStream;
    goto :goto_9

    .line 95
    .end local v2    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v3    # "bout":Ljava/io/BufferedOutputStream;
    :catch_b
    move-exception v5

    move-object v2, v3

    .end local v3    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v2    # "bout":Ljava/io/BufferedOutputStream;
    goto :goto_8

    .line 90
    .end local v2    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v3    # "bout":Ljava/io/BufferedOutputStream;
    :catch_c
    move-exception v5

    move-object v2, v3

    .end local v3    # "bout":Ljava/io/BufferedOutputStream;
    .restart local v2    # "bout":Ljava/io/BufferedOutputStream;
    goto :goto_4
.end method
