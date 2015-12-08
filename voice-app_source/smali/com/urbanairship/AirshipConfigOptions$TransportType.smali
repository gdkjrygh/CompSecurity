.class public final enum Lcom/urbanairship/AirshipConfigOptions$TransportType;
.super Ljava/lang/Enum;
.source "AirshipConfigOptions.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/AirshipConfigOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TransportType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/urbanairship/AirshipConfigOptions$TransportType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/urbanairship/AirshipConfigOptions$TransportType;

.field public static final enum GCM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

.field public static final enum HELIUM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

.field public static final enum HYBRID:Lcom/urbanairship/AirshipConfigOptions$TransportType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 50
    new-instance v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;

    const-string v1, "HELIUM"

    invoke-direct {v0, v1, v2}, Lcom/urbanairship/AirshipConfigOptions$TransportType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HELIUM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    .line 54
    new-instance v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;

    const-string v1, "GCM"

    invoke-direct {v0, v1, v3}, Lcom/urbanairship/AirshipConfigOptions$TransportType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->GCM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    .line 59
    new-instance v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;

    const-string v1, "HYBRID"

    invoke-direct {v0, v1, v4}, Lcom/urbanairship/AirshipConfigOptions$TransportType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HYBRID:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    .line 46
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/urbanairship/AirshipConfigOptions$TransportType;

    sget-object v1, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HELIUM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/urbanairship/AirshipConfigOptions$TransportType;->GCM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HYBRID:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->$VALUES:[Lcom/urbanairship/AirshipConfigOptions$TransportType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/urbanairship/AirshipConfigOptions$TransportType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 46
    const-class v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;

    return-object v0
.end method

.method public static values()[Lcom/urbanairship/AirshipConfigOptions$TransportType;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->$VALUES:[Lcom/urbanairship/AirshipConfigOptions$TransportType;

    invoke-virtual {v0}, [Lcom/urbanairship/AirshipConfigOptions$TransportType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/urbanairship/AirshipConfigOptions$TransportType;

    return-object v0
.end method
