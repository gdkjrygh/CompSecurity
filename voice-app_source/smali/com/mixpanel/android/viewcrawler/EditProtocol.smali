.class Lcom/mixpanel/android/viewcrawler/EditProtocol;
.super Ljava/lang/Object;
.source "EditProtocol.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;,
        Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;,
        Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;,
        Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    }
.end annotation


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.EProtocol"

.field private static final NEVER_MATCH_PATH:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;"
        }
    .end annotation
.end field

.field private static final NO_PARAMS:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

.field private final mLayoutErrorListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

.field private final mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 426
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    sput-object v0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->NO_PARAMS:[Ljava/lang/Class;

    .line 427
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->NEVER_MATCH_PATH:Ljava/util/List;

    .line 430
    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/ResourceIds;Lcom/mixpanel/android/viewcrawler/ImageStore;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;)V
    .locals 0
    .param p1, "resourceIds"    # Lcom/mixpanel/android/mpmetrics/ResourceIds;
    .param p2, "imageStore"    # Lcom/mixpanel/android/viewcrawler/ImageStore;
    .param p3, "layoutErrorListener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    .line 67
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

    .line 68
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mLayoutErrorListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

    .line 69
    return-void
.end method

.method private convertArgument(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;
    .locals 6
    .param p1, "jsonArgument"    # Ljava/lang/Object;
    .param p2, "type"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;,
            Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
        }
    .end annotation

    .prologue
    .line 353
    .local p3, "assetsLoaded":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    const-string v3, "java.lang.CharSequence"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 368
    .end local p1    # "jsonArgument":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-object p1

    .line 355
    .restart local p1    # "jsonArgument":Ljava/lang/Object;
    :cond_1
    const-string v3, "boolean"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "java.lang.Boolean"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 357
    const-string v3, "int"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "java.lang.Integer"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 358
    :cond_2
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    move-object v3, v0

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 359
    :cond_3
    const-string v3, "float"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "java.lang.Float"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 360
    :cond_4
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    move-object v3, v0

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_0

    .line 361
    :cond_5
    const-string v3, "android.graphics.drawable.Drawable"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 363
    move-object v0, p1

    check-cast v0, Lorg/json/JSONObject;

    move-object v3, v0

    invoke-direct {p0, v3, p3}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readBitmapDrawable(Lorg/json/JSONObject;Ljava/util/List;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    .line 364
    :cond_6
    const-string v3, "android.graphics.drawable.BitmapDrawable"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 365
    move-object v0, p1

    check-cast v0, Lorg/json/JSONObject;

    move-object v3, v0

    invoke-direct {p0, v3, p3}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readBitmapDrawable(Lorg/json/JSONObject;Ljava/util/List;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    .line 366
    :cond_7
    const-string v3, "android.graphics.drawable.ColorDrawable"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 367
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    move-object v3, v0

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 368
    .local v1, "colorValue":I
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object p1, v3

    goto/16 :goto_0

    .line 370
    .end local v1    # "colorValue":I
    :cond_8
    new-instance v3, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Don\'t know how to interpret type "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " (arg was "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    :catch_0
    move-exception v2

    .line 373
    .local v2, "e":Ljava/lang/ClassCastException;
    new-instance v3, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Couldn\'t interpret <"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "> as "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method private readBitmapDrawable(Lorg/json/JSONObject;Ljava/util/List;)Landroid/graphics/drawable/Drawable;
    .locals 13
    .param p1, "description"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/graphics/drawable/Drawable;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;,
            Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
        }
    .end annotation

    .prologue
    .line 380
    .local p2, "assetsLoaded":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    const-string v10, "url"

    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 381
    new-instance v10, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v11, "Can\'t construct a BitmapDrawable with a null url"

    invoke-direct {v10, v11}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v10
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 417
    :catch_0
    move-exception v2

    .line 418
    .local v2, "e":Lorg/json/JSONException;
    new-instance v10, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v11, "Couldn\'t read drawable description"

    invoke-direct {v10, v11, v2}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v10

    .line 384
    .end local v2    # "e":Lorg/json/JSONException;
    :cond_0
    :try_start_1
    const-string v10, "url"

    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 391
    .local v8, "url":Ljava/lang/String;
    const-string v10, "dimensions"

    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v10

    if-eqz v10, :cond_2

    .line 392
    const/4 v0, 0x0

    .local v0, "bottom":I
    move v7, v0

    .local v7, "top":I
    move v6, v0

    .local v6, "right":I
    move v4, v0

    .line 393
    .local v4, "left":I
    const/4 v9, 0x0

    .line 405
    .local v9, "useBounds":Z
    :goto_0
    :try_start_2
    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

    invoke-virtual {v10, v8}, Lcom/mixpanel/android/viewcrawler/ImageStore;->getImage(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 406
    .local v3, "image":Landroid/graphics/Bitmap;
    invoke-interface {p2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 411
    :try_start_3
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-direct {v5, v10, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 412
    .local v5, "ret":Landroid/graphics/drawable/Drawable;
    if-eqz v9, :cond_1

    .line 413
    invoke-virtual {v5, v4, v7, v6, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 416
    :cond_1
    return-object v5

    .line 395
    .end local v0    # "bottom":I
    .end local v3    # "image":Landroid/graphics/Bitmap;
    .end local v4    # "left":I
    .end local v5    # "ret":Landroid/graphics/drawable/Drawable;
    .end local v6    # "right":I
    .end local v7    # "top":I
    .end local v9    # "useBounds":Z
    :cond_2
    const-string v10, "dimensions"

    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 396
    .local v1, "dimensions":Lorg/json/JSONObject;
    const-string v10, "left"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 397
    .restart local v4    # "left":I
    const-string v10, "right"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 398
    .restart local v6    # "right":I
    const-string v10, "top"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 399
    .restart local v7    # "top":I
    const-string v10, "bottom"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 400
    .restart local v0    # "bottom":I
    const/4 v9, 0x1

    .restart local v9    # "useBounds":Z
    goto :goto_0

    .line 407
    .end local v1    # "dimensions":Lorg/json/JSONObject;
    :catch_1
    move-exception v2

    .line 408
    .local v2, "e":Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;
    new-instance v10, Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;

    invoke-virtual {v2}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;->getMessage()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/mixpanel/android/viewcrawler/ImageStore$CantGetImageException;->getCause()Ljava/lang/Throwable;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v10
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
.end method

.method private readPropertyDescription(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    .locals 11
    .param p2, "propertyDesc"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/mixpanel/android/viewcrawler/PropertyDescription;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
        }
    .end annotation

    .prologue
    .line 320
    .local p1, "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :try_start_0
    const-string v9, "name"

    invoke-virtual {p2, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 322
    .local v8, "propName":Ljava/lang/String;
    const/4 v0, 0x0

    .line 323
    .local v0, "accessor":Lcom/mixpanel/android/viewcrawler/Caller;
    const-string v9, "get"

    invoke-virtual {p2, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 324
    const-string v9, "get"

    invoke-virtual {p2, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 325
    .local v1, "accessorConfig":Lorg/json/JSONObject;
    const-string v9, "selector"

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 326
    .local v2, "accessorName":Ljava/lang/String;
    const-string v9, "result"

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    const-string v10, "type"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 327
    .local v4, "accessorResultTypeName":Ljava/lang/String;
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 328
    .local v3, "accessorResultType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Lcom/mixpanel/android/viewcrawler/Caller;

    .end local v0    # "accessor":Lcom/mixpanel/android/viewcrawler/Caller;
    sget-object v9, Lcom/mixpanel/android/viewcrawler/EditProtocol;->NO_PARAMS:[Ljava/lang/Class;

    invoke-direct {v0, p1, v2, v9, v3}, Lcom/mixpanel/android/viewcrawler/Caller;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Class;)V

    .line 332
    .end local v1    # "accessorConfig":Lorg/json/JSONObject;
    .end local v2    # "accessorName":Ljava/lang/String;
    .end local v3    # "accessorResultType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v4    # "accessorResultTypeName":Ljava/lang/String;
    .restart local v0    # "accessor":Lcom/mixpanel/android/viewcrawler/Caller;
    :cond_0
    const-string v9, "set"

    invoke-virtual {p2, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 333
    const-string v9, "set"

    invoke-virtual {p2, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 334
    .local v6, "mutatorConfig":Lorg/json/JSONObject;
    const-string v9, "selector"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 339
    .end local v6    # "mutatorConfig":Lorg/json/JSONObject;
    .local v7, "mutatorName":Ljava/lang/String;
    :goto_0
    new-instance v9, Lcom/mixpanel/android/viewcrawler/PropertyDescription;

    invoke-direct {v9, v8, p1, v0, v7}, Lcom/mixpanel/android/viewcrawler/PropertyDescription;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/mixpanel/android/viewcrawler/Caller;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    return-object v9

    .line 336
    .end local v7    # "mutatorName":Ljava/lang/String;
    :cond_1
    const/4 v7, 0x0

    .restart local v7    # "mutatorName":Ljava/lang/String;
    goto :goto_0

    .line 340
    .end local v0    # "accessor":Lcom/mixpanel/android/viewcrawler/Caller;
    .end local v7    # "mutatorName":Ljava/lang/String;
    .end local v8    # "propName":Ljava/lang/String;
    :catch_0
    move-exception v5

    .line 341
    .local v5, "e":Ljava/lang/NoSuchMethodException;
    new-instance v9, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v10, "Can\'t create property reader"

    invoke-direct {v9, v10, v5}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v9

    .line 342
    .end local v5    # "e":Ljava/lang/NoSuchMethodException;
    :catch_1
    move-exception v5

    .line 343
    .local v5, "e":Lorg/json/JSONException;
    new-instance v9, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v10, "Can\'t read property JSON"

    invoke-direct {v9, v10, v5}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v9

    .line 344
    .end local v5    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v5

    .line 345
    .local v5, "e":Ljava/lang/ClassNotFoundException;
    new-instance v9, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v10, "Can\'t read property JSON, relevant arg/return class not found"

    invoke-direct {v9, v10, v5}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v9
.end method

.method private reconcileIds(ILjava/lang/String;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/lang/Integer;
    .locals 5
    .param p1, "explicitId"    # I
    .param p2, "idName"    # Ljava/lang/String;
    .param p3, "idNameToId"    # Lcom/mixpanel/android/mpmetrics/ResourceIds;

    .prologue
    const/4 v1, 0x0

    const/4 v3, -0x1

    .line 290
    if-eqz p2, :cond_1

    .line 291
    invoke-interface {p3, p2}, Lcom/mixpanel/android/mpmetrics/ResourceIds;->knownIdName(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 292
    invoke-interface {p3, p2}, Lcom/mixpanel/android/mpmetrics/ResourceIds;->idFromName(Ljava/lang/String;)I

    move-result v0

    .line 305
    .local v0, "idFromName":I
    :goto_0
    if-eq v3, v0, :cond_2

    if-eq v3, p1, :cond_2

    if-eq v0, p1, :cond_2

    .line 306
    const-string v2, "MixpanelAPI.EProtocol"

    const-string v3, "Path contains both a named and an explicit id, and they don\'t match. No views will be matched."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    .end local v0    # "idFromName":I
    :goto_1
    return-object v1

    .line 294
    :cond_0
    const-string v2, "MixpanelAPI.EProtocol"

    .line 295
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Path element contains an id name not known to the system. No views will be matched.\nMake sure that you\'re not stripping your packages R class out with proguard.\nid name was \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 295
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 294
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 302
    :cond_1
    const/4 v0, -0x1

    .restart local v0    # "idFromName":I
    goto :goto_0

    .line 310
    :cond_2
    if-eq v3, v0, :cond_3

    .line 311
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 314
    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1
.end method


# virtual methods
.method public readEdit(Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;
    .locals 33
    .param p1, "source"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;,
            Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
        }
    .end annotation

    .prologue
    .line 111
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .local v11, "assetsLoaded":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    const-string v30, "path"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v22

    .line 115
    .local v22, "pathDesc":Lorg/json/JSONArray;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    move-object/from16 v30, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move-object/from16 v2, v30

    invoke-virtual {v0, v1, v2}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readPath(Lorg/json/JSONArray;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/util/List;

    move-result-object v21

    .line 117
    .local v21, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v30

    if-nez v30, :cond_0

    .line 118
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;

    const-string v31, "Edit will not be bound to any element in the UI."

    invoke-direct/range {v30 .. v31}, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;-><init>(Ljava/lang/String;)V

    throw v30
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 183
    .end local v21    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .end local v22    # "pathDesc":Lorg/json/JSONArray;
    :catch_0
    move-exception v12

    .line 184
    .local v12, "e":Ljava/lang/NoSuchMethodException;
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v31, "Can\'t create property mutator"

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-direct {v0, v1, v12}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v30

    .line 121
    .end local v12    # "e":Ljava/lang/NoSuchMethodException;
    .restart local v21    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .restart local v22    # "pathDesc":Lorg/json/JSONArray;
    :cond_0
    :try_start_1
    const-string v30, "change_type"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v31, "property"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_4

    .line 122
    const-string v30, "property"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v24

    .line 123
    .local v24, "propertyDesc":Lorg/json/JSONObject;
    const-string v30, "classname"

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    .line 124
    .local v26, "targetClassName":Ljava/lang/String;
    if-nez v26, :cond_1

    .line 125
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v31, "Can\'t bind an edit property without a target class"

    invoke-direct/range {v30 .. v31}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v30
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 185
    .end local v21    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .end local v22    # "pathDesc":Lorg/json/JSONArray;
    .end local v24    # "propertyDesc":Lorg/json/JSONObject;
    .end local v26    # "targetClassName":Ljava/lang/String;
    :catch_1
    move-exception v12

    .line 186
    .local v12, "e":Lorg/json/JSONException;
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v31, "Can\'t interpret instructions due to JSONException"

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-direct {v0, v1, v12}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v30

    .line 130
    .end local v12    # "e":Lorg/json/JSONException;
    .restart local v21    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .restart local v22    # "pathDesc":Lorg/json/JSONArray;
    .restart local v24    # "propertyDesc":Lorg/json/JSONObject;
    .restart local v26    # "targetClassName":Ljava/lang/String;
    :cond_1
    :try_start_2
    invoke-static/range {v26 .. v26}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v25

    .line 135
    .local v25, "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :try_start_3
    const-string v30, "property"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v30

    move-object/from16 v0, p0

    move-object/from16 v1, v25

    move-object/from16 v2, v30

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readPropertyDescription(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/PropertyDescription;

    move-result-object v23

    .line 136
    .local v23, "prop":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    const-string v30, "args"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 137
    .local v10, "argsAndTypes":Lorg/json/JSONArray;
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v30

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    .line 138
    .local v17, "methodArgs":[Ljava/lang/Object;
    const/4 v13, 0x0

    .local v13, "i":I
    :goto_0
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v30

    move/from16 v0, v30

    if-lt v13, v0, :cond_2

    .line 145
    move-object/from16 v0, v23

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->makeMutator([Ljava/lang/Object;)Lcom/mixpanel/android/viewcrawler/Caller;

    move-result-object v18

    .line 146
    .local v18, "mutator":Lcom/mixpanel/android/viewcrawler/Caller;
    if-nez v18, :cond_3

    .line 147
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v31, Ljava/lang/StringBuilder;

    const-string v32, "Can\'t update a read-only property "

    invoke-direct/range {v31 .. v32}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->name:Ljava/lang/String;

    move-object/from16 v32, v0

    invoke-virtual/range {v31 .. v32}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    const-string v32, " (add a mutator to make this work)"

    invoke-virtual/range {v31 .. v32}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    invoke-virtual/range {v31 .. v31}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-direct/range {v30 .. v31}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v30

    .line 131
    .end local v10    # "argsAndTypes":Lorg/json/JSONArray;
    .end local v13    # "i":I
    .end local v17    # "methodArgs":[Ljava/lang/Object;
    .end local v18    # "mutator":Lcom/mixpanel/android/viewcrawler/Caller;
    .end local v23    # "prop":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    .end local v25    # "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_2
    move-exception v12

    .line 132
    .local v12, "e":Ljava/lang/ClassNotFoundException;
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v31, Ljava/lang/StringBuilder;

    const-string v32, "Can\'t find class for visit path: "

    invoke-direct/range {v31 .. v32}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v31

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    invoke-virtual/range {v31 .. v31}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v31

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-direct {v0, v1, v12}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v30

    .line 139
    .end local v12    # "e":Ljava/lang/ClassNotFoundException;
    .restart local v10    # "argsAndTypes":Lorg/json/JSONArray;
    .restart local v13    # "i":I
    .restart local v17    # "methodArgs":[Ljava/lang/Object;
    .restart local v23    # "prop":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    .restart local v25    # "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_2
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v7

    .line 140
    .local v7, "argPlusType":Lorg/json/JSONArray;
    const/16 v30, 0x0

    move/from16 v0, v30

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 141
    .local v14, "jsonArg":Ljava/lang/Object;
    const/16 v30, 0x1

    move/from16 v0, v30

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 142
    .local v8, "argType":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v8, v11}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->convertArgument(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;

    move-result-object v30

    aput-object v30, v17, v13

    .line 138
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 150
    .end local v7    # "argPlusType":Lorg/json/JSONArray;
    .end local v8    # "argType":Ljava/lang/String;
    .end local v14    # "jsonArg":Ljava/lang/Object;
    .restart local v18    # "mutator":Lcom/mixpanel/android/viewcrawler/Caller;
    :cond_3
    new-instance v29, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;

    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->accessor:Lcom/mixpanel/android/viewcrawler/Caller;

    move-object/from16 v30, v0

    move-object/from16 v0, v29

    move-object/from16 v1, v21

    move-object/from16 v2, v18

    move-object/from16 v3, v30

    invoke-direct {v0, v1, v2, v3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;-><init>(Ljava/util/List;Lcom/mixpanel/android/viewcrawler/Caller;Lcom/mixpanel/android/viewcrawler/Caller;)V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 189
    .end local v10    # "argsAndTypes":Lorg/json/JSONArray;
    .end local v17    # "methodArgs":[Ljava/lang/Object;
    .end local v18    # "mutator":Lcom/mixpanel/android/viewcrawler/Caller;
    .end local v23    # "prop":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    .end local v24    # "propertyDesc":Lorg/json/JSONObject;
    .end local v25    # "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v26    # "targetClassName":Ljava/lang/String;
    .local v29, "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    :goto_1
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;

    const/16 v31, 0x0

    move-object/from16 v0, v30

    move-object/from16 v1, v29

    move-object/from16 v2, v31

    invoke-direct {v0, v1, v11, v2}, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;-><init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor;Ljava/util/List;Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;)V

    return-object v30

    .line 151
    .end local v13    # "i":I
    .end local v29    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    :cond_4
    :try_start_4
    const-string v30, "change_type"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v31, "layout"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_a

    .line 152
    const-string v30, "args"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 153
    .local v9, "args":Lorg/json/JSONArray;
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .local v19, "newParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;>;"
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v16

    .line 155
    .local v16, "length":I
    const/4 v13, 0x0

    .restart local v13    # "i":I
    :goto_2
    move/from16 v0, v16

    if-lt v13, v0, :cond_5

    .line 179
    new-instance v29, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;

    const-string v30, "name"

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mLayoutErrorListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

    move-object/from16 v31, v0

    move-object/from16 v0, v29

    move-object/from16 v1, v21

    move-object/from16 v2, v19

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;)V

    .line 180
    .restart local v29    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    goto :goto_1

    .line 156
    .end local v29    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    :cond_5
    invoke-virtual {v9, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    .line 159
    .local v15, "layout_info":Lorg/json/JSONObject;
    const-string v30, "view_id_name"

    move-object/from16 v0, v30

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    .line 160
    .local v28, "view_id_name":Ljava/lang/String;
    const-string v30, "anchor_id_name"

    move-object/from16 v0, v30

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 161
    .local v6, "anchor_id_name":Ljava/lang/String;
    const/16 v30, -0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    move-object/from16 v31, v0

    move-object/from16 v0, p0

    move/from16 v1, v30

    move-object/from16 v2, v28

    move-object/from16 v3, v31

    invoke-direct {v0, v1, v2, v3}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->reconcileIds(ILjava/lang/String;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/lang/Integer;

    move-result-object v27

    .line 163
    .local v27, "view_id":Ljava/lang/Integer;
    const-string v30, "0"

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_7

    .line 164
    const/16 v30, 0x0

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 171
    .local v5, "anchor_id":Ljava/lang/Integer;
    :goto_3
    if-eqz v27, :cond_6

    if-nez v5, :cond_9

    .line 172
    :cond_6
    const-string v30, "MixpanelAPI.EProtocol"

    new-instance v31, Ljava/lang/StringBuilder;

    const-string v32, "View ("

    invoke-direct/range {v31 .. v32}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v31

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    const-string v32, ") or anchor ("

    invoke-virtual/range {v31 .. v32}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    move-object/from16 v0, v31

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    const-string v32, ") not found."

    invoke-virtual/range {v31 .. v32}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v31

    invoke-virtual/range {v31 .. v31}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-static/range {v30 .. v31}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    :goto_4
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_2

    .line 165
    .end local v5    # "anchor_id":Ljava/lang/Integer;
    :cond_7
    const-string v30, "-1"

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_8

    .line 166
    const/16 v30, -0x1

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 167
    .restart local v5    # "anchor_id":Ljava/lang/Integer;
    goto :goto_3

    .line 168
    .end local v5    # "anchor_id":Ljava/lang/Integer;
    :cond_8
    const/16 v30, -0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    move-object/from16 v31, v0

    move-object/from16 v0, p0

    move/from16 v1, v30

    move-object/from16 v2, v31

    invoke-direct {v0, v1, v6, v2}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->reconcileIds(ILjava/lang/String;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/lang/Integer;

    move-result-object v5

    .restart local v5    # "anchor_id":Ljava/lang/Integer;
    goto :goto_3

    .line 176
    :cond_9
    new-instance v20, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Integer;->intValue()I

    move-result v30

    const-string v31, "verb"

    move-object/from16 v0, v31

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v31

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v32

    move-object/from16 v0, v20

    move/from16 v1, v30

    move/from16 v2, v31

    move/from16 v3, v32

    invoke-direct {v0, v1, v2, v3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;-><init>(III)V

    .line 177
    .local v20, "params":Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;
    invoke-virtual/range {v19 .. v20}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 181
    .end local v5    # "anchor_id":Ljava/lang/Integer;
    .end local v6    # "anchor_id_name":Ljava/lang/String;
    .end local v9    # "args":Lorg/json/JSONArray;
    .end local v13    # "i":I
    .end local v15    # "layout_info":Lorg/json/JSONObject;
    .end local v16    # "length":I
    .end local v19    # "newParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;>;"
    .end local v20    # "params":Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;
    .end local v27    # "view_id":Ljava/lang/Integer;
    .end local v28    # "view_id_name":Ljava/lang/String;
    :cond_a
    new-instance v30, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v31, "Can\'t figure out the edit type"

    invoke-direct/range {v30 .. v31}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v30
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
.end method

.method public readEventBinding(Lorg/json/JSONObject;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    .locals 8
    .param p1, "source"    # Lorg/json/JSONObject;
    .param p2, "listener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
        }
    .end annotation

    .prologue
    .line 73
    :try_start_0
    const-string v5, "event_name"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 74
    .local v1, "eventName":Ljava/lang/String;
    const-string v5, "event_type"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 76
    .local v2, "eventType":Ljava/lang/String;
    const-string v5, "path"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 77
    .local v4, "pathDesc":Lorg/json/JSONArray;
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    invoke-virtual {p0, v4, v5}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readPath(Lorg/json/JSONArray;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/util/List;

    move-result-object v3

    .line 79
    .local v3, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_0

    .line 80
    new-instance v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "event \'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\' will not be bound to any element in the UI."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .end local v1    # "eventName":Ljava/lang/String;
    .end local v2    # "eventType":Ljava/lang/String;
    .end local v3    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .end local v4    # "pathDesc":Lorg/json/JSONArray;
    :catch_0
    move-exception v0

    .line 105
    .local v0, "e":Lorg/json/JSONException;
    new-instance v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v6, "Can\'t interpret instructions due to JSONException"

    invoke-direct {v5, v6, v0}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5

    .line 83
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "eventName":Ljava/lang/String;
    .restart local v2    # "eventType":Ljava/lang/String;
    .restart local v3    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .restart local v4    # "pathDesc":Lorg/json/JSONArray;
    :cond_0
    :try_start_1
    const-string v5, "click"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 84
    new-instance v5, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;

    .line 86
    const/4 v6, 0x1

    .line 84
    invoke-direct {v5, v3, v6, v1, p2}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;-><init>(Ljava/util/List;ILjava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V

    .line 100
    :goto_0
    return-object v5

    .line 90
    :cond_1
    const-string v5, "selected"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 91
    new-instance v5, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;

    .line 93
    const/4 v6, 0x4

    .line 91
    invoke-direct {v5, v3, v6, v1, p2}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;-><init>(Ljava/util/List;ILjava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V

    goto :goto_0

    .line 97
    :cond_2
    const-string v5, "text_changed"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 98
    new-instance v5, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;

    invoke-direct {v5, v3, v1, p2}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V

    goto :goto_0

    .line 99
    :cond_3
    const-string v5, "detected"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 100
    new-instance v5, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;

    invoke-direct {v5, v3, v1, p2}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$ViewDetectorVisitor;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V

    goto :goto_0

    .line 102
    :cond_4
    new-instance v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Mixpanel can\'t track event type \""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
.end method

.method readPath(Lorg/json/JSONArray;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/util/List;
    .locals 18
    .param p1, "pathDesc"    # Lorg/json/JSONArray;
    .param p2, "idNameToId"    # Lcom/mixpanel/android/mpmetrics/ResourceIds;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Lcom/mixpanel/android/mpmetrics/ResourceIds;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 249
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .local v10, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    const/4 v9, 0x0

    .local v9, "i":I
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lt v9, v2, :cond_0

    .line 284
    .end local v10    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    :goto_1
    return-object v10

    .line 252
    .restart local v10    # "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    :cond_0
    move-object/from16 v0, p1

    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    .line 254
    .local v15, "targetView":Lorg/json/JSONObject;
    const-string v2, "prefix"

    invoke-static {v15, v2}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 255
    .local v11, "prefixCode":Ljava/lang/String;
    const-string v2, "view_class"

    invoke-static {v15, v2}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 256
    .local v4, "targetViewClass":Ljava/lang/String;
    const-string v2, "index"

    const/16 v16, -0x1

    move/from16 v0, v16

    invoke-virtual {v15, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 257
    .local v5, "targetIndex":I
    const-string v2, "contentDescription"

    invoke-static {v15, v2}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 258
    .local v7, "targetDescription":Ljava/lang/String;
    const-string v2, "id"

    const/16 v16, -0x1

    move/from16 v0, v16

    invoke-virtual {v15, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    .line 259
    .local v12, "targetExplicitId":I
    const-string v2, "mp_id_name"

    invoke-static {v15, v2}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 260
    .local v13, "targetIdName":Ljava/lang/String;
    const-string v2, "tag"

    invoke-static {v15, v2}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 263
    .local v8, "targetTag":Ljava/lang/String;
    const-string v2, "shortest"

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 264
    const/4 v3, 0x1

    .line 274
    .local v3, "prefix":I
    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v12, v13, v1}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->reconcileIds(ILjava/lang/String;Lcom/mixpanel/android/mpmetrics/ResourceIds;)Ljava/lang/Integer;

    move-result-object v14

    .line 275
    .local v14, "targetIdOrNull":Ljava/lang/Integer;
    if-nez v14, :cond_3

    .line 276
    sget-object v10, Lcom/mixpanel/android/viewcrawler/EditProtocol;->NEVER_MATCH_PATH:Ljava/util/List;

    goto :goto_1

    .line 265
    .end local v3    # "prefix":I
    .end local v14    # "targetIdOrNull":Ljava/lang/Integer;
    :cond_1
    if-nez v11, :cond_2

    .line 266
    const/4 v3, 0x0

    .line 267
    .restart local v3    # "prefix":I
    goto :goto_2

    .line 268
    .end local v3    # "prefix":I
    :cond_2
    const-string v2, "MixpanelAPI.EProtocol"

    new-instance v16, Ljava/lang/StringBuilder;

    const-string v17, "Unrecognized prefix type \""

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, "\". No views will be matched"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    sget-object v10, Lcom/mixpanel/android/viewcrawler/EditProtocol;->NEVER_MATCH_PATH:Ljava/util/List;

    goto :goto_1

    .line 278
    .restart local v3    # "prefix":I
    .restart local v14    # "targetIdOrNull":Ljava/lang/Integer;
    :cond_3
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 281
    .local v6, "targetId":I
    new-instance v2, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;

    invoke-direct/range {v2 .. v8}, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;-><init>(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0
.end method

.method public readSnapshotConfig(Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/ViewSnapshot;
    .locals 14
    .param p1, "source"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
        }
    .end annotation

    .prologue
    .line 193
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .local v7, "properties":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/PropertyDescription;>;"
    :try_start_0
    const-string v12, "config"

    invoke-virtual {p1, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 197
    .local v3, "config":Lorg/json/JSONObject;
    const-string v12, "classes"

    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 198
    .local v2, "classes":Lorg/json/JSONArray;
    const/4 v1, 0x0

    .local v1, "classIx":I
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-lt v1, v12, :cond_0

    .line 211
    new-instance v12, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    iget-object v13, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    invoke-direct {v12, v7, v13}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;-><init>(Ljava/util/List;Lcom/mixpanel/android/mpmetrics/ResourceIds;)V

    return-object v12

    .line 199
    :cond_0
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 200
    .local v0, "classDesc":Lorg/json/JSONObject;
    const-string v12, "name"

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 201
    .local v11, "targetClassName":Ljava/lang/String;
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    .line 203
    .local v10, "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v12, "properties"

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 204
    .local v9, "propertyDescs":Lorg/json/JSONArray;
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_1
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-lt v6, v12, :cond_1

    .line 198
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 205
    :cond_1
    invoke-virtual {v9, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 206
    .local v8, "propertyDesc":Lorg/json/JSONObject;
    invoke-direct {p0, v10, v8}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readPropertyDescription(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/PropertyDescription;

    move-result-object v4

    .line 207
    .local v4, "desc":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 204
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 212
    .end local v0    # "classDesc":Lorg/json/JSONObject;
    .end local v1    # "classIx":I
    .end local v2    # "classes":Lorg/json/JSONArray;
    .end local v3    # "config":Lorg/json/JSONObject;
    .end local v4    # "desc":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    .end local v6    # "i":I
    .end local v8    # "propertyDesc":Lorg/json/JSONObject;
    .end local v9    # "propertyDescs":Lorg/json/JSONArray;
    .end local v10    # "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v11    # "targetClassName":Ljava/lang/String;
    :catch_0
    move-exception v5

    .line 213
    .local v5, "e":Lorg/json/JSONException;
    new-instance v12, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v13, "Can\'t read snapshot configuration"

    invoke-direct {v12, v13, v5}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v12

    .line 214
    .end local v5    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v5

    .line 215
    .local v5, "e":Ljava/lang/ClassNotFoundException;
    new-instance v12, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v13, "Can\'t resolve types for snapshot configuration"

    invoke-direct {v12, v13, v5}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v12
.end method

.method public readTweak(Lorg/json/JSONObject;)Landroid/util/Pair;
    .locals 8
    .param p1, "tweakDesc"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
        }
    .end annotation

    .prologue
    .line 221
    :try_start_0
    const-string v5, "name"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 222
    .local v2, "tweakName":Ljava/lang/String;
    const-string v5, "type"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 224
    .local v3, "type":Ljava/lang/String;
    const-string v5, "number"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 225
    const-string v5, "encoding"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 226
    .local v1, "encoding":Ljava/lang/String;
    const-string v5, "d"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 227
    const-string v5, "value"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    .line 241
    .end local v1    # "encoding":Ljava/lang/String;
    :goto_0
    new-instance v5, Landroid/util/Pair;

    invoke-direct {v5, v2, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v5

    .line 228
    .restart local v1    # "encoding":Ljava/lang/String;
    :cond_0
    const-string v5, "l"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 229
    const-string v5, "value"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 230
    .local v4, "value":Ljava/lang/Long;
    goto :goto_0

    .line 231
    .end local v4    # "value":Ljava/lang/Long;
    :cond_1
    new-instance v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "number must have encoding of type \"l\" for long or \"d\" for double in: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    .end local v1    # "encoding":Ljava/lang/String;
    .end local v2    # "tweakName":Ljava/lang/String;
    .end local v3    # "type":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 243
    .local v0, "e":Lorg/json/JSONException;
    new-instance v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    const-string v6, "Can\'t read tweak update"

    invoke-direct {v5, v6, v0}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5

    .line 233
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v2    # "tweakName":Ljava/lang/String;
    .restart local v3    # "type":Ljava/lang/String;
    :cond_2
    :try_start_1
    const-string v5, "boolean"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 234
    const-string v5, "value"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 235
    .local v4, "value":Ljava/lang/Boolean;
    goto :goto_0

    .end local v4    # "value":Ljava/lang/Boolean;
    :cond_3
    const-string v5, "string"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 236
    const-string v5, "value"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 237
    .local v4, "value":Ljava/lang/String;
    goto :goto_0

    .line 238
    .end local v4    # "value":Ljava/lang/String;
    :cond_4
    new-instance v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Unrecognized tweak type "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " in: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
.end method
