.class public Lcom/google/android/gms/location/places/internal/zzp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/location/places/zzg;


# instance fields
.field private mIndex:I

.field private final zzaAW:Ljava/lang/String;

.field private final zzaAX:Ljava/lang/CharSequence;

.field private final zzyZ:I

.field private final zzza:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/CharSequence;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzaAW:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzyZ:I

    iput p3, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzza:I

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzaAX:Ljava/lang/CharSequence;

    iput p5, p0, Lcom/google/android/gms/location/places/internal/zzp;->mIndex:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    .end local p1    # "other":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "other":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/location/places/internal/zzp;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/places/internal/zzp;

    .end local p1    # "other":Ljava/lang/Object;
    iget v2, p1, Lcom/google/android/gms/location/places/internal/zzp;->zzyZ:I

    iget v3, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzyZ:I

    if-ne v2, v3, :cond_3

    iget v2, p1, Lcom/google/android/gms/location/places/internal/zzp;->zzza:I

    iget v3, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzza:I

    if-ne v2, v3, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/location/places/internal/zzp;->zzaAW:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzaAW:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/location/places/internal/zzp;->zzaAX:Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzaAX:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/zzp;->zzuZ()Lcom/google/android/gms/location/places/zzg;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzyZ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzza:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzaAW:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/zzp;->zzaAX:Ljava/lang/CharSequence;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zzuZ()Lcom/google/android/gms/location/places/zzg;
    .locals 0

    return-object p0
.end method
