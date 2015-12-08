.class public Lcom/comscore/utils/id/IdHelper;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/comscore/utils/Storage;

.field private f:Landroid/content/Context;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "com.google.android.gms"

    sput-object v0, Lcom/comscore/utils/id/IdHelper;->a:Ljava/lang/String;

    const-string v0, "com.google.android.gms.ads.identifier.service.START"

    sput-object v0, Lcom/comscore/utils/id/IdHelper;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/comscore/utils/Storage;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->k:Z

    iput-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->l:Z

    iput-object p1, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    iput-object p2, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    return-void
.end method

.method private a()V
    .locals 6

    const/4 v1, 0x1

    const/4 v5, 0x3

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isPackageInstalledFromGooglePlayStore()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isGooglePlayServicesAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/comscore/utils/id/IdHelper;->l:Z

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isAdvertisingIdEnabled()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/id/IdHelper;->getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/comscore/utils/id/IdHelper;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->i:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/comscore/utils/id/IdHelper;->b(Ljava/lang/String;)V

    iput-boolean v4, p0, Lcom/comscore/utils/id/IdHelper;->k:Z

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, v3}, Lcom/comscore/utils/id/IdHelper;->a(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lcom/comscore/utils/id/IdHelper;->b(Ljava/lang/String;)V

    iput-boolean v1, p0, Lcom/comscore/utils/id/IdHelper;->k:Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, v3}, Lcom/comscore/utils/id/IdHelper;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/id/IdHelper;->getAndroidSerial(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    const-string v1, "unknown"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v5, :cond_3

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "***"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "000"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-direct {p0, v0}, Lcom/comscore/utils/id/IdHelper;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/id/IdHelper;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_4

    invoke-direct {p0, v0}, Lcom/comscore/utils/id/IdHelper;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, v3}, Lcom/comscore/utils/id/IdHelper;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/comscore/utils/id/IdHelper;->i:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/comscore/utils/Utils;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->j:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->j:Ljava/lang/String;

    goto :goto_0
.end method

.method private b()V
    .locals 4

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v1, "vid"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->has(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v1, "vid"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->d:Ljava/lang/String;

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->getPublisherADID()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iget-object v2, p0, Lcom/comscore/utils/id/IdHelper;->d:Ljava/lang/String;

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->getPublisherSecret()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/comscore/utils/Utils;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->d:Ljava/lang/String;

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v1, "vid"

    iget-object v2, p0, Lcom/comscore/utils/id/IdHelper;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/comscore/utils/Utils;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/comscore/utils/id/IdHelper;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v1, "crossPublisherId"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->c:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/comscore/utils/id/IdHelper;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/comscore/utils/id/IdHelper;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v2, "crossPublisherId"

    iget-object v3, p0, Lcom/comscore/utils/id/IdHelper;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v2, "md5RawCrossPublisherId"

    invoke-virtual {v1, v2, v0}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->e:Lcom/comscore/utils/Storage;

    const-string v1, "md5RawCrossPublisherId"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    :try_start_0
    invoke-static {p1}, Lcom/comscore/utils/Utils;->encrypt(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    new-instance v1, Lcom/comscore/utils/id/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/comscore/utils/id/b;-><init>(Lcom/comscore/utils/id/a;)V

    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/comscore/utils/id/IdHelper;->b:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/comscore/utils/id/IdHelper;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v1, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :try_start_0
    new-instance v2, Lcom/comscore/utils/id/c;

    invoke-virtual {v1}, Lcom/comscore/utils/id/b;->getBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/comscore/utils/id/c;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {v2}, Lcom/comscore/utils/id/c;->getId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    invoke-virtual {p0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v2

    invoke-virtual {p0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw v0
.end method

.method public static getAndroidId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, "9774d56d682e549c"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "unknown"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "android_id"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getAndroidSerial(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v2, 0x3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/comscore/utils/API9;->getSerial()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, "unknown"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v2, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "***"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "000"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public generateIds()V
    .locals 1

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isPublisherSecretEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/id/IdHelper;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->h:Ljava/lang/String;

    invoke-direct {p0}, Lcom/comscore/utils/id/IdHelper;->b()V

    invoke-direct {p0}, Lcom/comscore/utils/id/IdHelper;->a()V

    goto :goto_0
.end method

.method public getAdvertisingId()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->l:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isAdvertisingIdEnabled()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/comscore/utils/id/IdHelper;->a()V

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->i:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getCrossPublisherId()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->l:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isAdvertisingIdEnabled()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/comscore/utils/id/IdHelper;->a()V

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->c:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    const-string v0, "none"

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method public getMD5AdvertisingId()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->l:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/comscore/utils/id/IdHelper;->isAdvertisingIdEnabled()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/comscore/utils/id/IdHelper;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/comscore/utils/id/IdHelper;->a()V

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->j:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPublisherADID()[Ljava/lang/String;
    .locals 7

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/id/IdHelper;->getAndroidSerial(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "unknown"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v6, :cond_0

    invoke-virtual {v1, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "***"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "000"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-array v0, v5, [Ljava/lang/String;

    aput-object v1, v0, v3

    const-string v1, "-cs31"

    aput-object v1, v0, v4

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/id/IdHelper;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    new-array v0, v5, [Ljava/lang/String;

    aput-object v1, v0, v3

    const-string v1, "-cs32"

    aput-object v1, v0, v4

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v0, v5, [Ljava/lang/String;

    aput-object v1, v0, v3

    const-string v1, "-cs72"

    aput-object v1, v0, v4

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPublisherSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lcom/comscore/utils/id/IdHelper;->g:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getVisitorId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->d:Ljava/lang/String;

    return-object v0
.end method

.method public isAdvertisingIdEnabled()Ljava/lang/Boolean;
    .locals 5

    const/4 v1, 0x1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Lcom/comscore/utils/id/b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/comscore/utils/id/b;-><init>(Lcom/comscore/utils/id/a;)V

    new-instance v3, Landroid/content/Intent;

    sget-object v4, Lcom/comscore/utils/id/IdHelper;->b:Ljava/lang/String;

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v4, Lcom/comscore/utils/id/IdHelper;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v4, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-virtual {v4, v3, v2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :try_start_0
    new-instance v3, Lcom/comscore/utils/id/c;

    invoke-virtual {v2}, Lcom/comscore/utils/id/b;->getBinder()Landroid/os/IBinder;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/comscore/utils/id/c;-><init>(Landroid/os/IBinder;)V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/comscore/utils/id/c;->isLimitAdTrackingEnabled(Z)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_0
    :goto_1
    return-object v0

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v1, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw v0
.end method

.method public isGooglePlayServicesAvailable()Z
    .locals 4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-gt v0, v1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_1
    return v0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be called from the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.android.vending"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lcom/comscore/utils/id/b;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lcom/comscore/utils/id/b;-><init>(Lcom/comscore/utils/id/a;)V

    new-instance v0, Landroid/content/Intent;

    sget-object v2, Lcom/comscore/utils/id/IdHelper;->b:Ljava/lang/String;

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/comscore/utils/id/IdHelper;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method public isPackageInstalledFromGooglePlayStore()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/comscore/utils/API4;->isPackageInstalledFromGooglePlayStore(Landroid/content/Context;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isPublisherSecretEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/utils/id/IdHelper;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setPublisherSecret(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/utils/id/IdHelper;->g:Ljava/lang/String;

    return-void
.end method
