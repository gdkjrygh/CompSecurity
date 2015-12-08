.class public Lcom/urbanairship/actions/OpenExternalUrlAction;
.super Lcom/urbanairship/actions/Action;
.source "OpenExternalUrlAction.java"


# static fields
.field public static final DEFAULT_REGISTRY_NAME:Ljava/lang/String; = "open_external_url_action"

.field public static final DEFAULT_REGISTRY_SHORT_NAME:Ljava/lang/String; = "^u"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/urbanairship/actions/Action;-><init>()V

    return-void
.end method


# virtual methods
.method public acceptsArguments(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 2
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 110
    sget-object v0, Lcom/urbanairship/actions/Situation;->PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getSituation()Lcom/urbanairship/actions/Situation;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/util/UriUtils;->parse(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public perform(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
    .locals 4
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 90
    invoke-virtual {p2}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/util/UriUtils;->parse(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v1

    .line 92
    .local v1, "uri":Landroid/net/Uri;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Opening "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 94
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 95
    .local v0, "intent":Landroid/content/Intent;
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 97
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 98
    invoke-static {v1}, Lcom/urbanairship/actions/ActionResult;->newResult(Ljava/lang/Object;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v2

    return-object v2
.end method
