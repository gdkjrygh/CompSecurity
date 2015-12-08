.class public Lcom/google/android/gms/analytics/internal/zzk;
.super Lcom/google/android/gms/analytics/internal/zzd;


# instance fields
.field private final zzKm:Lcom/google/android/gms/internal/zznx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/zzf;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/zzd;-><init>(Lcom/google/android/gms/analytics/internal/zzf;)V

    new-instance v0, Lcom/google/android/gms/internal/zznx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zznx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/zzk;->zzKm:Lcom/google/android/gms/internal/zznx;

    return-void
.end method


# virtual methods
.method public zzhi()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzk;->zzhm()Lcom/google/android/gms/analytics/internal/zzan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/zzan;->zzjL()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/zzk;->zzKm:Lcom/google/android/gms/internal/zznx;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznx;->setAppName(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/zzan;->zzjN()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/zzk;->zzKm:Lcom/google/android/gms/internal/zznx;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznx;->setAppVersion(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method protected zzhn()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzk;->zzhS()Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzns;->zzwc()Lcom/google/android/gms/internal/zznx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/zzk;->zzKm:Lcom/google/android/gms/internal/zznx;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zznx;->zza(Lcom/google/android/gms/internal/zznx;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzk;->zzhi()V

    return-void
.end method

.method public zzix()Lcom/google/android/gms/internal/zznx;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzk;->zzia()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzk;->zzKm:Lcom/google/android/gms/internal/zznx;

    return-object v0
.end method
