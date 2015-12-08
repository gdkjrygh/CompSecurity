.class public Lcom/urbanairship/richpush/RichPushUpdateService;
.super Landroid/app/IntentService;
.source "RichPushUpdateService.java"


# static fields
.field public static final ACTION_RICH_PUSH_MESSAGES_UPDATE:Ljava/lang/String; = "com.urbanairship.richpush.MESSAGES_UPDATE"

.field public static final ACTION_RICH_PUSH_USER_UPDATE:Ljava/lang/String; = "com.urbanairship.richpush.USER_UPDATE"

.field private static final DELETE_MESSAGES_KEY:Ljava/lang/String; = "delete"

.field private static final DELETE_MESSAGES_URL:Ljava/lang/String; = "api/user/%s/messages/delete/"

.field public static final EXTRA_RICH_PUSH_RESULT_RECEIVER:Ljava/lang/String; = "com.urbanairship.richpush.RESULT_RECEIVER"

.field private static final MARK_READ_MESSAGES_KEY:Ljava/lang/String; = "mark_as_read"

.field private static final MARK_READ_MESSAGES_URL:Ljava/lang/String; = "api/user/%s/messages/unread/"

.field private static final MESSAGES_URL:Ljava/lang/String; = "api/user/%s/messages/"

.field private static final MESSAGE_URL:Ljava/lang/String; = "api/user/%s/messages/message/%s/"

.field private static final PAYLOAD_ADD_KEY:Ljava/lang/String; = "add"

.field private static final PAYLOAD_APIDS_KEY:Ljava/lang/String; = "apids"

.field public static final STATUS_RICH_PUSH_UPDATE_ERROR:I = 0x1

.field public static final STATUS_RICH_PUSH_UPDATE_SUCCESS:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 102
    const-string v0, "RichPushUpdateService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 103
    return-void
.end method

.method private buildMessagesPayload(Ljava/lang/String;Ljava/util/Set;)Lorg/apache/http/HttpEntity;
    .locals 8
    .param p1, "root"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/apache/http/HttpEntity;"
        }
    .end annotation

    .prologue
    .line 389
    .local p2, "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 390
    .local v3, "payload":Lorg/json/JSONObject;
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v3, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 391
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v5

    invoke-virtual {v5}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v4

    .line 392
    .local v4, "userId":Ljava/lang/String;
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 393
    .local v2, "id":Ljava/lang/String;
    const-string v5, "api/user/%s/messages/message/%s/"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    const/4 v7, 0x1

    aput-object v2, v6, v7

    invoke-direct {p0, v5, v6}, Lcom/urbanairship/richpush/RichPushUpdateService;->formatUrl(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, p1, v5}, Lorg/json/JSONObject;->accumulate(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 397
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v2    # "id":Ljava/lang/String;
    .end local v3    # "payload":Lorg/json/JSONObject;
    .end local v4    # "userId":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 398
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 402
    .end local v0    # "e":Lorg/json/JSONException;
    :goto_1
    const/4 v5, 0x0

    :goto_2
    return-object v5

    .line 395
    .restart local v1    # "i$":Ljava/util/Iterator;
    .restart local v3    # "payload":Lorg/json/JSONObject;
    .restart local v4    # "userId":Ljava/lang/String;
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 396
    new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "UTF-8"

    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 399
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v3    # "payload":Lorg/json/JSONObject;
    .end local v4    # "userId":Ljava/lang/String;
    :catch_1
    move-exception v0

    .line 400
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private buildRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;)Lcom/urbanairship/restclient/Request;
    .locals 3
    .param p1, "type"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "entity"    # Lorg/apache/http/HttpEntity;

    .prologue
    .line 375
    invoke-static {}, Lcom/urbanairship/richpush/RichPushUser;->isCreated()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 376
    new-instance v0, Lcom/urbanairship/richpush/RichPushUserAuthenticatedRequest;

    invoke-direct {v0, p1, p2}, Lcom/urbanairship/richpush/RichPushUserAuthenticatedRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .local v0, "request":Lcom/urbanairship/restclient/Request;
    :goto_0
    if-eqz p3, :cond_0

    .line 381
    invoke-virtual {v0, p3}, Lcom/urbanairship/restclient/Request;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 382
    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-virtual {v0, v1, v2}, Lcom/urbanairship/restclient/Request;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    :cond_0
    return-object v0

    .line 378
    .end local v0    # "request":Lcom/urbanairship/restclient/Request;
    :cond_1
    new-instance v0, Lcom/urbanairship/restclient/AppAuthenticatedRequest;

    invoke-direct {v0, p1, p2}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .restart local v0    # "request":Lcom/urbanairship/restclient/Request;
    goto :goto_0
