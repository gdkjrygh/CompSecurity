.class Lcom/google/android/gms/internal/zzqh$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzqh;->zze(Ljava/lang/String;[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzOn:[B

.field final synthetic zzaPO:Ljava/lang/String;

.field final synthetic zzaPS:Lcom/google/android/gms/internal/zzqh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzqh;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqh$2;->zzaPS:Lcom/google/android/gms/internal/zzqh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzqh$2;->zzaPO:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzqh$2;->zzOn:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqh$2;->zzaPS:Lcom/google/android/gms/internal/zzqh;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzqh$2;->zzaPO:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzqh$2;->zzOn:[B

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzqh;->zzf(Ljava/lang/String;[B)V

    return-void
.end method
