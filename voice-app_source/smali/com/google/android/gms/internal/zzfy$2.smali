.class Lcom/google/android/gms/internal/zzfy$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzfy;->zzd(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzfy$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzBO:Lcom/google/android/gms/internal/zzfy;

.field final synthetic zzBP:Lcom/google/android/gms/internal/zzhs;

.field final synthetic zzBQ:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzfy;Lcom/google/android/gms/internal/zzhs;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfy$2;->zzBO:Lcom/google/android/gms/internal/zzfy;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfy$2;->zzBP:Lcom/google/android/gms/internal/zzhs;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzfy$2;->zzBQ:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfy$2;->zzBP:Lcom/google/android/gms/internal/zzhs;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfy$2;->zzBO:Lcom/google/android/gms/internal/zzfy;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfy;->zza(Lcom/google/android/gms/internal/zzfy;)Lcom/google/android/gms/ads/internal/zzm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/zzm;->zzbo()Lcom/google/android/gms/internal/zzkw;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfy$2;->zzBQ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzkw;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzhs;->zzf(Ljava/lang/Object;)V

    return-void
.end method
