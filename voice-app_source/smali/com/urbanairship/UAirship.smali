.class public Lcom/urbanairship/UAirship;
.super Ljava/lang/Object;
.source "UAirship.java"


# static fields
.field private static final sharedAirship:Lcom/urbanairship/UAirship;


# instance fields
.field airshipConfigOptions:Lcom/urbanairship/AirshipConfigOptions;

.field analytics:Lcom/urbanairship/analytics/Analytics;

.field applicationContext:Landroid/content/Context;

.field applicationMetrics:Lcom/urbanairship/ApplicationMetrics;

.field flying:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 67
    new-instance v0, Lcom/urbanairship/UAirship;

    invoke-direct {v0}, Lcom/urbanairship/UAirship;-><init>()V

    sput-object v0, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 259
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/urbanairship/UAirship;->flying:Z

    .line 266
    return-void
.end method

.method private checkManifest()V
    .locals 11

    .prologue
    const/high16 v10, 0x10000000

    const/4 v9, 0x0

    .line 319
    const-string v6, "android.permission.INTERNET"

    invoke-static {v6}, Lcom/urbanairship/util/ManifestUtils;->checkRequiredPermission(Ljava/lang/String;)V

    .line 320
    const-string v6, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v6}, Lcom/urbanairship/util/ManifestUtils;->checkRequiredPermission(Ljava/lang/String;)V

    .line 322
    invoke-direct {p0}, Lcom/urbanairship/UAirship;->getUrbanAirshipComponentInfoMap()Ljava/util/Map;

    move-result-object v1

    .line 325
    .local v1, "componentInfoMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class;Landroid/content/pm/ComponentInfo;>;"
    const-class v6, Lcom/urbanairship/CoreReceiver;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    .line 326
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AndroidManifest.xml missing required receiver: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-class v7, Lcom/urbanairship/CoreReceiver;

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 330
    :cond_0
    iget-object v6, p0, Lcom/urbanairship/UAirship;->airshipConfigOptions:Lcom/urbanairship/AirshipConfigOptions;

    iget-boolean v6, v6, Lcom/urbanairship/AirshipConfigOptions;->analyticsEnabled:Z

    if-eqz v6, :cond_1

    const-class v6, Lcom/urbanairship/analytics/EventService;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1

    .line 331
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AndroidManifest.xml missing required service: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-class v7, Lcom/urbanairship/analytics/EventService;

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 335
    :cond_1
    iget-object v6, p0, Lcom/urbanairship/UAirship;->airshipConfigOptions:Lcom/urbanairship/AirshipConfigOptions;

    iget-boolean v6, v6, Lcom/urbanairship/AirshipConfigOptions;->pushServiceEnabled:Z

    if-eqz v6, :cond_3

    .line 337
    const-class v6, Lcom/urbanairship/push/PushService;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2

    .line 338
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AndroidManifest.xml missing required service: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-class v7, Lcom/urbanairship/push/PushService;

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 340
    :cond_2
    invoke-static {}, Lcom/urbanairship/push/PushManager;->validateManifest()V

    .line 344
    :cond_3
    iget-object v6, p0, Lcom/urbanairship/UAirship;->airshipConfigOptions:Lcom/urbanairship/AirshipConfigOptions;

    iget-boolean v6, v6, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    if-eqz v6, :cond_4

    const-class v6, Lcom/urbanairship/richpush/RichPushUpdateService;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_4

    .line 345
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AndroidManifest.xml missing required service: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-class v7, Lcom/urbanairship/richpush/RichPushUpdateService;

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 349
    :cond_4
    const-class v6, Lcom/urbanairship/actions/ActionService;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_5

    .line 350
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AndroidManifest.xml missing required service: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-class v7, Lcom/urbanairship/actions/ActionService;

    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 355
    :cond_5
    const-class v6, Lcom/urbanairship/actions/ActionActivity;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_6

    .line 356
    const-string v6, "AndroidManifest.xml missing ActionActivity.  Action.startActivityForResult will not work."

    invoke-static {v6}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 361
    :cond_6
    new-instance v6, Landroid/content/Intent;

    const-string v7, "com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION"

    const-string v8, "http://"

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v6

    const-string v7, "android.intent.category.DEFAULT"

    invoke-virtual {v6, v7}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 366
    .local v2, "i":Landroid/content/Intent;
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6, v2, v9}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v6

    if-nez v6, :cond_7

    .line 367
    const-string v6, "AndroidManifest.xml missing activity with an intent filter for action com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION, category android.intent.category.DEFAULT, and data with scheme http.  Landing page action may not function properly."

    invoke-static {v6}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 374
    :cond_7
    new-instance v6, Landroid/content/Intent;

    const-string v7, "com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION"

    const-string v8, "https://"

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v6

    const-string v7, "android.intent.category.DEFAULT"

    invoke-virtual {v6, v7}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 379
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6, v2, v9}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v6

    if-nez v6, :cond_8

    .line 380
    const-string v6, "AndroidManifest.xml missing activity with an intent filter for action com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION, category android.intent.category.DEFAULT, and data with scheme https Landing page action may not function properly."

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 386
    :cond_8
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    if-nez v6, :cond_a

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 390
    .local v5, "processName":Ljava/lang/String;
    :goto_0
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_9
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 391
    .local v0, "component":Ljava/lang/Class;
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ComponentInfo;

    .line 392
    .local v4, "info":Landroid/content/pm/ComponentInfo;
    if-eqz v4, :cond_9

    iget-object v6, v4, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 393
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "A separate process is detected for: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ". In the "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "AndroidManifest.xml, remove the android:process attribute."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_1

    .line 386
    .end local v0    # "component":Ljava/lang/Class;
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v4    # "info":Landroid/content/pm/ComponentInfo;
    .end local v5    # "processName":Ljava/lang/String;
    :cond_a
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v5, v6, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    goto :goto_0

    .line 400
    .restart local v3    # "i$":Ljava/util/Iterator;
    .restart local v5    # "processName":Ljava/lang/String;
    :cond_b
    const-class v6, Lcom/urbanairship/UrbanAirshipProvider;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_c

    .line 401
    new-instance v6, Ljava/lang/IllegalStateException;

    const-string v7, "Unable to resolve UrbanAirshipProvider. Please check that the provider is defined in your AndroidManifest.xml, and that the authority string is set to  \"YOUR_PACKAGENAME.urbanairship.provider\""

    invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 406
    :cond_c
    return-void
