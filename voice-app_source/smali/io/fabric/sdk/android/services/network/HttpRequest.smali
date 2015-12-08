.class public Lio/fabric/sdk/android/services/network/HttpRequest;
.super Ljava/lang/Object;
.source "HttpRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;,
        Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;,
        Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;,
        Lio/fabric/sdk/android/services/network/HttpRequest$Operation;,
        Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
        Lio/fabric/sdk/android/services/network/HttpRequest$Base64;,
        Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;
    }
.end annotation


# static fields
.field private static final BOUNDARY:Ljava/lang/String; = "00content0boundary00"

.field public static final CHARSET_UTF8:Ljava/lang/String; = "UTF-8"

.field private static CONNECTION_FACTORY:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory; = null

.field public static final CONTENT_TYPE_FORM:Ljava/lang/String; = "application/x-www-form-urlencoded"

.field public static final CONTENT_TYPE_JSON:Ljava/lang/String; = "application/json"

.field private static final CONTENT_TYPE_MULTIPART:Ljava/lang/String; = "multipart/form-data; boundary=00content0boundary00"

.field private static final CRLF:Ljava/lang/String; = "\r\n"

.field private static final EMPTY_STRINGS:[Ljava/lang/String;

.field public static final ENCODING_GZIP:Ljava/lang/String; = "gzip"

.field public static final HEADER_ACCEPT:Ljava/lang/String; = "Accept"

.field public static final HEADER_ACCEPT_CHARSET:Ljava/lang/String; = "Accept-Charset"

.field public static final HEADER_ACCEPT_ENCODING:Ljava/lang/String; = "Accept-Encoding"

.field public static final HEADER_AUTHORIZATION:Ljava/lang/String; = "Authorization"

.field public static final HEADER_CACHE_CONTROL:Ljava/lang/String; = "Cache-Control"

.field public static final HEADER_CONTENT_ENCODING:Ljava/lang/String; = "Content-Encoding"

.field public static final HEADER_CONTENT_LENGTH:Ljava/lang/String; = "Content-Length"

.field public static final HEADER_CONTENT_TYPE:Ljava/lang/String; = "Content-Type"

.field public static final HEADER_DATE:Ljava/lang/String; = "Date"

.field public static final HEADER_ETAG:Ljava/lang/String; = "ETag"

.field public static final HEADER_EXPIRES:Ljava/lang/String; = "Expires"

.field public static final HEADER_IF_NONE_MATCH:Ljava/lang/String; = "If-None-Match"

.field public static final HEADER_LAST_MODIFIED:Ljava/lang/String; = "Last-Modified"

.field public static final HEADER_LOCATION:Ljava/lang/String; = "Location"

.field public static final HEADER_PROXY_AUTHORIZATION:Ljava/lang/String; = "Proxy-Authorization"

.field public static final HEADER_REFERER:Ljava/lang/String; = "Referer"

.field public static final HEADER_SERVER:Ljava/lang/String; = "Server"

.field public static final HEADER_USER_AGENT:Ljava/lang/String; = "User-Agent"

.field public static final METHOD_DELETE:Ljava/lang/String; = "DELETE"

.field public static final METHOD_GET:Ljava/lang/String; = "GET"

.field public static final METHOD_HEAD:Ljava/lang/String; = "HEAD"

.field public static final METHOD_OPTIONS:Ljava/lang/String; = "OPTIONS"

.field public static final METHOD_POST:Ljava/lang/String; = "POST"

.field public static final METHOD_PUT:Ljava/lang/String; = "PUT"

.field public static final METHOD_TRACE:Ljava/lang/String; = "TRACE"

.field public static final PARAM_CHARSET:Ljava/lang/String; = "charset"

.field private static TRUSTED_FACTORY:Ljavax/net/ssl/SSLSocketFactory;

.field private static TRUSTED_VERIFIER:Ljavax/net/ssl/HostnameVerifier;


# instance fields
.field private bufferSize:I

.field private connection:Ljava/net/HttpURLConnection;

.field private form:Z

.field private httpProxyHost:Ljava/lang/String;

.field private httpProxyPort:I

.field private ignoreCloseExceptions:Z

.field private multipart:Z

.field private output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

.field private final requestMethod:Ljava/lang/String;

.field private uncompress:Z

.field public final url:Ljava/net/URL;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 270
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lio/fabric/sdk/android/services/network/HttpRequest;->EMPTY_STRINGS:[Ljava/lang/String;

    .line 378
    sget-object v0, Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;->DEFAULT:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    sput-object v0, Lio/fabric/sdk/android/services/network/HttpRequest;->CONNECTION_FACTORY:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/CharSequence;
    .param p2, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1292
    const/4 v1, 0x0

    iput-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->connection:Ljava/net/HttpURLConnection;

    .line 1304
    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    .line 1306
    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->uncompress:Z

    .line 1308
    const/16 v1, 0x2000

    iput v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    .line 1323
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->url:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1327
    iput-object p2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->requestMethod:Ljava/lang/String;

    .line 1328
    return-void

    .line 1324
    :catch_0
    move-exception v0

    .line 1325
    .local v0, "e":Ljava/net/MalformedURLException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public constructor <init>(Ljava/net/URL;Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1337
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1292
    const/4 v0, 0x0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->connection:Ljava/net/HttpURLConnection;

    .line 1304
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    .line 1306
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->uncompress:Z

    .line 1308
    const/16 v0, 0x2000

    iput v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    .line 1338
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->url:Ljava/net/URL;

    .line 1339
    iput-object p2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->requestMethod:Ljava/lang/String;

    .line 1340
    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 112
    invoke-static {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getValidCharset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lio/fabric/sdk/android/services/network/HttpRequest;)I
    .locals 1
    .param p0, "x0"    # Lio/fabric/sdk/android/services/network/HttpRequest;

    .prologue
    .line 112
    iget v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    return v0
.end method

.method private static addParamPrefix(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 5
    .param p0, "baseUrl"    # Ljava/lang/String;
    .param p1, "result"    # Ljava/lang/StringBuilder;

    .prologue
    const/16 v4, 0x3f

    const/16 v3, 0x26

    .line 337
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 338
    .local v1, "queryStart":I
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v0, v2, -0x1

    .line 339
    .local v0, "lastChar":I
    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 340
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 343
    :cond_0
    :goto_0
    return-object p1

    .line 341
    :cond_1
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v3, :cond_0

    .line 342
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private static addPathSeparator(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3
    .param p0, "baseUrl"    # Ljava/lang/String;
    .param p1, "result"    # Ljava/lang/StringBuilder;

    .prologue
    const/16 v2, 0x2f

    .line 330
    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 331
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 332
    :cond_0
    return-object p1
.end method

.method public static append(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;
    .locals 7
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
    const/16 v6, 0x3d

    .line 809
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 810
    .local v0, "baseUrl":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 838
    .end local v0    # "baseUrl":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v0

    .line 813
    .restart local v0    # "baseUrl":Ljava/lang/String;
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 815
    .local v3, "result":Ljava/lang/StringBuilder;
    invoke-static {v0, v3}, Lio/fabric/sdk/android/services/network/HttpRequest;->addPathSeparator(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 816
    invoke-static {v0, v3}, Lio/fabric/sdk/android/services/network/HttpRequest;->addParamPrefix(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 820
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 821
    .local v2, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 822
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 824
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 825
    .local v4, "value":Ljava/lang/Object;
    if-eqz v4, :cond_2

    .line 826
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 828
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 829
    const/16 v5, 0x26

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 830
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    check-cast v1, Ljava/util/Map$Entry;

    .line 831
    .restart local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 833
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 834
    if-eqz v4, :cond_2

    .line 835
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 838
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static varargs append(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6
    .param p0, "url"    # Ljava/lang/CharSequence;
    .param p1, "params"    # [Ljava/lang/Object;

    .prologue
    const/16 v5, 0x3d

    .line 852
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 853
    .local v0, "baseUrl":Ljava/lang/String;
    if-eqz p1, :cond_0

    array-length v4, p1

    if-nez v4, :cond_1

    .line 880
    .end local v0    # "baseUrl":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v0

    .line 856
    .restart local v0    # "baseUrl":Ljava/lang/String;
    :cond_1
    array-length v4, p1

    rem-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_2

    .line 857
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Must specify an even number of parameter names/values"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 859
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 861
    .local v2, "result":Ljava/lang/StringBuilder;
    invoke-static {v0, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->addPathSeparator(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 862
    invoke-static {v0, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->addParamPrefix(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 865
    const/4 v4, 0x0

    aget-object v4, p1, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 866
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 867
    const/4 v4, 0x1

    aget-object v3, p1, v4

    .line 868
    .local v3, "value":Ljava/lang/Object;
    if-eqz v3, :cond_3

    .line 869
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 871
    :cond_3
    const/4 v1, 0x2

    .local v1, "i":I
    :goto_1
    array-length v4, p1

    if-ge v1, v4, :cond_5

    .line 872
    const/16 v4, 0x26

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 873
    aget-object v4, p1, v1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 874
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 875
    add-int/lit8 v4, v1, 0x1

    aget-object v3, p1, v4

    .line 876
    if-eqz v3, :cond_4

    .line 877
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 871
    :cond_4
    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    .line 880
    :cond_5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private createConnection()Ljava/net/HttpURLConnection;
    .locals 5

    .prologue
    .line 1349
    :try_start_0
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->httpProxyHost:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 1350
    sget-object v2, Lio/fabric/sdk/android/services/network/HttpRequest;->CONNECTION_FACTORY:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    iget-object v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->url:Ljava/net/URL;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->createProxy()Ljava/net/Proxy;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;->create(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 1353
    .local v0, "connection":Ljava/net/HttpURLConnection;
    :goto_0
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->requestMethod:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 1354
    return-object v0

    .line 1352
    .end local v0    # "connection":Ljava/net/HttpURLConnection;
    :cond_0
    sget-object v2, Lio/fabric/sdk/android/services/network/HttpRequest;->CONNECTION_FACTORY:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    iget-object v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->url:Ljava/net/URL;

    invoke-interface {v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;->create(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .restart local v0    # "connection":Ljava/net/HttpURLConnection;
    goto :goto_0

    .line 1355
    .end local v0    # "connection":Ljava/net/HttpURLConnection;
    :catch_0
    move-exception v1

    .line 1356
    .local v1, "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v1}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method private createProxy()Ljava/net/Proxy;
    .locals 5

    .prologue
    .line 1343
    new-instance v0, Ljava/net/Proxy;

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->httpProxyHost:Ljava/lang/String;

    iget v4, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->httpProxyPort:I

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v1, v2}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    return-object v0
.end method

.method public static delete(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1059
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "DELETE"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static delete(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p2, "encode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;Z)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 1086
    .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 1087
    .local v0, "url":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->delete(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static varargs delete(Ljava/lang/CharSequence;Z[Ljava/lang/Object;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p1, "encode"    # Z
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 1103
    invoke-static {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1104
    .local v0, "url":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->delete(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static delete(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1070
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "DELETE"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method public static encode(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 12
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 774
    :try_start_0
    new-instance v10, Ljava/net/URL;

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 779
    .local v10, "parsed":Ljava/net/URL;
    invoke-virtual {v10}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 780
    .local v2, "host":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/net/URL;->getPort()I

    move-result v11

    .line 781
    .local v11, "port":I
    const/4 v0, -0x1

    if-eq v11, v0, :cond_0

    .line 782
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 785
    :cond_0
    :try_start_1
    new-instance v0, Ljava/net/URI;

    invoke-virtual {v10}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v7

    .line 786
    .local v7, "encoded":Ljava/lang/String;
    const/16 v0, 0x3f

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    .line 787
    .local v9, "paramsStart":I
    if-lez v9, :cond_1

    add-int/lit8 v0, v9, 0x1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 788
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    add-int/lit8 v3, v9, 0x1

    invoke-virtual {v7, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v9, 0x1

    invoke-virtual {v7, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "+"

    const-string v4, "%2B"

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v7

    .line 790
    :cond_1
    return-object v7

    .line 775
    .end local v2    # "host":Ljava/lang/String;
    .end local v7    # "encoded":Ljava/lang/String;
    .end local v9    # "paramsStart":I
    .end local v10    # "parsed":Ljava/net/URL;
    .end local v11    # "port":I
    :catch_0
    move-exception v6

    .line 776
    .local v6, "e":Ljava/io/IOException;
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v0, v6}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 791
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v2    # "host":Ljava/lang/String;
    .restart local v10    # "parsed":Ljava/net/URL;
    .restart local v11    # "port":I
    :catch_1
    move-exception v6

    .line 792
    .local v6, "e":Ljava/net/URISyntaxException;
    new-instance v8, Ljava/io/IOException;

    const-string v0, "Parsing URI failed"

    invoke-direct {v8, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 793
    .local v8, "io":Ljava/io/IOException;
    invoke-virtual {v8, v6}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 794
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v0, v8}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method public static get(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 891
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "GET"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static get(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p2, "encode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;Z)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 918
    .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 919
    .local v0, "url":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->get(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static varargs get(Ljava/lang/CharSequence;Z[Ljava/lang/Object;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p1, "encode"    # Z
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 935
    invoke-static {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 936
    .local v0, "url":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->get(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static get(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 902
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "GET"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method private static getTrustedFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 284
    sget-object v4, Lio/fabric/sdk/android/services/network/HttpRequest;->TRUSTED_FACTORY:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v4, :cond_0

    .line 285
    const/4 v4, 0x1

    new-array v3, v4, [Ljavax/net/ssl/TrustManager;

    const/4 v4, 0x0

    new-instance v5, Lio/fabric/sdk/android/services/network/HttpRequest$1;

    invoke-direct {v5}, Lio/fabric/sdk/android/services/network/HttpRequest$1;-><init>()V

    aput-object v5, v3, v4

    .line 300
    .local v3, "trustAllCerts":[Ljavax/net/ssl/TrustManager;
    :try_start_0
    const-string v4, "TLS"

    invoke-static {v4}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    .line 301
    .local v0, "context":Ljavax/net/ssl/SSLContext;
    const/4 v4, 0x0

    new-instance v5, Ljava/security/SecureRandom;

    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v4, v3, v5}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 302
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v4

    sput-object v4, Lio/fabric/sdk/android/services/network/HttpRequest;->TRUSTED_FACTORY:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    :cond_0
    sget-object v4, Lio/fabric/sdk/android/services/network/HttpRequest;->TRUSTED_FACTORY:Ljavax/net/ssl/SSLSocketFactory;

    return-object v4

    .line 303
    .end local v0    # "context":Ljavax/net/ssl/SSLContext;
    :catch_0
    move-exception v1

    .line 304
    .local v1, "e":Ljava/security/GeneralSecurityException;
    new-instance v2, Ljava/io/IOException;

    const-string v4, "Security exception configuring SSL context"

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 305
    .local v2, "ioException":Ljava/io/IOException;
    invoke-virtual {v2, v1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 306
    new-instance v4, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v4, v2}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v4
.end method

.method private static getTrustedVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .prologue
    .line 314
    sget-object v0, Lio/fabric/sdk/android/services/network/HttpRequest;->TRUSTED_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

    if-nez v0, :cond_0

    .line 315
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$2;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$2;-><init>()V

    sput-object v0, Lio/fabric/sdk/android/services/network/HttpRequest;->TRUSTED_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

    .line 322
    :cond_0
    sget-object v0, Lio/fabric/sdk/android/services/network/HttpRequest;->TRUSTED_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method private static getValidCharset(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "charset"    # Ljava/lang/String;

    .prologue
    .line 277
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 280
    .end local p0    # "charset":Ljava/lang/String;
    :goto_0
    return-object p0

    .restart local p0    # "charset":Ljava/lang/String;
    :cond_0
    const-string p0, "UTF-8"

    goto :goto_0
.end method

.method public static head(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1115
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "HEAD"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static head(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p2, "encode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;Z)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 1142
    .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 1143
    .local v0, "url":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->head(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static varargs head(Ljava/lang/CharSequence;Z[Ljava/lang/Object;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p1, "encode"    # Z
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 1159
    invoke-static {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1160
    .local v0, "url":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->head(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static head(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1126
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "HEAD"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method public static keepAlive(Z)V
    .locals 2
    .param p0, "keepAlive"    # Z

    .prologue
    .line 1215
    const-string v0, "http.keepAlive"

    invoke-static {p0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1216
    return-void
.end method

.method public static varargs nonProxyHosts([Ljava/lang/String;)V
    .locals 5
    .param p0, "hosts"    # [Ljava/lang/String;

    .prologue
    .line 1253
    if-eqz p0, :cond_1

    array-length v3, p0

    if-lez v3, :cond_1

    .line 1254
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1255
    .local v2, "separated":Ljava/lang/StringBuilder;
    array-length v3, p0

    add-int/lit8 v1, v3, -0x1

    .line 1256
    .local v1, "last":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v1, :cond_0

    .line 1257
    aget-object v3, p0, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x7c

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1256
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1258
    :cond_0
    aget-object v3, p0, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1259
    const-string v3, "http.nonProxyHosts"

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1262
    .end local v0    # "i":I
    .end local v1    # "last":I
    .end local v2    # "separated":Ljava/lang/StringBuilder;
    :goto_1
    return-void

    .line 1261
    :cond_1
    const-string v3, "http.nonProxyHosts"

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1
.end method

.method public static options(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1171
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "OPTIONS"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static options(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1182
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "OPTIONS"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method public static post(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 947
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "POST"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static post(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p2, "encode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;Z)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 974
    .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 975
    .local v0, "url":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->post(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static varargs post(Ljava/lang/CharSequence;Z[Ljava/lang/Object;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p1, "encode"    # Z
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 991
    invoke-static {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 992
    .local v0, "url":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->post(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static post(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 958
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "POST"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method public static proxyHost(Ljava/lang/String;)V
    .locals 1
    .param p0, "host"    # Ljava/lang/String;

    .prologue
    .line 1226
    const-string v0, "http.proxyHost"

    invoke-static {v0, p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1227
    const-string v0, "https.proxyHost"

    invoke-static {v0, p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1228
    return-void
.end method

.method public static proxyPort(I)V
    .locals 2
    .param p0, "port"    # I

    .prologue
    .line 1238
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 1239
    .local v0, "portValue":Ljava/lang/String;
    const-string v1, "http.proxyPort"

    invoke-static {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1240
    const-string v1, "https.proxyPort"

    invoke-static {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1241
    return-void
.end method

.method public static put(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1003
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "PUT"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static put(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p2, "encode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Map",
            "<**>;Z)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 1030
    .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 1031
    .local v0, "url":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->put(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static varargs put(Ljava/lang/CharSequence;Z[Ljava/lang/Object;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "baseUrl"    # Ljava/lang/CharSequence;
    .param p1, "encode"    # Z
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 1047
    invoke-static {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->append(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1048
    .local v0, "url":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->encode(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "url":Ljava/lang/String;
    :cond_0
    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->put(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public static put(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1014
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "PUT"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method

.method public static setConnectionFactory(Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;)V
    .locals 1
    .param p0, "connectionFactory"    # Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    .prologue
    .line 384
    if-nez p0, :cond_0

    .line 385
    sget-object v0, Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;->DEFAULT:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    sput-object v0, Lio/fabric/sdk/android/services/network/HttpRequest;->CONNECTION_FACTORY:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    .line 388
    :goto_0
    return-void

    .line 387
    :cond_0
    sput-object p0, Lio/fabric/sdk/android/services/network/HttpRequest;->CONNECTION_FACTORY:Lio/fabric/sdk/android/services/network/HttpRequest$ConnectionFactory;

    goto :goto_0
.end method

.method private static setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 1275
    if-eqz p1, :cond_0

    .line 1276
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$3;

    invoke-direct {v0, p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest$3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1289
    .local v0, "action":Ljava/security/PrivilegedAction;, "Ljava/security/PrivilegedAction<Ljava/lang/String;>;"
    :goto_0
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    return-object v1

    .line 1283
    .end local v0    # "action":Ljava/security/PrivilegedAction;, "Ljava/security/PrivilegedAction<Ljava/lang/String;>;"
    :cond_0
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$4;

    invoke-direct {v0, p0}, Lio/fabric/sdk/android/services/network/HttpRequest$4;-><init>(Ljava/lang/String;)V

    .restart local v0    # "action":Ljava/security/PrivilegedAction;, "Ljava/security/PrivilegedAction<Ljava/lang/String;>;"
    goto :goto_0
.end method

.method public static trace(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1193
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "TRACE"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    return-object v0
.end method

.method public static trace(Ljava/net/URL;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1204
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    const-string v1, "TRACE"

    invoke-direct {v0, p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public accept(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "accept"    # Ljava/lang/String;

    .prologue
    .line 2398
    const-string v0, "Accept"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public acceptCharset(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "acceptCharset"    # Ljava/lang/String;

    .prologue
    .line 2189
    const-string v0, "Accept-Charset"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public acceptEncoding(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "acceptEncoding"    # Ljava/lang/String;

    .prologue
    .line 2169
    const-string v0, "Accept-Encoding"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public acceptGzipEncoding()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1

    .prologue
    .line 2179
    const-string v0, "gzip"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->acceptEncoding(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public acceptJson()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1

    .prologue
    .line 2407
    const-string v0, "application/json"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->accept(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public authorization(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "authorization"    # Ljava/lang/String;

    .prologue
    .line 2271
    const-string v0, "Authorization"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public badRequest()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1462
    const/16 v0, 0x190

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public basic(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "password"    # Ljava/lang/String;

    .prologue
    .line 2292
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Basic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/fabric/sdk/android/services/network/HttpRequest$Base64;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->authorization(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public body(Ljava/util/concurrent/atomic/AtomicReference;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1619
    .local p1, "output":Ljava/util/concurrent/atomic/AtomicReference;, "Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->body()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1620
    return-object p0
.end method

.method public body(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p2, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1633
    .local p1, "output":Ljava/util/concurrent/atomic/AtomicReference;, "Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;>;"
    invoke-virtual {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->body(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1634
    return-object p0
.end method

.method public body()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1608
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->charset()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->body(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public body(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1592
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->byteStream()Ljava/io/ByteArrayOutputStream;

    move-result-object v1

    .line 1594
    .local v1, "output":Ljava/io/ByteArrayOutputStream;
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->buffer()Ljava/io/BufferedInputStream;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1595
    invoke-static {p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->getValidCharset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    return-object v2

    .line 1596
    :catch_0
    move-exception v0

    .line 1597
    .local v0, "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public buffer()Ljava/io/BufferedInputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1671
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->stream()Ljava/io/InputStream;

    move-result-object v1

    iget v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    return-object v0
.end method

.method public bufferSize()I
    .locals 1

    .prologue
    .line 1546
    iget v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    return v0
.end method

.method public bufferSize(I)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "size"    # I

    .prologue
    .line 1532
    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    .line 1533
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Size must be greater than zero"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1534
    :cond_0
    iput p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    .line 1535
    return-object p0
.end method

.method public bufferedReader()Ljava/io/BufferedReader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1757
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->charset()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferedReader(Ljava/lang/String;)Ljava/io/BufferedReader;

    move-result-object v0

    return-object v0
.end method

.method public bufferedReader(Ljava/lang/String;)Ljava/io/BufferedReader;
    .locals 3
    .param p1, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1745
    new-instance v0, Ljava/io/BufferedReader;

    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->reader(Ljava/lang/String;)Ljava/io/InputStreamReader;

    move-result-object v1

    iget v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    return-object v0
.end method

.method protected byteStream()Ljava/io/ByteArrayOutputStream;
    .locals 2

    .prologue
    .line 1575
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentLength()I

    move-result v0

    .line 1576
    .local v0, "size":I
    if-lez v0, :cond_0

    .line 1577
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 1579
    :goto_0
    return-object v1

    :cond_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    goto :goto_0
.end method

.method public bytes()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1654
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->byteStream()Ljava/io/ByteArrayOutputStream;

    move-result-object v1

    .line 1656
    .local v1, "output":Ljava/io/ByteArrayOutputStream;
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->buffer()Ljava/io/BufferedInputStream;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1660
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    return-object v2

    .line 1657
    :catch_0
    move-exception v0

    .line 1658
    .local v0, "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public cacheControl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2225
    const-string v0, "Cache-Control"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public charset()Ljava/lang/String;
    .locals 2

    .prologue
    .line 2128
    const-string v0, "Content-Type"

    const-string v1, "charset"

    invoke-virtual {p0, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->parameter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public chunk(I)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 1517
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 1518
    return-object p0
.end method

.method protected closeOutput()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2462
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    if-nez v0, :cond_0

    .line 2475
    :goto_0
    return-object p0

    .line 2464
    :cond_0
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->multipart:Z

    if-eqz v0, :cond_1

    .line 2465
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    const-string v1, "\r\n--00content0boundary00--\r\n"

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    .line 2466
    :cond_1
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    if-eqz v0, :cond_2

    .line 2468
    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2474
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    goto :goto_0

    .line 2473
    :cond_2
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->close()V

    goto :goto_1

    .line 2469
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method protected closeOutputQuietly()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2487
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutput()Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 2488
    :catch_0
    move-exception v0

    .line 2489
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public code()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1406
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1407
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    return v1

    .line 1408
    :catch_0
    move-exception v0

    .line 1409
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public code(Ljava/util/concurrent/atomic/AtomicInteger;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "output"    # Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1421
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1422
    return-object p0
.end method

.method public connectTimeout(I)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "timeout"    # I

    .prologue
    .line 1870
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 1871
    return-object p0
.end method

.method public contentEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2198
    const-string v0, "Content-Encoding"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public contentLength()I
    .locals 1

    .prologue
    .line 2367
    const-string v0, "Content-Length"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->intHeader(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public contentLength(I)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "contentLength"    # I

    .prologue
    .line 2387
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 2388
    return-object p0
.end method

.method public contentLength(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "contentLength"    # Ljava/lang/String;

    .prologue
    .line 2377
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentLength(I)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public contentType(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "contentType"    # Ljava/lang/String;

    .prologue
    .line 2334
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentType(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public contentType(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .param p1, "contentType"    # Ljava/lang/String;
    .param p2, "charset"    # Ljava/lang/String;

    .prologue
    .line 2345
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 2346
    const-string v0, "; charset="

    .line 2347
    .local v0, "separator":Ljava/lang/String;
    const-string v1, "Content-Type"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; charset="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    .line 2349
    .end local v0    # "separator":Ljava/lang/String;
    :goto_0
    return-object v1

    :cond_0
    const-string v1, "Content-Type"

    invoke-virtual {p0, v1, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    goto :goto_0
.end method

.method public contentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2358
    const-string v0, "Content-Type"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 6
    .param p1, "input"    # Ljava/io/InputStream;
    .param p2, "output"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2419
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$8;

    iget-boolean v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    move-object v1, p0

    move-object v2, p1

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/fabric/sdk/android/services/network/HttpRequest$8;-><init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$8;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v0
.end method

.method protected copy(Ljava/io/Reader;Ljava/io/Writer;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 6
    .param p1, "input"    # Ljava/io/Reader;
    .param p2, "output"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2441
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$9;

    iget-boolean v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    move-object v1, p0

    move-object v2, p1

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/fabric/sdk/android/services/network/HttpRequest$9;-><init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/Reader;Ljava/io/Writer;)V

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$9;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v0
.end method

.method public created()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1442
    const/16 v0, 0xc9

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public date()J
    .locals 2

    .prologue
    .line 2216
    const-string v0, "Date"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->dateHeader(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public dateHeader(Ljava/lang/String;)J
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1953
    const-wide/16 v0, -0x1

    invoke-virtual {p0, p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->dateHeader(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public dateHeader(Ljava/lang/String;J)J
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "defaultValue"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1966
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutputQuietly()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1967
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/HttpURLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public disconnect()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1

    .prologue
    .line 1506
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 1507
    return-object p0
.end method

.method public eTag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2234
    const-string v0, "ETag"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public expires()J
    .locals 2

    .prologue
    .line 2243
    const-string v0, "Expires"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->dateHeader(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public followRedirects(Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "followRedirects"    # Z

    .prologue
    .line 3016
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 3017
    return-object p0
.end method

.method public form(Ljava/lang/Object;Ljava/lang/Object;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2892
    const-string v0, "UTF-8"

    invoke-virtual {p0, p1, p2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->form(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public form(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .param p1, "name"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;
    .param p3, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 2908
    iget-boolean v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->form:Z

    if-nez v3, :cond_3

    move v1, v2

    .line 2909
    .local v1, "first":Z
    :goto_0
    if-eqz v1, :cond_0

    .line 2910
    const-string v3, "application/x-www-form-urlencoded"

    invoke-virtual {p0, v3, p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentType(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2911
    iput-boolean v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->form:Z

    .line 2913
    :cond_0
    invoke-static {p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->getValidCharset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 2915
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2916
    if-nez v1, :cond_1

    .line 2917
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    const/16 v3, 0x26

    invoke-virtual {v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(I)V

    .line 2918
    :cond_1
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    .line 2919
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    const/16 v3, 0x3d

    invoke-virtual {v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(I)V

    .line 2920
    if-eqz p2, :cond_2

    .line 2921
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2925
    :cond_2
    return-object p0

    .line 2908
    .end local v1    # "first":Z
    :cond_3
    const/4 v1, 0x0

    goto :goto_0

    .line 2922
    .restart local v1    # "first":Z
    :catch_0
    move-exception v0

    .line 2923
    .local v0, "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public form(Ljava/util/Map$Entry;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<**>;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2862
    .local p1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    const-string v0, "UTF-8"

    invoke-virtual {p0, p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->form(Ljava/util/Map$Entry;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public form(Ljava/util/Map$Entry;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p2, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<**>;",
            "Ljava/lang/String;",
            ")",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2877
    .local p1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->form(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public form(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<**>;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2848
    .local p1, "values":Ljava/util/Map;, "Ljava/util/Map<**>;"
    const-string v0, "UTF-8"

    invoke-virtual {p0, p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->form(Ljava/util/Map;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public form(Ljava/util/Map;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .param p2, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<**>;",
            "Ljava/lang/String;",
            ")",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2937
    .local p1, "values":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2938
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2939
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    invoke-virtual {p0, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->form(Ljava/util/Map$Entry;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    goto :goto_0

    .line 2940
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    .end local v1    # "i$":Ljava/util/Iterator;
    :cond_0
    return-object p0
.end method

.method public getConnection()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 1371
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->connection:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    .line 1372
    invoke-direct {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->createConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->connection:Ljava/net/HttpURLConnection;

    .line 1373
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->connection:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method protected getParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "paramName"    # Ljava/lang/String;

    .prologue
    const/16 v10, 0x22

    const/4 v6, 0x0

    const/16 v9, 0x3b

    const/4 v8, -0x1

    .line 2089
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_2

    :cond_0
    move-object v3, v6

    .line 2119
    :cond_1
    :goto_0
    return-object v3

    .line 2092
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 2093
    .local v1, "length":I
    invoke-virtual {p1, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v4, v7, 0x1

    .line 2094
    .local v4, "start":I
    if-eqz v4, :cond_3

    if-ne v4, v1, :cond_4

    :cond_3
    move-object v3, v6

    .line 2095
    goto :goto_0

    .line 2097
    :cond_4
    invoke-virtual {p1, v9, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2098
    .local v0, "end":I
    if-ne v0, v8, :cond_5

    .line 2099
    move v0, v1

    .line 2101
    :cond_5
    :goto_1
    if-ge v4, v0, :cond_7

    .line 2102
    const/16 v7, 0x3d

    invoke-virtual {p1, v7, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 2103
    .local v2, "nameEnd":I
    if-eq v2, v8, :cond_6

    if-ge v2, v0, :cond_6

    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 2104
    add-int/lit8 v7, v2, 0x1

    invoke-virtual {p1, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 2105
    .local v3, "paramValue":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    .line 2106
    .local v5, "valueLength":I
    if-eqz v5, :cond_6

    .line 2107
    const/4 v6, 0x2

    if-le v5, v6, :cond_1

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v10, v6, :cond_1

    add-int/lit8 v6, v5, -0x1

    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v10, v6, :cond_1

    .line 2108
    const/4 v6, 0x1

    add-int/lit8 v7, v5, -0x1

    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 2113
    .end local v3    # "paramValue":Ljava/lang/String;
    .end local v5    # "valueLength":I
    :cond_6
    add-int/lit8 v4, v0, 0x1

    .line 2114
    invoke-virtual {p1, v9, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2115
    if-ne v0, v8, :cond_5

    .line 2116
    move v0, v1

    goto :goto_1

    .end local v2    # "nameEnd":I
    :cond_7
    move-object v3, v6

    .line 2119
    goto :goto_0
.end method

.method protected getParams(Ljava/lang/String;)Ljava/util/Map;
    .locals 13
    .param p1, "header"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v12, 0x22

    const/16 v11, 0x3b

    const/4 v10, -0x1

    .line 2044
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2

    .line 2045
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v5

    .line 2078
    :cond_1
    :goto_0
    return-object v5

    .line 2047
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 2048
    .local v1, "headerLength":I
    invoke-virtual {p1, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    add-int/lit8 v6, v8, 0x1

    .line 2049
    .local v6, "start":I
    if-eqz v6, :cond_3

    if-ne v6, v1, :cond_4

    .line 2050
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v5

    goto :goto_0

    .line 2052
    :cond_4
    invoke-virtual {p1, v11, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2053
    .local v0, "end":I
    if-ne v0, v10, :cond_5

    .line 2054
    move v0, v1

    .line 2056
    :cond_5
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2057
    .local v5, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_6
    :goto_1
    if-ge v6, v0, :cond_1

    .line 2058
    const/16 v8, 0x3d

    invoke-virtual {p1, v8, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 2059
    .local v4, "nameEnd":I
    if-eq v4, v10, :cond_7

    if-ge v4, v0, :cond_7

    .line 2060
    invoke-virtual {p1, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 2061
    .local v3, "name":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_7

    .line 2062
    add-int/lit8 v8, v4, 0x1

    invoke-virtual {p1, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 2063
    .local v7, "value":Ljava/lang/String;
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    .line 2064
    .local v2, "length":I
    if-eqz v2, :cond_7

    .line 2065
    const/4 v8, 0x2

    if-le v2, v8, :cond_8

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v12, v8, :cond_8

    add-int/lit8 v8, v2, -0x1

    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v12, v8, :cond_8

    .line 2066
    const/4 v8, 0x1

    add-int/lit8 v9, v2, -0x1

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2072
    .end local v2    # "length":I
    .end local v3    # "name":Ljava/lang/String;
    .end local v7    # "value":Ljava/lang/String;
    :cond_7
    :goto_2
    add-int/lit8 v6, v0, 0x1

    .line 2073
    invoke-virtual {p1, v11, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 2074
    if-ne v0, v10, :cond_6

    .line 2075
    move v0, v1

    goto :goto_1

    .line 2068
    .restart local v2    # "length":I
    .restart local v3    # "name":Ljava/lang/String;
    .restart local v7    # "value":Ljava/lang/String;
    :cond_8
    invoke-interface {v5, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2
.end method

.method public header(Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Number;

    .prologue
    .line 1894
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 1882
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1883
    return-object p0
.end method

.method public header(Ljava/util/Map$Entry;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 1918
    .local p1, "header":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public header(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1929
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutputQuietly()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1930
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public headers(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 1905
    .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1906
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1907
    .local v0, "header":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/util/Map$Entry;)Lio/fabric/sdk/android/services/network/HttpRequest;

    goto :goto_0

    .line 1908
    .end local v0    # "header":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v1    # "i$":Ljava/util/Iterator;
    :cond_0
    return-object p0
.end method

.method public headers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1940
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutputQuietly()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1941
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public headers(Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 2003
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->headers()Ljava/util/Map;

    move-result-object v0

    .line 2004
    .local v0, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2005
    :cond_0
    sget-object v2, Lio/fabric/sdk/android/services/network/HttpRequest;->EMPTY_STRINGS:[Ljava/lang/String;

    .line 2011
    :goto_0
    return-object v2

    .line 2007
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 2008
    .local v1, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 2009
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    goto :goto_0

    .line 2011
    :cond_2
    sget-object v2, Lio/fabric/sdk/android/services/network/HttpRequest;->EMPTY_STRINGS:[Ljava/lang/String;

    goto :goto_0
.end method

.method public ifModifiedSince(J)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "ifModifiedSince"    # J

    .prologue
    .line 2313
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setIfModifiedSince(J)V

    .line 2314
    return-object p0
.end method

.method public ifNoneMatch(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "ifNoneMatch"    # Ljava/lang/String;

    .prologue
    .line 2324
    const-string v0, "If-None-Match"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public ignoreCloseExceptions(Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 0
    .param p1, "ignore"    # Z

    .prologue
    .line 1385
    iput-boolean p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    .line 1386
    return-object p0
.end method

.method public ignoreCloseExceptions()Z
    .locals 1

    .prologue
    .line 1395
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    return v0
.end method

.method public intHeader(Ljava/lang/String;)I
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1979
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->intHeader(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public intHeader(Ljava/lang/String;I)I
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "defaultValue"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1992
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutputQuietly()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1993
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public isBodyEmpty()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1644
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentLength()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public lastModified()J
    .locals 2

    .prologue
    .line 2252
    const-string v0, "Last-Modified"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->dateHeader(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public location()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2261
    const-string v0, "Location"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public message()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1493
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->closeOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 1494
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 1495
    :catch_0
    move-exception v0

    .line 1496
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public method()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2988
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public notFound()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1472
    const/16 v0, 0x194

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public notModified()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1482
    const/16 v0, 0x130

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ok()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1432
    const/16 v0, 0xc8

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2500
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    if-eqz v1, :cond_0

    .line 2505
    :goto_0
    return-object p0

    .line 2502
    :cond_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 2503
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v1

    const-string v2, "Content-Type"

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "charset"

    invoke-virtual {p0, v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->getParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2504
    .local v0, "charset":Ljava/lang/String;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    invoke-direct {v1, v2, v0, v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;-><init>(Ljava/io/OutputStream;Ljava/lang/String;I)V

    iput-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    goto :goto_0
.end method

.method public parameter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "headerName"    # Ljava/lang/String;
    .param p2, "paramName"    # Ljava/lang/String;

    .prologue
    .line 2022
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->getParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public parameters(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1, "headerName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2034
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getParams(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "part"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2640
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "part"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 2693
    invoke-virtual {p0, p1, v0, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "part"    # Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2614
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "part"    # Ljava/lang/String;

    .prologue
    .line 2566
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "part"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2653
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "part"    # Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2628
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "part"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2580
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "contentType"    # Ljava/lang/String;
    .param p4, "part"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2668
    const/4 v1, 0x0

    .line 2670
    .local v1, "stream":Ljava/io/InputStream;
    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2671
    .end local v1    # "stream":Ljava/io/InputStream;
    .local v2, "stream":Ljava/io/InputStream;
    :try_start_1
    invoke-virtual {p0, p1, p2, p3, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v3

    .line 2675
    if-eqz v2, :cond_0

    .line 2677
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2679
    :cond_0
    :goto_0
    return-object v3

    .line 2672
    .end local v2    # "stream":Ljava/io/InputStream;
    .restart local v1    # "stream":Ljava/io/InputStream;
    :catch_0
    move-exception v0

    .line 2673
    .local v0, "e":Ljava/io/IOException;
    :goto_1
    :try_start_3
    new-instance v3, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v3, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2675
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v3

    :goto_2
    if-eqz v1, :cond_1

    .line 2677
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 2679
    :cond_1
    :goto_3
    throw v3

    .line 2678
    .end local v1    # "stream":Ljava/io/InputStream;
    .restart local v2    # "stream":Ljava/io/InputStream;
    :catch_1
    move-exception v4

    goto :goto_0

    .end local v2    # "stream":Ljava/io/InputStream;
    .restart local v1    # "stream":Ljava/io/InputStream;
    :catch_2
    move-exception v4

    goto :goto_3

    .line 2675
    .end local v1    # "stream":Ljava/io/InputStream;
    .restart local v2    # "stream":Ljava/io/InputStream;
    :catchall_1
    move-exception v3

    move-object v1, v2

    .end local v2    # "stream":Ljava/io/InputStream;
    .restart local v1    # "stream":Ljava/io/InputStream;
    goto :goto_2

    .line 2672
    .end local v1    # "stream":Ljava/io/InputStream;
    .restart local v2    # "stream":Ljava/io/InputStream;
    :catch_3
    move-exception v0

    move-object v1, v2

    .end local v2    # "stream":Ljava/io/InputStream;
    .restart local v1    # "stream":Ljava/io/InputStream;
    goto :goto_1
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "contentType"    # Ljava/lang/String;
    .param p4, "part"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2709
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->startPart()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2710
    invoke-virtual {p0, p1, p2, p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->writePartHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2711
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {p0, p4, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2715
    return-object p0

    .line 2712
    :catch_0
    move-exception v0

    .line 2713
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "contentType"    # Ljava/lang/String;
    .param p4, "part"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2596
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->startPart()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2597
    invoke-virtual {p0, p1, p2, p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->writePartHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2598
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {v1, p4}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2602
    return-object p0

    .line 2599
    :catch_0
    move-exception v0

    .line 2600
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public partHeader(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2727
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public proxyAuthorization(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "proxyAuthorization"    # Ljava/lang/String;

    .prologue
    .line 2281
    const-string v0, "Proxy-Authorization"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public proxyBasic(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "password"    # Ljava/lang/String;

    .prologue
    .line 2303
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Basic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/fabric/sdk/android/services/network/HttpRequest$Base64;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->proxyAuthorization(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public readTimeout(I)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "timeout"    # I

    .prologue
    .line 1859
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 1860
    return-object p0
.end method

.method public reader()Ljava/io/InputStreamReader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1732
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->charset()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->reader(Ljava/lang/String;)Ljava/io/InputStreamReader;

    move-result-object v0

    return-object v0
.end method

.method public reader(Ljava/lang/String;)Ljava/io/InputStreamReader;
    .locals 4
    .param p1, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1719
    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->stream()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->getValidCharset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 1720
    :catch_0
    move-exception v0

    .line 1721
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public receive(Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1770
    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1774
    .local v1, "output":Ljava/io/OutputStream;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$5;

    iget-boolean v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    invoke-direct {v2, p0, v1, v3, v1}, Lio/fabric/sdk/android/services/network/HttpRequest$5;-><init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/OutputStream;)V

    invoke-virtual {v2}, Lio/fabric/sdk/android/services/network/HttpRequest$5;->call()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v2

    .line 1771
    .end local v1    # "output":Ljava/io/OutputStream;
    :catch_0
    move-exception v0

    .line 1772
    .local v0, "e":Ljava/io/FileNotFoundException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public receive(Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "output"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1792
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->buffer()Ljava/io/BufferedInputStream;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 1793
    :catch_0
    move-exception v0

    .line 1794
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public receive(Ljava/io/PrintStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "output"    # Ljava/io/PrintStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1806
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->receive(Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public receive(Ljava/io/Writer;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 6
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1842
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferedReader()Ljava/io/BufferedReader;

    move-result-object v2

    .line 1843
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$7;

    iget-boolean v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    move-object v1, p0

    move-object v4, v2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lio/fabric/sdk/android/services/network/HttpRequest$7;-><init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/BufferedReader;Ljava/io/Writer;)V

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$7;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v0
.end method

.method public receive(Ljava/lang/Appendable;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 6
    .param p1, "appendable"    # Ljava/lang/Appendable;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1817
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->bufferedReader()Ljava/io/BufferedReader;

    move-result-object v2

    .line 1818
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpRequest$6;

    iget-boolean v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->ignoreCloseExceptions:Z

    move-object v1, p0

    move-object v4, v2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lio/fabric/sdk/android/services/network/HttpRequest$6;-><init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/BufferedReader;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$6;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v0
.end method

.method public referer(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "referer"    # Ljava/lang/String;

    .prologue
    .line 2148
    const-string v0, "Referer"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public send(Ljava/io/File;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .param p1, "input"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2740
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2744
    .local v1, "stream":Ljava/io/InputStream;
    invoke-virtual {p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v2

    return-object v2

    .line 2741
    .end local v1    # "stream":Ljava/io/InputStream;
    :catch_0
    move-exception v0

    .line 2742
    .local v0, "e":Ljava/io/FileNotFoundException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public send(Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "input"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2769
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2770
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-virtual {p0, p1, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2774
    return-object p0

    .line 2771
    :catch_0
    move-exception v0

    .line 2772
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public send(Ljava/io/Reader;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .param p1, "input"    # Ljava/io/Reader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2788
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2792
    new-instance v1, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    iget-object v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    # getter for: Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->encoder:Ljava/nio/charset/CharsetEncoder;
    invoke-static {v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->access$200(Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;)Ljava/nio/charset/CharsetEncoder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2793
    .local v1, "writer":Ljava/io/Writer;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$10;

    invoke-direct {v2, p0, v1, p1, v1}, Lio/fabric/sdk/android/services/network/HttpRequest$10;-><init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Flushable;Ljava/io/Reader;Ljava/io/Writer;)V

    invoke-virtual {v2}, Lio/fabric/sdk/android/services/network/HttpRequest$10;->call()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v2

    .line 2789
    .end local v1    # "writer":Ljava/io/Writer;
    :catch_0
    move-exception v0

    .line 2790
    .local v0, "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public send(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .param p1, "value"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2814
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2815
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2819
    return-object p0

    .line 2816
    :catch_0
    move-exception v0

    .line 2817
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public send([B)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "input"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2755
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public server()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2207
    const-string v0, "Server"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public serverError()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1452
    const/16 v0, 0x1f4

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected startPart()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2515
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->multipart:Z

    if-nez v0, :cond_0

    .line 2516
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->multipart:Z

    .line 2517
    const-string v0, "multipart/form-data; boundary=00content0boundary00"

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentType(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2518
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    const-string v1, "--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    .line 2521
    :goto_0
    return-object p0

    .line 2520
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    const-string v1, "\r\n--00content0boundary00\r\n"

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->write(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    goto :goto_0
.end method

.method public stream()Ljava/io/InputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 1682
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result v2

    const/16 v3, 0x190

    if-ge v2, v3, :cond_2

    .line 1684
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 1698
    .local v1, "stream":Ljava/io/InputStream;
    :cond_0
    :goto_0
    iget-boolean v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->uncompress:Z

    if-eqz v2, :cond_1

    const-string v2, "gzip"

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->contentEncoding()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1702
    .end local v1    # "stream":Ljava/io/InputStream;
    :cond_1
    :goto_1
    return-object v1

    .line 1685
    :catch_0
    move-exception v0

    .line 1686
    .local v0, "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2

    .line 1689
    .end local v0    # "e":Ljava/io/IOException;
    :cond_2
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    .line 1690
    .restart local v1    # "stream":Ljava/io/InputStream;
    if-nez v1, :cond_0

    .line 1692
    :try_start_1
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    goto :goto_0

    .line 1693
    :catch_1
    move-exception v0

    .line 1694
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2

    .line 1702
    .end local v0    # "e":Ljava/io/IOException;
    :cond_3
    :try_start_2
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v2, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v2

    goto :goto_1

    .line 1703
    :catch_2
    move-exception v0

    .line 1704
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->method()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->url()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trustAllCerts()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2952
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 2953
    .local v0, "connection":Ljava/net/HttpURLConnection;
    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_0

    .line 2954
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .end local v0    # "connection":Ljava/net/HttpURLConnection;
    invoke-static {}, Lio/fabric/sdk/android/services/network/HttpRequest;->getTrustedFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 2955
    :cond_0
    return-object p0
.end method

.method public trustAllHosts()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2

    .prologue
    .line 2967
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 2968
    .local v0, "connection":Ljava/net/HttpURLConnection;
    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_0

    .line 2969
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .end local v0    # "connection":Ljava/net/HttpURLConnection;
    invoke-static {}, Lio/fabric/sdk/android/services/network/HttpRequest;->getTrustedVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 2970
    :cond_0
    return-object p0
.end method

.method public uncompress(Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 0
    .param p1, "uncompress"    # Z

    .prologue
    .line 1565
    iput-boolean p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->uncompress:Z

    .line 1566
    return-object p0
.end method

.method public url()Ljava/net/URL;
    .locals 1

    .prologue
    .line 2979
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public useCaches(Z)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "useCaches"    # Z

    .prologue
    .line 2158
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 2159
    return-object p0
.end method

.method public useProxy(Ljava/lang/String;I)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 2
    .param p1, "proxyHost"    # Ljava/lang/String;
    .param p2, "proxyPort"    # I

    .prologue
    .line 3000
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->connection:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 3001
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The connection has already been created. This method must be called before reading or writing to the request."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3004
    :cond_0
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->httpProxyHost:Ljava/lang/String;

    .line 3005
    iput p2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->httpProxyPort:I

    .line 3006
    return-object p0
.end method

.method public userAgent(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "userAgent"    # Ljava/lang/String;

    .prologue
    .line 2138
    const-string v0, "User-Agent"

    invoke-virtual {p0, v0, p1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method protected writePartHeader(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2533
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->writePartHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method protected writePartHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "contentType"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2547
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2548
    .local v0, "partBuffer":Ljava/lang/StringBuilder;
    const-string v1, "form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2549
    if-eqz p2, :cond_0

    .line 2550
    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2551
    :cond_0
    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2552
    const-string v1, "Content-Disposition"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->partHeader(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2553
    if-eqz p3, :cond_1

    .line 2554
    const-string v1, "Content-Type"

    invoke-virtual {p0, v1, p3}, Lio/fabric/sdk/android/services/network/HttpRequest;->partHeader(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2555
    :cond_1
    const-string v1, "\r\n"

    invoke-virtual {p0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method public writer()Ljava/io/OutputStreamWriter;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 2830
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest;->openOutput()Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 2831
    new-instance v1, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    iget-object v3, p0, Lio/fabric/sdk/android/services/network/HttpRequest;->output:Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;

    # getter for: Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->encoder:Ljava/nio/charset/CharsetEncoder;
    invoke-static {v3}, Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;->access$200(Lio/fabric/sdk/android/services/network/HttpRequest$RequestOutputStream;)Ljava/nio/charset/CharsetEncoder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 2832
    :catch_0
    move-exception v0

    .line 2833
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method
