.class Lcom/google/android/gms/common/api/zze$zzb;
.super Lcom/google/android/gms/common/internal/zzq$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "zzb"
.end annotation


# instance fields
.field private final zzXe:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/common/api/zze;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/zze;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zzq$zza;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/zze$zzb;->zzXe:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzb;->zzXe:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/common/api/zze;->zzb(Lcom/google/android/gms/common/api/zze;)Lcom/google/android/gms/common/api/zzg;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/common/api/zzg;->zzXs:Lcom/google/android/gms/common/api/zzg$zza;

    new-instance v2, Lcom/google/android/gms/common/api/zze$zzb$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/common/api/zze$zzb$1;-><init>(Lcom/google/android/gms/common/api/zze$zzb;Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/zzg$zza;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
