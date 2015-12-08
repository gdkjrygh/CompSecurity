.class public Lcom/urbanairship/widget/RichPushMessageWebView;
.super Lcom/urbanairship/widget/UAWebView;
.source "RichPushMessageWebView.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x5
.end annotation


# instance fields
.field private currentMessage:Lcom/urbanairship/richpush/RichPushMessage;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 83
    invoke-direct {p0, p1}, Lcom/urbanairship/widget/UAWebView;-><init>(Landroid/content/Context;)V

    .line 84
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Lcom/urbanairship/widget/UAWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 64
    invoke-direct {p0, p1, p2, p3}, Lcom/urbanairship/widget/UAWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    return-void
.end method


# virtual methods
.method public getCurrentMessage()Lcom/urbanairship/richpush/RichPushMessage;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/urbanairship/widget/RichPushMessageWebView;->currentMessage:Lcom/urbanairship/richpush/RichPushMessage;

    return-object v0
.end method

.method public loadRichPushMessage(Lcom/urbanairship/richpush/RichPushMessage;)V
    .locals 7
    .param p1, "message"    # Lcom/urbanairship/richpush/RichPushMessage;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 93
    invoke-virtual {p0}, Lcom/urbanairship/widget/RichPushMessageWebView;->onPreLoad()V

    .line 95
    if-nez p1, :cond_0

    .line 96
    const-string v4, "Unable to load null message into RichPushMessageWebView"

    invoke-static {v4}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 122
    :goto_0
    return-void

    .line 100
    :cond_0
    iput-object p1, p0, Lcom/urbanairship/widget/RichPushMessageWebView;->currentMessage:Lcom/urbanairship/richpush/RichPushMessage;

    .line 102
    invoke-virtual {p0, p1}, Lcom/urbanairship/widget/RichPushMessageWebView;->loadUrbanAirshipJavascriptInterface(Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 104
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v3

    .line 107
    .local v3, "user":Lcom/urbanairship/richpush/RichPushUser;
    invoke-virtual {p1}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageBodyUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/urbanairship/richpush/RichPushUser;->getPassword()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v4, v5, v6}, Lcom/urbanairship/widget/RichPushMessageWebView;->setClientAuthRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x8

    if-lt v4, v5, :cond_1

    .line 112
    new-instance v1, Lorg/apache/http/auth/UsernamePasswordCredentials;

    invoke-virtual {v3}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/urbanairship/richpush/RichPushUser;->getPassword()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Lorg/apache/http/auth/UsernamePasswordCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .local v1, "credentials":Lorg/apache/http/auth/UsernamePasswordCredentials;
    const-string v4, "UTF-8"

    const/4 v5, 0x0

    invoke-static {v1, v4, v5}, Lorg/apache/http/impl/auth/BasicScheme;->authenticate(Lorg/apache/http/auth/Credentials;Ljava/lang/String;Z)Lorg/apache/http/Header;

    move-result-object v0

    .line 115
    .local v0, "credentialHeader":Lorg/apache/http/Header;
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 116
    .local v2, "headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    invoke-virtual {p1}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageBodyUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, v2}, Lcom/urbanairship/widget/RichPushMessageWebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 120
    .end local v0    # "credentialHeader":Lorg/apache/http/Header;
    .end local v1    # "credentials":Lorg/apache/http/auth/UsernamePasswordCredentials;
    .end local v2    # "headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    invoke-virtual {p1}, Lcom/urbanairship/richpush/RichPushMessage;->getMessageBodyUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/urbanairship/widget/RichPushMessageWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected loadUrbanAirshipJavascriptInterface(Lcom/urbanairship/richpush/RichPushMessage;)V
    .locals 3
    .param p1, "message"    # Lcom/urbanairship/richpush/RichPushMessage;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "AddJavascriptInterface"
        }
    .end annotation

    .prologue
    .line 138
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_0

    .line 139
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p0, p1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 141
    .local v0, "js":Lcom/urbanairship/js/UAJavascriptInterface;
    const-string v1, "urbanairship"

    invoke-virtual {p0, v1}, Lcom/urbanairship/widget/RichPushMessageWebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 142
    const-string v1, "urbanairship"

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/widget/RichPushMessageWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    const-string v1, "_UAirship"

    invoke-virtual {p0, v1}, Lcom/urbanairship/widget/RichPushMessageWebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 145
    const-string v1, "_UAirship"

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/widget/RichPushMessageWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .end local v0    # "js":Lcom/urbanairship/js/UAJavascriptInterface;
    :cond_0
    return-void
.end method
