.class public Lcom/google/android/gms/cast/internal/DeviceStatus;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/internal/DeviceStatus;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field private zzSh:D

.field private zzSi:Z

.field private zzUF:Lcom/google/android/gms/cast/ApplicationMetadata;

.field private zzUu:I

.field private zzUv:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/internal/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/cast/internal/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/internal/DeviceStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v5, -0x1

    const/4 v1, 0x3

    const-wide/high16 v2, 0x7ff8000000000000L    # NaN

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v7, v5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/cast/internal/DeviceStatus;-><init>(IDZILcom/google/android/gms/cast/ApplicationMetadata;I)V

    return-void
.end method

.method constructor <init>(IDZILcom/google/android/gms/cast/ApplicationMetadata;I)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "volume"    # D
    .param p4, "muteState"    # Z
    .param p5, "activeInputState"    # I
    .param p6, "applicationMetadata"    # Lcom/google/android/gms/cast/ApplicationMetadata;
    .param p7, "standbyState"    # I

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzCY:I

    iput-wide p2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSh:D

    iput-boolean p4, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSi:Z

    iput p5, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUu:I

    iput-object p6, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUF:Lcom/google/android/gms/cast/ApplicationMetadata;

    iput p7, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUv:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    .end local p1    # "obj":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/cast/internal/DeviceStatus;

    .end local p1    # "obj":Ljava/lang/Object;
    iget-wide v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSh:D

    iget-wide v4, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSh:D

    cmpl-double v2, v2, v4

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSi:Z

    iget-boolean v3, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSi:Z

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUu:I

    iget v3, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUu:I

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUF:Lcom/google/android/gms/cast/ApplicationMetadata;

    iget-object v3, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUF:Lcom/google/android/gms/cast/ApplicationMetadata;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/zzf;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUv:I

    iget v3, p1, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUv:I

    if-eq v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public getApplicationMetadata()Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUF:Lcom/google/android/gms/cast/ApplicationMetadata;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSh:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSi:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUu:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUF:Lcom/google/android/gms/cast/ApplicationMetadata;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget v2, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUv:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/internal/zzg;->zza(Lcom/google/android/gms/cast/internal/DeviceStatus;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzlO()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSh:D

    return-wide v0
.end method

.method public zzlP()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUu:I

    return v0
.end method

.method public zzlQ()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzUv:I

    return v0
.end method

.method public zzlX()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/DeviceStatus;->zzSi:Z

    return v0
.end method
