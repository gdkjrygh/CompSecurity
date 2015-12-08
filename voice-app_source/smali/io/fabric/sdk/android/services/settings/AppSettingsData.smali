.class public Lio/fabric/sdk/android/services/settings/AppSettingsData;
.super Ljava/lang/Object;
.source "AppSettingsData.java"


# static fields
.field public static final STATUS_ACTIVATED:Ljava/lang/String; = "activated"

.field public static final STATUS_CONFIGURED:Ljava/lang/String; = "configured"

.field public static final STATUS_NEW:Ljava/lang/String; = "new"


# instance fields
.field public final icon:Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

.field public final identifier:Ljava/lang/String;

.field public final reportsUrl:Ljava/lang/String;

.field public final status:Ljava/lang/String;

.field public final updateRequired:Z

.field public final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/fabric/sdk/android/services/settings/AppIconSettingsData;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "status"    # Ljava/lang/String;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "reportsUrl"    # Ljava/lang/String;
    .param p5, "updateRequired"    # Z
    .param p6, "icon"    # Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/AppSettingsData;->identifier:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lio/fabric/sdk/android/services/settings/AppSettingsData;->status:Ljava/lang/String;

    .line 41
    iput-object p3, p0, Lio/fabric/sdk/android/services/settings/AppSettingsData;->url:Ljava/lang/String;

    .line 42
    iput-object p4, p0, Lio/fabric/sdk/android/services/settings/AppSettingsData;->reportsUrl:Ljava/lang/String;

    .line 43
    iput-boolean p5, p0, Lio/fabric/sdk/android/services/settings/AppSettingsData;->updateRequired:Z

    .line 44
    iput-object p6, p0, Lio/fabric/sdk/android/services/settings/AppSettingsData;->icon:Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

    .line 45
    return-void
.end method
