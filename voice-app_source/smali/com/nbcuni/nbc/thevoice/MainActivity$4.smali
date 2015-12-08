.class Lcom/nbcuni/nbc/thevoice/MainActivity$4;
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 613
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 618
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$19(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 619
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->finish()V

    .line 620
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 622
    return-void
.end method
