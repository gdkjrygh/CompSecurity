.class Lcom/google/android/gms/internal/zzdt$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzhx$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzdt;->zzdT()Lcom/google/android/gms/internal/zzdt$zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzwU:Lcom/google/android/gms/internal/zzdt;

.field final synthetic zzxb:Lcom/google/android/gms/internal/zzdt$zze;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdt;Lcom/google/android/gms/internal/zzdt$zze;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdt$3;->zzwU:Lcom/google/android/gms/internal/zzdt;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdt$3;->zzxb:Lcom/google/android/gms/internal/zzdt$zze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$3;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdt;->zzc(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$3;->zzwU:Lcom/google/android/gms/internal/zzdt;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzdt;->zza(Lcom/google/android/gms/internal/zzdt;I)I

    const-string v0, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$3;->zzxb:Lcom/google/android/gms/internal/zzdt$zze;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt$zze;->zzdX()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
