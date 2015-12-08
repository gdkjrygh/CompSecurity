.class public Lcom/google/android/gms/fitness/request/DataDeleteRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataDeleteRequest$1;,
        Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataDeleteRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field private final zzKT:J

.field private final zzMZ:Ljava/lang/String;

.field private final zzajH:J

.field private final zzajQ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private final zzalN:Lcom/google/android/gms/internal/zzmu;

.field private final zzalP:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final zzalQ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;"
        }
    .end annotation
.end field

.field private final zzalR:Z

.field private final zzalS:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzd;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLandroid/os/IBinder;Ljava/lang/String;)V
    .locals 2
    .param p1, "versionCode"    # I
    .param p2, "startTimeMillis"    # J
    .param p4, "endTimeMillis"    # J
    .param p9, "deleteAllData"    # Z
    .param p10, "deleteAllSessions"    # Z
    .param p11, "callback"    # Landroid/os/IBinder;
    .param p12, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;ZZ",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p6, "dataSources":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataSource;>;"
    .local p7, "dataTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataType;>;"
    .local p8, "sessions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/Session;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzCY:I

    iput-wide p2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    iput-wide p4, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    iput-object p8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    iput-boolean p9, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    iput-boolean p10, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    if-nez p11, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    iput-object p12, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzMZ:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p11}, Lcom/google/android/gms/internal/zzmu$zza;->zzbF(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmu;

    move-result-object v0

    goto :goto_0
.end method

.method public constructor <init>(JJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V
    .locals 1
    .param p1, "startTimeMillis"    # J
    .param p3, "endTimeMillis"    # J
    .param p8, "deleteAllData"    # Z
    .param p9, "deleteAllSessions"    # Z
    .param p10, "callback"    # Lcom/google/android/gms/internal/zzmu;
    .param p11, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;ZZ",
            "Lcom/google/android/gms/internal/zzmu;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p5, "dataSources":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataSource;>;"
    .local p6, "dataTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataType;>;"
    .local p7, "sessions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/Session;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzCY:I

    iput-wide p1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    iput-wide p3, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    iput-object p7, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    iput-boolean p8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    iput-boolean p9, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    iput-object p10, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    iput-object p11, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)V
    .locals 13
    .param p1, "builder"    # Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;

    .prologue
    const/4 v11, 0x0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zza(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)J

    move-result-wide v2

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zzb(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)J

    move-result-wide v4

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zzc(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Ljava/util/List;

    move-result-object v6

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zzd(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Ljava/util/List;

    move-result-object v7

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zze(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Ljava/util/List;

    move-result-object v8

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zzf(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Z

    move-result v9

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->zzg(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Z

    move-result v10

    move-object v1, p0

    move-object v12, v11

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(JJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;Lcom/google/android/gms/fitness/request/DataDeleteRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/fitness/request/DataDeleteRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V
    .locals 13
    .param p1, "request"    # Lcom/google/android/gms/fitness/request/DataDeleteRequest;
    .param p2, "callback"    # Lcom/google/android/gms/internal/zzmu;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    iget-wide v4, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    iget-object v6, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    iget-object v7, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    iget-object v8, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    iget-boolean v9, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    iget-boolean v10, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    move-object v1, p0

    move-object v11, p2

    move-object/from16 v12, p3

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(JJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    return-void
.end method

.method private zzb(Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public deleteAllData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    return v0
.end method

.method public deleteAllSessions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    .end local p1    # "o":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzb(Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Z

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

.method public getDataSources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    return-object v0
.end method

.method public getDataTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    return-object v0
.end method

.method public getEndTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method public getSessions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    return-object v0
.end method

.method public getStartTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "startTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "endTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "dataSources"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalP:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "dateTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajQ:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "sessions"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalQ:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "deleteAllData"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "deleteAllSessions"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zzt$zza;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzd;->zza(Lcom/google/android/gms/fitness/request/DataDeleteRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzkt()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzKT:J

    return-wide v0
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzmu;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzqV()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalR:Z

    return v0
.end method

.method public zzqW()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzalS:Z

    return v0
.end method

.method public zzqs()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->zzajH:J

    return-wide v0
.end method
