.class Lcom/google/android/gms/tagmanager/zzcu;
.super Lcom/google/android/gms/tagmanager/zzct;


# static fields
.field private static final zzaND:Ljava/lang/Object;

.field private static zzaNO:Lcom/google/android/gms/tagmanager/zzcu;


# instance fields
.field private connected:Z

.field private handler:Landroid/os/Handler;

.field private zzaNE:Landroid/content/Context;

.field private zzaNF:Lcom/google/android/gms/tagmanager/zzau;

.field private volatile zzaNG:Lcom/google/android/gms/tagmanager/zzas;

.field private zzaNH:I

.field private zzaNI:Z

.field private zzaNJ:Z

.field private zzaNK:Z

.field private zzaNL:Lcom/google/android/gms/tagmanager/zzav;

.field private zzaNM:Lcom/google/android/gms/tagmanager/zzbl;

.field private zzaNN:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzct;-><init>()V

    const v0, 0x1b7740

    iput v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNI:Z

    iput-boolean v2, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNJ:Z

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->connected:Z

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNK:Z

    new-instance v0, Lcom/google/android/gms/tagmanager/zzcu$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/zzcu$1;-><init>(Lcom/google/android/gms/tagmanager/zzcu;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNL:Lcom/google/android/gms/tagmanager/zzav;

    iput-boolean v2, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNN:Z

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zzcu;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->connected:Z

    return v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/tagmanager/zzcu;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    return v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/tagmanager/zzcu;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNN:Z

    return v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/tagmanager/zzcu;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/tagmanager/zzcu;)Lcom/google/android/gms/tagmanager/zzau;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNF:Lcom/google/android/gms/tagmanager/zzau;

    return-object v0
.end method

.method private zzzA()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/tagmanager/zzbl;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/zzbl;-><init>(Lcom/google/android/gms/tagmanager/zzct;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNM:Lcom/google/android/gms/tagmanager/zzbl;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNM:Lcom/google/android/gms/tagmanager/zzbl;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNE:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/zzbl;->zzaI(Landroid/content/Context;)V

    return-void
.end method

.method private zzzB()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNE:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/tagmanager/zzcu$2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/tagmanager/zzcu$2;-><init>(Lcom/google/android/gms/tagmanager/zzcu;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method static synthetic zzzD()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    return-object v0
.end method

.method public static zzzz()Lcom/google/android/gms/tagmanager/zzcu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNO:Lcom/google/android/gms/tagmanager/zzcu;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/zzcu;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/zzcu;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNO:Lcom/google/android/gms/tagmanager/zzcu;

    :cond_0
    sget-object v0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNO:Lcom/google/android/gms/tagmanager/zzcu;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized dispatch()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNJ:Z

    if-nez v0, :cond_0

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNI:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNG:Lcom/google/android/gms/tagmanager/zzas;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzcu$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/zzcu$3;-><init>(Lcom/google/android/gms/tagmanager/zzcu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzas;->zzf(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized zza(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzas;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNE:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNE:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNG:Lcom/google/android/gms/tagmanager/zzas;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNG:Lcom/google/android/gms/tagmanager/zzas;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized zzao(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNN:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/tagmanager/zzcu;->zzd(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized zzd(ZZ)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNN:Z

    if-ne v0, p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->connected:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p2, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    :cond_1
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_2
    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PowerSaveMode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p1, :cond_4

    if-nez p2, :cond_5

    :cond_4
    const-string v0, "initiated."

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNN:Z

    iput-boolean p2, p0, Lcom/google/android/gms/tagmanager/zzcu;->connected:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    :try_start_2
    const-string v0, "terminated."
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method declared-synchronized zzhK()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNN:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->connected:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNH:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/tagmanager/zzcu;->zzaND:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized zzzC()Lcom/google/android/gms/tagmanager/zzau;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNF:Lcom/google/android/gms/tagmanager/zzau;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNE:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cant get a store unless we have a context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/tagmanager/zzby;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNL:Lcom/google/android/gms/tagmanager/zzav;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNE:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/zzby;-><init>(Lcom/google/android/gms/tagmanager/zzav;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNF:Lcom/google/android/gms/tagmanager/zzau;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->handler:Landroid/os/Handler;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzcu;->zzzB()V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNJ:Z

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNI:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzcu;->dispatch()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNI:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNM:Lcom/google/android/gms/tagmanager/zzbl;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNK:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzcu;->zzzA()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcu;->zzaNF:Lcom/google/android/gms/tagmanager/zzau;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method
