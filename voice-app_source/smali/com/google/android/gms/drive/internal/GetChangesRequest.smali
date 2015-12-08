.class public Lcom/google/android/gms/drive/internal/GetChangesRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/GetChangesRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzadR:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation
.end field

.field private final zzadS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation
.end field

.field final zzafJ:Lcom/google/android/gms/drive/ChangeSequenceNumber;

.field final zzafK:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzaf;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzaf;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/GetChangesRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/ChangeSequenceNumber;ILjava/util/List;)V
    .locals 6
    .param p1, "versionCode"    # I
    .param p2, "fromSequenceNumber"    # Lcom/google/android/gms/drive/ChangeSequenceNumber;
    .param p3, "maxResults"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/ChangeSequenceNumber;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p4, "spacesList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/DriveSpace;>;"
    if-nez p4, :cond_0

    const/4 v5, 0x0

    :goto_0
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/GetChangesRequest;-><init>(ILcom/google/android/gms/drive/ChangeSequenceNumber;ILjava/util/List;Ljava/util/Set;)V

    return-void

    :cond_0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, p4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0
.end method

.method private constructor <init>(ILcom/google/android/gms/drive/ChangeSequenceNumber;ILjava/util/List;Ljava/util/Set;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "fromSequenceNumber"    # Lcom/google/android/gms/drive/ChangeSequenceNumber;
    .param p3, "maxResults"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/ChangeSequenceNumber;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p4, "spacesList":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/drive/DriveSpace;>;"
    .local p5, "spaces":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/android/gms/drive/DriveSpace;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/GetChangesRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/GetChangesRequest;->zzafJ:Lcom/google/android/gms/drive/ChangeSequenceNumber;

    iput p3, p0, Lcom/google/android/gms/drive/internal/GetChangesRequest;->zzafK:I

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/GetChangesRequest;->zzadR:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/GetChangesRequest;->zzadS:Ljava/util/Set;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzaf;->zza(Lcom/google/android/gms/drive/internal/GetChangesRequest;Landroid/os/Parcel;I)V

    return-void
.end method
