.class Lcom/urbanairship/js/UAJavascriptInterface$3;
.super Ljava/lang/Object;
.source "UAJavascriptInterface.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/js/UAJavascriptInterface;->runActionCallback(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/js/UAJavascriptInterface;

.field final synthetic val$finishAction:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 266
    iput-object p1, p0, Lcom/urbanairship/js/UAJavascriptInterface$3;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    iput-object p2, p0, Lcom/urbanairship/js/UAJavascriptInterface$3;->val$finishAction:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 269
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 270
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface$3;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    # getter for: Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->access$000(Lcom/urbanairship/js/UAJavascriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/js/UAJavascriptInterface$3;->val$finishAction:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 274
    :goto_0
    return-void

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface$3;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    # getter for: Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->access$000(Lcom/urbanairship/js/UAJavascriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/urbanairship/js/UAJavascriptInterface$3;->val$finishAction:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method
