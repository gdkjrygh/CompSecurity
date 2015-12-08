.class public Lcom/urbanairship/analytics/PushArrivedEvent;
.super Lcom/urbanairship/analytics/Event;
.source "PushArrivedEvent.java"


# static fields
.field static final TYPE:Ljava/lang/String; = "push_arrived"


# instance fields
.field private pushId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/urbanairship/analytics/Environment;Ljava/lang/String;)V
    .locals 0
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;
    .param p2, "id"    # Ljava/lang/String;

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 41
    iput-object p2, p0, Lcom/urbanairship/analytics/PushArrivedEvent;->pushId:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 49
    new-instance v0, Lcom/urbanairship/analytics/DefaultEnvironment;

    invoke-direct {v0}, Lcom/urbanairship/analytics/DefaultEnvironment;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/urbanairship/analytics/PushArrivedEvent;-><init>(Lcom/urbanairship/analytics/Environment;Ljava/lang/String;)V

    .line 50
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
    invoke-virtual {p0}, Lcom/urbanairship/analytics/PushArrivedEvent;->getEnvironment()Lcom/urbanairship/analytics/Environment;

    move-result-object v1

    .line 63
    .local v1, "env":Lcom/urbanairship/analytics/Environment;
    :try_start_0
    const-string v4, "session_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    const-string v4, "push_id"

    iget-object v5, p0, Lcom/urbanairship/analytics/PushArrivedEvent;->pushId:Ljava/lang/String;

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
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .end local v3    # "subtype":Ljava/lang/String;
    :goto_0
    return-object v0

    .line 77
    :catch_0
    move-exception v2

    .line 78
    .local v2, "exception":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error constructing JSON data for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/urbanairship/analytics/PushArrivedEvent;->getType()Ljava/lang/String;

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
    const-string v0, "push_arrived"

    return-object v0
.end method
