.class Lcom/urbanairship/analytics/EventAPIClient;
.super Ljava/lang/Object;
.source "EventAPIClient.java"


# static fields
.field private static final USE_GZIP:Z = true


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private createJSONEntity([B)Lorg/apache/http/entity/AbstractHttpEntity;
    .locals 9
    .param p1, "jsonBody"    # [B

    .prologue
    .line 105
    const/4 v2, 0x0

    .line 109
    .local v2, "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    :try_start_0
    array-length v7, p1

    div-int/lit8 v4, v7, 0x4

    .line 110
    .local v4, "expectedCompressedSize":I
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 111
    .local v0, "bodyBytes":Ljava/io/ByteArrayOutputStream;
    new-instance v5, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v5, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 112
    .local v5, "gos":Ljava/util/zip/GZIPOutputStream;
    invoke-virtual {v5, p1}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    .line 113
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 115
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v6

    .line 116
    .local v6, "gzipBytes":[B
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "GZIP\'d: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    array-length v8, p1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " into "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    array-length v8, v6

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " (expected "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ")"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 117
    new-instance v3, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v3, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .end local v2    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    .local v3, "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    :try_start_1
    const-string v7, "gzip"

    invoke-virtual {v3, v7}, Lorg/apache/http/entity/AbstractHttpEntity;->setContentEncoding(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v2, v3

    .line 127
    .end local v0    # "bodyBytes":Ljava/io/ByteArrayOutputStream;
    .end local v3    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    .end local v4    # "expectedCompressedSize":I
    .end local v5    # "gos":Ljava/util/zip/GZIPOutputStream;
    .end local v6    # "gzipBytes":[B
    .restart local v2    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    :goto_0
    if-nez v2, :cond_0

    .line 128
    new-instance v2, Lorg/apache/http/entity/ByteArrayEntity;

    .end local v2    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    invoke-direct {v2, p1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 131
    .restart local v2    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    :cond_0
    const-string v7, "application/json"

    invoke-virtual {v2, v7}, Lorg/apache/http/entity/AbstractHttpEntity;->setContentType(Ljava/lang/String;)V

    .line 132
    return-object v2

    .line 119
    :catch_0
    move-exception v1

    .line 121
    .local v1, "e":Ljava/io/IOException;
    :goto_1
    const-string v7, "GZIP of analytics payload failed."

    invoke-static {v7}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 119
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    .restart local v0    # "bodyBytes":Ljava/io/ByteArrayOutputStream;
    .restart local v3    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    .restart local v4    # "expectedCompressedSize":I
    .restart local v5    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v6    # "gzipBytes":[B
    :catch_1
    move-exception v1

    move-object v2, v3

    .end local v3    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    .restart local v2    # "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    goto :goto_1
.end method

.method private createRequest(Ljava/util/Collection;)Lcom/urbanairship/restclient/Request;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/urbanairship/restclient/Request;"
        }
    .end annotation

    .prologue
    .line 89
    .local p1, "events":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    new-instance v1, Lcom/urbanairship/restclient/Request;

    const-string v2, "POST"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v4

    iget-object v4, v4, Lcom/urbanairship/AirshipConfigOptions;->analyticsServer:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "warp9/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/urbanairship/restclient/Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .local v1, "req":Lcom/urbanairship/restclient/Request;
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/EventAPIClient;->getJSONBody(Ljava/util/Collection;)[B

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/urbanairship/analytics/EventAPIClient;->createJSONEntity([B)Lorg/apache/http/entity/AbstractHttpEntity;

    move-result-object v0

    .line 92
    .local v0, "entity":Lorg/apache/http/entity/AbstractHttpEntity;
    invoke-virtual {v1, v0}, Lcom/urbanairship/restclient/Request;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 94
    invoke-direct {p0, v1}, Lcom/urbanairship/analytics/EventAPIClient;->setHeaders(Lcom/urbanairship/restclient/Request;)V

    .line 96
    return-object v1
.end method

.method private getJSONBody(Ljava/util/Collection;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 191
    .local p1, "events":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 195
    .local v2, "rawByteBodyStream":Ljava/io/ByteArrayOutputStream;
    :try_start_0
    const-string v3, "["

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 197
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 198
    .local v1, "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 199
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 200
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 201
    const-string v3, ","

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 208
    .end local v1    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :catch_0
    move-exception v0

    .line 209
    .local v0, "e":Ljava/io/IOException;
    :try_start_1
    const-string v3, "Unable to create raw JSON payload."

    invoke-static {v3}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    const/4 v3, 0x0

    .line 213
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 214
    .end local v0    # "e":Ljava/io/IOException;
    :goto_1
    return-object v3

    .line 206
    .restart local v1    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_1
    :try_start_3
    const-string v3, "]"

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 207
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v3

    .line 213
    :try_start_4
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 214
    :catch_1
    move-exception v4

    goto :goto_1

    .line 212
    .end local v1    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :catchall_0
    move-exception v3

    .line 213
    :try_start_5
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 214
    :goto_2
    throw v3

    .restart local v0    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v4

    goto :goto_1

    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v4

    goto :goto_2
.end method

.method private setHeaders(Lcom/urbanairship/restclient/Request;)V
    .locals 10
    .param p1, "req"    # Lcom/urbanairship/restclient/Request;

    .prologue
    .line 140
    const-string v6, "X-UA-Device-Family"

    const-string v7, "android"

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    long-to-double v6, v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double v4, v6, v8

    .line 143
    .local v4, "sentAt":D
    const-string v6, "X-UA-Sent-At"

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v6, "X-UA-Package-Name"

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v6, "X-UA-Package-Version"

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v7

    iget-object v7, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v6, "X-UA-Device-ID"

    invoke-static {}, Lcom/urbanairship/util/Device;->getHashedDeviceId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v6

    invoke-virtual {v6}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v0

    .line 151
    .local v0, "airshipConfig":Lcom/urbanairship/AirshipConfigOptions;
    const-string v6, "X-UA-App-Key"

    invoke-virtual {v0}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v6, "X-UA-In-Production"

    iget-boolean v7, v0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    invoke-static {v7}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v6, "X-UA-Device-Model"

    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string v6, "X-UA-OS-Version"

    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v6, "X-UA-Lib-Version"

    invoke-static {}, Lcom/urbanairship/UAirship;->getVersion()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v6, "X-UA-Timezone"

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 163
    .local v2, "locale":Ljava/util/Locale;
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1

    .line 164
    const-string v6, "X-UA-Locale-Language"

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_0

    .line 167
    const-string v6, "X-UA-Locale-Country"

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_0
    invoke-virtual {v2}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1

    .line 171
    const-string v6, "X-UA-Locale-Variant"

    invoke-virtual {v2}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :cond_1
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v3

    .line 176
    .local v3, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-eqz v3, :cond_2

    .line 177
    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v1

    .line 178
    .local v1, "apid":Ljava/lang/String;
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_2

    .line 179
    const-string v6, "X-UA-Apid"

    invoke-virtual {p1, v6, v1}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v6, "X-UA-Push-Address"

    invoke-virtual {p1, v6, v1}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .end local v1    # "apid":Ljava/lang/String;
    :cond_2
    return-void
.end method


# virtual methods
.method public sendEvents(Ljava/util/Collection;)Lcom/urbanairship/restclient/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/urbanairship/restclient/Response;"
        }
    .end annotation

    .prologue
    .local p1, "events":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .line 65
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 66
    :cond_0
    const-string v2, "Send failed. No events."

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 80
    :goto_0
    return-object v1

    .line 70
    :cond_1
    invoke-static {}, Lcom/urbanairship/util/Network;->isConnected()Z

    move-result v2

    if-nez v2, :cond_2

    .line 71
    const-string v2, "No network connectivity available. Postponing analytics event updates."

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_2
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/EventAPIClient;->createRequest(Ljava/util/Collection;)Lcom/urbanairship/restclient/Request;

    move-result-object v0

    .line 77
    .local v0, "req":Lcom/urbanairship/restclient/Request;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " events."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending Analytics to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/urbanairship/restclient/Request;->getURI()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v0}, Lcom/urbanairship/restclient/Request;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v1

    goto :goto_0
.end method
