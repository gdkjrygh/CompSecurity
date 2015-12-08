.class public Lcom/urbanairship/util/Toaster;
.super Ljava/lang/Object;
.source "Toaster.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static longerToast(Ljava/lang/String;)V
    .locals 1
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 70
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/urbanairship/util/Toaster;->toast(Ljava/lang/String;I)V

    .line 71
    return-void
.end method

.method public static simpleToast(Ljava/lang/String;)V
    .locals 1
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 62
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/urbanairship/util/Toaster;->toast(Ljava/lang/String;I)V

    .line 63
    return-void
.end method

.method public static toast(Ljava/lang/String;I)V
    .locals 3
    .param p0, "message"    # Ljava/lang/String;
    .param p1, "duration"    # I

    .prologue
    .line 46
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 48
    .local v0, "appContext":Landroid/content/Context;
    if-nez v0, :cond_0

    .line 49
    const-string v2, "Toaster - applicationContext is null, bailing out"

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 55
    :goto_0
    return-void

    .line 53
    :cond_0
    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 54
    .local v1, "toast":Landroid/widget/Toast;
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
