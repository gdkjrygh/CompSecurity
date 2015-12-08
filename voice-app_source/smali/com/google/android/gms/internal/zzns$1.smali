.class Lcom/google/android/gms/internal/zzns$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzns;->zze(Lcom/google/android/gms/internal/zzno;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaEm:Lcom/google/android/gms/internal/zzno;

.field final synthetic zzaEn:Lcom/google/android/gms/internal/zzns;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzns;Lcom/google/android/gms/internal/zzno;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEn:Lcom/google/android/gms/internal/zzns;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEm:Lcom/google/android/gms/internal/zzno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEm:Lcom/google/android/gms/internal/zzno;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzno;->zzvW()Lcom/google/android/gms/internal/zznr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEm:Lcom/google/android/gms/internal/zzno;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zznr;->zza(Lcom/google/android/gms/internal/zzno;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEn:Lcom/google/android/gms/internal/zzns;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzns;->zza(Lcom/google/android/gms/internal/zzns;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zznt;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEm:Lcom/google/android/gms/internal/zzno;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zznt;->zza(Lcom/google/android/gms/internal/zzno;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEn:Lcom/google/android/gms/internal/zzns;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzns$1;->zzaEm:Lcom/google/android/gms/internal/zzno;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzns;->zza(Lcom/google/android/gms/internal/zzns;Lcom/google/android/gms/internal/zzno;)V

    return-void
.end method
