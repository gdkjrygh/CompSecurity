.class public Lcom/urbanairship/widget/UAWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "UAWebViewClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/widget/UAWebViewClient$Credentials;
    }
.end annotation


# static fields
.field private static final CLOSE_COMMAND:Ljava/lang/String; = "close"

.field private static final MARK_MESSAGE_READ_COMMAND:Ljava/lang/String; = "mark-message-read"

.field private static final MARK_MESSAGE_UNREAD_COMMAND:Ljava/lang/String; = "mark-message-unread"

.field private static final NAVIGATE_COMMAND:Ljava/lang/String; = "navigate-to"

.field public static final RUN_ACTIONS_COMMAND:Ljava/lang/String; = "run-actions"

.field private static final RUN_ACTIONS_COMMAND_CALLBACK:Ljava/lang/String; = "android-run-action-cb"

.field public static final RUN_BASIC_ACTIONS_COMMAND:Ljava/lang/String; = "run-basic-actions"

.field public static final UA_ACTION_SCHEME:Ljava/lang/String; = "uairship"


# instance fields
.field private actionRunner:Lcom/urbanairship/actions/ActionRunner;

.field private authRequestCredentials:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/urbanairship/widget/UAWebViewClient$Credentials;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 149
    invoke-static {}, Lcom/urbanairship/actions/ActionRunner;->shared()Lcom/urbanairship/actions/ActionRunner;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/urbanairship/widget/UAWebViewClient;-><init>(Lcom/urbanairship/actions/ActionRunner;)V

    .line 150
    return-void
.end method

.method constructor <init>(Lcom/urbanairship/actions/ActionRunner;)V
    .locals 1
    .param p1, "runner"    # Lcom/urbanairship/actions/ActionRunner;

    .prologue
    .line 152
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 146
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/widget/UAWebViewClient;->authRequestCredentials:Ljava/util/Map;

    .line 153
    iput-object p1, p0, Lcom/urbanairship/widget/UAWebViewClient;->actionRunner:Lcom/urbanairship/actions/ActionRunner;

    .line 154
    return-void
.end method

