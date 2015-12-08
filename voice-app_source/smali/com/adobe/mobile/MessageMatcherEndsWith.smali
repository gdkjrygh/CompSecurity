.class final Lcom/adobe/mobile/MessageMatcherEndsWith;
.super Lcom/adobe/mobile/MessageMatcher;
.source "MessageMatcherEndsWith.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/adobe/mobile/MessageMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method protected matches(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    const/4 v4, 0x0

    .line 26
    instance-of v3, p1, Ljava/lang/String;

    .line 27
    .local v3, "valueIsString":Z
    instance-of v2, p1, Ljava/lang/Number;

    .line 28
    .local v2, "valueIsNumber":Z
    if-nez v3, :cond_1

    if-nez v2, :cond_1

    .line 39
    :cond_0
    :goto_0
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 33
    .local v0, "stringToMatch":Ljava/lang/String;
    iget-object v5, p0, Lcom/adobe/mobile/MessageMatcherEndsWith;->values:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 34
    .local v1, "v":Ljava/lang/Object;
    instance-of v6, v1, Ljava/lang/String;

    if-eqz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "(?i).*"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 35
    const/4 v4, 0x1

    goto :goto_0
.end method
