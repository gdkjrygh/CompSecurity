.class public Lcom/google/android/gms/internal/zzpy;
.super Ljava/lang/Object;


# instance fields
.field private final zzaKy:Ljava/lang/String;

.field private final zzaMW:Ljava/lang/String;

.field private final zzaPb:Ljava/lang/Integer;

.field private final zzaPc:Ljava/lang/String;

.field private final zzaPd:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V
    .locals 6

    const-string v5, ""

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzpy;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpy;->zzaKy:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzpy;->zzaPb:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzpy;->zzaPc:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzpy;->zzaPd:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/zzpy;->zzaMW:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getContainerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaKy:Ljava/lang/String;

    return-object v0
.end method

.method public zzAa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaPc:Ljava/lang/String;

    return-object v0
.end method

.method public zzAb()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaPc:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpy;->zzaPc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpy;->zzaKy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaKy:Ljava/lang/String;

    goto :goto_0
.end method

.method public zzAc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaPd:Z

    return v0
.end method

.method public zzAd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaMW:Ljava/lang/String;

    return-object v0
.end method

.method public zzzZ()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy;->zzaPb:Ljava/lang/Integer;

    return-object v0
.end method
