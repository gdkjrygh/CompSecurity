.class Lcom/nbcuni/nbc/thevoice/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/nbcuni/nbc/thevoice/JavaScriptListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)Lcom/nbcuni/nbc/thevoice/MainActivity;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    return-object v0
.end method


# virtual methods
.method public addAssetToList(Ljava/lang/String;)V
    .locals 1
    .param p1, "fileName"    # Ljava/lang/String;

    .prologue
    .line 88
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v0, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->assets:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v0, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->assets:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_0
    return-void
.end method

.method public closeApp()V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->finish()V

    .line 98
    return-void
.end method

.method public facebookGraphRequest(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/HttpMethod;Ljava/lang/String;)V
    .locals 6
    .param p1, "commandId"    # Ljava/lang/String;
    .param p2, "path"    # Ljava/lang/String;
    .param p3, "method"    # Lcom/facebook/HttpMethod;
    .param p4, "fields"    # Ljava/lang/String;

    .prologue
    .line 103
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 104
    .local v3, "parameters":Landroid/os/Bundle;
    const-string v0, "fields"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    new-instance v0, Lcom/facebook/GraphRequest;

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;

    invoke-direct {v5, p0, p1}, Lcom/nbcuni/nbc/thevoice/MainActivity$1$1;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;Ljava/lang/String;)V

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    .line 116
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 118
    return-void
.end method

