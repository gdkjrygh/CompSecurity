.class public Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mPendingIntent:Landroid/app/PendingIntent;

.field private final zzCY:I

.field private final zzMZ:Ljava/lang/String;

.field private final zzajF:Lcom/google/android/gms/fitness/data/DataType;

.field private final zzajG:Lcom/google/android/gms/fitness/data/DataSource;

.field private final zzakP:J

.field private final zzakQ:I

.field private final zzalN:Lcom/google/android/gms/internal/zzmu;

.field private zzamr:Lcom/google/android/gms/fitness/data/zzj;

.field zzams:I

.field zzamt:I

.field private final zzamu:J

.field private final zzamv:J

.field private final zzamw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final zzamx:J

.field private final zzamy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzs;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzs;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/os/IBinder;IIJJLandroid/app/PendingIntent;JILjava/util/List;JLandroid/os/IBinder;Ljava/lang/String;)V
    .locals 5
    .param p1, "versionCode"    # I
    .param p2, "dataSource"    # Lcom/google/android/gms/fitness/data/DataSource;
    .param p3, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .param p4, "listenerBinder"    # Landroid/os/IBinder;
    .param p5, "samplingIntervalMicrosInt"    # I
    .param p6, "maxDeliveryLatencyMicrosInt"    # I
    .param p7, "samplingIntervalMicros"    # J
    .param p9, "maxDeliveryLatencyMicros"    # J
    .param p11, "intent"    # Landroid/app/PendingIntent;
    .param p12, "fastestIntervalMicros"    # J
    .param p14, "accuracyMode"    # I
    .param p16, "registrationTimeOutMicros"    # J
    .param p18, "callback"    # Landroid/os/IBinder;
    .param p19, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            "Landroid/os/IBinder;",
            "IIJJ",
            "Landroid/app/PendingIntent;",
            "JI",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;J",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p15, "locationRequests":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/location/LocationRequest;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    if-nez p4, :cond_2

    const/4 v2, 0x0

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamr:Lcom/google/android/gms/fitness/data/zzj;

    const-wide/16 v2, 0x0

    cmp-long v2, p7, v2

    if-nez v2, :cond_0

    int-to-long p7, p5

    .end local p7    # "samplingIntervalMicros":J
    :cond_0
    iput-wide p7, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    move-wide/from16 v0, p12

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    const-wide/16 v2, 0x0

    cmp-long v2, p9, v2

    if-nez v2, :cond_1

    int-to-long p9, p6

    .end local p9    # "maxDeliveryLatencyMicros":J
    :cond_1
    iput-wide p9, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamw:Ljava/util/List;

    move-object/from16 v0, p11

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->mPendingIntent:Landroid/app/PendingIntent;

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakQ:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamy:Ljava/util/List;

    move-wide/from16 v0, p16

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamx:J

    if-nez p18, :cond_3

    const/4 v2, 0x0

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzMZ:Ljava/lang/String;

    return-void

    .restart local p7    # "samplingIntervalMicros":J
    .restart local p9    # "maxDeliveryLatencyMicros":J
    :cond_2
    invoke-static {p4}, Lcom/google/android/gms/fitness/data/zzj$zza;->zzbh(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/data/zzj;

    move-result-object v2

    goto :goto_0

    .end local p7    # "samplingIntervalMicros":J
    .end local p9    # "maxDeliveryLatencyMicros":J
    :cond_3
    invoke-static/range {p18 .. p18}, Lcom/google/android/gms/internal/zzmu$zza;->zzbF(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmu;

    move-result-object v2

    goto :goto_1
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;JJJILjava/util/List;Ljava/util/List;JLcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V
    .locals 3
    .param p1, "dataSource"    # Lcom/google/android/gms/fitness/data/DataSource;
    .param p2, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .param p3, "listener"    # Lcom/google/android/gms/fitness/data/zzj;
    .param p4, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p5, "samplingIntervalMicros"    # J
    .param p7, "fastestIntervalMicros"    # J
    .param p9, "maxDeliveryLatencyMicros"    # J
    .param p11, "accuracyMode"    # I
    .param p13, "clientIdentities"    # Ljava/util/List;
    .param p14, "registrationTimeOutMicros"    # J
    .param p16, "callback"    # Lcom/google/android/gms/internal/zzmu;
    .param p17, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            "Lcom/google/android/gms/fitness/data/zzj;",
            "Landroid/app/PendingIntent;",
            "JJJI",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;J",
            "Lcom/google/android/gms/internal/zzmu;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p12, "locationRequests":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/location/LocationRequest;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x5

    iput v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzCY:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamr:Lcom/google/android/gms/fitness/data/zzj;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->mPendingIntent:Landroid/app/PendingIntent;

    iput-wide p5, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    iput-wide p7, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    iput-wide p9, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    iput p11, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakQ:I

    iput-object p12, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamw:Ljava/util/List;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamy:Ljava/util/List;

    move-wide/from16 v0, p14

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamx:J

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V
    .locals 21
    .param p1, "request"    # Lcom/google/android/gms/fitness/request/SensorRequest;
    .param p2, "listener"    # Lcom/google/android/gms/fitness/data/zzj;
    .param p3, "intent"    # Landroid/app/PendingIntent;
    .param p4, "callback"    # Lcom/google/android/gms/internal/zzmu;
    .param p5, "packageName"    # Ljava/lang/String;

    .prologue
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getDataType()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/request/SensorRequest;->getSamplingRate(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/request/SensorRequest;->getFastestRate(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v10

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/fitness/request/SensorRequest;->getMaxDeliveryLatency(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->getAccuracyMode()I

    move-result v14

    const/4 v15, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->zzrm()J

    move-result-wide v17

    move-object/from16 v3, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v19, p4

    move-object/from16 v20, p5

    invoke-direct/range {v3 .. v20}, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;JJJILjava/util/List;Ljava/util/List;JLcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    return-void
.end method

.method private zzb(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakQ:I

    iget v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakQ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamw:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamw:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

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
    .param p1, "that"    # Ljava/lang/Object;

    .prologue
    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;

    .end local p1    # "that":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzb(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;)Z

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

.method public getAccuracyMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakQ:I

    return v0
.end method

.method public getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public getDataType()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamr:Lcom/google/android/gms/fitness/data/zzj;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakQ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamw:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const-string v0, "SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzs;->zza(Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqL()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzakP:J

    return-wide v0
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzalN:Lcom/google/android/gms/internal/zzmu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzmu;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzrg()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->mPendingIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public zzrh()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamv:J

    return-wide v0
.end method

.method public zzri()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamu:J

    return-wide v0
.end method

.method public zzrj()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamw:Ljava/util/List;

    return-object v0
.end method

.method public zzrk()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamx:J

    return-wide v0
.end method

.method zzrl()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamr:Lcom/google/android/gms/fitness/data/zzj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRegistrationRequest;->zzamr:Lcom/google/android/gms/fitness/data/zzj;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/data/zzj;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
