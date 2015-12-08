.class public Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/messages/internal/zze;


# instance fields
.field final versionCode:I

.field public final zzaFZ:Lcom/google/android/gms/nearby/messages/Message;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zze;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zze;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->CREATOR:Lcom/google/android/gms/nearby/messages/internal/zze;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/messages/Message;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "message"    # Lcom/google/android/gms/nearby/messages/Message;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/Message;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->zzaFZ:Lcom/google/android/gms/nearby/messages/Message;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->CREATOR:Lcom/google/android/gms/nearby/messages/internal/zze;

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->CREATOR:Lcom/google/android/gms/nearby/messages/internal/zze;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/zze;->zza(Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Landroid/os/Parcel;I)V

    return-void
.end method
