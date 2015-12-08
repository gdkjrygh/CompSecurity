.class public final Lcom/facebook/share/ShareApi;
.super Ljava/lang/Object;
.source "ShareApi.java"


# static fields
.field private static final DEFAULT_CHARSET:Ljava/lang/String; = "UTF-8"

.field private static final DEFAULT_GRAPH_NODE:Ljava/lang/String; = "me"

.field private static final GRAPH_PATH_FORMAT:Ljava/lang/String; = "%s/%s"

.field private static final PHOTOS_EDGE:Ljava/lang/String; = "photos"

.field private static final TAG:Ljava/lang/String; = "ShareApi"


# instance fields
.field private graphNode:Ljava/lang/String;

.field private message:Ljava/lang/String;

.field private final shareContent:Lcom/facebook/share/model/ShareContent;


# direct methods
.method public constructor <init>(Lcom/facebook/share/model/ShareContent;)V
    .locals 1
    .param p1, "shareContent"    # Lcom/facebook/share/model/ShareContent;

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lcom/facebook/share/ShareApi;->shareContent:Lcom/facebook/share/model/ShareContent;

    .line 89
    const-string v0, "me"

    iput-object v0, p0, Lcom/facebook/share/ShareApi;->graphNode:Ljava/lang/String;

    .line 90
    return-void
.end method

