.class Lcom/urbanairship/analytics/AppBackgroundEvent;
.super Lcom/urbanairship/analytics/Event;
.source "AppBackgroundEvent.java"


# static fields
.field static final TYPE:Ljava/lang/String; = "app_background"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    new-instance v0, Lcom/urbanairship/analytics/DefaultEnvironment;

    invoke-direct {v0}, Lcom/urbanairship/analytics/DefaultEnvironment;-><init>()V

    invoke-direct {p0, v0}, Lcom/urbanairship/analytics/AppBackgroundEvent;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Lcom/urbanairship/analytics/Environment;)V
    .locals 0
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 44
    return-void
.end method


# virtual methods
.method getData()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 61
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 62
    .local v0, "data":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/AppBackgroundEvent;->getEnvironment()Lcom/urbanairship/analytics/Environment;

    move-result-object v1

    .line 65
    .local v1, "env":Lcom/urbanairship/analytics/Environment;
    :try_start_0
    const-string v4, "session_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v4, "connection_type"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConnectionType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConnectionSubType()Ljava/lang/String;

    move-result-object v3

    .line 69
    .local v3, "subtype":Ljava/lang/String;
    invoke-static {v3}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 70
    const-string v4, "connection_subtype"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    :cond_0
    const-string v4, "push_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConversionPushId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .end local v3    # "subtype":Ljava/lang/String;
    :goto_0
    return-object v0

    .line 75
    :catch_0
    move-exception v2

    .line 76
    .local v2, "exception":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error constructing JSON data for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/urbanairship/analytics/AppBackgroundEvent;->getType()Ljava/lang/String;

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
    .line 55
    const-string v0, "app_background"

    return-object v0
.end method
