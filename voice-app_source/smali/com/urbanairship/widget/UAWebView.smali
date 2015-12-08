.class public Lcom/urbanairship/widget/UAWebView;
.super Landroid/webkit/WebView;
.source "UAWebView.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x5
.end annotation


# static fields
.field private static final CACHE_DIRECTORY:Ljava/lang/String; = "urbanairship"


# instance fields
.field private currentClientAuthRequestUrl:Ljava/lang/String;

.field private webViewClient:Landroid/webkit/WebViewClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 64
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 65
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->init()V

    .line 68
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 77
    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 78
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->init()V

    .line 81
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 91
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 92
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->init()V

    .line 95
    :cond_0
    return-void
.end method

.method private getCachePath()Ljava/lang/String;
    .locals 3

    .prologue
    .line 232
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "urbanairship"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 233
    .local v0, "cacheDirectory":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 234
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 237
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method getWebViewClient()Landroid/webkit/WebViewClient;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/urbanairship/widget/UAWebView;->webViewClient:Landroid/webkit/WebViewClient;

    return-object v0
.end method

.method init()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "SetJavaScriptEnabled"
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 103
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 105
    .local v0, "settings":Landroid/webkit/WebSettings;
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x7

    if-lt v1, v2, :cond_0

    .line 106
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 107
    invoke-direct {p0}, Lcom/urbanairship/widget/UAWebView;->getCachePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 108
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 111
    :cond_0
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 112
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 113
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 115
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->initializeView()V

    .line 116
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->populateCustomJavascriptInterfaces()V

    .line 117
    return-void
.end method

.method protected initializeView()V
    .locals 0

    .prologue
    .line 127
    return-void
.end method

.method public loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # Ljava/lang/String;
    .param p2, "mimeType"    # Ljava/lang/String;
    .param p3, "encoding"    # Ljava/lang/String;

    .prologue
    .line 156
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->onPreLoad()V

    .line 157
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    return-void
.end method

.method public loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "baseUrl"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;
    .param p3, "mimeType"    # Ljava/lang/String;
    .param p4, "encoding"    # Ljava/lang/String;
    .param p5, "historyUrl"    # Ljava/lang/String;

    .prologue
    .line 162
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->onPreLoad()V

    .line 163
    invoke-super/range {p0 .. p5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 171
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->onPreLoad()V

    .line 172
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 173
    return-void
.end method

.method public loadUrl(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x8
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 183
    .local p2, "additionalHttpHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->onPreLoad()V

    .line 184
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 185
    return-void
.end method

.method final onPreLoad()V
    .locals 2

    .prologue
    .line 202
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v1

    if-nez v1, :cond_0

    .line 203
    const-string v1, "No web view client set, setting a default UAWebViewClient for landing page view."

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 205
    new-instance v1, Lcom/urbanairship/widget/UAWebViewClient;

    invoke-direct {v1}, Lcom/urbanairship/widget/UAWebViewClient;-><init>()V

    invoke-virtual {p0, v1}, Lcom/urbanairship/widget/UAWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 209
    :cond_0
    iget-object v1, p0, Lcom/urbanairship/widget/UAWebView;->currentClientAuthRequestUrl:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v1

    instance-of v1, v1, Lcom/urbanairship/widget/UAWebViewClient;

    if-eqz v1, :cond_1

    .line 210
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/widget/UAWebViewClient;

    .line 211
    .local v0, "webViewClient":Lcom/urbanairship/widget/UAWebViewClient;
    iget-object v1, p0, Lcom/urbanairship/widget/UAWebView;->currentClientAuthRequestUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/urbanairship/widget/UAWebViewClient;->removeAuthRequestCredentials(Ljava/lang/String;)V

    .line 212
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/urbanairship/widget/UAWebView;->currentClientAuthRequestUrl:Ljava/lang/String;

    .line 214
    .end local v0    # "webViewClient":Lcom/urbanairship/widget/UAWebViewClient;
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 145
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getScrollY()I

    move-result v1

    .line 147
    .local v1, "y":I
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getScrollX()I

    move-result v0

    .line 148
    .local v0, "x":I
    invoke-virtual {p0, v0, v1, v0, v1}, Lcom/urbanairship/widget/UAWebView;->onScrollChanged(IIII)V

    .line 151
    .end local v0    # "x":I
    .end local v1    # "y":I
    :cond_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    return v2
.end method

.method protected populateCustomJavascriptInterfaces()V
    .locals 0

    .prologue
    .line 138
    return-void
.end method

.method setClientAuthRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "username"    # Ljava/lang/String;
    .param p3, "password"    # Ljava/lang/String;

    .prologue
    .line 248
    if-nez p1, :cond_1

    .line 260
    :cond_0
    :goto_0
    return-void

    .line 252
    :cond_1
    iput-object p1, p0, Lcom/urbanairship/widget/UAWebView;->currentClientAuthRequestUrl:Ljava/lang/String;

    .line 254
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v2

    instance-of v2, v2, Lcom/urbanairship/widget/UAWebViewClient;

    if-eqz v2, :cond_0

    .line 255
    invoke-virtual {p0}, Lcom/urbanairship/widget/UAWebView;->getWebViewClient()Landroid/webkit/WebViewClient;

    move-result-object v1

    check-cast v1, Lcom/urbanairship/widget/UAWebViewClient;

    .line 257
    .local v1, "webViewClient":Lcom/urbanairship/widget/UAWebViewClient;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 258
    .local v0, "host":Ljava/lang/String;
    invoke-virtual {v1, v0, p2, p3}, Lcom/urbanairship/widget/UAWebViewClient;->addAuthRequestCredentials(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1
    .param p1, "webViewClient"    # Landroid/webkit/WebViewClient;

    .prologue
    .line 189
    instance-of v0, p1, Lcom/urbanairship/widget/UAWebViewClient;

    if-nez v0, :cond_0

    .line 190
    const-string v0, "The web view client should extend UAWebViewClient to support urban airship url overrides and triggering actions from."

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 194
    :cond_0
    iput-object p1, p0, Lcom/urbanairship/widget/UAWebView;->webViewClient:Landroid/webkit/WebViewClient;

    .line 195
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 196
    return-void
.end method
