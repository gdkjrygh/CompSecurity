.class public abstract Lcom/google/android/gms/location/places/zzm$zze;
.super Lcom/google/android/gms/location/places/zzm$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/zzm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zze"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lcom/google/android/gms/common/api/Api$Client;",
        ">",
        "Lcom/google/android/gms/location/places/zzm$zzb",
        "<",
        "Lcom/google/android/gms/location/places/personalized/zzd;",
        "TA;>;"
    }
.end annotation


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    .local p0, "this":Lcom/google/android/gms/location/places/zzm$zze;, "Lcom/google/android/gms/location/places/zzm$zze<TA;>;"
    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/zzm$zze;->zzaJ(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/personalized/zzd;

    move-result-object v0

    return-object v0
.end method

.method protected zzaJ(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/personalized/zzd;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/location/places/personalized/zzd;->zzaK(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/personalized/zzd;

    move-result-object v0

    return-object v0
.end method
