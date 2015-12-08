.class Lcom/nbcuni/nbc/thevoice/PopupActivity$2;
.super Ljava/lang/Object;
.source "PopupActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadUrlOnUIThread(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

.field private final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$2;->val$url:Ljava/lang/String;

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 139
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$2;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 141
    return-void
.end method
