.class Lcom/google/android/gms/analytics/AnalyticsService$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/analytics/AnalyticsService$1;->zzc(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/AnalyticsService$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/AnalyticsService$1$1;->zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsService$1$1;->zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/AnalyticsService$1;->zzIi:Lcom/google/android/gms/analytics/AnalyticsService;

    iget-object v1, p0, Lcom/google/android/gms/analytics/AnalyticsService$1$1;->zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;

    iget v1, v1, Lcom/google/android/gms/analytics/AnalyticsService$1;->zzIf:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/AnalyticsService;->stopSelfResult(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsService$1$1;->zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/AnalyticsService$1;->zzIg:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/zzf;->zzhR()Lcom/google/android/gms/analytics/internal/zzr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/zzr;->zziW()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsService$1$1;->zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/AnalyticsService$1;->zzIh:Lcom/google/android/gms/analytics/internal/zzaf;

    const-string v1, "Device AnalyticsService processed last dispatch request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/zzaf;->zzaT(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsService$1$1;->zzIj:Lcom/google/android/gms/analytics/AnalyticsService$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/AnalyticsService$1;->zzIh:Lcom/google/android/gms/analytics/internal/zzaf;

    const-string v1, "Local AnalyticsService processed last dispatch request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/zzaf;->zzaT(Ljava/lang/String;)V

    goto :goto_0
.end method
