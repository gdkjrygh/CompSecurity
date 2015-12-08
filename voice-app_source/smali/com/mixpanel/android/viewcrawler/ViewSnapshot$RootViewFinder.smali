.class Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;
.super Ljava/lang/Object;
.source "ViewSnapshot.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RootViewFinder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final mCachedBitmap:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

.field private final mClientDensity:I

.field private final mDisplayMetrics:Landroid/util/DisplayMetrics;

.field private mLiveActivities:Lcom/mixpanel/android/viewcrawler/UIThreadSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mixpanel/android/viewcrawler/UIThreadSet",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final mRootViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 391
    const/16 v0, 0xa0

    iput v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mClientDensity:I

    .line 293
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 294
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    .line 295
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    invoke-direct {v0}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mCachedBitmap:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    .line 296
    return-void
.end method

.method private takeScreenshot(Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;)V
    .locals 18
    .param p1, "info"    # Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;

    .prologue
    .line 326
    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->rootView:Landroid/view/View;

    .line 327
    .local v11, "rootView":Landroid/view/View;
    const/4 v7, 0x0

    .line 330
    .local v7, "rawBitmap":Landroid/graphics/Bitmap;
    :try_start_0
    const-class v13, Landroid/view/View;

    const-string v14, "createSnapshot"

    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/Class;

    const/16 v16, 0x0

    const-class v17, Landroid/graphics/Bitmap$Config;

    aput-object v17, v15, v16

    const/16 v16, 0x1

    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v17, v15, v16

    const/16 v16, 0x2

    sget-object v17, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v17, v15, v16

    invoke-virtual {v13, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 331
    .local v2, "createSnapshot":Ljava/lang/reflect/Method;
    const/4 v13, 0x1

    invoke-virtual {v2, v13}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 332
    const/4 v13, 0x3

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    sget-object v15, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    aput-object v15, v13, v14

    const/4 v14, 0x1

    const/4 v15, -0x1

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-virtual {v2, v11, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Landroid/graphics/Bitmap;

    move-object v7, v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_4

    .line 347
    .end local v2    # "createSnapshot":Ljava/lang/reflect/Method;
    :cond_0
    :goto_0
    const/4 v6, 0x0

    .line 349
    .local v6, "originalCacheState":Ljava/lang/Boolean;
    if-nez v7, :cond_1

    .line 350
    :try_start_1
    invoke-virtual {v11}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v13

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 351
    const/4 v13, 0x1

    invoke-virtual {v11, v13}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 352
    const/4 v13, 0x1

    invoke-virtual {v11, v13}, Landroid/view/View;->buildDrawingCache(Z)V

    .line 353
    invoke-virtual {v11}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_5

    move-result-object v7

    .line 361
    :cond_1
    :goto_1
    const/high16 v12, 0x3f800000    # 1.0f

    .line 362
    .local v12, "scale":F
    if-eqz v7, :cond_3

    .line 363
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getDensity()I

    move-result v8

    .line 365
    .local v8, "rawDensity":I
    if-eqz v8, :cond_2

    .line 366
    const/high16 v13, 0x43200000    # 160.0f

    int-to-float v14, v8

    div-float v12, v13, v14

    .line 369
    :cond_2
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    .line 370
    .local v10, "rawWidth":I
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 371
    .local v9, "rawHeight":I
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    int-to-float v13, v13

    mul-float/2addr v13, v12

    float-to-double v14, v13

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    add-double v14, v14, v16

    double-to-int v4, v14

    .line 372
    .local v4, "destWidth":I
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    int-to-float v13, v13

    mul-float/2addr v13, v12

    float-to-double v14, v13

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    add-double v14, v14, v16

    double-to-int v3, v14

    .line 374
    .local v3, "destHeight":I
    if-lez v10, :cond_3

    if-lez v9, :cond_3

    if-lez v4, :cond_3

    if-lez v3, :cond_3

    .line 375
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mCachedBitmap:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    const/16 v14, 0xa0

    invoke-virtual {v13, v4, v3, v14, v7}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;->recreate(IIILandroid/graphics/Bitmap;)V

    .line 379
    .end local v3    # "destHeight":I
    .end local v4    # "destWidth":I
    .end local v8    # "rawDensity":I
    .end local v9    # "rawHeight":I
    .end local v10    # "rawWidth":I
    :cond_3
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_4

    .line 380
    const/4 v13, 0x0

    invoke-virtual {v11, v13}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 382
    :cond_4
    move-object/from16 v0, p1

    iput v12, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->scale:F

    .line 383
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mCachedBitmap:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    move-object/from16 v0, p1

    iput-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->screenshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    .line 384
    return-void

    .line 333
    .end local v6    # "originalCacheState":Ljava/lang/Boolean;
    .end local v12    # "scale":F
    :catch_0
    move-exception v5

    .line 334
    .local v5, "e":Ljava/lang/NoSuchMethodException;
    sget-boolean v13, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v13, :cond_0

    .line 335
    const-string v13, "MixpanelAPI.Snapshot"

    const-string v14, "Can\'t call createSnapshot, will use drawCache"

    invoke-static {v13, v14, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 337
    .end local v5    # "e":Ljava/lang/NoSuchMethodException;
    :catch_1
    move-exception v5

    .line 338
    .local v5, "e":Ljava/lang/IllegalArgumentException;
    const-string v13, "MixpanelAPI.Snapshot"

    const-string v14, "Can\'t call createSnapshot with arguments"

    invoke-static {v13, v14, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 339
    .end local v5    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v5

    .line 340
    .local v5, "e":Ljava/lang/reflect/InvocationTargetException;
    const-string v13, "MixpanelAPI.Snapshot"

    const-string v14, "Exception when calling createSnapshot"

    invoke-static {v13, v14, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 341
    .end local v5    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_3
    move-exception v5

    .line 342
    .local v5, "e":Ljava/lang/IllegalAccessException;
    const-string v13, "MixpanelAPI.Snapshot"

    const-string v14, "Can\'t access createSnapshot, using drawCache"

    invoke-static {v13, v14, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 343
    .end local v5    # "e":Ljava/lang/IllegalAccessException;
    :catch_4
    move-exception v5

    .line 344
    .local v5, "e":Ljava/lang/ClassCastException;
    const-string v13, "MixpanelAPI.Snapshot"

    const-string v14, "createSnapshot didn\'t return a bitmap?"

    invoke-static {v13, v14, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 355
    .end local v5    # "e":Ljava/lang/ClassCastException;
    .restart local v6    # "originalCacheState":Ljava/lang/Boolean;
    :catch_5
    move-exception v5

    .line 356
    .local v5, "e":Ljava/lang/RuntimeException;
    sget-boolean v13, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v13, :cond_1

    .line 357
    const-string v13, "MixpanelAPI.Snapshot"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Can\'t take a bitmap snapshot of view "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, ", skipping for now."

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 304
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 306
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mLiveActivities:Lcom/mixpanel/android/viewcrawler/UIThreadSet;

    invoke-virtual {v7}, Lcom/mixpanel/android/viewcrawler/UIThreadSet;->getAll()Ljava/util/Set;

    move-result-object v4

    .line 308
    .local v4, "liveActivities":Ljava/util/Set;, "Ljava/util/Set<Landroid/app/Activity;>;"
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_0

    .line 316
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    .line 317
    .local v6, "viewCount":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    if-lt v2, v6, :cond_1

    .line 322
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    return-object v7

    .line 308
    .end local v2    # "i":I
    .end local v6    # "viewCount":I
    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 309
    .local v0, "a":Landroid/app/Activity;
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    .line 310
    .local v1, "activityName":Ljava/lang/String;
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v5

    .line 311
    .local v5, "rootView":Landroid/view/View;
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v8

    invoke-interface {v8}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    iget-object v9, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    invoke-virtual {v8, v9}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 312
    new-instance v3, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;

    invoke-direct {v3, v1, v5}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;-><init>(Ljava/lang/String;Landroid/view/View;)V

    .line 313
    .local v3, "info":Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 318
    .end local v0    # "a":Landroid/app/Activity;
    .end local v1    # "activityName":Ljava/lang/String;
    .end local v3    # "info":Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;
    .end local v5    # "rootView":Landroid/view/View;
    .restart local v2    # "i":I
    .restart local v6    # "viewCount":I
    :cond_1
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mRootViews:Ljava/util/List;

    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;

    .line 319
    .restart local v3    # "info":Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;
    invoke-direct {p0, v3}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->takeScreenshot(Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;)V

    .line 317
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public findInActivities(Lcom/mixpanel/android/viewcrawler/UIThreadSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/viewcrawler/UIThreadSet",
            "<",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 299
    .local p1, "liveActivities":Lcom/mixpanel/android/viewcrawler/UIThreadSet;, "Lcom/mixpanel/android/viewcrawler/UIThreadSet<Landroid/app/Activity;>;"
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->mLiveActivities:Lcom/mixpanel/android/viewcrawler/UIThreadSet;

    .line 300
    return-void
.end method
