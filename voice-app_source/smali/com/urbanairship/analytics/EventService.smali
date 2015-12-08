.class public Lcom/urbanairship/analytics/EventService;
.super Landroid/app/IntentService;
.source "EventService.java"


# static fields
.field public static final ACTION_ADD:Ljava/lang/String; = "com.urbanairship.analytics.ADD"

.field public static final ACTION_SEND:Ljava/lang/String; = "com.urbanairship.analytics.SEND"

.field public static final EVENT_CONTENT_VALUES_EXTRA:Ljava/lang/String; = "com.urbanairship.analytics.CONTENT_VALUES_EXTRA"

.field public static final EVENT_TYPE_EXTRA:Ljava/lang/String; = "com.urbanairship.analytics.TYPE_EXTRA"

.field private static backoffMs:J


# instance fields
.field private dataManager:Lcom/urbanairship/analytics/EventDataManager;

.field private eventClient:Lcom/urbanairship/analytics/EventAPIClient;

.field private preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 72
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 79
    const-string v0, "EventService"

    invoke-direct {p0, v0}, Lcom/urbanairship/analytics/EventService;-><init>(Ljava/lang/String;)V

    .line 80
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "serviceName"    # Ljava/lang/String;

    .prologue
    .line 83
    new-instance v0, Lcom/urbanairship/analytics/EventAPIClient;

    invoke-direct {v0}, Lcom/urbanairship/analytics/EventAPIClient;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/urbanairship/analytics/EventService;-><init>(Ljava/lang/String;Lcom/urbanairship/analytics/EventAPIClient;)V

    .line 84
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/urbanairship/analytics/EventAPIClient;)V
    .locals 1
    .param p1, "serviceName"    # Ljava/lang/String;
    .param p2, "eventClient"    # Lcom/urbanairship/analytics/EventAPIClient;

    .prologue
    .line 87
    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 74
    new-instance v0, Lcom/urbanairship/analytics/EventAPIClient;

    invoke-direct {v0}, Lcom/urbanairship/analytics/EventAPIClient;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/analytics/EventService;->eventClient:Lcom/urbanairship/analytics/EventAPIClient;

    .line 88
    iput-object p2, p0, Lcom/urbanairship/analytics/EventService;->eventClient:Lcom/urbanairship/analytics/EventAPIClient;

    .line 89
    return-void
.end method

