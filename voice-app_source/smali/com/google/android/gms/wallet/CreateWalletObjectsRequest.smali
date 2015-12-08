.class public final Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field zzaQj:Lcom/google/android/gms/wallet/LoyaltyWalletObject;

.field zzaQk:Lcom/google/android/gms/wallet/OfferWalletObject;

.field zzaQl:Lcom/google/android/gms/wallet/GiftCardWalletObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzd;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzCY:I

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/wallet/LoyaltyWalletObject;Lcom/google/android/gms/wallet/OfferWalletObject;Lcom/google/android/gms/wallet/GiftCardWalletObject;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "loyaltyWalletObject"    # Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    .param p3, "offerWalletObject"    # Lcom/google/android/gms/wallet/OfferWalletObject;
    .param p4, "giftCardWalletObject"    # Lcom/google/android/gms/wallet/GiftCardWalletObject;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzaQj:Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    iput-object p3, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzaQk:Lcom/google/android/gms/wallet/OfferWalletObject;

    iput-object p4, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzaQl:Lcom/google/android/gms/wallet/GiftCardWalletObject;

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

    iget v0, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/zzd;->zza(Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;Landroid/os/Parcel;I)V

    return-void
.end method
