.class public Lcom/google/android/gms/ads/internal/formats/zze;
.super Lcom/google/android/gms/internal/zzcq$zza;

# interfaces
.implements Lcom/google/android/gms/ads/internal/formats/zzg$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzqt:Ljava/lang/Object;

.field private final zzvh:Ljava/lang/String;

.field private final zzvi:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/ads/internal/formats/zzc;",
            ">;"
        }
    .end annotation
.end field

.field private final zzvj:Ljava/lang/String;

.field private final zzvl:Ljava/lang/String;

.field private final zzvp:Lcom/google/android/gms/ads/internal/formats/zza;

.field private zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

.field private final zzvr:Lcom/google/android/gms/ads/internal/formats/zzc;

.field private final zzvs:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zzc;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zza;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzcq$zza;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzqt:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvh:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvi:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvj:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvr:Lcom/google/android/gms/ads/internal/formats/zzc;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvl:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvs:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvp:Lcom/google/android/gms/ads/internal/formats/zza;

    return-void
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvj:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomTemplateId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getImages()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvi:Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/ads/internal/formats/zzg;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzdD()Lcom/google/android/gms/dynamic/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/zze;->zzw(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    return-object v0
.end method

.method public zzdE()Ljava/lang/String;
    .locals 1

    const-string v0, "1"

    return-object v0
.end method

.method public zzdF()Lcom/google/android/gms/ads/internal/formats/zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvp:Lcom/google/android/gms/ads/internal/formats/zza;

    return-object v0
.end method

.method public zzdG()Lcom/google/android/gms/internal/zzck;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvr:Lcom/google/android/gms/ads/internal/formats/zzc;

    return-object v0
.end method

.method public zzdH()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvs:Ljava/lang/String;

    return-object v0
.end method

.method public zzdx()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvh:Ljava/lang/String;

    return-object v0
.end method

.method public zzdz()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zze;->zzvl:Ljava/lang/String;

    return-object v0
.end method
