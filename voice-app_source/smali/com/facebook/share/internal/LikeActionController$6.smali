.class Lcom/facebook/share/internal/LikeActionController$6;
.super Lcom/facebook/share/internal/ResultProcessor;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/LikeActionController;->getResultProcessor(Landroid/os/Bundle;)Lcom/facebook/share/internal/ResultProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/internal/LikeActionController;

.field private final synthetic val$analyticsParameters:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/facebook/share/internal/LikeActionController;Lcom/facebook/FacebookCallback;Landroid/os/Bundle;)V
    .locals 0
    .param p2, "$anonymous0"    # Lcom/facebook/FacebookCallback;

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    iput-object p3, p0, Lcom/facebook/share/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    .line 854
    invoke-direct {p0, p2}, Lcom/facebook/share/internal/ResultProcessor;-><init>(Lcom/facebook/FacebookCallback;)V

    return-void
.end method


# virtual methods
.method public onCancel(Lcom/facebook/internal/AppCall;)V
    .locals 1
    .param p1, "appCall"    # Lcom/facebook/internal/AppCall;

    .prologue
    .line 931
    new-instance v0, Lcom/facebook/FacebookOperationCanceledException;

    invoke-direct {v0}, Lcom/facebook/FacebookOperationCanceledException;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/facebook/share/internal/LikeActionController$6;->onError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V

    .line 932
    return-void
.end method

.method public onError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V
    .locals 6
    .param p1, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p2, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 910
    sget-object v1, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    .line 911
    # getter for: Lcom/facebook/share/internal/LikeActionController;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/share/internal/LikeActionController;->access$0()Ljava/lang/String;

    move-result-object v2

    .line 912
    const-string v3, "Like Dialog failed with error : %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 913
    aput-object p2, v4, v5

    .line 909
    invoke-static {v1, v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    iget-object v1, p0, Lcom/facebook/share/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    if-nez v1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 917
    .local v0, "logParams":Landroid/os/Bundle;
    :goto_0
    const-string v1, "call_id"

    .line 918
    invoke-virtual {p1}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 916
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 921
    iget-object v1, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    const-string v2, "present_dialog"

    # invokes: Lcom/facebook/share/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V
    invoke-static {v1, v2, v0}, Lcom/facebook/share/internal/LikeActionController;->access$19(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 924
    iget-object v1, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    .line 925
    const-string v2, "com.facebook.sdk.LikeActionController.DID_ERROR"

    .line 926
    invoke-static {p2}, Lcom/facebook/internal/NativeProtocol;->createBundleForException(Lcom/facebook/FacebookException;)Landroid/os/Bundle;

    move-result-object v3

    .line 923
    # invokes: Lcom/facebook/share/internal/LikeActionController;->broadcastAction(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    invoke-static {v1, v2, v3}, Lcom/facebook/share/internal/LikeActionController;->access$20(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 927
    return-void

    .line 915
    .end local v0    # "logParams":Landroid/os/Bundle;
    :cond_0
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    goto :goto_0
.end method

.method public onSuccess(Lcom/facebook/internal/AppCall;Landroid/os/Bundle;)V
    .locals 10
    .param p1, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p2, "data"    # Landroid/os/Bundle;

    .prologue
    .line 857
    if-eqz p2, :cond_0

    const-string v0, "object_is_liked"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 905
    :cond_0
    :goto_0
    return-void

    .line 862
    :cond_1
    const-string v0, "object_is_liked"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 866
    .local v1, "isObjectLiked":Z
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$3(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v2

    .line 868
    .local v2, "likeCountStringWithLike":Ljava/lang/String;
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$4(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v3

    .line 869
    .local v3, "likeCountStringWithoutLike":Ljava/lang/String;
    const-string v0, "like_count_string"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 871
    const-string v0, "like_count_string"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 872
    move-object v3, v2

    .line 875
    :cond_2
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$5(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    .line 877
    .local v4, "socialSentenceWithLike":Ljava/lang/String;
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$6(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v5

    .line 878
    .local v5, "socialSentenceWithoutWithoutLike":Ljava/lang/String;
    const-string v0, "social_sentence"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 880
    const-string v0, "social_sentence"

    .line 879
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 881
    move-object v5, v4

    .line 884
    :cond_3
    const-string v0, "object_is_liked"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 885
    const-string v0, "unlike_token"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 889
    .local v6, "unlikeToken":Ljava/lang/String;
    :goto_1
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    if-nez v0, :cond_5

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 891
    .local v7, "logParams":Landroid/os/Bundle;
    :goto_2
    const-string v0, "call_id"

    .line 892
    invoke-virtual {p1}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v8

    .line 890
    invoke-virtual {v7, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 893
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # invokes: Lcom/facebook/share/internal/LikeActionController;->getAppEventsLogger()Lcom/facebook/appevents/AppEventsLogger;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$17(Lcom/facebook/share/internal/LikeActionController;)Lcom/facebook/appevents/AppEventsLogger;

    move-result-object v0

    .line 894
    const-string v8, "fb_like_control_dialog_did_succeed"

    .line 895
    const/4 v9, 0x0

    .line 893
    invoke-virtual {v0, v8, v9, v7}, Lcom/facebook/appevents/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 898
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # invokes: Lcom/facebook/share/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    invoke-static/range {v0 .. v6}, Lcom/facebook/share/internal/LikeActionController;->access$18(Lcom/facebook/share/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 886
    .end local v6    # "unlikeToken":Ljava/lang/String;
    .end local v7    # "logParams":Landroid/os/Bundle;
    :cond_4
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$6;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$16(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 889
    .restart local v6    # "unlikeToken":Ljava/lang/String;
    :cond_5
    iget-object v7, p0, Lcom/facebook/share/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    goto :goto_2
.end method
