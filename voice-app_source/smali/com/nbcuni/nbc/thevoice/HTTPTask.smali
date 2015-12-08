.class public Lcom/nbcuni/nbc/thevoice/HTTPTask;
.super Landroid/os/AsyncTask;
.source "HTTPTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static androidVersion:I

.field private static webVersion:I


# instance fields
.field final CST:Ljava/lang/String;

.field final EST:Ljava/lang/String;

.field currentTime:J

.field private dns:I

.field private eos:I

.field json:Lorg/json/JSONObject;

.field mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

.field private serverStatus:Ljava/lang/String;

.field url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V
    .locals 2
    .param p1, "mainActivity"    # Lcom/nbcuni/nbc/thevoice/MainActivity;

    .prologue
    const/4 v1, 0x0

    .line 57
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 44
    const-string v0, "NONE"

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->serverStatus:Ljava/lang/String;

    .line 46
    iput v1, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->eos:I

    .line 47
    iput v1, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->dns:I

    .line 52
    const-string v0, "EST"

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->EST:Ljava/lang/String;

    .line 53
    const-string v0, "CST"

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->CST:Ljava/lang/String;

    .line 59
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 60
    return-void
.end method

.method private checkDNS()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    .line 121
    const-string v6, "WebLog"

    const-string v7, "checkDNS()"

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->getConnectionStatus()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 125
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v7, 0x7f08004f

    invoke-virtual {v6, v7}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 127
    .local v5, "url":Ljava/lang/String;
    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 128
    .local v1, "httpClient":Lorg/apache/http/client/HttpClient;
    new-instance v2, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v2, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 131
    .local v2, "httpGet":Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    invoke-interface {v1, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 132
    .local v3, "response":Lorg/apache/http/HttpResponse;
    const-string v6, "WebLog"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DNS Check Http response: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    const/4 v6, 0x1

    iput v6, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->eos:I
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 145
    .end local v1    # "httpClient":Lorg/apache/http/client/HttpClient;
    .end local v2    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    .end local v3    # "response":Lorg/apache/http/HttpResponse;
    .end local v5    # "url":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 135
    .restart local v1    # "httpClient":Lorg/apache/http/client/HttpClient;
    .restart local v2    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    .restart local v5    # "url":Ljava/lang/String;
    :catch_0
    move-exception v4

    .line 136
    .local v4, "uhe":Ljava/net/UnknownHostException;
    const-string v6, "WebLog"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DNS Check UHE > no connection:"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    iput v9, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->dns:I

    goto :goto_0

    .line 139
    .end local v4    # "uhe":Ljava/net/UnknownHostException;
    :catch_1
    move-exception v0

    .line 140
    .local v0, "e":Ljava/lang/Exception;
    const-string v6, "WebLog"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DNS Check connect Exception: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    iput v9, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->dns:I

    goto :goto_0
.end method

.method private connect()V
    .locals 14

    .prologue
    const/16 v13, 0x61a8

    .line 149
    const-string v11, "WebLog"

    const-string v12, "connect()"

    invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->getConnectionStatus()Z

    move-result v11

    if-eqz v11, :cond_1

    .line 153
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->getTimeZone()Ljava/lang/String;

    move-result-object v11

    const-string v12, "CST"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->getTimeZone()Ljava/lang/String;

    move-result-object v11

    const-string v12, "EST"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 154
    :cond_0
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v12, 0x7f08004d

    invoke-virtual {v11, v12}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->url:Ljava/lang/String;

    .line 158
    :goto_0
    new-instance v5, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v5}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 159
    .local v5, "httpParams":Lorg/apache/http/params/HttpParams;
    invoke-static {v5, v13}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 160
    invoke-static {v5, v13}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 162
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 163
    .local v3, "httpClient":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v4, Lorg/apache/http/client/methods/HttpGet;

    new-instance v11, Ljava/lang/StringBuilder;

    iget-object v12, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->url:Ljava/lang/String;

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v12, "/api/1/gatekeeper/init?nocache="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v4, v11}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 165
    .local v4, "httpGet":Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    const-string v11, "Cookie"

    iget-object v12, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->url:Ljava/lang/String;

    invoke-virtual {p0, v12}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->getCookieFromAppCookieManager(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v11, v12}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :goto_1
    :try_start_1
    invoke-virtual {v3, v4}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v8

    .line 172
    .local v8, "response":Lorg/apache/http/HttpResponse;
    const-string v11, "WebLog"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Http response: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v11

    invoke-interface {v11}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v11

    const/16 v12, 0x194

    if-ne v11, v12, :cond_3

    .line 174
    invoke-direct {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->checkDNS()V
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 201
    .end local v3    # "httpClient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v4    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    .end local v5    # "httpParams":Lorg/apache/http/params/HttpParams;
    .end local v8    # "response":Lorg/apache/http/HttpResponse;
    :cond_1
    :goto_2
    return-void

    .line 156
    :cond_2
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v12, 0x7f08004e

    invoke-virtual {v11, v12}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->url:Ljava/lang/String;

    goto :goto_0

    .line 166
    .restart local v3    # "httpClient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v4    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    .restart local v5    # "httpParams":Lorg/apache/http/params/HttpParams;
    :catch_0
    move-exception v1

    .line 167
    .local v1, "e1":Ljava/net/MalformedURLException;
    invoke-virtual {v1}, Ljava/net/MalformedURLException;->printStackTrace()V

    goto :goto_1

    .line 176
    .end local v1    # "e1":Ljava/net/MalformedURLException;
    .restart local v8    # "response":Lorg/apache/http/HttpResponse;
    :cond_3
    :try_start_2
    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    .line 177
    .local v2, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v2, :cond_1

    .line 178
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v6

    .line 179
    .local v6, "inStream":Ljava/io/InputStream;
    invoke-static {v6}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v9

    .line 180
    .local v9, "results":Ljava/lang/String;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iput-wide v12, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->currentTime:J

    .line 181
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 183
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->json:Lorg/json/JSONObject;

    .line 184
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->json:Lorg/json/JSONObject;

    const-string v12, "clientMinimalVersion"

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 185
    .local v7, "minversion":Lorg/json/JSONObject;
    const-string v11, "android"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    sput v11, Lcom/nbcuni/nbc/thevoice/HTTPTask;->androidVersion:I

    .line 186
    const-string v11, "web"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    sput v11, Lcom/nbcuni/nbc/thevoice/HTTPTask;->webVersion:I

    .line 187
    const-string v11, "WebLog"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "AndroidVersion: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v13, Lcom/nbcuni/nbc/thevoice/HTTPTask;->androidVersion:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " WebVersion: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    sget v13, Lcom/nbcuni/nbc/thevoice/HTTPTask;->webVersion:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->json:Lorg/json/JSONObject;

    const-string v12, "status"

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->serverStatus:Ljava/lang/String;
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    .line 191
    .end local v2    # "entity":Lorg/apache/http/HttpEntity;
    .end local v6    # "inStream":Ljava/io/InputStream;
    .end local v7    # "minversion":Lorg/json/JSONObject;
    .end local v8    # "response":Lorg/apache/http/HttpResponse;
    .end local v9    # "results":Ljava/lang/String;
    :catch_1
    move-exception v10

    .line 192
    .local v10, "uhe":Ljava/net/UnknownHostException;
    const-string v11, "WebLog"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "UnknownHostException UHE "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    invoke-direct {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->checkDNS()V

    goto/16 :goto_2

    .line 195
    .end local v10    # "uhe":Ljava/net/UnknownHostException;
    :catch_2
    move-exception v0

    .line 196
    .local v0, "e":Ljava/lang/Exception;
    const-string v11, "WebLog"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "connect Exception: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    const/4 v11, 0x1

    iput v11, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->dns:I

    goto/16 :goto_2
.end method

.method private static convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6
    .param p0, "inStream"    # Ljava/io/InputStream;

    .prologue
    .line 26
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 27
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .local v3, "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 30
    .local v1, "line":Ljava/lang/String;
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    if-nez v1, :cond_0

    .line 36
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 41
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 31
    :cond_0
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 32
    :catch_0
    move-exception v0

    .line 33
    .local v0, "e":Ljava/io/IOException;
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 36
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 37
    :catch_1
    move-exception v0

    .line 38
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 34
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 36
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 40
    :goto_2
    throw v4

    .line 37
    :catch_2
    move-exception v0

    .line 38
    .restart local v0    # "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 37
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 38
    .restart local v0    # "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 86
    invoke-direct {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->connect()V

    .line 88
    sget v0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->androidVersion:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method getConnectionStatus()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 108
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v4, "connectivity"

    invoke-virtual {v3, v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 109
    .local v0, "cMgr":Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 110
    .local v1, "i":Landroid/net/NetworkInfo;
    if-nez v1, :cond_1

    .line 116
    :cond_0
    :goto_0
    return v2

    .line 112
    :cond_1
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 114
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 116
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public getCookieFromAppCookieManager(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 64
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    .line 65
    .local v0, "cookieManager":Landroid/webkit/CookieManager;
    if-nez v0, :cond_1

    move-object v2, v3

    .line 74
    :cond_0
    :goto_0
    return-object v2

    .line 67
    :cond_1
    const/4 v2, 0x0

    .line 68
    .local v2, "rawCookieHeader":Ljava/lang/String;
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 70
    .local v1, "parsedURL":Ljava/net/URL;
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 72
    if-nez v2, :cond_0

    move-object v2, v3

    .line 73
    goto :goto_0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 79
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v3, v3, v2}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 80
    .local v0, "tz":Ljava/lang/String;
    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Integer;)V
    .locals 8
    .param p1, "result"    # Ljava/lang/Integer;

    .prologue
    const/4 v7, 0x1

    .line 94
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->json:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    .line 95
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->url:Ljava/lang/String;

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->json:Lorg/json/JSONObject;

    iget-wide v4, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->currentTime:J

    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->getTimeZone()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendBackendData(Ljava/lang/String;Lorg/json/JSONObject;JLjava/lang/String;)V

    .line 97
    :cond_0
    iget v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->dns:I

    if-ne v0, v7, :cond_1

    .line 98
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showDNSDialog()V

    .line 99
    :cond_1
    iget v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->eos:I

    if-ne v0, v7, :cond_2

    .line 100
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showEndOfSeasonDialog()V

    .line 104
    :goto_0
    return-void

    .line 102
    :cond_2
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    sget v1, Lcom/nbcuni/nbc/thevoice/HTTPTask;->androidVersion:I

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/HTTPTask;->serverStatus:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->checkVersion(ILjava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->onPostExecute(Ljava/lang/Integer;)V

    return-void
.end method
