.class Lcom/nbcuni/nbc/thevoice/MainActivity$8;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->showQuitDialog()V
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 715
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 720
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$21(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 721
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialogOpen:Z

    .line 722
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v1, "{\"type\":\"Event\",\"subject\":\"AppStop\"}"

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 723
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$8;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->finish()V

    .line 725
    return-void
.end method
