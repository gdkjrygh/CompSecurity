.class final Lcom/adobe/mobile/TargetWorker;
.super Ljava/lang/Object;
.source "TargetWorker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/TargetWorker$SendRequestTask;
    }
.end annotation


# static fields
.field protected static final COOKIE_EXPIRES_KEY_SUFFIX:Ljava/lang/String; = "_Expires"

.field protected static final COOKIE_NAME_PCID:Ljava/lang/String; = "mboxPC"

.field protected static final COOKIE_NAME_SESSION:Ljava/lang/String; = "mboxSession"

.field protected static final COOKIE_VALUE_KEY_SUFFIX:Ljava/lang/String; = "_Value"

.field protected static final LOCATION_CONTENT_TYPE:Ljava/lang/String; = "text%2Fplain%3Bcharset%3Dutf-8"

.field protected static final LOCATION_SERVER_PREFIX:Ljava/lang/String; = "http://"

.field protected static final LOCATION_SERVER_SUFFIX:Ljava/lang/String; = ".tt.omtrdc.net"

.field protected static final LOCATION_SESSION_STRING:Ljava/lang/String; = "&mboxSession=%s&mboxPC=%s&mboxXDomain=disabled"

.field private static final OFFER_ENCODING:Ljava/lang/String; = "UTF-8"

.field private static final TARGET_SOCKET_TIMEOUT:I = 0x2

.field private static final TO_MILLI:I = 0x3e8

.field private static final _cookieMutex:Ljava/lang/Object;

.field private static _cookies:Ljava/lang/String;

.field private static final _parameterMutex:Ljava/lang/Object;

.field private static _pcId:Ljava/lang/String;

.field private static final _pcIdMutex:Ljava/lang/Object;

.field private static _persistentParameters:Ljava/util/HashMap;
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

.field private static _serverURL:Ljava/lang/String;

.field private static final _serverURLMutex:Ljava/lang/Object;

.field private static _sessionId:Ljava/lang/String;

.field private static final _sessionIdMutex:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_sessionIdMutex:Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_pcIdMutex:Ljava/lang/Object;

    .line 69
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_cookieMutex:Ljava/lang/Object;

    .line 72
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_parameterMutex:Ljava/lang/Object;

    .line 286
    const/4 v0, 0x0

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_serverURL:Ljava/lang/String;

    .line 287
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_serverURLMutex:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    return-void
.end method

