.class public Lcom/google/android/gms/analytics/internal/zzf;
.super Ljava/lang/Object;


# static fields
.field private static zzJC:Lcom/google/android/gms/analytics/internal/zzf;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzJD:Landroid/content/Context;

.field private final zzJE:Lcom/google/android/gms/analytics/internal/zzr;

.field private final zzJF:Lcom/google/android/gms/analytics/internal/zzaf;

.field private final zzJG:Lcom/google/android/gms/internal/zzns;

.field private final zzJH:Lcom/google/android/gms/analytics/internal/zzb;

.field private final zzJI:Lcom/google/android/gms/analytics/internal/zzv;

.field private final zzJJ:Lcom/google/android/gms/analytics/internal/zzan;

.field private final zzJK:Lcom/google/android/gms/analytics/internal/zzai;

.field private final zzJL:Lcom/google/android/gms/analytics/GoogleAnalytics;

.field private final zzJM:Lcom/google/android/gms/analytics/internal/zzn;

.field private final zzJN:Lcom/google/android/gms/analytics/internal/zza;

.field private final zzJO:Lcom/google/android/gms/analytics/internal/zzk;

.field private final zzJP:Lcom/google/android/gms/analytics/internal/zzu;

.field private final zzpw:Lcom/google/android/gms/internal/zzlb;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/analytics/internal/zzg;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/zzg;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Application;

    const-string v2, "getApplicationContext didn\'t return the application"

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/zzg;->zzic()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->mContext:Landroid/content/Context;

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJD:Landroid/content/Context;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzh(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/internal/zzlb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzpw:Lcom/google/android/gms/internal/zzlb;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzg(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzr;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJE:Lcom/google/android/gms/analytics/internal/zzr;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzf(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzaf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzaf;->zza()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJF:Lcom/google/android/gms/analytics/internal/zzaf;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzf;->zzhR()Lcom/google/android/gms/analytics/internal/zzr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzr;->zziW()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzf;->zzhQ()Lcom/google/android/gms/analytics/internal/zzaf;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Google Analytics "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/analytics/internal/zze;->VERSION:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is starting up."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/internal/zzaf;->zzaV(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzq(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzai;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzai;->zza()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJK:Lcom/google/android/gms/analytics/internal/zzai;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zze(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzan;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzan;->zza()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJJ:Lcom/google/android/gms/analytics/internal/zzan;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzl(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzb;

    move-result-object v1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzd(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzn;

    move-result-object v2

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzc(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zza;

    move-result-object v3

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzb(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzk;

    move-result-object v4

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zza(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzu;

    move-result-object v5

    invoke-virtual {p1, v0}, Lcom/google/android/gms/analytics/internal/zzg;->zzW(Landroid/content/Context;)Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzf;->zzib()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/zzns;->zza(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJG:Lcom/google/android/gms/internal/zzns;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzi(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/zzn;->zza()V

    iput-object v2, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJM:Lcom/google/android/gms/analytics/internal/zzn;

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/zza;->zza()V

    iput-object v3, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJN:Lcom/google/android/gms/analytics/internal/zza;

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/zzk;->zza()V

    iput-object v4, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJO:Lcom/google/android/gms/analytics/internal/zzk;

    invoke-virtual {v5}, Lcom/google/android/gms/analytics/internal/zzu;->zza()V

    iput-object v5, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJP:Lcom/google/android/gms/analytics/internal/zzu;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/analytics/internal/zzg;->zzp(Lcom/google/android/gms/analytics/internal/zzf;)Lcom/google/android/gms/analytics/internal/zzv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/zzv;->zza()V

    iput-object v2, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJI:Lcom/google/android/gms/analytics/internal/zzv;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzb;->zza()V

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJH:Lcom/google/android/gms/analytics/internal/zzb;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzf;->zzhR()Lcom/google/android/gms/analytics/internal/zzr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/zzr;->zziW()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzf;->zzhQ()Lcom/google/android/gms/analytics/internal/zzaf;

    move-result-object v2

    const-string v3, "Device AnalyticsService version"

    sget-object v4, Lcom/google/android/gms/analytics/internal/zze;->VERSION:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/analytics/internal/zzaf;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->zza()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzb;->start()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/zzf;->zzhQ()Lcom/google/android/gms/analytics/internal/zzaf;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Google Analytics "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/analytics/internal/zze;->VERSION:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is starting up. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "To enable debug logging on a device run:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  adb shell setprop log.tag.GAv4 DEBUG\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  adb logcat -s GAv4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/internal/zzaf;->zzaV(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public static zzV(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/zzf;
    .locals 8

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/analytics/internal/zzf;->zzJC:Lcom/google/android/gms/analytics/internal/zzf;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/analytics/internal/zzf;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/internal/zzf;->zzJC:Lcom/google/android/gms/analytics/internal/zzf;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzld;->zzoQ()Lcom/google/android/gms/internal/zzlb;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlb;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/analytics/internal/zzg;

    invoke-direct {v5, v4}, Lcom/google/android/gms/analytics/internal/zzg;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/analytics/internal/zzf;

    invoke-direct {v4, v5}, Lcom/google/android/gms/analytics/internal/zzf;-><init>(Lcom/google/android/gms/analytics/internal/zzg;)V

    sput-object v4, Lcom/google/android/gms/analytics/internal/zzf;->zzJC:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->zzhj()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlb;->elapsedRealtime()J

    move-result-wide v6

    sub-long v2, v6, v2

    sget-object v0, Lcom/google/android/gms/analytics/internal/zzy;->zzLP:Lcom/google/android/gms/analytics/internal/zzy$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/zzy$zza;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-lez v0, :cond_0

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/zzf;->zzhQ()Lcom/google/android/gms/analytics/internal/zzaf;

    move-result-object v0

    const-string v4, "Slow initialization (ms)"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v4, v2, v3}, Lcom/google/android/gms/analytics/internal/zzaf;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/analytics/internal/zzf;->zzJC:Lcom/google/android/gms/analytics/internal/zzf;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private zza(Lcom/google/android/gms/analytics/internal/zzd;)V
    .locals 2

    const-string v0, "Analytics service not created/initialized"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/zzd;->isInitialized()Z

    move-result v0

    const-string v1, "Analytics service not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public zzhO()V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/zzns;->zzhO()V

    return-void
.end method

.method public zzhP()Lcom/google/android/gms/internal/zzlb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzpw:Lcom/google/android/gms/internal/zzlb;

    return-object v0
.end method

.method public zzhQ()Lcom/google/android/gms/analytics/internal/zzaf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJF:Lcom/google/android/gms/analytics/internal/zzaf;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJF:Lcom/google/android/gms/analytics/internal/zzaf;

    return-object v0
.end method

.method public zzhR()Lcom/google/android/gms/analytics/internal/zzr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJE:Lcom/google/android/gms/analytics/internal/zzr;

    return-object v0
.end method

.method public zzhS()Lcom/google/android/gms/internal/zzns;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJG:Lcom/google/android/gms/internal/zzns;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJG:Lcom/google/android/gms/internal/zzns;

    return-object v0
.end method

.method public zzhT()Lcom/google/android/gms/analytics/internal/zzv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJI:Lcom/google/android/gms/analytics/internal/zzv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJI:Lcom/google/android/gms/analytics/internal/zzv;

    return-object v0
.end method

.method public zzhU()Lcom/google/android/gms/analytics/internal/zzai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJK:Lcom/google/android/gms/analytics/internal/zzai;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJK:Lcom/google/android/gms/analytics/internal/zzai;

    return-object v0
.end method

.method public zzhX()Lcom/google/android/gms/analytics/internal/zzk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJO:Lcom/google/android/gms/analytics/internal/zzk;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJO:Lcom/google/android/gms/analytics/internal/zzk;

    return-object v0
.end method

.method public zzhY()Lcom/google/android/gms/analytics/internal/zzu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJP:Lcom/google/android/gms/analytics/internal/zzu;

    return-object v0
.end method

.method public zzhl()Lcom/google/android/gms/analytics/internal/zzb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJH:Lcom/google/android/gms/analytics/internal/zzb;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJH:Lcom/google/android/gms/analytics/internal/zzb;

    return-object v0
.end method

.method public zzhm()Lcom/google/android/gms/analytics/internal/zzan;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJJ:Lcom/google/android/gms/analytics/internal/zzan;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJJ:Lcom/google/android/gms/analytics/internal/zzan;

    return-object v0
.end method

.method protected zzib()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/zzf$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/zzf$1;-><init>(Lcom/google/android/gms/analytics/internal/zzf;)V

    return-object v0
.end method

.method public zzic()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJD:Landroid/content/Context;

    return-object v0
.end method

.method public zzid()Lcom/google/android/gms/analytics/internal/zzaf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJF:Lcom/google/android/gms/analytics/internal/zzaf;

    return-object v0
.end method

.method public zzie()Lcom/google/android/gms/analytics/GoogleAnalytics;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->isInitialized()Z

    move-result v0

    const-string v1, "Analytics instance not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    return-object v0
.end method

.method public zzif()Lcom/google/android/gms/analytics/internal/zzai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJK:Lcom/google/android/gms/analytics/internal/zzai;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJK:Lcom/google/android/gms/analytics/internal/zzai;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/zzai;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJK:Lcom/google/android/gms/analytics/internal/zzai;

    goto :goto_0
.end method

.method public zzig()Lcom/google/android/gms/analytics/internal/zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJN:Lcom/google/android/gms/analytics/internal/zza;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJN:Lcom/google/android/gms/analytics/internal/zza;

    return-object v0
.end method

.method public zzih()Lcom/google/android/gms/analytics/internal/zzn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJM:Lcom/google/android/gms/analytics/internal/zzn;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/zzf;->zza(Lcom/google/android/gms/analytics/internal/zzd;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzf;->zzJM:Lcom/google/android/gms/analytics/internal/zzn;

    return-object v0
.end method
