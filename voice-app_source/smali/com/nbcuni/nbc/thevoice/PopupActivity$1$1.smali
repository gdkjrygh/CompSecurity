.class Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;
.super Ljava/lang/Object;
.source "PopupActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->hideLoadingScreen()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$1;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$1;

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 111
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)Lcom/nbcuni/nbc/thevoice/PopupActivity;

    move-result-object v0

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingImage:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$6(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 112
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)Lcom/nbcuni/nbc/thevoice/PopupActivity;

    move-result-object v0

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingScreen:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$7(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)Lcom/nbcuni/nbc/thevoice/PopupActivity;

    move-result-object v0

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$8(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)Lcom/nbcuni/nbc/thevoice/PopupActivity;

    move-result-object v0

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingTimer:Landroid/os/CountDownTimer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$8(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/os/CountDownTimer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 116
    :cond_0
    return-void
.end method
