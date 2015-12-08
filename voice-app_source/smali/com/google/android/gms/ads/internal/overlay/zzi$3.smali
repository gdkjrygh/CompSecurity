.class Lcom/google/android/gms/ads/internal/overlay/zzi$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/overlay/zzi;->onError(Landroid/media/MediaPlayer;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

.field final synthetic zzAm:Ljava/lang/String;

.field final synthetic zzAn:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/overlay/zzi;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAm:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAn:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzi;)Lcom/google/android/gms/ads/internal/overlay/zzg;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAl:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzi;)Lcom/google/android/gms/ads/internal/overlay/zzg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAm:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/zzi$3;->zzAn:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/ads/internal/overlay/zzg;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
