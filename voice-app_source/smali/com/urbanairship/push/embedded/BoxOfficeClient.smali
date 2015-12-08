.class public Lcom/urbanairship/push/embedded/BoxOfficeClient;
.super Ljava/lang/Object;
.source "BoxOfficeClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/push/embedded/BoxOfficeClient$FirstRunForbiddenException;,
        Lcom/urbanairship/push/embedded/BoxOfficeClient$FatalBoxOfficeException;,
        Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;
    }
.end annotation


# static fields
.field private static ANDROID_LIB_VERSION_PREFIX:Ljava/lang/String; = null

.field private static final APID_PREFERENCE_KEY:Ljava/lang/String; = "com.urbanairship.preferences.apid"

.field private static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "com.urbanairship.preferences"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-string v0, "android-lib-"

    sput-object v0, Lcom/urbanairship/push/embedded/BoxOfficeClient;->ANDROID_LIB_VERSION_PREFIX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method

.method private generateApid()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;
        }
    .end annotation

    .prologue
    .line 52
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 53
    .local v0, "apid":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Generating APID: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 55
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v2

    .line 57
    .local v2, "prefs":Lcom/urbanairship/push/PushPreferences;
    invoke-direct {p0}, Lcom/urbanairship/push/embedded/BoxOfficeClient;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 58
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v3, "com.urbanairship.preferences.apid"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 61
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Lcom/urbanairship/push/PushPreferences;->setPushId(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 62
    return-object v0

    .line 65
    :cond_0
    new-instance v3, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;

    const-string v4, "The APID was invalid or failed to save."

    invoke-direct {v3, v4}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method private getAPID()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;
        }
    .end annotation

    .prologue
    .line 69
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v1

    .line 72
    .local v1, "prefs":Lcom/urbanairship/push/PushPreferences;
    invoke-virtual {v1}, Lcom/urbanairship/push/PushPreferences;->getPushId()Ljava/lang/String;

    move-result-object v0

    .line 73
    .local v0, "apid":Ljava/lang/String;
    if-eqz v0, :cond_0

    move-object v2, v0

    .line 85
    :goto_0
    return-object v2

    .line 78
    :cond_0
    invoke-direct {p0}, Lcom/urbanairship/push/embedded/BoxOfficeClient;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "com.urbanairship.preferences.apid"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Lcom/urbanairship/push/PushPreferences;->setPushId(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Restored APID: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " from shared preferences."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    move-object v2, v0

    .line 81
    goto :goto_0

    .line 85
    :cond_1
    invoke-direct {p0}, Lcom/urbanairship/push/embedded/BoxOfficeClient;->generateApid()Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method private getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 3

    .prologue
    .line 149
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 150
    .local v0, "context":Landroid/content/Context;
    const-string v1, "com.urbanairship.preferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    return-object v1
.end method

.method private setRequestHeaders(Lcom/urbanairship/restclient/Request;)V
    .locals 6
    .param p1, "req"    # Lcom/urbanairship/restclient/Request;

    .prologue
    .line 155
    const-string v1, "X-UA-Device-Family"

    const-string v2, "Android"

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v1, "X-UA-Device-Model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v1, "X-UA-OS-Version"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v1, "X-UA-Lib-Version"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/urbanairship/push/embedded/BoxOfficeClient;->ANDROID_LIB_VERSION_PREFIX:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/urbanairship/UAirship;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v1, "X-UA-Package-Name"

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v1, "X-UA-Transport"

    const-string v2, "GCM"

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.000"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 163
    .local v0, "ms":Ljava/text/DecimalFormat;
    const-string v1, "X-UA-Sent-At"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v1, "X-UA-App-Key"

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->analyticsEnabled:Z

    if-eqz v1, :cond_0

    .line 167
    const-string v1, "X-UA-Device-ID"

    invoke-static {}, Lcom/urbanairship/util/Device;->getHashedDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/urbanairship/restclient/Request;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_0
    return-void
.end method


# virtual methods
.method public firstRun()Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;
        }
    .end annotation

    .prologue
    .line 90
    const-string v10, "Performing BoxOffice firstRun."

    invoke-static {v10}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 92
    invoke-direct {p0}, Lcom/urbanairship/push/embedded/BoxOfficeClient;->getAPID()Ljava/lang/String;

    move-result-object v0

    .line 96
    .local v0, "apid":Ljava/lang/String;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .local v4, "nvPairList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/message/BasicNameValuePair;>;"
    new-instance v10, Lorg/apache/http/message/BasicNameValuePair;

    const-string v11, "package"

    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    new-instance v10, Lorg/apache/http/message/BasicNameValuePair;

    const-string v11, "apid"

    invoke-direct {v10, v11, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    new-instance v6, Lcom/urbanairship/restclient/Request;

    const-string v10, "POST"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/urbanairship/push/embedded/Config$BoxOffice;->url:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "/firstrun"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v6, v10, v11}, Lcom/urbanairship/restclient/Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .local v6, "req":Lcom/urbanairship/restclient/Request;
    const/4 v2, 0x0

    .line 104
    .local v2, "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :try_start_0
    new-instance v3, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v10, "UTF-8"

    invoke-direct {v3, v4, v10}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .end local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .local v3, "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :try_start_1
    invoke-virtual {v6, v3}, Lcom/urbanairship/restclient/Request;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 111
    invoke-direct {p0, v6}, Lcom/urbanairship/push/embedded/BoxOfficeClient;->setRequestHeaders(Lcom/urbanairship/restclient/Request;)V

    .line 112
    invoke-virtual {v6}, Lcom/urbanairship/restclient/Request;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v7

    .line 114
    .local v7, "res":Lcom/urbanairship/restclient/Response;
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v10

    invoke-virtual {v10}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v5

    .line 118
    .local v5, "prefs":Lcom/urbanairship/push/PushPreferences;
    if-nez v7, :cond_0

    .line 119
    new-instance v10, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;

    const-string v11, "Failed to post to /firstrun; request failed"

    invoke-direct {v10, v11}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 106
    .end local v3    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .end local v5    # "prefs":Lcom/urbanairship/push/PushPreferences;
    .end local v7    # "res":Lcom/urbanairship/restclient/Response;
    .restart local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :catch_0
    move-exception v1

    .line 108
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    :goto_0
    new-instance v10, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;

    const-string v11, "Failed to post to /firstrun; UTF-8 unsupported!"

    invoke-direct {v10, v11}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 122
    .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
    .end local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v3    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v5    # "prefs":Lcom/urbanairship/push/PushPreferences;
    .restart local v7    # "res":Lcom/urbanairship/restclient/Response;
    :cond_0
    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v9

    .line 124
    .local v9, "status":I
    const/16 v10, 0x199

    if-ne v9, v10, :cond_1

    .line 126
    const/4 v10, 0x0

    invoke-virtual {v5, v10}, Lcom/urbanairship/push/PushPreferences;->setPushId(Ljava/lang/String;)Z

    .line 127
    new-instance v10, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;

    const-string v11, "Unrecoverable firstrun state. Clearing APID."

    invoke-direct {v10, v11}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 128
    :cond_1
    const/16 v10, 0x193

    if-ne v9, v10, :cond_2

    .line 130
    new-instance v10, Lcom/urbanairship/push/embedded/BoxOfficeClient$FirstRunForbiddenException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Failed to post to firstrun; forbidden. Reason:\n"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/urbanairship/push/embedded/BoxOfficeClient$FirstRunForbiddenException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 131
    :cond_2
    const/16 v10, 0xc8

    if-ne v9, v10, :cond_4

    .line 133
    invoke-virtual {v7}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 135
    .local v8, "secret":Ljava/lang/String;
    invoke-virtual {v5, v8}, Lcom/urbanairship/push/PushPreferences;->setPushSecret(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 136
    return-object v8

    .line 139
    :cond_3
    new-instance v10, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;

    const-string v11, "Failed to post to /firstrun; The secret was invalid or failed to save."

    invoke-direct {v10, v11}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 142
    .end local v8    # "secret":Ljava/lang/String;
    :cond_4
    new-instance v10, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Failed to post to /firstrun: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ". Check your airship configuration, particularly your app key and secret."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 106
    .end local v5    # "prefs":Lcom/urbanairship/push/PushPreferences;
    .end local v7    # "res":Lcom/urbanairship/restclient/Response;
    .end local v9    # "status":I
    :catch_1
    move-exception v1

    move-object v2, v3

    .end local v3    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    goto :goto_0
.end method
