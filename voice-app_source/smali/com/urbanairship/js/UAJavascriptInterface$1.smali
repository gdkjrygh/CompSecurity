.class Lcom/urbanairship/js/UAJavascriptInterface$1;
.super Ljava/lang/Object;
.source "UAJavascriptInterface.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/js/UAJavascriptInterface;->close()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/js/UAJavascriptInterface;


# direct methods
.method constructor <init>(Lcom/urbanairship/js/UAJavascriptInterface;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/urbanairship/js/UAJavascriptInterface$1;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 192
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface$1;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    # getter for: Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->access$000(Lcom/urbanairship/js/UAJavascriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getRootView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v3}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 193
    iget-object v0, p0, Lcom/urbanairship/js/UAJavascriptInterface$1;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    # getter for: Lcom/urbanairship/js/UAJavascriptInterface;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/urbanairship/js/UAJavascriptInterface;->access$000(Lcom/urbanairship/js/UAJavascriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getRootView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v3}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 194
    return-void
.end method
