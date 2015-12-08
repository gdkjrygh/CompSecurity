.class Lcom/google/android/gms/internal/zziv$1;
.super Lcom/google/android/gms/internal/zziv$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zziv;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/appdatasearch/UsageInfo;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zziv$zzc",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzNP:Ljava/lang/String;

.field final synthetic zzNQ:[Lcom/google/android/gms/appdatasearch/UsageInfo;

.field final synthetic zzNR:Lcom/google/android/gms/internal/zziv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zziv;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[Lcom/google/android/gms/appdatasearch/UsageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zziv$1;->zzNR:Lcom/google/android/gms/internal/zziv;

    iput-object p3, p0, Lcom/google/android/gms/internal/zziv$1;->zzNP:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zziv$1;->zzNQ:[Lcom/google/android/gms/appdatasearch/UsageInfo;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zziv$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/internal/zziq;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zziv$zzd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zziv$zzd;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zziv$1;->zzNP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zziv$1;->zzNQ:[Lcom/google/android/gms/appdatasearch/UsageInfo;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zziq;->zza(Lcom/google/android/gms/internal/zzir;Ljava/lang/String;[Lcom/google/android/gms/appdatasearch/UsageInfo;)V

    return-void
.end method
