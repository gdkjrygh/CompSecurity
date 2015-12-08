.class Lcom/nbcuni/nbc/thevoice/MainActivity$14;
.super Landroid/webkit/WebViewClient;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->createWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 1266
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$14;)Lcom/nbcuni/nbc/thevoice/MainActivity;
    .locals 1

    .prologue
    .line 1266
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    return-object v0
.end method

.method private getUtf8EncodedCssWebResourceResponse(Ljava/io/InputStream;)Landroid/webkit/WebResourceResponse;
    .locals 3
    .param p1, "data"    # Ljava/io/InputStream;

    .prologue
    .line 1482
    new-instance v0, Landroid/webkit/WebResourceResponse;

    const-string v1, "text/css"

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2, p1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object v0
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 1271
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "javascript: window.nativeWrapper = window.nativeWrapper || {}; window.nativeWrapper.os= \"Android\"; window.nativeWrapper.name=\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v5, 0x7f080049

    invoke-virtual {v4, v5}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.osVersion=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->OSVersion:Ljava/lang/String;
    invoke-static {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$24(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.version=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget v4, v4, Lcom/nbcuni/nbc/thevoice/MainActivity;->VERSION:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.deviceModel=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.capabilities= [\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->deviceCapability:Ljava/lang/String;
    invoke-static {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$25(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\']; window.nativeWrapper.pushEnabled="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;
    invoke-static {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$13(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "push"

    const/4 v6, 0x1

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "; window.nativeWrapper.serverUrl=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v4, v4, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendUrl:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.timeZone=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getTimeZone()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.gatekeeperTimestamp=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-wide v4, v4, Lcom/nbcuni/nbc/thevoice/MainActivity;->gatekeeperTimestamp:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\"; window.nativeWrapper.gatekeeperResponse=JSON.parse(\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v4, v4, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendResponse:Lorg/json/JSONObject;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\');"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1272
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v2

    const-string v3, "javascript: window.nativeWrapper.sendMessage = function(messageObject) {NBCHandler.parseMessageObject(JSON.stringify(messageObject));}"

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1273
    const-string v1, "{\"type\":\"Event\",\"subject\":\"BridgeReady\"}"

    .line 1274
    .local v1, "readyString":Ljava/lang/String;
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v2

    const-string v3, "javascript: if(nativeWrapper.onMessage){ nativeWrapper.onMessage(JSON.parse(\'{\"type\":\"Event\",\"subject\":\"BridgeReady\"}\'))}"

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1276
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v2, v2, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendUrl:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 1277
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\"type\":\"Event\",\"subject\":\"GatekeeperReady\",\"payload\":{\"gatekeeperTimestamp\":\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-wide v4, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->gatekeeperTimestamp:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\", \"gatekeeperResponse\":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendResponse:Lorg/json/JSONObject;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "}}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1278
    .local v0, "message":Ljava/lang/String;
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "javascript: if(nativeWrapper.onMessage){ nativeWrapper.onMessage(JSON.parse(\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'))}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1281
    .end local v0    # "message":Ljava/lang/String;
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1283
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$26(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/os/CountDownTimer;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1284
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$26(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/os/CountDownTimer;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/CountDownTimer;->cancel()V

    .line 1286
    :cond_1
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 1291
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    new-instance v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14$1;

    const-wide/16 v2, 0x2710

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/nbcuni/nbc/thevoice/MainActivity$14$1;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$14;JJ)V

    invoke-static {v6, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$27(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/os/CountDownTimer;)V

    .line 1306
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$26(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 1307
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 1308
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 1313
    const-string v0, "WebLog"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "eCode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " desc: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1315
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$26(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1316
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$26(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 1317
    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getConnectionStatus(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1318
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "about:blank"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1319
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1320
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showDNSDialog()V

    .line 1323
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 1324
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 5
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1330
    const-string v3, "/"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "/"

    invoke-virtual {p2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1331
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v3

    .line 1351
    :goto_0
    return-object v3

    .line 1333
    :cond_1
    const-string v3, "/"

    invoke-virtual {p2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 1335
    .local v2, "fileName":Ljava/lang/String;
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->assets:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1338
    :try_start_0
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1339
    .local v0, "assetFile":Ljava/io/File;
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 1340
    .local v1, "assetFis":Ljava/io/FileInputStream;
    invoke-direct {p0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->getUtf8EncodedCssWebResourceResponse(Ljava/io/InputStream;)Landroid/webkit/WebResourceResponse;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    .line 1341
    .end local v0    # "assetFile":Ljava/io/File;
    .end local v1    # "assetFis":Ljava/io/FileInputStream;
    :catch_0
    move-exception v3

    .line 1345
    :try_start_1
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->getUtf8EncodedCssWebResourceResponse(Ljava/io/InputStream;)Landroid/webkit/WebResourceResponse;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    goto :goto_0

    .line 1346
    :catch_1
    move-exception v3

    .line 1349
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v3

    goto :goto_0

    .line 1351
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v3

    goto :goto_0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 16
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 1357
    const-string v14, "nissanoffthestage"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_0

    .line 1358
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1359
    .local v6, "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1360
    .local v1, "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1361
    const-string v14, "key"

    move-object/from16 v0, p2

    invoke-virtual {v1, v14, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1362
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1363
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1364
    const/4 v14, 0x1

    .line 1477
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v6    # "intent":Landroid/content/Intent;
    :goto_0
    return v14

    .line 1367
    :cond_0
    const-string v14, "emopenwebview"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 1368
    const-string v14, "emopenwebview=1"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 1369
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1370
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1371
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1372
    const-string v14, "key"

    move-object/from16 v0, p2

    invoke-virtual {v1, v14, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1373
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1374
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1375
    const/4 v14, 0x1

    goto :goto_0

    .line 1378
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v6    # "intent":Landroid/content/Intent;
    :cond_1
    const-string v14, "emopenwebview=0"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 1379
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1380
    .local v13, "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v2, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1381
    .local v2, "browserIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1382
    const/4 v14, 0x1

    goto :goto_0

    .line 1386
    .end local v2    # "browserIntent":Landroid/content/Intent;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_2
    const-string v14, "www.facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_3

    const-string v14, "dialog/feed"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 1387
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 1388
    const/4 v14, 0x1

    goto :goto_0

    .line 1390
    :cond_3
    const-string v14, ".facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_4

    const-string v14, "dialog/share"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_4

    .line 1391
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 1392
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1394
    :cond_4
    const-string v14, ".facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_5

    const-string v14, "dialog"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_5

    const-string v14, "feed"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_5

    .line 1395
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 1396
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1398
    :cond_5
    const-string v14, ".facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_6

    const-string v14, "dialog"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_6

    const-string v14, "share"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_6

    .line 1399
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 1400
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1402
    :cond_6
    const-string v14, "www.facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_7

    const-string v14, "dialog/oauth"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_7

    .line 1403
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1404
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1405
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1406
    const-string v14, "key"

    move-object/from16 v0, p2

    invoke-virtual {v1, v14, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1407
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1408
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1409
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1412
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v6    # "intent":Landroid/content/Intent;
    :cond_7
    const-string v14, "market://"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_8

    .line 1413
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-object/from16 v0, p2

    # invokes: Lcom/nbcuni/nbc/thevoice/MainActivity;->openAppStore(Ljava/lang/String;)V
    invoke-static {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$23(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    .line 1414
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1417
    :cond_8
    const-string v14, "twitter.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_9

    .line 1418
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1419
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v12, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v12, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1420
    .local v12, "tweetIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v15, "Tweet!"

    invoke-static {v12, v15}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1421
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1424
    .end local v12    # "tweetIntent":Landroid/content/Intent;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_9
    const-string v14, "sms:"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_a

    .line 1426
    const-string v14, ":"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1427
    .local v3, "cIndex":I
    const-string v14, "?"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    .line 1428
    .local v9, "qIndex":I
    const-string v14, "="

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 1429
    .local v5, "eIndex":I
    add-int/lit8 v14, v3, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 1430
    .local v11, "to":Ljava/lang/String;
    add-int/lit8 v14, v5, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 1432
    .local v7, "message":Ljava/lang/String;
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "smsto:"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1433
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v10, Landroid/content/Intent;

    const-string v14, "android.intent.action.SENDTO"

    invoke-direct {v10, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1434
    .local v10, "smsIntent":Landroid/content/Intent;
    const-string v14, "sms_body"

    invoke-virtual {v10, v14, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1435
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v10}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1436
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1439
    .end local v3    # "cIndex":I
    .end local v5    # "eIndex":I
    .end local v7    # "message":Ljava/lang/String;
    .end local v9    # "qIndex":I
    .end local v10    # "smsIntent":Landroid/content/Intent;
    .end local v11    # "to":Ljava/lang/String;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_a
    const-string v14, "popup-nav"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_b

    .line 1440
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1441
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1442
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x1

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1443
    const-string v14, ":"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 1444
    .local v8, "paramIndex":I
    add-int/lit8 v14, v8, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 1445
    .local v4, "cutUrl":Ljava/lang/String;
    const-string v14, "key"

    invoke-virtual {v1, v14, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1446
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1447
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1448
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1451
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v4    # "cutUrl":Ljava/lang/String;
    .end local v6    # "intent":Landroid/content/Intent;
    .end local v8    # "paramIndex":I
    :cond_b
    const-string v14, "popup"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 1452
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1453
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1454
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1455
    const-string v14, ":"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 1456
    .restart local v8    # "paramIndex":I
    add-int/lit8 v14, v8, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 1457
    .restart local v4    # "cutUrl":Ljava/lang/String;
    const-string v14, "key"

    invoke-virtual {v1, v14, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1458
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1459
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1460
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1463
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v4    # "cutUrl":Ljava/lang/String;
    .end local v6    # "intent":Landroid/content/Intent;
    .end local v8    # "paramIndex":I
    :cond_c
    const-string v14, "mailto"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_d

    const-string v14, "tel:"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_e

    .line 1464
    :cond_d
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1465
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v2, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1466
    .restart local v2    # "browserIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1467
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1470
    .end local v2    # "browserIntent":Landroid/content/Intent;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_e
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webURL:Ljava/lang/String;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$17(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_f

    .line 1471
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1472
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v2, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1473
    .restart local v2    # "browserIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v14, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1474
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1477
    .end local v2    # "browserIntent":Landroid/content/Intent;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_f
    const/4 v14, 0x0

    goto/16 :goto_0
.end method
