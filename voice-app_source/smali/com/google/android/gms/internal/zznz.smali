.class public final Lcom/google/android/gms/internal/zznz;
.super Lcom/google/android/gms/internal/zznq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zznq",
        "<",
        "Lcom/google/android/gms/internal/zznz;",
        ">;"
    }
.end annotation


# instance fields
.field private zzRA:Ljava/lang/String;

.field public zzaEE:I

.field public zzaEF:I

.field public zzaEG:I

.field public zzyW:I

.field public zzyX:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zznq;-><init>()V

    return-void
.end method


# virtual methods
.method public getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zznz;->zzRA:Ljava/lang/String;

    return-object v0
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/internal/zznz;->zzRA:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "language"

    iget-object v2, p0, Lcom/google/android/gms/internal/zznz;->zzRA:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "screenColors"

    iget v2, p0, Lcom/google/android/gms/internal/zznz;->zzaEE:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "screenWidth"

    iget v2, p0, Lcom/google/android/gms/internal/zznz;->zzyW:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "screenHeight"

    iget v2, p0, Lcom/google/android/gms/internal/zznz;->zzyX:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "viewportWidth"

    iget v2, p0, Lcom/google/android/gms/internal/zznz;->zzaEF:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "viewportHeight"

    iget v2, p0, Lcom/google/android/gms/internal/zznz;->zzaEG:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznz;->zzy(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic zza(Lcom/google/android/gms/internal/zznq;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zznz;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zznz;->zza(Lcom/google/android/gms/internal/zznz;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zznz;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEE:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEE:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznz;->zzhF(I)V

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzyW:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzyW:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznz;->zzhG(I)V

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzyX:I

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzyX:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznz;->zzhH(I)V

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEF:I

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEF:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznz;->zzhI(I)V

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEG:I

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEG:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznz;->zzhJ(I)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zznz;->zzRA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/zznz;->zzRA:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznz;->setLanguage(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public zzhF(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/zznz;->zzaEE:I

    return-void
.end method

.method public zzhG(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/zznz;->zzyW:I

    return-void
.end method

.method public zzhH(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/zznz;->zzyX:I

    return-void
.end method

.method public zzhI(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/zznz;->zzaEF:I

    return-void
.end method

.method public zzhJ(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/zznz;->zzaEG:I

    return-void
.end method

.method public zzwp()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEE:I

    return v0
.end method

.method public zzwq()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzyW:I

    return v0
.end method

.method public zzwr()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzyX:I

    return v0
.end method

.method public zzws()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEF:I

    return v0
.end method

.method public zzwt()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zznz;->zzaEG:I

    return v0
.end method
