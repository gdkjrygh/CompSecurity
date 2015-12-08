.class Lcom/google/android/gms/internal/zzie$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzie;->zzet()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzHl:Lcom/google/android/gms/ads/internal/overlay/zzc;

.field final synthetic zzHm:Lcom/google/android/gms/internal/zzie;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzie;Lcom/google/android/gms/ads/internal/overlay/zzc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzie$1;->zzHm:Lcom/google/android/gms/internal/zzie;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzie$1;->zzHl:Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzie$1;->zzHl:Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzc;->zzet()V

    return-void
.end method
