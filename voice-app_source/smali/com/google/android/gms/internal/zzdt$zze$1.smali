.class Lcom/google/android/gms/internal/zzdt$zze$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzhx$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzdt$zze;->zzdV()Lcom/google/android/gms/internal/zzdt$zzd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzhx$zzc",
        "<",
        "Lcom/google/android/gms/internal/zzbb;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzxj:Lcom/google/android/gms/internal/zzdt$zzd;

.field final synthetic zzxk:Lcom/google/android/gms/internal/zzdt$zze;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdt$zze;Lcom/google/android/gms/internal/zzdt$zzd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdt$zze$1;->zzxk:Lcom/google/android/gms/internal/zzdt$zze;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdt$zze$1;->zzxj:Lcom/google/android/gms/internal/zzdt$zzd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzbb;)V
    .locals 2

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$zze$1;->zzxj:Lcom/google/android/gms/internal/zzdt$zzd;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzbb;->zzce()Lcom/google/android/gms/internal/zzbf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzdt$zzd;->zzg(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic zzc(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzbb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzdt$zze$1;->zza(Lcom/google/android/gms/internal/zzbb;)V

    return-void
.end method
