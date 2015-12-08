.class Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "LikeView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/widget/LikeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LikeControllerBroadcastReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/widget/LikeView;


# direct methods
.method private constructor <init>(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    .prologue
    .line 778
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;)V
    .locals 0

    .prologue
    .line 778
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;-><init>(Lcom/facebook/share/widget/LikeView;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 781
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 782
    .local v2, "intentAction":Ljava/lang/String;
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 783
    .local v1, "extras":Landroid/os/Bundle;
    const/4 v3, 0x1

    .line 784
    .local v3, "shouldRespond":Z
    if-eqz v1, :cond_0

    .line 787
    const-string v4, "com.facebook.sdk.LikeActionController.OBJECT_ID"

    .line 786
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 788
    .local v0, "broadcastObjectId":Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 789
    iget-object v4, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/share/widget/LikeView;->access$0(Lcom/facebook/share/widget/LikeView;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 788
    const/4 v3, 0x0

    .line 792
    .end local v0    # "broadcastObjectId":Ljava/lang/String;
    :cond_0
    :goto_0
    if-nez v3, :cond_3

    .line 809
    :cond_1
    :goto_1
    return-void

    .line 788
    .restart local v0    # "broadcastObjectId":Ljava/lang/String;
    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    .line 796
    .end local v0    # "broadcastObjectId":Ljava/lang/String;
    :cond_3
    const-string v4, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 797
    iget-object v4, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # invokes: Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V
    invoke-static {v4}, Lcom/facebook/share/widget/LikeView;->access$1(Lcom/facebook/share/widget/LikeView;)V

    goto :goto_1

    .line 798
    :cond_4
    const-string v4, "com.facebook.sdk.LikeActionController.DID_ERROR"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 799
    if-eqz v4, :cond_5

    .line 800
    iget-object v4, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;
    invoke-static {v4}, Lcom/facebook/share/widget/LikeView;->access$2(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$OnErrorListener;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 801
    iget-object v4, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;
    invoke-static {v4}, Lcom/facebook/share/widget/LikeView;->access$2(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$OnErrorListener;

    move-result-object v4

    invoke-static {v1}, Lcom/facebook/internal/NativeProtocol;->getExceptionFromErrorData(Landroid/os/Bundle;)Lcom/facebook/FacebookException;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/facebook/share/widget/LikeView$OnErrorListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_1

    .line 803
    :cond_5
    const-string v4, "com.facebook.sdk.LikeActionController.DID_RESET"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 804
    if-eqz v4, :cond_1

    .line 806
    iget-object v4, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    iget-object v5, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;
    invoke-static {v5}, Lcom/facebook/share/widget/LikeView;->access$0(Lcom/facebook/share/widget/LikeView;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # getter for: Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;
    invoke-static {v6}, Lcom/facebook/share/widget/LikeView;->access$3(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v6

    # invokes: Lcom/facebook/share/widget/LikeView;->setObjectIdAndTypeForced(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V
    invoke-static {v4, v5, v6}, Lcom/facebook/share/widget/LikeView;->access$4(Lcom/facebook/share/widget/LikeView;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    .line 807
    iget-object v4, p0, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/share/widget/LikeView;

    # invokes: Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V
    invoke-static {v4}, Lcom/facebook/share/widget/LikeView;->access$1(Lcom/facebook/share/widget/LikeView;)V

    goto :goto_1
.end method
