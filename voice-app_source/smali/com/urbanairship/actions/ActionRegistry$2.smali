.class Lcom/urbanairship/actions/ActionRegistry$2;
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
    .line 199
    iput-object p1, p0, Lcom/urbanairship/actions/ActionRegistry$2;->this$0:Lcom/urbanairship/actions/ActionRegistry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 2
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 202
    sget-object v0, Lcom/urbanairship/actions/Situation;->PUSH_RECEIVED:Lcom/urbanairship/actions/Situation;

    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getSituation()Lcom/urbanairship/actions/Situation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/urbanairship/actions/Situation;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 199
    check-cast p1, Lcom/urbanairship/actions/ActionArguments;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/actions/ActionRegistry$2;->apply(Lcom/urbanairship/actions/ActionArguments;)Z

    move-result v0

    return v0
.end method
