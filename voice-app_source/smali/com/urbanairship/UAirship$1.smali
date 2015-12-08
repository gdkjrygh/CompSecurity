.class Lcom/urbanairship/UAirship$1;
.super Ljava/util/HashMap;
.source "UAirship.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/UAirship;->getUrbanAirshipComponentInfoMap()Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap",
        "<",
        "Ljava/lang/Class;",
        "Landroid/content/pm/ComponentInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/UAirship;


# direct methods
.method constructor <init>(Lcom/urbanairship/UAirship;)V
    .locals 2

    .prologue
    .line 415
    iput-object p1, p0, Lcom/urbanairship/UAirship$1;->this$0:Lcom/urbanairship/UAirship;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 417
    const-class v0, Lcom/urbanairship/analytics/EventService;

    const-class v1, Lcom/urbanairship/analytics/EventService;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getServiceInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    const-class v0, Lcom/urbanairship/push/PushService;

    const-class v1, Lcom/urbanairship/push/PushService;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getServiceInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    const-class v0, Lcom/urbanairship/richpush/RichPushUpdateService;

    const-class v1, Lcom/urbanairship/richpush/RichPushUpdateService;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getServiceInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    const-class v0, Lcom/urbanairship/location/LocationService;

    const-class v1, Lcom/urbanairship/location/LocationService;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getServiceInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    const-class v0, Lcom/urbanairship/actions/ActionService;

    const-class v1, Lcom/urbanairship/actions/ActionService;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getServiceInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    const-class v0, Lcom/urbanairship/CoreReceiver;

    const-class v1, Lcom/urbanairship/CoreReceiver;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getReceiverInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    const-class v0, Lcom/urbanairship/push/GCMPushReceiver;

    const-class v1, Lcom/urbanairship/push/GCMPushReceiver;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getReceiverInfo(Ljava/lang/Class;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    const-class v0, Lcom/urbanairship/UrbanAirshipProvider;

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getProviderInfo(Ljava/lang/String;)Landroid/content/pm/ComponentInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    const-class v0, Lcom/urbanairship/actions/ActionActivity;

    const-class v1, Lcom/urbanairship/actions/ActionActivity;

    invoke-static {v1}, Lcom/urbanairship/util/ManifestUtils;->getActivityInfo(Ljava/lang/Class;)Landroid/content/pm/ActivityInfo;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/UAirship$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    return-void
.end method
