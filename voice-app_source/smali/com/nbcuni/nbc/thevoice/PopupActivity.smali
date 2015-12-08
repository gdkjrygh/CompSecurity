.class public Lcom/nbcuni/nbc/thevoice/PopupActivity;
.super Lcom/comscore/instrumentation/InstrumentedActivity;
.source "PopupActivity.java"


# static fields
.field private static PERMISSIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static popupWebView:Landroid/webkit/WebView;


# instance fields
.field authTokenFB:Ljava/lang/String;

.field callbackManager:Lcom/facebook/CallbackManager;

.field private gatekeeperFull:Z

.field private final jsListener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

.field private loadingDialog:Landroid/widget/RelativeLayout;

.field private loadingImage:Landroid/widget/ImageView;

.field private loadingScreen:Landroid/widget/RelativeLayout;

.field private loadingTimer:Landroid/os/CountDownTimer;

.field private loginCmdID:I

.field private loginSubject:Ljava/lang/String;

.field nav:Ljava/lang/Boolean;

.field private shareDialog:Lcom/facebook/share/widget/ShareDialog;

.field sharedPreferences:Landroid/content/SharedPreferences;

.field private tryAgainScreen:Landroid/widget/RelativeLayout;

.field private wl:Landroid/os/PowerManager$WakeLock;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->gatekeeperFull:Z

    .line 42
    new-instance v0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;

    invoke-direct {v0, p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->jsListener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    .line 130
    const-string v0, "allYourBaseAreBelongToUs"

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->authTokenFB:Ljava/lang/String;

    .line 23
    return-void
.end method

.method static synthetic access$0(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 34
    sput-object p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->PERMISSIONS:Ljava/util/List;

    return-void
.end method

.method static synthetic access$1(Lcom/nbcuni/nbc/thevoice/PopupActivity;I)V
    .locals 0

    .prologue
    .line 35
    iput p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginCmdID:I

    return-void
.end method

.method static synthetic access$10(Lcom/nbcuni/nbc/thevoice/PopupActivity;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginCmdID:I

    return v0
.end method

.method static synthetic access$11(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginSubject:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$12(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingDialog:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$13(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->tryAgainScreen:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$14(Lcom/nbcuni/nbc/thevoice/PopupActivity;Landroid/os/CountDownTimer;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;

    return-void
.end method

.method static synthetic access$15(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->gatekeeperFull:Z

    return v0
.end method

.method static synthetic access$2(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginSubject:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$3(Lcom/nbcuni/nbc/thevoice/PopupActivity;ILjava/util/List;)V
    .locals 0

    .prologue
    .line 572
    invoke-direct {p0, p1, p2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->onClickLogin(ILjava/util/List;)V

    return-void
.end method

.method static synthetic access$4(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 577
    invoke-direct {p0, p1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->onClickLogout(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$5(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/util/Collection;Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 562
    invoke-direct {p0, p1, p2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->isSubsetOf(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$6(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingImage:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$7(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingScreen:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$8(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/os/CountDownTimer;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;

    return-object v0
.end method

.method static synthetic access$9()Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method private isSubsetOf(Ljava/util/Collection;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 564
    .local p1, "subset":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .local p2, "superset":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 569
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 564
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 565
    .local v0, "string":Ljava/lang/String;
    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 566
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private onClickLogin(ILjava/util/List;)V
    .locals 1
    .param p1, "commandId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 574
    .local p2, "loginPermissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v0

    invoke-virtual {v0, p0, p2}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    .line 575
    return-void
.end method

.method private onClickLogout(Ljava/lang/String;)V
    .locals 3
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 579
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/login/LoginManager;->logOut()V

    .line 581
    const-string v1, "javascript: FB.logout();"

    invoke-virtual {p0, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadUrlOnUIThread(Ljava/lang/String;)V

    .line 582
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "fbAuthToken"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 583
    if-eqz p1, :cond_0

    .line 584
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\"FacebookLogout\"}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 585
    .local v0, "commandResult":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 587
    .end local v0    # "commandResult":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method private updateView()V
    .locals 3

    .prologue
    .line 591
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 592
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript: Voice7webview.nativeFacebookAuth(\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 594
    :cond_0
    return-void
.end method


# virtual methods
.method protected handleFacebookShare(Ljava/lang/String;)V
    .locals 16
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 196
    const-string v5, ""

    .line 197
    .local v5, "link":Ljava/lang/String;
    const-string v9, ""

    .line 198
    .local v9, "picture":Ljava/lang/String;
    const-string v7, ""

    .line 199
    .local v7, "name":Ljava/lang/String;
    const-string v2, ""

    .line 202
    .local v2, "description":Ljava/lang/String;
    :try_start_0
    const-string v13, "?"

    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    .line 203
    .local v12, "strippedURL":Ljava/lang/String;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .local v1, "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 206
    .local v4, "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v13, "&"

    invoke-virtual {v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    array-length v15, v14

    const/4 v13, 0x0

    :goto_0
    if-lt v13, v15, :cond_1

    .line 209
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_2

    .line 217
    const-string v13, "link"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v5, v0

    .line 218
    const-string v13, "picture"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v9, v0

    .line 219
    const-string v13, "name"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v7, v0

    .line 220
    const-string v13, "description"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v2, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    .end local v1    # "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v12    # "strippedURL":Ljava/lang/String;
    :goto_2
    new-instance v13, Lcom/facebook/share/model/ShareLinkContent$Builder;

    invoke-direct {v13}, Lcom/facebook/share/model/ShareLinkContent$Builder;-><init>()V

    invoke-virtual {v13, v7}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentTitle(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v13

    invoke-virtual {v13, v2}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentDescription(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v13

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareContent$Builder;

    move-result-object v13

    check-cast v13, Lcom/facebook/share/model/ShareLinkContent$Builder;

    invoke-virtual {v13}, Lcom/facebook/share/model/ShareLinkContent$Builder;->build()Lcom/facebook/share/model/ShareLinkContent;

    move-result-object v6

    .line 232
    .local v6, "linkContent":Lcom/facebook/share/model/ShareLinkContent;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->shareDialog:Lcom/facebook/share/widget/ShareDialog;

    invoke-virtual {v13, v6}, Lcom/facebook/share/widget/ShareDialog;->show(Ljava/lang/Object;)V

    .line 234
    return-void

    .line 206
    .end local v6    # "linkContent":Lcom/facebook/share/model/ShareLinkContent;
    .restart local v1    # "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v4    # "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v12    # "strippedURL":Ljava/lang/String;
    :cond_1
    :try_start_1
    aget-object v8, v14, v13

    .line 207
    .local v8, "param":Ljava/lang/String;
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 209
    .end local v8    # "param":Ljava/lang/String;
    :cond_2
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 211
    .local v11, "str":Ljava/lang/String;
    const-string v14, "="

    invoke-virtual {v11, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 212
    .local v10, "splitParam":[Ljava/lang/String;
    array-length v14, v10

    const/4 v15, 0x2

    if-ne v14, v15, :cond_0

    .line 213
    const/4 v14, 0x0

    aget-object v14, v10, v14

    const/4 v15, 0x1

    aget-object v15, v10, v15

    invoke-static {v15}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 225
    .end local v1    # "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v10    # "splitParam":[Ljava/lang/String;
    .end local v11    # "str":Ljava/lang/String;
    .end local v12    # "strippedURL":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 226
    .local v3, "e":Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2
.end method

.method public loadUrlOnUIThread(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 134
    new-instance v0, Lcom/nbcuni/nbc/thevoice/PopupActivity$2;

    invoke-direct {v0, p0, p1}, Lcom/nbcuni/nbc/thevoice/PopupActivity$2;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 143
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 148
    invoke-super {p0, p1, p2, p3}, Lcom/comscore/instrumentation/InstrumentedActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 149
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->callbackManager:Lcom/facebook/CallbackManager;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    .line 150
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 18
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 239
    invoke-super/range {p0 .. p1}, Lcom/comscore/instrumentation/InstrumentedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 241
    const/4 v2, 0x1

    :try_start_0
    sput-boolean v2, Lcom/nbcuni/nbc/thevoice/MainActivity;->popupOpened:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    :goto_0
    const-string v2, "power"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/os/PowerManager;

    .line 245
    .local v14, "pm":Landroid/os/PowerManager;
    const/4 v2, 0x6

    const-string v3, "NoTurningOff"

    invoke-virtual {v14, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->wl:Landroid/os/PowerManager$WakeLock;

    .line 246
    const/4 v2, 0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->requestWindowFeature(I)Z

    .line 247
    const v2, 0x7f030015

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->setContentView(I)V

    .line 249
    const-string v2, "PushPreferences"

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 251
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v11

    .line 252
    .local v11, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v2, "activityTimer"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-interface {v11, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 253
    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 255
    invoke-virtual/range {p0 .. p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 256
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->callbackManager:Lcom/facebook/CallbackManager;

    .line 257
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->callbackManager:Lcom/facebook/CallbackManager;

    new-instance v4, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V

    invoke-virtual {v2, v3, v4}, Lcom/facebook/login/LoginManager;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 285
    new-instance v2, Lcom/facebook/share/widget/ShareDialog;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/facebook/share/widget/ShareDialog;-><init>(Landroid/app/Activity;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->shareDialog:Lcom/facebook/share/widget/ShareDialog;

    .line 287
    const v2, 0x7f090055

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingImage:Landroid/widget/ImageView;

    .line 288
    invoke-virtual/range {p0 .. p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f040005

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v8

    .line 289
    .local v8, "anim":Landroid/view/animation/Animation;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingImage:Landroid/widget/ImageView;

    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 290
    const v2, 0x7f090053

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingScreen:Landroid/widget/RelativeLayout;

    .line 291
    const v2, 0x7f090054

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingDialog:Landroid/widget/RelativeLayout;

    .line 292
    const v2, 0x7f090057

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->tryAgainScreen:Landroid/widget/RelativeLayout;

    .line 294
    const v2, 0x7f090052

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    .line 295
    .local v12, "phaseTextView":Landroid/widget/TextView;
    invoke-virtual/range {p0 .. p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    .line 296
    .local v9, "b":Landroid/os/Bundle;
    const-string v2, "key"

    invoke-virtual {v9, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 298
    .local v16, "url":Ljava/lang/String;
    const-string v2, "http://www.nbc.com/the-voice/redirect"

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 299
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->gatekeeperFull:Z

    .line 305
    :goto_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "votenowURL"

    const-string v4, "votenow"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "facebook.com"

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 306
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingScreen:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 307
    new-instance v2, Lcom/nbcuni/nbc/thevoice/PopupActivity$5;

    const-wide/16 v4, 0x4e20

    const-wide/16 v6, 0x7d0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/nbcuni/nbc/thevoice/PopupActivity$5;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;JJ)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;

    .line 322
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v2}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 324
    :cond_0
    const v2, 0x7f09005a

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/ImageButton;

    .line 325
    .local v15, "tryAgainButton":Landroid/widget/ImageButton;
    new-instance v2, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V

    invoke-virtual {v15, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 353
    const-string v2, "nav"

    invoke-virtual {v9, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->nav:Ljava/lang/Boolean;

    .line 354
    const-string v2, "phase"

    const-string v3, "null"

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 355
    .local v13, "phaseValue":Ljava/lang/String;
    const-string v2, "null"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 356
    const-string v2, ""

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    :goto_2
    const v2, 0x7f09004f

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/ImageButton;

    .line 362
    .local v10, "closeBtn":Landroid/widget/ImageButton;
    new-instance v2, Lcom/nbcuni/nbc/thevoice/PopupActivity$7;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$7;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V

    invoke-virtual {v10, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 372
    const v2, 0x7f09005b

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    sput-object v2, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    .line 374
    sget-object v2, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v17

    .line 375
    .local v17, "webSettings":Landroid/webkit/WebSettings;
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 376
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 377
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 378
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 379
    invoke-virtual/range {v17 .. v17}, Landroid/webkit/WebSettings;->supportMultipleWindows()Z

    .line 380
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-ge v2, v3, :cond_1

    .line 381
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/data/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/database"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 382
    :cond_1
    sget-object v2, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 383
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_2

    .line 384
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    sget-object v3, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 385
    const/4 v2, 0x2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 387
    :cond_2
    sget-object v2, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    new-instance v3, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->jsListener:Lcom/nbcuni/nbc/thevoice/PopupJSListener;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v4}, Lcom/nbcuni/nbc/thevoice/PopupJSHandler;-><init>(Landroid/app/Activity;Lcom/nbcuni/nbc/thevoice/PopupJSListener;)V

    const-string v4, "PopupHandler"

    invoke-virtual {v2, v3, v4}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    sget-object v2, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    new-instance v3, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 488
    sget-object v2, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    new-instance v3, Lcom/nbcuni/nbc/thevoice/PopupActivity$9;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$9;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 505
    const-string v2, "facebook.com"

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "votenowURL"

    const-string v4, "votenow"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 506
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "#access_token="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadUrlOnUIThread(Ljava/lang/String;)V

    .line 513
    :goto_3
    return-void

    .line 301
    .end local v10    # "closeBtn":Landroid/widget/ImageButton;
    .end local v13    # "phaseValue":Ljava/lang/String;
    .end local v15    # "tryAgainButton":Landroid/widget/ImageButton;
    .end local v17    # "webSettings":Landroid/webkit/WebSettings;
    :cond_3
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->gatekeeperFull:Z

    goto/16 :goto_1

    .line 358
    .restart local v13    # "phaseValue":Ljava/lang/String;
    .restart local v15    # "tryAgainButton":Landroid/widget/ImageButton;
    :cond_4
    invoke-virtual {v13}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 507
    .restart local v10    # "closeBtn":Landroid/widget/ImageButton;
    .restart local v17    # "webSettings":Landroid/webkit/WebSettings;
    :cond_5
    const-string v2, "facebook.com"

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "votenowURL"

    const-string v4, "votenow"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "fbAuthToken"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 508
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "#access_token="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v4, "fbAuthToken"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadUrlOnUIThread(Ljava/lang/String;)V

    goto :goto_3

    .line 510
    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadUrlOnUIThread(Ljava/lang/String;)V

    goto :goto_3

    .line 242
    .end local v8    # "anim":Landroid/view/animation/Animation;
    .end local v9    # "b":Landroid/os/Bundle;
    .end local v10    # "closeBtn":Landroid/widget/ImageButton;
    .end local v11    # "editor":Landroid/content/SharedPreferences$Editor;
    .end local v12    # "phaseTextView":Landroid/widget/TextView;
    .end local v13    # "phaseValue":Ljava/lang/String;
    .end local v14    # "pm":Landroid/os/PowerManager;
    .end local v15    # "tryAgainButton":Landroid/widget/ImageButton;
    .end local v16    # "url":Ljava/lang/String;
    .end local v17    # "webSettings":Landroid/webkit/WebSettings;
    :catch_0
    move-exception v2

    goto/16 :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 518
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    const-string v1, "about:blank"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 519
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 520
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 521
    :cond_0
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onDestroy()V

    .line 523
    const/4 v0, 0x0

    :try_start_0
    sput-boolean v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->popupOpened:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 526
    :goto_0
    return-void

    .line 524
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v1, 0x0

    .line 162
    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 170
    :goto_0
    return v1

    .line 165
    :cond_0
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 168
    :cond_1
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 531
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->pauseTimers()V

    .line 532
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 534
    :cond_0
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onPause()V

    .line 535
    return-void
.end method

.method protected onResume()V
    .locals 6

    .prologue
    .line 540
    sget-object v0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->resumeTimers()V

    .line 541
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    .line 542
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 543
    :cond_0
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onResume()V

    .line 546
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "activityTimer"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xdbba00

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 547
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    .line 548
    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 553
    invoke-super {p0, p1}, Lcom/comscore/instrumentation/InstrumentedActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 554
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 559
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onStart()V

    .line 560
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 176
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onStop()V

    .line 177
    return-void
.end method

.method public sendMessageToJS(Ljava/lang/String;)V
    .locals 3
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nativeWrapper.onMessage(JSON.parse(\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'))"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 182
    .local v0, "jsCommand":Ljava/lang/String;
    new-instance v1, Lcom/nbcuni/nbc/thevoice/PopupActivity$3;

    invoke-direct {v1, p0, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$3;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 192
    return-void
.end method
