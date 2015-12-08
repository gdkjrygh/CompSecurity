.class Lcom/urbanairship/actions/ActionRegistry$1;
.super Ljava/lang/Object;
.source "ActionRegistry.java"

# interfaces
.implements Lcom/android/internal/util/Predicate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/actions/ActionRegistry;->registerDefaultActions()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/internal/util/Predicate",
        "<",
        "Lcom/urbanairship/actions/ActionArguments;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/actions/ActionRegistry;


# direct methods
.method constructor <init>(Lcom/urbanairship/actions/ActionRegistry;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/urbanairship/actions/ActionRegistry$1;->this$0:Lcom/urbanairship/actions/ActionRegistry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 8
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    const/4 v2, 0x1

    .line 191
    sget-object v3, Lcom/urbanairship/actions/Situation;->PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getSituation()Lcom/urbanairship/actions/Situation;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/urbanairship/actions/Situation;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 192
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationMetrics()Lcom/urbanairship/ApplicationMetrics;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/ApplicationMetrics;->getLastOpenTimeMillis()J

    move-result-wide v0

    .line 193
    .local v0, "lastOpenTime":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    const-wide/32 v6, 0x240c8400

    cmp-long v3, v4, v6

    if-gtz v3, :cond_1

    .line 195
    .end local v0    # "lastOpenTime":J
    :cond_0
    :goto_0
    return v2

    .line 193
    .restart local v0    # "lastOpenTime":J
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 188
    check-cast p1, Lcom/urbanairship/actions/ActionArguments;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/actions/ActionRegistry$1;->apply(Lcom/urbanairship/actions/ActionArguments;)Z

    move-result v0

    return v0
.end method
