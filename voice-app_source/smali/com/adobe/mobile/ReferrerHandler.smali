.class final Lcom/adobe/mobile/ReferrerHandler;
.super Ljava/lang/Object;
.source "ReferrerHandler.java"


# static fields
.field static final REFERRER_FIELDS:[Ljava/lang/String;

.field private static _referrerProcessed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 28
    sput-boolean v3, Lcom/adobe/mobile/ReferrerHandler;->_referrerProcessed:Z

    .line 38
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "utm_source"

    aput-object v2, v0, v1

    const-string v1, "utm_medium"

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v2, "utm_term"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "utm_content"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "utm_campaign"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "trackingcode"

    aput-object v2, v0, v1

    sput-object v0, Lcom/adobe/mobile/ReferrerHandler;->REFERRER_FIELDS:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static getReferrerProcessed()Z
    .locals 1

    .prologue
    .line 35
    sget-boolean v0, Lcom/adobe/mobile/ReferrerHandler;->_referrerProcessed:Z

    return v0
.end method

.method public static processIntent(Landroid/content/Intent;)V
    .locals 15
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v14, 0x1

    const/4 v9, 0x0

    .line 48
    if-nez p0, :cond_1

    .line 49
    const-string v8, "Analytics - Unable to process referrer due to an invalid intent parameter"

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :cond_0
    :goto_0
    return-void

    .line 53
    :cond_1
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v8

    const-string v10, "com.android.vending.INSTALL_REFERRER"

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 54
    const-string v8, "Analytics - Ignoring referrer due to the intent\'s action not being handled by analytics"

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 60
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 62
    .local v2, "extras":Landroid/os/Bundle;
    if-eqz v2, :cond_3

    .line 63
    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :cond_3
    const-string v8, "referrer"

    invoke-virtual {p0, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 73
    .local v6, "referrerURL":Ljava/lang/String;
    const-string v8, "Analytics - Received referrer information(%s)"

    new-array v10, v14, [Ljava/lang/Object;

    aput-object v6, v10, v9

    invoke-static {v8, v10}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_5

    .line 76
    :cond_4
    const-string v8, "Analytics - Ignoring referrer due to the intent\'s referrer string being empty"

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 66
    .end local v2    # "extras":Landroid/os/Bundle;
    .end local v6    # "referrerURL":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 67
    .local v0, "e":Ljava/lang/Exception;
    goto :goto_0

    .line 80
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v2    # "extras":Landroid/os/Bundle;
    .restart local v6    # "referrerURL":Ljava/lang/String;
    :cond_5
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 82
    .local v5, "referrerFields":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v8, "&"

    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    array-length v11, v10

    move v8, v9

    :goto_1
    if-ge v8, v11, :cond_7

    aget-object v4, v10, v8

    .line 83
    .local v4, "item":Ljava/lang/String;
    const-string v12, "="

    invoke-virtual {v4, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 85
    .local v7, "tokens":[Ljava/lang/String;
    array-length v12, v7

    const/4 v13, 0x2

    if-ne v12, v13, :cond_6

    .line 86
    aget-object v12, v7, v9

    aget-object v13, v7, v14

    invoke-virtual {v5, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 91
    .end local v4    # "item":Ljava/lang/String;
    .end local v7    # "tokens":[Ljava/lang/String;
    :cond_7
    sget-boolean v8, Lcom/adobe/mobile/Lifecycle;->lifecycleHasRun:Z

    if-eqz v8, :cond_8

    .line 92
    const-string v8, "utm_source"

    invoke-virtual {v5, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "utm_campaign"

    .line 93
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 95
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    new-instance v9, Lcom/adobe/mobile/ReferrerHandler$1;

    invoke-direct {v9, v5}, Lcom/adobe/mobile/ReferrerHandler$1;-><init>(Ljava/util/HashMap;)V

    invoke-interface {v8, v9}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 103
    invoke-static {}, Lcom/adobe/mobile/AnalyticsWorker;->sharedInstance()Lcom/adobe/mobile/AnalyticsWorker;

    move-result-object v8

    invoke-virtual {v8, v5}, Lcom/adobe/mobile/AnalyticsWorker;->kickWithReferrerData(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 107
    :cond_8
    :try_start_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 109
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    sget-object v10, Lcom/adobe/mobile/ReferrerHandler;->REFERRER_FIELDS:[Ljava/lang/String;

    array-length v11, v10

    move v8, v9

    :goto_2
    if-ge v8, v11, :cond_a

    aget-object v3, v10, v8

    .line 110
    .local v3, "field":Ljava/lang/String;
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_9

    .line 111
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v1, v3, v12}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 109
    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 114
    .end local v3    # "field":Ljava/lang/String;
    :cond_a
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :goto_3
    sput-boolean v14, Lcom/adobe/mobile/ReferrerHandler;->_referrerProcessed:Z

    goto/16 :goto_0

    .line 115
    :catch_1
    move-exception v0

    .line 116
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v8, "Analytics - Error persisting referrer data (%s)"

    new-array v10, v14, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v9

    invoke-static {v8, v10}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3
.end method

.method protected static setReferrerProcessed(Z)V
    .locals 0
    .param p0, "processed"    # Z

    .prologue
    .line 31
    sput-boolean p0, Lcom/adobe/mobile/ReferrerHandler;->_referrerProcessed:Z

    .line 32
    return-void
.end method
