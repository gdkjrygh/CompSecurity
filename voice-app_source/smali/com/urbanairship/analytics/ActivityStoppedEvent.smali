.class Lcom/urbanairship/analytics/ActivityStoppedEvent;
.super Lcom/urbanairship/analytics/Event;
.source "ActivityStoppedEvent.java"


# static fields
.field static final TYPE:Ljava/lang/String; = "activity_stopped"


# instance fields
.field private className:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/urbanairship/analytics/Event;-><init>()V

    .line 59
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/ActivityStoppedEvent;->className:Ljava/lang/String;

    .line 64
    :goto_0
    return-void

    .line 62
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/ActivityStoppedEvent;->className:Ljava/lang/String;

    goto :goto_0
.end method

.method constructor <init>(Lcom/urbanairship/analytics/Environment;Ljava/lang/String;)V
    .locals 0
    .param p1, "env"    # Lcom/urbanairship/analytics/Environment;
    .param p2, "className"    # Ljava/lang/String;

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/Event;-><init>(Lcom/urbanairship/analytics/Environment;)V

    .line 49
    iput-object p2, p0, Lcom/urbanairship/analytics/ActivityStoppedEvent;->className:Ljava/lang/String;

    .line 50
    return-void
.end method


# virtual methods
.method getData()Lorg/json/JSONObject;
    .locals 5

    .prologue
    .line 74
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 75
    .local v0, "data":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/urbanairship/analytics/ActivityStoppedEvent;->getEnvironment()Lcom/urbanairship/analytics/Environment;

    move-result-object v1

    .line 78
    .local v1, "env":Lcom/urbanairship/analytics/Environment;
    :try_start_0
    const-string v3, "class_name"

    iget-object v4, p0, Lcom/urbanairship/analytics/ActivityStoppedEvent;->className:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v3, "session_id"

    invoke-virtual {v1}, Lcom/urbanairship/analytics/Environment;->getSessionId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :goto_0
    return-object v0

    .line 82
    :catch_0
    move-exception v2

    .line 83
    .local v2, "exception":Lorg/json/JSONException;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error constructing JSON data for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/urbanairship/analytics/ActivityStoppedEvent;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    const-string v0, "activity_stopped"

    return-object v0
.end method
