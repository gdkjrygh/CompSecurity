.class Lcom/nbcuni/nbc/thevoice/MainActivity$5;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->showDNSDialog()V
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$5;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 628
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x0

    .line 633
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$5;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$19(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 634
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$5;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    new-instance v1, Lcom/nbcuni/nbc/thevoice/HTTPTask;

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$5;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-direct {v1, v2}, Lcom/nbcuni/nbc/thevoice/HTTPTask;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, ""

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$16(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/os/AsyncTask;)V

    .line 635
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$5;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iput-boolean v4, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 637
    return-void
.end method
