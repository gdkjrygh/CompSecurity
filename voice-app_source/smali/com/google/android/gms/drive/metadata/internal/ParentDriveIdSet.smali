.class public Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzagJ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/metadata/internal/PartialDriveId;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/zzk;

    invoke-direct {v0}, Lcom/google/android/gms/drive/metadata/internal/zzk;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;-><init>(ILjava/util/List;)V

    return-void
.end method

.method constructor <init>(ILjava/util/List;)V
    .locals 0
    .param p1, "versionCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/metadata/internal/PartialDriveId;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "partialDriveIds":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/metadata/internal/PartialDriveId;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->zzagJ:Ljava/util/List;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/zzk;->zza(Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzC(J)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->zzagJ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/metadata/internal/PartialDriveId;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/PartialDriveId;->zzD(J)Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public zza(Lcom/google/android/gms/drive/metadata/internal/PartialDriveId;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/ParentDriveIdSet;->zzagJ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
