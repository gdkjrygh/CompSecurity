.class public Lcom/urbanairship/richpush/RichPushUser;
.super Ljava/lang/Object;
.source "RichPushUser.java"


# static fields
.field private static final MODIFY_USER_URL:Ljava/lang/String; = "api/user/%s/"

.field private static final NEW_USER_URL:Ljava/lang/String; = "api/user/"

.field private static final PAYLOAD_PASSWORD_KEY:Ljava/lang/String; = "password"

.field private static final PAYLOAD_USER_ID_KEY:Ljava/lang/String; = "user_id"


# instance fields
.field preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    .line 57
    return-void
.end method

.method public static isCreated()Z
    .locals 3

    .prologue
    .line 67
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v0

    .line 68
    .local v0, "userId":Ljava/lang/String;
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushUser;->getPassword()Ljava/lang/String;

    move-result-object v1

    .line 69
    .local v1, "userToken":Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method static newUserUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v1, v1, Lcom/urbanairship/AirshipConfigOptions;->hostURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "api/user/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static updateUserAttributes(Ljava/lang/String;)V
    .locals 5
    .param p0, "responseBody"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 97
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 99
    .local v0, "response":Lorg/json/JSONObject;
    const-string v3, "user_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 100
    .local v1, "userId":Ljava/lang/String;
    const-string v3, "password"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 102
    .local v2, "userToken":Ljava/lang/String;
    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 103
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Updating user attributes for id: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 104
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v3

    iget-object v3, v3, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v3, v1, v2}, Lcom/urbanairship/richpush/RichPushUserPreferences;->setUserCredentials(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    :goto_0
    return-void

    .line 106
    :cond_0
    const-string v3, "Unable to update user. Missing user ID or user token."

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public addApid(Ljava/lang/String;)V
    .locals 0
    .param p1, "apid"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 149
    return-void
.end method

.method public getApids()Ljava/util/HashSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 122
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 123
    .local v0, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 124
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_0
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getUserId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized getInbox()Lcom/urbanairship/richpush/RichPushInbox;
    .locals 1

    .prologue
    .line 160
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/urbanairship/richpush/RichPushInbox;->shared()Lcom/urbanairship/richpush/RichPushInbox;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method getLastMessageRefreshTime()Ljava/lang/String;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getLastMessageRefreshTime()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getLastUpdateTime()J
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getLastUpdateTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getUserToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setApids(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 139
    .local p1, "apids":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    return-void
.end method

.method setLastMessageRefreshTime(Ljava/lang/String;)V
    .locals 1
    .param p1, "timeStamp"    # Ljava/lang/String;

    .prologue
    .line 214
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v0, p1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->setLastMessageRefreshTime(Ljava/lang/String;)V

    .line 215
    return-void
.end method

.method setLastUpdateTime(J)V
    .locals 1
    .param p1, "timeMs"    # J

    .prologue
    .line 196
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushUser;->preferences:Lcom/urbanairship/richpush/RichPushUserPreferences;

    invoke-virtual {v0, p1, p2}, Lcom/urbanairship/richpush/RichPushUserPreferences;->setLastUpdateTime(J)V

    .line 197
    return-void
.end method

.method userUrl()Ljava/lang/String;
    .locals 4

    .prologue
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v1, v1, Lcom/urbanairship/AirshipConfigOptions;->hostURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "api/user/%s/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
