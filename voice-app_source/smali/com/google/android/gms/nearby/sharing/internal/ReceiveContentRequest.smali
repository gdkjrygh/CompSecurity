.class public final Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public packageName:Ljava/lang/String;

.field final versionCode:I

.field public zzaGp:Landroid/os/IBinder;

.field public zzaGt:Lcom/google/android/gms/nearby/sharing/internal/zzc;

.field public zzaGu:Lcom/google/android/gms/nearby/sharing/internal/zza;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/sharing/internal/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->versionCode:I

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "clientBinder"    # Landroid/os/IBinder;
    .param p3, "contentReceiverAsBinder"    # Landroid/os/IBinder;
    .param p4, "packageName"    # Ljava/lang/String;
    .param p5, "callbackAsBinder"    # Landroid/os/IBinder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->zzaGp:Landroid/os/IBinder;

    invoke-static {p3}, Lcom/google/android/gms/nearby/sharing/internal/zza$zza;->zzdh(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zza;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->zzaGu:Lcom/google/android/gms/nearby/sharing/internal/zza;

    iput-object p4, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->packageName:Ljava/lang/String;

    invoke-static {p5}, Lcom/google/android/gms/nearby/sharing/internal/zzc$zza;->zzdj(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zzc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->zzaGt:Lcom/google/android/gms/nearby/sharing/internal/zzc;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/sharing/internal/zzg;->zza(Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method zzxa()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->zzaGt:Lcom/google/android/gms/nearby/sharing/internal/zzc;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzc;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method zzxj()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->zzaGu:Lcom/google/android/gms/nearby/sharing/internal/zza;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;->zzaGu:Lcom/google/android/gms/nearby/sharing/internal/zza;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/sharing/internal/zza;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