.end method

.method public static getAppIcon()I
    .locals 2

    .prologue
    .line 245
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 246
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    if-eqz v0, :cond_0

    .line 247
    iget v1, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 249
    :goto_0
    return v1

    :cond_0
    const/4 v1, -0x1

    goto :goto_0
.end method

.method public static getAppInfo()Landroid/content/pm/ApplicationInfo;
    .locals 1

    .prologue
    .line 219
    sget-object v0, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    iget-object v0, v0, Lcom/urbanairship/UAirship;->applicationContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    return-object v0
.end method

.method public static getAppName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 229
    invoke-static {}, Lcom/urbanairship/UAirship;->getAppInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 230
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Lcom/urbanairship/UAirship;->getAppInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 232
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getPackageInfo()Landroid/content/pm/PackageInfo;
    .locals 4

    .prologue
    .line 205
    :try_start_0
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 208
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :goto_0
    return-object v1

    .line 206
    .end local v0    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :catch_0
    move-exception v0

    .line 207
    .restart local v0    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NameNotFound for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Disabling."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 208
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getPackageManager()Landroid/content/pm/PackageManager;
    .locals 1

    .prologue
    .line 195
    sget-object v0, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    iget-object v0, v0, Lcom/urbanairship/UAirship;->applicationContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    return-object v0
.end method

.method public static getPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    sget-object v0, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    iget-object v0, v0, Lcom/urbanairship/UAirship;->applicationContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getUrbanAirshipComponentInfoMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class;",
            "Landroid/content/pm/ComponentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 415
    new-instance v0, Lcom/urbanairship/UAirship$1;

    invoke-direct {v0, p0}, Lcom/urbanairship/UAirship$1;-><init>(Lcom/urbanairship/UAirship;)V

    return-object v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 302
    const-string v0, "4.0.4"

    return-object v0
.end method

.method public static land()V
    .locals 2

    .prologue
    .line 177
    sget-object v0, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/urbanairship/UAirship;->flying:Z

    .line 178
    return-void
.end method

.method public static shared()Lcom/urbanairship/UAirship;
    .locals 1

    .prologue
    .line 75
    sget-object v0, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    return-object v0
.end method

.method public static takeOff(Landroid/app/Application;)V
    .locals 1
    .param p0, "application"    # Landroid/app/Application;

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/urbanairship/UAirship;->takeOff(Landroid/app/Application;Lcom/urbanairship/AirshipConfigOptions;)V

    .line 85
    return-void
.end method

