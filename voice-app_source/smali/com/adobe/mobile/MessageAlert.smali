.class final Lcom/adobe/mobile/MessageAlert;
.super Lcom/adobe/mobile/Message;
.source "MessageAlert.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/MessageAlert$MessageShower;
    }
.end annotation


# static fields
.field private static final JSON_CONFIG_CANCEL:Ljava/lang/String; = "cancel"

.field private static final JSON_CONFIG_CONFIRM:Ljava/lang/String; = "confirm"

.field private static final JSON_CONFIG_CONTENT:Ljava/lang/String; = "content"

.field private static final JSON_CONFIG_TITLE:Ljava/lang/String; = "title"

.field private static final JSON_CONFIG_URL:Ljava/lang/String; = "url"


# instance fields
.field protected alertDialog:Landroid/app/AlertDialog;

.field protected cancelButtonText:Ljava/lang/String;

.field protected confirmButtonText:Ljava/lang/String;

.field protected content:Ljava/lang/String;

.field protected title:Ljava/lang/String;

.field protected url:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/adobe/mobile/Message;-><init>()V

    .line 135
    return-void
.end method

.method protected static clearCurrentDialog()V
    .locals 3

    .prologue
    .line 264
    invoke-static {}, Lcom/adobe/mobile/Messages;->getCurrentMessage()Lcom/adobe/mobile/Message;

    move-result-object v0

    .line 265
    .local v0, "currentMessage":Lcom/adobe/mobile/Message;
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/adobe/mobile/MessageAlert;

    if-nez v1, :cond_1

    .line 276
    .end local v0    # "currentMessage":Lcom/adobe/mobile/Message;
    :cond_0
    :goto_0
    return-void

    .line 270
    .restart local v0    # "currentMessage":Lcom/adobe/mobile/Message;
    :cond_1
    iget v1, v0, Lcom/adobe/mobile/Message;->orientationWhenShown:I

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentOrientation()I

    move-result v2

    if-eq v1, v2, :cond_0

    move-object v1, v0

    .line 271
    check-cast v1, Lcom/adobe/mobile/MessageAlert;

    iget-object v1, v1, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/adobe/mobile/MessageAlert;

    iget-object v1, v1, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    .line 272
    check-cast v1, Lcom/adobe/mobile/MessageAlert;

    iget-object v1, v1, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    .line 274
    :cond_2
    check-cast v0, Lcom/adobe/mobile/MessageAlert;

    .end local v0    # "currentMessage":Lcom/adobe/mobile/Message;
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    goto :goto_0
.end method


# virtual methods
.method protected initWithPayloadObject(Lorg/json/JSONObject;)Z
    .locals 8
    .param p1, "dictionary"    # Lorg/json/JSONObject;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 53
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v4

    if-gtz v4, :cond_1

    .line 132
    :cond_0
    :goto_0
    return v2

    .line 58
    :cond_1
    invoke-super {p0, p1}, Lcom/adobe/mobile/Message;->initWithPayloadObject(Lorg/json/JSONObject;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 65
    :try_start_0
    const-string v4, "payload"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 66
    .local v1, "jsonPayload":Lorg/json/JSONObject;
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v4

    if-gtz v4, :cond_2

    .line 67
    const-string v4, "Messages - Unable to create alert message \"%s\", payload is empty"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 70
    .end local v1    # "jsonPayload":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 71
    .local v0, "ex":Lorg/json/JSONException;
    const-string v4, "Messages - Unable to create alert message \"%s\", payload is required"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v5, v3, v2

    invoke-static {v4, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 77
    .end local v0    # "ex":Lorg/json/JSONException;
    .restart local v1    # "jsonPayload":Lorg/json/JSONObject;
    :cond_2
    :try_start_1
    const-string v4, "title"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/adobe/mobile/MessageAlert;->title:Ljava/lang/String;

    .line 78
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert;->title:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    .line 79
    const-string v4, "Messages - Unable to create alert message \"%s\", title is empty"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 83
    :catch_1
    move-exception v0

    .line 84
    .restart local v0    # "ex":Lorg/json/JSONException;
    const-string v4, "Messages - Unable to create alert message \"%s\", title is required"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v5, v3, v2

    invoke-static {v4, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 89
    .end local v0    # "ex":Lorg/json/JSONException;
    :cond_3
    :try_start_2
    const-string v4, "content"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/adobe/mobile/MessageAlert;->content:Ljava/lang/String;

    .line 90
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert;->content:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_4

    .line 91
    const-string v4, "Messages - Unable to create alert message \"%s\", content is empty"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 95
    :catch_2
    move-exception v0

    .line 96
    .restart local v0    # "ex":Lorg/json/JSONException;
    const-string v4, "Messages - Unable to create alert message \"%s\", content is required"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v5, v3, v2

    invoke-static {v4, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 101
    .end local v0    # "ex":Lorg/json/JSONException;
    :cond_4
    :try_start_3
    const-string v4, "confirm"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/adobe/mobile/MessageAlert;->confirmButtonText:Ljava/lang/String;

    .line 102
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert;->confirmButtonText:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_5

    .line 103
    const-string v4, "Messages - Unable to create alert message \"%s\", confirm is empty"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_0

    .line 107
    :catch_3
    move-exception v0

    .line 108
    .restart local v0    # "ex":Lorg/json/JSONException;
    const-string v4, "Messages - Unable to create alert message \"%s\", confirm is required"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v5, v3, v2

    invoke-static {v4, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 113
    .end local v0    # "ex":Lorg/json/JSONException;
    :cond_5
    :try_start_4
    const-string v4, "cancel"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/adobe/mobile/MessageAlert;->cancelButtonText:Ljava/lang/String;

    .line 114
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert;->cancelButtonText:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_6

    .line 115
    const-string v4, "Messages - Unable to create alert message \"%s\", cancel is empty"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_0

    .line 119
    :catch_4
    move-exception v0

    .line 120
    .restart local v0    # "ex":Lorg/json/JSONException;
    const-string v4, "Messages - Unable to create alert message \"%s\", cancel is required"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    aput-object v5, v3, v2

    invoke-static {v4, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 126
    .end local v0    # "ex":Lorg/json/JSONException;
    :cond_6
    :try_start_5
    const-string v4, "url"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/adobe/mobile/MessageAlert;->url:Ljava/lang/String;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    :goto_1
    move v2, v3

    .line 132
    goto/16 :goto_0

    .line 128
    :catch_5
    move-exception v0

    .line 129
    .restart local v0    # "ex":Lorg/json/JSONException;
    const-string v4, "Messages - Tried to read url for alert message but found none.  This is not a required field"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v4, v2}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method protected show()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 249
    iget-object v1, p0, Lcom/adobe/mobile/MessageAlert;->cancelButtonText:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/adobe/mobile/MessageAlert;->cancelButtonText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v2, :cond_2

    .line 250
    :cond_0
    iget-object v1, p0, Lcom/adobe/mobile/MessageAlert;->confirmButtonText:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/adobe/mobile/MessageAlert;->confirmButtonText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v2, :cond_2

    .line 260
    :cond_1
    :goto_0
    return-void

    .line 255
    :cond_2
    invoke-super {p0}, Lcom/adobe/mobile/Message;->show()V

    .line 258
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 259
    .local v0, "mainHandler":Landroid/os/Handler;
    new-instance v1, Lcom/adobe/mobile/MessageAlert$MessageShower;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/MessageAlert$MessageShower;-><init>(Lcom/adobe/mobile/MessageAlert;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
