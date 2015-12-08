.class public Lcom/google/android/gms/maps/internal/Point;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/internal/zzz;


# instance fields
.field private final versionCode:I

.field private final zzaCO:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/internal/zzz;

    invoke-direct {v0}, Lcom/google/android/gms/maps/internal/zzz;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/internal/Point;->CREATOR:Lcom/google/android/gms/maps/internal/zzz;

    return-void
.end method

.method public constructor <init>(ILandroid/graphics/Point;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "point"    # Landroid/graphics/Point;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/maps/internal/Point;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/maps/internal/Point;->zzaCO:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    .end local p1    # "o":Ljava/lang/Object;
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/maps/internal/Point;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/maps/internal/Point;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v0, p0, Lcom/google/android/gms/maps/internal/Point;->zzaCO:Landroid/graphics/Point;

    iget-object v1, p1, Lcom/google/android/gms/maps/internal/Point;->zzaCO:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/graphics/Point;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/internal/Point;->versionCode:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/internal/Point;->zzaCO:Landroid/graphics/Point;

    invoke-virtual {v0}, Landroid/graphics/Point;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/internal/Point;->zzaCO:Landroid/graphics/Point;

    invoke-virtual {v0}, Landroid/graphics/Point;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/internal/zzz;->zza(Lcom/google/android/gms/maps/internal/Point;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzvG()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/internal/Point;->zzaCO:Landroid/graphics/Point;

    return-object v0
.end method
