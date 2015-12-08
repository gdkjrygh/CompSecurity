.class public Lio/fabric/sdk/android/services/common/IdManager;
.super Ljava/lang/Object;
.source "IdManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    }
.end annotation


# static fields
.field public static final APPLICATION_INSTALL_ID_FIELD:Ljava/lang/String; = "APPLICATION_INSTALLATION_UUID"

.field private static final BAD_ANDROID_ID:Ljava/lang/String; = "9774d56d682e549c"

.field public static final BETA_DEVICE_TOKEN_FIELD:Ljava/lang/String; = "font_token"

.field private static final BLUETOOTH_ERROR_MESSAGE:Ljava/lang/String; = "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()"

.field public static final COLLECT_DEVICE_IDENTIFIERS:Ljava/lang/String; = "com.crashlytics.CollectDeviceIdentifiers"

.field public static final COLLECT_USER_IDENTIFIERS:Ljava/lang/String; = "com.crashlytics.CollectUserIdentifiers"

.field public static final DEFAULT_VERSION_NAME:Ljava/lang/String; = "0.0"

.field private static final FORWARD_SLASH_REGEX:Ljava/lang/String;

.field private static final ID_PATTERN:Ljava/util/regex/Pattern;

.field public static final MODEL_FIELD:Ljava/lang/String; = "model"

.field public static final OS_VERSION_FIELD:Ljava/lang/String; = "os_version"

.field private static final PREFKEY_INSTALLATION_UUID:Ljava/lang/String; = "crashlytics.installation.id"

.field private static final SDK_ASSETS_ROOT:Ljava/lang/String; = ".TwitterSdk"


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final appIdentifier:Ljava/lang/String;

.field private final appInstallIdentifier:Ljava/lang/String;

.field private final collectHardwareIds:Z

.field private final collectUserIds:Z

.field private final installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

