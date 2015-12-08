.class public Lcom/google/android/gms/internal/zzgm;
.super Lcom/google/android/gms/ads/internal/reward/client/zza$zza;


# instance fields
.field private final zzEL:I

.field private final zzEl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/reward/client/zza$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgm;->zzEl:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/zzgm;->zzEL:I

    return-void
.end method


# virtual methods
.method public getAmount()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzgm;->zzEL:I

    return v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgm;->zzEl:Ljava/lang/String;

    return-object v0
.end method
