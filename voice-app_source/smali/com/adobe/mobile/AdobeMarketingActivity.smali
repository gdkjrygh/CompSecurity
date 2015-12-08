.class public abstract Lcom/adobe/mobile/AdobeMarketingActivity;
.super Landroid/app/Activity;
.source "AdobeMarketingActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 27
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    invoke-virtual {p0}, Lcom/adobe/mobile/AdobeMarketingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/adobe/mobile/Config;->setContext(Landroid/content/Context;)V

    .line 29
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 33
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 34
    invoke-static {}, Lcom/adobe/mobile/Config;->pauseCollectingLifecycleData()V

    .line 35
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 39
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 40
    invoke-static {p0}, Lcom/adobe/mobile/Config;->collectLifecycleData(Landroid/app/Activity;)V

    .line 41
    return-void
.end method
