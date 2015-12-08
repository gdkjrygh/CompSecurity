.class Lcom/urbanairship/analytics/AppForegroundEvent;
.super Lcom/urbanairship/analytics/Event;
.source "AppForegroundEvent.java"


# static fields
.field static final TYPE:Ljava/lang/String; = "app_foreground"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 51
    new-instance v0, Lcom/urbanairship/analytics/DefaultEnvironment;

    invoke-direct {v0}, Lcom/urbanairship/analytics/DefaultEnvironment;-><init>()V

    invoke-direct {p0, v0}, Lcom/urbanairship/analytics/AppForegroundEvent;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Lcom/urbanairship/analytics/Environment;)V
    .locals 0
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 45
    return-void
.end method


# virtual methods
.method getData()Lorg/json/JSONObject;
    .locals 8

    .prologue
    .line 62
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 63
    .local v0, "data":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/AppForegroundEvent;->getEnvironment()Lcom/urbanairship/analytics/Environment;

    move-result-object v1

    .line 67
    .local v1, "env":Lcom/urbanairship/analytics/Environment;
    :try_start_0
    const-string v4, "connection_type"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConnectionType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConnectionSubType()Ljava/lang/String;

    move-result-object v3

    .line 70
    .local v3, "subtype":Ljava/lang/String;
    invoke-static {v3}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 71
    const-string v4, "connection_subtype"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    :cond_0
    const-string v4, "carrier"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getCarrier()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    const-string v4, "time_zone"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getTimezone()J

    move-result-wide v6

    invoke-virtual {v0, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 76
    const-string v4, "daylight_savings"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->isDaylightSavingsTime()Z

    move-result v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 77
    const-string v4, "notification_types"

    new-instance v5, Lorg/json/JSONArray;

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getNotificationTypes()Ljava/util/ArrayList;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    const-string v4, "os_version"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getOsVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    const-string v4, "lib_version"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getLibVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v4, "package_version"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getPackageVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v4, "session_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v4, "push_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getConversionPushId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    const-string v4, "push_enabled"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->isPushEnabled()Z

    move-result v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 84
    const-string v4, "last_send_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getLastSendId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .end local v3    # "subtype":Ljava/lang/String;
    :goto_0
    return-object v0

    .line 86
    :catch_0
    move-exception v2

    .line 87
    .local v2, "exception":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error constructing JSON data for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/urbanairship/analytics/AppForegroundEvent;->getType()Ljava/lang/String;

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
    .line 56
    const-string v0, "app_foreground"

    return-object v0
.end method
