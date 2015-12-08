.class public abstract Lcom/google/android/gms/internal/zzbv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzbs;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzbs;"
    }
.end annotation


# instance fields
.field private final zztw:Ljava/lang/String;

.field private final zztx:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzbv;->zztw:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzbv;->zztx:Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbD()Lcom/google/android/gms/internal/zzbw;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzbw;->zza(Lcom/google/android/gms/internal/zzbs;)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/zzbv$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzbv;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static zzO(Ljava/lang/String;)Lcom/google/android/gms/internal/zzbv;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/zzbv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/zzbv;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzbv;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbD()Lcom/google/android/gms/internal/zzbw;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzbw;->zza(Lcom/google/android/gms/internal/zzbv;)V

    return-object v0
.end method

.method public static zzP(Ljava/lang/String;)Lcom/google/android/gms/internal/zzbv;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/zzbv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/zzbv;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzbv;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbD()Lcom/google/android/gms/internal/zzbw;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzbw;->zzb(Lcom/google/android/gms/internal/zzbv;)V

    return-object v0
.end method

.method public static zza(Ljava/lang/String;I)Lcom/google/android/gms/internal/zzbv;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/zzbv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzbv$2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzbv$2;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/zzbv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/google/android/gms/internal/zzbv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzbv$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzbv$1;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/zzbv;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Lcom/google/android/gms/internal/zzbv",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzbv$3;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzbv$3;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzbv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/zzbv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzbv$4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzbv$4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbE()Lcom/google/android/gms/internal/zzby;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzby;->zzc(Lcom/google/android/gms/internal/zzbv;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbv;->zztw:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract zza(Landroid/content/SharedPreferences;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            ")TT;"
        }
    .end annotation
.end method

.method public zzcY()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbv;->zztx:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract zzcZ()Lcom/google/android/gms/internal/zzkf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzkf",
            "<TT;>;"
        }
    .end annotation
.end method
