.class public Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/location/internal/zzl;


# instance fields
.field mPendingIntent:Landroid/app/PendingIntent;

.field private final zzCY:I

.field zzazf:I

.field zzazg:Lcom/google/android/gms/location/internal/LocationRequestInternal;

.field zzazh:Lcom/google/android/gms/location/zzd;

.field zzazi:Lcom/google/android/gms/location/zzc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/internal/zzl;

    invoke-direct {v0}, Lcom/google/android/gms/location/internal/zzl;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->CREATOR:Lcom/google/android/gms/location/internal/zzl;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V
    .locals 2
    .param p1, "versionCode"    # I
    .param p2, "operation"    # I
    .param p3, "locationRequest"    # Lcom/google/android/gms/location/internal/LocationRequestInternal;
    .param p4, "locationListenerBinder"    # Landroid/os/IBinder;
    .param p5, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p6, "locationCallbackBinder"    # Landroid/os/IBinder;

    .prologue
    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzCY:I

    iput p2, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazf:I

    iput-object p3, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazg:Lcom/google/android/gms/location/internal/LocationRequestInternal;

    if-nez p4, :cond_0

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazh:Lcom/google/android/gms/location/zzd;

    iput-object p5, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->mPendingIntent:Landroid/app/PendingIntent;

    if-nez p6, :cond_1

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazi:Lcom/google/android/gms/location/zzc;

    return-void

    :cond_0
    invoke-static {p4}, Lcom/google/android/gms/location/zzd$zza;->zzbT(Landroid/os/IBinder;)Lcom/google/android/gms/location/zzd;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {p6}, Lcom/google/android/gms/location/zzc$zza;->zzbS(Landroid/os/IBinder;)Lcom/google/android/gms/location/zzc;

    move-result-object v1

    goto :goto_1
.end method

.method public static zza(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/zzc;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 7

    const/4 v4, 0x0

    const/4 v1, 0x1

    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    invoke-interface {p1}, Lcom/google/android/gms/location/zzc;->asBinder()Landroid/os/IBinder;

    move-result-object v6

    move v2, v1

    move-object v3, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static zza(Lcom/google/android/gms/location/zzc;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 7

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/location/zzc;->asBinder()Landroid/os/IBinder;

    move-result-object v6

    move-object v4, v3

    move-object v5, v3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/app/PendingIntent;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 7

    const/4 v4, 0x0

    const/4 v1, 0x1

    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move v2, v1

    move-object v3, p0

    move-object v5, p1

    move-object v6, v4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 7

    const/4 v5, 0x0

    const/4 v1, 0x1

    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    invoke-interface {p1}, Lcom/google/android/gms/location/zzd;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    move v2, v1

    move-object v3, p0

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 7

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/location/zzd;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    move-object v5, v3

    move-object v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static zze(Landroid/app/PendingIntent;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    .locals 7

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    const/4 v1, 0x1

    const/4 v2, 0x2

    move-object v4, v3

    move-object v5, p0

    move-object v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;-><init>(IILcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzCY:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/internal/zzl;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;Landroid/os/Parcel;I)V

    return-void
.end method

.method zzuy()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazh:Lcom/google/android/gms/location/zzd;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazh:Lcom/google/android/gms/location/zzd;

    invoke-interface {v0}, Lcom/google/android/gms/location/zzd;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method zzuz()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazi:Lcom/google/android/gms/location/zzc;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzazi:Lcom/google/android/gms/location/zzc;

    invoke-interface {v0}, Lcom/google/android/gms/location/zzc;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
