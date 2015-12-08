.class public Lcom/mixpanel/android/surveys/FadeOnPressButton;
.super Landroid/widget/Button;
.source "FadeOnPressButton.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field private mIsFaded:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 21
    invoke-direct {p0, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    return-void
.end method

.method private setAlphaBySDK(F)V
    .locals 0
    .param p1, "alpha"    # F

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/surveys/FadeOnPressButton;->setAlpha(F)V

    .line 52
    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 6

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadeOnPressButton;->getDrawableState()[I

    move-result-object v2

    .line 35
    .local v2, "state":[I
    const/4 v1, 0x0

    .line 36
    .local v1, "isPressed":Z
    array-length v4, v2

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v4, :cond_1

    .line 43
    :goto_1
    iget-boolean v3, p0, Lcom/mixpanel/android/surveys/FadeOnPressButton;->mIsFaded:Z

    if-eqz v3, :cond_0

    if-nez v1, :cond_0

    .line 44
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {p0, v3}, Lcom/mixpanel/android/surveys/FadeOnPressButton;->setAlphaBySDK(F)V

    .line 45
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/mixpanel/android/surveys/FadeOnPressButton;->mIsFaded:Z

    .line 47
    :cond_0
    invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V

    .line 48
    return-void

    .line 36
    :cond_1
    aget v0, v2, v3

    .line 37
    .local v0, "i":I
    const v5, 0x10100a7

    if-ne v0, v5, :cond_3

    .line 38
    iget-boolean v3, p0, Lcom/mixpanel/android/surveys/FadeOnPressButton;->mIsFaded:Z

    if-nez v3, :cond_2

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-direct {p0, v3}, Lcom/mixpanel/android/surveys/FadeOnPressButton;->setAlphaBySDK(F)V

    .line 39
    :cond_2
    const/4 v1, 0x1

    .line 40
    goto :goto_1

    .line 36
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method
