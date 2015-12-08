.class Lcom/google/android/gms/drive/internal/zzy$2;
.super Lcom/google/android/gms/drive/internal/zzr$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzy;->setFileUploadPreferences(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/FileUploadPreferences;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzafu:Lcom/google/android/gms/drive/internal/zzy;

.field final synthetic zzafv:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzy$2;->zzafu:Lcom/google/android/gms/drive/internal/zzy;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/zzy$2;->zzafv:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzy$2;->zza(Lcom/google/android/gms/drive/internal/zzs;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/drive/internal/zzs;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzs;->zzpB()Lcom/google/android/gms/drive/internal/zzak;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzy$2;->zzafv:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    invoke-direct {v1, v2}, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;-><init>(Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/zzbq;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/zzbq;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/zzak;->zza(Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;Lcom/google/android/gms/drive/internal/zzal;)V

    return-void
.end method
