.class public Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;
.super Ljava/lang/Object;
.source "DisabledEventsStrategy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/events/EventsStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/events/EventsStrategy",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelTimeBasedFileRollOver()V
    .locals 0

    .prologue
    .line 40
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    return-void
.end method

.method public deleteAllEvents()V
    .locals 0

    .prologue
    .line 30
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    return-void
.end method

.method public getFilesSender()Lio/fabric/sdk/android/services/events/FilesSender;
    .locals 1

    .prologue
    .line 54
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    const/4 v0, 0x0

    return-object v0
.end method

.method public recordEvent(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 35
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    .local p1, "event":Ljava/lang/Object;, "TT;"
    return-void
.end method

.method public rollFileOver()Z
    .locals 1

    .prologue
    .line 49
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public scheduleTimeBasedRollOverIfNeeded()V
    .locals 0

    .prologue
    .line 45
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    return-void
.end method

.method public sendEvents()V
    .locals 0

    .prologue
    .line 25
    .local p0, "this":Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;, "Lio/fabric/sdk/android/services/events/DisabledEventsStrategy<TT;>;"
    return-void
.end method
