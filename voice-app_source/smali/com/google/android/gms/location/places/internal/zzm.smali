.class public Lcom/google/android/gms/location/places/internal/zzm;
.super Lcom/google/android/gms/location/places/internal/zzt;

# interfaces
.implements Lcom/google/android/gms/location/places/PlaceLikelihood;


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;ILandroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/zzt;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object p3, p0, Lcom/google/android/gms/location/places/internal/zzm;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzm;->zzuY()Lcom/google/android/gms/location/places/PlaceLikelihood;

    move-result-object v0

    return-object v0
.end method

.method public getLikelihood()F
    .locals 2

    const-string v0, "place_likelihood"

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzm;->zzb(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public getPlace()Lcom/google/android/gms/location/places/Place;
    .locals 4

    new-instance v0, Lcom/google/android/gms/location/places/internal/zzr;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/zzm;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iget v2, p0, Lcom/google/android/gms/location/places/internal/zzm;->zzYs:I

    iget-object v3, p0, Lcom/google/android/gms/location/places/internal/zzm;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/location/places/internal/zzr;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILandroid/content/Context;)V

    return-object v0
.end method

.method public zzuY()Lcom/google/android/gms/location/places/PlaceLikelihood;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzm;->getPlace()Lcom/google/android/gms/location/places/Place;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/location/places/Place;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/PlaceImpl;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzm;->getLikelihood()F

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->zza(Lcom/google/android/gms/location/places/internal/PlaceImpl;F)Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;

    move-result-object v0

    return-object v0
.end method
