.class Lio/fabric/sdk/android/services/network/SystemKeyStore;
.super Ljava/lang/Object;
.source "SystemKeyStore.java"


# instance fields
.field private final trustRoots:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/security/Principal;",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field final trustStore:Ljava/security/KeyStore;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 2
    .param p1, "keystoreStream"    # Ljava/io/InputStream;
    .param p2, "passwd"    # Ljava/lang/String;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-direct {p0, p1, p2}, Lio/fabric/sdk/android/services/network/SystemKeyStore;->getTrustStore(Ljava/io/InputStream;Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    .line 46
    .local v0, "trustStore":Ljava/security/KeyStore;
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/network/SystemKeyStore;->initializeTrustedRoots(Ljava/security/KeyStore;)Ljava/util/HashMap;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/services/network/SystemKeyStore;->trustRoots:Ljava/util/HashMap;

    .line 47
    iput-object v0, p0, Lio/fabric/sdk/android/services/network/SystemKeyStore;->trustStore:Ljava/security/KeyStore;

    .line 48
    return-void
.end method

.method private getTrustStore(Ljava/io/InputStream;Ljava/lang/String;)Ljava/security/KeyStore;
    .locals 5
    .param p1, "keystoreStream"    # Ljava/io/InputStream;
    .param p2, "passwd"    # Ljava/lang/String;

    .prologue
    .line 98
    :try_start_0
    const-string v4, "BKS"

    invoke-static {v4}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v3

    .line 99
    .local v3, "trustStore":Ljava/security/KeyStore;
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 102
    .local v0, "bin":Ljava/io/BufferedInputStream;
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    .line 107
    return-object v3

    .line 104
    :catchall_0
    move-exception v4

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    throw v4
    :try_end_2
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 108
    .end local v0    # "bin":Ljava/io/BufferedInputStream;
    .end local v3    # "trustStore":Ljava/security/KeyStore;
    :catch_0
    move-exception v2

    .line 109
    .local v2, "kse":Ljava/security/KeyStoreException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4

    .line 110
    .end local v2    # "kse":Ljava/security/KeyStoreException;
    :catch_1
    move-exception v1

    .line 111
    .local v1, "e":Ljava/security/NoSuchAlgorithmException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4

    .line 112
    .end local v1    # "e":Ljava/security/NoSuchAlgorithmException;
    :catch_2
    move-exception v1

    .line 113
    .local v1, "e":Ljava/security/cert/CertificateException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4

    .line 114
    .end local v1    # "e":Ljava/security/cert/CertificateException;
    :catch_3
    move-exception v1

    .line 115
    .local v1, "e":Ljava/io/IOException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4
.end method

.method private initializeTrustedRoots(Ljava/security/KeyStore;)Ljava/util/HashMap;
    .locals 6
    .param p1, "trustStore"    # Ljava/security/KeyStore;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/security/KeyStore;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/security/Principal;",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    .prologue
    .line 77
    :try_start_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 80
    .local v4, "trusted":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/security/Principal;Ljava/security/cert/X509Certificate;>;"
    invoke-virtual {p1}, Ljava/security/KeyStore;->aliases()Ljava/util/Enumeration;

    move-result-object v1

    .line 81
    .local v1, "aliases":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 82
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 83
    .local v0, "alias":Ljava/lang/String;
    invoke-virtual {p1, v0}, Ljava/security/KeyStore;->getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 85
    .local v2, "cert":Ljava/security/cert/X509Certificate;
    if-eqz v2, :cond_0

    .line 86
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 91
    .end local v0    # "alias":Ljava/lang/String;
    .end local v1    # "aliases":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/lang/String;>;"
    .end local v2    # "cert":Ljava/security/cert/X509Certificate;
    .end local v4    # "trusted":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/security/Principal;Ljava/security/cert/X509Certificate;>;"
    :catch_0
    move-exception v3

    .line 92
    .local v3, "e":Ljava/security/KeyStoreException;
    new-instance v5, Ljava/lang/AssertionError;

    invoke-direct {v5, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v5

    .line 90
    .end local v3    # "e":Ljava/security/KeyStoreException;
    .restart local v1    # "aliases":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/lang/String;>;"
    .restart local v4    # "trusted":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/security/Principal;Ljava/security/cert/X509Certificate;>;"
    :cond_1
    return-object v4
.end method


# virtual methods
.method public getTrustRootFor(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;
    .locals 5
    .param p1, "certificate"    # Ljava/security/cert/X509Certificate;

    .prologue
    const/4 v2, 0x0

    .line 56
    iget-object v3, p0, Lio/fabric/sdk/android/services/network/SystemKeyStore;->trustRoots:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 58
    .local v1, "trustRoot":Ljava/security/cert/X509Certificate;
    if-nez v1, :cond_0

    move-object v1, v2

    .line 72
    .end local v1    # "trustRoot":Ljava/security/cert/X509Certificate;
    :goto_0
    return-object v1

    .line 62
    .restart local v1    # "trustRoot":Ljava/security/cert/X509Certificate;
    :cond_0
    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    .line 63
    goto :goto_0

    .line 67
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 68
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/security/GeneralSecurityException;
    move-object v1, v2

    .line 69
    goto :goto_0
.end method

.method public isTrustRoot(Ljava/security/cert/X509Certificate;)Z
    .locals 3
    .param p1, "certificate"    # Ljava/security/cert/X509Certificate;

    .prologue
    .line 51
    iget-object v1, p0, Lio/fabric/sdk/android/services/network/SystemKeyStore;->trustRoots:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 52
    .local v0, "trustRoot":Ljava/security/cert/X509Certificate;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method
