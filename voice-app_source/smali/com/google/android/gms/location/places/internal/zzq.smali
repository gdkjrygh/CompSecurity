.class public Lcom/google/android/gms/location/places/internal/zzq;
.super Lcom/google/android/gms/location/places/internal/zzt;

# interfaces
.implements Lcom/google/android/gms/location/places/zzg;


# instance fields
.field private final zzaAW:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/zzt;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    const-string v0, "photo_fife_url"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/places/internal/zzq;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/zzq;->zzaAW:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzq;->zzuZ()Lcom/google/android/gms/location/places/zzg;

    move-result-object v0

    return-object v0
.end method

.method public getAttributions()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "photo_attributions"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzq;->zzB(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 2

    const-string v0, "photo_max_height"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzq;->zzz(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getMaxWidth()I
    .locals 2

    const-string v0, "photo_max_width"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/zzq;->zzz(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public zzuZ()Lcom/google/android/gms/location/places/zzg;
    .locals 6

    new-instance v0, Lcom/google/android/gms/location/places/internal/zzp;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/zzq;->zzaAW:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzq;->getMaxWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzq;->getMaxHeight()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzq;->getAttributions()Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, Lcom/google/android/gms/location/places/internal/zzq;->zzYs:I

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/zzp;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;I)V

    return-object v0
.end method
