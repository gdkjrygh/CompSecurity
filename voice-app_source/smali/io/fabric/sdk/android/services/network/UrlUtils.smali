.class public final Lio/fabric/sdk/android/services/network/UrlUtils;
.super Ljava/lang/Object;
.source "UrlUtils.java"


# static fields
.field public static final UTF8:Ljava/lang/String; = "UTF8"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method public static getQueryParams(Ljava/lang/String;Z)Ljava/util/TreeMap;
    .locals 10
    .param p0, "paramsString"    # Ljava/lang/String;
    .param p1, "decode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/TreeMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 40
    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 41
    .local v5, "params":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-nez p0, :cond_1

    .line 61
    :cond_0
    return-object v5

    .line 44
    :cond_1
    const-string v6, "&"

    invoke-virtual {p0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v4, v0, v1

    .line 45
    .local v4, "nameValuePairString":Ljava/lang/String;
    const-string v6, "="

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 46
    .local v3, "nameValuePair":[Ljava/lang/String;
    array-length v6, v3

    const/4 v7, 0x2

    if-ne v6, v7, :cond_4

    .line 47
    if-eqz p1, :cond_3

    .line 48
    aget-object v6, v3, v8

    invoke-static {v6}, Lio/fabric/sdk/android/services/network/UrlUtils;->urlDecode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aget-object v7, v3, v9

    invoke-static {v7}, Lio/fabric/sdk/android/services/network/UrlUtils;->urlDecode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_3
    aget-object v6, v3, v8

    aget-object v7, v3, v9

    invoke-virtual {v5, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 53
    :cond_4
    aget-object v6, v3, v8

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 54
    if-eqz p1, :cond_5

    .line 55
    aget-object v6, v3, v8

    invoke-static {v6}, Lio/fabric/sdk/android/services/network/UrlUtils;->urlDecode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 57
    :cond_5
    aget-object v6, v3, v8

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public static getQueryParams(Ljava/net/URI;Z)Ljava/util/TreeMap;
    .locals 1
    .param p0, "uri"    # Ljava/net/URI;
    .param p1, "decode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Z)",
            "Ljava/util/TreeMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 36
    invoke-virtual {p0}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fabric/sdk/android/services/network/UrlUtils;->getQueryParams(Ljava/lang/String;Z)Ljava/util/TreeMap;

    move-result-object v0

    return-object v0
.end method

.method public static percentEncode(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 98
    if-nez p0, :cond_0

    .line 99
    const-string v5, ""

    .line 119
    :goto_0
    return-object v5

    .line 101
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .local v4, "sb":Ljava/lang/StringBuilder;
    invoke-static {p0}, Lio/fabric/sdk/android/services/network/UrlUtils;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 103
    .local v1, "encoded":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 104
    .local v2, "encodedLength":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v2, :cond_4

    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 106
    .local v0, "c":C
    const/16 v5, 0x2a

    if-ne v0, v5, :cond_1

    .line 107
    const-string v5, "%2A"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 108
    :cond_1
    const/16 v5, 0x2b

    if-ne v0, v5, :cond_2

    .line 109
    const-string v5, "%20"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 110
    :cond_2
    const/16 v5, 0x25

    if-ne v0, v5, :cond_3

    add-int/lit8 v5, v3, 0x2

    if-ge v5, v2, :cond_3

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x37

    if-ne v5, v6, :cond_3

    add-int/lit8 v5, v3, 0x2

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x45

    if-ne v5, v6, :cond_3

    .line 113
    const/16 v5, 0x7e

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    add-int/lit8 v3, v3, 0x2

    goto :goto_2

    .line 116
    :cond_3
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 119
    .end local v0    # "c":C
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0
.end method

.method public static urlDecode(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 76
    if-nez p0, :cond_0

    .line 77
    const-string v1, ""

    .line 80
    :goto_0
    return-object v1

    :cond_0
    :try_start_0
    const-string v1, "UTF8"

    invoke-static {p0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 82
    .local v0, "unlikely":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static urlEncode(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 65
    if-nez p0, :cond_0

    .line 66
    const-string v1, ""

    .line 69
    :goto_0
    return-object v1

    :cond_0
    :try_start_0
    const-string v1, "UTF8"

    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    .local v0, "unlikely":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
