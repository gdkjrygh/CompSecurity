.class Lcom/adobe/mobile/MobileConfig$5;
.super Ljava/lang/Object;
.source "MobileConfig.java"

# interfaces
.implements Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/MobileConfig;->downloadRemoteConfigs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/MobileConfig;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/MobileConfig;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/MobileConfig;

    .prologue
    .line 538
    iput-object p1, p0, Lcom/adobe/mobile/MobileConfig$5;->this$0:Lcom/adobe/mobile/MobileConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(ZLjava/io/File;)V
    .locals 2
    .param p1, "modified"    # Z
    .param p2, "file"    # Ljava/io/File;

    .prologue
    .line 541
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/MobileConfig$5$1;

    invoke-direct {v1, p0, p2}, Lcom/adobe/mobile/MobileConfig$5$1;-><init>(Lcom/adobe/mobile/MobileConfig$5;Ljava/io/File;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 550
    return-void
.end method
