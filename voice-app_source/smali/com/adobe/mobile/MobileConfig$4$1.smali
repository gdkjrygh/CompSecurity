.class Lcom/adobe/mobile/MobileConfig$4$1;
.super Ljava/lang/Object;
.source "MobileConfig.java"

# interfaces
.implements Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/MobileConfig$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/adobe/mobile/MobileConfig$4;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/MobileConfig$4;)V
    .locals 0
    .param p1, "this$1"    # Lcom/adobe/mobile/MobileConfig$4;

    .prologue
    .line 527
    iput-object p1, p0, Lcom/adobe/mobile/MobileConfig$4$1;->this$1:Lcom/adobe/mobile/MobileConfig$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(ZLjava/io/File;)V
    .locals 1
    .param p1, "modified"    # Z
    .param p2, "file"    # Ljava/io/File;

    .prologue
    .line 530
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig$4$1;->this$1:Lcom/adobe/mobile/MobileConfig$4;

    iget-object v0, v0, Lcom/adobe/mobile/MobileConfig$4;->this$0:Lcom/adobe/mobile/MobileConfig;

    invoke-virtual {v0, p2}, Lcom/adobe/mobile/MobileConfig;->updateMessagesData(Ljava/io/File;)V

    .line 531
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig$4$1;->this$1:Lcom/adobe/mobile/MobileConfig$4;

    iget-object v0, v0, Lcom/adobe/mobile/MobileConfig$4;->this$0:Lcom/adobe/mobile/MobileConfig;

    # invokes: Lcom/adobe/mobile/MobileConfig;->loadMessageImages()V
    invoke-static {v0}, Lcom/adobe/mobile/MobileConfig;->access$100(Lcom/adobe/mobile/MobileConfig;)V

    .line 532
    return-void
.end method
