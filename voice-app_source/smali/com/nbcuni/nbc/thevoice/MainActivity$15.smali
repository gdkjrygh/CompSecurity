.class Lcom/nbcuni/nbc/thevoice/MainActivity$15;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->onClickLogout(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$15;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 1517
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1522
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$15;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "javascript: FB.logout();"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1524
    return-void
.end method
