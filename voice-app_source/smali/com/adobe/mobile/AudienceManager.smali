.class public final Lcom/adobe/mobile/AudienceManager;
.super Ljava/lang/Object;
.source "AudienceManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public static getDpid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetDpid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDpuuid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetDpuuid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getVisitorProfile()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 35
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->GetVisitorProfile()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static reset()V
    .locals 0

    .prologue
    .line 63
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->Reset()V

    .line 64
    return-void
.end method

.method public static setDpidAndDpuuid(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "dpid"    # Ljava/lang/String;
    .param p1, "dpuuid"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-static {p0, p1}, Lcom/adobe/mobile/AudienceManagerWorker;->SetDpidAndDpuuid(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method public static signalWithData(Ljava/util/Map;Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 55
    .local p0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .local p1, "callback":Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;, "Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const-string v0, "Audience Manager - Method signalWithData is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    :goto_0
    return-void

    .line 59
    :cond_0
    invoke-static {p0, p1}, Lcom/adobe/mobile/AudienceManagerWorker;->SubmitSignal(Ljava/util/Map;Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;)V

    goto :goto_0
.end method
