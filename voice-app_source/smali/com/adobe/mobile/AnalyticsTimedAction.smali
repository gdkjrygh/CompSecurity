.class final Lcom/adobe/mobile/AnalyticsTimedAction;
.super Ljava/lang/Object;
.source "AnalyticsTimedAction.java"


# instance fields
.field protected adjustedStartTime:J

.field protected contextData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected databaseID:I

.field protected startTime:J


# direct methods
.method protected constructor <init>(Ljava/util/Map;JJI)V
    .locals 0
    .param p2, "startTime"    # J
    .param p4, "adjustedStartTime"    # J
    .param p6, "databaseID"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;JJI)V"
        }
    .end annotation

    .prologue
    .line 29
    .local p1, "contextData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/adobe/mobile/AnalyticsTimedAction;->contextData:Ljava/util/Map;

    .line 31
    iput p6, p0, Lcom/adobe/mobile/AnalyticsTimedAction;->databaseID:I

    .line 32
    iput-wide p2, p0, Lcom/adobe/mobile/AnalyticsTimedAction;->startTime:J

    .line 33
    iput-wide p4, p0, Lcom/adobe/mobile/AnalyticsTimedAction;->adjustedStartTime:J

    .line 34
    return-void
.end method
