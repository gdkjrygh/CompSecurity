.class public final Lcom/google/android/gms/internal/zzof;
.super Lcom/google/android/gms/internal/zznq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zznq",
        "<",
        "Lcom/google/android/gms/internal/zzof;",
        ">;"
    }
.end annotation


# instance fields
.field public mCategory:Ljava/lang/String;

.field public zzaEH:Ljava/lang/String;

.field public zzaET:Ljava/lang/String;

.field public zzaEU:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zznq;-><init>()V

    return-void
.end method


# virtual methods
.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->zzaEH:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeInMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzof;->zzaEU:J

    return-wide v0
.end method

.method public setTimeInMillis(J)V
    .locals 1
    .param p1, "milliseconds"    # J

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/internal/zzof;->zzaEU:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "variableName"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzof;->zzaET:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "timeInMillis"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzof;->zzaEU:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "category"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzof;->mCategory:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "label"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzof;->zzaEH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzof;->zzy(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic zza(Lcom/google/android/gms/internal/zznq;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzof;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzof;->zza(Lcom/google/android/gms/internal/zzof;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzof;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->zzaET:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->zzaET:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzof;->zzdN(Ljava/lang/String;)V

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzof;->zzaEU:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzof;->zzaEU:J

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzof;->setTimeInMillis(J)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->mCategory:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->mCategory:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzof;->zzdG(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->zzaEH:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->zzaEH:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzof;->zzdI(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public zzdG(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzof;->mCategory:Ljava/lang/String;

    return-void
.end method

.method public zzdI(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzof;->zzaEH:Ljava/lang/String;

    return-void
.end method

.method public zzdN(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzof;->zzaET:Ljava/lang/String;

    return-void
.end method

.method public zzwJ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->zzaET:Ljava/lang/String;

    return-object v0
.end method

.method public zzwy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzof;->mCategory:Ljava/lang/String;

    return-object v0
.end method
