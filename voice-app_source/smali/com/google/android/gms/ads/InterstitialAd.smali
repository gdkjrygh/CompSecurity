.class public final Lcom/google/android/gms/ads/InterstitialAd;
.super Ljava/lang/Object;


# instance fields
.field private final zznQ:Lcom/google/android/gms/ads/internal/client/zzz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    return-void
.end method


# virtual methods
.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzz;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzz;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzz;->getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    move-result-object v0

    return-object v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzz;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzz;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 2
    .param p1, "adRequest"    # Lcom/google/android/gms/ads/AdRequest;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->zzaF()Lcom/google/android/gms/ads/internal/client/zzx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzz;->zza(Lcom/google/android/gms/ads/internal/client/zzx;)V

    return-void
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzz;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/ads/internal/client/zza;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    check-cast p1, Lcom/google/android/gms/ads/internal/client/zza;

    .end local p1    # "adListener":Lcom/google/android/gms/ads/AdListener;
    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzz;->zza(Lcom/google/android/gms/ads/internal/client/zza;)V

    :cond_0
    :goto_0
    return-void

    .restart local p1    # "adListener":Lcom/google/android/gms/ads/AdListener;
    :cond_1
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzz;->zza(Lcom/google/android/gms/ads/internal/client/zza;)V

    goto :goto_0
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzz;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 1
    .param p1, "inAppPurchaseListener"    # Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzz;->setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    return-void
.end method

.method public setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "playStorePurchaseListener"    # Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    .param p2, "publicKey"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzz;->setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V

    return-void
.end method

.method public show()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->zznQ:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzz;->show()V

    return-void
.end method
