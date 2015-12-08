.class public Lcom/mixpanel/android/surveys/FadingImageView;
.super Landroid/widget/ImageView;
.source "FadingImageView.java"


# instance fields
.field private mAlphaGradientPaint:Landroid/graphics/Paint;

.field private mAlphaGradientShader:Landroid/graphics/Shader;

.field private mDarkenGradientPaint:Landroid/graphics/Paint;

.field private mDarkenGradientShader:Landroid/graphics/Shader;

.field private mGradientMatrix:Landroid/graphics/Matrix;

.field private mHeight:I

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 24
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 25
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->initFadingImageView()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->initFadingImageView()V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->initFadingImageView()V

    .line 36
    return-void
.end method

.method private initFadingImageView()V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v9, 0x4

    const/high16 v8, -0x1000000

    const/4 v1, 0x0

    .line 95
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mGradientMatrix:Landroid/graphics/Matrix;

    .line 97
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientPaint:Landroid/graphics/Paint;

    .line 98
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 100
    new-array v5, v9, [I

    const/4 v2, 0x0

    aput v8, v5, v2

    const/4 v2, 0x1

    aput v8, v5, v2

    const/high16 v2, -0x1b000000

    aput v2, v5, v10

    .line 101
    new-array v6, v9, [F

    fill-array-data v6, :array_0

    .line 102
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move v2, v1

    move v3, v1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 98
    iput-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientShader:Landroid/graphics/Shader;

    .line 104
    iget-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientPaint:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientShader:Landroid/graphics/Shader;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 105
    iget-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientPaint:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 107
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mDarkenGradientPaint:Landroid/graphics/Paint;

    .line 108
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 110
    new-array v5, v9, [I

    aput v8, v5, v10

    const/4 v2, 0x3

    aput v8, v5, v2

    .line 111
    new-array v6, v9, [F

    fill-array-data v6, :array_1

    .line 112
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move v2, v1

    move v3, v1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 108
    iput-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mDarkenGradientShader:Landroid/graphics/Shader;

    .line 114
    iget-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mDarkenGradientPaint:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mDarkenGradientShader:Landroid/graphics/Shader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 115
    iget-object v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientPaint:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 116
    return-void

    .line 101
    :array_0
    .array-data 4
        0x0
        0x3f333333    # 0.7f
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    .line 111
    :array_1
    .array-data 4
        0x0
        0x3f59999a    # 0.85f
        0x3f7ae148    # 0.98f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 9
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    const/4 v1, 0x0

    .line 77
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v7

    .line 78
    .local v7, "clip":Landroid/graphics/Rect;
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v3, v0

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v4, v0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v8

    .line 80
    .local v8, "restoreTo":I
    invoke-super {p0, p1}, Landroid/widget/ImageView;->draw(Landroid/graphics/Canvas;)V

    .line 82
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 83
    iget v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mWidth:I

    int-to-float v3, v0

    iget v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mHeight:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 90
    :goto_0
    invoke-virtual {p1, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 91
    return-void

    .line 85
    :cond_0
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getPaddingLeft()I

    move-result v0

    int-to-float v1, v0

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getPaddingTop()I

    move-result v0

    int-to-float v2, v0

    .line 86
    iget v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mWidth:I

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v0, v3

    int-to-float v3, v0

    .line 87
    iget v0, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mHeight:I

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v0, v4

    int-to-float v4, v0

    .line 88
    iget-object v5, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mDarkenGradientPaint:Landroid/graphics/Paint;

    move-object v0, p1

    .line 85
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 10
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    const/4 v9, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    .line 40
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 42
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getHeight()I

    move-result v6

    iput v6, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mHeight:I

    .line 43
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getWidth()I

    move-result v6

    iput v6, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mWidth:I

    .line 44
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 46
    .local v3, "parentHeight":I
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    if-ne v6, v9, :cond_1

    .line 50
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getRootView()Landroid/view/View;

    move-result-object v5

    .line 51
    .local v5, "root":Landroid/view/View;
    sget v6, Lcom/mixpanel/android/R$id;->com_mixpanel_android_notification_bottom_wrapper:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 55
    .local v1, "bottomWrapperView":Landroid/view/View;
    const/4 v0, 0x0

    .line 56
    .local v0, "bottomWrapperHeight":I
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    if-eqz v6, :cond_0

    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 62
    :cond_0
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/FadingImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 63
    .local v4, "r":Landroid/content/res/Resources;
    const/high16 v6, 0x41700000    # 15.0f

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    invoke-static {v9, v6, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    .line 64
    .local v2, "extraPx":F
    iget-object v6, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mGradientMatrix:Landroid/graphics/Matrix;

    sub-int v7, v3, v0

    int-to-float v7, v7

    add-float/2addr v7, v2

    invoke-virtual {v6, v8, v7}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 68
    .end local v0    # "bottomWrapperHeight":I
    .end local v1    # "bottomWrapperView":Landroid/view/View;
    .end local v2    # "extraPx":F
    .end local v4    # "r":Landroid/content/res/Resources;
    .end local v5    # "root":Landroid/view/View;
    :goto_0
    iget-object v6, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mAlphaGradientShader:Landroid/graphics/Shader;

    iget-object v7, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mGradientMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v6, v7}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 69
    iget-object v6, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mDarkenGradientShader:Landroid/graphics/Shader;

    iget-object v7, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mGradientMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v6, v7}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 70
    return-void

    .line 66
    :cond_1
    iget-object v6, p0, Lcom/mixpanel/android/surveys/FadingImageView;->mGradientMatrix:Landroid/graphics/Matrix;

    int-to-float v7, v3

    invoke-virtual {v6, v8, v7}, Landroid/graphics/Matrix;->setScale(FF)V

    goto :goto_0
.end method
