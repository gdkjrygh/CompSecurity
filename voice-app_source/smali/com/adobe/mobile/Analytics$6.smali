.class final Lcom/adobe/mobile/Analytics$6;
.super Ljava/lang/Object;
.source "Analytics.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Analytics;->trackLifetimeValueIncrease(Ljava/math/BigDecimal;Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$amount:Ljava/math/BigDecimal;

.field final synthetic val$contextData:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Ljava/math/BigDecimal;Ljava/util/HashMap;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/adobe/mobile/Analytics$6;->val$amount:Ljava/math/BigDecimal;

    iput-object p2, p0, Lcom/adobe/mobile/Analytics$6;->val$contextData:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 119
    iget-object v0, p0, Lcom/adobe/mobile/Analytics$6;->val$amount:Ljava/math/BigDecimal;

    iget-object v1, p0, Lcom/adobe/mobile/Analytics$6;->val$contextData:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lcom/adobe/mobile/AnalyticsTrackLifetimeValueIncrease;->trackLifetimeValueIncrease(Ljava/math/BigDecimal;Ljava/util/Map;)V

    .line 120
    return-void
.end method
