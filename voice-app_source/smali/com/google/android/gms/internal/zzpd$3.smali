.class Lcom/google/android/gms/internal/zzpd$3;
.super Lcom/google/android/gms/internal/zzpd$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzpd;->write(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/plus/model/moments/Moment;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaHC:Lcom/google/android/gms/internal/zzpd;

.field final synthetic zzaHH:Lcom/google/android/gms/plus/model/moments/Moment;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzpd;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/plus/model/moments/Moment;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpd$3;->zzaHC:Lcom/google/android/gms/internal/zzpd;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzpd$3;->zzaHH:Lcom/google/android/gms/plus/model/moments/Moment;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/zzpd$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzpd$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/plus/internal/zze;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzpd$3;->zza(Lcom/google/android/gms/plus/internal/zze;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/plus/internal/zze;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpd$3;->zzaHH:Lcom/google/android/gms/plus/model/moments/Moment;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/plus/internal/zze;->zza(Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/plus/model/moments/Moment;)V

    return-void
.end method
