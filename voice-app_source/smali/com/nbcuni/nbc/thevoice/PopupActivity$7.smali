.class Lcom/nbcuni/nbc/thevoice/PopupActivity$7;
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
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$7;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    .line 362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 368
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$7;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    .line 369
    return-void
.end method
