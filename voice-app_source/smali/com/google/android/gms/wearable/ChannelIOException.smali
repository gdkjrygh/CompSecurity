.class public Lcom/google/android/gms/wearable/ChannelIOException;
.super Ljava/io/IOException;


# instance fields
.field private final zzaSO:I

.field private final zzaSP:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "closeReason"    # I
    .param p3, "appSpecificErrorCode"    # I

    .prologue
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput p2, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzaSO:I

    iput p3, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzaSP:I

    return-void
.end method


# virtual methods
.method public getAppSpecificErrorCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzaSP:I

    return v0
.end method

.method public getCloseReason()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzaSO:I

    return v0
.end method
