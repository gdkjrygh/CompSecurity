.class public final Lcom/google/android/gms/location/places/internal/PlaceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/location/places/Place;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/internal/PlaceImpl$zza;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/location/places/internal/zzk;


# instance fields
.field private final mName:Ljava/lang/String;

.field final zzCY:I

.field private final zzKI:Ljava/lang/String;

.field private final zzaAA:J

.field private final zzaAB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final zzaAC:Ljava/lang/String;

.field private final zzaAD:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final zzaAE:Z

.field private final zzaAF:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final zzaAG:Ljava/util/TimeZone;

.field private zzaAH:Lcom/google/android/gms/location/places/internal/zzo;

.field private zzaAm:Ljava/util/Locale;

.field private final zzaAs:Landroid/os/Bundle;

.field private final zzaAt:Lcom/google/android/gms/location/places/internal/PlaceLocalization;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private final zzaAu:F

.field private final zzaAv:Lcom/google/android/gms/maps/model/LatLngBounds;

.field private final zzaAw:Ljava/lang/String;

.field private final zzaAx:Z

.field private final zzaAy:F

.field private final zzaAz:I

.field private final zzajO:Ljava/lang/String;

.field private final zzazn:Lcom/google/android/gms/maps/model/LatLng;

.field private final zzazo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final zzazp:Ljava/lang/String;

.field private final zzazq:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/internal/zzk;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/internal/zzk;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->CREATOR:Lcom/google/android/gms/location/places/internal/zzk;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/maps/model/LatLng;FLcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;Landroid/net/Uri;ZFIJZLcom/google/android/gms/location/places/internal/PlaceLocalization;)V
    .locals 3
    .param p1, "versionCode"    # I
    .param p2, "id"    # Ljava/lang/String;
    .param p5, "addressComponents"    # Landroid/os/Bundle;
    .param p6, "name"    # Ljava/lang/String;
    .param p7, "address"    # Ljava/lang/String;
    .param p8, "phoneNumber"    # Ljava/lang/String;
    .param p9, "regularOpenHours"    # Ljava/lang/String;
    .param p11, "latlng"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p12, "levelNumber"    # F
    .param p13, "viewport"    # Lcom/google/android/gms/maps/model/LatLngBounds;
    .param p14, "timeZoneId"    # Ljava/lang/String;
    .param p15, "websiteUri"    # Landroid/net/Uri;
    .param p16, "isPermanentlyClosed"    # Z
    .param p17, "rating"    # F
    .param p18, "priceLevel"    # I
    .param p19, "timestampSecs"    # J
    .param p21, "isLoggingEnabled"    # Z
    .param p22, "localization"    # Lcom/google/android/gms/location/places/internal/PlaceLocalization;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "F",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "ZFIJZ",
            "Lcom/google/android/gms/location/places/internal/PlaceLocalization;",
            ")V"
        }
    .end annotation

    .prologue
    .local p3, "placeTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    .local p4, "typesDeprecated":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    .local p10, "attributions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazo:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAB:Ljava/util/List;

    if-eqz p5, :cond_0

    .end local p5    # "addressComponents":Landroid/os/Bundle;
    :goto_0
    iput-object p5, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAs:Landroid/os/Bundle;

    iput-object p6, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->mName:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzajO:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazp:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAC:Ljava/lang/String;

    if-eqz p10, :cond_1

    .end local p10    # "attributions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :goto_1
    iput-object p10, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAD:Ljava/util/List;

    iput-object p11, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazn:Lcom/google/android/gms/maps/model/LatLng;

    iput p12, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAu:F

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAv:Lcom/google/android/gms/maps/model/LatLngBounds;

    if-eqz p14, :cond_2

    .end local p14    # "timeZoneId":Ljava/lang/String;
    :goto_2
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAw:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazq:Landroid/net/Uri;

    move/from16 v0, p16

    iput-boolean v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAx:Z

    move/from16 v0, p17

    iput v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAy:F

    move/from16 v0, p18

    iput v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAz:I

    move-wide/from16 v0, p19

    iput-wide v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAA:J

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAF:Ljava/util/Map;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAG:Ljava/util/TimeZone;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    move/from16 v0, p21

    iput-boolean v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAE:Z

    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAt:Lcom/google/android/gms/location/places/internal/PlaceLocalization;

    return-void

    .restart local p5    # "addressComponents":Landroid/os/Bundle;
    .restart local p10    # "attributions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local p14    # "timeZoneId":Ljava/lang/String;
    :cond_0
    new-instance p5, Landroid/os/Bundle;

    .end local p5    # "addressComponents":Landroid/os/Bundle;
    invoke-direct {p5}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p10

    goto :goto_1

    .end local p10    # "attributions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_2
    const-string p14, "UTC"

    goto :goto_2
