.class Lcom/urbanairship/actions/LandingPageActivity$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "LandingPageActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/actions/LandingPageActivity;->crossFade(Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/actions/LandingPageActivity;

.field final synthetic val$out:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/urbanairship/actions/LandingPageActivity;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 347
    iput-object p1, p0, Lcom/urbanairship/actions/LandingPageActivity$2;->this$0:Lcom/urbanairship/actions/LandingPageActivity;

    iput-object p2, p0, Lcom/urbanairship/actions/LandingPageActivity$2;->val$out:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 350
    iget-object v0, p0, Lcom/urbanairship/actions/LandingPageActivity$2;->val$out:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 351
    return-void
.end method
