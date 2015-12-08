.class Lcom/google/android/gms/analytics/internal/zzl$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/analytics/internal/zzl;->zza(Lcom/google/android/gms/analytics/internal/zzw;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzJx:Lcom/google/android/gms/analytics/internal/zzw;

.field final synthetic zzKx:Lcom/google/android/gms/analytics/internal/zzl;

.field final synthetic zzKy:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/zzl;Lcom/google/android/gms/analytics/internal/zzw;J)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/zzl$5;->zzKx:Lcom/google/android/gms/analytics/internal/zzl;

    iput-object p2, p0, Lcom/google/android/gms/analytics/internal/zzl$5;->zzJx:Lcom/google/android/gms/analytics/internal/zzw;

    iput-wide p3, p0, Lcom/google/android/gms/analytics/internal/zzl$5;->zzKy:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/zzl$5;->zzKx:Lcom/google/android/gms/analytics/internal/zzl;

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/zzl$5;->zzJx:Lcom/google/android/gms/analytics/internal/zzw;

    iget-wide v2, p0, Lcom/google/android/gms/analytics/internal/zzl$5;->zzKy:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/analytics/internal/zzl;->zza(Lcom/google/android/gms/analytics/internal/zzw;J)V

    return-void
.end method
