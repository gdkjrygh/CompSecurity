.class Lcom/kochava/android/tracker/Feature$3;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;

.field final synthetic val$sendOnStart:Z


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;Z)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 836
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    iput-boolean p2, p0, Lcom/kochava/android/tracker/Feature$3;->val$sendOnStart:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 33
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 843
    :try_start_0
    const-string v30, "getKVinit thread started."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 844
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "getKVinit post: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v31, v0

    move-object/from16 v0, v31

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v31, v0

    invoke-virtual/range {v31 .. v31}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 846
    const/16 v30, 0x1

    # invokes: Lcom/kochava/android/tracker/Feature;->createHttpClient(Z)Lorg/apache/http/client/HttpClient;
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$200(Z)Lorg/apache/http/client/HttpClient;

    move-result-object v19

    .line 848
    .local v19, "httpclient":Lorg/apache/http/client/HttpClient;
    invoke-interface/range {v19 .. v19}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v30

    # getter for: Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$300()Ljava/lang/String;

    move-result-object v31

    invoke-static/range {v30 .. v31}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 852
    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v30

    if-eqz v30, :cond_0

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->isEmpty()Z

    move-result v30

    if-eqz v30, :cond_1

    .line 854
    :cond_0
    const-string v30, "KVinit - hostControl was empty, using default"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 855
    const-string v30, "control.kochava.com"

    # setter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$402(Ljava/lang/String;)Ljava/lang/String;

    .line 859
    :cond_1
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "KVinit - posting to "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, "https://"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, "/track/kvinit"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 860
    new-instance v20, Lorg/apache/http/client/methods/HttpPost;

    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "https://"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, "/track/kvinit"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    move-object/from16 v0, v20

    move-object/from16 v1, v30

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 865
    .local v20, "httppost":Lorg/apache/http/client/methods/HttpPost;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v30, v0

    invoke-virtual/range {v30 .. v30}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v10

    .line 867
    .local v10, "data":Ljava/lang/String;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "kvinit data:"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 869
    new-instance v28, Lorg/apache/http/entity/StringEntity;

    const-string v30, "UTF-8"

    move-object/from16 v0, v28

    move-object/from16 v1, v30

    invoke-direct {v0, v10, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 870
    .local v28, "sentity":Lorg/apache/http/entity/StringEntity;
    new-instance v7, Lorg/apache/http/message/BasicHeader;

    const-string v30, "Content-Type"

    const-string v31, "application/xml"

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-direct {v7, v0, v1}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 871
    .local v7, "basicHeader":Lorg/apache/http/message/BasicHeader;
    invoke-virtual/range {v20 .. v20}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v30

    const-string v31, "http.protocol.expect-continue"

    const/16 v32, 0x0

    invoke-interface/range {v30 .. v32}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;

    .line 872
    move-object/from16 v0, v28

    invoke-virtual {v0, v7}, Lorg/apache/http/entity/StringEntity;->setContentType(Lorg/apache/http/Header;)V

    .line 873
    move-object/from16 v0, v20

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 875
    const-string v30, "Trying to post to KVinit."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 876
    invoke-interface/range {v19 .. v20}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v26

    .line 877
    .local v26, "response":Lorg/apache/http/HttpResponse;
    invoke-interface/range {v26 .. v26}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v13

    .line 879
    .local v13, "entity":Lorg/apache/http/HttpEntity;
    if-nez v13, :cond_3

    .line 881
    const-string v30, "Could not get a response entity from KVinit."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 1191
    .end local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v10    # "data":Ljava/lang/String;
    .end local v13    # "entity":Lorg/apache/http/HttpEntity;
    .end local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v26    # "response":Lorg/apache/http/HttpResponse;
    .end local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_2
    :goto_0
    return-void

    .line 887
    .restart local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v10    # "data":Ljava/lang/String;
    .restart local v13    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v26    # "response":Lorg/apache/http/HttpResponse;
    .restart local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_3
    :try_start_1
    const-string v30, "(KVinit) Grabbing Result..."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 888
    invoke-interface {v13}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/StringUtils;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v27

    .line 889
    .local v27, "result":Ljava/lang/String;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "(KVinit) Result: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    .line 890
    const/16 v24, 0x0

    .line 897
    .local v24, "parsedResult":Lorg/json/JSONObject;
    :try_start_2
    new-instance v25, Lorg/json/JSONObject;

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    .end local v24    # "parsedResult":Lorg/json/JSONObject;
    .local v25, "parsedResult":Lorg/json/JSONObject;
    move-object/from16 v24, v25

    .line 904
    .end local v25    # "parsedResult":Lorg/json/JSONObject;
    .restart local v24    # "parsedResult":Lorg/json/JSONObject;
    :goto_1
    if-eqz v24, :cond_8

    .line 907
    :try_start_3
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "(KVinit) Parsed result: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v24 .. v24}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    .line 911
    const/16 v16, 0x0

    .line 914
    .local v16, "flags":Lorg/json/JSONObject;
    :try_start_4
    const-string v30, "flags"

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v16

    .line 915
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Flags: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    .line 924
    :goto_2
    if-eqz v16, :cond_6

    .line 928
    :try_start_5
    const-string v30, "kochava_app_id"

    move-object/from16 v0, v16

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 929
    .local v6, "app_id":Ljava/lang/String;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "app_id: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual {v6}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 930
    # setter for: Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;
    invoke-static {v6}, Lcom/kochava/android/tracker/Feature;->access$502(Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 939
    .end local v6    # "app_id":Ljava/lang/String;
    :goto_3
    :try_start_6
    const-string v30, "session_tracking"

    move-object/from16 v0, v16

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v30

    const-string v31, "none"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_4

    .line 940
    const/16 v30, 0x0

    # setter for: Lcom/kochava/android/tracker/Feature;->canSendSession:Z
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$602(Z)Z
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 949
    :cond_4
    :goto_4
    :try_start_7
    const-string v30, "currency"

    move-object/from16 v0, v16

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v9

    .line 950
    .local v9, "currency":Ljava/lang/String;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "setting currency to: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 951
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    # invokes: Lcom/kochava/android/tracker/Feature;->setCurrency(Ljava/lang/String;)V
    invoke-static {v0, v9}, Lcom/kochava/android/tracker/Feature;->access$700(Lcom/kochava/android/tracker/Feature;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_10
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_7 .. :try_end_7} :catch_2

    .line 959
    .end local v9    # "currency":Ljava/lang/String;
    :goto_5
    :try_start_8
    const-string v30, "resend_initial"

    move-object/from16 v0, v16

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v30

    const-string v31, "true"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_5

    .line 961
    const-string v30, "resend_initial flag triggered."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 962
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v30, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$900(Lcom/kochava/android/tracker/Feature;)Landroid/content/Context;

    move-result-object v30

    const-string v31, "initPrefs"

    const/16 v32, 0x0

    invoke-virtual/range {v30 .. v32}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v30

    # setter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$802(Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences;

    .line 963
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v30

    invoke-interface/range {v30 .. v30}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v30

    const-string v31, "initBool"

    const-string v32, "false"

    invoke-interface/range {v30 .. v32}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v30

    invoke-interface/range {v30 .. v30}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_f
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_8 .. :try_end_8} :catch_2

    .line 971
    :cond_5
    :goto_6
    :try_start_9
    const-string v30, "delay_for_referrer_data"

    move-object/from16 v0, v16

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Ljava/lang/Integer;

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Integer;->intValue()I

    move-result v30

    # setter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1002(I)I

    .line 973
    # getter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1000()I

    move-result v30

    if-gez v30, :cond_a

    .line 975
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "referrerDelayFromInit returned was less than 0 ("

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    # getter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1000()I

    move-result v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, "), setting referrerDelayFromInit to 0."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 976
    const/16 v30, 0x0

    # setter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1002(I)I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_9 .. :try_end_9} :catch_2

    .line 995
    :cond_6
    :goto_7
    :try_start_a
    const-string v30, "blacklist"

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 996
    .local v8, "blacklist":Lorg/json/JSONArray;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "blacklist: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual {v8}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 997
    const/16 v21, 0x0

    .local v21, "i":I
    :goto_8
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v30

    move/from16 v0, v21

    move/from16 v1, v30

    if-ge v0, v1, :cond_d

    .line 999
    move/from16 v0, v21

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "android_id"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_c

    .line 1001
    const-string v30, "disabling: android_id"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1002
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "android_id"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    invoke-virtual/range {v30 .. v32}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 997
    :cond_7
    :goto_9
    add-int/lit8 v21, v21, 0x1

    goto :goto_8

    .line 899
    .end local v8    # "blacklist":Lorg/json/JSONArray;
    .end local v16    # "flags":Lorg/json/JSONObject;
    .end local v21    # "i":I
    :catch_0
    move-exception v12

    .line 901
    .local v12, "e":Lorg/json/JSONException;
    :try_start_b
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Error while parsing result json: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual {v12}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    goto/16 :goto_1

    .line 1097
    .end local v12    # "e":Lorg/json/JSONException;
    .end local v24    # "parsedResult":Lorg/json/JSONObject;
    .end local v27    # "result":Ljava/lang/String;
    :catch_1
    move-exception v12

    .line 1099
    .local v12, "e":Ljava/io/IOException;
    :try_start_c
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v30

    const-class v31, Ljavax/net/ssl/SSLException;

    invoke-virtual/range {v30 .. v31}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_15

    .line 1101
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "SSLException! Shutting down SDK and sending report."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1102
    # invokes: Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V
    invoke-static {v12}, Lcom/kochava/android/tracker/Feature;->access$1500(Ljava/lang/Exception;)V
    :try_end_c
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    goto/16 :goto_0

    .line 1114
    .end local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v10    # "data":Ljava/lang/String;
    .end local v12    # "e":Ljava/io/IOException;
    .end local v13    # "entity":Lorg/apache/http/HttpEntity;
    .end local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v26    # "response":Lorg/apache/http/HttpResponse;
    .end local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_2
    move-exception v12

    .line 1116
    .local v12, "e":Lorg/apache/http/client/ClientProtocolException;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "TrackTask"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 917
    .end local v12    # "e":Lorg/apache/http/client/ClientProtocolException;
    .restart local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v10    # "data":Ljava/lang/String;
    .restart local v13    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v16    # "flags":Lorg/json/JSONObject;
    .restart local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v24    # "parsedResult":Lorg/json/JSONObject;
    .restart local v26    # "response":Lorg/apache/http/HttpResponse;
    .restart local v27    # "result":Ljava/lang/String;
    .restart local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_3
    move-exception v12

    .line 919
    .local v12, "e":Lorg/json/JSONException;
    :try_start_d
    const-string v30, "KVinit response did not contain flags."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_d .. :try_end_d} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_d .. :try_end_d} :catch_2
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    goto/16 :goto_2

    .line 1108
    .end local v12    # "e":Lorg/json/JSONException;
    .end local v16    # "flags":Lorg/json/JSONObject;
    .end local v24    # "parsedResult":Lorg/json/JSONObject;
    .end local v27    # "result":Ljava/lang/String;
    :catch_4
    move-exception v12

    .line 1110
    .local v12, "e":Ljava/lang/OutOfMemoryError;
    :try_start_e
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "TrackTask"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_e
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    goto/16 :goto_0

    .line 1119
    .end local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v10    # "data":Ljava/lang/String;
    .end local v12    # "e":Ljava/lang/OutOfMemoryError;
    .end local v13    # "entity":Lorg/apache/http/HttpEntity;
    .end local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v26    # "response":Lorg/apache/http/HttpResponse;
    .end local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_5
    move-exception v12

    .line 1121
    .local v12, "e":Ljava/io/IOException;
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v30

    const-class v31, Ljavax/net/ssl/SSLException;

    invoke-virtual/range {v30 .. v31}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    .line 1123
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "SSLException! Shutting down SDK and sending report."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1124
    # invokes: Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V
    invoke-static {v12}, Lcom/kochava/android/tracker/Feature;->access$1500(Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 932
    .end local v12    # "e":Ljava/io/IOException;
    .restart local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v10    # "data":Ljava/lang/String;
    .restart local v13    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v16    # "flags":Lorg/json/JSONObject;
    .restart local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v24    # "parsedResult":Lorg/json/JSONObject;
    .restart local v26    # "response":Lorg/apache/http/HttpResponse;
    .restart local v27    # "result":Ljava/lang/String;
    .restart local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_6
    move-exception v12

    .line 934
    .local v12, "e":Lorg/json/JSONException;
    :try_start_f
    const-string v30, "KVinit response did not contain a app_id."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_f .. :try_end_f} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_f .. :try_end_f} :catch_2
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7

    goto/16 :goto_3

    .line 1130
    .end local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v10    # "data":Ljava/lang/String;
    .end local v12    # "e":Lorg/json/JSONException;
    .end local v13    # "entity":Lorg/apache/http/HttpEntity;
    .end local v16    # "flags":Lorg/json/JSONObject;
    .end local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v24    # "parsedResult":Lorg/json/JSONObject;
    .end local v26    # "response":Lorg/apache/http/HttpResponse;
    .end local v27    # "result":Ljava/lang/String;
    .end local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_7
    move-exception v12

    .line 1132
    .local v12, "e":Ljava/lang/Exception;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Unexpected error during KVinit communication."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1135
    .end local v12    # "e":Ljava/lang/Exception;
    :cond_8
    :goto_a
    const-string v30, "getKVinit thread ended, sending message to initHandler."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1137
    const/4 v11, 0x0

    .line 1142
    .local v11, "delay_tick":I
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v30

    const-string v31, "initBool"

    const-string v32, ""

    invoke-interface/range {v30 .. v32}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v31, "true"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-nez v30, :cond_1c

    .line 1144
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "adid"

    invoke-virtual/range {v30 .. v31}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Ljava/lang/Boolean;

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v30

    if-nez v30, :cond_17

    const/4 v4, 0x1

    .line 1145
    .local v4, "adidBlacklisted":Z
    :goto_b
    # getter for: Lcom/kochava/android/tracker/Feature;->suppress_adid:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1600()Z

    move-result v5

    .line 1148
    .local v5, "adidSuppressed":Z
    :goto_c
    # getter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1000()I

    move-result v30

    move/from16 v0, v30

    if-ge v11, v0, :cond_9

    .line 1151
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v30

    const-string v31, "initData"

    const-string v32, "noData"

    invoke-interface/range {v30 .. v32}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v31, "noData"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-nez v30, :cond_18

    const/16 v18, 0x1

    .line 1152
    .local v18, "haveReferrerData":Z
    :goto_d
    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v30

    if-eqz v30, :cond_19

    const/16 v17, 0x1

    .line 1155
    .local v17, "haveAdidResponse":Z
    :goto_e
    if-eqz v18, :cond_1a

    if-nez v4, :cond_9

    if-eqz v5, :cond_1a

    .line 1173
    .end local v17    # "haveAdidResponse":Z
    .end local v18    # "haveReferrerData":Z
    :cond_9
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "finished referrer data wait "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, " seconds."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1180
    .end local v4    # "adidBlacklisted":Z
    .end local v5    # "adidSuppressed":Z
    :goto_f
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v22

    .line 1181
    .local v22, "message":Landroid/os/Message;
    new-instance v23, Landroid/os/Bundle;

    invoke-direct/range {v23 .. v23}, Landroid/os/Bundle;-><init>()V

    .line 1182
    .local v23, "messageData":Landroid/os/Bundle;
    const-string v30, "sendonstart"

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/kochava/android/tracker/Feature$3;->val$sendOnStart:Z

    move/from16 v31, v0

    move-object/from16 v0, v23

    move-object/from16 v1, v30

    move/from16 v2, v31

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1183
    invoke-virtual/range {v22 .. v23}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1184
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v30, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1700(Lcom/kochava/android/tracker/Feature;)Landroid/os/Handler;

    move-result-object v30

    if-eqz v30, :cond_2

    .line 1186
    const-string v30, "sending message to initHandler."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1187
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$3;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v30, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1700(Lcom/kochava/android/tracker/Feature;)Landroid/os/Handler;

    move-result-object v30

    move-object/from16 v0, v30

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 942
    .end local v11    # "delay_tick":I
    .end local v22    # "message":Landroid/os/Message;
    .end local v23    # "messageData":Landroid/os/Bundle;
    .restart local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v10    # "data":Ljava/lang/String;
    .restart local v13    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v16    # "flags":Lorg/json/JSONObject;
    .restart local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v24    # "parsedResult":Lorg/json/JSONObject;
    .restart local v26    # "response":Lorg/apache/http/HttpResponse;
    .restart local v27    # "result":Ljava/lang/String;
    .restart local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_8
    move-exception v12

    .line 944
    .local v12, "e":Lorg/json/JSONException;
    :try_start_10
    const-string v30, "KVinit response did not contain flags."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_10 .. :try_end_10} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7

    goto/16 :goto_4

    .line 978
    .end local v12    # "e":Lorg/json/JSONException;
    :cond_a
    :try_start_11
    # getter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1000()I

    move-result v30

    const/16 v31, 0x78

    move/from16 v0, v30

    move/from16 v1, v31

    if-le v0, v1, :cond_b

    .line 980
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "referrerDelayFromInit returned was greater than 120 ("

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    # getter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1000()I

    move-result v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, "), setting referrerDelayFromInit to 120."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 981
    const/16 v30, 0x78

    # setter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1002(I)I

    goto/16 :goto_7

    .line 987
    :catch_9
    move-exception v30

    goto/16 :goto_7

    .line 984
    :cond_b
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "setting referrerDelayFromInit to: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    # getter for: Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1000()I

    move-result v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_11 .. :try_end_11} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_11 .. :try_end_11} :catch_2

    goto/16 :goto_7

    .line 1004
    .restart local v8    # "blacklist":Lorg/json/JSONArray;
    .restart local v21    # "i":I
    :cond_c
    :try_start_12
    move/from16 v0, v21

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "fb_attribution_id"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_f

    .line 1006
    const-string v30, "disabling: fb_attribution_id"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1007
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "fb_attribution_id"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    invoke-virtual/range {v30 .. v32}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_a
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_12 .. :try_end_12} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_12 .. :try_end_12} :catch_2
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_7

    goto/16 :goto_9

    .line 1032
    .end local v8    # "blacklist":Lorg/json/JSONArray;
    .end local v21    # "i":I
    :catch_a
    move-exception v12

    .line 1034
    .restart local v12    # "e":Lorg/json/JSONException;
    :try_start_13
    const-string v30, "KVinit response did not contain a blacklist."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_13 .. :try_end_13} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_13 .. :try_end_13} :catch_2
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_7

    .line 1039
    .end local v12    # "e":Lorg/json/JSONException;
    :cond_d
    :try_start_14
    const-string v30, "whitelist"

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v29

    .line 1040
    .local v29, "whitelist":Lorg/json/JSONArray;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "whitelist: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v29 .. v29}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1041
    const/16 v21, 0x0

    .restart local v21    # "i":I
    :goto_10
    invoke-virtual/range {v29 .. v29}, Lorg/json/JSONArray;->length()I

    move-result v30

    move/from16 v0, v21

    move/from16 v1, v30

    if-ge v0, v1, :cond_13

    .line 1043
    move-object/from16 v0, v29

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "email"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_e

    .line 1045
    const-string v30, "sending emails"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1046
    const/16 v30, 0x1

    # setter for: Lcom/kochava/android/tracker/Feature;->sendEmails:Z
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1202(Z)Z
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_b
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_14 .. :try_end_14} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_14 .. :try_end_14} :catch_2
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_7

    .line 1041
    :cond_e
    add-int/lit8 v21, v21, 0x1

    goto :goto_10

    .line 1009
    .end local v29    # "whitelist":Lorg/json/JSONArray;
    .restart local v8    # "blacklist":Lorg/json/JSONArray;
    :cond_f
    :try_start_15
    move/from16 v0, v21

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "imei"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_10

    .line 1011
    const-string v30, "disabling: imei"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1012
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "imei"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    invoke-virtual/range {v30 .. v32}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_9

    .line 1014
    :cond_10
    move/from16 v0, v21

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "mac"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_11

    .line 1016
    const-string v30, "disabling: mac"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1017
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "mac"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    invoke-virtual/range {v30 .. v32}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_9

    .line 1019
    :cond_11
    move/from16 v0, v21

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "odin"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_12

    .line 1021
    const-string v30, "disabling: odin"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1022
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "odin"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    invoke-virtual/range {v30 .. v32}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_9

    .line 1024
    :cond_12
    move/from16 v0, v21

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v30

    const-string v31, "adid"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_7

    .line 1026
    const-string v30, "disabling: adid"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1027
    # getter for: Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1100()Ljava/util/HashMap;

    move-result-object v30

    const-string v31, "adid"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    invoke-virtual/range {v30 .. v32}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_a
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_15 .. :try_end_15} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_7

    goto/16 :goto_9

    .line 1051
    .end local v8    # "blacklist":Lorg/json/JSONArray;
    .end local v21    # "i":I
    :catch_b
    move-exception v30

    .line 1063
    :cond_13
    :try_start_16
    const-string v30, "eventname_blacklist"

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 1064
    .local v15, "eventnameBlacklistJSONArray":Lorg/json/JSONArray;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "saving eventname_blacklist: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual {v15}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1066
    # getter for: Lcom/kochava/android/tracker/Feature;->eventnameBlacklist:Ljava/util/ArrayList;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1300()Ljava/util/ArrayList;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->clear()V

    .line 1068
    const/16 v21, 0x0

    .restart local v21    # "i":I
    :goto_11
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    move-result v30

    move/from16 v0, v21

    move/from16 v1, v30

    if-ge v0, v1, :cond_14

    .line 1070
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "eventname_blacklist item: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move/from16 v0, v21

    invoke-virtual {v15, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v31

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1071
    # getter for: Lcom/kochava/android/tracker/Feature;->eventnameBlacklist:Ljava/util/ArrayList;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1300()Ljava/util/ArrayList;

    move-result-object v30

    move/from16 v0, v21

    invoke-virtual {v15, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v31

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_16
    .catch Lorg/json/JSONException; {:try_start_16 .. :try_end_16} :catch_c
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_16 .. :try_end_16} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_16 .. :try_end_16} :catch_2
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_7

    .line 1068
    add-int/lit8 v21, v21, 0x1

    goto :goto_11

    .line 1075
    .end local v15    # "eventnameBlacklistJSONArray":Lorg/json/JSONArray;
    .end local v21    # "i":I
    :catch_c
    move-exception v12

    .line 1077
    .restart local v12    # "e":Lorg/json/JSONException;
    :try_start_17
    const-string v30, "KVinit response did not contain an eventname_blacklist."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_17 .. :try_end_17} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_17 .. :try_end_17} :catch_2
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_7

    .line 1082
    .end local v12    # "e":Lorg/json/JSONException;
    :cond_14
    :try_start_18
    const-string v30, "error"

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1083
    .local v14, "error":Ljava/lang/String;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "There was a problem getting the KVinit response: "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1084
    const-string v30, "invalid kochava_app_id, partner_name required for app_id autoprovisioning"

    move-object/from16 v0, v30

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_8

    .line 1086
    const/16 v30, 0x1

    # setter for: Lcom/kochava/android/tracker/Feature;->badInit:Z
    invoke-static/range {v30 .. v30}, Lcom/kochava/android/tracker/Feature;->access$1402(Z)Z
    :try_end_18
    .catch Lorg/json/JSONException; {:try_start_18 .. :try_end_18} :catch_d
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_18 .. :try_end_18} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_18 .. :try_end_18} :catch_2
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_7

    goto/16 :goto_0

    .line 1091
    .end local v14    # "error":Ljava/lang/String;
    :catch_d
    move-exception v12

    .line 1093
    .restart local v12    # "e":Lorg/json/JSONException;
    :try_start_19
    const-string v30, "KVinit response did not contain an error."

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_19 .. :try_end_19} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_19 .. :try_end_19} :catch_2
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_7

    goto/16 :goto_a

    .line 1105
    .end local v16    # "flags":Lorg/json/JSONObject;
    .end local v24    # "parsedResult":Lorg/json/JSONObject;
    .end local v27    # "result":Ljava/lang/String;
    .local v12, "e":Ljava/io/IOException;
    :cond_15
    :try_start_1a
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "TrackTask"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_1a
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1a .. :try_end_1a} :catch_2
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_7

    goto/16 :goto_0

    .line 1127
    .end local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v10    # "data":Ljava/lang/String;
    .end local v13    # "entity":Lorg/apache/http/HttpEntity;
    .end local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v26    # "response":Lorg/apache/http/HttpResponse;
    .end local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_16
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "TrackTask"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1144
    .end local v12    # "e":Ljava/io/IOException;
    .restart local v11    # "delay_tick":I
    :cond_17
    const/4 v4, 0x0

    goto/16 :goto_b

    .line 1151
    .restart local v4    # "adidBlacklisted":Z
    .restart local v5    # "adidSuppressed":Z
    :cond_18
    const/16 v18, 0x0

    goto/16 :goto_d

    .line 1152
    .restart local v18    # "haveReferrerData":Z
    :cond_19
    const/16 v17, 0x0

    goto/16 :goto_e

    .line 1157
    .restart local v17    # "haveAdidResponse":Z
    :cond_1a
    if-eqz v18, :cond_1b

    if-nez v17, :cond_9

    .line 1163
    :cond_1b
    const-wide/16 v30, 0x3e8

    :try_start_1b
    invoke-static/range {v30 .. v31}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1b
    .catch Ljava/lang/InterruptedException; {:try_start_1b .. :try_end_1b} :catch_e

    .line 1171
    :goto_12
    add-int/lit8 v11, v11, 0x1

    .line 1172
    goto/16 :goto_c

    .line 1165
    :catch_e
    move-exception v12

    .line 1167
    .local v12, "e":Ljava/lang/InterruptedException;
    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Unexpected error during referral data wait loop "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_12

    .line 1177
    .end local v4    # "adidBlacklisted":Z
    .end local v5    # "adidSuppressed":Z
    .end local v12    # "e":Ljava/lang/InterruptedException;
    .end local v17    # "haveAdidResponse":Z
    .end local v18    # "haveReferrerData":Z
    :cond_1c
    const-string v30, "already sent initial, skiping any referrer data wait"

    invoke-static/range {v30 .. v30}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto/16 :goto_f

    .line 966
    .end local v11    # "delay_tick":I
    .restart local v7    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v10    # "data":Ljava/lang/String;
    .restart local v13    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v16    # "flags":Lorg/json/JSONObject;
    .restart local v19    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v20    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v24    # "parsedResult":Lorg/json/JSONObject;
    .restart local v26    # "response":Lorg/apache/http/HttpResponse;
    .restart local v27    # "result":Ljava/lang/String;
    .restart local v28    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_f
    move-exception v30

    goto/16 :goto_6

    .line 953
    :catch_10
    move-exception v30

    goto/16 :goto_5
.end method
