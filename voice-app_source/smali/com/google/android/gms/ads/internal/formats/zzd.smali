.class public Lcom/google/android/gms/ads/internal/formats/zzd;
.super Lcom/google/android/gms/internal/zzco$zza;

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

.field private final zzvk:Lcom/google/android/gms/ads/internal/formats/zzc;

.field private final zzvl:Ljava/lang/String;

.field private final zzvm:D

.field private final zzvn:Ljava/lang/String;

.field private final zzvo:Ljava/lang/String;

.field private final zzvp:Lcom/google/android/gms/ads/internal/formats/zza;

.field private zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zzc;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zza;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzco$zza;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzqt:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvh:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvi:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvj:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvk:Lcom/google/android/gms/ads/internal/formats/zzc;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvl:Ljava/lang/String;

    iput-wide p6, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvm:D

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvn:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvo:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvp:Lcom/google/android/gms/ads/internal/formats/zza;

    return-void
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvj:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomTemplateId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getImages()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvi:Ljava/util/List;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/ads/internal/formats/zzg;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzdA()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvm:D

    return-wide v0
.end method

.method public zzdB()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvn:Ljava/lang/String;

    return-object v0
.end method

.method public zzdC()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvo:Ljava/lang/String;

    return-object v0
.end method

.method public zzdD()Lcom/google/android/gms/dynamic/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/zze;->zzw(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    return-object v0
.end method

.method public zzdE()Ljava/lang/String;
    .locals 1

    const-string v0, "2"

    return-object v0
.end method

.method public zzdF()Lcom/google/android/gms/ads/internal/formats/zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvp:Lcom/google/android/gms/ads/internal/formats/zza;

    return-object v0
.end method

.method public zzdx()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvh:Ljava/lang/String;

    return-object v0
.end method

.method public zzdy()Lcom/google/android/gms/internal/zzck;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvk:Lcom/google/android/gms/ads/internal/formats/zzc;

    return-object v0
.end method

.method public zzdz()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzd;->zzvl:Ljava/lang/String;

    return-object v0
.end method