.field private final kits:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lio/fabric/sdk/android/Kit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 66
    const-string v0, "[^\\p{Alnum}]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/IdManager;->ID_PATTERN:Ljava/util/regex/Pattern;

    .line 81
    const-string v0, "/"

    invoke-static {v0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/IdManager;->FORWARD_SLASH_REGEX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 5
    .param p1, "appContext"    # Landroid/content/Context;
    .param p2, "appIdentifier"    # Ljava/lang/String;
    .param p3, "appInstallIdentifier"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "Lio/fabric/sdk/android/Kit;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p4, "kits":Ljava/util/Collection;, "Ljava/util/Collection<Lio/fabric/sdk/android/Kit;>;"
    const/4 v4, 0x1

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 123
    if-nez p1, :cond_0

    .line 124
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appContext must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_0
    if-nez p2, :cond_1

    .line 127
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appIdentifier must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_1
    if-nez p4, :cond_2

    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "kits must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_2
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    .line 133
    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appIdentifier:Ljava/lang/String;

    .line 134
    iput-object p3, p0, Lio/fabric/sdk/android/services/common/IdManager;->appInstallIdentifier:Ljava/lang/String;

    .line 135
    iput-object p4, p0, Lio/fabric/sdk/android/services/common/IdManager;->kits:Ljava/util/Collection;

    .line 137
    new-instance v0, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    .line 139
    const-string v0, "com.crashlytics.CollectDeviceIdentifiers"

    invoke-static {p1, v0, v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    .line 141
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-nez v0, :cond_3

    .line 142
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Device ID collection disabled for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    :cond_3
    const-string v0, "com.crashlytics.CollectUserIdentifiers"

    invoke-static {p1, v0, v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    .line 148
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    if-nez v0, :cond_4

    .line 149
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "User information collection disabled for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    :cond_4
    return-void
.end method

.method private addAppInstallIdTo(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "ids"    # Lorg/json/JSONObject;

    .prologue
    .line 201
    :try_start_0
    const-string v1, "APPLICATION_INSTALLATION_UUID"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAppInstallIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    :goto_0
    return-void

    .line 202
    :catch_0
    move-exception v0

    .line 203
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Could not write application id to JSON"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private addDeviceIdentifiersTo(Lorg/json/JSONObject;)V
    .locals 7
    .param p1, "ids"    # Lorg/json/JSONObject;

    .prologue
    .line 209
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getDeviceIdentifiers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 211
    .local v2, "id":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {v3}, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 212
    :catch_0
    move-exception v0

    .line 213
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v4

    const-string v5, "Fabric"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Could not write value to JSON: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {v3}, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v5, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 218
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v2    # "id":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    :cond_0
    return-void
.end method

.method private addModelName(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "ids"    # Lorg/json/JSONObject;

    .prologue
    .line 231
    :try_start_0
    const-string v1, "model"

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getModelName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    :goto_0
    return-void

    .line 232
    :catch_0
    move-exception v0

    .line 233
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Could not write model to JSON"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private addOsVersionTo(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "ids"    # Lorg/json/JSONObject;

    .prologue
    .line 222
    :try_start_0
    const-string v1, "os_version"

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getOsVersionString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    :goto_0
    return-void

    .line 223
    :catch_0
    move-exception v0

    .line 224
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Could not write OS version to JSON"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;
    .locals 3
    .param p1, "prefs"    # Landroid/content/SharedPreferences;

    .prologue
    .line 341
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 343
    :try_start_0
    const-string v1, "crashlytics.installation.id"

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 345
    .local v0, "uuid":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 346
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 347
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "crashlytics.installation.id"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 352
    :cond_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    .end local v0    # "uuid":Ljava/lang/String;
    :catchall_0
    move-exception v1

    iget-object v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1
.end method

.method private formatId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 256
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lio/fabric/sdk/android/services/common/IdManager;->ID_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private getTwitterSdkAssetsList()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 443
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method private hasPermission(Ljava/lang/String;)Z
    .locals 2
    .param p1, "permission"    # Ljava/lang/String;

    .prologue
    .line 244
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->checkCallingPermission(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 248
    .local v0, "granted":Z
    :goto_0
    return v0

    .line 244
    .end local v0    # "granted":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V
    .locals 0
    .param p2, "idKey"    # Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    .param p3, "idValue"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ">;",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 413
    .local p1, "idMap":Ljava/util/Map;, "Ljava/util/Map<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    if-eqz p3, :cond_0

    .line 414
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    :cond_0
    return-void
.end method

.method private removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 307
    sget-object v0, Lio/fabric/sdk/android/services/common/IdManager;->FORWARD_SLASH_REGEX:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public canCollectUserIds()Z
    .locals 1

    .prologue
    .line 239
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    return v0
.end method

.method public createIdHeaderValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1, "apiKey"    # Ljava/lang/String;
    .param p2, "packageName"    # Ljava/lang/String;

    .prologue
    .line 164
    const/4 v0, 0x0

    .line 169
    .local v0, "cipher":Ljavax/crypto/Cipher;
    :try_start_0
    new-instance v6, Ljava/lang/String;

    const/4 v8, 0x3

    new-array v8, v8, [C

    fill-array-data v8, :array_0

    invoke-direct {v6, v8}, Ljava/lang/String;-><init>([C)V

    .line 170
    .local v6, "replacementString":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .local v5, "replacement":Ljava/lang/StringBuilder;
    const-string v8, "\\."

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p2, v8, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 172
    .local v4, "obsId":Ljava/lang/String;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lio/fabric/sdk/android/services/common/CommonUtils;->sha1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 173
    .local v2, "hash":Ljava/lang/String;
    const/4 v8, 0x1

    invoke-static {v8, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->createCipher(ILjava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 179
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 181
    .local v3, "ids":Lorg/json/JSONObject;
    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->addAppInstallIdTo(Lorg/json/JSONObject;)V

    .line 182
    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->addDeviceIdentifiersTo(Lorg/json/JSONObject;)V

    .line 183
    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->addOsVersionTo(Lorg/json/JSONObject;)V

    .line 184
    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->addModelName(Lorg/json/JSONObject;)V

    .line 187
    const-string v7, ""

    .line 188
    .local v7, "toReturn":Ljava/lang/String;
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    move-result v8

    if-lez v8, :cond_0

    .line 190
    :try_start_1
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    invoke-virtual {v0, v8}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v8

    invoke-static {v8}, Lio/fabric/sdk/android/services/common/CommonUtils;->hexify([B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v7

    .line 196
    .end local v2    # "hash":Ljava/lang/String;
    .end local v3    # "ids":Lorg/json/JSONObject;
    .end local v4    # "obsId":Ljava/lang/String;
    .end local v5    # "replacement":Ljava/lang/StringBuilder;
    .end local v6    # "replacementString":Ljava/lang/String;
    .end local v7    # "toReturn":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v7

    .line 174
    :catch_0
    move-exception v1

    .line 176
    .local v1, "e":Ljava/security/GeneralSecurityException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v8

    const-string v9, "Fabric"

    const-string v10, "Could not create cipher to encrypt headers."

    invoke-interface {v8, v9, v10, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    const-string v7, ""

    goto :goto_0

    .line 191
    .end local v1    # "e":Ljava/security/GeneralSecurityException;
    .restart local v2    # "hash":Ljava/lang/String;
    .restart local v3    # "ids":Lorg/json/JSONObject;
    .restart local v4    # "obsId":Ljava/lang/String;
    .restart local v5    # "replacement":Ljava/lang/StringBuilder;
    .restart local v6    # "replacementString":Ljava/lang/String;
    .restart local v7    # "toReturn":Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 192
    .restart local v1    # "e":Ljava/security/GeneralSecurityException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v8

    const-string v9, "Fabric"

    const-string v10, "Could not encrypt IDs"

    invoke-interface {v8, v9, v10, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 169
    nop

    :array_0
    .array-data 2
        0x73s
        0x6cs
        0x63s
    .end array-data
.end method

.method public getAdvertisingId()Ljava/lang/String;
    .locals 4

    .prologue
    .line 398
    const/4 v1, 0x0

    .line 400
    .local v1, "toReturn":Ljava/lang/String;
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v2, :cond_0

    .line 401
    new-instance v2, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    iget-object v3, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-direct {v2, v3}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    .line 403
    .local v0, "advertisingInfo":Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    if-eqz v0, :cond_0

    .line 404
    iget-object v1, v0, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->advertisingId:Ljava/lang/String;

    .line 408
    .end local v0    # "advertisingInfo":Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    :cond_0
    return-object v1
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 4

    .prologue
    .line 419
    const/4 v1, 0x0

    .line 421
    .local v1, "toReturn":Ljava/lang/String;
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v2, :cond_0

    .line 422
    iget-object v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "android_id"

    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 425
    .local v0, "androidId":Ljava/lang/String;
    const-string v2, "9774d56d682e549c"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 426
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 430
    .end local v0    # "androidId":Ljava/lang/String;
    :cond_0
    return-object v1
.end method

.method public getAppIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getAppInstallIdentifier()Ljava/lang/String;
    .locals 4

    .prologue
    .line 268
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appInstallIdentifier:Ljava/lang/String;

    .line 270
    .local v0, "appInstallId":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 271
    iget-object v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-static {v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->getSharedPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 272
    .local v1, "prefs":Landroid/content/SharedPreferences;
    const-string v2, "crashlytics.installation.id"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 274
    if-nez v0, :cond_0

    .line 275
    invoke-direct {p0, v1}, Lio/fabric/sdk/android/services/common/IdManager;->createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    .line 279
    .end local v1    # "prefs":Landroid/content/SharedPreferences;
    :cond_0
    return-object v0
.end method

.method public getBluetoothMacAddress()Ljava/lang/String;
    .locals 5

    .prologue
    .line 485
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v2, :cond_0

    const-string v2, "android.permission.BLUETOOTH"

    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/common/IdManager;->hasPermission(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 487
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    .line 488
    .local v0, "bt":Landroid/bluetooth/BluetoothAdapter;
    if-eqz v0, :cond_0

    .line 489
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 495
    .end local v0    # "bt":Landroid/bluetooth/BluetoothAdapter;
    :cond_0
    :goto_0
    const/4 v2, 0x0

    return-object v2

    .line 491
    :catch_0
    move-exception v1

    .line 492
    .local v1, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()"

    invoke-interface {v2, v3, v4, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public getDeviceIdentifiers()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 367
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 372
    .local v4, "ids":Ljava/util/Map;, "Ljava/util/Map<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    iget-object v7, p0, Lio/fabric/sdk/android/services/common/IdManager;->kits:Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/fabric/sdk/android/Kit;

    .line 373
    .local v5, "kit":Lio/fabric/sdk/android/Kit;
    instance-of v7, v5, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;

    if-eqz v7, :cond_0

    move-object v3, v5

    .line 374
    check-cast v3, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;

    .line 375
    .local v3, "idProvider":Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;
    invoke-interface {v3}, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;->getDeviceIdentifiers()Ljava/util/Map;

    move-result-object v6

    .line 377
    .local v6, "kitIds":Ljava/util/Map;, "Ljava/util/Map<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 378
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    goto :goto_0

    .line 383
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "idProvider":Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;
    .end local v5    # "kit":Lio/fabric/sdk/android/Kit;
    .end local v6    # "kitIds":Ljava/util/Map;, "Ljava/util/Map<Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;>;"
    :cond_1
    sget-object v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->ANDROID_ID:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAndroidId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 384
    sget-object v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->ANDROID_DEVICE_ID:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getTelephonyId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 385
    sget-object v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->ANDROID_SERIAL:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getSerialNumber()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 386
    sget-object v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->WIFI_MAC_ADDRESS:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getWifiMacAddress()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 387
    sget-object v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->BLUETOOTH_MAC_ADDRESS:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getBluetoothMacAddress()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 388
    sget-object v7, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->ANDROID_ADVERTISING_ID:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v4, v7, v8}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 390
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    return-object v7
.end method

.method public getDeviceUUID()Ljava/lang/String;
    .locals 4

    .prologue
    .line 317
    const-string v1, ""

    .line 319
    .local v1, "toReturn":Ljava/lang/String;
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v2, :cond_0

    .line 320
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAndroidId()Ljava/lang/String;

    move-result-object v1

    .line 322
    if-nez v1, :cond_0

    .line 323
    iget-object v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-static {v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->getSharedPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 324
    .local v0, "prefs":Landroid/content/SharedPreferences;
    const-string v2, "crashlytics.installation.id"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 326
    if-nez v1, :cond_0

    .line 327
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v1

    .line 332
    .end local v0    # "prefs":Landroid/content/SharedPreferences;
    :cond_0
    return-object v1
.end method

.method public getInstallerPackageName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 394
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;->getInstallerPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getModelName()Ljava/lang/String;
    .locals 5

    .prologue
    .line 302
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-direct {p0, v4}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-direct {p0, v4}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsVersionString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 294
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-direct {p0, v4}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    invoke-direct {p0, v4}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSerialNumber()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 500
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v2, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x9

    if-lt v2, v4, :cond_0

    .line 502
    :try_start_0
    const-class v2, Landroid/os/Build;

    const-string v4, "SERIAL"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 503
    .local v1, "field":Ljava/lang/reflect/Field;
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 509
    .end local v1    # "field":Ljava/lang/reflect/Field;
    :goto_0
    return-object v2

    .line 504
    :catch_0
    move-exception v0

    .line 505
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v4, "Fabric"

    const-string v5, "Could not retrieve android.os.Build.SERIAL value"

    invoke-interface {v2, v4, v5, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .end local v0    # "e":Ljava/lang/Exception;
    :cond_0
    move-object v2, v3

    .line 509
    goto :goto_0
.end method

.method public getTelephonyId()Ljava/lang/String;
    .locals 3

    .prologue
    .line 447
    iget-boolean v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v1, :cond_0

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-direct {p0, v1}, Lio/fabric/sdk/android/services/common/IdManager;->hasPermission(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 448
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    const-string v2, "phone"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 451
    .local v0, "tm":Landroid/telephony/TelephonyManager;
    if-eqz v0, :cond_0

    .line 452
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 455
    .end local v0    # "tm":Landroid/telephony/TelephonyManager;
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getWifiMacAddress()Ljava/lang/String;
    .locals 4

    .prologue
    .line 460
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v2, :cond_0

    const-string v2, "android.permission.ACCESS_WIFI_STATE"

    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/common/IdManager;->hasPermission(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 461
    iget-object v2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    const-string v3, "wifi"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 464
    .local v1, "wifiMgr":Landroid/net/wifi/WifiManager;
    if-eqz v1, :cond_0

    .line 465
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    .line 467
    .local v0, "wifiInfo":Landroid/net/wifi/WifiInfo;
    if-eqz v0, :cond_0

    .line 468
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 472
    .end local v0    # "wifiInfo":Landroid/net/wifi/WifiInfo;
    .end local v1    # "wifiMgr":Landroid/net/wifi/WifiManager;
    :goto_0
    return-object v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
