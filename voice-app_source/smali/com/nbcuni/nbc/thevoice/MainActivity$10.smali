.class Lcom/nbcuni/nbc/thevoice/MainActivity$10;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->showUpdateDialog()V
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$10;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 764
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 769
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$10;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v3, 0x7f080050

    invoke-virtual {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$10;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 770
    .local v0, "marketURL":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$10;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/MainActivity;->openAppStore(Ljava/lang/String;)V
    invoke-static {v1, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$23(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    .line 772
    return-void
.end method
