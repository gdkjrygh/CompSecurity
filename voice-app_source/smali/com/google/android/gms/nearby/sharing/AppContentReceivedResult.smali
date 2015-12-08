.class public Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private statusCode:I

.field private final versionCode:I

.field private zzaGj:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/sharing/zza;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/sharing/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->versionCode:I

    return-void
.end method

.method constructor <init>(ILandroid/net/Uri;I)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "destinationUri"    # Landroid/net/Uri;
    .param p3, "statusCode"    # I

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->zzaGj:Landroid/net/Uri;

    iput p3, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->statusCode:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    .end local p1    # "o":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v2, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->zzaGj:Landroid/net/Uri;

    iget-object v3, p1, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->zzaGj:Landroid/net/Uri;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->statusCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->statusCode:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public getStatusCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->statusCode:I

    return v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->versionCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->zzaGj:Landroid/net/Uri;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->statusCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/sharing/zza;->zza(Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzxc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/AppContentReceivedResult;->zzaGj:Landroid/net/Uri;

    return-object v0
.end method
