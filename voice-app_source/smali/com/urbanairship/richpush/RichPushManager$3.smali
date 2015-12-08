.class Lcom/urbanairship/richpush/RichPushManager$3;
.super Lcom/urbanairship/richpush/RichPushManager$UpdateResultReceiver;
.source "RichPushManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/richpush/RichPushManager;->updateUser()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/richpush/RichPushManager;


# direct methods
.method constructor <init>(Lcom/urbanairship/richpush/RichPushManager;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/urbanairship/richpush/RichPushManager$3;->this$0:Lcom/urbanairship/richpush/RichPushManager;

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushManager$UpdateResultReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onUpdate(Z)V
    .locals 1
    .param p1, "success"    # Z

    .prologue
    .line 248
    iget-object v0, p0, Lcom/urbanairship/richpush/RichPushManager$3;->this$0:Lcom/urbanairship/richpush/RichPushManager;

    # invokes: Lcom/urbanairship/richpush/RichPushManager;->onUserUpdate(Z)V
    invoke-static {v0, p1}, Lcom/urbanairship/richpush/RichPushManager;->access$300(Lcom/urbanairship/richpush/RichPushManager;Z)V

    .line 249
    return-void
.end method
