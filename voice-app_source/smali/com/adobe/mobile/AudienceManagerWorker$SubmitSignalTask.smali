.class public Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;
.super Ljava/lang/Object;
.source "AudienceManagerWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/AudienceManagerWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SubmitSignalTask"
.end annotation


# instance fields
.field public final callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 151
    .local p1, "initData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .local p2, "initCallback":Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;, "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->data:Ljava/util/Map;

    .line 154
    iput-object p2, p0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    .line 155
    return-void
.end method


# virtual methods
.method public run()V
    .locals 29

    .prologue
    .line 161
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 165
    .local v3, "callbackData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Lcom/adobe/mobile/MobileConfig;->mobileUsingAudienceManager()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v25

    if-nez v25, :cond_1

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    .line 271
    :cond_0
    :goto_0
    return-void

    .line 170
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Lcom/adobe/mobile/MobileConfig;->getPrivacyStatus()Lcom/adobe/mobile/MobilePrivacyStatus;

    move-result-object v25

    sget-object v26, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_OUT:Lcom/adobe/mobile/MobilePrivacyStatus;

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    if-ne v0, v1, :cond_2

    .line 171
    const-string v25, "Audience Manager - Privacy status is set to opt out, no signals will be submitted."

    const/16 v26, 0x0

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 175
    :cond_2
    :try_start_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->data:Ljava/util/Map;

    move-object/from16 v25, v0

    # invokes: Lcom/adobe/mobile/AudienceManagerWorker;->BuildSchemaRequest(Ljava/util/Map;)Ljava/lang/String;
    invoke-static/range {v25 .. v25}, Lcom/adobe/mobile/AudienceManagerWorker;->access$400(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v16

    .line 177
    .local v16, "requestUrl":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v25

    const/16 v26, 0x1

    move/from16 v0, v25

    move/from16 v1, v26

    if-gt v0, v1, :cond_3

    .line 178
    const-string v25, "Audience Manager - Unable to create URL object"

    const/16 v26, 0x0

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 182
    :cond_3
    :try_start_3
    const-string v25, "Audience Manager - request (%s)"

    const/16 v26, 0x1

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    aput-object v16, v26, v27

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .local v19, "sb":Ljava/lang/StringBuilder;
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 186
    .local v4, "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v10, Lorg/apache/http/client/methods/HttpGet;

    move-object/from16 v0, v16

    invoke-direct {v10, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 188
    .local v10, "get":Lorg/apache/http/client/methods/HttpGet;
    invoke-virtual {v4, v10}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v11

    .line 190
    .local v11, "httpResponse":Lorg/apache/http/HttpResponse;
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v21

    .line 191
    .local v21, "statusLine":Lorg/apache/http/StatusLine;
    invoke-interface/range {v21 .. v21}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v20

    .line 193
    .local v20, "statusCode":I
    const/16 v25, 0xc8

    move/from16 v0, v20

    move/from16 v1, v25

    if-ne v0, v1, :cond_5

    .line 194
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v9

    .line 195
    .local v9, "entity":Lorg/apache/http/HttpEntity;
    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v5

    .line 196
    .local v5, "content":Ljava/io/InputStream;
    new-instance v15, Ljava/io/BufferedReader;

    new-instance v25, Ljava/io/InputStreamReader;

    const-string v26, "UTF-8"

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    invoke-direct {v0, v5, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object/from16 v0, v25

    invoke-direct {v15, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 199
    .local v15, "reader":Ljava/io/BufferedReader;
    :goto_1
    invoke-virtual {v15}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v14

    .local v14, "line":Ljava/lang/String;
    if-eqz v14, :cond_4

    .line 200
    move-object/from16 v0, v19

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 251
    .end local v4    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v5    # "content":Ljava/io/InputStream;
    .end local v9    # "entity":Lorg/apache/http/HttpEntity;
    .end local v10    # "get":Lorg/apache/http/client/methods/HttpGet;
    .end local v11    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v14    # "line":Ljava/lang/String;
    .end local v15    # "reader":Ljava/io/BufferedReader;
    .end local v16    # "requestUrl":Ljava/lang/String;
    .end local v19    # "sb":Ljava/lang/StringBuilder;
    .end local v20    # "statusCode":I
    .end local v21    # "statusLine":Lorg/apache/http/StatusLine;
    :catch_0
    move-exception v8

    .line 252
    .local v8, "e":Ljava/io/IOException;
    :try_start_4
    const-string v25, "Audience Manager - Unable to read response from server (%s)"

    const/16 v26, 0x1

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    invoke-virtual {v8}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v28

    aput-object v28, v26, v27

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 203
    .end local v8    # "e":Ljava/io/IOException;
    .restart local v4    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v5    # "content":Ljava/io/InputStream;
    .restart local v9    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v10    # "get":Lorg/apache/http/client/methods/HttpGet;
    .restart local v11    # "httpResponse":Lorg/apache/http/HttpResponse;
    .restart local v14    # "line":Ljava/lang/String;
    .restart local v15    # "reader":Ljava/io/BufferedReader;
    .restart local v16    # "requestUrl":Ljava/lang/String;
    .restart local v19    # "sb":Ljava/lang/StringBuilder;
    .restart local v20    # "statusCode":I
    .restart local v21    # "statusLine":Lorg/apache/http/StatusLine;
    :cond_4
    :try_start_5
    invoke-virtual {v15}, Ljava/io/BufferedReader;->close()V

    .line 206
    .end local v5    # "content":Ljava/io/InputStream;
    .end local v9    # "entity":Lorg/apache/http/HttpEntity;
    .end local v14    # "line":Ljava/lang/String;
    .end local v15    # "reader":Ljava/io/BufferedReader;
    :cond_5
    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 209
    .local v17, "response":Ljava/lang/String;
    new-instance v13, Lorg/json/JSONObject;

    move-object/from16 v0, v17

    invoke-direct {v13, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 212
    .local v13, "jsonResponse":Lorg/json/JSONObject;
    const-string v25, "dests"

    move-object/from16 v0, v25

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 213
    .local v7, "dests":Lorg/json/JSONArray;
    const/4 v12, 0x0

    .local v12, "i":I
    :goto_2
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v25

    move/from16 v0, v25

    if-ge v12, v0, :cond_7

    .line 214
    invoke-virtual {v7, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 215
    .local v6, "dest":Lorg/json/JSONObject;
    const-string v25, "c"

    move-object/from16 v0, v25

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 216
    .local v24, "url":Ljava/lang/String;
    if-eqz v24, :cond_6

    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v25

    if-lez v25, :cond_6

    .line 217
    const/16 v25, 0x0

    const/16 v26, 0x1388

    const-string v27, "Audience Manager"

    invoke-static/range {v24 .. v27}, Lcom/adobe/mobile/RequestHandler;->sendGenericRequest(Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)V

    .line 213
    :cond_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 222
    .end local v6    # "dest":Lorg/json/JSONObject;
    .end local v24    # "url":Ljava/lang/String;
    :cond_7
    const-string v25, "uuid"

    move-object/from16 v0, v25

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    # invokes: Lcom/adobe/mobile/AudienceManagerWorker;->SetUUID(Ljava/lang/String;)V
    invoke-static/range {v25 .. v25}, Lcom/adobe/mobile/AudienceManagerWorker;->access$500(Ljava/lang/String;)V

    .line 225
    const-string v25, "stuff"

    move-object/from16 v0, v25

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v23

    .line 228
    .local v23, "stuffArray":Lorg/json/JSONArray;
    new-instance v18, Ljava/util/HashMap;

    invoke-direct/range {v18 .. v18}, Ljava/util/HashMap;-><init>()V

    .line 229
    .local v18, "returnedMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v12, 0x0

    :goto_3
    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONArray;->length()I

    move-result v25

    move/from16 v0, v25

    if-ge v12, v0, :cond_9

    .line 230
    move-object/from16 v0, v23

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v22

    .line 231
    .local v22, "stuff":Lorg/json/JSONObject;
    if-eqz v22, :cond_8

    .line 232
    const-string v25, "cn"

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const-string v26, "cv"

    .line 233
    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    .line 232
    move-object/from16 v0, v18

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 238
    .end local v22    # "stuff":Lorg/json/JSONObject;
    :cond_9
    invoke-virtual/range {v18 .. v18}, Ljava/util/HashMap;->size()I

    move-result v25

    if-gtz v25, :cond_a

    .line 239
    const-string v25, "Audience Manager - response was empty"

    const/16 v26, 0x0

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 243
    :cond_a
    :try_start_6
    const-string v25, "Audience Manager - response (%s)"

    const/16 v26, 0x1

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    aput-object v18, v26, v27

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    # invokes: Lcom/adobe/mobile/AudienceManagerWorker;->SetVisitorProfile(Ljava/util/Map;)V
    invoke-static/range {v18 .. v18}, Lcom/adobe/mobile/AudienceManagerWorker;->access$600(Ljava/util/Map;)V

    .line 249
    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 254
    .end local v4    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v7    # "dests":Lorg/json/JSONArray;
    .end local v10    # "get":Lorg/apache/http/client/methods/HttpGet;
    .end local v11    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v12    # "i":I
    .end local v13    # "jsonResponse":Lorg/json/JSONObject;
    .end local v16    # "requestUrl":Ljava/lang/String;
    .end local v17    # "response":Ljava/lang/String;
    .end local v18    # "returnedMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v19    # "sb":Ljava/lang/StringBuilder;
    .end local v20    # "statusCode":I
    .end local v21    # "statusLine":Lorg/apache/http/StatusLine;
    .end local v23    # "stuffArray":Lorg/json/JSONArray;
    :catch_1
    move-exception v8

    .line 255
    .local v8, "e":Lorg/json/JSONException;
    :try_start_7
    const-string v25, "Audience Manager - Unable to parse JSON data (%s)"

    const/16 v26, 0x1

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    invoke-virtual {v8}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v28

    aput-object v28, v26, v27

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 257
    .end local v8    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v8

    .line 258
    .local v8, "e":Ljava/lang/Exception;
    :try_start_8
    const-string v25, "Audience Manager - Unexpected error parsing result (%s)"

    const/16 v26, 0x1

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    invoke-virtual {v8}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v28

    aput-object v28, v26, v27

    invoke-static/range {v25 .. v26}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v25, v0

    if-eqz v25, :cond_0

    .line 263
    new-instance v25, Ljava/lang/Thread;

    new-instance v26, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v25 .. v26}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 262
    .end local v8    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    move-object/from16 v26, v0

    if-eqz v26, :cond_b

    .line 263
    new-instance v26, Ljava/lang/Thread;

    new-instance v27, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;

    move-object/from16 v0, v27

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;-><init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V

    invoke-direct/range {v26 .. v27}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 268
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Thread;->start()V

    :cond_b
    throw v25
.end method
