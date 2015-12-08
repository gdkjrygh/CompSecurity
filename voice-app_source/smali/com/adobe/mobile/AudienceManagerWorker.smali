.class final Lcom/adobe/mobile/AudienceManagerWorker;
.super Ljava/lang/Object;
.source "AudienceManagerWorker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;
    }
.end annotation


# static fields
.field private static final AUDIENCE_MANAGER_CUSTOMER_DATA_PREFIX:Ljava/lang/String; = "c_"

.field private static final AUDIENCE_MANAGER_DATA_PROVIDER_ID_KEY:Ljava/lang/String; = "d_dpid"

.field private static final AUDIENCE_MANAGER_DATA_PROVIDER_USER_ID_KEY:Ljava/lang/String; = "d_dpuuid"

.field private static final AUDIENCE_MANAGER_JSON_COOKIE_NAME_KEY:Ljava/lang/String; = "cn"

.field private static final AUDIENCE_MANAGER_JSON_COOKIE_VALUE_KEY:Ljava/lang/String; = "cv"

.field private static final AUDIENCE_MANAGER_JSON_DESTS_KEY:Ljava/lang/String; = "dests"

.field private static final AUDIENCE_MANAGER_JSON_STUFF_KEY:Ljava/lang/String; = "stuff"

.field private static final AUDIENCE_MANAGER_JSON_URL_KEY:Ljava/lang/String; = "c"

.field private static final AUDIENCE_MANAGER_JSON_USER_ID_KEY:Ljava/lang/String; = "uuid"

.field private static final AUDIENCE_MANAGER_SHARED_PREFS_PROFILE_KEY:Ljava/lang/String; = "AAMUserProfile"

.field private static final AUDIENCE_MANAGER_SHARED_PREFS_USER_ID_KEY:Ljava/lang/String; = "AAMUserId"

.field private static final AUDIENCE_MANAGER_URL_PREFIX:Ljava/lang/String; = "http://%s/event?"

.field private static final AUDIENCE_MANAGER_URL_SUFFIX:Ljava/lang/String; = "&d_ptfm=android&d_dst=1&d_rtbd=json"

.field private static final AUDIENCE_MANAGER_USER_ID_KEY:Ljava/lang/String; = "d_uuid"

.field private static volatile UrlPrefix_pred:Z

.field private static volatile VisitorProfile_pred:Z

.field private static _dpid:Ljava/lang/String;

.field private static _dpuuid:Ljava/lang/String;

.field private static _urlPrefix:Ljava/lang/String;

.field private static _visitorProfile:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 52
    sput-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;

    .line 53
    sput-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;

    .line 54
    sput-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;

    .line 59
    sput-boolean v1, Lcom/adobe/mobile/AudienceManagerWorker;->VisitorProfile_pred:Z

    .line 414
    sput-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_urlPrefix:Ljava/lang/String;

    .line 415
    sput-boolean v1, Lcom/adobe/mobile/AudienceManagerWorker;->UrlPrefix_pred:Z

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    return-void
.end method