.end method

.method private static createNewUserPayload()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 471
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 473
    .local v2, "payload":Lorg/json/JSONObject;
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v0

    .line 474
    .local v0, "apid":Ljava/lang/String;
    invoke-static {v0}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 475
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 476
    .local v1, "array":Lorg/json/JSONArray;
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 477
    const-string v3, "apids"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 480
    .end local v1    # "array":Lorg/json/JSONArray;
    :cond_0
    return-object v2
.end method

.method private static createUpdateUserPayload()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 488
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 489
    .local v2, "payload":Lorg/json/JSONObject;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 491
    .local v0, "apidPayload":Lorg/json/JSONObject;
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 492
    .local v1, "apids":Lorg/json/JSONArray;
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 494
    const-string v3, "add"

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 495
    const-string v3, "apids"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 497
    return-object v2
.end method

.method private createUser()Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 177
    const-string v3, "Creating user"

    invoke-static {v3}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 179
    :try_start_0
    const-string v3, "POST"

    invoke-static {}, Lcom/urbanairship/richpush/RichPushUser;->newUserUrl()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-static {}, Lcom/urbanairship/richpush/RichPushUpdateService;->createNewUserPayload()Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "UTF-8"

    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-direct {p0, v3, v4, v5}, Lcom/urbanairship/richpush/RichPushUpdateService;->sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;)Lcom/urbanairship/restclient/Response;

    move-result-object v1

    .line 182
    .local v1, "response":Lcom/urbanairship/restclient/Response;
    if-nez v1, :cond_0

    .line 183
    const-string v3, "User creation failed. No network response."

    invoke-static {v3}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 199
    .end local v1    # "response":Lcom/urbanairship/restclient/Response;
    :goto_0
    return v2

    .line 185
    .restart local v1    # "response":Lcom/urbanairship/restclient/Response;
    :cond_0
    invoke-virtual {v1}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v3

    const/16 v4, 0xc9

    if-ne v3, v4, :cond_1

    .line 186
    const-string v3, "User creation succeeded. Updating"

    invoke-static {v3}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v1}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/richpush/RichPushUser;->updateUserAttributes(Ljava/lang/String;)V

    .line 188
    const/4 v2, 0x1

    goto :goto_0

    .line 190
    :cond_1
    const-string v3, "User creation failed. Logging."

    invoke-static {v3}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 191
    invoke-virtual {v1}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 194
    .end local v1    # "response":Lcom/urbanairship/restclient/Response;
    :catch_0
    move-exception v0

    .line 195
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "Exception constructing JSON data when creating user."

    invoke-static {v3, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 196
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v0

    .line 197
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    const-string v3, "Error creating user."

    invoke-static {v3, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private deleteMessagesOnServer(Ljava/util/Set;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 346
    .local p1, "deletedIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const-string v0, "POST"

    const-string v1, "api/user/%s/messages/delete/"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {p0, v1, v2}, Lcom/urbanairship/richpush/RichPushUpdateService;->formatUrl(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "delete"

    invoke-direct {p0, v2, p1}, Lcom/urbanairship/richpush/RichPushUpdateService;->buildMessagesPayload(Ljava/lang/String;Ljava/util/Set;)Lorg/apache/http/HttpEntity;

    move-result-object v2

    const/16 v3, 0xc8

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/urbanairship/richpush/RichPushUpdateService;->sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;I)Z

    move-result v0

    return v0
.end method

.method private formatUrl(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "urlFormat"    # Ljava/lang/String;
    .param p2, "urlParams"    # [Ljava/lang/String;

    .prologue
    .line 406
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getHostUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p2, [Ljava/lang/Object;

    .end local p2    # "urlParams":[Ljava/lang/String;
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 407
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private getHostUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 446
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v0

    iget-object v0, v0, Lcom/urbanairship/AirshipConfigOptions;->hostURL:Ljava/lang/String;

    return-object v0
.end method

.method private getMessageIdsFromCursor(Landroid/database/Cursor;)Ljava/util/Set;
    .locals 3
    .param p1, "cursor"    # Landroid/database/Cursor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 450
    if-nez p1, :cond_0

    .line 451
    const/4 v0, 0x0

    .line 466
    :goto_0
    return-object v0

    .line 454
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 456
    .local v0, "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const/4 v1, -0x1

    .line 457
    .local v1, "messageIdIndex":I
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 458
    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 459
    const-string v2, "message_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 461
    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 464
    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto :goto_0
.end method

.method private getUser()Lcom/urbanairship/richpush/RichPushUser;
    .locals 1

    .prologue
    .line 442
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v0

    return-object v0
.end method

.method private handleDeletedMessages()V
    .locals 3

    .prologue
    .line 228
    sget-object v1, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushResolver;->getDeletedMessages()Landroid/database/Cursor;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/urbanairship/richpush/RichPushUpdateService;->getMessageIdsFromCursor(Landroid/database/Cursor;)Ljava/util/Set;

    move-result-object v0

    .line 230
    .local v0, "idsToDelete":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " messages to delete."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 235
    invoke-direct {p0, v0}, Lcom/urbanairship/richpush/RichPushUpdateService;->deleteMessagesOnServer(Ljava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 236
    sget-object v1, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v1, v0}, Lcom/urbanairship/richpush/RichPushResolver;->deleteMessages(Ljava/util/Set;)I

    .line 239
    :cond_0
    return-void
.end method

.method private handleReadMessages()V
    .locals 4

    .prologue
    .line 242
    sget-object v2, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushResolver;->getReadUpdatedMessages()Landroid/database/Cursor;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/urbanairship/richpush/RichPushUpdateService;->getMessageIdsFromCursor(Landroid/database/Cursor;)Ljava/util/Set;

    move-result-object v0

    .line 244
    .local v0, "idsToUpdate":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 245
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " messages to mark read."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 251
    invoke-direct {p0, v0}, Lcom/urbanairship/richpush/RichPushUpdateService;->markMessagesReadOnServer(Ljava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 252
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 253
    .local v1, "values":Landroid/content/ContentValues;
    const-string v2, "unread_orig"

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 254
    sget-object v2, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v2, v0, v1}, Lcom/urbanairship/richpush/RichPushResolver;->updateMessages(Ljava/util/Set;Landroid/content/ContentValues;)I

    .line 257
    .end local v1    # "values":Landroid/content/ContentValues;
    :cond_0
    return-void
.end method

.method private markMessagesReadOnServer(Ljava/util/Set;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 352
    .local p1, "readIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const-string v0, "POST"

    const-string v1, "api/user/%s/messages/unread/"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {p0, v1, v2}, Lcom/urbanairship/richpush/RichPushUpdateService;->formatUrl(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mark_as_read"

    invoke-direct {p0, v2, p1}, Lcom/urbanairship/richpush/RichPushUpdateService;->buildMessagesPayload(Ljava/lang/String;Ljava/util/Set;)Lorg/apache/http/HttpEntity;

    move-result-object v2

    const/16 v3, 0xc8

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/urbanairship/richpush/RichPushUpdateService;->sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;I)Z

    move-result v0

    return v0
.end method

.method private messagesFromResponse(Lcom/urbanairship/restclient/Response;)[Landroid/content/ContentValues;
    .locals 8
    .param p1, "response"    # Lcom/urbanairship/restclient/Response;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 411
    new-instance v6, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v7, "messages"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 413
    .local v4, "messagesJsonArray":Lorg/json/JSONArray;
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    .line 414
    .local v0, "count":I
    new-array v3, v0, [Landroid/content/ContentValues;

    .line 416
    .local v3, "messages":[Landroid/content/ContentValues;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v0, :cond_1

    .line 417
    invoke-virtual {v4, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 419
    .local v2, "messageJson":Lorg/json/JSONObject;
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 420
    .local v5, "values":Landroid/content/ContentValues;
    const-string v6, "timestamp"

    const-string v7, "message_sent"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    const-string v6, "message_id"

    const-string v7, "message_id"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    const-string v6, "message_url"

    const-string v7, "message_url"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    const-string v6, "message_body_url"

    const-string v7, "message_body_url"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    const-string v6, "message_read_url"

    const-string v7, "message_read_url"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    const-string v6, "title"

    const-string v7, "title"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    const-string v6, "unread_orig"

    const-string v7, "unread"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 428
    const-string v6, "extra"

    const-string v7, "extra"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    const-string v6, "raw_message_object"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    const-string v6, "message_expiry"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 432
    const-string v6, "expiration_timestamp"

    const-string v7, "message_expiry"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    :cond_0
    aput-object v5, v3, v1

    .line 416
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 438
    .end local v2    # "messageJson":Lorg/json/JSONObject;
    .end local v5    # "values":Landroid/content/ContentValues;
    :cond_1
    return-object v3
.end method

.method private messagesUpdate(Landroid/os/ResultReceiver;)V
    .locals 1
    .param p1, "receiver"    # Landroid/os/ResultReceiver;

    .prologue
    .line 155
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->updateMessages()Z

    move-result v0

    .line 156
    .local v0, "success":Z
    invoke-direct {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushUpdateService;->respond(Landroid/os/ResultReceiver;Z)V

    .line 159
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->handleReadMessages()V

    .line 160
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->handleDeletedMessages()V

    .line 161
    return-void
.end method

.method private respond(Landroid/os/ResultReceiver;Z)V
    .locals 1
    .param p1, "receiver"    # Landroid/os/ResultReceiver;
    .param p2, "status"    # Z

    .prologue
    .line 149
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/urbanairship/richpush/RichPushUpdateService;->respond(Landroid/os/ResultReceiver;ZLandroid/os/Bundle;)V

    .line 150
    return-void
.end method

.method private respond(Landroid/os/ResultReceiver;ZLandroid/os/Bundle;)V
    .locals 1
    .param p1, "receiver"    # Landroid/os/ResultReceiver;
    .param p2, "status"    # Z
    .param p3, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 136
    if-eqz p1, :cond_1

    .line 137
    if-nez p3, :cond_0

    .line 138
    new-instance p3, Landroid/os/Bundle;

    .end local p3    # "bundle":Landroid/os/Bundle;
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 140
    .restart local p3    # "bundle":Landroid/os/Bundle;
    :cond_0
    if-eqz p2, :cond_2

    .line 141
    const/4 v0, 0x0

    invoke-virtual {p1, v0, p3}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 146
    :cond_1
    :goto_0
    return-void

    .line 143
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p1, v0, p3}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    goto :goto_0
.end method

.method private sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;)Lcom/urbanairship/restclient/Response;
    .locals 1
    .param p1, "type"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "entity"    # Lorg/apache/http/HttpEntity;

    .prologue
    .line 361
    invoke-direct {p0, p1, p2, p3}, Lcom/urbanairship/richpush/RichPushUpdateService;->buildRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;)Lcom/urbanairship/restclient/Request;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/restclient/Request;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v0

    return-object v0
.end method

.method private sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;I)Z
    .locals 3
    .param p1, "type"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "entity"    # Lorg/apache/http/HttpEntity;
    .param p4, "expectedStatusCode"    # I

    .prologue
    .line 365
    invoke-direct {p0, p1, p2, p3}, Lcom/urbanairship/richpush/RichPushUpdateService;->sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;)Lcom/urbanairship/restclient/Response;

    move-result-object v0

    .line 366
    .local v0, "response":Lcom/urbanairship/restclient/Response;
    if-eqz v0, :cond_0

    .line 367
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The response status is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 368
    invoke-virtual {v0}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 370
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v1

    if-ne v1, p4, :cond_1

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private updateInbox([Landroid/content/ContentValues;)V
    .locals 11
    .param p1, "serverMessages"    # [Landroid/content/ContentValues;

    .prologue
    .line 313
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 314
    .local v7, "messagesToInsert":Ljava/util/List;, "Ljava/util/List<Landroid/content/ContentValues;>;"
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 316
    .local v8, "serverMessageIds":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    move-object v1, p1

    .local v1, "arr$":[Landroid/content/ContentValues;
    array-length v3, v1

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v1, v2

    .line 317
    .local v4, "message":Landroid/content/ContentValues;
    const-string v9, "message_id"

    invoke-virtual {v4, v9}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 318
    .local v6, "messageId":Ljava/lang/String;
    invoke-virtual {v8, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 320
    sget-object v9, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v9, v6, v4}, Lcom/urbanairship/richpush/RichPushResolver;->updateMessage(Ljava/lang/String;Landroid/content/ContentValues;)I

    move-result v9

    const/4 v10, 0x1

    if-eq v9, v10, :cond_0

    .line 321
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 326
    .end local v4    # "message":Landroid/content/ContentValues;
    .end local v6    # "messageId":Ljava/lang/String;
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    if-lez v9, :cond_2

    .line 327
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    new-array v5, v9, [Landroid/content/ContentValues;

    .line 328
    .local v5, "messageArray":[Landroid/content/ContentValues;
    invoke-interface {v7, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 329
    sget-object v9, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v9, v5}, Lcom/urbanairship/richpush/RichPushResolver;->insertMessages([Landroid/content/ContentValues;)I

    .line 333
    .end local v5    # "messageArray":[Landroid/content/ContentValues;
    :cond_2
    sget-object v9, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    invoke-virtual {v9}, Lcom/urbanairship/richpush/RichPushResolver;->getAllMessages()Landroid/database/Cursor;

    move-result-object v9

    invoke-direct {p0, v9}, Lcom/urbanairship/richpush/RichPushUpdateService;->getMessageIdsFromCursor(Landroid/database/Cursor;)Ljava/util/Set;

    move-result-object v0

    .line 334
    .local v0, "allIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-eqz v0, :cond_3

    .line 335
    invoke-interface {v0, v8}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 336
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v9

    invoke-virtual {v9}, Lcom/urbanairship/richpush/RichPushUser;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v9

    invoke-virtual {v9, v0}, Lcom/urbanairship/richpush/RichPushInbox;->deleteMessages(Ljava/util/Set;)V

    .line 340
    :cond_3
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v9

    invoke-virtual {v9}, Lcom/urbanairship/richpush/RichPushUser;->getInbox()Lcom/urbanairship/richpush/RichPushInbox;

    move-result-object v9

    invoke-virtual {v9}, Lcom/urbanairship/richpush/RichPushInbox;->updateCache()V

    .line 341
    return-void
.end method

.method private updateMessages()Z
    .locals 11

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 260
    const-string v7, "Updating Messages"

    invoke-static {v7}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 262
    const-string v7, "GET"

    const-string v8, "api/user/%s/messages/"

    new-array v9, v6, [Ljava/lang/String;

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v10

    invoke-virtual {v10}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v5

    invoke-direct {p0, v8, v9}, Lcom/urbanairship/richpush/RichPushUpdateService;->formatUrl(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct {p0, v7, v8, v9}, Lcom/urbanairship/richpush/RichPushUpdateService;->buildRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;)Lcom/urbanairship/restclient/Request;

    move-result-object v2

    .line 263
    .local v2, "request":Lcom/urbanairship/restclient/Request;
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v7

    invoke-virtual {v7}, Lcom/urbanairship/richpush/RichPushUser;->getLastMessageRefreshTime()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 264
    const-string v7, "If-Modified-Since"

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v8

    invoke-virtual {v8}, Lcom/urbanairship/richpush/RichPushUser;->getLastMessageRefreshTime()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lcom/urbanairship/restclient/Request;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    :cond_0
    invoke-virtual {v2}, Lcom/urbanairship/restclient/Request;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v3

    .line 269
    .local v3, "response":Lcom/urbanairship/restclient/Response;
    if-nez v3, :cond_1

    .line 270
    const-string v6, "Message list response from the server was null. Will try later."

    invoke-static {v6}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 303
    :goto_0
    return v5

    .line 274
    :cond_1
    invoke-virtual {v3}, Lcom/urbanairship/restclient/Response;->status()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    .line 283
    :sswitch_0
    :try_start_0
    invoke-direct {p0, v3}, Lcom/urbanairship/richpush/RichPushUpdateService;->messagesFromResponse(Lcom/urbanairship/restclient/Response;)[Landroid/content/ContentValues;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 289
    .local v4, "serverMessages":[Landroid/content/ContentValues;
    if-nez v4, :cond_3

    .line 290
    const-string v5, "Inbox message list is empty."

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    :cond_2
    :goto_1
    move v5, v6

    .line 300
    goto :goto_0

    .line 276
    .end local v4    # "serverMessages":[Landroid/content/ContentValues;
    :sswitch_1
    const-string v5, "Message list not modified."

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    move v5, v6

    .line 277
    goto :goto_0

    .line 284
    :catch_0
    move-exception v0

    .line 285
    .local v0, "e":Lorg/json/JSONException;
    const-string v6, "Unable to parse message list response from server"

    invoke-static {v6, v0}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 292
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v4    # "serverMessages":[Landroid/content/ContentValues;
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Received "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    array-length v7, v4

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " inbox messages."

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 293
    invoke-direct {p0, v4}, Lcom/urbanairship/richpush/RichPushUpdateService;->updateInbox([Landroid/content/ContentValues;)V

    .line 294
    const-string v5, "Last-Modified"

    invoke-virtual {v3, v5}, Lcom/urbanairship/restclient/Response;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 295
    .local v1, "header":Lorg/apache/http/Header;
    if-eqz v1, :cond_2

    .line 296
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v5

    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/urbanairship/richpush/RichPushUser;->setLastMessageRefreshTime(Ljava/lang/String;)V

    goto :goto_1

    .line 274
    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0x130 -> :sswitch_1
    .end sparse-switch
.end method

.method private updateUser()Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 203
    const-string v2, "Updating user"

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 206
    const-string v2, "No APID. Skipping user update."

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 224
    :goto_0
    return v1

    .line 211
    :cond_0
    :try_start_0
    const-string v2, "POST"

    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/richpush/RichPushUser;->userUrl()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-static {}, Lcom/urbanairship/richpush/RichPushUpdateService;->createUpdateUserPayload()Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "UTF-8"

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    const/16 v5, 0xc8

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/urbanairship/richpush/RichPushUpdateService;->sendRequest(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpEntity;I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 215
    const-string v2, "User update failed. Will retry later."

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 219
    :catch_0
    move-exception v0

    .line 220
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "Exception constructing JSON data when updating user."

    invoke-static {v2, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 218
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    .line 221
    :catch_1
    move-exception v0

    .line 222
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    const-string v2, "Error updating user."

    invoke-static {v2, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private userUpdate(Landroid/os/ResultReceiver;)V
    .locals 2
    .param p1, "receiver"    # Landroid/os/ResultReceiver;

    .prologue
    .line 164
    const/4 v0, 0x0

    .line 165
    .local v0, "success":Z
    invoke-static {}, Lcom/urbanairship/richpush/RichPushUser;->isCreated()Z

    move-result v1

    if-nez v1, :cond_0

    .line 166
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->createUser()Z

    move-result v0

    .line 171
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/urbanairship/richpush/RichPushUpdateService;->respond(Landroid/os/ResultReceiver;Z)V

    .line 172
    return-void

    .line 168
    :cond_0
    invoke-direct {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->updateUser()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .prologue
    .line 107
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 108
    invoke-virtual {p0}, Lcom/urbanairship/richpush/RichPushUpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/urbanairship/Autopilot;->automaticTakeOff(Landroid/app/Application;)V

    .line 109
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 113
    if-nez p1, :cond_1

    .line 133
    :cond_0
    :goto_0
    return-void

    .line 117
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 118
    .local v0, "action":Ljava/lang/String;
    const-string v2, "com.urbanairship.richpush.RESULT_RECEIVER"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/os/ResultReceiver;

    .line 119
    .local v1, "receiver":Landroid/os/ResultReceiver;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Starting RichPushUpdateService with action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 121
    const-string v2, "com.urbanairship.richpush.MESSAGES_UPDATE"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 123
    invoke-static {}, Lcom/urbanairship/richpush/RichPushUser;->isCreated()Z

    move-result v2

    if-nez v2, :cond_2

    .line 124
    const-string v2, "The Rich Push user has not been created, cancelling messages update"

    invoke-static {v2}, Lcom/urbanairship/Logger;->debug(Ljava/lang/String;)V

    .line 125
    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lcom/urbanairship/richpush/RichPushUpdateService;->respond(Landroid/os/ResultReceiver;Z)V

    goto :goto_0

    .line 127
    :cond_2
    invoke-direct {p0, v1}, Lcom/urbanairship/richpush/RichPushUpdateService;->messagesUpdate(Landroid/os/ResultReceiver;)V

    goto :goto_0

    .line 130
    :cond_3
    const-string v2, "com.urbanairship.richpush.USER_UPDATE"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 131
    invoke-direct {p0, v1}, Lcom/urbanairship/richpush/RichPushUpdateService;->userUpdate(Landroid/os/ResultReceiver;)V

    goto :goto_0
.end method
