.class public final Lcom/google/android/gms/wallet/GiftCardWalletObject;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field pin:Ljava/lang/String;

.field final zzCY:I

.field zzaQA:Ljava/lang/String;

.field zzaQB:Ljava/lang/String;

.field zzaQC:J

.field zzaQD:Ljava/lang/String;

.field zzaQE:J

.field zzaQF:Ljava/lang/String;

.field zzaQz:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzAN()Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzAO()Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQz:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzCY:I

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/wallet/wobs/CommonWalletObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "commonWalletObject"    # Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    .param p3, "cardNumber"    # Ljava/lang/String;
    .param p4, "pin"    # Ljava/lang/String;
    .param p5, "cardIdentifier"    # Ljava/lang/String;
    .param p6, "balanceMicros"    # J
    .param p8, "balanceCurrencyCode"    # Ljava/lang/String;
    .param p9, "balanceUpdateTime"    # J
    .param p11, "eventNumber"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzAN()Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzAO()Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQz:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput p1, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQz:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p3, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQA:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->pin:Ljava/lang/String;

    iput-wide p6, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQC:J

    iput-object p8, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQD:Ljava/lang/String;

    iput-wide p9, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQE:J

    iput-object p11, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQF:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQB:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzaQz:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/zzg;->zza(Lcom/google/android/gms/wallet/GiftCardWalletObject;Landroid/os/Parcel;I)V

    return-void
.end method
