.class final Lcom/urbanairship/richpush/RichPushManager$1;
.super Landroid/content/BroadcastReceiver;
.source "RichPushManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/richpush/RichPushManager;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 156
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 159
    # getter for: Lcom/urbanairship/richpush/RichPushManager;->instance:Lcom/urbanairship/richpush/RichPushManager;
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->access$000()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushManager;->refreshMessages()V

    .line 160
    return-void
.end method
