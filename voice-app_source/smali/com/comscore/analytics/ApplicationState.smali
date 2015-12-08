.class public final enum Lcom/comscore/analytics/ApplicationState;
.super Ljava/lang/Enum;


# static fields
.field public static final enum BACKGROUND_UX_ACTIVE:Lcom/comscore/analytics/ApplicationState;

.field public static final enum FOREGROUND:Lcom/comscore/analytics/ApplicationState;

.field public static final enum INACTIVE:Lcom/comscore/analytics/ApplicationState;

.field private static final synthetic a:[Lcom/comscore/analytics/ApplicationState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/comscore/analytics/ApplicationState;

    const-string v1, "INACTIVE"

    invoke-direct {v0, v1, v2}, Lcom/comscore/analytics/ApplicationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/ApplicationState;->INACTIVE:Lcom/comscore/analytics/ApplicationState;

    new-instance v0, Lcom/comscore/analytics/ApplicationState;

    const-string v1, "BACKGROUND_UX_ACTIVE"

    invoke-direct {v0, v1, v3}, Lcom/comscore/analytics/ApplicationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/ApplicationState;->BACKGROUND_UX_ACTIVE:Lcom/comscore/analytics/ApplicationState;

    new-instance v0, Lcom/comscore/analytics/ApplicationState;

    const-string v1, "FOREGROUND"

    invoke-direct {v0, v1, v4}, Lcom/comscore/analytics/ApplicationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/ApplicationState;->FOREGROUND:Lcom/comscore/analytics/ApplicationState;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/comscore/analytics/ApplicationState;

    sget-object v1, Lcom/comscore/analytics/ApplicationState;->INACTIVE:Lcom/comscore/analytics/ApplicationState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/comscore/analytics/ApplicationState;->BACKGROUND_UX_ACTIVE:Lcom/comscore/analytics/ApplicationState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/comscore/analytics/ApplicationState;->FOREGROUND:Lcom/comscore/analytics/ApplicationState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/comscore/analytics/ApplicationState;->a:[Lcom/comscore/analytics/ApplicationState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/comscore/analytics/ApplicationState;
    .locals 1

    const-class v0, Lcom/comscore/analytics/ApplicationState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/comscore/analytics/ApplicationState;

    return-object v0
.end method

.method public static values()[Lcom/comscore/analytics/ApplicationState;
    .locals 1

    sget-object v0, Lcom/comscore/analytics/ApplicationState;->a:[Lcom/comscore/analytics/ApplicationState;

    invoke-virtual {v0}, [Lcom/comscore/analytics/ApplicationState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/comscore/analytics/ApplicationState;

    return-object v0
.end method
