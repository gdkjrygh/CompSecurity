.class Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;
.super Ljava/lang/Object;
.source "FacebookTimeSpentData.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/FacebookTimeSpentData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SerializationProxyV1"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6L


# instance fields
.field private final interruptionCount:I

.field private final lastResumeTime:J

.field private final lastSuspendTime:J

.field private final millisecondsSpentInSession:J


# direct methods
.method constructor <init>(JJJI)V
    .locals 1
    .param p1, "lastResumeTime"    # J
    .param p3, "lastSuspendTime"    # J
    .param p5, "millisecondsSpentInSession"    # J
    .param p7, "interruptionCount"    # I

    .prologue
    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-wide p1, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->lastResumeTime:J

    .line 99
    iput-wide p3, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->lastSuspendTime:J

    .line 100
    iput-wide p5, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->millisecondsSpentInSession:J

    .line 101
    iput p7, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->interruptionCount:I

    .line 102
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 10

    .prologue
    .line 105
    new-instance v1, Lcom/facebook/appevents/FacebookTimeSpentData;

    .line 106
    iget-wide v2, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->lastResumeTime:J

    .line 107
    iget-wide v4, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->lastSuspendTime:J

    .line 108
    iget-wide v6, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->millisecondsSpentInSession:J

    .line 109
    iget v8, p0, Lcom/facebook/appevents/FacebookTimeSpentData$SerializationProxyV1;->interruptionCount:I

    .line 105
    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/facebook/appevents/FacebookTimeSpentData;-><init>(JJJILcom/facebook/appevents/FacebookTimeSpentData;)V

    return-object v1
.end method
