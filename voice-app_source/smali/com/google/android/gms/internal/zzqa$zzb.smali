.class Lcom/google/android/gms/internal/zzqa$zzb;
.super Lcom/google/android/gms/internal/zzqn;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzqa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "zzb"
.end annotation


# instance fields
.field final synthetic zzaPj:Lcom/google/android/gms/internal/zzqa;

.field private final zzaPk:Lcom/google/android/gms/internal/zzqa$zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzqa;Lcom/google/android/gms/internal/zzqd;Lcom/google/android/gms/internal/zzqb;Lcom/google/android/gms/internal/zzqa$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPj:Lcom/google/android/gms/internal/zzqa;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/zzqn;-><init>(Lcom/google/android/gms/internal/zzqd;Lcom/google/android/gms/internal/zzqb;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPk:Lcom/google/android/gms/internal/zzqa$zza;

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/internal/zzpy;)Lcom/google/android/gms/internal/zzqn$zzb;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected zza(Lcom/google/android/gms/internal/zzqe;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzqe;->zzAg()Lcom/google/android/gms/internal/zzqe$zza;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPj:Lcom/google/android/gms/internal/zzqa;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzqa;->zza(Lcom/google/android/gms/internal/zzqe$zza;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/common/api/Status;->zzXP:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAh()Lcom/google/android/gms/internal/zzqe$zza$zza;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/zzqe$zza$zza;->zzaPu:Lcom/google/android/gms/internal/zzqe$zza$zza;

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAi()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAi()[B

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPj:Lcom/google/android/gms/internal/zzqa;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzqa;->zza(Lcom/google/android/gms/internal/zzqa;)Lcom/google/android/gms/internal/zzqh;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAj()Lcom/google/android/gms/internal/zzpy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzpy;->zzAb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAi()[B

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzqh;->zze(Ljava/lang/String;[B)V

    const-string v0, "Resource successfully load from Network."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPk:Lcom/google/android/gms/internal/zzqa$zza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzqa$zza;->zza(Lcom/google/android/gms/internal/zzqe;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response status: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "SUCCESS"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response source: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAh()Lcom/google/android/gms/internal/zzqe$zza$zza;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzqe$zza$zza;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response size: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAi()[B

    move-result-object v2

    array-length v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPj:Lcom/google/android/gms/internal/zzqa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzqe$zza;->zzAj()Lcom/google/android/gms/internal/zzpy;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzqa$zzb;->zzaPk:Lcom/google/android/gms/internal/zzqa$zza;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzqa;->zza(Lcom/google/android/gms/internal/zzpy;Lcom/google/android/gms/internal/zzqa$zza;)V

    goto :goto_0

    :cond_2
    const-string v0, "FAILURE"

    goto :goto_1
.end method
