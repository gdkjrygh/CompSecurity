.class Lcom/crashlytics/android/answers/SamplingEventFilter;
.super Ljava/lang/Object;
.source "SamplingEventFilter.java"

# interfaces
.implements Lcom/crashlytics/android/answers/EventFilter;


# static fields
.field static final EVENTS_TYPE_TO_SAMPLE:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/crashlytics/android/answers/SessionEvent$Type;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final samplingRate:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lcom/crashlytics/android/answers/SamplingEventFilter$1;

    invoke-direct {v0}, Lcom/crashlytics/android/answers/SamplingEventFilter$1;-><init>()V

    sput-object v0, Lcom/crashlytics/android/answers/SamplingEventFilter;->EVENTS_TYPE_TO_SAMPLE:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "samplingRate"    # I

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p1, p0, Lcom/crashlytics/android/answers/SamplingEventFilter;->samplingRate:I

    .line 32
    return-void
.end method


# virtual methods
.method public skipEvent(Lcom/crashlytics/android/answers/SessionEvent;)Z
    .locals 7
    .param p1, "sessionEvent"    # Lcom/crashlytics/android/answers/SessionEvent;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 36
    sget-object v5, Lcom/crashlytics/android/answers/SamplingEventFilter;->EVENTS_TYPE_TO_SAMPLE:Ljava/util/Set;

    iget-object v6, p1, Lcom/crashlytics/android/answers/SessionEvent;->type:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p1, Lcom/crashlytics/android/answers/SessionEvent;->sessionEventMetadata:Lcom/crashlytics/android/answers/SessionEventMetadata;

    iget-object v5, v5, Lcom/crashlytics/android/answers/SessionEventMetadata;->betaDeviceToken:Ljava/lang/String;

    if-nez v5, :cond_0

    move v0, v3

    .line 38
    .local v0, "canBeSampled":Z
    :goto_0
    iget-object v5, p1, Lcom/crashlytics/android/answers/SessionEvent;->sessionEventMetadata:Lcom/crashlytics/android/answers/SessionEventMetadata;

    iget-object v1, v5, Lcom/crashlytics/android/answers/SessionEventMetadata;->installationId:Ljava/lang/String;

    .line 39
    .local v1, "installID":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    iget v6, p0, Lcom/crashlytics/android/answers/SamplingEventFilter;->samplingRate:I

    rem-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-eqz v5, :cond_1

    move v2, v3

    .line 40
    .local v2, "isSampledId":Z
    :goto_1
    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    :goto_2
    return v3

    .end local v0    # "canBeSampled":Z
    .end local v1    # "installID":Ljava/lang/String;
    .end local v2    # "isSampledId":Z
    :cond_0
    move v0, v4

    .line 36
    goto :goto_0

    .restart local v0    # "canBeSampled":Z
    .restart local v1    # "installID":Ljava/lang/String;
    :cond_1
    move v2, v4

    .line 39
    goto :goto_1

    .restart local v2    # "isSampledId":Z
    :cond_2
    move v3, v4

    .line 40
    goto :goto_2
.end method
