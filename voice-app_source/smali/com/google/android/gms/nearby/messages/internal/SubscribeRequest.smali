.class public final Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field public final zzaGc:Lcom/google/android/gms/nearby/messages/Strategy;

.field public final zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

.field public final zzaGe:Ljava/lang/String;

.field public final zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

.field public final zzaGg:Lcom/google/android/gms/nearby/messages/MessageFilter;

.field public final zzaGh:Landroid/app/PendingIntent;

.field public final zzaGi:I

.field public final zzayp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzj;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzj;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "messageListener"    # Landroid/os/IBinder;
    .param p3, "strategy"    # Lcom/google/android/gms/nearby/messages/Strategy;
    .param p4, "callbackAsBinder"    # Landroid/os/IBinder;
    .param p5, "filter"    # Lcom/google/android/gms/nearby/messages/MessageFilter;
    .param p6, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p7, "messageListenerKey"    # I
    .param p8, "zeroPartyPackageName"    # Ljava/lang/String;
    .param p9, "realClientPackageName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzCY:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/messages/internal/zza$zza;->zzdd(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/zza;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGc:Lcom/google/android/gms/nearby/messages/Strategy;

    invoke-static {p4}, Lcom/google/android/gms/nearby/messages/internal/zzb$zza;->zzde(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGg:Lcom/google/android/gms/nearby/messages/MessageFilter;

    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGh:Landroid/app/PendingIntent;

    iput p7, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGi:I

    iput-object p8, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzayp:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGe:Ljava/lang/String;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/zzj;->zza(Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method zzxa()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/zzb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method zzxb()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->zzaGf:Lcom/google/android/gms/nearby/messages/internal/zza;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/zza;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
