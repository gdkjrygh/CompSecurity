.class Lcom/urbanairship/actions/LandingPageAction$1;
.super Ljava/lang/Object;
.source "LandingPageAction.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/actions/LandingPageAction;->perform(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/actions/LandingPageAction;

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/urbanairship/actions/LandingPageAction;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/urbanairship/actions/LandingPageAction$1;->this$0:Lcom/urbanairship/actions/LandingPageAction;

    iput-object p2, p0, Lcom/urbanairship/actions/LandingPageAction$1;->val$uri:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 157
    new-instance v0, Lcom/urbanairship/widget/UAWebView;

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/urbanairship/widget/UAWebView;-><init>(Landroid/content/Context;)V

    .line 158
    .local v0, "webView":Lcom/urbanairship/widget/UAWebView;
    iget-object v1, p0, Lcom/urbanairship/actions/LandingPageAction$1;->val$uri:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/urbanairship/widget/UAWebView;->loadUrl(Ljava/lang/String;)V

    .line 159
    return-void
.end method
