.class Lcom/adobe/mobile/MessageMatcherExists;
.super Lcom/adobe/mobile/MessageMatcher;
.source "MessageMatcherExists.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Lcom/adobe/mobile/MessageMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs matchesInMaps([Ljava/util/Map;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "maps":[Ljava/util/Map;, "[Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v2, 0x0

    .line 8
    const/4 v1, 0x0

    .line 10
    .local v1, "value":Ljava/lang/Object;
    if-eqz p1, :cond_0

    array-length v3, p1

    if-gtz v3, :cond_1

    .line 25
    .end local v1    # "value":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v2

    .line 14
    .restart local v1    # "value":Ljava/lang/Object;
    :cond_1
    array-length v4, p1

    move v3, v2

    :goto_1
    if-ge v3, v4, :cond_4

    aget-object v0, p1, v3

    .line 15
    .local v0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez v0, :cond_3

    .line 14
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 19
    :cond_3
    iget-object v5, p0, Lcom/adobe/mobile/MessageMatcherExists;->key:Ljava/lang/String;

    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 20
    iget-object v3, p0, Lcom/adobe/mobile/MessageMatcherExists;->key:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 25
    .end local v0    # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v1    # "value":Ljava/lang/Object;
    :cond_4
    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0
.end method
