.class public final Lcom/google/android/gms/internal/zzrq;
.super Ljava/lang/Object;


# static fields
.field public static final zzaWh:[I

.field public static final zzaWi:[J

.field public static final zzaWj:[F

.field public static final zzaWk:[D

.field public static final zzaWl:[Z

.field public static final zzaWm:[Ljava/lang/String;

.field public static final zzaWn:[[B

.field public static final zzaWo:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWh:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWi:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWj:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWk:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWl:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWm:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWn:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/zzrq;->zzaWo:[B

    return-void
.end method

.method static zzD(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method

.method public static final zzb(Lcom/google/android/gms/internal/zzrf;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrf;->getPosition()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrf;->zzkA(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzrf;->zzBr()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzrf;->zzkA(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzrf;->zzkE(I)V

    return v0
.end method

.method static zzkU(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static zzkV(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method
