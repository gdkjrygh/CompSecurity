.class public Lcom/urbanairship/push/PushRegistrationPayload;
.super Ljava/lang/Object;
.source "PushRegistrationPayload.java"


# static fields
.field public static final ALIAS_KEY:Ljava/lang/String; = "alias"

.field public static final GCM_ID_KEY:Ljava/lang/String; = "gcm_registration_id"

.field public static final TAGS_KEY:Ljava/lang/String; = "tags"


# instance fields
.field private alias:Ljava/lang/String;

.field private gcmRegistrationId:Ljava/lang/String;

.field private tags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "alias"    # Ljava/lang/String;
    .param p2, "gcmRegistrationId"    # Ljava/lang/String;

    .prologue
    .line 76
    const/4 v0, 0x0

    check-cast v0, Ljava/util/Set;

    invoke-direct {p0, p1, p2, v0}, Lcom/urbanairship/push/PushRegistrationPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 77
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0
    .param p1, "alias"    # Ljava/lang/String;
    .param p2, "gcmRegistrationId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 64
    .local p3, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/urbanairship/push/PushRegistrationPayload;->alias:Ljava/lang/String;

    .line 66
    iput-object p3, p0, Lcom/urbanairship/push/PushRegistrationPayload;->tags:Ljava/util/Set;

    .line 67
    iput-object p2, p0, Lcom/urbanairship/push/PushRegistrationPayload;->gcmRegistrationId:Ljava/lang/String;

    .line 68
    return-void
.end method


# virtual methods
.method public asJSON()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 86
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 88
    .local v0, "body":Lorg/json/JSONObject;
    const-string v1, "alias"

    iget-object v2, p0, Lcom/urbanairship/push/PushRegistrationPayload;->alias:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    iget-object v1, p0, Lcom/urbanairship/push/PushRegistrationPayload;->tags:Ljava/util/Set;

    if-eqz v1, :cond_0

    .line 92
    const-string v1, "tags"

    new-instance v2, Lorg/json/JSONArray;

    iget-object v3, p0, Lcom/urbanairship/push/PushRegistrationPayload;->tags:Ljava/util/Set;

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    :cond_0
    const-string v1, "gcm_registration_id"

    iget-object v2, p0, Lcom/urbanairship/push/PushRegistrationPayload;->gcmRegistrationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    return-object v0
.end method

.method public getAlias()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/urbanairship/push/PushRegistrationPayload;->alias:Ljava/lang/String;

    return-object v0
.end method

.method public getGcmRegistrationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/urbanairship/push/PushRegistrationPayload;->gcmRegistrationId:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/urbanairship/push/PushRegistrationPayload;->tags:Ljava/util/Set;

    return-object v0
.end method
