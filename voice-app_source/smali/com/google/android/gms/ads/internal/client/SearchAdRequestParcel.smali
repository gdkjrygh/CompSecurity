.class public final Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/ads/internal/client/zzae;


# instance fields
.field public final backgroundColor:I

.field public final versionCode:I

.field public final zzth:I

.field public final zzti:I

.field public final zztj:I

.field public final zztk:I

.field public final zztl:I

.field public final zztm:I

.field public final zztn:I

.field public final zzto:Ljava/lang/String;

.field public final zztp:I

.field public final zztq:Ljava/lang/String;

.field public final zztr:I

.field public final zzts:I

.field public final zztt:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzae;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzae;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->CREATOR:Lcom/google/android/gms/ads/internal/client/zzae;

    return-void
.end method

.method constructor <init>(IIIIIIIIILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "anchorTextColor"    # I
    .param p3, "backgroundColor"    # I
    .param p4, "backgroundGradientBottom"    # I
    .param p5, "backgroundGradientTop"    # I
    .param p6, "borderColor"    # I
    .param p7, "borderThickness"    # I
    .param p8, "borderType"    # I
    .param p9, "callButtonColor"    # I
    .param p10, "channels"    # Ljava/lang/String;
    .param p11, "descriptionTextColor"    # I
    .param p12, "fontFace"    # Ljava/lang/String;
    .param p13, "headerTextColor"    # I
    .param p14, "headerTextSize"    # I
    .param p15, "query"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzth:I

    iput p3, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->backgroundColor:I

    iput p4, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzti:I

    iput p5, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztj:I

    iput p6, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztk:I

    iput p7, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztl:I

    iput p8, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztm:I

    iput p9, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztn:I

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzto:Ljava/lang/String;

    iput p11, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztp:I

    iput-object p12, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztq:Ljava/lang/String;

    iput p13, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztr:I

    iput p14, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzts:I

    iput-object p15, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztt:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/search/SearchAdRequest;)V
    .locals 1
    .param p1, "searchAdRequest"    # Lcom/google/android/gms/ads/search/SearchAdRequest;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->versionCode:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getAnchorTextColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzth:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBackgroundColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->backgroundColor:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBackgroundGradientBottom()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzti:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBackgroundGradientTop()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztj:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBorderColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztk:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBorderThickness()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztl:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBorderType()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztm:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getCallButtonColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztn:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getCustomChannels()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzto:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getDescriptionTextColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztp:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getFontFace()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztq:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getHeaderTextColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztr:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getHeaderTextSize()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzts:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getQuery()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztt:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzae;->zza(Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;Landroid/os/Parcel;I)V

    return-void
.end method
