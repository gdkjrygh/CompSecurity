.class Lcom/google/android/gms/common/api/zze$zzb$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/common/api/zze$zzb;->zzb(Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzXf:Lcom/google/android/gms/common/api/zze;

.field final synthetic zzXi:Lcom/google/android/gms/common/internal/ResolveAccountResponse;

.field final synthetic zzXj:Lcom/google/android/gms/common/api/zze$zzb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/zze$zzb;Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/zze$zzb$1;->zzXj:Lcom/google/android/gms/common/api/zze$zzb;

    iput-object p2, p0, Lcom/google/android/gms/common/api/zze$zzb$1;->zzXf:Lcom/google/android/gms/common/api/zze;

    iput-object p3, p0, Lcom/google/android/gms/common/api/zze$zzb$1;->zzXi:Lcom/google/android/gms/common/internal/ResolveAccountResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzb$1;->zzXf:Lcom/google/android/gms/common/api/zze;

    iget-object v1, p0, Lcom/google/android/gms/common/api/zze$zzb$1;->zzXi:Lcom/google/android/gms/common/internal/ResolveAccountResponse;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/zze;->zza(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V

    return-void
.end method
