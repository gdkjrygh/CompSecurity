.class public Lcom/facebook/internal/AttributionIdentifiers;
.super Ljava/lang/Object;
.source "AttributionIdentifiers.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;,
        Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;
    }
.end annotation


# static fields
.field private static final ANDROID_ID_COLUMN_NAME:Ljava/lang/String; = "androidid"

.field private static final ATTRIBUTION_ID_COLUMN_NAME:Ljava/lang/String; = "aid"

.field private static final ATTRIBUTION_ID_CONTENT_PROVIDER:Ljava/lang/String; = "com.facebook.katana.provider.AttributionIdProvider"

.field private static final ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI:Ljava/lang/String; = "com.facebook.wakizashi.provider.AttributionIdProvider"

.field private static final CONNECTION_RESULT_SUCCESS:I = 0x0

.field private static final IDENTIFIER_REFRESH_INTERVAL_MILLIS:J = 0x36ee80L

.field private static final LIMIT_TRACKING_COLUMN_NAME:Ljava/lang/String; = "limit_tracking"

.field private static final TAG:Ljava/lang/String;

.field private static recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;


# instance fields
.field private androidAdvertiserId:Ljava/lang/String;

.field private androidInstallerPackage:Ljava/lang/String;

.field private attributionId:Ljava/lang/String;

.field private fetchTime:J

