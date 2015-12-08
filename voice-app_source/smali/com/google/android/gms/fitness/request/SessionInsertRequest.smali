.class public Lcom/google/android/gms/fitness/request/SessionInsertRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/SessionInsertRequest$1;,
        Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/SessionInsertRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field private final zzMZ:Ljava/lang/String;

.field private final zzajJ:Lcom/google/android/gms/fitness/data/Session;

.field private final zzajS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ">;"
        }
    .end annotation
.end field

.field private final zzalN:Lcom/google/android/gms/internal/zzmu;

.field private final zzamC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzu;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzu;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/Session;Ljava/util/List;Ljava/util/List;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "session"    # Lcom/google/android/gms/fitness/data/Session;
    .param p5, "callback"    # Landroid/os/IBinder;
    .param p6, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/fitness/data/Session;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p3, "dataSets":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataSet;>;"
    .local p4, "aggregateDataPoints":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataPoint;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    if-nez p5, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    iput-object p6, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzMZ:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p5}, Lcom/google/android/gms/internal/zzmu$zza;->zzbF(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmu;

    move-result-object v0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/Session;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V
    .locals 1
    .param p1, "session"    # Lcom/google/android/gms/fitness/data/Session;
    .param p4, "callback"    # Lcom/google/android/gms/internal/zzmu;
    .param p5, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fitness/data/Session;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;",
            "Lcom/google/android/gms/internal/zzmu;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "dataSets":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataSet;>;"
    .local p3, "aggregateDataPoints":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataPoint;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzCY:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    iput-object p5, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;)V
    .locals 6
    .param p1, "builder"    # Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    .prologue
    const/4 v4, 0x0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->zza(Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;)Lcom/google/android/gms/fitness/data/Session;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->zzb(Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;)Ljava/util/List;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->zzc(Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;)Ljava/util/List;

    move-result-object v3

    move-object v0, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/request/SessionInsertRequest;-><init>(Lcom/google/android/gms/fitness/data/Session;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;Lcom/google/android/gms/fitness/request/SessionInsertRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/fitness/request/SessionInsertRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest;-><init>(Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V
    .locals 6
    .param p1, "request"    # Lcom/google/android/gms/fitness/request/SessionInsertRequest;
    .param p2, "callback"    # Lcom/google/android/gms/internal/zzmu;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    iget-object v2, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    iget-object v3, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    move-object v0, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/request/SessionInsertRequest;-><init>(Lcom/google/android/gms/fitness/data/Session;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    return-void
.end method

.method private zzb(Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    .end local p1    # "o":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzb(Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAggregateDataPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    return-object v0
.end method

.method public getDataSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method public getSession()Lcom/google/android/gms/fitness/data/Session;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "session"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajJ:Lcom/google/android/gms/fitness/data/Session;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "dataSets"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzajS:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "aggregateDataPoints"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzamC:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zzt$zza;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzu;->zza(Lcom/google/android/gms/fitness/request/SessionInsertRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionInsertRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzmu;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
