.class public Lio/fabric/sdk/android/services/common/CommonUtils;
.super Ljava/lang/Object;
.source "CommonUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    }
.end annotation


# static fields
.field static final BYTES_IN_A_GIGABYTE:I = 0x40000000

.field static final BYTES_IN_A_KILOBYTE:I = 0x400

.field static final BYTES_IN_A_MEGABYTE:I = 0x100000

.field private static final CLS_SHARED_PREFERENCES_NAME:Ljava/lang/String; = "com.crashlytics.prefs"

.field static final CLS_TRACE_DEFAULT:Z = false

.field static final CLS_TRACE_PREFERENCE_NAME:Ljava/lang/String; = "com.crashlytics.Trace"

.field static final CRASHLYTICS_BUILD_ID:Ljava/lang/String; = "com.crashlytics.android.build_id"

.field public static final DEVICE_STATE_BETAOS:I = 0x8

.field public static final DEVICE_STATE_COMPROMISEDLIBRARIES:I = 0x20

.field public static final DEVICE_STATE_DEBUGGERATTACHED:I = 0x4

.field public static final DEVICE_STATE_ISSIMULATOR:I = 0x1

.field public static final DEVICE_STATE_JAILBROKEN:I = 0x2

.field public static final DEVICE_STATE_VENDORINTERNAL:I = 0x10

.field static final ENCRYPTION_AES:Ljava/lang/String; = "AES/ECB/PKCS7Padding"

.field static final FABRIC_BUILD_ID:Ljava/lang/String; = "io.fabric.android.build_id"

.field public static final FILE_MODIFIED_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static final GOOGLE_SDK:Ljava/lang/String; = "google_sdk"

