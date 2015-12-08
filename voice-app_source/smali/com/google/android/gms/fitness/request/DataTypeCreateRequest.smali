.class public Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$1;,
        Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mName:Ljava/lang/String;

.field private final zzCY:I

.field private final zzMZ:Ljava/lang/String;

.field private final zzakq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;"
        }
    .end annotation
.end field

.field private final zzamk:Lcom/google/android/gms/internal/zzmh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/util/List;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "name"    # Ljava/lang/String;
    .param p4, "callback"    # Landroid/os/IBinder;
    .param p5, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p3, "fields":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/Field;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

    if-nez p4, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzamk:Lcom/google/android/gms/internal/zzmh;

    iput-object p5, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzMZ:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p4}, Lcom/google/android/gms/internal/zzmh$zza;->zzbs(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmh;

    move-result-object v0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;)V
    .locals 3
    .param p1, "builder"    # Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;

    .prologue
    const/4 v2, 0x0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;->zza(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;->zzb(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2, v2}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/zzmh;Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$Builder;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;Lcom/google/android/gms/internal/zzmh;Ljava/lang/String;)V
    .locals 2
    .param p1, "request"    # Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;
    .param p2, "callback"    # Lcom/google/android/gms/internal/zzmh;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

    invoke-direct {p0, v0, v1, p2, p3}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/zzmh;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/zzmh;Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p3, "callback"    # Lcom/google/android/gms/internal/zzmh;
    .param p4, "packageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;",
            "Lcom/google/android/gms/internal/zzmh;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "fields":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/Field;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzCY:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzamk:Lcom/google/android/gms/internal/zzmh;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method

.method private zzb(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

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
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    .end local p1    # "o":Ljava/lang/Object;
    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzb(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;)Z

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

.method public getFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzCY:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "fields"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzakq:Ljava/util/List;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzi;->zza(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzamk:Lcom/google/android/gms/internal/zzmh;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;->zzamk:Lcom/google/android/gms/internal/zzmh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzmh;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
