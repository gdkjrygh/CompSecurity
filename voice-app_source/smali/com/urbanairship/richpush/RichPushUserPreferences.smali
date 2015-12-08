.class Lcom/urbanairship/richpush/RichPushUserPreferences;
.super Lcom/urbanairship/Preferences;
.source "RichPushUserPreferences.java"


# static fields
.field private static final KEY_PREFIX:Ljava/lang/String; = "com.urbanairship.user"

.field private static final LAST_MESSAGE_REFRESH_TIME:Ljava/lang/String; = "com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME"

.field private static final LAST_UPDATE_TIME:Ljava/lang/String; = "com.urbanairship.user.LAST_UPDATE_TIME"

.field private static final USER_ID_KEY:Ljava/lang/String; = "com.urbanairship.user.ID"

.field private static final USER_PASSWORD_KEY:Ljava/lang/String; = "com.urbanairship.user.PASSWORD"

.field private static final USER_TOKEN_KEY:Ljava/lang/String; = "com.urbanairship.user.USER_TOKEN"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x0

    .line 49
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;-><init>(Landroid/content/Context;)V

    .line 50
    const-string v2, "com.urbanairship.user"

    invoke-virtual {p0, v2}, Lcom/urbanairship/richpush/RichPushUserPreferences;->migratePreferencesFromFileToDb(Ljava/lang/String;)V

    .line 52
    const-string v2, "com.urbanairship.user.PASSWORD"

    invoke-virtual {p0, v2, v3}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    .local v0, "password":Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 55
    const-string v2, "com.urbanairship.user.ID"

    invoke-virtual {p0, v2, v3}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/urbanairship/richpush/RichPushUserPreferences;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 57
    .local v1, "userToken":Ljava/lang/String;
    const-string v2, "com.urbanairship.user.USER_TOKEN"

    invoke-virtual {p0, v2, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 58
    const-string v2, "com.urbanairship.user.PASSWORD"

    invoke-virtual {p0, v2, v3}, Lcom/urbanairship/richpush/RichPushUserPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 61
    .end local v1    # "userToken":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method private decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p1, "encodedString"    # Ljava/lang/String;
    .param p2, "key"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 161
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {p2}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 187
    :cond_0
    :goto_0
    return-object v4

    .line 165
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 168
    .local v3, "length":I
    rem-int/lit8 v5, v3, 0x2

    if-nez v5, :cond_0

    .line 174
    :try_start_0
    div-int/lit8 v5, v3, 0x2

    new-array v0, v5, [B

    .line 175
    .local v0, "decodedBytes":[B
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    if-ge v2, v3, :cond_2

    .line 176
    div-int/lit8 v5, v2, 0x2

    add-int/lit8 v6, v2, 0x2

    invoke-virtual {p1, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x10

    invoke-static {v6, v7}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;I)B

    move-result v6

    aput-byte v6, v0, v5

    .line 175
    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    .line 178
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-direct {p0, v0, v5}, Lcom/urbanairship/richpush/RichPushUserPreferences;->xor([B[B)[B

    move-result-object v0

    .line 180
    new-instance v5, Ljava/lang/String;

    const-string v6, "UTF-8"

    invoke-direct {v5, v0, v6}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v4, v5

    goto :goto_0

    .line 181
    .end local v0    # "decodedBytes":[B
    .end local v2    # "i":I
    :catch_0
    move-exception v1

    .line 182
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unable to decode string. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 183
    .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v1

    .line 184
    .local v1, "e":Ljava/lang/NumberFormatException;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "String contains invalid hex numbers. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .param p1, "input"    # Ljava/lang/String;
    .param p2, "key"    # Ljava/lang/String;

    .prologue
    .line 137
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-static {p2}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 138
    :cond_0
    const/4 v6, 0x0

    .line 149
    :goto_0
    return-object v6

    .line 142
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    invoke-direct {p0, v6, v7}, Lcom/urbanairship/richpush/RichPushUserPreferences;->xor([B[B)[B

    move-result-object v2

    .line 145
    .local v2, "bytes":[B
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .local v3, "hexHash":Ljava/lang/StringBuilder;
    move-object v0, v2

    .local v0, "arr$":[B
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_1
    if-ge v4, v5, :cond_2

    aget-byte v1, v0, v4

    .line 147
    .local v1, "b":B
    const-string v6, "%02x"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 149
    .end local v1    # "b":B
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0
.end method

.method private xor([B[B)[B
    .locals 4
    .param p1, "a"    # [B
    .param p2, "b"    # [B

    .prologue
    .line 198
    array-length v2, p1

    new-array v1, v2, [B

    .line 200
    .local v1, "out":[B
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_0

    .line 201
    aget-byte v2, p1, v0

    array-length v3, p2

    rem-int v3, v0, v3

    aget-byte v3, p2, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 200
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 204
    :cond_0
    return-object v1
.end method


# virtual methods
.method public getLastMessageRefreshTime()Ljava/lang/String;
    .locals 2

    .prologue
    .line 98
    const-string v0, "com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastUpdateTime()J
    .locals 4

    .prologue
    .line 117
    const-string v0, "com.urbanairship.user.LAST_UPDATE_TIME"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 80
    const-string v0, "com.urbanairship.user.ID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUserToken()Ljava/lang/String;
    .locals 2

    .prologue
    .line 89
    const-string v0, "com.urbanairship.user.USER_TOKEN"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushUserPreferences;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setLastMessageRefreshTime(Ljava/lang/String;)V
    .locals 1
    .param p1, "timeStamp"    # Ljava/lang/String;

    .prologue
    .line 107
    const-string v0, "com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 108
    return-void
.end method

.method public setLastUpdateTime(J)V
    .locals 3
    .param p1, "timeMs"    # J

    .prologue
    .line 126
    const-string v0, "com.urbanairship.user.LAST_UPDATE_TIME"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 127
    return-void
.end method

.method public setUserCredentials(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "userId"    # Ljava/lang/String;
    .param p2, "userToken"    # Ljava/lang/String;

    .prologue
    .line 70
    const-string v0, "com.urbanairship.user.ID"

    invoke-virtual {p0, v0, p1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 71
    const-string v0, "com.urbanairship.user.USER_TOKEN"

    invoke-direct {p0, p2, p1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/urbanairship/richpush/RichPushUserPreferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 72
    return-void
.end method
