.class Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;
.super Ljava/lang/Object;
.source "RemoteDownload.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/RemoteDownload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DownloadFileTask"
.end annotation


# instance fields
.field private final callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

.field private final connectionTimeout:I

.field private final directory:Ljava/lang/String;

.field private final readTimeout:I

.field private final url:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;IILjava/lang/String;)V
    .locals 0
    .param p1, "initRequest"    # Ljava/lang/String;
    .param p2, "initCallback"    # Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;
    .param p3, "initConnectionTimeout"    # I
    .param p4, "initReadTimeout"    # I
    .param p5, "initDirectory"    # Ljava/lang/String;

    .prologue
    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 333
    iput-object p1, p0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    .line 334
    iput-object p2, p0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    .line 335
    iput p3, p0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->connectionTimeout:I

    .line 336
    iput p4, p0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->readTimeout:I

    .line 337
    iput-object p5, p0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->directory:Ljava/lang/String;

    .line 338
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;IILjava/lang/String;Lcom/adobe/mobile/RemoteDownload$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;
    .param p3, "x2"    # I
    .param p4, "x3"    # I
    .param p5, "x4"    # Ljava/lang/String;
    .param p6, "x5"    # Lcom/adobe/mobile/RemoteDownload$1;

    .prologue
    .line 322
    invoke-direct/range {p0 .. p5}, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;-><init>(Ljava/lang/String;Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;IILjava/lang/String;)V

    return-void
.end method

