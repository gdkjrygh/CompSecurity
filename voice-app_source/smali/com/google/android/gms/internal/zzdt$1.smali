.class Lcom/google/android/gms/internal/zzdt$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzdt;->zzdS()Lcom/google/android/gms/internal/zzdt$zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzwT:Lcom/google/android/gms/internal/zzdt$zze;

.field final synthetic zzwU:Lcom/google/android/gms/internal/zzdt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdt;Lcom/google/android/gms/internal/zzdt$zze;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwT:Lcom/google/android/gms/internal/zzdt$zze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdt;->zza(Lcom/google/android/gms/internal/zzdt;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzdt;->zzb(Lcom/google/android/gms/internal/zzdt;)Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzdt;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/zzbb;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzdt$1$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzdt$1$1;-><init>(Lcom/google/android/gms/internal/zzdt$1;Lcom/google/android/gms/internal/zzbb;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzbb;->zza(Lcom/google/android/gms/internal/zzbb$zza;)V

    const-string v1, "/jsLoaded"

    new-instance v2, Lcom/google/android/gms/internal/zzdt$1$2;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/zzdt$1$2;-><init>(Lcom/google/android/gms/internal/zzdt$1;Lcom/google/android/gms/internal/zzbb;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzbb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    new-instance v1, Lcom/google/android/gms/internal/zzhr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzhr;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/zzdt$1$3;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/internal/zzdt$1$3;-><init>(Lcom/google/android/gms/internal/zzdt$1;Lcom/google/android/gms/internal/zzbb;Lcom/google/android/gms/internal/zzhr;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzhr;->set(Ljava/lang/Object;)V

    const-string v1, "/requestReload"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzbb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdt;->zzf(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ".js"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdt;->zzf(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzr(Ljava/lang/String;)V

    :goto_0
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/zzdt$1$4;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/zzdt$1$4;-><init>(Lcom/google/android/gms/internal/zzdt$1;Lcom/google/android/gms/internal/zzbb;)V

    sget v0, Lcom/google/android/gms/internal/zzdt$zza;->zzxc:I

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdt;->zzf(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "<html>"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdt;->zzf(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzt(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzdt$1;->zzwU:Lcom/google/android/gms/internal/zzdt;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzdt;->zzf(Lcom/google/android/gms/internal/zzdt;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzs(Ljava/lang/String;)V

    goto :goto_0
.end method
