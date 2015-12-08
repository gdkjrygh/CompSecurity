.class public Lio/fabric/sdk/android/Fabric$Builder;
.super Ljava/lang/Object;
.source "Fabric.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/Fabric;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private appIdentifier:Ljava/lang/String;

.field private appInstallIdentifier:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private debuggable:Z

.field private handler:Landroid/os/Handler;

.field private initializationCallback:Lio/fabric/sdk/android/InitializationCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/InitializationCallback",
            "<",
            "Lio/fabric/sdk/android/Fabric;",
            ">;"
        }
    .end annotation
.end field

.field private kits:[Lio/fabric/sdk/android/Kit;

.field private logger:Lio/fabric/sdk/android/Logger;

.field private threadPoolExecutor:Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    if-nez p1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->context:Landroid/content/Context;

    .line 96
    return-void
.end method


# virtual methods
.method public appIdentifier(Ljava/lang/String;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 2
    .param p1, "appIdentifier"    # Ljava/lang/String;

    .prologue
    .line 162
    if-nez p1, :cond_0

    .line 163
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appIdentifier must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->appIdentifier:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 167
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "appIdentifier already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    :cond_1
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->appIdentifier:Ljava/lang/String;

    .line 171
    return-object p0
.end method

.method public appInstallIdentifier(Ljava/lang/String;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 2
    .param p1, "appInstallIdentifier"    # Ljava/lang/String;

    .prologue
    .line 178
    if-nez p1, :cond_0

    .line 179
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appInstallIdentifier must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->appInstallIdentifier:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 183
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "appInstallIdentifier already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_1
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->appInstallIdentifier:Ljava/lang/String;

    .line 187
    return-object p0
.end method

.method public build()Lio/fabric/sdk/android/Fabric;
    .locals 9

    .prologue
    .line 219
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->threadPoolExecutor:Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 220
    invoke-static {}, Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;->create()Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->threadPoolExecutor:Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    .line 223
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->handler:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 224
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->handler:Landroid/os/Handler;

    .line 227
    :cond_1
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->logger:Lio/fabric/sdk/android/Logger;

    if-nez v0, :cond_2

    .line 228
    iget-boolean v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->debuggable:Z

    if-eqz v0, :cond_5

    .line 229
    new-instance v0, Lio/fabric/sdk/android/DefaultLogger;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/fabric/sdk/android/DefaultLogger;-><init>(I)V

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->logger:Lio/fabric/sdk/android/Logger;

    .line 236
    :cond_2
    :goto_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->appIdentifier:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 237
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->appIdentifier:Ljava/lang/String;

    .line 240
    :cond_3
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    if-nez v0, :cond_4

    .line 241
    sget-object v0, Lio/fabric/sdk/android/InitializationCallback;->EMPTY:Lio/fabric/sdk/android/InitializationCallback;

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    .line 245
    :cond_4
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->kits:[Lio/fabric/sdk/android/Kit;

    if-nez v0, :cond_6

    .line 246
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 251
    .local v2, "kitMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class<+Lio/fabric/sdk/android/Kit;>;Lio/fabric/sdk/android/Kit;>;"
    :goto_1
    new-instance v8, Lio/fabric/sdk/android/services/common/IdManager;

    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->context:Landroid/content/Context;

    iget-object v1, p0, Lio/fabric/sdk/android/Fabric$Builder;->appIdentifier:Ljava/lang/String;

    iget-object v3, p0, Lio/fabric/sdk/android/Fabric$Builder;->appInstallIdentifier:Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v8, v0, v1, v3, v4}, Lio/fabric/sdk/android/services/common/IdManager;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V

    .line 254
    .local v8, "idManager":Lio/fabric/sdk/android/services/common/IdManager;
    new-instance v0, Lio/fabric/sdk/android/Fabric;

    iget-object v1, p0, Lio/fabric/sdk/android/Fabric$Builder;->context:Landroid/content/Context;

    iget-object v3, p0, Lio/fabric/sdk/android/Fabric$Builder;->threadPoolExecutor:Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    iget-object v4, p0, Lio/fabric/sdk/android/Fabric$Builder;->handler:Landroid/os/Handler;

    iget-object v5, p0, Lio/fabric/sdk/android/Fabric$Builder;->logger:Lio/fabric/sdk/android/Logger;

    iget-boolean v6, p0, Lio/fabric/sdk/android/Fabric$Builder;->debuggable:Z

    iget-object v7, p0, Lio/fabric/sdk/android/Fabric$Builder;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    invoke-direct/range {v0 .. v8}, Lio/fabric/sdk/android/Fabric;-><init>(Landroid/content/Context;Ljava/util/Map;Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;Landroid/os/Handler;Lio/fabric/sdk/android/Logger;ZLio/fabric/sdk/android/InitializationCallback;Lio/fabric/sdk/android/services/common/IdManager;)V

    return-object v0

    .line 231
    .end local v2    # "kitMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class<+Lio/fabric/sdk/android/Kit;>;Lio/fabric/sdk/android/Kit;>;"
    .end local v8    # "idManager":Lio/fabric/sdk/android/services/common/IdManager;
    :cond_5
    new-instance v0, Lio/fabric/sdk/android/DefaultLogger;

    invoke-direct {v0}, Lio/fabric/sdk/android/DefaultLogger;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->logger:Lio/fabric/sdk/android/Logger;

    goto :goto_0

    .line 248
    :cond_6
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->kits:[Lio/fabric/sdk/android/Kit;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    # invokes: Lio/fabric/sdk/android/Fabric;->getKitMap(Ljava/util/Collection;)Ljava/util/Map;
    invoke-static {v0}, Lio/fabric/sdk/android/Fabric;->access$000(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v2

    .restart local v2    # "kitMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Class<+Lio/fabric/sdk/android/Kit;>;Lio/fabric/sdk/android/Kit;>;"
    goto :goto_1
.end method

.method public debuggable(Z)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 0
    .param p1, "enabled"    # Z

    .prologue
    .line 194
    iput-boolean p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->debuggable:Z

    .line 195
    return-object p0
.end method

.method public executorService(Ljava/util/concurrent/ExecutorService;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 0
    .param p1, "executorService"    # Ljava/util/concurrent/ExecutorService;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 115
    return-object p0
.end method

.method public handler(Landroid/os/Handler;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 0
    .param p1, "handler"    # Landroid/os/Handler;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 139
    return-object p0
.end method

.method public initializationCallback(Lio/fabric/sdk/android/InitializationCallback;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/InitializationCallback",
            "<",
            "Lio/fabric/sdk/android/Fabric;",
            ">;)",
            "Lio/fabric/sdk/android/Fabric$Builder;"
        }
    .end annotation

    .prologue
    .line 203
    .local p1, "initializationCallback":Lio/fabric/sdk/android/InitializationCallback;, "Lio/fabric/sdk/android/InitializationCallback<Lio/fabric/sdk/android/Fabric;>;"
    if-nez p1, :cond_0

    .line 204
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "initializationCallback must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    if-eqz v0, :cond_1

    .line 208
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initializationCallback already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :cond_1
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    .line 212
    return-object p0
.end method

.method public varargs kits([Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 2
    .param p1, "kits"    # [Lio/fabric/sdk/android/Kit;

    .prologue
    .line 102
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->kits:[Lio/fabric/sdk/android/Kit;

    if-eqz v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Kits already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_0
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->kits:[Lio/fabric/sdk/android/Kit;

    .line 107
    return-object p0
.end method

.method public logger(Lio/fabric/sdk/android/Logger;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 2
    .param p1, "logger"    # Lio/fabric/sdk/android/Logger;

    .prologue
    .line 146
    if-nez p1, :cond_0

    .line 147
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Logger must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->logger:Lio/fabric/sdk/android/Logger;

    if-eqz v0, :cond_1

    .line 151
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Logger already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_1
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->logger:Lio/fabric/sdk/android/Logger;

    .line 155
    return-object p0
.end method

.method public threadPoolExecutor(Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;)Lio/fabric/sdk/android/Fabric$Builder;
    .locals 2
    .param p1, "threadPoolExecutor"    # Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    .prologue
    .line 122
    if-nez p1, :cond_0

    .line 123
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "PriorityThreadPoolExecutor must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$Builder;->threadPoolExecutor:Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    if-eqz v0, :cond_1

    .line 127
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PriorityThreadPoolExecutor already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_1
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$Builder;->threadPoolExecutor:Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;

    .line 131
    return-object p0
.end method
