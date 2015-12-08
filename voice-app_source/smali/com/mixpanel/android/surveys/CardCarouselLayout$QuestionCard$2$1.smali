.class Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2$1;
.super Ljava/lang/Object;
.source "CardCarouselLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;

.field private final synthetic val$answer:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2$1;->this$2:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;

    iput-object p2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2$1;->val$answer:Ljava/lang/String;

    .line 472
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 475
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2$1;->this$2:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;->this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;
    invoke-static {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;)Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    move-result-object v0

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->this$0:Lcom/mixpanel/android/surveys/CardCarouselLayout;
    invoke-static {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->access$1(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/surveys/CardCarouselLayout;

    move-result-object v0

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;
    invoke-static {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout;)Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2$1;->this$2:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;->this$1:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;
    invoke-static {v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2;)Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    move-result-object v1

    # getter for: Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->mQuestion:Lcom/mixpanel/android/mpmetrics/Survey$Question;
    invoke-static {v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;)Lcom/mixpanel/android/mpmetrics/Survey$Question;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard$2$1;->val$answer:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;->onQuestionAnswered(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V

    .line 476
    return-void
.end method
