.class public final Lcom/facebook/internal/Utility;
.super Ljava/lang/Object;
.source "Utility.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/Utility$DialogFeatureConfig;,
        Lcom/facebook/internal/Utility$FetchedAppSettings;,
        Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;,
        Lcom/facebook/internal/Utility$Mapper;,
        Lcom/facebook/internal/Utility$Predicate;
    }
.end annotation


# static fields
.field private static final APPLICATION_FIELDS:Ljava/lang/String; = "fields"

.field private static final APP_SETTINGS_PREFS_KEY_FORMAT:Ljava/lang/String; = "com.facebook.internal.APP_SETTINGS.%s"

.field private static final APP_SETTINGS_PREFS_STORE:Ljava/lang/String; = "com.facebook.internal.preferences.APP_SETTINGS"

.field private static final APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES:Ljava/lang/String; = "android_sdk_error_categories"

.field private static final APP_SETTING_DIALOG_CONFIGS:Ljava/lang/String; = "android_dialog_configs"

.field private static final APP_SETTING_FIELDS:[Ljava/lang/String;

.field private static final APP_SETTING_NUX_CONTENT:Ljava/lang/String; = "gdpv4_nux_content"

.field private static final APP_SETTING_NUX_ENABLED:Ljava/lang/String; = "gdpv4_nux_enabled"

.field private static final APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING:Ljava/lang/String; = "supports_implicit_sdk_logging"

.field public static final DEFAULT_STREAM_BUFFER_SIZE:I = 0x2000

.field private static final DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR:Ljava/lang/String; = "\\|"

.field private static final DIALOG_CONFIG_NAME_KEY:Ljava/lang/String; = "name"

.field private static final DIALOG_CONFIG_URL_KEY:Ljava/lang/String; = "url"

.field private static final DIALOG_CONFIG_VERSIONS_KEY:Ljava/lang/String; = "versions"

.field private static final EXTRA_APP_EVENTS_INFO_FORMAT_VERSION:Ljava/lang/String; = "a2"

.field private static final GINGERBREAD_MR1:I = 0xa

.field private static final HASH_ALGORITHM_MD5:Ljava/lang/String; = "MD5"

.field private static final HASH_ALGORITHM_SHA1:Ljava/lang/String; = "SHA-1"

.field static final LOG_TAG:Ljava/lang/String; = "FacebookSDK"

.field private static final REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS:I = 0x1b7740

.field private static final URL_SCHEME:Ljava/lang/String; = "https"

.field private static final UTF8:Ljava/lang/String; = "UTF-8"

.field private static availableExternalStorageGB:J = 0x0L

.field private static carrierName:Ljava/lang/String; = null

.field private static deviceTimezone:Ljava/lang/String; = null

.field private static fetchedAppSettings:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/Utility$FetchedAppSettings;",
            ">;"
        }
    .end annotation
.end field

.field private static loadingSettings:Ljava/util/concurrent/atomic/AtomicBoolean; = null

.field private static final noCarrierConstant:Ljava/lang/String; = "NoCarrier"

.field private static numCPUCores:I

.field private static timestampOfLastCheck:J

