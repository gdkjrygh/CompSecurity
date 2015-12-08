.class public Lcom/google/android/gms/internal/zzie;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzie$zzb;,
        Lcom/google/android/gms/internal/zzie$zzc;,
        Lcom/google/android/gms/internal/zzie$zza;
    }
.end annotation


# instance fields
.field private zzBi:Lcom/google/android/gms/internal/zzie$zza;

.field private final zzHb:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzdg;",
            ">;>;"
        }
    .end annotation
.end field

.field private zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

.field private zzHd:Z

.field private zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

.field private final zzHf:Lcom/google/android/gms/internal/zzet;

.field private zzHg:Z

.field private zzHh:Z

.field private zzHi:Z

.field private zzHj:Z

.field private zzHk:I

.field protected final zzoA:Lcom/google/android/gms/internal/zzid;

.field private zzqs:Z

.field private final zzqt:Ljava/lang/Object;

.field private zzrU:Lcom/google/android/gms/ads/internal/client/zza;

.field private zzvU:Lcom/google/android/gms/internal/zzde;

.field private zzwu:Lcom/google/android/gms/internal/zzdk;

.field private zzww:Lcom/google/android/gms/ads/internal/zzd;

.field private zzwx:Lcom/google/android/gms/internal/zzep;

.field private zzwz:Lcom/google/android/gms/internal/zzdi;

