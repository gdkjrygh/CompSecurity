.class public final Lcom/google/android/gms/ads/search/SearchAdRequest;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/search/SearchAdRequest$1;,
        Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    }
.end annotation


# static fields
.field public static final BORDER_TYPE_DASHED:I = 0x1

.field public static final BORDER_TYPE_DOTTED:I = 0x2

.field public static final BORDER_TYPE_NONE:I = 0x0

.field public static final BORDER_TYPE_SOLID:I = 0x3

.field public static final CALL_BUTTON_COLOR_DARK:I = 0x2

.field public static final CALL_BUTTON_COLOR_LIGHT:I = 0x0

.field public static final CALL_BUTTON_COLOR_MEDIUM:I = 0x1

.field public static final DEVICE_ID_EMULATOR:Ljava/lang/String;

.field public static final ERROR_CODE_INTERNAL_ERROR:I = 0x0

.field public static final ERROR_CODE_INVALID_REQUEST:I = 0x1

.field public static final ERROR_CODE_NETWORK_ERROR:I = 0x2

.field public static final ERROR_CODE_NO_FILL:I = 0x3


# instance fields
.field private final zzHN:I

.field private final zzHO:I

.field private final zzHP:I

.field private final zzHQ:I

.field private final zzHR:I

.field private final zzHS:I

.field private final zzHT:I

.field private final zzHU:Ljava/lang/String;

.field private final zzHV:I

.field private final zzHW:Ljava/lang/String;

.field private final zzHX:I

.field private final zzHY:I

.field private final zzHZ:Ljava/lang/String;

.field private final zznK:Lcom/google/android/gms/ads/internal/client/zzx;

.field private final zzvc:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/client/zzx;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/ads/search/SearchAdRequest;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)V
    .locals 2
    .param p1, "builder"    # Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zza(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHN:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzb(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzvc:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzc(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHO:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzd(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHP:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zze(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHQ:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzf(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHR:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzg(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHS:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzh(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHT:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzi(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHU:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzj(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHV:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzk(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHW:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzl(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHX:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzm(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHY:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzn(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHZ:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzx;

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzo(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Lcom/google/android/gms/ads/internal/client/zzx$zza;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/ads/internal/client/zzx;-><init>(Lcom/google/android/gms/ads/internal/client/zzx$zza;Lcom/google/android/gms/ads/search/SearchAdRequest;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;Lcom/google/android/gms/ads/search/SearchAdRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/ads/search/SearchAdRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;-><init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)V

    return-void
.end method


# virtual methods
.method public getAnchorTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHN:I

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzvc:I

    return v0
.end method

.method public getBackgroundGradientBottom()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHO:I

    return v0
.end method

.method public getBackgroundGradientTop()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHP:I

    return v0
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHQ:I

    return v0
.end method

.method public getBorderThickness()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHR:I

    return v0
.end method

.method public getBorderType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHS:I

    return v0
.end method

.method public getCallButtonColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHT:I

    return v0
.end method

.method public getCustomChannels()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHU:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx;->getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptionTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHV:I

    return v0
.end method

.method public getFontFace()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHW:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaderTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHX:I

    return v0
.end method

.method public getHeaderTextSize()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHY:I

    return v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzx;->getLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p1, "networkExtrasClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx;->getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;

    move-result-object v0

    return-object v0
.end method

.method public getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zzHZ:Ljava/lang/String;

    return-object v0
.end method

.method public isTestDevice(Landroid/content/Context;)Z
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx;->isTestDevice(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method zzaF()Lcom/google/android/gms/ads/internal/client/zzx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->zznK:Lcom/google/android/gms/ads/internal/client/zzx;

    return-object v0
.end method
