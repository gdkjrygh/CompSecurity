.class public Lcom/nbcuni/nbc/thevoice/DownloadTask;
.super Landroid/os/AsyncTask;
.source "DownloadTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field commandId:Ljava/lang/String;

.field downloadUrl:Ljava/lang/String;

.field fileName:Ljava/lang/String;

.field mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;


# direct methods
.method public constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "mainActivity"    # Lcom/nbcuni/nbc/thevoice/MainActivity;
    .param p2, "downloadUrl"    # Ljava/lang/String;
    .param p3, "fileName"    # Ljava/lang/String;
    .param p4, "commandId"    # Ljava/lang/String;

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 21
    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->downloadUrl:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->fileName:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->commandId:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 64
    :try_start_0
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->downloadUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->fileName:Ljava/lang/String;

    invoke-virtual {p0, v2, v3}, Lcom/nbcuni/nbc/thevoice/DownloadTask;->downloadFile(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :goto_0
    const/4 v2, 0x0

    return-object v2

    .line 65
    :catch_0
    move-exception v1

    .line 66
    .local v1, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\"commandId\":\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->commandId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\",\"type\":\"CommandResult\",\"subject\":\"LoadAudio\",\"error\":{\"code\":\"File not found.\"}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 67
    .local v0, "commandResult":Ljava/lang/String;
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v2, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/nbcuni/nbc/thevoice/DownloadTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public downloadFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 15
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "fileName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 29
    new-instance v5, Ljava/io/File;

    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v11}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getCacheDir()Ljava/io/File;

    move-result-object v11

    const-string v12, ""

    invoke-direct {v5, v11, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .local v5, "dir":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v11

    if-eqz v11, :cond_0

    .line 31
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v12

    array-length v13, v12

    const/4 v11, 0x0

    :goto_0
    if-lt v11, v13, :cond_2

    .line 39
    :cond_0
    const-string v11, "http"

    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 40
    new-instance v11, Ljava/lang/StringBuilder;

    iget-object v12, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v12}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f08004c

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v12, "/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    :cond_1
    new-instance v11, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v11, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v10

    .line 43
    .local v10, "uc":Ljava/net/URLConnection;
    invoke-virtual {v10}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    .line 44
    .local v8, "is":Ljava/io/InputStream;
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 45
    .local v2, "bis":Ljava/io/BufferedInputStream;
    new-instance v1, Lorg/apache/http/util/ByteArrayBuffer;

    const/16 v11, 0x40

    invoke-direct {v1, v11}, Lorg/apache/http/util/ByteArrayBuffer;-><init>(I)V

    .line 46
    .local v1, "bab":Lorg/apache/http/util/ByteArrayBuffer;
    const/4 v4, 0x0

    .line 47
    .local v4, "current":I
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->read()I

    move-result v4

    const/4 v11, -0x1

    if-ne v4, v11, :cond_4

    .line 51
    new-instance v9, Ljava/io/File;

    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v11}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getCacheDir()Ljava/io/File;

    move-result-object v11

    move-object/from16 v0, p2

    invoke-direct {v9, v11, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 52
    .local v9, "outputFile":Ljava/io/File;
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 53
    .local v7, "fos":Ljava/io/FileOutputStream;
    invoke-virtual {v1}, Lorg/apache/http/util/ByteArrayBuffer;->toByteArray()[B

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/io/FileOutputStream;->write([B)V

    .line 54
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 56
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "{\"commandId\":\""

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->commandId:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\",\"type\":\"CommandResult\",\"subject\":\"LoadAudio\"}"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 57
    .local v3, "commandResult":Ljava/lang/String;
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v11, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 58
    .end local v1    # "bab":Lorg/apache/http/util/ByteArrayBuffer;
    .end local v2    # "bis":Ljava/io/BufferedInputStream;
    .end local v4    # "current":I
    .end local v7    # "fos":Ljava/io/FileOutputStream;
    .end local v8    # "is":Ljava/io/InputStream;
    .end local v9    # "outputFile":Ljava/io/File;
    .end local v10    # "uc":Ljava/net/URLConnection;
    :goto_2
    return-void

    .line 31
    .end local v3    # "commandResult":Ljava/lang/String;
    :cond_2
    aget-object v6, v12, v11

    .line 32
    .local v6, "f":Ljava/io/File;
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 33
    const-string v11, "Badger"

    const-string v12, "File already in cache"

    invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "{\"commandId\":\""

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->commandId:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\",\"type\":\"CommandResult\",\"subject\":\"LoadAudio\"}"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 35
    .restart local v3    # "commandResult":Ljava/lang/String;
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/DownloadTask;->mainActivity:Lcom/nbcuni/nbc/thevoice/MainActivity;

    invoke-virtual {v11, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    goto :goto_2

    .line 31
    .end local v3    # "commandResult":Ljava/lang/String;
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 48
    .end local v6    # "f":Ljava/io/File;
    .restart local v1    # "bab":Lorg/apache/http/util/ByteArrayBuffer;
    .restart local v2    # "bis":Ljava/io/BufferedInputStream;
    .restart local v4    # "current":I
    .restart local v8    # "is":Ljava/io/InputStream;
    .restart local v10    # "uc":Ljava/net/URLConnection;
    :cond_4
    int-to-byte v11, v4

    invoke-virtual {v1, v11}, Lorg/apache/http/util/ByteArrayBuffer;->append(I)V

    goto :goto_1
.end method
