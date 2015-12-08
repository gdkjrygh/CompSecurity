.class Lcom/nbcuni/nbc/thevoice/PopupActivity$8;
.super Landroid/webkit/WebViewClient;
.source "PopupActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    .line 388
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 393
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 394
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v1

    const-string v2, "javascript: window.nativeWrapper = window.nativeWrapper || {};"

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 395
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v1

    const-string v2, "javascript: window.nativeWrapper.sendMessage = function(messageObject) {PopupHandler.parseMessageObject(JSON.stringify(messageObject));}"

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 396
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v1

    const-string v2, "javascript: window.nativeWrapper.sendMessage({\"type\":\"Event\",\"subject\":\"HandleLS\",\"payload\":{\"localStorage\": window.localStorage.age_gate }});"

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 398
    const-string v0, "{\"type\":\"Event\",\"subject\":\"BridgeReady\"}"

    .line 399
    .local v0, "readyString":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    const-string v2, "{\"type\":\"Event\",\"subject\":\"BridgeReady\"}"

    invoke-virtual {v1, v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 400
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 10
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    .line 405
    const-string v7, "nissanoffthestage"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 406
    const/4 v6, 0x0

    .line 485
    :cond_0
    :goto_0
    return v6

    .line 407
    :cond_1
    const-string v7, "emopenwebview"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 408
    const-string v7, "emopenwebview=1"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 412
    const-string v7, "emopenwebview=0"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 413
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 414
    .local v5, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v1, v7, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 415
    .local v1, "browserIntent":Landroid/content/Intent;
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->startActivity(Landroid/content/Intent;)V

    .line 416
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v7

    invoke-virtual {v7}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0

    .line 421
    .end local v1    # "browserIntent":Landroid/content/Intent;
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_2
    const-string v7, "http://www.nbc.com/the-voice"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "votenow=null"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 422
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    goto :goto_0

    .line 425
    :cond_3
    const-string v7, "market://"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 426
    new-instance v3, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v3, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 427
    .local v3, "intent":Landroid/content/Intent;
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 428
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7, v3}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 433
    .end local v3    # "intent":Landroid/content/Intent;
    :cond_4
    const-string v7, "&therecanbeonly=one"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_5

    const-string v7, "facebook.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 434
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    goto :goto_0

    .line 438
    :cond_5
    const-string v7, "&code"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 439
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iget-object v7, v7, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v8, "votenowURL"

    const-string v9, ".votenow.tv"

    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 440
    const-string v7, "code"

    invoke-virtual {p2, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v7, v7, 0x5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p2, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 441
    .local v0, "ATsub":Ljava/lang/String;
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iput-object v0, v7, Lcom/nbcuni/nbc/thevoice/PopupActivity;->authTokenFB:Ljava/lang/String;

    .line 442
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iget-object v7, v7, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 443
    .local v2, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v7, "fbAuthToken"

    iget-object v8, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iget-object v8, v8, Lcom/nbcuni/nbc/thevoice/PopupActivity;->authTokenFB:Ljava/lang/String;

    invoke-interface {v2, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 444
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 449
    .end local v0    # "ATsub":Ljava/lang/String;
    .end local v2    # "editor":Landroid/content/SharedPreferences$Editor;
    :cond_6
    const-string v7, "twitter.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 450
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 451
    .restart local v5    # "uri":Landroid/net/Uri;
    new-instance v4, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v4, v7, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 452
    .local v4, "tweetIntent":Landroid/content/Intent;
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    const-string v8, "Tweet!"

    invoke-static {v4, v8}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 456
    .end local v4    # "tweetIntent":Landroid/content/Intent;
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_7
    const-string v7, "facebook.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->gatekeeperFull:Z
    invoke-static {v7}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$15(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 457
    const-string v7, ".nbcuniversal.com/privacy/"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, ".nbcuni.com/privacy/"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "www.nbc.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "//nbc.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "play.google.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "itunes."

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "sprint.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 458
    :cond_8
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 459
    .restart local v5    # "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v1, v7, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 460
    .restart local v1    # "browserIntent":Landroid/content/Intent;
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 464
    .end local v1    # "browserIntent":Landroid/content/Intent;
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_9
    const-string v7, "apps.facebook.com"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_a

    const-string v7, "facebook.com/NBCTheVoice"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 465
    :cond_a
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 466
    .restart local v5    # "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v1, v7, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 467
    .restart local v1    # "browserIntent":Landroid/content/Intent;
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 471
    .end local v1    # "browserIntent":Landroid/content/Intent;
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_b
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    const v8, 0x7f08004c

    invoke-virtual {v7, v8}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 472
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    .line 474
    :cond_c
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 475
    const-string v7, "close-popup:"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 476
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    .line 477
    :cond_d
    const-string v7, "mailto"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_e

    const-string v7, "tel:"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 478
    :cond_e
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 479
    .restart local v5    # "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v1, v7, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 480
    .restart local v1    # "browserIntent":Landroid/content/Intent;
    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v7, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->startActivity(Landroid/content/Intent;)V

    .line 481
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v7

    invoke-virtual {v7}, Landroid/webkit/WebView;->stopLoading()V

    goto/16 :goto_0
.end method
