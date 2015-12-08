.class Lcom/adobe/mobile/VisitorIDService$7;
.super Ljava/lang/Object;
.source "VisitorIDService.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/VisitorIDService;->getTargetParameterString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/VisitorIDService;

.field final synthetic val$returnValue:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/VisitorIDService;Ljava/lang/StringBuilder;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/VisitorIDService;

    .prologue
    .line 378
    iput-object p1, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    iput-object p2, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 378
    invoke-virtual {p0}, Lcom/adobe/mobile/VisitorIDService$7;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 381
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v1}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 382
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "mboxMCGVID"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_marketingCloudID:Ljava/lang/String;
    invoke-static {v2}, Lcom/adobe/mobile/VisitorIDService;->access$000(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v1}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 391
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "mboxAAMB"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_blob:Ljava/lang/String;
    invoke-static {v2}, Lcom/adobe/mobile/VisitorIDService;->access$200(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    :cond_0
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v1}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 398
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "mboxMCGLH"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/adobe/mobile/VisitorIDService$7;->this$0:Lcom/adobe/mobile/VisitorIDService;

    # getter for: Lcom/adobe/mobile/VisitorIDService;->_locationHint:Ljava/lang/String;
    invoke-static {v2}, Lcom/adobe/mobile/VisitorIDService;->access$100(Lcom/adobe/mobile/VisitorIDService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    :cond_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAID()Ljava/lang/String;

    move-result-object v0

    .line 405
    .local v0, "aid":Ljava/lang/String;
    if-eqz v0, :cond_2

    .line 406
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "mboxMCAVID"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    iget-object v1, p0, Lcom/adobe/mobile/VisitorIDService$7;->val$returnValue:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .end local v0    # "aid":Ljava/lang/String;
    :cond_2
    return-object v3
.end method
