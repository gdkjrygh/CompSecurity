.class Lcom/mixpanel/android/surveys/SurveyActivity$1;
.super Ljava/lang/Object;
.source "SurveyActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/surveys/SurveyActivity;->onCreateInAppNotification(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

.field private final synthetic val$inApp:Lcom/mixpanel/android/mpmetrics/InAppNotification;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/SurveyActivity;Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    iput-object p2, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->val$inApp:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 153
    iget-object v4, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->val$inApp:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getCallToActionUrl()Ljava/lang/String;

    move-result-object v2

    .line 154
    .local v2, "uriString":Ljava/lang/String;
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 157
    :try_start_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 164
    .local v1, "uri":Landroid/net/Uri;
    :try_start_1
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v3, v4, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 165
    .local v3, "viewIntent":Landroid/content/Intent;
    iget-object v4, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-virtual {v4, v3}, Lcom/mixpanel/android/surveys/SurveyActivity;->startActivity(Landroid/content/Intent;)V

    .line 166
    iget-object v4, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    # getter for: Lcom/mixpanel/android/surveys/SurveyActivity;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {v4}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$0(Lcom/mixpanel/android/surveys/SurveyActivity;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v4

    const-string v5, "$campaign_open"

    iget-object v6, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->val$inApp:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-interface {v4, v5, v6}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->trackNotification(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 171
    .end local v1    # "uri":Landroid/net/Uri;
    .end local v3    # "viewIntent":Landroid/content/Intent;
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-virtual {v4}, Lcom/mixpanel/android/surveys/SurveyActivity;->finish()V

    .line 172
    iget-object v4, p0, Lcom/mixpanel/android/surveys/SurveyActivity$1;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    # getter for: Lcom/mixpanel/android/surveys/SurveyActivity;->mIntentId:I
    invoke-static {v4}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$1(Lcom/mixpanel/android/surveys/SurveyActivity;)I

    move-result v4

    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->releaseDisplayState(I)V

    .line 173
    :goto_1
    return-void

    .line 158
    :catch_0
    move-exception v0

    .line 159
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    const-string v4, "MixpanelAPI.SrvyActvty"

    const-string v5, "Can\'t parse notification URI, will not take any action"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 167
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    .restart local v1    # "uri":Landroid/net/Uri;
    :catch_1
    move-exception v0

    .line 168
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const-string v4, "MixpanelAPI.SrvyActvty"

    const-string v5, "User doesn\'t have an activity for notification URI"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
