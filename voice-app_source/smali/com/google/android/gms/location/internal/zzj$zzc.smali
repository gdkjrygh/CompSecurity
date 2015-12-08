.class final Lcom/google/android/gms/location/internal/zzj$zzc;
.super Lcom/google/android/gms/common/internal/zzi$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/internal/zzj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "zzc"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/location/internal/zzg;",
        ">.zzc<",
        "Lcom/google/android/gms/location/zze$zzb;",
        ">;"
    }
.end annotation


# instance fields
.field private final mPendingIntent:Landroid/app/PendingIntent;

.field private final zzTS:I

.field private final zzayT:[Ljava/lang/String;

.field final synthetic zzayU:Lcom/google/android/gms/location/internal/zzj;

.field private final zzayY:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/internal/zzj;ILcom/google/android/gms/location/zze$zzb;ILandroid/app/PendingIntent;)V
    .locals 1

    const/4 v0, 0x1

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayU:Lcom/google/android/gms/location/internal/zzj;

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/common/internal/zzi$zzc;-><init>(Lcom/google/android/gms/common/internal/zzi;Ljava/lang/Object;)V

    if-ne p2, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzb;->zzU(Z)V

    iput p2, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayY:I

    invoke-static {p4}, Lcom/google/android/gms/location/LocationStatusCodes;->zzgA(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzTS:I

    iput-object p5, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->mPendingIntent:Landroid/app/PendingIntent;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayT:[Ljava/lang/String;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/location/internal/zzj;ILcom/google/android/gms/location/zze$zzb;I[Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayU:Lcom/google/android/gms/location/internal/zzj;

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/common/internal/zzi$zzc;-><init>(Lcom/google/android/gms/common/internal/zzi;Ljava/lang/Object;)V

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzb;->zzU(Z)V

    iput p2, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayY:I

    invoke-static {p4}, Lcom/google/android/gms/location/LocationStatusCodes;->zzgA(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzTS:I

    iput-object p5, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayT:[Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->mPendingIntent:Landroid/app/PendingIntent;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/location/zze$zzb;)V
    .locals 3

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayY:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "LocationClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayY:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzTS:I

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->mPendingIntent:Landroid/app/PendingIntent;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/zze$zzb;->zza(ILandroid/app/PendingIntent;)V

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzTS:I

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj$zzc;->zzayT:[Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/zze$zzb;->zzb(I[Ljava/lang/String;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected zznP()V
    .locals 0

    return-void
.end method

.method protected synthetic zzr(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/zze$zzb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zzj$zzc;->zza(Lcom/google/android/gms/location/zze$zzb;)V

    return-void
.end method
