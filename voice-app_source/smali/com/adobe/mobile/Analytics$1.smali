.class final Lcom/adobe/mobile/Analytics$1;
.super Ljava/lang/Object;
.source "Analytics.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Analytics;->trackState(Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$cdata:Ljava/util/Map;

.field final synthetic val$state:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/adobe/mobile/Analytics$1;->val$state:Ljava/lang/String;

    iput-object p2, p0, Lcom/adobe/mobile/Analytics$1;->val$cdata:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/adobe/mobile/Analytics$1;->val$state:Ljava/lang/String;

    iget-object v1, p0, Lcom/adobe/mobile/Analytics$1;->val$cdata:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/adobe/mobile/AnalyticsTrackState;->trackState(Ljava/lang/String;Ljava/util/Map;)V

    .line 72
    return-void
.end method
