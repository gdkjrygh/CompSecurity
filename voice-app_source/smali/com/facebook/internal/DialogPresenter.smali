.class public Lcom/facebook/internal/DialogPresenter;
.super Ljava/lang/Object;
.source "DialogPresenter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/DialogPresenter$ParameterProvider;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static canPresentNativeDialogWithFeature(Lcom/facebook/internal/DialogFeature;)Z
    .locals 2
    .param p0, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 73
    invoke-static {p0}, Lcom/facebook/internal/DialogPresenter;->getProtocolVersionForNativeDialog(Lcom/facebook/internal/DialogFeature;)I

    move-result v0

    .line 74
    const/4 v1, -0x1

    .line 73
    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static canPresentWebFallbackDialogWithFeature(Lcom/facebook/internal/DialogFeature;)Z
    .locals 1
    .param p0, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 78
    invoke-static {p0}, Lcom/facebook/internal/DialogPresenter;->getDialogWebFallbackUri(Lcom/facebook/internal/DialogFeature;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static getDialogWebFallbackUri(Lcom/facebook/internal/DialogFeature;)Landroid/net/Uri;
    .locals 5
    .param p0, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 221
    invoke-interface {p0}, Lcom/facebook/internal/DialogFeature;->name()Ljava/lang/String;

    move-result-object v4

    .line 222
    .local v4, "featureName":Ljava/lang/String;
    invoke-interface {p0}, Lcom/facebook/internal/DialogFeature;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 223
    .local v0, "action":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationId()Ljava/lang/String;

    move-result-object v1

    .line 226
    .local v1, "applicationId":Ljava/lang/String;
    invoke-static {v1, v0, v4}, Lcom/facebook/internal/Utility;->getDialogFeatureConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/Utility$DialogFeatureConfig;

    move-result-object v2

    .line 227
    .local v2, "config":Lcom/facebook/internal/Utility$DialogFeatureConfig;
    const/4 v3, 0x0

    .line 228
    .local v3, "fallbackUrl":Landroid/net/Uri;
    if-eqz v2, :cond_0

    .line 229
    invoke-virtual {v2}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getFallbackUrl()Landroid/net/Uri;

    move-result-object v3

    .line 232
    :cond_0
    return-object v3
.end method

.method public static getProtocolVersionForNativeDialog(Lcom/facebook/internal/DialogFeature;)I
    .locals 4
    .param p0, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 237
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationId()Ljava/lang/String;

    move-result-object v1

    .line 238
    .local v1, "applicationId":Ljava/lang/String;
    invoke-interface {p0}, Lcom/facebook/internal/DialogFeature;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 239
    .local v0, "action":Ljava/lang/String;
    invoke-static {v1, v0, p0}, Lcom/facebook/internal/DialogPresenter;->getVersionSpecForFeature(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/internal/DialogFeature;)[I

    move-result-object v2

    .line 241
    .local v2, "featureVersionSpec":[I
    invoke-static {v0, v2}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForAction(Ljava/lang/String;[I)I

    move-result v3

    return v3
.end method

.method private static getVersionSpecForFeature(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/internal/DialogFeature;)[I
    .locals 4
    .param p0, "applicationId"    # Ljava/lang/String;
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 253
    invoke-interface {p2}, Lcom/facebook/internal/DialogFeature;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v1}, Lcom/facebook/internal/Utility;->getDialogFeatureConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/Utility$DialogFeatureConfig;

    move-result-object v0

    .line 254
    .local v0, "config":Lcom/facebook/internal/Utility$DialogFeatureConfig;
    if-eqz v0, :cond_0

    .line 255
    invoke-virtual {v0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getVersionSpec()[I

    move-result-object v1

    .line 257
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-interface {p2}, Lcom/facebook/internal/DialogFeature;->getMinVersion()I

    move-result v3

    aput v3, v1, v2

    goto :goto_0
.end method

.method public static logDialogActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "outcome"    # Ljava/lang/String;

    .prologue
    .line 265
    invoke-static {p0}, Lcom/facebook/appevents/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger;

    move-result-object v0

    .line 266
    .local v0, "logger":Lcom/facebook/appevents/AppEventsLogger;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 267
    .local v1, "parameters":Landroid/os/Bundle;
    const-string v2, "fb_dialog_outcome"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/facebook/appevents/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 269
    return-void
.end method

.method public static present(Lcom/facebook/internal/AppCall;Landroid/app/Activity;)V
    .locals 2
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getRequestIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getRequestCode()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 62
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->setPending()Z

    .line 63
    return-void
.end method

.method public static present(Lcom/facebook/internal/AppCall;Landroid/support/v4/app/Fragment;)V
    .locals 2
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getRequestIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getRequestCode()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 68
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->setPending()Z

    .line 69
    return-void
.end method

.method public static setupAppCallForCannotShowError(Lcom/facebook/internal/AppCall;)V
    .locals 2
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/FacebookException;

    .line 44
    const-string v1, "Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."

    .line 43
    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 46
    .local v0, "e":Lcom/facebook/FacebookException;
    invoke-static {p0, v0}, Lcom/facebook/internal/DialogPresenter;->setupAppCallForValidationError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V

    .line 47
    return-void
.end method

.method public static setupAppCallForErrorResult(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V
    .locals 5
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "exception"    # Lcom/facebook/FacebookException;

    .prologue
    .line 82
    if-nez p1, :cond_0

    .line 99
    :goto_0
    return-void

    .line 85
    :cond_0
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Validate;->hasFacebookActivity(Landroid/content/Context;)V

    .line 87
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 88
    .local v0, "errorResultIntent":Landroid/content/Intent;
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/FacebookActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 89
    sget-object v1, Lcom/facebook/FacebookActivity;->PASS_THROUGH_CANCEL_ACTION:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    .line 94
    const/4 v2, 0x0

    .line 95
    invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I

    move-result v3

    .line 96
    invoke-static {p1}, Lcom/facebook/internal/NativeProtocol;->createBundleForException(Lcom/facebook/FacebookException;)Landroid/os/Bundle;

    move-result-object v4

    .line 91
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/internal/NativeProtocol;->setupProtocolRequestIntent(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 98
    invoke-virtual {p0, v0}, Lcom/facebook/internal/AppCall;->setRequestIntent(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public static setupAppCallForNativeDialog(Lcom/facebook/internal/AppCall;Lcom/facebook/internal/DialogPresenter$ParameterProvider;Lcom/facebook/internal/DialogFeature;)V
    .locals 7
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "parameterProvider"    # Lcom/facebook/internal/DialogPresenter$ParameterProvider;
    .param p2, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 184
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 185
    .local v1, "context":Landroid/content/Context;
    invoke-interface {p2}, Lcom/facebook/internal/DialogFeature;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 186
    .local v0, "action":Ljava/lang/String;
    invoke-static {p2}, Lcom/facebook/internal/DialogPresenter;->getProtocolVersionForNativeDialog(Lcom/facebook/internal/DialogFeature;)I

    move-result v4

    .line 187
    .local v4, "protocolVersion":I
    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    .line 188
    new-instance v5, Lcom/facebook/FacebookException;

    .line 189
    const-string v6, "Cannot present this dialog. This likely means that the Facebook app is not installed."

    .line 188
    invoke-direct {v5, v6}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 194
    :cond_0
    invoke-static {v4}, Lcom/facebook/internal/NativeProtocol;->isVersionCompatibleWithBucketedIntent(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 196
    invoke-interface {p1}, Lcom/facebook/internal/DialogPresenter$ParameterProvider;->getParameters()Landroid/os/Bundle;

    move-result-object v3

    .line 201
    .local v3, "params":Landroid/os/Bundle;
    :goto_0
    if-nez v3, :cond_1

    .line 202
    new-instance v3, Landroid/os/Bundle;

    .end local v3    # "params":Landroid/os/Bundle;
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 207
    .restart local v3    # "params":Landroid/os/Bundle;
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    .line 205
    invoke-static {v1, v5, v0, v4, v3}, Lcom/facebook/internal/NativeProtocol;->createPlatformActivityIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v2

    .line 211
    .local v2, "intent":Landroid/content/Intent;
    if-nez v2, :cond_3

    .line 212
    new-instance v5, Lcom/facebook/FacebookException;

    .line 213
    const-string v6, "Unable to create Intent; this likely means theFacebook app is not installed."

    .line 212
    invoke-direct {v5, v6}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 199
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v3    # "params":Landroid/os/Bundle;
    :cond_2
    invoke-interface {p1}, Lcom/facebook/internal/DialogPresenter$ParameterProvider;->getLegacyParameters()Landroid/os/Bundle;

    move-result-object v3

    .restart local v3    # "params":Landroid/os/Bundle;
    goto :goto_0

    .line 217
    .restart local v2    # "intent":Landroid/content/Intent;
    :cond_3
    invoke-virtual {p0, v2}, Lcom/facebook/internal/AppCall;->setRequestIntent(Landroid/content/Intent;)V

    .line 218
    return-void
.end method

.method public static setupAppCallForValidationError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V
    .locals 0
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "validationError"    # Lcom/facebook/FacebookException;

    .prologue
    .line 51
    invoke-static {p0, p1}, Lcom/facebook/internal/DialogPresenter;->setupAppCallForErrorResult(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V

    .line 52
    return-void
.end method

.method public static setupAppCallForWebDialog(Lcom/facebook/internal/AppCall;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "parameters"    # Landroid/os/Bundle;

    .prologue
    .line 105
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/internal/Validate;->hasFacebookActivity(Landroid/content/Context;)V

    .line 106
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/internal/Validate;->hasInternetPermissions(Landroid/content/Context;)V

    .line 108
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 109
    .local v0, "intentParameters":Landroid/os/Bundle;
    const-string v2, "action"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v2, "params"

    invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 112
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 115
    .local v1, "webDialogIntent":Landroid/content/Intent;
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 117
    invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I

    move-result v3

    .line 113
    invoke-static {v1, v2, p1, v3, v0}, Lcom/facebook/internal/NativeProtocol;->setupProtocolRequestIntent(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 119
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/facebook/FacebookActivity;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 120
    const-string v2, "FacebookDialogFragment"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    invoke-virtual {p0, v1}, Lcom/facebook/internal/AppCall;->setRequestIntent(Landroid/content/Intent;)V

    .line 123
    return-void
.end method

.method public static setupAppCallForWebFallbackDialog(Lcom/facebook/internal/AppCall;Landroid/os/Bundle;Lcom/facebook/internal/DialogFeature;)V
    .locals 9
    .param p0, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p1, "parameters"    # Landroid/os/Bundle;
    .param p2, "feature"    # Lcom/facebook/internal/DialogFeature;

    .prologue
    .line 129
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/internal/Validate;->hasFacebookActivity(Landroid/content/Context;)V

    .line 130
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/internal/Validate;->hasInternetPermissions(Landroid/content/Context;)V

    .line 132
    invoke-interface {p2}, Lcom/facebook/internal/DialogFeature;->name()Ljava/lang/String;

    move-result-object v1

    .line 133
    .local v1, "featureName":Ljava/lang/String;
    invoke-static {p2}, Lcom/facebook/internal/DialogPresenter;->getDialogWebFallbackUri(Lcom/facebook/internal/DialogFeature;)Landroid/net/Uri;

    move-result-object v0

    .line 134
    .local v0, "fallbackUrl":Landroid/net/Uri;
    if-nez v0, :cond_0

    .line 135
    new-instance v6, Lcom/facebook/FacebookException;

    .line 136
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Unable to fetch the Url for the DialogFeature : \'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\'"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 135
    invoke-direct {v6, v7}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 141
    :cond_0
    invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I

    move-result v3

    .line 143
    .local v3, "protocolVersion":I
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    .line 142
    invoke-static {v6, v3, p1}, Lcom/facebook/internal/ServerProtocol;->getQueryParamsForPlatformActivityIntentWebFallback(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    .line 146
    .local v5, "webParams":Landroid/os/Bundle;
    if-nez v5, :cond_1

    .line 147
    new-instance v6, Lcom/facebook/FacebookException;

    const-string v7, "Unable to fetch the app\'s key-hash"

    invoke-direct {v6, v7}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 151
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri;->isRelative()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 153
    invoke-static {}, Lcom/facebook/internal/ServerProtocol;->getDialogAuthority()Ljava/lang/String;

    move-result-object v6

    .line 154
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    .line 152
    invoke-static {v6, v7, v5}, Lcom/facebook/internal/Utility;->buildUri(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object v0

    .line 163
    :goto_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 164
    .local v2, "intentParameters":Landroid/os/Bundle;
    const-string v6, "url"

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v6, "is_fallback"

    const/4 v7, 0x1

    invoke-virtual {v2, v6, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 167
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 170
    .local v4, "webDialogIntent":Landroid/content/Intent;
    invoke-virtual {p0}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    .line 171
    invoke-interface {p2}, Lcom/facebook/internal/DialogFeature;->getAction()Ljava/lang/String;

    move-result-object v7

    .line 172
    invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I

    move-result v8

    .line 168
    invoke-static {v4, v6, v7, v8, v2}, Lcom/facebook/internal/NativeProtocol;->setupProtocolRequestIntent(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 174
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-class v7, Lcom/facebook/FacebookActivity;

    invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 175
    const-string v6, "FacebookDialogFragment"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    invoke-virtual {p0, v4}, Lcom/facebook/internal/AppCall;->setRequestIntent(Landroid/content/Intent;)V

    .line 178
    return-void

    .line 158
    .end local v2    # "intentParameters":Landroid/os/Bundle;
    .end local v4    # "webDialogIntent":Landroid/content/Intent;
    :cond_2
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    .line 159
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v7

    .line 157
    invoke-static {v6, v7, v5}, Lcom/facebook/internal/Utility;->buildUri(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method
