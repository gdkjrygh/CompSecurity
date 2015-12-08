.class Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/AppEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SessionEventsState"
.end annotation


# static fields
.field public static final ENCODED_EVENTS_KEY:Ljava/lang/String; = "encoded_events"

.field public static final EVENT_COUNT_KEY:Ljava/lang/String; = "event_count"

.field public static final NUM_SKIPPED_KEY:Ljava/lang/String; = "num_skipped"


# instance fields
.field private final MAX_ACCUMULATED_LOG_EVENTS:I

.field private accumulatedEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation
.end field

.field private anonymousAppDeviceGUID:Ljava/lang/String;

.field private attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

.field private inFlightEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation
.end field

.field private numSkippedEventsDueToFullBuffer:I

.field private packageName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "identifiers"    # Lcom/facebook/internal/AttributionIdentifiers;
    .param p2, "packageName"    # Ljava/lang/String;
    .param p3, "anonymousGUID"    # Ljava/lang/String;

    .prologue
    .line 1162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    .line 1150
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    .line 1160
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->MAX_ACCUMULATED_LOG_EVENTS:I

    .line 1166
    iput-object p1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    .line 1167
    iput-object p2, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->packageName:Ljava/lang/String;

    .line 1168
    iput-object p3, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->anonymousAppDeviceGUID:Ljava/lang/String;

    .line 1169
    return-void
.end method

