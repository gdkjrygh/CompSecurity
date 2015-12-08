.class public Lcom/google/android/gms/internal/zzhu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzhu$zza;
    }
.end annotation


# direct methods
.method public static zza(Lcom/google/android/gms/internal/zzhv;Lcom/google/android/gms/internal/zzhu$zza;)Lcom/google/android/gms/internal/zzhv;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzhv",
            "<TA;>;",
            "Lcom/google/android/gms/internal/zzhu$zza",
            "<TA;TB;>;)",
            "Lcom/google/android/gms/internal/zzhv",
            "<TB;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzhs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzhs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzhu$1;

    invoke-direct {v1, v0, p1, p0}, Lcom/google/android/gms/internal/zzhu$1;-><init>(Lcom/google/android/gms/internal/zzhs;Lcom/google/android/gms/internal/zzhu$zza;Lcom/google/android/gms/internal/zzhv;)V

    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/zzhv;->zzb(Ljava/lang/Runnable;)V

    return-object v0
.end method
