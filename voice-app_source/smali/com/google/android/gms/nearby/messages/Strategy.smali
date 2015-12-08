.class public Lcom/google/android/gms/nearby/messages/Strategy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/Strategy$zza;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/Strategy;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaFQ:Lcom/google/android/gms/nearby/messages/Strategy;

.field public static final zzaFR:Lcom/google/android/gms/nearby/messages/Strategy;

.field public static final zzaFS:Lcom/google/android/gms/nearby/messages/Strategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field final versionCode:I

.field final zzaFT:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field final zzaFU:I

.field final zzaFV:I

.field final zzaFW:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field final zzaFX:I

.field final zzaFY:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/nearby/messages/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/google/android/gms/nearby/messages/Strategy$zza;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/Strategy$zza;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/Strategy$zza;->zzwZ()Lcom/google/android/gms/nearby/messages/Strategy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFQ:Lcom/google/android/gms/nearby/messages/Strategy;

    new-instance v0, Lcom/google/android/gms/nearby/messages/Strategy$zza;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/Strategy$zza;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/Strategy$zza;->zzie(I)Lcom/google/android/gms/nearby/messages/Strategy$zza;

    move-result-object v0

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Lcom/google/android/gms/nearby/messages/Strategy$zza;->zzif(I)Lcom/google/android/gms/nearby/messages/Strategy$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/Strategy$zza;->zzwZ()Lcom/google/android/gms/nearby/messages/Strategy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFR:Lcom/google/android/gms/nearby/messages/Strategy;

    sget-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFR:Lcom/google/android/gms/nearby/messages/Strategy;

    sput-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFS:Lcom/google/android/gms/nearby/messages/Strategy;

    return-void
.end method

.method constructor <init>(IIIIZII)V
    .locals 3
    .param p1, "versionCode"    # I
    .param p2, "broadcastScanStrategy"    # I
    .param p3, "ttlSeconds"    # I
    .param p4, "distanceType"    # I
    .param p5, "isBleBeaconStrategy"    # Z
    .param p6, "discoveryMedium"    # I
    .param p7, "discoveryMode"    # I

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFT:I

    if-nez p2, :cond_0

    iput p7, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    :goto_0
    iput p4, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFV:I

    iput-boolean p5, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFW:Z

    if-eqz p5, :cond_1

    iput v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFX:I

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFU:I

    :goto_1
    return-void

    :cond_0
    packed-switch p2, :pswitch_data_0

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    goto :goto_0

    :pswitch_0
    iput v1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    goto :goto_0

    :pswitch_1
    iput v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    goto :goto_0

    :cond_1
    if-nez p6, :cond_2

    iput v1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFX:I

    iput p3, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFU:I

    goto :goto_1

    :cond_2
    iput p6, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFX:I

    iput p3, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFU:I

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    .end local p1    # "other":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "other":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/nearby/messages/Strategy;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/nearby/messages/Strategy;

    .end local p1    # "other":Ljava/lang/Object;
    iget v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->versionCode:I

    iget v3, p1, Lcom/google/android/gms/nearby/messages/Strategy;->versionCode:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    iget v3, p1, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFU:I

    iget v3, p1, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFU:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFV:I

    iget v3, p1, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFV:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFX:I

    iget v3, p1, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFX:I

    if-eq v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/nearby/messages/Strategy;->versionCode:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFY:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFU:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFV:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/nearby/messages/Strategy;->zzaFX:I

    add-int/2addr v0, v1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/zzf;->zza(Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/Parcel;I)V

    return-void
.end method
