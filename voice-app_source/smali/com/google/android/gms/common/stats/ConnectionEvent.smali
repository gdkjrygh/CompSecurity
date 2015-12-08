.class public final Lcom/google/android/gms/common/stats/ConnectionEvent;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/common/stats/ConnectionEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field private final zzabZ:J

.field private zzaca:I

.field private final zzacb:Ljava/lang/String;

.field private final zzacc:Ljava/lang/String;

.field private final zzacd:Ljava/lang/String;

.field private final zzace:Ljava/lang/String;

.field private final zzacf:Ljava/lang/String;

.field private final zzacg:Ljava/lang/String;

.field private final zzach:J

.field private final zzaci:J

.field private zzacj:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/stats/zza;

    invoke-direct {v0}, Lcom/google/android/gms/common/stats/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/stats/ConnectionEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 5
    .param p1, "versionCode"    # I
    .param p2, "timeMillis"    # J
    .param p4, "eventType"    # I
    .param p5, "callingProcess"    # Ljava/lang/String;
    .param p6, "callingService"    # Ljava/lang/String;
    .param p7, "targetProcess"    # Ljava/lang/String;
    .param p8, "targetService"    # Ljava/lang/String;
    .param p9, "stackTrace"    # Ljava/lang/String;
    .param p10, "connKey"    # Ljava/lang/String;
    .param p11, "elapsedRealtime"    # J
    .param p13, "heapAlloc"    # J

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzCY:I

    iput-wide p2, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzabZ:J

    iput p4, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzaca:I

    iput-object p5, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacb:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacc:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacd:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzace:Ljava/lang/String;

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacj:J

    iput-object p9, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacf:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacg:Ljava/lang/String;

    move-wide/from16 v0, p11

    iput-wide v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzach:J

    move-wide/from16 v0, p13

    iput-wide v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzaci:J

    return-void
.end method

.method public constructor <init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 16
    .param p1, "timeMillis"    # J
    .param p3, "eventType"    # I
    .param p4, "callingProcess"    # Ljava/lang/String;
    .param p5, "callingService"    # Ljava/lang/String;
    .param p6, "targetProcess"    # Ljava/lang/String;
    .param p7, "targetService"    # Ljava/lang/String;
    .param p8, "stackTrace"    # Ljava/lang/String;
    .param p9, "connKey"    # Ljava/lang/String;
    .param p10, "elapsedRealtime"    # J
    .param p12, "heapAlloc"    # J

    .prologue
    const/4 v2, 0x1

    move-object/from16 v1, p0

    move-wide/from16 v3, p1

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-wide/from16 v12, p10

    move-wide/from16 v14, p12

    invoke-direct/range {v1 .. v15}, Lcom/google/android/gms/common/stats/ConnectionEvent;-><init>(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getEventType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzaca:I

    return v0
.end method

.method public getTimeMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzabZ:J

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/stats/zza;->zza(Lcom/google/android/gms/common/stats/ConnectionEvent;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzoG()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacb:Ljava/lang/String;

    return-object v0
.end method

.method public zzoH()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacc:Ljava/lang/String;

    return-object v0
.end method

.method public zzoI()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacd:Ljava/lang/String;

    return-object v0
.end method

.method public zzoJ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzace:Ljava/lang/String;

    return-object v0
.end method

.method public zzoK()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacf:Ljava/lang/String;

    return-object v0
.end method

.method public zzoL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzacg:Ljava/lang/String;

    return-object v0
.end method

.method public zzoM()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzaci:J

    return-wide v0
.end method

.method public zzoN()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/common/stats/ConnectionEvent;->zzach:J

    return-wide v0
.end method
