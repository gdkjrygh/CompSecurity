.class final Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;
.super Ljava/lang/Object;
.source "MessageAlert.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/MessageAlert$MessageShower;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "PositiveClickHandler"
.end annotation


# instance fields
.field private final message:Lcom/adobe/mobile/MessageAlert;


# direct methods
.method public constructor <init>(Lcom/adobe/mobile/MessageAlert;)V
    .locals 0
    .param p1, "messageToActOn"    # Lcom/adobe/mobile/MessageAlert;

    .prologue
    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object p1, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    .line 147
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8
    .param p1, "dialogInterface"    # Landroid/content/DialogInterface;
    .param p2, "i"    # I

    .prologue
    const/4 v7, 0x0

    .line 152
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    invoke-virtual {v4}, Lcom/adobe/mobile/MessageAlert;->clickedThrough()V

    .line 153
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iput-boolean v7, v4, Lcom/adobe/mobile/MessageAlert;->isVisible:Z

    .line 156
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v4, v4, Lcom/adobe/mobile/MessageAlert;->url:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v4, v4, Lcom/adobe/mobile/MessageAlert;->url:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 158
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 159
    .local v3, "tokens":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v5, "{userId}"

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getVisitorID()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v4, ""

    :goto_0
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    const-string v5, "{trackingId}"

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAID()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    const-string v4, ""

    :goto_1
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const-string v4, "{messageId}"

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v5, v5, Lcom/adobe/mobile/MessageAlert;->messageId:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v4, "{lifetimeValue}"

    invoke-static {}, Lcom/adobe/mobile/AnalyticsTrackLifetimeValueIncrease;->getLifetimeValue()Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v5, v5, Lcom/adobe/mobile/MessageAlert;->url:Ljava/lang/String;

    invoke-static {v5, v3}, Lcom/adobe/mobile/StaticMethods;->expandTokens(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/adobe/mobile/MessageAlert;->url:Ljava/lang/String;

    .line 168
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentActivity()Landroid/app/Activity;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullActivityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 176
    .local v0, "currentActivity":Landroid/app/Activity;
    :try_start_1
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 177
    .local v2, "intent":Landroid/content/Intent;
    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v4, v4, Lcom/adobe/mobile/MessageAlert;->url:Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 178
    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 183
    .end local v0    # "currentActivity":Landroid/app/Activity;
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v3    # "tokens":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_0
    :goto_2
    return-void

    .line 159
    .restart local v3    # "tokens":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getVisitorID()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 160
    :cond_2
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAID()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 170
    :catch_0
    move-exception v1

    .line 171
    .local v1, "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    invoke-virtual {v1}, Lcom/adobe/mobile/StaticMethods$NullActivityException;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 179
    .end local v1    # "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    .restart local v0    # "currentActivity":Landroid/app/Activity;
    :catch_1
    move-exception v1

    .line 180
    .local v1, "ex":Ljava/lang/Exception;
    const-string v4, "Messages - Could not load click-through intent for message (%s)"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method
