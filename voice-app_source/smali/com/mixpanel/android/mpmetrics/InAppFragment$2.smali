.class Lcom/mixpanel/android/mpmetrics/InAppFragment$2;
.super Ljava/lang/Object;
.source "InAppFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/InAppFragment;->onAttach(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/mpmetrics/InAppFragment$2;)Lcom/mixpanel/android/mpmetrics/InAppFragment;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    const-wide/16 v10, 0xc8

    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 73
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mInAppView:Landroid/view/View;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$1(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 74
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mInAppView:Landroid/view/View;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$1(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mDisplayState:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$2(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->getHighlightColor()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 75
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mInAppView:Landroid/view/View;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$1(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/view/View;

    move-result-object v3

    new-instance v4, Lcom/mixpanel/android/mpmetrics/InAppFragment$2$1;

    invoke-direct {v4, p0}, Lcom/mixpanel/android/mpmetrics/InAppFragment$2$1;-><init>(Lcom/mixpanel/android/mpmetrics/InAppFragment$2;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 82
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mInAppView:Landroid/view/View;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$1(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/view/View;

    move-result-object v3

    sget v4, Lcom/mixpanel/android/R$id;->com_mixpanel_android_notification_image:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    .line 84
    .local v8, "notifImage":Landroid/widget/ImageView;
    const/4 v3, 0x1

    const/high16 v4, 0x42960000    # 75.0f

    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mParent:Landroid/app/Activity;
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$4(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v3, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v7

    .line 85
    .local v7, "heightPx":F
    new-instance v9, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v9, v1, v1, v7, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 86
    .local v9, "translate":Landroid/view/animation/TranslateAnimation;
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v9, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 87
    invoke-virtual {v9, v10, v11}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 88
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # getter for: Lcom/mixpanel/android/mpmetrics/InAppFragment;->mInAppView:Landroid/view/View;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$1(Lcom/mixpanel/android/mpmetrics/InAppFragment;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 90
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    div-float v5, v7, v6

    div-float v6, v7, v6

    move v3, v1

    move v4, v2

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 91
    .local v0, "scale":Landroid/view/animation/ScaleAnimation;
    new-instance v1, Lcom/mixpanel/android/mpmetrics/InAppFragment$SineBounceInterpolator;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$2;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    invoke-direct {v1, v2}, Lcom/mixpanel/android/mpmetrics/InAppFragment$SineBounceInterpolator;-><init>(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 92
    const-wide/16 v2, 0x190

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 93
    invoke-virtual {v0, v10, v11}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 94
    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 95
    return-void
.end method
