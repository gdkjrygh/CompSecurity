.class public final Lcom/adobe/mobile/DataListenerHandheld;
.super Ljava/lang/Object;
.source "DataListenerHandheld.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static handleRequest(Lcom/google/android/gms/wearable/DataMap;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/content/Context;)V
    .locals 8
    .param p0, "requestDataMap"    # Lcom/google/android/gms/wearable/DataMap;
    .param p1, "mGoogleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    const/4 v7, 0x0

    .line 39
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p0, :cond_1

    .line 40
    :cond_0
    const-string v4, "Wearable - GoogleApiClient or Context or DataMap is null"

    new-array v5, v7, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :goto_0
    return-void

    .line 44
    :cond_1
    invoke-static {p0}, Lcom/adobe/mobile/WearableDataRequest;->createRequestFromDataMap(Lcom/google/android/gms/wearable/DataMap;)Lcom/adobe/mobile/WearableDataRequest;

    move-result-object v2

    .line 45
    .local v2, "request":Lcom/adobe/mobile/WearableDataRequest;
    if-nez v2, :cond_2

    .line 46
    const-string v4, "Wearable - Invalid data request (%s)"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataMap;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 49
    :cond_2
    const-wide/16 v4, 0x3a98

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v4, v5, v6}, Lcom/google/android/gms/common/api/GoogleApiClient;->blockingConnect(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    .line 51
    .local v0, "connectionResult":Lcom/google/android/gms/common/ConnectionResult;
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->isSuccess()Z

    move-result v4

    if-nez v4, :cond_3

    .line 52
    const-string v4, "Wearable - Failed to setup connection"

    new-array v5, v7, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {v2, p2}, Lcom/adobe/mobile/WearableDataRequest;->handle(Landroid/content/Context;)Lcom/google/android/gms/wearable/DataMap;

    move-result-object v3

    .line 58
    .local v3, "result":Lcom/google/android/gms/wearable/DataMap;
    const-string v4, "/abdmobile/data/response"

    invoke-static {v4}, Lcom/google/android/gms/wearable/PutDataMapRequest;->create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;

    move-result-object v1

    .line 59
    .local v1, "dataMapRequest":Lcom/google/android/gms/wearable/PutDataMapRequest;
    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/wearable/DataMap;->putAll(Lcom/google/android/gms/wearable/DataMap;)V

    .line 61
    sget-object v4, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->asPutDataRequest()Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v5

    invoke-interface {v4, p1, v5}, Lcom/google/android/gms/wearable/DataApi;->putDataItem(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/PutDataRequest;)Lcom/google/android/gms/common/api/PendingResult;

    goto :goto_0
.end method

.method public static onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/content/Context;)V
    .locals 7
    .param p0, "dataEvents"    # Lcom/google/android/gms/wearable/DataEventBuffer;
    .param p1, "mGoogleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 65
    if-nez p0, :cond_1

    .line 86
    :cond_0
    return-void

    .line 68
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataEventBuffer;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/wearable/DataEvent;

    .line 69
    .local v1, "event":Lcom/google/android/gms/wearable/DataEvent;
    invoke-interface {v1}, Lcom/google/android/gms/wearable/DataEvent;->getType()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    .line 70
    invoke-interface {v1}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v2

    .line 71
    .local v2, "item":Lcom/google/android/gms/wearable/DataItem;
    if-eqz v2, :cond_2

    .line 74
    invoke-interface {v2}, Lcom/google/android/gms/wearable/DataItem;->getUri()Landroid/net/Uri;

    move-result-object v3

    .line 75
    .local v3, "uri":Landroid/net/Uri;
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 79
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/abdmobile/data/request"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 80
    invoke-static {v2}, Lcom/google/android/gms/wearable/DataMapItem;->fromDataItem(Lcom/google/android/gms/wearable/DataItem;)Lcom/google/android/gms/wearable/DataMapItem;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/wearable/DataMapItem;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    .line 81
    .local v0, "dataMap":Lcom/google/android/gms/wearable/DataMap;
    invoke-static {v0, p1, p2}, Lcom/adobe/mobile/DataListenerHandheld;->handleRequest(Lcom/google/android/gms/wearable/DataMap;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/content/Context;)V

    goto :goto_0
.end method
