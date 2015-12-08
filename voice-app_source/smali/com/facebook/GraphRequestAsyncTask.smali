.class public Lcom/facebook/GraphRequestAsyncTask;
.super Landroid/os/AsyncTask;
.source "GraphRequestAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/List",
        "<",
        "Lcom/facebook/GraphResponse;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static executeOnExecutorMethod:Ljava/lang/reflect/Method;


# instance fields
.field private final connection:Ljava/net/HttpURLConnection;

.field private exception:Ljava/lang/Exception;

.field private final requests:Lcom/facebook/GraphRequestBatch;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 39
    const-class v2, Lcom/facebook/GraphRequestAsyncTask;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/facebook/GraphRequestAsyncTask;->TAG:Ljava/lang/String;

    .line 48
    const-class v2, Landroid/os/AsyncTask;

    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    array-length v5, v4

    move v2, v3

    .local v0, "method":Ljava/lang/reflect/Method;
    :goto_0
    if-lt v2, v5, :cond_0

    .line 58
    :goto_1
    return-void

    .line 48
    :cond_0
    aget-object v0, v4, v2

    .line 49
    const-string v6, "executeOnExecutor"

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 50
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    .line 51
    .local v1, "parameters":[Ljava/lang/Class;
    array-length v6, v1

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    .line 52
    aget-object v6, v1, v3

    const-class v7, Ljava/util/concurrent/Executor;

    if-ne v6, v7, :cond_1

    const/4 v6, 0x1

    aget-object v6, v1, v6

    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 53
    sput-object v0, Lcom/facebook/GraphRequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;

    goto :goto_1

    .line 48
    .end local v1    # "parameters":[Ljava/lang/Class;
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public constructor <init>(Lcom/facebook/GraphRequestBatch;)V
    .locals 1
    .param p1, "requests"    # Lcom/facebook/GraphRequestBatch;

    .prologue
    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/facebook/GraphRequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V

    .line 88
    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V
    .locals 0
    .param p1, "connection"    # Ljava/net/HttpURLConnection;
    .param p2, "requests"    # Lcom/facebook/GraphRequestBatch;

    .prologue
    .line 125
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 126
    iput-object p2, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    .line 127
    iput-object p1, p0, Lcom/facebook/GraphRequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    .line 128
    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;Ljava/util/Collection;)V
    .locals 1
    .param p1, "connection"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/GraphRequest;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 113
    .local p2, "requests":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/facebook/GraphRequest;>;"
    new-instance v0, Lcom/facebook/GraphRequestBatch;

    invoke-direct {v0, p2}, Lcom/facebook/GraphRequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/GraphRequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V

    .line 114
    return-void
.end method

.method public varargs constructor <init>(Ljava/net/HttpURLConnection;[Lcom/facebook/GraphRequest;)V
    .locals 1
    .param p1, "connection"    # Ljava/net/HttpURLConnection;
    .param p2, "requests"    # [Lcom/facebook/GraphRequest;

    .prologue
    .line 100
    new-instance v0, Lcom/facebook/GraphRequestBatch;

    invoke-direct {v0, p2}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/GraphRequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V

    .line 101
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/GraphRequest;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 77
    .local p1, "requests":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/facebook/GraphRequest;>;"
    const/4 v0, 0x0

    new-instance v1, Lcom/facebook/GraphRequestBatch;

    invoke-direct {v1, p1}, Lcom/facebook/GraphRequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/GraphRequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V

    .line 78
    return-void
.end method

.method public varargs constructor <init>([Lcom/facebook/GraphRequest;)V
    .locals 2
    .param p1, "requests"    # [Lcom/facebook/GraphRequest;

    .prologue
    .line 67
    const/4 v0, 0x0

    new-instance v1, Lcom/facebook/GraphRequestBatch;

    invoke-direct {v1, p1}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/GraphRequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V

    .line 68
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/GraphRequestAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/util/List;
    .locals 3
    .param p1, "params"    # [Ljava/lang/Void;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/GraphResponse;",
            ">;"
        }
    .end annotation

    .prologue
    .line 177
    :try_start_0
    iget-object v1, p0, Lcom/facebook/GraphRequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    if-nez v1, :cond_0

    .line 178
    iget-object v1, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    invoke-virtual {v1}, Lcom/facebook/GraphRequestBatch;->executeAndWait()Ljava/util/List;

    move-result-object v1

    .line 184
    :goto_0
    return-object v1

    .line 180
    :cond_0
    iget-object v1, p0, Lcom/facebook/GraphRequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    iget-object v2, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    invoke-static {v1, v2}, Lcom/facebook/GraphRequest;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 182
    :catch_0
    move-exception v0

    .line 183
    .local v0, "e":Ljava/lang/Exception;
    iput-object v0, p0, Lcom/facebook/GraphRequestAsyncTask;->exception:Ljava/lang/Exception;

    .line 184
    const/4 v1, 0x0

    goto :goto_0
.end method

.method executeOnSettingsExecutor()Lcom/facebook/GraphRequestAsyncTask;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 189
    sget-object v0, Lcom/facebook/GraphRequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 191
    :try_start_0
    sget-object v0, Lcom/facebook/GraphRequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lcom/facebook/FacebookSdk;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :goto_0
    return-object p0

    .line 198
    :cond_0
    new-array v0, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/facebook/GraphRequestAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 194
    :catch_0
    move-exception v0

    goto :goto_0

    .line 192
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected final getException()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/GraphRequestAsyncTask;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method protected final getRequests()Lcom/facebook/GraphRequestBatch;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/facebook/GraphRequestAsyncTask;->onPostExecute(Ljava/util/List;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/GraphResponse;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 165
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/GraphResponse;>;"
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lcom/facebook/GraphRequestAsyncTask;->exception:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    .line 168
    sget-object v0, Lcom/facebook/GraphRequestAsyncTask;->TAG:Ljava/lang/String;

    .line 169
    const-string v1, "onPostExecute: exception encountered during request: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 170
    iget-object v4, p0, Lcom/facebook/GraphRequestAsyncTask;->exception:Ljava/lang/Exception;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 168
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    :cond_0
    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    .prologue
    .line 152
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 153
    invoke-static {}, Lcom/facebook/FacebookSdk;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    sget-object v0, Lcom/facebook/GraphRequestAsyncTask;->TAG:Ljava/lang/String;

    const-string v1, "execute async task: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    invoke-virtual {v0}, Lcom/facebook/GraphRequestBatch;->getCallbackHandler()Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequestBatch;->setCallbackHandler(Landroid/os/Handler;)V

    .line 161
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    const-string v1, "{RequestAsyncTask: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 142
    const-string v1, " connection: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 143
    iget-object v1, p0, Lcom/facebook/GraphRequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 144
    const-string v1, ", requests: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/facebook/GraphRequestAsyncTask;->requests:Lcom/facebook/GraphRequestBatch;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 146
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 140
    return-object v0
.end method
