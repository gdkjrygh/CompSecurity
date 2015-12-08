.class public Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;
.super Ljava/lang/Object;
.source "DefaultHttpRequestFactory.java"

# interfaces
.implements Lio/fabric/sdk/android/services/network/HttpRequestFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory$1;
    }
.end annotation


# static fields
.field private static final HTTPS:Ljava/lang/String; = "https"


# instance fields
.field private attemptedSslInit:Z

.field private final logger:Lio/fabric/sdk/android/Logger;

.field private pinningInfo:Lio/fabric/sdk/android/services/network/PinningInfoProvider;

.field private sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 49
    new-instance v0, Lio/fabric/sdk/android/DefaultLogger;

    invoke-direct {v0}, Lio/fabric/sdk/android/DefaultLogger;-><init>()V

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;-><init>(Lio/fabric/sdk/android/Logger;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/Logger;)V
    .locals 0
    .param p1, "logger"    # Lio/fabric/sdk/android/Logger;

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->logger:Lio/fabric/sdk/android/Logger;

    .line 54
    return-void
.end method

.method private declared-synchronized getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .prologue
    .line 122
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->attemptedSslInit:Z

    if-nez v0, :cond_0

    .line 123
    invoke-direct {p0}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->initSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 125
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 122
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized initSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 5

    .prologue
    .line 129
    monitor-enter p0

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->attemptedSslInit:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :try_start_1
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->pinningInfo:Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    invoke-static {v2}, Lio/fabric/sdk/android/services/network/NetworkUtils;->getSSLSocketFactory(Lio/fabric/sdk/android/services/network/PinningInfoProvider;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    .line 134
    .local v1, "sslSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->logger:Lio/fabric/sdk/android/Logger;

    const-string v3, "Fabric"

    const-string v4, "Custom SSL pinning enabled"

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .end local v1    # "sslSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    :goto_0
    monitor-exit p0

    return-object v1

    .line 136
    :catch_0
    move-exception v0

    .line 137
    .local v0, "e":Ljava/lang/Exception;
    :try_start_2
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->logger:Lio/fabric/sdk/android/Logger;

    const-string v3, "Fabric"

    const-string v4, "Exception while validating pinned certs"

    invoke-interface {v2, v3, v4, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    const/4 v1, 0x0

    goto :goto_0

    .line 129
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private isHttps(Ljava/lang/String;)Z
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 118
    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private declared-synchronized resetSSLSocketFactory()V
    .locals 1

    .prologue
    .line 70
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->attemptedSslInit:Z

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit p0

    return-void

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1
    .param p1, "method"    # Lio/fabric/sdk/android/services/network/HttpMethod;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 76
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method public buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 5
    .param p1, "method"    # Lio/fabric/sdk/android/services/network/HttpMethod;
    .param p2, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/network/HttpMethod;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation

    .prologue
    .local p3, "queryParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v4, 0x1

    .line 83
    sget-object v2, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory$1;->$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod:[I

    invoke-virtual {p1}, Lio/fabric/sdk/android/services/network/HttpMethod;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 101
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unsupported HTTP method!"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 85
    :pswitch_0
    invoke-static {p2, p3, v4}, Lio/fabric/sdk/android/services/network/HttpRequest;->get(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 105
    .local v0, "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    :goto_0
    invoke-direct {p0, p2}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->isHttps(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->pinningInfo:Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    if-eqz v2, :cond_0

    .line 106
    invoke-direct {p0}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    .line 108
    .local v1, "sslSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    if-eqz v1, :cond_0

    .line 109
    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v2

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v2, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 114
    .end local v1    # "sslSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    :cond_0
    return-object v0

    .line 89
    .end local v0    # "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    :pswitch_1
    invoke-static {p2, p3, v4}, Lio/fabric/sdk/android/services/network/HttpRequest;->post(Ljava/lang/CharSequence;Ljava/util/Map;Z)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 90
    .restart local v0    # "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    goto :goto_0

    .line 93
    .end local v0    # "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    :pswitch_2
    invoke-static {p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->put(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 94
    .restart local v0    # "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    goto :goto_0

    .line 97
    .end local v0    # "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    :pswitch_3
    invoke-static {p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->delete(Ljava/lang/CharSequence;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 98
    .restart local v0    # "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    goto :goto_0

    .line 83
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public getPinningInfoProvider()Lio/fabric/sdk/android/services/network/PinningInfoProvider;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->pinningInfo:Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    return-object v0
.end method

.method public setPinningInfoProvider(Lio/fabric/sdk/android/services/network/PinningInfoProvider;)V
    .locals 1
    .param p1, "pinningInfo"    # Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    .prologue
    .line 63
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->pinningInfo:Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    if-eq v0, p1, :cond_0

    .line 64
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->pinningInfo:Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    .line 65
    invoke-direct {p0}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;->resetSSLSocketFactory()V

    .line 67
    :cond_0
    return-void
.end method
