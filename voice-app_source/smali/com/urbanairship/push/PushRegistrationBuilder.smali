.class public Lcom/urbanairship/push/PushRegistrationBuilder;
.super Ljava/lang/Object;
.source "PushRegistrationBuilder.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildWithCurrentPreferences()Lcom/urbanairship/push/PushRegistrationPayload;
    .locals 5

    .prologue
    .line 38
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v1

    .line 40
    .local v1, "prefs":Lcom/urbanairship/push/PushPreferences;
    new-instance v0, Lcom/urbanairship/push/PushRegistrationPayload;

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getAlias()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getGcmId()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getDeviceTagsEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getTags()Ljava/util/Set;

    move-result-object v2

    :goto_0
    invoke-direct {v0, v3, v4, v2}, Lcom/urbanairship/push/PushRegistrationPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 44
    .local v0, "payload":Lcom/urbanairship/push/PushRegistrationPayload;
    return-object v0

    .line 40
    .end local v0    # "payload":Lcom/urbanairship/push/PushRegistrationPayload;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
