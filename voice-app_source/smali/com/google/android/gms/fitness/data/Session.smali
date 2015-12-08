.class public Lcom/google/android/gms/fitness/data/Session;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/data/Session$1;,
        Lcom/google/android/gms/fitness/data/Session$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;"
        }
    .end annotation
.end field

.field public static final EXTRA_SESSION:Ljava/lang/String; = "vnd.google.fitness.session"

.field public static final MIME_TYPE_PREFIX:Ljava/lang/String; = "vnd.google.fitness.session/"


# instance fields
.field private final mName:Ljava/lang/String;

.field private final zzCY:I

.field private final zzKT:J

.field private final zzajH:J

.field private final zzajR:I

.field private final zzakL:Ljava/lang/String;

.field private final zzakM:Ljava/lang/String;

.field private final zzakN:Ljava/lang/Long;

.field private final zzake:Lcom/google/android/gms/fitness/data/Application;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/zzp;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/zzp;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/Session;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/fitness/data/Application;Ljava/lang/Long;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "startTimeMillis"    # J
    .param p4, "endTimeMillis"    # J
    .param p6, "name"    # Ljava/lang/String;
    .param p7, "identifier"    # Ljava/lang/String;
    .param p8, "description"    # Ljava/lang/String;
    .param p9, "activityType"    # I
    .param p10, "application"    # Lcom/google/android/gms/fitness/data/Application;
    .param p11, "activeTimeMillis"    # Ljava/lang/Long;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/Session;->zzCY:I

    iput-wide p2, p0, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    iput-wide p4, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    iput-object p6, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/fitness/data/Session;->zzakL:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/fitness/data/Session;->zzakM:Ljava/lang/String;

    iput p9, p0, Lcom/google/android/gms/fitness/data/Session;->zzajR:I

    iput-object p10, p0, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

    iput-object p11, p0, Lcom/google/android/gms/fitness/data/Session;->zzakN:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/fitness/data/Application;Ljava/lang/Long;)V
    .locals 13
    .param p1, "startTimeMillis"    # J
    .param p3, "endTimeMillis"    # J
    .param p5, "name"    # Ljava/lang/String;
    .param p6, "identifier"    # Ljava/lang/String;
    .param p7, "description"    # Ljava/lang/String;
    .param p8, "activityType"    # I
    .param p9, "application"    # Lcom/google/android/gms/fitness/data/Application;
    .param p10, "activeTimeMillis"    # Ljava/lang/Long;

    .prologue
    const/4 v1, 0x3

    move-object v0, p0

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/fitness/data/Session;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/fitness/data/Application;Ljava/lang/Long;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/data/Session$Builder;)V
    .locals 12
    .param p1, "builder"    # Lcom/google/android/gms/fitness/data/Session$Builder;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zza(Lcom/google/android/gms/fitness/data/Session$Builder;)J

    move-result-wide v2

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zzb(Lcom/google/android/gms/fitness/data/Session$Builder;)J

    move-result-wide v4

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zzc(Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zzd(Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zze(Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/String;

    move-result-object v8

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zzf(Lcom/google/android/gms/fitness/data/Session$Builder;)I

    move-result v9

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zzg(Lcom/google/android/gms/fitness/data/Session$Builder;)Lcom/google/android/gms/fitness/data/Application;

    move-result-object v10

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Session$Builder;->zzh(Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/Long;

    move-result-object v11

    move-object v1, p0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/fitness/data/Session;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/fitness/data/Application;Ljava/lang/Long;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/data/Session$Builder;Lcom/google/android/gms/fitness/data/Session$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/fitness/data/Session$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/fitness/data/Session$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Session;-><init>(Lcom/google/android/gms/fitness/data/Session$Builder;)V

    return-void
.end method

.method public static extract(Landroid/content/Intent;)Lcom/google/android/gms/fitness/data/Session;
    .locals 2
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "vnd.google.fitness.session"

    sget-object v1, Lcom/google/android/gms/fitness/data/Session;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/zzc;->zza(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/Session;

    goto :goto_0
.end method

.method public static getMimeType(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "activity"    # Ljava/lang/String;

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.google.fitness.session/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/fitness/data/Session;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakL:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->zzakL:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakM:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->zzakM:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajR:I

    iget v1, p1, Lcom/google/android/gms/fitness/data/Session;->zzajR:I

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
    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/Session;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/Session;

    .end local p1    # "o":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Session;->zza(Lcom/google/android/gms/fitness/data/Session;)Z

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

.method public getActiveTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakN:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Active time is not set"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzu;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakN:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getActivity()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajR:I

    invoke-static {v0}, Lcom/google/android/gms/fitness/FitnessActivities;->getName(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Application;->getPackageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakM:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakL:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTime(Ljava/util/concurrent/TimeUnit;)J
    .locals 3
    .param p1, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzCY:I

    return v0
.end method

.method public hasActiveTime()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakN:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzakL:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isOngoing()Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "startTime"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "endTime"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "identifier"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzakL:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "description"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzakM:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "activity"

    iget v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzajR:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "application"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/zzp;->zza(Lcom/google/android/gms/fitness/data/Session;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzkt()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzKT:J

    return-wide v0
.end method

.method public zzqB()Lcom/google/android/gms/fitness/data/Application;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzake:Lcom/google/android/gms/fitness/data/Application;

    return-object v0
.end method

.method public zzqJ()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzakN:Ljava/lang/Long;

    return-object v0
.end method

.method public zzqq()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajR:I

    return v0
.end method

.method public zzqs()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->zzajH:J

    return-wide v0
.end method