.method private getStringAsByteArray(Ljava/lang/String;)[B
    .locals 3
    .param p1, "jsonString"    # Ljava/lang/String;

    .prologue
    .line 1273
    const/4 v1, 0x0

    .line 1275
    .local v1, "jsonUtf8":[B
    :try_start_0
    const-string v2, "UTF-8"

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 1280
    :goto_0
    return-object v1

    .line 1276
    :catch_0
    move-exception v0

    .line 1278
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    const-string v2, "Encoding exception: "

    invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private populateRequest(Lcom/facebook/GraphRequest;ILorg/json/JSONArray;Z)V
    .locals 8
    .param p1, "request"    # Lcom/facebook/GraphRequest;
    .param p2, "numSkipped"    # I
    .param p3, "events"    # Lorg/json/JSONArray;
    .param p4, "limitEventUsage"    # Z

    .prologue
    .line 1239
    const/4 v2, 0x0

    .line 1242
    .local v2, "publishParams":Lorg/json/JSONObject;
    :try_start_0
    sget-object v4, Lcom/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType;->CUSTOM_APP_EVENTS:Lcom/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType;

    .line 1243
    iget-object v5, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    .line 1244
    iget-object v6, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->anonymousAppDeviceGUID:Ljava/lang/String;

    .line 1246
    # getter for: Lcom/facebook/appevents/AppEventsLogger;->applicationContext:Landroid/content/Context;
    invoke-static {}, Lcom/facebook/appevents/AppEventsLogger;->access$0()Landroid/content/Context;

    move-result-object v7

    .line 1241
    invoke-static {v4, v5, v6, p4, v7}, Lcom/facebook/internal/AppEventsLoggerUtility;->getJSONObjectForGraphAPICall(Lcom/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v2

    .line 1248
    iget v4, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I

    if-lez v4, :cond_0

    .line 1249
    const-string v4, "num_skipped_events"

    invoke-virtual {v2, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1255
    :cond_0
    :goto_0
    invoke-virtual {p1, v2}, Lcom/facebook/GraphRequest;->setGraphObject(Lorg/json/JSONObject;)V

    .line 1257
    invoke-virtual {p1}, Lcom/facebook/GraphRequest;->getParameters()Landroid/os/Bundle;

    move-result-object v3

    .line 1258
    .local v3, "requestParameters":Landroid/os/Bundle;
    if-nez v3, :cond_1

    .line 1259
    new-instance v3, Landroid/os/Bundle;

    .end local v3    # "requestParameters":Landroid/os/Bundle;
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1262
    .restart local v3    # "requestParameters":Landroid/os/Bundle;
    :cond_1
    invoke-virtual {p3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1263
    .local v1, "jsonString":Ljava/lang/String;
    if-eqz v1, :cond_2

    .line 1265
    const-string v4, "custom_events_file"

    .line 1266
    invoke-direct {p0, v1}, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->getStringAsByteArray(Ljava/lang/String;)[B

    move-result-object v5

    .line 1264
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 1267
    invoke-virtual {p1, v1}, Lcom/facebook/GraphRequest;->setTag(Ljava/lang/Object;)V

    .line 1269
    :cond_2
    invoke-virtual {p1, v3}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 1270
    return-void

    .line 1251
    .end local v1    # "jsonString":Ljava/lang/String;
    .end local v3    # "requestParameters":Landroid/os/Bundle;
    :catch_0
    move-exception v0

    .line 1253
    .local v0, "e":Lorg/json/JSONException;
    new-instance v2, Lorg/json/JSONObject;

    .end local v2    # "publishParams":Lorg/json/JSONObject;
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .restart local v2    # "publishParams":Lorg/json/JSONObject;
    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized accumulatePersistedEvents(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1234
    .local p1, "events":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;"
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1235
    monitor-exit p0

    return-void

    .line 1234
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized addEvent(Lcom/facebook/appevents/AppEventsLogger$AppEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/facebook/appevents/AppEventsLogger$AppEvent;

    .prologue
    .line 1174
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x3e8

    if-lt v0, v1, :cond_0

    .line 1175
    iget v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1179
    :goto_0
    monitor-exit p0

    return-void

    .line 1177
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1174
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized clearInFlightAndStats(Z)V
    .locals 2
    .param p1, "moveToAccumulated"    # Z

    .prologue
    .line 1186
    monitor-enter p0

    if-eqz p1, :cond_0

    .line 1187
    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1189
    :cond_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1190
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1191
    monitor-exit p0

    return-void

    .line 1186
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getAccumulatedEventCount()I
    .locals 1

    .prologue
    .line 1182
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getEventsToPersist()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1225
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    .line 1226
    .local v0, "result":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1227
    monitor-exit p0

    return-object v0

    .line 1225
    .end local v0    # "result":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;"
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public populateRequest(Lcom/facebook/GraphRequest;ZZ)I
    .locals 5
    .param p1, "request"    # Lcom/facebook/GraphRequest;
    .param p2, "includeImplicitEvents"    # Z
    .param p3, "limitEventUsage"    # Z

    .prologue
    .line 1198
    monitor-enter p0

    .line 1199
    :try_start_0
    iget v2, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I

    .line 1202
    .local v2, "numSkipped":I
    iget-object v3, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    iget-object v4, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1203
    iget-object v3, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 1205
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 1206
    .local v1, "jsonArray":Lorg/json/JSONArray;
    iget-object v3, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 1212
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-nez v3, :cond_3

    .line 1213
    monitor-exit p0

    const/4 v3, 0x0

    .line 1218
    :goto_1
    return v3

    .line 1206
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appevents/AppEventsLogger$AppEvent;

    .line 1207
    .local v0, "event":Lcom/facebook/appevents/AppEventsLogger$AppEvent;
    if-nez p2, :cond_2

    invoke-virtual {v0}, Lcom/facebook/appevents/AppEventsLogger$AppEvent;->getIsImplicit()Z

    move-result v4

    if-nez v4, :cond_0

    .line 1208
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/appevents/AppEventsLogger$AppEvent;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 1198
    .end local v0    # "event":Lcom/facebook/appevents/AppEventsLogger$AppEvent;
    .end local v1    # "jsonArray":Lorg/json/JSONArray;
    .end local v2    # "numSkipped":I
    :catchall_0
    move-exception v3

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .restart local v1    # "jsonArray":Lorg/json/JSONArray;
    .restart local v2    # "numSkipped":I
    :cond_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1217
    invoke-direct {p0, p1, v2, v1, p3}, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->populateRequest(Lcom/facebook/GraphRequest;ILorg/json/JSONArray;Z)V

    .line 1218
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    goto :goto_1
.end method
