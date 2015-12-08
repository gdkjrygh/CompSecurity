.class Lcom/google/android/gms/internal/zziw$zzc$1;
.super Lcom/google/android/gms/internal/zziy$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zziw$zzc;->zza(Lcom/google/android/gms/internal/zzix;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzOc:Lcom/google/android/gms/internal/zziw$zzc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zziw$zzc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zziw$zzc$1;->zzOc:Lcom/google/android/gms/internal/zziw$zzc;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zziy$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzc(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zziw$zzc$1;->zzOc:Lcom/google/android/gms/internal/zziw$zzc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zziw$zzc;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
