.class public final Lcom/google/android/gms/internal/zzfk;
.super Lcom/google/android/gms/internal/zzff$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzsW:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzff$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfk;->zzsW:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzfe;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfk;->zzsW:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    new-instance v1, Lcom/google/android/gms/internal/zzfn;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzfn;-><init>(Lcom/google/android/gms/internal/zzfe;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;->onInAppPurchaseRequested(Lcom/google/android/gms/ads/purchase/InAppPurchase;)V

    return-void
.end method
