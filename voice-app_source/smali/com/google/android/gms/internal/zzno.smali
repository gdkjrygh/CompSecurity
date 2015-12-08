.class public final Lcom/google/android/gms/internal/zzno;
.super Ljava/lang/Object;


# instance fields
.field private final zzaDU:Lcom/google/android/gms/internal/zznr;

.field private zzaDV:Z

.field private zzaDW:J

.field private zzaDX:J

.field private zzaDY:J

.field private zzaDZ:J

.field private zzaEa:J

.field private zzaEb:Z

.field private final zzaEc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/internal/zznq;",
            ">;",
            "Lcom/google/android/gms/internal/zznq;",
            ">;"
        }
    .end annotation
.end field

.field private final zzaEd:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zznu;",
            ">;"
        }
    .end annotation
.end field

.field private final zzpw:Lcom/google/android/gms/internal/zzlb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzno;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/zzno;->zzaDU:Lcom/google/android/gms/internal/zznr;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDU:Lcom/google/android/gms/internal/zznr;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzno;->zzpw:Lcom/google/android/gms/internal/zzlb;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzpw:Lcom/google/android/gms/internal/zzlb;

    iget-wide v0, p1, Lcom/google/android/gms/internal/zzno;->zzaDW:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDW:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/zzno;->zzaDX:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDX:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/zzno;->zzaDY:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDY:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/zzno;->zzaDZ:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDZ:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/zzno;->zzaEa:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEa:J

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzno;->zzaEd:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEd:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzno;->zzf(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zznq;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/zznq;->zza(Lcom/google/android/gms/internal/zznq;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/zznr;Lcom/google/android/gms/internal/zzlb;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzno;->zzaDU:Lcom/google/android/gms/internal/zznr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzno;->zzpw:Lcom/google/android/gms/internal/zzlb;

    const-wide/32 v0, 0x1b7740

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDZ:J

    const-wide v0, 0xb43e9400L

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEa:J

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEd:Ljava/util/List;

    return-void
.end method

.method private static zzf(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zznq;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zznq;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "dataType doesn\'t have default constructor"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "dataType default constructor is not accessible"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public zzL(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzno;->zzaDX:J

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zznq;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/zznq;

    if-eq v1, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzno;->zze(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zznq;->zza(Lcom/google/android/gms/internal/zznq;)V

    return-void
.end method

.method public zzd(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zznq;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zznq;

    return-object v0
.end method

.method public zze(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/zznq;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zznq;

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzno;->zzf(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public zzvP()Lcom/google/android/gms/internal/zzno;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzno;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzno;-><init>(Lcom/google/android/gms/internal/zzno;)V

    return-object v0
.end method

.method public zzvQ()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/internal/zznq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEc:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public zzvR()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zznu;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEd:Ljava/util/List;

    return-object v0
.end method

.method public zzvS()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDW:J

    return-wide v0
.end method

.method public zzvT()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzno;->zzvX()Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzns;->zze(Lcom/google/android/gms/internal/zzno;)V

    return-void
.end method

.method public zzvU()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDV:Z

    return v0
.end method

.method zzvV()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzpw:Lcom/google/android/gms/internal/zzlb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlb;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDY:J

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDX:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDX:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDW:J

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDV:Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzpw:Lcom/google/android/gms/internal/zzlb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlb;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDW:J

    goto :goto_0
.end method

.method zzvW()Lcom/google/android/gms/internal/zznr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDU:Lcom/google/android/gms/internal/zznr;

    return-object v0
.end method

.method zzvX()Lcom/google/android/gms/internal/zzns;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzno;->zzaDU:Lcom/google/android/gms/internal/zznr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznr;->zzvX()Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    return-object v0
.end method

.method zzvY()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEb:Z

    return v0
.end method

.method zzvZ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzno;->zzaEb:Z

    return-void
.end method
