.class Lcom/urbanairship/actions/ActionRunner$3;
.super Ljava/lang/Object;
.source "ActionRunner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/actions/ActionRunner;->postResult(Landroid/os/Handler;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/actions/ActionRunner;

.field final synthetic val$callback:Lcom/urbanairship/actions/ActionCompletionCallback;

.field final synthetic val$result:Lcom/urbanairship/actions/ActionResult;


# direct methods
.method constructor <init>(Lcom/urbanairship/actions/ActionRunner;Lcom/urbanairship/actions/ActionCompletionCallback;Lcom/urbanairship/actions/ActionResult;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/urbanairship/actions/ActionRunner$3;->this$0:Lcom/urbanairship/actions/ActionRunner;

    iput-object p2, p0, Lcom/urbanairship/actions/ActionRunner$3;->val$callback:Lcom/urbanairship/actions/ActionCompletionCallback;

    iput-object p3, p0, Lcom/urbanairship/actions/ActionRunner$3;->val$result:Lcom/urbanairship/actions/ActionResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 209
    iget-object v0, p0, Lcom/urbanairship/actions/ActionRunner$3;->val$callback:Lcom/urbanairship/actions/ActionCompletionCallback;

    iget-object v1, p0, Lcom/urbanairship/actions/ActionRunner$3;->val$result:Lcom/urbanairship/actions/ActionResult;

    invoke-interface {v0, v1}, Lcom/urbanairship/actions/ActionCompletionCallback;->onFinish(Lcom/urbanairship/actions/ActionResult;)V

    .line 210
    return-void
.end method
