.class public Lcom/urbanairship/restclient/Post;
.super Lorg/apache/http/client/methods/HttpPost;
.source "Post.java"


# instance fields
.field protected httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/message/BasicNameValuePair;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    .local p2, "values":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/message/BasicNameValuePair;>;"
    invoke-direct {p0, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 44
    const/4 v5, 0x0

    iput-object v5, p0, Lcom/urbanairship/restclient/Post;->httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 49
    new-instance v3, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v3}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 50
    .local v3, "httpParams":Lorg/apache/http/params/HttpParams;
    new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v5, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    iput-object v5, p0, Lcom/urbanairship/restclient/Post;->httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 51
    const/16 v4, 0x2710

    .line 52
    .local v4, "timeoutConnection":I
    invoke-static {v3, v4}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 54
    const/4 v1, 0x0

    .line 56
    .local v1, "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :try_start_0
    new-instance v2, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v5, "UTF-8"

    invoke-direct {v2, p2, v5}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .end local v1    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .local v2, "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :try_start_1
    invoke-virtual {p0, v2}, Lcom/urbanairship/restclient/Post;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v2

    .line 61
    .end local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v1    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :goto_0
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 59
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    :goto_1
    const-string v5, "UTF-8 Unsupported."

    invoke-static {v5, v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 58
    .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
    .end local v1    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :catch_1
    move-exception v0

    move-object v1, v2

    .end local v2    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v1    # "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    goto :goto_1
.end method


# virtual methods
.method public execute()Lcom/urbanairship/restclient/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 64
    new-instance v0, Lcom/urbanairship/restclient/Response;

    iget-object v1, p0, Lcom/urbanairship/restclient/Post;->httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v1, p0}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/urbanairship/restclient/Response;-><init>(Lorg/apache/http/HttpResponse;)V

    return-object v0
.end method
