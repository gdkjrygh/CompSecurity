.class Lcom/adobe/mobile/AnalyticsTrackTimedAction$1;
.super Ljava/lang/Object;
.source "AnalyticsTrackTimedAction.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/AnalyticsTrackTimedAction;->trackTimedActionEnd(Ljava/lang/String;Lcom/adobe/mobile/Analytics$TimedActionBlock;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/AnalyticsTrackTimedAction;

.field final synthetic val$contextData:Ljava/util/HashMap;

.field final synthetic val$timedActionName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/AnalyticsTrackTimedAction;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/AnalyticsTrackTimedAction;

    .prologue
    .line 149
    iput-object p1, p0, Lcom/adobe/mobile/AnalyticsTrackTimedAction$1;->this$0:Lcom/adobe/mobile/AnalyticsTrackTimedAction;

    iput-object p2, p0, Lcom/adobe/mobile/AnalyticsTrackTimedAction$1;->val$timedActionName:Ljava/lang/String;

    iput-object p3, p0, Lcom/adobe/mobile/AnalyticsTrackTimedAction$1;->val$contextData:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/adobe/mobile/AnalyticsTrackTimedAction$1;->val$timedActionName:Ljava/lang/String;

    iget-object v1, p0, Lcom/adobe/mobile/AnalyticsTrackTimedAction$1;->val$contextData:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lcom/adobe/mobile/AnalyticsTrackAction;->trackAction(Ljava/lang/String;Ljava/util/Map;)V

    .line 152
    return-void
.end method
