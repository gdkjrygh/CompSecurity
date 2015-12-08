.class final Lcom/google/android/gms/internal/zzgf$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzgf;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzdt;Lcom/google/android/gms/internal/zzbr;Lcom/google/android/gms/internal/zzge;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic zzDA:Lcom/google/android/gms/internal/zzce;

.field final synthetic zzDB:Lcom/google/android/gms/internal/zzcd;

.field final synthetic zzDC:Ljava/lang/String;

.field final synthetic zzDF:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field final synthetic zzDG:Lcom/google/android/gms/internal/zzbr;

.field final synthetic zzDz:Lcom/google/android/gms/internal/zzgh;

.field final synthetic zzqV:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/internal/zzgh;Lcom/google/android/gms/internal/zzce;Lcom/google/android/gms/internal/zzcd;Ljava/lang/String;Lcom/google/android/gms/internal/zzbr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgf$2;->zzqV:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDF:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDz:Lcom/google/android/gms/internal/zzgh;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDA:Lcom/google/android/gms/internal/zzce;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDB:Lcom/google/android/gms/internal/zzcd;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDC:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDG:Lcom/google/android/gms/internal/zzbr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const/4 v7, 0x1

    const/4 v3, 0x0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbw()Lcom/google/android/gms/internal/zzif;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzgf$2;->zzqV:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v2}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>()V

    const/4 v5, 0x0

    iget-object v4, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDF:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v6, v4, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move v4, v3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzif;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/zzan;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/zzid;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzhc;->zzge()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/webkit/WebView;->clearCache(Z)V

    :cond_0
    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/zzid;->setWillNotDraw(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDz:Lcom/google/android/gms/internal/zzgh;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzgh;->zze(Lcom/google/android/gms/internal/zzid;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDA:Lcom/google/android/gms/internal/zzce;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDB:Lcom/google/android/gms/internal/zzcd;

    new-array v4, v7, [Ljava/lang/String;

    const-string v5, "rwc"

    aput-object v5, v4, v3

    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/internal/zzce;->zza(Lcom/google/android/gms/internal/zzcd;[Ljava/lang/String;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDA:Lcom/google/android/gms/internal/zzce;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzce;->zzdo()Lcom/google/android/gms/internal/zzcd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDC:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDA:Lcom/google/android/gms/internal/zzce;

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/zzgf;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzce;Lcom/google/android/gms/internal/zzcd;)Lcom/google/android/gms/internal/zzie$zza;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v2

    const-string v3, "/invalidRequest"

    iget-object v4, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDz:Lcom/google/android/gms/internal/zzgh;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzgh;->zzDO:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v3, "/loadAdURL"

    iget-object v4, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDz:Lcom/google/android/gms/internal/zzgh;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzgh;->zzDP:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v3, "/log"

    sget-object v4, Lcom/google/android/gms/internal/zzdf;->zzwc:Lcom/google/android/gms/internal/zzdg;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zzie;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/internal/zzie$zza;)V

    const-string v1, "Loading the JS library."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzay(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzgf$2;->zzDG:Lcom/google/android/gms/internal/zzbr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbr;->zzcW()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzid;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