.method private addEventFromIntent(Landroid/content/Intent;)V
    .locals 20
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 145
    const-string v15, "com.urbanairship.analytics.TYPE_EXTRA"

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 146
    .local v4, "eventType":Ljava/lang/String;
    const-string v15, "com.urbanairship.analytics.CONTENT_VALUES_EXTRA"

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v14

    check-cast v14, Landroid/content/ContentValues;

    .line 148
    .local v14, "values":Landroid/content/ContentValues;
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v15}, Lcom/urbanairship/analytics/EventDataManager;->getDatabaseSize()I

    move-result v5

    .line 151
    .local v5, "size":I
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v15}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getMaxTotalDbSize()I

    move-result v15

    if-le v5, v15, :cond_3

    .line 154
    const-string v15, "activity_started"

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_0

    const-string v15, "activity_stopped"

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    .line 156
    :cond_0
    const-string v15, "Database full. Not logging activity start/stop events"

    invoke-static {v15}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 189
    :cond_1
    :goto_0
    return-void

    .line 160
    :cond_2
    const-string v15, "DB size exceeded. Deleting non-critical events."

    invoke-static {v15}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 161
    invoke-direct/range {p0 .. p0}, Lcom/urbanairship/analytics/EventService;->deleteActivityStartAndStopEvents()V

    .line 163
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v15}, Lcom/urbanairship/analytics/EventDataManager;->getDatabaseSize()I

    move-result v5

    .line 166
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v15}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getMaxTotalDbSize()I

    move-result v15

    if-le v5, v15, :cond_3

    .line 167
    invoke-direct/range {p0 .. p0}, Lcom/urbanairship/analytics/EventService;->deleteOldestSession()V

    .line 171
    :cond_3
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v15, v14}, Lcom/urbanairship/analytics/EventDataManager;->insertEvent(Landroid/content/ContentValues;)J

    move-result-wide v16

    const-wide/16 v18, 0x0

    cmp-long v15, v16, v18

    if-gtz v15, :cond_4

    .line 172
    const-string v15, "Unable to insert event into database."

    invoke-static {v15}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 176
    :cond_4
    const-string v15, "location_updated"

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1

    .line 177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 178
    .local v2, "currentTime":J
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v15}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getLastSendTime()J

    move-result-wide v6

    .line 179
    .local v6, "lastSendTime":J
    sub-long v10, v2, v6

    .line 180
    .local v10, "sendDelta":J
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v15

    invoke-virtual {v15}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v15

    iget-object v15, v15, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    iget-wide v0, v15, Lcom/urbanairship/LocationOptions;->backgroundReportingIntervalSeconds:J

    move-wide/from16 v16, v0

    const-wide/16 v18, 0x3e8

    mul-long v12, v16, v18

    .line 183
    .local v12, "throttleDelta":J
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v15

    invoke-virtual {v15}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v15

    invoke-virtual {v15}, Lcom/urbanairship/analytics/Analytics;->isAppInForeground()Z

    move-result v15

    if-nez v15, :cond_1

    cmp-long v15, v10, v12

    if-gez v15, :cond_1

    .line 184
    sub-long v8, v12, v10

    .line 185
    .local v8, "minimumWait":J
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "LocationEvent was inserted, but may not be updated until "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, " ms have passed"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method private deleteActivityStartAndStopEvents()V
    .locals 2

    .prologue
    .line 195
    const-string v0, "Deleting activity start and stop events"

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    const-string v1, "activity_started"

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->deleteEventType(Ljava/lang/String;)Z

    .line 197
    iget-object v0, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    const-string v1, "activity_stopped"

    invoke-virtual {v0, v1}, Lcom/urbanairship/analytics/EventDataManager;->deleteEventType(Ljava/lang/String;)Z

    .line 198
    return-void
.end method

.method private deleteOldestSession()V
    .locals 2

    .prologue
    .line 204
    const-string v1, "Deleting oldest session."

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 205
    iget-object v1, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v1}, Lcom/urbanairship/analytics/EventDataManager;->getOldestSessionId()Ljava/lang/String;

    move-result-object v0

    .line 206
    .local v0, "oldestSessionId":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 207
    iget-object v1, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v1, v0}, Lcom/urbanairship/analytics/EventDataManager;->deleteSession(Ljava/lang/String;)Z

    .line 209
    :cond_0
    return-void
.end method

