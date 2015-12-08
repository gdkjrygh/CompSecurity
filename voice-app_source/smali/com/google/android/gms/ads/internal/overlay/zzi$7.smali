.class Lcom/google/android/gms/ads/internal/overlay/zzi$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/overlay/zzi;->pause()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/overlay/zzi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$7;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$7;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzi;)Lcom/google/android/gms/ads/internal/overlay/zzg;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$7;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzi;)Lcom/google/android/gms/ads/internal/overlay/zzg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzg;->onPaused()V

    :cond_0
    return-void
.end method
