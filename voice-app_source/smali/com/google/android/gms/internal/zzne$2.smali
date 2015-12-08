.class Lcom/google/android/gms/internal/zzne$2;
.super Lcom/google/android/gms/internal/zzmc$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzne;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzals:Lcom/google/android/gms/internal/zzne;

.field final synthetic zzalt:Lcom/google/android/gms/fitness/request/SensorRequest;

.field final synthetic zzalu:Lcom/google/android/gms/fitness/data/zzj;

.field final synthetic zzalv:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzne;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzne$2;->zzals:Lcom/google/android/gms/internal/zzne;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzne$2;->zzalt:Lcom/google/android/gms/fitness/request/SensorRequest;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzne$2;->zzalu:Lcom/google/android/gms/fitness/data/zzj;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzne$2;->zzalv:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzmc$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzne$2;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzmc;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzne$2;->zza(Lcom/google/android/gms/internal/zzmc;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzmc;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v4, Lcom/google/android/gms/internal/zzng;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/zzng;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzmc;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzmc;->zznM()Landroid/os/IInterface;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/zzmn;

    new-instance v0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzne$2;->zzalt:Lcom/google/android/gms/fitness/request/SensorRequest;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzne$2;->zzalu:Lcom/google/android/gms/fitness/data/zzj;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzne$2;->zzalv:Landroid/app/PendingIntent;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    invoke-interface {v6, v0}, Lcom/google/android/gms/internal/zzmn;->zza(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;)V

    return-void
.end method

.method protected zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method
