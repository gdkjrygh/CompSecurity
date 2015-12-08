.class public Lcom/google/android/gms/ads/internal/overlay/zzh;
.super Landroid/widget/FrameLayout;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzg;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzoA:Lcom/google/android/gms/internal/zzid;

.field private zzwC:Ljava/lang/String;

.field private final zzzO:Landroid/widget/FrameLayout;

.field private final zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

.field private final zzzQ:Lcom/google/android/gms/ads/internal/overlay/zzm;

.field private zzzR:Landroid/widget/TextView;

.field private zzzS:J

.field private zzzT:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzid;)V
    .locals 5

    const/4 v4, -0x1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzoA:Lcom/google/android/gms/internal/zzid;

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->addView(Landroid/view/View;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    invoke-direct {v2, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzR:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzR:Landroid/widget/TextView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzeM()V

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/zzm;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/overlay/zzm;-><init>(Lcom/google/android/gms/ads/internal/overlay/zzh;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzQ:Lcom/google/android/gms/ads/internal/overlay/zzm;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzQ:Lcom/google/android/gms/ads/internal/overlay/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzm;->zzeY()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(Lcom/google/android/gms/ads/internal/overlay/zzg;)V

    return-void
.end method

.method private varargs zza(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x0

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v0, "event"

    invoke-virtual {v4, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v5, p2

    const/4 v0, 0x0

    move v2, v0

    move-object v3, v1

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v0, p2, v2

    if-nez v3, :cond_0

    :goto_1
    add-int/lit8 v2, v2, 0x1

    move-object v3, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzoA:Lcom/google/android/gms/internal/zzid;

    const-string v1, "onVideoEvent"

    invoke-interface {v0, v1, v4}, Lcom/google/android/gms/internal/zzid;->zzc(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static zzd(Lcom/google/android/gms/internal/zzid;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "no_video_view"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onVideoEvent"

    invoke-interface {p0, v1, v0}, Lcom/google/android/gms/internal/zzid;->zzc(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private zzeM()V
    .locals 4

    const/4 v3, -0x1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzeO()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzR:Landroid/widget/TextView;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzR:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->bringChildToFront(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private zzeN()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzeO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzR:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private zzeO()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzR:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzQ:Lcom/google/android/gms/ads/internal/overlay/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzm;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->stop()V

    return-void
.end method

.method public onPaused()V
    .locals 2

    const-string v0, "pause"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 7
    .param p1, "mediaPlayer"    # Landroid/media/MediaPlayer;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzT:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v2

    const-string v3, "canplaythrough"

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "duration"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    const/4 v0, 0x2

    const-string v5, "videoWidth"

    aput-object v5, v4, v0

    const/4 v0, 0x3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    const/4 v0, 0x4

    const-string v1, "videoHeight"

    aput-object v1, v4, v0

    const/4 v0, 0x5

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    invoke-direct {p0, v3, v4}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public pause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->pause()V

    return-void
.end method

.method public play()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->play()V

    return-void
.end method

.method public seekTo(I)V
    .locals 1
    .param p1, "millis"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzi;->seekTo(I)V

    return-void
.end method

.method public zza(F)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zza(F)V

    return-void
.end method

.method public zzah(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzwC:Ljava/lang/String;

    return-void
.end method

.method public zzc(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/overlay/zzi;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public zzeD()V
    .locals 0

    return-void
.end method

.method public zzeE()V
    .locals 0

    return-void
.end method

.method public zzeF()V
    .locals 2

    const-string v0, "ended"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public zzeG()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzeM()V

    iget-wide v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzS:J

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzT:J

    return-void
.end method

.method public zzeH()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzwC:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzwC:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzi;->setVideoPath(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "no_src"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0
.end method

.method public zzeI()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zzeI()V

    return-void
.end method

.method public zzeJ()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->zzeJ()V

    return-void
.end method

.method public zzeK()V
    .locals 5

    const/4 v4, -0x2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v0, "AdMob"

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v0, -0x10000

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v0, -0x100

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    invoke-direct {v2, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->bringChildToFront(Landroid/view/View;)V

    return-void
.end method

.method zzeL()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzP:Lcom/google/android/gms/ads/internal/overlay/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzi;->getCurrentPosition()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzS:J

    cmp-long v2, v2, v0

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzeN()V

    long-to-float v2, v0

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    const-string v3, "timeupdate"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "time"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v5

    invoke-direct {p0, v3, v4}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzS:J

    :cond_0
    return-void
.end method

.method public zzf(IIII)V
    .locals 4

    const/4 v3, 0x0

    if-eqz p3, :cond_0

    if-nez p4, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    add-int/lit8 v1, p3, 0x2

    add-int/lit8 v2, p4, 0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    add-int/lit8 v1, p1, -0x1

    add-int/lit8 v2, p2, -0x1

    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzzO:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/overlay/zzh;->requestLayout()V

    goto :goto_0
.end method

.method public zzg(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "what"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    const-string v3, "extra"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
