.class public Lcom/google/android/gms/auth/api/proxy/ProxyRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/auth/api/proxy/ProxyRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzPh:I

.field public static final zzPi:I

.field public static final zzPj:I

.field public static final zzPk:I

.field public static final zzPl:I

.field public static final zzPm:I

.field public static final zzPn:I

.field public static final zzPo:I

.field public static final zzPp:I


# instance fields
.field final versionCode:I

.field public final zzPq:I

.field public final zzPr:J

.field public final zzPs:[B

.field zzPt:Landroid/os/Bundle;

.field public final zzzf:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x7

    new-instance v0, Lcom/google/android/gms/auth/api/proxy/zzb;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/proxy/zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    const/4 v1, 0x1

    sput v0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPh:I

    const/4 v0, 0x2

    sput v1, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPi:I

    const/4 v1, 0x3

    sput v0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPj:I

    const/4 v0, 0x4

    sput v1, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPk:I

    const/4 v1, 0x5

    sput v0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPl:I

    const/4 v0, 0x6

    sput v1, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPm:I

    sput v0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPn:I

    sput v2, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPo:I

    sput v2, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPp:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;IJ[BLandroid/os/Bundle;)V
    .locals 0
    .param p1, "version"    # I
    .param p2, "googleUrl"    # Ljava/lang/String;
    .param p3, "httpMethod"    # I
    .param p4, "timeoutMillis"    # J
    .param p6, "body"    # [B
    .param p7, "headers"    # Landroid/os/Bundle;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzzf:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPq:I

    iput-wide p4, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPr:J

    iput-object p6, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPs:[B

    iput-object p7, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPt:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProxyRequest[ url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzzf:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", method: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;->zzPq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/proxy/zzb;->zza(Lcom/google/android/gms/auth/api/proxy/ProxyRequest;Landroid/os/Parcel;I)V

    return-void
.end method
