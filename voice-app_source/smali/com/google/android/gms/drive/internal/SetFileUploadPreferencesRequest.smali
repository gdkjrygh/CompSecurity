.class public Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzagf:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzbo;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzbo;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "preferences"    # Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;->zzagf:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V
    .locals 1
    .param p1, "preferences"    # Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;-><init>(ILcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzbo;->zza(Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;Landroid/os/Parcel;I)V

    return-void
.end method
