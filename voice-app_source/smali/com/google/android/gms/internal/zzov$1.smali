.class Lcom/google/android/gms/internal/zzov$1;
.super Lcom/google/android/gms/internal/zzov$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzov;->loadPanoramaInfo(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaGx:Landroid/net/Uri;

.field final synthetic zzaGy:Lcom/google/android/gms/internal/zzov;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzov;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzov$1;->zzaGy:Lcom/google/android/gms/internal/zzov;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzov$1;->zzaGx:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzov$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzou;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzov$zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzov$zzb;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzov$1;->zzaGx:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {p2, v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzot;Landroid/net/Uri;Landroid/os/Bundle;Z)V

    return-void
.end method
