.class Lcom/google/android/gms/wearable/internal/zzbk$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/zzbk;->zzb(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;Landroid/net/Uri;Z)Ljava/util/concurrent/FutureTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

.field final synthetic zzaGx:Landroid/net/Uri;

.field final synthetic zzaTS:Z

.field final synthetic zzaUZ:Lcom/google/android/gms/wearable/internal/zzbk;

.field final synthetic zzaVa:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzbk;Landroid/net/Uri;Lcom/google/android/gms/common/api/zza$zzb;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaUZ:Lcom/google/android/gms/wearable/internal/zzbk;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaGx:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    iput-boolean p4, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaTS:Z

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaVa:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "WearableClient"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WearableClient"

    const-string v1, "Executing receiveFileFromChannelTask"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v0, "file"

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaGx:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "WearableClient"

    const-string v1, "Channel.receiveFile used with non-file URI"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0xa

    const-string v3, "Channel.receiveFile used with non-file URI"

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/zza$zzb;->zzr(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-void

    :cond_1
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaGx:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x20000000

    iget-boolean v0, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaTS:Z

    if-eqz v0, :cond_2

    const/high16 v0, 0x2000000

    :goto_1
    or-int/2addr v0, v2

    :try_start_0
    invoke-static {v1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaUZ:Lcom/google/android/gms/wearable/internal/zzbk;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/internal/zzbk;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/zzat;

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzbj$zzu;

    iget-object v3, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    invoke-direct {v2, v3}, Lcom/google/android/gms/wearable/internal/zzbj$zzu;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    iget-object v3, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaVa:Ljava/lang/String;

    invoke-interface {v0, v2, v3, v1}, Lcom/google/android/gms/wearable/internal/zzat;->zza(Lcom/google/android/gms/wearable/internal/zzar;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "WearableClient"

    const-string v2, "Failed to close targetFd"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v0, "WearableClient"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "File couldn\'t be opened for Channel.receiveFile: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/zza$zzb;->zzr(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :catch_2
    move-exception v0

    :try_start_3
    const-string v2, "WearableClient"

    const-string v3, "Channel.receiveFile failed."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbk$2;->zzaFp:Lcom/google/android/gms/common/api/zza$zzb;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/zza$zzb;->zzr(Lcom/google/android/gms/common/api/Status;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_0

    :catch_3
    move-exception v0

    const-string v1, "WearableClient"

    const-string v2, "Failed to close targetFd"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    :goto_2
    throw v0

    :catch_4
    move-exception v1

    const-string v2, "WearableClient"

    const-string v3, "Failed to close targetFd"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method
