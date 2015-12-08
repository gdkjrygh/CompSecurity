.class public Lcom/nbcuni/nbc/thevoice/PopupJSHandler;
.super Ljava/lang/Object;
.source "PopupJSHandler.java"


# instance fields
.field listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

.field parentActivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/nbcuni/nbc/thevoice/PopupJSListener;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "listener"    # Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->parentActivity:Landroid/app/Activity;

    .line 18
    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    .line 19
    return-void
.end method


# virtual methods
.method public parseMessageObject(Ljava/lang/String;)V
    .locals 16
    .param p1, "message"    # Ljava/lang/String;
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 24
    new-instance v9, Lorg/json/JSONObject;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 25
    .local v9, "jsonMessage":Lorg/json/JSONObject;
    const-string v1, "subject"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 27
    .local v14, "subject":Ljava/lang/String;
    const-string v1, "HandleLS"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 29
    const-string v1, "payload"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 30
    .local v12, "payload":Lorg/json/JSONObject;
    const-string v1, "localStorage"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 31
    const-string v1, "localStorage"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 32
    .local v11, "localStorage":Ljava/lang/String;
    const-string v1, "["

    invoke-virtual {v11, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "]"

    invoke-virtual {v11, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 33
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface {v1, v11}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->passExpiresValue(Ljava/lang/String;)V

    .line 89
    .end local v11    # "localStorage":Ljava/lang/String;
    .end local v12    # "payload":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    return-void

    .line 36
    .restart local v12    # "payload":Lorg/json/JSONObject;
    :cond_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    const/4 v15, 0x0

    invoke-interface {v1, v15}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->passExpiresValue(Ljava/lang/String;)V

    goto :goto_0

    .line 39
    .end local v12    # "payload":Lorg/json/JSONObject;
    :cond_2
    const-string v1, "ClosePopup"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 40
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface {v1}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->closePopup()V

    goto :goto_0

    .line 41
    :cond_3
    const-string v1, "TelescopeReady"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 42
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface {v1}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->hideLoadingScreen()V

    goto :goto_0

    .line 44
    :cond_4
    const-string v1, "FacebookLogin"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 45
    const-string v1, "commandId"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 46
    .local v2, "commandId":Ljava/lang/String;
    const-string v1, "payload"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 48
    .restart local v12    # "payload":Lorg/json/JSONObject;
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .local v13, "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v1, "permissions"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 50
    .local v8, "jsonArray":Lorg/json/JSONArray;
    if-eqz v8, :cond_5

    .line 51
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v10

    .line 52
    .local v10, "len":I
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_1
    if-lt v7, v10, :cond_6

    .line 57
    .end local v7    # "i":I
    .end local v10    # "len":I
    :cond_5
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface {v1, v2, v13}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->facebookLogin(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    .line 53
    .restart local v7    # "i":I
    .restart local v10    # "len":I
    :cond_6
    invoke-virtual {v8, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 58
    .end local v2    # "commandId":Ljava/lang/String;
    .end local v7    # "i":I
    .end local v8    # "jsonArray":Lorg/json/JSONArray;
    .end local v10    # "len":I
    .end local v12    # "payload":Lorg/json/JSONObject;
    .end local v13    # "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_7
    const-string v1, "FacebookShare"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 59
    const-string v1, "commandId"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 60
    .restart local v2    # "commandId":Ljava/lang/String;
    const-string v1, "payload"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 61
    .restart local v12    # "payload":Lorg/json/JSONObject;
    const-string v1, "contentDescription"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 62
    .local v4, "description":Ljava/lang/String;
    const-string v1, "contentTitle"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 63
    .local v3, "title":Ljava/lang/String;
    const-string v1, "contentURL"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 64
    .local v5, "link":Ljava/lang/String;
    const-string v1, "imageURL"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 66
    .local v6, "image":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface/range {v1 .. v6}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->facebookShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 67
    .end local v2    # "commandId":Ljava/lang/String;
    .end local v3    # "title":Ljava/lang/String;
    .end local v4    # "description":Ljava/lang/String;
    .end local v5    # "link":Ljava/lang/String;
    .end local v6    # "image":Ljava/lang/String;
    .end local v12    # "payload":Lorg/json/JSONObject;
    :cond_8
    const-string v1, "FacebookRequestReadPermissions"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 68
    const-string v1, "commandId"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 69
    .restart local v2    # "commandId":Ljava/lang/String;
    const-string v1, "payload"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 70
    .restart local v12    # "payload":Lorg/json/JSONObject;
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .restart local v13    # "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v1, "permissions"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 72
    .restart local v8    # "jsonArray":Lorg/json/JSONArray;
    if-eqz v8, :cond_9

    .line 73
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v10

    .line 74
    .restart local v10    # "len":I
    const/4 v7, 0x0

    .restart local v7    # "i":I
    :goto_2
    if-lt v7, v10, :cond_a

    .line 79
    .end local v7    # "i":I
    .end local v10    # "len":I
    :cond_9
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface {v1, v2, v13}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->facebookPermissionRequest(Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_0

    .line 75
    .restart local v7    # "i":I
    .restart local v10    # "len":I
    :cond_a
    invoke-virtual {v8, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 81
    .end local v2    # "commandId":Ljava/lang/String;
    .end local v7    # "i":I
    .end local v8    # "jsonArray":Lorg/json/JSONArray;
    .end local v10    # "len":I
    .end local v12    # "payload":Lorg/json/JSONObject;
    .end local v13    # "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_b
    const-string v1, "FacebookLogout"

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 82
    const-string v1, "commandId"

    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 83
    .restart local v2    # "commandId":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;->listener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    invoke-interface {v1, v2}, Lcom/nbcuni/nbc/thevoice/PopupJSListener;->facebookLogout(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 86
    .end local v2    # "commandId":Ljava/lang/String;
    :cond_c
    const-string v1, "Badger"

    const-string v15, "Unsupported action"

    invoke-static {v1, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method
