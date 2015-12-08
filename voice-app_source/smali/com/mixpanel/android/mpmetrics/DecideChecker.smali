.class Lcom/mixpanel/android/mpmetrics/DecideChecker;
.super Ljava/lang/Object;
.source "DecideChecker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;,
        Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;
    }
.end annotation


# static fields
.field private static final EMPTY_JSON_ARRAY:Lorg/json/JSONArray;

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.DChecker"


# instance fields
.field private final mChecks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/mpmetrics/DecideMessages;",
            ">;"
        }
    .end annotation
.end field

.field private final mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

.field private final mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 305
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->EMPTY_JSON_ARRAY:Lorg/json/JSONArray;

    .line 307
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MPConfig;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "config"    # Lcom/mixpanel/android/mpmetrics/MPConfig;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mContext:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    .line 49
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mChecks:Ljava/util/List;

    .line 50
    return-void
.end method

.method static synthetic access$0()Lorg/json/JSONArray;
    .locals 1

    .prologue
    .line 305
    sget-object v0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->EMPTY_JSON_ARRAY:Lorg/json/JSONArray;

    return-object v0
.end method

.method private getDecideResponseFromServer(Ljava/lang/String;Ljava/lang/String;Lcom/mixpanel/android/util/RemoteService;)Ljava/lang/String;
    .locals 12
    .param p1, "unescapedToken"    # Ljava/lang/String;
    .param p2, "unescapedDistinctId"    # Ljava/lang/String;
    .param p3, "poster"    # Lcom/mixpanel/android/util/RemoteService;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
        }
    .end annotation

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 191
    :try_start_0
    const-string v8, "utf-8"

    invoke-static {p1, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 192
    .local v3, "escapedToken":Ljava/lang/String;
    if-eqz p2, :cond_2

    .line 193
    const-string v8, "utf-8"

    invoke-static {p2, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 201
    .local v2, "escapedId":Ljava/lang/String;
    :goto_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    const-string v9, "?version=1&lib=android&token="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 203
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 205
    .local v5, "queryBuilder":Ljava/lang/StringBuilder;
    if-eqz v2, :cond_0

    .line 206
    const-string v8, "&distinct_id="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 211
    .local v0, "checkQuery":Ljava/lang/String;
    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-virtual {v8}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableFallback()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 212
    new-array v7, v11, [Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-virtual {v9}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDecideEndpoint()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v10

    .line 218
    .local v7, "urls":[Ljava/lang/String;
    :goto_1
    sget-boolean v8, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v8, :cond_1

    .line 219
    const-string v8, "MixpanelAPI.DChecker"

    const-string v9, "Querying decide server, urls:"

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_2
    array-length v8, v7

    if-lt v4, v8, :cond_4

    .line 225
    .end local v4    # "i":I
    :cond_1
    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mContext:Landroid/content/Context;

    invoke-static {p3, v8, v7}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->getUrls(Lcom/mixpanel/android/util/RemoteService;Landroid/content/Context;[Ljava/lang/String;)[B

    move-result-object v6

    .line 226
    .local v6, "response":[B
    if-nez v6, :cond_5

    .line 227
    const/4 v8, 0x0

    .line 230
    :goto_3
    return-object v8

    .line 195
    .end local v0    # "checkQuery":Ljava/lang/String;
    .end local v2    # "escapedId":Ljava/lang/String;
    .end local v5    # "queryBuilder":Ljava/lang/StringBuilder;
    .end local v6    # "response":[B
    .end local v7    # "urls":[Ljava/lang/String;
    :cond_2
    const/4 v2, 0x0

    .restart local v2    # "escapedId":Ljava/lang/String;
    goto :goto_0

    .line 197
    .end local v2    # "escapedId":Ljava/lang/String;
    .end local v3    # "escapedToken":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 198
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v8, Ljava/lang/RuntimeException;

    const-string v9, "Mixpanel library requires utf-8 string encoding to be available"

    invoke-direct {v8, v9, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v8

    .line 214
    .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
    .restart local v0    # "checkQuery":Ljava/lang/String;
    .restart local v2    # "escapedId":Ljava/lang/String;
    .restart local v3    # "escapedToken":Ljava/lang/String;
    .restart local v5    # "queryBuilder":Ljava/lang/StringBuilder;
    :cond_3
    const/4 v8, 0x2

    new-array v7, v8, [Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-virtual {v9}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDecideEndpoint()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v10

    .line 215
    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-virtual {v9}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDecideFallbackEndpoint()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v11

    .line 214
    .restart local v7    # "urls":[Ljava/lang/String;
    goto :goto_1

    .line 221
    .restart local v4    # "i":I
    :cond_4
    const-string v8, "MixpanelAPI.DChecker"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "    >> "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v10, v7, v4

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 230
    .end local v4    # "i":I
    .restart local v6    # "response":[B
    :cond_5
    :try_start_1
    new-instance v8, Ljava/lang/String;

    const-string v9, "UTF-8"

    invoke-direct {v8, v6, v9}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 231
    :catch_1
    move-exception v1

    .line 232
    .restart local v1    # "e":Ljava/io/UnsupportedEncodingException;
    new-instance v8, Ljava/lang/RuntimeException;

    const-string v9, "UTF not supported on this platform?"

    invoke-direct {v8, v9, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v8
.end method

.method private static getDisplayWidth(Landroid/view/Display;)I
    .locals 3
    .param p0, "display"    # Landroid/view/Display;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 262
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xd

    if-ge v1, v2, :cond_0

    .line 263
    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I

    move-result v1

    .line 267
    :goto_0
    return v1

    .line 265
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 266
    .local v0, "displaySize":Landroid/graphics/Point;
    invoke-virtual {p0, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 267
    iget v1, v0, Landroid/graphics/Point;->x:I

    goto :goto_0
.end method

.method private static getNotificationImage(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/content/Context;Lcom/mixpanel/android/util/RemoteService;)Landroid/graphics/Bitmap;
    .locals 11
    .param p0, "notification"    # Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "poster"    # Lcom/mixpanel/android/util/RemoteService;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
        }
    .end annotation

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 238
    const/4 v3, 0x0

    .line 239
    .local v3, "ret":Landroid/graphics/Bitmap;
    new-array v4, v10, [Ljava/lang/String;

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getImage2xUrl()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v8

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v9

    .line 241
    .local v4, "urls":[Ljava/lang/String;
    const-string v6, "window"

    invoke-virtual {p1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/WindowManager;

    .line 242
    .local v5, "wm":Landroid/view/WindowManager;
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 243
    .local v0, "display":Landroid/view/Display;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->getDisplayWidth(Landroid/view/Display;)I

    move-result v1

    .line 245
    .local v1, "displayWidth":I
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getType()Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    move-result-object v6

    sget-object v7, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    if-ne v6, v7, :cond_0

    const/16 v6, 0x2d0

    if-lt v1, v6, :cond_0

    .line 246
    const/4 v6, 0x3

    new-array v4, v6, [Ljava/lang/String;

    .end local v4    # "urls":[Ljava/lang/String;
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getImage4xUrl()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v8

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getImage2xUrl()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v9

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v10

    .line 249
    .restart local v4    # "urls":[Ljava/lang/String;
    :cond_0
    invoke-static {p2, p1, v4}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->getUrls(Lcom/mixpanel/android/util/RemoteService;Landroid/content/Context;[Ljava/lang/String;)[B

    move-result-object v2

    .line 250
    .local v2, "response":[B
    if-eqz v2, :cond_1

    .line 251
    array-length v6, v2

    invoke-static {v2, v8, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 256
    :goto_0
    return-object v3

    .line 253
    :cond_1
    const-string v6, "MixpanelAPI.DChecker"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Failed to download images from "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static getUrls(Lcom/mixpanel/android/util/RemoteService;Landroid/content/Context;[Ljava/lang/String;)[B
    .locals 8
    .param p0, "poster"    # Lcom/mixpanel/android/util/RemoteService;
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "urls"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 273
    invoke-interface {p0, p1}, Lcom/mixpanel/android/util/RemoteService;->isOnline(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 298
    :cond_0
    :goto_0
    return-object v1

    .line 277
    :cond_1
    const/4 v1, 0x0

    .line 278
    .local v1, "response":[B
    array-length v4, p2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v4, :cond_0

    aget-object v2, p2, v3

    .line 280
    .local v2, "url":Ljava/lang/String;
    const/4 v5, 0x0

    :try_start_0
    invoke-interface {p0, v2, v5}, Lcom/mixpanel/android/util/RemoteService;->performRequest(Ljava/lang/String;Ljava/util/List;)[B
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v1

    goto :goto_0

    .line 282
    :catch_0
    move-exception v0

    .line 283
    .local v0, "e":Ljava/net/MalformedURLException;
    const-string v5, "MixpanelAPI.DChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Cannot interpret "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " as a URL."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 278
    .end local v0    # "e":Ljava/net/MalformedURLException;
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 284
    :catch_1
    move-exception v0

    .line 285
    .local v0, "e":Ljava/io/FileNotFoundException;
    sget-boolean v5, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v5, :cond_2

    .line 286
    const-string v5, "MixpanelAPI.DChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Cannot get "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", file not found."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 288
    .end local v0    # "e":Ljava/io/FileNotFoundException;
    :catch_2
    move-exception v0

    .line 289
    .local v0, "e":Ljava/io/IOException;
    sget-boolean v5, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v5, :cond_2

    .line 290
    const-string v5, "MixpanelAPI.DChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Cannot get "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 292
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 293
    .local v0, "e":Ljava/lang/OutOfMemoryError;
    const-string v3, "MixpanelAPI.DChecker"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Out of memory when getting to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0
.end method

.method static parseDecideResponse(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
    .locals 15
    .param p0, "responseString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;
        }
    .end annotation

    .prologue
    .line 109
    new-instance v8, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;

    invoke-direct {v8}, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;-><init>()V

    .line 112
    .local v8, "ret":Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .local v7, "response":Lorg/json/JSONObject;
    const/4 v11, 0x0

    .line 119
    .local v11, "surveys":Lorg/json/JSONArray;
    const-string v12, "surveys"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 121
    :try_start_1
    const-string v12, "surveys"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v11

    .line 127
    :cond_0
    :goto_0
    if-eqz v11, :cond_1

    .line 128
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-lt v1, v12, :cond_6

    .line 141
    .end local v1    # "i":I
    :cond_1
    const/4 v5, 0x0

    .line 142
    .local v5, "notifications":Lorg/json/JSONArray;
    const-string v12, "notifications"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 144
    :try_start_2
    const-string v12, "notifications"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v5

    .line 150
    :cond_2
    :goto_2
    if-eqz v5, :cond_3

    .line 151
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v12

    const/4 v13, 0x2

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 152
    .local v6, "notificationsToRead":I
    const/4 v1, 0x0

    .restart local v1    # "i":I
    :goto_3
    if-lt v1, v6, :cond_7

    .line 167
    .end local v1    # "i":I
    .end local v6    # "notificationsToRead":I
    :cond_3
    const-string v12, "event_bindings"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 169
    :try_start_3
    const-string v12, "event_bindings"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    iput-object v12, v8, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->eventBindings:Lorg/json/JSONArray;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_8

    .line 175
    :cond_4
    :goto_4
    const-string v12, "variants"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 177
    :try_start_4
    const-string v12, "variants"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    iput-object v12, v8, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->variants:Lorg/json/JSONArray;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_9

    .line 183
    :cond_5
    :goto_5
    return-object v8

    .line 113
    .end local v5    # "notifications":Lorg/json/JSONArray;
    .end local v7    # "response":Lorg/json/JSONObject;
    .end local v11    # "surveys":Lorg/json/JSONArray;
    :catch_0
    move-exception v0

    .line 114
    .local v0, "e":Lorg/json/JSONException;
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Mixpanel endpoint returned unparsable result:\n"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 115
    .local v2, "message":Ljava/lang/String;
    new-instance v12, Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;

    invoke-direct {v12, v2, v0}, Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;-><init>(Ljava/lang/String;Lorg/json/JSONException;)V

    throw v12

    .line 122
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v2    # "message":Ljava/lang/String;
    .restart local v7    # "response":Lorg/json/JSONObject;
    .restart local v11    # "surveys":Lorg/json/JSONArray;
    :catch_1
    move-exception v0

    .line 123
    .restart local v0    # "e":Lorg/json/JSONException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Mixpanel endpoint returned non-array JSON for surveys: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 130
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "i":I
    :cond_6
    :try_start_5
    invoke-virtual {v11, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 131
    .local v10, "surveyJson":Lorg/json/JSONObject;
    new-instance v9, Lcom/mixpanel/android/mpmetrics/Survey;

    invoke-direct {v9, v10}, Lcom/mixpanel/android/mpmetrics/Survey;-><init>(Lorg/json/JSONObject;)V

    .line 132
    .local v9, "survey":Lcom/mixpanel/android/mpmetrics/Survey;
    iget-object v12, v8, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->surveys:Ljava/util/List;

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/mixpanel/android/mpmetrics/BadDecideObjectException; {:try_start_5 .. :try_end_5} :catch_3

    .line 128
    .end local v9    # "survey":Lcom/mixpanel/android/mpmetrics/Survey;
    .end local v10    # "surveyJson":Lorg/json/JSONObject;
    :goto_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 133
    :catch_2
    move-exception v0

    .line 134
    .restart local v0    # "e":Lorg/json/JSONException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Received a strange response from surveys service: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    .line 135
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_3
    move-exception v0

    .line 136
    .local v0, "e":Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Received a strange response from surveys service: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    .line 145
    .end local v0    # "e":Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
    .end local v1    # "i":I
    .restart local v5    # "notifications":Lorg/json/JSONArray;
    :catch_4
    move-exception v0

    .line 146
    .local v0, "e":Lorg/json/JSONException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Mixpanel endpoint returned non-array JSON for notifications: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    .line 154
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "i":I
    .restart local v6    # "notificationsToRead":I
    :cond_7
    :try_start_6
    invoke-virtual {v5, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 155
    .local v4, "notificationJson":Lorg/json/JSONObject;
    new-instance v3, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-direct {v3, v4}, Lcom/mixpanel/android/mpmetrics/InAppNotification;-><init>(Lorg/json/JSONObject;)V

    .line 156
    .local v3, "notification":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    iget-object v12, v8, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->notifications:Ljava/util/List;

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Lcom/mixpanel/android/mpmetrics/BadDecideObjectException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_7

    .line 152
    .end local v3    # "notification":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .end local v4    # "notificationJson":Lorg/json/JSONObject;
    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_3

    .line 157
    :catch_5
    move-exception v0

    .line 158
    .restart local v0    # "e":Lorg/json/JSONException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Received a strange response from notifications service: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_7

    .line 159
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_6
    move-exception v0

    .line 160
    .local v0, "e":Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Received a strange response from notifications service: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_7

    .line 161
    .end local v0    # "e":Lcom/mixpanel/android/mpmetrics/BadDecideObjectException;
    :catch_7
    move-exception v0

    .line 162
    .local v0, "e":Ljava/lang/OutOfMemoryError;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Not enough memory to show load notification from package: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_7

    .line 170
    .end local v0    # "e":Ljava/lang/OutOfMemoryError;
    .end local v1    # "i":I
    .end local v6    # "notificationsToRead":I
    :catch_8
    move-exception v0

    .line 171
    .local v0, "e":Lorg/json/JSONException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Mixpanel endpoint returned non-array JSON for event bindings: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    .line 178
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_9
    move-exception v0

    .line 179
    .restart local v0    # "e":Lorg/json/JSONException;
    const-string v12, "MixpanelAPI.DChecker"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Mixpanel endpoint returned non-array JSON for variants: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_5
.end method

.method private runDecideCheck(Ljava/lang/String;Ljava/lang/String;Lcom/mixpanel/android/util/RemoteService;)Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
    .locals 8
    .param p1, "token"    # Ljava/lang/String;
    .param p2, "distinctId"    # Ljava/lang/String;
    .param p3, "poster"    # Lcom/mixpanel/android/util/RemoteService;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;,
            Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;
        }
    .end annotation

    .prologue
    .line 80
    invoke-direct {p0, p1, p2, p3}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->getDecideResponseFromServer(Ljava/lang/String;Ljava/lang/String;Lcom/mixpanel/android/util/RemoteService;)Ljava/lang/String;

    move-result-object v4

    .line 81
    .local v4, "responseString":Ljava/lang/String;
    sget-boolean v5, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v5, :cond_0

    .line 82
    const-string v5, "MixpanelAPI.DChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Mixpanel decide server response was:\n"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    :cond_0
    new-instance v3, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;

    invoke-direct {v3}, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;-><init>()V

    .line 86
    .local v3, "parsed":Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
    if-eqz v4, :cond_1

    .line 87
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->parseDecideResponse(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;

    move-result-object v3

    .line 90
    :cond_1
    iget-object v5, v3, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->notifications:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 91
    .local v2, "notificationIterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/mixpanel/android/mpmetrics/InAppNotification;>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    .line 103
    return-object v3

    .line 92
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 93
    .local v1, "notification":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mContext:Landroid/content/Context;

    invoke-static {v1, v5, p3}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->getNotificationImage(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/content/Context;Lcom/mixpanel/android/util/RemoteService;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 94
    .local v0, "image":Landroid/graphics/Bitmap;
    if-nez v0, :cond_3

    .line 95
    const-string v5, "MixpanelAPI.DChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Could not retrieve image for notification "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getId()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 96
    const-string v7, ", will not show the notification."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 95
    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 99
    :cond_3
    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->setImage(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method


# virtual methods
.method public addDecideCheck(Lcom/mixpanel/android/mpmetrics/DecideMessages;)V
    .locals 1
    .param p1, "check"    # Lcom/mixpanel/android/mpmetrics/DecideMessages;

    .prologue
    .line 53
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mChecks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    return-void
.end method

.method public runDecideChecks(Lcom/mixpanel/android/util/RemoteService;)V
    .locals 9
    .param p1, "poster"    # Lcom/mixpanel/android/util/RemoteService;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
        }
    .end annotation

    .prologue
    .line 57
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker;->mChecks:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 58
    .local v2, "itr":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/mixpanel/android/mpmetrics/DecideMessages;>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    .line 68
    return-void

    .line 59
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mixpanel/android/mpmetrics/DecideMessages;

    .line 60
    .local v4, "updates":Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getDistinctId()Ljava/lang/String;

    move-result-object v0

    .line 62
    .local v0, "distinctId":Ljava/lang/String;
    :try_start_0
    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getToken()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5, v0, p1}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->runDecideCheck(Ljava/lang/String;Ljava/lang/String;Lcom/mixpanel/android/util/RemoteService;)Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;

    move-result-object v3

    .line 63
    .local v3, "result":Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
    iget-object v5, v3, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->surveys:Ljava/util/List;

    iget-object v6, v3, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->notifications:Ljava/util/List;

    iget-object v7, v3, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->eventBindings:Lorg/json/JSONArray;

    iget-object v8, v3, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->variants:Lorg/json/JSONArray;

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->reportResults(Ljava/util/List;Ljava/util/List;Lorg/json/JSONArray;Lorg/json/JSONArray;)V
    :try_end_0
    .catch Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 64
    .end local v3    # "result":Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
    :catch_0
    move-exception v1

    .line 65
    .local v1, "e":Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;
    const-string v5, "MixpanelAPI.DChecker"

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/DecideChecker$UnintelligibleMessageException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
