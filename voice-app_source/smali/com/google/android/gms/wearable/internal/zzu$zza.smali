.class final Lcom/google/android/gms/wearable/internal/zzu$zza;
.super Lcom/google/android/gms/wearable/internal/zzf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/zzu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzf",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private zzaUj:Lcom/google/android/gms/wearable/DataApi$DataListener;

.field private zzaUk:[Landroid/content/IntentFilter;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzf;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUj:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUk:[Landroid/content/IntentFilter;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;Lcom/google/android/gms/wearable/internal/zzu$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/wearable/internal/zzu$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

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

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzu$zza;->zza(Lcom/google/android/gms/wearable/internal/zzbk;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbk;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUj:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUk:[Landroid/content/IntentFilter;

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/wearable/internal/zzbk;->zza(Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)V

    iput-object v2, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUj:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iput-object v2, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUk:[Landroid/content/IntentFilter;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUj:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzu$zza;->zzaUk:[Landroid/content/IntentFilter;

    return-object p1
.end method
