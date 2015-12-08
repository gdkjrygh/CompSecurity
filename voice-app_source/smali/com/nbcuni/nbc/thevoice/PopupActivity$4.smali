.class Lcom/nbcuni/nbc/thevoice/PopupActivity$4;
.super Ljava/lang/Object;
.source "PopupActivity.java"

# interfaces
.implements Lcom/facebook/FacebookCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/FacebookCallback",
        "<",
        "Lcom/facebook/login/LoginResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 3

    .prologue
    .line 262
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginCmdID:I
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$10(Lcom/nbcuni/nbc/thevoice/PopupActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginSubject:Ljava/lang/String;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$11(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"error\":{\"code\":\"FacebookLoginCancelled\"}}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 263
    .local v0, "failResult":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 265
    return-void
.end method

.method public onError(Lcom/facebook/FacebookException;)V
    .locals 3
    .param p1, "error"    # Lcom/facebook/FacebookException;

    .prologue
    .line 270
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginCmdID:I
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$10(Lcom/nbcuni/nbc/thevoice/PopupActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginSubject:Ljava/lang/String;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$11(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"error\":{\"code\":\"FacebookLoginFailedError\"}}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 271
    .local v0, "failResult":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 273
    return-void
.end method

.method public onSuccess(Lcom/facebook/login/LoginResult;)V
    .locals 3
    .param p1, "result"    # Lcom/facebook/login/LoginResult;

    .prologue
    .line 278
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 279
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginCmdID:I
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$10(Lcom/nbcuni/nbc/thevoice/PopupActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/PopupActivity;->loginSubject:Ljava/lang/String;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$11(Lcom/nbcuni/nbc/thevoice/PopupActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"payload\":{\"token\":\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/login/LoginResult;->getAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\"}}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 280
    .local v0, "commandResult":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 282
    .end local v0    # "commandResult":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/login/LoginResult;

    invoke-virtual {p0, p1}, Lcom/nbcuni/nbc/thevoice/PopupActivity$4;->onSuccess(Lcom/facebook/login/LoginResult;)V

    return-void
.end method
