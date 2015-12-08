.class public Lcom/google/android/gms/analytics/internal/zzaa;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/internal/zzp;


# instance fields
.field public zzLU:Ljava/lang/String;

.field public zzLV:Ljava/lang/String;

.field public zzLW:Ljava/lang/String;

.field public zzLX:I

.field public zzLY:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLX:I

    iput v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLY:I

    return-void
.end method


# virtual methods
.method public zzjK()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLU:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzjL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLU:Ljava/lang/String;

    return-object v0
.end method

.method public zzjM()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLV:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzjN()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLV:Ljava/lang/String;

    return-object v0
.end method

.method public zzjO()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLW:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzjP()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLW:Ljava/lang/String;

    return-object v0
.end method

.method public zzjQ()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLX:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzjR()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLX:I

    return v0
.end method

.method public zzjS()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLY:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzjT()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/analytics/internal/zzaa;->zzLY:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
