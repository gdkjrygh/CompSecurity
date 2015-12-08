.class public final Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/search/SearchAdRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private zzHN:I

.field private zzHO:I

.field private zzHP:I

.field private zzHQ:I

.field private zzHR:I

.field private zzHS:I

.field private zzHT:I

.field private zzHU:Ljava/lang/String;

.field private zzHV:I

.field private zzHW:Ljava/lang/String;

.field private zzHX:I

.field private zzHY:I

.field private zzHZ:Ljava/lang/String;

.field private final zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

.field private zzvc:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzx$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHS:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHN:I

    return v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzvc:I

    return v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHO:I

    return v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHP:I

    return v0
.end method

.method static synthetic zze(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHQ:I

    return v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHR:I

    return v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHS:I

    return v0
.end method

.method static synthetic zzh(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHT:I

    return v0
.end method

.method static synthetic zzi(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHU:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzj(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHV:I

    return v0
.end method

.method static synthetic zzk(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHW:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzl(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHX:I

    return v0
.end method

.method static synthetic zzm(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHY:I

    return v0
.end method

.method static synthetic zzn(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHZ:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzo(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Lcom/google/android/gms/ads/internal/client/zzx$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    return-object v0
.end method


# virtual methods
.method public addCustomEventExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p2, "customEventExtras"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zzb(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public addNetworkExtras(Lcom/google/android/gms/ads/mediation/NetworkExtras;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "networkExtras"    # Lcom/google/android/gms/ads/mediation/NetworkExtras;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zza(Lcom/google/android/gms/ads/mediation/NetworkExtras;)V

    return-object p0
.end method

.method public addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p2, "networkExtras"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/MediationAdapter;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zza(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "deviceId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zzF(Ljava/lang/String;)V

    return-object p0
.end method

.method public build()Lcom/google/android/gms/ads/search/SearchAdRequest;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/search/SearchAdRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/search/SearchAdRequest;-><init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;Lcom/google/android/gms/ads/search/SearchAdRequest$1;)V

    return-object v0
.end method

.method public setAnchorTextColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "anchorTextColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHN:I

    return-object p0
.end method

.method public setBackgroundColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 2
    .param p1, "backgroundColor"    # I

    .prologue
    const/4 v1, 0x0

    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzvc:I

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHO:I

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHP:I

    return-object p0
.end method

.method public setBackgroundGradient(II)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "top"    # I
    .param p2, "bottom"    # I

    .prologue
    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzvc:I

    iput p2, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHO:I

    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHP:I

    return-object p0
.end method

.method public setBorderColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "borderColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHQ:I

    return-object p0
.end method

.method public setBorderThickness(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "borderThickness"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHR:I

    return-object p0
.end method

.method public setBorderType(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "borderType"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHS:I

    return-object p0
.end method

.method public setCallButtonColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "callButtonColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHT:I

    return-object p0
.end method

.method public setCustomChannels(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "channelIds"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHU:Ljava/lang/String;

    return-object p0
.end method

.method public setDescriptionTextColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "descriptionTextColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHV:I

    return-object p0
.end method

.method public setFontFace(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "fontFace"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHW:Ljava/lang/String;

    return-object p0
.end method

.method public setHeaderTextColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "headerTextColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHX:I

    return-object p0
.end method

.method public setHeaderTextSize(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "headerTextSize"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHY:I

    return-object p0
.end method

.method public setLocation(Landroid/location/Location;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zza(Landroid/location/Location;)V

    return-object p0
.end method

.method public setQuery(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "query"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zzHZ:Ljava/lang/String;

    return-object p0
.end method

.method public setRequestAgent(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "requestAgent"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zzJ(Ljava/lang/String;)V

    return-object p0
.end method

.method public tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "tagForChildDirectedTreatment"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->zznL:Lcom/google/android/gms/ads/internal/client/zzx$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zzk(Z)V

    return-object p0
.end method
