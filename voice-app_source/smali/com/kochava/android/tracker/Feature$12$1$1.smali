.class Lcom/kochava/android/tracker/Feature$12$1$1;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature$12$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/kochava/android/tracker/Feature$12$1;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature$12$1;)V
    .locals 0
    .param p1, "this$2"    # Lcom/kochava/android/tracker/Feature$12$1;

    .prologue
    .line 2970
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 14
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "NewApi"
        }
    .end annotation

    .prologue
    .line 2980
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v8

    float-to-int v4, v8

    .line 2981
    .local v4, "x":I
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v8

    float-to-int v6, v8

    .line 2984
    .local v6, "y":I
    const/4 v8, 0x2

    new-array v3, v8, [I

    .line 2985
    .local v3, "viewCoords":[I
    invoke-virtual {p1, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 2988
    const/4 v8, 0x0

    aget v8, v3, v8

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int v5, v8, v9

    .line 2989
    .local v5, "xCoordBottom":I
    const/4 v8, 0x1

    aget v8, v3, v8

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v9

    add-int v7, v8, v9

    .line 2992
    .local v7, "yCoordBottom":I
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_0

    const/4 v8, 0x0

    aget v8, v3, v8

    if-le v4, v8, :cond_0

    if-ge v4, v5, :cond_0

    const/4 v8, 0x1

    aget v8, v3, v8

    if-le v6, v8, :cond_0

    if-ge v6, v7, :cond_0

    .line 3000
    new-instance v1, Landroid/content/Intent;

    iget-object v8, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    const-class v9, Lcom/kochava/android/tracker/WebAdView;

    invoke-direct {v1, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3001
    .local v1, "intent":Landroid/content/Intent;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 3002
    .local v0, "b":Landroid/os/Bundle;
    const-string v8, "URL"

    iget-object v9, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v9, v9, Lcom/kochava/android/tracker/Feature$12$1;->val$clickUrl:Ljava/lang/String;

    invoke-virtual {v0, v8, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 3003
    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 3005
    iget-object v8, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v8, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 3006
    iget-object v8, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v8}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const-string v9, "slide_up"

    const-string v10, "anim"

    iget-object v11, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v11, v11, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v11, v11, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v11}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v9, v10, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 3007
    .local v2, "test":I
    if-eqz v2, :cond_1

    .line 3008
    iget-object v8, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    iget-object v9, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v9, v9, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v9, v9, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v9}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const-string v10, "slide_up"

    const-string v11, "anim"

    iget-object v12, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v12, v12, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v12, v12, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v12}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v10, v11, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    iget-object v10, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v10, v10, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v10, v10, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const-string v11, "stay"

    const-string v12, "anim"

    iget-object v13, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v13, v13, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v13, v13, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    invoke-virtual {v13}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v11, v12, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v8, v9, v10}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 3017
    .end local v0    # "b":Landroid/os/Bundle;
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "test":I
    :cond_0
    :goto_0
    const/4 v8, 0x1

    return v8

    .line 3010
    .restart local v0    # "b":Landroid/os/Bundle;
    .restart local v1    # "intent":Landroid/content/Intent;
    .restart local v2    # "test":I
    :cond_1
    iget-object v8, p0, Lcom/kochava/android/tracker/Feature$12$1$1;->this$2:Lcom/kochava/android/tracker/Feature$12$1;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v8, v8, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    const v9, 0x10a0002

    const v10, 0x10a0001

    invoke-virtual {v8, v9, v10}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0
.end method