.field private static final HEX_VALUES:[C

.field private static final LOGGING_DISABLED_DEFAULT:Z = false

.field private static final LOGGING_DISABLED_KEY:Ljava/lang/String; = "com.crashlytics.SilenceCrashlyticsLogCat"

.field private static final LOG_PRIORITY_NAME_ASSERT:Ljava/lang/String; = "A"

.field private static final LOG_PRIORITY_NAME_DEBUG:Ljava/lang/String; = "D"

.field private static final LOG_PRIORITY_NAME_ERROR:Ljava/lang/String; = "E"

.field private static final LOG_PRIORITY_NAME_INFO:Ljava/lang/String; = "I"

.field private static final LOG_PRIORITY_NAME_UNKNOWN:Ljava/lang/String; = "?"

.field private static final LOG_PRIORITY_NAME_VERBOSE:Ljava/lang/String; = "V"

.field private static final LOG_PRIORITY_NAME_WARN:Ljava/lang/String; = "W"

.field public static final MD5_INSTANCE:Ljava/lang/String; = "MD5"

.field public static final SDK:Ljava/lang/String; = "sdk"

.field public static final SHA1_INSTANCE:Ljava/lang/String; = "SHA-1"

.field private static final UNCALCULATED_TOTAL_RAM:J = -0x1L

.field private static clsTrace:Ljava/lang/Boolean;

.field private static loggingEnabled:Ljava/lang/Boolean;

.field private static totalRamInBytes:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 95
    sput-object v2, Lio/fabric/sdk/android/services/common/CommonUtils;->clsTrace:Ljava/lang/Boolean;

    .line 104
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->HEX_VALUES:[C

    .line 117
    const-wide/16 v0, -0x1

    sput-wide v0, Lio/fabric/sdk/android/services/common/CommonUtils;->totalRamInBytes:J

    .line 474
    sput-object v2, Lio/fabric/sdk/android/services/common/CommonUtils;->loggingEnabled:Ljava/lang/Boolean;

    .line 722
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$1;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/common/CommonUtils$1;-><init>()V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->FILE_MODIFIED_COMPARATOR:Ljava/util/Comparator;

    return-void

    .line 104
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    return-void
.end method

.method public static calculateFreeRamInBytes(Landroid/content/Context;)J
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 399
    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 400
    .local v0, "mi":Landroid/app/ActivityManager$MemoryInfo;
    const-string v1, "activity"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    invoke-virtual {v1, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 401
    iget-wide v2, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    return-wide v2
.end method

.method public static calculateUsedDiskSpaceInBytes(Ljava/lang/String;)J
    .locals 10
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 412
    new-instance v4, Landroid/os/StatFs;

    invoke-direct {v4, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 413
    .local v4, "statFs":Landroid/os/StatFs;
    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSize()I

    move-result v5

    int-to-long v2, v5

    .line 414
    .local v2, "blockSizeBytes":J
    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v8, v5

    mul-long v6, v2, v8

    .line 415
    .local v6, "totalSpaceBytes":J
    invoke-virtual {v4}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v5

    int-to-long v8, v5

    mul-long v0, v2, v8

    .line 416
    .local v0, "availableSpaceBytes":J
    sub-long v8, v6, v0

    return-wide v8
.end method

.method public static canTryConnection(Landroid/content/Context;)Z
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x1

    .line 975
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 976
    const-string v3, "connectivity"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 978
    .local v1, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 979
    .local v0, "activeNetwork":Landroid/net/NetworkInfo;
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 983
    .end local v0    # "activeNetwork":Landroid/net/NetworkInfo;
    .end local v1    # "cm":Landroid/net/ConnectivityManager;
    :cond_0
    :goto_0
    return v2

    .line 979
    .restart local v0    # "activeNetwork":Landroid/net/NetworkInfo;
    .restart local v1    # "cm":Landroid/net/ConnectivityManager;
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static checkPermission(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "permission"    # Ljava/lang/String;

    .prologue
    .line 921
    invoke-virtual {p0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    .line 922
    .local v0, "res":I
    if-nez v0, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V
    .locals 3
    .param p0, "c"    # Ljava/io/Closeable;
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 756
    if-eqz p0, :cond_0

    .line 758
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 763
    :cond_0
    :goto_0
    return-void

    .line 759
    :catch_0
    move-exception v0

    .line 760
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    invoke-interface {v1, v2, p1, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static closeQuietly(Ljava/io/Closeable;)V
    .locals 2
    .param p0, "closeable"    # Ljava/io/Closeable;

    .prologue
    .line 907
    if-eqz p0, :cond_0

    .line 909
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 915
    :cond_0
    :goto_0
    return-void

    .line 910
    :catch_0
    move-exception v0

    .line 911
    .local v0, "rethrown":Ljava/lang/RuntimeException;
    throw v0

    .line 912
    .end local v0    # "rethrown":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method static convertMemInfoToBytes(Ljava/lang/String;Ljava/lang/String;I)J
    .locals 4
    .param p0, "memInfo"    # Ljava/lang/String;
    .param p1, "notation"    # Ljava/lang/String;
    .param p2, "notationMultiplier"    # I

    .prologue
    .line 251
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    int-to-long v2, p2

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
    .locals 2
    .param p0, "is"    # Ljava/io/InputStream;
    .param p1, "os"    # Ljava/io/OutputStream;
    .param p2, "buffer"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 838
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .local v0, "count":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 839
    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 841
    :cond_0
    return-void
.end method

.method public static createCipher(ILjava/lang/String;)Ljavax/crypto/Cipher;
    .locals 7
    .param p0, "mode"    # I
    .param p1, "key"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "GetInstance"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    .prologue
    const/16 v6, 0x20

    .line 662
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v3, v6, :cond_0

    .line 663
    new-instance v3, Ljava/security/InvalidKeyException;

    const-string v4, "Key must be at least 32 bytes."

    invoke-direct {v3, v4}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 665
    :cond_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    const/4 v4, 0x0

    const-string v5, "AES/ECB/PKCS7Padding"

    invoke-direct {v2, v3, v4, v6, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    .line 666
    .local v2, "secretKey":Ljavax/crypto/SecretKey;
    const/4 v0, 0x0

    .line 668
    .local v0, "cipher":Ljavax/crypto/Cipher;
    :try_start_0
    const-string v3, "AES/ECB/PKCS7Padding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 677
    invoke-virtual {v0, p0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 678
    return-object v0

    .line 669
    :catch_0
    move-exception v1

    .line 670
    .local v1, "e":Ljava/security/GeneralSecurityException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Could not create Cipher for AES/ECB/PKCS7Padding - should never happen."

    invoke-interface {v3, v4, v5, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 675
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static varargs createInstanceIdFrom([Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .param p0, "sliceIds"    # [Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 361
    if-eqz p0, :cond_0

    array-length v8, p0

    if-nez v8, :cond_1

    .line 389
    :cond_0
    :goto_0
    return-object v7

    .line 366
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 368
    .local v6, "sliceIdList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    move-object v0, p0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v4, :cond_3

    aget-object v3, v0, v2

    .line 370
    .local v3, "id":Ljava/lang/String;
    if-eqz v3, :cond_2

    .line 372
    const-string v8, "-"

    const-string v9, ""

    invoke-virtual {v3, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 368
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 377
    .end local v3    # "id":Ljava/lang/String;
    :cond_3
    invoke-static {v6}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 380
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 381
    .local v5, "sb":Ljava/lang/StringBuilder;
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 382
    .restart local v3    # "id":Ljava/lang/String;
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 385
    .end local v3    # "id":Ljava/lang/String;
    :cond_4
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 389
    .local v1, "concatValue":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_0

    invoke-static {v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->sha1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0
.end method

.method public static dehexify(Ljava/lang/String;)[B
    .locals 7
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    const/16 v6, 0x10

    .line 699
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 700
    .local v2, "len":I
    div-int/lit8 v3, v2, 0x2

    new-array v0, v3, [B

    .line 701
    .local v0, "data":[B
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v2, :cond_0

    .line 702
    div-int/lit8 v3, v1, 0x2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    add-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    .line 701
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 705
    :cond_0
    return-object v0
.end method

.method public static extractFieldFromSystemFile(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p0, "file"    # Ljava/io/File;
    .param p1, "fieldname"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x1

    .line 130
    const/4 v6, 0x0

    .line 131
    .local v6, "toReturn":Ljava/lang/String;
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 133
    const/4 v0, 0x0

    .line 135
    .local v0, "br":Ljava/io/BufferedReader;
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v7, Ljava/io/FileReader;

    invoke-direct {v7, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    const/16 v8, 0x400

    invoke-direct {v1, v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .end local v0    # "br":Ljava/io/BufferedReader;
    .local v1, "br":Ljava/io/BufferedReader;
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .local v3, "line":Ljava/lang/String;
    if-eqz v3, :cond_1

    .line 138
    const-string v7, "\\s*:\\s*"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 139
    .local v4, "pattern":Ljava/util/regex/Pattern;
    const/4 v7, 0x2

    invoke-virtual {v4, v3, v7}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;I)[Ljava/lang/String;

    move-result-object v5

    .line 140
    .local v5, "pieces":[Ljava/lang/String;
    array-length v7, v5

    if-le v7, v9, :cond_0

    const/4 v7, 0x0

    aget-object v7, v5, v7

    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 141
    const/4 v7, 0x1

    aget-object v6, v5, v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    .end local v4    # "pattern":Ljava/util/regex/Pattern;
    .end local v5    # "pieces":[Ljava/lang/String;
    :cond_1
    const-string v7, "Failed to close system file reader."

    invoke-static {v1, v7}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 152
    .end local v1    # "br":Ljava/io/BufferedReader;
    .end local v3    # "line":Ljava/lang/String;
    :cond_2
    :goto_0
    return-object v6

    .line 146
    .restart local v0    # "br":Ljava/io/BufferedReader;
    :catch_0
    move-exception v2

    .line 147
    .local v2, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_2
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v7

    const-string v8, "Fabric"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Error parsing "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9, v2}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    const-string v7, "Failed to close system file reader."

    invoke-static {v0, v7}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_0

    .end local v2    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v7

    :goto_2
    const-string v8, "Failed to close system file reader."

    invoke-static {v0, v8}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v7

    .end local v0    # "br":Ljava/io/BufferedReader;
    .restart local v1    # "br":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v7

    move-object v0, v1

    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    goto :goto_2

    .line 146
    .end local v0    # "br":Ljava/io/BufferedReader;
    .restart local v1    # "br":Ljava/io/BufferedReader;
    :catch_1
    move-exception v2

    move-object v0, v1

    .end local v1    # "br":Ljava/io/BufferedReader;
    .restart local v0    # "br":Ljava/io/BufferedReader;
    goto :goto_1
.end method

.method public static finishAffinity(Landroid/app/Activity;I)V
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "resultCode"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 959
    if-nez p0, :cond_0

    .line 968
    :goto_0
    return-void

    .line 962
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 963
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_0

    .line 965
    :cond_1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 966
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public static finishAffinity(Landroid/content/Context;I)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "resultCode"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 944
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 945
    check-cast p0, Landroid/app/Activity;

    .end local p0    # "context":Landroid/content/Context;
    invoke-static {p0, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->finishAffinity(Landroid/app/Activity;I)V

    .line 947
    :cond_0
    return-void
.end method

.method public static flushOrLog(Ljava/io/Flushable;Ljava/lang/String;)V
    .locals 3
    .param p0, "f"    # Ljava/io/Flushable;
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 766
    if-eqz p0, :cond_0

    .line 768
    :try_start_0
    invoke-interface {p0}, Ljava/io/Flushable;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 773
    :cond_0
    :goto_0
    return-void

    .line 769
    :catch_0
    move-exception v0

    .line 770
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    invoke-interface {v1, v2, p1, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static getAppIconHashOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x0

    .line 867
    const/4 v1, 0x0

    .line 870
    .local v1, "is":Ljava/io/InputStream;
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getAppIconResourceId(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1

    .line 871
    invoke-static {v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->sha1(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v2

    .line 872
    .local v2, "sha1":Ljava/lang/String;
    invoke-static {v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->isNullOrEmpty(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-eqz v4, :cond_0

    move-object v2, v3

    .line 876
    .end local v2    # "sha1":Ljava/lang/String;
    :cond_0
    const-string v3, "Failed to close icon input stream."

    invoke-static {v1, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 879
    :goto_0
    return-object v2

    .line 873
    :catch_0
    move-exception v0

    .line 874
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v4

    const-string v5, "Fabric"

    const-string v6, "Could not calculate hash for app icon."

    invoke-interface {v4, v5, v6, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 876
    const-string v4, "Failed to close icon input stream."

    invoke-static {v1, v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    move-object v2, v3

    .line 879
    goto :goto_0

    .line 876
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v3

    const-string v4, "Failed to close icon input stream."

    invoke-static {v1, v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v3
.end method

.method public static getAppIconResourceId(Landroid/content/Context;)I
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 883
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    return v0
.end method

.method public static getAppProcessInfo(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;
    .locals 6
    .param p0, "packageName"    # Ljava/lang/String;
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 260
    const-string v5, "activity"

    invoke-virtual {p1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 262
    .local v0, "actman":Landroid/app/ActivityManager;
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v4

    .line 264
    .local v4, "processes":Ljava/util/List;, "Ljava/util/List<Landroid/app/ActivityManager$RunningAppProcessInfo;>;"
    const/4 v3, 0x0

    .line 267
    .local v3, "procInfo":Landroid/app/ActivityManager$RunningAppProcessInfo;
    if-eqz v4, :cond_1

    .line 268
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 269
    .local v2, "info":Landroid/app/ActivityManager$RunningAppProcessInfo;
    iget-object v5, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 270
    move-object v3, v2

    .line 275
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v2    # "info":Landroid/app/ActivityManager$RunningAppProcessInfo;
    :cond_1
    return-object v3
.end method

.method public static getBatteryLevel(Landroid/content/Context;)F
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v5, -0x1

    .line 421
    new-instance v1, Landroid/content/IntentFilter;

    const-string v4, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 422
    .local v1, "ifilter":Landroid/content/IntentFilter;
    const/4 v4, 0x0

    invoke-virtual {p0, v4, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    .line 424
    .local v0, "battery":Landroid/content/Intent;
    const-string v4, "level"

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 425
    .local v2, "level":I
    const-string v4, "scale"

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 427
    .local v3, "scale":I
    int-to-float v4, v2

    int-to-float v5, v3

    div-float/2addr v4, v5

    return v4
.end method

.method public static getBatteryVelocity(Landroid/content/Context;Z)I
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "powerConnected"    # Z

    .prologue
    const-wide v4, 0x4058c00000000000L    # 99.0

    .line 631
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBatteryLevel(Landroid/content/Context;)F

    move-result v0

    .line 633
    .local v0, "batterLevel":F
    if-nez p1, :cond_0

    .line 634
    const/4 v1, 0x1

    .line 645
    :goto_0
    return v1

    .line 637
    :cond_0
    if-eqz p1, :cond_1

    float-to-double v2, v0

    cmpl-double v1, v2, v4

    if-ltz v1, :cond_1

    .line 638
    const/4 v1, 0x3

    goto :goto_0

    .line 641
    :cond_1
    if-eqz p1, :cond_2

    float-to-double v2, v0

    cmpg-double v1, v2, v4

    if-gez v1, :cond_2

    .line 642
    const/4 v1, 0x2

    goto :goto_0

    .line 645
    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getBitmapBytes(Landroid/graphics/Bitmap;)[B
    .locals 3
    .param p0, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 649
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 650
    .local v0, "stream":Ljava/io/ByteArrayOutputStream;
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 652
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    return-object v1
.end method

.method public static getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Z

    .prologue
    .line 528
    if-eqz p0, :cond_0

    .line 529
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 531
    .local v1, "resources":Landroid/content/res/Resources;
    if-eqz v1, :cond_0

    .line 532
    const-string v2, "bool"

    invoke-static {p0, p1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->getResourcesIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 534
    .local v0, "id":I
    if-lez v0, :cond_1

    .line 535
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p2

    .line 546
    .end local v0    # "id":I
    .end local v1    # "resources":Landroid/content/res/Resources;
    .end local p2    # "defaultValue":Z
    :cond_0
    :goto_0
    return p2

    .line 538
    .restart local v0    # "id":I
    .restart local v1    # "resources":Landroid/content/res/Resources;
    .restart local p2    # "defaultValue":Z
    :cond_1
    const-string v2, "string"

    invoke-static {p0, p1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->getResourcesIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 540
    if-lez v0, :cond_0

    .line 541
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p2

    goto :goto_0
.end method

.method public static getCpuArchitectureInt()I
    .locals 1

    .prologue
    .line 160
    invoke-static {}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->getValue()Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    move-result-object v0

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ordinal()I

    move-result v0

    return v0
.end method

.method public static getDeviceState(Landroid/content/Context;)I
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 607
    const/4 v0, 0x0

    .line 608
    .local v0, "deviceState":I
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isEmulator(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 609
    or-int/lit8 v0, v0, 0x1

    .line 612
    :cond_0
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isRooted(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 613
    or-int/lit8 v0, v0, 0x2

    .line 616
    :cond_1
    invoke-static {}, Lio/fabric/sdk/android/services/common/CommonUtils;->isDebuggerAttached()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 617
    or-int/lit8 v0, v0, 0x4

    .line 620
    :cond_2
    return v0
.end method

.method public static getProximitySensorEnabled(Landroid/content/Context;)Z
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    .line 431
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isEmulator(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 439
    :cond_0
    :goto_0
    return v2

    .line 436
    :cond_1
    const-string v3, "sensor"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/SensorManager;

    .line 438
    .local v1, "sm":Landroid/hardware/SensorManager;
    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    .line 439
    .local v0, "prox":Landroid/hardware/Sensor;
    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static getResourcePackageName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 823
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v0, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 824
    .local v0, "iconId":I
    if-lez v0, :cond_0

    .line 825
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v1

    .line 827
    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static getResourcesIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "resourceType"    # Ljava/lang/String;

    .prologue
    .line 550
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 551
    .local v0, "resources":Landroid/content/res/Resources;
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getResourcePackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    return v1
.end method

.method public static getSharedPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 120
    const-string v0, "com.crashlytics.prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public static getStringsFileValue(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 740
    const-string v1, "string"

    invoke-static {p0, p1, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->getResourcesIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 742
    .local v0, "id":I
    if-lez v0, :cond_0

    .line 743
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 746
    :goto_0
    return-object v1

    :cond_0
    const-string v1, ""

    goto :goto_0
.end method

.method public static declared-synchronized getTotalRamInBytes()J
    .locals 10

    .prologue
    .line 214
    const-class v5, Lio/fabric/sdk/android/services/common/CommonUtils;

    monitor-enter v5

    :try_start_0
    sget-wide v6, Lio/fabric/sdk/android/services/common/CommonUtils;->totalRamInBytes:J

    const-wide/16 v8, -0x1

    cmp-long v4, v6, v8

    if-nez v4, :cond_1

    .line 215
    const-wide/16 v0, 0x0

    .line 216
    .local v0, "bytes":J
    new-instance v4, Ljava/io/File;

    const-string v6, "/proc/meminfo"

    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v6, "MemTotal"

    invoke-static {v4, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->extractFieldFromSystemFile(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 218
    .local v3, "result":Ljava/lang/String;
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 219
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 222
    :try_start_1
    const-string v4, "KB"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 223
    const-string v4, "KB"

    const/16 v6, 0x400

    invoke-static {v3, v4, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->convertMemInfoToBytes(Ljava/lang/String;Ljava/lang/String;I)J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    .line 241
    :cond_0
    :goto_0
    :try_start_2
    sput-wide v0, Lio/fabric/sdk/android/services/common/CommonUtils;->totalRamInBytes:J

    .line 243
    :cond_1
    sget-wide v6, Lio/fabric/sdk/android/services/common/CommonUtils;->totalRamInBytes:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v5

    return-wide v6

    .line 224
    :cond_2
    :try_start_3
    const-string v4, "MB"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 227
    const-string v4, "MB"

    const/high16 v6, 0x100000

    invoke-static {v3, v4, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->convertMemInfoToBytes(Ljava/lang/String;Ljava/lang/String;I)J

    move-result-wide v0

    goto :goto_0

    .line 228
    :cond_3
    const-string v4, "GB"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 231
    const-string v4, "GB"

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v3, v4, v6}, Lio/fabric/sdk/android/services/common/CommonUtils;->convertMemInfoToBytes(Ljava/lang/String;Ljava/lang/String;I)J

    move-result-wide v0

    goto :goto_0

    .line 233
    :cond_4
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v4

    const-string v6, "Fabric"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unexpected meminfo format while computing RAM: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v7}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 236
    :catch_0
    move-exception v2

    .line 237
    .local v2, "e":Ljava/lang/NumberFormatException;
    :try_start_4
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v4

    const-string v6, "Fabric"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unexpected meminfo format while computing RAM: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v7, v2}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 214
    .end local v2    # "e":Ljava/lang/NumberFormatException;
    .end local v3    # "result":Ljava/lang/String;
    :catchall_0
    move-exception v4

    monitor-exit v5

    throw v4
.end method

.method private static hash(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "source"    # Ljava/io/InputStream;
    .param p1, "sha1Instance"    # Ljava/lang/String;

    .prologue
    .line 314
    :try_start_0
    const-string v4, "SHA-1"

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 316
    .local v1, "digest":Ljava/security/MessageDigest;
    const/16 v4, 0x400

    new-array v0, v4, [B

    .line 317
    .local v0, "buffer":[B
    const/4 v3, 0x0

    .line 320
    .local v3, "length":I
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    .line 321
    const/4 v4, 0x0

    invoke-virtual {v1, v0, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 325
    .end local v0    # "buffer":[B
    .end local v1    # "digest":Ljava/security/MessageDigest;
    .end local v3    # "length":I
    :catch_0
    move-exception v2

    .line 326
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v4

    const-string v5, "Fabric"

    const-string v6, "Could not calculate hash for app icon."

    invoke-interface {v4, v5, v6, v2}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 329
    const-string v4, ""

    .end local v2    # "e":Ljava/lang/Exception;
    :goto_1
    return-object v4

    .line 324
    .restart local v0    # "buffer":[B
    .restart local v1    # "digest":Ljava/security/MessageDigest;
    .restart local v3    # "length":I
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    invoke-static {v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->hexify([B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v4

    goto :goto_1
.end method

.method private static hash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "s"    # Ljava/lang/String;
    .param p1, "algorithm"    # Ljava/lang/String;

    .prologue
    .line 352
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->hash([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static hash([BLjava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "bytes"    # [B
    .param p1, "algorithm"    # Ljava/lang/String;

    .prologue
    .line 333
    const/4 v0, 0x0

    .line 336
    .local v0, "digest":Ljava/security/MessageDigest;
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 346
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 348
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-static {v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->hexify([B)Ljava/lang/String;

    move-result-object v2

    :goto_0
    return-object v2

    .line 337
    :catch_0
    move-exception v1

    .line 338
    .local v1, "e":Ljava/security/NoSuchAlgorithmException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not create hashing algorithm: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", returning empty string."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    const-string v2, ""

    goto :goto_0
.end method

.method public static hexify([B)Ljava/lang/String;
    .locals 6
    .param p0, "bytes"    # [B

    .prologue
    .line 683
    array-length v3, p0

    mul-int/lit8 v3, v3, 0x2

    new-array v0, v3, [C

    .line 685
    .local v0, "hexChars":[C
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_0

    .line 686
    aget-byte v3, p0, v1

    and-int/lit16 v2, v3, 0xff

    .line 687
    .local v2, "v":I
    mul-int/lit8 v3, v1, 0x2

    sget-object v4, Lio/fabric/sdk/android/services/common/CommonUtils;->HEX_VALUES:[C

    ushr-int/lit8 v5, v2, 0x4

    aget-char v4, v4, v5

    aput-char v4, v0, v3

    .line 688
    mul-int/lit8 v3, v1, 0x2

    add-int/lit8 v3, v3, 0x1

    sget-object v4, Lio/fabric/sdk/android/services/common/CommonUtils;->HEX_VALUES:[C

    and-int/lit8 v5, v2, 0xf

    aget-char v4, v4, v5

    aput-char v4, v0, v3

    .line 685
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 690
    .end local v2    # "v":I
    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([C)V

    return-object v3
.end method

.method public static hideKeyboard(Landroid/content/Context;Landroid/view/View;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 926
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 928
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    .line 929
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 931
    :cond_0
    return-void
.end method

.method public static isAppDebuggable(Landroid/content/Context;)Z
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 715
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isClsTrace(Landroid/content/Context;)Z
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 499
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->clsTrace:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 500
    const-string v0, "com.crashlytics.Trace"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->clsTrace:Ljava/lang/Boolean;

    .line 504
    :cond_0
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->clsTrace:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static isDebuggerAttached()Z
    .locals 1

    .prologue
    .line 595
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isEmulator(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 560
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 562
    .local v0, "androidId":Ljava/lang/String;
    const-string v1, "sdk"

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "google_sdk"

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static isLoggingEnabled(Landroid/content/Context;)Z
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v0, 0x0

    .line 486
    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils;->loggingEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 488
    const-string v1, "com.crashlytics.SilenceCrashlyticsLogCat"

    invoke-static {p0, v1, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->loggingEnabled:Ljava/lang/Boolean;

    .line 491
    :cond_1
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils;->loggingEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static isNullOrEmpty(Ljava/lang/String;)Z
    .locals 1
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 777
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isRooted(Landroid/content/Context;)Z
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x1

    .line 571
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isEmulator(Landroid/content/Context;)Z

    move-result v2

    .line 572
    .local v2, "isEmulator":Z
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 573
    .local v0, "buildTags":Ljava/lang/String;
    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    const-string v4, "test-keys"

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 591
    :cond_0
    :goto_0
    return v3

    .line 578
    :cond_1
    new-instance v1, Ljava/io/File;

    const-string v4, "/system/app/Superuser.apk"

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 579
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 587
    new-instance v1, Ljava/io/File;

    .end local v1    # "file":Ljava/io/File;
    const-string v4, "/system/xbin/su"

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 588
    .restart local v1    # "file":Ljava/io/File;
    if-nez v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 591
    :cond_2
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public static logControlled(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "level"    # I
    .param p2, "tag"    # Ljava/lang/String;
    .param p3, "msg"    # Ljava/lang/String;

    .prologue
    .line 468
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isClsTrace(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    invoke-interface {v0, p1, v1, p3}, Lio/fabric/sdk/android/Logger;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 471
    :cond_0
    return-void
.end method

.method public static logControlled(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 448
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isClsTrace(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 449
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    invoke-interface {v0, v1, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    :cond_0
    return-void
.end method

.method public static logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "msg"    # Ljava/lang/String;
    .param p2, "tr"    # Ljava/lang/Throwable;

    .prologue
    .line 458
    invoke-static {p0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isClsTrace(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    invoke-interface {v0, v1, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    :cond_0
    return-void
.end method

.method public static logOrThrowIllegalArgumentException(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "logTag"    # Ljava/lang/String;
    .param p1, "errorMsg"    # Ljava/lang/String;

    .prologue
    .line 1010
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isDebuggable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1011
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1013
    :cond_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    return-void
.end method

.method public static logOrThrowIllegalStateException(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "logTag"    # Ljava/lang/String;
    .param p1, "errorMsg"    # Ljava/lang/String;

    .prologue
    .line 995
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isDebuggable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 996
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 998
    :cond_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1000
    return-void
.end method

.method public static logPriorityToString(I)Ljava/lang/String;
    .locals 1
    .param p0, "priority"    # I

    .prologue
    .line 844
    packed-switch p0, :pswitch_data_0

    .line 858
    const-string v0, "?"

    :goto_0
    return-object v0

    .line 846
    :pswitch_0
    const-string v0, "A"

    goto :goto_0

    .line 848
    :pswitch_1
    const-string v0, "D"

    goto :goto_0

    .line 850
    :pswitch_2
    const-string v0, "E"

    goto :goto_0

    .line 852
    :pswitch_3
    const-string v0, "I"

    goto :goto_0

    .line 854
    :pswitch_4
    const-string v0, "V"

    goto :goto_0

    .line 856
    :pswitch_5
    const-string v0, "W"

    goto :goto_0

    .line 844
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static md5(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "source"    # Ljava/lang/String;

    .prologue
    .line 293
    const-string v0, "MD5"

    invoke-static {p0, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->hash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static md5([B)Ljava/lang/String;
    .locals 1
    .param p0, "source"    # [B

    .prologue
    .line 297
    const-string v0, "MD5"

    invoke-static {p0, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->hash([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static openKeyboard(Landroid/content/Context;Landroid/view/View;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 934
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 936
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    .line 937
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInputFromInputMethod(Landroid/os/IBinder;I)V

    .line 939
    :cond_0
    return-void
.end method

.method public static padWithZerosToMaxIntWidth(I)Ljava/lang/String;
    .locals 5
    .param p0, "value"    # I

    .prologue
    .line 788
    if-gez p0, :cond_0

    .line 789
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value must be zero or greater"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 793
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%1$10s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    const/16 v2, 0x30

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static resolveBuildId(Landroid/content/Context;)Ljava/lang/String;
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 890
    const/4 v0, 0x0

    .line 892
    .local v0, "buildId":Ljava/lang/String;
    const-string v2, "io.fabric.android.build_id"

    const-string v3, "string"

    invoke-static {p0, v2, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->getResourcesIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 894
    .local v1, "id":I
    if-nez v1, :cond_0

    .line 895
    const-string v2, "com.crashlytics.android.build_id"

    const-string v3, "string"

    invoke-static {p0, v2, v3}, Lio/fabric/sdk/android/services/common/CommonUtils;->getResourcesIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 898
    :cond_0
    if-eqz v1, :cond_1

    .line 899
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 900
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Build ID is: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 903
    :cond_1
    return-object v0
.end method

.method public static sha1(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "source"    # Ljava/io/InputStream;

    .prologue
    .line 309
    const-string v0, "SHA-1"

    invoke-static {p0, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->hash(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha1(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "source"    # Ljava/lang/String;

    .prologue
    .line 301
    const-string v0, "SHA-1"

    invoke-static {p0, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->hash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha1([B)Ljava/lang/String;
    .locals 1
    .param p0, "source"    # [B

    .prologue
    .line 305
    const-string v0, "SHA-1"

    invoke-static {p0, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->hash([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static streamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3
    .param p0, "is"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 282
    new-instance v1, Ljava/util/Scanner;

    invoke-direct {v1, p0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    const-string v2, "\\A"

    invoke-virtual {v1, v2}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    .line 283
    .local v0, "s":Ljava/util/Scanner;
    invoke-virtual {v0}, Ljava/util/Scanner;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    const-string v1, ""

    goto :goto_0
.end method

.method public static stringsEqualIncludingNull(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p0, "s1"    # Ljava/lang/String;
    .param p1, "s2"    # Ljava/lang/String;

    .prologue
    .line 797
    if-ne p0, p1, :cond_0

    .line 799
    const/4 v0, 0x1

    .line 808
    :goto_0
    return v0

    .line 801
    :cond_0
    if-eqz p0, :cond_1

    .line 804
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 808
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
