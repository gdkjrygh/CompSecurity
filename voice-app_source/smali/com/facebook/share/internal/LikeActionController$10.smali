.class Lcom/facebook/share/internal/LikeActionController$10;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/internal/PlatformServiceClient$CompletedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/LikeActionController;->refreshStatusViaService()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/internal/LikeActionController;


# direct methods
.method constructor <init>(Lcom/facebook/share/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    .line 1137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public completed(Landroid/os/Bundle;)V
    .locals 7
    .param p1, "result"    # Landroid/os/Bundle;

    .prologue
    .line 1141
    if-eqz p1, :cond_0

    const-string v0, "com.facebook.platform.extra.OBJECT_IS_LIKED"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1181
    :cond_0
    :goto_0
    return-void

    .line 1145
    :cond_1
    const-string v0, "com.facebook.platform.extra.OBJECT_IS_LIKED"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 1148
    .local v1, "objectIsLiked":Z
    const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1149
    const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1153
    .local v2, "likeCountWithLike":Ljava/lang/String;
    :goto_1
    const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1155
    const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"

    .line 1154
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1159
    .local v3, "likeCountWithoutLike":Ljava/lang/String;
    :goto_2
    const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1160
    const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1164
    .local v4, "socialSentenceWithLike":Ljava/lang/String;
    :goto_3
    const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1166
    const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"

    .line 1165
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1170
    .local v5, "socialSentenceWithoutLike":Ljava/lang/String;
    :goto_4
    const-string v0, "com.facebook.platform.extra.UNLIKE_TOKEN"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1171
    const-string v0, "com.facebook.platform.extra.UNLIKE_TOKEN"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1174
    .local v6, "unlikeToken":Ljava/lang/String;
    :goto_5
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # invokes: Lcom/facebook/share/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    invoke-static/range {v0 .. v6}, Lcom/facebook/share/internal/LikeActionController;->access$18(Lcom/facebook/share/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1150
    .end local v2    # "likeCountWithLike":Ljava/lang/String;
    .end local v3    # "likeCountWithoutLike":Ljava/lang/String;
    .end local v4    # "socialSentenceWithLike":Ljava/lang/String;
    .end local v5    # "socialSentenceWithoutLike":Ljava/lang/String;
    .end local v6    # "unlikeToken":Ljava/lang/String;
    :cond_2
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$3(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 1156
    .restart local v2    # "likeCountWithLike":Ljava/lang/String;
    :cond_3
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$4(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    .line 1161
    .restart local v3    # "likeCountWithoutLike":Ljava/lang/String;
    :cond_4
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$5(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    .line 1167
    .restart local v4    # "socialSentenceWithLike":Ljava/lang/String;
    :cond_5
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$6(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    .line 1172
    .restart local v5    # "socialSentenceWithoutLike":Ljava/lang/String;
    :cond_6
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$10;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$16(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v6

    goto :goto_5
.end method
