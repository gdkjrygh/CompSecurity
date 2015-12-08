.class public abstract Lio/fabric/sdk/android/services/common/AbstractSpiCall;
.super Ljava/lang/Object;
.source "AbstractSpiCall.java"


# static fields
.field public static final ACCEPT_JSON_VALUE:Ljava/lang/String; = "application/json"

.field public static final ANDROID_CLIENT_TYPE:Ljava/lang/String; = "android"

.field public static final CLS_ANDROID_SDK_DEVELOPER_TOKEN:Ljava/lang/String; = "470fa2b4ae81cd56ecbcda9735803434cec591fa"

.field public static final CRASHLYTICS_USER_AGENT:Ljava/lang/String; = "Crashlytics Android SDK/"

.field public static final DEFAULT_TIMEOUT:I = 0x2710

.field public static final HEADER_ACCEPT:Ljava/lang/String; = "Accept"

.field public static final HEADER_API_KEY:Ljava/lang/String; = "X-CRASHLYTICS-API-KEY"

.field public static final HEADER_CLIENT_TYPE:Ljava/lang/String; = "X-CRASHLYTICS-API-CLIENT-TYPE"

.field public static final HEADER_CLIENT_VERSION:Ljava/lang/String; = "X-CRASHLYTICS-API-CLIENT-VERSION"

.field public static final HEADER_D:Ljava/lang/String; = "X-CRASHLYTICS-D"

.field public static final HEADER_DEVELOPER_TOKEN:Ljava/lang/String; = "X-CRASHLYTICS-DEVELOPER-TOKEN"

.field public static final HEADER_DEVICE_STATE:Ljava/lang/String; = "X-CRASHLYTICS-DEVICE-STATE"

.field public static final HEADER_REQUEST_ID:Ljava/lang/String; = "X-REQUEST-ID"

.field public static final HEADER_USER_AGENT:Ljava/lang/String; = "User-Agent"

.field private static final PROTOCOL_AND_HOST_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field protected final kit:Lio/fabric/sdk/android/Kit;

.field private final method:Lio/fabric/sdk/android/services/network/HttpMethod;

.field private final protocolAndHostOverride:Ljava/lang/String;

.field private final requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 57
    const-string v0, "http(s?)://[^\\/]+"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->PROTOCOL_AND_HOST_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lio/fabric/sdk/android/services/network/HttpMethod;)V
    .locals 2
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;
    .param p2, "protocolAndHostOverride"    # Ljava/lang/String;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "requestFactory"    # Lio/fabric/sdk/android/services/network/HttpRequestFactory;
    .param p5, "method"    # Lio/fabric/sdk/android/services/network/HttpMethod;

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    if-nez p3, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    if-nez p4, :cond_1

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "requestFactory must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_1
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->kit:Lio/fabric/sdk/android/Kit;

    .line 95
    iput-object p2, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->protocolAndHostOverride:Ljava/lang/String;

    .line 96
    invoke-direct {p0, p3}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->overrideProtocolAndHost(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->url:Ljava/lang/String;

    .line 97
    iput-object p4, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .line 98
    iput-object p5, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->method:Lio/fabric/sdk/android/services/network/HttpMethod;

    .line 99
    return-void
.end method

.method private overrideProtocolAndHost(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 157
    move-object v0, p1

    .line 159
    .local v0, "toReturn":Ljava/lang/String;
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->protocolAndHostOverride:Ljava/lang/String;

    invoke-static {v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 160
    sget-object v1, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->PROTOCOL_AND_HOST_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    iget-object v2, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->protocolAndHostOverride:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 164
    :cond_0
    return-object v0
.end method


# virtual methods
.method protected getHttpRequest()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1

    .prologue
    .line 119
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->getHttpRequest(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method protected getHttpRequest(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 5
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
    .line 139
    .local p1, "queryParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    iget-object v2, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->method:Lio/fabric/sdk/android/services/network/HttpMethod;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, p1}, Lio/fabric/sdk/android/services/network/HttpRequestFactory;->buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 141
    .local v0, "httpRequest":Lio/fabric/sdk/android/services/network/HttpRequest;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->useCaches(Z)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->connectTimeout(I)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    const-string v2, "User-Agent"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Crashlytics Android SDK/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v4}, Lio/fabric/sdk/android/Kit;->getVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    const-string v2, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    const-string v3, "470fa2b4ae81cd56ecbcda9735803434cec591fa"

    invoke-virtual {v1, v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v1

    return-object v1
.end method

.method protected getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AbstractSpiCall;->url:Ljava/lang/String;

    return-object v0
.end method
