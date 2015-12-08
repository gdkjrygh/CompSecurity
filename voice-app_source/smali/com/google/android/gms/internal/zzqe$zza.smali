.class public Lcom/google/android/gms/internal/zzqe$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzqe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzqe$zza$zza;
    }
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field private final zzaPp:Lcom/google/android/gms/internal/zzqe$zza$zza;

.field private final zzaPq:[B

.field private final zzaPr:J

.field private final zzaPs:Lcom/google/android/gms/internal/zzpy;

.field private final zzaPt:Lcom/google/android/gms/internal/zzqf$zzc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzpy;Lcom/google/android/gms/internal/zzqe$zza$zza;)V
    .locals 8

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, v3

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzqe$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzpy;[BLcom/google/android/gms/internal/zzqf$zzc;Lcom/google/android/gms/internal/zzqe$zza$zza;J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzpy;[BLcom/google/android/gms/internal/zzqf$zzc;Lcom/google/android/gms/internal/zzqe$zza$zza;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPs:Lcom/google/android/gms/internal/zzpy;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPq:[B

    iput-object p4, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPt:Lcom/google/android/gms/internal/zzqf$zzc;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPp:Lcom/google/android/gms/internal/zzqe$zza$zza;

    iput-wide p6, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPr:J

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public zzAh()Lcom/google/android/gms/internal/zzqe$zza$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPp:Lcom/google/android/gms/internal/zzqe$zza$zza;

    return-object v0
.end method

.method public zzAi()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPq:[B

    return-object v0
.end method

.method public zzAj()Lcom/google/android/gms/internal/zzpy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPs:Lcom/google/android/gms/internal/zzpy;

    return-object v0
.end method

.method public zzAk()Lcom/google/android/gms/internal/zzqf$zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPt:Lcom/google/android/gms/internal/zzqf$zzc;

    return-object v0
.end method

.method public zzAl()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzqe$zza;->zzaPr:J

    return-wide v0
.end method
