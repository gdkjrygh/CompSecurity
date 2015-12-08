.class public final Lcom/google/android/gms/ads/MobileAds$Settings;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/MobileAds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Settings"
.end annotation


# instance fields
.field private final zznR:Lcom/google/android/gms/ads/internal/client/zzab;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzab;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzab;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zznR:Lcom/google/android/gms/ads/internal/client/zzab;

    return-void
.end method


# virtual methods
.method public getTrackingId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zznR:Lcom/google/android/gms/ads/internal/client/zzab;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzab;->getTrackingId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isGoogleAnalyticsEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zznR:Lcom/google/android/gms/ads/internal/client/zzab;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzab;->isGoogleAnalyticsEnabled()Z

    move-result v0

    return v0
.end method

.method public setGoogleAnalyticsEnabled(Z)Lcom/google/android/gms/ads/MobileAds$Settings;
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zznR:Lcom/google/android/gms/ads/internal/client/zzab;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzab;->zzl(Z)V

    return-object p0
.end method

.method public setTrackingId(Ljava/lang/String;)Lcom/google/android/gms/ads/MobileAds$Settings;
    .locals 1
    .param p1, "trackingId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zznR:Lcom/google/android/gms/ads/internal/client/zzab;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzab;->zzN(Ljava/lang/String;)V

    return-object p0
.end method

.method zzaG()Lcom/google/android/gms/ads/internal/client/zzab;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zznR:Lcom/google/android/gms/ads/internal/client/zzab;

    return-object v0
.end method
