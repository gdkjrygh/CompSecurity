.class Lcom/google/android/gms/internal/zzbc$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzbc;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzqV:Landroid/content/Context;

.field final synthetic zzqW:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field final synthetic zzqX:Lcom/google/android/gms/internal/zzhs;

.field final synthetic zzqY:Ljava/lang/String;

.field final synthetic zzqZ:Lcom/google/android/gms/internal/zzbc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzbc;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzhs;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqZ:Lcom/google/android/gms/internal/zzbc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqV:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqW:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqX:Lcom/google/android/gms/internal/zzhs;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqY:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqZ:Lcom/google/android/gms/internal/zzbc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqV:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqW:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqX:Lcom/google/android/gms/internal/zzhs;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzbc;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzhs;)Lcom/google/android/gms/internal/zzbb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbc$1;->zzqY:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzs(Ljava/lang/String;)V

    return-void
.end method
