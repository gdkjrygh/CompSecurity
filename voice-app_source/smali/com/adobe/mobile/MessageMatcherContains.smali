.class Lcom/adobe/mobile/MessageMatcherContains;
.super Lcom/adobe/mobile/MessageMatcher;
.source "MessageMatcherContains.java"


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
    instance-of v2, p1, Ljava/lang/String;

    .line 27
    .local v2, "valueIsString":Z
    instance-of v1, p1, Ljava/lang/Number;

    .line 28
    .local v1, "valueIsNumber":Z
    if-nez v2, :cond_1

    if-nez v1, :cond_1

    .line 40
    :cond_0
    :goto_0
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 33
    .local v3, "valueToSearchFor":Ljava/lang/String;
    iget-object v5, p0, Lcom/adobe/mobile/MessageMatcherContains;->values:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 34
    .local v0, "v":Ljava/lang/Object;
    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v6, v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 36
    const/4 v4, 0x1

    goto :goto_0
.end method
