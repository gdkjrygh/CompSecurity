.class Lcom/google/android/gms/internal/zzdt$zze$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzhx$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzdt$zze;->zzdV()Lcom/google/android/gms/internal/zzdt$zzd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzxj:Lcom/google/android/gms/internal/zzdt$zzd;

.field final synthetic zzxk:Lcom/google/android/gms/internal/zzdt$zze;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdt$zze;Lcom/google/android/gms/internal/zzdt$zzd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdt$zze$2;->zzxk:Lcom/google/android/gms/internal/zzdt$zze;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdt$zze$2;->zzxj:Lcom/google/android/gms/internal/zzdt$zzd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$zze$2;->zzxj:Lcom/google/android/gms/internal/zzdt$zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt$zzd;->reject()V

    return-void
.end method
