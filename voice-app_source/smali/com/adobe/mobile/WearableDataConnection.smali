.class final Lcom/adobe/mobile/WearableDataConnection;
.super Ljava/lang/Object;
.source "WearableDataConnection.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.implements Lcom/google/android/gms/wearable/DataApi$DataListener;


# instance fields
.field protected mDataMap:Lcom/google/android/gms/wearable/DataMap;

.field private final mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private mInTimeCountDownLatch:Ljava/util/concurrent/CountDownLatch;

.field protected requestID:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    .line 48
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/wearable/Wearable;->API:Lcom/google/android/gms/common/api/Api;

    .line 49
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 51
    return-void
.end method

.method private connect(I)Z
    .locals 3
    .param p1, "timeOut"    # I

    .prologue
    const/4 v0, 0x0

    .line 94
    iget-object v1, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 95
    invoke-direct {p0, p1}, Lcom/adobe/mobile/WearableDataConnection;->waitForConnect(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 96
    const-string v1, "Wearable - Timeout setup connection"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :goto_0
    return v0

    .line 99
    :cond_0
    invoke-direct {p0}, Lcom/adobe/mobile/WearableDataConnection;->hasNodes()Z

    move-result v1

    if-nez v1, :cond_1

    .line 100
    const-string v1, "Wearable - No connected Node found"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 104
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private hasNodes()Z
    .locals 3

    .prologue
    .line 145
    sget-object v1, Lcom/google/android/gms/wearable/Wearable;->NodeApi:Lcom/google/android/gms/wearable/NodeApi;

    iget-object v2, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1, v2}, Lcom/google/android/gms/wearable/NodeApi;->getConnectedNodes(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/api/PendingResult;->await()Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;

    .line 146
    .local v0, "nodes":Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;->getNodes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;->getNodes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private waitForConnect(I)Z
    .locals 5
    .param p1, "timeOut"    # I

    .prologue
    .line 137
    iget-object v1, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 138
    const/4 v1, 0x1

    .line 141
    :goto_0
    return v1

    .line 140
    :cond_0
    iget-object v1, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    int-to-long v2, p1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiClient;->blockingConnect(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    .line 141
    .local v0, "connectionResult":Lcom/google/android/gms/common/ConnectionResult;
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->isSuccess()Z

    move-result v1

    goto :goto_0
.end method


# virtual methods
.method protected getResponse()Lcom/adobe/mobile/WearableDataResponse;
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/adobe/mobile/WearableDataConnection;->mDataMap:Lcom/google/android/gms/wearable/DataMap;

    if-nez v0, :cond_0

    .line 151
    const/4 v0, 0x0

    .line 153
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/adobe/mobile/WearableDataConnection;->mDataMap:Lcom/google/android/gms/wearable/DataMap;

    iget-object v1, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-static {v0, v1}, Lcom/adobe/mobile/WearableDataResponse;->createResponseFromDataMap(Lcom/google/android/gms/wearable/DataMap;Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/adobe/mobile/WearableDataResponse;

    move-result-object v0

    goto :goto_0
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    .line 159
    return-void
.end method

.method public onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    .locals 7
    .param p1, "dataEvents"    # Lcom/google/android/gms/wearable/DataEventBuffer;

    .prologue
    .line 110
    invoke-virtual {p1}, Lcom/google/android/gms/wearable/DataEventBuffer;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/DataEvent;

    .line 111
    .local v0, "event":Lcom/google/android/gms/wearable/DataEvent;
    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataEvent;->getType()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    .line 134
    .end local v0    # "event":Lcom/google/android/gms/wearable/DataEvent;
    :cond_1
    :goto_0
    return-void

    .line 114
    .restart local v0    # "event":Lcom/google/android/gms/wearable/DataEvent;
    :cond_2
    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v1

    .line 116
    .local v1, "item":Lcom/google/android/gms/wearable/DataItem;
    if-eqz v1, :cond_0

    .line 119
    invoke-interface {v1}, Lcom/google/android/gms/wearable/DataItem;->getUri()Landroid/net/Uri;

    move-result-object v3

    .line 120
    .local v3, "uri":Landroid/net/Uri;
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/abdmobile/data/response"

    invoke-virtual {v5, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_0

    .line 124
    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/wearable/DataMapItem;->fromDataItem(Lcom/google/android/gms/wearable/DataItem;)Lcom/google/android/gms/wearable/DataMapItem;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/wearable/DataMapItem;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v2

    .line 125
    .local v2, "returnedDataMap":Lcom/google/android/gms/wearable/DataMap;
    if-eqz v2, :cond_0

    .line 128
    const-string v5, "ID"

    invoke-virtual {v2, v5}, Lcom/google/android/gms/wearable/DataMap;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "ID"

    invoke-virtual {v2, v5}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->requestID:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 129
    iput-object v2, p0, Lcom/adobe/mobile/WearableDataConnection;->mDataMap:Lcom/google/android/gms/wearable/DataMap;

    .line 130
    iget-object v4, p0, Lcom/adobe/mobile/WearableDataConnection;->mInTimeCountDownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0
.end method

.method protected send(Lcom/adobe/mobile/WearableDataRequest;)Lcom/adobe/mobile/WearableDataResponse;
    .locals 9
    .param p1, "wearableDataRequest"    # Lcom/adobe/mobile/WearableDataRequest;

    .prologue
    const/4 v4, 0x0

    .line 54
    invoke-virtual {p1}, Lcom/adobe/mobile/WearableDataRequest;->getTimeOut()I

    move-result v5

    invoke-direct {p0, v5}, Lcom/adobe/mobile/WearableDataConnection;->connect(I)Z

    move-result v5

    if-nez v5, :cond_0

    .line 89
    :goto_0
    return-object v4

    .line 58
    :cond_0
    sget-object v5, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5, v6, p0}, Lcom/google/android/gms/wearable/DataApi;->addListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 60
    invoke-virtual {p1}, Lcom/adobe/mobile/WearableDataRequest;->getUUID()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/adobe/mobile/WearableDataConnection;->requestID:Ljava/lang/String;

    .line 62
    const-string v5, "/abdmobile/data/request"

    invoke-static {v5}, Lcom/google/android/gms/wearable/PutDataMapRequest;->create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;

    move-result-object v1

    .line 63
    .local v1, "dataMapRequest":Lcom/google/android/gms/wearable/PutDataMapRequest;
    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v0

    .line 65
    .local v0, "dataMap":Lcom/google/android/gms/wearable/DataMap;
    invoke-virtual {p1}, Lcom/adobe/mobile/WearableDataRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/google/android/gms/wearable/DataMap;->putAll(Lcom/google/android/gms/wearable/DataMap;)V

    .line 66
    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->asPutDataRequest()Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v3

    .line 69
    .local v3, "putDataRequest":Lcom/google/android/gms/wearable/PutDataRequest;
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v5, p0, Lcom/adobe/mobile/WearableDataConnection;->mInTimeCountDownLatch:Ljava/util/concurrent/CountDownLatch;

    .line 70
    sget-object v5, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5, v6, v3}, Lcom/google/android/gms/wearable/DataApi;->putDataItem(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/PutDataRequest;)Lcom/google/android/gms/common/api/PendingResult;

    .line 76
    :try_start_0
    iget-object v5, p0, Lcom/adobe/mobile/WearableDataConnection;->mInTimeCountDownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Lcom/adobe/mobile/WearableDataRequest;->getTimeOut()I

    move-result v6

    int-to-long v6, v6

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v6, v7, v8}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 77
    const-string v5, "Wearable - Failed to get data from handheld app"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    sget-object v5, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5, v6, p0}, Lcom/google/android/gms/wearable/DataApi;->removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 87
    iget-object v5, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    goto :goto_0

    .line 80
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/adobe/mobile/WearableDataConnection;->getResponse()Lcom/adobe/mobile/WearableDataResponse;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 86
    .local v4, "response":Lcom/adobe/mobile/WearableDataResponse;
    sget-object v5, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5, v6, p0}, Lcom/google/android/gms/wearable/DataApi;->removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 87
    iget-object v5, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    goto :goto_0

    .line 82
    .end local v4    # "response":Lcom/adobe/mobile/WearableDataResponse;
    :catch_0
    move-exception v2

    .line 83
    .local v2, "e":Ljava/lang/InterruptedException;
    :try_start_2
    const-string v5, "Wearable - Failed to get data from handheld app"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    const/4 v4, 0x0

    .line 86
    .restart local v4    # "response":Lcom/adobe/mobile/WearableDataResponse;
    sget-object v5, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5, v6, p0}, Lcom/google/android/gms/wearable/DataApi;->removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 87
    iget-object v5, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v5}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    goto :goto_0

    .line 86
    .end local v2    # "e":Ljava/lang/InterruptedException;
    .end local v4    # "response":Lcom/adobe/mobile/WearableDataResponse;
    :catchall_0
    move-exception v5

    sget-object v6, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v7, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v6, v7, p0}, Lcom/google/android/gms/wearable/DataApi;->removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 87
    iget-object v6, p0, Lcom/adobe/mobile/WearableDataConnection;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v6}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    throw v5
.end method
