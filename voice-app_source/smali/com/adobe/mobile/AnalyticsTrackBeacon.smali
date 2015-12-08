.class final Lcom/adobe/mobile/AnalyticsTrackBeacon;
.super Ljava/lang/Object;
.source "AnalyticsTrackBeacon.java"


# static fields
.field private static final BEACON_ACTION_NAME:Ljava/lang/String; = "Beacon"

.field private static final BEACON_MAJOR_KEY:Ljava/lang/String; = "a.beacon.major"

.field private static final BEACON_MINOR_KEY:Ljava/lang/String; = "a.beacon.minor"

.field private static final BEACON_PROX_KEY:Ljava/lang/String; = "a.beacon.prox"

.field private static final BEACON_UUID_KEY:Ljava/lang/String; = "a.beacon.uuid"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static clearBeacon()V
    .locals 1

    .prologue
    .line 70
    const-string v0, "a.beacon.uuid"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->removePersistentParameter(Ljava/lang/String;)V

    .line 71
    const-string v0, "a.beacon.major"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->removePersistentParameter(Ljava/lang/String;)V

    .line 72
    const-string v0, "a.beacon.minor"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->removePersistentParameter(Ljava/lang/String;)V

    .line 73
    const-string v0, "a.beacon.prox"

    invoke-static {v0}, Lcom/adobe/mobile/TargetWorker;->removePersistentParameter(Ljava/lang/String;)V

    .line 75
    const-string v0, "a.beacon.uuid"

    invoke-static {v0}, Lcom/adobe/mobile/Lifecycle;->removeContextData(Ljava/lang/String;)V

    .line 76
    const-string v0, "a.beacon.major"

    invoke-static {v0}, Lcom/adobe/mobile/Lifecycle;->removeContextData(Ljava/lang/String;)V

    .line 77
    const-string v0, "a.beacon.minor"

    invoke-static {v0}, Lcom/adobe/mobile/Lifecycle;->removeContextData(Ljava/lang/String;)V

    .line 78
    const-string v0, "a.beacon.prox"

    invoke-static {v0}, Lcom/adobe/mobile/Lifecycle;->removeContextData(Ljava/lang/String;)V

    .line 79
    return-void
.end method

.method protected static trackBeacon(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;Ljava/util/Map;)V
    .locals 3
    .param p0, "uuid"    # Ljava/lang/String;
    .param p1, "major"    # Ljava/lang/String;
    .param p2, "minor"    # Ljava/lang/String;
    .param p3, "prox"    # Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 34
    .local p4, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .local v0, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-static {}, Lcom/adobe/mobile/AnalyticsTrackBeacon;->clearBeacon()V

    .line 39
    if-eqz p0, :cond_0

    .line 40
    const-string v1, "a.beacon.uuid"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    const-string v1, "a.beacon.uuid"

    invoke-static {v1, p0}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :cond_0
    if-eqz p1, :cond_1

    .line 45
    const-string v1, "a.beacon.major"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    const-string v1, "a.beacon.major"

    invoke-static {v1, p1}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_1
    if-eqz p2, :cond_2

    .line 50
    const-string v1, "a.beacon.minor"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    const-string v1, "a.beacon.minor"

    invoke-static {v1, p2}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :cond_2
    if-eqz p3, :cond_3

    .line 55
    const-string v1, "a.beacon.prox"

    invoke-virtual {p3}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    const-string v1, "a.beacon.prox"

    invoke-virtual {p3}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :cond_3
    invoke-static {v0}, Lcom/adobe/mobile/Lifecycle;->updateContextData(Ljava/util/HashMap;)V

    .line 62
    if-eqz p4, :cond_4

    .line 63
    invoke-virtual {v0, p4}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 66
    :cond_4
    const-string v1, "Beacon"

    invoke-static {v1, v0}, Lcom/adobe/mobile/AnalyticsTrackInternal;->trackInternal(Ljava/lang/String;Ljava/util/Map;)V

    .line 67
    return-void
.end method
