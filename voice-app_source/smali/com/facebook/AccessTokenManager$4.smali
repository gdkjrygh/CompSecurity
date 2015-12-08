.class Lcom/facebook/AccessTokenManager$4;
.super Ljava/lang/Object;
.source "AccessTokenManager.java"

# interfaces
.implements Lcom/facebook/GraphRequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/AccessTokenManager;->refreshCurrentAccessTokenImpl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/AccessTokenManager;

.field private final synthetic val$accessToken:Lcom/facebook/AccessToken;

.field private final synthetic val$declinedPermissions:Ljava/util/Set;

.field private final synthetic val$permissions:Ljava/util/Set;

.field private final synthetic val$permissionsCallSucceeded:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final synthetic val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;


# direct methods
.method constructor <init>(Lcom/facebook/AccessTokenManager;Lcom/facebook/AccessToken;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/AccessTokenManager$RefreshResult;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/AccessTokenManager$4;->this$0:Lcom/facebook/AccessTokenManager;

    iput-object p2, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    iput-object p3, p0, Lcom/facebook/AccessTokenManager$4;->val$permissionsCallSucceeded:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iput-object p5, p0, Lcom/facebook/AccessTokenManager$4;->val$permissions:Ljava/util/Set;

    iput-object p6, p0, Lcom/facebook/AccessTokenManager$4;->val$declinedPermissions:Ljava/util/Set;

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/GraphRequestBatch;)V
    .locals 13
    .param p1, "batch"    # Lcom/facebook/GraphRequestBatch;

    .prologue
    const/4 v12, 0x0

    .line 279
    invoke-static {}, Lcom/facebook/AccessTokenManager;->getInstance()Lcom/facebook/AccessTokenManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/AccessTokenManager;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 280
    invoke-static {}, Lcom/facebook/AccessTokenManager;->getInstance()Lcom/facebook/AccessTokenManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/AccessTokenManager;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getUserId()Ljava/lang/String;

    move-result-object v1

    .line 281
    iget-object v2, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getUserId()Ljava/lang/String;

    move-result-object v2

    .line 280
    if-eq v1, v2, :cond_1

    .line 309
    :cond_0
    :goto_0
    return-void

    .line 285
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->val$permissionsCallSucceeded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_2

    .line 286
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iget-object v1, v1, Lcom/facebook/AccessTokenManager$RefreshResult;->accessToken:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 287
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iget v1, v1, Lcom/facebook/AccessTokenManager$RefreshResult;->expiresAt:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_2

    .line 307
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->this$0:Lcom/facebook/AccessTokenManager;

    # getter for: Lcom/facebook/AccessTokenManager;->tokenRefreshInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v1}, Lcom/facebook/AccessTokenManager;->access$1(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 290
    :cond_2
    :try_start_1
    new-instance v0, Lcom/facebook/AccessToken;

    .line 291
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iget-object v1, v1, Lcom/facebook/AccessTokenManager$RefreshResult;->accessToken:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iget-object v1, v1, Lcom/facebook/AccessTokenManager$RefreshResult;->accessToken:Ljava/lang/String;

    .line 293
    :goto_1
    iget-object v2, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    .line 294
    iget-object v3, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v3}, Lcom/facebook/AccessToken;->getUserId()Ljava/lang/String;

    move-result-object v3

    .line 295
    iget-object v4, p0, Lcom/facebook/AccessTokenManager$4;->val$permissionsCallSucceeded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 296
    iget-object v4, p0, Lcom/facebook/AccessTokenManager$4;->val$permissions:Ljava/util/Set;

    .line 297
    :goto_2
    iget-object v5, p0, Lcom/facebook/AccessTokenManager$4;->val$permissionsCallSucceeded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 298
    iget-object v5, p0, Lcom/facebook/AccessTokenManager$4;->val$declinedPermissions:Ljava/util/Set;

    .line 299
    :goto_3
    iget-object v6, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v6}, Lcom/facebook/AccessToken;->getSource()Lcom/facebook/AccessTokenSource;

    move-result-object v6

    .line 300
    iget-object v7, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iget v7, v7, Lcom/facebook/AccessTokenManager$RefreshResult;->expiresAt:I

    if-eqz v7, :cond_6

    .line 301
    new-instance v7, Ljava/util/Date;

    iget-object v8, p0, Lcom/facebook/AccessTokenManager$4;->val$refreshResult:Lcom/facebook/AccessTokenManager$RefreshResult;

    iget v8, v8, Lcom/facebook/AccessTokenManager$RefreshResult;->expiresAt:I

    int-to-long v8, v8

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 303
    :goto_4
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 290
    invoke-direct/range {v0 .. v8}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;)V

    .line 305
    .local v0, "newAccessToken":Lcom/facebook/AccessToken;
    invoke-static {}, Lcom/facebook/AccessTokenManager;->getInstance()Lcom/facebook/AccessTokenManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/AccessTokenManager;->setCurrentAccessToken(Lcom/facebook/AccessToken;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 307
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->this$0:Lcom/facebook/AccessTokenManager;

    # getter for: Lcom/facebook/AccessTokenManager;->tokenRefreshInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v1}, Lcom/facebook/AccessTokenManager;->access$1(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 292
    .end local v0    # "newAccessToken":Lcom/facebook/AccessToken;
    :cond_3
    :try_start_2
    iget-object v1, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 296
    :cond_4
    iget-object v4, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v4}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v4

    goto :goto_2

    .line 298
    :cond_5
    iget-object v5, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v5}, Lcom/facebook/AccessToken;->getDeclinedPermissions()Ljava/util/Set;

    move-result-object v5

    goto :goto_3

    .line 302
    :cond_6
    iget-object v7, p0, Lcom/facebook/AccessTokenManager$4;->val$accessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v7}, Lcom/facebook/AccessToken;->getExpires()Ljava/util/Date;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v7

    goto :goto_4

    .line 306
    :catchall_0
    move-exception v1

    .line 307
    iget-object v2, p0, Lcom/facebook/AccessTokenManager$4;->this$0:Lcom/facebook/AccessTokenManager;

    # getter for: Lcom/facebook/AccessTokenManager;->tokenRefreshInProgress:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v2}, Lcom/facebook/AccessTokenManager;->access$1(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 308
    throw v1
.end method
