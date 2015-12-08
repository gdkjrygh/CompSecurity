.class public Lcom/google/android/gms/drive/internal/GetPermissionsResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/GetPermissionsResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzafO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/Permission;",
            ">;"
        }
    .end annotation
.end field

.field final zzws:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzaj;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzaj;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/GetPermissionsResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/List;I)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p3, "responseCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/Permission;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .local p2, "permissionList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/Permission;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/GetPermissionsResponse;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/GetPermissionsResponse;->zzafO:Ljava/util/List;

    iput p3, p0, Lcom/google/android/gms/drive/internal/GetPermissionsResponse;->zzws:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzaj;->zza(Lcom/google/android/gms/drive/internal/GetPermissionsResponse;Landroid/os/Parcel;I)V

    return-void
.end method
