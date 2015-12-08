.class Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;
.super Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;
.source "AdvertisingInfoProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->refreshInfoIfNeededAsync(Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

.field final synthetic val$advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->val$advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;-><init>()V

    return-void
.end method


# virtual methods
.method public onRun()V
    .locals 4

    .prologue
    .line 70
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    # invokes: Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->getAdvertisingInfoFromStrategies()Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    invoke-static {v1}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->access$000(Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;)Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    .line 71
    .local v0, "infoToStore":Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->val$advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    invoke-virtual {v1, v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 72
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Asychronously getting Advertising Info and storing it to preferences"

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider$1;->this$0:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    # invokes: Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->storeInfoToPreferences(Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V
    invoke-static {v1, v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->access$100(Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;Lio/fabric/sdk/android/services/common/AdvertisingInfo;)V

    .line 76
    :cond_0
    return-void
.end method
