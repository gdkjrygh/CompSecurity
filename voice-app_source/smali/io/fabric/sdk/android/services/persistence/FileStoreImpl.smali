.class public Lio/fabric/sdk/android/services/persistence/FileStoreImpl;
.super Ljava/lang/Object;
.source "FileStoreImpl.java"

# interfaces
.implements Lio/fabric/sdk/android/services/persistence/FileStore;


# instance fields
.field private final contentPath:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private final legacySupport:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;)V
    .locals 2
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get directory before context has been set. Call Fabric.with() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_0
    invoke-virtual {p1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->context:Landroid/content/Context;

    .line 44
    invoke-virtual {p1}, Lio/fabric/sdk/android/Kit;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->contentPath:Ljava/lang/String;

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->legacySupport:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method public getCacheDir()Ljava/io/File;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->prepare(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public getExternalCacheDir()Ljava/io/File;
    .locals 4

    .prologue
    .line 64
    const/4 v0, 0x0

    .line 65
    .local v0, "file":Ljava/io/File;
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->isExternalStorageAvailable()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-lt v1, v2, :cond_1

    .line 67
    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    .line 73
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->prepare(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    return-object v1

    .line 69
    :cond_1
    new-instance v0, Ljava/io/File;

    .end local v0    # "file":Ljava/io/File;
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->legacySupport:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/cache/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->contentPath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .restart local v0    # "file":Ljava/io/File;
    goto :goto_0
.end method

.method public getExternalFilesDir()Ljava/io/File;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x8
    .end annotation

    .prologue
    .line 93
    const/4 v0, 0x0

    .line 94
    .local v0, "file":Ljava/io/File;
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->isExternalStorageAvailable()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 95
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-lt v1, v2, :cond_1

    .line 96
    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->context:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 102
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->prepare(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    return-object v1

    .line 98
    :cond_1
    new-instance v0, Ljava/io/File;

    .end local v0    # "file":Ljava/io/File;
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->legacySupport:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/files/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->contentPath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .restart local v0    # "file":Ljava/io/File;
    goto :goto_0
.end method

.method public getFilesDir()Ljava/io/File;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->prepare(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method isExternalStorageAvailable()Z
    .locals 4

    .prologue
    .line 119
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 120
    .local v0, "state":Ljava/lang/String;
    const-string v1, "mounted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 121
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?"

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const/4 v1, 0x0

    .line 128
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0
.end method

.method prepare(Ljava/io/File;)Ljava/io/File;
    .locals 3
    .param p1, "file"    # Ljava/io/File;

    .prologue
    .line 106
    if-eqz p1, :cond_2

    .line 107
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    .end local p1    # "file":Ljava/io/File;
    :cond_0
    :goto_0
    return-object p1

    .line 110
    .restart local p1    # "file":Ljava/io/File;
    :cond_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Couldn\'t create file"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :goto_1
    const/4 p1, 0x0

    goto :goto_0

    .line 113
    :cond_2
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Null File"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method
