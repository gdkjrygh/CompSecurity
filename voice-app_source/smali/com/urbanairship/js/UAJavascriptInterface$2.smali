.class Lcom/urbanairship/js/UAJavascriptInterface$2;
.super Ljava/lang/Object;
.source "UAJavascriptInterface.java"

# interfaces
.implements Lcom/urbanairship/actions/ActionCompletionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/js/UAJavascriptInterface;->actionCall(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/js/UAJavascriptInterface;

.field final synthetic val$callbackKey:Ljava/lang/String;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    iput-object p2, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->val$callbackKey:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinish(Lcom/urbanairship/actions/ActionResult;)V
    .locals 4
    .param p1, "result"    # Lcom/urbanairship/actions/ActionResult;

    .prologue
    .line 226
    iget-object v1, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    iget-object v2, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->val$name:Ljava/lang/String;

    # invokes: Lcom/urbanairship/js/UAJavascriptInterface;->createErrorMessageFromResult(Ljava/lang/String;Lcom/urbanairship/actions/ActionResult;)Ljava/lang/String;
    invoke-static {v1, v2, p1}, Lcom/urbanairship/js/UAJavascriptInterface;->access$100(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;Lcom/urbanairship/actions/ActionResult;)Ljava/lang/String;

    move-result-object v0

    .line 227
    .local v0, "errorMessage":Ljava/lang/String;
    iget-object v1, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->this$0:Lcom/urbanairship/js/UAJavascriptInterface;

    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionResult;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/urbanairship/js/UAJavascriptInterface$2;->val$callbackKey:Ljava/lang/String;

    # invokes: Lcom/urbanairship/js/UAJavascriptInterface;->runActionCallback(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    invoke-static {v1, v0, v2, v3}, Lcom/urbanairship/js/UAJavascriptInterface;->access$200(Lcom/urbanairship/js/UAJavascriptInterface;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    return-void
.end method
