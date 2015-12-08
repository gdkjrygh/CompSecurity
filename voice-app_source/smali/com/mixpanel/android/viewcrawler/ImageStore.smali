.class Lcom/mixpanel/android/viewcrawler/ImageStore;
.super Ljava/lang/Object;
.source "ImageStore.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;
    }
.end annotation


# static fields
.field private static final DEFAULT_DIRECTORY_NAME:Ljava/lang/String; = "MixpanelAPI.Images"

.field private static final FILE_PREFIX:Ljava/lang/String; = "MP_IMG_"

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.ImageStore"

.field private static final MAX_BITMAP_SIZE:I = 0x989680


# instance fields
.field private final mDigest:Ljava/security/MessageDigest;

.field private final mDirectory:Ljava/io/File;

.field private final mPoster:Lcom/mixpanel/android/util/RemoteService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 39
    .line 40
    const-string v0, "MixpanelAPI.Images"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 41
    new-instance v1, Lcom/mixpanel/android/util/HttpService;

    invoke-direct {v1}, Lcom/mixpanel/android/util/HttpService;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/mixpanel/android/viewcrawler/ImageStore;-><init>(Ljava/io/File;Lcom/mixpanel/android/util/RemoteService;)V

    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lcom/mixpanel/android/util/RemoteService;)V
    .locals 4
    .param p1, "directory"    # Ljava/io/File;
    .param p2, "poster"    # Lcom/mixpanel/android/util/RemoteService;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mDirectory:Ljava/io/File;

    .line 47
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mPoster:Lcom/mixpanel/android/util/RemoteService;

    .line 50
    :try_start_0
    const-string v2, "SHA1"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 56
    .local v1, "useDigest":Ljava/security/MessageDigest;
    :goto_0
    iput-object v1, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mDigest:Ljava/security/MessageDigest;

    .line 57
    return-void

    .line 51
    .end local v1    # "useDigest":Ljava/security/MessageDigest;
    :catch_0
    move-exception v0

    .line 52
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    const-string v2, "MixpanelAPI.ImageStore"

    const-string v3, "Images won\'t be stored because this platform doesn\'t supply a SHA1 hash function"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    const/4 v1, 0x0

    .restart local v1    # "useDigest":Ljava/security/MessageDigest;
    goto :goto_0
.end method

