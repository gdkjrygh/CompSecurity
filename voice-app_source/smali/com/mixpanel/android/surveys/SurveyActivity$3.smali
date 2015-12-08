.class Lcom/mixpanel/android/surveys/SurveyActivity$3;
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


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/SurveyActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/surveys/SurveyActivity$3;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 189
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$3;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/SurveyActivity;->finish()V

    .line 190
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$3;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    # getter for: Lcom/mixpanel/android/surveys/SurveyActivity;->mIntentId:I
    invoke-static {v0}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$1(Lcom/mixpanel/android/surveys/SurveyActivity;)I

    move-result v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->releaseDisplayState(I)V

    .line 191
    return-void
.end method
