.class public Lcom/google/android/gms/maps/MapView;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/MapView$zzb;,
        Lcom/google/android/gms/maps/MapView$zza;
    }
.end annotation


# instance fields
.field private zzaBV:Lcom/google/android/gms/maps/GoogleMap;

.field private final zzaCb:Lcom/google/android/gms/maps/MapView$zzb;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/maps/MapView$zzb;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/MapView$zzb;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-direct {p0}, Lcom/google/android/gms/maps/MapView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/google/android/gms/maps/MapView$zzb;

    invoke-static {p1, p2}, Lcom/google/android/gms/maps/GoogleMapOptions;->createFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/GoogleMapOptions;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/MapView$zzb;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-direct {p0}, Lcom/google/android/gms/maps/MapView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Lcom/google/android/gms/maps/MapView$zzb;

    invoke-static {p1, p2}, Lcom/google/android/gms/maps/GoogleMapOptions;->createFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/GoogleMapOptions;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/MapView$zzb;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-direct {p0}, Lcom/google/android/gms/maps/MapView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "options"    # Lcom/google/android/gms/maps/GoogleMapOptions;

    .prologue
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/maps/MapView$zzb;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/maps/MapView$zzb;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-direct {p0}, Lcom/google/android/gms/maps/MapView;->init()V

    return-void
.end method

.method private init()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/MapView;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public final getMap()Lcom/google/android/gms/maps/GoogleMap;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaBV:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaBV:Lcom/google/android/gms/maps/GoogleMap;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->zzvu()V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->zzqj()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/maps/GoogleMap;

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->zzqj()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/MapView$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zza;->zzvv()Lcom/google/android/gms/maps/internal/IMapViewDelegate;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IMapViewDelegate;->getMap()Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/GoogleMap;-><init>(Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;)V

    iput-object v1, p0, Lcom/google/android/gms/maps/MapView;->zzaBV:Lcom/google/android/gms/maps/GoogleMap;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaBV:Lcom/google/android/gms/maps/GoogleMap;

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
    .locals 1
    .param p1, "callback"    # Lcom/google/android/gms/maps/OnMapReadyCallback;

    .prologue
    const-string v0, "getMapAsync() must be called on the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView$zzb;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView$zzb;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->zzqj()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/dynamic/zza;->zzb(Landroid/widget/FrameLayout;)V

    :cond_0
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->onDestroy()V

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->onLowMemory()V

    return-void
.end method

.method public final onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView$zzb;->onResume()V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/maps/MapView;->zzaCb:Lcom/google/android/gms/maps/MapView$zzb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView$zzb;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
