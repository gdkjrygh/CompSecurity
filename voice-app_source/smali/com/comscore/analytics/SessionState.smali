.class public final enum Lcom/comscore/analytics/SessionState;
.super Ljava/lang/Enum;


# static fields
.field public static final enum ACTIVE_USER:Lcom/comscore/analytics/SessionState;

.field public static final enum APPLICATION:Lcom/comscore/analytics/SessionState;

.field public static final enum INACTIVE:Lcom/comscore/analytics/SessionState;

.field public static final enum USER:Lcom/comscore/analytics/SessionState;

.field private static final synthetic a:[Lcom/comscore/analytics/SessionState;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/comscore/analytics/SessionState;

    const-string v1, "INACTIVE"

    invoke-direct {v0, v1, v2}, Lcom/comscore/analytics/SessionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/SessionState;->INACTIVE:Lcom/comscore/analytics/SessionState;

    new-instance v0, Lcom/comscore/analytics/SessionState;

    const-string v1, "APPLICATION"

    invoke-direct {v0, v1, v3}, Lcom/comscore/analytics/SessionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/SessionState;->APPLICATION:Lcom/comscore/analytics/SessionState;

    new-instance v0, Lcom/comscore/analytics/SessionState;

    const-string v1, "USER"

    invoke-direct {v0, v1, v4}, Lcom/comscore/analytics/SessionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/SessionState;->USER:Lcom/comscore/analytics/SessionState;

    new-instance v0, Lcom/comscore/analytics/SessionState;

    const-string v1, "ACTIVE_USER"

    invoke-direct {v0, v1, v5}, Lcom/comscore/analytics/SessionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/analytics/SessionState;->ACTIVE_USER:Lcom/comscore/analytics/SessionState;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/comscore/analytics/SessionState;

    sget-object v1, Lcom/comscore/analytics/SessionState;->INACTIVE:Lcom/comscore/analytics/SessionState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/comscore/analytics/SessionState;->APPLICATION:Lcom/comscore/analytics/SessionState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/comscore/analytics/SessionState;->USER:Lcom/comscore/analytics/SessionState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/comscore/analytics/SessionState;->ACTIVE_USER:Lcom/comscore/analytics/SessionState;

    aput-object v1, v0, v5

    sput-object v0, Lcom/comscore/analytics/SessionState;->a:[Lcom/comscore/analytics/SessionState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/comscore/analytics/SessionState;
    .locals 1

    const-class v0, Lcom/comscore/analytics/SessionState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/comscore/analytics/SessionState;

    return-object v0
.end method

.method public static values()[Lcom/comscore/analytics/SessionState;
    .locals 1

    sget-object v0, Lcom/comscore/analytics/SessionState;->a:[Lcom/comscore/analytics/SessionState;

    invoke-virtual {v0}, [Lcom/comscore/analytics/SessionState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/comscore/analytics/SessionState;

    return-object v0
.end method
