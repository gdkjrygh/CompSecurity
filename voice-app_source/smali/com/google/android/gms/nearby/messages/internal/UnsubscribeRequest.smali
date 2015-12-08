.class public final Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field public final zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

.field public final zzaGe:Ljava/lang/String;

.field public final zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

.field public final zzaGh:Landroid/app/PendingIntent;

.field public final zzaGi:I

.field public final zzayp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzl;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzl;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "messageListener"    # Landroid/os/IBinder;
    .param p3, "callbackAsBinder"    # Landroid/os/IBinder;
    .param p4, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p5, "messageListenerKey"    # I
    .param p6, "zeroPartyPackageName"    # Ljava/lang/String;
    .param p7, "realClientPackageName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzCY:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/messages/internal/zza$zza;->zzdd(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/zza;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

    invoke-static {p3}, Lcom/google/android/gms/nearby/messages/internal/zzb$zza;->zzde(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGh:Landroid/app/PendingIntent;

    iput p5, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGi:I

    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzayp:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGe:Ljava/lang/String;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/zzl;->zza(Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method zzxa()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/zzb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method zzxb()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/zza;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
