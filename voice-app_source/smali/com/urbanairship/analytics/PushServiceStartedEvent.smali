.class public Lcom/urbanairship/analytics/PushServiceStartedEvent;
.super Lcom/urbanairship/analytics/Event;
.source "PushServiceStartedEvent.java"


# static fields
.field static final TYPE:Ljava/lang/String; = "push_service_started"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 49
    new-instance v0, Lcom/urbanairship/analytics/DefaultEnvironment;

    invoke-direct {v0}, Lcom/urbanairship/analytics/DefaultEnvironment;-><init>()V

    invoke-direct {p0, v0}, Lcom/urbanairship/analytics/PushServiceStartedEvent;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Lcom/urbanairship/analytics/Environment;)V
    .locals 0
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 43
    return-void
.end method


# virtual methods
.method getData()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 59
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 60
    .local v0, "data":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/PushServiceStartedEvent;->getEnvironment()Lcom/urbanairship/analytics/Environment;

    move-result-object v1

    .line 64
    .local v1, "env":Lcom/urbanairship/analytics/Environment;
    :try_start_0
    const-string v4, "session_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string v4, "connection_type"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConnectionType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConnectionSubType()Ljava/lang/String;

    move-result-object v3

    .line 70
    .local v3, "subtype":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 71
    const-string v4, "connection_subtype"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    :cond_0
    const-string v4, "carrier"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getCarrier()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    const-string v4, "apid"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getApid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    const-string v4, "transport"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getPushTransport()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    const-string v4, "push_enabled"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->isPushEnabled()Z

    move-result v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .end local v3    # "subtype":Ljava/lang/String;
    :goto_0
    return-object v0

    .line 80
    :catch_0
    move-exception v2

    .line 81
    .local v2, "exception":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error constructing JSON data for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/urbanairship/analytics/PushServiceStartedEvent;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    const-string v0, "push_service_started"

    return-object v0
.end method
