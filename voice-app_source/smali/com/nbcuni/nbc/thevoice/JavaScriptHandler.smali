.class public Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;
.super Ljava/lang/Object;
.source "JavaScriptHandler.java"


# instance fields
.field listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

.field parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;


# direct methods
.method public constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;Lcom/nbcuni/nbc/thevoice/JavaScriptListener;)V
    .locals 0
    .param p1, "activity"    # Lcom/nbcuni/nbc/thevoice/MainActivity;
    .param p2, "listener"    # Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 23
    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    .line 24
    return-void
.end method

.method private getBatteryLevel()Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v8, -0x1

    .line 278
    new-instance v3, Landroid/content/IntentFilter;

    const-string v6, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v3, v6}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 279
    .local v3, "ifilter":Landroid/content/IntentFilter;
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const/4 v7, 0x0

    invoke-virtual {v6, v7, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v2

    .line 280
    .local v2, "batteryStatus":Landroid/content/Intent;
    const-string v6, "level"

    invoke-virtual {v2, v6, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 281
    .local v4, "level":I
    const-string v6, "scale"

    invoke-virtual {v2, v6, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 283
    .local v5, "scale":I
    mul-int/lit8 v6, v4, 0x64

    div-int v1, v6, v5

    .line 284
    .local v1, "batteryPct":I
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 286
    .local v0, "batteryLevel":Ljava/lang/String;
    return-object v0
.end method


# virtual methods
.method public getConnectionStatus(Landroid/content/Context;)Z
    .locals 4
    .param p1, "ctx"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    .line 28
    const-string v3, "connectivity"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 29
    .local v0, "cMgr":Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 30
    .local v1, "i":Landroid/net/NetworkInfo;
    if-nez v1, :cond_1

    .line 36
    :cond_0
    :goto_0
    return v2

    .line 32
    :cond_1
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 34
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 36
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public getNetworkType(Ljava/lang/String;)V
    .locals 5
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 41
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 42
    .local v1, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 44
    .local v0, "activeNetworkInfo":Landroid/net/NetworkInfo;
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WIFI"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 45
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{\"commandId\":\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"WiFi\"}}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    .line 51
    :goto_0
    return-void

    .line 46
    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MOBILE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 47
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{\"commandId\":\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"WWAN\"}}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    goto :goto_0

    .line 49
    :cond_1
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{\"commandId\":\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"undefined\"}}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public parseMessageObject(Ljava/lang/String;)V
    .locals 45
    .param p1, "message"    # Ljava/lang/String;
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 56
    new-instance v25, Lorg/json/JSONObject;

    move-object/from16 v0, v25

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 58
    .local v25, "jsonMessage":Lorg/json/JSONObject;
    const-string v3, "subject"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    .line 59
    .local v36, "subject":Ljava/lang/String;
    const-string v3, "commandId"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 61
    .local v4, "commandId":Ljava/lang/String;
    const-string v3, "OpenPopup"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 62
    const-string v42, ""

    .line 63
    .local v42, "url":Ljava/lang/String;
    const-string v3, "url"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 64
    const/16 v28, 0x1

    .line 65
    .local v28, "nav":Z
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    const/4 v9, 0x1

    const/4 v12, 0x0

    move-object/from16 v0, v42

    invoke-interface {v3, v0, v9, v12}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->openUrl(Ljava/lang/String;ZLjava/lang/String;)V

    .line 274
    .end local v28    # "nav":Z
    .end local v42    # "url":Ljava/lang/String;
    :goto_0
    return-void

    .line 67
    :cond_0
    const-string v3, "BrowserOpen"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 68
    const-string v42, ""

    .line 69
    .restart local v42    # "url":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 70
    .local v31, "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 71
    const/16 v28, 0x0

    .line 72
    .restart local v28    # "nav":Z
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, v42

    invoke-interface {v3, v0, v9, v12}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->openUrl(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_0

    .line 74
    .end local v28    # "nav":Z
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v42    # "url":Ljava/lang/String;
    :cond_1
    const-string v3, "VoiceWindowOpen"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 75
    const-string v42, ""

    .line 76
    .restart local v42    # "url":Ljava/lang/String;
    const/16 v33, 0x0

    .line 77
    .local v33, "phaseTitle":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 78
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 79
    const-string v3, "title"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    .line 80
    const/16 v28, 0x1

    .line 81
    .restart local v28    # "nav":Z
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    const/4 v9, 0x1

    move-object/from16 v0, v42

    move-object/from16 v1, v33

    invoke-interface {v3, v0, v9, v1}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->openUrl(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_0

    .line 83
    .end local v28    # "nav":Z
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v33    # "phaseTitle":Ljava/lang/String;
    .end local v42    # "url":Ljava/lang/String;
    :cond_2
    const-string v3, "TelescopeOpen"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 84
    const-string v42, ""

    .line 85
    .restart local v42    # "url":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 86
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 87
    const/16 v28, 0x1

    .line 88
    .restart local v28    # "nav":Z
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    const/4 v9, 0x1

    const/4 v12, 0x0

    move-object/from16 v0, v42

    invoke-interface {v3, v0, v9, v12}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->openUrl(Ljava/lang/String;ZLjava/lang/String;)V

    .line 89
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    const-string v9, "votenowURL"

    move-object/from16 v0, v42

    invoke-interface {v3, v9, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->saveSharedPreference(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 91
    .end local v28    # "nav":Z
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v42    # "url":Ljava/lang/String;
    :cond_3
    const-string v3, "OverlayOpen"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 92
    const-string v42, ""

    .line 93
    .restart local v42    # "url":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 94
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 95
    const/16 v28, 0x1

    .line 96
    .restart local v28    # "nav":Z
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    const/4 v9, 0x1

    const/4 v12, 0x0

    move-object/from16 v0, v42

    invoke-interface {v3, v0, v9, v12}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->openUrl(Ljava/lang/String;ZLjava/lang/String;)V

    goto/16 :goto_0

    .line 98
    .end local v28    # "nav":Z
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v42    # "url":Ljava/lang/String;
    :cond_4
    const-string v3, "MixpanelTrackEvent"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 99
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 100
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "event"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 101
    .local v18, "eventName":Ljava/lang/String;
    const-string v3, "properties"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v34

    .line 102
    .local v34, "properties":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v18

    move-object/from16 v1, v34

    invoke-interface {v3, v0, v1}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->mixpanelTrackEvent(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto/16 :goto_0

    .line 104
    .end local v18    # "eventName":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v34    # "properties":Lorg/json/JSONObject;
    :cond_5
    const-string v3, "MixpanelRegisterSuperProperties"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 105
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 106
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "properties"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v34

    .line 107
    .restart local v34    # "properties":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v34

    invoke-interface {v3, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->mixpanelRegisterSuperProperties(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    .line 109
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v34    # "properties":Lorg/json/JSONObject;
    :cond_6
    const-string v3, "MixpanelSetPeopleProperties"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 110
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 111
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "properties"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v34

    .line 112
    .restart local v34    # "properties":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v34

    invoke-interface {v3, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->mixpanelSetPeopleProperties(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    .line 114
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v34    # "properties":Lorg/json/JSONObject;
    :cond_7
    const-string v3, "MixpanelIncrementPeopleProperties"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 115
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 116
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "properties"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v34

    .line 117
    .restart local v34    # "properties":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v34

    invoke-interface {v3, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->mixpanelIncrementPeopleProperties(Lorg/json/JSONObject;)V

    goto/16 :goto_0

    .line 119
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v34    # "properties":Lorg/json/JSONObject;
    :cond_8
    const-string v3, "SetPushEnabled"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 120
    const/16 v43, 0x0

    .line 121
    .local v43, "value":Z
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 122
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "value"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v43

    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v9, "{\"commandId\":\""

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "\",\"type\":\"CommandResult\",\"subject\":\"SetPushEnabled\",\"payload\":{\"value\":"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v0, v43

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "}}"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v35

    .line 124
    .local v35, "returnCommand":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move/from16 v0, v43

    move-object/from16 v1, v35

    invoke-interface {v3, v0, v1}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->pushSetting(ZLjava/lang/String;)V

    goto/16 :goto_0

    .line 126
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v35    # "returnCommand":Ljava/lang/String;
    .end local v43    # "value":Z
    :cond_9
    const-string v3, "LoadAudio"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 127
    const-string v42, ""

    .line 128
    .restart local v42    # "url":Ljava/lang/String;
    const-string v20, ""

    .line 129
    .local v20, "fileName":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 130
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 131
    const-string v3, "[:/\\?]"

    const-string v9, "-"

    move-object/from16 v0, v42

    invoke-virtual {v0, v3, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 132
    new-instance v3, Lcom/nbcuni/nbc/thevoice/DownloadTask;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, v42

    move-object/from16 v1, v20

    invoke-direct {v3, v9, v0, v1, v4}, Lcom/nbcuni/nbc/thevoice/DownloadTask;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/String;

    const/4 v12, 0x0

    const-string v44, ""

    aput-object v44, v9, v12

    invoke-virtual {v3, v9}, Lcom/nbcuni/nbc/thevoice/DownloadTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0

    .line 134
    .end local v20    # "fileName":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v42    # "url":Ljava/lang/String;
    :cond_a
    const-string v3, "LoadAsset"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 136
    const-string v42, ""

    .line 137
    .restart local v42    # "url":Ljava/lang/String;
    const-string v20, ""

    .line 138
    .restart local v20    # "fileName":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 139
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    .line 140
    const-string v3, "/"

    move-object/from16 v0, v42

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, v42

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v20

    .line 141
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v20

    invoke-interface {v3, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->addAssetToList(Ljava/lang/String;)V

    .line 142
    new-instance v3, Lcom/nbcuni/nbc/thevoice/DownloadTask;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, v42

    move-object/from16 v1, v20

    invoke-direct {v3, v9, v0, v1, v4}, Lcom/nbcuni/nbc/thevoice/DownloadTask;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/String;

    const/4 v12, 0x0

    const-string v44, ""

    aput-object v44, v9, v12

    invoke-virtual {v3, v9}, Lcom/nbcuni/nbc/thevoice/DownloadTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0

    .line 144
    .end local v20    # "fileName":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v42    # "url":Ljava/lang/String;
    :cond_b
    const-string v3, "PlayAudio"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 145
    const-string v20, ""

    .line 146
    .restart local v20    # "fileName":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 147
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 148
    const-string v3, "[:/\\?]"

    const-string v9, "-"

    move-object/from16 v0, v20

    invoke-virtual {v0, v3, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 149
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v20

    invoke-interface {v3, v0, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->playAudio(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 151
    .end local v20    # "fileName":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    :cond_c
    const-string v3, "PauseAudio"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 152
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface {v3, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->pauseAudio(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 154
    :cond_d
    const-string v3, "ResumeAudio"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 155
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface {v3, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->resumeAudio(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 157
    :cond_e
    const-string v3, "StopAudio"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 158
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface {v3, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->stopAudio(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 160
    :cond_f
    const-string v3, "IsTwitterAccountAvailable"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 161
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v9, "{\"commandId\":\""

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "\",\"type\":\"CommandResult\",\"subject\":\"IsTwitterAccountAvailable\",\"payload\":{\"available\":"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "}}"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v35

    .line 162
    .restart local v35    # "returnCommand":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v35

    invoke-interface {v3, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 164
    .end local v35    # "returnCommand":Ljava/lang/String;
    :cond_10
    const-string v3, "FacebookLogin"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 165
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 167
    .restart local v31    # "payload":Lorg/json/JSONObject;
    new-instance v32, Ljava/util/ArrayList;

    invoke-direct/range {v32 .. v32}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .local v32, "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v3, "permissions"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v24

    .line 169
    .local v24, "jsonArray":Lorg/json/JSONArray;
    if-eqz v24, :cond_11

    .line 170
    invoke-virtual/range {v24 .. v24}, Lorg/json/JSONArray;->length()I

    move-result v26

    .line 171
    .local v26, "len":I
    const/16 v22, 0x0

    .local v22, "i":I
    :goto_1
    move/from16 v0, v22

    move/from16 v1, v26

    if-lt v0, v1, :cond_12

    .line 175
    .end local v22    # "i":I
    .end local v26    # "len":I
    :cond_11
    const-string v3, "interactive"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v23

    .line 177
    .local v23, "interactive":Z
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v32

    move/from16 v1, v23

    invoke-interface {v3, v4, v0, v1}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->facebookLogin(Ljava/lang/String;Ljava/util/List;Z)V

    goto/16 :goto_0

    .line 172
    .end local v23    # "interactive":Z
    .restart local v22    # "i":I
    .restart local v26    # "len":I
    :cond_12
    move-object/from16 v0, v24

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v32

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    add-int/lit8 v22, v22, 0x1

    goto :goto_1

    .line 178
    .end local v22    # "i":I
    .end local v24    # "jsonArray":Lorg/json/JSONArray;
    .end local v26    # "len":I
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v32    # "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_13
    const-string v3, "FacebookShare"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 179
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 180
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "contentDescription"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 181
    .local v6, "description":Ljava/lang/String;
    const-string v3, "contentTitle"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 182
    .local v5, "title":Ljava/lang/String;
    const-string v3, "contentURL"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 183
    .local v7, "link":Ljava/lang/String;
    const-string v8, "blah"

    .line 184
    .local v8, "image":Ljava/lang/String;
    const-string v3, "imageURL"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 185
    const-string v3, "imageURL"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 187
    :cond_14
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface/range {v3 .. v8}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->facebookShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 188
    .end local v5    # "title":Ljava/lang/String;
    .end local v6    # "description":Ljava/lang/String;
    .end local v7    # "link":Ljava/lang/String;
    .end local v8    # "image":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    :cond_15
    const-string v3, "FacebookRequestReadPermissions"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    .line 189
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 190
    .restart local v31    # "payload":Lorg/json/JSONObject;
    new-instance v32, Ljava/util/ArrayList;

    invoke-direct/range {v32 .. v32}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .restart local v32    # "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v3, "permissions"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v24

    .line 192
    .restart local v24    # "jsonArray":Lorg/json/JSONArray;
    if-eqz v24, :cond_16

    .line 193
    invoke-virtual/range {v24 .. v24}, Lorg/json/JSONArray;->length()I

    move-result v26

    .line 194
    .restart local v26    # "len":I
    const/16 v22, 0x0

    .restart local v22    # "i":I
    :goto_2
    move/from16 v0, v22

    move/from16 v1, v26

    if-lt v0, v1, :cond_17

    .line 199
    .end local v22    # "i":I
    .end local v26    # "len":I
    :cond_16
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v32

    invoke-interface {v3, v4, v0}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->facebookPermissionRequest(Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_0

    .line 195
    .restart local v22    # "i":I
    .restart local v26    # "len":I
    :cond_17
    move-object/from16 v0, v24

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v32

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    add-int/lit8 v22, v22, 0x1

    goto :goto_2

    .line 200
    .end local v22    # "i":I
    .end local v24    # "jsonArray":Lorg/json/JSONArray;
    .end local v26    # "len":I
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v32    # "permissions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_18
    const-string v3, "FacebookGraphRequest"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 201
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 202
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "path"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    .line 203
    .local v30, "path":Ljava/lang/String;
    const-string v3, "parameters"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v29

    .line 204
    .local v29, "parameters":Lorg/json/JSONObject;
    const-string v3, "fields"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 205
    .local v19, "fields":Ljava/lang/String;
    const-string v3, "httpMethod"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 207
    .local v21, "httpMethod":Ljava/lang/String;
    const-string v3, "post"

    move-object/from16 v0, v21

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 208
    sget-object v27, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    .line 213
    .local v27, "method":Lcom/facebook/HttpMethod;
    :goto_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object/from16 v0, v30

    move-object/from16 v1, v27

    move-object/from16 v2, v19

    invoke-interface {v3, v4, v0, v1, v2}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->facebookGraphRequest(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/HttpMethod;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 210
    .end local v27    # "method":Lcom/facebook/HttpMethod;
    :cond_19
    sget-object v27, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;

    .restart local v27    # "method":Lcom/facebook/HttpMethod;
    goto :goto_3

    .line 214
    .end local v19    # "fields":Ljava/lang/String;
    .end local v21    # "httpMethod":Ljava/lang/String;
    .end local v27    # "method":Lcom/facebook/HttpMethod;
    .end local v29    # "parameters":Lorg/json/JSONObject;
    .end local v30    # "path":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    :cond_1a
    const-string v3, "FacebookLogout"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 215
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface {v3, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->facebookLogout(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 216
    :cond_1b
    const-string v3, "TwitterShare"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    .line 217
    const-string v39, "notset"

    .line 218
    .local v39, "twitterMsg":Ljava/lang/String;
    const/16 v40, 0x0

    .line 220
    .local v40, "twitterUrl":Ljava/lang/String;
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 221
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "message"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    .line 222
    const-string v3, "url"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    .line 225
    :try_start_0
    const-string v3, "UTF-8"

    move-object/from16 v0, v39

    invoke-static {v0, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v39

    .line 230
    :goto_4
    const/16 v38, 0x0

    .line 231
    .local v38, "tweetUrl":Ljava/lang/String;
    if-eqz v40, :cond_1c

    .line 232
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v9, "https://twitter.com/intent/tweet?text="

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v39

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "&url="

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, v40

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v38

    .line 237
    :goto_5
    invoke-static/range {v38 .. v38}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v41

    .line 238
    .local v41, "uri":Landroid/net/Uri;
    new-instance v37, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    move-object/from16 v0, v37

    move-object/from16 v1, v41

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 239
    .local v37, "tweetIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v9, "Tweet!"

    move-object/from16 v0, v37

    invoke-static {v0, v9}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 226
    .end local v37    # "tweetIntent":Landroid/content/Intent;
    .end local v38    # "tweetUrl":Ljava/lang/String;
    .end local v41    # "uri":Landroid/net/Uri;
    :catch_0
    move-exception v17

    .line 227
    .local v17, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual/range {v17 .. v17}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_4

    .line 234
    .end local v17    # "e":Ljava/io/UnsupportedEncodingException;
    .restart local v38    # "tweetUrl":Ljava/lang/String;
    :cond_1c
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v9, "https://twitter.com/intent/tweet?text="

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v39

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v38

    goto :goto_5

    .line 241
    .end local v31    # "payload":Lorg/json/JSONObject;
    .end local v38    # "tweetUrl":Ljava/lang/String;
    .end local v39    # "twitterMsg":Ljava/lang/String;
    .end local v40    # "twitterUrl":Ljava/lang/String;
    :cond_1d
    const-string v3, "GetBatteryLevel"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 242
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "{\"commandId\":\""

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "\",\"type\":\"CommandResult\",\"subject\":\"GetBatteryLevel\",\"payload\":{\"value\":\""

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-direct/range {p0 .. p0}, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->getBatteryLevel()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "\"}}"

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 243
    :cond_1e
    const-string v3, "GetNetworkStatus"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 245
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->parentActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->getConnectionStatus(Landroid/content/Context;)Z

    move-result v16

    .line 247
    .local v16, "connected":Z
    if-nez v16, :cond_1f

    .line 248
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "{\"commandId\":\""

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"noservice\"}}"

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 250
    :cond_1f
    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->getNetworkType(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 252
    .end local v16    # "connected":Z
    :cond_20
    const-string v3, "OpenDialog"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_22

    .line 253
    const-string v3, "payload"

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 255
    .restart local v31    # "payload":Lorg/json/JSONObject;
    const-string v3, "title"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_21

    .line 256
    const-string v3, "title"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 259
    .local v10, "dialogTitle":Ljava/lang/String;
    :goto_6
    const-string v3, "message"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 260
    .local v11, "dialogMessage":Ljava/lang/String;
    const-string v3, "buttons"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 261
    .local v15, "buttons":Lorg/json/JSONArray;
    const/4 v3, 0x0

    invoke-virtual {v15, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    .line 262
    .local v13, "firstButton":Ljava/lang/String;
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    .line 263
    .local v14, "secondButton":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    move-object v12, v4

    invoke-interface/range {v9 .. v14}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->openDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 258
    .end local v10    # "dialogTitle":Ljava/lang/String;
    .end local v11    # "dialogMessage":Ljava/lang/String;
    .end local v13    # "firstButton":Ljava/lang/String;
    .end local v14    # "secondButton":Ljava/lang/String;
    .end local v15    # "buttons":Lorg/json/JSONArray;
    :cond_21
    const/4 v10, 0x0

    .restart local v10    # "dialogTitle":Ljava/lang/String;
    goto :goto_6

    .line 265
    .end local v10    # "dialogTitle":Ljava/lang/String;
    .end local v31    # "payload":Lorg/json/JSONObject;
    :cond_22
    const-string v3, "ReloadMainWebView"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 266
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface {v3}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->reloadWebView()V

    goto/16 :goto_0

    .line 267
    :cond_23
    const-string v3, "Close"

    move-object/from16 v0, v36

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 268
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-interface {v3}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->closeApp()V

    goto/16 :goto_0

    .line 270
    :cond_24
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;->listener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "{\"commandId\":\""

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "\",\"type\":\"CommandResult\",\"subject\":\""

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move-object/from16 v0, v36

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "\",\"error\":{\"code\":\"UnsupportedCommand\"}}"

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Lcom/nbcuni/nbc/thevoice/JavaScriptListener;->sendNativeMessage(Ljava/lang/String;)V

    goto/16 :goto_0
.end method
