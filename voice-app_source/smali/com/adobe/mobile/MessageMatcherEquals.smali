.class Lcom/adobe/mobile/MessageMatcherEquals;
.super Lcom/adobe/mobile/MessageMatcher;
.source "MessageMatcherEquals.java"


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
    .locals 10
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    const/4 v3, 0x1

    .line 24
    iget-object v2, p0, Lcom/adobe/mobile/MessageMatcherEquals;->values:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 26
    .local v0, "potentialMatch":Ljava/lang/Object;
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_1

    instance-of v2, p1, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    move v2, v3

    .line 55
    .end local v0    # "potentialMatch":Ljava/lang/Object;
    :goto_0
    return v2

    .line 33
    .restart local v0    # "potentialMatch":Ljava/lang/Object;
    :cond_1
    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_2

    instance-of v2, p1, Ljava/lang/Number;

    if-eqz v2, :cond_2

    .line 34
    check-cast v0, Ljava/lang/Number;

    .end local v0    # "potentialMatch":Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    move-object v2, p1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    cmpl-double v2, v6, v8

    if-nez v2, :cond_0

    move v2, v3

    .line 35
    goto :goto_0

    .line 40
    .restart local v0    # "potentialMatch":Ljava/lang/Object;
    :cond_2
    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_3

    instance-of v2, p1, Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 41
    invoke-virtual {p0, p1}, Lcom/adobe/mobile/MessageMatcherEquals;->tryParseDouble(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v1

    .line 42
    .local v1, "valueAsDouble":Ljava/lang/Double;
    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    .end local v0    # "potentialMatch":Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    invoke-virtual {p0, p1}, Lcom/adobe/mobile/MessageMatcherEquals;->tryParseDouble(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    cmpl-double v2, v6, v8

    if-nez v2, :cond_0

    move v2, v3

    .line 43
    goto :goto_0

    .line 48
    .end local v1    # "valueAsDouble":Ljava/lang/Double;
    .restart local v0    # "potentialMatch":Ljava/lang/Object;
    :cond_3
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_0

    instance-of v2, p1, Ljava/lang/Number;

    if-eqz v2, :cond_0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    move v2, v3

    .line 50
    goto :goto_0

    .line 55
    .end local v0    # "potentialMatch":Ljava/lang/Object;
    :cond_4
    const/4 v2, 0x0

    goto :goto_0
.end method
