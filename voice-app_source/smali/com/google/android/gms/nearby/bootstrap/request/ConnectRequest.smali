.class public Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zza;


# instance fields
.field private final description:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field final versionCode:I

.field private final zzPr:J

.field private final zzaFg:B

.field private final zzaFh:Lcom/google/android/gms/nearby/bootstrap/Device;

.field private final zzaFi:Lcom/google/android/gms/internal/zzoj;

.field private final zzaFj:Lcom/google/android/gms/internal/zzok;

.field private final zzaFk:Lcom/google/android/gms/internal/zzol;

.field private final zzaFl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/zza;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zza;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/bootstrap/Device;Ljava/lang/String;Ljava/lang/String;BJLjava/lang/String;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 2
    .param p1, "versionCode"    # I
    .param p2, "device"    # Lcom/google/android/gms/nearby/bootstrap/Device;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "description"    # Ljava/lang/String;
    .param p5, "deviceType"    # B
    .param p6, "timeoutMillis"    # J
    .param p8, "token"    # Ljava/lang/String;
    .param p9, "connectionListener"    # Landroid/os/IBinder;
    .param p10, "dataListener"    # Landroid/os/IBinder;
    .param p11, "callback"    # Landroid/os/IBinder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/bootstrap/Device;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFh:Lcom/google/android/gms/nearby/bootstrap/Device;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzu;->zzcj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->name:Ljava/lang/String;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->description:Ljava/lang/String;

    iput-byte p5, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFg:B

    iput-wide p6, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzPr:J

    iput-object p8, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFl:Ljava/lang/String;

    invoke-static {p9}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p9}, Lcom/google/android/gms/internal/zzoj$zza;->zzcV(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzoj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFi:Lcom/google/android/gms/internal/zzoj;

    invoke-static {p10}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p10}, Lcom/google/android/gms/internal/zzok$zza;->zzcW(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzok;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFj:Lcom/google/android/gms/internal/zzok;

    invoke-static {p11}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p11}, Lcom/google/android/gms/internal/zzol$zza;->zzcX(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzol;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zza;

    const/4 v0, 0x0

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFl:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zza;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/zza;->zza(Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFk:Lcom/google/android/gms/internal/zzol;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzol;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzwK()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFg:B

    return v0
.end method

.method public zzwM()Lcom/google/android/gms/nearby/bootstrap/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFh:Lcom/google/android/gms/nearby/bootstrap/Device;

    return-object v0
.end method

.method public zzwN()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzPr:J

    return-wide v0
.end method

.method public zzwO()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFi:Lcom/google/android/gms/internal/zzoj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFi:Lcom/google/android/gms/internal/zzoj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzoj;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzwP()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFj:Lcom/google/android/gms/internal/zzok;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ConnectRequest;->zzaFj:Lcom/google/android/gms/internal/zzok;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzok;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
