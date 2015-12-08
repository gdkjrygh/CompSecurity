.class Lcom/facebook/login/WebViewLoginMethodHandler;
.super Lcom/facebook/login/LoginMethodHandler;
.source "WebViewLoginMethodHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/login/WebViewLoginMethodHandler;",
            ">;"
        }
    .end annotation
.end field

.field private static final WEB_VIEW_AUTH_HANDLER_STORE:Ljava/lang/String; = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"

.field private static final WEB_VIEW_AUTH_HANDLER_TOKEN_KEY:Ljava/lang/String; = "TOKEN"


# instance fields
.field private e2e:Ljava/lang/String;

.field private loginDialog:Lcom/facebook/internal/WebDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 280
    new-instance v0, Lcom/facebook/login/WebViewLoginMethodHandler$1;

    invoke-direct {v0}, Lcom/facebook/login/WebViewLoginMethodHandler$1;-><init>()V

    .line 279
    sput-object v0, Lcom/facebook/login/WebViewLoginMethodHandler;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 291
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "source"    # Landroid/os/Parcel;

    .prologue
    .line 264
    invoke-direct {p0, p1}, Lcom/facebook/login/LoginMethodHandler;-><init>(Landroid/os/Parcel;)V

    .line 265
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    .line 266
    return-void
.end method

.method constructor <init>(Lcom/facebook/login/LoginClient;)V
    .locals 0
    .param p1, "loginClient"    # Lcom/facebook/login/LoginClient;

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/facebook/login/LoginMethodHandler;-><init>(Lcom/facebook/login/LoginClient;)V

    .line 57
    return-void
.end method

.method private loadCookieToken()Ljava/lang/String;
    .locals 4

    .prologue
    .line 212
    iget-object v2, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v2}, Lcom/facebook/login/LoginClient;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 214
    .local v0, "context":Landroid/content/Context;
    const-string v2, "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"

    .line 215
    const/4 v3, 0x0

    .line 213
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 216
    .local v1, "sharedPreferences":Landroid/content/SharedPreferences;
    const-string v2, "TOKEN"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method private saveCookieToken(Ljava/lang/String;)V
    .locals 3
    .param p1, "token"    # Ljava/lang/String;

    .prologue
    .line 202
    iget-object v1, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v1}, Lcom/facebook/login/LoginClient;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 204
    .local v0, "context":Landroid/content/Context;
    const-string v1, "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"

    .line 205
    const/4 v2, 0x0

    .line 203
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 206
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 207
    const-string v2, "TOKEN"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 208
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 209
    return-void
.end method


# virtual methods
.method cancel()V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginDialog:Lcom/facebook/internal/WebDialog;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginDialog:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v0}, Lcom/facebook/internal/WebDialog;->cancel()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginDialog:Lcom/facebook/internal/WebDialog;

    .line 75
    :cond_0
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 270
    const/4 v0, 0x0

    return v0
.end method

.method getNameForLogging()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    const-string v0, "web_view"

    return-object v0
.end method

.method needsInternetPermission()Z
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x1

    return v0
.end method

