.class public final Lcom/google/android/gms/wearable/internal/zzm;
.super Ljava/io/InputStream;


# instance fields
.field private final zzaTX:Ljava/io/InputStream;

.field private volatile zzaTY:Lcom/google/android/gms/wearable/internal/zzj;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    return-void
.end method

.method private zzjX(I)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/wearable/ChannelIOException;
        }
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTY:Lcom/google/android/gms/wearable/internal/zzj;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/wearable/ChannelIOException;

    const-string v2, "Channel closed unexpectedly before stream was finished"

    iget v3, v0, Lcom/google/android/gms/wearable/internal/zzj;->zzaTN:I

    iget v0, v0, Lcom/google/android/gms/wearable/internal/zzj;->zzaTO:I

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/wearable/ChannelIOException;-><init>(Ljava/lang/String;II)V

    throw v1

    :cond_0
    return p1
.end method


# virtual methods
.method public available()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public mark(I)V
    .locals 1
    .param p1, "readlimit"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/zzm;->zzjX(I)I

    move-result v0

    return v0
.end method

.method public read([B)I
    .locals 1
    .param p1, "buffer"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/zzm;->zzjX(I)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 1
    .param p1, "buffer"    # [B
    .param p2, "byteOffset"    # I
    .param p3, "byteCount"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/internal/zzm;->zzjX(I)I

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    return-void
.end method

.method public skip(J)J
    .locals 3
    .param p1, "byteCount"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTX:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    return-wide v0
.end method

.method zzBb()Lcom/google/android/gms/wearable/internal/zzr;
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzm$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/zzm$1;-><init>(Lcom/google/android/gms/wearable/internal/zzm;)V

    return-object v0
.end method

.method zza(Lcom/google/android/gms/wearable/internal/zzj;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/zzj;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzm;->zzaTY:Lcom/google/android/gms/wearable/internal/zzj;

    return-void
.end method
