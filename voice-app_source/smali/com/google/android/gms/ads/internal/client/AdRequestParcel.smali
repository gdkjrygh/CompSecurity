.class public final Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/ads/internal/client/zzf;


# instance fields
.field public final extras:Landroid/os/Bundle;

.field public final versionCode:I

.field public final zzrX:J

.field public final zzrY:I

.field public final zzrZ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzsa:Z

.field public final zzsb:I

.field public final zzsc:Z

.field public final zzsd:Ljava/lang/String;

.field public final zzse:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

.field public final zzsf:Landroid/location/Location;

.field public final zzsg:Ljava/lang/String;

.field public final zzsh:Landroid/os/Bundle;

.field public final zzsi:Landroid/os/Bundle;

.field public final zzsj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzsk:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->CREATOR:Lcom/google/android/gms/ads/internal/client/zzf;

    return-void
.end method

.method public constructor <init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .param p1, "versionCode"    # I
    .param p2, "birthday"    # J
    .param p4, "extras"    # Landroid/os/Bundle;
    .param p5, "gender"    # I
    .param p7, "isTestDevice"    # Z
    .param p8, "tagForChildDirectedTreatment"    # I
    .param p9, "manualImpressionsEnabled"    # Z
    .param p10, "publisherProvidedId"    # Ljava/lang/String;
    .param p11, "searchAdRequestParcel"    # Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;
    .param p12, "location"    # Landroid/location/Location;
    .param p13, "contentUrl"    # Ljava/lang/String;
    .param p14, "networkExtras"    # Landroid/os/Bundle;
    .param p15, "customTargeting"    # Landroid/os/Bundle;
    .param p17, "requestAgent"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;ZIZ",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;",
            "Landroid/location/Location;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p6, "keywords":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local p16, "categoryExclusions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->versionCode:I

    iput-wide p2, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzrX:J

    if-nez p4, :cond_0

    new-instance p4, Landroid/os/Bundle;

    .end local p4    # "extras":Landroid/os/Bundle;
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    iput p5, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzrY:I

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzrZ:Ljava/util/List;

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsa:Z

    iput p8, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsb:I

    iput-boolean p9, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsc:Z

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsd:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzse:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    iput-object p12, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsf:Landroid/location/Location;

    iput-object p13, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsg:Ljava/lang/String;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsh:Landroid/os/Bundle;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsi:Landroid/os/Bundle;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsj:Ljava/util/List;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsk:Ljava/lang/String;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzf;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Landroid/os/Parcel;I)V

    return-void
.end method
