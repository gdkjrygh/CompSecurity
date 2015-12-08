.class Lcom/google/android/gms/drive/internal/zzs$3;
.super Lcom/google/android/gms/drive/internal/zzr$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzs;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/events/ChangesAvailableOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaeU:Lcom/google/android/gms/drive/DriveId;

.field final synthetic zzaeV:I

.field final synthetic zzaeW:Lcom/google/android/gms/drive/events/ChangesAvailableOptions;

.field final synthetic zzaeY:Lcom/google/android/gms/drive/internal/zzs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzs;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/ChangesAvailableOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeY:Lcom/google/android/gms/drive/internal/zzs;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeU:Lcom/google/android/gms/drive/DriveId;

    iput p4, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeV:I

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeW:Lcom/google/android/gms/drive/events/ChangesAvailableOptions;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/zzr$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/drive/internal/zzs;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzs$3;->zza(Lcom/google/android/gms/drive/internal/zzs;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/drive/internal/zzs;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzs;->zzpB()Lcom/google/android/gms/drive/internal/zzak;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeU:Lcom/google/android/gms/drive/DriveId;

    iget v3, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeV:I

    iget-object v4, p0, Lcom/google/android/gms/drive/internal/zzs$3;->zzaeW:Lcom/google/android/gms/drive/events/ChangesAvailableOptions;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/AddEventListenerRequest;-><init>(Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/ChangesAvailableOptions;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/zzbq;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/zzbq;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-interface {v0, v1, v5, v5, v2}, Lcom/google/android/gms/drive/internal/zzak;->zza(Lcom/google/android/gms/drive/internal/AddEventListenerRequest;Lcom/google/android/gms/drive/internal/zzam;Ljava/lang/String;Lcom/google/android/gms/drive/internal/zzal;)V

    return-void
.end method