.method public static declared-synchronized takeOff(Landroid/app/Application;Lcom/urbanairship/AirshipConfigOptions;)V
    .locals 5
    .param p0, "application"    # Landroid/app/Application;
    .param p1, "options"    # Lcom/urbanairship/AirshipConfigOptions;

    .prologue
    .line 98
    const-class v2, Lcom/urbanairship/UAirship;

    monitor-enter v2

    if-nez p0, :cond_0

    .line 99
    :try_start_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Application argument must not be null"

    invoke-direct {v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1

    .line 103
    :cond_0
    :try_start_1
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    iget-boolean v1, v1, Lcom/urbanairship/UAirship;->flying:Z

    if-eqz v1, :cond_1

    .line 104
    const-string v1, "You can only call UAirship.takeOff once."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    :goto_0
    monitor-exit v2

    return-void

    .line 110
    :cond_1
    :try_start_2
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, v1, Lcom/urbanairship/UAirship;->applicationContext:Landroid/content/Context;

    .line 114
    .local v0, "context":Landroid/content/Context;
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->init()V

    .line 116
    if-nez p1, :cond_2

    .line 117
    invoke-static {v0}, Lcom/urbanairship/AirshipConfigOptions;->loadDefaultOptions(Landroid/content/Context;)Lcom/urbanairship/AirshipConfigOptions;

    move-result-object p1

    .line 119
    :cond_2
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    iput-object p1, v1, Lcom/urbanairship/UAirship;->airshipConfigOptions:Lcom/urbanairship/AirshipConfigOptions;

    .line 122
    invoke-virtual {p1}, Lcom/urbanairship/AirshipConfigOptions;->getLoggerLevel()I

    move-result v1

    sput v1, Lcom/urbanairship/Logger;->logLevel:I

    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->getAppName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " - UALib"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/urbanairship/Logger;->TAG:Ljava/lang/String;

    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Airship Take Off! Lib Version: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v3, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    invoke-static {}, Lcom/urbanairship/UAirship;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " / App key = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 126
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "In Production? "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v3, p1, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Lcom/urbanairship/AirshipConfigOptions;->isValid()Z

    move-result v1

    if-nez v1, :cond_3

    .line 129
    const-string v1, "AirshipConfigOptions are not valid. Unable to take off! Check your airshipconfig.properties file for the errors listed above."

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 131
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Application configuration is invalid."

    invoke-direct {v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 135
    :cond_3
    iget-boolean v1, p1, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    if-nez v1, :cond_4

    .line 136
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    invoke-direct {v1}, Lcom/urbanairship/UAirship;->checkManifest()V

    .line 139
    :cond_4
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lcom/urbanairship/UAirship;->flying:Z

    .line 141
    iget-boolean v1, p1, Lcom/urbanairship/AirshipConfigOptions;->pushServiceEnabled:Z

    if-eqz v1, :cond_5

    .line 142
    const-string v1, "Initializing Push."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 143
    invoke-static {}, Lcom/urbanairship/push/PushManager;->init()V

    .line 148
    sget v1, Lcom/urbanairship/Logger;->logLevel:I

    const/4 v3, 0x7

    if-ge v1, v3, :cond_5

    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->getAppName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " APID"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    :cond_5
    iget-boolean v1, p1, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    if-eqz v1, :cond_6

    .line 154
    const-string v1, "Initializing Rich Push."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 155
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->init()V

    .line 158
    :cond_6
    iget-object v1, p1, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    iget-boolean v1, v1, Lcom/urbanairship/LocationOptions;->locationServiceEnabled:Z

    if-eqz v1, :cond_7

    .line 159
    const-string v1, "Initializing Location."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 160
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->init()V

    .line 163
    :cond_7
    const-string v1, "Registering default Actions."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 164
    invoke-static {}, Lcom/urbanairship/actions/ActionRegistry;->shared()Lcom/urbanairship/actions/ActionRegistry;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/actions/ActionRegistry;->registerDefaultActions()V

    .line 166
    const-string v1, "Initializing Analytics."

    invoke-static {v1}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 168
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    new-instance v3, Lcom/urbanairship/ApplicationMetrics;

    invoke-direct {v3, p0}, Lcom/urbanairship/ApplicationMetrics;-><init>(Landroid/content/Context;)V

    iput-object v3, v1, Lcom/urbanairship/UAirship;->applicationMetrics:Lcom/urbanairship/ApplicationMetrics;

    .line 169
    sget-object v1, Lcom/urbanairship/UAirship;->sharedAirship:Lcom/urbanairship/UAirship;

    new-instance v3, Lcom/urbanairship/analytics/Analytics;

    invoke-direct {v3, p0}, Lcom/urbanairship/analytics/Analytics;-><init>(Landroid/app/Application;)V

    iput-object v3, v1, Lcom/urbanairship/UAirship;->analytics:Lcom/urbanairship/analytics/Analytics;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method


# virtual methods
.method public getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/urbanairship/UAirship;->airshipConfigOptions:Lcom/urbanairship/AirshipConfigOptions;

    return-object v0
.end method

.method public getAnalytics()Lcom/urbanairship/analytics/Analytics;
    .locals 1

    .prologue
    .line 311
    iget-object v0, p0, Lcom/urbanairship/UAirship;->analytics:Lcom/urbanairship/analytics/Analytics;

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/urbanairship/UAirship;->applicationContext:Landroid/content/Context;

    return-object v0
.end method

.method public getApplicationMetrics()Lcom/urbanairship/ApplicationMetrics;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/urbanairship/UAirship;->applicationMetrics:Lcom/urbanairship/ApplicationMetrics;

    return-object v0
.end method

.method public isFlying()Z
    .locals 1

    .prologue
    .line 293
    iget-boolean v0, p0, Lcom/urbanairship/UAirship;->flying:Z

    return v0
.end method
