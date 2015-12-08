.class Lcom/google/android/gms/internal/zzqa$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzqg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzqa;->zza(Lcom/google/android/gms/internal/zzpy;Lcom/google/android/gms/internal/zzqa$zza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaPh:Lcom/google/android/gms/internal/zzpy;

.field final synthetic zzaPi:Lcom/google/android/gms/internal/zzqa$zza;

.field final synthetic zzaPj:Lcom/google/android/gms/internal/zzqa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzqa;Lcom/google/android/gms/internal/zzpy;Lcom/google/android/gms/internal/zzqa$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqa$1;->zzaPj:Lcom/google/android/gms/internal/zzqa;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzqa$1;->zzaPh:Lcom/google/android/gms/internal/zzpy;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzqa$1;->zzaPi:Lcom/google/android/gms/internal/zzqa$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ljava/lang/Integer;J)V
    .locals 8

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/zzqh;->zzaPM:Ljava/lang/Integer;

    if-ne p3, v0, :cond_0

    sget-object v5, Lcom/google/android/gms/internal/zzqe$zza$zza;->zzaPw:Lcom/google/android/gms/internal/zzqe$zza$zza;

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/zzqe$zza;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzXP:Lcom/google/android/gms/common/api/Status;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzqa$1;->zzaPh:Lcom/google/android/gms/internal/zzpy;

    move-object v4, p2

    check-cast v4, Lcom/google/android/gms/internal/zzqf$zzc;

    move-wide v6, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzqe$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzpy;[BLcom/google/android/gms/internal/zzqf$zzc;Lcom/google/android/gms/internal/zzqe$zza$zza;J)V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzqa$1;->zzaPi:Lcom/google/android/gms/internal/zzqa$zza;

    new-instance v2, Lcom/google/android/gms/internal/zzqe;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/zzqe;-><init>(Lcom/google/android/gms/internal/zzqe$zza;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzqa$zza;->zza(Lcom/google/android/gms/internal/zzqe;)V

    return-void

    :cond_0
    sget-object v5, Lcom/google/android/gms/internal/zzqe$zza$zza;->zzaPv:Lcom/google/android/gms/internal/zzqe$zza$zza;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "There is no valid resource for the container: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzqa$1;->zzaPh:Lcom/google/android/gms/internal/zzpy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzpy;->getContainerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/zzqe$zza;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x10

    invoke-direct {v2, v4, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/zzqe$zza$zza;->zzaPv:Lcom/google/android/gms/internal/zzqe$zza$zza;

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/zzqe$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzpy;Lcom/google/android/gms/internal/zzqe$zza$zza;)V

    goto :goto_1
.end method
