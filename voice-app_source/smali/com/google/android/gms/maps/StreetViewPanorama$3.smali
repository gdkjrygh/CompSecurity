.class Lcom/google/android/gms/maps/StreetViewPanorama$3;
.super Lcom/google/android/gms/maps/internal/zzt$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/StreetViewPanorama;->setOnStreetViewPanoramaClickListener(Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaCl:Lcom/google/android/gms/maps/StreetViewPanorama;

.field final synthetic zzaCn:Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanorama$3;->zzaCl:Lcom/google/android/gms/maps/StreetViewPanorama;

    iput-object p2, p0, Lcom/google/android/gms/maps/StreetViewPanorama$3;->zzaCn:Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzt$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public onStreetViewPanoramaClick(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V
    .locals 1
    .param p1, "orientation"    # Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama$3;->zzaCn:Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;->onStreetViewPanoramaClick(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V

    return-void
.end method
