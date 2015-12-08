.class Lcom/google/android/gms/location/internal/zze$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/location/zze$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/zze$3;->zza(Lcom/google/android/gms/location/internal/zzj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzayK:Lcom/google/android/gms/location/internal/zze$3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/zze$3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zze$3$1;->zzayK:Lcom/google/android/gms/location/internal/zze$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(ILandroid/app/PendingIntent;)V
    .locals 2

    const-string v0, "GeofencingImpl"

    const-string v1, "PendingIntent callback shouldn\'t have been called"

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public zzb(I[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zze$3$1;->zzayK:Lcom/google/android/gms/location/internal/zze$3;

    invoke-static {p1}, Lcom/google/android/gms/location/LocationStatusCodes;->zzgB(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/internal/zze$3;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
