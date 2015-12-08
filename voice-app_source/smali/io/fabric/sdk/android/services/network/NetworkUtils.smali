.class public final Lio/fabric/sdk/android/services/network/NetworkUtils;
.super Ljava/lang/Object;
.source "NetworkUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method public static final getSSLSocketFactory(Lio/fabric/sdk/android/services/network/PinningInfoProvider;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 6
    .param p0, "provider"    # Lio/fabric/sdk/android/services/network/PinningInfoProvider;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyManagementException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 37
    const-string v3, "TLS"

    invoke-static {v3}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v1

    .line 38
    .local v1, "sslContext":Ljavax/net/ssl/SSLContext;
    new-instance v0, Lio/fabric/sdk/android/services/network/SystemKeyStore;

    invoke-interface {p0}, Lio/fabric/sdk/android/services/network/PinningInfoProvider;->getKeyStoreStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-interface {p0}, Lio/fabric/sdk/android/services/network/PinningInfoProvider;->getKeyStorePassword()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lio/fabric/sdk/android/services/network/SystemKeyStore;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 40
    .local v0, "keystore":Lio/fabric/sdk/android/services/network/SystemKeyStore;
    new-instance v2, Lio/fabric/sdk/android/services/network/PinningTrustManager;

    invoke-direct {v2, v0, p0}, Lio/fabric/sdk/android/services/network/PinningTrustManager;-><init>(Lio/fabric/sdk/android/services/network/SystemKeyStore;Lio/fabric/sdk/android/services/network/PinningInfoProvider;)V

    .line 41
    .local v2, "tm":Ljavax/net/ssl/TrustManager;
    const/4 v3, 0x1

    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-virtual {v1, v5, v3, v5}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 42
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    return-object v3
.end method
