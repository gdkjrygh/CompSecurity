.class public Lcom/google/android/gms/fitness/request/SessionReadRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/SessionReadRequest$1;,
        Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/SessionReadRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field private final zzFE:Ljava/lang/String;

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

.field private final zzamE:Ljava/lang/String;

.field private zzamF:Z

.field private final zzamG:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final zzamH:Lcom/google/android/gms/internal/zzms;

.field private final zzama:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzv;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzv;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 4
    .param p1, "versionCode"    # I
    .param p2, "sessionName"    # Ljava/lang/String;
    .param p3, "sessionId"    # Ljava/lang/String;
    .param p4, "startTimeMillis"    # J
    .param p6, "endTimeMillis"    # J
    .param p10, "getSessionsFromAllApps"    # Z
    .param p11, "serverQueriesEnabled"    # Z
    .param p13, "callback"    # Landroid/os/IBinder;
    .param p14, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;ZZ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p8, "dataTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataType;>;"
    .local p9, "dataSources":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataSource;>;"
    .local p12, "excludedPackages":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    iput-wide p6, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    invoke-static {p8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    invoke-static {p9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

    iput-boolean p10, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    iput-boolean p11, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    if-nez p13, :cond_0

    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamH:Lcom/google/android/gms/internal/zzms;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzMZ:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static/range {p13 .. p13}, Lcom/google/android/gms/internal/zzms$zza;->zzbD(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzms;

    move-result-object v1

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)V
    .locals 15
    .param p1, "builder"    # Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;

    .prologue
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zza(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzb(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzc(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)J

    move-result-wide v4

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzd(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)J

    move-result-wide v6

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zze(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/util/List;

    move-result-object v8

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzf(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/util/List;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzg(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Z

    move-result v10

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzh(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Z

    move-result v11

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->zzi(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Lcom/google/android/gms/internal/zzms;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;Lcom/google/android/gms/fitness/request/SessionReadRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/fitness/request/SessionReadRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/SessionReadRequest;Lcom/google/android/gms/internal/zzms;Ljava/lang/String;)V
    .locals 17
    .param p1, "request"    # Lcom/google/android/gms/fitness/request/SessionReadRequest;
    .param p2, "callback"    # Lcom/google/android/gms/internal/zzms;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-wide v6, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    move-object/from16 v0, p1

    iget-wide v8, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

    move-object/from16 v0, p1

    iget-boolean v12, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    move-object/from16 v0, p1

    iget-boolean v13, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

    move-object/from16 v0, p1

    iget-object v14, v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    move-object/from16 v3, p0

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Lcom/google/android/gms/internal/zzms;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Lcom/google/android/gms/internal/zzms;Ljava/lang/String;)V
    .locals 1
    .param p1, "sessionName"    # Ljava/lang/String;
    .param p2, "sessionId"    # Ljava/lang/String;
    .param p3, "startTimeMillis"    # J
    .param p5, "endTimeMillis"    # J
    .param p9, "getSessionsFromAllApps"    # Z
    .param p10, "serverQueriesEnabled"    # Z
    .param p12, "callback"    # Lcom/google/android/gms/internal/zzms;
    .param p13, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;ZZ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/zzms;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p7, "dataTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataType;>;"
    .local p8, "dataSources":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataSource;>;"
    .local p11, "excludedPackages":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzCY:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    iput-wide p5, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    invoke-static {p8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

    iput-boolean p9, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    iput-boolean p10, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

    iput-object p11, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    iput-object p12, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamH:Lcom/google/android/gms/internal/zzms;

    iput-object p13, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method

.method private zzb(Lcom/google/android/gms/fitness/request/SessionReadRequest;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;

    .end local p1    # "o":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzb(Lcom/google/android/gms/fitness/request/SessionReadRequest;)Z

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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    return-object v0
.end method

.method public getEndTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getExcludedPackages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public includeSessionsFromAllApps()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "sessionName"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "sessionId"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzFE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "startTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "endTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "dataTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajQ:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "dataSources"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzalP:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "sessionsFromAllApps"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "excludedPackages"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamG:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "useServer"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzv;->zza(Lcom/google/android/gms/fitness/request/SessionReadRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzkt()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzKT:J

    return-wide v0
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamH:Lcom/google/android/gms/internal/zzms;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamH:Lcom/google/android/gms/internal/zzms;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzms;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzqZ()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzama:Z

    return v0
.end method

.method public zzqs()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzajH:J

    return-wide v0
.end method

.method public zzro()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->zzamF:Z

    return v0
.end method
