.class Lcom/google/android/gms/internal/zzbd$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzbd;->zza(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzrb:Ljava/lang/String;

.field final synthetic zzrd:Lcom/google/android/gms/internal/zzbd;

.field final synthetic zzre:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzbd;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzbd$2;->zzrd:Lcom/google/android/gms/internal/zzbd;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzbd$2;->zzrb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzbd$2;->zzre:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbd$2;->zzrd:Lcom/google/android/gms/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzbd;->zza(Lcom/google/android/gms/internal/zzbd;)Lcom/google/android/gms/internal/zzid;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbd$2;->zzrb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzbd$2;->zzre:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzid;->zza(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
