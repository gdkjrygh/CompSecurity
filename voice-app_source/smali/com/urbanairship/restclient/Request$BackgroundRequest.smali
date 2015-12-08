.class Lcom/urbanairship/restclient/Request$BackgroundRequest;
.super Landroid/os/AsyncTask;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/restclient/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BackgroundRequest"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Lcom/urbanairship/restclient/Request;",
        "Ljava/lang/Integer;",
        "Lcom/urbanairship/restclient/Response;",
        ">;"
    }
.end annotation


# instance fields
.field private final handler:Lcom/urbanairship/restclient/AsyncHandler;

.field final synthetic this$0:Lcom/urbanairship/restclient/Request;


# direct methods
.method public constructor <init>(Lcom/urbanairship/restclient/Request;Lcom/urbanairship/restclient/AsyncHandler;)V
    .locals 0
    .param p2, "asyncHandler"    # Lcom/urbanairship/restclient/AsyncHandler;

    .prologue
    .line 205
    iput-object p1, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->this$0:Lcom/urbanairship/restclient/Request;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 206
    iput-object p2, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->handler:Lcom/urbanairship/restclient/AsyncHandler;

    .line 207
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/urbanairship/restclient/Request;)Lcom/urbanairship/restclient/Response;
    .locals 14
    .param p1, "requests"    # [Lcom/urbanairship/restclient/Request;

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    .line 213
    array-length v10, p1

    if-le v10, v12, :cond_0

    .line 214
    new-instance v10, Ljava/lang/RuntimeException;

    const-string v11, "Background Request only handles executing one Request at a time "

    invoke-direct {v10, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 218
    :cond_0
    aget-object v8, p1, v11

    .line 223
    .local v8, "request":Lcom/urbanairship/restclient/Request;
    :try_start_0
    invoke-virtual {v8}, Lcom/urbanairship/restclient/Request;->execute()Lcom/urbanairship/restclient/Response;

    move-result-object v9

    .line 225
    .local v9, "response":Lcom/urbanairship/restclient/Response;
    if-eqz v9, :cond_1

    .line 227
    iget-object v10, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->this$0:Lcom/urbanairship/restclient/Request;

    iget-object v10, v10, Lcom/urbanairship/restclient/Request;->destination:Ljava/io/File;

    if-eqz v10, :cond_3

    .line 229
    iget-object v10, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->this$0:Lcom/urbanairship/restclient/Request;

    iget-object v10, v10, Lcom/urbanairship/restclient/Request;->destination:Ljava/io/File;

    invoke-virtual {v10}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v10

    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 231
    invoke-virtual {v9}, Lcom/urbanairship/restclient/Response;->length()J

    move-result-wide v4

    .line 233
    .local v4, "len":J
    invoke-virtual {v9}, Lcom/urbanairship/restclient/Response;->rawBody()Ljava/io/InputStream;

    move-result-object v3

    .line 234
    .local v3, "instream":Ljava/io/InputStream;
    new-instance v6, Ljava/io/FileOutputStream;

    iget-object v10, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->this$0:Lcom/urbanairship/restclient/Request;

    iget-object v10, v10, Lcom/urbanairship/restclient/Request;->destination:Ljava/io/File;

    invoke-direct {v6, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 236
    .local v6, "outstream":Ljava/io/FileOutputStream;
    const/4 v7, 0x0

    .local v7, "readnum":I
    const/4 v1, 0x0

    .line 238
    .local v1, "count":I
    const/16 v10, 0x2000

    new-array v0, v10, [B

    .line 240
    .local v0, "buffer":[B
    :goto_0
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    move-result v7

    const/4 v10, -0x1

    if-eq v7, v10, :cond_2

    .line 241
    add-int/2addr v1, v7

    .line 242
    const/4 v10, 0x0

    invoke-virtual {v6, v0, v10, v7}, Ljava/io/FileOutputStream;->write([BII)V

    .line 243
    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Integer;

    const/4 v11, 0x0

    int-to-float v12, v1

    long-to-float v13, v4

    div-float/2addr v12, v13

    const/high16 v13, 0x42c80000    # 100.0f

    mul-float/2addr v12, v13

    float-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    invoke-virtual {p0, v10}, Lcom/urbanairship/restclient/Request$BackgroundRequest;->publishProgress([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 261
    .end local v0    # "buffer":[B
    .end local v1    # "count":I
    .end local v3    # "instream":Ljava/io/InputStream;
    .end local v4    # "len":J
    .end local v6    # "outstream":Ljava/io/FileOutputStream;
    .end local v7    # "readnum":I
    .end local v9    # "response":Lcom/urbanairship/restclient/Response;
    :catch_0
    move-exception v2

    .line 262
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {v2}, Lcom/urbanairship/Logger;->error(Ljava/lang/Throwable;)V

    .line 264
    const/4 v9, 0x0

    .end local v2    # "e":Ljava/lang/Exception;
    :cond_1
    :goto_1
    return-object v9

    .line 246
    .restart local v0    # "buffer":[B
    .restart local v1    # "count":I
    .restart local v3    # "instream":Ljava/io/InputStream;
    .restart local v4    # "len":J
    .restart local v6    # "outstream":Ljava/io/FileOutputStream;
    .restart local v7    # "readnum":I
    .restart local v9    # "response":Lcom/urbanairship/restclient/Response;
    :cond_2
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 247
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 248
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    goto :goto_1

    .line 252
    .end local v0    # "buffer":[B
    .end local v1    # "count":I
    .end local v3    # "instream":Ljava/io/InputStream;
    .end local v4    # "len":J
    .end local v6    # "outstream":Ljava/io/FileOutputStream;
    .end local v7    # "readnum":I
    :cond_3
    invoke-virtual {v9}, Lcom/urbanairship/restclient/Response;->length()J

    move-result-wide v10

    const-wide/32 v12, 0x100000

    cmp-long v10, v10, v12

    if-gez v10, :cond_1

    .line 253
    invoke-virtual {v9}, Lcom/urbanairship/restclient/Response;->body()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 201
    check-cast p1, [Lcom/urbanairship/restclient/Request;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/restclient/Request$BackgroundRequest;->doInBackground([Lcom/urbanairship/restclient/Request;)Lcom/urbanairship/restclient/Response;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lcom/urbanairship/restclient/Response;)V
    .locals 3
    .param p1, "response"    # Lcom/urbanairship/restclient/Response;

    .prologue
    .line 277
    if-eqz p1, :cond_0

    .line 278
    iget-object v0, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->handler:Lcom/urbanairship/restclient/AsyncHandler;

    invoke-virtual {v0, p1}, Lcom/urbanairship/restclient/AsyncHandler;->onComplete(Lcom/urbanairship/restclient/Response;)V

    .line 282
    :goto_0
    return-void

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->handler:Lcom/urbanairship/restclient/AsyncHandler;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Error when executing request."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/urbanairship/restclient/AsyncHandler;->onError(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 201
    check-cast p1, Lcom/urbanairship/restclient/Response;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/restclient/Request$BackgroundRequest;->onPostExecute(Lcom/urbanairship/restclient/Response;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 3
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 269
    const/4 v1, 0x0

    aget-object v0, p1, v1

    .line 270
    .local v0, "progress":Ljava/lang/Integer;
    iget-object v1, p0, Lcom/urbanairship/restclient/Request$BackgroundRequest;->handler:Lcom/urbanairship/restclient/AsyncHandler;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/urbanairship/restclient/AsyncHandler;->onProgress(I)V

    .line 271
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 201
    check-cast p1, [Ljava/lang/Integer;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/urbanairship/restclient/Request$BackgroundRequest;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
