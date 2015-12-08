.class public Lcom/urbanairship/js/UAJavascriptInterface;
.super Ljava/lang/Object;
.source "UAJavascriptInterface.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/js/UAJavascriptInterface$4;
    }
.end annotation


# static fields
.field public static final DEPRECATED_JAVASCRIPT_IDENTIFIER:Ljava/lang/String; = "urbanairship"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final JAVASCRIPT_IDENTIFIER:Ljava/lang/String; = "_UAirship"

.field private static dateFormatter:Ljava/text/SimpleDateFormat;


# instance fields
.field private final actionRunner:Lcom/urbanairship/actions/ActionRunner;

.field private final message:Lcom/urbanairship/richpush/RichPushMessage;

.field private final webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 2
    .param p1, "webView"    # Landroid/webkit/WebView;

    .prologue
    .line 90
    invoke-static {}, Lcom/urbanairship/actions/ActionRunner;->shared()Lcom/urbanairship/actions/ActionRunner;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/actions/ActionRunner;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 91
    return-void
.end method

.method constructor <init>(Landroid/webkit/WebView;Lcom/urbanairship/actions/ActionRunner;Lcom/urbanairship/richpush/RichPushMessage;)V
    .locals 0
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "actionRunner"    # Lcom/urbanairship/actions/ActionRunner;
    .param p3, "message"    # Lcom/urbanairship/richpush/RichPushMessage;

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    .line 105
    iput-object p2, p0, Lcom/urbanairship/js/UAJavascriptInterface;->actionRunner:Lcom/urbanairship/actions/ActionRunner;

    .line 106
    iput-object p3, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    .line 107
    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V
    .locals 1
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "message"    # Lcom/urbanairship/richpush/RichPushMessage;

    .prologue
    .line 100
    invoke-static {}, Lcom/urbanairship/actions/ActionRunner;->shared()Lcom/urbanairship/actions/ActionRunner;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/actions/ActionRunner;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 101
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/js/UAJavascriptInterface;)Landroid/webkit/WebView;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/js/UAJavascriptInterface;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$100(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;Lcom/urbanairship/actions/ActionResult;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/js/UAJavascriptInterface;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Lcom/urbanairship/actions/ActionResult;

    .prologue
    .line 60
    invoke-direct {p0, p1, p2}, Lcom/urbanairship/js/UAJavascriptInterface;->createErrorMessageFromResult(Ljava/lang/String;Lcom/urbanairship/actions/ActionResult;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/js/UAJavascriptInterface;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/lang/Object;
    .param p3, "x3"    # Ljava/lang/String;

    .prologue
    .line 60
    invoke-direct {p0, p1, p2, p3}, Lcom/urbanairship/js/UAJavascriptInterface;->runActionCallback(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private createErrorMessageFromResult(Ljava/lang/String;Lcom/urbanairship/actions/ActionResult;)Ljava/lang/String;
    .locals 4
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "result"    # Lcom/urbanairship/actions/ActionResult;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 302
    sget-object v0, Lcom/urbanairship/js/UAJavascriptInterface$4;->$SwitchMap$com$urbanairship$actions$ActionResult$Status:[I

    invoke-virtual {p2}, Lcom/urbanairship/actions/ActionResult;->getStatus()Lcom/urbanairship/actions/ActionResult$Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/actions/ActionResult$Status;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 313
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 304
    :pswitch_0
    const-string v0, "Action %s not found"

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 306
    :pswitch_1
    const-string v0, "Action %s rejected its arguments"

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 308
    :pswitch_2
    invoke-virtual {p2}, Lcom/urbanairship/actions/ActionResult;->getException()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 309
    invoke-virtual {p2}, Lcom/urbanairship/actions/ActionResult;->getException()Ljava/lang/Exception;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 311
    :cond_0
    const-string v0, "Action %s failed with unspecified error"

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 302
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private decodeArguments(Ljava/lang/String;)Lcom/urbanairship/actions/ActionArguments;
    .locals 6
    .param p1, "encodedArguments"    # Ljava/lang/String;

    .prologue
    .line 286
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 287
    .local v0, "argumentsJSON":Lorg/json/JSONObject;
    invoke-static {v0}, Lcom/urbanairship/util/JSONUtils;->convertToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    .line 288
    .local v1, "argumentsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    new-instance v3, Lcom/urbanairship/actions/ActionArguments;

    sget-object v4, Lcom/urbanairship/actions/Situation;->WEB_VIEW_INVOCATION:Lcom/urbanairship/actions/Situation;

    const-string v5, "value"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/urbanairship/actions/ActionArguments;-><init>(Lcom/urbanairship/actions/Situation;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    .end local v0    # "argumentsJSON":Lorg/json/JSONObject;
    .end local v1    # "argumentsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :goto_0
    return-object v3

    .line 289
    :catch_0
    move-exception v2

    .line 290
    .local v2, "e":Lorg/json/JSONException;
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private runActionCallback(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 11
    .param p1, "error"    # Ljava/lang/String;
    .param p2, "resultValue"    # Ljava/lang/Object;
    .param p3, "callbackKey"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewAPI"
        }
    .end annotation

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 242
    const-string v6, "\'%s\'"

    new-array v7, v10, [Ljava/lang/Object;

    aput-object p3, v7, v9

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 245
    .local v0, "callbackString":Ljava/lang/String;
    if-nez p1, :cond_1

    const-string v1, "null"

    .line 249
    .local v1, "errorString":Ljava/lang/String;
    :goto_0
    const-string v5, "null"

    .line 250
    .local v5, "resultValueString":Ljava/lang/String;
    if-eqz p2, :cond_0

    .line 251
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 254
    .local v4, "resultPayload":Lorg/json/JSONObject;
    :try_start_0
    const-string v6, "value"

    invoke-virtual {v4, v6, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 255
    const-string v6, "\'%s\'"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v4, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 262
    .end local v4    # "resultPayload":Lorg/json/JSONObject;
    :cond_0
    :goto_1
    const-string v6, "UAirship.finishAction(%s, %s, %s);"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v9

    aput-object v5, v7, v10

    const/4 v8, 0x2

    aput-object v0, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 266
    .local v2, "finishAction":Ljava/lang/String;
    iget-object v6, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v7, Lcom/urbanairship/js/UAJavascriptInterface$3;

    invoke-direct {v7, p0, v2}, Lcom/urbanairship/js/UAJavascriptInterface$3;-><init>(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 276
    return-void

    .line 245
    .end local v1    # "errorString":Ljava/lang/String;
    .end local v2    # "finishAction":Ljava/lang/String;
    .end local v5    # "resultValueString":Ljava/lang/String;
    :cond_1
    const-string v6, "new Error(\'%s\')"

    new-array v7, v10, [Ljava/lang/Object;

    aput-object p1, v7, v9

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 256
    .restart local v1    # "errorString":Ljava/lang/String;
    .restart local v4    # "resultPayload":Lorg/json/JSONObject;
    .restart local v5    # "resultValueString":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 257
    .local v3, "jx":Lorg/json/JSONException;
    const-string v6, "Unable to encode JS result value"

    invoke-static {v6}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public actionCall(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "encodedArguments"    # Ljava/lang/String;
    .param p3, "callbackKey"    # Ljava/lang/String;
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 216
    invoke-direct {p0, p2}, Lcom/urbanairship/js/UAJavascriptInterface;->decodeArguments(Ljava/lang/String;)Lcom/urbanairship/actions/ActionArguments;

    move-result-object v0

    .line 217
    .local v0, "actionArgs":Lcom/urbanairship/actions/ActionArguments;
    if-nez v0, :cond_0

    .line 218
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid encoded arguments: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 219
    const-string v1, "Unable to decode arguments payload"

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p3}, Lcom/urbanairship/js/UAJavascriptInterface;->runActionCallback(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    :goto_0
    return-void

    .line 223
    :cond_0
    iget-object v1, p0, Lcom/urbanairship/js/UAJavascriptInterface;->actionRunner:Lcom/urbanairship/actions/ActionRunner;

    new-instance v2, Lcom/urbanairship/js/UAJavascriptInterface$2;

    invoke-direct {v2, p0, p1, p3}, Lcom/urbanairship/js/UAJavascriptInterface$2;-><init>(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v0, v2}, Lcom/urbanairship/actions/ActionRunner;->runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V

    goto :goto_0
.end method

.method public close()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 189
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/urbanairship/js/UAJavascriptInterface$1;

    invoke-direct {v1, p0}, Lcom/urbanairship/js/UAJavascriptInterface$1;-><init>(Lcom/urbanairship/js/UAJavascriptInterface;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 196
    return-void
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 116
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceOrientation()Ljava/lang/String;
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 363
    iget-object v1, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v0, v1, Landroid/content/res/Configuration;->orientation:I

    .line 364
    .local v0, "orientation":I
    packed-switch v0, :pswitch_data_0

    .line 370
    const-string v1, "undefined"

    :goto_0
    return-object v1

    .line 366
    :pswitch_0
    const-string v1, "landscape"

    goto :goto_0

    .line 368
    :pswitch_1
    const-string v1, "portrait"

    goto :goto_0

    .line 364
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getMessageId()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 127
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getMessageSentDate()Ljava/lang/String;
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 148
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-nez v0, :cond_0

    .line 149
    const/4 v0, 0x0

    .line 157
    :goto_0
    return-object v0

    .line 152
    :cond_0
    sget-object v0, Lcom/urbanairship/js/UAJavascriptInterface;->dateFormatter:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_1

    .line 153
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss.SSSZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/urbanairship/js/UAJavascriptInterface;->dateFormatter:Ljava/text/SimpleDateFormat;

    .line 154
    sget-object v0, Lcom/urbanairship/js/UAJavascriptInterface;->dateFormatter:Ljava/text/SimpleDateFormat;

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 157
    :cond_1
    sget-object v0, Lcom/urbanairship/js/UAJavascriptInterface;->dateFormatter:Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushMessage;->getSentDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getMessageSentDateMS()J
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 168
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessage;->getSentDateMS()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public getMessageTitle()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 137
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessage;->getTitle()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 178
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getViewHeight()I
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 331
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getHeight()I

    move-result v0

    return v0
.end method

.method public getViewWidth()I
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 346
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getWidth()I

    move-result v0

    return v0
.end method

.method public isMessageRead()Z
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 413
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessage;->isRead()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public markMessageRead()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 424
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-eqz v0, :cond_0

    .line 425
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessage;->markRead()V

    .line 427
    :cond_0
    return-void
.end method

.method public markMessageUnread()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 437
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    if-eqz v0, :cond_0

    .line 438
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface;->message:Lcom/urbanairship/richpush/RichPushMessage;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushMessage;->markUnread()V

    .line 440
    :cond_0
    return-void
.end method

.method public navigateTo(Ljava/lang/String;)V
    .locals 5
    .param p1, "activityName"    # Ljava/lang/String;
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 385
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 403
    :goto_0
    return-void

    .line 391
    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 392
    .local v2, "intent":Landroid/content/Intent;
    const/high16 v3, 0x4000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 399
    :try_start_1
    iget-object v3, p0, Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 400
    :catch_0
    move-exception v1

    .line 401
    .local v1, "ex":Landroid/content/ActivityNotFoundException;
    const-string v3, "Activity not found"

    invoke-static {v3, v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 393
    .end local v1    # "ex":Landroid/content/ActivityNotFoundException;
    .end local v2    # "intent":Landroid/content/Intent;
    :catch_1
    move-exception v0

    .line 394
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "No class found for name "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method