.field private zzyE:Lcom/google/android/gms/internal/zzev;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzid;Z)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/zzet;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzid;->zzgC()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzbq;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzid;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzbq;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/zzet;-><init>(Lcom/google/android/gms/internal/zzid;Landroid/content/Context;Lcom/google/android/gms/internal/zzbq;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/zzie;-><init>(Lcom/google/android/gms/internal/zzid;ZLcom/google/android/gms/internal/zzet;Lcom/google/android/gms/internal/zzep;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/zzid;ZLcom/google/android/gms/internal/zzet;Lcom/google/android/gms/internal/zzep;)V
    .locals 1

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHb:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHd:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzie;->zzqs:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzie;->zzHf:Lcom/google/android/gms/internal/zzet;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzie;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzie;->zzgO()V

    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzie;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzie;->zzgP()V

    return-void
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/zzie;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzie;->zzgQ()V

    return-void
.end method

.method private static zzf(Landroid/net/Uri;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private zzgO()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzie;->zzHk:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzie;->zzHk:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzie;->zzgR()V

    return-void
.end method

.method private zzgP()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzie;->zzHk:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzie;->zzHk:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzie;->zzgR()V

    return-void
.end method

.method private zzgQ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHj:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzie;->zzgR()V

    return-void
.end method


# virtual methods
.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Loading resource: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "gmsg"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mobileads.google.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zzg(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHh:Z

    if-eqz v0, :cond_0

    const-string v0, "about:blank"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Blank page loaded, 1..."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgK()V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHi:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzie;->zzgR()V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final reset()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHb:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzvU:Lcom/google/android/gms/internal/zzde;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHd:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzqs:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwz:Lcom/google/android/gms/internal/zzdi;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzep;->zzn(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHg:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :sswitch_0
    const/4 v0, 0x1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x4f -> :sswitch_0
        0x55 -> :sswitch_0
        0x56 -> :sswitch_0
        0x57 -> :sswitch_0
        0x58 -> :sswitch_0
        0x59 -> :sswitch_0
        0x5a -> :sswitch_0
        0x5b -> :sswitch_0
        0x7e -> :sswitch_0
        0x7f -> :sswitch_0
        0x80 -> :sswitch_0
        0x81 -> :sswitch_0
        0x82 -> :sswitch_0
        0xde -> :sswitch_0
    .end sparse-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9
    .param p1, "webView"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x1

    const/4 v3, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdWebView shouldOverrideUrlLoading: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "gmsg"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mobileads.google.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zzg(Landroid/net/Uri;)V

    :goto_0
    move v0, v8

    :goto_1
    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzie;->zzHd:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    if-ne p1, v1, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzie;->zzf(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHg:Z

    if-nez v0, :cond_1

    iput-boolean v8, p0, Lcom/google/android/gms/internal/zzie;->zzHg:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/zzbz;->zzul:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zza;->onAdClicked()V

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->willNotDraw()Z

    move-result v1

    if-nez v1, :cond_6

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->zzgH()Lcom/google/android/gms/internal/zzan;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzan;->zzb(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzid;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/zzan;->zza(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzao; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_3
    move-object v2, v0

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzww:Lcom/google/android/gms/ads/internal/zzd;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzww:Lcom/google/android/gms/ads/internal/zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->zzbd()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;)V

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to append parameter to URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    move-object v2, v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzww:Lcom/google/android/gms/ads/internal/zzd;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/zzd;->zzo(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdWebView unable to handle URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public zzD(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzie;->zzHd:Z

    return-void
.end method

.method public zza(IIZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHf:Lcom/google/android/gms/internal/zzet;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzet;->zze(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzep;->zza(IIZ)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;)V
    .locals 6

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgJ()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzid;->zzaN()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-nez v2, :cond_0

    move-object v2, v3

    :goto_0
    if-eqz v1, :cond_1

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/zzie;->zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->zzgI()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzf;Lcom/google/android/gms/ads/internal/overlay/zzk;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 4

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzep;->zzee()Z

    move-result v0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbt()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzid;->getContext()Landroid/content/Context;

    move-result-object v3

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {v2, v3, p1, v1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzie$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzie;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHb:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzHb:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zza(ZI)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgJ()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->zzaN()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v5}, Lcom/google/android/gms/internal/zzid;->zzgI()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v7

    move v5, p1

    move v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzf;Lcom/google/android/gms/ads/internal/overlay/zzk;Lcom/google/android/gms/internal/zzid;ZILcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0
.end method

.method public final zza(ZILjava/lang/String;)V
    .locals 11

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgJ()Z

    move-result v3

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->zzaN()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-nez v1, :cond_0

    move-object v1, v2

    :goto_0
    if-eqz v3, :cond_1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzvU:Lcom/google/android/gms/internal/zzde;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzie;->zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v6}, Lcom/google/android/gms/internal/zzid;->zzgI()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/zzie;->zzwz:Lcom/google/android/gms/internal/zzdi;

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzf;Lcom/google/android/gms/internal/zzde;Lcom/google/android/gms/ads/internal/overlay/zzk;Lcom/google/android/gms/internal/zzid;ZILjava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzdi;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/zzie$zzb;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzie;->zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/zzie$zzb;-><init>(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/ads/internal/overlay/zzf;)V

    goto :goto_1
.end method

.method public final zza(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgJ()Z

    move-result v2

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->zzaN()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzvU:Lcom/google/android/gms/internal/zzde;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzie;->zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v6}, Lcom/google/android/gms/internal/zzid;->zzgI()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v10

    iget-object v11, p0, Lcom/google/android/gms/internal/zzie;->zzwz:Lcom/google/android/gms/internal/zzdi;

    move v6, p1

    move v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzf;Lcom/google/android/gms/internal/zzde;Lcom/google/android/gms/ads/internal/overlay/zzk;Lcom/google/android/gms/internal/zzid;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzdi;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/zzie$zzb;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzie;->zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/zzie$zzb;-><init>(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/ads/internal/overlay/zzf;)V

    goto :goto_1
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzf;Lcom/google/android/gms/internal/zzde;Lcom/google/android/gms/ads/internal/overlay/zzk;ZLcom/google/android/gms/internal/zzdi;Lcom/google/android/gms/internal/zzdk;Lcom/google/android/gms/ads/internal/zzd;Lcom/google/android/gms/internal/zzev;)V
    .locals 4

    const/4 v3, 0x0

    if-nez p8, :cond_0

    new-instance p8, Lcom/google/android/gms/ads/internal/zzd;

    invoke-direct {p8, v3}, Lcom/google/android/gms/ads/internal/zzd;-><init>(Z)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzep;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-direct {v0, v1, p9}, Lcom/google/android/gms/internal/zzep;-><init>(Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzev;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    const-string v0, "/appEvent"

    new-instance v1, Lcom/google/android/gms/internal/zzdd;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/zzdd;-><init>(Lcom/google/android/gms/internal/zzde;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/canOpenURLs"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzvW:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/canOpenIntents"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzvX:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/click"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzvY:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/close"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzvZ:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/customClose"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzwa:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/delayPageLoaded"

    new-instance v1, Lcom/google/android/gms/internal/zzie$zzc;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/zzie$zzc;-><init>(Lcom/google/android/gms/internal/zzie;Lcom/google/android/gms/internal/zzie$1;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/httpTrack"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzwb:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzwc:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/mraid"

    new-instance v1, Lcom/google/android/gms/internal/zzdm;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    invoke-direct {v1, p8, v2}, Lcom/google/android/gms/internal/zzdm;-><init>(Lcom/google/android/gms/ads/internal/zzd;Lcom/google/android/gms/internal/zzep;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/open"

    new-instance v1, Lcom/google/android/gms/internal/zzdn;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    invoke-direct {v1, p6, p8, v2}, Lcom/google/android/gms/internal/zzdn;-><init>(Lcom/google/android/gms/internal/zzdi;Lcom/google/android/gms/ads/internal/zzd;Lcom/google/android/gms/internal/zzep;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/precache"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzwf:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/touch"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzwd:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/video"

    sget-object v1, Lcom/google/android/gms/internal/zzdf;->zzwe:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    if-eqz p7, :cond_1

    const-string v0, "/setInterstitialProperties"

    new-instance v1, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {v1, p7}, Lcom/google/android/gms/internal/zzdj;-><init>(Lcom/google/android/gms/internal/zzdk;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/zzie;->zzrU:Lcom/google/android/gms/ads/internal/client/zza;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzie;->zzHc:Lcom/google/android/gms/ads/internal/overlay/zzf;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzie;->zzvU:Lcom/google/android/gms/internal/zzde;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzie;->zzwz:Lcom/google/android/gms/internal/zzdi;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzie;->zzHe:Lcom/google/android/gms/ads/internal/overlay/zzk;

    iput-object p8, p0, Lcom/google/android/gms/internal/zzie;->zzww:Lcom/google/android/gms/ads/internal/zzd;

    iput-object p9, p0, Lcom/google/android/gms/internal/zzie;->zzyE:Lcom/google/android/gms/internal/zzev;

    iput-object p7, p0, Lcom/google/android/gms/internal/zzie;->zzwu:Lcom/google/android/gms/internal/zzdk;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/zzie;->zzD(Z)V

    iput-boolean v3, p0, Lcom/google/android/gms/internal/zzie;->zzHg:Z

    return-void
.end method

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHb:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzbU()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzqs:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzd(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzwx:Lcom/google/android/gms/internal/zzep;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzep;->zzd(II)V

    :cond_0
    return-void
.end method

.method public final zzet()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHd:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzqs:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgL()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgD()Lcom/google/android/gms/ads/internal/overlay/zzc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzgw()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/zzie$1;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/zzie$1;-><init>(Lcom/google/android/gms/internal/zzie;Lcom/google/android/gms/ads/internal/overlay/zzc;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzc;->zzet()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzg(Landroid/net/Uri;)V
    .locals 6

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHb:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zzhl;->zzd(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzL(I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Received GMSG: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzdg;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0, v3, v2}, Lcom/google/android/gms/internal/zzdg;->zza(Lcom/google/android/gms/internal/zzid;Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No GMSG handler found for GMSG: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public zzgM()Lcom/google/android/gms/ads/internal/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzww:Lcom/google/android/gms/ads/internal/zzd;

    return-object v0
.end method

.method public zzgN()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "Loading blank page in WebView, 2..."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHh:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    const-string v2, "about:blank"

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzid;->zzaD(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zzgR()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHi:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/zzie;->zzHk:I

    if-lez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHj:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzie;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzie;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzie;->zzHj:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/zzie$zza;->zza(Lcom/google/android/gms/internal/zzid;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    :cond_2
    return-void

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzgS()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzie;->zzbU()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie;->zzHf:Lcom/google/android/gms/internal/zzet;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzet;->zzek()V

    :cond_0
    return-void
.end method
