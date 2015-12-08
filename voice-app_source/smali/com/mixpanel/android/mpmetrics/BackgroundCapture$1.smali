.class Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;
.super Ljava/lang/Object;
.source "BackgroundCapture.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/BackgroundCapture;->captureBackground(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$listener:Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;

.field private final synthetic val$parentActivity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;->val$parentActivity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;->val$listener:Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 19
    new-instance v0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$BackgroundCaptureTask;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;->val$parentActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;->val$listener:Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$BackgroundCaptureTask;-><init>(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;)V

    .line 20
    .local v0, "task":Lcom/mixpanel/android/mpmetrics/BackgroundCapture$BackgroundCaptureTask;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$BackgroundCaptureTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 21
    return-void
.end method
