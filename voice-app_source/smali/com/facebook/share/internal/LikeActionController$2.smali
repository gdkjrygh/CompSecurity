.class Lcom/facebook/share/internal/LikeActionController$2;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/LikeActionController;->createControllerForObjectIdAndType(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;Lcom/facebook/share/internal/LikeActionController$CreationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$controllerToRefresh:Lcom/facebook/share/internal/LikeActionController;


# direct methods
.method constructor <init>(Lcom/facebook/share/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/internal/LikeActionController$2;->val$controllerToRefresh:Lcom/facebook/share/internal/LikeActionController;

    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$2;->val$controllerToRefresh:Lcom/facebook/share/internal/LikeActionController;

    # invokes: Lcom/facebook/share/internal/LikeActionController;->refreshStatusAsync()V
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$11(Lcom/facebook/share/internal/LikeActionController;)V

    .line 286
    return-void
.end method
