.class Lcom/nbcuni/nbc/thevoice/PopupActivity$3;
.super Ljava/lang/Object;
.source "PopupActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity;->sendMessageToJS(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

.field private final synthetic val$jsCommand:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$3;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$3;->val$jsCommand:Ljava/lang/String;

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 187
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$3;->val$jsCommand:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 189
    return-void
.end method
