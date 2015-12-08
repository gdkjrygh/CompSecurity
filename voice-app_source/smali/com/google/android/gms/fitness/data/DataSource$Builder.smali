.class public final Lcom/google/android/gms/fitness/data/DataSource$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/DataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mName:Ljava/lang/String;

.field private zzSq:I

.field private zzajF:Lcom/google/android/gms/fitness/data/DataType;

.field private zzakd:Lcom/google/android/gms/fitness/data/Device;

.field private zzake:Lcom/google/android/gms/fitness/data/Application;

.field private zzakf:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzSq:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzakf:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/fitness/data/DataSource$Builder;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/fitness/data/DataSource$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzSq:I

    return v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/fitness/data/DataSource$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->mName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/fitness/data/DataSource$Builder;)Lcom/google/android/gms/fitness/data/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzakd:Lcom/google/android/gms/fitness/data/Device;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/fitness/data/DataSource$Builder;)Lcom/google/android/gms/fitness/data/Application;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzake:Lcom/google/android/gms/fitness/data/Application;

    return-object v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/fitness/data/DataSource$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzakf:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Must set data type"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/zzu;->zza(ZLjava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzSq:I

    if-ltz v0, :cond_1

    :goto_1
    const-string v0, "Must set data source type"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/zzu;->zza(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/DataSource;-><init>(Lcom/google/android/gms/fitness/data/DataSource$Builder;Lcom/google/android/gms/fitness/data/DataSource$1;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public setAppPackageName(Landroid/content/Context;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 1
    .param p1, "appContext"    # Landroid/content/Context;

    .prologue
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 1
    .param p1, "packageName"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Application;->zzcG(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Application;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzake:Lcom/google/android/gms/fitness/data/Application;

    return-object p0
.end method

.method public setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 0
    .param p1, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method

.method public setDevice(Lcom/google/android/gms/fitness/data/Device;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 0
    .param p1, "device"    # Lcom/google/android/gms/fitness/data/Device;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzakd:Lcom/google/android/gms/fitness/data/Device;

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->mName:Ljava/lang/String;

    return-object p0
.end method

.method public setStreamName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 2
    .param p1, "streamName"    # Ljava/lang/String;

    .prologue
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Must specify a valid stream name"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzakf:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    .locals 0
    .param p1, "type"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/fitness/data/DataSource$Builder;->zzSq:I

    return-object p0
.end method
