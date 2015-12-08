.class public Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzf;


# instance fields
.field private final data:[B

.field final versionCode:I

.field private final zzaFh:Lcom/google/android/gms/nearby/bootstrap/Device;

.field private final zzaFk:Lcom/google/android/gms/internal/zzol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzf;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/bootstrap/Device;[BLandroid/os/IBinder;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "device"    # Lcom/google/android/gms/nearby/bootstrap/Device;
    .param p3, "data"    # [B
    .param p4, "callback"    # Landroid/os/IBinder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/bootstrap/Device;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->zzaFh:Lcom/google/android/gms/nearby/bootstrap/Device;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->data:[B

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/internal/zzol$zza;->zzcX(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzol;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzf;

    const/4 v0, 0x0

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->data:[B

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzf;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/zzf;->zza(Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzol;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzwM()Lcom/google/android/gms/nearby/bootstrap/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/SendDataRequest;->zzaFh:Lcom/google/android/gms/nearby/bootstrap/Device;

    return-object v0
.end method
