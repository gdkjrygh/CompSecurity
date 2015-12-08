.class public Lcom/google/android/gms/fitness/data/Subscription$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/Subscription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private zzajF:Lcom/google/android/gms/fitness/data/DataType;

.field private zzajG:Lcom/google/android/gms/fitness/data/DataSource;

.field private zzakP:J

.field private zzakQ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzakP:J

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzakQ:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/fitness/data/Subscription$zza;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/fitness/data/Subscription$zza;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/fitness/data/Subscription$zza;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzakP:J

    return-wide v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/fitness/data/Subscription$zza;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzakQ:I

    return v0
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/Subscription$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    return-object p0
.end method

.method public zzb(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/Subscription$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method

.method public zzqN()Lcom/google/android/gms/fitness/data/Subscription;
    .locals 4

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_3

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Must call setDataSource() or setDataType()"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/zzu;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v3, p0, Lcom/google/android/gms/fitness/data/Subscription$zza;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    const-string v0, "Specified data type is incompatible with specified data source"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/zzu;->zza(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/data/Subscription;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/Subscription;-><init>(Lcom/google/android/gms/fitness/data/Subscription$zza;Lcom/google/android/gms/fitness/data/Subscription$1;)V

    return-object v0

    :cond_3
    move v0, v1

    goto :goto_0
.end method
