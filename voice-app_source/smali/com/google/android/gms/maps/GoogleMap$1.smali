.class Lcom/google/android/gms/maps/GoogleMap$1;
.super Lcom/google/android/gms/maps/internal/zzg$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/GoogleMap;->setOnIndoorStateChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaBr:Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;

.field final synthetic zzaBs:Lcom/google/android/gms/maps/GoogleMap;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMap$1;->zzaBs:Lcom/google/android/gms/maps/GoogleMap;

    iput-object p2, p0, Lcom/google/android/gms/maps/GoogleMap$1;->zzaBr:Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzg$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public onIndoorBuildingFocused()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$1;->zzaBr:Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;

    invoke-interface {v0}, Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;->onIndoorBuildingFocused()V

    return-void
.end method

.method public zza(Lcom/google/android/gms/maps/model/internal/zzg;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$1;->zzaBr:Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;

    new-instance v1, Lcom/google/android/gms/maps/model/IndoorBuilding;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/IndoorBuilding;-><init>(Lcom/google/android/gms/maps/model/internal/zzg;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;->onIndoorLevelActivated(Lcom/google/android/gms/maps/model/IndoorBuilding;)V

    return-void
.end method
