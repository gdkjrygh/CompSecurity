.class Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity$1;->openDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

.field private final synthetic val$commandId:Ljava/lang/String;

.field private final synthetic val$firstButton:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;->val$commandId:Ljava/lang/String;

    iput-object p3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;->val$firstButton:Ljava/lang/String;

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 259
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;->val$commandId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;->val$firstButton:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\"}}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 260
    .local v0, "commandResult":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 261
    return-void
.end method
