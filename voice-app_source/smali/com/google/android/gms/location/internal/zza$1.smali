.class Lcom/google/android/gms/location/internal/zza$1;
.super Lcom/google/android/gms/location/internal/zza$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/zza;->requestActivityUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;JLandroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzayt:J

.field final synthetic zzayu:Landroid/app/PendingIntent;

.field final synthetic zzayv:Lcom/google/android/gms/location/internal/zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/zza;Lcom/google/android/gms/common/api/GoogleApiClient;JLandroid/app/PendingIntent;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zza$1;->zzayv:Lcom/google/android/gms/location/internal/zza;

    iput-wide p3, p0, Lcom/google/android/gms/location/internal/zza$1;->zzayt:J

    iput-object p5, p0, Lcom/google/android/gms/location/internal/zza$1;->zzayu:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/zza$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/location/internal/zzj;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zza$1;->zza(Lcom/google/android/gms/location/internal/zzj;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/internal/zzj;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/android/gms/location/internal/zza$1;->zzayt:J

    iget-object v2, p0, Lcom/google/android/gms/location/internal/zza$1;->zzayu:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/location/internal/zzj;->zza(JLandroid/app/PendingIntent;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzXP:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/internal/zza$1;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
