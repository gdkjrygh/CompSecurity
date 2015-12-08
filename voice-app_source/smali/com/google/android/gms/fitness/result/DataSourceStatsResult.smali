.class public Lcom/google/android/gms/fitness/result/DataSourceStatsResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/result/DataSourceStatsResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field public final zzOw:J

.field public final zzajG:Lcom/google/android/gms/fitness/data/DataSource;

.field public final zzamS:Z

.field public final zzamT:J

.field public final zzamU:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/result/zzd;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/result/zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;JZJJ)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "dataSource"    # Lcom/google/android/gms/fitness/data/DataSource;
    .param p3, "id"    # J
    .param p5, "isRemote"    # Z
    .param p6, "minEndTimeNanos"    # J
    .param p8, "maxEndTimeNanos"    # J

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzajG:Lcom/google/android/gms/fitness/data/DataSource;

    iput-wide p3, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzOw:J

    iput-boolean p5, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzamS:Z

    iput-wide p6, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzamT:J

    iput-wide p8, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzamU:J

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/result/zzd;->zza(Lcom/google/android/gms/fitness/result/DataSourceStatsResult;Landroid/os/Parcel;I)V

    return-void
.end method
