.class final Lcom/kochava/android/tracker/Feature$13;
.super Ljava/lang/Thread;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$e:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    .prologue
    .line 3588
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$13;->val$e:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .prologue
    .line 3594
    const/4 v12, 0x1

    :try_start_0
    # setter for: Lcom/kochava/android/tracker/Feature;->badInit:Z
    invoke-static {v12}, Lcom/kochava/android/tracker/Feature;->access$1402(Z)Z

    .line 3596
    iget-object v12, p0, Lcom/kochava/android/tracker/Feature$13;->val$e:Ljava/lang/Exception;

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v8

    .line 3598
    .local v8, "message":Ljava/lang/String;
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 3599
    .local v6, "jsonData":Lorg/json/JSONObject;
    const-string v12, "message"

    invoke-virtual {v6, v12, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3600
    const-string v12, "os_version"

    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3601
    const-string v12, "device"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    # invokes: Lcom/kochava/android/tracker/Feature;->getModel()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$4300()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "-"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    # invokes: Lcom/kochava/android/tracker/Feature;->getCarrier()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$4400()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3603
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 3604
    .local v7, "jsonObject":Lorg/json/JSONObject;
    const-string v12, "kochava_device_id"

    # invokes: Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1800()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3605
    const-string v12, "action"

    const-string v13, "error"

    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3606
    const-string v12, "data"

    invoke-virtual {v7, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3607
    const-string v12, "kochava_app_id"

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$500()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3608
    const-string v12, "sdk_version"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Android20150511"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    sget-object v14, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3610
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 3611
    .local v4, "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    invoke-virtual {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v12

    # getter for: Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$300()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 3614
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3615
    .local v1, "data":Ljava/lang/String;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "https log - posting to "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "http://"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "/track/kvTracker.php"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3616
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "https log data: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3617
    new-instance v5, Lorg/apache/http/client/methods/HttpPost;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "http://"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "/track/kvTracker.php"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v5, v12}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 3620
    .local v5, "httppost":Lorg/apache/http/client/methods/HttpPost;
    new-instance v11, Lorg/apache/http/entity/StringEntity;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "["

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "]"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v13, "UTF-8"

    invoke-direct {v11, v12, v13}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3621
    .local v11, "sentity":Lorg/apache/http/entity/StringEntity;
    new-instance v0, Lorg/apache/http/message/BasicHeader;

    const-string v12, "Content-Type"

    const-string v13, "application/xml"

    invoke-direct {v0, v12, v13}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3622
    .local v0, "basicHeader":Lorg/apache/http/message/BasicHeader;
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v12

    const-string v13, "http.protocol.expect-continue"

    const/4 v14, 0x0

    invoke-interface {v12, v13, v14}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;

    .line 3623
    invoke-virtual {v11, v0}, Lorg/apache/http/entity/StringEntity;->setContentType(Lorg/apache/http/Header;)V

    .line 3624
    invoke-virtual {v5, v11}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 3625
    const-string v12, "Trying to post an https failure log."

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3626
    invoke-virtual {v4, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v9

    .line 3627
    .local v9, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 3628
    .local v3, "entity":Lorg/apache/http/HttpEntity;
    if-nez v3, :cond_0

    .line 3630
    const-string v12, "https failure - did not get response back"

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3643
    .end local v0    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v1    # "data":Ljava/lang/String;
    .end local v3    # "entity":Lorg/apache/http/HttpEntity;
    .end local v4    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v5    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v6    # "jsonData":Lorg/json/JSONObject;
    .end local v7    # "jsonObject":Lorg/json/JSONObject;
    .end local v8    # "message":Ljava/lang/String;
    .end local v9    # "response":Lorg/apache/http/HttpResponse;
    .end local v11    # "sentity":Lorg/apache/http/entity/StringEntity;
    :goto_0
    return-void

    .line 3634
    .restart local v0    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v1    # "data":Ljava/lang/String;
    .restart local v3    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v4    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v5    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v6    # "jsonData":Lorg/json/JSONObject;
    .restart local v7    # "jsonObject":Lorg/json/JSONObject;
    .restart local v8    # "message":Ljava/lang/String;
    .restart local v9    # "response":Lorg/apache/http/HttpResponse;
    .restart local v11    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_0
    const-string v12, "https failure log, Grabbing Result..."

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3635
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v12

    invoke-static {v12}, Lcom/kochava/android/util/StringUtils;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v10

    .line 3636
    .local v10, "result":Ljava/lang/String;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "https failure log, Result: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3639
    .end local v0    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v1    # "data":Ljava/lang/String;
    .end local v3    # "entity":Lorg/apache/http/HttpEntity;
    .end local v4    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v5    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v6    # "jsonData":Lorg/json/JSONObject;
    .end local v7    # "jsonObject":Lorg/json/JSONObject;
    .end local v8    # "message":Ljava/lang/String;
    .end local v9    # "response":Lorg/apache/http/HttpResponse;
    .end local v10    # "result":Ljava/lang/String;
    .end local v11    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_0
    move-exception v2

    .line 3641
    .local v2, "e":Ljava/lang/Exception;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "httpsFail "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_0
.end method