.end method

.method private zzdp(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAE:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAH:Lcom/google/android/gms/location/places/internal/zzo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAH:Lcom/google/android/gms/location/places/internal/zzo;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/zzo;->zzA(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->CREATOR:Lcom/google/android/gms/location/places/internal/zzk;

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "object"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    .end local p1    # "object":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "object":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/location/places/internal/PlaceImpl;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/places/internal/PlaceImpl;

    .end local p1    # "object":Ljava/lang/Object;
    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    iget-object v3, p1, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAA:J

    iget-wide v4, p1, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAA:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzuW()Lcom/google/android/gms/location/places/Place;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getAddress()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    const-string v0, "getAddress"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzajO:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "getId"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    return-object v0
.end method

.method public getLatLng()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "getLatLng"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazn:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    const-string v0, "getLocale"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    return-object v0
.end method

.method public bridge synthetic getName()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "getName"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic getPhoneNumber()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    const-string v0, "getPhoneNumber"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazp:Ljava/lang/String;

    return-object v0
.end method

.method public getPlaceTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "getPlaceTypes"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazo:Ljava/util/List;

    return-object v0
.end method

.method public getPriceLevel()I
    .locals 1

    const-string v0, "getPriceLevel"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAz:I

    return v0
.end method

.method public getRating()F
    .locals 1

    const-string v0, "getRating"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAy:F

    return v0
.end method

.method public getViewport()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 1

    const-string v0, "getViewport"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAv:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object v0
.end method

.method public getWebsiteUri()Landroid/net/Uri;
    .locals 1

    const-string v0, "getWebsiteUri"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazq:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAA:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 0
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzt;->zzt(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "id"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzKI:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "placeTypes"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazo:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "locale"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAm:Ljava/util/Locale;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "address"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzajO:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "phoneNumber"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazp:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "latlng"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazn:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "viewport"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAv:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "websiteUri"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzazq:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "isPermanentlyClosed"

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAx:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "priceLevel"

    iget v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAz:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    const-string v1, "timestampSecs"

    iget-wide v2, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAA:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzt$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzt$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zzt$zza;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->CREATOR:Lcom/google/android/gms/location/places/internal/zzk;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/zzk;->zza(Lcom/google/android/gms/location/places/internal/PlaceImpl;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/location/places/internal/zzo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAH:Lcom/google/android/gms/location/places/internal/zzo;

    return-void
.end method

.method public zzuN()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "getTypesDeprecated"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAB:Ljava/util/List;

    return-object v0
.end method

.method public zzuO()F
    .locals 1

    const-string v0, "getLevelNumber"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAu:F

    return v0
.end method

.method public zzuP()Ljava/lang/String;
    .locals 1

    const-string v0, "getRegularOpenHours"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAC:Ljava/lang/String;

    return-object v0
.end method

.method public zzuQ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "getAttributions"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAD:Ljava/util/List;

    return-object v0
.end method

.method public zzuR()Z
    .locals 1

    const-string v0, "isPermanentlyClosed"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAx:Z

    return v0
.end method

.method public zzuS()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAA:J

    return-wide v0
.end method

.method public zzuT()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAs:Landroid/os/Bundle;

    return-object v0
.end method

.method public zzuU()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAw:Ljava/lang/String;

    return-object v0
.end method

.method public zzuV()Lcom/google/android/gms/location/places/internal/PlaceLocalization;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "getLocalization"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzdp(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceImpl;->zzaAt:Lcom/google/android/gms/location/places/internal/PlaceLocalization;

    return-object v0
.end method

.method public zzuW()Lcom/google/android/gms/location/places/Place;
    .locals 0

    return-object p0
.end method
