.class Lcom/google/android/gms/internal/zzdt$1$3;
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

.field final synthetic zzwZ:Lcom/google/android/gms/internal/zzhr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdt$1;Lcom/google/android/gms/internal/zzbb;Lcom/google/android/gms/internal/zzhr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwV:Lcom/google/android/gms/internal/zzbb;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwZ:Lcom/google/android/gms/internal/zzhr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzid;Ljava/util/Map;)V
    .locals 4
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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdt;->zzc(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    const-string v0, "JS Engine is requesting an update"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaA(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdt;->zze(Lcom/google/android/gms/internal/zzdt;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Starting reload."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaA(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzdt;->zza(Lcom/google/android/gms/internal/zzdt;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwW:Lcom/google/android/gms/internal/zzdt$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt;->zzdT()Lcom/google/android/gms/internal/zzdt$zze;

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwV:Lcom/google/android/gms/internal/zzbb;

    const-string v3, "/requestReload"

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1$3;->zzwZ:Lcom/google/android/gms/internal/zzhr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhr;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzdg;

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/zzbb;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
