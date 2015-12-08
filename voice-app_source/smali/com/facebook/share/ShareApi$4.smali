.class Lcom/facebook/share/ShareApi$4;
.super Ljava/lang/Object;
.source "ShareApi.java"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/ShareApi;->shareLinkContent(Lcom/facebook/share/model/ShareLinkContent;Lcom/facebook/FacebookCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/ShareApi;

.field private final synthetic val$callback:Lcom/facebook/FacebookCallback;


# direct methods
.method constructor <init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/ShareApi$4;->this$0:Lcom/facebook/share/ShareApi;

    iput-object p2, p0, Lcom/facebook/share/ShareApi$4;->val$callback:Lcom/facebook/FacebookCallback;

    .line 388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 3
    .param p1, "response"    # Lcom/facebook/GraphResponse;

    .prologue
    .line 391
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 392
    .local v0, "data":Lorg/json/JSONObject;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    .line 393
    .local v1, "postId":Ljava/lang/String;
    :goto_0
    iget-object v2, p0, Lcom/facebook/share/ShareApi$4;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-static {v2, v1, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithResults(Lcom/facebook/FacebookCallback;Ljava/lang/String;Lcom/facebook/GraphResponse;)V

    .line 394
    return-void

    .line 392
    .end local v1    # "postId":Ljava/lang/String;
    :cond_0
    const-string v2, "id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
