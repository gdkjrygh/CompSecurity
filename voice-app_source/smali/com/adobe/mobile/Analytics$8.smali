.class final Lcom/adobe/mobile/Analytics$8;
.super Ljava/lang/Object;
.source "Analytics.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Analytics;->trackTimedActionUpdate(Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$action:Ljava/lang/String;

.field final synthetic val$cdata:Ljava/util/Map;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/adobe/mobile/Analytics$8;->val$action:Ljava/lang/String;

    iput-object p2, p0, Lcom/adobe/mobile/Analytics$8;->val$cdata:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 153
    invoke-static {}, Lcom/adobe/mobile/AnalyticsTrackTimedAction;->sharedInstance()Lcom/adobe/mobile/AnalyticsTrackTimedAction;

    move-result-object v0

    iget-object v1, p0, Lcom/adobe/mobile/Analytics$8;->val$action:Ljava/lang/String;

    iget-object v2, p0, Lcom/adobe/mobile/Analytics$8;->val$cdata:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lcom/adobe/mobile/AnalyticsTrackTimedAction;->trackTimedActionUpdate(Ljava/lang/String;Ljava/util/Map;)V

    .line 154
    return-void
.end method
