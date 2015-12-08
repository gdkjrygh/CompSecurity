.class public Lio/fabric/sdk/android/services/common/SafeToast;
.super Landroid/widget/Toast;
.source "SafeToast.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 41
    invoke-direct {p0, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 42
    return-void
.end method

.method static synthetic access$001(Lio/fabric/sdk/android/services/common/SafeToast;)V
    .locals 0
    .param p0, "x0"    # Lio/fabric/sdk/android/services/common/SafeToast;

    .prologue
    .line 32
    invoke-super {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static makeText(Landroid/content/Context;II)Landroid/widget/Toast;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "resId"    # I
    .param p2, "duration"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .prologue
    .line 94
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lio/fabric/sdk/android/services/common/SafeToast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    return-object v0
.end method

.method public static makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "duration"    # I

    .prologue
    .line 72
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 74
    .local v0, "origToast":Landroid/widget/Toast;
    new-instance v1, Lio/fabric/sdk/android/services/common/SafeToast;

    invoke-direct {v1, p0}, Lio/fabric/sdk/android/services/common/SafeToast;-><init>(Landroid/content/Context;)V

    .line 75
    .local v1, "safeToast":Lio/fabric/sdk/android/services/common/SafeToast;
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/fabric/sdk/android/services/common/SafeToast;->setView(Landroid/view/View;)V

    .line 76
    invoke-virtual {v0}, Landroid/widget/Toast;->getDuration()I

    move-result v2

    invoke-virtual {v1, v2}, Lio/fabric/sdk/android/services/common/SafeToast;->setDuration(I)V

    .line 78
    return-object v1
.end method


# virtual methods
.method public show()V
    .locals 3

    .prologue
    .line 46
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 47
    invoke-super {p0}, Landroid/widget/Toast;->show()V

    .line 57
    :goto_0
    return-void

    .line 49
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 50
    .local v0, "handler":Landroid/os/Handler;
    new-instance v1, Lio/fabric/sdk/android/services/common/SafeToast$1;

    invoke-direct {v1, p0}, Lio/fabric/sdk/android/services/common/SafeToast$1;-><init>(Lio/fabric/sdk/android/services/common/SafeToast;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
