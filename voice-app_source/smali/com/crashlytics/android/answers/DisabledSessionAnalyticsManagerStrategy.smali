.class Lcom/crashlytics/android/answers/DisabledSessionAnalyticsManagerStrategy;
.super Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;
.source "DisabledSessionAnalyticsManagerStrategy.java"

# interfaces
.implements Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy",
        "<",
        "Lcom/crashlytics/android/answers/SessionEvent;",
        ">;",
        "Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy",
        "<",
        "Lcom/crashlytics/android/answers/SessionEvent;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V
    .locals 0
    .param p1, "builder"    # Lcom/crashlytics/android/answers/SessionEvent$Builder;

    .prologue
    .line 19
    return-void
.end method

.method public setAnalyticsSettingsData(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Ljava/lang/String;)V
    .locals 0
    .param p1, "analyticsSettingsData"    # Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;
    .param p2, "protocolAndHostOverride"    # Ljava/lang/String;

    .prologue
    .line 16
    return-void
.end method
