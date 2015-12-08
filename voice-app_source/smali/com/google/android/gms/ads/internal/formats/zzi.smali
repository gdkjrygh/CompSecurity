.class public Lcom/google/android/gms/ads/internal/formats/zzi;
.super Lcom/google/android/gms/internal/zzcm$zza;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field private final zznV:Landroid/widget/FrameLayout;

.field private final zzqt:Ljava/lang/Object;

.field private final zzvF:Landroid/widget/FrameLayout;

.field private final zzvG:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private zzvH:Lcom/google/android/gms/ads/internal/formats/zzb;

.field private zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzcm$zza;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvG:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvF:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zznV:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvF:Landroid/widget/FrameLayout;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzhz;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvF:Landroid/widget/FrameLayout;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzhz;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvF:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private zzi(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvH:Lcom/google/android/gms/ads/internal/formats/zzb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvH:Lcom/google/android/gms/ads/internal/formats/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/zzb;->zzdv()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1007"

    monitor-exit v2

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvG:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/formats/zzi;->zzi(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/internal/formats/zzg;->performClick(Ljava/lang/String;)V

    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onGlobalLayout()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvF:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/formats/zzg;->zzh(Landroid/view/View;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onScrollChanged()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvF:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/formats/zzg;->zzh(Landroid/view/View;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "motionEvent"    # Landroid/view/MotionEvent;

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/formats/zzg;->zzb(Landroid/view/MotionEvent;)V

    const/4 v0, 0x1

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzS(Ljava/lang/String;)Lcom/google/android/gms/dynamic/zzd;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvG:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/dynamic/zze;->zzw(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Ljava/lang/String;Lcom/google/android/gms/dynamic/zzd;)V
    .locals 4

    invoke-static {p2}, Lcom/google/android/gms/dynamic/zze;->zzn(Lcom/google/android/gms/dynamic/zzd;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvG:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvG:Ljava/util/Map;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzb(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzn(Lcom/google/android/gms/dynamic/zzd;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/zzg;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zznV:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/formats/zzi;->zzdI()Lcom/google/android/gms/ads/internal/formats/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvH:Lcom/google/android/gms/ads/internal/formats/zzb;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvH:Lcom/google/android/gms/ads/internal/formats/zzb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zznV:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvH:Lcom/google/android/gms/ads/internal/formats/zzb;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method zzdI()Lcom/google/android/gms/ads/internal/formats/zzb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzi;->zzvq:Lcom/google/android/gms/ads/internal/formats/zzg;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/formats/zzg;->zza(Landroid/view/View$OnClickListener;)Lcom/google/android/gms/ads/internal/formats/zzb;

    move-result-object v0

    return-object v0
.end method