.method private static BuildSchemaRequest(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 295
    .local p0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetUrlPrefix()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 296
    const/4 v1, 0x0

    .line 300
    :goto_0
    return-object v1

    .line 299
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetUrlPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lcom/adobe/mobile/AudienceManagerWorker;->GetCustomUrlVariables(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetDataProviderUrlVariables()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&d_ptfm=android&d_dst=1&d_rtbd=json"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 300
    .local v0, "urlString":Ljava/lang/String;
    const-string v1, "?&"

    const-string v2, "?"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method private static GetCustomUrlVariables(Ljava/util/Map;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 304
    .local p0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v4

    if-gtz v4, :cond_1

    .line 305
    :cond_0
    const-string v4, ""

    .line 328
    :goto_0
    return-object v4

    .line 308
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v4, 0x400

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 310
    .local v2, "urlVars":Ljava/lang/StringBuilder;
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 311
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 312
    .local v1, "key":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 315
    .local v3, "value":Ljava/lang/Object;
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 319
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ljava/lang/String;

    if-ne v5, v6, :cond_2

    .line 320
    const-string v5, "&"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "c_"

    .line 321
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 322
    invoke-static {v1}, Lcom/adobe/mobile/AudienceManagerWorker;->SanitizeUrlVariableName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/adobe/mobile/StaticMethods;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "="

    .line 323
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 324
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/adobe/mobile/StaticMethods;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 328
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v1    # "key":Ljava/lang/String;
    .end local v3    # "value":Ljava/lang/Object;
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0
.end method

.method private static GetDataProviderUrlVariables()Ljava/lang/String;
    .locals 3

    .prologue
    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .local v0, "urlVars":Ljava/lang/StringBuilder;
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/adobe/mobile/MobileConfig;->getVisitorIdServiceEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 342
    invoke-static {}, Lcom/adobe/mobile/VisitorIDService;->sharedInstance()Lcom/adobe/mobile/VisitorIDService;

    move-result-object v1

    invoke-virtual {v1}, Lcom/adobe/mobile/VisitorIDService;->getAAMParameterString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetUUID()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 347
    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "d_uuid"

    .line 348
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    .line 349
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 350
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetUUID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    :cond_1
    sget-object v1, Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    sget-object v1, Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 355
    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "d_dpid"

    .line 356
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    .line 357
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;

    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    .line 359
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "d_dpuuid"

    .line 360
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    .line 361
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;

    .line 362
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static GetDpid()Ljava/lang/String;
    .locals 6

    .prologue
    .line 117
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/AudienceManagerWorker$3;

    invoke-direct {v2}, Lcom/adobe/mobile/AudienceManagerWorker$3;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 124
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/String;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 127
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :goto_0
    return-object v2

    .line 128
    :catch_0
    move-exception v0

    .line 129
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Audience Manager - Unable to get Dpid (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static GetDpuuid()Ljava/lang/String;
    .locals 6

    .prologue
    .line 99
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/AudienceManagerWorker$2;

    invoke-direct {v2}, Lcom/adobe/mobile/AudienceManagerWorker$2;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 106
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/String;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 109
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :goto_0
    return-object v2

    .line 110
    :catch_0
    move-exception v0

    .line 111
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Audience Manager - Unable to get Dpid (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v2, 0x0

    goto :goto_0
.end method

.method private static GetUUID()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 385
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "AAMUserId"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 390
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    :goto_0
    return-object v1

    .line 386
    .end local v0    # "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    :catch_0
    move-exception v0

    .line 387
    .restart local v0    # "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v2, "Audience Manager - Error getting uuid from shared preferences (%s)."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private static GetUrlPrefix()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 417
    sget-boolean v0, Lcom/adobe/mobile/AudienceManagerWorker;->UrlPrefix_pred:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/adobe/mobile/MobileConfig;->mobileUsingAudienceManager()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    sput-boolean v3, Lcom/adobe/mobile/AudienceManagerWorker;->UrlPrefix_pred:Z

    .line 419
    const-string v0, "http://%s/event?"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/adobe/mobile/MobileConfig;->getAamServer()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_urlPrefix:Ljava/lang/String;

    .line 422
    :cond_0
    sget-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_urlPrefix:Ljava/lang/String;

    return-object v0
.end method

.method public static GetVisitorProfile()Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/AudienceManagerWorker$1;

    invoke-direct {v2}, Lcom/adobe/mobile/AudienceManagerWorker$1;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 88
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 91
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :goto_0
    return-object v2

    .line 92
    :catch_0
    move-exception v0

    .line 93
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Audience Manager - Unable to retrieve Visitor Profile"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static Reset()V
    .locals 2

    .prologue
    .line 279
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/AudienceManagerWorker$5;

    invoke-direct {v1}, Lcom/adobe/mobile/AudienceManagerWorker$5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 286
    return-void
.end method

.method private static SanitizeUrlVariableName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 333
    const-string v0, "."

    const-string v1, "_"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static SetDpidAndDpuuid(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "newDpid"    # Ljava/lang/String;
    .param p1, "newDpuuid"    # Ljava/lang/String;

    .prologue
    .line 135
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/AudienceManagerWorker$4;

    invoke-direct {v1, p0, p1}, Lcom/adobe/mobile/AudienceManagerWorker$4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 142
    return-void
.end method

.method private static SetUUID(Ljava/lang/String;)V
    .locals 6
    .param p0, "newUuid"    # Ljava/lang/String;

    .prologue
    .line 370
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 371
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    if-nez p0, :cond_0

    .line 372
    const-string v2, "AAMUserId"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 377
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 381
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :goto_1
    return-void

    .line 374
    .restart local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :cond_0
    const-string v2, "AAMUserId"

    invoke-interface {v1, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 378
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :catch_0
    move-exception v0

    .line 379
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v2, "Audience Manager - Error updating uuid in shared preferences (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method private static SetVisitorProfile(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p0, "profile":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v6, 0x0

    .line 395
    sput-boolean v6, Lcom/adobe/mobile/AudienceManagerWorker;->VisitorProfile_pred:Z

    .line 397
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 398
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    if-eqz p0, :cond_0

    .line 399
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 400
    .local v2, "profileJSON":Lorg/json/JSONObject;
    const-string v3, "AAMUserProfile"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 401
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    sput-object v3, Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;

    .line 407
    .end local v2    # "profileJSON":Lorg/json/JSONObject;
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 412
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :goto_1
    return-void

    .line 403
    .restart local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :cond_0
    const-string v3, "AAMUserProfile"

    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 404
    const/4 v3, 0x0

    sput-object v3, Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 409
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :catch_0
    move-exception v0

    .line 410
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v3, "Audience Manager - Error updating visitor profile (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public static SubmitSignal(Ljava/util/Map;Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 275
    .local p0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .local p1, "callback":Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;, "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;

    invoke-direct {v1, p0, p1}, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;-><init>(Ljava/util/Map;Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 276
    return-void
.end method

.method static synthetic access$000()Z
    .locals 1

    .prologue
    .line 23
    sget-boolean v0, Lcom/adobe/mobile/AudienceManagerWorker;->VisitorProfile_pred:Z

    return v0
.end method

.method static synthetic access$002(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 23
    sput-boolean p0, Lcom/adobe/mobile/AudienceManagerWorker;->VisitorProfile_pred:Z

    return p0
.end method

.method static synthetic access$100()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic access$102(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0
    .param p0, "x0"    # Ljava/util/HashMap;

    .prologue
    .line 23
    sput-object p0, Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 23
    sput-object p0, Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 23
    sput-object p0, Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Ljava/util/Map;

    .prologue
    .line 23
    invoke-static {p0}, Lcom/adobe/mobile/AudienceManagerWorker;->BuildSchemaRequest(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 23
    invoke-static {p0}, Lcom/adobe/mobile/AudienceManagerWorker;->SetUUID(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Ljava/util/Map;)V
    .locals 0
    .param p0, "x0"    # Ljava/util/Map;

    .prologue
    .line 23
    invoke-static {p0}, Lcom/adobe/mobile/AudienceManagerWorker;->SetVisitorProfile(Ljava/util/Map;)V

    return-void
.end method
