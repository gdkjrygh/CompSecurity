.class public Lcom/google/android/gms/internal/zzbc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzhs;)Lcom/google/android/gms/internal/zzbb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Lcom/google/android/gms/internal/zzhs",
            "<",
            "Lcom/google/android/gms/internal/zzbb;",
            ">;)",
            "Lcom/google/android/gms/internal/zzbb;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzbd;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/zzbd;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    new-instance v1, Lcom/google/android/gms/internal/zzbc$2;

    invoke-direct {v1, p0, p3, v0}, Lcom/google/android/gms/internal/zzbc$2;-><init>(Lcom/google/android/gms/internal/zzbc;Lcom/google/android/gms/internal/zzhs;Lcom/google/android/gms/internal/zzbb;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzbb;->zza(Lcom/google/android/gms/internal/zzbb$zza;)V

    return-object v0
.end method

.method public zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/internal/zzbb;",
            ">;"
        }
    .end annotation

    new-instance v4, Lcom/google/android/gms/internal/zzhs;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzhs;-><init>()V

    sget-object v6, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/zzbc$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzbc$1;-><init>(Lcom/google/android/gms/internal/zzbc;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzhs;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v4
.end method
