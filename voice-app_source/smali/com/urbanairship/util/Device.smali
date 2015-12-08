.class public Lcom/urbanairship/util/Device;
.super Ljava/lang/Object;
.source "Device.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static computeHashedId(Ljava/lang/String;)Ljava/lang/String;
    .locals 14
    .param p0, "rawDeviceId"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x0

    .line 69
    invoke-static {p0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 96
    :goto_0
    return-object v9

    .line 73
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 77
    .local v2, "deviceIdBytes":[B
    :try_start_0
    const-string v10, "SHA-1"

    invoke-static {v10}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 78
    .local v3, "digester":Ljava/security/MessageDigest;
    const/4 v10, 0x0

    array-length v11, v2

    invoke-virtual {v3, v2, v10, v11}, Ljava/security/MessageDigest;->update([BII)V

    .line 80
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    .line 83
    .local v4, "hash":[B
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .local v5, "hexHash":Ljava/lang/StringBuilder;
    move-object v0, v4

    .local v0, "arr$":[B
    array-length v7, v0

    .local v7, "len$":I
    const/4 v6, 0x0

    .local v6, "i$":I
    :goto_1
    if-ge v6, v7, :cond_1

    aget-byte v1, v0, v6

    .line 85
    .local v1, "b":B
    const-string v10, "%02x"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 88
    .end local v1    # "b":B
    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    goto :goto_0

    .line 90
    .end local v0    # "arr$":[B
    .end local v3    # "digester":Ljava/security/MessageDigest;
    .end local v4    # "hash":[B
    .end local v5    # "hexHash":Ljava/lang/StringBuilder;
    .end local v6    # "i$":I
    .end local v7    # "len$":I
    :catch_0
    move-exception v8

    .line 93
    .local v8, "nsae":Ljava/security/NoSuchAlgorithmException;
    const-string v10, "Unable to hash the device ID: SHA1 digester not present"

    invoke-static {v10}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static getHashedDeviceId()Ljava/lang/String;
    .locals 5

    .prologue
    .line 48
    const/4 v1, 0x0

    .line 50
    .local v1, "id":Ljava/lang/String;
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 51
    .local v0, "ctx":Landroid/content/Context;
    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "android_id"

    invoke-static {v3, v4}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 53
    .local v2, "rawDeviceId":Ljava/lang/String;
    invoke-static {v2}, Lcom/urbanairship/util/Device;->computeHashedId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    .end local v2    # "rawDeviceId":Ljava/lang/String;
    :cond_0
    invoke-static {v1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 57
    const-string v1, "unavailable"

    .line 60
    :cond_1
    return-object v1
.end method
