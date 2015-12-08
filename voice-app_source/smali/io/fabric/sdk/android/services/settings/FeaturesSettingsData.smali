.class public Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;
.super Ljava/lang/Object;
.source "FeaturesSettingsData.java"


# instance fields
.field public final collectAnalytics:Z

.field public final collectLoggedException:Z

.field public final collectReports:Z

.field public final promptEnabled:Z


# direct methods
.method public constructor <init>(ZZZZ)V
    .locals 0
    .param p1, "promptEnabled"    # Z
    .param p2, "collectLoggedException"    # Z
    .param p3, "collectReports"    # Z
    .param p4, "collectAnalytics"    # Z

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-boolean p1, p0, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->promptEnabled:Z

    .line 32
    iput-boolean p2, p0, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectLoggedException:Z

    .line 33
    iput-boolean p3, p0, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectReports:Z

    .line 34
    iput-boolean p4, p0, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectAnalytics:Z

    .line 35
    return-void
.end method
