.class Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;
.super Ljava/lang/Object;
.source "CardCarouselLayout.java"

# interfaces
.implements Landroid/widget/ListAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/surveys/CardCarouselLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ChoiceAdapter"
.end annotation


# static fields
.field private static final VIEW_TYPE_FIRST:I = 0x0

.field private static final VIEW_TYPE_LAST:I = 0x1

.field private static final VIEW_TYPE_MAX:I = 0x3

.field private static final VIEW_TYPE_MIDDLE:I = 0x2


# instance fields
.field private final mChoices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/view/LayoutInflater;)V
    .locals 0
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/view/LayoutInflater;",
            ")V"
        }
    .end annotation

    .prologue
    .line 339
    .local p1, "choices":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mChoices:Ljava/util/List;

    .line 341
    iput-object p2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 342
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 421
    const/4 v0, 0x1

    return v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mChoices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->getItem(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Ljava/lang/String;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 351
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mChoices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 356
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 361
    if-nez p1, :cond_0

    .line 362
    const/4 v0, 0x0

    .line 367
    :goto_0
    return v0

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mChoices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 365
    const/4 v0, 0x1

    goto :goto_0

    .line 367
    :cond_1
    const/4 v0, 0x2

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 372
    const/4 v2, -0x1

    .line 373
    .local v2, "viewId":I
    if-nez p2, :cond_0

    .line 374
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->getItemViewType(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 385
    :goto_0
    iget-object v3, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mInflater:Landroid/view/LayoutInflater;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 388
    :cond_0
    sget v3, Lcom/mixpanel/android/R$id;->com_mixpanel_android_multiple_choice_answer_text:I

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 389
    .local v1, "choiceText":Landroid/widget/TextView;
    iget-object v3, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mChoices:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 390
    .local v0, "choice":Ljava/lang/String;
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    return-object p2

    .line 376
    .end local v0    # "choice":Ljava/lang/String;
    .end local v1    # "choiceText":Landroid/widget/TextView;
    :pswitch_0
    sget v2, Lcom/mixpanel/android/R$layout;->com_mixpanel_android_first_choice_answer:I

    .line 377
    goto :goto_0

    .line 379
    :pswitch_1
    sget v2, Lcom/mixpanel/android/R$layout;->com_mixpanel_android_last_choice_answer:I

    .line 380
    goto :goto_0

    .line 382
    :pswitch_2
    sget v2, Lcom/mixpanel/android/R$layout;->com_mixpanel_android_middle_choice_answer:I

    goto :goto_0

    .line 374
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 396
    const/4 v0, 0x3

    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 401
    const/4 v0, 0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 406
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;->mChoices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public isEnabled(I)Z
    .locals 1
    .param p1, "arg0"    # I

    .prologue
    .line 426
    const/4 v0, 0x1

    return v0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0
    .param p1, "observer"    # Landroid/database/DataSetObserver;

    .prologue
    .line 412
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0
    .param p1, "observer"    # Landroid/database/DataSetObserver;

    .prologue
    .line 417
    return-void
.end method
