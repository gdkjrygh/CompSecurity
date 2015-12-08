.class public Lcom/urbanairship/ApplicationMetrics;
.super Ljava/lang/Object;
.source "ApplicationMetrics.java"


# static fields
.field private static final KEY_PREFIX:Ljava/lang/String; = "com.urbanairship.application.metrics"

.field private static final LAST_OPEN_KEY:Ljava/lang/String; = "com.urbanairship.application.metrics.LAST_OPEN"


# instance fields
.field private final preferences:Lcom/urbanairship/Preferences;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/urbanairship/Preferences;

    invoke-direct {v0, p1}, Lcom/urbanairship/Preferences;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/urbanairship/ApplicationMetrics;->preferences:Lcom/urbanairship/Preferences;

    .line 46
    invoke-direct {p0, p1}, Lcom/urbanairship/ApplicationMetrics;->registerBroadcastReceivers(Landroid/content/Context;)V

    .line 47
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/ApplicationMetrics;)Lcom/urbanairship/Preferences;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/ApplicationMetrics;

    .prologue
    .line 38
    iget-object v0, p0, Lcom/urbanairship/ApplicationMetrics;->preferences:Lcom/urbanairship/Preferences;

    return-object v0
.end method

.method private registerBroadcastReceivers(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 50
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 51
    .local v0, "filter":Landroid/content/IntentFilter;
    sget-object v1, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 52
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 53
    new-instance v1, Lcom/urbanairship/ApplicationMetrics$1;

    invoke-direct {v1, p0}, Lcom/urbanairship/ApplicationMetrics$1;-><init>(Lcom/urbanairship/ApplicationMetrics;)V

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 59
    return-void
.end method


# virtual methods
.method public getLastOpenTimeMillis()J
    .locals 4

    .prologue
    .line 75
    iget-object v0, p0, Lcom/urbanairship/ApplicationMetrics;->preferences:Lcom/urbanairship/Preferences;

    const-string v1, "com.urbanairship.application.metrics.LAST_OPEN"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/urbanairship/Preferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method
