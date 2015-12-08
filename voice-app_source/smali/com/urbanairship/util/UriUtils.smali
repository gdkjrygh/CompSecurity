.class public Lcom/urbanairship/util/UriUtils;
.super Ljava/lang/Object;
.source "UriUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getQueryParameters(Landroid/net/Uri;)Ljava/util/Map;
    .locals 13
    .param p0, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    const/4 v12, 0x1

    .line 50
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 52
    .local v6, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object v7

    .line 54
    .local v7, "query":Ljava/lang/String;
    invoke-static {v7}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 78
    :cond_0
    return-object v6

    .line 58
    :cond_1
    const-string v9, "&"

    invoke-virtual {v7, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v5, v0, v1

    .line 59
    .local v5, "param":Ljava/lang/String;
    const-string v9, "="

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 61
    .local v2, "keyValuePair":[Ljava/lang/String;
    if-nez v2, :cond_3

    .line 58
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 65
    :cond_3
    array-length v9, v2

    if-lt v9, v12, :cond_5

    const/4 v9, 0x0

    aget-object v9, v2, v9

    invoke-static {v9}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 66
    .local v4, "name":Ljava/lang/String;
    :goto_2
    array-length v9, v2

    const/4 v11, 0x2

    if-lt v9, v11, :cond_6

    aget-object v9, v2, v12

    invoke-static {v9}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 68
    .local v8, "value":Ljava/lang/String;
    :goto_3
    invoke-static {v4}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 70
    invoke-interface {v6, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    .line 71
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_4
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .end local v4    # "name":Ljava/lang/String;
    .end local v8    # "value":Ljava/lang/String;
    :cond_5
    move-object v4, v10

    .line 65
    goto :goto_2

    .restart local v4    # "name":Ljava/lang/String;
    :cond_6
    move-object v8, v10

    .line 66
    goto :goto_3
.end method

.method public static parse(Ljava/lang/Object;)Landroid/net/Uri;
    .locals 1
    .param p0, "value"    # Ljava/lang/Object;

    .prologue
    .line 88
    if-eqz p0, :cond_0

    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_1

    instance-of v0, p0, Landroid/net/Uri;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/net/URL;

    if-nez v0, :cond_1

    .line 89
    :cond_0
    const/4 v0, 0x0

    .line 92
    :goto_0
    return-object v0

    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method
