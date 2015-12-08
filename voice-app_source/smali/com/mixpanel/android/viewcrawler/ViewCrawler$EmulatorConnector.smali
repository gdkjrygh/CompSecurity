.class Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;
.super Ljava/lang/Object;
.source "ViewCrawler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewCrawler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EmulatorConnector"
.end annotation


# instance fields
.field private volatile mStopped:Z

.field final synthetic this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)V
    .locals 1

    .prologue
    .line 149
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->mStopped:Z

    .line 151
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 155
    iget-boolean v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->mStopped:Z

    if-nez v1, :cond_0

    .line 156
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 157
    .local v0, "message":Landroid/os/Message;
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 160
    .end local v0    # "message":Landroid/os/Message;
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v1

    const-wide/16 v2, 0x7530

    invoke-virtual {v1, p0, v2, v3}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 161
    return-void
.end method

.method public start()V
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->mStopped:Z

    .line 165
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->post(Ljava/lang/Runnable;)Z

    .line 166
    return-void
.end method

.method public stop()V
    .locals 1

    .prologue
    .line 169
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->mStopped:Z

    .line 170
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 171
    return-void
.end method
