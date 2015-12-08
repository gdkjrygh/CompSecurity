.class final enum Lcom/urbanairship/analytics/ActivityState$State;
.super Ljava/lang/Enum;
.source "ActivityState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/analytics/ActivityState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/urbanairship/analytics/ActivityState$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/urbanairship/analytics/ActivityState$State;

.field public static final enum NONE:Lcom/urbanairship/analytics/ActivityState$State;

.field public static final enum STARTED:Lcom/urbanairship/analytics/ActivityState$State;

.field public static final enum STOPPED:Lcom/urbanairship/analytics/ActivityState$State;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19
    new-instance v0, Lcom/urbanairship/analytics/ActivityState$State;

    const-string v1, "STARTED"

    invoke-direct {v0, v1, v2}, Lcom/urbanairship/analytics/ActivityState$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/ActivityState$State;->STARTED:Lcom/urbanairship/analytics/ActivityState$State;

    .line 23
    new-instance v0, Lcom/urbanairship/analytics/ActivityState$State;

    const-string v1, "STOPPED"

    invoke-direct {v0, v1, v3}, Lcom/urbanairship/analytics/ActivityState$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/ActivityState$State;->STOPPED:Lcom/urbanairship/analytics/ActivityState$State;

    .line 27
    new-instance v0, Lcom/urbanairship/analytics/ActivityState$State;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v4}, Lcom/urbanairship/analytics/ActivityState$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/ActivityState$State;->NONE:Lcom/urbanairship/analytics/ActivityState$State;

    .line 15
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/urbanairship/analytics/ActivityState$State;

    sget-object v1, Lcom/urbanairship/analytics/ActivityState$State;->STARTED:Lcom/urbanairship/analytics/ActivityState$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/urbanairship/analytics/ActivityState$State;->STOPPED:Lcom/urbanairship/analytics/ActivityState$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/urbanairship/analytics/ActivityState$State;->NONE:Lcom/urbanairship/analytics/ActivityState$State;

    aput-object v1, v0, v4

    sput-object v0, Lcom/urbanairship/analytics/ActivityState$State;->$VALUES:[Lcom/urbanairship/analytics/ActivityState$State;

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
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/urbanairship/analytics/ActivityState$State;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 15
    const-class v0, Lcom/urbanairship/analytics/ActivityState$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/analytics/ActivityState$State;

    return-object v0
.end method

.method public static values()[Lcom/urbanairship/analytics/ActivityState$State;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/urbanairship/analytics/ActivityState$State;->$VALUES:[Lcom/urbanairship/analytics/ActivityState$State;

    invoke-virtual {v0}, [Lcom/urbanairship/analytics/ActivityState$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/urbanairship/analytics/ActivityState$State;

    return-object v0
.end method
