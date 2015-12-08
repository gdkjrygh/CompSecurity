.class Lcom/facebook/share/internal/LikeActionController$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/share/internal/LikeActionController$CreationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/LikeActionController;->handleOnActivityResult(IILandroid/content/Intent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$data:Landroid/content/Intent;

.field private final synthetic val$requestCode:I

.field private final synthetic val$resultCode:I


# direct methods
.method constructor <init>(IILandroid/content/Intent;)V
    .locals 0

    .prologue
    .line 1
    iput p1, p0, Lcom/facebook/share/internal/LikeActionController$1;->val$requestCode:I

    iput p2, p0, Lcom/facebook/share/internal/LikeActionController$1;->val$resultCode:I

    iput-object p3, p0, Lcom/facebook/share/internal/LikeActionController$1;->val$data:Landroid/content/Intent;

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/facebook/share/internal/LikeActionController;Lcom/facebook/FacebookException;)V
    .locals 3
    .param p1, "likeActionController"    # Lcom/facebook/share/internal/LikeActionController;
    .param p2, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 186
    if-nez p2, :cond_0

    .line 188
    iget v0, p0, Lcom/facebook/share/internal/LikeActionController$1;->val$requestCode:I

    .line 189
    iget v1, p0, Lcom/facebook/share/internal/LikeActionController$1;->val$resultCode:I

    .line 190
    iget-object v2, p0, Lcom/facebook/share/internal/LikeActionController$1;->val$data:Landroid/content/Intent;

    .line 187
    # invokes: Lcom/facebook/share/internal/LikeActionController;->onActivityResult(IILandroid/content/Intent;)V
    invoke-static {p1, v0, v1, v2}, Lcom/facebook/share/internal/LikeActionController;->access$10(Lcom/facebook/share/internal/LikeActionController;IILandroid/content/Intent;)V

    .line 194
    :goto_0
    return-void

    .line 192
    :cond_0
    # getter for: Lcom/facebook/share/internal/LikeActionController;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/share/internal/LikeActionController;->access$0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method
