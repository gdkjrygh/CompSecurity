.class public Lcom/google/android/gms/location/places/zzh;
.super Lcom/google/android/gms/common/data/AbstractDataBuffer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/AbstractDataBuffer",
        "<",
        "Lcom/google/android/gms/location/places/zzg;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/AbstractDataBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method


# virtual methods
.method public synthetic get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/zzh;->zzgP(I)Lcom/google/android/gms/location/places/zzg;

    move-result-object v0

    return-object v0
.end method

.method public zzgP(I)Lcom/google/android/gms/location/places/zzg;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/internal/zzq;

    iget-object v1, p0, Lcom/google/android/gms/location/places/zzh;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/zzq;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method
