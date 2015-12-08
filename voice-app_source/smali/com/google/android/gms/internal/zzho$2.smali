.class Lcom/google/android/gms/internal/zzho$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzm$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzho;->zzb(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/internal/zzhv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzGw:Lcom/google/android/gms/internal/zzho$zzc;

.field final synthetic zzGx:Lcom/google/android/gms/internal/zzho;

.field final synthetic zzwJ:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzho;Ljava/lang/String;Lcom/google/android/gms/internal/zzho$zzc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzho$2;->zzGx:Lcom/google/android/gms/internal/zzho;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzho$2;->zzwJ:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzho$2;->zzGw:Lcom/google/android/gms/internal/zzho$zzc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zze(Lcom/google/android/gms/internal/zzr;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to load URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzho$2;->zzwJ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzr;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzho$2;->zzGw:Lcom/google/android/gms/internal/zzho$zzc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzho$zzc;->zzb(Ljava/lang/Object;)V

    return-void
.end method
