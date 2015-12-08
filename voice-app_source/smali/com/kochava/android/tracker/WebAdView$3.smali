.class Lcom/kochava/android/tracker/WebAdView$3;
.super Ljava/lang/Object;
.source "WebAdView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/WebAdView;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/WebAdView;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/WebAdView;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/WebAdView;

    .prologue
    .line 188
    iput-object p1, p0, Lcom/kochava/android/tracker/WebAdView$3;->this$0:Lcom/kochava/android/tracker/WebAdView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "arg0"    # Landroid/content/DialogInterface;

    .prologue
    .line 192
    sget-boolean v0, Lcom/kochava/android/tracker/Global;->DEBUG:Z

    if-eqz v0, :cond_0

    const-string v0, "KochavaAds"

    const-string v1, "Back pressed during loading dialog."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/kochava/android/tracker/WebAdView$3;->this$0:Lcom/kochava/android/tracker/WebAdView;

    iget-object v0, v0, Lcom/kochava/android/tracker/WebAdView;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 196
    return-void
.end method
