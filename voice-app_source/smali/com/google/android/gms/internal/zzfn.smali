.class public Lcom/google/android/gms/internal/zzfn;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/purchase/InAppPurchase;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzAN:Lcom/google/android/gms/internal/zzfe;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzfe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfn;->zzAN:Lcom/google/android/gms/internal/zzfe;

    return-void
.end method


# virtual methods
.method public getProductId()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfn;->zzAN:Lcom/google/android/gms/internal/zzfe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzfe;->getProductId()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not forward getProductId to InAppPurchase"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public recordPlayBillingResolution(I)V
    .locals 2
    .param p1, "billingResponseCode"    # I

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfn;->zzAN:Lcom/google/android/gms/internal/zzfe;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzfe;->recordPlayBillingResolution(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not forward recordPlayBillingResolution to InAppPurchase"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public recordResolution(I)V
    .locals 2
    .param p1, "resolution"    # I

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfn;->zzAN:Lcom/google/android/gms/internal/zzfe;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzfe;->recordResolution(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not forward recordResolution to InAppPurchase"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
