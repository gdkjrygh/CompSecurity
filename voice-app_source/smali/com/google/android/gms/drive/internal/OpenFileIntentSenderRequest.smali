.class public Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field final zzadv:Ljava/lang/String;

.field final zzadw:[Ljava/lang/String;

.field final zzady:Lcom/google/android/gms/drive/DriveId;

.field final zzagt:Lcom/google/android/gms/drive/query/internal/FilterHolder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzbj;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzbj;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/query/internal/FilterHolder;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "mimeTypes"    # [Ljava/lang/String;
    .param p4, "startFolder"    # Lcom/google/android/gms/drive/DriveId;
    .param p5, "filterHolder"    # Lcom/google/android/gms/drive/query/internal/FilterHolder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;->zzadv:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;->zzadw:[Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;->zzady:Lcom/google/android/gms/drive/DriveId;

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;->zzagt:Lcom/google/android/gms/drive/query/internal/FilterHolder;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/query/internal/FilterHolder;)V
    .locals 6
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "mimeTypes"    # [Ljava/lang/String;
    .param p3, "startFolder"    # Lcom/google/android/gms/drive/DriveId;
    .param p4, "filterHolder"    # Lcom/google/android/gms/drive/query/internal/FilterHolder;

    .prologue
    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;-><init>(ILjava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/query/internal/FilterHolder;)V

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzbj;->zza(Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;Landroid/os/Parcel;I)V

    return-void
.end method
