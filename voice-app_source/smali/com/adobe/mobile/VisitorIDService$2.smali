.class Lcom/adobe/mobile/VisitorIDService$2;
.super Ljava/lang/Object;
.source "VisitorIDService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/VisitorIDService;->idSync(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/VisitorIDService;

.field final synthetic val$identifiersCopy:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/VisitorIDService;Ljava/util/HashMap;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 110
    iput-object p1, p0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    iput-object p2, p0, Lcom/adobe/mobile/VisitorIDService$2;->val$identifiersCopy:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 19

    .prologue
    .line 113
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/adobe/mobile/MobileConfig;->getVisitorIdServiceEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 223
    :cond_0
    :goto_0
    return-void

    .line 117
    :cond_1
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/adobe/mobile/MobileConfig;->getMarketingCloudOrganizationId()Ljava/lang/String;

    move-result-object v14

    .line 118
    .local v14, "orgId":Ljava/lang/String;
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v4

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_lastSync:J
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$400(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$300(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-lez v3, :cond_6

    const/4 v13, 0x1

    .line 119
    .local v13, "needResync":Z
    :goto_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->val$identifiersCopy:Ljava/util/HashMap;

    if-eqz v3, :cond_7

    const/4 v12, 0x1

    .line 121
    .local v12, "hasIdentifiers":Z
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    if-nez v12, :cond_2

    if-eqz v13, :cond_0

    .line 125
    :cond_2
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/adobe/mobile/MobileConfig;->getSSL()Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, "https"

    :goto_3
    move-object/from16 v0, v17

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .local v17, "url":Ljava/lang/StringBuilder;
    const-string v3, "://"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    const-string v3, "dpm.demdex.net"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    const-string v3, "/id?d_ver=2&d_orgid="

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    move-object/from16 v0, v17

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 132
    const-string v3, "&"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    const-string v3, "d_mid"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    const-string v3, "="

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    :cond_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 139
    const-string v3, "&"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    const-string v3, "d_blob"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    const-string v3, "="

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    :cond_4
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 146
    const-string v3, "&"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    const-string v3, "dcs_region"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    const-string v3, "="

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    :cond_5
    if-eqz v12, :cond_9

    .line 154
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->val$identifiersCopy:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 155
    .local v10, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v3, "&d_cid_ic="

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/adobe/mobile/StaticMethods;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    const-string v3, "%01"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/adobe/mobile/StaticMethods;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 118
    .end local v10    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v12    # "hasIdentifiers":Z
    .end local v13    # "needResync":Z
    .end local v17    # "url":Ljava/lang/StringBuilder;
    :cond_6
    const/4 v13, 0x0

    goto/16 :goto_1

    .line 119
    .restart local v13    # "needResync":Z
    :cond_7
    const/4 v12, 0x0

    goto/16 :goto_2

    .line 125
    .restart local v12    # "hasIdentifiers":Z
    :cond_8
    const-string v3, "http"

    goto/16 :goto_3

    .line 162
    .restart local v17    # "url":Ljava/lang/StringBuilder;
    :cond_9
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 163
    .local v18, "urlString":Ljava/lang/String;
    const-string v3, "ID Service - Sending id sync call (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v18, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const/4 v3, 0x0

    const/16 v4, 0x7d0

    const-string v5, "ID Service"

    move-object/from16 v0, v18

    invoke-static {v0, v3, v4, v5}, Lcom/adobe/mobile/RequestHandler;->retrieveData(Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)[B

    move-result-object v15

    .line 167
    .local v15, "response":[B
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    invoke-virtual {v3, v15}, Lcom/adobe/mobile/VisitorIDService;->parseResponse([B)Lorg/json/JSONObject;

    move-result-object v16

    .line 169
    .local v16, "responseObject":Lorg/json/JSONObject;
    if-eqz v16, :cond_d

    const-string v3, "d_mid"

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v3, "error_msg"

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 171
    :try_start_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const-string v4, "d_mid"

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/adobe/mobile/VisitorIDService;->access$002(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    const-string v3, "d_blob"

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 173
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const-string v4, "d_blob"

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/adobe/mobile/VisitorIDService;->access$202(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    :cond_a
    const-string v3, "dcs_region"

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 177
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const-string v4, "dcs_region"

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/adobe/mobile/VisitorIDService;->access$102(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    :cond_b
    const-string v3, "id_sync_ttl"

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 181
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const-string v4, "id_sync_ttl"

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    int-to-long v4, v4

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v3, v4, v5}, Lcom/adobe/mobile/VisitorIDService;->access$302(Lcom/adobe/mobile/VisitorIDService;J)J

    .line 183
    :cond_c
    const-string v3, "ID Service - Got ID Response (mid: %s, blob: %s, hint: %s, ttl: %d)"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x3

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$300(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 206
    :goto_5
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v4

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_lastSync:J
    invoke-static {v3, v4, v5}, Lcom/adobe/mobile/VisitorIDService;->access$402(Lcom/adobe/mobile/VisitorIDService;J)J

    .line 208
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v3}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v5}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$300(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v6

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_lastSync:J
    invoke-static {v8}, Lcom/adobe/mobile/VisitorIDService;->access$400(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v8

    invoke-static/range {v3 .. v9}, Lcom/adobe/mobile/WearableFunctionBridge;->syncVidServiceToWearable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 211
    :try_start_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 212
    .local v2, "e":Landroid/content/SharedPreferences$Editor;
    const-string v3, "ADBMOBILE_PERSISTED_MID"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 213
    const-string v3, "ADBMOBILE_PERSISTED_MID_HINT"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 214
    const-string v3, "ADBMOBILE_PERSISTED_MID_BLOB"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 215
    const-string v3, "ADBMOBILE_VISITORID_TTL"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$300(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 216
    const-string v3, "ADBMOBILE_VISITORID_SYNC"

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_lastSync:J
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$400(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 217
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 220
    .end local v2    # "e":Landroid/content/SharedPreferences$Editor;
    :catch_0
    move-exception v11

    .line 221
    .local v11, "ex":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v3, "ID Service - Unable to persist identifiers to shared preferences(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v11}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 184
    .end local v11    # "ex":Lcom/adobe/mobile/StaticMethods$NullContextException;
    :catch_1
    move-exception v11

    .line 185
    .local v11, "ex":Lorg/json/JSONException;
    const-string v3, "ID Service - Error parsing response (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v11}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 189
    .end local v11    # "ex":Lorg/json/JSONException;
    :cond_d
    if-eqz v16, :cond_e

    const-string v3, "error_msg"

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 191
    :try_start_2
    const-string v3, "ID Service - Service returned error (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "error_msg"

    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 198
    :cond_e
    :goto_6
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # invokes: Lcom/adobe/mobile/VisitorIDService;->_generateMID()Ljava/lang/String;
    invoke-static {v4}, Lcom/adobe/mobile/VisitorIDService;->access$500(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v4

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/adobe/mobile/VisitorIDService;->access$002(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const/4 v4, 0x0

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/adobe/mobile/VisitorIDService;->access$202(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const/4 v4, 0x0

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/adobe/mobile/VisitorIDService;->access$102(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    const-wide/16 v4, 0x258

    # setter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v3, v4, v5}, Lcom/adobe/mobile/VisitorIDService;->access$302(Lcom/adobe/mobile/VisitorIDService;J)J

    .line 203
    const-string v3, "ID Service - Did not return an ID, generating one locally (mid: %s, ttl: %d)"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/adobe/mobile/VisitorIDService$2;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_ttl:J
    invoke-static {v6}, Lcom/adobe/mobile/VisitorIDService;->access$300(Lcom/adobe/mobile/VisitorIDService;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 192
    :catch_2
    move-exception v11

    .line 193
    .restart local v11    # "ex":Lorg/json/JSONException;
    const-string v3, "ID Service - Unable to read error condition(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v11}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6
.end method
