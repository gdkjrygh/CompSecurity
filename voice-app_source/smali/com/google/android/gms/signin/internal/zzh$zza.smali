.class Lcom/google/android/gms/signin/internal/zzh$zza;
.super Lcom/google/android/gms/signin/internal/zzd$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/signin/internal/zzh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "zza"
.end annotation


# instance fields
.field private final zzZU:Lcom/google/android/gms/internal/zzpt;

.field private final zzaKb:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzpt;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/signin/internal/zzd$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/signin/internal/zzh$zza;->zzZU:Lcom/google/android/gms/internal/zzpt;

    iput-object p2, p0, Lcom/google/android/gms/signin/internal/zzh$zza;->zzaKb:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/signin/internal/zzh$zza;)Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/signin/internal/zzh$zza;->zzyb()Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;

    move-result-object v0

    return-object v0
.end method

.method private zzyb()Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/internal/zzh$zza;->zzZU:Lcom/google/android/gms/internal/zzpt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzpt;->zzyb()Lcom/google/android/gms/common/api/GoogleApiClient$ServerAuthCodeCallbacks;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/signin/internal/zzf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/internal/zzh$zza;->zzaKb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/signin/internal/zzh$zza$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/signin/internal/zzh$zza$2;-><init>(Lcom/google/android/gms/signin/internal/zzh$zza;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/signin/internal/zzf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public zza(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/signin/internal/zzf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;",
            "Lcom/google/android/gms/signin/internal/zzf;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/internal/zzh$zza;->zzaKb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/signin/internal/zzh$zza$1;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/google/android/gms/signin/internal/zzh$zza$1;-><init>(Lcom/google/android/gms/signin/internal/zzh$zza;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/signin/internal/zzf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
