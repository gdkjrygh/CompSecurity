.class Lcom/nbcuni/nbc/thevoice/PopupActivity$9;
.super Landroid/webkit/WebChromeClient;
.source "PopupActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$9;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    .line 488
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 1
    .param p1, "window"    # Landroid/webkit/WebView;

    .prologue
    .line 493
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 494
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$9;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    .line 495
    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 1
    .param p1, "consoleMessage"    # Landroid/webkit/ConsoleMessage;

    .prologue
    .line 500
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result v0

    return v0
.end method
