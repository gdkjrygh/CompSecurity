.class public Lio/fabric/sdk/android/services/settings/SettingsData;
.super Ljava/lang/Object;
.source "SettingsData.java"


# instance fields
.field public final analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

.field public final appData:Lio/fabric/sdk/android/services/settings/AppSettingsData;

.field public final betaSettingsData:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

.field public final cacheDuration:I

.field public final expiresAtMillis:J

.field public final featuresData:Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

.field public final promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

.field public final sessionData:Lio/fabric/sdk/android/services/settings/SessionSettingsData;

.field public final settingsVersion:I


# direct methods
.method public constructor <init>(JLio/fabric/sdk/android/services/settings/AppSettingsData;Lio/fabric/sdk/android/services/settings/SessionSettingsData;Lio/fabric/sdk/android/services/settings/PromptSettingsData;Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Lio/fabric/sdk/android/services/settings/BetaSettingsData;II)V
    .locals 1
    .param p1, "expiresAtMillis"    # J
    .param p3, "appData"    # Lio/fabric/sdk/android/services/settings/AppSettingsData;
    .param p4, "sessionData"    # Lio/fabric/sdk/android/services/settings/SessionSettingsData;
    .param p5, "promptData"    # Lio/fabric/sdk/android/services/settings/PromptSettingsData;
    .param p6, "featuresData"    # Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;
    .param p7, "analyticsSettingsData"    # Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;
    .param p8, "betaSettingsData"    # Lio/fabric/sdk/android/services/settings/BetaSettingsData;
    .param p9, "settingsVersion"    # I
    .param p10, "cacheDuration"    # I

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-wide p1, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->expiresAtMillis:J

    .line 41
    iput-object p3, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->appData:Lio/fabric/sdk/android/services/settings/AppSettingsData;

    .line 42
    iput-object p4, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->sessionData:Lio/fabric/sdk/android/services/settings/SessionSettingsData;

    .line 43
    iput-object p5, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    .line 44
    iput-object p6, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->featuresData:Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

    .line 45
    iput p9, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->settingsVersion:I

    .line 46
    iput p10, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->cacheDuration:I

    .line 47
    iput-object p7, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    .line 48
    iput-object p8, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->betaSettingsData:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    .line 49
    return-void
.end method


# virtual methods
.method public isExpired(J)Z
    .locals 3
    .param p1, "currentTimeMillis"    # J

    .prologue
    .line 52
    iget-wide v0, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->expiresAtMillis:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