.method static synthetic access$0(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 268
    invoke-static {p0}, Lcom/facebook/share/ShareApi;->handleImagesOnAction(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$1(Lcom/facebook/share/ShareApi;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 193
    invoke-direct {p0, p1}, Lcom/facebook/share/ShareApi;->getGraphPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2(Lcom/facebook/share/ShareApi;Ljava/util/ArrayList;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 421
    invoke-direct {p0, p1, p2}, Lcom/facebook/share/ShareApi;->stageArrayList(Ljava/util/ArrayList;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    return-void
.end method

.method static synthetic access$3(Lcom/facebook/share/ShareApi;Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 535
    invoke-direct {p0, p1, p2}, Lcom/facebook/share/ShareApi;->stageOpenGraphObject(Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    return-void
.end method

.method static synthetic access$4(Lcom/facebook/share/ShareApi;Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 640
    invoke-direct {p0, p1, p2}, Lcom/facebook/share/ShareApi;->stagePhoto(Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    return-void
.end method

.method private addCommonParameters(Landroid/os/Bundle;Lcom/facebook/share/model/ShareContent;)V
    .locals 3
    .param p1, "bundle"    # Landroid/os/Bundle;
    .param p2, "shareContent"    # Lcom/facebook/share/model/ShareContent;

    .prologue
    .line 205
    invoke-virtual {p2}, Lcom/facebook/share/model/ShareContent;->getPeopleIds()Ljava/util/List;

    move-result-object v0

    .line 206
    .local v0, "peopleIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 207
    const-string v1, "tags"

    const-string v2, ", "

    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/share/model/ShareContent;->getPlaceId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 211
    const-string v1, "place"

    invoke-virtual {p2}, Lcom/facebook/share/model/ShareContent;->getPlaceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/share/model/ShareContent;->getRef()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 215
    const-string v1, "ref"

    invoke-virtual {p2}, Lcom/facebook/share/model/ShareContent;->getRef()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    :cond_2
    return-void
.end method

.method private getGraphPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "pathAfterGraphNode"    # Ljava/lang/String;

    .prologue
    .line 196
    :try_start_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "%s/%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 197
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getGraphNode()Ljava/lang/String;

    move-result-object v5

    const-string v6, "UTF-8"

    invoke-static {v5, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    .line 198
    aput-object p1, v3, v4

    .line 195
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 200
    :goto_0
    return-object v1

    .line 199
    :catch_0
    move-exception v0

    .line 200
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private static handleImagesOnAction(Landroid/os/Bundle;)V
    .locals 11
    .param p0, "parameters"    # Landroid/os/Bundle;

    .prologue
    .line 272
    const-string v6, "image"

    invoke-virtual {p0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 273
    .local v2, "imageStr":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 276
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 277
    .local v3, "images":Lorg/json/JSONArray;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-lt v0, v6, :cond_1

    .line 287
    const-string v6, "image"

    invoke-virtual {p0, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 303
    .end local v0    # "i":I
    .end local v3    # "images":Lorg/json/JSONArray;
    :cond_0
    :goto_1
    return-void

    .line 278
    .restart local v0    # "i":I
    .restart local v3    # "images":Lorg/json/JSONArray;
    :cond_1
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 279
    .local v4, "jsonImage":Lorg/json/JSONObject;
    if-eqz v4, :cond_2

    .line 280
    invoke-static {p0, v0, v4}, Lcom/facebook/share/ShareApi;->putImageInBundleWithArrayFormat(Landroid/os/Bundle;ILorg/json/JSONObject;)V

    .line 277
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 283
    :cond_2
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 284
    .local v5, "url":Ljava/lang/String;
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v7, "image[%d][url]"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 289
    .end local v0    # "i":I
    .end local v3    # "images":Lorg/json/JSONArray;
    .end local v4    # "jsonImage":Lorg/json/JSONObject;
    .end local v5    # "url":Ljava/lang/String;
    :catch_0
    move-exception v6

    .line 295
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 296
    .local v1, "image":Lorg/json/JSONObject;
    const/4 v6, 0x0

    invoke-static {p0, v6, v1}, Lcom/facebook/share/ShareApi;->putImageInBundleWithArrayFormat(Landroid/os/Bundle;ILorg/json/JSONObject;)V

    .line 297
    const-string v6, "image"

    invoke-virtual {p0, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 298
    .end local v1    # "image":Lorg/json/JSONObject;
    :catch_1
    move-exception v6

    goto :goto_1
.end method

.method private static putImageInBundleWithArrayFormat(Landroid/os/Bundle;ILorg/json/JSONObject;)V
    .locals 8
    .param p0, "parameters"    # Landroid/os/Bundle;
    .param p1, "index"    # I
    .param p2, "image"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 309
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 310
    .local v1, "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 315
    return-void

    .line 311
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 312
    .local v2, "property":Ljava/lang/String;
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "image[%d][%s]"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v2, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 313
    .local v0, "key":Ljava/lang/String;
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static share(Lcom/facebook/share/model/ShareContent;Lcom/facebook/FacebookCallback;)V
    .locals 1
    .param p0, "shareContent"    # Lcom/facebook/share/model/ShareContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 78
    .local p1, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    new-instance v0, Lcom/facebook/share/ShareApi;

    invoke-direct {v0, p0}, Lcom/facebook/share/ShareApi;-><init>(Lcom/facebook/share/model/ShareContent;)V

    .line 79
    invoke-virtual {v0, p1}, Lcom/facebook/share/ShareApi;->share(Lcom/facebook/FacebookCallback;)V

    .line 80
    return-void
.end method

.method private shareLinkContent(Lcom/facebook/share/model/ShareLinkContent;Lcom/facebook/FacebookCallback;)V
    .locals 6
    .param p1, "linkContent"    # Lcom/facebook/share/model/ShareLinkContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareLinkContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 388
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    new-instance v5, Lcom/facebook/share/ShareApi$4;

    invoke-direct {v5, p0, p2}, Lcom/facebook/share/ShareApi$4;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V

    .line 396
    .local v5, "requestCallback":Lcom/facebook/GraphRequest$Callback;
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 397
    .local v3, "parameters":Landroid/os/Bundle;
    invoke-direct {p0, v3, p1}, Lcom/facebook/share/ShareApi;->addCommonParameters(Landroid/os/Bundle;Lcom/facebook/share/model/ShareContent;)V

    .line 398
    const-string v0, "message"

    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    const-string v0, "link"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->getUriString(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    const-string v0, "picture"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getImageUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->getUriString(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    const-string v0, "name"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    const-string v0, "description"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    const-string v0, "ref"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getRef()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    new-instance v0, Lcom/facebook/GraphRequest;

    .line 405
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    .line 406
    const-string v2, "feed"

    invoke-direct {p0, v2}, Lcom/facebook/share/ShareApi;->getGraphPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 408
    sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    .line 404
    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    .line 409
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 410
    return-void
.end method

.method private shareOpenGraphContent(Lcom/facebook/share/model/ShareOpenGraphContent;Lcom/facebook/FacebookCallback;)V
    .locals 6
    .param p1, "openGraphContent"    # Lcom/facebook/share/model/ShareOpenGraphContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareOpenGraphContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 226
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    new-instance v4, Lcom/facebook/share/ShareApi$1;

    invoke-direct {v4, p0, p2}, Lcom/facebook/share/ShareApi$1;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V

    .line 234
    .local v4, "requestCallback":Lcom/facebook/GraphRequest$Callback;
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getAction()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v3

    .line 235
    .local v3, "action":Lcom/facebook/share/model/ShareOpenGraphAction;
    invoke-virtual {v3}, Lcom/facebook/share/model/ShareOpenGraphAction;->getBundle()Landroid/os/Bundle;

    move-result-object v2

    .line 236
    .local v2, "parameters":Landroid/os/Bundle;
    invoke-direct {p0, v2, p1}, Lcom/facebook/share/ShareApi;->addCommonParameters(Landroid/os/Bundle;Lcom/facebook/share/model/ShareContent;)V

    .line 237
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 238
    const-string v1, "message"

    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    :cond_0
    new-instance v0, Lcom/facebook/share/ShareApi$2;

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/ShareApi$2;-><init>(Lcom/facebook/share/ShareApi;Landroid/os/Bundle;Lcom/facebook/share/model/ShareOpenGraphAction;Lcom/facebook/GraphRequest$Callback;Lcom/facebook/FacebookCallback;)V

    .line 265
    .local v0, "stageCallback":Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;
    invoke-direct {p0, v2, v0}, Lcom/facebook/share/ShareApi;->stageOpenGraphAction(Landroid/os/Bundle;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 266
    return-void
.end method

.method private sharePhotoContent(Lcom/facebook/share/model/SharePhotoContent;Lcom/facebook/FacebookCallback;)V
    .locals 22
    .param p1, "photoContent"    # Lcom/facebook/share/model/SharePhotoContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/SharePhotoContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 319
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    new-instance v6, Lcom/facebook/internal/Mutable;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v6, v3}, Lcom/facebook/internal/Mutable;-><init>(Ljava/lang/Object;)V

    .line 320
    .local v6, "requestCount":Lcom/facebook/internal/Mutable;, "Lcom/facebook/internal/Mutable<Ljava/lang/Integer;>;"
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v17

    .line 321
    .local v17, "accessToken":Lcom/facebook/AccessToken;
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 322
    .local v21, "requests":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/facebook/GraphRequest;>;"
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 323
    .local v4, "results":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/json/JSONObject;>;"
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 324
    .local v5, "errorResponses":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/facebook/GraphResponse;>;"
    new-instance v2, Lcom/facebook/share/ShareApi$3;

    move-object/from16 v3, p0

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/facebook/share/ShareApi$3;-><init>(Lcom/facebook/share/ShareApi;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/facebook/internal/Mutable;Lcom/facebook/FacebookCallback;)V

    .line 352
    .local v2, "requestCallback":Lcom/facebook/GraphRequest$Callback;
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/share/model/SharePhotoContent;->getPhotos()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 377
    iget-object v3, v6, Lcom/facebook/internal/Mutable;->value:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v3, v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v6, Lcom/facebook/internal/Mutable;->value:Ljava/lang/Object;

    .line 378
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_4

    .line 384
    :goto_2
    return-void

    .line 352
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/facebook/share/model/SharePhoto;

    .line 353
    .local v19, "photo":Lcom/facebook/share/model/SharePhoto;
    invoke-virtual/range {v19 .. v19}, Lcom/facebook/share/model/SharePhoto;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v9

    .line 354
    .local v9, "bitmap":Landroid/graphics/Bitmap;
    invoke-virtual/range {v19 .. v19}, Lcom/facebook/share/model/SharePhoto;->getImageUrl()Landroid/net/Uri;

    move-result-object v13

    .line 355
    .local v13, "photoUri":Landroid/net/Uri;
    invoke-virtual/range {v19 .. v19}, Lcom/facebook/share/model/SharePhoto;->getCaption()Ljava/lang/String;

    move-result-object v10

    .line 356
    .local v10, "caption":Ljava/lang/String;
    if-nez v10, :cond_2

    .line 357
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/share/ShareApi;->getMessage()Ljava/lang/String;

    move-result-object v10

    .line 359
    :cond_2
    if-eqz v9, :cond_3

    .line 362
    const-string v7, "photos"

    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/facebook/share/ShareApi;->getGraphPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 365
    invoke-virtual/range {v19 .. v19}, Lcom/facebook/share/model/SharePhoto;->getParameters()Landroid/os/Bundle;

    move-result-object v11

    move-object/from16 v7, v17

    move-object v12, v2

    .line 360
    invoke-static/range {v7 .. v12}, Lcom/facebook/GraphRequest;->newUploadPhotoRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v7

    move-object/from16 v0, v21

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 381
    .end local v9    # "bitmap":Landroid/graphics/Bitmap;
    .end local v10    # "caption":Ljava/lang/String;
    .end local v13    # "photoUri":Landroid/net/Uri;
    .end local v19    # "photo":Lcom/facebook/share/model/SharePhoto;
    :catch_0
    move-exception v18

    .line 382
    .local v18, "ex":Ljava/io/FileNotFoundException;
    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V

    goto :goto_2

    .line 367
    .end local v18    # "ex":Ljava/io/FileNotFoundException;
    .restart local v9    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v10    # "caption":Ljava/lang/String;
    .restart local v13    # "photoUri":Landroid/net/Uri;
    .restart local v19    # "photo":Lcom/facebook/share/model/SharePhoto;
    :cond_3
    if-eqz v13, :cond_0

    .line 370
    :try_start_1
    const-string v7, "photos"

    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/facebook/share/ShareApi;->getGraphPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 373
    invoke-virtual/range {v19 .. v19}, Lcom/facebook/share/model/SharePhoto;->getParameters()Landroid/os/Bundle;

    move-result-object v15

    move-object/from16 v11, v17

    move-object v14, v10

    move-object/from16 v16, v2

    .line 368
    invoke-static/range {v11 .. v16}, Lcom/facebook/GraphRequest;->newUploadPhotoRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v7

    move-object/from16 v0, v21

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 378
    .end local v9    # "bitmap":Landroid/graphics/Bitmap;
    .end local v10    # "caption":Ljava/lang/String;
    .end local v13    # "photoUri":Landroid/net/Uri;
    .end local v19    # "photo":Lcom/facebook/share/model/SharePhoto;
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/facebook/GraphRequest;

    .line 379
    .local v20, "request":Lcom/facebook/GraphRequest;
    invoke-virtual/range {v20 .. v20}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private shareVideoContent(Lcom/facebook/share/model/ShareVideoContent;Lcom/facebook/FacebookCallback;)V
    .locals 2
    .param p1, "videoContent"    # Lcom/facebook/share/model/ShareVideoContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareVideoContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 415
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getGraphNode()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, p2}, Lcom/facebook/share/internal/VideoUploader;->uploadAsync(Lcom/facebook/share/model/ShareVideoContent;Ljava/lang/String;Lcom/facebook/FacebookCallback;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 419
    :goto_0
    return-void

    .line 416
    :catch_0
    move-exception v0

    .line 417
    .local v0, "ex":Ljava/io/FileNotFoundException;
    invoke-static {p2, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private stageArrayList(Ljava/util/ArrayList;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 3
    .param p1, "arrayList"    # Ljava/util/ArrayList;
    .param p2, "onArrayListStagedListener"    # Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .prologue
    .line 424
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 425
    .local v2, "stagedObject":Lorg/json/JSONArray;
    new-instance v0, Lcom/facebook/share/ShareApi$5;

    invoke-direct {v0, p0, p1, v2}, Lcom/facebook/share/ShareApi$5;-><init>(Lcom/facebook/share/ShareApi;Ljava/util/ArrayList;Lorg/json/JSONArray;)V

    .line 469
    .local v0, "collection":Lcom/facebook/internal/CollectionMapper$Collection;, "Lcom/facebook/internal/CollectionMapper$Collection<Ljava/lang/Integer;>;"
    new-instance v1, Lcom/facebook/share/ShareApi$6;

    invoke-direct {v1, p0, p2, v2}, Lcom/facebook/share/ShareApi$6;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;Lorg/json/JSONArray;)V

    .line 480
    .local v1, "onStagedArrayMapperCompleteListener":Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;
    invoke-direct {p0, v0, v1}, Lcom/facebook/share/ShareApi;->stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 481
    return-void
.end method

.method private stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V
    .locals 1
    .param p2, "onCollectionValuesStagedListener"    # Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/internal/CollectionMapper$Collection",
            "<TT;>;",
            "Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 486
    .local p1, "collection":Lcom/facebook/internal/CollectionMapper$Collection;, "Lcom/facebook/internal/CollectionMapper$Collection<TT;>;"
    new-instance v0, Lcom/facebook/share/ShareApi$7;

    invoke-direct {v0, p0}, Lcom/facebook/share/ShareApi$7;-><init>(Lcom/facebook/share/ShareApi;)V

    .line 504
    .local v0, "valueMapper":Lcom/facebook/internal/CollectionMapper$ValueMapper;
    invoke-static {p1, v0, p2}, Lcom/facebook/internal/CollectionMapper;->iterate(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$ValueMapper;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 505
    return-void
.end method

.method private stageOpenGraphAction(Landroid/os/Bundle;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V
    .locals 1
    .param p1, "parameters"    # Landroid/os/Bundle;
    .param p2, "onOpenGraphActionStagedListener"    # Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;

    .prologue
    .line 510
    new-instance v0, Lcom/facebook/share/ShareApi$8;

    invoke-direct {v0, p0, p1}, Lcom/facebook/share/ShareApi$8;-><init>(Lcom/facebook/share/ShareApi;Landroid/os/Bundle;)V

    .line 532
    .local v0, "collection":Lcom/facebook/internal/CollectionMapper$Collection;, "Lcom/facebook/internal/CollectionMapper$Collection<Ljava/lang/String;>;"
    invoke-direct {p0, v0, p2}, Lcom/facebook/share/ShareApi;->stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 533
    return-void
.end method

.method private stageOpenGraphObject(Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 8
    .param p1, "object"    # Lcom/facebook/share/model/ShareOpenGraphObject;
    .param p2, "onOpenGraphObjectStagedListener"    # Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .prologue
    .line 538
    const-string v1, "type"

    invoke-virtual {p1, v1}, Lcom/facebook/share/model/ShareOpenGraphObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 539
    .local v7, "type":Ljava/lang/String;
    if-nez v7, :cond_0

    .line 540
    const-string v1, "og:type"

    invoke-virtual {p1, v1}, Lcom/facebook/share/model/ShareOpenGraphObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 543
    :cond_0
    if-nez v7, :cond_1

    .line 545
    new-instance v1, Lcom/facebook/FacebookException;

    const-string v5, "Open Graph objects must contain a type value."

    invoke-direct {v1, v5}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 544
    invoke-interface {p2, v1}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    .line 638
    :goto_0
    return-void

    .line 548
    :cond_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 549
    .local v2, "stagedObject":Lorg/json/JSONObject;
    new-instance v6, Lcom/facebook/share/ShareApi$9;

    invoke-direct {v6, p0, p1, v2}, Lcom/facebook/share/ShareApi$9;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/share/model/ShareOpenGraphObject;Lorg/json/JSONObject;)V

    .line 576
    .local v6, "collection":Lcom/facebook/internal/CollectionMapper$Collection;, "Lcom/facebook/internal/CollectionMapper$Collection<Ljava/lang/String;>;"
    new-instance v4, Lcom/facebook/share/ShareApi$10;

    invoke-direct {v4, p0, p2}, Lcom/facebook/share/ShareApi$10;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    .line 606
    .local v4, "requestCallback":Lcom/facebook/GraphRequest$Callback;
    move-object v3, v7

    .line 608
    .local v3, "ogType":Ljava/lang/String;
    new-instance v0, Lcom/facebook/share/ShareApi$11;

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/ShareApi$11;-><init>(Lcom/facebook/share/ShareApi;Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    .line 637
    .local v0, "onMapperCompleteListener":Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;
    invoke-direct {p0, v6, v0}, Lcom/facebook/share/ShareApi;->stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    goto :goto_0
.end method

.method private stagePhoto(Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 7
    .param p1, "photo"    # Lcom/facebook/share/model/SharePhoto;
    .param p2, "onPhotoStagedListener"    # Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    .prologue
    .line 643
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 644
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getImageUrl()Landroid/net/Uri;

    move-result-object v2

    .line 645
    .local v2, "imageUrl":Landroid/net/Uri;
    if-nez v0, :cond_0

    if-eqz v2, :cond_3

    .line 646
    :cond_0
    new-instance v4, Lcom/facebook/share/ShareApi$12;

    invoke-direct {v4, p0, p2, p1}, Lcom/facebook/share/ShareApi$12;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;Lcom/facebook/share/model/SharePhoto;)V

    .line 687
    .local v4, "requestCallback":Lcom/facebook/GraphRequest$Callback;
    if-eqz v0, :cond_1

    .line 689
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v5

    .line 688
    invoke-static {v5, v0, v4}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Landroid/graphics/Bitmap;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v5

    .line 691
    invoke-virtual {v5}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 710
    .end local v4    # "requestCallback":Lcom/facebook/GraphRequest$Callback;
    :goto_0
    return-void

    .line 695
    .restart local v4    # "requestCallback":Lcom/facebook/GraphRequest$Callback;
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v5

    .line 694
    invoke-static {v5, v2, v4}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Landroid/net/Uri;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v5

    .line 697
    invoke-virtual {v5}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 698
    :catch_0
    move-exception v1

    .line 699
    .local v1, "ex":Ljava/io/FileNotFoundException;
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    .line 700
    .local v3, "message":Ljava/lang/String;
    if-nez v3, :cond_2

    .line 701
    const-string v3, "Error staging photo."

    .line 703
    :cond_2
    new-instance v5, Lcom/facebook/FacebookException;

    invoke-direct {v5, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v5}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 708
    .end local v1    # "ex":Ljava/io/FileNotFoundException;
    .end local v3    # "message":Ljava/lang/String;
    .end local v4    # "requestCallback":Lcom/facebook/GraphRequest$Callback;
    :cond_3
    new-instance v5, Lcom/facebook/FacebookException;

    const-string v6, "Photos must have an imageURL or bitmap."

    invoke-direct {v5, v6}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 707
    invoke-interface {p2, v5}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0
.end method


# virtual methods
.method public canShare()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 144
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getShareContent()Lcom/facebook/share/model/ShareContent;

    move-result-object v3

    if-nez v3, :cond_1

    .line 157
    :cond_0
    :goto_0
    return v2

    .line 147
    :cond_1
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 148
    .local v0, "accessToken":Lcom/facebook/AccessToken;
    if-eqz v0, :cond_0

    .line 151
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v1

    .line 152
    .local v1, "permissions":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-eqz v1, :cond_2

    const-string v2, "publish_actions"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 153
    :cond_2
    const-string v2, "ShareApi"

    const-string v3, "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation."

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    :cond_3
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public getGraphNode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/share/ShareApi;->graphNode:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/share/ShareApi;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getShareContent()Lcom/facebook/share/model/ShareContent;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/share/ShareApi;->shareContent:Lcom/facebook/share/model/ShareContent;

    return-object v0
.end method

.method public setGraphNode(Ljava/lang/String;)V
    .locals 0
    .param p1, "graphNode"    # Ljava/lang/String;

    .prologue
    .line 124
    iput-object p1, p0, Lcom/facebook/share/ShareApi;->graphNode:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/share/ShareApi;->message:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public share(Lcom/facebook/FacebookCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 166
    .local p1, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->canShare()Z

    move-result v2

    if-nez v2, :cond_1

    .line 168
    const-string v2, "Insufficient permissions for sharing content via Api."

    .line 167
    invoke-static {p1, v2}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithError(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    .line 190
    :cond_0
    :goto_0
    return-void

    .line 171
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getShareContent()Lcom/facebook/share/model/ShareContent;

    move-result-object v1

    .line 175
    .local v1, "shareContent":Lcom/facebook/share/model/ShareContent;
    :try_start_0
    invoke-static {v1}, Lcom/facebook/share/internal/ShareContentValidation;->validateForApiShare(Lcom/facebook/share/model/ShareContent;)V
    :try_end_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    instance-of v2, v1, Lcom/facebook/share/model/ShareLinkContent;

    if-eqz v2, :cond_2

    .line 182
    check-cast v1, Lcom/facebook/share/model/ShareLinkContent;

    .end local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    invoke-direct {p0, v1, p1}, Lcom/facebook/share/ShareApi;->shareLinkContent(Lcom/facebook/share/model/ShareLinkContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 176
    .restart local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    :catch_0
    move-exception v0

    .line 177
    .local v0, "ex":Lcom/facebook/FacebookException;
    invoke-static {p1, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V

    goto :goto_0

    .line 183
    .end local v0    # "ex":Lcom/facebook/FacebookException;
    :cond_2
    instance-of v2, v1, Lcom/facebook/share/model/SharePhotoContent;

    if-eqz v2, :cond_3

    .line 184
    check-cast v1, Lcom/facebook/share/model/SharePhotoContent;

    .end local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    invoke-direct {p0, v1, p1}, Lcom/facebook/share/ShareApi;->sharePhotoContent(Lcom/facebook/share/model/SharePhotoContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 185
    .restart local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    :cond_3
    instance-of v2, v1, Lcom/facebook/share/model/ShareVideoContent;

    if-eqz v2, :cond_4

    .line 186
    check-cast v1, Lcom/facebook/share/model/ShareVideoContent;

    .end local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    invoke-direct {p0, v1, p1}, Lcom/facebook/share/ShareApi;->shareVideoContent(Lcom/facebook/share/model/ShareVideoContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 187
    .restart local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    :cond_4
    instance-of v2, v1, Lcom/facebook/share/model/ShareOpenGraphContent;

    if-eqz v2, :cond_0

    .line 188
    check-cast v1, Lcom/facebook/share/model/ShareOpenGraphContent;

    .end local v1    # "shareContent":Lcom/facebook/share/model/ShareContent;
    invoke-direct {p0, v1, p1}, Lcom/facebook/share/ShareApi;->shareOpenGraphContent(Lcom/facebook/share/model/ShareOpenGraphContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0
.end method
