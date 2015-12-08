.class Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/AppEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FlushStatistics"
.end annotation


# instance fields
.field public numEvents:I

.field public result:Lcom/facebook/appevents/AppEventsLogger$FlushResult;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 900
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 901
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;->numEvents:I

    .line 902
    sget-object v0, Lcom/facebook/appevents/AppEventsLogger$FlushResult;->SUCCESS:Lcom/facebook/appevents/AppEventsLogger$FlushResult;

    iput-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;->result:Lcom/facebook/appevents/AppEventsLogger$FlushResult;

    .line 900
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;)V
    .locals 0

    .prologue
    .line 900
    invoke-direct {p0}, Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;-><init>()V

    return-void
.end method
