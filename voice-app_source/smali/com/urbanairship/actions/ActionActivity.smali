.class public Lcom/urbanairship/actions/ActionActivity;
.super Landroid/app/Activity;
.source "ActionActivity.java"


# static fields
.field public static final RESULT_INTENT_EXTRA:Ljava/lang/String; = "com.urbanairship.actions.actionactivity.RESULT_INTENT_EXTRA"

.field public static final RESULT_RECEIVER_EXTRA:Ljava/lang/String; = "com.urbanairship.actions.actionactivity.RESULT_RECEIVER_EXTRA"

.field public static final START_ACTIVITY_INTENT_EXTRA:Ljava/lang/String; = "com.urbanairship.actions.START_ACTIVITY_INTENT_EXTRA"

.field private static requestCode:I


# instance fields
.field private actionResultReceiver:Landroid/os/ResultReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    sput v0, Lcom/urbanairship/actions/ActionActivity;->requestCode:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 86
    iget-object v1, p0, Lcom/urbanairship/actions/ActionActivity;->actionResultReceiver:Landroid/os/ResultReceiver;

    if-eqz v1, :cond_0

    .line 87
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 88
    .local v0, "bundledData":Landroid/os/Bundle;
    const-string v1, "com.urbanairship.actions.actionactivity.RESULT_INTENT_EXTRA"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 89
    iget-object v1, p0, Lcom/urbanairship/actions/ActionActivity;->actionResultReceiver:Landroid/os/ResultReceiver;

    invoke-virtual {v1, p2, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 92
    .end local v0    # "bundledData":Landroid/os/Bundle;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 93
    invoke-virtual {p0}, Lcom/urbanairship/actions/ActionActivity;->finish()V

    .line 94
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 67
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 69
    invoke-virtual {p0}, Lcom/urbanairship/actions/ActionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 71
    .local v0, "intent":Landroid/content/Intent;
    if-nez v0, :cond_1

    .line 72
    const-string v2, "Started Action Activity with null intent"

    invoke-static {v2}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Lcom/urbanairship/actions/ActionActivity;->finish()V

    .line 82
    :cond_0
    :goto_0
    return-void

    .line 77
    :cond_1
    if-nez p1, :cond_0

    .line 78
    const-string v2, "com.urbanairship.actions.START_ACTIVITY_INTENT_EXTRA"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    .line 79
    .local v1, "startActivityIntent":Landroid/content/Intent;
    const-string v2, "com.urbanairship.actions.actionactivity.RESULT_RECEIVER_EXTRA"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/ResultReceiver;

    iput-object v2, p0, Lcom/urbanairship/actions/ActionActivity;->actionResultReceiver:Landroid/os/ResultReceiver;

    .line 80
    sget v2, Lcom/urbanairship/actions/ActionActivity;->requestCode:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/urbanairship/actions/ActionActivity;->requestCode:I

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/actions/ActionActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 98
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 101
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/urbanairship/analytics/Analytics;->activityStarted(Landroid/app/Activity;)V

    .line 102
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 106
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 109
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/UAirship;->getAnalytics()Lcom/urbanairship/analytics/Analytics;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/urbanairship/analytics/Analytics;->activityStopped(Landroid/app/Activity;)V

    .line 110
    return-void
.end method
