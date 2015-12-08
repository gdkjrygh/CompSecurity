.class public final Lcom/google/android/gms/maps/model/TileOverlayOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/zzn;


# instance fields
.field private final zzCY:I

.field private zzaDG:Lcom/google/android/gms/maps/model/internal/zzl;

.field private zzaDH:Lcom/google/android/gms/maps/model/TileProvider;

.field private zzaDI:Z

.field private zzaDa:F

.field private zzaDb:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/zzn;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/zzn;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->CREATOR:Lcom/google/android/gms/maps/model/zzn;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDb:Z

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDI:Z

    iput v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzCY:I

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;ZFZ)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "delegate"    # Landroid/os/IBinder;
    .param p3, "visible"    # Z
    .param p4, "zIndex"    # F
    .param p5, "fadeIn"    # Z

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDb:Z

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDI:Z

    iput p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzCY:I

    invoke-static {p2}, Lcom/google/android/gms/maps/model/internal/zzl$zza;->zzcT(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/internal/zzl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDG:Lcom/google/android/gms/maps/model/internal/zzl;

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDG:Lcom/google/android/gms/maps/model/internal/zzl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDH:Lcom/google/android/gms/maps/model/TileProvider;

    iput-boolean p3, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDb:Z

    iput p4, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDa:F

    iput-boolean p5, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDI:Z

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/TileOverlayOptions$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/TileOverlayOptions$1;-><init>(Lcom/google/android/gms/maps/model/TileOverlayOptions;)V

    goto :goto_0
.end method

.method static synthetic zza(Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/internal/zzl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDG:Lcom/google/android/gms/maps/model/internal/zzl;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public fadeIn(Z)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 0
    .param p1, "fadeIn"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDI:Z

    return-object p0
.end method

.method public getFadeIn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDI:Z

    return v0
.end method

.method public getTileProvider()Lcom/google/android/gms/maps/model/TileProvider;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDH:Lcom/google/android/gms/maps/model/TileProvider;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzCY:I

    return v0
.end method

.method public getZIndex()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDa:F

    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDb:Z

    return v0
.end method

.method public tileProvider(Lcom/google/android/gms/maps/model/TileProvider;)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 1
    .param p1, "tileProvider"    # Lcom/google/android/gms/maps/model/TileProvider;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDH:Lcom/google/android/gms/maps/model/TileProvider;

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDH:Lcom/google/android/gms/maps/model/TileProvider;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDG:Lcom/google/android/gms/maps/model/internal/zzl;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;-><init>(Lcom/google/android/gms/maps/model/TileOverlayOptions;Lcom/google/android/gms/maps/model/TileProvider;)V

    goto :goto_0
.end method

.method public visible(Z)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 0
    .param p1, "visible"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDb:Z

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/zzn;->zza(Lcom/google/android/gms/maps/model/TileOverlayOptions;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zIndex(F)Lcom/google/android/gms/maps/model/TileOverlayOptions;
    .locals 0
    .param p1, "zIndex"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDa:F

    return-object p0
.end method

.method zzvL()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions;->zzaDG:Lcom/google/android/gms/maps/model/internal/zzl;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/zzl;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method
