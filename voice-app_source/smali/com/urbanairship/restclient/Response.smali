.class public Lcom/urbanairship/restclient/Response;
.super Ljava/lang/Object;
.source "Response.java"


# instance fields
.field body:Ljava/lang/String;

.field resp:Lorg/apache/http/HttpResponse;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 0
    .param p1, "resp"    # Lorg/apache/http/HttpResponse;

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    .line 53
    return-void
.end method


# virtual methods
.method public body()Ljava/lang/String;
    .locals 2

    .prologue
    .line 123
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->body:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 124
    const-string v1, ""

    iput-object v1, p0, Lcom/urbanairship/restclient/Response;->body:Ljava/lang/String;

    .line 125
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 127
    :try_start_0
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/urbanairship/restclient/Response;->body:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->body:Ljava/lang/String;

    return-object v1

    .line 128
    :catch_0
    move-exception v0

    .line 129
    .local v0, "ioe":Ljava/io/IOException;
    const-string v1, "Error fetching HTTP entity: IO Exception"

    invoke-static {v1}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public contentType()Ljava/lang/String;
    .locals 3

    .prologue
    .line 99
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    const-string v2, "Content-Type"

    invoke-interface {v1, v2}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 100
    .local v0, "contentType":Lorg/apache/http/Header;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 101
    :goto_0
    return-object v1

    :cond_0
    const-string v1, ""

    goto :goto_0
.end method

.method public getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 105
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1, p1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 106
    .local v0, "header":Lorg/apache/http/Header;
    return-object v0
.end method

.method public length()J
    .locals 4

    .prologue
    .line 86
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 87
    .local v0, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v0, :cond_0

    .line 88
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v2

    .line 90
    :goto_0
    return-wide v2

    :cond_0
    const-wide/16 v2, 0x0

    goto :goto_0
.end method

.method public rawBody()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 110
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 111
    .local v0, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v0, :cond_0

    .line 112
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    .line 114
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public reason()Ljava/lang/String;
    .locals 2

    .prologue
    .line 73
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    .line 74
    .local v0, "s":Lorg/apache/http/StatusLine;
    if-eqz v0, :cond_0

    .line 75
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v1

    .line 77
    :goto_0
    return-object v1

    :cond_0
    const-string v1, ""

    goto :goto_0
.end method

.method public status()I
    .locals 2

    .prologue
    .line 60
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    .line 61
    .local v0, "s":Lorg/apache/http/StatusLine;
    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p0, Lcom/urbanairship/restclient/Response;->resp:Lorg/apache/http/HttpResponse;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    .line 64
    :goto_0
    return v1

    :cond_0
    const/4 v1, -0x1

    goto :goto_0
.end method