.method protected static requestConnect(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 7
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 490
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 492
    .local v1, "requestURL":Ljava/net/URL;
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    const-string v4, "https"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 493
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 494
    .local v2, "secureConnection":Ljavax/net/ssl/HttpsURLConnection;
    new-instance v3, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-direct {v3}, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;-><init>()V

    invoke-virtual {v2, v3}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 503
    .end local v1    # "requestURL":Ljava/net/URL;
    .end local v2    # "secureConnection":Ljavax/net/ssl/HttpsURLConnection;
    :goto_0
    return-object v2

    .line 497
    .restart local v1    # "requestURL":Ljava/net/URL;
    :cond_0
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    goto :goto_0

    .line 499
    .end local v1    # "requestURL":Ljava/net/URL;
    :catch_0
    move-exception v0

    .line 500
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "Cached Files - Exception opening URL(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    const/4 v2, 0x0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 22

    .prologue
    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v17, v0

    if-nez v17, :cond_1

    .line 343
    const-string v17, "Cached Files - url is null and cannot be cached"

    const/16 v18, 0x0

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_0

    .line 345
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V

    .line 485
    :cond_0
    :goto_0
    return-void

    .line 351
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/RemoteDownload;->stringIsUrl(Ljava/lang/String;)Z

    move-result v17

    if-nez v17, :cond_2

    .line 352
    const-string v17, "Cached Files - given url is not valid and cannot be cached (\"%s\")"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_0

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V

    goto :goto_0

    .line 359
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->directory:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/RemoteDownload;->getFileForCachedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 361
    .local v2, "cachefile":Ljava/io/File;
    # invokes: Lcom/adobe/mobile/RemoteDownload;->createRFC2822Formatter()Ljava/text/SimpleDateFormat;
    invoke-static {}, Lcom/adobe/mobile/RemoteDownload;->access$100()Ljava/text/SimpleDateFormat;

    move-result-object v16

    .line 362
    .local v16, "rfc2822Formatter":Ljava/text/SimpleDateFormat;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->requestConnect(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v3

    .line 364
    .local v3, "connection":Ljava/net/HttpURLConnection;
    const/4 v10, 0x0

    .line 365
    .local v10, "input":Ljava/io/InputStream;
    const/4 v14, 0x0

    .line 367
    .local v14, "output":Ljava/io/OutputStream;
    if-nez v3, :cond_3

    .line 368
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_0

    .line 369
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V

    goto :goto_0

    .line 374
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->connectionTimeout:I

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 375
    move-object/from16 v0, p0

    iget v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->readTimeout:I

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 377
    if-eqz v2, :cond_5

    .line 378
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v17

    # invokes: Lcom/adobe/mobile/RemoteDownload;->getEtagOfFile(Ljava/lang/String;)Ljava/lang/String;
    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/RemoteDownload;->access$200(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/StaticMethods;->hexToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 379
    .local v8, "etag":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v17

    # invokes: Lcom/adobe/mobile/RemoteDownload;->getLastModifiedOfFile(Ljava/lang/String;)J
    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/RemoteDownload;->access$300(Ljava/lang/String;)J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 381
    .local v6, "date":Ljava/lang/Long;
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    const-wide/16 v20, 0x0

    cmp-long v17, v18, v20

    if-eqz v17, :cond_4

    .line 382
    const-string v17, "If-Modified-Since"

    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    :cond_4
    if-eqz v8, :cond_5

    .line 385
    const-string v17, "If-None-Match"

    move-object/from16 v0, v17

    invoke-virtual {v3, v0, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .end local v6    # "date":Ljava/lang/Long;
    .end local v8    # "etag":Ljava/lang/String;
    :cond_5
    :try_start_0
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    .line 391
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v17

    const/16 v18, 0x130

    move/from16 v0, v17

    move/from16 v1, v18

    if-ne v0, v1, :cond_9

    .line 392
    const-string v17, "Cached Files - File has not been modified since last download. (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_6

    .line 394
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-interface {v0, v1, v2}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_11
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 473
    :cond_6
    if-eqz v14, :cond_7

    .line 474
    :try_start_1
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_7
    if-eqz v10, :cond_8

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_8
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 481
    :catch_0
    move-exception v9

    .line 482
    .local v9, "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 398
    .end local v9    # "ex":Ljava/io/IOException;
    :cond_9
    :try_start_2
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v17

    const/16 v18, 0x194

    move/from16 v0, v17

    move/from16 v1, v18

    if-ne v0, v1, :cond_d

    .line 399
    const-string v17, "Cached Files - File not found. (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_a

    .line 401
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-interface {v0, v1, v2}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_11
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_b
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 473
    :cond_a
    if-eqz v14, :cond_b

    .line 474
    :try_start_3
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_b
    if-eqz v10, :cond_c

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_c
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_0

    .line 481
    :catch_1
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 405
    .end local v9    # "ex":Ljava/io/IOException;
    :cond_d
    :try_start_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v17

    const/16 v18, 0xc8

    move/from16 v0, v17

    move/from16 v1, v18

    if-eq v0, v1, :cond_11

    .line 406
    const-string v17, "Cached Files - File could not be downloaded from URL (%s) Response: (%d) Message: (%s)"

    const/16 v18, 0x3

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    const/16 v19, 0x1

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v20

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    aput-object v20, v18, v19

    const/16 v19, 0x2

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_e

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-interface {v0, v1, v2}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_11
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_b
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 473
    :cond_e
    if-eqz v14, :cond_f

    .line 474
    :try_start_5
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_f
    if-eqz v10, :cond_10

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_10
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto/16 :goto_0

    .line 481
    :catch_2
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 413
    .end local v9    # "ex":Ljava/io/IOException;
    :cond_11
    if-eqz v2, :cond_12

    .line 414
    :try_start_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->directory:Ljava/lang/String;

    move-object/from16 v18, v0

    # invokes: Lcom/adobe/mobile/RemoteDownload;->deleteCachedDataForURL(Ljava/lang/String;Ljava/lang/String;)Z
    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/RemoteDownload;->access$400(Ljava/lang/String;Ljava/lang/String;)Z

    .line 417
    :cond_12
    new-instance v11, Ljava/util/Date;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getLastModified()J

    move-result-wide v18

    move-wide/from16 v0, v18

    invoke-direct {v11, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 418
    .local v11, "lastModifiedDate":Ljava/util/Date;
    const-string v17, "ETag"

    move-object/from16 v0, v17

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 420
    .local v13, "newETag":Ljava/lang/String;
    if-eqz v13, :cond_13

    .line 421
    invoke-static {v13}, Lcom/adobe/mobile/StaticMethods;->getHexString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 425
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->directory:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    # invokes: Lcom/adobe/mobile/RemoteDownload;->getNewCachedFile(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    invoke-static {v0, v11, v13, v1}, Lcom/adobe/mobile/RemoteDownload;->access$500(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v12

    .line 427
    .local v12, "newCacheFile":Ljava/io/File;
    if-nez v12, :cond_17

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_14

    .line 429
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_11
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_b
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 473
    :cond_14
    if-eqz v14, :cond_15

    .line 474
    :try_start_7
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_15
    if-eqz v10, :cond_16

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_16
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    goto/16 :goto_0

    .line 481
    :catch_3
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 434
    .end local v9    # "ex":Ljava/io/IOException;
    :cond_17
    :try_start_8
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10

    .line 435
    new-instance v15, Ljava/io/FileOutputStream;

    invoke-direct {v15, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/net/SocketTimeoutException; {:try_start_8 .. :try_end_8} :catch_11
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_b
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 437
    .end local v14    # "output":Ljava/io/OutputStream;
    .local v15, "output":Ljava/io/OutputStream;
    const/16 v17, 0x1000

    :try_start_9
    move/from16 v0, v17

    new-array v5, v0, [B

    .line 440
    .local v5, "data":[B
    :goto_1
    invoke-virtual {v10, v5}, Ljava/io/InputStream;->read([B)I

    move-result v4

    .local v4, "count":I
    const/16 v17, -0x1

    move/from16 v0, v17

    if-eq v4, v0, :cond_1b

    .line 441
    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v15, v5, v0, v4}, Ljava/io/OutputStream;->write([BII)V
    :try_end_9
    .catch Ljava/net/SocketTimeoutException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_10
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_f
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_e
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_1

    .line 449
    .end local v4    # "count":I
    .end local v5    # "data":[B
    :catch_4
    move-exception v7

    move-object v14, v15

    .line 450
    .end local v11    # "lastModifiedDate":Ljava/util/Date;
    .end local v12    # "newCacheFile":Ljava/io/File;
    .end local v13    # "newETag":Ljava/lang/String;
    .end local v15    # "output":Ljava/io/OutputStream;
    .local v7, "e":Ljava/net/SocketTimeoutException;
    .restart local v14    # "output":Ljava/io/OutputStream;
    :goto_2
    :try_start_a
    const-string v17, "Cached Files - Timed out making request (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_18

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 473
    :cond_18
    if-eqz v14, :cond_19

    .line 474
    :try_start_b
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_19
    if-eqz v10, :cond_1a

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_1a
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    goto/16 :goto_0

    .line 481
    :catch_5
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 444
    .end local v7    # "e":Ljava/net/SocketTimeoutException;
    .end local v9    # "ex":Ljava/io/IOException;
    .end local v14    # "output":Ljava/io/OutputStream;
    .restart local v4    # "count":I
    .restart local v5    # "data":[B
    .restart local v11    # "lastModifiedDate":Ljava/util/Date;
    .restart local v12    # "newCacheFile":Ljava/io/File;
    .restart local v13    # "newETag":Ljava/lang/String;
    .restart local v15    # "output":Ljava/io/OutputStream;
    :cond_1b
    :try_start_c
    const-string v17, "Cached Files - Caching successful (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->url:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_1c

    .line 447
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x1

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-interface {v0, v1, v12}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_c
    .catch Ljava/net/SocketTimeoutException; {:try_start_c .. :try_end_c} :catch_4
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_10
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_f
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_e
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 473
    :cond_1c
    if-eqz v15, :cond_1d

    .line 474
    :try_start_d
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_1d
    if-eqz v10, :cond_1e

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_1e
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6

    move-object v14, v15

    .line 483
    .end local v15    # "output":Ljava/io/OutputStream;
    .restart local v14    # "output":Ljava/io/OutputStream;
    goto/16 :goto_0

    .line 481
    .end local v14    # "output":Ljava/io/OutputStream;
    .restart local v15    # "output":Ljava/io/OutputStream;
    :catch_6
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v14, v15

    .line 484
    .end local v15    # "output":Ljava/io/OutputStream;
    .restart local v14    # "output":Ljava/io/OutputStream;
    goto/16 :goto_0

    .line 454
    .end local v4    # "count":I
    .end local v5    # "data":[B
    .end local v9    # "ex":Ljava/io/IOException;
    .end local v11    # "lastModifiedDate":Ljava/util/Date;
    .end local v12    # "newCacheFile":Ljava/io/File;
    .end local v13    # "newETag":Ljava/lang/String;
    :catch_7
    move-exception v7

    .line 455
    .local v7, "e":Ljava/io/IOException;
    :goto_3
    :try_start_e
    const-string v17, "Cached Files - IOException while making request (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v7}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_1f

    .line 457
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 473
    :cond_1f
    if-eqz v14, :cond_20

    .line 474
    :try_start_f
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_20
    if-eqz v10, :cond_21

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_21
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8

    goto/16 :goto_0

    .line 481
    :catch_8
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 459
    .end local v7    # "e":Ljava/io/IOException;
    .end local v9    # "ex":Ljava/io/IOException;
    :catch_9
    move-exception v7

    .line 460
    .local v7, "e":Ljava/lang/Exception;
    :goto_4
    :try_start_10
    const-string v17, "Cached Files - Unexpected exception while attempting to get remote file (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v7}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_22

    .line 462
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 473
    :cond_22
    if-eqz v14, :cond_23

    .line 474
    :try_start_11
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_23
    if-eqz v10, :cond_24

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_24
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_a

    goto/16 :goto_0

    .line 481
    :catch_a
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 464
    .end local v7    # "e":Ljava/lang/Exception;
    .end local v9    # "ex":Ljava/io/IOException;
    :catch_b
    move-exception v7

    .line 465
    .local v7, "e":Ljava/lang/Error;
    :goto_5
    :try_start_12
    const-string v17, "Cached Files - Unexpected error while attempting to get remote file (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v7}, Ljava/lang/Error;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    if-eqz v17, :cond_25

    .line 467
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/RemoteDownload$DownloadFileTask;->callback:Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface/range {v17 .. v19}, Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;->call(ZLjava/io/File;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 473
    :cond_25
    if-eqz v14, :cond_26

    .line 474
    :try_start_13
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_26
    if-eqz v10, :cond_27

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_27
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_c

    goto/16 :goto_0

    .line 481
    :catch_c
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v17, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v20

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 472
    .end local v7    # "e":Ljava/lang/Error;
    .end local v9    # "ex":Ljava/io/IOException;
    :catchall_0
    move-exception v17

    .line 473
    :goto_6
    if-eqz v14, :cond_28

    .line 474
    :try_start_14
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V

    .line 476
    :cond_28
    if-eqz v10, :cond_29

    .line 477
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 479
    :cond_29
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_d

    .line 483
    :goto_7
    throw v17

    .line 481
    :catch_d
    move-exception v9

    .line 482
    .restart local v9    # "ex":Ljava/io/IOException;
    const-string v18, "Cached Files - Exception while attempting to close streams (%s)"

    const/16 v19, 0x1

    move/from16 v0, v19

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v19, v0

    const/16 v20, 0x0

    invoke-virtual {v9}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v21

    aput-object v21, v19, v20

    invoke-static/range {v18 .. v19}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_7

    .line 472
    .end local v9    # "ex":Ljava/io/IOException;
    .end local v14    # "output":Ljava/io/OutputStream;
    .restart local v11    # "lastModifiedDate":Ljava/util/Date;
    .restart local v12    # "newCacheFile":Ljava/io/File;
    .restart local v13    # "newETag":Ljava/lang/String;
    .restart local v15    # "output":Ljava/io/OutputStream;
    :catchall_1
    move-exception v17

    move-object v14, v15

    .end local v15    # "output":Ljava/io/OutputStream;
    .restart local v14    # "output":Ljava/io/OutputStream;
    goto :goto_6

    .line 464
    .end local v14    # "output":Ljava/io/OutputStream;
    .restart local v15    # "output":Ljava/io/OutputStream;
    :catch_e
    move-exception v7

    move-object v14, v15

    .end local v15    # "output":Ljava/io/OutputStream;
    .restart local v14    # "output":Ljava/io/OutputStream;
    goto :goto_5

    .line 459
    .end local v14    # "output":Ljava/io/OutputStream;
    .restart local v15    # "output":Ljava/io/OutputStream;
    :catch_f
    move-exception v7

    move-object v14, v15

    .end local v15    # "output":Ljava/io/OutputStream;
    .restart local v14    # "output":Ljava/io/OutputStream;
    goto/16 :goto_4

    .line 454
    .end local v14    # "output":Ljava/io/OutputStream;
    .restart local v15    # "output":Ljava/io/OutputStream;
    :catch_10
    move-exception v7

    move-object v14, v15

    .end local v15    # "output":Ljava/io/OutputStream;
    .restart local v14    # "output":Ljava/io/OutputStream;
    goto/16 :goto_3

    .line 449
    .end local v11    # "lastModifiedDate":Ljava/util/Date;
    .end local v12    # "newCacheFile":Ljava/io/File;
    .end local v13    # "newETag":Ljava/lang/String;
    :catch_11
    move-exception v7

    goto/16 :goto_2
.end method
