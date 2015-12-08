.class public Lcom/urbanairship/restclient/Request;
.super Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/restclient/Request$BackgroundRequest;
    }
.end annotation


# static fields
.field private static final BUFFER_SIZE:I = 0x2000

.field private static final DEFAULT_SOCKET_BUFFER_SIZE:I = 0x4000

.field private static final DEFAULT_TIMEOUT_MS:I = 0xea60

.field private static final MAX_PREFETCH_BODY_LENGTH:J = 0x100000L

.field private static final USER_AGENT_FORMAT:Ljava/lang/String; = "%s (%s; %s; %s; %s; %s)"

.field public static verifySSLHostnames:Z


# instance fields
.field destination:Ljava/io/File;

.field httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

.field method:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x1

    sput-boolean v0, Lcom/urbanairship/restclient/Request;->verifySSLHostnames:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "httpMethod"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 74
    invoke-direct {p0}, Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;-><init>()V

    .line 75
    iput-object p1, p0, Lcom/urbanairship/restclient/Request;->method:Ljava/lang/String;

    .line 76
    invoke-static {p2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/urbanairship/restclient/Request;->setURI(Ljava/net/URI;)V

    .line 78
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/restclient/Request;->params:Lorg/apache/http/params/HttpParams;

    .line 80
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    iget-object v1, p0, Lcom/urbanairship/restclient/Request;->params:Lorg/apache/http/params/HttpParams;

    invoke-direct {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    iput-object v0, p0, Lcom/urbanairship/restclient/Request;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 83
    const/16 v0, 0x4000

    invoke-virtual {p0, v0}, Lcom/urbanairship/restclient/Request;->setSocketBufferSize(I)V

    .line 84
    const v0, 0xea60

    invoke-virtual {p0, v0}, Lcom/urbanairship/restclient/Request;->setTimeout(I)V

    .line 85
    invoke-direct {p0}, Lcom/urbanairship/restclient/Request;->setUserAgent()V

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set Timeout: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/restclient/Request;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/http/params/HttpConnectionParams;->getConnectionTimeout(Lorg/apache/http/params/HttpParams;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set Socket Buffer Size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/restclient/Request;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/http/params/HttpConnectionParams;->getSocketBufferSize(Lorg/apache/http/params/HttpParams;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 89
    return-void
.end method

.method private setUserAgent()V
    .locals 7

    .prologue
    .line 93
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "%s (%s; %s; %s; %s; %s)"

    const/4 v3, 0x6

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UrbanAirshipLib/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lcom/urbanairship/UAirship;->getVersion()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x4

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 96
    .local v0, "userAgent":Ljava/lang/String;
    iget-object v1, p0, Lcom/urbanairship/restclient/Request;->params:Lorg/apache/http/params/HttpParams;

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 97
    return-void
.end method


# virtual methods
.method public execute()Lcom/urbanairship/restclient/Response;
    .locals 5

    .prologue
    .line 163
    const/4 v1, 0x0

    .line 165
    .local v1, "r":Lcom/urbanairship/restclient/Response;
    :try_start_0
    new-instance v2, Lcom/urbanairship/restclient/Response;

    iget-object v3, p0, Lcom/urbanairship/restclient/Request;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v3, p0}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/urbanairship/restclient/Response;-><init>(Lorg/apache/http/HttpResponse;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v1    # "r":Lcom/urbanairship/restclient/Response;
    .local v2, "r":Lcom/urbanairship/restclient/Response;
    move-object v1, v2

    .line 169
    .end local v2    # "r":Lcom/urbanairship/restclient/Response;
    .restart local v1    # "r":Lcom/urbanairship/restclient/Response;
    :goto_0
    return-object v1

    .line 166
    :catch_0
    move-exception v0

    .line 167
    .local v0, "e":Ljava/io/IOException;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOException when executing request. Do you have permission to access the internet? ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public executeAsync(Lcom/urbanairship/restclient/AsyncHandler;)V
    .locals 3
    .param p1, "asyncHandler"    # Lcom/urbanairship/restclient/AsyncHandler;

    .prologue
    .line 185
    move-object v0, p0

    .line 187
    .local v0, "r":Lcom/urbanairship/restclient/Request;
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 189
    .local v1, "uiLoopHandler":Landroid/os/Handler;
    new-instance v2, Lcom/urbanairship/restclient/Request$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/urbanairship/restclient/Request$1;-><init>(Lcom/urbanairship/restclient/Request;Lcom/urbanairship/restclient/AsyncHandler;Lcom/urbanairship/restclient/Request;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 199
    return-void
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/urbanairship/restclient/Request;->method:Ljava/lang/String;

    return-object v0
.end method

.method public setAuth(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "username"    # Ljava/lang/String;
    .param p2, "password"    # Ljava/lang/String;

    .prologue
    .line 123
    new-instance v1, Lorg/apache/http/auth/UsernamePasswordCredentials;

    invoke-direct {v1, p1, p2}, Lorg/apache/http/auth/UsernamePasswordCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .local v1, "creds":Lorg/apache/http/auth/Credentials;
    new-instance v0, Lorg/apache/http/impl/client/BasicCredentialsProvider;

    invoke-direct {v0}, Lorg/apache/http/impl/client/BasicCredentialsProvider;-><init>()V

    .line 125
    .local v0, "basicAuth":Lorg/apache/http/impl/client/BasicCredentialsProvider;
    sget-object v2, Lorg/apache/http/auth/AuthScope;->ANY:Lorg/apache/http/auth/AuthScope;

    invoke-virtual {v0, v2, v1}, Lorg/apache/http/impl/client/BasicCredentialsProvider;->setCredentials(Lorg/apache/http/auth/AuthScope;Lorg/apache/http/auth/Credentials;)V

    .line 126
    iget-object v2, p0, Lcom/urbanairship/restclient/Request;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v2, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->setCredentialsProvider(Lorg/apache/http/client/CredentialsProvider;)V

    .line 127
    return-void
.end method

.method public setDestination(Ljava/io/File;)V
    .locals 0
    .param p1, "path"    # Ljava/io/File;

    .prologue
    .line 113
    iput-object p1, p0, Lcom/urbanairship/restclient/Request;->destination:Ljava/io/File;

    .line 114
    return-void
.end method

.method public setPreemptiveAuth(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "username"    # Ljava/lang/String;
    .param p2, "password"    # Ljava/lang/String;

    .prologue
    .line 137
    new-instance v0, Lorg/apache/http/auth/UsernamePasswordCredentials;

    invoke-direct {v0, p1, p2}, Lorg/apache/http/auth/UsernamePasswordCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .local v0, "creds":Lorg/apache/http/auth/UsernamePasswordCredentials;
    :try_start_0
    new-instance v2, Lorg/apache/http/impl/auth/BasicScheme;

    invoke-direct {v2}, Lorg/apache/http/impl/auth/BasicScheme;-><init>()V

    invoke-virtual {v2, v0, p0}, Lorg/apache/http/impl/auth/BasicScheme;->authenticate(Lorg/apache/http/auth/Credentials;Lorg/apache/http/HttpRequest;)Lorg/apache/http/Header;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/urbanairship/restclient/Request;->addHeader(Lorg/apache/http/Header;)V
    :try_end_0
    .catch Lorg/apache/http/auth/AuthenticationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :goto_0
    return-void

    .line 140
    :catch_0
    move-exception v1

    .line 141
    .local v1, "e":Lorg/apache/http/auth/AuthenticationException;
    const-string v2, "Attempted to set invalid or non-applicable request credentials"

    invoke-static {v2, v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setSocketBufferSize(I)V
    .locals 1
    .param p1, "sizeInBytes"    # I

    .prologue
    .line 104
    iget-object v0, p0, Lcom/urbanairship/restclient/Request;->params:Lorg/apache/http/params/HttpParams;

    invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 105
    return-void
.end method

.method public setTimeout(I)V
    .locals 1
    .param p1, "miliseconds"    # I

    .prologue
    .line 100
    iget-object v0, p0, Lcom/urbanairship/restclient/Request;->params:Lorg/apache/http/params/HttpParams;

    invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 101
    return-void
.end method
