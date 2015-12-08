.class public Lcom/google/android/gms/fitness/request/DataSourcesRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataSourcesRequest$1;,
        Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataSourcesRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field private final zzMZ:Ljava/lang/String;

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

.field private final zzamf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final zzamg:Z

.field private final zzamh:Lcom/google/android/gms/internal/zzmg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/List;Ljava/util/List;ZLandroid/os/IBinder;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p4, "includeDbOnlySources"    # Z
    .param p5, "callback"    # Landroid/os/IBinder;
    .param p6, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "dataTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataType;>;"
    .local p3, "dataSourceTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzajQ:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamf:Ljava/util/List;

    iput-boolean p4, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamg:Z

    if-nez p5, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamh:Lcom/google/android/gms/internal/zzmg;

    iput-object p6, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzMZ:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p5}, Lcom/google/android/gms/internal/zzmg$zza;->zzbr(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmg;

    move-result-object v0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)V
    .locals 6
    .param p1, "builder"    # Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;

    .prologue
    const/4 v4, 0x0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->zza(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)[Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzkx;->zzb([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->zzb(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)[I

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzkx;->zza([I)[Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;->zzc(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)Z

    move-result v3

    move-object v0, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/zzmg;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;Lcom/google/android/gms/fitness/request/DataSourcesRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/fitness/request/DataSourcesRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$Builder;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest;Lcom/google/android/gms/internal/zzmg;Ljava/lang/String;)V
    .locals 6
    .param p1, "request"    # Lcom/google/android/gms/fitness/request/DataSourcesRequest;
    .param p2, "callback"    # Lcom/google/android/gms/internal/zzmg;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzajQ:Ljava/util/List;

    iget-object v2, p1, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamf:Ljava/util/List;

    iget-boolean v3, p1, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamg:Z

    move-object v0, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/zzmg;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/zzmg;Ljava/lang/String;)V
    .locals 1
    .param p3, "includeDbOnlySources"    # Z
    .param p4, "callback"    # Lcom/google/android/gms/internal/zzmg;
    .param p5, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Lcom/google/android/gms/internal/zzmg;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "dataTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataType;>;"
    .local p2, "dataSourceTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzCY:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzajQ:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamf:Ljava/util/List;

    iput-boolean p3, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamg:Z

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamh:Lcom/google/android/gms/internal/zzmg;

    iput-object p5, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzajQ:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzCY:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "dataTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzajQ:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "sourceTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamf:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamg:Z

    if-eqz v1, :cond_0

    const-string v1, "includeDbOnlySources"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zzt$zza;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzh;->zza(Lcom/google/android/gms/fitness/request/DataSourcesRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamh:Lcom/google/android/gms/internal/zzmg;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamh:Lcom/google/android/gms/internal/zzmg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzmg;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzrd()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamf:Ljava/util/List;

    return-object v0
.end method

.method public zzre()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->zzamg:Z

    return v0
.end method
