.class Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;
.super Ljava/lang/Object;
.source "AdvertisingInfoServiceStrategy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/common/AdvertisingInfoStrategy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$1;,
        Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;,
        Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;
    }
.end annotation


# static fields
.field public static final GOOGLE_PLAY_SERVICES_INTENT:Ljava/lang/String; = "com.google.android.gms.ads.identifier.service.START"

.field public static final GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME:Ljava/lang/String; = "com.google.android.gms"

.field private static final GOOGLE_PLAY_SERVICE_PACKAGE_NAME:Ljava/lang/String; = "com.android.vending"


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

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;->context:Landroid/content/Context;

    .line 46
    return-void
.end method


# virtual methods
.method public getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    .locals 10

    .prologue
    const/4 v6, 0x0

    .line 49
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v8

    if-ne v7, v8, :cond_0

    .line 50
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    const-string v9, "AdvertisingInfoServiceStrategy cannot be called on the main thread"

    invoke-interface {v7, v8, v9}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :goto_0
    return-object v6

    .line 56
    :cond_0
    :try_start_0
    iget-object v7, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 57
    .local v4, "pm":Landroid/content/pm/PackageManager;
    const-string v7, "com.android.vending"

    const/4 v8, 0x0

    invoke-virtual {v4, v7, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    new-instance v1, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;

    invoke-direct {v1, v6}, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;-><init>(Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$1;)V

    .line 73
    .local v1, "connection":Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;
    new-instance v3, Landroid/content/Intent;

    const-string v7, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v3, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 74
    .local v3, "intent":Landroid/content/Intent;
    const-string v7, "com.google.android.gms"

    invoke-virtual {v3, v7}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    :try_start_1
    iget-object v7, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;->context:Landroid/content/Context;

    const/4 v8, 0x1

    invoke-virtual {v7, v3, v1, v8}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    move-result v7

    if-eqz v7, :cond_1

    .line 78
    :try_start_2
    new-instance v0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->getBinder()Landroid/os/IBinder;

    move-result-object v7

    invoke-direct {v0, v7}, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;-><init>(Landroid/os/IBinder;)V

    .line 80
    .local v0, "adInterface":Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;
    new-instance v7, Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;->isLimitAdTrackingEnabled()Z

    move-result v9

    invoke-direct {v7, v8, v9}, Lio/fabric/sdk/android/services/common/AdvertisingInfo;-><init>(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :try_start_3
    iget-object v8, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;->context:Landroid/content/Context;

    invoke-virtual {v8, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3

    move-object v6, v7

    goto :goto_0

    .line 58
    .end local v0    # "adInterface":Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface;
    .end local v1    # "connection":Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;
    .end local v3    # "intent":Landroid/content/Intent;
    .end local v4    # "pm":Landroid/content/pm/PackageManager;
    :catch_0
    move-exception v2

    .line 61
    .local v2, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    const-string v9, "Unable to find Google Play Services package name"

    invoke-interface {v7, v8, v9}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 63
    .end local v2    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :catch_1
    move-exception v2

    .line 67
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    const-string v9, "Unable to determine if Google Play Services is available"

    invoke-interface {v7, v8, v9, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 82
    .end local v2    # "e":Ljava/lang/Exception;
    .restart local v1    # "connection":Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;
    .restart local v3    # "intent":Landroid/content/Intent;
    .restart local v4    # "pm":Landroid/content/pm/PackageManager;
    :catch_2
    move-exception v2

    .line 83
    .restart local v2    # "e":Ljava/lang/Exception;
    :try_start_4
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    const-string v9, "Exception in binding to Google Play Service to capture AdvertisingId"

    invoke-interface {v7, v8, v9, v2}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 87
    :try_start_5
    iget-object v7, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;->context:Landroid/content/Context;

    invoke-virtual {v7, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_0

    .line 93
    .end local v2    # "e":Ljava/lang/Exception;
    :catch_3
    move-exception v5

    .line 94
    .local v5, "t":Ljava/lang/Throwable;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    const-string v9, "Could not bind to Google Play Service to capture AdvertisingId"

    invoke-interface {v7, v8, v9, v5}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 87
    .end local v5    # "t":Ljava/lang/Throwable;
    :catchall_0
    move-exception v7

    :try_start_6
    iget-object v8, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;->context:Landroid/content/Context;

    invoke-virtual {v8, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw v7

    .line 90
    :cond_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    const-string v9, "Could not bind to Google Play Service to capture AdvertisingId"

    invoke-interface {v7, v8, v9}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3

    goto/16 :goto_0
.end method
