.class public Lcom/mixpanel/android/surveys/MiniCircleImageView;
.super Landroid/widget/ImageView;
.source "MiniCircleImageView.java"


# instance fields
.field private mCanvasHeight:I

.field private mCanvasWidth:I

.field private mWhitePaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->init()V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->init()V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->init()V

    .line 30
    return-void
.end method

.method private init()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 33
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v5}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mWhitePaint:Landroid/graphics/Paint;

    .line 34
    iget-object v2, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mWhitePaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x106000b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    iget-object v2, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mWhitePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 38
    .local v0, "r":Landroid/content/res/Resources;
    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-static {v5, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    .line 39
    .local v1, "strokePx":F
    iget-object v2, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mWhitePaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 40
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 44
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 46
    iget v3, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mCanvasWidth:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v0, v3

    .line 47
    .local v0, "centerX":F
    iget v3, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mCanvasHeight:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v1, v3

    .line 50
    .local v1, "centerY":F
    const v3, 0x3f333333    # 0.7f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v4

    mul-float v2, v3, v4

    .line 51
    .local v2, "radius":F
    iget-object v3, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mWhitePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 52
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0
    .param p1, "w"    # I
    .param p2, "h"    # I
    .param p3, "oldw"    # I
    .param p4, "oldh"    # I

    .prologue
    .line 56
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 58
    iput p1, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mCanvasWidth:I

    .line 59
    iput p2, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->mCanvasHeight:I

    .line 60
    return-void
.end method
