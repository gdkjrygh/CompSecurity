.class Lcom/mixpanel/android/surveys/SurveyActivity$5;
.super Ljava/lang/Object;
.source "SurveyActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/surveys/SurveyActivity;->onStartSurvey()V
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
    iput-object p1, p0, Lcom/mixpanel/android/surveys/SurveyActivity$5;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    .line 274
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 277
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$5;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    sget v1, Lcom/mixpanel/android/R$id;->com_mixpanel_android_activity_survey_id:I

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/surveys/SurveyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$5;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$4(Lcom/mixpanel/android/surveys/SurveyActivity;Z)V

    .line 279
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$5;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    iget-object v1, p0, Lcom/mixpanel/android/surveys/SurveyActivity$5;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    # getter for: Lcom/mixpanel/android/surveys/SurveyActivity;->mCurrentQuestion:I
    invoke-static {v1}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$5(Lcom/mixpanel/android/surveys/SurveyActivity;)I

    move-result v1

    # invokes: Lcom/mixpanel/android/surveys/SurveyActivity;->showQuestion(I)V
    invoke-static {v0, v1}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$6(Lcom/mixpanel/android/surveys/SurveyActivity;I)V

    .line 280
    return-void
.end method