.method public facebookLogin(Ljava/lang/String;Ljava/util/List;Z)V
    .locals 4
    .param p1, "commandId"    # Ljava/lang/String;
    .param p3, "interactive"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 123
    .local p2, "loginPermissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$0(Ljava/util/List;)V

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 125
    .local v0, "cmdId":I
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-static {v2, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$1(Lcom/nbcuni/nbc/thevoice/MainActivity;I)V

    .line 126
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v3, "FacebookLogin"

    invoke-static {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$2(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    .line 128
    if-eqz p3, :cond_0

    .line 129
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/MainActivity;->onClickLogin(ILjava/util/List;)V
    invoke-static {v2, v0, p2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$3(Lcom/nbcuni/nbc/thevoice/MainActivity;ILjava/util/List;)V

    .line 141
    :goto_0
    return-void

    .line 132
    :cond_0
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\"commandId\":\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loginCmdID:I
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$4(Lcom/nbcuni/nbc/thevoice/MainActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\",\"type\":\"CommandResult\",\"subject\":\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loginSubject:Ljava/lang/String;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$5(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\",\"payload\":{\"token\":\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"}}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 138
    .local v1, "commandResult":Ljava/lang/String;
    :goto_1
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v2, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    goto :goto_0

    .line 136
    .end local v1    # "commandResult":Ljava/lang/String;
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\"commandId\":\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loginCmdID:I
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$4(Lcom/nbcuni/nbc/thevoice/MainActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\",\"type\":\"CommandResult\",\"subject\":\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->loginSubject:Ljava/lang/String;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$5(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .restart local v1    # "commandResult":Ljava/lang/String;
    goto :goto_1
.end method

.method public facebookLogout(Ljava/lang/String;)V
    .locals 1
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 146
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/MainActivity;->onClickLogout(Ljava/lang/String;)V
    invoke-static {v0, p1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$6(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    .line 148
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
    .line 153
    .local p2, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v1, ""

    .line 154
    .local v1, "commaPerms":Ljava/lang/String;
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$1(Lcom/nbcuni/nbc/thevoice/MainActivity;I)V

    .line 155
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-string v3, "FacebookRequestReadPermissions"

    invoke-static {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$2(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    .line 157
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 158
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v0

    .line 159
    .local v0, "CURRENT_PERMISSIONS":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # invokes: Lcom/nbcuni/nbc/thevoice/MainActivity;->isSubsetOf(Ljava/util/Collection;Ljava/util/Collection;)Z
    invoke-static {v2, p2, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$7(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 160
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v2

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getParent()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v2, v3, p2}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    .line 166
    .end local v0    # "CURRENT_PERMISSIONS":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_0
    return-void
.end method

.method public facebookShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "commandId"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "link"    # Ljava/lang/String;
    .param p5, "image"    # Ljava/lang/String;

    .prologue
    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://www.facebook.com/dialog/feed?app_id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v3, 0x7f08004b

    invoke-virtual {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

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

    const-string v2, "http://www.nbc.com/the-voice/?votenow=null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&therecanbeonly=one"

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

    .line 172
    .local v0, "shareUrl":Ljava/lang/String;
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v1, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 174
    return-void
.end method

.method public mixpanelIncrementPeopleProperties(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 179
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 180
    .local v1, "increments":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 189
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->increment(Ljava/util/Map;)V

    .line 190
    return-void

    .line 183
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 184
    .local v2, "key":Ljava/lang/String;
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .end local v2    # "key":Ljava/lang/String;
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 185
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public mixpanelRegisterSuperProperties(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 195
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 196
    .local v2, "superProperties":Lorg/json/JSONObject;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 203
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperProperties(Lorg/json/JSONObject;)V

    .line 205
    return-void

    .line 198
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 199
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    .end local v1    # "key":Ljava/lang/String;
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 200
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public mixpanelSetPeopleProperties(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 210
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 211
    .local v2, "peopleProperties":Lorg/json/JSONObject;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 219
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->set(Lorg/json/JSONObject;)V

    .line 220
    return-void

    .line 213
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 214
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    .end local v1    # "key":Ljava/lang/String;
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 215
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public mixpanelTrackEvent(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 225
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 226
    .local v2, "props":Lorg/json/JSONObject;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 234
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v3, p1, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 236
    return-void

    .line 228
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 229
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    .end local v1    # "key":Ljava/lang/String;
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 231
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public openDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "commandId"    # Ljava/lang/String;
    .param p4, "firstButton"    # Ljava/lang/String;
    .param p5, "secondButton"    # Ljava/lang/String;

    .prologue
    .line 241
    if-nez p1, :cond_0

    .line 242
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const v3, 0x7f080049

    invoke-virtual {v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 246
    :cond_0
    const-string v2, "Are you sure you want to close"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 247
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showQuitDialog()V

    .line 280
    :goto_0
    return-void

    .line 251
    :cond_1
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 252
    .local v0, "factory":Landroid/view/LayoutInflater;
    const v2, 0x7f03000e

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 254
    .local v1, "v":Landroid/view/View;
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x5

    invoke-direct {v2, v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    new-instance v3, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;

    invoke-direct {v3, p0, p3, p4}, Lcom/nbcuni/nbc/thevoice/MainActivity$1$2;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p4, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 262
    new-instance v3, Lcom/nbcuni/nbc/thevoice/MainActivity$1$3;

    invoke-direct {v3, p0, p3, p5}, Lcom/nbcuni/nbc/thevoice/MainActivity$1$3;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p5, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 270
    new-instance v3, Lcom/nbcuni/nbc/thevoice/MainActivity$1$4;

    invoke-direct {v3, p0, p3}, Lcom/nbcuni/nbc/thevoice/MainActivity$1$4;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 278
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public openUrl(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 6
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "nav"    # Z
    .param p3, "phaseTitle"    # Ljava/lang/String;

    .prologue
    .line 285
    if-eqz p2, :cond_2

    .line 286
    sget-boolean v4, Lcom/nbcuni/nbc/thevoice/MainActivity;->popupOpened:Z

    if-nez v4, :cond_1

    .line 287
    new-instance v2, Landroid/content/Intent;

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    const-class v5, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 288
    .local v2, "intent":Landroid/content/Intent;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 289
    .local v0, "b":Landroid/os/Bundle;
    const-string v4, "nav"

    const/4 v5, 0x1

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 290
    const-string v4, "key"

    invoke-virtual {v0, v4, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    if-eqz p3, :cond_0

    .line 292
    const-string v4, "phase"

    invoke-virtual {v0, v4, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    :cond_0
    invoke-virtual {v2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 294
    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v4, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 302
    .end local v0    # "b":Landroid/os/Bundle;
    .end local v2    # "intent":Landroid/content/Intent;
    :cond_1
    :goto_0
    return-void

    .line 297
    :cond_2
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 298
    .local v3, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 299
    .local v1, "browserIntent":Landroid/content/Intent;
    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v4, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public pauseAudio(Ljava/lang/String;)V
    .locals 1
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 307
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 311
    :cond_0
    return-void
.end method

.method public playAudio(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "fileName"    # Ljava/lang/String;
    .param p2, "commandId"    # Ljava/lang/String;

    .prologue
    .line 316
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    if-nez v3, :cond_0

    .line 317
    const-string v3, "Badger"

    const-string v4, "Initializing mediaPlayer"

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 318
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    new-instance v4, Landroid/media/MediaPlayer;

    invoke-direct {v4}, Landroid/media/MediaPlayer;-><init>()V

    invoke-static {v3, v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$10(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/media/MediaPlayer;)V

    .line 319
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    new-instance v4, Lcom/nbcuni/nbc/thevoice/MainActivity$1$5;

    invoke-direct {v4, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$1$5;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity$1;)V

    invoke-virtual {v3, v4}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 335
    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 337
    .local v0, "audioFile":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 338
    const-string v3, "Badger"

    const-string v4, "No such file"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{\"commandId\":\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\",\"type\":\"CommandResult\",\"subject\":\"PlayAudio\",\"error\":{\"code\":\"File not found.\"}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 340
    .local v1, "commandResult":Ljava/lang/String;
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v3, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 359
    .end local v1    # "commandResult":Ljava/lang/String;
    :goto_0
    return-void

    .line 343
    :cond_1
    :try_start_0
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 344
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->stop()V

    .line 345
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->reset()V

    .line 346
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->fis:Ljava/io/FileInputStream;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$11(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/io/FileInputStream;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 348
    :cond_2
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-static {v3, v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$12(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/io/FileInputStream;)V

    .line 349
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->fis:Ljava/io/FileInputStream;
    invoke-static {v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$11(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/io/FileInputStream;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 350
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->prepare()V

    .line 351
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->start()V

    .line 352
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{\"commandId\":\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\",\"type\":\"CommandResult\",\"subject\":\"PlayAudio\"}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 353
    .restart local v1    # "commandResult":Ljava/lang/String;
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v3, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 354
    .end local v1    # "commandResult":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 355
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public pushSetting(ZLjava/lang/String;)V
    .locals 2
    .param p1, "value"    # Z
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 364
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$13(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 366
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    if-eqz p1, :cond_0

    .line 367
    invoke-static {}, Lcom/urbanairship/push/PushManager;->enablePush()V

    .line 368
    const-string v1, "push"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 369
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v1, p2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 376
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 377
    return-void

    .line 371
    :cond_0
    invoke-static {}, Lcom/urbanairship/push/PushManager;->disablePush()V

    .line 372
    const-string v1, "push"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 373
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v1, p2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public reloadWebView()V
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 384
    return-void
.end method

.method public resumeAudio(Ljava/lang/String;)V
    .locals 2
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 390
    :try_start_0
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 394
    :goto_0
    return-void

    .line 391
    :catch_0
    move-exception v0

    .line 392
    .local v0, "e":Ljava/lang/IllegalStateException;
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0
.end method

.method public saveSharedPreference(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 399
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$13(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 400
    .local v0, "sp":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 401
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 402
    return-void
.end method

.method public sendNativeMessage(Ljava/lang/String;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 407
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v0, p1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 409
    return-void
.end method

.method public stopAudio(Ljava/lang/String;)V
    .locals 2
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 414
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 416
    :try_start_0
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 417
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->reset()V

    .line 418
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity;->fis:Ljava/io/FileInputStream;
    invoke-static {v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$11(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/io/FileInputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 423
    :cond_0
    :goto_0
    return-void

    .line 419
    :catch_0
    move-exception v0

    .line 420
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