.method static synthetic access$100(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Ljava/lang/String;
    .param p1, "x1"    # Ljava/util/Map;

    .prologue
    .line 44
    invoke-static {p0, p1}, Lcom/adobe/mobile/TargetWorker;->getURLRequestString(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_cookieMutex:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lorg/apache/http/client/CookieStore;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/http/client/CookieStore;

    .prologue
    .line 44
    invoke-static {p0}, Lcom/adobe/mobile/TargetWorker;->saveCookies(Lorg/apache/http/client/CookieStore;)V

    return-void
.end method

.method protected static addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 416
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 427
    :cond_0
    :goto_0
    return-void

    .line 420
    :cond_1
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_parameterMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 421
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_persistentParameters:Ljava/util/HashMap;

    if-nez v0, :cond_2

    .line 422
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_persistentParameters:Ljava/util/HashMap;

    .line 425
    :cond_2
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_persistentParameters:Ljava/util/HashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected static clearCookies()V
    .locals 2

    .prologue
    .line 199
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_cookieMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 200
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;

    .line 201
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    const-string v0, "mboxSession"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->deleteCookie(Ljava/lang/String;)V

    .line 203
    const-string v0, "mboxPC"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->deleteCookie(Ljava/lang/String;)V

    .line 204
    return-void

    .line 201
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static deleteCookie(Ljava/lang/String;)V
    .locals 6
    .param p0, "cookieName"    # Ljava/lang/String;

    .prologue
    .line 324
    const-string v2, "mboxSession"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 325
    sget-object v3, Lcom/adobe/mobile/TargetWorker;->_sessionIdMutex:Ljava/lang/Object;

    monitor-enter v3

    .line 326
    const/4 v2, 0x0

    :try_start_0
    sput-object v2, Lcom/adobe/mobile/TargetWorker;->_sessionId:Ljava/lang/String;

    .line 327
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    :cond_0
    :goto_0
    :try_start_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 337
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_Value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 338
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_Expires"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 339
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_1 .. :try_end_1} :catch_0

    .line 343
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :goto_1
    return-void

    .line 327
    :catchall_0
    move-exception v2

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 329
    :cond_1
    const-string v2, "mboxPC"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 330
    sget-object v3, Lcom/adobe/mobile/TargetWorker;->_pcIdMutex:Ljava/lang/Object;

    monitor-enter v3

    .line 331
    const/4 v2, 0x0

    :try_start_3
    sput-object v2, Lcom/adobe/mobile/TargetWorker;->_pcId:Ljava/lang/String;

    .line 332
    monitor-exit v3

    goto :goto_0

    :catchall_1
    move-exception v2

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v2

    .line 340
    :catch_0
    move-exception v0

    .line 341
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v2, "Target - Error persisting cookies (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method private static getParamsString(Ljava/util/Map;)Ljava/lang/String;
    .locals 6
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
    .line 299
    .local p0, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v4

    if-nez v4, :cond_1

    .line 300
    :cond_0
    const-string v4, ""

    .line 320
    :goto_0
    return-object v4

    .line 303
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .local v2, "paramStringBuilder":Ljava/lang/StringBuilder;
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

    .line 306
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 307
    .local v1, "key":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 310
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

    .line 314
    const-string v5, "&"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    invoke-static {v1}, Lcom/adobe/mobile/StaticMethods;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    const-string v5, "="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/adobe/mobile/StaticMethods;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 320
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v1    # "key":Ljava/lang/String;
    .end local v3    # "value":Ljava/lang/Object;
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0
.end method

.method protected static getPcID()Ljava/lang/String;
    .locals 2

    .prologue
    .line 207
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_pcIdMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 208
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_pcId:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 209
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static getServerURL(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "client"    # Ljava/lang/String;

    .prologue
    .line 289
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_serverURLMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 290
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_serverURL:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 291
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/adobe/mobile/MobileConfig;->getSSL()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "https://"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".tt.omtrdc.net"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_serverURL:Ljava/lang/String;

    .line 294
    :cond_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_serverURL:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 291
    :cond_1
    const-string v0, "http://"

    goto :goto_0

    .line 295
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected static getSessionID()Ljava/lang/String;
    .locals 2

    .prologue
    .line 213
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_sessionIdMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 214
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_sessionId:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 215
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static getSessionString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 273
    sget-object v3, Lcom/adobe/mobile/TargetWorker;->_pcIdMutex:Ljava/lang/Object;

    monitor-enter v3

    .line 274
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_pcId:Ljava/lang/String;

    .line 275
    .local v0, "p":Ljava/lang/String;
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    sget-object v3, Lcom/adobe/mobile/TargetWorker;->_sessionIdMutex:Ljava/lang/Object;

    monitor-enter v3

    .line 277
    :try_start_1
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_sessionId:Ljava/lang/String;

    .line 278
    .local v1, "s":Ljava/lang/String;
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 280
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 281
    const-string v2, "&mboxSession=%s&mboxPC=%s&mboxXDomain=disabled"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 283
    :goto_0
    return-object v2

    .line 275
    .end local v1    # "s":Ljava/lang/String;
    :catchall_0
    move-exception v2

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 278
    :catchall_1
    move-exception v2

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v2

    .line 283
    .restart local v1    # "s":Ljava/lang/String;
    :cond_0
    const-string v2, ""

    goto :goto_0
.end method

.method private static getURLRequestString(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 12
    .param p0, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .local p1, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 223
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_0

    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/adobe/mobile/MobileConfig;->mobileUsingTarget()Z

    move-result v7

    if-nez v7, :cond_1

    .line 224
    :cond_0
    const/4 v6, 0x0

    .line 267
    :goto_0
    return-object v6

    .line 228
    :cond_1
    sget-object v8, Lcom/adobe/mobile/TargetWorker;->_parameterMutex:Ljava/lang/Object;

    monitor-enter v8

    .line 229
    :try_start_0
    sget-object v7, Lcom/adobe/mobile/TargetWorker;->_persistentParameters:Ljava/util/HashMap;

    invoke-static {v7}, Lcom/adobe/mobile/TargetWorker;->getParamsString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    .line 230
    .local v5, "persistentParametersString":Ljava/lang/String;
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    new-instance v3, Ljava/util/concurrent/FutureTask;

    new-instance v7, Lcom/adobe/mobile/TargetWorker$1;

    invoke-direct {v7}, Lcom/adobe/mobile/TargetWorker$1;-><init>()V

    invoke-direct {v3, v7}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 239
    .local v3, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    invoke-interface {v7, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 241
    const/4 v4, 0x0

    .line 243
    .local v4, "lifecycleData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    :try_start_1
    invoke-virtual {v3}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v7

    move-object v0, v7

    check-cast v0, Ljava/util/HashMap;

    move-object v4, v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 249
    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v8

    invoke-virtual {v8}, Lcom/adobe/mobile/MobileConfig;->getClientCode()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/adobe/mobile/TargetWorker;->getServerURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "/m2/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 251
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v8

    invoke-virtual {v8}, Lcom/adobe/mobile/MobileConfig;->getClientCode()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "/ubox/raw?mboxContentType="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "text%2Fplain%3Bcharset%3Dutf-8"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "&t="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 255
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 256
    invoke-static {}, Lcom/adobe/mobile/TargetWorker;->getSessionString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "&mboxDefault=none&mbox="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 259
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/adobe/mobile/MobileConfig;->getVisitorIdServiceEnabled()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {}, Lcom/adobe/mobile/VisitorIDService;->sharedInstance()Lcom/adobe/mobile/VisitorIDService;

    move-result-object v7

    invoke-virtual {v7}, Lcom/adobe/mobile/VisitorIDService;->getTargetParameterString()Ljava/lang/String;

    move-result-object v7

    :goto_2
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 260
    invoke-static {p1}, Lcom/adobe/mobile/TargetWorker;->getParamsString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 261
    invoke-static {v4}, Lcom/adobe/mobile/TargetWorker;->getParamsString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 265
    .local v6, "url":Ljava/lang/String;
    const-string v7, "Target - LocationRequest (%s) loading URL: %s"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    aput-object p0, v8, v10

    aput-object v6, v8, v11

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 230
    .end local v3    # "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .end local v4    # "lifecycleData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v5    # "persistentParametersString":Ljava/lang/String;
    .end local v6    # "url":Ljava/lang/String;
    :catchall_0
    move-exception v7

    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v7

    .line 244
    .restart local v3    # "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .restart local v4    # "lifecycleData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .restart local v5    # "persistentParametersString":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 245
    .local v2, "e":Ljava/lang/Exception;
    const-string v7, "Target - Unable to get lifecycle data (%s)"

    new-array v8, v11, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v10

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 259
    .end local v2    # "e":Ljava/lang/Exception;
    :cond_2
    const-string v7, ""

    goto :goto_2
.end method

.method private static loadCookie(Ljava/lang/String;)V
    .locals 12
    .param p0, "cookieName"    # Ljava/lang/String;

    .prologue
    const-wide/16 v10, 0x0

    .line 355
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "_Expires"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v8, 0x0

    invoke-interface {v5, v6, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 357
    .local v0, "cookieExpires":J
    cmp-long v5, v0, v10

    if-lez v5, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v5, v0, v6

    if-lez v5, :cond_1

    .line 358
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "_Value"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 360
    .local v2, "cookieValue":Ljava/lang/String;
    sget-object v6, Lcom/adobe/mobile/TargetWorker;->_cookieMutex:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    .line 361
    :try_start_1
    sget-object v5, Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 362
    new-instance v4, Ljava/lang/StringBuilder;

    sget-object v5, Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .local v4, "sb":Ljava/lang/StringBuilder;
    const-string v5, "; "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    :goto_0
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;

    .line 373
    monitor-exit v6

    .line 381
    .end local v0    # "cookieExpires":J
    .end local v2    # "cookieValue":Ljava/lang/String;
    .end local v4    # "sb":Ljava/lang/StringBuilder;
    :goto_1
    return-void

    .line 366
    .restart local v0    # "cookieExpires":J
    .restart local v2    # "cookieValue":Ljava/lang/String;
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .restart local v4    # "sb":Ljava/lang/StringBuilder;
    goto :goto_0

    .line 373
    .end local v4    # "sb":Ljava/lang/StringBuilder;
    :catchall_0
    move-exception v5

    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v5
    :try_end_2
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_2 .. :try_end_2} :catch_0

    .line 378
    .end local v0    # "cookieExpires":J
    .end local v2    # "cookieValue":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 379
    .local v3, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v5, "Target - Error loading cookie data (%s)"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v3}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 376
    .end local v3    # "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    .restart local v0    # "cookieExpires":J
    :cond_1
    :try_start_3
    invoke-static {p0}, Lcom/adobe/mobile/TargetWorker;->deleteCookie(Ljava/lang/String;)V
    :try_end_3
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1
.end method

.method protected static loadCookies()V
    .locals 2

    .prologue
    .line 346
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_cookieMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 347
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lcom/adobe/mobile/TargetWorker;->_cookies:Ljava/lang/String;

    .line 348
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    const-string v0, "mboxPC"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->loadCookie(Ljava/lang/String;)V

    .line 350
    const-string v0, "mboxSession"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->loadCookie(Ljava/lang/String;)V

    .line 351
    return-void

    .line 348
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected static loadRequest(Lcom/adobe/mobile/TargetLocationRequest;Lcom/adobe/mobile/Target$TargetCallback;)V
    .locals 4
    .param p0, "request"    # Lcom/adobe/mobile/TargetLocationRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adobe/mobile/TargetLocationRequest;",
            "Lcom/adobe/mobile/Target$TargetCallback",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "callback":Lcom/adobe/mobile/Target$TargetCallback;, "Lcom/adobe/mobile/Target$TargetCallback<Ljava/lang/String;>;"
    const/4 v3, 0x0

    .line 82
    if-nez p0, :cond_1

    .line 83
    const-string v1, "Target - LocationRequest parameter is null"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    if-eqz p1, :cond_0

    .line 85
    invoke-interface {p1, v3}, Lcom/adobe/mobile/Target$TargetCallback;->call(Ljava/lang/Object;)V

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 90
    :cond_1
    new-instance v0, Lcom/adobe/mobile/TargetWorker$SendRequestTask;

    invoke-direct {v0, p0, p1, v3}, Lcom/adobe/mobile/TargetWorker$SendRequestTask;-><init>(Lcom/adobe/mobile/TargetLocationRequest;Lcom/adobe/mobile/Target$TargetCallback;Lcom/adobe/mobile/TargetWorker$1;)V

    .line 91
    .local v0, "backgroundTask":Lcom/adobe/mobile/TargetWorker$SendRequestTask;
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method protected static removePersistentParameter(Ljava/lang/String;)V
    .locals 2
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 430
    if-nez p0, :cond_0

    .line 439
    :goto_0
    return-void

    .line 434
    :cond_0
    sget-object v1, Lcom/adobe/mobile/TargetWorker;->_parameterMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 435
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_persistentParameters:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 436
    sget-object v0, Lcom/adobe/mobile/TargetWorker;->_persistentParameters:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static saveCookies(Lorg/apache/http/client/CookieStore;)V
    .locals 6
    .param p0, "cookieStore"    # Lorg/apache/http/client/CookieStore;

    .prologue
    .line 384
    invoke-interface {p0}, Lorg/apache/http/client/CookieStore;->getCookies()Ljava/util/List;

    move-result-object v2

    .line 385
    .local v2, "cookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/cookie/Cookie;

    .line 386
    .local v0, "c":Lorg/apache/http/cookie/Cookie;
    invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getName()Ljava/lang/String;

    move-result-object v1

    .line 387
    .local v1, "cookieName":Ljava/lang/String;
    const-string v4, "mboxSession"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 388
    sget-object v4, Lcom/adobe/mobile/TargetWorker;->_sessionIdMutex:Ljava/lang/Object;

    monitor-enter v4

    .line 389
    :try_start_0
    invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getValue()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/adobe/mobile/TargetWorker;->_sessionId:Ljava/lang/String;

    .line 390
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    invoke-static {v1, v0}, Lcom/adobe/mobile/TargetWorker;->storeCookie(Ljava/lang/String;Lorg/apache/http/cookie/Cookie;)V

    goto :goto_0

    .line 390
    :catchall_0
    move-exception v3

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v3

    .line 393
    :cond_1
    const-string v4, "mboxPC"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 394
    sget-object v4, Lcom/adobe/mobile/TargetWorker;->_pcIdMutex:Ljava/lang/Object;

    monitor-enter v4

    .line 395
    :try_start_2
    invoke-interface {v0}, Lorg/apache/http/cookie/Cookie;->getValue()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/adobe/mobile/TargetWorker;->_pcId:Ljava/lang/String;

    .line 396
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 397
    invoke-static {v1, v0}, Lcom/adobe/mobile/TargetWorker;->storeCookie(Ljava/lang/String;Lorg/apache/http/cookie/Cookie;)V

    goto :goto_0

    .line 396
    :catchall_1
    move-exception v3

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v3

    .line 400
    .end local v0    # "c":Lorg/apache/http/cookie/Cookie;
    .end local v1    # "cookieName":Ljava/lang/String;
    :cond_2
    return-void
.end method

.method private static storeCookie(Ljava/lang/String;Lorg/apache/http/cookie/Cookie;)V
    .locals 6
    .param p0, "cookieName"    # Ljava/lang/String;
    .param p1, "cookie"    # Lorg/apache/http/cookie/Cookie;

    .prologue
    .line 404
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 405
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_Value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lorg/apache/http/cookie/Cookie;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 406
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_Expires"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lorg/apache/http/cookie/Cookie;->getExpiryDate()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 407
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :goto_0
    return-void

    .line 408
    :catch_0
    move-exception v0

    .line 409
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v2, "Target - Error persisting cookie (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
