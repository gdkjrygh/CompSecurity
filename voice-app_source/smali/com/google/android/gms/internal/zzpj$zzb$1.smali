.class Lcom/google/android/gms/internal/zzpj$zzb$1;
.super Lcom/google/android/gms/internal/zzpf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzpj$zzb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaJD:Lcom/google/android/gms/internal/zzpj$zzb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzpj$zzb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpj$zzb$1;->zzaJD:Lcom/google/android/gms/internal/zzpj$zzb;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzpf;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj$zzb$1;->zzaJD:Lcom/google/android/gms/internal/zzpj$zzb;

    new-instance v1, Lcom/google/android/gms/internal/zzpj$zza;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/zzpj$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzpj$zzb;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
