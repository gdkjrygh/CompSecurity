.class public Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zze;


# instance fields
.field private final description:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field final versionCode:I

.field private final zzaFg:B

.field private final zzaFi:Lcom/google/android/gms/internal/zzoj;

.field private final zzaFj:Lcom/google/android/gms/internal/zzok;

.field private final zzaFk:Lcom/google/android/gms/internal/zzol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/zze;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/zze;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zze;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;BLandroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "deviceType"    # B
    .param p5, "connectionListener"    # Landroid/os/IBinder;
    .param p6, "dataListener"    # Landroid/os/IBinder;
    .param p7, "callback"    # Landroid/os/IBinder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzcj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->name:Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->description:Ljava/lang/String;

    iput-byte p4, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFg:B

    invoke-static {p5}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcom/google/android/gms/internal/zzoj$zza;->zzcV(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzoj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFi:Lcom/google/android/gms/internal/zzoj;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lcom/google/android/gms/internal/zzok$zza;->zzcW(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzok;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFj:Lcom/google/android/gms/internal/zzok;

    invoke-static {p7}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p7}, Lcom/google/android/gms/internal/zzol$zza;->zzcX(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzol;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zze;

    const/4 v0, 0x0

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zze;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/zze;->zza(Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzol;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzwK()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFg:B

    return v0
.end method

.method public zzwO()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFi:Lcom/google/android/gms/internal/zzoj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFi:Lcom/google/android/gms/internal/zzoj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzoj;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzwP()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFj:Lcom/google/android/gms/internal/zzok;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;->zzaFj:Lcom/google/android/gms/internal/zzok;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzok;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
