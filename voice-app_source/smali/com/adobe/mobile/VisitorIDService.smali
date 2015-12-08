.class final Lcom/adobe/mobile/VisitorIDService;
.super Ljava/lang/Object;
.source "VisitorIDService.java"


# static fields
.field static final ANALYTICS_PARAMETER_KEY_BLOB:Ljava/lang/String; = "aamb"

.field static final ANALYTICS_PARAMETER_KEY_HINT:Ljava/lang/String; = "aamh"

.field static final ANALYTICS_PARAMETER_KEY_MID:Ljava/lang/String; = "mid"

.field static final ANALYTICS_PARAMETER_KEY_ORG:Ljava/lang/String; = "mcorgid"

.field static final CID_DELIMITER:Ljava/lang/String; = "%01"

.field static final RESPONSE_KEY_BLOB:Ljava/lang/String; = "d_blob"

.field static final RESPONSE_KEY_ERROR:Ljava/lang/String; = "error_msg"

.field static final RESPONSE_KEY_HINT:Ljava/lang/String; = "dcs_region"

.field static final RESPONSE_KEY_MID:Ljava/lang/String; = "d_mid"

.field static final RESPONSE_KEY_TTL:Ljava/lang/String; = "id_sync_ttl"

.field static final SERVER:Ljava/lang/String; = "dpm.demdex.net"

.field static final TARGET_PARAMETER_KEY_AID:Ljava/lang/String; = "mboxMCAVID"

.field static final TARGET_PARAMETER_KEY_BLOB:Ljava/lang/String; = "mboxAAMB"

.field static final TARGET_PARAMETER_KEY_HINT:Ljava/lang/String; = "mboxMCGLH"

.field static final TARGET_PARAMETER_KEY_MID:Ljava/lang/String; = "mboxMCGVID"

.field static final TIMEOUT:I = 0x7d0

.field private static _instance:Lcom/adobe/mobile/VisitorIDService;

.field private static final _instanceMutex:Ljava/lang/Object;


# instance fields
.field private _blob:Ljava/lang/String;

.field private _lastSync:J

.field private _locationHint:Ljava/lang/String;

.field private _marketingCloudID:Ljava/lang/String;

.field private _ttl:J

.field private final _visitorIDExector:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    sput-object v0, Lcom/adobe/mobile/VisitorIDService;->_instance:Lcom/adobe/mobile/VisitorIDService;

    .line 65
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/VisitorIDService;->_instanceMutex:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    .line 81
    invoke-virtual {p0}, Lcom/adobe/mobile/VisitorIDService;->resetVariablesFromSharedPreferences()V

    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/adobe/mobile/VisitorIDService;->idSync(Ljava/util/Map;)V

    .line 84
    return-void
.end method

.method private _generateMID()Ljava/lang/String;
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    .line 429
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    .line 431
    .local v4, "uuid":Ljava/util/UUID;
    invoke-virtual {v4}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    .line 432
    .local v2, "most":J
    invoke-virtual {v4}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    .line 435
    .local v0, "least":J
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "%019d%019d"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    cmp-long v9, v2, v10

    if-gez v9, :cond_0

    neg-long v2, v2

    .end local v2    # "most":J
    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    cmp-long v9, v0, v10

    if-gez v9, :cond_1

    neg-long v0, v0

    .end local v0    # "least":J
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    return-object v5
.end method

.method static synthetic access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 32
    iput-object p1, p0, Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 32
    iput-object p1, p0, Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 32
    iput-object p1, p0, Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/adobe/mobile/VisitorIDService;)J
    .locals 2
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 32
    iget-wide v0, p0, Lcom/adobe/mobile/VisitorIDService;->_ttl:J

    return-wide v0
.end method

.method static synthetic access$302(Lcom/adobe/mobile/VisitorIDService;J)J
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;
    .param p1, "x1"    # J

    .prologue
    .line 32
    iput-wide p1, p0, Lcom/adobe/mobile/VisitorIDService;->_ttl:J

    return-wide p1
.end method

.method static synthetic access$400(Lcom/adobe/mobile/VisitorIDService;)J
    .locals 2
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 32
    iget-wide v0, p0, Lcom/adobe/mobile/VisitorIDService;->_lastSync:J

    return-wide v0
.end method

.method static synthetic access$402(Lcom/adobe/mobile/VisitorIDService;J)J
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;
    .param p1, "x1"    # J

    .prologue
    .line 32
    iput-wide p1, p0, Lcom/adobe/mobile/VisitorIDService;->_lastSync:J

    return-wide p1
.end method