.method private getNextSendTime()J
    .locals 4

    .prologue
    .line 264
    iget-object v0, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v0}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getLastSendTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getMinBatchInterval()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    sget-wide v2, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private parseIntegerFromResponseHeader(Lcom/urbanairship/restclient/Response;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5
    .param p1, "response"    # Lcom/urbanairship/restclient/Response;
    .param p2, "headerField"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 302
    invoke-virtual {p1, p2}, Lcom/urbanairship/restclient/Response;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 304
    .local v1, "header":Lorg/apache/http/Header;
    if-eqz v1, :cond_0

    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    .line 312
    :cond_0
    :goto_0
    return-object v2

    .line 309
    :cond_1
    :try_start_0
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 310
    :catch_0
    move-exception v0

    .line 311
    .local v0, "ex":Ljava/lang/Exception;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to parse String: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "as an int."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private scheduleEventUpload(J)V
    .locals 7
    .param p1, "nextSendTime"    # J

    .prologue
    .line 322
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 323
    .local v1, "ctx":Landroid/content/Context;
    const-string v4, "alarm"

    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 326
    .local v0, "alarmManager":Landroid/app/AlarmManager;
    new-instance v2, Landroid/content/Intent;

    const-class v4, Lcom/urbanairship/analytics/EventService;

    invoke-direct {v2, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 327
    .local v2, "i":Landroid/content/Intent;
    const-string v4, "com.urbanairship.analytics.SEND"

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    const/4 v4, 0x0

    const/high16 v5, 0x8000000

    invoke-static {v1, v4, v2, v5}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 331
    .local v3, "intent":Landroid/app/PendingIntent;
    const/4 v4, 0x1

    invoke-virtual {v0, v4, p1, p2, v3}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 332
    return-void
.end method

.method public static sendAddEventIntent(Lcom/urbanairship/analytics/Event;)V
    .locals 5
    .param p0, "event"    # Lcom/urbanairship/analytics/Event;

    .prologue
    .line 124
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 126
    .local v0, "ctx":Landroid/content/Context;
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.urbanairship.analytics.ADD"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 127
    .local v2, "i":Landroid/content/Intent;
    const-class v3, Lcom/urbanairship/analytics/EventService;

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 128
    const-string v3, "com.urbanairship.analytics.TYPE_EXTRA"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    const-string v3, "com.urbanairship.analytics.CONTENT_VALUES_EXTRA"

    invoke-virtual {p0}, Lcom/urbanairship/analytics/Event;->getContentValues()Landroid/content/ContentValues;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 132
    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :goto_0
    return-void

    .line 133
    :catch_0
    move-exception v1

    .line 134
    .local v1, "e":Ljava/lang/Exception;
    const-string v3, "Unable to start analytics service. Check that the event service is added to the manifest."

    invoke-static {v3, v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private updateAnalyticPreferences(Lcom/urbanairship/restclient/Response;)V
    .locals 6
    .param p1, "response"    # Lcom/urbanairship/restclient/Response;

    .prologue
    .line 272
    const-string v4, "X-UA-Max-Total"

    invoke-direct {p0, p1, v4}, Lcom/urbanairship/analytics/EventService;->parseIntegerFromResponseHeader(Lcom/urbanairship/restclient/Response;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    .line 273
    .local v1, "maxSize":Ljava/lang/Integer;
    const-string v4, "X-UA-Max-Batch"

    invoke-direct {p0, p1, v4}, Lcom/urbanairship/analytics/EventService;->parseIntegerFromResponseHeader(Lcom/urbanairship/restclient/Response;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 274
    .local v0, "maxBatchSize":Ljava/lang/Integer;
    const-string v4, "X-UA-Max-Wait"

    invoke-direct {p0, p1, v4}, Lcom/urbanairship/analytics/EventService;->parseIntegerFromResponseHeader(Lcom/urbanairship/restclient/Response;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 275
    .local v2, "maxWait":Ljava/lang/Integer;
    const-string v4, "X-UA-Min-Batch-Interval"

    invoke-direct {p0, p1, v4}, Lcom/urbanairship/analytics/EventService;->parseIntegerFromResponseHeader(Lcom/urbanairship/restclient/Response;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    .line 277
    .local v3, "minBatchInterval":Ljava/lang/Integer;
    if-eqz v1, :cond_0

    .line 278
    iget-object v4, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/urbanairship/analytics/AnalyticsPreferences;->setMaxTotalDbSize(I)V

    .line 281
    :cond_0
    if-eqz v0, :cond_1

    .line 282
    iget-object v4, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/urbanairship/analytics/AnalyticsPreferences;->setMaxBatchSize(I)V

    .line 285
    :cond_1
    if-eqz v2, :cond_2

    .line 286
    iget-object v4, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/urbanairship/analytics/AnalyticsPreferences;->setMaxWait(I)V

    .line 289
    :cond_2
    if-eqz v3, :cond_3

    .line 290
    iget-object v4, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/urbanairship/analytics/AnalyticsPreferences;->setMinBatchInterval(I)V

    .line 292
    :cond_3
    return-void
.end method

.method private uploadEvents()V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 215
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/urbanairship/analytics/AnalyticsPreferences;->setLastSendTime(J)V

    .line 217
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v5}, Lcom/urbanairship/analytics/EventDataManager;->getEventCount()I

    move-result v1

    .line 219
    .local v1, "eventCount":I
    if-gtz v1, :cond_1

    .line 220
    const-string v5, "No events to send. Ending analytics upload."

    invoke-static {v5}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 257
    :cond_0
    :goto_0
    return-void

    .line 224
    :cond_1
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-virtual {v5}, Lcom/urbanairship/analytics/EventDataManager;->getDatabaseSize()I

    move-result v5

    div-int v0, v5, v1

    .line 227
    .local v0, "avgSize":I
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    iget-object v6, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v6}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getMaxBatchSize()I

    move-result v6

    div-int/2addr v6, v0

    invoke-virtual {v5, v6}, Lcom/urbanairship/analytics/EventDataManager;->getEvents(I)Ljava/util/Map;

    move-result-object v2

    .line 229
    .local v2, "events":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->eventClient:Lcom/urbanairship/analytics/EventAPIClient;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/urbanairship/analytics/EventAPIClient;->sendEvents(Ljava/util/Collection;)Lcom/urbanairship/restclient/Response;

    move-result-object v4

    .line 231
    .local v4, "response":Lcom/urbanairship/restclient/Response;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Uploading events: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 234
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v5

    const/16 v6, 0xc8

    if-ne v5, v6, :cond_4

    const/4 v3, 0x1

    .line 236
    .local v3, "isSuccess":Z
    :goto_1
    if-eqz v3, :cond_5

    .line 237
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/urbanairship/analytics/EventDataManager;->deleteEvents(Ljava/util/Set;)Z

    .line 238
    sput-wide v8, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    .line 248
    :goto_2
    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v5

    sub-int v5, v1, v5

    if-lez v5, :cond_3

    .line 249
    :cond_2
    const-string v5, "Scheduling next event batch upload."

    invoke-static {v5}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 250
    invoke-direct {p0}, Lcom/urbanairship/analytics/EventService;->getNextSendTime()J

    move-result-wide v6

    invoke-direct {p0, v6, v7}, Lcom/urbanairship/analytics/EventService;->scheduleEventUpload(J)V

    .line 253
    :cond_3
    if-eqz v4, :cond_0

    .line 254
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Warp 9 response: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v4}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 255
    invoke-direct {p0, v4}, Lcom/urbanairship/analytics/EventService;->updateAnalyticPreferences(Lcom/urbanairship/restclient/Response;)V

    goto/16 :goto_0

    .line 234
    .end local v3    # "isSuccess":Z
    :cond_4
    const/4 v3, 0x0

    goto :goto_1

    .line 240
    .restart local v3    # "isSuccess":Z
    :cond_5
    sget-wide v6, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    cmp-long v5, v6, v8

    if-nez v5, :cond_6

    .line 241
    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v5}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getMinBatchInterval()I

    move-result v5

    int-to-long v6, v5

    sput-wide v6, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    goto :goto_2

    .line 243
    :cond_6
    sget-wide v6, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    const-wide/16 v8, 0x2

    mul-long/2addr v6, v8

    iget-object v5, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    invoke-virtual {v5}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getMaxWait()I

    move-result v5

    int-to-long v8, v5

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    sput-wide v6, Lcom/urbanairship/analytics/EventService;->backoffMs:J

    goto :goto_2
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .prologue
    .line 93
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 94
    invoke-virtual {p0}, Lcom/urbanairship/analytics/EventService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 96
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->getDataManager()Lcom/urbanairship/analytics/EventDataManager;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/EventService;->dataManager:Lcom/urbanairship/analytics/EventDataManager;

    .line 97
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/analytics/Analytics;->getPreferences()Lcom/urbanairship/analytics/AnalyticsPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/analytics/EventService;->preferences:Lcom/urbanairship/analytics/AnalyticsPreferences;

    .line 98
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 102
    if-nez p1, :cond_0

    .line 117
    :goto_0
    return-void

    .line 106
    :cond_0
    const-string v0, "com.urbanairship.analytics.ADD"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/EventService;->addEventFromIntent(Landroid/content/Intent;)V

    .line 112
    :cond_1
    invoke-direct {p0}, Lcom/urbanairship/analytics/EventService;->getNextSendTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 113
    invoke-direct {p0}, Lcom/urbanairship/analytics/EventService;->getNextSendTime()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/urbanairship/analytics/EventService;->scheduleEventUpload(J)V

    goto :goto_0

    .line 115
    :cond_2
    invoke-direct {p0}, Lcom/urbanairship/analytics/EventService;->uploadEvents()V

    goto :goto_0
.end method
