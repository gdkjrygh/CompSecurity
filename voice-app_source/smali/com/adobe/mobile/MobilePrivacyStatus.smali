.class public final enum Lcom/adobe/mobile/MobilePrivacyStatus;
.super Ljava/lang/Enum;
.source "MobilePrivacyStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/adobe/mobile/MobilePrivacyStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/adobe/mobile/MobilePrivacyStatus;

.field public static final enum MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

.field public static final enum MOBILE_PRIVACY_STATUS_OPT_OUT:Lcom/adobe/mobile/MobilePrivacyStatus;

.field public static final enum MOBILE_PRIVACY_STATUS_UNKNOWN:Lcom/adobe/mobile/MobilePrivacyStatus;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 22
    new-instance v0, Lcom/adobe/mobile/MobilePrivacyStatus;

    const-string v1, "MOBILE_PRIVACY_STATUS_OPT_IN"

    invoke-direct {v0, v1, v2, v2}, Lcom/adobe/mobile/MobilePrivacyStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 23
    new-instance v0, Lcom/adobe/mobile/MobilePrivacyStatus;

    const-string v1, "MOBILE_PRIVACY_STATUS_OPT_OUT"

    invoke-direct {v0, v1, v3, v3}, Lcom/adobe/mobile/MobilePrivacyStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_OUT:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 24
    new-instance v0, Lcom/adobe/mobile/MobilePrivacyStatus;

    const-string v1, "MOBILE_PRIVACY_STATUS_UNKNOWN"

    invoke-direct {v0, v1, v4, v4}, Lcom/adobe/mobile/MobilePrivacyStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_UNKNOWN:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 21
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/adobe/mobile/MobilePrivacyStatus;

    sget-object v1, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_OUT:Lcom/adobe/mobile/MobilePrivacyStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_UNKNOWN:Lcom/adobe/mobile/MobilePrivacyStatus;

    aput-object v1, v0, v4

    sput-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->$VALUES:[Lcom/adobe/mobile/MobilePrivacyStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p3, "value"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 28
    iput p3, p0, Lcom/adobe/mobile/MobilePrivacyStatus;->value:I

    .line 29
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/adobe/mobile/MobilePrivacyStatus;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 21
    const-class v0, Lcom/adobe/mobile/MobilePrivacyStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/adobe/mobile/MobilePrivacyStatus;

    return-object v0
.end method

.method public static values()[Lcom/adobe/mobile/MobilePrivacyStatus;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->$VALUES:[Lcom/adobe/mobile/MobilePrivacyStatus;

    invoke-virtual {v0}, [Lcom/adobe/mobile/MobilePrivacyStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/adobe/mobile/MobilePrivacyStatus;

    return-object v0
.end method


# virtual methods
.method protected getValue()I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/adobe/mobile/MobilePrivacyStatus;->value:I

    return v0
.end method
