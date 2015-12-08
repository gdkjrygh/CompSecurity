.class public Lcom/facebook/applinks/AppLinkData;
.super Ljava/lang/Object;
.source "AppLinkData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/applinks/AppLinkData$CompletionHandler;
    }
.end annotation


# static fields
.field private static final APPLINK_BRIDGE_ARGS_KEY:Ljava/lang/String; = "bridge_args"

.field private static final APPLINK_METHOD_ARGS_KEY:Ljava/lang/String; = "method_args"

.field private static final APPLINK_VERSION_KEY:Ljava/lang/String; = "version"

.field public static final ARGUMENTS_NATIVE_CLASS_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_NATIVE_CLASS"

.field public static final ARGUMENTS_NATIVE_URL:Ljava/lang/String; = "com.facebook.platform.APPLINK_NATIVE_URL"

.field public static final ARGUMENTS_REFERER_DATA_KEY:Ljava/lang/String; = "referer_data"

.field public static final ARGUMENTS_TAPTIME_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_TAP_TIME_UTC"

.field private static final BRIDGE_ARGS_METHOD_KEY:Ljava/lang/String; = "method"

.field private static final BUNDLE_AL_APPLINK_DATA_KEY:Ljava/lang/String; = "al_applink_data"

.field static final BUNDLE_APPLINK_ARGS_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_ARGS"

.field private static final DEFERRED_APP_LINK_ARGS_FIELD:Ljava/lang/String; = "applink_args"

.field private static final DEFERRED_APP_LINK_CLASS_FIELD:Ljava/lang/String; = "applink_class"

.field private static final DEFERRED_APP_LINK_CLICK_TIME_FIELD:Ljava/lang/String; = "click_time"

.field private static final DEFERRED_APP_LINK_EVENT:Ljava/lang/String; = "DEFERRED_APP_LINK"

.field private static final DEFERRED_APP_LINK_PATH:Ljava/lang/String; = "%s/activities"

.field private static final DEFERRED_APP_LINK_URL_FIELD:Ljava/lang/String; = "applink_url"

.field private static final METHOD_ARGS_REF_KEY:Ljava/lang/String; = "ref"

.field private static final METHOD_ARGS_TARGET_URL_KEY:Ljava/lang/String; = "target_url"

.field private static final REFERER_DATA_REF_KEY:Ljava/lang/String; = "fb_ref"

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private argumentBundle:Landroid/os/Bundle;

.field private arguments:Lorg/json/JSONObject;

.field private ref:Ljava/lang/String;

.field private targetUri:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 92
    const-class v0, Lcom/facebook/applinks/AppLinkData;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 382
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 383
    return-void
.end method

