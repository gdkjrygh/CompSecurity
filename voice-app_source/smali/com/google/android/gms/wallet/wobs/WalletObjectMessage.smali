.class public final Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field zzCI:Ljava/lang/String;

.field private final zzCY:I

.field zzaSG:Ljava/lang/String;

.field zzaSJ:Lcom/google/android/gms/wallet/wobs/TimeInterval;

.field zzaSK:Lcom/google/android/gms/wallet/wobs/UriData;

.field zzaSL:Lcom/google/android/gms/wallet/wobs/UriData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/wobs/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/wobs/zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzCY:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/wobs/TimeInterval;Lcom/google/android/gms/wallet/wobs/UriData;Lcom/google/android/gms/wallet/wobs/UriData;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "header"    # Ljava/lang/String;
    .param p3, "body"    # Ljava/lang/String;
    .param p4, "displayInterval"    # Lcom/google/android/gms/wallet/wobs/TimeInterval;
    .param p5, "actionUri"    # Lcom/google/android/gms/wallet/wobs/UriData;
    .param p6, "imageUri"    # Lcom/google/android/gms/wallet/wobs/UriData;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzaSG:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzCI:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzaSJ:Lcom/google/android/gms/wallet/wobs/TimeInterval;

    iput-object p5, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzaSK:Lcom/google/android/gms/wallet/wobs/UriData;

    iput-object p6, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzaSL:Lcom/google/android/gms/wallet/wobs/UriData;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/wobs/zzi;->zza(Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;Landroid/os/Parcel;I)V

    return-void
.end method
