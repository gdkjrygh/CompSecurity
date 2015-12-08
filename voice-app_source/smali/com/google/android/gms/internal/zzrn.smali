.class public abstract Lcom/google/android/gms/internal/zzrn;
.super Ljava/lang/Object;


# instance fields
.field protected volatile zzaWf:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzrn;->zzaWf:I

    return-void
.end method

.method public static final zza(Lcom/google/android/gms/internal/zzrn;[B)Lcom/google/android/gms/internal/zzrn;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzrn;",
            ">(TT;[B)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzrm;
        }
    .end annotation

    const/4 v0, 0x0

    array-length v1, p1

    invoke-static {p0, p1, v0, v1}, Lcom/google/android/gms/internal/zzrn;->zzb(Lcom/google/android/gms/internal/zzrn;[BII)Lcom/google/android/gms/internal/zzrn;

    move-result-object v0

    return-object v0
.end method

.method public static final zza(Lcom/google/android/gms/internal/zzrn;[BII)V
    .locals 3

    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/zzrg;->zzb([BII)Lcom/google/android/gms/internal/zzrg;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzrn;->zza(Lcom/google/android/gms/internal/zzrg;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzrg;->zzBH()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static final zzb(Lcom/google/android/gms/internal/zzrn;[BII)Lcom/google/android/gms/internal/zzrn;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zzrn;",
            ">(TT;[BII)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzrm;
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/zzrf;->zza([BII)Lcom/google/android/gms/internal/zzrf;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzrn;->zzb(Lcom/google/android/gms/internal/zzrf;)Lcom/google/android/gms/internal/zzrn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzrf;->zzkz(I)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzrm; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    return-object p0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Reading from a byte array threw an IOException (should never happen)."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final zzf(Lcom/google/android/gms/internal/zzrn;)[B
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrn;->zzBV()I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {p0, v0, v1, v2}, Lcom/google/android/gms/internal/zzrn;->zza(Lcom/google/android/gms/internal/zzrn;[BII)V

    return-object v0
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrn;->zzBK()Lcom/google/android/gms/internal/zzrn;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/zzro;->zzg(Lcom/google/android/gms/internal/zzrn;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected zzB()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzBK()Lcom/google/android/gms/internal/zzrn;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzrn;

    return-object v0
.end method

.method public zzBU()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzrn;->zzaWf:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrn;->zzBV()I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/zzrn;->zzaWf:I

    return v0
.end method

.method public zzBV()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrn;->zzB()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzrn;->zzaWf:I

    return v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzrg;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public abstract zzb(Lcom/google/android/gms/internal/zzrf;)Lcom/google/android/gms/internal/zzrn;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
