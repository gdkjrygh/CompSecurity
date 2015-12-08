.class public final Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final type:I

.field final zzCY:I

.field final zzaTN:I

.field final zzaTO:I

.field final zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzk;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzk;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/wearable/internal/ChannelImpl;III)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "channel"    # Lcom/google/android/gms/wearable/internal/ChannelImpl;
    .param p3, "type"    # I
    .param p4, "closeReason"    # I
    .param p5, "appErrorCode"    # I

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iput p3, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->type:I

    iput p4, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTN:I

    iput p5, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTO:I

    return-void
.end method

.method private static zzjT(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "CHANNEL_OPENED"

    goto :goto_0

    :pswitch_1
    const-string v0, "CHANNEL_CLOSED"

    goto :goto_0

    :pswitch_2
    const-string v0, "OUTPUT_CLOSED"

    goto :goto_0

    :pswitch_3
    const-string v0, "INPUT_CLOSED"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private static zzjU(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "CLOSE_REASON_DISCONNECTED"

    goto :goto_0

    :pswitch_1
    const-string v0, "CLOSE_REASON_REMOTE_CLOSE"

    goto :goto_0

    :pswitch_2
    const-string v0, "CLOSE_REASON_LOCAL_CLOSE"

    goto :goto_0

    :pswitch_3
    const-string v0, "CLOSE_REASON_NORMAL"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChannelEventParcelable[versionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzCY:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->type:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzjT(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", closeReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTN:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzjU(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appErrorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTO:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzk;->zza(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->type:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "ChannelEventParcelable"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->type:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;->onChannelOpened(Lcom/google/android/gms/wearable/Channel;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTN:I

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTO:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;->onChannelClosed(Lcom/google/android/gms/wearable/Channel;II)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTN:I

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTO:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;->onInputClosed(Lcom/google/android/gms/wearable/Channel;II)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTN:I

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zzaTO:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;->onOutputClosed(Lcom/google/android/gms/wearable/Channel;II)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
