.class public Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mIndex:I

.field final zzCY:I

.field final zzaiw:Ljava/lang/String;

.field final zzaix:Z

.field final zzaiy:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/realtime/internal/zzq;

    invoke-direct {v0}, Lcom/google/android/gms/drive/realtime/internal/zzq;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;IZI)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "objectId"    # Ljava/lang/String;
    .param p3, "index"    # I
    .param p4, "legacyCanBeDeleted"    # Z
    .param p5, "deleteMode"    # I

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;->zzaiw:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;->mIndex:I

    iput-boolean p4, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;->zzaix:Z

    iput p5, p0, Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;->zzaiy:I

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/zzq;->zza(Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;Landroid/os/Parcel;I)V

    return-void
.end method
