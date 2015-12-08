.class Lcom/facebook/share/ShareApi$10;
.super Ljava/lang/Object;
.source "ShareApi.java"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/ShareApi;->stageOpenGraphObject(Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/ShareApi;

.field private final synthetic val$onOpenGraphObjectStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;


# direct methods
.method constructor <init>(Lcom/facebook/share/ShareApi;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/ShareApi$10;->this$0:Lcom/facebook/share/ShareApi;

    iput-object p2, p0, Lcom/facebook/share/ShareApi$10;->val$onOpenGraphObjectStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 7
    .param p1, "response"    # Lcom/facebook/GraphResponse;

    .prologue
    .line 579
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    .line 580
    .local v1, "error":Lcom/facebook/FacebookRequestError;
    if-eqz v1, :cond_1

    .line 581
    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    .line 582
    .local v2, "message":Ljava/lang/String;
    if-nez v2, :cond_0

    .line 583
    const-string v2, "Error staging Open Graph object."

    .line 585
    :cond_0
    iget-object v4, p0, Lcom/facebook/share/ShareApi$10;->val$onOpenGraphObjectStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 586
    new-instance v5, Lcom/facebook/FacebookGraphResponseException;

    invoke-direct {v5, p1, v2}, Lcom/facebook/FacebookGraphResponseException;-><init>(Lcom/facebook/GraphResponse;Ljava/lang/String;)V

    .line 585
    invoke-interface {v4, v5}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    .line 604
    .end local v2    # "message":Ljava/lang/String;
    :goto_0
    return-void

    .line 589
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 590
    .local v0, "data":Lorg/json/JSONObject;
    if-nez v0, :cond_2

    .line 591
    iget-object v4, p0, Lcom/facebook/share/ShareApi$10;->val$onOpenGraphObjectStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 592
    new-instance v5, Lcom/facebook/FacebookGraphResponseException;

    .line 593
    const-string v6, "Error staging Open Graph object."

    .line 592
    invoke-direct {v5, p1, v6}, Lcom/facebook/FacebookGraphResponseException;-><init>(Lcom/facebook/GraphResponse;Ljava/lang/String;)V

    .line 591
    invoke-interface {v4, v5}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 596
    :cond_2
    const-string v4, "id"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 597
    .local v3, "stagedObjectId":Ljava/lang/String;
    if-nez v3, :cond_3

    .line 598
    iget-object v4, p0, Lcom/facebook/share/ShareApi$10;->val$onOpenGraphObjectStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .line 599
    new-instance v5, Lcom/facebook/FacebookGraphResponseException;

    .line 600
    const-string v6, "Error staging Open Graph object."

    .line 599
    invoke-direct {v5, p1, v6}, Lcom/facebook/FacebookGraphResponseException;-><init>(Lcom/facebook/GraphResponse;Ljava/lang/String;)V

    .line 598
    invoke-interface {v4, v5}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 603
    :cond_3
    iget-object v4, p0, Lcom/facebook/share/ShareApi$10;->val$onOpenGraphObjectStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    invoke-interface {v4, v3}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onComplete(Ljava/lang/Object;)V

    goto :goto_0
.end method
