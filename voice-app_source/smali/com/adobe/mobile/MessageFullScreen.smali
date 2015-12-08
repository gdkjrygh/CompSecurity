.class final Lcom/adobe/mobile/MessageFullScreen;
.super Lcom/adobe/mobile/Message;
.source "MessageFullScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;,
        Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenRunner;
    }
.end annotation


# static fields
.field private static final JSON_CONFIG_HTML:Ljava/lang/String; = "html"

.field private static final MESSAGE_SCHEME:Ljava/lang/String; = "adbinapp"

.field private static final MESSAGE_SCHEME_PATH_CANCEL:Ljava/lang/String; = "cancel"

.field private static final MESSAGE_SCHEME_PATH_CONFIRM:Ljava/lang/String; = "confirm"


# instance fields
.field protected html:Ljava/lang/String;

.field protected messageFullScreenActivity:Landroid/app/Activity;

.field protected replacedHtml:Ljava/lang/String;

.field protected rootViewGroup:Landroid/view/ViewGroup;

.field private webView:Landroid/webkit/WebView;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/adobe/mobile/Message;-><init>()V

    .line 277
    return-void
.end method

.method static synthetic access$000(Lcom/adobe/mobile/MessageFullScreen;)Landroid/webkit/WebView;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/MessageFullScreen;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/adobe/mobile/MessageFullScreen;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$002(Lcom/adobe/mobile/MessageFullScreen;Landroid/webkit/WebView;)Landroid/webkit/WebView;
    .locals 0
    .param p0, "x0"    # Lcom/adobe/mobile/MessageFullScreen;
    .param p1, "x1"    # Landroid/webkit/WebView;

    .prologue
    .line 42
    iput-object p1, p0, Lcom/adobe/mobile/MessageFullScreen;->webView:Landroid/webkit/WebView;

    return-object p1
.end method

.method static synthetic access$100(Lcom/adobe/mobile/MessageFullScreen;)V
    .locals 0
    .param p0, "x0"    # Lcom/adobe/mobile/MessageFullScreen;

    .prologue
    .line 42
    invoke-static {p0}, Lcom/adobe/mobile/MessageFullScreen;->killMessageActivity(Lcom/adobe/mobile/MessageFullScreen;)V

    return-void
.end method

