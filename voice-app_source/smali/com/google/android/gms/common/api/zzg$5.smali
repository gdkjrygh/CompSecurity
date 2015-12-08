.class Lcom/google/android/gms/common/api/zzg$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/common/api/zzg;->clearDefaultAccountAndReconnect()Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzXE:Lcom/google/android/gms/common/api/zzg;

.field final synthetic zzXH:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic zzXI:Lcom/google/android/gms/common/api/zzl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/zzg;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/common/api/zzl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/zzg$5;->zzXE:Lcom/google/android/gms/common/api/zzg;

    iput-object p2, p0, Lcom/google/android/gms/common/api/zzg$5;->zzXH:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/common/api/zzg$5;->zzXI:Lcom/google/android/gms/common/api/zzl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/common/api/zzg$5;->zzXE:Lcom/google/android/gms/common/api/zzg;

    iget-object v0, p0, Lcom/google/android/gms/common/api/zzg$5;->zzXH:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/google/android/gms/common/api/zzg$5;->zzXI:Lcom/google/android/gms/common/api/zzl;

    const/4 v3, 0x1

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/common/api/zzg;->zza(Lcom/google/android/gms/common/api/zzg;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/zzl;Z)V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0
    .param p1, "cause"    # I

    .prologue
    return-void
.end method
