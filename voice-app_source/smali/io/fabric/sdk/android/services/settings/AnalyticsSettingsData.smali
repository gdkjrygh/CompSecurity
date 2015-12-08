.class public Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;
.super Ljava/lang/Object;
.source "AnalyticsSettingsData.java"


# static fields
.field public static final DEFAULT_SAMPLING_RATE:I = 0x1


# instance fields
.field public final analyticsURL:Ljava/lang/String;

.field public final flushIntervalSeconds:I

.field public final maxByteSizePerFile:I

.field public final maxFileCountPerSend:I

.field public final maxPendingSendFileCount:I

.field public final samplingRate:I

.field public final trackCustomEvents:Z

.field public final trackPredefinedEvents:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIIZ)V
    .locals 9
    .param p1, "analyticsURL"    # Ljava/lang/String;
    .param p2, "flushIntervalSeconds"    # I
    .param p3, "maxByteSizePerFile"    # I
    .param p4, "maxFileCountPerSend"    # I
    .param p5, "maxPendingSendFileCount"    # I
    .param p6, "trackCustomEvents"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v7, 0x1

    .line 71
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v8, v7

    invoke-direct/range {v0 .. v8}, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;-><init>(Ljava/lang/String;IIIIZZI)V

    .line 75
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIIZI)V
    .locals 9
    .param p1, "analyticsURL"    # Ljava/lang/String;
    .param p2, "flushIntervalSeconds"    # I
    .param p3, "maxByteSizePerFile"    # I
    .param p4, "maxFileCountPerSend"    # I
    .param p5, "maxPendingSendFileCount"    # I
    .param p6, "trackCustomEvents"    # Z
    .param p7, "samplingRate"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 57
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;-><init>(Ljava/lang/String;IIIIZZI)V

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIIZZI)V
    .locals 0
    .param p1, "analyticsURL"    # Ljava/lang/String;
    .param p2, "flushIntervalSeconds"    # I
    .param p3, "maxByteSizePerFile"    # I
    .param p4, "maxFileCountPerSend"    # I
    .param p5, "maxPendingSendFileCount"    # I
    .param p6, "trackCustomEvents"    # Z
    .param p7, "trackPredefinedEvents"    # Z
    .param p8, "samplingRate"    # I

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->analyticsURL:Ljava/lang/String;

    .line 40
    iput p2, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->flushIntervalSeconds:I

    .line 41
    iput p3, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxByteSizePerFile:I

    .line 42
    iput p4, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxFileCountPerSend:I

    .line 43
    iput p5, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxPendingSendFileCount:I

    .line 44
    iput-boolean p6, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->trackCustomEvents:Z

    .line 45
    iput-boolean p7, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->trackPredefinedEvents:Z

    .line 46
    iput p8, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->samplingRate:I

    .line 47
    return-void
.end method