.method private static killMessageActivity(Lcom/adobe/mobile/MessageFullScreen;)V
    .locals 2
    .param p0, "message"    # Lcom/adobe/mobile/MessageFullScreen;

    .prologue
    const/4 v1, 0x0

    .line 359
    iget-object v0, p0, Lcom/adobe/mobile/MessageFullScreen;->messageFullScreenActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 360
    iget-object v0, p0, Lcom/adobe/mobile/MessageFullScreen;->messageFullScreenActivity:Landroid/app/Activity;

    invoke-virtual {v0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 361
    iput-boolean v1, p0, Lcom/adobe/mobile/MessageFullScreen;->isVisible:Z

    .line 362
    return-void
.end method


# virtual methods
.method protected initWithPayloadObject(Lorg/json/JSONObject;)Z
    .locals 13
    .param p1, "dictionary"    # Lorg/json/JSONObject;

    .prologue
    .line 66
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v9

    if-gtz v9, :cond_1

    .line 67
    :cond_0
    const/4 v9, 0x0

    .line 126
    :goto_0
    return v9

    .line 71
    :cond_1
    invoke-super {p0, p1}, Lcom/adobe/mobile/Message;->initWithPayloadObject(Lorg/json/JSONObject;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 72
    const/4 v9, 0x0

    goto :goto_0

    .line 78
    :cond_2
    :try_start_0
    const-string v9, "payload"

    invoke-virtual {p1, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 79
    .local v8, "jsonPayload":Lorg/json/JSONObject;
    invoke-virtual {v8}, Lorg/json/JSONObject;->length()I

    move-result v9

    if-gtz v9, :cond_3

    .line 80
    const-string v9, "Messages - Unable to create fullscreen message \"%s\", payload is empty"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/adobe/mobile/MessageFullScreen;->messageId:Ljava/lang/String;

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    const/4 v9, 0x0

    goto :goto_0

    .line 84
    .end local v8    # "jsonPayload":Lorg/json/JSONObject;
    :catch_0
    move-exception v4

    .line 85
    .local v4, "ex":Lorg/json/JSONException;
    const-string v9, "Messages - Unable to create fullscreen message \"%s\", payload is required"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/adobe/mobile/MessageFullScreen;->messageId:Ljava/lang/String;

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v9, 0x0

    goto :goto_0

    .line 91
    .end local v4    # "ex":Lorg/json/JSONException;
    .restart local v8    # "jsonPayload":Lorg/json/JSONObject;
    :cond_3
    :try_start_1
    const-string v9, "html"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Lcom/adobe/mobile/MessageFullScreen;->html:Ljava/lang/String;

    .line 92
    iget-object v9, p0, Lcom/adobe/mobile/MessageFullScreen;->html:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-gtz v9, :cond_4

    .line 93
    const-string v9, "Messages - Unable to create fullscreen message \"%s\", html is empty"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/adobe/mobile/MessageFullScreen;->messageId:Ljava/lang/String;

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 94
    const/4 v9, 0x0

    goto :goto_0

    .line 97
    :catch_1
    move-exception v4

    .line 98
    .restart local v4    # "ex":Lorg/json/JSONException;
    const-string v9, "Messages - Unable to create fullscreen message \"%s\", html is required"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/adobe/mobile/MessageFullScreen;->messageId:Ljava/lang/String;

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v9, 0x0

    goto :goto_0

    .line 104
    .end local v4    # "ex":Lorg/json/JSONException;
    :cond_4
    :try_start_2
    const-string v9, "assets"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 105
    .local v0, "assetsArray":Lorg/json/JSONArray;
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-lez v9, :cond_7

    .line 106
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lcom/adobe/mobile/MessageFullScreen;->assets:Ljava/util/ArrayList;

    .line 107
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    .line 108
    .local v1, "count":I
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_1
    if-ge v5, v1, :cond_7

    .line 109
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v3

    .line 110
    .local v3, "currentAssetJson":Lorg/json/JSONArray;
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-lez v9, :cond_6

    .line 111
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .local v2, "currentAsset":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 113
    .local v6, "innerCount":I
    const/4 v7, 0x0

    .local v7, "j":I
    :goto_2
    if-ge v7, v6, :cond_5

    .line 114
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 117
    :cond_5
    iget-object v9, p0, Lcom/adobe/mobile/MessageFullScreen;->assets:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 108
    .end local v2    # "currentAsset":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v6    # "innerCount":I
    .end local v7    # "j":I
    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 122
    .end local v0    # "assetsArray":Lorg/json/JSONArray;
    .end local v1    # "count":I
    .end local v3    # "currentAssetJson":Lorg/json/JSONArray;
    .end local v5    # "i":I
    :catch_2
    move-exception v4

    .line 123
    .restart local v4    # "ex":Lorg/json/JSONException;
    const-string v9, "Messages - No assets found for fullscreen message \"%s\""

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/adobe/mobile/MessageFullScreen;->messageId:Ljava/lang/String;

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    .end local v4    # "ex":Lorg/json/JSONException;
    :cond_7
    const/4 v9, 0x1

    goto/16 :goto_0
.end method

.method protected show()V
    .locals 17

    .prologue
    .line 146
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentActivity()Landroid/app/Activity;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullActivityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 153
    .local v3, "currentActivity":Landroid/app/Activity;
    invoke-super/range {p0 .. p0}, Lcom/adobe/mobile/Message;->show()V

    .line 156
    invoke-static/range {p0 .. p0}, Lcom/adobe/mobile/Messages;->setCurrentMessageFullscreen(Lcom/adobe/mobile/MessageFullScreen;)V

    .line 158
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 161
    .local v10, "imageTokens":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/adobe/mobile/MessageFullScreen;->assets:Ljava/util/ArrayList;

    if-eqz v13, :cond_5

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/adobe/mobile/MessageFullScreen;->assets:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-lez v13, :cond_5

    .line 162
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/adobe/mobile/MessageFullScreen;->assets:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    .line 163
    .local v5, "currentAssetArray":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 166
    .local v6, "currentAssetArrayCount":I
    if-lez v6, :cond_0

    .line 170
    const/4 v14, 0x0

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 171
    .local v1, "assetUrl":Ljava/lang/String;
    const/4 v2, 0x0

    .line 173
    .local v2, "assetValue":Ljava/lang/String;
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 175
    .local v4, "currentAsset":Ljava/lang/String;
    const-string v15, "messageImages"

    invoke-static {v4, v15}, Lcom/adobe/mobile/RemoteDownload;->getFileForCachedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v9

    .line 176
    .local v9, "imageFile":Ljava/io/File;
    if-eqz v9, :cond_1

    .line 177
    invoke-virtual {v9}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v14

    invoke-virtual {v14}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v2

    .line 183
    .end local v4    # "currentAsset":Ljava/lang/String;
    .end local v9    # "imageFile":Ljava/io/File;
    :cond_2
    if-nez v2, :cond_3

    .line 184
    add-int/lit8 v14, v6, -0x1

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 185
    .local v12, "lastAsset":Ljava/lang/String;
    invoke-static {v12}, Lcom/adobe/mobile/RemoteDownload;->stringIsUrl(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_4

    const/4 v11, 0x1

    .line 187
    .local v11, "isLocalImage":Z
    :goto_1
    if-eqz v11, :cond_3

    .line 188
    move-object v2, v12

    .line 192
    .end local v11    # "isLocalImage":Z
    .end local v12    # "lastAsset":Ljava/lang/String;
    :cond_3
    if-eqz v2, :cond_0

    .line 193
    invoke-virtual {v10, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 148
    .end local v1    # "assetUrl":Ljava/lang/String;
    .end local v2    # "assetValue":Ljava/lang/String;
    .end local v3    # "currentActivity":Landroid/app/Activity;
    .end local v5    # "currentAssetArray":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v6    # "currentAssetArrayCount":I
    .end local v10    # "imageTokens":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_0
    move-exception v7

    .line 149
    .local v7, "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    invoke-virtual {v7}, Lcom/adobe/mobile/StaticMethods$NullActivityException;->getMessage()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    new-array v14, v14, [Ljava/lang/Object;

    invoke-static {v13, v14}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    .end local v7    # "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    :goto_2
    return-void

    .line 185
    .restart local v1    # "assetUrl":Ljava/lang/String;
    .restart local v2    # "assetValue":Ljava/lang/String;
    .restart local v3    # "currentActivity":Landroid/app/Activity;
    .restart local v5    # "currentAssetArray":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v6    # "currentAssetArrayCount":I
    .restart local v10    # "imageTokens":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v12    # "lastAsset":Ljava/lang/String;
    :cond_4
    const/4 v11, 0x0

    goto :goto_1

    .line 198
    .end local v1    # "assetUrl":Ljava/lang/String;
    .end local v2    # "assetValue":Ljava/lang/String;
    .end local v5    # "currentAssetArray":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v6    # "currentAssetArrayCount":I
    .end local v12    # "lastAsset":Ljava/lang/String;
    :cond_5
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/adobe/mobile/MessageFullScreen;->html:Ljava/lang/String;

    invoke-static {v13, v10}, Lcom/adobe/mobile/StaticMethods;->expandTokens(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p0

    iput-object v13, v0, Lcom/adobe/mobile/MessageFullScreen;->replacedHtml:Ljava/lang/String;

    .line 201
    :try_start_1
    new-instance v8, Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    const-class v14, Lcom/adobe/mobile/MessageFullScreenActivity;

    invoke-direct {v8, v13, v14}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 202
    .local v8, "fullscreen":Landroid/content/Intent;
    const/high16 v13, 0x10000

    invoke-virtual {v8, v13}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 203
    invoke-virtual {v3, v8}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 204
    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual {v3, v13, v14}, Landroid/app/Activity;->overridePendingTransition(II)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 206
    .end local v8    # "fullscreen":Landroid/content/Intent;
    :catch_1
    move-exception v7

    .line 207
    .local v7, "ex":Landroid/content/ActivityNotFoundException;
    const-string v13, "Messages - Must declare MessageFullScreenActivity in AndroidManifest.xml in order to show full screen messages (%s)"

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Object;

    const/4 v15, 0x0

    invoke-virtual {v7}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v15

    invoke-static {v13, v14}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method protected showInRootViewGroup()V
    .locals 3

    .prologue
    .line 130
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentOrientation()I

    move-result v0

    .line 131
    .local v0, "currentOrientation":I
    iget-boolean v2, p0, Lcom/adobe/mobile/MessageFullScreen;->isVisible:Z

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/adobe/mobile/MessageFullScreen;->orientationWhenShown:I

    if-ne v2, v0, :cond_0

    .line 140
    :goto_0
    return-void

    .line 135
    :cond_0
    iput v0, p0, Lcom/adobe/mobile/MessageFullScreen;->orientationWhenShown:I

    .line 138
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 139
    .local v1, "mainHandler":Landroid/os/Handler;
    new-instance v2, Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenRunner;

    invoke-direct {v2, p0}, Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenRunner;-><init>(Lcom/adobe/mobile/MessageFullScreen;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
