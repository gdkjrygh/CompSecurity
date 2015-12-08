.class Lcom/mixpanel/android/mpmetrics/InAppFragment$3;
.super Ljava/lang/Object;
.source "InAppFragment.java"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/InAppFragment;->onAttach(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$3;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 101
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1
    .param p1, "e1"    # Landroid/view/MotionEvent;
    .param p2, "e2"    # Landroid/view/MotionEvent;
    .param p3, "velocityX"    # F
    .param p4, "velocityY"    # F

    .prologue
    .line 107
    const/4 v0, 0x0

    cmpl-float v0, p4, v0

    if-lez v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$3;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # invokes: Lcom/mixpanel/android/mpmetrics/InAppFragment;->remove()V
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$0(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V

    .line 110
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0
    .param p1, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 114
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1
    .param p1, "e1"    # Landroid/view/MotionEvent;
    .param p2, "e2"    # Landroid/view/MotionEvent;
    .param p3, "distanceX"    # F
    .param p4, "distanceY"    # F

    .prologue
    .line 119
    const/4 v0, 0x0

    return v0
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0
    .param p1, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 123
    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 9
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v8, 0x1

    .line 127
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$3;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$2(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->getInAppNotification()Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v1

    .line 129
    .local v1, "inApp":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getCallToActionUrl()Ljava/lang/String;

    move-result-object v3

    .line 130
    .local v3, "uriString":Ljava/lang/String;
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    .line 133
    :try_start_0
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 140
    .local v2, "uri":Landroid/net/Uri;
    :try_start_1
    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v4, v5, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 141
    .local v4, "viewIntent":Landroid/content/Intent;
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$3;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mParent:Landroid/app/Activity;
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$4(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 142
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$3;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$5(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v5

    const-string v6, "$campaign_open"

    invoke-interface {v5, v6, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->trackNotification(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 148
    .end local v2    # "uri":Landroid/net/Uri;
    .end local v4    # "viewIntent":Landroid/content/Intent;
    :cond_0
    :goto_0
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$3;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # invokes: Lcom/mixpanel/android/mpmetrics/InAppFragment;->remove()V
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$0(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V

    .line 149
    :goto_1
    return v8

    .line 134
    :catch_0
    move-exception v0

    .line 135
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    const-string v5, "MixpanelAPI.InAppFrag"

    const-string v6, "Can\'t parse notification URI, will not take any action"

    invoke-static {v5, v6, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 143
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    .restart local v2    # "uri":Landroid/net/Uri;
    :catch_1
    move-exception v0

    .line 144
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const-string v5, "MixpanelAPI.InAppFrag"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "User doesn\'t have an activity for notification URI "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
