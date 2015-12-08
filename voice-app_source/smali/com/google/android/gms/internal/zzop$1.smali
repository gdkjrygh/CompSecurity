.class Lcom/google/android/gms/internal/zzop$1;
.super Lcom/google/android/gms/internal/zzoo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzop;->zzp(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

.field final synthetic zzaFq:Lcom/google/android/gms/internal/zzop;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzop;Lcom/google/android/gms/common/api/zza$zzb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzop$1;->zzaFq:Lcom/google/android/gms/internal/zzop;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzop$1;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzoo;-><init>()V

    return-void
.end method


# virtual methods
.method public zzib(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzop$1;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/zza$zzb;->zzm(Ljava/lang/Object;)V

    return-void
.end method
