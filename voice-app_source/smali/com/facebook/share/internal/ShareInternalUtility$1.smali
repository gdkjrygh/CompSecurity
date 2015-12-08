.class Lcom/facebook/share/internal/ShareInternalUtility$1;
.super Lcom/facebook/share/internal/ResultProcessor;
.source "ShareInternalUtility.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/ShareInternalUtility;->getShareResultProcessor(Lcom/facebook/FacebookCallback;)Lcom/facebook/share/internal/ResultProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$callback:Lcom/facebook/FacebookCallback;


# direct methods
.method constructor <init>(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookCallback;)V
    .locals 0
    .param p1, "$anonymous0"    # Lcom/facebook/FacebookCallback;

    .prologue
    .line 1
    iput-object p2, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    .line 183
    invoke-direct {p0, p1}, Lcom/facebook/share/internal/ResultProcessor;-><init>(Lcom/facebook/FacebookCallback;)V

    return-void
.end method


# virtual methods
.method public onCancel(Lcom/facebook/internal/AppCall;)V
    .locals 1
    .param p1, "appCall"    # Lcom/facebook/internal/AppCall;

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-static {v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnCancelCallback(Lcom/facebook/FacebookCallback;)V

    .line 204
    return-void
.end method

.method public onError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V
    .locals 1
    .param p1, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p2, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-static {v0, p2}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V

    .line 209
    return-void
.end method

.method public onSuccess(Lcom/facebook/internal/AppCall;Landroid/os/Bundle;)V
    .locals 5
    .param p1, "appCall"    # Lcom/facebook/internal/AppCall;
    .param p2, "results"    # Landroid/os/Bundle;

    .prologue
    .line 186
    if-eqz p2, :cond_1

    .line 187
    invoke-static {p2}, Lcom/facebook/share/internal/ShareInternalUtility;->getNativeDialogCompletionGesture(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    .line 188
    .local v0, "gesture":Ljava/lang/String;
    if-eqz v0, :cond_0

    const-string v2, "post"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 189
    :cond_0
    invoke-static {p2}, Lcom/facebook/share/internal/ShareInternalUtility;->getShareDialogPostId(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    .line 190
    .local v1, "postId":Ljava/lang/String;
    iget-object v2, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-static {v2, v1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnSuccessCallback(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    .line 199
    .end local v0    # "gesture":Ljava/lang/String;
    .end local v1    # "postId":Ljava/lang/String;
    :cond_1
    :goto_0
    return-void

    .line 191
    .restart local v0    # "gesture":Ljava/lang/String;
    :cond_2
    const-string v2, "cancel"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 192
    iget-object v2, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-static {v2}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnCancelCallback(Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 195
    :cond_3
    iget-object v2, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    .line 196
    new-instance v3, Lcom/facebook/FacebookException;

    const-string v4, "UnknownError"

    invoke-direct {v3, v4}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-static {v2, v3}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V

    goto :goto_0
.end method
