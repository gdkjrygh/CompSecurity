.class Lcom/facebook/internal/WebDialog$DialogWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "WebDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/WebDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DialogWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/WebDialog;


# direct methods
.method private constructor <init>(Lcom/facebook/internal/WebDialog;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/internal/WebDialog;Lcom/facebook/internal/WebDialog$DialogWebViewClient;)V
    .locals 0

    .prologue
    .line 208
    invoke-direct {p0, p1}, Lcom/facebook/internal/WebDialog$DialogWebViewClient;-><init>(Lcom/facebook/internal/WebDialog;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 213
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->isDetached:Z
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$0(Lcom/facebook/internal/WebDialog;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->spinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$1(Lcom/facebook/internal/WebDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->contentFrameLayout:Landroid/widget/FrameLayout;
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$2(Lcom/facebook/internal/WebDialog;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 222
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$3(Lcom/facebook/internal/WebDialog;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->crossImageView:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$4(Lcom/facebook/internal/WebDialog;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/internal/WebDialog;->access$5(Lcom/facebook/internal/WebDialog;Z)V

    .line 225
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 230
    const-string v0, "FacebookSDK.WebDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Webview loading URL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 232
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->isDetached:Z
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$0(Lcom/facebook/internal/WebDialog;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->spinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/facebook/internal/WebDialog;->access$1(Lcom/facebook/internal/WebDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 235
    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 240
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    new-instance v1, Lcom/facebook/FacebookDialogException;

    invoke-direct {v1, p3, p2, p4}, Lcom/facebook/FacebookDialogException;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/internal/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V

    .line 242
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/SslErrorHandler;
    .param p3, "error"    # Landroid/net/http/SslError;

    .prologue
    const/4 v3, 0x0

    .line 250
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 252
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 253
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    new-instance v1, Lcom/facebook/FacebookDialogException;

    const/16 v2, -0xb

    invoke-direct {v1, v3, v2, v3}, Lcom/facebook/FacebookDialogException;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/internal/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V

    .line 255
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 12
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 260
    const-string v8, "FacebookSDK.WebDialog"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Redirect URL: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    # getter for: Lcom/facebook/internal/WebDialog;->expectedRedirectUrl:Ljava/lang/String;
    invoke-static {v8}, Lcom/facebook/internal/WebDialog;->access$6(Lcom/facebook/internal/WebDialog;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 262
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v8, p2}, Lcom/facebook/internal/WebDialog;->parseResponseUri(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 264
    .local v7, "values":Landroid/os/Bundle;
    const-string v8, "error"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 265
    .local v1, "error":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 266
    const-string v8, "error_type"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 269
    :cond_0
    const-string v8, "error_msg"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 270
    .local v4, "errorMessage":Ljava/lang/String;
    if-nez v4, :cond_1

    .line 271
    const-string v8, "error_message"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 273
    :cond_1
    if-nez v4, :cond_2

    .line 274
    const-string v8, "error_description"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 276
    :cond_2
    const-string v8, "error_code"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 277
    .local v3, "errorCodeString":Ljava/lang/String;
    const/4 v2, -0x1

    .line 278
    .local v2, "errorCode":I
    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 280
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 286
    :cond_3
    :goto_0
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-static {v4}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/4 v8, -0x1

    if-ne v2, v8, :cond_4

    .line 287
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v8, v7}, Lcom/facebook/internal/WebDialog;->sendSuccessToListener(Landroid/os/Bundle;)V

    .line 296
    :goto_1
    const/4 v8, 0x1

    .line 308
    .end local v1    # "error":Ljava/lang/String;
    .end local v2    # "errorCode":I
    .end local v3    # "errorCodeString":Ljava/lang/String;
    .end local v4    # "errorMessage":Ljava/lang/String;
    .end local v7    # "values":Landroid/os/Bundle;
    :goto_2
    return v8

    .line 281
    .restart local v1    # "error":Ljava/lang/String;
    .restart local v2    # "errorCode":I
    .restart local v3    # "errorCodeString":Ljava/lang/String;
    .restart local v4    # "errorMessage":Ljava/lang/String;
    .restart local v7    # "values":Landroid/os/Bundle;
    :catch_0
    move-exception v5

    .line 282
    .local v5, "ex":Ljava/lang/NumberFormatException;
    const/4 v2, -0x1

    goto :goto_0

    .line 288
    .end local v5    # "ex":Ljava/lang/NumberFormatException;
    :cond_4
    if-eqz v1, :cond_6

    const-string v8, "access_denied"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "OAuthAccessDeniedException"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 289
    :cond_5
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v8}, Lcom/facebook/internal/WebDialog;->cancel()V

    goto :goto_1

    .line 290
    :cond_6
    const/16 v8, 0x1069

    if-ne v2, v8, :cond_7

    .line 291
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v8}, Lcom/facebook/internal/WebDialog;->cancel()V

    goto :goto_1

    .line 293
    :cond_7
    new-instance v6, Lcom/facebook/FacebookRequestError;

    invoke-direct {v6, v2, v1, v4}, Lcom/facebook/FacebookRequestError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 294
    .local v6, "requestError":Lcom/facebook/FacebookRequestError;
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    new-instance v9, Lcom/facebook/FacebookServiceException;

    invoke-direct {v9, v6, v4}, Lcom/facebook/FacebookServiceException;-><init>(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Lcom/facebook/internal/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 297
    .end local v1    # "error":Ljava/lang/String;
    .end local v2    # "errorCode":I
    .end local v3    # "errorCodeString":Ljava/lang/String;
    .end local v4    # "errorMessage":Ljava/lang/String;
    .end local v6    # "requestError":Lcom/facebook/FacebookRequestError;
    .end local v7    # "values":Landroid/os/Bundle;
    :cond_8
    const-string v8, "fbconnect://cancel"

    invoke-virtual {p2, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    .line 298
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v8}, Lcom/facebook/internal/WebDialog;->cancel()V

    .line 299
    const/4 v8, 0x1

    goto :goto_2

    .line 300
    :cond_9
    const-string v8, "touch"

    invoke-virtual {p2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 301
    const/4 v8, 0x0

    goto :goto_2

    .line 305
    :cond_a
    :try_start_1
    iget-object v8, p0, Lcom/facebook/internal/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v8}, Lcom/facebook/internal/WebDialog;->getContext()Landroid/content/Context;

    move-result-object v8

    new-instance v9, Landroid/content/Intent;

    const-string v10, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v8, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 306
    const/4 v8, 0x1

    goto :goto_2

    .line 307
    :catch_1
    move-exception v0

    .line 308
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const/4 v8, 0x0

    goto :goto_2
.end method
