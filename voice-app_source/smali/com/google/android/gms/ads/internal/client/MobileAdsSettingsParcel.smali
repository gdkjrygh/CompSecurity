.class public final Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/ads/internal/client/zzad;


# instance fields
.field public final versionCode:I

.field public final zztf:Z

.field public final zztg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzad;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzad;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;->CREATOR:Lcom/google/android/gms/ads/internal/client/zzad;

    return-void
.end method

.method public constructor <init>(IZLjava/lang/String;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "isGoogleAnalyticsEnabled"    # Z
    .param p3, "trackingId"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;->versionCode:I

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;->zztf:Z

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;->zztg:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzab;)V
    .locals 3
    .param p1, "settings"    # Lcom/google/android/gms/ads/internal/client/zzab;

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/zzab;->isGoogleAnalyticsEnabled()Z

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/zzab;->getTrackingId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;-><init>(IZLjava/lang/String;)V

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
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzad;->zza(Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;Landroid/os/Parcel;I)V

    return-void
.end method
