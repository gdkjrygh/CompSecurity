.class public final enum Lcom/urbanairship/actions/Situation;
.super Ljava/lang/Enum;
.source "Situation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/urbanairship/actions/Situation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/urbanairship/actions/Situation;

.field public static final enum MANUAL_INVOCATION:Lcom/urbanairship/actions/Situation;

.field public static final enum PUSH_OPENED:Lcom/urbanairship/actions/Situation;

.field public static final enum PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

.field public static final enum WEB_VIEW_INVOCATION:Lcom/urbanairship/actions/Situation;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 35
    new-instance v0, Lcom/urbanairship/actions/Situation;

    const-string v1, "MANUAL_INVOCATION"

    invoke-direct {v0, v1, v2}, Lcom/urbanairship/actions/Situation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/Situation;->MANUAL_INVOCATION:Lcom/urbanairship/actions/Situation;

    .line 40
    new-instance v0, Lcom/urbanairship/actions/Situation;

    const-string v1, "PUSH_RECEIVED"

    invoke-direct {v0, v1, v3}, Lcom/urbanairship/actions/Situation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/Situation;->PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

    .line 45
    new-instance v0, Lcom/urbanairship/actions/Situation;

    const-string v1, "PUSH_OPENED"

    invoke-direct {v0, v1, v4}, Lcom/urbanairship/actions/Situation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/Situation;->PUSH_OPENED:Lcom/urbanairship/actions/Situation;

    .line 50
    new-instance v0, Lcom/urbanairship/actions/Situation;

    const-string v1, "WEB_VIEW_INVOCATION"

    invoke-direct {v0, v1, v5}, Lcom/urbanairship/actions/Situation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/Situation;->WEB_VIEW_INVOCATION:Lcom/urbanairship/actions/Situation;

    .line 31
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/urbanairship/actions/Situation;

    sget-object v1, Lcom/urbanairship/actions/Situation;->MANUAL_INVOCATION:Lcom/urbanairship/actions/Situation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/urbanairship/actions/Situation;->PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

    aput-object v1, v0, v3

    sget-object v1, Lcom/urbanairship/actions/Situation;->PUSH_OPENED:Lcom/urbanairship/actions/Situation;

    aput-object v1, v0, v4

    sget-object v1, Lcom/urbanairship/actions/Situation;->WEB_VIEW_INVOCATION:Lcom/urbanairship/actions/Situation;

    aput-object v1, v0, v5

    sput-object v0, Lcom/urbanairship/actions/Situation;->$VALUES:[Lcom/urbanairship/actions/Situation;

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
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/urbanairship/actions/Situation;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 31
    const-class v0, Lcom/urbanairship/actions/Situation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/actions/Situation;

    return-object v0
.end method

.method public static values()[Lcom/urbanairship/actions/Situation;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/urbanairship/actions/Situation;->$VALUES:[Lcom/urbanairship/actions/Situation;

    invoke-virtual {v0}, [Lcom/urbanairship/actions/Situation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/urbanairship/actions/Situation;

    return-object v0
.end method
