.class Lcom/urbanairship/analytics/Analytics$3;
.super Ljava/lang/Object;
.source "Analytics.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/analytics/Analytics;->addEvent(Lcom/urbanairship/analytics/Event;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/analytics/Analytics;

.field final synthetic val$event:Lcom/urbanairship/analytics/Event;


# direct methods
.method constructor <init>(Lcom/urbanairship/analytics/Analytics;Lcom/urbanairship/analytics/Event;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lcom/urbanairship/analytics/Analytics$3;->this$0:Lcom/urbanairship/analytics/Analytics;

    iput-object p2, p0, Lcom/urbanairship/analytics/Analytics$3;->val$event:Lcom/urbanairship/analytics/Event;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Adding event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/analytics/Analytics$3;->val$event:Lcom/urbanairship/analytics/Event;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/urbanairship/analytics/Analytics$3;->val$event:Lcom/urbanairship/analytics/Event;

    invoke-static {v0}, Lcom/urbanairship/analytics/EventService;->sendAddEventIntent(Lcom/urbanairship/analytics/Event;)V

    .line 251
    return-void
.end method
