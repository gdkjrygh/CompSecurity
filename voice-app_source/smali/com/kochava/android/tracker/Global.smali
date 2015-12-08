.class public Lcom/kochava/android/tracker/Global;
.super Ljava/lang/Object;
.source "Global.java"


# static fields
.field protected static final CURRENCYLIST:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static DEBUG:Z = false

.field public static DEBUGERROR:Z = false

.field protected static final SDK_PROTOCOL:Ljava/lang/String; = "3"

.field public static final SDK_VERSION:Ljava/lang/String; = "Android20150511"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 7
    sput-boolean v2, Lcom/kochava/android/tracker/Global;->DEBUG:Z

    .line 8
    sput-boolean v2, Lcom/kochava/android/tracker/Global;->DEBUGERROR:Z

    .line 10
    const/16 v0, 0x15

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "USD"

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, "AUD"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "CAD"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "CHF"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "CNY"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "DKK"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "EUR"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "GBP"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "MXP"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "NOK"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "NZD"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "RUB"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "SEK"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "YEN"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "TRY"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "INR"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "IDR"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "ILS"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "SAR"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "ZAR"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "AED"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Global;->CURRENCYLIST:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
