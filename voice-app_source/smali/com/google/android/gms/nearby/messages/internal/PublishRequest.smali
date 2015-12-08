.class public final Lcom/google/android/gms/nearby/messages/internal/PublishRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/PublishRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field public final zzaGb:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

.field public final zzaGc:Lcom/google/android/gms/nearby/messages/Strategy;

.field public final zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

.field public final zzaGe:Ljava/lang/String;

.field public final zzayp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/messages/internal/MessageWrapper;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "messageWrapper"    # Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;
    .param p3, "strategy"    # Lcom/google/android/gms/nearby/messages/Strategy;
    .param p4, "callbackAsBinder"    # Landroid/os/IBinder;
    .param p5, "zeroPartyPackageName"    # Ljava/lang/String;
    .param p6, "realClientPackageName"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzaGb:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzaGc:Lcom/google/android/gms/nearby/messages/Strategy;

    invoke-static {p4}, Lcom/google/android/gms/nearby/messages/internal/zzb$zza;->zzde(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzayp:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzaGe:Ljava/lang/String;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/zzi;->zza(Lcom/google/android/gms/nearby/messages/internal/PublishRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method zzxa()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;->zzaGd:Lcom/google/android/gms/nearby/messages/internal/zzb;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/zzb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method
