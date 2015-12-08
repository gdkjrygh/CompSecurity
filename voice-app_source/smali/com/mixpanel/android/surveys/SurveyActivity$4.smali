.class Lcom/mixpanel/android/surveys/SurveyActivity$4;
.super Ljava/lang/Object;
.source "SurveyActivity.java"

# interfaces
.implements Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/surveys/SurveyActivity;->onCreateSurvey(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/mixpanel/android/surveys/SurveyActivity$4;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQuestionAnswered(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V
    .locals 1
    .param p1, "question"    # Lcom/mixpanel/android/mpmetrics/Survey$Question;
    .param p2, "answer"    # Ljava/lang/String;

    .prologue
    .line 248
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$4;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    # invokes: Lcom/mixpanel/android/surveys/SurveyActivity;->saveAnswer(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V
    invoke-static {v0, p1, p2}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$2(Lcom/mixpanel/android/surveys/SurveyActivity;Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyActivity$4;->this$0:Lcom/mixpanel/android/surveys/SurveyActivity;

    # invokes: Lcom/mixpanel/android/surveys/SurveyActivity;->goToNextQuestion()V
    invoke-static {v0}, Lcom/mixpanel/android/surveys/SurveyActivity;->access$3(Lcom/mixpanel/android/surveys/SurveyActivity;)V

    .line 250
    return-void
.end method
