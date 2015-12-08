.class Lcom/facebook/share/internal/LikeActionController$7$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/GraphRequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/LikeActionController$7;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/share/internal/LikeActionController$7;

.field private final synthetic val$analyticsParameters:Landroid/os/Bundle;

.field private final synthetic val$likeRequest:Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/share/internal/LikeActionController$7;Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    iput-object p2, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->val$likeRequest:Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;

    iput-object p3, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->val$analyticsParameters:Landroid/os/Bundle;

    .line 1001
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/GraphRequestBatch;)V
    .locals 4
    .param p1, "batch"    # Lcom/facebook/GraphRequestBatch;

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 1004
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    # getter for: Lcom/facebook/share/internal/LikeActionController$7;->this$0:Lcom/facebook/share/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController$7;->access$0(Lcom/facebook/share/internal/LikeActionController$7;)Lcom/facebook/share/internal/LikeActionController;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/facebook/share/internal/LikeActionController;->access$23(Lcom/facebook/share/internal/LikeActionController;Z)V

    .line 1006
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->val$likeRequest:Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;

    invoke-virtual {v0}, Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1010
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    # getter for: Lcom/facebook/share/internal/LikeActionController$7;->this$0:Lcom/facebook/share/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController$7;->access$0(Lcom/facebook/share/internal/LikeActionController$7;)Lcom/facebook/share/internal/LikeActionController;

    move-result-object v0

    # invokes: Lcom/facebook/share/internal/LikeActionController;->publishDidError(Z)V
    invoke-static {v0, v1}, Lcom/facebook/share/internal/LikeActionController;->access$24(Lcom/facebook/share/internal/LikeActionController;Z)V

    .line 1025
    :goto_0
    return-void

    .line 1012
    :cond_0
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    # getter for: Lcom/facebook/share/internal/LikeActionController$7;->this$0:Lcom/facebook/share/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController$7;->access$0(Lcom/facebook/share/internal/LikeActionController$7;)Lcom/facebook/share/internal/LikeActionController;

    move-result-object v0

    .line 1013
    iget-object v1, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->val$likeRequest:Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;

    iget-object v1, v1, Lcom/facebook/share/internal/LikeActionController$PublishLikeRequestWrapper;->unlikeToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1012
    invoke-static {v0, v1}, Lcom/facebook/share/internal/LikeActionController;->access$25(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;)V

    .line 1014
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    # getter for: Lcom/facebook/share/internal/LikeActionController$7;->this$0:Lcom/facebook/share/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController$7;->access$0(Lcom/facebook/share/internal/LikeActionController$7;)Lcom/facebook/share/internal/LikeActionController;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/share/internal/LikeActionController;->access$26(Lcom/facebook/share/internal/LikeActionController;Z)V

    .line 1016
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    # getter for: Lcom/facebook/share/internal/LikeActionController$7;->this$0:Lcom/facebook/share/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController$7;->access$0(Lcom/facebook/share/internal/LikeActionController$7;)Lcom/facebook/share/internal/LikeActionController;

    move-result-object v0

    # invokes: Lcom/facebook/share/internal/LikeActionController;->getAppEventsLogger()Lcom/facebook/appevents/AppEventsLogger;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$17(Lcom/facebook/share/internal/LikeActionController;)Lcom/facebook/appevents/AppEventsLogger;

    move-result-object v0

    .line 1017
    const-string v1, "fb_like_control_did_like"

    .line 1019
    iget-object v2, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->val$analyticsParameters:Landroid/os/Bundle;

    .line 1016
    invoke-virtual {v0, v1, v3, v2}, Lcom/facebook/appevents/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 1023
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->this$1:Lcom/facebook/share/internal/LikeActionController$7;

    # getter for: Lcom/facebook/share/internal/LikeActionController$7;->this$0:Lcom/facebook/share/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController$7;->access$0(Lcom/facebook/share/internal/LikeActionController$7;)Lcom/facebook/share/internal/LikeActionController;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/internal/LikeActionController$7$1;->val$analyticsParameters:Landroid/os/Bundle;

    # invokes: Lcom/facebook/share/internal/LikeActionController;->publishAgainIfNeeded(Landroid/os/Bundle;)V
    invoke-static {v0, v1}, Lcom/facebook/share/internal/LikeActionController;->access$27(Lcom/facebook/share/internal/LikeActionController;Landroid/os/Bundle;)V

    goto :goto_0
.end method
