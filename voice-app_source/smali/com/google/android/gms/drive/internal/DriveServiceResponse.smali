.class public Lcom/google/android/gms/drive/internal/DriveServiceResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/DriveServiceResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzafB:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzab;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzab;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/DriveServiceResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "cancelToken"    # Landroid/os/IBinder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/DriveServiceResponse;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/DriveServiceResponse;->zzafB:Landroid/os/IBinder;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzab;->zza(Lcom/google/android/gms/drive/internal/DriveServiceResponse;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzpF()Lcom/google/android/gms/common/internal/ICancelToken;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/DriveServiceResponse;->zzafB:Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/ICancelToken$zza;->zzaE(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/ICancelToken;

    move-result-object v0

    return-object v0
.end method
