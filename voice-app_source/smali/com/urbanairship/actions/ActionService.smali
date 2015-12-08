.class public Lcom/urbanairship/actions/ActionService;
.super Landroid/app/Service;
.source "ActionService.java"


# static fields
.field public static final ACTIONS_PAYLOAD_EXTRA:Ljava/lang/String; = "com.urbanairship.actionservice.ACTIONS_PAYLOAD_EXTRA"

.field public static final RUN_ACTIONS_ACTION:Ljava/lang/String; = "com.urbanairship.actionservice.RUN_ACTIONS_ACTION"

.field public static final SITUATION_EXTRA:Ljava/lang/String; = "com.urbanairship.actionservice.SITUATION_EXTRA"


# instance fields
.field private lastStartId:I

.field private runner:Lcom/urbanairship/actions/ActionRunner;

.field private runningActions:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 88
    invoke-static {}, Lcom/urbanairship/actions/ActionRunner;->shared()Lcom/urbanairship/actions/ActionRunner;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/urbanairship/actions/ActionService;-><init>(Lcom/urbanairship/actions/ActionRunner;)V

    .line 89
    return-void
.end method

.method constructor <init>(Lcom/urbanairship/actions/ActionRunner;)V
    .locals 1
    .param p1, "runner"    # Lcom/urbanairship/actions/ActionRunner;

    .prologue
    const/4 v0, 0x0

    .line 80
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 69
    iput v0, p0, Lcom/urbanairship/actions/ActionService;->lastStartId:I

    .line 72
    iput v0, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    .line 81
    iput-object p1, p0, Lcom/urbanairship/actions/ActionService;->runner:Lcom/urbanairship/actions/ActionRunner;

    .line 82
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/actions/ActionService;)I
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/actions/ActionService;

    .prologue
    .line 50
    iget v0, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    return v0
.end method

.method static synthetic access$010(Lcom/urbanairship/actions/ActionService;)I
    .locals 2
    .param p0, "x0"    # Lcom/urbanairship/actions/ActionService;

    .prologue
    .line 50
    iget v0, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    return v0
.end method

.method static synthetic access$100(Lcom/urbanairship/actions/ActionService;)I
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/actions/ActionService;

    .prologue
    .line 50
    iget v0, p0, Lcom/urbanairship/actions/ActionService;->lastStartId:I

    return v0
.end method

.method private runActions(Ljava/lang/String;Lcom/urbanairship/actions/Situation;)V
    .locals 8
    .param p1, "actionsPayload"    # Ljava/lang/String;
    .param p2, "situation"    # Lcom/urbanairship/actions/Situation;

    .prologue
    .line 138
    if-nez p2, :cond_1

    .line 139
    const-string v6, "Unable to run actions with a null situation"

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 179
    :cond_0
    :goto_0
    return-void

    .line 143
    :cond_1
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 144
    const-string v6, "No actions to run."

    invoke-static {v6}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    .line 150
    :cond_2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .local v1, "actionsJSON":Lorg/json/JSONObject;
    invoke-static {v1}, Lcom/urbanairship/util/JSONUtils;->convertToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    .line 159
    .local v2, "actionsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 160
    .local v0, "actionName":Ljava/lang/String;
    new-instance v3, Lcom/urbanairship/actions/ActionArguments;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v3, p2, v6}, Lcom/urbanairship/actions/ActionArguments;-><init>(Lcom/urbanairship/actions/Situation;Ljava/lang/Object;)V

    .line 162
    .local v3, "arguments":Lcom/urbanairship/actions/ActionArguments;
    iget v6, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    .line 168
    iget-object v6, p0, Lcom/urbanairship/actions/ActionService;->runner:Lcom/urbanairship/actions/ActionRunner;

    new-instance v7, Lcom/urbanairship/actions/ActionService$1;

    invoke-direct {v7, p0}, Lcom/urbanairship/actions/ActionService$1;-><init>(Lcom/urbanairship/actions/ActionService;)V

    invoke-virtual {v6, v0, v3, v7}, Lcom/urbanairship/actions/ActionRunner;->runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V

    goto :goto_1

    .line 151
    .end local v0    # "actionName":Ljava/lang/String;
    .end local v1    # "actionsJSON":Lorg/json/JSONObject;
    .end local v2    # "actionsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v3    # "arguments":Lcom/urbanairship/actions/ActionArguments;
    .end local v5    # "i$":Ljava/util/Iterator;
    :catch_0
    move-exception v4

    .line 152
    .local v4, "e":Lorg/json/JSONException;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid actions payload: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static runActionsForPushBundle(Landroid/os/Bundle;Lcom/urbanairship/actions/Situation;)V
    .locals 4
    .param p0, "extras"    # Landroid/os/Bundle;
    .param p1, "situation"    # Lcom/urbanairship/actions/Situation;

    .prologue
    .line 121
    const-string v3, "com.urbanairship.actions"

    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 123
    .local v0, "actions":Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 124
    const-string v3, "No actions to run in payload."

    invoke-static {v3}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 135
    :goto_0
    return-void

    .line 128
    :cond_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 130
    .local v1, "context":Landroid/content/Context;
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.urbanairship.actionservice.RUN_ACTIONS_ACTION"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 131
    .local v2, "i":Landroid/content/Intent;
    const-class v3, Lcom/urbanairship/actions/ActionService;

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 132
    const-string v3, "com.urbanairship.actionservice.ACTIONS_PAYLOAD_EXTRA"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    const-string v3, "com.urbanairship.actionservice.SITUATION_EXTRA"

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 134
    invoke-virtual {v1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 112
    const/4 v0, 0x0

    return-object v0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .prologue
    .line 93
    invoke-virtual {p0}, Lcom/urbanairship/actions/ActionService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    invoke-static {v2}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 95
    iput p3, p0, Lcom/urbanairship/actions/ActionService;->lastStartId:I

    .line 97
    if-eqz p1, :cond_0

    const-string v2, "com.urbanairship.actionservice.RUN_ACTIONS_ACTION"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 98
    const-string v2, "com.urbanairship.actionservice.ACTIONS_PAYLOAD_EXTRA"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 99
    .local v0, "actions":Ljava/lang/String;
    const-string v2, "com.urbanairship.actionservice.SITUATION_EXTRA"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/urbanairship/actions/Situation;

    .line 100
    .local v1, "situation":Lcom/urbanairship/actions/Situation;
    invoke-direct {p0, v0, v1}, Lcom/urbanairship/actions/ActionService;->runActions(Ljava/lang/String;Lcom/urbanairship/actions/Situation;)V

    .line 103
    .end local v0    # "actions":Ljava/lang/String;
    .end local v1    # "situation":Lcom/urbanairship/actions/Situation;
    :cond_0
    iget v2, p0, Lcom/urbanairship/actions/ActionService;->runningActions:I

    if-nez v2, :cond_1

    .line 104
    invoke-virtual {p0, p3}, Lcom/urbanairship/actions/ActionService;->stopSelf(I)V

    .line 107
    :cond_1
    const/4 v2, 0x2

    return v2
.end method
