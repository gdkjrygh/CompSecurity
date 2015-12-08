.class Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;
.super Ljava/lang/Object;
.source "MixpanelAPI.java"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableSurvey(Lcom/mixpanel/android/mpmetrics/Survey;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

.field private final synthetic val$intentId:I

.field private final synthetic val$parent:Landroid/app/Activity;

.field private final synthetic val$surveyDisplay:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;Landroid/app/Activity;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$surveyDisplay:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$parent:Landroid/app/Activity;

    iput p4, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$intentId:I

    .line 1800
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackgroundCaptured(Landroid/graphics/Bitmap;I)V
    .locals 3
    .param p1, "bitmapCaptured"    # Landroid/graphics/Bitmap;
    .param p2, "highlightColorCaptured"    # I

    .prologue
    .line 1803
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$surveyDisplay:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    invoke-virtual {v1, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->setBackground(Landroid/graphics/Bitmap;)V

    .line 1804
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$surveyDisplay:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    invoke-virtual {v1, p2}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->setHighlightColor(I)V

    .line 1806
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$parent:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1807
    .local v0, "surveyIntent":Landroid/content/Intent;
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1808
    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1809
    const-string v1, "com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY"

    iget v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$intentId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1810
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;->val$parent:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1811
    return-void
.end method
