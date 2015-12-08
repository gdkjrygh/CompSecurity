.class public abstract Lcom/urbanairship/actions/Action;
.super Ljava/lang/Object;
.source "Action.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/actions/Action$ActivityResult;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    return-void
.end method


# virtual methods
.method public acceptsArguments(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 1
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 119
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getSituation()Lcom/urbanairship/actions/Situation;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onFinish(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionResult;)V
    .locals 0
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;
    .param p3, "result"    # Lcom/urbanairship/actions/ActionResult;

    .prologue
    .line 150
    return-void
.end method

.method public onStart(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)V
    .locals 0
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 130
    return-void
.end method

.method public abstract perform(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
.end method

.method final run(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
    .locals 4
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 89
    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p0, p2}, Lcom/urbanairship/actions/Action;->acceptsArguments(Lcom/urbanairship/actions/ActionArguments;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 90
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is unable to accept arguments: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 91
    sget-object v2, Lcom/urbanairship/actions/ActionResult$Status;->REJECTED_ARGUMENTS:Lcom/urbanairship/actions/ActionResult$Status;

    invoke-static {v2}, Lcom/urbanairship/actions/ActionResult;->newEmptyResultWithStatus(Lcom/urbanairship/actions/ActionResult$Status;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v1

    .line 103
    :goto_0
    return-object v1

    .line 94
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/urbanairship/actions/Action;->onStart(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)V

    .line 95
    invoke-virtual {p0, p1, p2}, Lcom/urbanairship/actions/Action;->perform(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v1

    .line 96
    .local v1, "result":Lcom/urbanairship/actions/ActionResult;
    if-nez v1, :cond_2

    .line 97
    invoke-static {}, Lcom/urbanairship/actions/ActionResult;->newEmptyResult()Lcom/urbanairship/actions/ActionResult;

    move-result-object v1

    .line 99
    :cond_2
    invoke-virtual {p0, p1, p2, v1}, Lcom/urbanairship/actions/Action;->onFinish(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 101
    .end local v1    # "result":Lcom/urbanairship/actions/ActionResult;
    :catch_0
    move-exception v0

    .line 102
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Action failed to run "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    invoke-static {v0}, Lcom/urbanairship/actions/ActionResult;->newErrorResult(Ljava/lang/Exception;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v1

    goto :goto_0
.end method

.method public final startActivityForResult(Landroid/content/Intent;)Lcom/urbanairship/actions/Action$ActivityResult;
    .locals 7
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 159
    new-instance v4, Lcom/urbanairship/actions/Action$ActivityResult;

    invoke-direct {v4}, Lcom/urbanairship/actions/Action$ActivityResult;-><init>()V

    .line 161
    .local v4, "result":Lcom/urbanairship/actions/Action$ActivityResult;
    new-instance v3, Lcom/urbanairship/actions/Action$1;

    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v3, p0, v5, v4}, Lcom/urbanairship/actions/Action$1;-><init>(Lcom/urbanairship/actions/Action;Landroid/os/Handler;Lcom/urbanairship/actions/Action$ActivityResult;)V

    .line 171
    .local v3, "receiver":Landroid/os/ResultReceiver;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 172
    .local v1, "context":Landroid/content/Context;
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/urbanairship/actions/ActionActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v6, 0x10000000

    invoke-virtual {v5, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v5

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    const-string v6, "com.urbanairship.actions.START_ACTIVITY_INTENT_EXTRA"

    invoke-virtual {v5, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v5

    const-string v6, "com.urbanairship.actions.actionactivity.RESULT_RECEIVER_EXTRA"

    invoke-virtual {v5, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    .line 178
    .local v0, "actionIntent":Landroid/content/Intent;
    monitor-enter v4

    .line 179
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :try_start_2
    monitor-exit v4

    .line 188
    .end local v4    # "result":Lcom/urbanairship/actions/Action$ActivityResult;
    :goto_0
    return-object v4

    .line 182
    .restart local v4    # "result":Lcom/urbanairship/actions/Action$ActivityResult;
    :catch_0
    move-exception v2

    .line 183
    .local v2, "e":Ljava/lang/InterruptedException;
    const-string v5, "Thread interrupted when waiting for result from activity."

    invoke-static {v5, v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    new-instance v5, Lcom/urbanairship/actions/Action$ActivityResult;

    invoke-direct {v5}, Lcom/urbanairship/actions/Action$ActivityResult;-><init>()V

    monitor-exit v4

    move-object v4, v5

    goto :goto_0

    .line 186
    .end local v2    # "e":Ljava/lang/InterruptedException;
    :catchall_0
    move-exception v5

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v5
.end method
