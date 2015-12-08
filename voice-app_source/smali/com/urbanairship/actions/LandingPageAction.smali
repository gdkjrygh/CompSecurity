.class public Lcom/urbanairship/actions/LandingPageAction;
.super Lcom/urbanairship/actions/Action;
.source "LandingPageAction.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/actions/LandingPageAction$2;
    }
.end annotation


# static fields
.field public static final CACHE_ON_RECEIVE_KEY:Ljava/lang/String; = "cache_on_receive"

.field public static final DEFAULT_REGISTRY_NAME:Ljava/lang/String; = "landing_page_action"

.field public static final DEFAULT_REGISTRY_SHORT_NAME:Ljava/lang/String; = "^p"

.field public static final SHOW_LANDING_PAGE_INTENT_ACTION:Ljava/lang/String; = "com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION"

.field public static final URL_KEY:Ljava/lang/String; = "url"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0}, Lcom/urbanairship/actions/Action;-><init>()V

    .line 170
    return-void
.end method


# virtual methods
.method public acceptsArguments(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 2
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    const/4 v0, 0x0

    .line 186
    invoke-super {p0, p1}, Lcom/urbanairship/actions/Action;->acceptsArguments(Lcom/urbanairship/actions/ActionArguments;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 190
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/urbanairship/actions/LandingPageAction;->parseUri(Lcom/urbanairship/actions/ActionArguments;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected parseUri(Lcom/urbanairship/actions/ActionArguments;)Landroid/net/Uri;
    .locals 9
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    const/4 v6, 0x0

    .line 202
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v7

    instance-of v7, v7, Ljava/util/Map;

    if-eqz v7, :cond_1

    .line 203
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    .line 204
    .local v2, "map":Ljava/util/Map;
    const-string v7, "url"

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 209
    .end local v2    # "map":Ljava/util/Map;
    .local v5, "uriValue":Ljava/lang/Object;
    :goto_0
    if-nez v5, :cond_2

    move-object v4, v6

    .line 237
    :cond_0
    :goto_1
    return-object v4

    .line 206
    .end local v5    # "uriValue":Ljava/lang/Object;
    :cond_1
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v5

    .restart local v5    # "uriValue":Ljava/lang/Object;
    goto :goto_0

    .line 214
    :cond_2
    invoke-static {v5}, Lcom/urbanairship/util/UriUtils;->parse(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v4

    .line 215
    .local v4, "uri":Landroid/net/Uri;
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v4, v6

    .line 216
    goto :goto_1

    .line 219
    :cond_3
    const-string v7, "u"

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 222
    :try_start_0
    invoke-virtual {v4}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v7

    const-string v8, "UTF-8"

    invoke-static {v7, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 228
    .local v1, "id":Ljava/lang/String;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v6

    invoke-virtual {v6}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v3

    .line 229
    .local v3, "options":Lcom/urbanairship/AirshipConfigOptions;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v3, Lcom/urbanairship/AirshipConfigOptions;->landingPageContentURL:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v3}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 233
    .end local v1    # "id":Ljava/lang/String;
    .end local v3    # "options":Lcom/urbanairship/AirshipConfigOptions;
    :cond_4
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 234
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "https://"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    goto :goto_1

    .line 223
    :catch_0
    move-exception v0

    .line 224
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unable to decode "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v4}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    move-object v4, v6

    .line 225
    goto/16 :goto_1
.end method

.method public perform(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
    .locals 5
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 147
    invoke-virtual {p0, p2}, Lcom/urbanairship/actions/LandingPageAction;->parseUri(Lcom/urbanairship/actions/ActionArguments;)Landroid/net/Uri;

    move-result-object v2

    .line 149
    .local v2, "uri":Landroid/net/Uri;
    sget-object v3, Lcom/urbanairship/actions/LandingPageAction$2;->$SwitchMap$com$urbanairship$actions$Situation:[I

    invoke-virtual {p2}, Lcom/urbanairship/actions/ActionArguments;->getSituation()Lcom/urbanairship/actions/Situation;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/actions/Situation;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 165
    new-instance v3, Landroid/content/Intent;

    const-string v4, "com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION"

    invoke-direct {v3, v4, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v4, 0x30000000

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v3

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 170
    .local v0, "actionIntent":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 173
    .end local v0    # "actionIntent":Landroid/content/Intent;
    :cond_0
    :goto_0
    invoke-static {}, Lcom/urbanairship/actions/ActionResult;->newEmptyResult()Lcom/urbanairship/actions/ActionResult;

    move-result-object v3

    return-object v3

    .line 151
    :pswitch_0
    invoke-virtual {p0, p2}, Lcom/urbanairship/actions/LandingPageAction;->shouldCacheOnReceive(Lcom/urbanairship/actions/ActionArguments;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 153
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 154
    .local v1, "handler":Landroid/os/Handler;
    new-instance v3, Lcom/urbanairship/actions/LandingPageAction$1;

    invoke-direct {v3, p0, v2}, Lcom/urbanairship/actions/LandingPageAction$1;-><init>(Lcom/urbanairship/actions/LandingPageAction;Landroid/net/Uri;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 149
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method protected shouldCacheOnReceive(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 3
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 249
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/util/Map;

    if-eqz v2, :cond_0

    .line 250
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 251
    .local v1, "map":Ljava/util/Map;
    const-string v2, "cache_on_receive"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 253
    .local v0, "cache":Ljava/lang/Object;
    if-eqz v0, :cond_0

    instance-of v2, v0, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 254
    check-cast v0, Ljava/lang/Boolean;

    .end local v0    # "cache":Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 258
    .end local v1    # "map":Ljava/util/Map;
    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
