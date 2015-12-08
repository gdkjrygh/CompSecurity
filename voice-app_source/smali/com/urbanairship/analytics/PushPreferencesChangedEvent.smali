.class public Lcom/urbanairship/analytics/PushPreferencesChangedEvent;
.super Lcom/urbanairship/analytics/Event;
.source "PushPreferencesChangedEvent.java"


# static fields
.field static final TYPE:Ljava/lang/String; = "push_preferences_changed"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/urbanairship/analytics/DefaultEnvironment;

    invoke-direct {v0}, Lcom/urbanairship/analytics/DefaultEnvironment;-><init>()V

    invoke-direct {p0, v0}, Lcom/urbanairship/analytics/PushPreferencesChangedEvent;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 55
    return-void
.end method

.method public constructor <init>(Lcom/urbanairship/analytics/Environment;)V
    .locals 0
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 48
    return-void
.end method


# virtual methods
.method getData()Lorg/json/JSONObject;
    .locals 9

    .prologue
    .line 64
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 65
    .local v0, "data":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/PushPreferencesChangedEvent;->getEnvironment()Lcom/urbanairship/analytics/Environment;

    move-result-object v2

    .line 68
    .local v2, "env":Lcom/urbanairship/analytics/Environment;
    :try_start_0
    const-string v6, "session_id"

    invoke-virtual {v2}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    const-string v6, "notification_types"

    new-instance v7, Lorg/json/JSONArray;

    invoke-virtual {v2}, Lcom/urbanairship/analytics/Environment;->getNotificationTypes()Ljava/util/ArrayList;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    const-string v6, "push_enabled"

    invoke-virtual {v2}, Lcom/urbanairship/analytics/Environment;->isPushEnabled()Z

    move-result v7

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 72
    invoke-virtual {v2}, Lcom/urbanairship/analytics/Environment;->getQuietTimeInterval()[Ljava/util/Date;

    move-result-object v5

    .line 73
    .local v5, "quietTime":[Ljava/util/Date;
    invoke-virtual {v2}, Lcom/urbanairship/analytics/Environment;->isQuietTimeEnabled()Z

    move-result v6

    if-eqz v6, :cond_0

    if-eqz v5, :cond_0

    .line 74
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v6, "HH:mm"

    invoke-direct {v4, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 75
    .local v4, "format":Ljava/text/SimpleDateFormat;
    new-instance v1, Ljava/util/ArrayList;

    const/4 v6, 0x2

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .local v1, "dateStrings":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v6, 0x0

    aget-object v6, v5, v6

    invoke-virtual {v4, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    const/4 v6, 0x1

    aget-object v6, v5, v6

    invoke-virtual {v4, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    const-string v6, "quiet_time"

    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .end local v1    # "dateStrings":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "format":Ljava/text/SimpleDateFormat;
    .end local v5    # "quietTime":[Ljava/util/Date;
    :cond_0
    :goto_0
    return-object v0

    .line 82
    :catch_0
    move-exception v3

    .line 83
    .local v3, "exception":Lorg/json/JSONException;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error constructing JSON data for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p0}, Lcom/urbanairship/analytics/PushPreferencesChangedEvent;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    const-string v0, "push_preferences_changed"

    return-object v0
.end method