.field private static totalExternalStorageGB:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const-wide/16 v4, -0x1

    const/4 v3, 0x0

    .line 99
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    .line 100
    const-string v1, "supports_implicit_sdk_logging"

    aput-object v1, v0, v3

    const/4 v1, 0x1

    .line 101
    const-string v2, "gdpv4_nux_content"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 102
    const-string v2, "gdpv4_nux_enabled"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 103
    const-string v2, "android_dialog_configs"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 104
    const-string v2, "android_sdk_error_categories"

    aput-object v2, v0, v1

    .line 99
    sput-object v0, Lcom/facebook/internal/Utility;->APP_SETTING_FIELDS:[Ljava/lang/String;

    .line 120
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 119
    sput-object v0, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    .line 122
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/facebook/internal/Utility;->loadingSettings:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 124
    sput v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    .line 126
    sput-wide v4, Lcom/facebook/internal/Utility;->timestampOfLastCheck:J

    .line 127
    sput-wide v4, Lcom/facebook/internal/Utility;->totalExternalStorageGB:J

    .line 128
    sput-wide v4, Lcom/facebook/internal/Utility;->availableExternalStorageGB:J

    .line 129
    const-string v0, ""

    sput-object v0, Lcom/facebook/internal/Utility;->deviceTimezone:Ljava/lang/String;

    .line 130
    const-string v0, "NoCarrier"

    sput-object v0, Lcom/facebook/internal/Utility;->carrierName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 863
    invoke-static {p0}, Lcom/facebook/internal/Utility;->getAppSettingsQueryResponse(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    .locals 1

    .prologue
    .line 837
    invoke-static {p0, p1}, Lcom/facebook/internal/Utility;->parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lcom/facebook/internal/Utility;->loadingSettings:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public static areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)Z"
        }
    .end annotation

    .prologue
    .line 743
    .local p0, "a":Ljava/lang/Object;, "TT;"
    .local p1, "b":Ljava/lang/Object;, "TT;"
    if-nez p0, :cond_1

    .line 744
    if-nez p1, :cond_0

    const/4 v0, 0x1

    .line 746
    :goto_0
    return v0

    .line 744
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 746
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public static varargs arrayList([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4
    .param p0, "ts"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/ArrayList",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 401
    new-instance v0, Ljava/util/ArrayList;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 402
    .local v0, "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<TT;>;"
    array-length v3, p0

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v3, :cond_0

    .line 405
    return-object v0

    .line 402
    :cond_0
    aget-object v1, p0, v2

    .line 403
    .local v1, "t":Ljava/lang/Object;, "TT;"
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static varargs asListNoNulls([Ljava/lang/Object;)Ljava/util/List;
    .locals 4
    .param p0, "array"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 951
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 952
    .local v0, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<TT;>;"
    array-length v3, p0

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v3, :cond_0

    .line 957
    return-object v0

    .line 952
    :cond_0
    aget-object v1, p0, v2

    .line 953
    .local v1, "t":Ljava/lang/Object;, "TT;"
    if-eqz v1, :cond_1

    .line 954
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static awaitGetGraphMeRequestWithCache(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4
    .param p0, "accessToken"    # Ljava/lang/String;

    .prologue
    .line 1289
    invoke-static {p0}, Lcom/facebook/internal/ProfileInformationCache;->getProfileInformation(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1290
    .local v0, "cachedValue":Lorg/json/JSONObject;
    if-eqz v0, :cond_0

    .line 1300
    .end local v0    # "cachedValue":Lorg/json/JSONObject;
    :goto_0
    return-object v0

    .line 1294
    .restart local v0    # "cachedValue":Lorg/json/JSONObject;
    :cond_0
    invoke-static {p0}, Lcom/facebook/internal/Utility;->getGraphMeRequestWithCache(Ljava/lang/String;)Lcom/facebook/GraphRequest;

    move-result-object v1

    .line 1295
    .local v1, "graphRequest":Lcom/facebook/GraphRequest;
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->executeAndWait()Lcom/facebook/GraphResponse;

    move-result-object v2

    .line 1296
    .local v2, "response":Lcom/facebook/GraphResponse;
    invoke-virtual {v2}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 1297
    const/4 v0, 0x0

    goto :goto_0

    .line 1300
    :cond_1
    invoke-virtual {v2}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0
.end method

.method public static buildUri(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;
    .locals 5
    .param p0, "authority"    # Ljava/lang/String;
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "parameters"    # Landroid/os/Bundle;

    .prologue
    .line 454
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 455
    .local v0, "builder":Landroid/net/Uri$Builder;
    const-string v3, "https"

    invoke-virtual {v0, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 456
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 457
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 458
    if-eqz p2, :cond_1

    .line 459
    invoke-virtual {p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    .line 466
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    return-object v3

    .line 459
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 460
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 461
    .local v2, "parameter":Ljava/lang/Object;
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 462
    check-cast v2, Ljava/lang/String;

    .end local v2    # "parameter":Ljava/lang/Object;
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0
.end method

.method public static clearCaches(Landroid/content/Context;)V
    .locals 0
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 934
    invoke-static {p0}, Lcom/facebook/internal/ImageDownloader;->clearCache(Landroid/content/Context;)V

    .line 935
    return-void
.end method

.method private static clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "domain"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x0

    .line 692
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object v6

    .line 693
    .local v6, "syncManager":Landroid/webkit/CookieSyncManager;
    invoke-virtual {v6}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 695
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v1

    .line 697
    .local v1, "cookieManager":Landroid/webkit/CookieManager;
    invoke-virtual {v1, p1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 698
    .local v3, "cookies":Ljava/lang/String;
    if-nez v3, :cond_0

    .line 712
    :goto_0
    return-void

    .line 702
    :cond_0
    const-string v7, ";"

    invoke-virtual {v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 703
    .local v5, "splitCookies":[Ljava/lang/String;
    array-length v9, v5

    move v7, v8

    :goto_1
    if-lt v7, v9, :cond_1

    .line 711
    invoke-virtual {v1}, Landroid/webkit/CookieManager;->removeExpiredCookie()V

    goto :goto_0

    .line 703
    :cond_1
    aget-object v0, v5, v7

    .line 704
    .local v0, "cookie":Ljava/lang/String;
    const-string v10, "="

    invoke-virtual {v0, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 705
    .local v2, "cookieParts":[Ljava/lang/String;
    array-length v10, v2

    if-lez v10, :cond_2

    .line 706
    new-instance v10, Ljava/lang/StringBuilder;

    aget-object v11, v2, v8

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 707
    const-string v11, "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 706
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 708
    .local v4, "newCookie":Ljava/lang/String;
    invoke-virtual {v1, p1, v4}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 703
    .end local v4    # "newCookie":Ljava/lang/String;
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1
.end method

.method public static clearFacebookCookies(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 718
    const-string v0, "facebook.com"

    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V

    .line 719
    const-string v0, ".facebook.com"

    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V

    .line 720
    const-string v0, "https://facebook.com"

    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V

    .line 721
    const-string v0, "https://.facebook.com"

    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V

    .line 722
    return-void
.end method

.method public static closeQuietly(Ljava/io/Closeable;)V
    .locals 1
    .param p0, "closeable"    # Ljava/io/Closeable;

    .prologue
    .line 555
    if-eqz p0, :cond_0

    .line 556
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 561
    :cond_0
    :goto_0
    return-void

    .line 558
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "s"    # Ljava/lang/String;
    .param p1, "valueIfNullOrEmpty"    # Ljava/lang/String;

    .prologue
    .line 389
    invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    .end local p1    # "valueIfNullOrEmpty":Ljava/lang/String;
    :goto_0
    return-object p1

    .restart local p1    # "valueIfNullOrEmpty":Ljava/lang/String;
    :cond_0
    move-object p1, p0

    goto :goto_0
.end method

.method private static convertBytesToGB(D)J
    .locals 2
    .param p0, "bytes"    # D

    .prologue
    .line 1432
    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    div-double v0, p0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    return-wide v0
.end method

.method static convertJSONObjectToHashMap(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 6
    .param p0, "jsonObject"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 578
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 579
    .local v3, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {p0}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v2

    .line 580
    .local v2, "keys":Lorg/json/JSONArray;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-lt v0, v5, :cond_0

    .line 592
    return-object v3

    .line 583
    :cond_0
    :try_start_0
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 584
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 585
    .local v4, "value":Ljava/lang/Object;
    instance-of v5, v4, Lorg/json/JSONObject;

    if-eqz v5, :cond_1

    .line 586
    check-cast v4, Lorg/json/JSONObject;

    .end local v4    # "value":Ljava/lang/Object;
    invoke-static {v4}, Lcom/facebook/internal/Utility;->convertJSONObjectToHashMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v4

    .line 588
    :cond_1
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 580
    .end local v1    # "key":Ljava/lang/String;
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 589
    :catch_0
    move-exception v5

    goto :goto_1
.end method

.method public static copyAndCloseInputStream(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 6
    .param p0, "inputStream"    # Ljava/io/InputStream;
    .param p1, "outputStream"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 650
    const/4 v1, 0x0

    .line 651
    .local v1, "bufferedInputStream":Ljava/io/BufferedInputStream;
    const/4 v4, 0x0

    .line 653
    .local v4, "totalBytes":I
    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 655
    .end local v1    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .local v2, "bufferedInputStream":Ljava/io/BufferedInputStream;
    const/16 v5, 0x2000

    :try_start_1
    new-array v0, v5, [B

    .line 657
    .local v0, "buffer":[B
    :goto_0
    invoke-virtual {v2, v0}, Ljava/io/BufferedInputStream;->read([B)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v3

    .local v3, "bytesRead":I
    const/4 v5, -0x1

    if-ne v3, v5, :cond_2

    .line 662
    if-eqz v2, :cond_0

    .line 663
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 665
    :cond_0
    if-eqz p0, :cond_1

    .line 666
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 670
    :cond_1
    return v4

    .line 658
    :cond_2
    const/4 v5, 0x0

    :try_start_2
    invoke-virtual {p1, v0, v5, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 659
    add-int/2addr v4, v3

    goto :goto_0

    .line 661
    .end local v0    # "buffer":[B
    .end local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .end local v3    # "bytesRead":I
    .restart local v1    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    :catchall_0
    move-exception v5

    .line 662
    :goto_1
    if-eqz v1, :cond_3

    .line 663
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    .line 665
    :cond_3
    if-eqz p0, :cond_4

    .line 666
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 668
    :cond_4
    throw v5

    .line 661
    .end local v1    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .restart local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    :catchall_1
    move-exception v5

    move-object v1, v2

    .end local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .restart local v1    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    goto :goto_1
.end method

.method public static deleteDirectory(Ljava/io/File;)V
    .locals 4
    .param p0, "directoryOrFile"    # Ljava/io/File;

    .prologue
    .line 938
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 948
    :goto_0
    return-void

    .line 942
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 943
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    array-length v3, v2

    const/4 v1, 0x0

    :goto_1
    if-lt v1, v3, :cond_2

    .line 947
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 943
    :cond_2
    aget-object v0, v2, v1

    .line 944
    .local v0, "child":Ljava/io/File;
    invoke-static {v0}, Lcom/facebook/internal/Utility;->deleteDirectory(Ljava/io/File;)V

    .line 943
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public static disconnectQuietly(Ljava/net/URLConnection;)V
    .locals 1
    .param p0, "connection"    # Ljava/net/URLConnection;

    .prologue
    .line 564
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 565
    check-cast p0, Ljava/net/HttpURLConnection;

    .end local p0    # "connection":Ljava/net/URLConnection;
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 567
    :cond_0
    return-void
.end method

.method private static externalStorageExists()Z
    .locals 2

    .prologue
    .line 1396
    const-string v0, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static filter(Ljava/util/List;Lcom/facebook/internal/Utility$Predicate;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TT;>;",
            "Lcom/facebook/internal/Utility$Predicate",
            "<TT;>;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .local p0, "target":Ljava/util/List;, "Ljava/util/List<TT;>;"
    .local p1, "predicate":Lcom/facebook/internal/Utility$Predicate;, "Lcom/facebook/internal/Utility$Predicate<TT;>;"
    const/4 v2, 0x0

    .line 1132
    if-nez p0, :cond_0

    .line 1141
    :goto_0
    return-object v2

    .line 1135
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1136
    .local v1, "list":Ljava/util/List;, "Ljava/util/List<TT;>;"
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    .line 1141
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_2

    move-object v1, v2

    .end local v1    # "list":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_2
    move-object v2, v1

    goto :goto_0

    .line 1136
    .restart local v1    # "list":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Object;

    .line 1137
    .local v0, "item":Ljava/lang/Object;, "TT;"
    invoke-interface {p1, v0}, Lcom/facebook/internal/Utility$Predicate;->apply(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1138
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public static getActivityName(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 1118
    if-nez p0, :cond_0

    .line 1119
    const-string v0, "null"

    .line 1123
    :goto_0
    return-object v0

    .line 1120
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-ne p0, v0, :cond_1

    .line 1121
    const-string v0, "unknown"

    goto :goto_0

    .line 1123
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static getAppSettingsQueryResponse(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6
    .param p0, "applicationId"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x0

    .line 864
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 865
    .local v0, "appSettingsParams":Landroid/os/Bundle;
    const-string v2, "fields"

    const-string v3, ","

    sget-object v4, Lcom/facebook/internal/Utility;->APP_SETTING_FIELDS:[Ljava/lang/String;

    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 867
    invoke-static {v5, p0, v5}, Lcom/facebook/GraphRequest;->newGraphPathRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v1

    .line 868
    .local v1, "request":Lcom/facebook/GraphRequest;
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/GraphRequest;->setSkipClientToken(Z)V

    .line 869
    invoke-virtual {v1, v0}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 871
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->executeAndWait()Lcom/facebook/GraphResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v2

    return-object v2
.end method

.method public static getAppSettingsWithoutQuery(Ljava/lang/String;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    .locals 1
    .param p0, "applicationId"    # Ljava/lang/String;

    .prologue
    .line 816
    if-eqz p0, :cond_0

    sget-object v0, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/internal/Utility$FetchedAppSettings;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getBundleLongAsDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;
    .locals 10
    .param p0, "bundle"    # Landroid/os/Bundle;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "dateBase"    # Ljava/util/Date;

    .prologue
    const/4 v4, 0x0

    .line 1199
    if-nez p0, :cond_1

    .line 1221
    :cond_0
    :goto_0
    return-object v4

    .line 1203
    :cond_1
    const-wide/high16 v2, -0x8000000000000000L

    .line 1205
    .local v2, "secondsFromBase":J
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 1206
    .local v1, "secondsObject":Ljava/lang/Object;
    instance-of v5, v1, Ljava/lang/Long;

    if-eqz v5, :cond_2

    .line 1207
    check-cast v1, Ljava/lang/Long;

    .end local v1    # "secondsObject":Ljava/lang/Object;
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 1218
    :goto_1
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_3

    .line 1219
    new-instance v4, Ljava/util/Date;

    const-wide v6, 0x7fffffffffffffffL

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 1208
    .restart local v1    # "secondsObject":Ljava/lang/Object;
    :cond_2
    instance-of v5, v1, Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 1210
    :try_start_0
    check-cast v1, Ljava/lang/String;

    .end local v1    # "secondsObject":Ljava/lang/Object;
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    goto :goto_1

    .line 1211
    :catch_0
    move-exception v0

    .line 1212
    .local v0, "e":Ljava/lang/NumberFormatException;
    goto :goto_0

    .line 1221
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    :cond_3
    new-instance v4, Ljava/util/Date;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    mul-long/2addr v8, v2

    add-long/2addr v6, v8

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    goto :goto_0
.end method

.method public static getContentSize(Landroid/net/Uri;)J
    .locals 8
    .param p0, "contentUri"    # Landroid/net/Uri;

    .prologue
    .line 1181
    const/4 v6, 0x0

    .line 1184
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 1185
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 1186
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1187
    const-string v0, "_size"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 1189
    .local v7, "sizeIndex":I
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 1190
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 1192
    if-eqz v6, :cond_0

    .line 1193
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1190
    :cond_0
    return-wide v0

    .line 1191
    .end local v7    # "sizeIndex":I
    :catchall_0
    move-exception v0

    .line 1192
    if-eqz v6, :cond_1

    .line 1193
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1195
    :cond_1
    throw v0
.end method

.method public static getDialogFeatureConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    .locals 4
    .param p0, "applicationId"    # Ljava/lang/String;
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "featureName"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 878
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 890
    :cond_0
    :goto_0
    return-object v2

    .line 882
    :cond_1
    sget-object v3, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/internal/Utility$FetchedAppSettings;

    .line 883
    .local v1, "settings":Lcom/facebook/internal/Utility$FetchedAppSettings;
    if-eqz v1, :cond_0

    .line 885
    invoke-virtual {v1}, Lcom/facebook/internal/Utility$FetchedAppSettings;->getDialogConfigurations()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 886
    .local v0, "featureMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/facebook/internal/Utility$DialogFeatureConfig;>;"
    if-eqz v0, :cond_0

    .line 887
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/internal/Utility$DialogFeatureConfig;

    goto :goto_0
.end method

.method private static getGraphMeRequestWithCache(Ljava/lang/String;)Lcom/facebook/GraphRequest;
    .locals 6
    .param p0, "accessToken"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 1305
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1306
    .local v3, "parameters":Landroid/os/Bundle;
    const-string v2, "fields"

    const-string v4, "id,name,first_name,middle_name,last_name,link"

    invoke-virtual {v3, v2, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1307
    const-string v2, "access_token"

    invoke-virtual {v3, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1308
    new-instance v0, Lcom/facebook/GraphRequest;

    .line 1310
    const-string v2, "me"

    .line 1312
    sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;

    move-object v5, v1

    .line 1308
    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    .line 1314
    .local v0, "graphRequest":Lcom/facebook/GraphRequest;
    return-object v0
.end method

.method public static getGraphMeRequestWithCacheAsync(Ljava/lang/String;Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;)V
    .locals 3
    .param p0, "accessToken"    # Ljava/lang/String;
    .param p1, "callback"    # Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;

    .prologue
    .line 1263
    invoke-static {p0}, Lcom/facebook/internal/ProfileInformationCache;->getProfileInformation(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1264
    .local v0, "cachedValue":Lorg/json/JSONObject;
    if-eqz v0, :cond_0

    .line 1265
    invoke-interface {p1, v0}, Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;->onSuccess(Lorg/json/JSONObject;)V

    .line 1285
    :goto_0
    return-void

    .line 1269
    :cond_0
    new-instance v1, Lcom/facebook/internal/Utility$2;

    invoke-direct {v1, p1, p0}, Lcom/facebook/internal/Utility$2;-><init>(Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;Ljava/lang/String;)V

    .line 1282
    .local v1, "graphCallback":Lcom/facebook/GraphRequest$Callback;
    invoke-static {p0}, Lcom/facebook/internal/Utility;->getGraphMeRequestWithCache(Ljava/lang/String;)Lcom/facebook/GraphRequest;

    move-result-object v2

    .line 1283
    .local v2, "graphRequest":Lcom/facebook/GraphRequest;
    invoke-virtual {v2, v1}, Lcom/facebook/GraphRequest;->setCallback(Lcom/facebook/GraphRequest$Callback;)V

    .line 1284
    invoke-virtual {v2}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    goto :goto_0
.end method

.method public static getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 570
    const-string v0, "context"

    invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 572
    invoke-static {p0}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 574
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2
    .param p1, "methodName"    # Ljava/lang/String;
    .param p2, "parameterTypes"    # [Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    .line 1085
    .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 1087
    :goto_0
    return-object v1

    .line 1086
    :catch_0
    move-exception v0

    .line 1087
    .local v0, "ex":Ljava/lang/NoSuchMethodException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static varargs getMethodQuietly(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .param p0, "className"    # Ljava/lang/String;
    .param p1, "methodName"    # Ljava/lang/String;
    .param p2, "parameterTypes"    # [Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    .line 1096
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 1097
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {v0, p1, p2}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 1099
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    return-object v2

    .line 1098
    :catch_0
    move-exception v1

    .line 1099
    .local v1, "ex":Ljava/lang/ClassNotFoundException;
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .param p0, "jsonObject"    # Lorg/json/JSONObject;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "nonJSONPropertyKey"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 602
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 603
    .local v1, "value":Ljava/lang/Object;
    if-eqz v1, :cond_0

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 604
    new-instance v0, Lorg/json/JSONTokener;

    check-cast v1, Ljava/lang/String;

    .end local v1    # "value":Ljava/lang/Object;
    invoke-direct {v0, v1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 605
    .local v0, "tokener":Lorg/json/JSONTokener;
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v1

    .line 608
    .end local v0    # "tokener":Lorg/json/JSONTokener;
    .restart local v1    # "value":Ljava/lang/Object;
    :cond_0
    if-eqz v1, :cond_2

    instance-of v2, v1, Lorg/json/JSONObject;

    if-nez v2, :cond_2

    instance-of v2, v1, Lorg/json/JSONArray;

    if-nez v2, :cond_2

    .line 609
    if-eqz p2, :cond_1

    .line 614
    new-instance p0, Lorg/json/JSONObject;

    .end local p0    # "jsonObject":Lorg/json/JSONObject;
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 615
    .restart local p0    # "jsonObject":Lorg/json/JSONObject;
    invoke-virtual {p0, p2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 622
    .end local p0    # "jsonObject":Lorg/json/JSONObject;
    :goto_0
    return-object p0

    .line 618
    .restart local p0    # "jsonObject":Lorg/json/JSONObject;
    :cond_1
    new-instance v2, Lcom/facebook/FacebookException;

    const-string v3, "Got an unexpected non-JSON object."

    invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    move-object p0, v1

    .line 622
    goto :goto_0
.end method

.method public static getUriString(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1
    .param p0, "uri"    # Landroid/net/Uri;

    .prologue
    .line 1163
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static hasSameId(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z
    .locals 4
    .param p0, "a"    # Lorg/json/JSONObject;
    .param p1, "b"    # Lorg/json/JSONObject;

    .prologue
    const/4 v2, 0x0

    .line 750
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v3, "id"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "id"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 761
    :cond_0
    :goto_0
    return v2

    .line 753
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 754
    const/4 v2, 0x1

    goto :goto_0

    .line 756
    :cond_2
    const-string v3, "id"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 757
    .local v0, "idA":Ljava/lang/String;
    const-string v3, "id"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 758
    .local v1, "idB":Ljava/lang/String;
    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 761
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0
.end method

.method private static hashBytes(Ljava/security/MessageDigest;[B)Ljava/lang/String;
    .locals 6
    .param p0, "hash"    # Ljava/security/MessageDigest;
    .param p1, "bytes"    # [B

    .prologue
    .line 443
    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 444
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    .line 445
    .local v2, "digest":[B
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 446
    .local v1, "builder":Ljava/lang/StringBuilder;
    array-length v4, v2

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v4, :cond_0

    .line 450
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 446
    :cond_0
    aget-byte v0, v2, v3

    .line 447
    .local v0, "b":I
    shr-int/lit8 v5, v0, 0x4

    and-int/lit8 v5, v5, 0xf

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    shr-int/lit8 v5, v0, 0x0

    and-int/lit8 v5, v5, 0xf

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public static varargs hashSet([Ljava/lang/Object;)Ljava/util/HashSet;
    .locals 4
    .param p0, "ts"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/HashSet",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 409
    new-instance v0, Ljava/util/HashSet;

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 410
    .local v0, "hashSet":Ljava/util/HashSet;, "Ljava/util/HashSet<TT;>;"
    array-length v3, p0

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v3, :cond_0

    .line 413
    return-object v0

    .line 410
    :cond_0
    aget-object v1, p0, v2

    .line 411
    .local v1, "t":Ljava/lang/Object;, "TT;"
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 410
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private static hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "algorithm"    # Ljava/lang/String;
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 429
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 3
    .param p0, "algorithm"    # Ljava/lang/String;
    .param p1, "bytes"    # [B

    .prologue
    .line 435
    :try_start_0
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 439
    .local v1, "hash":Ljava/security/MessageDigest;
    invoke-static {v1, p1}, Lcom/facebook/internal/Utility;->hashBytes(Ljava/security/MessageDigest;[B)Ljava/lang/String;

    move-result-object v2

    .end local v1    # "hash":Ljava/security/MessageDigest;
    :goto_0
    return-object v2

    .line 436
    :catch_0
    move-exception v0

    .line 437
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static intersectRanges([I[I)[I
    .locals 13
    .param p0, "range1"    # [I
    .param p1, "range2"    # [I

    .prologue
    .line 287
    if-nez p0, :cond_0

    .line 351
    .end local p1    # "range2":[I
    :goto_0
    return-object p1

    .line 289
    .restart local p1    # "range2":[I
    :cond_0
    if-nez p1, :cond_1

    move-object p1, p0

    .line 290
    goto :goto_0

    .line 293
    :cond_1
    array-length v11, p0

    array-length v12, p1

    add-int/2addr v11, v12

    new-array v8, v11, [I

    .line 294
    .local v8, "outputRange":[I
    const/4 v6, 0x0

    .line 295
    .local v6, "outputIndex":I
    const/4 v0, 0x0

    .line 296
    .local v0, "index1":I
    const/4 v1, 0x0

    .line 297
    .local v1, "index2":I
    :cond_2
    :goto_1
    array-length v11, p0

    if-ge v0, v11, :cond_3

    array-length v11, p1

    if-lt v1, v11, :cond_4

    .line 351
    :cond_3
    :goto_2
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    goto :goto_0

    .line 298
    :cond_4
    const/high16 v4, -0x80000000

    .local v4, "newRangeLower":I
    const v5, 0x7fffffff

    .line 299
    .local v5, "newRangeUpper":I
    aget v2, p0, v0

    .line 300
    .local v2, "lower1":I
    const v9, 0x7fffffff

    .line 302
    .local v9, "upper1":I
    aget v3, p1, v1

    .line 303
    .local v3, "lower2":I
    const v10, 0x7fffffff

    .line 305
    .local v10, "upper2":I
    array-length v11, p0

    add-int/lit8 v11, v11, -0x1

    if-ge v0, v11, :cond_5

    .line 306
    add-int/lit8 v11, v0, 0x1

    aget v9, p0, v11

    .line 308
    :cond_5
    array-length v11, p1

    add-int/lit8 v11, v11, -0x1

    if-ge v1, v11, :cond_6

    .line 309
    add-int/lit8 v11, v1, 0x1

    aget v10, p1, v11

    .line 312
    :cond_6
    if-ge v2, v3, :cond_9

    .line 313
    if-le v9, v3, :cond_8

    .line 314
    move v4, v3

    .line 315
    if-le v9, v10, :cond_7

    .line 316
    move v5, v10

    .line 317
    add-int/lit8 v1, v1, 0x2

    .line 340
    :goto_3
    const/high16 v11, -0x80000000

    if-eq v4, v11, :cond_2

    .line 341
    add-int/lit8 v7, v6, 0x1

    .end local v6    # "outputIndex":I
    .local v7, "outputIndex":I
    aput v4, v8, v6

    .line 342
    const v11, 0x7fffffff

    if-eq v5, v11, :cond_c

    .line 343
    add-int/lit8 v6, v7, 0x1

    .end local v7    # "outputIndex":I
    .restart local v6    # "outputIndex":I
    aput v5, v8, v7

    goto :goto_1

    .line 319
    :cond_7
    move v5, v9

    .line 320
    add-int/lit8 v0, v0, 0x2

    .line 322
    goto :goto_3

    .line 323
    :cond_8
    add-int/lit8 v0, v0, 0x2

    .line 325
    goto :goto_3

    .line 326
    :cond_9
    if-le v10, v2, :cond_b

    .line 327
    move v4, v2

    .line 328
    if-le v10, v9, :cond_a

    .line 329
    move v5, v9

    .line 330
    add-int/lit8 v0, v0, 0x2

    .line 331
    goto :goto_3

    .line 332
    :cond_a
    move v5, v10

    .line 333
    add-int/lit8 v1, v1, 0x2

    .line 335
    goto :goto_3

    .line 336
    :cond_b
    add-int/lit8 v1, v1, 0x2

    goto :goto_3

    .end local v6    # "outputIndex":I
    .restart local v7    # "outputIndex":I
    :cond_c
    move v6, v7

    .end local v7    # "outputIndex":I
    .restart local v6    # "outputIndex":I
    goto :goto_2
.end method

.method public static varargs invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p0, "receiver"    # Ljava/lang/Object;
    .param p1, "method"    # Ljava/lang/reflect/Method;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 1105
    :try_start_0
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 1109
    :goto_0
    return-object v1

    .line 1106
    :catch_0
    move-exception v0

    .line 1107
    .local v0, "ex":Ljava/lang/IllegalAccessException;
    goto :goto_0

    .line 1108
    .end local v0    # "ex":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 1109
    .local v0, "ex":Ljava/lang/reflect/InvocationTargetException;
    goto :goto_0
.end method

.method public static isContentUri(Landroid/net/Uri;)Z
    .locals 2
    .param p0, "uri"    # Landroid/net/Uri;

    .prologue
    .line 1173
    if-eqz p0, :cond_0

    const-string v0, "content"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isCurrentAccessToken(Lcom/facebook/AccessToken;)Z
    .locals 1
    .param p0, "token"    # Lcom/facebook/AccessToken;

    .prologue
    .line 1251
    if-eqz p0, :cond_0

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/AccessToken;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isFileUri(Landroid/net/Uri;)Z
    .locals 2
    .param p0, "uri"    # Landroid/net/Uri;

    .prologue
    .line 1177
    if-eqz p0, :cond_0

    const-string v0, "file"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isNullOrEmpty(Ljava/lang/String;)Z
    .locals 1
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 376
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static isNullOrEmpty(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .line 372
    .local p0, "c":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static isSubset(Ljava/util/Collection;Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;",
            "Ljava/util/Collection",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .local p0, "subset":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    .local p1, "superset":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 358
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    if-nez v4, :cond_2

    .line 359
    :cond_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v4

    if-eqz v4, :cond_1

    .line 368
    :goto_0
    return v2

    :cond_1
    move v2, v3

    .line 359
    goto :goto_0

    .line 362
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 363
    .local v0, "hash":Ljava/util/HashSet;, "Ljava/util/HashSet<TT;>;"
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    move v2, v3

    .line 368
    goto :goto_0

    .line 363
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Object;

    .line 364
    .local v1, "t":Ljava/lang/Object;, "TT;"
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0
.end method

.method public static isWebUri(Landroid/net/Uri;)Z
    .locals 2
    .param p0, "uri"    # Landroid/net/Uri;

    .prologue
    .line 1167
    if-eqz p0, :cond_1

    .line 1168
    const-string v0, "http"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1169
    const-string v0, "https"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1167
    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static jsonArrayToSet(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 3
    .param p0, "jsonArray"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 971
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 972
    .local v1, "result":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 976
    return-object v1

    .line 973
    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 972
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static jsonArrayToStringList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3
    .param p0, "jsonArray"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 961
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 963
    .local v1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 967
    return-object v1

    .line 964
    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 963
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static loadAppSettingsAsync(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "applicationId"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 768
    sget-object v7, Lcom/facebook/internal/Utility;->loadingSettings:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v7, v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    .line 769
    .local v0, "canStartLoading":Z
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 770
    sget-object v7, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    invoke-interface {v7, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 771
    if-nez v0, :cond_1

    .line 812
    :cond_0
    :goto_0
    return-void

    .line 775
    :cond_1
    const-string v7, "com.facebook.internal.APP_SETTINGS.%s"

    new-array v8, v8, [Ljava/lang/Object;

    aput-object p1, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 777
    .local v5, "settingsKey":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/FacebookSdk;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v7

    new-instance v8, Lcom/facebook/internal/Utility$1;

    invoke-direct {v8, p1, p0, v5}, Lcom/facebook/internal/Utility$1;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 798
    const-string v7, "com.facebook.internal.preferences.APP_SETTINGS"

    .line 797
    invoke-virtual {p0, v7, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 800
    .local v6, "sharedPrefs":Landroid/content/SharedPreferences;
    const/4 v7, 0x0

    invoke-interface {v6, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 801
    .local v4, "settingsJSONString":Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 802
    const/4 v2, 0x0

    .line 804
    .local v2, "settingsJSON":Lorg/json/JSONObject;
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v2    # "settingsJSON":Lorg/json/JSONObject;
    .local v3, "settingsJSON":Lorg/json/JSONObject;
    move-object v2, v3

    .line 808
    .end local v3    # "settingsJSON":Lorg/json/JSONObject;
    .restart local v2    # "settingsJSON":Lorg/json/JSONObject;
    :goto_1
    if-eqz v2, :cond_0

    .line 809
    invoke-static {p1, v2}, Lcom/facebook/internal/Utility;->parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;

    goto :goto_0

    .line 805
    :catch_0
    move-exception v1

    .line 806
    .local v1, "je":Lorg/json/JSONException;
    const-string v7, "FacebookSDK"

    invoke-static {v7, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public static logd(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "e"    # Ljava/lang/Exception;

    .prologue
    .line 725
    invoke-static {}, Lcom/facebook/FacebookSdk;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 726
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 728
    :cond_0
    return-void
.end method

.method public static logd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 731
    invoke-static {}, Lcom/facebook/FacebookSdk;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 732
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 734
    :cond_0
    return-void
.end method

.method public static logd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 737
    invoke-static {}, Lcom/facebook/FacebookSdk;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 738
    invoke-static {p0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 740
    :cond_0
    return-void
.end method

.method public static map(Ljava/util/List;Lcom/facebook/internal/Utility$Mapper;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TT;>;",
            "Lcom/facebook/internal/Utility$Mapper",
            "<TT;TK;>;)",
            "Ljava/util/List",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .local p0, "target":Ljava/util/List;, "Ljava/util/List<TT;>;"
    .local p1, "mapper":Lcom/facebook/internal/Utility$Mapper;, "Lcom/facebook/internal/Utility$Mapper<TT;TK;>;"
    const/4 v3, 0x0

    .line 1149
    if-nez p0, :cond_0

    .line 1159
    :goto_0
    return-object v3

    .line 1152
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1153
    .local v1, "list":Ljava/util/List;, "Ljava/util/List<TK;>;"
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    .line 1159
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_2

    move-object v1, v3

    .end local v1    # "list":Ljava/util/List;, "Ljava/util/List<TK;>;"
    :cond_2
    move-object v3, v1

    goto :goto_0

    .line 1153
    .restart local v1    # "list":Ljava/util/List;, "Ljava/util/List<TK;>;"
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Object;

    .line 1154
    .local v0, "item":Ljava/lang/Object;, "TT;"
    invoke-interface {p1, v0}, Lcom/facebook/internal/Utility$Mapper;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1155
    .local v2, "mappedItem":Ljava/lang/Object;, "TK;"
    if-eqz v2, :cond_1

    .line 1156
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public static md5hash(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 417
    const-string v0, "MD5"

    invoke-static {v0, p0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    .locals 8
    .param p0, "applicationId"    # Ljava/lang/String;
    .param p1, "settingsJSON"    # Lorg/json/JSONObject;

    .prologue
    const/4 v4, 0x0

    .line 841
    const-string v1, "android_sdk_error_categories"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 843
    .local v7, "errorClassificationJSON":Lorg/json/JSONArray;
    if-nez v7, :cond_0

    .line 844
    invoke-static {}, Lcom/facebook/internal/FacebookRequestErrorClassification;->getDefaultErrorClassification()Lcom/facebook/internal/FacebookRequestErrorClassification;

    move-result-object v5

    .line 848
    .local v5, "errorClassification":Lcom/facebook/internal/FacebookRequestErrorClassification;
    :goto_0
    new-instance v0, Lcom/facebook/internal/Utility$FetchedAppSettings;

    .line 849
    const-string v1, "supports_implicit_sdk_logging"

    invoke-virtual {p1, v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 850
    const-string v2, "gdpv4_nux_content"

    const-string v3, ""

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 851
    const-string v3, "gdpv4_nux_enabled"

    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 852
    const-string v4, "android_dialog_configs"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/internal/Utility;->parseDialogConfigurations(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v4

    .line 848
    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/Utility$FetchedAppSettings;-><init>(ZLjava/lang/String;ZLjava/util/Map;Lcom/facebook/internal/FacebookRequestErrorClassification;Lcom/facebook/internal/Utility$FetchedAppSettings;)V

    .line 856
    .local v0, "result":Lcom/facebook/internal/Utility$FetchedAppSettings;
    sget-object v1, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    return-object v0

    .line 845
    .end local v0    # "result":Lcom/facebook/internal/Utility$FetchedAppSettings;
    .end local v5    # "errorClassification":Lcom/facebook/internal/FacebookRequestErrorClassification;
    :cond_0
    invoke-static {v7}, Lcom/facebook/internal/FacebookRequestErrorClassification;->createFromJSON(Lorg/json/JSONArray;)Lcom/facebook/internal/FacebookRequestErrorClassification;

    move-result-object v5

    goto :goto_0
.end method

.method private static parseDialogConfigurations(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 7
    .param p0, "dialogConfigResponse"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/Utility$DialogFeatureConfig;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 895
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 897
    .local v2, "dialogConfigMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lcom/facebook/internal/Utility$DialogFeatureConfig;>;>;"
    if-eqz p0, :cond_0

    .line 898
    const-string v6, "data"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 899
    .local v1, "dialogConfigData":Lorg/json/JSONArray;
    if-eqz v1, :cond_0

    .line 900
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-lt v5, v6, :cond_1

    .line 918
    .end local v1    # "dialogConfigData":Lorg/json/JSONArray;
    .end local v5    # "i":I
    :cond_0
    return-object v2

    .line 902
    .restart local v1    # "dialogConfigData":Lorg/json/JSONArray;
    .restart local v5    # "i":I
    :cond_1
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 901
    # invokes: Lcom/facebook/internal/Utility$DialogFeatureConfig;->parseDialogConfig(Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    invoke-static {v6}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->access$0(Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$DialogFeatureConfig;

    move-result-object v0

    .line 903
    .local v0, "dialogConfig":Lcom/facebook/internal/Utility$DialogFeatureConfig;
    if-nez v0, :cond_2

    .line 900
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 907
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getDialogName()Ljava/lang/String;

    move-result-object v3

    .line 908
    .local v3, "dialogName":Ljava/lang/String;
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    .line 909
    .local v4, "featureMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/facebook/internal/Utility$DialogFeatureConfig;>;"
    if-nez v4, :cond_3

    .line 910
    new-instance v4, Ljava/util/HashMap;

    .end local v4    # "featureMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/facebook/internal/Utility$DialogFeatureConfig;>;"
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 911
    .restart local v4    # "featureMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/facebook/internal/Utility$DialogFeatureConfig;>;"
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    :cond_3
    invoke-virtual {v0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getFeatureName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public static parseUrlQueryString(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 11
    .param p0, "queryString"    # Ljava/lang/String;

    .prologue
    const/4 v10, 0x1

    const/4 v5, 0x0

    .line 470
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 471
    .local v4, "params":Landroid/os/Bundle;
    invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 472
    const-string v6, "&"

    invoke-virtual {p0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 473
    .local v0, "array":[Ljava/lang/String;
    array-length v6, v0

    :goto_0
    if-lt v5, v6, :cond_1

    .line 492
    .end local v0    # "array":[Ljava/lang/String;
    :cond_0
    return-object v4

    .line 473
    .restart local v0    # "array":[Ljava/lang/String;
    :cond_1
    aget-object v3, v0, v5

    .line 474
    .local v3, "parameter":Ljava/lang/String;
    const-string v7, "="

    invoke-virtual {v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 477
    .local v2, "keyValuePair":[Ljava/lang/String;
    :try_start_0
    array-length v7, v2

    const/4 v8, 0x2

    if-ne v7, v8, :cond_3

    .line 479
    const/4 v7, 0x0

    aget-object v7, v2, v7

    const-string v8, "UTF-8"

    invoke-static {v7, v8}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 480
    const/4 v8, 0x1

    aget-object v8, v2, v8

    const-string v9, "UTF-8"

    invoke-static {v8, v9}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 478
    invoke-virtual {v4, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 481
    :cond_3
    array-length v7, v2

    if-ne v7, v10, :cond_2

    .line 483
    const/4 v7, 0x0

    aget-object v7, v2, v7

    const-string v8, "UTF-8"

    invoke-static {v7, v8}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 484
    const-string v8, ""

    .line 482
    invoke-virtual {v4, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 486
    :catch_0
    move-exception v1

    .line 488
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    const-string v7, "FacebookSDK"

    invoke-static {v7, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public static putCommaSeparatedStringList(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 5
    .param p0, "b"    # Landroid/os/Bundle;
    .param p1, "key"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 502
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    if-eqz p2, :cond_1

    .line 503
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 504
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    .line 508
    const-string v1, ""

    .line 509
    .local v1, "commaSeparated":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 510
    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 512
    :cond_0
    invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .end local v0    # "builder":Ljava/lang/StringBuilder;
    .end local v1    # "commaSeparated":Ljava/lang/String;
    :cond_1
    return-void

    .line 504
    .restart local v0    # "builder":Ljava/lang/StringBuilder;
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 505
    .local v2, "string":Ljava/lang/String;
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public static putJSONValueInBundle(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2
    .param p0, "bundle"    # Landroid/os/Bundle;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 523
    if-nez p2, :cond_0

    .line 524
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 550
    .end local p2    # "value":Ljava/lang/Object;
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 525
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_0
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 526
    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 527
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_1
    instance-of v0, p2, [Z

    if-eqz v0, :cond_2

    .line 528
    check-cast p2, [Z

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putBooleanArray(Ljava/lang/String;[Z)V

    goto :goto_0

    .line 529
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_2
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_3

    .line 530
    check-cast p2, Ljava/lang/Double;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    .line 531
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_3
    instance-of v0, p2, [D

    if-eqz v0, :cond_4

    .line 532
    check-cast p2, [D

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putDoubleArray(Ljava/lang/String;[D)V

    goto :goto_0

    .line 533
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_4
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 534
    check-cast p2, Ljava/lang/Integer;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 535
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_5
    instance-of v0, p2, [I

    if-eqz v0, :cond_6

    .line 536
    check-cast p2, [I

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    goto :goto_0

    .line 537
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_6
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_7

    .line 538
    check-cast p2, Ljava/lang/Long;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    .line 539
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_7
    instance-of v0, p2, [J

    if-eqz v0, :cond_8

    .line 540
    check-cast p2, [J

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V

    goto :goto_0

    .line 541
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_8
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 542
    check-cast p2, Ljava/lang/String;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 543
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_9
    instance-of v0, p2, Lorg/json/JSONArray;

    if-eqz v0, :cond_a

    .line 544
    check-cast p2, Lorg/json/JSONArray;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 545
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_a
    instance-of v0, p2, Lorg/json/JSONObject;

    if-eqz v0, :cond_b

    .line 546
    check-cast p2, Lorg/json/JSONObject;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 548
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_b
    const/4 v0, 0x0

    goto/16 :goto_1
.end method

.method public static putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "b"    # Landroid/os/Bundle;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 496
    invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 497
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    :cond_0
    return-void
.end method

.method public static putUri(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1
    .param p0, "b"    # Landroid/os/Bundle;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "uri"    # Landroid/net/Uri;

    .prologue
    .line 517
    if-eqz p2, :cond_0

    .line 518
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    :cond_0
    return-void
.end method

.method public static queryAppSettings(Ljava/lang/String;Z)Lcom/facebook/internal/Utility$FetchedAppSettings;
    .locals 2
    .param p0, "applicationId"    # Ljava/lang/String;
    .param p1, "forceRequery"    # Z

    .prologue
    .line 825
    if-nez p1, :cond_0

    sget-object v1, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 826
    sget-object v1, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/internal/Utility$FetchedAppSettings;

    .line 834
    :goto_0
    return-object v1

    .line 829
    :cond_0
    invoke-static {p0}, Lcom/facebook/internal/Utility;->getAppSettingsQueryResponse(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 830
    .local v0, "response":Lorg/json/JSONObject;
    if-nez v0, :cond_1

    .line 831
    const/4 v1, 0x0

    goto :goto_0

    .line 834
    :cond_1
    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;

    move-result-object v1

    goto :goto_0
.end method

.method public static readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 9
    .param p0, "inputStream"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 627
    const/4 v2, 0x0

    .line 628
    .local v2, "bufferedInputStream":Ljava/io/BufferedInputStream;
    const/4 v5, 0x0

    .line 630
    .local v5, "reader":Ljava/io/InputStreamReader;
    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 631
    .end local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .local v3, "bufferedInputStream":Ljava/io/BufferedInputStream;
    :try_start_1
    new-instance v6, Ljava/io/InputStreamReader;

    invoke-direct {v6, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 632
    .end local v5    # "reader":Ljava/io/InputStreamReader;
    .local v6, "reader":Ljava/io/InputStreamReader;
    :try_start_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 634
    .local v7, "stringBuilder":Ljava/lang/StringBuilder;
    const/16 v1, 0x800

    .line 635
    .local v1, "bufferSize":I
    const/16 v8, 0x800

    new-array v0, v8, [C

    .line 636
    .local v0, "buffer":[C
    const/4 v4, 0x0

    .line 637
    .local v4, "n":I
    :goto_0
    invoke-virtual {v6, v0}, Ljava/io/InputStreamReader;->read([C)I

    move-result v4

    const/4 v8, -0x1

    if-ne v4, v8, :cond_0

    .line 641
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v8

    .line 643
    invoke-static {v3}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 644
    invoke-static {v6}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 641
    return-object v8

    .line 638
    :cond_0
    const/4 v8, 0x0

    :try_start_3
    invoke-virtual {v7, v0, v8, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 642
    .end local v0    # "buffer":[C
    .end local v1    # "bufferSize":I
    .end local v4    # "n":I
    .end local v7    # "stringBuilder":Ljava/lang/StringBuilder;
    :catchall_0
    move-exception v8

    move-object v5, v6

    .end local v6    # "reader":Ljava/io/InputStreamReader;
    .restart local v5    # "reader":Ljava/io/InputStreamReader;
    move-object v2, v3

    .line 643
    .end local v3    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .restart local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    :goto_1
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 644
    invoke-static {v5}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 645
    throw v8

    .line 642
    :catchall_1
    move-exception v8

    goto :goto_1

    .end local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .restart local v3    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    :catchall_2
    move-exception v8

    move-object v2, v3

    .end local v3    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    .restart local v2    # "bufferedInputStream":Ljava/io/BufferedInputStream;
    goto :goto_1
.end method

.method public static readStringMapFromParcel(Landroid/os/Parcel;)Ljava/util/Map;
    .locals 5
    .param p0, "parcel"    # Landroid/os/Parcel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1239
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 1240
    .local v2, "size":I
    if-gez v2, :cond_1

    .line 1241
    const/4 v1, 0x0

    .line 1247
    :cond_0
    return-object v1

    .line 1243
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1244
    .local v1, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v2, :cond_0

    .line 1245
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1244
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static refreshAvailableExternalStorage()V
    .locals 6

    .prologue
    .line 1403
    :try_start_0
    invoke-static {}, Lcom/facebook/internal/Utility;->externalStorageExists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1404
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 1405
    .local v0, "path":Ljava/io/File;
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 1407
    .local v1, "stat":Landroid/os/StatFs;
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v4

    int-to-long v4, v4

    mul-long/2addr v2, v4

    .line 1406
    sput-wide v2, Lcom/facebook/internal/Utility;->availableExternalStorageGB:J

    .line 1410
    :cond_0
    sget-wide v2, Lcom/facebook/internal/Utility;->availableExternalStorageGB:J

    long-to-double v2, v2

    invoke-static {v2, v3}, Lcom/facebook/internal/Utility;->convertBytesToGB(D)J

    move-result-wide v2

    .line 1409
    sput-wide v2, Lcom/facebook/internal/Utility;->availableExternalStorageGB:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1414
    .end local v1    # "stat":Landroid/os/StatFs;
    :goto_0
    return-void

    .line 1411
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private static refreshBestGuessNumberOfCPUCores()I
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1323
    sget v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    if-lez v3, :cond_0

    .line 1324
    sget v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    .line 1354
    .local v2, "res":I
    :goto_0
    return v3

    .line 1329
    .end local v2    # "res":I
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xa

    if-gt v3, v4, :cond_1

    .line 1330
    sput v5, Lcom/facebook/internal/Utility;->numCPUCores:I

    .line 1331
    sget v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    goto :goto_0

    .line 1336
    :cond_1
    const/4 v2, 0x0

    .line 1337
    .restart local v2    # "res":I
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v3, "/sys/devices/system/cpu/"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1338
    .local v0, "cpuDir":Ljava/io/File;
    new-instance v3, Lcom/facebook/internal/Utility$3;

    invoke-direct {v3}, Lcom/facebook/internal/Utility$3;-><init>()V

    invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 1345
    .local v1, "cpuFiles":[Ljava/io/File;
    array-length v3, v1

    sput v3, Lcom/facebook/internal/Utility;->numCPUCores:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1351
    .end local v0    # "cpuDir":Ljava/io/File;
    .end local v1    # "cpuFiles":[Ljava/io/File;
    :goto_1
    sget v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    if-gtz v3, :cond_2

    .line 1352
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    sput v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    .line 1354
    :cond_2
    sget v3, Lcom/facebook/internal/Utility;->numCPUCores:I

    goto :goto_0

    .line 1346
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method private static refreshCarrierName(Landroid/content/Context;)V
    .locals 3
    .param p0, "appContext"    # Landroid/content/Context;

    .prologue
    .line 1382
    sget-object v1, Lcom/facebook/internal/Utility;->carrierName:Ljava/lang/String;

    const-string v2, "NoCarrier"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1385
    :try_start_0
    const-string v1, "phone"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 1386
    .local v0, "telephonyManager":Landroid/telephony/TelephonyManager;
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/facebook/internal/Utility;->carrierName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1390
    .end local v0    # "telephonyManager":Landroid/telephony/TelephonyManager;
    :cond_0
    :goto_0
    return-void

    .line 1387
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private static refreshPeriodicExtendedDeviceInfo(Landroid/content/Context;)V
    .locals 4
    .param p0, "appContext"    # Landroid/content/Context;

    .prologue
    .line 1358
    sget-wide v0, Lcom/facebook/internal/Utility;->timestampOfLastCheck:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 1359
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lcom/facebook/internal/Utility;->timestampOfLastCheck:J

    sub-long/2addr v0, v2

    .line 1360
    const-wide/32 v2, 0x1b7740

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 1361
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/facebook/internal/Utility;->timestampOfLastCheck:J

    .line 1362
    invoke-static {}, Lcom/facebook/internal/Utility;->refreshTimezone()V

    .line 1363
    invoke-static {p0}, Lcom/facebook/internal/Utility;->refreshCarrierName(Landroid/content/Context;)V

    .line 1364
    invoke-static {}, Lcom/facebook/internal/Utility;->refreshTotalExternalStorage()V

    .line 1365
    invoke-static {}, Lcom/facebook/internal/Utility;->refreshAvailableExternalStorage()V

    .line 1367
    :cond_1
    return-void
.end method

.method private static refreshTimezone()V
    .locals 3

    .prologue
    .line 1371
    :try_start_0
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    .line 1372
    .local v0, "tz":Ljava/util/TimeZone;
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/facebook/internal/Utility;->deviceTimezone:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1375
    :goto_0
    return-void

    .line 1373
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private static refreshTotalExternalStorage()V
    .locals 6

    .prologue
    .line 1420
    :try_start_0
    invoke-static {}, Lcom/facebook/internal/Utility;->externalStorageExists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1421
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 1422
    .local v0, "path":Ljava/io/File;
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 1423
    .local v1, "stat":Landroid/os/StatFs;
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v4

    int-to-long v4, v4

    mul-long/2addr v2, v4

    sput-wide v2, Lcom/facebook/internal/Utility;->totalExternalStorageGB:J

    .line 1425
    :cond_0
    sget-wide v2, Lcom/facebook/internal/Utility;->totalExternalStorageGB:J

    long-to-double v2, v2

    invoke-static {v2, v3}, Lcom/facebook/internal/Utility;->convertBytesToGB(D)J

    move-result-wide v2

    sput-wide v2, Lcom/facebook/internal/Utility;->totalExternalStorageGB:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1429
    .end local v1    # "stat":Landroid/os/StatFs;
    :goto_0
    return-void

    .line 1426
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public static safeGetStringFromResponse(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "response"    # Lorg/json/JSONObject;
    .param p1, "propertyName"    # Ljava/lang/String;

    .prologue
    .line 922
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public static setAppEventAttributionParameters(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V
    .locals 4
    .param p0, "params"    # Lorg/json/JSONObject;
    .param p1, "attributionIdentifiers"    # Lcom/facebook/internal/AttributionIdentifiers;
    .param p2, "anonymousAppDeviceGUID"    # Ljava/lang/String;
    .param p3, "limitEventUsage"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 984
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 985
    const-string v0, "attribution"

    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 988
    :cond_0
    if-eqz p1, :cond_1

    .line 989
    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 990
    const-string v0, "advertiser_id"

    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 991
    const-string v3, "advertiser_tracking_enabled"

    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->isTrackingLimited()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_0
    invoke-virtual {p0, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 994
    :cond_1
    if-eqz p1, :cond_2

    .line 995
    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidInstallerPackage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 996
    const-string v0, "installer_package"

    invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidInstallerPackage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 999
    :cond_2
    const-string v0, "anon_id"

    invoke-virtual {p0, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1000
    const-string v0, "application_tracking_enabled"

    if-eqz p3, :cond_4

    :goto_1
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1001
    return-void

    :cond_3
    move v0, v2

    .line 991
    goto :goto_0

    :cond_4
    move v1, v2

    .line 1000
    goto :goto_1
.end method

.method public static setAppEventExtendedDeviceInfoParameters(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 22
    .param p0, "params"    # Lorg/json/JSONObject;
    .param p1, "appContext"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1007
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 1008
    .local v9, "extraInfoArray":Lorg/json/JSONArray;
    const-string v18, "a2"

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1010
    invoke-static/range {p1 .. p1}, Lcom/facebook/internal/Utility;->refreshPeriodicExtendedDeviceInfo(Landroid/content/Context;)V

    .line 1013
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    .line 1014
    .local v13, "pkgName":Ljava/lang/String;
    const/4 v14, -0x1

    .line 1015
    .local v14, "versionCode":I
    const-string v15, ""

    .line 1018
    .local v15, "versionName":Ljava/lang/String;
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v18

    const/16 v19, 0x0

    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-virtual {v0, v13, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v12

    .line 1019
    .local v12, "pi":Landroid/content/pm/PackageInfo;
    iget v14, v12, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 1020
    iget-object v15, v12, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 1026
    .end local v12    # "pi":Landroid/content/pm/PackageInfo;
    :goto_0
    invoke-virtual {v9, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1027
    invoke-virtual {v9, v14}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1028
    invoke-virtual {v9, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1031
    sget-object v18, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1032
    sget-object v18, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1035
    const/4 v11, 0x0

    .line 1037
    .local v11, "locale":Ljava/util/Locale;
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v18

    move-object/from16 v0, v18

    iget-object v11, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1041
    :goto_1
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v19, "_"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual {v11}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1044
    sget-object v18, Lcom/facebook/internal/Utility;->deviceTimezone:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1047
    sget-object v18, Lcom/facebook/internal/Utility;->carrierName:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1050
    const/16 v16, 0x0

    .line 1051
    .local v16, "width":I
    const/4 v10, 0x0

    .line 1052
    .local v10, "height":I
    const-wide/16 v4, 0x0

    .line 1054
    .local v4, "density":D
    :try_start_2
    const-string v18, "window"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/view/WindowManager;

    .line 1055
    .local v17, "wm":Landroid/view/WindowManager;
    if-eqz v17, :cond_0

    .line 1056
    invoke-interface/range {v17 .. v17}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 1057
    .local v6, "display":Landroid/view/Display;
    new-instance v7, Landroid/util/DisplayMetrics;

    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    .line 1058
    .local v7, "displayMetrics":Landroid/util/DisplayMetrics;
    invoke-virtual {v6, v7}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 1059
    iget v0, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    move/from16 v16, v0

    .line 1060
    iget v10, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1061
    iget v0, v7, Landroid/util/DisplayMetrics;->density:F

    move/from16 v18, v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move/from16 v0, v18

    float-to-double v4, v0

    .line 1066
    .end local v6    # "display":Landroid/view/Display;
    .end local v7    # "displayMetrics":Landroid/util/DisplayMetrics;
    .end local v17    # "wm":Landroid/view/WindowManager;
    :cond_0
    :goto_2
    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1067
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1068
    const-string v18, "%.2f"

    const/16 v19, 0x1

    move/from16 v0, v19

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v19, v0

    const/16 v20, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v21

    aput-object v21, v19, v20

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1071
    invoke-static {}, Lcom/facebook/internal/Utility;->refreshBestGuessNumberOfCPUCores()I

    move-result v18

    move/from16 v0, v18

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1074
    sget-wide v18, Lcom/facebook/internal/Utility;->totalExternalStorageGB:J

    move-wide/from16 v0, v18

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 1075
    sget-wide v18, Lcom/facebook/internal/Utility;->availableExternalStorageGB:J

    move-wide/from16 v0, v18

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 1077
    const-string v18, "extinfo"

    invoke-virtual {v9}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1078
    return-void

    .line 1038
    .end local v4    # "density":D
    .end local v10    # "height":I
    .end local v16    # "width":I
    :catch_0
    move-exception v8

    .line 1039
    .local v8, "e":Ljava/lang/Exception;
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v11

    goto/16 :goto_1

    .line 1063
    .end local v8    # "e":Ljava/lang/Exception;
    .restart local v4    # "density":D
    .restart local v10    # "height":I
    .restart local v16    # "width":I
    :catch_1
    move-exception v18

    goto :goto_2

    .line 1021
    .end local v4    # "density":D
    .end local v10    # "height":I
    .end local v11    # "locale":Ljava/util/Locale;
    .end local v16    # "width":I
    :catch_2
    move-exception v18

    goto/16 :goto_0
.end method

.method public static sha1hash(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 421
    const-string v0, "SHA-1"

    invoke-static {v0, p0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha1hash([B)Ljava/lang/String;
    .locals 1
    .param p0, "bytes"    # [B

    .prologue
    .line 425
    const-string v0, "SHA-1"

    invoke-static {v0, p0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static stringsEqualOrEmpty(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p0, "a"    # Ljava/lang/String;
    .param p1, "b"    # Ljava/lang/String;

    .prologue
    .line 674
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 675
    .local v0, "aEmpty":Z
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 677
    .local v1, "bEmpty":Z
    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 679
    const/4 v2, 0x1

    .line 686
    :goto_0
    return v2

    .line 681
    :cond_0
    if-nez v0, :cond_1

    if-nez v1, :cond_1

    .line 683
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    .line 686
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static tryGetJSONArrayFromResponse(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 1
    .param p0, "response"    # Lorg/json/JSONObject;
    .param p1, "propertyKey"    # Ljava/lang/String;

    .prologue
    .line 930
    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static tryGetJSONObjectFromResponse(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .param p0, "response"    # Lorg/json/JSONObject;
    .param p1, "propertyKey"    # Ljava/lang/String;

    .prologue
    .line 926
    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs unmodifiableCollection([Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1
    .param p0, "ts"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 397
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static writeStringMapToParcel(Landroid/os/Parcel;Ljava/util/Map;)V
    .locals 3
    .param p0, "parcel"    # Landroid/os/Parcel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1226
    .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    if-nez p1, :cond_1

    .line 1228
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1236
    :cond_0
    return-void

    .line 1230
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 1231
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1232
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1233
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0
.end method
