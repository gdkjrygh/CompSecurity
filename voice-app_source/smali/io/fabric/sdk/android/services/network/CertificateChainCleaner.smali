.class final Lio/fabric/sdk/android/services/network/CertificateChainCleaner;
.super Ljava/lang/Object;
.source "CertificateChainCleaner.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    return-void
.end method

.method public static getCleanChain([Ljava/security/cert/X509Certificate;Lio/fabric/sdk/android/services/network/SystemKeyStore;)[Ljava/security/cert/X509Certificate;
    .locals 6
    .param p0, "chain"    # [Ljava/security/cert/X509Certificate;
    .param p1, "systemKeyStore"    # Lio/fabric/sdk/android/services/network/SystemKeyStore;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 40
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 41
    .local v0, "cleanChain":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/security/cert/X509Certificate;>;"
    const/4 v3, 0x0

    .line 44
    .local v3, "trustedChain":Z
    aget-object v4, p0, v5

    invoke-virtual {p1, v4}, Lio/fabric/sdk/android/services/network/SystemKeyStore;->isTrustRoot(Ljava/security/cert/X509Certificate;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 45
    const/4 v3, 0x1

    .line 48
    :cond_0
    aget-object v4, p0, v5

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 50
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    array-length v4, p0

    if-ge v1, v4, :cond_2

    .line 51
    aget-object v4, p0, v1

    invoke-virtual {p1, v4}, Lio/fabric/sdk/android/services/network/SystemKeyStore;->isTrustRoot(Ljava/security/cert/X509Certificate;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 52
    const/4 v3, 0x1

    .line 55
    :cond_1
    aget-object v4, p0, v1

    add-int/lit8 v5, v1, -0x1

    aget-object v5, p0, v5

    invoke-static {v4, v5}, Lio/fabric/sdk/android/services/network/CertificateChainCleaner;->isValidLink(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 56
    aget-object v4, p0, v1

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 50
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 62
    :cond_2
    add-int/lit8 v4, v1, -0x1

    aget-object v4, p0, v4

    invoke-virtual {p1, v4}, Lio/fabric/sdk/android/services/network/SystemKeyStore;->getTrustRootFor(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;

    move-result-object v2

    .line 64
    .local v2, "trustRoot":Ljava/security/cert/X509Certificate;
    if-eqz v2, :cond_3

    .line 65
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 66
    const/4 v3, 0x1

    .line 69
    :cond_3
    if-eqz v3, :cond_4

    .line 70
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v4

    new-array v4, v4, [Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/security/cert/X509Certificate;

    return-object v4

    .line 72
    :cond_4
    new-instance v4, Ljava/security/cert/CertificateException;

    const-string v5, "Didn\'t find a trust anchor in chain cleanup!"

    invoke-direct {v4, v5}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method private static isValidLink(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z
    .locals 4
    .param p0, "parent"    # Ljava/security/cert/X509Certificate;
    .param p1, "child"    # Ljava/security/cert/X509Certificate;

    .prologue
    const/4 v1, 0x0

    .line 77
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 87
    :goto_0
    return v1

    .line 82
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    const/4 v1, 0x1

    goto :goto_0

    .line 83
    :catch_0
    move-exception v0

    .line 84
    .local v0, "gse":Ljava/security/GeneralSecurityException;
    goto :goto_0
.end method
