.class public Lcom/google/android/gms/internal/zzfq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzfq$zza;
    }
.end annotation


# instance fields
.field private final zzBf:Landroid/os/Handler;

.field private final zzBg:J

.field private zzBh:J

.field private zzBi:Lcom/google/android/gms/internal/zzie$zza;

.field protected zzBj:Z

.field protected zzBk:Z

.field private final zznM:I

.field private final zznN:I

.field protected final zzoA:Lcom/google/android/gms/internal/zzid;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzie$zza;Lcom/google/android/gms/internal/zzid;II)V
    .locals 10

    const-wide/16 v6, 0xc8

    const-wide/16 v8, 0x32

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/zzfq;-><init>(Lcom/google/android/gms/internal/zzie$zza;Lcom/google/android/gms/internal/zzid;IIJJ)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzie$zza;Lcom/google/android/gms/internal/zzid;IIJJ)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p5, p0, Lcom/google/android/gms/internal/zzfq;->zzBg:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/zzfq;->zzBh:J

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBf:Landroid/os/Handler;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfq;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzfq;->zzBj:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzfq;->zzBk:Z

    iput p4, p0, Lcom/google/android/gms/internal/zzfq;->zznN:I

    iput p3, p0, Lcom/google/android/gms/internal/zzfq;->zznM:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzfq;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzfq;->zznM:I

    return v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzfq;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzfq;->zznN:I

    return v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/zzfq;)J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBh:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBh:J

    return-wide v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/zzfq;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBh:J

    return-wide v0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/zzfq;)Lcom/google/android/gms/internal/zzie$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    return-object v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/zzfq;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBg:J

    return-wide v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/zzfq;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBf:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzfq;->zzfl()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBi:Lcom/google/android/gms/internal/zzie$zza;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzie$zza;->zza(Lcom/google/android/gms/internal/zzid;Z)V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzfq$zza;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzfq$zza;-><init>(Lcom/google/android/gms/internal/zzfq;Landroid/webkit/WebView;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzfq$zza;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzil;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCR:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/zzil;-><init>(Lcom/google/android/gms/internal/zzfq;Lcom/google/android/gms/internal/zzid;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzfq;->zza(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/zzil;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/zzil;)V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzid;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzoA:Lcom/google/android/gms/internal/zzid;

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzG:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v5

    :goto_0
    iget-object v2, p1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCI:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/zzid;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzG:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzhl;->zzat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public zzfj()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBf:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzfq;->zzBg:J

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public declared-synchronized zzfk()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBj:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized zzfl()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBj:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public zzfm()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzfq;->zzBk:Z

    return v0
.end method
