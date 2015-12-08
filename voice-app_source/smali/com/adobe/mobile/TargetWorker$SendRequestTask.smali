.class public Lcom/adobe/mobile/TargetWorker$SendRequestTask;
.super Ljava/lang/Object;
.source "TargetWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/TargetWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "SendRequestTask"
.end annotation


# instance fields
.field private callback:Lcom/adobe/mobile/Target$TargetCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adobe/mobile/Target$TargetCallback",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private lifetimeValue:Ljava/math/BigDecimal;

.field private request:Lcom/adobe/mobile/TargetLocationRequest;


# direct methods
.method private constructor <init>(Lcom/adobe/mobile/TargetLocationRequest;Lcom/adobe/mobile/Target$TargetCallback;)V
    .locals 1
    .param p1, "initRequest"    # Lcom/adobe/mobile/TargetLocationRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adobe/mobile/TargetLocationRequest;",
            "Lcom/adobe/mobile/Target$TargetCallback",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 101
    .local p2, "initCallback":Lcom/adobe/mobile/Target$TargetCallback;, "Lcom/adobe/mobile/Target$TargetCallback<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    .line 104
    iput-object p2, p0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    .line 105
    invoke-static {}, Lcom/adobe/mobile/AnalyticsTrackLifetimeValueIncrease;->getLifetimeValue()Ljava/math/BigDecimal;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->lifetimeValue:Ljava/math/BigDecimal;

    .line 106
    return-void
.end method

