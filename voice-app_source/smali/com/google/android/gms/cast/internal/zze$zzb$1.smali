.class Lcom/google/android/gms/cast/internal/zze$zzb$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/internal/zze$zzb;->onApplicationDisconnected(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzUJ:Lcom/google/android/gms/cast/internal/zze;

.field final synthetic zzUK:I

.field final synthetic zzUL:Lcom/google/android/gms/cast/internal/zze$zzb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/internal/zze$zzb;Lcom/google/android/gms/cast/internal/zze;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/zze$zzb$1;->zzUL:Lcom/google/android/gms/cast/internal/zze$zzb;

    iput-object p2, p0, Lcom/google/android/gms/cast/internal/zze$zzb$1;->zzUJ:Lcom/google/android/gms/cast/internal/zze;

    iput p3, p0, Lcom/google/android/gms/cast/internal/zze$zzb$1;->zzUK:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb$1;->zzUJ:Lcom/google/android/gms/cast/internal/zze;

    invoke-static {v0}, Lcom/google/android/gms/cast/internal/zze;->zzd(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/cast/Cast$Listener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb$1;->zzUJ:Lcom/google/android/gms/cast/internal/zze;

    invoke-static {v0}, Lcom/google/android/gms/cast/internal/zze;->zzd(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/cast/Cast$Listener;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/cast/internal/zze$zzb$1;->zzUK:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/Cast$Listener;->onApplicationDisconnected(I)V

    :cond_0
    return-void
.end method
