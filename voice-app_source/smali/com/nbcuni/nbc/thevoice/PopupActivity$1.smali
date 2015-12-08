.class Lcom/nbcuni/nbc/thevoice/PopupActivity$1;
.super Ljava/lang/Object;
.source "PopupActivity.java"

# interfaces
.implements Lcom/nbcuni/nbc/thevoice/PopupJSListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nbcuni/nbc/thevoice/PopupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/PopupActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)Lcom/nbcuni/nbc/thevoice/PopupActivity;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    return-object v0
.end method


# virtual methods
.method public closePopup()V
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->finish()V

    .line 49
    return-void
.end method

.method public facebookLogin(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .param p1, "commandId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 54
    .local p2, "loginPermissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v1, ""

    .line 55
    .local v1, "commaPerms":Ljava/lang/String;
    invoke-static {p2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$0(Ljava/util/List;)V

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 57
    .local v0, "cmdId":I
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-static {v3, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$1(Lcom/nbcuni/nbc/thevoice/PopupActivity;I)V

    .line 58
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    const-string v4, "FacebookLogin"

    invoke-static {v3, v4}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$2(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V

    .line 60
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    .line 64
    const/4 v3, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 66
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/PopupActivity;->onClickLogin(ILjava/util/List;)V
    invoke-static {v3, v0, p2}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$3(Lcom/nbcuni/nbc/thevoice/PopupActivity;ILjava/util/List;)V

    .line 68
    return-void

    .line 60
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 61
    .local v2, "part":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public facebookLogout(Ljava/lang/String;)V
    .locals 1
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 73
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/PopupActivity;->onClickLogout(Ljava/lang/String;)V
    invoke-static {v0, p1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$4(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V

    .line 75
    return-void
.end method

.method public facebookPermissionRequest(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .param p1, "commandId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 80
    .local p2, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v1, ""

    .line 81
    .local v1, "commaPerms":Ljava/lang/String;
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v2, v3}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$1(Lcom/nbcuni/nbc/thevoice/PopupActivity;I)V

    .line 82
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    const-string v3, "FacebookRequestReadPermissions"

    invoke-static {v2, v3}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$2(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/lang/String;)V

    .line 84
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 85
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v0

    .line 86
    .local v0, "CURRENT_PERMISSIONS":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/PopupActivity;->isSubsetOf(Ljava/util/Collection;Ljava/util/Collection;)Z
    invoke-static {v2, p2, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->access$5(Lcom/nbcuni/nbc/thevoice/PopupActivity;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 87
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v2

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v3}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getParent()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v2, v3, p2}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    .line 93
    .end local v0    # "CURRENT_PERMISSIONS":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_0
    return-void
.end method

.method public facebookShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "commandId"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "link"    # Ljava/lang/String;
    .param p5, "image"    # Ljava/lang/String;

    .prologue
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://www.facebook.com/dialog/feed?app_id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    const v3, 0x7f08004b

    invoke-virtual {v2, v3}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&link="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&redirect_uri="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iget-object v2, v2, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "votenowURL"

    const-string v4, "http://www.nbc.com/the-voice"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&description="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&picture="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 99
    .local v0, "shareUrl":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 101
    return-void
.end method

.method public hideLoadingScreen()V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    new-instance v1, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;

    invoke-direct {v1, p0}, Lcom/nbcuni/nbc/thevoice/PopupActivity$1$1;-><init>(Lcom/nbcuni/nbc/thevoice/PopupActivity$1;)V

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/PopupActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 119
    return-void
.end method

.method public passExpiresValue(Ljava/lang/String;)V
    .locals 2
    .param p1, "expireValue"    # Ljava/lang/String;

    .prologue
    .line 124
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/PopupActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/PopupActivity;

    iget-object v1, v1, Lcom/nbcuni/nbc/thevoice/PopupActivity;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 125
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v1, "expiryDate"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 126
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 127
    return-void
.end method
