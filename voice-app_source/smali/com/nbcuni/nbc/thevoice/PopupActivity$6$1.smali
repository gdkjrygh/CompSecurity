.class Lcom/nbcuni/nbc/thevoice/PopupActivity$6$1;
.super Landroid/os/CountDownTimer;
.source "PopupActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$6;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity$6;JJ)V
    .locals 0
    .param p2, "$anonymous0"    # J
    .param p4, "$anonymous1"    # J

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$6;

    .line 332
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .prologue
    .line 337
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$6;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$6;)Lcom/nbcuni/nbc/thevoice/PopupActivity;

    move-result-object v0

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loadingDialog:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$12(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 338
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$6$1;->this$1:Lcom/nbcuni/nbc/thevoice/PopupActivity$6;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$6;->access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$6;)Lcom/nbcuni/nbc/thevoice/PopupActivity;

    move-result-object v0

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->tryAgainScreen:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$13(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 340
    return-void
.end method

.method public onTick(J)V
    .locals 0
    .param p1, "millisUntilFinished"    # J

    .prologue
    .line 345
    return-void
.end method
