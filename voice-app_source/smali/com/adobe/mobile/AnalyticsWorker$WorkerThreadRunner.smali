.class Lcom/adobe/mobile/AnalyticsWorker$WorkerThreadRunner;
.super Ljava/lang/Object;
.source "AnalyticsWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/AnalyticsWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "WorkerThreadRunner"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/adobe/mobile/AnalyticsWorker$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/adobe/mobile/AnalyticsWorker$1;

    .prologue
    .line 248
    invoke-direct {p0}, Lcom/adobe/mobile/AnalyticsWorker$WorkerThreadRunner;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 26

    .prologue
    .line 251
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->sharedInstance()Lcom/adobe/mobile/AnalyticsWorker;

    move-result-object v18

    .line 254
    .local v18, "worker":Lcom/adobe/mobile/AnalyticsWorker;
    const/16 v19, 0xa

    invoke-static/range {v19 .. v19}, Landroid/os/Process;->setThreadPriority(I)V

    .line 257
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 259
    .local v10, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v19, "Accept-Language"

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getDefaultAcceptLanguage()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    const-string v19, "User-Agent"

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getDefaultUserAgent()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    :cond_0
    :goto_0
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/adobe/mobile/MobileConfig;->getPrivacyStatus()Lcom/adobe/mobile/MobilePrivacyStatus;

    move-result-object v19

    sget-object v20, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    if-ne v0, v1, :cond_1

    # getter for: Lcom/adobe/mobile/AnalyticsWorker;->networkAvailable:Z
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->access$000()Z

    move-result v19

    if-eqz v19, :cond_1

    .line 265
    # invokes: Lcom/adobe/mobile/AnalyticsWorker;->getFirstHitInQueue()Lcom/adobe/mobile/AnalyticsWorker$Hit;
    invoke-static/range {v18 .. v18}, Lcom/adobe/mobile/AnalyticsWorker;->access$100(Lcom/adobe/mobile/AnalyticsWorker;)Lcom/adobe/mobile/AnalyticsWorker$Hit;

    move-result-object v11

    .line 267
    .local v11, "hit":Lcom/adobe/mobile/AnalyticsWorker$Hit;
    if-nez v11, :cond_2

    .line 365
    .end local v11    # "hit":Lcom/adobe/mobile/AnalyticsWorker$Hit;
    :cond_1
    :goto_1
    const/16 v19, 0x0

    # setter for: Lcom/adobe/mobile/AnalyticsWorker;->bgThreadActive:Z
    invoke-static/range {v19 .. v19}, Lcom/adobe/mobile/AnalyticsWorker;->access$602(Z)Z

    .line 366
    return-void

    .line 272
    .restart local v11    # "hit":Lcom/adobe/mobile/AnalyticsWorker$Hit;
    :cond_2
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/adobe/mobile/MobileConfig;->getOfflineTrackingEnabled()Z

    move-result v19

    if-eqz v19, :cond_5

    .line 274
    iget-wide v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->timestamp:J

    move-wide/from16 v20, v0

    # getter for: Lcom/adobe/mobile/AnalyticsWorker;->lastHitTimestamp:J
    invoke-static/range {v18 .. v18}, Lcom/adobe/mobile/AnalyticsWorker;->access$200(Lcom/adobe/mobile/AnalyticsWorker;)J

    move-result-wide v22

    sub-long v6, v20, v22

    .line 277
    .local v6, "delta":J
    const-wide/16 v20, 0x0

    cmp-long v19, v6, v20

    if-gez v19, :cond_3

    .line 279
    # getter for: Lcom/adobe/mobile/AnalyticsWorker;->lastHitTimestamp:J
    invoke-static/range {v18 .. v18}, Lcom/adobe/mobile/AnalyticsWorker;->access$200(Lcom/adobe/mobile/AnalyticsWorker;)J

    move-result-wide v20

    const-wide/16 v22, 0x1

    add-long v14, v20, v22

    .line 280
    .local v14, "newTimestamp":J
    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "&ts="

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    iget-wide v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->timestamp:J

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 281
    .local v16, "oldTSString":Ljava/lang/String;
    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "&ts="

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 283
    .local v13, "newTSString":Ljava/lang/String;
    iget-object v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->urlFragment:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v13}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    iput-object v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->urlFragment:Ljava/lang/String;

    .line 285
    const-string v19, "Analytics - Adjusting out of order hit timestamp(%d->%d)"

    const/16 v20, 0x2

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    iget-wide v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->timestamp:J

    move-wide/from16 v22, v0

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    aput-object v22, v20, v21

    const/16 v21, 0x1

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    aput-object v22, v20, v21

    invoke-static/range {v19 .. v20}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iput-wide v14, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->timestamp:J

    .line 310
    .end local v6    # "delta":J
    .end local v13    # "newTSString":Ljava/lang/String;
    .end local v14    # "newTimestamp":J
    .end local v16    # "oldTSString":Ljava/lang/String;
    :cond_3
    iget-object v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->urlFragment:Ljava/lang/String;

    move-object/from16 v17, v0

    .line 312
    .local v17, "postBody":Ljava/lang/String;
    const-string v19, "ndh"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v19

    if-nez v19, :cond_4

    .line 313
    const/16 v19, 0x3f

    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v19

    add-int/lit8 v19, v19, 0x1

    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v17

    .line 316
    :cond_4
    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    # invokes: Lcom/adobe/mobile/AnalyticsWorker;->getBaseURL()Ljava/lang/String;
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->access$400()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    # getter for: Lcom/adobe/mobile/AnalyticsWorker;->randomGen:Ljava/security/SecureRandom;
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->access$500()Ljava/security/SecureRandom;

    move-result-object v20

    const v21, 0x5f5e100

    invoke-virtual/range {v20 .. v21}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x1388

    move-object/from16 v0, v19

    move-object/from16 v1, v17

    move/from16 v2, v20

    invoke-static {v0, v1, v10, v2}, Lcom/adobe/mobile/RequestHandler;->sendAnalyticsRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Z

    move-result v19

    if-eqz v19, :cond_6

    .line 320
    :try_start_0
    iget-object v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->identifier:Ljava/lang/String;

    move-object/from16 v19, v0

    # invokes: Lcom/adobe/mobile/AnalyticsWorker;->deleteHit(Ljava/lang/String;)V
    invoke-static/range {v18 .. v19}, Lcom/adobe/mobile/AnalyticsWorker;->access$300(Lcom/adobe/mobile/AnalyticsWorker;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException; {:try_start_0 .. :try_end_0} :catch_1

    .line 326
    iget-wide v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->timestamp:J

    move-wide/from16 v20, v0

    move-object/from16 v0, v18

    move-wide/from16 v1, v20

    # setter for: Lcom/adobe/mobile/AnalyticsWorker;->lastHitTimestamp:J
    invoke-static {v0, v1, v2}, Lcom/adobe/mobile/AnalyticsWorker;->access$202(Lcom/adobe/mobile/AnalyticsWorker;J)J

    goto/16 :goto_0

    .line 291
    .end local v17    # "postBody":Ljava/lang/String;
    :cond_5
    iget-wide v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->timestamp:J

    move-wide/from16 v20, v0

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v22

    const-wide/16 v24, 0x3c

    sub-long v22, v22, v24

    cmp-long v19, v20, v22

    if-gez v19, :cond_3

    .line 297
    :try_start_1
    iget-object v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->identifier:Ljava/lang/String;

    move-object/from16 v19, v0

    # invokes: Lcom/adobe/mobile/AnalyticsWorker;->deleteHit(Ljava/lang/String;)V
    invoke-static/range {v18 .. v19}, Lcom/adobe/mobile/AnalyticsWorker;->access$300(Lcom/adobe/mobile/AnalyticsWorker;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 298
    :catch_0
    move-exception v9

    .line 299
    .local v9, "ex":Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->sharedInstance()Lcom/adobe/mobile/AnalyticsWorker;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lcom/adobe/mobile/AnalyticsWorker;->resetDatabase(Ljava/lang/Exception;)V

    goto/16 :goto_1

    .line 321
    .end local v9    # "ex":Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    .restart local v17    # "postBody":Ljava/lang/String;
    :catch_1
    move-exception v9

    .line 322
    .restart local v9    # "ex":Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->sharedInstance()Lcom/adobe/mobile/AnalyticsWorker;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lcom/adobe/mobile/AnalyticsWorker;->resetDatabase(Ljava/lang/Exception;)V

    goto/16 :goto_1

    .line 332
    .end local v9    # "ex":Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    :cond_6
    const-string v19, "Analytics - Unable to send hit"

    const/16 v20, 0x0

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    invoke-static/range {v19 .. v20}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/adobe/mobile/MobileConfig;->getOfflineTrackingEnabled()Z

    move-result v19

    if-eqz v19, :cond_7

    .line 337
    const-wide/16 v4, 0x1e

    .line 338
    .local v4, "delay":J
    const-string v19, "Analytics - Network error, imposing internal cooldown(%d seconds)"

    const/16 v20, 0x1

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    aput-object v22, v20, v21

    invoke-static/range {v19 .. v20}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v12, 0x0

    .local v12, "i":I
    :goto_2
    int-to-long v0, v12

    move-wide/from16 v20, v0

    cmp-long v19, v20, v4

    if-gez v19, :cond_0

    :try_start_2
    # getter for: Lcom/adobe/mobile/AnalyticsWorker;->networkAvailable:Z
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->access$000()Z

    move-result v19

    if-eqz v19, :cond_0

    .line 356
    const-wide/16 v20, 0x3e8

    invoke-static/range {v20 .. v21}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 355
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 343
    .end local v4    # "delay":J
    .end local v12    # "i":I
    :cond_7
    :try_start_3
    iget-object v0, v11, Lcom/adobe/mobile/AnalyticsWorker$Hit;->identifier:Ljava/lang/String;

    move-object/from16 v19, v0

    # invokes: Lcom/adobe/mobile/AnalyticsWorker;->deleteHit(Ljava/lang/String;)V
    invoke-static/range {v18 .. v19}, Lcom/adobe/mobile/AnalyticsWorker;->access$300(Lcom/adobe/mobile/AnalyticsWorker;Ljava/lang/String;)V
    :try_end_3
    .catch Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_0

    .line 344
    :catch_2
    move-exception v9

    .line 345
    .restart local v9    # "ex":Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->sharedInstance()Lcom/adobe/mobile/AnalyticsWorker;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lcom/adobe/mobile/AnalyticsWorker;->resetDatabase(Ljava/lang/Exception;)V

    goto/16 :goto_1

    .line 359
    .end local v9    # "ex":Lcom/adobe/mobile/AbstractDatabaseBacking$CorruptedDatabaseException;
    .restart local v4    # "delay":J
    .restart local v12    # "i":I
    :catch_3
    move-exception v8

    .line 360
    .local v8, "e":Ljava/lang/Exception;
    const-string v19, "Analytics - Background Thread Interrupted(%s)"

    const/16 v20, 0x1

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v22

    aput-object v22, v20, v21

    invoke-static/range {v19 .. v20}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
