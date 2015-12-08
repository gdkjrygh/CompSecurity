.class Lcom/google/android/gms/internal/zzpd$2;
.super Lcom/google/android/gms/internal/zzpd$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzpd;->load(Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaHC:Lcom/google/android/gms/internal/zzpd;

.field final synthetic zzaHD:Ljava/lang/String;

.field final synthetic zzaHE:Landroid/net/Uri;

.field final synthetic zzaHF:Ljava/lang/String;

.field final synthetic zzaHG:Ljava/lang/String;

.field final synthetic zzard:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzpd;Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHC:Lcom/google/android/gms/internal/zzpd;

    iput p3, p0, Lcom/google/android/gms/internal/zzpd$2;->zzard:I

    iput-object p4, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHD:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHE:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHF:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHG:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/zzpd$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzpd$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/plus/internal/zze;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzpd$2;->zza(Lcom/google/android/gms/plus/internal/zze;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/plus/internal/zze;)V
    .locals 7

    iget v2, p0, Lcom/google/android/gms/internal/zzpd$2;->zzard:I

    iget-object v3, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHD:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHE:Landroid/net/Uri;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHF:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzpd$2;->zzaHG:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/zze;->zza(Lcom/google/android/gms/common/api/zza$zzb;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