.method private createJavascriptInterfaceWrapper(Lcom/urbanairship/js/UAJavascriptInterface;)Ljava/lang/String;
    .locals 11
    .param p1, "jsInterface"    # Lcom/urbanairship/js/UAJavascriptInterface;

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 347
    const-string v2, "_UAirship.%s = function(){return \'%s\';};"

    .line 348
    .local v2, "stringMethod":Ljava/lang/String;
    const-string v0, "_UAirship.%s = function(){return %s;};"

    .line 350
    .local v0, "literalMethod":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "var _UAirship = {};"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 353
    .local v1, "sb":Ljava/lang/StringBuilder;
    new-array v3, v10, [Ljava/lang/Object;

    const-string v4, "getDeviceModel"

    aput-object v4, v3, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v9

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "getMessageId"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getMessageId()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "getMessageTitle"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getMessageTitle()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "getMessageSentDate"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getMessageSentDate()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "getMessageSentDateMS"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getMessageSentDateMS()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "getUserId"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getUserId()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    const-string v3, "_UAirship.invoke = function(url){"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "var f = document.createElement(\'iframe\');"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "f.style.display = \'none\';"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "f.src = url;"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "document.body.appendChild(f);"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "f.parentNode.removeChild(f);"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "};"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    const-string v3, "_UAirship.close=function(){_UAirship.invoke(\'uairship://close\');};"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    const-string v3, "_UAirship.actionCall=function(name, args, callback){"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "var url = \'uairship://android-run-action-cb/\' + name + \'/\' + encodeURIComponent(args) +\'/\' + callback;"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "_UAirship.invoke(url);"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "};"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    const-string v3, "_UAirship.navigateTo=function(activity){_UAirship.invoke(\'uairship://navigate-to/\' + activity);};"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    const-string v3, "_UAirship.markMessageRead=function(){"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "_UAirship.invoke(\'uairship://mark-message-read\');"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "isMessageRead"

    aput-object v5, v4, v8

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "};"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    const-string v3, "_UAirship.markMessageUnread=function(){"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "_UAirship.invoke(\'uairship://mark-message-unread\');"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "isMessageRead"

    aput-object v5, v4, v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "};"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    new-array v3, v10, [Ljava/lang/Object;

    const-string v4, "getViewHeight"

    aput-object v4, v3, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getViewHeight()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v9

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "getViewWidth"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->getViewWidth()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    const-string v5, "isMessageRead"

    aput-object v5, v4, v8

    invoke-virtual {p1}, Lcom/urbanairship/js/UAJavascriptInterface;->isMessageRead()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    const-string v3, "if (typeof urbanairship === \'undefined\') {urbanairship = Object.create(_UAirship);}"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method private getArgumentFromJSONString(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .param p1, "jsonString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 266
    if-nez p1, :cond_0

    .line 267
    const/4 v1, 0x0

    .line 273
    :goto_0
    return-object v1

    .line 271
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/urbanairship/util/JSONUtils;->convertToList(Lorg/json/JSONArray;)Ljava/util/List;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 272
    :catch_0
    move-exception v0

    .line 273
    .local v0, "e":Lorg/json/JSONException;
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/urbanairship/util/JSONUtils;->convertToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0
.end method

.method private runActions(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 226
    .local p1, "actions":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 227
    .local v0, "actionName":Ljava/lang/String;
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 228
    .local v2, "args":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 230
    .local v1, "arg":Ljava/lang/String;
    :try_start_0
    new-instance v3, Lcom/urbanairship/actions/ActionArguments;

    sget-object v7, Lcom/urbanairship/actions/Situation;->WEB_VIEW_INVOCATION:Lcom/urbanairship/actions/Situation;

    invoke-direct {p0, v1}, Lcom/urbanairship/widget/UAWebViewClient;->getArgumentFromJSONString(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-direct {v3, v7, v8}, Lcom/urbanairship/actions/ActionArguments;-><init>(Lcom/urbanairship/actions/Situation;Ljava/lang/Object;)V

    .line 233
    .local v3, "arguments":Lcom/urbanairship/actions/ActionArguments;
    iget-object v7, p0, Lcom/urbanairship/widget/UAWebViewClient;->actionRunner:Lcom/urbanairship/actions/ActionRunner;

    invoke-virtual {v7, v0, v3}, Lcom/urbanairship/actions/ActionRunner;->runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 234
    .end local v3    # "arguments":Lcom/urbanairship/actions/ActionArguments;
    :catch_0
    move-exception v4

    .line 235
    .local v4, "e":Lorg/json/JSONException;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Invalid json. Unable to run action "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " with args: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 240
    .end local v0    # "actionName":Ljava/lang/String;
    .end local v1    # "arg":Ljava/lang/String;
    .end local v2    # "args":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v4    # "e":Lorg/json/JSONException;
    .end local v6    # "i$":Ljava/util/Iterator;
    :cond_1
    return-void
.end method

.method private runBasicActions(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 248
    .local p1, "actions":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 249
    .local v0, "actionName":Ljava/lang/String;
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 250
    .local v2, "args":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 251
    .local v1, "arg":Ljava/lang/String;
    iget-object v5, p0, Lcom/urbanairship/widget/UAWebViewClient;->actionRunner:Lcom/urbanairship/actions/ActionRunner;

    new-instance v6, Lcom/urbanairship/actions/ActionArguments;

    sget-object v7, Lcom/urbanairship/actions/Situation;->WEB_VIEW_INVOCATION:Lcom/urbanairship/actions/Situation;

    invoke-direct {v6, v7, v1}, Lcom/urbanairship/actions/ActionArguments;-><init>(Lcom/urbanairship/actions/Situation;Ljava/lang/Object;)V

    invoke-virtual {v5, v0, v6}, Lcom/urbanairship/actions/ActionRunner;->runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)V

    goto :goto_0

    .line 255
    .end local v0    # "actionName":Ljava/lang/String;
    .end local v1    # "arg":Ljava/lang/String;
    .end local v2    # "args":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v4    # "i$":Ljava/util/Iterator;
    :cond_1
    return-void
.end method


# virtual methods
.method addAuthRequestCredentials(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "expectedAuthHost"    # Ljava/lang/String;
    .param p2, "username"    # Ljava/lang/String;
    .param p3, "password"    # Ljava/lang/String;

    .prologue
    .line 320
    iget-object v0, p0, Lcom/urbanairship/widget/UAWebViewClient;->authRequestCredentials:Ljava/util/Map;

    new-instance v1, Lcom/urbanairship/widget/UAWebViewClient$Credentials;

    invoke-direct {v1, p2, p3}, Lcom/urbanairship/widget/UAWebViewClient$Credentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 6
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewAPI"
        }
    .end annotation

    .prologue
    .line 280
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x11

    if-ge v4, v5, :cond_1

    .line 281
    const-string v4, "Loading UrbanAirship Javascript interface."

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 283
    const/4 v2, 0x0

    .line 284
    .local v2, "message":Lcom/urbanairship/richpush/RichPushMessage;
    instance-of v4, p1, Lcom/urbanairship/widget/RichPushMessageWebView;

    if-eqz v4, :cond_0

    move-object v4, p1

    .line 285
    check-cast v4, Lcom/urbanairship/widget/RichPushMessageWebView;

    invoke-virtual {v4}, Lcom/urbanairship/widget/RichPushMessageWebView;->getCurrentMessage()Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v2

    .line 288
    :cond_0
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p1, v2}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 289
    .local v0, "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    invoke-direct {p0, v0}, Lcom/urbanairship/widget/UAWebViewClient;->createJavascriptInterfaceWrapper(Lcom/urbanairship/js/UAJavascriptInterface;)Ljava/lang/String;

    move-result-object v1

    .line 290
    .local v1, "jsWrapper":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "javascript:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 294
    .end local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    .end local v1    # "jsWrapper":Ljava/lang/String;
    .end local v2    # "message":Lcom/urbanairship/richpush/RichPushMessage;
    :cond_1
    const-string v4, "Loading UrbanAirship native Javascript bridge."

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 295
    invoke-static {}, Lcom/urbanairship/js/NativeBridge;->getJavaScriptSource()Ljava/lang/String;

    move-result-object v3

    .line 296
    .local v3, "nativeBridge":Ljava/lang/String;
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_2

    .line 297
    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 301
    :goto_0
    return-void

    .line 299
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "javascript:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/HttpAuthHandler;
    .param p3, "host"    # Ljava/lang/String;
    .param p4, "realm"    # Ljava/lang/String;

    .prologue
    .line 306
    iget-object v1, p0, Lcom/urbanairship/widget/UAWebViewClient;->authRequestCredentials:Ljava/util/Map;

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/widget/UAWebViewClient$Credentials;

    .line 307
    .local v0, "credentials":Lcom/urbanairship/widget/UAWebViewClient$Credentials;
    if-eqz v0, :cond_0

    .line 308
    iget-object v1, v0, Lcom/urbanairship/widget/UAWebViewClient$Credentials;->username:Ljava/lang/String;

    iget-object v2, v0, Lcom/urbanairship/widget/UAWebViewClient$Credentials;->password:Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Landroid/webkit/HttpAuthHandler;->proceed(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    :cond_0
    return-void
.end method

.method removeAuthRequestCredentials(Ljava/lang/String;)V
    .locals 1
    .param p1, "expectedAuthHost"    # Ljava/lang/String;

    .prologue
    .line 329
    iget-object v0, p0, Lcom/urbanairship/widget/UAWebViewClient;->authRequestCredentials:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 10
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x2

    const/4 v6, 0x0

    const/4 v8, 0x1

    .line 158
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 160
    .local v4, "uri":Landroid/net/Uri;
    const/4 v1, 0x0

    .line 161
    .local v1, "message":Lcom/urbanairship/richpush/RichPushMessage;
    instance-of v5, p1, Lcom/urbanairship/widget/RichPushMessageWebView;

    if-eqz v5, :cond_0

    move-object v5, p1

    .line 162
    check-cast v5, Lcom/urbanairship/widget/RichPushMessageWebView;

    invoke-virtual {v5}, Lcom/urbanairship/widget/RichPushMessageWebView;->getCurrentMessage()Lcom/urbanairship/richpush/RichPushMessage;

    move-result-object v1

    .line 165
    :cond_0
    const-string v5, "uairship"

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 166
    const-string v5, "run-basic-actions"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 167
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Running run basic actions command for URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 168
    invoke-static {v4}, Lcom/urbanairship/util/UriUtils;->getQueryParameters(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    .line 169
    .local v2, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-direct {p0, v2}, Lcom/urbanairship/widget/UAWebViewClient;->runBasicActions(Ljava/util/Map;)V

    move v5, v8

    .line 217
    .end local v2    # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    :goto_0
    return v5

    .line 171
    :cond_1
    const-string v5, "run-actions"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 172
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Running run actions command for URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 173
    invoke-static {v4}, Lcom/urbanairship/util/UriUtils;->getQueryParameters(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    .line 174
    .restart local v2    # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-direct {p0, v2}, Lcom/urbanairship/widget/UAWebViewClient;->runActions(Ljava/util/Map;)V

    move v5, v8

    .line 175
    goto :goto_0

    .line 176
    .end local v2    # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    :cond_2
    const-string v5, "android-run-action-cb"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 177
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Running run actions command with callback for URL: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 178
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p1, v1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 179
    .local v0, "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    invoke-virtual {v4}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v3

    .line 180
    .local v3, "paths":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x3

    if-ne v5, v7, :cond_3

    .line 181
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Action: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ", Args: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ", Callback: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 182
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v5, v6, v7}, Lcom/urbanairship/js/UAJavascriptInterface;->actionCall(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    move v5, v8

    .line 186
    goto/16 :goto_0

    .line 184
    :cond_3
    const-string v5, "Unable to run action, invalid number of arguments."

    invoke-static {v5}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 187
    .end local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    .end local v3    # "paths":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_4
    const-string v5, "close"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 188
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Running close command for URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 189
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p1, v1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 190
    .restart local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    invoke-virtual {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->close()V

    move v5, v8

    .line 191
    goto/16 :goto_0

    .line 192
    .end local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    :cond_5
    const-string v5, "navigate-to"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 193
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Running navigate command for URL: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 194
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p1, v1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 195
    .restart local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    invoke-virtual {v4}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-eq v5, v8, :cond_6

    .line 196
    const-string v5, "Unable to navigate to activity, invalid number of arguments."

    invoke-static {v5}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    :goto_2
    move v5, v8

    .line 200
    goto/16 :goto_0

    .line 198
    :cond_6
    invoke-virtual {v4}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Lcom/urbanairship/js/UAJavascriptInterface;->navigateTo(Ljava/lang/String;)V

    goto :goto_2

    .line 201
    .end local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    :cond_7
    const-string v5, "mark-message-read"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 202
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Running mark message read command for URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 203
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p1, v1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 204
    .restart local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    invoke-virtual {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->markMessageRead()V

    move v5, v8

    .line 205
    goto/16 :goto_0

    .line 206
    .end local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    :cond_8
    const-string v5, "mark-message-unread"

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 207
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Running mark message unread command for URL: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 208
    new-instance v0, Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {v0, p1, v1}, Lcom/urbanairship/js/UAJavascriptInterface;-><init>(Landroid/webkit/WebView;Lcom/urbanairship/richpush/RichPushMessage;)V

    .line 209
    .restart local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    invoke-virtual {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->markMessageUnread()V

    move v5, v8

    .line 210
    goto/16 :goto_0

    .line 212
    .end local v0    # "jsInterface":Lcom/urbanairship/js/UAJavascriptInterface;
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unrecognized command: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " for URL: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    :cond_a
    move v5, v6

    .line 217
    goto/16 :goto_0
.end method
