.class public Lcom/adobe/mobile/MessageFullScreenActivity;
.super Lcom/adobe/mobile/AdobeMarketingActivity;
.source "MessageFullScreenActivity.java"


# instance fields
.field protected message:Lcom/adobe/mobile/MessageFullScreen;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/adobe/mobile/AdobeMarketingActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 74
    iget-object v0, p0, Lcom/adobe/mobile/MessageFullScreenActivity;->message:Lcom/adobe/mobile/MessageFullScreen;

    iput-boolean v1, v0, Lcom/adobe/mobile/MessageFullScreen;->isVisible:Z

    .line 75
    iget-object v0, p0, Lcom/adobe/mobile/MessageFullScreenActivity;->message:Lcom/adobe/mobile/MessageFullScreen;

    invoke-virtual {v0}, Lcom/adobe/mobile/MessageFullScreen;->viewed()V

    .line 76
    invoke-virtual {p0}, Lcom/adobe/mobile/MessageFullScreenActivity;->finish()V

    .line 77
    invoke-virtual {p0, v1, v1}, Lcom/adobe/mobile/MessageFullScreenActivity;->overridePendingTransition(II)V

    .line 78
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    invoke-super {p0, p1}, Lcom/adobe/mobile/AdobeMarketingActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/adobe/mobile/MessageFullScreenActivity;->requestWindowFeature(I)Z

    .line 35
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 36
    .local v0, "linearLayout":Landroid/widget/LinearLayout;
    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MessageFullScreenActivity;->setContentView(Landroid/view/View;)V

    .line 38
    invoke-static {}, Lcom/adobe/mobile/Messages;->getCurrentFullscreenMessage()Lcom/adobe/mobile/MessageFullScreen;

    move-result-object v1

    iput-object v1, p0, Lcom/adobe/mobile/MessageFullScreenActivity;->message:Lcom/adobe/mobile/MessageFullScreen;

    .line 39
    iget-object v1, p0, Lcom/adobe/mobile/MessageFullScreenActivity;->message:Lcom/adobe/mobile/MessageFullScreen;

    iput-object p0, v1, Lcom/adobe/mobile/MessageFullScreen;->messageFullScreenActivity:Landroid/app/Activity;

    .line 40
    return-void
.end method

.method public onResume()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 44
    invoke-super {p0}, Lcom/adobe/mobile/AdobeMarketingActivity;->onResume()V

    .line 48
    const v2, 0x1020002

    :try_start_0
    invoke-virtual {p0, v2}, Lcom/adobe/mobile/MessageFullScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 50
    .local v1, "rootViewGroup":Landroid/view/ViewGroup;
    if-nez v1, :cond_0

    .line 51
    const-string v2, "Messages - unable to get root view group from os"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-virtual {p0}, Lcom/adobe/mobile/MessageFullScreenActivity;->finish()V

    .line 53
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Lcom/adobe/mobile/MessageFullScreenActivity;->overridePendingTransition(II)V

    .line 70
    .end local v1    # "rootViewGroup":Landroid/view/ViewGroup;
    :goto_0
    return-void

    .line 56
    .restart local v1    # "rootViewGroup":Landroid/view/ViewGroup;
    :cond_0
    new-instance v2, Lcom/adobe/mobile/MessageFullScreenActivity$1;

    invoke-direct {v2, p0, v1}, Lcom/adobe/mobile/MessageFullScreenActivity$1;-><init>(Lcom/adobe/mobile/MessageFullScreenActivity;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 65
    .end local v1    # "rootViewGroup":Landroid/view/ViewGroup;
    :catch_0
    move-exception v0

    .line 66
    .local v0, "ex":Ljava/lang/NullPointerException;
    const-string v2, "Messages - content view is in undefined state (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-virtual {p0}, Lcom/adobe/mobile/MessageFullScreenActivity;->finish()V

    .line 68
    invoke-virtual {p0, v5, v5}, Lcom/adobe/mobile/MessageFullScreenActivity;->overridePendingTransition(II)V

    goto :goto_0
.end method
