.class public final enum Lcom/comscore/utils/TransmissionMode;
.super Ljava/lang/Enum;


# static fields
.field public static final enum DEFAULT:Lcom/comscore/utils/TransmissionMode;

.field public static final enum DISABLED:Lcom/comscore/utils/TransmissionMode;

.field public static final enum NEVER:Lcom/comscore/utils/TransmissionMode;

.field public static final enum PIGGYBACK:Lcom/comscore/utils/TransmissionMode;

.field public static final enum WIFIONLY:Lcom/comscore/utils/TransmissionMode;

.field private static final synthetic a:[Lcom/comscore/utils/TransmissionMode;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/comscore/utils/TransmissionMode;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v2}, Lcom/comscore/utils/TransmissionMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    new-instance v0, Lcom/comscore/utils/TransmissionMode;

    const-string v1, "NEVER"

    invoke-direct {v0, v1, v3}, Lcom/comscore/utils/TransmissionMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/utils/TransmissionMode;->NEVER:Lcom/comscore/utils/TransmissionMode;

    new-instance v0, Lcom/comscore/utils/TransmissionMode;

    const-string v1, "WIFIONLY"

    invoke-direct {v0, v1, v4}, Lcom/comscore/utils/TransmissionMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/utils/TransmissionMode;->WIFIONLY:Lcom/comscore/utils/TransmissionMode;

    new-instance v0, Lcom/comscore/utils/TransmissionMode;

    const-string v1, "PIGGYBACK"

    invoke-direct {v0, v1, v5}, Lcom/comscore/utils/TransmissionMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/utils/TransmissionMode;->PIGGYBACK:Lcom/comscore/utils/TransmissionMode;

    new-instance v0, Lcom/comscore/utils/TransmissionMode;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1, v6}, Lcom/comscore/utils/TransmissionMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/utils/TransmissionMode;->DISABLED:Lcom/comscore/utils/TransmissionMode;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/comscore/utils/TransmissionMode;

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->NEVER:Lcom/comscore/utils/TransmissionMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->WIFIONLY:Lcom/comscore/utils/TransmissionMode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->PIGGYBACK:Lcom/comscore/utils/TransmissionMode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->DISABLED:Lcom/comscore/utils/TransmissionMode;

    aput-object v1, v0, v6

    sput-object v0, Lcom/comscore/utils/TransmissionMode;->a:[Lcom/comscore/utils/TransmissionMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/comscore/utils/TransmissionMode;
    .locals 1

    const-class v0, Lcom/comscore/utils/TransmissionMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/comscore/utils/TransmissionMode;

    return-object v0
.end method

.method public static values()[Lcom/comscore/utils/TransmissionMode;
    .locals 1

    sget-object v0, Lcom/comscore/utils/TransmissionMode;->a:[Lcom/comscore/utils/TransmissionMode;

    invoke-virtual {v0}, [Lcom/comscore/utils/TransmissionMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/comscore/utils/TransmissionMode;

    return-object v0
.end method
