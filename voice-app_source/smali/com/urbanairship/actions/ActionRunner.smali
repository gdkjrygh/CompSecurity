.class public Lcom/urbanairship/actions/ActionRunner;
.super Ljava/lang/Object;
.source "ActionRunner.java"


# static fields
.field private static instance:Lcom/urbanairship/actions/ActionRunner;


# instance fields
.field private actionRegistry:Lcom/urbanairship/actions/ActionRegistry;

.field private executor:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 55
    new-instance v0, Lcom/urbanairship/actions/ActionRunner;

    invoke-static {}, Lcom/urbanairship/actions/ActionRegistry;->shared()Lcom/urbanairship/actions/ActionRegistry;

    move-result-object v1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/urbanairship/actions/ActionRunner;-><init>(Lcom/urbanairship/actions/ActionRegistry;Ljava/util/concurrent/Executor;)V

    sput-object v0, Lcom/urbanairship/actions/ActionRunner;->instance:Lcom/urbanairship/actions/ActionRunner;

    return-void
.end method

.method constructor <init>(Lcom/urbanairship/actions/ActionRegistry;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p1, "registry"    # Lcom/urbanairship/actions/ActionRegistry;
    .param p2, "executor"    # Ljava/util/concurrent/Executor;

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/urbanairship/actions/ActionRunner;->actionRegistry:Lcom/urbanairship/actions/ActionRegistry;

    .line 69
    iput-object p2, p0, Lcom/urbanairship/actions/ActionRunner;->executor:Ljava/util/concurrent/Executor;

    .line 70
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/actions/ActionRunner;Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/actions/ActionRunner;
    .param p1, "x1"    # Landroid/os/Handler;
    .param p2, "x2"    # Lcom/urbanairship/actions/ActionCompletionCallback;
    .param p3, "x3"    # Lcom/urbanairship/actions/ActionResult;

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/urbanairship/actions/ActionRunner;->postResult(Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V

    return-void
.end method

.method private getHandler()Landroid/os/Handler;
    .locals 2

    .prologue
    .line 224
    :try_start_0
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    :goto_0
    return-object v1

    .line 225
    :catch_0
    move-exception v0

    .line 226
    .local v0, "ex":Ljava/lang/Exception;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private postResult(Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V
    .locals 1
    .param p1, "handler"    # Landroid/os/Handler;
    .param p2, "callback"    # Lcom/urbanairship/actions/ActionCompletionCallback;
    .param p3, "result"    # Lcom/urbanairship/actions/ActionResult;

    .prologue
    .line 200
    if-nez p2, :cond_0

    .line 215
    :goto_0
    return-void

    .line 205
    :cond_0
    if-eqz p1, :cond_1

    .line 206
    new-instance v0, Lcom/urbanairship/actions/ActionRunner$3;

    invoke-direct {v0, p0, p2, p3}, Lcom/urbanairship/actions/ActionRunner$3;-><init>(Lcom/urbanairship/actions/ActionRunner;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 213
    :cond_1
    invoke-interface {p2, p3}, Lcom/urbanairship/actions/ActionCompletionCallback;->onFinish(Lcom/urbanairship/actions/ActionResult;)V

    goto :goto_0
.end method

.method public static shared()Lcom/urbanairship/actions/ActionRunner;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Lcom/urbanairship/actions/ActionRunner;->instance:Lcom/urbanairship/actions/ActionRunner;

    return-object v0
.end method


# virtual methods
.method public runAction(Lcom/urbanairship/actions/Action;Lcom/urbanairship/actions/ActionArguments;)V
    .locals 1
    .param p1, "action"    # Lcom/urbanairship/actions/Action;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 119
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/urbanairship/actions/ActionRunner;->runAction(Lcom/urbanairship/actions/Action;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V

    .line 120
    return-void
.end method

.method public runAction(Lcom/urbanairship/actions/Action;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V
    .locals 7
    .param p1, "action"    # Lcom/urbanairship/actions/Action;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;
    .param p3, "completionCallback"    # Lcom/urbanairship/actions/ActionCompletionCallback;

    .prologue
    .line 94
    if-nez p1, :cond_0

    .line 95
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unable to run null action"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Running action: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 100
    invoke-direct {p0}, Lcom/urbanairship/actions/ActionRunner;->getHandler()Landroid/os/Handler;

    move-result-object v4

    .line 102
    .local v4, "handler":Landroid/os/Handler;
    iget-object v6, p0, Lcom/urbanairship/actions/ActionRunner;->executor:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/urbanairship/actions/ActionRunner$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/urbanairship/actions/ActionRunner$1;-><init>(Lcom/urbanairship/actions/ActionRunner;Lcom/urbanairship/actions/Action;Lcom/urbanairship/actions/ActionArguments;Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 109
    return-void
.end method

.method public runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)V
    .locals 1
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 152
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/urbanairship/actions/ActionRunner;->runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V

    .line 153
    return-void
.end method

.method public runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V
    .locals 7
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;
    .param p3, "completionCallback"    # Lcom/urbanairship/actions/ActionCompletionCallback;

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/urbanairship/actions/ActionRunner;->getHandler()Landroid/os/Handler;

    move-result-object v4

    .line 136
    .local v4, "handler":Landroid/os/Handler;
    iget-object v6, p0, Lcom/urbanairship/actions/ActionRunner;->executor:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/urbanairship/actions/ActionRunner$2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/urbanairship/actions/ActionRunner$2;-><init>(Lcom/urbanairship/actions/ActionRunner;Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 143
    return-void
.end method

.method public runActionSync(Lcom/urbanairship/actions/Action;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
    .locals 2
    .param p1, "action"    # Lcom/urbanairship/actions/Action;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 163
    if-nez p1, :cond_0

    .line 164
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unable to run null action"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Running action: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 167
    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/urbanairship/actions/Action;->run(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v0

    return-object v0
.end method

.method public runActionSync(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
    .locals 3
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 179
    iget-object v2, p0, Lcom/urbanairship/actions/ActionRunner;->actionRegistry:Lcom/urbanairship/actions/ActionRegistry;

    invoke-virtual {v2, p1}, Lcom/urbanairship/actions/ActionRegistry;->getEntry(Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    move-result-object v0

    .line 180
    .local v0, "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    if-nez v0, :cond_0

    .line 181
    sget-object v2, Lcom/urbanairship/actions/ActionResult$Status;->ACTION_NOT_FOUND:Lcom/urbanairship/actions/ActionResult$Status;

    invoke-static {v2}, Lcom/urbanairship/actions/ActionResult;->newEmptyResultWithStatus(Lcom/urbanairship/actions/ActionResult$Status;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v2

    .line 187
    :goto_0
    return-object v2

    .line 182
    :cond_0
    invoke-virtual {v0}, Lcom/urbanairship/actions/ActionRegistry$Entry;->getPredicate()Lcom/android/internal/util/Predicate;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/urbanairship/actions/ActionRegistry$Entry;->getPredicate()Lcom/android/internal/util/Predicate;

    move-result-object v2

    invoke-interface {v2, p2}, Lcom/android/internal/util/Predicate;->apply(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 183
    const-string v2, "Action will not be run. Registry predicate returned false."

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 184
    sget-object v2, Lcom/urbanairship/actions/ActionResult$Status;->REJECTED_ARGUMENTS:Lcom/urbanairship/actions/ActionResult$Status;

    invoke-static {v2}, Lcom/urbanairship/actions/ActionResult;->newEmptyResultWithStatus(Lcom/urbanairship/actions/ActionResult$Status;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v2

    goto :goto_0

    .line 186
    :cond_1
    if-nez p2, :cond_2

    const/4 v1, 0x0

    .line 187
    .local v1, "situation":Lcom/urbanairship/actions/Situation;
    :goto_1
    invoke-virtual {v0, v1}, Lcom/urbanairship/actions/ActionRegistry$Entry;->getActionForSituation(Lcom/urbanairship/actions/Situation;)Lcom/urbanairship/actions/Action;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/urbanairship/actions/Action;->run(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v2

    goto :goto_0

    .line 186
    .end local v1    # "situation":Lcom/urbanairship/actions/Situation;
    :cond_2
    invoke-virtual {p2}, Lcom/urbanairship/actions/ActionArguments;->getSituation()Lcom/urbanairship/actions/Situation;

    move-result-object v1

    goto :goto_1
.end method
