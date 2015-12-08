.class public final Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzayn:Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;


# instance fields
.field final zzCY:I

.field public final zzayo:Z

.field public final zzayp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/location/copresence/internal/zza;

    invoke-direct {v0}, Lcom/google/android/gms/location/copresence/internal/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;-><init>(ZLjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->zzayn:Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;

    return-void
.end method

.method constructor <init>(IZLjava/lang/String;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "isAuthenticated"    # Z
    .param p3, "zeroPartyPackageName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->zzCY:I

    iput-boolean p2, p0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->zzayo:Z

    iput-object p3, p0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->zzayp:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1
    .param p1, "isAuthenticated"    # Z
    .param p2, "zeroPartyPackageName"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;-><init>(IZLjava/lang/String;)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/copresence/internal/zza;->zza(Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;Landroid/os/Parcel;I)V

    return-void
.end method
