.class Lcom/google/android/gms/internal/zzqh$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzqh;->zza(Ljava/lang/String;Ljava/lang/Integer;Lcom/google/android/gms/internal/zzqb;Lcom/google/android/gms/internal/zzqg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaPO:Ljava/lang/String;

.field final synthetic zzaPP:Ljava/lang/Integer;

.field final synthetic zzaPQ:Lcom/google/android/gms/internal/zzqb;

.field final synthetic zzaPR:Lcom/google/android/gms/internal/zzqg;

.field final synthetic zzaPS:Lcom/google/android/gms/internal/zzqh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzqh;Ljava/lang/String;Ljava/lang/Integer;Lcom/google/android/gms/internal/zzqb;Lcom/google/android/gms/internal/zzqg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPS:Lcom/google/android/gms/internal/zzqh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPO:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPP:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPQ:Lcom/google/android/gms/internal/zzqb;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPR:Lcom/google/android/gms/internal/zzqg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPS:Lcom/google/android/gms/internal/zzqh;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPO:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPP:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPQ:Lcom/google/android/gms/internal/zzqb;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzqh$1;->zzaPR:Lcom/google/android/gms/internal/zzqg;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzqh;->zzb(Ljava/lang/String;Ljava/lang/Integer;Lcom/google/android/gms/internal/zzqb;Lcom/google/android/gms/internal/zzqg;)V

    return-void
.end method
