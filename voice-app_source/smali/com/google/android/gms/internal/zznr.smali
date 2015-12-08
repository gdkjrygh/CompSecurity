.class public abstract Lcom/google/android/gms/internal/zznr;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/gms/internal/zznr;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zzaEe:Lcom/google/android/gms/internal/zzns;

.field protected final zzaEf:Lcom/google/android/gms/internal/zzno;

.field private final zzaEg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zznp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/zzns;Lcom/google/android/gms/internal/zzlb;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zznr;->zzaEe:Lcom/google/android/gms/internal/zzns;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEg:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/zzno;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/zzno;-><init>(Lcom/google/android/gms/internal/zznr;Lcom/google/android/gms/internal/zzlb;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzno;->zzvZ()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEf:Lcom/google/android/gms/internal/zzno;

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/internal/zzno;)V
    .locals 0

    return-void
.end method

.method protected zzd(Lcom/google/android/gms/internal/zzno;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEg:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zznp;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/zznp;->zza(Lcom/google/android/gms/internal/zznr;Lcom/google/android/gms/internal/zzno;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public zzhc()Lcom/google/android/gms/internal/zzno;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEf:Lcom/google/android/gms/internal/zzno;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzno;->zzvP()Lcom/google/android/gms/internal/zzno;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zznr;->zzd(Lcom/google/android/gms/internal/zzno;)V

    return-object v0
.end method

.method protected zzvX()Lcom/google/android/gms/internal/zzns;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEe:Lcom/google/android/gms/internal/zzns;

    return-object v0
.end method

.method public zzwa()Lcom/google/android/gms/internal/zzno;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEf:Lcom/google/android/gms/internal/zzno;

    return-object v0
.end method

.method public zzwb()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zznu;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zznr;->zzaEf:Lcom/google/android/gms/internal/zzno;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzno;->zzvR()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
