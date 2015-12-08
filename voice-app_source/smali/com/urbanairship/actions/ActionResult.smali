.class public Lcom/urbanairship/actions/ActionResult;
.super Ljava/lang/Object;
.source "ActionResult.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/actions/ActionResult$Status;
    }
.end annotation


# instance fields
.field private final exception:Ljava/lang/Exception;

.field private final status:Lcom/urbanairship/actions/ActionResult$Status;

.field private final value:Ljava/lang/Object;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Exception;Lcom/urbanairship/actions/ActionResult$Status;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "exception"    # Ljava/lang/Exception;
    .param p3, "status"    # Lcom/urbanairship/actions/ActionResult$Status;

    .prologue
    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p1, p0, Lcom/urbanairship/actions/ActionResult;->value:Ljava/lang/Object;

    .line 118
    iput-object p2, p0, Lcom/urbanairship/actions/ActionResult;->exception:Ljava/lang/Exception;

    .line 119
    if-eqz p3, :cond_0

    .end local p3    # "status":Lcom/urbanairship/actions/ActionResult$Status;
    :goto_0
    iput-object p3, p0, Lcom/urbanairship/actions/ActionResult;->status:Lcom/urbanairship/actions/ActionResult$Status;

    .line 120
    return-void

    .line 119
    .restart local p3    # "status":Lcom/urbanairship/actions/ActionResult$Status;
    :cond_0
    sget-object p3, Lcom/urbanairship/actions/ActionResult$Status;->COMPLETED:Lcom/urbanairship/actions/ActionResult$Status;

    goto :goto_0
.end method

.method public static newEmptyResult()Lcom/urbanairship/actions/ActionResult;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 82
    new-instance v0, Lcom/urbanairship/actions/ActionResult;

    sget-object v1, Lcom/urbanairship/actions/ActionResult$Status;->COMPLETED:Lcom/urbanairship/actions/ActionResult$Status;

    invoke-direct {v0, v2, v2, v1}, Lcom/urbanairship/actions/ActionResult;-><init>(Ljava/lang/Object;Ljava/lang/Exception;Lcom/urbanairship/actions/ActionResult$Status;)V

    return-object v0
.end method

.method static newEmptyResultWithStatus(Lcom/urbanairship/actions/ActionResult$Status;)Lcom/urbanairship/actions/ActionResult;
    .locals 2
    .param p0, "status"    # Lcom/urbanairship/actions/ActionResult$Status;

    .prologue
    const/4 v1, 0x0

    .line 106
    new-instance v0, Lcom/urbanairship/actions/ActionResult;

    invoke-direct {v0, v1, v1, p0}, Lcom/urbanairship/actions/ActionResult;-><init>(Ljava/lang/Object;Ljava/lang/Exception;Lcom/urbanairship/actions/ActionResult$Status;)V

    return-object v0
.end method

.method public static newErrorResult(Ljava/lang/Exception;)Lcom/urbanairship/actions/ActionResult;
    .locals 3
    .param p0, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 98
    new-instance v0, Lcom/urbanairship/actions/ActionResult;

    const/4 v1, 0x0

    sget-object v2, Lcom/urbanairship/actions/ActionResult$Status;->EXECUTION_ERROR:Lcom/urbanairship/actions/ActionResult$Status;

    invoke-direct {v0, v1, p0, v2}, Lcom/urbanairship/actions/ActionResult;-><init>(Ljava/lang/Object;Ljava/lang/Exception;Lcom/urbanairship/actions/ActionResult$Status;)V

    return-object v0
.end method

.method public static newResult(Ljava/lang/Object;)Lcom/urbanairship/actions/ActionResult;
    .locals 3
    .param p0, "value"    # Ljava/lang/Object;

    .prologue
    .line 90
    new-instance v0, Lcom/urbanairship/actions/ActionResult;

    const/4 v1, 0x0

    sget-object v2, Lcom/urbanairship/actions/ActionResult$Status;->COMPLETED:Lcom/urbanairship/actions/ActionResult$Status;

    invoke-direct {v0, p0, v1, v2}, Lcom/urbanairship/actions/ActionResult;-><init>(Ljava/lang/Object;Ljava/lang/Exception;Lcom/urbanairship/actions/ActionResult$Status;)V

    return-object v0
.end method


# virtual methods
.method public getException()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/urbanairship/actions/ActionResult;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getStatus()Lcom/urbanairship/actions/ActionResult$Status;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/urbanairship/actions/ActionResult;->status:Lcom/urbanairship/actions/ActionResult$Status;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/urbanairship/actions/ActionResult;->value:Ljava/lang/Object;

    return-object v0
.end method
