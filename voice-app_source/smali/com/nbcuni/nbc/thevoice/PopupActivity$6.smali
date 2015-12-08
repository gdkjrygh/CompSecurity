.class Lcom/nbcuni/nbc/thevoice/PopupActivity$6;
.super Ljava/lang/Object;
.source "PopupActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$6;)Lcom/nbcuni/nbc/thevoice/PopupActivity;
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 330
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingDialog:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$12(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 331
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->tryAgainScreen:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$13(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 332
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    new-instance v0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6$1;

    const-wide/16 v2, 0x4e20

    const-wide/16 v4, 0x7d0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/nbcuni/nbc/thevoice/PopupActivity$6$1;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity$6;JJ)V

    invoke-static {v6, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$14(Lcom/nbcuni/nbc/thevoice/PopupActivity;Landroid/os/CountDownTimer;)V

    .line 347
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$8(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 348
    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->popupWebView:Landroid/webkit/WebView;
    invoke-static {}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$9()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 350
    return-void
.end method
