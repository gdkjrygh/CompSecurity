.class public Lcom/mixpanel/android/surveys/CardCarouselLayout;
.super Landroid/view/ViewGroup;
.source "CardCarouselLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/surveys/CardCarouselLayout$ChoiceAdapter;,
        Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;,
        Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;,
        Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;,
        Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction:[I = null

.field private static final ANIMATION_DURATION_MILLIS:J = 0x14aL

.field private static final ANIMATION_ROTATION_MILLIS:J = 0xc6L

.field private static EXIT_ANGLE:I

.field private static EXIT_ROTATION_CENTER_X:F

.field private static EXIT_ROTATION_CENTER_Y:F

.field private static EXIT_SIZE:F


# instance fields
.field private mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

.field private mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

.field private final mMatchParentChildren:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;


# direct methods
.method static synthetic $SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction()[I
    .locals 3

    .prologue
    .line 39
    sget-object v0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->$SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;->values()[Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;->BACKWARD:Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;

    invoke-virtual {v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    :try_start_1
    sget-object v1, Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;->FORWARD:Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;

    invoke-virtual {v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    sput-object v0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->$SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/high16 v1, 0x3f000000    # 0.5f

    .line 217
    const/16 v0, 0x2d

    sput v0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ANGLE:I

    .line 218
    const v0, 0x3f4ccccd    # 0.8f

    sput v0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    .line 219
    sput v1, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 220
    sput v1, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 541
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 57
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 535
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mMatchParentChildren:Ljava/util/List;

    .line 538
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    .line 58
    invoke-direct {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->initCards(Landroid/content/Context;)V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 535
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mMatchParentChildren:Ljava/util/List;

    .line 538
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    .line 63
    invoke-direct {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->initCards(Landroid/content/Context;)V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 535
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mMatchParentChildren:Ljava/util/List;

    .line 538
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    .line 68
    invoke-direct {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->initCards(Landroid/content/Context;)V

    .line 69
    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/surveys/CardCarouselLayout;)Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;
    .locals 1

    .prologue
    .line 538
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    return-object v0
.end method

.method private enterLeft()Landroid/view/animation/Animation;
    .locals 12

    .prologue
    .line 279
    new-instance v11, Landroid/view/animation/AnimationSet;

    const/4 v3, 0x0

    invoke-direct {v11, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 280
    .local v11, "set":Landroid/view/animation/AnimationSet;
    new-instance v0, Landroid/view/animation/RotateAnimation;

    sget v3, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ANGLE:I

    neg-int v3, v3

    int-to-float v1, v3

    const/4 v2, 0x0

    .line 281
    const/4 v3, 0x1

    sget v4, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 282
    const/4 v5, 0x1

    sget v6, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 280
    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 284
    .local v0, "rotateIn":Landroid/view/animation/RotateAnimation;
    const-wide/16 v4, 0xc6

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 285
    invoke-virtual {v11, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 287
    new-instance v1, Landroid/view/animation/ScaleAnimation;

    sget v2, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    const/high16 v3, 0x3f800000    # 1.0f

    sget v4, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    const/high16 v5, 0x3f800000    # 1.0f

    .line 288
    const/4 v6, 0x1

    sget v7, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 289
    const/4 v8, 0x1

    sget v9, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 287
    invoke-direct/range {v1 .. v9}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 291
    .local v1, "scaleUp":Landroid/view/animation/ScaleAnimation;
    const-wide/16 v4, 0xc6

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 292
    invoke-virtual {v11, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 294
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    .line 295
    const/4 v3, 0x2

    const v4, -0x4059999a    # -1.3f

    .line 296
    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 297
    const/4 v7, 0x2

    const/4 v8, 0x0

    .line 298
    const/4 v9, 0x2

    const/4 v10, 0x0

    .line 294
    invoke-direct/range {v2 .. v10}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 300
    .local v2, "slideX":Landroid/view/animation/TranslateAnimation;
    const-wide/16 v4, 0x14a

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 301
    invoke-virtual {v11, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 303
    return-object v11
.end method

.method private enterRight()Landroid/view/animation/Animation;
    .locals 12

    .prologue
    .line 222
    new-instance v11, Landroid/view/animation/AnimationSet;

    const/4 v3, 0x0

    invoke-direct {v11, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 223
    .local v11, "set":Landroid/view/animation/AnimationSet;
    new-instance v0, Landroid/view/animation/RotateAnimation;

    sget v3, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ANGLE:I

    int-to-float v1, v3

    const/4 v2, 0x0

    .line 224
    const/4 v3, 0x1

    sget v4, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 225
    const/4 v5, 0x1

    sget v6, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 223
    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 227
    .local v0, "rotateIn":Landroid/view/animation/RotateAnimation;
    const-wide/16 v4, 0xc6

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 228
    invoke-virtual {v11, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 230
    new-instance v1, Landroid/view/animation/ScaleAnimation;

    sget v2, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    const/high16 v3, 0x3f800000    # 1.0f

    sget v4, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    const/high16 v5, 0x3f800000    # 1.0f

    .line 231
    const/4 v6, 0x1

    sget v7, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 232
    const/4 v8, 0x1

    sget v9, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 230
    invoke-direct/range {v1 .. v9}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 234
    .local v1, "scaleUp":Landroid/view/animation/ScaleAnimation;
    const-wide/16 v4, 0xc6

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 235
    invoke-virtual {v11, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 237
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    .line 238
    const/4 v3, 0x2

    const v4, 0x3fa66666    # 1.3f

    .line 239
    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 240
    const/4 v7, 0x2

    const/4 v8, 0x0

    .line 241
    const/4 v9, 0x2

    const/4 v10, 0x0

    .line 237
    invoke-direct/range {v2 .. v10}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 243
    .local v2, "slideX":Landroid/view/animation/TranslateAnimation;
    const-wide/16 v4, 0x14a

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 244
    invoke-virtual {v11, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 245
    return-object v11
.end method

.method private exitLeft()Landroid/view/animation/Animation;
    .locals 12

    .prologue
    .line 307
    new-instance v11, Landroid/view/animation/AnimationSet;

    const/4 v3, 0x0

    invoke-direct {v11, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 308
    .local v11, "set":Landroid/view/animation/AnimationSet;
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    sget v3, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ANGLE:I

    neg-int v3, v3

    int-to-float v2, v3

    .line 309
    const/4 v3, 0x1

    sget v4, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 310
    const/4 v5, 0x1

    sget v6, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 308
    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 312
    .local v0, "rotateOut":Landroid/view/animation/RotateAnimation;
    const-wide/16 v4, 0x14a

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 313
    const-wide/16 v4, 0x84

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setStartOffset(J)V

    .line 314
    invoke-virtual {v11, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 316
    new-instance v1, Landroid/view/animation/ScaleAnimation;

    const/high16 v2, 0x3f800000    # 1.0f

    sget v3, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    const/high16 v4, 0x3f800000    # 1.0f

    sget v5, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    .line 317
    const/4 v6, 0x1

    sget v7, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 318
    const/4 v8, 0x1

    sget v9, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 316
    invoke-direct/range {v1 .. v9}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 320
    .local v1, "scaleDown":Landroid/view/animation/ScaleAnimation;
    const-wide/16 v4, 0x14a

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 321
    const-wide/16 v4, 0x84

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 322
    invoke-virtual {v11, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 324
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    .line 325
    const/4 v3, 0x2

    const/high16 v4, -0x40800000    # -1.0f

    .line 326
    const/4 v5, 0x2

    const v6, -0x3feccccd    # -2.3f

    .line 327
    const/4 v7, 0x2

    const/4 v8, 0x0

    .line 328
    const/4 v9, 0x2

    const/4 v10, 0x0

    .line 324
    invoke-direct/range {v2 .. v10}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 330
    .local v2, "slideX":Landroid/view/animation/TranslateAnimation;
    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 331
    const-wide/16 v4, 0x14a

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 332
    invoke-virtual {v11, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 334
    return-object v11
.end method

.method private exitRight()Landroid/view/animation/Animation;
    .locals 12

    .prologue
    .line 249
    new-instance v11, Landroid/view/animation/AnimationSet;

    const/4 v3, 0x0

    invoke-direct {v11, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 250
    .local v11, "set":Landroid/view/animation/AnimationSet;
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    sget v3, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ANGLE:I

    int-to-float v2, v3

    .line 251
    const/4 v3, 0x1

    sget v4, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 252
    const/4 v5, 0x1

    sget v6, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 250
    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 254
    .local v0, "rotateOut":Landroid/view/animation/RotateAnimation;
    const-wide/16 v4, 0xc6

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 255
    const-wide/16 v4, 0x84

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setStartOffset(J)V

    .line 256
    invoke-virtual {v11, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 258
    new-instance v1, Landroid/view/animation/ScaleAnimation;

    const/high16 v2, 0x3f800000    # 1.0f

    sget v3, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    const/high16 v4, 0x3f800000    # 1.0f

    sget v5, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_SIZE:F

    .line 259
    const/4 v6, 0x1

    sget v7, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_X:F

    .line 260
    const/4 v8, 0x1

    sget v9, Lcom/mixpanel/android/surveys/CardCarouselLayout;->EXIT_ROTATION_CENTER_Y:F

    .line 258
    invoke-direct/range {v1 .. v9}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 262
    .local v1, "scaleDown":Landroid/view/animation/ScaleAnimation;
    const-wide/16 v4, 0xc6

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 263
    const-wide/16 v4, 0x84

    invoke-virtual {v1, v4, v5}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 264
    invoke-virtual {v11, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 266
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    .line 267
    const/4 v3, 0x2

    const/high16 v4, -0x40800000    # -1.0f

    .line 268
    const/4 v5, 0x2

    const v6, 0x3e99999a    # 0.3f

    .line 269
    const/4 v7, 0x2

    const/4 v8, 0x0

    .line 270
    const/4 v9, 0x2

    const/4 v10, 0x0

    .line 266
    invoke-direct/range {v2 .. v10}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 272
    .local v2, "slideX":Landroid/view/animation/TranslateAnimation;
    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 273
    const-wide/16 v4, 0x14a

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 274
    invoke-virtual {v11, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 275
    return-object v11
.end method

.method private initCards(Landroid/content/Context;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v4, 0x0

    .line 208
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 209
    .local v0, "inflater":Landroid/view/LayoutInflater;
    sget v3, Lcom/mixpanel/android/R$layout;->com_mixpanel_android_question_card:I

    invoke-virtual {v0, v3, p0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 210
    .local v1, "v1":Landroid/view/View;
    new-instance v3, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-direct {v3, p0, v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;-><init>(Lcom/mixpanel/android/surveys/CardCarouselLayout;Landroid/view/View;)V

    iput-object v3, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    .line 211
    sget v3, Lcom/mixpanel/android/R$layout;->com_mixpanel_android_question_card:I

    invoke-virtual {v0, v3, p0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 212
    .local v2, "v2":Landroid/view/View;
    new-instance v3, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-direct {v3, p0, v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;-><init>(Lcom/mixpanel/android/surveys/CardCarouselLayout;Landroid/view/View;)V

    iput-object v3, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    .line 213
    invoke-virtual {p0, v1}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->addView(Landroid/view/View;)V

    .line 214
    invoke-virtual {p0, v2}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->addView(Landroid/view/View;)V

    .line 215
    return-void
.end method


# virtual methods
.method public moveTo(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;)V
    .locals 7
    .param p1, "question"    # Lcom/mixpanel/android/mpmetrics/Survey$Question;
    .param p2, "answerOrNull"    # Ljava/lang/String;
    .param p3, "direction"    # Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 82
    iget-object v2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    .line 83
    .local v2, "tmp":Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    iput-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    .line 84
    iput-object v2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    .line 85
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v5, p1, p2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->showQuestionOnCard(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V

    .line 86
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v5}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->getView()Landroid/view/View;

    move-result-object v3

    .line 87
    .local v3, "viewShowing":Landroid/view/View;
    iget-object v5, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v5}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->getView()Landroid/view/View;

    move-result-object v4

    .line 88
    .local v4, "viewToShow":Landroid/view/View;
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 89
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 91
    const/4 v1, 0x0

    .line 92
    .local v1, "exit":Landroid/view/animation/Animation;
    const/4 v0, 0x0

    .line 93
    .local v0, "entrance":Landroid/view/animation/Animation;
    invoke-static {}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->$SWITCH_TABLE$com$mixpanel$android$surveys$CardCarouselLayout$Direction()[I

    move-result-object v5

    invoke-virtual {p3}, Lcom/mixpanel/android/surveys/CardCarouselLayout$Direction;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 103
    :goto_0
    new-instance v5, Lcom/mixpanel/android/surveys/CardCarouselLayout$1;

    invoke-direct {v5, p0, v3}, Lcom/mixpanel/android/surveys/CardCarouselLayout$1;-><init>(Lcom/mixpanel/android/surveys/CardCarouselLayout;Landroid/view/View;)V

    invoke-virtual {v1, v5}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 113
    invoke-virtual {v3, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 114
    invoke-virtual {v4, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 115
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->invalidate()V

    .line 116
    return-void

    .line 95
    :pswitch_0
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->exitLeft()Landroid/view/animation/Animation;

    move-result-object v1

    .line 96
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->enterRight()Landroid/view/animation/Animation;

    move-result-object v0

    .line 97
    goto :goto_0

    .line 99
    :pswitch_1
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->exitRight()Landroid/view/animation/Animation;

    move-result-object v1

    .line 100
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->enterLeft()Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 93
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 9
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .prologue
    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 190
    iget-object v6, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v6}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->getView()Landroid/view/View;

    move-result-object v3

    .line 191
    .local v3, "visible":Landroid/view/View;
    const/4 v5, 0x0

    .line 192
    .local v5, "visibleWidth":I
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eq v6, v8, :cond_0

    .line 193
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 194
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    .line 195
    .local v4, "visibleHeight":I
    invoke-virtual {v3, v7, v7, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 197
    .end local v4    # "visibleHeight":I
    :cond_0
    iget-object v6, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v6}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->getView()Landroid/view/View;

    move-result-object v0

    .line 198
    .local v0, "backup":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eq v6, v8, :cond_1

    .line 199
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 200
    .local v2, "backupWidth":I
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 201
    .local v1, "backupHeight":I
    add-int v6, v5, v2

    invoke-virtual {v0, v5, v7, v6, v1}, Landroid/view/View;->layout(IIII)V

    .line 203
    .end local v1    # "backupHeight":I
    .end local v2    # "backupWidth":I
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 12
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 134
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getChildCount()I

    move-result v3

    .line 137
    .local v3, "count":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    if-ne v9, v10, :cond_0

    .line 138
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    if-ne v9, v10, :cond_0

    .line 136
    const/4 v8, 0x0

    .line 139
    .local v8, "measureMatchParentChildren":Z
    :goto_0
    iget-object v9, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mMatchParentChildren:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->clear()V

    .line 141
    const/4 v6, 0x0

    .line 142
    .local v6, "maxHeight":I
    const/4 v7, 0x0

    .line 144
    .local v7, "maxWidth":I
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    if-lt v4, v3, :cond_1

    .line 162
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getSuggestedMinimumHeight()I

    move-result v9

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 163
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getSuggestedMinimumWidth()I

    move-result v9

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 164
    invoke-static {v7, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->resolveSize(II)I

    move-result v9

    .line 165
    invoke-static {v6, p2}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->resolveSize(II)I

    move-result v10

    .line 164
    invoke-virtual {p0, v9, v10}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->setMeasuredDimension(II)V

    .line 167
    iget-object v9, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mMatchParentChildren:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_4

    .line 186
    return-void

    .line 136
    .end local v4    # "i":I
    .end local v6    # "maxHeight":I
    .end local v7    # "maxWidth":I
    .end local v8    # "measureMatchParentChildren":Z
    :cond_0
    const/4 v8, 0x1

    goto :goto_0

    .line 145
    .restart local v4    # "i":I
    .restart local v6    # "maxHeight":I
    .restart local v7    # "maxWidth":I
    .restart local v8    # "measureMatchParentChildren":Z
    :cond_1
    invoke-virtual {p0, v4}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 146
    .local v0, "child":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v9

    const/16 v10, 0x8

    if-eq v9, v10, :cond_3

    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 148
    .local v5, "lp":Landroid/view/ViewGroup$LayoutParams;
    const/4 v9, 0x0

    iget v10, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p1, v9, v10}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getChildMeasureSpec(III)I

    move-result v2

    .line 149
    .local v2, "childWidthMeasureSpec":I
    const/4 v9, 0x0

    iget v10, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {p2, v9, v10}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getChildMeasureSpec(III)I

    move-result v1

    .line 150
    .local v1, "childHeightMeasureSpec":I
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->measure(II)V

    .line 151
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 152
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 153
    if-eqz v8, :cond_3

    .line 154
    iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v10, -0x1

    if-eq v9, v10, :cond_2

    .line 155
    iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v10, -0x1

    if-ne v9, v10, :cond_3

    .line 156
    :cond_2
    iget-object v9, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mMatchParentChildren:Ljava/util/List;

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    .end local v1    # "childHeightMeasureSpec":I
    .end local v2    # "childWidthMeasureSpec":I
    .end local v5    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 167
    .end local v0    # "child":Landroid/view/View;
    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 168
    .restart local v0    # "child":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 172
    .restart local v5    # "lp":Landroid/view/ViewGroup$LayoutParams;
    iget v10, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v11, -0x1

    if-ne v10, v11, :cond_5

    .line 173
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getMeasuredWidth()I

    move-result v10

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 178
    .restart local v2    # "childWidthMeasureSpec":I
    :goto_3
    iget v10, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v11, -0x1

    if-ne v10, v11, :cond_6

    .line 179
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getMeasuredHeight()I

    move-result v10

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 184
    .restart local v1    # "childHeightMeasureSpec":I
    :goto_4
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->measure(II)V

    goto :goto_2

    .line 175
    .end local v1    # "childHeightMeasureSpec":I
    .end local v2    # "childWidthMeasureSpec":I
    :cond_5
    const/4 v10, 0x0

    iget v11, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p1, v10, v11}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getChildMeasureSpec(III)I

    move-result v2

    .restart local v2    # "childWidthMeasureSpec":I
    goto :goto_3

    .line 181
    :cond_6
    const/4 v10, 0x0

    iget v11, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {p2, v10, v11}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->getChildMeasureSpec(III)I

    move-result v1

    .restart local v1    # "childHeightMeasureSpec":I
    goto :goto_4
.end method

.method public replaceTo(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V
    .locals 1
    .param p1, "question"    # Lcom/mixpanel/android/mpmetrics/Survey$Question;
    .param p2, "answerOrNull"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/surveys/CardCarouselLayout$UnrecognizedAnswerTypeException;
        }
    .end annotation

    .prologue
    .line 120
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v0, p1, p2}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->showQuestionOnCard(Lcom/mixpanel/android/mpmetrics/Survey$Question;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->removeAllViews()V

    .line 122
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mVisibleCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->addView(Landroid/view/View;)V

    .line 123
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mBackupCard:Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;

    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout$QuestionCard;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->addView(Landroid/view/View;)V

    .line 124
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/CardCarouselLayout;->invalidate()V

    .line 125
    return-void
.end method

.method public setOnQuestionAnsweredListener(Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    .prologue
    .line 77
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout;->mListener:Lcom/mixpanel/android/surveys/CardCarouselLayout$OnQuestionAnsweredListener;

    .line 78
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    return v0
.end method
