.class Lcom/google/android/gms/ads/internal/overlay/zzi$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/overlay/zzi;->onPrepared(Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzAk:Landroid/media/MediaPlayer;

.field final synthetic zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/overlay/zzi;Landroid/media/MediaPlayer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$1;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$1;->zzAk:Landroid/media/MediaPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$1;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzi;)Lcom/google/android/gms/ads/internal/overlay/zzg;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$1;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzi;)Lcom/google/android/gms/ads/internal/overlay/zzg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$1;->zzAk:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzg;->onPrepared(Landroid/media/MediaPlayer;)V

    :cond_0
    return-void
.end method
