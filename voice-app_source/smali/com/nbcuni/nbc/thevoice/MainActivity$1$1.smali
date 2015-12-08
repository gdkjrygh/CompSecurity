.class Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity$1;->facebookGraphRequest(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/HttpMethod;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

.field private final synthetic val$commandId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;->val$commandId:Ljava/lang/String;

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 4
    .param p1, "response"    # Lcom/facebook/GraphResponse;

    .prologue
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;->val$commandId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\"FacebookGraphRequest\",\"payload\":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getRawResponse()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    .local v0, "commandResult":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 114
    const-string v1, "WebLog"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "GRAPHRESPONSE: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getRawResponse()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    return-void
.end method