.field private limitTracking:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/facebook/internal/AttributionIdentifiers;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/AttributionIdentifiers;->TAG:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static cacheAndReturnIdentifiers(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    .locals 2
    .param p0, "identifiers"    # Lcom/facebook/internal/AttributionIdentifiers;

    .prologue
    .line 223
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->fetchTime:J

    .line 224
    sput-object p0, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    .line 225
    return-object p0
.end method

.method private static getAndroidId(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 75
    invoke-static {p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidIdViaReflection(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;

    move-result-object v0

    .line 76
    .local v0, "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    if-nez v0, :cond_0

    .line 77
    invoke-static {p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidIdViaService(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;

    move-result-object v0

    .line 78
    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/facebook/internal/AttributionIdentifiers;

    .end local v0    # "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    invoke-direct {v0}, Lcom/facebook/internal/AttributionIdentifiers;-><init>()V

    .line 82
    .restart local v0    # "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    :cond_0
    return-object v0
.end method

.method private static getAndroidIdViaReflection(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    .locals 14
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v13, 0x0

    .line 89
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v8

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v9

    if-ne v8, v9, :cond_1

    .line 90
    new-instance v8, Lcom/facebook/FacebookException;

    const-string v9, "getAndroidId cannot be called on the main thread."

    invoke-direct {v8, v9}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :catch_0
    move-exception v2

    .line 138
    .local v2, "e":Ljava/lang/Exception;
    const-string v8, "android_id"

    invoke-static {v8, v2}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 140
    .end local v2    # "e":Ljava/lang/Exception;
    :cond_0
    :goto_0
    return-object v13

    .line 93
    :cond_1
    :try_start_1
    const-string v8, "com.google.android.gms.common.GooglePlayServicesUtil"

    .line 94
    const-string v9, "isGooglePlayServicesAvailable"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Class;

    const/4 v11, 0x0

    .line 95
    const-class v12, Landroid/content/Context;

    aput-object v12, v10, v11

    .line 92
    invoke-static {v8, v9, v10}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 98
    .local v6, "isGooglePlayServicesAvailable":Ljava/lang/reflect/Method;
    if-eqz v6, :cond_0

    .line 103
    const/4 v8, 0x0

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p0, v9, v10

    .line 102
    invoke-static {v8, v6, v9}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 104
    .local v1, "connectionResult":Ljava/lang/Object;
    instance-of v8, v1, Ljava/lang/Integer;

    if-eqz v8, :cond_0

    .line 105
    check-cast v1, Ljava/lang/Integer;

    .end local v1    # "connectionResult":Ljava/lang/Object;
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-nez v8, :cond_0

    .line 110
    const-string v8, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    .line 111
    const-string v9, "getAdvertisingIdInfo"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Class;

    const/4 v11, 0x0

    .line 112
    const-class v12, Landroid/content/Context;

    aput-object v12, v10, v11

    .line 109
    invoke-static {v8, v9, v10}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 114
    .local v3, "getAdvertisingIdInfo":Ljava/lang/reflect/Method;
    if-eqz v3, :cond_0

    .line 118
    const/4 v8, 0x0

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p0, v9, v10

    .line 117
    invoke-static {v8, v3, v9}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 119
    .local v0, "advertisingInfo":Ljava/lang/Object;
    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    const-string v9, "getId"

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Class;

    invoke-static {v8, v9, v10}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 125
    .local v4, "getId":Ljava/lang/reflect/Method;
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    .line 126
    const-string v9, "isLimitAdTrackingEnabled"

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Class;

    .line 124
    invoke-static {v8, v9, v10}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 127
    .local v7, "isLimitAdTrackingEnabled":Ljava/lang/reflect/Method;
    if-eqz v4, :cond_0

    if-eqz v7, :cond_0

    .line 131
    new-instance v5, Lcom/facebook/internal/AttributionIdentifiers;

    invoke-direct {v5}, Lcom/facebook/internal/AttributionIdentifiers;-><init>()V

    .line 133
    .local v5, "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v0, v4, v8}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 132
    iput-object v8, v5, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;

    .line 136
    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Object;

    .line 134
    invoke-static {v0, v7, v8}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iput-boolean v8, v5, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method private static getAndroidIdViaService(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v5, 0x0

    .line 144
    new-instance v1, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;

    invoke-direct {v1, v5}, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;-><init>(Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;)V

    .line 145
    .local v1, "connection":Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;
    new-instance v4, Landroid/content/Intent;

    const-string v6, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 146
    .local v4, "intent":Landroid/content/Intent;
    const-string v6, "com.google.android.gms"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    const/4 v6, 0x1

    invoke-virtual {p0, v4, v1, v6}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 149
    :try_start_0
    new-instance v0, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;

    invoke-virtual {v1}, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;->getBinder()Landroid/os/IBinder;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;-><init>(Landroid/os/IBinder;)V

    .line 150
    .local v0, "adInfo":Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;
    new-instance v3, Lcom/facebook/internal/AttributionIdentifiers;

    invoke-direct {v3}, Lcom/facebook/internal/AttributionIdentifiers;-><init>()V

    .line 151
    .local v3, "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    invoke-virtual {v0}, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;->getAdvertiserId()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v3, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;

    .line 152
    invoke-virtual {v0}, Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;->isTrackingLimited()Z

    move-result v6

    iput-boolean v6, v3, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    invoke-virtual {p0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 160
    .end local v0    # "adInfo":Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;
    .end local v3    # "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    :goto_0
    return-object v3

    .line 154
    :catch_0
    move-exception v2

    .line 155
    .local v2, "exception":Ljava/lang/Exception;
    :try_start_1
    const-string v6, "android_id"

    invoke-static {v6, v2}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    invoke-virtual {p0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .end local v2    # "exception":Ljava/lang/Exception;
    :cond_0
    move-object v3, v5

    .line 160
    goto :goto_0

    .line 156
    :catchall_0
    move-exception v5

    .line 157
    invoke-virtual {p0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 158
    throw v5
.end method

.method public static getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    .locals 16
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 164
    sget-object v0, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    if-eqz v0, :cond_1

    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v0, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    iget-wide v14, v0, Lcom/facebook/internal/AttributionIdentifiers;->fetchTime:J

    sub-long/2addr v4, v14

    .line 166
    const-wide/32 v14, 0x36ee80

    cmp-long v0, v4, v14

    if-gez v0, :cond_1

    .line 167
    sget-object v0, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    .line 218
    :cond_0
    :goto_0
    return-object v0

    .line 170
    :cond_1
    invoke-static/range {p0 .. p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidId(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;

    move-result-object v10

    .line 171
    .local v10, "identifiers":Lcom/facebook/internal/AttributionIdentifiers;
    const/4 v8, 0x0

    .line 173
    .local v8, "c":Landroid/database/Cursor;
    const/4 v0, 0x3

    :try_start_0
    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    .line 174
    const-string v3, "aid"

    aput-object v3, v2, v0

    const/4 v0, 0x1

    .line 175
    const-string v3, "androidid"

    aput-object v3, v2, v0

    const/4 v0, 0x2

    .line 176
    const-string v3, "limit_tracking"

    aput-object v3, v2, v0

    .line 177
    .local v2, "projection":[Ljava/lang/String;
    const/4 v1, 0x0

    .line 178
    .local v1, "providerUri":Landroid/net/Uri;
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 179
    const-string v3, "com.facebook.katana.provider.AttributionIdProvider"

    const/4 v4, 0x0

    .line 178
    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 180
    const-string v0, "content://com.facebook.katana.provider.AttributionIdProvider"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 185
    :cond_2
    :goto_1
    invoke-static/range {p0 .. p0}, Lcom/facebook/internal/AttributionIdentifiers;->getInstallerPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 186
    .local v11, "installerPackageName":Ljava/lang/String;
    if-eqz v11, :cond_3

    .line 187
    iput-object v11, v10, Lcom/facebook/internal/AttributionIdentifiers;->androidInstallerPackage:Ljava/lang/String;

    .line 189
    :cond_3
    if-nez v1, :cond_5

    .line 190
    invoke-static {v10}, Lcom/facebook/internal/AttributionIdentifiers;->cacheAndReturnIdentifiers(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 214
    if-eqz v8, :cond_0

    .line 215
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 181
    .end local v11    # "installerPackageName":Ljava/lang/String;
    :cond_4
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 182
    const-string v3, "com.facebook.wakizashi.provider.AttributionIdProvider"

    const/4 v4, 0x0

    .line 181
    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 183
    const-string v0, "content://com.facebook.wakizashi.provider.AttributionIdProvider"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_1

    .line 192
    .restart local v11    # "installerPackageName":Ljava/lang/String;
    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 193
    if-eqz v8, :cond_6

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_7

    .line 194
    :cond_6
    invoke-static {v10}, Lcom/facebook/internal/AttributionIdentifiers;->cacheAndReturnIdentifiers(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 214
    if-eqz v8, :cond_0

    .line 215
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 196
    :cond_7
    :try_start_2
    const-string v0, "aid"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 197
    .local v7, "attributionColumnIndex":I
    const-string v0, "androidid"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 198
    .local v6, "androidIdColumnIndex":I
    const-string v0, "limit_tracking"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 200
    .local v12, "limitTrackingColumnIndex":I
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/facebook/internal/AttributionIdentifiers;->attributionId:Ljava/lang/String;

    .line 204
    if-lez v6, :cond_8

    if-lez v12, :cond_8

    .line 205
    invoke-virtual {v10}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    .line 206
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;

    .line 208
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 207
    iput-boolean v0, v10, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    :cond_8
    if-eqz v8, :cond_9

    .line 215
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 218
    :cond_9
    invoke-static {v10}, Lcom/facebook/internal/AttributionIdentifiers;->cacheAndReturnIdentifiers(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;

    move-result-object v0

    goto/16 :goto_0

    .line 210
    .end local v1    # "providerUri":Landroid/net/Uri;
    .end local v2    # "projection":[Ljava/lang/String;
    .end local v6    # "androidIdColumnIndex":I
    .end local v7    # "attributionColumnIndex":I
    .end local v11    # "installerPackageName":Ljava/lang/String;
    .end local v12    # "limitTrackingColumnIndex":I
    :catch_0
    move-exception v9

    .line 211
    .local v9, "e":Ljava/lang/Exception;
    :try_start_3
    sget-object v0, Lcom/facebook/internal/AttributionIdentifiers;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Caught unexpected exception in getAttributionId(): "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    if-eqz v8, :cond_a

    .line 215
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 212
    :cond_a
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 213
    .end local v9    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v0

    .line 214
    if-eqz v8, :cond_b

    .line 215
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 217
    :cond_b
    throw v0
.end method

.method private static getInstallerPackageName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .prologue
    .line 246
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 247
    .local v0, "packageManager":Landroid/content/pm/PackageManager;
    if-eqz v0, :cond_0

    .line 248
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 250
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public getAndroidAdvertiserId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;

    return-object v0
.end method

.method public getAndroidInstallerPackage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->androidInstallerPackage:Ljava/lang/String;

    return-object v0
.end method

.method public getAttributionId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->attributionId:Ljava/lang/String;

    return-object v0
.end method

.method public isTrackingLimited()Z
    .locals 1

    .prologue
    .line 241
    iget-boolean v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z

    return v0
.end method
