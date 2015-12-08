.class public final enum Lcom/urbanairship/actions/ActionResult$Status;
.super Ljava/lang/Enum;
.source "ActionResult.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/actions/ActionResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/urbanairship/actions/ActionResult$Status;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/urbanairship/actions/ActionResult$Status;

.field public static final enum ACTION_NOT_FOUND:Lcom/urbanairship/actions/ActionResult$Status;

.field public static final enum COMPLETED:Lcom/urbanairship/actions/ActionResult$Status;

.field public static final enum EXECUTION_ERROR:Lcom/urbanairship/actions/ActionResult$Status;

.field public static final enum REJECTED_ARGUMENTS:Lcom/urbanairship/actions/ActionResult$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 40
    new-instance v0, Lcom/urbanairship/actions/ActionResult$Status;

    const-string v1, "COMPLETED"

    invoke-direct {v0, v1, v2}, Lcom/urbanairship/actions/ActionResult$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/ActionResult$Status;->COMPLETED:Lcom/urbanairship/actions/ActionResult$Status;

    .line 46
    new-instance v0, Lcom/urbanairship/actions/ActionResult$Status;

    const-string v1, "REJECTED_ARGUMENTS"

    invoke-direct {v0, v1, v3}, Lcom/urbanairship/actions/ActionResult$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/ActionResult$Status;->REJECTED_ARGUMENTS:Lcom/urbanairship/actions/ActionResult$Status;

    .line 54
    new-instance v0, Lcom/urbanairship/actions/ActionResult$Status;

    const-string v1, "ACTION_NOT_FOUND"

    invoke-direct {v0, v1, v4}, Lcom/urbanairship/actions/ActionResult$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/ActionResult$Status;->ACTION_NOT_FOUND:Lcom/urbanairship/actions/ActionResult$Status;

    .line 60
    new-instance v0, Lcom/urbanairship/actions/ActionResult$Status;

    const-string v1, "EXECUTION_ERROR"

    invoke-direct {v0, v1, v5}, Lcom/urbanairship/actions/ActionResult$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/actions/ActionResult$Status;->EXECUTION_ERROR:Lcom/urbanairship/actions/ActionResult$Status;

    .line 36
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/urbanairship/actions/ActionResult$Status;

    sget-object v1, Lcom/urbanairship/actions/ActionResult$Status;->COMPLETED:Lcom/urbanairship/actions/ActionResult$Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/urbanairship/actions/ActionResult$Status;->REJECTED_ARGUMENTS:Lcom/urbanairship/actions/ActionResult$Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/urbanairship/actions/ActionResult$Status;->ACTION_NOT_FOUND:Lcom/urbanairship/actions/ActionResult$Status;

    aput-object v1, v0, v4

    sget-object v1, Lcom/urbanairship/actions/ActionResult$Status;->EXECUTION_ERROR:Lcom/urbanairship/actions/ActionResult$Status;

    aput-object v1, v0, v5

    sput-object v0, Lcom/urbanairship/actions/ActionResult$Status;->$VALUES:[Lcom/urbanairship/actions/ActionResult$Status;

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
    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/urbanairship/actions/ActionResult$Status;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 36
    const-class v0, Lcom/urbanairship/actions/ActionResult$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/actions/ActionResult$Status;

    return-object v0
.end method

.method public static values()[Lcom/urbanairship/actions/ActionResult$Status;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/urbanairship/actions/ActionResult$Status;->$VALUES:[Lcom/urbanairship/actions/ActionResult$Status;

    invoke-virtual {v0}, [Lcom/urbanairship/actions/ActionResult$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/urbanairship/actions/ActionResult$Status;

    return-object v0
.end method
