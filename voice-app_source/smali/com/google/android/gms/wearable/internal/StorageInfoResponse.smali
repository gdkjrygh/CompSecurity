.class public Lcom/google/android/gms/wearable/internal/StorageInfoResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/StorageInfoResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final statusCode:I

.field public final versionCode:I

.field public final zzaUN:J

.field public final zzaUP:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/PackageStorageInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbh;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzbh;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/StorageInfoResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIJLjava/util/List;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "statusCode"    # I
    .param p3, "totalSizeBytes"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/PackageStorageInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p5, "packageStorageInfo":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/wearable/internal/PackageStorageInfo;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/StorageInfoResponse;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/wearable/internal/StorageInfoResponse;->statusCode:I

    iput-wide p3, p0, Lcom/google/android/gms/wearable/internal/StorageInfoResponse;->zzaUN:J

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/StorageInfoResponse;->zzaUP:Ljava/util/List;

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
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzbh;->zza(Lcom/google/android/gms/wearable/internal/StorageInfoResponse;Landroid/os/Parcel;I)V

    return-void
.end method
