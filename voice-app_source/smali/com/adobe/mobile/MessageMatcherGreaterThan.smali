.class final Lcom/adobe/mobile/MessageMatcherGreaterThan;
.super Lcom/adobe/mobile/MessageMatcher;
.source "MessageMatcherGreaterThan.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/adobe/mobile/MessageMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method protected matches(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    const/4 v2, 0x0

    .line 25
    invoke-virtual {p0, p1}, Lcom/adobe/mobile/MessageMatcherGreaterThan;->tryParseDouble(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v1

    .line 26
    .local v1, "valueAsDouble":Ljava/lang/Double;
    if-nez v1, :cond_1

    .line 36
    :cond_0
    :goto_0
    return v2

    .line 30
    :cond_1
    iget-object v3, p0, Lcom/adobe/mobile/MessageMatcherGreaterThan;->values:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 31
    .local v0, "v":Ljava/lang/Object;
    instance-of v4, v0, Ljava/lang/Number;

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    check-cast v0, Ljava/lang/Number;

    .end local v0    # "v":Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    cmpl-double v4, v4, v6

    if-lez v4, :cond_2

    .line 32
    const/4 v2, 0x1

    goto :goto_0
.end method
