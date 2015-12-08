.class public final enum Lcom/comscore/metrics/EventType;
.super Ljava/lang/Enum;


# static fields
.field public static final enum HIDDEN:Lcom/comscore/metrics/EventType;

.field public static final enum VIEW:Lcom/comscore/metrics/EventType;

.field private static final synthetic a:[Lcom/comscore/metrics/EventType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/comscore/metrics/EventType;

    const-string v1, "VIEW"

    invoke-direct {v0, v1, v2}, Lcom/comscore/metrics/EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/metrics/EventType;->VIEW:Lcom/comscore/metrics/EventType;

    new-instance v0, Lcom/comscore/metrics/EventType;

    const-string v1, "HIDDEN"

    invoke-direct {v0, v1, v3}, Lcom/comscore/metrics/EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/comscore/metrics/EventType;->HIDDEN:Lcom/comscore/metrics/EventType;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/comscore/metrics/EventType;

    sget-object v1, Lcom/comscore/metrics/EventType;->VIEW:Lcom/comscore/metrics/EventType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/comscore/metrics/EventType;->HIDDEN:Lcom/comscore/metrics/EventType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/comscore/metrics/EventType;->a:[Lcom/comscore/metrics/EventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/comscore/metrics/EventType;
    .locals 1

    const-class v0, Lcom/comscore/metrics/EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/comscore/metrics/EventType;

    return-object v0
.end method

.method public static values()[Lcom/comscore/metrics/EventType;
    .locals 1

    sget-object v0, Lcom/comscore/metrics/EventType;->a:[Lcom/comscore/metrics/EventType;

    invoke-virtual {v0}, [Lcom/comscore/metrics/EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/comscore/metrics/EventType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
