.class public abstract Lcom/urbanairship/analytics/Event;
.super Ljava/lang/Object;
.source "Event.java"


# static fields
.field static final APID_KEY:Ljava/lang/String; = "apid"

.field static final CARRIER_KEY:Ljava/lang/String; = "carrier"

.field static final CLASS_NAME_KEY:Ljava/lang/String; = "class_name"

.field static final CONNECTION_SUBTYPE_KEY:Ljava/lang/String; = "connection_subtype"

.field static final CONNECTION_TYPE_KEY:Ljava/lang/String; = "connection_type"

.field static final DATA_KEY:Ljava/lang/String; = "data"

.field static final DAYLIGHT_SAVINGS_KEY:Ljava/lang/String; = "daylight_savings"

.field static final EVENT_ID_KEY:Ljava/lang/String; = "event_id"

.field static final LAST_SEND_ID_KEY:Ljava/lang/String; = "last_send_id"

.field static final LIB_VERSION_KEY:Ljava/lang/String; = "lib_version"

.field static final NOTIFICATION_TYPES_KEY:Ljava/lang/String; = "notification_types"

.field static final OS_VERSION_KEY:Ljava/lang/String; = "os_version"

.field static final PACKAGE_VERSION_KEY:Ljava/lang/String; = "package_version"

.field static final PUSH_ENABLED_KEY:Ljava/lang/String; = "push_enabled"

.field static final PUSH_ID_KEY:Ljava/lang/String; = "push_id"

.field static final QUIET_TIME_KEY:Ljava/lang/String; = "quiet_time"

.field static final SESSION_ID_KEY:Ljava/lang/String; = "session_id"

.field static final TIME_KEY:Ljava/lang/String; = "time"

.field static final TIME_ZONE_KEY:Ljava/lang/String; = "time_zone"

.field static final TRANSPORT_KEY:Ljava/lang/String; = "transport"

.field static final TYPE_KEY:Ljava/lang/String; = "type"


# instance fields
.field private environment:Lcom/urbanairship/analytics/Environment;

.field private eventId:Ljava/lang/String;

.field private sessionId:Ljava/lang/String;

.field private time:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 91
    new-instance v0, Lcom/urbanairship/analytics/DefaultEnvironment;

    invoke-direct {v0}, Lcom/urbanairship/analytics/DefaultEnvironment;-><init>()V

    invoke-direct {p0, v0}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 92
    return-void
.end method

.method public constructor <init>(Lcom/urbanairship/analytics/Environment;)V
    .locals 4
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/Event;->eventId:Ljava/lang/String;

    .line 82
    invoke-virtual {p1}, Lcom/urbanairship/analytics/Environment;->getTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/Event;->time:Ljava/lang/String;

    .line 83
    iput-object p1, p0, Lcom/urbanairship/analytics/Event;->environment:Lcom/urbanairship/analytics/Environment;

    .line 84
    invoke-virtual {p1}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/Event;->sessionId:Ljava/lang/String;

    .line 85
    return-void
.end method


# virtual methods
.method getContentValues()Landroid/content/ContentValues;
    .locals 5

    .prologue
    .line 95
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 97
    .local v2, "values":Landroid/content/ContentValues;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->jsonRepresentation()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 98
    .local v0, "jsonData":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 100
    .local v1, "size":I
    const-string v3, "type"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v3, "event_id"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getEventId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string v3, "data"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v3, "time"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getTime()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v3, "session_id"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getSessionId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v3, "event_size"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 107
    return-object v2
.end method

.method abstract getData()Lorg/json/JSONObject;
.end method

.method getEnvironment()Lcom/urbanairship/analytics/Environment;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/urbanairship/analytics/Event;->environment:Lcom/urbanairship/analytics/Environment;

    return-object v0
.end method

.method getEventId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/urbanairship/analytics/Event;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method getSessionId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/urbanairship/analytics/Event;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method getTime()Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/urbanairship/analytics/Event;->time:Ljava/lang/String;

    return-object v0
.end method

.method abstract getType()Ljava/lang/String;
.end method

.method jsonRepresentation()Lorg/json/JSONObject;
    .locals 5

    .prologue
    .line 130
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 131
    .local v2, "object":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 134
    .local v0, "data":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "type"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    const-string v3, "event_id"

    iget-object v4, p0, Lcom/urbanairship/analytics/Event;->eventId:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    const-string v3, "time"

    iget-object v4, p0, Lcom/urbanairship/analytics/Event;->time:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    const-string v3, "data"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :goto_0
    return-object v2

    .line 139
    :catch_0
    move-exception v1

    .line 140
    .local v1, "e":Lorg/json/JSONException;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error constructing JSON "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " representation"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 153
    :try_start_0
    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->jsonRepresentation()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 155
    :goto_0
    return-object v1

    .line 154
    :catch_0
    move-exception v0

    .line 155
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getType()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
