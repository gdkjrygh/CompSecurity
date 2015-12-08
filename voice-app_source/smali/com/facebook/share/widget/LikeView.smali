.class public Lcom/facebook/share/widget/LikeView;
.super Landroid/widget/FrameLayout;
.source "LikeView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;,
        Lcom/facebook/share/widget/LikeView$HorizontalAlignment;,
        Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;,
        Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;,
        Lcom/facebook/share/widget/LikeView$ObjectType;,
        Lcom/facebook/share/widget/LikeView$OnErrorListener;,
        Lcom/facebook/share/widget/LikeView$Style;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$facebook$share$widget$LikeView$AuxiliaryViewPosition:[I = null

.field private static final NO_FOREGROUND_COLOR:I = -0x1


# instance fields
.field private auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

.field private broadcastReceiver:Landroid/content/BroadcastReceiver;

.field private containerView:Landroid/widget/LinearLayout;

.field private creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

.field private edgePadding:I

.field private explicitlyDisabled:Z

.field private foregroundColor:I

.field private horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

.field private internalPadding:I

.field private likeActionController:Lcom/facebook/share/internal/LikeActionController;

.field private likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

.field private likeButton:Lcom/facebook/share/internal/LikeButton;

.field private likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

.field private objectId:Ljava/lang/String;

.field private objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

.field private onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;

.field private parentFragment:Landroid/support/v4/app/Fragment;

.field private socialSentenceView:Landroid/widget/TextView;


# direct methods
.method static synthetic $SWITCH_TABLE$com$facebook$share$widget$LikeView$AuxiliaryViewPosition()[I
    .locals 3

    .prologue
    .line 52
    sget-object v0, Lcom/facebook/share/widget/LikeView;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$AuxiliaryViewPosition:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->values()[Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->BOTTOM:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_1
    :try_start_1
    sget-object v1, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->INLINE:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    :try_start_2
    sget-object v1, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->TOP:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    sput-object v0, Lcom/facebook/share/widget/LikeView;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$AuxiliaryViewPosition:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 300
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 282
    sget-object v0, Lcom/facebook/share/widget/LikeView$Style;->DEFAULT:Lcom/facebook/share/widget/LikeView$Style;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    .line 283
    sget-object v0, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->DEFAULT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    .line 284
    sget-object v0, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->DEFAULT:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    .line 285
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    .line 301
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView;->initialize(Landroid/content/Context;)V

    .line 302
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 311
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 282
    sget-object v0, Lcom/facebook/share/widget/LikeView$Style;->DEFAULT:Lcom/facebook/share/widget/LikeView$Style;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    .line 283
    sget-object v0, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->DEFAULT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    .line 284
    sget-object v0, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->DEFAULT:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    .line 285
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    .line 312
    invoke-direct {p0, p2}, Lcom/facebook/share/widget/LikeView;->parseAttributes(Landroid/util/AttributeSet;)V

    .line 313
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView;->initialize(Landroid/content/Context;)V

    .line 314
    return-void
.end method

.method static synthetic access$0(Lcom/facebook/share/widget/LikeView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    .prologue
    .line 654
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V

    return-void
.end method

.method static synthetic access$2(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$OnErrorListener;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;

    return-object v0
.end method

.method static synthetic access$3(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$ObjectType;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/share/widget/LikeView;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V
    .locals 0

    .prologue
    .line 598
    invoke-direct {p0, p1, p2}, Lcom/facebook/share/widget/LikeView;->setObjectIdAndTypeForced(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    return-void
.end method

.method static synthetic access$5(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 617
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView;->associateWithLikeActionController(Lcom/facebook/share/internal/LikeActionController;)V

    return-void
.end method

.method static synthetic access$6(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;)V
    .locals 0

    .prologue
    .line 280
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    return-void
.end method

.method static synthetic access$7(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    .prologue
    .line 553
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->toggleLike()V

    return-void
.end method

.method private associateWithLikeActionController(Lcom/facebook/share/internal/LikeActionController;)V
    .locals 4
    .param p1, "likeActionController"    # Lcom/facebook/share/internal/LikeActionController;

    .prologue
    .line 618
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    .line 620
    new-instance v2, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;-><init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$LikeControllerBroadcastReceiver;)V

    iput-object v2, p0, Lcom/facebook/share/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 622
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 625
    .local v1, "localBroadcastManager":Landroid/support/v4/content/LocalBroadcastManager;
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 626
    .local v0, "filter":Landroid/content/IntentFilter;
    const-string v2, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 627
    const-string v2, "com.facebook.sdk.LikeActionController.DID_ERROR"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 628
    const-string v2, "com.facebook.sdk.LikeActionController.DID_RESET"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 630
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 631
    return-void
.end method

.method private getActivity()Landroid/app/Activity;
    .locals 3

    .prologue
    .line 568
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 569
    .local v0, "context":Landroid/content/Context;
    :goto_0
    instance-of v1, v0, Landroid/app/Activity;

    if-nez v1, :cond_0

    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-nez v1, :cond_1

    .line 573
    :cond_0
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 574
    check-cast v0, Landroid/app/Activity;

    .end local v0    # "context":Landroid/content/Context;
    return-object v0

    .line 570
    .restart local v0    # "context":Landroid/content/Context;
    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    .end local v0    # "context":Landroid/content/Context;
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .restart local v0    # "context":Landroid/content/Context;
    goto :goto_0

    .line 576
    :cond_2
    new-instance v1, Lcom/facebook/FacebookException;

    const-string v2, "Unable to get Activity."

    invoke-direct {v1, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private getAnalyticsParameters()Landroid/os/Bundle;
    .locals 4

    .prologue
    .line 580
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 581
    .local v0, "params":Landroid/os/Bundle;
    const-string v1, "style"

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    invoke-virtual {v2}, Lcom/facebook/share/widget/LikeView$Style;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    const-string v1, "auxiliary_position"

    .line 584
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    invoke-virtual {v2}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->toString()Ljava/lang/String;

    move-result-object v2

    .line 582
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 586
    const-string v1, "horizontal_alignment"

    .line 587
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    invoke-virtual {v2}, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->toString()Ljava/lang/String;

    move-result-object v2

    .line 585
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    const-string v1, "object_id"

    .line 590
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 588
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    const-string v1, "object_type"

    .line 593
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {v2}, Lcom/facebook/share/widget/LikeView$ObjectType;->toString()Ljava/lang/String;

    move-result-object v2

    .line 591
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    return-object v0
.end method

.method private initialize(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, -0x2

    .line 483
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/R$dimen;->com_facebook_likeview_edge_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    .line 484
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/R$dimen;->com_facebook_likeview_internal_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/share/widget/LikeView;->internalPadding:I

    .line 485
    iget v1, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 486
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/R$color;->com_facebook_likeview_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    .line 489
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/facebook/share/widget/LikeView;->setBackgroundColor(I)V

    .line 491
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    .line 492
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 495
    .local v0, "containerViewLayoutParams":Landroid/widget/FrameLayout$LayoutParams;
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 497
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView;->initializeLikeButton(Landroid/content/Context;)V

    .line 498
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView;->initializeSocialSentenceView(Landroid/content/Context;)V

    .line 499
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView;->initializeLikeCountView(Landroid/content/Context;)V

    .line 501
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 502
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 503
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 505
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1}, Lcom/facebook/share/widget/LikeView;->addView(Landroid/view/View;)V

    .line 507
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-direct {p0, v1, v2}, Lcom/facebook/share/widget/LikeView;->setObjectIdAndTypeForced(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    .line 508
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V

    .line 509
    return-void
.end method

.method private initializeLikeButton(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, -0x2

    .line 512
    new-instance v2, Lcom/facebook/share/internal/LikeButton;

    .line 514
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v1}, Lcom/facebook/share/internal/LikeActionController;->isObjectLiked()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    invoke-direct {v2, p1, v1}, Lcom/facebook/share/internal/LikeButton;-><init>(Landroid/content/Context;Z)V

    .line 512
    iput-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    .line 515
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    new-instance v2, Lcom/facebook/share/widget/LikeView$1;

    invoke-direct {v2, p0}, Lcom/facebook/share/widget/LikeView$1;-><init>(Lcom/facebook/share/widget/LikeView;)V

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/LikeButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 522
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 526
    .local v0, "buttonLayout":Landroid/widget/LinearLayout$LayoutParams;
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1, v0}, Lcom/facebook/share/internal/LikeButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 527
    return-void

    .line 514
    .end local v0    # "buttonLayout":Landroid/widget/LinearLayout$LayoutParams;
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private initializeLikeCountView(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, -0x1

    .line 545
    new-instance v1, Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-direct {v1, p1}, Lcom/facebook/share/internal/LikeBoxCountView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    .line 547
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 550
    .local v0, "likeCountViewLayout":Landroid/widget/LinearLayout$LayoutParams;
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v1, v0}, Lcom/facebook/share/internal/LikeBoxCountView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 551
    return-void
.end method

.method private initializeSocialSentenceView(Landroid/content/Context;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 530
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    .line 531
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    .line 532
    const/4 v2, 0x0

    .line 533
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/R$dimen;->com_facebook_likeview_text_size:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    .line 531
    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 534
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 535
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    iget v2, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 536
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    const/16 v2, 0x11

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 538
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 539
    const/4 v1, -0x2

    .line 540
    const/4 v2, -0x1

    .line 538
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 541
    .local v0, "socialSentenceViewLayout":Landroid/widget/LinearLayout$LayoutParams;
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 542
    return-void
.end method

.method private parseAttributes(Landroid/util/AttributeSet;)V
    .locals 3
    .param p1, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 436
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    .line 478
    :cond_0
    :goto_0
    return-void

    .line 440
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 441
    sget-object v2, Lcom/facebook/R$styleable;->com_facebook_like_view:[I

    .line 440
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 442
    .local v0, "a":Landroid/content/res/TypedArray;
    if-eqz v0, :cond_0

    .line 447
    sget v1, Lcom/facebook/R$styleable;->com_facebook_like_view_com_facebook_object_id:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 446
    invoke-static {v1, v2}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;

    .line 449
    sget v1, Lcom/facebook/R$styleable;->com_facebook_like_view_com_facebook_object_type:I

    .line 450
    sget-object v2, Lcom/facebook/share/widget/LikeView$ObjectType;->DEFAULT:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {v2}, Lcom/facebook/share/widget/LikeView$ObjectType;->getValue()I

    move-result v2

    .line 449
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 448
    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$ObjectType;->fromInt(I)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    .line 452
    sget v1, Lcom/facebook/R$styleable;->com_facebook_like_view_com_facebook_style:I

    .line 453
    sget-object v2, Lcom/facebook/share/widget/LikeView$Style;->DEFAULT:Lcom/facebook/share/widget/LikeView$Style;

    # invokes: Lcom/facebook/share/widget/LikeView$Style;->getValue()I
    invoke-static {v2}, Lcom/facebook/share/widget/LikeView$Style;->access$2(Lcom/facebook/share/widget/LikeView$Style;)I

    move-result v2

    .line 452
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 451
    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$Style;->fromInt(I)Lcom/facebook/share/widget/LikeView$Style;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    .line 454
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    if-nez v1, :cond_2

    .line 455
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported value for LikeView \'style\'"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 459
    :cond_2
    sget v1, Lcom/facebook/R$styleable;->com_facebook_like_view_com_facebook_auxiliary_view_position:I

    .line 460
    sget-object v2, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->DEFAULT:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    # invokes: Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->getValue()I
    invoke-static {v2}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->access$2(Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;)I

    move-result v2

    .line 459
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 458
    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->fromInt(I)Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    .line 461
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    if-nez v1, :cond_3

    .line 462
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 463
    const-string v2, "Unsupported value for LikeView \'auxiliary_view_position\'"

    .line 462
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 467
    :cond_3
    sget v1, Lcom/facebook/R$styleable;->com_facebook_like_view_com_facebook_horizontal_alignment:I

    .line 468
    sget-object v2, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->DEFAULT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    # invokes: Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->getValue()I
    invoke-static {v2}, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->access$2(Lcom/facebook/share/widget/LikeView$HorizontalAlignment;)I

    move-result v2

    .line 467
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 466
    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->fromInt(I)Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    .line 469
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-nez v1, :cond_4

    .line 470
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 471
    const-string v2, "Unsupported value for LikeView \'horizontal_alignment\'"

    .line 470
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 475
    :cond_4
    sget v1, Lcom/facebook/R$styleable;->com_facebook_like_view_com_facebook_foreground_color:I

    const/4 v2, -0x1

    .line 474
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    .line 477
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_0
.end method

.method private setObjectIdAndTypeForced(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V
    .locals 2
    .param p1, "newObjectId"    # Ljava/lang/String;
    .param p2, "newObjectType"    # Lcom/facebook/share/widget/LikeView$ObjectType;

    .prologue
    .line 599
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->tearDownObjectAssociations()V

    .line 601
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;

    .line 602
    iput-object p2, p0, Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    .line 604
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 615
    :cond_0
    :goto_0
    return-void

    .line 608
    :cond_1
    new-instance v0, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;-><init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    .line 609
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 613
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    .line 610
    invoke-static {p1, p2, v0}, Lcom/facebook/share/internal/LikeActionController;->getControllerForObjectId(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;Lcom/facebook/share/internal/LikeActionController$CreationCallback;)V

    goto :goto_0
.end method

.method private tearDownObjectAssociations()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 634
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_0

    .line 636
    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    .line 637
    .local v0, "localBroadcastManager":Landroid/support/v4/content/LocalBroadcastManager;
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 639
    iput-object v2, p0, Lcom/facebook/share/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 645
    .end local v0    # "localBroadcastManager":Landroid/support/v4/content/LocalBroadcastManager;
    :cond_0
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    if-eqz v1, :cond_1

    .line 646
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;->cancel()V

    .line 648
    iput-object v2, p0, Lcom/facebook/share/widget/LikeView;->creationCallback:Lcom/facebook/share/widget/LikeView$LikeActionControllerCreationCallback;

    .line 651
    :cond_1
    iput-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    .line 652
    return-void
.end method

.method private toggleLike()V
    .locals 4

    .prologue
    .line 554
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    if-eqz v1, :cond_1

    .line 555
    const/4 v0, 0x0

    .line 556
    .local v0, "activity":Landroid/app/Activity;
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->parentFragment:Landroid/support/v4/app/Fragment;

    if-nez v1, :cond_0

    .line 557
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 560
    :cond_0
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    .line 562
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->parentFragment:Landroid/support/v4/app/Fragment;

    .line 563
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->getAnalyticsParameters()Landroid/os/Bundle;

    move-result-object v3

    .line 560
    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/share/internal/LikeActionController;->toggleLike(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Landroid/os/Bundle;)V

    .line 565
    .end local v0    # "activity":Landroid/app/Activity;
    :cond_1
    return-void
.end method

.method private updateBoxCountCaretPosition()V
    .locals 3

    .prologue
    .line 748
    invoke-static {}, Lcom/facebook/share/widget/LikeView;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$AuxiliaryViewPosition()[I

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 764
    :goto_0
    return-void

    .line 750
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    .line 751
    sget-object v1, Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->BOTTOM:Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    .line 750
    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V

    goto :goto_0

    .line 754
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    .line 755
    sget-object v1, Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->TOP:Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    .line 754
    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V

    goto :goto_0

    .line 758
    :pswitch_2
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    .line 759
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    sget-object v2, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->RIGHT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-ne v0, v2, :cond_0

    .line 760
    sget-object v0, Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->RIGHT:Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    .line 758
    :goto_1
    invoke-virtual {v1, v0}, Lcom/facebook/share/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V

    goto :goto_0

    .line 761
    :cond_0
    sget-object v0, Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->LEFT:Lcom/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;

    goto :goto_1

    .line 748
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private updateLayout()V
    .locals 10

    .prologue
    const/16 v9, 0x8

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 677
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    invoke-virtual {v7}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 679
    .local v3, "containerViewLayoutParams":Landroid/widget/FrameLayout$LayoutParams;
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v7}, Lcom/facebook/share/internal/LikeButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 681
    .local v2, "buttonLayoutParams":Landroid/widget/LinearLayout$LayoutParams;
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    sget-object v8, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->LEFT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-ne v7, v8, :cond_3

    const/4 v4, 0x3

    .line 685
    .local v4, "viewGravity":I
    :goto_0
    or-int/lit8 v7, v4, 0x30

    iput v7, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 686
    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 689
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 690
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v7, v9}, Lcom/facebook/share/internal/LikeBoxCountView;->setVisibility(I)V

    .line 693
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    sget-object v8, Lcom/facebook/share/widget/LikeView$Style;->STANDARD:Lcom/facebook/share/widget/LikeView$Style;

    if-ne v7, v8, :cond_5

    .line 694
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    if-eqz v7, :cond_5

    .line 695
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v7}, Lcom/facebook/share/internal/LikeActionController;->getSocialSentence()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 696
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    .line 706
    .local v0, "auxView":Landroid/view/View;
    :goto_1
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 710
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 711
    .local v1, "auxViewLayoutParams":Landroid/widget/LinearLayout$LayoutParams;
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 713
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    .line 714
    iget-object v8, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    sget-object v9, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->INLINE:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    if-ne v8, v9, :cond_0

    move v5, v6

    .line 713
    :cond_0
    invoke-virtual {v7, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 718
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    sget-object v6, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->TOP:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    if-eq v5, v6, :cond_1

    .line 719
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    sget-object v6, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->INLINE:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    if-ne v5, v6, :cond_6

    .line 720
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    sget-object v6, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->RIGHT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-ne v5, v6, :cond_6

    .line 722
    :cond_1
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    iget-object v6, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 723
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    iget-object v6, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 730
    :goto_2
    invoke-static {}, Lcom/facebook/share/widget/LikeView;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$AuxiliaryViewPosition()[I

    move-result-object v5

    iget-object v6, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    invoke-virtual {v6}, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 745
    .end local v0    # "auxView":Landroid/view/View;
    .end local v1    # "auxViewLayoutParams":Landroid/widget/LinearLayout$LayoutParams;
    :cond_2
    :goto_3
    return-void

    .line 682
    .end local v4    # "viewGravity":I
    :cond_3
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    sget-object v8, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->CENTER:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-ne v7, v8, :cond_4

    move v4, v5

    .line 683
    goto :goto_0

    :cond_4
    const/4 v4, 0x5

    goto :goto_0

    .line 697
    .restart local v4    # "viewGravity":I
    :cond_5
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    sget-object v8, Lcom/facebook/share/widget/LikeView$Style;->BOX_COUNT:Lcom/facebook/share/widget/LikeView$Style;

    if-ne v7, v8, :cond_2

    .line 698
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    if-eqz v7, :cond_2

    .line 699
    iget-object v7, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v7}, Lcom/facebook/share/internal/LikeActionController;->getLikeCountString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 700
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateBoxCountCaretPosition()V

    .line 701
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    .line 702
    .restart local v0    # "auxView":Landroid/view/View;
    goto :goto_1

    .line 726
    .restart local v1    # "auxViewLayoutParams":Landroid/widget/LinearLayout$LayoutParams;
    :cond_6
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 727
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->containerView:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    .line 732
    :pswitch_0
    iget v5, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v6, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v7, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v8, p0, Lcom/facebook/share/widget/LikeView;->internalPadding:I

    invoke-virtual {v0, v5, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_3

    .line 735
    :pswitch_1
    iget v5, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v6, p0, Lcom/facebook/share/widget/LikeView;->internalPadding:I

    iget v7, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v8, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    invoke-virtual {v0, v5, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_3

    .line 738
    :pswitch_2
    iget-object v5, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    sget-object v6, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->RIGHT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-ne v5, v6, :cond_7

    .line 739
    iget v5, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v6, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v7, p0, Lcom/facebook/share/widget/LikeView;->internalPadding:I

    iget v8, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    invoke-virtual {v0, v5, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_3

    .line 741
    :cond_7
    iget v5, p0, Lcom/facebook/share/widget/LikeView;->internalPadding:I

    iget v6, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v7, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    iget v8, p0, Lcom/facebook/share/widget/LikeView;->edgePadding:I

    invoke-virtual {v0, v5, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_3

    .line 730
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private updateLikeStateAndLayout()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 655
    iget-boolean v2, p0, Lcom/facebook/share/widget/LikeView;->explicitlyDisabled:Z

    if-eqz v2, :cond_0

    move v0, v1

    .line 657
    .local v0, "enabled":Z
    :goto_0
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    if-nez v2, :cond_1

    .line 658
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v2, v1}, Lcom/facebook/share/internal/LikeButton;->setSelected(Z)V

    .line 659
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 660
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v1, v3}, Lcom/facebook/share/internal/LikeBoxCountView;->setText(Ljava/lang/String;)V

    .line 669
    :goto_1
    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 670
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1, v0}, Lcom/facebook/share/internal/LikeButton;->setEnabled(Z)V

    .line 672
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLayout()V

    .line 673
    return-void

    .line 655
    .end local v0    # "enabled":Z
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 662
    .restart local v0    # "enabled":Z
    :cond_1
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeButton:Lcom/facebook/share/internal/LikeButton;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v2}, Lcom/facebook/share/internal/LikeActionController;->isObjectLiked()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/LikeButton;->setSelected(Z)V

    .line 663
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v2}, Lcom/facebook/share/internal/LikeActionController;->getSocialSentence()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 664
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeBoxCountView:Lcom/facebook/share/internal/LikeBoxCountView;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v2}, Lcom/facebook/share/internal/LikeActionController;->getLikeCountString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/LikeBoxCountView;->setText(Ljava/lang/String;)V

    .line 666
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->likeActionController:Lcom/facebook/share/internal/LikeActionController;

    invoke-virtual {v1}, Lcom/facebook/share/internal/LikeActionController;->shouldEnableView()Z

    move-result v1

    and-int/2addr v0, v1

    goto :goto_1
.end method


# virtual methods
.method public getOnErrorListener()Lcom/facebook/share/widget/LikeView$OnErrorListener;
    .locals 1

    .prologue
    .line 405
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 430
    const/4 v0, 0x0

    sget-object v1, Lcom/facebook/share/widget/LikeView$ObjectType;->UNKNOWN:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/share/widget/LikeView;->setObjectIdAndType(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    .line 432
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 433
    return-void
.end method

.method public setAuxiliaryViewPosition(Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;)V
    .locals 1
    .param p1, "auxiliaryViewPosition"    # Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    .prologue
    .line 353
    if-eqz p1, :cond_1

    .line 355
    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    if-eq v0, p1, :cond_0

    .line 356
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    .line 358
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLayout()V

    .line 360
    :cond_0
    return-void

    .line 354
    :cond_1
    sget-object p1, Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;->DEFAULT:Lcom/facebook/share/widget/LikeView$AuxiliaryViewPosition;

    goto :goto_0
.end method

.method public setEnabled(Z)V
    .locals 1
    .param p1, "enabled"    # Z

    .prologue
    .line 422
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/share/widget/LikeView;->explicitlyDisabled:Z

    .line 424
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V

    .line 425
    return-void

    .line 422
    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public setForegroundColor(I)V
    .locals 1
    .param p1, "foregroundColor"    # I

    .prologue
    .line 384
    iget v0, p0, Lcom/facebook/share/widget/LikeView;->foregroundColor:I

    if-eq v0, p1, :cond_0

    .line 385
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 387
    :cond_0
    return-void
.end method

.method public setFragment(Landroid/support/v4/app/Fragment;)V
    .locals 0
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 417
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->parentFragment:Landroid/support/v4/app/Fragment;

    .line 418
    return-void
.end method

.method public setHorizontalAlignment(Lcom/facebook/share/widget/LikeView$HorizontalAlignment;)V
    .locals 1
    .param p1, "horizontalAlignment"    # Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    .prologue
    .line 368
    if-eqz p1, :cond_1

    .line 370
    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    if-eq v0, p1, :cond_0

    .line 371
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->horizontalAlignment:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    .line 373
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLayout()V

    .line 375
    :cond_0
    return-void

    .line 369
    :cond_1
    sget-object p1, Lcom/facebook/share/widget/LikeView$HorizontalAlignment;->DEFAULT:Lcom/facebook/share/widget/LikeView$HorizontalAlignment;

    goto :goto_0
.end method

.method public setLikeViewStyle(Lcom/facebook/share/widget/LikeView$Style;)V
    .locals 1
    .param p1, "likeViewStyle"    # Lcom/facebook/share/widget/LikeView$Style;

    .prologue
    .line 338
    if-eqz p1, :cond_1

    .line 339
    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    if-eq v0, p1, :cond_0

    .line 340
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->likeViewStyle:Lcom/facebook/share/widget/LikeView$Style;

    .line 342
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLayout()V

    .line 344
    :cond_0
    return-void

    .line 338
    :cond_1
    sget-object p1, Lcom/facebook/share/widget/LikeView$Style;->DEFAULT:Lcom/facebook/share/widget/LikeView$Style;

    goto :goto_0
.end method

.method public setObjectIdAndType(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V
    .locals 1
    .param p1, "objectId"    # Ljava/lang/String;
    .param p2, "objectType"    # Lcom/facebook/share/widget/LikeView$ObjectType;

    .prologue
    .line 321
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 322
    if-eqz p2, :cond_2

    .line 324
    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->objectId:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    if-eq p2, v0, :cond_1

    .line 325
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/share/widget/LikeView;->setObjectIdAndTypeForced(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    .line 327
    invoke-direct {p0}, Lcom/facebook/share/widget/LikeView;->updateLikeStateAndLayout()V

    .line 329
    :cond_1
    return-void

    .line 322
    :cond_2
    sget-object p2, Lcom/facebook/share/widget/LikeView$ObjectType;->DEFAULT:Lcom/facebook/share/widget/LikeView$ObjectType;

    goto :goto_0
.end method

.method public setOnErrorListener(Lcom/facebook/share/widget/LikeView$OnErrorListener;)V
    .locals 0
    .param p1, "onErrorListener"    # Lcom/facebook/share/widget/LikeView$OnErrorListener;

    .prologue
    .line 396
    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->onErrorListener:Lcom/facebook/share/widget/LikeView$OnErrorListener;

    .line 397
    return-void
.end method
