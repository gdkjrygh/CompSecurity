.class Lcom/google/android/gms/games/internal/api/RequestsImpl$5;
.super Lcom/google/android/gms/games/internal/api/RequestsImpl$SendRequestImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/RequestsImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaqA:Ljava/lang/String;

.field final synthetic zzarS:[Ljava/lang/String;

.field final synthetic zzarT:I

.field final synthetic zzarU:[B

.field final synthetic zzarV:I


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->zza(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v2, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->zzaqA:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->zzarS:[Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->zzarT:I

    iget-object v5, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->zzarU:[B

    iget v6, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->zzarV:I

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;[Ljava/lang/String;I[BI)V

    return-void
.end method
