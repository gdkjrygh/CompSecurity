.class Lcom/urbanairship/actions/ActionRunner$2;
.super Ljava/lang/Object;
.source "ActionRunner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/actions/ActionRunner;->runAction(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Lcom/urbanairship/actions/ActionCompletionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/actions/ActionRunner;

.field final synthetic val$actionName:Ljava/lang/String;

.field final synthetic val$arguments:Lcom/urbanairship/actions/ActionArguments;

.field final synthetic val$completionCallback:Lcom/urbanairship/actions/ActionCompletionCallback;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/urbanairship/actions/ActionRunner;Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/urbanairship/actions/ActionRunner$2;->this$0:Lcom/urbanairship/actions/ActionRunner;

    iput-object p2, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$actionName:Ljava/lang/String;

    iput-object p3, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$arguments:Lcom/urbanairship/actions/ActionArguments;

    iput-object p4, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$handler:Landroid/os/Handler;

    iput-object p5, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$completionCallback:Lcom/urbanairship/actions/ActionCompletionCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 139
    iget-object v1, p0, Lcom/urbanairship/actions/ActionRunner$2;->this$0:Lcom/urbanairship/actions/ActionRunner;

    iget-object v2, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$actionName:Ljava/lang/String;

    iget-object v3, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$arguments:Lcom/urbanairship/actions/ActionArguments;

    invoke-virtual {v1, v2, v3}, Lcom/urbanairship/actions/ActionRunner;->runActionSync(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;

    move-result-object v0

    .line 140
    .local v0, "result":Lcom/urbanairship/actions/ActionResult;
    iget-object v1, p0, Lcom/urbanairship/actions/ActionRunner$2;->this$0:Lcom/urbanairship/actions/ActionRunner;

    iget-object v2, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/urbanairship/actions/ActionRunner$2;->val$completionCallback:Lcom/urbanairship/actions/ActionCompletionCallback;

    # invokes: Lcom/urbanairship/actions/ActionRunner;->postResult(Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V
    invoke-static {v1, v2, v3, v0}, Lcom/urbanairship/actions/ActionRunner;->access$000(Lcom/urbanairship/actions/ActionRunner;Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V

    .line 141
    return-void
.end method
