.class final Lcom/google/android/gms/wearable/internal/zzbl;
.super Lcom/google/android/gms/wearable/internal/zzas$zza;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/wearable/internal/zzas$zza;"
    }
.end annotation


# instance fields
.field private final zzaTD:Ljava/lang/String;

.field private final zzaUk:[Landroid/content/IntentFilter;

.field private zzaVb:Lcom/google/android/gms/wearable/zza$zza;

.field private zzaVc:Lcom/google/android/gms/wearable/DataApi$DataListener;

.field private zzaVd:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

.field private zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

.field private zzaVf:Lcom/google/android/gms/wearable/NodeApi$zza;

.field private zzaVg:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

.field private zzaVh:Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

.field private final zzaVi:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/zzas$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVb:Lcom/google/android/gms/wearable/zza$zza;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVc:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVd:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVf:Lcom/google/android/gms/wearable/NodeApi$zza;

    iput-object p6, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVg:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    iput-object p7, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVh:Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    iput-object p8, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaUk:[Landroid/content/IntentFilter;

    iput-object p9, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVi:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaTD:Ljava/lang/String;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;Ljava/lang/String;)Lcom/google/android/gms/wearable/internal/zzbl;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbl",
            "<",
            "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbl;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, p1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/wearable/internal/zzbl;-><init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;)Lcom/google/android/gms/wearable/internal/zzbl;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbl",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbl;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v7, v1

    move-object v8, v1

    move-object v10, v1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/wearable/internal/zzbl;-><init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbl;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            "[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbl",
            "<",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbl;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/wearable/DataApi$DataListener;

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, p1

    move-object v9, v1

    move-object v10, v1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/wearable/internal/zzbl;-><init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/zzbl;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
            "[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbl",
            "<",
            "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbl;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, p1

    move-object v9, v1

    move-object v10, v1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/wearable/internal/zzbl;-><init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/wearable/NodeApi$NodeListener;)Lcom/google/android/gms/wearable/internal/zzbl;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbl",
            "<",
            "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbl;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    move-object v2, v1

    move-object v3, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, v1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/wearable/internal/zzbl;-><init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)Lcom/google/android/gms/wearable/internal/zzbl;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ")",
            "Lcom/google/android/gms/wearable/internal/zzbl",
            "<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbl;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, v1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/wearable/internal/zzbl;-><init>(Lcom/google/android/gms/wearable/zza$zza;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/wearable/NodeApi$zza;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;[Landroid/content/IntentFilter;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVb:Lcom/google/android/gms/wearable/zza$zza;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVc:Lcom/google/android/gms/wearable/DataApi$DataListener;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVd:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVf:Lcom/google/android/gms/wearable/NodeApi$zza;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVg:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVh:Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    return-void
.end method

.method public onConnectedNodes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/wearable/internal/zzbl;, "Lcom/google/android/gms/wearable/internal/zzbl<TT;>;"
    .local p1, "connectedNodes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/wearable/internal/NodeParcelable;>;"
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVf:Lcom/google/android/gms/wearable/NodeApi$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVf:Lcom/google/android/gms/wearable/NodeApi$zza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/NodeApi$zza;->onConnectedNodes(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public zzBh()[Landroid/content/IntentFilter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaUk:[Landroid/content/IntentFilter;

    return-object v0
.end method

.method public zzBi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVi:Ljava/lang/String;

    return-object v0
.end method

.method public zzBj()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaTD:Ljava/lang/String;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVb:Lcom/google/android/gms/wearable/zza$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVb:Lcom/google/android/gms/wearable/zza$zza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/zza$zza;->zza(Lcom/google/android/gms/wearable/zzb;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVh:Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVh:Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;->onCapabilityChanged(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVg:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVg:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVd:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVd:Lcom/google/android/gms/wearable/MessageApi$MessageListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/MessageApi$MessageListener;->onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/NodeApi$NodeListener;->onPeerConnected(Lcom/google/android/gms/wearable/Node;)V

    :cond_0
    return-void
.end method

.method public zzac(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVc:Lcom/google/android/gms/wearable/DataApi$DataListener;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVc:Lcom/google/android/gms/wearable/DataApi$DataListener;

    new-instance v1, Lcom/google/android/gms/wearable/DataEventBuffer;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/DataEventBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/DataApi$DataListener;->onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbl;->zzaVe:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/NodeApi$NodeListener;->onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V

    :cond_0
    return-void
.end method
