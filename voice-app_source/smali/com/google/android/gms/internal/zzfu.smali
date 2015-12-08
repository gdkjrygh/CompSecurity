.class public Lcom/google/android/gms/internal/zzfu;
.super Lcom/google/android/gms/internal/zzfp;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzft$zza;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzfp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzft$zza;)V

    return-void
.end method


# virtual methods
.method protected zzfn()V
    .locals 0

    return-void
.end method

.method protected zzh(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzfs$zza;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzfu$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzfu$1;-><init>(Lcom/google/android/gms/internal/zzfu;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzfu;->zzg(J)V

    return-void
.end method
