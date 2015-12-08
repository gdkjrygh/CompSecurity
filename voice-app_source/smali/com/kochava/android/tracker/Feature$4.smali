.class final Lcom/kochava/android/tracker/Feature$4;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 23

    .prologue
    .line 1214
    const/16 v17, 0x3c

    .line 1219
    .local v17, "retry":I
    const/16 v20, 0x1

    :try_start_0
    # invokes: Lcom/kochava/android/tracker/Feature;->createHttpClient(Z)Lorg/apache/http/client/HttpClient;
    invoke-static/range {v20 .. v20}, Lcom/kochava/android/tracker/Feature;->access$200(Z)Lorg/apache/http/client/HttpClient;

    move-result-object v8

    .line 1221
    .local v8, "httpclient":Lorg/apache/http/client/HttpClient;
    invoke-interface {v8}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v20

    # getter for: Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$300()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 1225
    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v20

    if-eqz v20, :cond_0

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->isEmpty()Z

    move-result v20

    if-eqz v20, :cond_1

    .line 1227
    :cond_0
    const-string v20, "KVquery - hostControl was empty, using default"

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1228
    const-string v20, "control.kochava.com"

    # setter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static/range {v20 .. v20}, Lcom/kochava/android/tracker/Feature;->access$402(Ljava/lang/String;)Ljava/lang/String;

    .line 1231
    :cond_1
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "https://"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "/track/kvquery"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1234
    .local v6, "endpoint":Ljava/lang/String;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "KVquery - posting to "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1235
    new-instance v9, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v9, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 1239
    .local v9, "httppost":Lorg/apache/http/client/methods/HttpPost;
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 1242
    .local v10, "kvquerydataholder":Lorg/json/JSONObject;
    const-string v20, "action"

    const-string v21, "get_attribution"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1243
    const-string v20, "kochava_app_id"

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$500()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1244
    const-string v20, "kochava_device_id"

    # invokes: Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1800()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1245
    const-string v20, "sdk_version"

    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "Android20150511"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    sget-object v22, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1246
    const-string v20, "sdk_protocol"

    const-string v21, "3"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1250
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1252
    .local v4, "data":Ljava/lang/String;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "KVquery data:"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1254
    new-instance v19, Lorg/apache/http/entity/StringEntity;

    const-string v20, "UTF-8"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-direct {v0, v4, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1255
    .local v19, "sentity":Lorg/apache/http/entity/StringEntity;
    new-instance v3, Lorg/apache/http/message/BasicHeader;

    const-string v20, "Content-Type"

    const-string v21, "application/xml"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-direct {v3, v0, v1}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1256
    .local v3, "basicHeader":Lorg/apache/http/message/BasicHeader;
    invoke-virtual {v9}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v20

    const-string v21, "http.protocol.expect-continue"

    const/16 v22, 0x0

    invoke-interface/range {v20 .. v22}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;

    .line 1257
    move-object/from16 v0, v19

    invoke-virtual {v0, v3}, Lorg/apache/http/entity/StringEntity;->setContentType(Lorg/apache/http/Header;)V

    .line 1258
    move-object/from16 v0, v19

    invoke-virtual {v9, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 1260
    const-string v20, "Trying to post to KVquery."

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1261
    invoke-interface {v8, v9}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v15

    .line 1262
    .local v15, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v15}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v7

    .line 1264
    .local v7, "entity":Lorg/apache/http/HttpEntity;
    if-nez v7, :cond_3

    .line 1266
    const-string v20, "Could not get a response entity from KVquery."

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 1387
    .end local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v4    # "data":Ljava/lang/String;
    .end local v6    # "endpoint":Ljava/lang/String;
    .end local v7    # "entity":Lorg/apache/http/HttpEntity;
    .end local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .end local v15    # "response":Lorg/apache/http/HttpResponse;
    .end local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_2
    :goto_0
    return-void

    .line 1272
    .restart local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v4    # "data":Ljava/lang/String;
    .restart local v6    # "endpoint":Ljava/lang/String;
    .restart local v7    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .restart local v15    # "response":Lorg/apache/http/HttpResponse;
    .restart local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_3
    :try_start_1
    const-string v20, "(KVquery) Grabbing Result..."

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1273
    invoke-interface {v7}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/StringUtils;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v16

    .line 1275
    .local v16, "result":Ljava/lang/String;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "(KVquery) Result: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    .line 1276
    const/4 v13, 0x0

    .line 1281
    .local v13, "parsedResult":Lorg/json/JSONObject;
    :try_start_2
    new-instance v14, Lorg/json/JSONObject;

    move-object/from16 v0, v16

    invoke-direct {v14, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    .end local v13    # "parsedResult":Lorg/json/JSONObject;
    .local v14, "parsedResult":Lorg/json/JSONObject;
    move-object v13, v14

    .line 1288
    .end local v14    # "parsedResult":Lorg/json/JSONObject;
    .restart local v13    # "parsedResult":Lorg/json/JSONObject;
    :goto_1
    if-eqz v13, :cond_4

    .line 1291
    :try_start_3
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "(KVquery) Parsed result: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    .line 1294
    const/16 v18, 0x0

    .line 1297
    .local v18, "returnData":Lorg/json/JSONObject;
    :try_start_4
    const-string v20, "data"

    move-object/from16 v0, v20

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v18

    .line 1298
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "(KVquery) return data: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    .line 1306
    :goto_2
    if-eqz v18, :cond_4

    .line 1308
    :try_start_5
    const-string v2, ""
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 1311
    .local v2, "attribution":Ljava/lang/String;
    :try_start_6
    const-string v20, "attribution"

    move-object/from16 v0, v18

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    move-result-object v2

    .line 1320
    :goto_3
    :try_start_7
    const-string v20, "retry"

    move-object/from16 v0, v18

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    .line 1322
    if-gez v17, :cond_4

    .line 1324
    # getter for: Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1900()Landroid/content/SharedPreferences;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v20

    const-string v21, "attributionData"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1326
    # getter for: Lcom/kochava/android/tracker/Feature;->attributionDataHandler:Landroid/os/Handler;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2000()Landroid/os/Handler;

    move-result-object v20

    if-eqz v20, :cond_4

    .line 1328
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v11

    .line 1329
    .local v11, "message":Landroid/os/Message;
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 1330
    .local v12, "messageData":Landroid/os/Bundle;
    const-string v20, "attributionData"

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1331
    invoke-virtual {v11, v12}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1332
    # getter for: Lcom/kochava/android/tracker/Feature;->attributionDataHandler:Landroid/os/Handler;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2000()Landroid/os/Handler;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 1385
    .end local v2    # "attribution":Ljava/lang/String;
    .end local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v4    # "data":Ljava/lang/String;
    .end local v6    # "endpoint":Ljava/lang/String;
    .end local v7    # "entity":Lorg/apache/http/HttpEntity;
    .end local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .end local v11    # "message":Landroid/os/Message;
    .end local v12    # "messageData":Landroid/os/Bundle;
    .end local v13    # "parsedResult":Lorg/json/JSONObject;
    .end local v15    # "response":Lorg/apache/http/HttpResponse;
    .end local v16    # "result":Ljava/lang/String;
    .end local v18    # "returnData":Lorg/json/JSONObject;
    .end local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_4
    :goto_4
    if-lez v17, :cond_2

    .line 1386
    invoke-static/range {v17 .. v17}, Lcom/kochava/android/tracker/Feature;->sendKVQuery(I)V

    goto/16 :goto_0

    .line 1283
    .restart local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v4    # "data":Ljava/lang/String;
    .restart local v6    # "endpoint":Ljava/lang/String;
    .restart local v7    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .restart local v13    # "parsedResult":Lorg/json/JSONObject;
    .restart local v15    # "response":Lorg/apache/http/HttpResponse;
    .restart local v16    # "result":Ljava/lang/String;
    .restart local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_0
    move-exception v5

    .line 1285
    .local v5, "e":Lorg/json/JSONException;
    :try_start_8
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "(KVquery) Error while parsing result json: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v5}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    goto/16 :goto_1

    .line 1346
    .end local v5    # "e":Lorg/json/JSONException;
    .end local v13    # "parsedResult":Lorg/json/JSONObject;
    .end local v16    # "result":Ljava/lang/String;
    :catch_1
    move-exception v5

    .line 1349
    .local v5, "e":Ljava/io/IOException;
    :try_start_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v20

    const-class v21, Ljavax/net/ssl/SSLException;

    invoke-virtual/range {v20 .. v21}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_5

    .line 1351
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "SSLException! Shutting down SDK and sending report."

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1352
    # invokes: Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V
    invoke-static {v5}, Lcom/kochava/android/tracker/Feature;->access$1500(Ljava/lang/Exception;)V
    :try_end_9
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    goto/16 :goto_0

    .line 1364
    .end local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v4    # "data":Ljava/lang/String;
    .end local v5    # "e":Ljava/io/IOException;
    .end local v6    # "endpoint":Ljava/lang/String;
    .end local v7    # "entity":Lorg/apache/http/HttpEntity;
    .end local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .end local v15    # "response":Lorg/apache/http/HttpResponse;
    .end local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_2
    move-exception v5

    .line 1366
    .local v5, "e":Lorg/apache/http/client/ClientProtocolException;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "KVquery ClientProtocolException: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1300
    .end local v5    # "e":Lorg/apache/http/client/ClientProtocolException;
    .restart local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v4    # "data":Ljava/lang/String;
    .restart local v6    # "endpoint":Ljava/lang/String;
    .restart local v7    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .restart local v13    # "parsedResult":Lorg/json/JSONObject;
    .restart local v15    # "response":Lorg/apache/http/HttpResponse;
    .restart local v16    # "result":Ljava/lang/String;
    .restart local v18    # "returnData":Lorg/json/JSONObject;
    .restart local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_3
    move-exception v5

    .line 1302
    .local v5, "e":Lorg/json/JSONException;
    :try_start_a
    const-string v20, "KVquery response did not contain data."

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto/16 :goto_2

    .line 1358
    .end local v5    # "e":Lorg/json/JSONException;
    .end local v13    # "parsedResult":Lorg/json/JSONObject;
    .end local v16    # "result":Ljava/lang/String;
    .end local v18    # "returnData":Lorg/json/JSONObject;
    :catch_4
    move-exception v5

    .line 1360
    .local v5, "e":Ljava/lang/OutOfMemoryError;
    :try_start_b
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "KVquery OutOfMemoryError: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_b
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    goto/16 :goto_0

    .line 1369
    .end local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v4    # "data":Ljava/lang/String;
    .end local v5    # "e":Ljava/lang/OutOfMemoryError;
    .end local v6    # "endpoint":Ljava/lang/String;
    .end local v7    # "entity":Lorg/apache/http/HttpEntity;
    .end local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .end local v15    # "response":Lorg/apache/http/HttpResponse;
    .end local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_5
    move-exception v5

    .line 1371
    .local v5, "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v20

    const-class v21, Ljavax/net/ssl/SSLException;

    invoke-virtual/range {v20 .. v21}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_6

    .line 1373
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "SSLException! Shutting down SDK and sending report."

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1374
    # invokes: Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V
    invoke-static {v5}, Lcom/kochava/android/tracker/Feature;->access$1500(Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 1313
    .end local v5    # "e":Ljava/io/IOException;
    .restart local v2    # "attribution":Ljava/lang/String;
    .restart local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v4    # "data":Ljava/lang/String;
    .restart local v6    # "endpoint":Ljava/lang/String;
    .restart local v7    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .restart local v13    # "parsedResult":Lorg/json/JSONObject;
    .restart local v15    # "response":Lorg/apache/http/HttpResponse;
    .restart local v16    # "result":Ljava/lang/String;
    .restart local v18    # "returnData":Lorg/json/JSONObject;
    .restart local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_6
    move-exception v5

    .line 1315
    .local v5, "e":Lorg/json/JSONException;
    :try_start_c
    const-string v20, "KVquery response did not contain attribution data, or JSON was invalid."

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_c .. :try_end_c} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    goto/16 :goto_3

    .line 1380
    .end local v2    # "attribution":Ljava/lang/String;
    .end local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v4    # "data":Ljava/lang/String;
    .end local v5    # "e":Lorg/json/JSONException;
    .end local v6    # "endpoint":Ljava/lang/String;
    .end local v7    # "entity":Lorg/apache/http/HttpEntity;
    .end local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .end local v13    # "parsedResult":Lorg/json/JSONObject;
    .end local v15    # "response":Lorg/apache/http/HttpResponse;
    .end local v16    # "result":Ljava/lang/String;
    .end local v18    # "returnData":Lorg/json/JSONObject;
    .end local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_7
    move-exception v5

    .line 1382
    .local v5, "e":Ljava/lang/Exception;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "Unexpected error during KVquery communication. "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 1336
    .end local v5    # "e":Ljava/lang/Exception;
    .restart local v2    # "attribution":Ljava/lang/String;
    .restart local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .restart local v4    # "data":Ljava/lang/String;
    .restart local v6    # "endpoint":Ljava/lang/String;
    .restart local v7    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .restart local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .restart local v13    # "parsedResult":Lorg/json/JSONObject;
    .restart local v15    # "response":Lorg/apache/http/HttpResponse;
    .restart local v16    # "result":Ljava/lang/String;
    .restart local v18    # "returnData":Lorg/json/JSONObject;
    .restart local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_8
    move-exception v5

    .line 1338
    .local v5, "e":Lorg/json/JSONException;
    :try_start_d
    const-string v20, "KVquery response did not contain a retry value, or JSON was invalid."

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_d .. :try_end_d} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_d .. :try_end_d} :catch_2
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    goto/16 :goto_4

    .line 1355
    .end local v2    # "attribution":Ljava/lang/String;
    .end local v13    # "parsedResult":Lorg/json/JSONObject;
    .end local v16    # "result":Ljava/lang/String;
    .end local v18    # "returnData":Lorg/json/JSONObject;
    .local v5, "e":Ljava/io/IOException;
    :cond_5
    :try_start_e
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "KVquery IOException: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_e
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_5
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    goto/16 :goto_0

    .line 1377
    .end local v3    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v4    # "data":Ljava/lang/String;
    .end local v6    # "endpoint":Ljava/lang/String;
    .end local v7    # "entity":Lorg/apache/http/HttpEntity;
    .end local v8    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httppost":Lorg/apache/http/client/methods/HttpPost;
    .end local v10    # "kvquerydataholder":Lorg/json/JSONObject;
    .end local v15    # "response":Lorg/apache/http/HttpResponse;
    .end local v19    # "sentity":Lorg/apache/http/entity/StringEntity;
    :cond_6
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "KVquery IOException: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_0
.end method
