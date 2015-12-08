.class public Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzCY:I

.field private final zzMZ:Ljava/lang/String;

.field private final zzajF:Lcom/google/android/gms/fitness/data/DataType;

.field private final zzamn:Lcom/google/android/gms/internal/zzmp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzp;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzp;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataType;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .param p3, "callback"    # Landroid/os/IBinder;
    .param p4, "packageName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    if-nez p3, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzamn:Lcom/google/android/gms/internal/zzmp;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzMZ:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p3}, Lcom/google/android/gms/internal/zzmp$zza;->zzbA(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmp;

    move-result-object v0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/internal/zzmp;Ljava/lang/String;)V
    .locals 1
    .param p1, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;
    .param p2, "callback"    # Lcom/google/android/gms/internal/zzmp;
    .param p3, "packageName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzCY:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzamn:Lcom/google/android/gms/internal/zzmp;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzMZ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDataType()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzajF:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzMZ:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzp;->zza(Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzqU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzamn:Lcom/google/android/gms/internal/zzmp;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ListSubscriptionsRequest;->zzamn:Lcom/google/android/gms/internal/zzmp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzmp;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