.method static synthetic access$0(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V
    .locals 0

    .prologue
    .line 146
    invoke-static {p0, p1, p2}, Lcom/facebook/applinks/AppLinkData;->fetchDeferredAppLinkFromServer(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V

    return-void
.end method

.method public static createFromActivity(Landroid/app/Activity;)Lcom/facebook/applinks/AppLinkData;
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 240
    const-string v3, "activity"

    invoke-static {p0, v3}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 242
    .local v2, "intent":Landroid/content/Intent;
    if-nez v2, :cond_1

    .line 243
    const/4 v1, 0x0

    .line 256
    :cond_0
    :goto_0
    return-object v1

    .line 246
    :cond_1
    invoke-static {v2}, Lcom/facebook/applinks/AppLinkData;->createFromAlApplinkData(Landroid/content/Intent;)Lcom/facebook/applinks/AppLinkData;

    move-result-object v1

    .line 247
    .local v1, "appLinkData":Lcom/facebook/applinks/AppLinkData;
    if-nez v1, :cond_2

    .line 248
    const-string v3, "com.facebook.platform.APPLINK_ARGS"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 249
    .local v0, "appLinkArgsJsonString":Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/applinks/AppLinkData;->createFromJson(Ljava/lang/String;)Lcom/facebook/applinks/AppLinkData;

    move-result-object v1

    .line 251
    .end local v0    # "appLinkArgsJsonString":Ljava/lang/String;
    :cond_2
    if-nez v1, :cond_0

    .line 253
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/applinks/AppLinkData;->createFromUri(Landroid/net/Uri;)Lcom/facebook/applinks/AppLinkData;

    move-result-object v1

    goto :goto_0
.end method

.method private static createFromAlApplinkData(Landroid/content/Intent;)Lcom/facebook/applinks/AppLinkData;
    .locals 6
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x0

    .line 260
    const-string v5, "al_applink_data"

    invoke-virtual {p0, v5}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 261
    .local v1, "applinks":Landroid/os/Bundle;
    if-nez v1, :cond_1

    move-object v0, v4

    .line 280
    :cond_0
    :goto_0
    return-object v0

    .line 265
    :cond_1
    new-instance v0, Lcom/facebook/applinks/AppLinkData;

    invoke-direct {v0}, Lcom/facebook/applinks/AppLinkData;-><init>()V

    .line 266
    .local v0, "appLinkData":Lcom/facebook/applinks/AppLinkData;
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    iput-object v5, v0, Lcom/facebook/applinks/AppLinkData;->targetUri:Landroid/net/Uri;

    .line 267
    iget-object v5, v0, Lcom/facebook/applinks/AppLinkData;->targetUri:Landroid/net/Uri;

    if-nez v5, :cond_2

    .line 268
    const-string v5, "target_url"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 269
    .local v3, "targetUriString":Ljava/lang/String;
    if-eqz v3, :cond_2

    .line 270
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iput-object v5, v0, Lcom/facebook/applinks/AppLinkData;->targetUri:Landroid/net/Uri;

    .line 273
    .end local v3    # "targetUriString":Ljava/lang/String;
    :cond_2
    iput-object v1, v0, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    .line 274
    iput-object v4, v0, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    .line 275
    const-string v4, "referer_data"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 276
    .local v2, "refererData":Landroid/os/Bundle;
    if-eqz v2, :cond_0

    .line 277
    const-string v4, "fb_ref"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lcom/facebook/applinks/AppLinkData;->ref:Ljava/lang/String;

    goto :goto_0
.end method

.method private static createFromJson(Ljava/lang/String;)Lcom/facebook/applinks/AppLinkData;
    .locals 10
    .param p0, "jsonString"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 284
    if-nez p0, :cond_0

    move-object v1, v7

    .line 327
    :goto_0
    return-object v1

    .line 290
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 291
    .local v0, "appLinkArgsJson":Lorg/json/JSONObject;
    const-string v8, "version"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 293
    .local v6, "version":Ljava/lang/String;
    const-string v8, "bridge_args"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 294
    .local v2, "bridgeArgs":Lorg/json/JSONObject;
    const-string v8, "method"

    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 295
    .local v4, "method":Ljava/lang/String;
    const-string v8, "applink"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v8, "2"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 297
    new-instance v1, Lcom/facebook/applinks/AppLinkData;

    invoke-direct {v1}, Lcom/facebook/applinks/AppLinkData;-><init>()V

    .line 299
    .local v1, "appLinkData":Lcom/facebook/applinks/AppLinkData;
    const-string v8, "method_args"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    .line 301
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "ref"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 302
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "ref"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/applinks/AppLinkData;->ref:Ljava/lang/String;

    .line 312
    :cond_1
    :goto_1
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "target_url"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 314
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "target_url"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 313
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/applinks/AppLinkData;->targetUri:Landroid/net/Uri;

    .line 317
    :cond_2
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    invoke-static {v8}, Lcom/facebook/applinks/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 321
    .end local v0    # "appLinkArgsJson":Lorg/json/JSONObject;
    .end local v1    # "appLinkData":Lcom/facebook/applinks/AppLinkData;
    .end local v2    # "bridgeArgs":Lorg/json/JSONObject;
    .end local v4    # "method":Ljava/lang/String;
    .end local v6    # "version":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 322
    .local v3, "e":Lorg/json/JSONException;
    sget-object v8, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    const-string v9, "Unable to parse AppLink JSON"

    invoke-static {v8, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v3    # "e":Lorg/json/JSONException;
    :cond_3
    :goto_2
    move-object v1, v7

    .line 327
    goto :goto_0

    .line 303
    .restart local v0    # "appLinkArgsJson":Lorg/json/JSONObject;
    .restart local v1    # "appLinkData":Lcom/facebook/applinks/AppLinkData;
    .restart local v2    # "bridgeArgs":Lorg/json/JSONObject;
    .restart local v4    # "method":Ljava/lang/String;
    .restart local v6    # "version":Ljava/lang/String;
    :cond_4
    :try_start_1
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "referer_data"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 305
    iget-object v8, v1, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    .line 306
    const-string v9, "referer_data"

    .line 305
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 307
    .local v5, "refererData":Lorg/json/JSONObject;
    const-string v8, "fb_ref"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 308
    const-string v8, "fb_ref"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/applinks/AppLinkData;->ref:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 323
    .end local v0    # "appLinkArgsJson":Lorg/json/JSONObject;
    .end local v1    # "appLinkData":Lcom/facebook/applinks/AppLinkData;
    .end local v2    # "bridgeArgs":Lorg/json/JSONObject;
    .end local v4    # "method":Ljava/lang/String;
    .end local v5    # "refererData":Lorg/json/JSONObject;
    .end local v6    # "version":Ljava/lang/String;
    :catch_1
    move-exception v3

    .line 324
    .local v3, "e":Lcom/facebook/FacebookException;
    sget-object v8, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    const-string v9, "Unable to parse AppLink JSON"

    invoke-static {v8, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method

.method private static createFromUri(Landroid/net/Uri;)Lcom/facebook/applinks/AppLinkData;
    .locals 1
    .param p0, "appLinkDataUri"    # Landroid/net/Uri;

    .prologue
    .line 331
    if-nez p0, :cond_0

    .line 332
    const/4 v0, 0x0

    .line 337
    :goto_0
    return-object v0

    .line 335
    :cond_0
    new-instance v0, Lcom/facebook/applinks/AppLinkData;

    invoke-direct {v0}, Lcom/facebook/applinks/AppLinkData;-><init>()V

    .line 336
    .local v0, "appLinkData":Lcom/facebook/applinks/AppLinkData;
    iput-object p0, v0, Lcom/facebook/applinks/AppLinkData;->targetUri:Landroid/net/Uri;

    goto :goto_0
.end method

.method public static fetchDeferredAppLinkData(Landroid/content/Context;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "completionHandler"    # Lcom/facebook/applinks/AppLinkData$CompletionHandler;

    .prologue
    .line 110
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/facebook/applinks/AppLinkData;->fetchDeferredAppLinkData(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V

    .line 111
    return-void
.end method

.method public static fetchDeferredAppLinkData(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "applicationId"    # Ljava/lang/String;
    .param p2, "completionHandler"    # Lcom/facebook/applinks/AppLinkData$CompletionHandler;

    .prologue
    .line 126
    const-string v2, "context"

    invoke-static {p0, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    const-string v2, "completionHandler"

    invoke-static {p2, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    if-nez p1, :cond_0

    .line 130
    invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 133
    :cond_0
    const-string v2, "applicationId"

    invoke-static {p1, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 136
    .local v0, "applicationContext":Landroid/content/Context;
    move-object v1, p1

    .line 137
    .local v1, "applicationIdCopy":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/FacebookSdk;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/facebook/applinks/AppLinkData$1;

    invoke-direct {v3, v0, v1, p2}, Lcom/facebook/applinks/AppLinkData$1;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 144
    return-void
.end method

.method private static fetchDeferredAppLinkFromServer(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V
    .locals 18
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "applicationId"    # Ljava/lang/String;
    .param p2, "completionHandler"    # Lcom/facebook/applinks/AppLinkData$CompletionHandler;

    .prologue
    .line 151
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 153
    .local v6, "deferredApplinkParams":Lorg/json/JSONObject;
    :try_start_0
    const-string v14, "event"

    const-string v15, "DEFERRED_APP_LINK"

    invoke-virtual {v6, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    invoke-static/range {p0 .. p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;

    move-result-object v14

    .line 156
    invoke-static/range {p0 .. p0}, Lcom/facebook/appevents/AppEventsLogger;->getAnonymousAppDeviceGUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v15

    .line 157
    invoke-static/range {p0 .. p0}, Lcom/facebook/FacebookSdk;->getLimitEventAndDataUsage(Landroid/content/Context;)Z

    move-result v16

    .line 154
    move/from16 v0, v16

    invoke-static {v6, v14, v15, v0}, Lcom/facebook/internal/Utility;->setAppEventAttributionParameters(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V

    .line 158
    const-string v14, "application_package_name"

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    const-string v14, "%s/activities"

    const/4 v15, 0x1

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object p1, v15, v16

    invoke-static {v14, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 164
    .local v9, "deferredApplinkUrlPath":Ljava/lang/String;
    const/4 v4, 0x0

    .line 168
    .local v4, "appLinkData":Lcom/facebook/applinks/AppLinkData;
    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 167
    :try_start_1
    invoke-static {v14, v9, v6, v15}, Lcom/facebook/GraphRequest;->newPostRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v7

    .line 169
    .local v7, "deferredApplinkRequest":Lcom/facebook/GraphRequest;
    invoke-virtual {v7}, Lcom/facebook/GraphRequest;->executeAndWait()Lcom/facebook/GraphResponse;

    move-result-object v8

    .line 170
    .local v8, "deferredApplinkResponse":Lcom/facebook/GraphResponse;
    invoke-virtual {v8}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v11

    .line 171
    .local v11, "jsonResponse":Lorg/json/JSONObject;
    if-eqz v11, :cond_5

    .line 173
    const-string v14, "applink_args"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 175
    .local v2, "appLinkArgsJsonString":Ljava/lang/String;
    const-string v14, "click_time"

    const-wide/16 v16, -0x1

    move-wide/from16 v0, v16

    invoke-virtual {v11, v14, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v12

    .line 177
    .local v12, "tapTimeUtc":J
    const-string v14, "applink_class"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 178
    .local v3, "appLinkClassName":Ljava/lang/String;
    const-string v14, "applink_url"

    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 180
    .local v5, "appLinkUrl":Ljava/lang/String;
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_5

    .line 181
    invoke-static {v2}, Lcom/facebook/applinks/AppLinkData;->createFromJson(Ljava/lang/String;)Lcom/facebook/applinks/AppLinkData;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v4

    .line 183
    const-wide/16 v14, -0x1

    cmp-long v14, v12, v14

    if-eqz v14, :cond_1

    .line 185
    :try_start_2
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    if-eqz v14, :cond_0

    .line 186
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v15, "com.facebook.platform.APPLINK_TAP_TIME_UTC"

    invoke-virtual {v14, v15, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 188
    :cond_0
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v14, :cond_1

    .line 189
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    .line 190
    const-string v15, "com.facebook.platform.APPLINK_TAP_TIME_UTC"

    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v16

    .line 189
    invoke-virtual/range {v14 .. v16}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 197
    :cond_1
    :goto_0
    if-eqz v3, :cond_3

    .line 199
    :try_start_3
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    if-eqz v14, :cond_2

    .line 200
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    .line 201
    const-string v15, "com.facebook.platform.APPLINK_NATIVE_CLASS"

    .line 200
    invoke-virtual {v14, v15, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    :cond_2
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v14, :cond_3

    .line 204
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    .line 205
    const-string v15, "com.facebook.platform.APPLINK_NATIVE_CLASS"

    .line 204
    invoke-virtual {v14, v15, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 212
    :cond_3
    :goto_1
    if-eqz v5, :cond_5

    .line 214
    :try_start_4
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    if-eqz v14, :cond_4

    .line 215
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v15, "com.facebook.platform.APPLINK_NATIVE_URL"

    invoke-virtual {v14, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    :cond_4
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v14, :cond_5

    .line 218
    iget-object v14, v4, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    .line 219
    const-string v15, "com.facebook.platform.APPLINK_NATIVE_URL"

    .line 218
    invoke-virtual {v14, v15, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 231
    .end local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .end local v3    # "appLinkClassName":Ljava/lang/String;
    .end local v5    # "appLinkUrl":Ljava/lang/String;
    .end local v7    # "deferredApplinkRequest":Lcom/facebook/GraphRequest;
    .end local v8    # "deferredApplinkResponse":Lcom/facebook/GraphResponse;
    .end local v11    # "jsonResponse":Lorg/json/JSONObject;
    .end local v12    # "tapTimeUtc":J
    :cond_5
    :goto_2
    move-object/from16 v0, p2

    invoke-interface {v0, v4}, Lcom/facebook/applinks/AppLinkData$CompletionHandler;->onDeferredAppLinkDataFetched(Lcom/facebook/applinks/AppLinkData;)V

    .line 232
    return-void

    .line 159
    .end local v4    # "appLinkData":Lcom/facebook/applinks/AppLinkData;
    .end local v9    # "deferredApplinkUrlPath":Ljava/lang/String;
    :catch_0
    move-exception v10

    .line 160
    .local v10, "e":Lorg/json/JSONException;
    new-instance v14, Lcom/facebook/FacebookException;

    const-string v15, "An error occurred while preparing deferred app link"

    invoke-direct {v14, v15, v10}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v14

    .line 192
    .end local v10    # "e":Lorg/json/JSONException;
    .restart local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .restart local v3    # "appLinkClassName":Ljava/lang/String;
    .restart local v4    # "appLinkData":Lcom/facebook/applinks/AppLinkData;
    .restart local v5    # "appLinkUrl":Ljava/lang/String;
    .restart local v7    # "deferredApplinkRequest":Lcom/facebook/GraphRequest;
    .restart local v8    # "deferredApplinkResponse":Lcom/facebook/GraphResponse;
    .restart local v9    # "deferredApplinkUrlPath":Ljava/lang/String;
    .restart local v11    # "jsonResponse":Lorg/json/JSONObject;
    .restart local v12    # "tapTimeUtc":J
    :catch_1
    move-exception v10

    .line 193
    .restart local v10    # "e":Lorg/json/JSONException;
    :try_start_5
    sget-object v14, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    const-string v15, "Unable to put tap time in AppLinkData.arguments"

    invoke-static {v14, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_0

    .line 227
    .end local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .end local v3    # "appLinkClassName":Ljava/lang/String;
    .end local v5    # "appLinkUrl":Ljava/lang/String;
    .end local v7    # "deferredApplinkRequest":Lcom/facebook/GraphRequest;
    .end local v8    # "deferredApplinkResponse":Lcom/facebook/GraphResponse;
    .end local v10    # "e":Lorg/json/JSONException;
    .end local v11    # "jsonResponse":Lorg/json/JSONObject;
    .end local v12    # "tapTimeUtc":J
    :catch_2
    move-exception v10

    .line 228
    .local v10, "e":Ljava/lang/Exception;
    sget-object v14, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    const-string v15, "Unable to fetch deferred applink from server"

    invoke-static {v14, v15}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 207
    .end local v10    # "e":Ljava/lang/Exception;
    .restart local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .restart local v3    # "appLinkClassName":Ljava/lang/String;
    .restart local v5    # "appLinkUrl":Ljava/lang/String;
    .restart local v7    # "deferredApplinkRequest":Lcom/facebook/GraphRequest;
    .restart local v8    # "deferredApplinkResponse":Lcom/facebook/GraphResponse;
    .restart local v11    # "jsonResponse":Lorg/json/JSONObject;
    .restart local v12    # "tapTimeUtc":J
    :catch_3
    move-exception v10

    .line 208
    .local v10, "e":Lorg/json/JSONException;
    :try_start_6
    sget-object v14, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    const-string v15, "Unable to put tap time in AppLinkData.arguments"

    invoke-static {v14, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 221
    .end local v10    # "e":Lorg/json/JSONException;
    :catch_4
    move-exception v10

    .line 222
    .restart local v10    # "e":Lorg/json/JSONException;
    sget-object v14, Lcom/facebook/applinks/AppLinkData;->TAG:Ljava/lang/String;

    const-string v15, "Unable to put tap time in AppLinkData.arguments"

    invoke-static {v14, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2
.end method

.method private static toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    .locals 11
    .param p0, "node"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    .line 341
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 343
    .local v1, "bundle":Landroid/os/Bundle;
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 344
    .local v3, "fields":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_0

    .line 378
    return-object v1

    .line 345
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 347
    .local v6, "key":Ljava/lang/String;
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 349
    .local v7, "value":Ljava/lang/Object;
    instance-of v9, v7, Lorg/json/JSONObject;

    if-eqz v9, :cond_1

    .line 350
    check-cast v7, Lorg/json/JSONObject;

    .end local v7    # "value":Ljava/lang/Object;
    invoke-static {v7}, Lcom/facebook/applinks/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v1, v6, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    .line 351
    .restart local v7    # "value":Ljava/lang/Object;
    :cond_1
    instance-of v9, v7, Lorg/json/JSONArray;

    if-eqz v9, :cond_7

    move-object v8, v7

    .line 352
    check-cast v8, Lorg/json/JSONArray;

    .line 353
    .local v8, "valueArr":Lorg/json/JSONArray;
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-nez v9, :cond_2

    .line 354
    new-array v9, v10, [Ljava/lang/String;

    invoke-virtual {v1, v6, v9}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    .line 356
    :cond_2
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 357
    .local v4, "firstNode":Ljava/lang/Object;
    instance-of v9, v4, Lorg/json/JSONObject;

    if-eqz v9, :cond_4

    .line 358
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    new-array v2, v9, [Landroid/os/Bundle;

    .line 359
    .local v2, "bundles":[Landroid/os/Bundle;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-lt v5, v9, :cond_3

    .line 362
    invoke-virtual {v1, v6, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_0

    .line 360
    :cond_3
    invoke-virtual {v8, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/facebook/applinks/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v9

    aput-object v9, v2, v5

    .line 359
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 363
    .end local v2    # "bundles":[Landroid/os/Bundle;
    .end local v5    # "i":I
    :cond_4
    instance-of v9, v4, Lorg/json/JSONArray;

    if-eqz v9, :cond_5

    .line 365
    new-instance v9, Lcom/facebook/FacebookException;

    const-string v10, "Nested arrays are not supported."

    invoke-direct {v9, v10}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 367
    :cond_5
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    new-array v0, v9, [Ljava/lang/String;

    .line 368
    .local v0, "arrValues":[Ljava/lang/String;
    const/4 v5, 0x0

    .restart local v5    # "i":I
    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-lt v5, v9, :cond_6

    .line 371
    invoke-virtual {v1, v6, v0}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    .line 369
    :cond_6
    invoke-virtual {v8, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v0, v5

    .line 368
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 375
    .end local v0    # "arrValues":[Ljava/lang/String;
    .end local v4    # "firstNode":Ljava/lang/Object;
    .end local v5    # "i":I
    .end local v8    # "valueArr":Lorg/json/JSONArray;
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v6, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public getArgumentBundle()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 407
    iget-object v0, p0, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    return-object v0
.end method

.method public getRef()Ljava/lang/String;
    .locals 1

    .prologue
    .line 398
    iget-object v0, p0, Lcom/facebook/applinks/AppLinkData;->ref:Ljava/lang/String;

    return-object v0
.end method

.method public getRefererData()Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 417
    iget-object v0, p0, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 418
    iget-object v0, p0, Lcom/facebook/applinks/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    const-string v1, "referer_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 420
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getTargetUri()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 390
    iget-object v0, p0, Lcom/facebook/applinks/AppLinkData;->targetUri:Landroid/net/Uri;

    return-object v0
.end method
