.class Lcom/urbanairship/analytics/AnalyticsPreferences;
.super Lcom/urbanairship/Preferences;
.source "AnalyticsPreferences.java"


# static fields
.field private static final KEY_PREFIX:Ljava/lang/String; = "com.urbanairship.analytics"

.field private static final LAST_SEND_KEY:Ljava/lang/String; = "com.urbanairship.analytics.LAST_SEND"

.field static final MAX_BATCH_INTERVAL_MS:I = 0x240c8400

.field static final MAX_BATCH_SIZE_BYTES:I = 0x7d000

.field private static final MAX_BATCH_SIZE_KEY:Ljava/lang/String; = "com.urbanairship.analytics.MAX_BATCH_SIZE"

.field static final MAX_TOTAL_DB_SIZE_BYTES:I = 0x500000

.field private static final MAX_TOTAL_DB_SIZE_KEY:Ljava/lang/String; = "com.urbanairship.analytics.MAX_TOTAL_DB_SIZE"

.field private static final MAX_WAIT_KEY:Ljava/lang/String; = "com.urbanairship.analytics.MAX_WAIT"

.field static final MAX_WAIT_MS:I = 0x48190800

.field private static final MIN_BATCH_INTERVAL_KEY:Ljava/lang/String; = "com.urbanairship.analytics.MIN_BATCH_INTERVAL"

.field static final MIN_BATCH_INTERVAL_MS:I = 0xea60

.field static final MIN_BATCH_SIZE_BYTES:I = 0x400

.field static final MIN_TOTAL_DB_SIZE_BYTES:I = 0x2800

.field static final MIN_WAIT_MS:I = 0x240c8400


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/urbanairship/Preferences;-><init>(Landroid/content/Context;)V

    .line 32
    const-string v0, "com.urbanairship.analytics"

    invoke-virtual {p0, v0}, Lcom/urbanairship/analytics/AnalyticsPreferences;->migratePreferencesFromFileToDb(Ljava/lang/String;)V

    .line 33
    return-void
.end method

.method private getClampedValue(III)I
    .locals 0
    .param p1, "value"    # I
    .param p2, "max"    # I
    .param p3, "min"    # I

    .prologue
    .line 128
    if-le p1, p2, :cond_0

    .line 136
    .end local p2    # "max":I
    :goto_0
    return p2

    .line 132
    .restart local p2    # "max":I
    :cond_0
    if-ge p1, p3, :cond_1

    move p2, p3

    .line 133
    goto :goto_0

    :cond_1
    move p2, p1

    .line 136
    goto :goto_0
.end method


# virtual methods
.method getLastSendTime()J
    .locals 4

    .prologue
    .line 109
    const-string v0, "com.urbanairship.analytics.LAST_SEND"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method getMaxBatchSize()I
    .locals 2

    .prologue
    .line 57
    const-string v0, "com.urbanairship.analytics.MAX_BATCH_SIZE"

    const v1, 0x7d000

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method getMaxTotalDbSize()I
    .locals 2

    .prologue
    .line 40
    const-string v0, "com.urbanairship.analytics.MAX_TOTAL_DB_SIZE"

    const/high16 v1, 0x500000

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method getMaxWait()I
    .locals 2

    .prologue
    .line 74
    const-string v0, "com.urbanairship.analytics.MAX_WAIT"

    const v1, 0x48190800

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method getMinBatchInterval()I
    .locals 2

    .prologue
    .line 92
    const-string v0, "com.urbanairship.analytics.MIN_BATCH_INTERVAL"

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method setLastSendTime(J)V
    .locals 3
    .param p1, "lastSendTime"    # J

    .prologue
    .line 117
    const-string v0, "com.urbanairship.analytics.LAST_SEND"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/analytics/AnalyticsPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 118
    return-void
.end method

.method setMaxBatchSize(I)V
    .locals 3
    .param p1, "maxBatchSize"    # I

    .prologue
    .line 65
    const v1, 0x7d000

    const/16 v2, 0x400

    invoke-direct {p0, p1, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getClampedValue(III)I

    move-result v0

    .line 66
    .local v0, "clampedValue":I
    const-string v1, "com.urbanairship.analytics.MAX_BATCH_SIZE"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 67
    return-void
.end method

.method setMaxTotalDbSize(I)V
    .locals 3
    .param p1, "maxTotalDbSize"    # I

    .prologue
    .line 48
    const/high16 v1, 0x500000

    const/16 v2, 0x2800

    invoke-direct {p0, p1, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getClampedValue(III)I

    move-result v0

    .line 49
    .local v0, "clampedValue":I
    const-string v1, "com.urbanairship.analytics.MAX_TOTAL_DB_SIZE"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 50
    return-void
.end method

.method setMaxWait(I)V
    .locals 3
    .param p1, "maxWait"    # I

    .prologue
    .line 82
    const v1, 0x48190800

    const v2, 0x240c8400

    invoke-direct {p0, p1, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getClampedValue(III)I

    move-result v0

    .line 83
    .local v0, "clampedValue":I
    const-string v1, "com.urbanairship.analytics.MAX_WAIT"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 84
    return-void
.end method

.method setMinBatchInterval(I)V
    .locals 3
    .param p1, "minBatchInterval"    # I

    .prologue
    .line 100
    const v1, 0x240c8400

    const v2, 0xea60

    invoke-direct {p0, p1, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->getClampedValue(III)I

    move-result v0

    .line 101
    .local v0, "clampedValue":I
    const-string v1, "com.urbanairship.analytics.MIN_BATCH_INTERVAL"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/analytics/AnalyticsPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 102
    return-void
.end method
