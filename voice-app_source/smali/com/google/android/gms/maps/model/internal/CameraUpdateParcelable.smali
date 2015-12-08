.class public final Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/internal/zzb;


# instance fields
.field private type:I

.field private final zzCY:I

.field private zzaDN:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/internal/zzb;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/internal/zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->CREATOR:Lcom/google/android/gms/maps/model/internal/zzb;

    return-void
.end method

.method constructor <init>(IILandroid/os/Bundle;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "type"    # I
    .param p3, "parameters"    # Landroid/os/Bundle;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->zzCY:I

    iput p2, p0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->type:I

    iput-object p3, p0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->zzaDN:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParameters()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->zzaDN:Landroid/os/Bundle;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->type:I

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/internal/zzb;->zza(Lcom/google/android/gms/maps/model/internal/CameraUpdateParcelable;Landroid/os/Parcel;I)V

    return-void
.end method