.method onWebDialogComplete(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    .locals 12
    .param p1, "request"    # Lcom/facebook/login/LoginClient$Request;
    .param p2, "values"    # Landroid/os/Bundle;
    .param p3, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 143
    if-eqz p2, :cond_2

    .line 145
    const-string v7, "e2e"

    invoke-virtual {p2, v7}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 146
    const-string v7, "e2e"

    invoke-virtual {p2, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    .line 151
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->getPermissions()Ljava/util/Set;

    move-result-object v7

    .line 153
    sget-object v8, Lcom/facebook/AccessTokenSource;->WEB_VIEW:Lcom/facebook/AccessTokenSource;

    .line 154
    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->getApplicationId()Ljava/lang/String;

    move-result-object v9

    .line 150
    invoke-static {v7, p2, v8, v9}, Lcom/facebook/login/WebViewLoginMethodHandler;->createAccessTokenFromWebBundle(Ljava/util/Collection;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;Ljava/lang/String;)Lcom/facebook/AccessToken;

    move-result-object v6

    .line 156
    .local v6, "token":Lcom/facebook/AccessToken;
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v7}, Lcom/facebook/login/LoginClient;->getPendingRequest()Lcom/facebook/login/LoginClient$Request;

    move-result-object v7

    .line 155
    invoke-static {v7, v6}, Lcom/facebook/login/LoginClient$Result;->createTokenResult(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/AccessToken;)Lcom/facebook/login/LoginClient$Result;

    move-result-object v3

    .line 163
    .local v3, "outcome":Lcom/facebook/login/LoginClient$Result;
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v7}, Lcom/facebook/login/LoginClient;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-static {v7}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object v5

    .line 164
    .local v5, "syncManager":Landroid/webkit/CookieSyncManager;
    invoke-virtual {v5}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 165
    invoke-virtual {v6}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/facebook/login/WebViewLoginMethodHandler;->saveCookieToken(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    .end local v5    # "syncManager":Landroid/webkit/CookieSyncManager;
    .end local v6    # "token":Lcom/facebook/AccessToken;
    .end local p3    # "error":Lcom/facebook/FacebookException;
    :goto_0
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    invoke-static {v7}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 195
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lcom/facebook/login/WebViewLoginMethodHandler;->logWebLoginCompleted(Ljava/lang/String;)V

    .line 198
    :cond_1
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v7, v3}, Lcom/facebook/login/LoginClient;->completeAndValidate(Lcom/facebook/login/LoginClient$Result;)V

    .line 199
    return-void

    .line 166
    .end local v3    # "outcome":Lcom/facebook/login/LoginClient$Result;
    .restart local p3    # "error":Lcom/facebook/FacebookException;
    :catch_0
    move-exception v2

    .line 168
    .local v2, "ex":Lcom/facebook/FacebookException;
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v7}, Lcom/facebook/login/LoginClient;->getPendingRequest()Lcom/facebook/login/LoginClient$Request;

    move-result-object v7

    .line 169
    const/4 v8, 0x0

    .line 170
    invoke-virtual {v2}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;

    move-result-object v9

    .line 167
    invoke-static {v7, v8, v9}, Lcom/facebook/login/LoginClient$Result;->createErrorResult(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/LoginClient$Result;

    move-result-object v3

    .line 172
    .restart local v3    # "outcome":Lcom/facebook/login/LoginClient$Result;
    goto :goto_0

    .line 173
    .end local v2    # "ex":Lcom/facebook/FacebookException;
    .end local v3    # "outcome":Lcom/facebook/login/LoginClient$Result;
    :cond_2
    instance-of v7, p3, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v7, :cond_3

    .line 174
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v7}, Lcom/facebook/login/LoginClient;->getPendingRequest()Lcom/facebook/login/LoginClient$Request;

    move-result-object v7

    .line 175
    const-string v8, "User canceled log in."

    .line 174
    invoke-static {v7, v8}, Lcom/facebook/login/LoginClient$Result;->createCancelResult(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;)Lcom/facebook/login/LoginClient$Result;

    move-result-object v3

    .line 176
    .restart local v3    # "outcome":Lcom/facebook/login/LoginClient$Result;
    goto :goto_0

    .line 179
    .end local v3    # "outcome":Lcom/facebook/login/LoginClient$Result;
    :cond_3
    const/4 v7, 0x0

    iput-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    .line 181
    const/4 v0, 0x0

    .line 182
    .local v0, "errorCode":Ljava/lang/String;
    invoke-virtual {p3}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 183
    .local v1, "errorMessage":Ljava/lang/String;
    instance-of v7, p3, Lcom/facebook/FacebookServiceException;

    if-eqz v7, :cond_4

    .line 185
    check-cast p3, Lcom/facebook/FacebookServiceException;

    .end local p3    # "error":Lcom/facebook/FacebookException;
    invoke-virtual {p3}, Lcom/facebook/FacebookServiceException;->getRequestError()Lcom/facebook/FacebookRequestError;

    move-result-object v4

    .line 186
    .local v4, "requestError":Lcom/facebook/FacebookRequestError;
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "%d"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-virtual {v4}, Lcom/facebook/FacebookRequestError;->getErrorCode()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-virtual {v4}, Lcom/facebook/FacebookRequestError;->toString()Ljava/lang/String;

    move-result-object v1

    .line 189
    .end local v4    # "requestError":Lcom/facebook/FacebookRequestError;
    :cond_4
    iget-object v7, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v7}, Lcom/facebook/login/LoginClient;->getPendingRequest()Lcom/facebook/login/LoginClient$Request;

    move-result-object v7

    .line 190
    const/4 v8, 0x0

    .line 189
    invoke-static {v7, v8, v1, v0}, Lcom/facebook/login/LoginClient$Result;->createErrorResult(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/LoginClient$Result;

    move-result-object v3

    .restart local v3    # "outcome":Lcom/facebook/login/LoginClient$Result;
    goto :goto_0
.end method

.method tryAuthorize(Lcom/facebook/login/LoginClient$Request;)Z
    .locals 12
    .param p1, "request"    # Lcom/facebook/login/LoginClient$Request;

    .prologue
    const/4 v11, 0x1

    .line 79
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 80
    .local v5, "parameters":Landroid/os/Bundle;
    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->getPermissions()Ljava/util/Set;

    move-result-object v9

    invoke-static {v9}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 81
    const-string v9, ","

    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->getPermissions()Ljava/util/Set;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v8

    .line 82
    .local v8, "scope":Ljava/lang/String;
    const-string v9, "scope"

    invoke-virtual {v5, v9, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v9, "scope"

    invoke-virtual {p0, v9, v8}, Lcom/facebook/login/WebViewLoginMethodHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .end local v8    # "scope":Ljava/lang/String;
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->getDefaultAudience()Lcom/facebook/login/DefaultAudience;

    move-result-object v0

    .line 88
    .local v0, "audience":Lcom/facebook/login/DefaultAudience;
    const-string v9, "default_audience"

    invoke-virtual {v0}, Lcom/facebook/login/DefaultAudience;->getNativeProtocolAudience()Ljava/lang/String;

    move-result-object v10

    .line 87
    invoke-virtual {v5, v9, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v6

    .line 91
    .local v6, "previousToken":Lcom/facebook/AccessToken;
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v7

    .line 92
    .local v7, "previousTokenString":Ljava/lang/String;
    :goto_0
    if-eqz v7, :cond_2

    .line 93
    invoke-direct {p0}, Lcom/facebook/login/WebViewLoginMethodHandler;->loadCookieToken()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 95
    const-string v9, "access_token"

    .line 94
    invoke-virtual {v5, v9, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v9, "access_token"

    .line 100
    const-string v10, "1"

    .line 98
    invoke-virtual {p0, v9, v10}, Lcom/facebook/login/WebViewLoginMethodHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    :goto_1
    new-instance v4, Lcom/facebook/login/WebViewLoginMethodHandler$2;

    invoke-direct {v4, p0, p1}, Lcom/facebook/login/WebViewLoginMethodHandler$2;-><init>(Lcom/facebook/login/WebViewLoginMethodHandler;Lcom/facebook/login/LoginClient$Request;)V

    .line 117
    .local v4, "listener":Lcom/facebook/internal/WebDialog$OnCompleteListener;
    invoke-static {}, Lcom/facebook/login/LoginClient;->getE2E()Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    .line 118
    const-string v9, "e2e"

    iget-object v10, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/login/WebViewLoginMethodHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    iget-object v9, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v9}, Lcom/facebook/login/LoginClient;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 121
    .local v3, "fragmentActivity":Landroid/support/v4/app/FragmentActivity;
    new-instance v9, Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;

    .line 123
    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->getApplicationId()Ljava/lang/String;

    move-result-object v10

    .line 121
    invoke-direct {v9, v3, v10, v5}, Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 125
    iget-object v10, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;->setE2E(Ljava/lang/String;)Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;

    move-result-object v9

    .line 126
    invoke-virtual {p1}, Lcom/facebook/login/LoginClient$Request;->isRerequest()Z

    move-result v10

    invoke-virtual {v9, v10}, Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;->setIsRerequest(Z)Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;

    move-result-object v9

    .line 127
    invoke-virtual {v9, v4}, Lcom/facebook/login/WebViewLoginMethodHandler$AuthDialogBuilder;->setOnCompleteListener(Lcom/facebook/internal/WebDialog$OnCompleteListener;)Lcom/facebook/internal/WebDialog$Builder;

    move-result-object v9

    .line 128
    invoke-static {}, Lcom/facebook/FacebookSdk;->getWebDialogTheme()I

    move-result v10

    invoke-virtual {v9, v10}, Lcom/facebook/internal/WebDialog$Builder;->setTheme(I)Lcom/facebook/internal/WebDialog$Builder;

    move-result-object v1

    .line 129
    .local v1, "builder":Lcom/facebook/internal/WebDialog$Builder;
    invoke-virtual {v1}, Lcom/facebook/internal/WebDialog$Builder;->build()Lcom/facebook/internal/WebDialog;

    move-result-object v9

    iput-object v9, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginDialog:Lcom/facebook/internal/WebDialog;

    .line 131
    new-instance v2, Lcom/facebook/internal/FacebookDialogFragment;

    invoke-direct {v2}, Lcom/facebook/internal/FacebookDialogFragment;-><init>()V

    .line 132
    .local v2, "dialogFragment":Lcom/facebook/internal/FacebookDialogFragment;
    invoke-virtual {v2, v11}, Lcom/facebook/internal/FacebookDialogFragment;->setRetainInstance(Z)V

    .line 133
    iget-object v9, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginDialog:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v2, v9}, Lcom/facebook/internal/FacebookDialogFragment;->setDialog(Landroid/app/Dialog;)V

    .line 134
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v9

    .line 135
    const-string v10, "FacebookDialogFragment"

    .line 134
    invoke-virtual {v2, v9, v10}, Lcom/facebook/internal/FacebookDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 137
    return v11

    .line 91
    .end local v1    # "builder":Lcom/facebook/internal/WebDialog$Builder;
    .end local v2    # "dialogFragment":Lcom/facebook/internal/FacebookDialogFragment;
    .end local v3    # "fragmentActivity":Landroid/support/v4/app/FragmentActivity;
    .end local v4    # "listener":Lcom/facebook/internal/WebDialog$OnCompleteListener;
    .end local v7    # "previousTokenString":Ljava/lang/String;
    :cond_1
    const/4 v7, 0x0

    goto :goto_0

    .line 104
    .restart local v7    # "previousTokenString":Ljava/lang/String;
    :cond_2
    iget-object v9, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->loginClient:Lcom/facebook/login/LoginClient;

    invoke-virtual {v9}, Lcom/facebook/login/LoginClient;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v9

    invoke-static {v9}, Lcom/facebook/internal/Utility;->clearFacebookCookies(Landroid/content/Context;)V

    .line 106
    const-string v9, "access_token"

    .line 107
    const-string v10, "0"

    .line 105
    invoke-virtual {p0, v9, v10}, Lcom/facebook/login/WebViewLoginMethodHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 275
    invoke-super {p0, p1, p2}, Lcom/facebook/login/LoginMethodHandler;->writeToParcel(Landroid/os/Parcel;I)V

    .line 276
    iget-object v0, p0, Lcom/facebook/login/WebViewLoginMethodHandler;->e2e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 277
    return-void
.end method