.method private storedFile(Ljava/lang/String;)Ljava/io/File;
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 129
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mDigest:Ljava/security/MessageDigest;

    if-nez v2, :cond_0

    .line 130
    const/4 v2, 0x0

    .line 135
    :goto_0
    return-object v2

    .line 133
    :cond_0
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mDigest:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    .line 134
    .local v0, "hashed":[B
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MP_IMG_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0xa

    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 135
    .local v1, "safeName":Ljava/lang/String;
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mDirectory:Ljava/io/File;

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public clearStorage()V
    .locals 6

    .prologue
    .line 110
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mDirectory:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 111
    .local v2, "files":[Ljava/io/File;
    array-length v4, v2

    .line 112
    .local v4, "length":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-lt v3, v4, :cond_0

    .line 119
    return-void

    .line 113
    :cond_0
    aget-object v0, v2, v3

    .line 114
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 115
    .local v1, "filename":Ljava/lang/String;
    const-string v5, "MP_IMG_"

    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 116
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 112
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public deleteStorage(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 122
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ImageStore;->storedFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 123
    .local v0, "file":Ljava/io/File;
    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 126
    :cond_0
    return-void
.end method

.method public getImage(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ImageStore;->storedFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 61
    .local v3, "file":Ljava/io/File;
    const/4 v1, 0x0

    .line 62
    .local v1, "bytes":[B
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_1

    .line 64
    :cond_0
    :try_start_0
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ImageStore;->mPoster:Lcom/mixpanel/android/util/RemoteService;

    const/4 v8, 0x0

    invoke-interface {v7, p1, v8}, Lcom/mixpanel/android/util/RemoteService;->performRequest(Ljava/lang/String;Ljava/util/List;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 73
    :cond_1
    if-eqz v1, :cond_4

    .line 74
    if-eqz v3, :cond_2

    array-length v7, v1

    const v8, 0x989680

    if-ge v7, v8, :cond_2

    .line 75
    const/4 v5, 0x0

    .line 77
    .local v5, "out":Ljava/io/OutputStream;
    :try_start_1
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .end local v5    # "out":Ljava/io/OutputStream;
    .local v6, "out":Ljava/io/OutputStream;
    :try_start_2
    invoke-virtual {v6, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    if-eqz v6, :cond_2

    .line 86
    :try_start_3
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 94
    .end local v6    # "out":Ljava/io/OutputStream;
    :cond_2
    :goto_0
    const/4 v7, 0x0

    array-length v8, v1

    invoke-static {v1, v7, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 95
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    if-nez v0, :cond_5

    .line 96
    new-instance v7, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;

    const-string v8, "Downloaded data could not be interpreted as a bitmap"

    invoke-direct {v7, v8}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 65
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    :catch_0
    move-exception v2

    .line 66
    .local v2, "e":Ljava/io/IOException;
    new-instance v7, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;

    const-string v8, "Can\'t download bitmap"

    invoke-direct {v7, v8, v2}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7

    .line 67
    .end local v2    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v2

    .line 68
    .local v2, "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    new-instance v7, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;

    const-string v8, "Couldn\'t download image due to service availability"

    invoke-direct {v7, v8, v2}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7

    .line 79
    .end local v2    # "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    .restart local v5    # "out":Ljava/io/OutputStream;
    :catch_2
    move-exception v2

    .line 80
    .local v2, "e":Ljava/io/FileNotFoundException;
    :goto_1
    :try_start_4
    new-instance v7, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;

    const-string v8, "It appears that ImageStore is misconfigured, or disk storage is unavailable- can\'t write to bitmap directory"

    invoke-direct {v7, v8, v2}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 83
    .end local v2    # "e":Ljava/io/FileNotFoundException;
    :catchall_0
    move-exception v7

    .line 84
    :goto_2
    if-eqz v5, :cond_3

    .line 86
    :try_start_5
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 91
    :cond_3
    :goto_3
    throw v7

    .line 81
    :catch_3
    move-exception v2

    .line 82
    .local v2, "e":Ljava/io/IOException;
    :goto_4
    :try_start_6
    new-instance v7, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;

    const-string v8, "Can\'t store bitmap"

    invoke-direct {v7, v8, v2}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 87
    .end local v2    # "e":Ljava/io/IOException;
    :catch_4
    move-exception v2

    .line 88
    .restart local v2    # "e":Ljava/io/IOException;
    const-string v8, "MixpanelAPI.ImageStore"

    const-string v9, "Problem closing output file"

    invoke-static {v8, v9, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    .line 87
    .end local v2    # "e":Ljava/io/IOException;
    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v6    # "out":Ljava/io/OutputStream;
    :catch_5
    move-exception v2

    .line 88
    .restart local v2    # "e":Ljava/io/IOException;
    const-string v7, "MixpanelAPI.ImageStore"

    const-string v8, "Problem closing output file"

    invoke-static {v7, v8, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 99
    .end local v2    # "e":Ljava/io/IOException;
    .end local v6    # "out":Ljava/io/OutputStream;
    :cond_4
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 100
    .restart local v0    # "bitmap":Landroid/graphics/Bitmap;
    if-nez v0, :cond_5

    .line 101
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v4

    .line 102
    .local v4, "ignored":Z
    new-instance v7, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;

    const-string v8, "Bitmap on disk can\'t be opened or was corrupt"

    invoke-direct {v7, v8}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 106
    .end local v4    # "ignored":Z
    :cond_5
    return-object v0

    .line 83
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v6    # "out":Ljava/io/OutputStream;
    :catchall_1
    move-exception v7

    move-object v5, v6

    .end local v6    # "out":Ljava/io/OutputStream;
    .restart local v5    # "out":Ljava/io/OutputStream;
    goto :goto_2

    .line 81
    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v6    # "out":Ljava/io/OutputStream;
    :catch_6
    move-exception v2

    move-object v5, v6

    .end local v6    # "out":Ljava/io/OutputStream;
    .restart local v5    # "out":Ljava/io/OutputStream;
    goto :goto_4

    .line 79
    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v6    # "out":Ljava/io/OutputStream;
    :catch_7
    move-exception v2

    move-object v5, v6

    .end local v6    # "out":Ljava/io/OutputStream;
    .restart local v5    # "out":Ljava/io/OutputStream;
    goto :goto_1
.end method
