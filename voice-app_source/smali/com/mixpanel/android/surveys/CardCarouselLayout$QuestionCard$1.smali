.class Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;
.super Ljava/lang/Object;
.source "CardCarouselLayout.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;-><init>(Lcom/mixpanel/android/surveys/CardCarouselLayout;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;->this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    .line 446
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 6
    .param p1, "view"    # Landroid/widget/TextView;
    .param p2, "actionId"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 450
    if-eqz p3, :cond_3

    .line 451
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    const/16 v5, 0x42

    if-ne v4, v5, :cond_3

    .line 452
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    if-nez v4, :cond_3

    .line 453
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getFlags()I

    move-result v4

    and-int/lit8 v4, v4, 0x20

    if-nez v4, :cond_3

    move v1, v3

    .line 455
    .local v1, "enterKeyDown":Z
    :goto_0
    if-nez v1, :cond_0

    const/4 v4, 0x6

    if-ne p2, v4, :cond_2

    .line 456
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->clearComposingText()V

    .line 457
    iget-object v2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;->this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;
    invoke-static {v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->access$1(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/surveys/CardCarouselLayout;

    move-result-object v2

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;
    invoke-static {v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout;)Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 458
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 459
    .local v0, "answer":Ljava/lang/String;
    iget-object v2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;->this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;
    invoke-static {v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->access$1(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/surveys/CardCarouselLayout;

    move-result-object v2

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;
    invoke-static {v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout;)Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    move-result-object v2

    iget-object v4, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;->this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mQuestion:Lcom/mixpanel/android/mpmetrics/Survey$Question;
    invoke-static {v4}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/mpmetrics/Survey$Question;

    move-result-object v4

    invoke-interface {v2, v4, v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;->onQuestionAnswered(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V

    .end local v0    # "answer":Ljava/lang/String;
    :cond_1
    move v2, v3

    .line 463
    :cond_2
    return v2

    .end local v1    # "enterKeyDown":Z
    :cond_3
    move v1, v2

    .line 449
    goto :goto_0
.end method
