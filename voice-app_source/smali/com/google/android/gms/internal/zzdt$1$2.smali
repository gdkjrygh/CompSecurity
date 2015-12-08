.class Lcom/google/android/gms/internal/zzdt$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzdg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzdt$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzwV:Lcom/google/android/gms/internal/zzbb;

.field final synthetic zzwW:Lcom/google/android/gms/internal/zzdt$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdt$1;Lcom/google/android/gms/internal/zzbb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwV:Lcom/google/android/gms/internal/zzbb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzid;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzid;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdt;->zzc(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwT:Lcom/google/android/gms/internal/zzdt$zze;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt$zze;->getStatus()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwT:Lcom/google/android/gms/internal/zzdt$zze;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt$zze;->getStatus()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzdt;->zza(Lcom/google/android/gms/internal/zzdt;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdt;->zzd(Lcom/google/android/gms/internal/zzdt;)Lcom/google/android/gms/internal/zzdt$zzb;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwV:Lcom/google/android/gms/internal/zzbb;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzdt$zzb;->zzc(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwT:Lcom/google/android/gms/internal/zzdt$zze;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwV:Lcom/google/android/gms/internal/zzbb;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzdt$zze;->zzg(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdt$1$2;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzdt$1;->zzwT:Lcom/google/android/gms/internal/zzdt$zze;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzdt;->zza(Lcom/google/android/gms/internal/zzdt;Lcom/google/android/gms/internal/zzdt$zze;)Lcom/google/android/gms/internal/zzdt$zze;

    const-string v0, "Successfully loaded JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
