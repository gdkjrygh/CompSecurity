.class Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;
.super Ljava/lang/Object;
.source "AdvertisingInfoReflectionStrategy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/common/AdvertisingInfoStrategy;


# static fields
.field private static final CLASS_NAME_ADVERTISING_ID_CLIENT:Ljava/lang/String; = "com.google.android.gms.ads.identifier.AdvertisingIdClient"

.field private static final CLASS_NAME_ADVERTISING_ID_CLIENT_INFO:Ljava/lang/String; = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"

.field private static final CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS:Ljava/lang/String; = "com.google.android.gms.common.GooglePlayServicesUtil"

.field private static final GOOGLE_PLAY_SERVICES_SUCCESS_CODE:I = 0x0

.field private static final METHOD_NAME_GET_ADVERTISING_ID_INFO:Ljava/lang/String; = "getAdvertisingIdInfo"

.field private static final METHOD_NAME_GET_ID:Ljava/lang/String; = "getId"

.field private static final METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE:Ljava/lang/String; = "isGooglePlayServicesAvailable"

.field private static final METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED:Ljava/lang/String; = "isLimitAdTrackingEnabled"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->context:Landroid/content/Context;

    .line 46
    return-void
.end method

.method private getAdvertisingId()Ljava/lang/String;
    .locals 5

    .prologue
    .line 73
    :try_start_0
    const-string v2, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getId"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 76
    .local v1, "method":Ljava/lang/reflect/Method;
    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->getInfo()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .end local v1    # "method":Ljava/lang/reflect/Method;
    :goto_0
    return-object v2

    .line 78
    :catch_0
    move-exception v0

    .line 79
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const/4 v2, 0x0

    goto :goto_0
.end method

.method private getInfo()Ljava/lang/Object;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 104
    :try_start_0
    const-string v3, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "getAdvertisingIdInfo"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Landroid/content/Context;

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 106
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v3, 0x0

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->context:Landroid/content/Context;

    aput-object v6, v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 113
    .end local v1    # "method":Ljava/lang/reflect/Method;
    :goto_0
    return-object v2

    .line 108
    :catch_0
    move-exception v0

    .line 109
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient"

    invoke-interface {v3, v4, v5}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private isLimitAdTrackingEnabled()Z
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 88
    :try_start_0
    const-string v2, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "isLimitAdTrackingEnabled"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 91
    .local v1, "method":Ljava/lang/reflect/Method;
    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->getInfo()Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 99
    .end local v1    # "method":Ljava/lang/reflect/Method;
    :goto_0
    return v2

    .line 93
    :catch_0
    move-exception v0

    .line 94
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v4, "Fabric"

    const-string v5, "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"

    invoke-interface {v2, v4, v5}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v3

    .line 99
    goto :goto_0
.end method


# virtual methods
.method public getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    .locals 3

    .prologue
    .line 65
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->context:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->isGooglePlayServiceAvailable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->getAdvertisingId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoReflectionStrategy;->isLimitAdTrackingEnabled()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/AdvertisingInfo;-><init>(Ljava/lang/String;Z)V

    .line 68
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method isGooglePlayServiceAvailable(Landroid/content/Context;)Z
    .locals 10
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 50
    :try_start_0
    const-string v5, "com.google.android.gms.common.GooglePlayServicesUtil"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v6, "isGooglePlayServicesAvailable"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    const-class v9, Landroid/content/Context;

    aput-object v9, v7, v8

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 52
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v5, 0x0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-virtual {v1, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 53
    .local v2, "result":Ljava/lang/Integer;
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    if-nez v5, :cond_0

    .line 55
    .end local v1    # "method":Ljava/lang/reflect/Method;
    .end local v2    # "result":Ljava/lang/Integer;
    :goto_0
    return v3

    .restart local v1    # "method":Ljava/lang/reflect/Method;
    .restart local v2    # "result":Ljava/lang/Integer;
    :cond_0
    move v3, v4

    .line 53
    goto :goto_0

    .line 54
    .end local v1    # "method":Ljava/lang/reflect/Method;
    .end local v2    # "result":Ljava/lang/Integer;
    :catch_0
    move-exception v0

    .local v0, "exception":Ljava/lang/Exception;
    move v3, v4

    .line 55
    goto :goto_0
.end method
