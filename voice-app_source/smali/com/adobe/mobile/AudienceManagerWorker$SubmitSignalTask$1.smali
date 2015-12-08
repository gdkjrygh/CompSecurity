.class Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;
.super Ljava/lang/Object;
.source "AudienceManagerWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;

.field final synthetic val$callbackData:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;Ljava/util/HashMap;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;

    .prologue
    .line 263
    iput-object p1, p0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;->this$0:Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;

    iput-object p2, p0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;->val$callbackData:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 266
    iget-object v0, p0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;->this$0:Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;

    iget-object v0, v0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask;->callback:Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;

    iget-object v1, p0, Lcom/adobe/mobile/AudienceManagerWorker$SubmitSignalTask$1;->val$callbackData:Ljava/util/HashMap;

    invoke-interface {v0, v1}, Lcom/adobe/mobile/AudienceManager$AudienceManagerCallback;->call(Ljava/lang/Object;)V

    .line 267
    return-void
.end method
