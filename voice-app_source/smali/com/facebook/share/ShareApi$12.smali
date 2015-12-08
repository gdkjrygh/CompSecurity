.class Lcom/facebook/share/ShareApi$12;
.super Ljava/lang/Object;
.source "ShareApi.java"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/ShareApi;->stagePhoto(Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/ShareApi;

.field private final synthetic val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

.field private final synthetic val$photo:Lcom/facebook/share/model/SharePhoto;


# direct methods
.method constructor <init>(Lcom/facebook/share/ShareApi;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;Lcom/facebook/share/model/SharePhoto;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/ShareApi$12;->this$0:Lcom/facebook/share/ShareApi;

    iput-object p2, p0, Lcom/facebook/share/ShareApi$12;->val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    iput-object p3, p0, Lcom/facebook/share/ShareApi$12;->val$photo:Lcom/facebook/share/model/SharePhoto;

    .line 646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 9
    .param p1, "response"    # Lcom/facebook/GraphResponse;

    .prologue
    .line 649
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    .line 650
    .local v1, "error":Lcom/facebook/FacebookRequestError;
    if-eqz v1, :cond_1

    .line 651
    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    .line 652
    .local v3, "message":Ljava/lang/String;
    if-nez v3, :cond_0

    .line 653
    const-string v3, "Error staging photo."

    .line 655
    :cond_0
    iget-object v6, p0, Lcom/facebook/share/ShareApi$12;->val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 656
    new-instance v7, Lcom/facebook/FacebookGraphResponseException;

    invoke-direct {v7, p1, v3}, Lcom/facebook/FacebookGraphResponseException;-><init>(Lcom/facebook/GraphResponse;Ljava/lang/String;)V

    .line 655
    invoke-interface {v6, v7}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    .line 685
    .end local v3    # "message":Ljava/lang/String;
    :goto_0
    return-void

    .line 659
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 660
    .local v0, "data":Lorg/json/JSONObject;
    if-nez v0, :cond_2

    .line 661
    iget-object v6, p0, Lcom/facebook/share/ShareApi$12;->val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 662
    new-instance v7, Lcom/facebook/FacebookException;

    const-string v8, "Error staging photo."

    invoke-direct {v7, v8}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 661
    invoke-interface {v6, v7}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 665
    :cond_2
    const-string v6, "uri"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 666
    .local v4, "stagedImageUri":Ljava/lang/String;
    if-nez v4, :cond_3

    .line 667
    iget-object v6, p0, Lcom/facebook/share/ShareApi$12;->val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 668
    new-instance v7, Lcom/facebook/FacebookException;

    const-string v8, "Error staging photo."

    invoke-direct {v7, v8}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 667
    invoke-interface {v6, v7}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 672
    :cond_3
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 674
    .local v5, "stagedObject":Lorg/json/JSONObject;
    :try_start_0
    const-string v6, "url"

    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 675
    const-string v6, "user_generated"

    iget-object v7, p0, Lcom/facebook/share/ShareApi$12;->val$photo:Lcom/facebook/share/model/SharePhoto;

    invoke-virtual {v7}, Lcom/facebook/share/model/SharePhoto;->getUserGenerated()Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 684
    iget-object v6, p0, Lcom/facebook/share/ShareApi$12;->val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    invoke-interface {v6, v5}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onComplete(Ljava/lang/Object;)V

    goto :goto_0

    .line 676
    :catch_0
    move-exception v2

    .line 677
    .local v2, "ex":Lorg/json/JSONException;
    invoke-virtual {v2}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    .line 678
    .restart local v3    # "message":Ljava/lang/String;
    if-nez v3, :cond_4

    .line 679
    const-string v3, "Error staging photo."

    .line 681
    :cond_4
    iget-object v6, p0, Lcom/facebook/share/ShareApi$12;->val$onPhotoStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    new-instance v7, Lcom/facebook/FacebookException;

    invoke-direct {v7, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {v6, v7}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0
.end method
