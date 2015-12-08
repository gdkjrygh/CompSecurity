.class Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;
.super Ljava/lang/Object;
.source "CardCarouselLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/surveys/CardCarouselLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "QuestionCard"
.end annotation


# instance fields
.field private final mCardView:Landroid/view/View;

.field private final mChoiceView:Landroid/widget/ListView;

.field private final mEditAnswerView:Landroid/widget/TextView;

.field private final mPromptView:Landroid/widget/TextView;

.field private mQuestion:Lcom/mixpanel/android/mpmetrics/Survey$Question;

.field final synthetic this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/surveys/CardCarouselLayout;Landroid/view/View;)V
    .locals 2
    .param p2, "cardView"    # Landroid/view/View;

    .prologue
    .line 440
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 441
    iput-object p2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mCardView:Landroid/view/View;

    .line 442
    const-string v0, "com_mixpanel_android_TAG_prompt_text"

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mPromptView:Landroid/widget/TextView;

    .line 443
    const-string v0, "com_mixpanel_android_TAG_text_answer"

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    .line 444
    const-string v0, "com_mixpanel_android_TAG_choice_list"

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    .line 445
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 446
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    new-instance v1, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$1;-><init>(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 466
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    new-instance v1, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;-><init>(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 481
    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/mpmetrics/Survey$Question;
    .locals 1

    .prologue
    .line 528
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mQuestion:Lcom/mixpanel/android/mpmetrics/Survey$Question;

    return-object v0
.end method

.method static synthetic access$1(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/surveys/CardCarouselLayout;
    .locals 1

    .prologue
    .line 438
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    return-object v0
.end method


# virtual methods
.method public getView()Landroid/view/View;
    .locals 1

    .prologue
    .line 484
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mCardView:Landroid/view/View;

    return-object v0
.end method

.method public showQuestionOnCard(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V
    .locals 10
    .param p1, "question"    # Lcom/mixpanel/android/mpmetrics/Survey$Question;
    .param p2, "answerOrNull"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;
        }
    .end annotation

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 489
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mQuestion:Lcom/mixpanel/android/mpmetrics/Survey$Question;

    .line 490
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mPromptView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mQuestion:Lcom/mixpanel/android/mpmetrics/Survey$Question;

    invoke-virtual {v6}, Lcom/mixpanel/android/mpmetrics/Survey$Question;->getPrompt()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mCardView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "input_method"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 493
    .local v2, "inputMethodManager":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/Survey$Question;->getType()Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    move-result-object v4

    .line 494
    .local v4, "questionType":Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;
    sget-object v5, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->TEXT:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    if-ne v5, v4, :cond_3

    .line 495
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    invoke-virtual {v5, v9}, Landroid/widget/ListView;->setVisibility(I)V

    .line 496
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 497
    if-eqz p2, :cond_0

    .line 498
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 500
    :cond_0
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    invoke-virtual {v5}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v5, v5, Landroid/content/res/Configuration;->orientation:I

    if-ne v5, v8, :cond_2

    .line 501
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->requestFocus()Z

    .line 502
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    invoke-virtual {v2, v5, v7}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 525
    :cond_1
    :goto_0
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mCardView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 526
    return-void

    .line 505
    :cond_2
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mCardView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v5

    invoke-virtual {v2, v5, v7}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0

    .line 507
    :cond_3
    sget-object v5, Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;->MULTIPLE_CHOICE:Lcom/mixpanel/android/mpmetrics/Survey$QuestionType;

    if-ne v5, v4, :cond_5

    .line 508
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mCardView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v5

    invoke-virtual {v2, v5, v7}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 509
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    invoke-virtual {v5, v7}, Landroid/widget/ListView;->setVisibility(I)V

    .line 510
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mEditAnswerView:Landroid/widget/TextView;

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 511
    new-instance v0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;

    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/Survey$Question;->getChoices()Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;

    invoke-virtual {v6}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    invoke-direct {v0, v5, v6}, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;-><init>(Ljava/util/List;Landroid/view/LayoutInflater;)V

    .line 512
    .local v0, "answerAdapter":Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    invoke-virtual {v5, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 513
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    invoke-virtual {v5}, Landroid/widget/ListView;->clearChoices()V

    .line 514
    if-eqz p2, :cond_1

    .line 515
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->getCount()I

    move-result v5

    if-ge v1, v5, :cond_1

    .line 516
    invoke-virtual {v0, v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->getItem(I)Ljava/lang/String;

    move-result-object v3

    .line 517
    .local v3, "item":Ljava/lang/String;
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 518
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mChoiceView:Landroid/widget/ListView;

    invoke-virtual {v5, v1, v8}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 515
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 523
    .end local v0    # "answerAdapter":Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;
    .end local v1    # "i":I
    .end local v3    # "item":Ljava/lang/String;
    :cond_5
    new-instance v5, Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "No way to display question type "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;-><init>(Ljava/lang/String;Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;)V

    throw v5
.end method
