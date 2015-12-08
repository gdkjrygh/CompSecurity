.class public Lcom/mixpanel/android/util/ActivityImageUtils;
.super Ljava/lang/Object;
.source "ActivityImageUtils.java"


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.ActImgUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getHighlightColor(I)I
    .locals 3
    .param p0, "sampleColor"    # I

    .prologue
    .line 62
    const/4 v1, 0x3

    new-array v0, v1, [F

    .line 63
    .local v0, "hsvBackground":[F
    invoke-static {p0, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 64
    const/4 v1, 0x2

    const v2, 0x3e99999a    # 0.3f

    aput v2, v0, v1

    .line 66
    const/16 v1, 0xf2

    invoke-static {v1, v0}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v1

    return v1
.end method

.method public static getHighlightColorFromBackground(Landroid/app/Activity;)I
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 43
    const/high16 v0, -0x1000000

    .line 44
    .local v0, "incolor":I
    invoke-static {p0, v3, v3, v2}, Lcom/mixpanel/android/util/ActivityImageUtils;->getScaledScreenshot(Landroid/app/Activity;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 45
    .local v1, "screenshot1px":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {v1, v2, v2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v0

    .line 48
    :cond_0
    invoke-static {v0}, Lcom/mixpanel/android/util/ActivityImageUtils;->getHighlightColor(I)I

    move-result v2

    return v2
.end method

.method public static getHighlightColorFromBitmap(Landroid/graphics/Bitmap;)I
    .locals 4
    .param p0, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 52
    const/high16 v1, -0x1000000

    .line 53
    .local v1, "incolor":I
    if-eqz p0, :cond_0

    .line 54
    invoke-static {p0, v3, v3, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 55
    .local v0, "bitmap1px":Landroid/graphics/Bitmap;
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v1

    .line 57
    .end local v0    # "bitmap1px":Landroid/graphics/Bitmap;
    :cond_0
    invoke-static {v1}, Lcom/mixpanel/android/util/ActivityImageUtils;->getHighlightColor(I)I

    move-result v2

    return v2
.end method

.method public static getScaledScreenshot(Landroid/app/Activity;IIZ)Landroid/graphics/Bitmap;
    .locals 9
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "scaleWidth"    # I
    .param p2, "scaleHeight"    # I
    .param p3, "relativeScaleIfTrue"    # Z

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 12
    const v6, 0x1020002

    invoke-virtual {p0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 13
    .local v5, "someView":Landroid/view/View;
    invoke-virtual {v5}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    .line 14
    .local v3, "rootView":Landroid/view/View;
    invoke-virtual {v3}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v2

    .line 15
    .local v2, "originalCacheState":Z
    invoke-virtual {v3, v7}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 16
    invoke-virtual {v3, v7}, Landroid/view/View;->buildDrawingCache(Z)V

    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 22
    .local v1, "original":Landroid/graphics/Bitmap;
    const/4 v4, 0x0

    .line 23
    .local v4, "scaled":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-lez v6, :cond_1

    .line 24
    if-eqz p3, :cond_0

    .line 25
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    div-int p1, v6, p1

    .line 26
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    div-int p2, v6, p2

    .line 28
    :cond_0
    if-lez p1, :cond_1

    if-lez p2, :cond_1

    .line 30
    const/4 v6, 0x0

    :try_start_0
    invoke-static {v1, p1, p2, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 36
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 37
    invoke-virtual {v3, v8}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 39
    :cond_2
    return-object v4

    .line 31
    :catch_0
    move-exception v0

    .line 32
    .local v0, "error":Ljava/lang/OutOfMemoryError;
    const-string v6, "MixpanelAPI.ActImgUtils"

    const-string v7, "Not enough memory to produce scaled image, returning a null screenshot"

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