.method synthetic constructor <init>(Lcom/adobe/mobile/TargetLocationRequest;Lcom/adobe/mobile/Target$TargetCallback;Lcom/adobe/mobile/TargetWorker$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/adobe/mobile/TargetLocationRequest;
    .param p2, "x1"    # Lcom/adobe/mobile/Target$TargetCallback;
    .param p3, "x2"    # Lcom/adobe/mobile/TargetWorker$1;

    .prologue
    .line 94
    invoke-direct {p0, p1, p2}, Lcom/adobe/mobile/TargetWorker$SendRequestTask;-><init>(Lcom/adobe/mobile/TargetLocationRequest;Lcom/adobe/mobile/Target$TargetCallback;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 21

    .prologue
    .line 110
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->lifetimeValue:Ljava/math/BigDecimal;

    move-object/from16 v17, v0

    if-eqz v17, :cond_0

    .line 112
    const-string v17, "a.ltv.amount"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->lifetimeValue:Ljava/math/BigDecimal;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->name:Ljava/lang/String;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->parameters:Ljava/util/HashMap;

    move-object/from16 v18, v0

    # invokes: Lcom/adobe/mobile/TargetWorker;->getURLRequestString(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/TargetWorker;->access$100(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    .line 118
    .local v12, "requestUrl":Ljava/lang/String;
    if-eqz v12, :cond_1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v17

    if-gtz v17, :cond_3

    .line 119
    :cond_1
    const-string v17, "Target - LocationRequest requires a name."

    const/16 v18, 0x0

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    if-eqz v17, :cond_2

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->defaultContent:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-interface/range {v17 .. v18}, Lcom/adobe/mobile/Target$TargetCallback;->call(Ljava/lang/Object;)V

    .line 195
    :cond_2
    :goto_0
    return-void

    .line 127
    :cond_3
    :try_start_0
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .local v14, "sb":Ljava/lang/StringBuilder;
    new-instance v8, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v8}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 129
    .local v8, "httpParameters":Lorg/apache/http/params/HttpParams;
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/adobe/mobile/MobileConfig;->getDefaultLocationTimeout()I

    move-result v3

    .line 131
    .local v3, "connectionTimeout":I
    mul-int/lit16 v0, v3, 0x3e8

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-static {v8, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 133
    const/16 v17, 0x7d0

    move/from16 v0, v17

    invoke-static {v8, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 135
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v2, v8}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 136
    .local v2, "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v7, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v7, v12}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 139
    .local v7, "get":Lorg/apache/http/client/methods/HttpGet;
    invoke-static {}, Lcom/adobe/mobile/TargetWorker;->loadCookies()V

    .line 140
    # getter for: Lcom/adobe/mobile/TargetWorker;->_cookieMutex:Ljava/lang/Object;
    invoke-static {}, Lcom/adobe/mobile/TargetWorker;->access$200()Ljava/lang/Object;

    move-result-object v18

    monitor-enter v18
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 141
    :try_start_1
    # getter for: Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;
    invoke-static {}, Lcom/adobe/mobile/TargetWorker;->access$300()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_4

    .line 142
    const-string v17, "Cookie"

    # getter for: Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;
    invoke-static {}, Lcom/adobe/mobile/TargetWorker;->access$300()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v7, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :cond_4
    monitor-exit v18
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    :try_start_2
    invoke-virtual {v2, v7}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v13

    .line 147
    .local v13, "response":Lorg/apache/http/HttpResponse;
    invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getCookieStore()Lorg/apache/http/client/CookieStore;

    move-result-object v17

    # invokes: Lcom/adobe/mobile/TargetWorker;->saveCookies(Lorg/apache/http/client/CookieStore;)V
    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/TargetWorker;->access$400(Lorg/apache/http/client/CookieStore;)V

    .line 149
    invoke-interface {v13}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v16

    .line 150
    .local v16, "statusLine":Lorg/apache/http/StatusLine;
    invoke-interface/range {v16 .. v16}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v15

    .line 153
    .local v15, "statusCode":I
    const/16 v17, 0xc8

    move/from16 v0, v17

    if-ne v15, v0, :cond_7

    .line 154
    invoke-interface {v13}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    .line 155
    .local v6, "entity":Lorg/apache/http/HttpEntity;
    invoke-interface {v6}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v4

    .line 156
    .local v4, "content":Ljava/io/InputStream;
    new-instance v11, Ljava/io/BufferedReader;

    new-instance v17, Ljava/io/InputStreamReader;

    const-string v18, "UTF-8"

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v0, v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object/from16 v0, v17

    invoke-direct {v11, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 159
    .local v11, "reader":Ljava/io/BufferedReader;
    :goto_1
    invoke-virtual {v11}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v9

    .local v9, "line":Ljava/lang/String;
    if-eqz v9, :cond_5

    .line 160
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 187
    .end local v2    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v3    # "connectionTimeout":I
    .end local v4    # "content":Ljava/io/InputStream;
    .end local v6    # "entity":Lorg/apache/http/HttpEntity;
    .end local v7    # "get":Lorg/apache/http/client/methods/HttpGet;
    .end local v8    # "httpParameters":Lorg/apache/http/params/HttpParams;
    .end local v9    # "line":Ljava/lang/String;
    .end local v11    # "reader":Ljava/io/BufferedReader;
    .end local v13    # "response":Lorg/apache/http/HttpResponse;
    .end local v14    # "sb":Ljava/lang/StringBuilder;
    .end local v15    # "statusCode":I
    .end local v16    # "statusLine":Lorg/apache/http/StatusLine;
    :catch_0
    move-exception v5

    .line 188
    .local v5, "e":Ljava/lang/RuntimeException;
    throw v5

    .line 144
    .end local v5    # "e":Ljava/lang/RuntimeException;
    .restart local v2    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v3    # "connectionTimeout":I
    .restart local v7    # "get":Lorg/apache/http/client/methods/HttpGet;
    .restart local v8    # "httpParameters":Lorg/apache/http/params/HttpParams;
    .restart local v14    # "sb":Ljava/lang/StringBuilder;
    :catchall_0
    move-exception v17

    :try_start_3
    monitor-exit v18
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v17
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 189
    .end local v2    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v3    # "connectionTimeout":I
    .end local v7    # "get":Lorg/apache/http/client/methods/HttpGet;
    .end local v8    # "httpParameters":Lorg/apache/http/params/HttpParams;
    .end local v14    # "sb":Ljava/lang/StringBuilder;
    :catch_1
    move-exception v5

    .line 190
    .local v5, "e":Ljava/lang/Exception;
    const-string v17, "Target - Unable to create HttpURLConnection"

    const/16 v18, 0x0

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    if-eqz v17, :cond_2

    .line 192
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->defaultContent:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-interface/range {v17 .. v18}, Lcom/adobe/mobile/Target$TargetCallback;->call(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 163
    .end local v5    # "e":Ljava/lang/Exception;
    .restart local v2    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v3    # "connectionTimeout":I
    .restart local v4    # "content":Ljava/io/InputStream;
    .restart local v6    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v7    # "get":Lorg/apache/http/client/methods/HttpGet;
    .restart local v8    # "httpParameters":Lorg/apache/http/params/HttpParams;
    .restart local v9    # "line":Ljava/lang/String;
    .restart local v11    # "reader":Ljava/io/BufferedReader;
    .restart local v13    # "response":Lorg/apache/http/HttpResponse;
    .restart local v14    # "sb":Ljava/lang/StringBuilder;
    .restart local v15    # "statusCode":I
    .restart local v16    # "statusLine":Lorg/apache/http/StatusLine;
    :cond_5
    :try_start_5
    invoke-virtual {v11}, Ljava/io/BufferedReader;->close()V

    .line 166
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 167
    .local v10, "offerContent":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v17

    if-lez v17, :cond_6

    .line 168
    const-string v17, "Target - LocationRequest (%s) Result: %s"

    const/16 v18, 0x2

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->name:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    const/16 v19, 0x1

    aput-object v10, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    if-eqz v17, :cond_2

    .line 170
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    invoke-interface {v0, v10}, Lcom/adobe/mobile/Target$TargetCallback;->call(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 174
    :cond_6
    const-string v17, "Target - LocationRequest (%s) response was empty"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->name:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    if-eqz v17, :cond_2

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->defaultContent:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-interface/range {v17 .. v18}, Lcom/adobe/mobile/Target$TargetCallback;->call(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 182
    .end local v4    # "content":Ljava/io/InputStream;
    .end local v6    # "entity":Lorg/apache/http/HttpEntity;
    .end local v9    # "line":Ljava/lang/String;
    .end local v10    # "offerContent":Ljava/lang/String;
    .end local v11    # "reader":Ljava/io/BufferedReader;
    :cond_7
    const-string v17, "Target - No content found or user didn\'t qualify for campaign for LocationRequest (%s)"

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->name:Ljava/lang/String;

    move-object/from16 v20, v0

    aput-object v20, v18, v19

    invoke-static/range {v17 .. v18}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    if-eqz v17, :cond_2

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->callback:Lcom/adobe/mobile/Target$TargetCallback;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;->request:Lcom/adobe/mobile/TargetLocationRequest;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/adobe/mobile/TargetLocationRequest;->defaultContent:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-interface/range {v17 .. v18}, Lcom/adobe/mobile/Target$TargetCallback;->call(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_0
.end method
