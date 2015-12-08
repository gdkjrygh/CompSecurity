.class Lcom/google/android/gms/internal/zzhm$zzc;
.super Lcom/google/android/gms/internal/zzhm$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzhm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "zzc"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzhm$zzb;-><init>()V

    return-void
.end method


# virtual methods
.method public zzf(Lcom/google/android/gms/internal/zzid;)Landroid/webkit/WebChromeClient;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzik;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzik;-><init>(Lcom/google/android/gms/internal/zzid;)V

    return-object v0
.end method
