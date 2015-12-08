.class Lcom/nbcuni/nbc/thevoice/MainActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 426
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public isInternet(Landroid/content/Context;)Z
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 430
    const-string v2, "connectivity"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 431
    .local v1, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 432
    .local v0, "activeNetworkInfo":Landroid/net/NetworkInfo;
    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x0

    .line 439
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 440
    invoke-virtual {p0, p1}, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->isInternet(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$15(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 442
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iput-boolean v4, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 443
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    new-instance v1, Lcom/nbcuni/nbc/thevoice/HTTPTask;

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-direct {v1, v2}, Lcom/nbcuni/nbc/thevoice/HTTPTask;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, ""

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$16(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/os/AsyncTask;)V

    .line 444
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webURL:Ljava/lang/String;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$17(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 445
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->broadcastReceiver:Landroid/content/BroadcastReceiver;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$18(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 448
    :cond_0
    return-void
.end method
