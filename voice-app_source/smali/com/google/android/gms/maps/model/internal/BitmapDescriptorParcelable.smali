.class public final Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/internal/zza;


# instance fields
.field private final zzCY:I

.field private zzaDM:B

.field private zzaDN:Landroid/os/Bundle;

.field private zzaDO:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/internal/zza;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/internal/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->CREATOR:Lcom/google/android/gms/maps/model/internal/zza;

    return-void
.end method

.method constructor <init>(IBLandroid/os/Bundle;Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "type"    # B
    .param p3, "parameters"    # Landroid/os/Bundle;
    .param p4, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzCY:I

    iput-byte p2, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzaDM:B

    iput-object p3, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzaDN:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzaDO:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzaDO:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getParameters()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzaDN:Landroid/os/Bundle;

    return-object v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzaDM:B

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/internal/zza;->zza(Lcom/google/android/gms/maps/model/internal/BitmapDescriptorParcelable;Landroid/os/Parcel;I)V

    return-void
.end method
