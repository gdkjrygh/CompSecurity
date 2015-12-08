.class Lcom/urbanairship/analytics/Analytics$4;
.super Landroid/content/BroadcastReceiver;
.source "Analytics.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/analytics/Analytics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/analytics/Analytics;


# direct methods
.method constructor <init>(Lcom/urbanairship/analytics/Analytics;)V
    .locals 0

    .prologue
    .line 307
    iput-object p1, p0, Lcom/urbanairship/analytics/Analytics$4;->this$0:Lcom/urbanairship/analytics/Analytics;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 312
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 314
    sget-object v0, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_BACKGROUND:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$4;->this$0:Lcom/urbanairship/analytics/Analytics;

    const/4 v1, 0x1

    # setter for: Lcom/urbanairship/analytics/Analytics;->inBackground:Z
    invoke-static {v0, v1}, Lcom/urbanairship/analytics/Analytics;->access$102(Lcom/urbanairship/analytics/Analytics;Z)Z

    .line 319
    :cond_0
    :goto_0
    return-void

    .line 316
    :cond_1
    sget-object v0, Lcom/urbanairship/analytics/Analytics;->ACTION_APP_FOREGROUND:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$4;->this$0:Lcom/urbanairship/analytics/Analytics;

    const/4 v1, 0x0

    # setter for: Lcom/urbanairship/analytics/Analytics;->inBackground:Z
    invoke-static {v0, v1}, Lcom/urbanairship/analytics/Analytics;->access$102(Lcom/urbanairship/analytics/Analytics;Z)Z

    goto :goto_0
.end method
