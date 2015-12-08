.class public Lcom/google/android/gms/internal/zzpw;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzpw$zza;
    }
.end annotation


# static fields
.field private static zzaOV:Lcom/google/android/gms/internal/zzpw;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mStarted:Z

.field private final zzaOW:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzpw$zza;",
            ">;"
        }
    .end annotation
.end field

.field private zzaOX:Lcom/google/android/gms/tagmanager/TagManager;

.field private zzoY:Lcom/google/android/gms/internal/zzpv;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzaOW:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzaOX:Lcom/google/android/gms/tagmanager/TagManager;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpw;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzpw;->zzaOX:Lcom/google/android/gms/tagmanager/TagManager;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzpw;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpw;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzpw;Lcom/google/android/gms/internal/zzpv;)Lcom/google/android/gms/internal/zzpv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpw;->zzoY:Lcom/google/android/gms/internal/zzpv;

    return-object p1
.end method

.method public static zzaK(Landroid/content/Context;)Lcom/google/android/gms/internal/zzpw;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/zzpw;->zzaOV:Lcom/google/android/gms/internal/zzpw;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/zzpw;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/zzpw;->zzaOV:Lcom/google/android/gms/internal/zzpw;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzpw;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/TagManager;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/TagManager;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/zzpw;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;)V

    sput-object v0, Lcom/google/android/gms/internal/zzpw;->zzaOV:Lcom/google/android/gms/internal/zzpw;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/zzpw;->zzaOV:Lcom/google/android/gms/internal/zzpw;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzpw;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzpw;->zzgy()V

    return-void
.end method

.method private zzgy()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzaOW:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzpw$zza;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzpw$zza;->zzbm()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method


# virtual methods
.method public start()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpw;->mStarted:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Method start() has already been called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzoY:Lcom/google/android/gms/internal/zzpv;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No settings configured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzpw;->mStarted:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzaOX:Lcom/google/android/gms/tagmanager/TagManager;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpw;->zzoY:Lcom/google/android/gms/internal/zzpv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzpv;->zzzT()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    const-string v3, "admob"

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/tagmanager/TagManager;->zzc(Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzpw$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzpw$1;-><init>(Lcom/google/android/gms/internal/zzpw;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzpv;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpw;->mStarted:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Settings can\'t be changed after TagManager has been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/zzpw;->zzoY:Lcom/google/android/gms/internal/zzpv;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzpw$zza;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzaOW:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzzX()Lcom/google/android/gms/internal/zzpv;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpw;->zzoY:Lcom/google/android/gms/internal/zzpv;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
