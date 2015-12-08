.class Lcom/nbcuni/nbc/thevoice/MainActivity$14$1;
.super Landroid/os/CountDownTimer;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity$14;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$14;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity$14;JJ)V
    .locals 0
    .param p2, "$anonymous0"    # J
    .param p4, "$anonymous1"    # J

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$14;

    .line 1291
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    .prologue
    .line 1296
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$14;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$14;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v1

    const v2, 0x7f080062

    invoke-virtual {v1, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1297
    .local v0, "slowLoad":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$14$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$14;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$14;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$14;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$14;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v1

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1299
    return-void
.end method

.method public onTick(J)V
    .locals 0
    .param p1, "millisUntilFinished"    # J

    .prologue
    .line 1304
    return-void
.end method