.method static synthetic access$500(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/adobe/mobile/VisitorIDService;->_generateMID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sharedInstance()Lcom/adobe/mobile/VisitorIDService;
    .locals 2

    .prologue
    .line 67
    sget-object v1, Lcom/adobe/mobile/VisitorIDService;->_instanceMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 68
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/VisitorIDService;->_instance:Lcom/adobe/mobile/VisitorIDService;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lcom/adobe/mobile/VisitorIDService;

    invoke-direct {v0}, Lcom/adobe/mobile/VisitorIDService;-><init>()V

    sput-object v0, Lcom/adobe/mobile/VisitorIDService;->_instance:Lcom/adobe/mobile/VisitorIDService;

    .line 72
    :cond_0
    sget-object v0, Lcom/adobe/mobile/VisitorIDService;->_instance:Lcom/adobe/mobile/VisitorIDService;

    monitor-exit v1

    return-object v0

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final getAAMParameterString()Ljava/lang/String;
    .locals 7

    .prologue
    .line 334
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .local v2, "returnValue":Ljava/lang/StringBuilder;
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v3, Lcom/adobe/mobile/VisitorIDService$6;

    invoke-direct {v3, p0, v2}, Lcom/adobe/mobile/VisitorIDService$6;-><init>(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/StringBuilder;)V

    invoke-direct {v1, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 365
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/Void;>;"
    iget-object v3, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    invoke-interface {v3, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 368
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 369
    :catch_0
    move-exception v0

    .line 370
    .local v0, "ex":Ljava/lang/Exception;
    const-string v3, "ID Service - Unable to retrieve audience manager parameters from queue(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected final getAnalyticsIDRequestParameterString()Ljava/lang/String;
    .locals 7

    .prologue
    .line 266
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .local v2, "returnValue":Ljava/lang/StringBuilder;
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v3, Lcom/adobe/mobile/VisitorIDService$4;

    invoke-direct {v3, p0, v2}, Lcom/adobe/mobile/VisitorIDService$4;-><init>(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/StringBuilder;)V

    invoke-direct {v1, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 287
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/Void;>;"
    iget-object v3, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    invoke-interface {v3, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 290
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 295
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 291
    :catch_0
    move-exception v0

    .line 292
    .local v0, "ex":Ljava/lang/Exception;
    const-string v3, "ID Service - Unable to retrieve analytics id parameters from queue(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected final getAnalyticsParameters()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 299
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 300
    .local v2, "returnValue":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v3, Lcom/adobe/mobile/VisitorIDService$5;

    invoke-direct {v3, p0, v2}, Lcom/adobe/mobile/VisitorIDService$5;-><init>(Lcom/adobe/mobile/VisitorIDService;Ljava/util/Map;)V

    invoke-direct {v1, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 322
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/Void;>;"
    iget-object v3, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    invoke-interface {v3, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 325
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    :goto_0
    return-object v2

    .line 326
    :catch_0
    move-exception v0

    .line 327
    .local v0, "ex":Ljava/lang/Exception;
    const-string v3, "ID Service - Unable to retrieve analytics parameters from queue(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected final getMarketingCloudID()Ljava/lang/String;
    .locals 6

    .prologue
    .line 248
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/VisitorIDService$3;

    invoke-direct {v2, p0}, Lcom/adobe/mobile/VisitorIDService$3;-><init>(Lcom/adobe/mobile/VisitorIDService;)V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 255
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/String;>;"
    iget-object v2, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 258
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    :goto_0
    return-object v2

    .line 259
    :catch_0
    move-exception v0

    .line 260
    .local v0, "ex":Ljava/lang/Exception;
    const-string v2, "ID Service - Unable to retrieve marketing cloud id from queue(%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const/4 v2, 0x0

    goto :goto_0
.end method

.method protected final getTargetParameterString()Ljava/lang/String;
    .locals 7

    .prologue
    .line 377
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .local v2, "returnValue":Ljava/lang/StringBuilder;
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v3, Lcom/adobe/mobile/VisitorIDService$7;

    invoke-direct {v3, p0, v2}, Lcom/adobe/mobile/VisitorIDService$7;-><init>(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/StringBuilder;)V

    invoke-direct {v1, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 416
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/Void;>;"
    iget-object v3, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    invoke-interface {v3, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 419
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 424
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 420
    :catch_0
    move-exception v0

    .line 421
    .local v0, "ex":Ljava/lang/Exception;
    const-string v3, "ID Service - Unable to retrieve target parameters from queue(%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected idSync(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 108
    .local p1, "identifiers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 110
    .local v0, "identifiersCopy":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :goto_0
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/adobe/mobile/VisitorIDService$2;

    invoke-direct {v2, p0, v0}, Lcom/adobe/mobile/VisitorIDService$2;-><init>(Lcom/adobe/mobile/VisitorIDService;Ljava/util/HashMap;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 225
    return-void

    .line 108
    .end local v0    # "identifiersCopy":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final parseResponse([B)Lorg/json/JSONObject;
    .locals 7
    .param p1, "response"    # [B

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 228
    if-nez p1, :cond_0

    move-object v1, v2

    .line 243
    :goto_0
    return-object v1

    .line 235
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    new-instance v3, Ljava/lang/String;

    const-string v4, "UTF-8"

    invoke-direct {v3, p1, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .local v1, "responseObject":Lorg/json/JSONObject;
    goto :goto_0

    .line 236
    .end local v1    # "responseObject":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 237
    .local v0, "ex":Ljava/io/UnsupportedEncodingException;
    const-string v3, "ID Service - Unable to decode response(%s)"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v1, v2

    .line 238
    goto :goto_0

    .line 239
    .end local v0    # "ex":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v0

    .line 240
    .local v0, "ex":Lorg/json/JSONException;
    const-string v3, "ID Service - Unable to parse response(%s)"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v1, v2

    .line 241
    goto :goto_0
.end method

.method protected resetVariablesFromSharedPreferences()V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/adobe/mobile/VisitorIDService;->_visitorIDExector:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/adobe/mobile/VisitorIDService$1;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/VisitorIDService$1;-><init>(Lcom/adobe/mobile/VisitorIDService;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 105
    return-void
.end method
