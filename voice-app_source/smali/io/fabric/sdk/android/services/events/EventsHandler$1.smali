.class Lio/fabric/sdk/android/services/events/EventsHandler$1;
.super Ljava/lang/Object;
.source "EventsHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/events/EventsHandler;->recordEventAsync(Ljava/lang/Object;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

.field final synthetic val$event:Ljava/lang/Object;

.field final synthetic val$sendImmediately:Z


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/events/EventsHandler;Ljava/lang/Object;Z)V
    .locals 0

    .prologue
    .line 46
    .local p0, "this":Lio/fabric/sdk/android/services/events/EventsHandler$1;, "Lio/fabric/sdk/android/services/events/EventsHandler.1;"
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iput-object p2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$event:Ljava/lang/Object;

    iput-boolean p3, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$sendImmediately:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 50
    .local p0, "this":Lio/fabric/sdk/android/services/events/EventsHandler$1;, "Lio/fabric/sdk/android/services/events/EventsHandler.1;"
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v1, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    iget-object v2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$event:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lio/fabric/sdk/android/services/events/EventsStrategy;->recordEvent(Ljava/lang/Object;)V

    .line 52
    iget-boolean v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->val$sendImmediately:Z

    if-eqz v1, :cond_0

    .line 54
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v1, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/events/EventsStrategy;->rollFileOver()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :cond_0
    :goto_0
    return-void

    .line 56
    :catch_0
    move-exception v0

    .line 57
    .local v0, "e":Ljava/lang/Exception;
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$1;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v1, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->context:Landroid/content/Context;

    const-string v2, "Failed to record event."

    invoke-static {v1, v2, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
