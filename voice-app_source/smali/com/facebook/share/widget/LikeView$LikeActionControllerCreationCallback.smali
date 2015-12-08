.class Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;
.super Ljava/lang/Object;
.source "LikeView.java"

# interfaces
.implements Lcom/facebook/share/internal/LikeActionController$CreationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/widget/LikeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LikeActionControllerCreationCallback"
.end annotation


# instance fields
.field private isCancelled:Z

.field final synthetic this$0:Lcom/facebook/share/widget/LikeView;


# direct methods
.method private constructor <init>(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    .prologue
    .line 812
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/share/widget/LikeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;)V
    .locals 0

    .prologue
    .line 812
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;-><init>(Lcom/facebook/share/widget/LikeView;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .prologue
    .line 817
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->isCancelled:Z

    .line 818
    return-void
.end method

.method public onComplete(Lcom/facebook/share/internal/LikeActionController;Lcom/facebook/FacebookException;)V
    .locals 2
    .param p1, "likeActionController"    # Lcom/facebook/share/internal/LikeActionController;
    .param p2, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 824
    iget-boolean v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->isCancelled:Z

    if-eqz v0, :cond_0

    .line 847
    :goto_0
    return-void

    .line 828
    :cond_0
    if-eqz p1, :cond_2

    .line 829
    invoke-virtual {p1}, Lcom/facebook/share/internal/LikeActionController;->shouldEnableView()Z

    move-result v0

    if-nez v0, :cond_1

    .line 830
    new-instance p2, Lcom/facebook/FacebookException;

    .line 831
    .end local p2    # "error":Lcom/facebook/FacebookException;
    const-string v0, "Cannot use LikeView. The device may not be supported."

    .line 830
    invoke-direct {p2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 836
    .restart local p2    # "error":Lcom/facebook/FacebookException;
    :cond_1
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/share/widget/LikeView;

    # invokes: Lcom/facebook/share/widget/LikeView;->associateWithLikeActionController(Lcom/facebook/share/internal/LikeActionController;)V
    invoke-static {v0, p1}, Lcom/facebook/share/widget/LikeView;->access$5(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/internal/LikeActionController;)V

    .line 837
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/share/widget/LikeView;

    # invokes: Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V
    invoke-static {v0}, Lcom/facebook/share/widget/LikeView;->access$1(Lcom/facebook/share/widget/LikeView;)V

    .line 840
    :cond_2
    if-eqz p2, :cond_3

    .line 841
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;
    invoke-static {v0}, Lcom/facebook/share/widget/LikeView;->access$2(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$OnErrorListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 842
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;
    invoke-static {v0}, Lcom/facebook/share/widget/LikeView;->access$2(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$OnErrorListener;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/facebook/share/widget/LikeView$OnErrorListener;->onError(Lcom/facebook/FacebookException;)V

    .line 846
    :cond_3
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/share/widget/LikeView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/share/widget/LikeView;->access$6(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;)V

    goto :goto_0
.end method
