.class Lcom/mixpanel/android/mpmetrics/BackgroundCapture;
.super Ljava/lang/Object;
.source "BackgroundCapture.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/BackgroundCapture$BackgroundCaptureTask;,
        Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;
    }
.end annotation


# static fields
.field private static final GRAY_72PERCENT_OPAQUE:I

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.BackgroundCapture"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x1c

    .line 78
    const/16 v0, 0xba

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture;->GRAY_72PERCENT_OPAQUE:I

    .line 81
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0()I
    .locals 1

    .prologue
    .line 78
    sget v0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture;->GRAY_72PERCENT_OPAQUE:I

    return v0
.end method

.method public static captureBackground(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;)V
    .locals 1
    .param p0, "parentActivity"    # Landroid/app/Activity;
    .param p1, "listener"    # Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;

    .prologue
    .line 16
    new-instance v0, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/BackgroundCapture$1;-><init>(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 23
    return-void
.end method
