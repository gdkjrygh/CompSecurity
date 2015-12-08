.class Lcom/nbcuni/nbc/thevoice/MainActivity$13;
.super Landroid/webkit/WebChromeClient;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->createWebView()V
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 1059
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;
    .locals 1

    .prologue
    .line 1059
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 1
    .param p1, "cm"    # Landroid/webkit/ConsoleMessage;

    .prologue
    .line 1065
    const/4 v0, 0x1

    return v0
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "dialog"    # Z
    .param p3, "userGesture"    # Z
    .param p4, "resultMsg"    # Landroid/os/Message;

    .prologue
    .line 1071
    new-instance v0, Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 1072
    .local v0, "newWebView":Landroid/webkit/WebView;
    new-instance v2, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;

    invoke-direct {v2, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1166
    iget-object v1, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/webkit/WebView$WebViewTransport;

    .line 1167
    .local v1, "transport":Landroid/webkit/WebView$WebViewTransport;
    invoke-virtual {v1, v0}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 1168
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 1169
    const/4 v2, 0x1

    return v2
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "result"    # Landroid/webkit/JsResult;

    .prologue
    const/4 v2, 0x1

    .line 1176
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1177
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    .line 1178
    return v2
.end method

.method public onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "result"    # Landroid/webkit/JsResult;

    .prologue
    .line 1188
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    .line 1189
    const/4 v0, 0x1

    return v0
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "result"    # Landroid/webkit/JsResult;

    .prologue
    .line 1196
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-string v1, "Dialog"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/nbcuni/nbc/thevoice/MainActivity$13$2;

    invoke-direct {v2, p0, p4}, Lcom/nbcuni/nbc/thevoice/MainActivity$13$2;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;Landroid/webkit/JsResult;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1204
    const/high16 v1, 0x1040000

    new-instance v2, Lcom/nbcuni/nbc/thevoice/MainActivity$13$3;

    invoke-direct {v2, p0, p4}, Lcom/nbcuni/nbc/thevoice/MainActivity$13$3;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;Landroid/webkit/JsResult;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1212
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1214
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result v0

    return v0
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 5
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "defaultValue"    # Ljava/lang/String;
    .param p5, "result"    # Landroid/webkit/JsPromptResult;

    .prologue
    .line 1225
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 1226
    .local v0, "factory":Landroid/view/LayoutInflater;
    const v2, 0x7f03000e

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1227
    .local v1, "v":Landroid/view/View;
    const v2, 0x7f09004b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1229
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x4

    invoke-direct {v2, v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-string v3, "Dialog"

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const v3, 0x104000a

    new-instance v4, Lcom/nbcuni/nbc/thevoice/MainActivity$13$4;

    invoke-direct {v4, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$13$4;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1235
    const/high16 v3, 0x1040000

    new-instance v4, Lcom/nbcuni/nbc/thevoice/MainActivity$13$5;

    invoke-direct {v4, p0, p5}, Lcom/nbcuni/nbc/thevoice/MainActivity$13$5;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;Landroid/webkit/JsPromptResult;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1243
    new-instance v3, Lcom/nbcuni/nbc/thevoice/MainActivity$13$6;

    invoke-direct {v3, p0, p5}, Lcom/nbcuni/nbc/thevoice/MainActivity$13$6;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;Landroid/webkit/JsPromptResult;)V

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1251
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1255
    const/4 v2, 0x1

    return v2
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "progress"    # I

    .prologue
    .line 1261
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    mul-int/lit16 v1, p2, 0x3e8

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->setProgress(I)V

    .line 1262
    return-void
.end method
