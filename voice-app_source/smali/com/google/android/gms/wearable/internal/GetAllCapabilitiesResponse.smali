.class public Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final statusCode:I

.field public final versionCode:I

.field final zzaUq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzae;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzae;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILjava/util/List;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "statusCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p3, "capabilities":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;->statusCode:I

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;->zzaUq:Ljava/util/List;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzae;->zza(Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;Landroid/os/Parcel;I)V

    return-void
.end method
