.class final Lcom/google/android/gms/location/internal/zzj$zza;
.super Lcom/google/android/gms/common/internal/zzi$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/internal/zzj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/location/internal/zzg;",
        ">.zzc<",
        "Lcom/google/android/gms/location/zze$zza;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzTS:I

.field private final zzayT:[Ljava/lang/String;

.field final synthetic zzayU:Lcom/google/android/gms/location/internal/zzj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/internal/zzj;Lcom/google/android/gms/location/zze$zza;I[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zzj$zza;->zzayU:Lcom/google/android/gms/location/internal/zzj;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/internal/zzi$zzc;-><init>(Lcom/google/android/gms/common/internal/zzi;Ljava/lang/Object;)V

    invoke-static {p3}, Lcom/google/android/gms/location/LocationStatusCodes;->zzgA(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/location/internal/zzj$zza;->zzTS:I

    iput-object p4, p0, Lcom/google/android/gms/location/internal/zzj$zza;->zzayT:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/location/zze$zza;)V
    .locals 2

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/location/internal/zzj$zza;->zzTS:I

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj$zza;->zzayT:[Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/zze$zza;->zza(I[Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected zznP()V
    .locals 0

    return-void
.end method

.method protected synthetic zzr(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/zze$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zzj$zza;->zza(Lcom/google/android/gms/location/zze$zza;)V

    return-void
.end method
