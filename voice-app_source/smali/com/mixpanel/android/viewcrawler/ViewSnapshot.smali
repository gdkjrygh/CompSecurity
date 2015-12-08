.class Lcom/mixpanel/android/viewcrawler/ViewSnapshot;
.super Ljava/lang/Object;
.source "ViewSnapshot.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;,
        Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;,
        Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;,
        Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;
    }
.end annotation


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.Snapshot"

.field private static final MAX_CLASS_NAME_CACHE_SIZE:I = 0xff


# instance fields
.field private final mClassnameCache:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;

.field private final mMainThreadHandler:Landroid/os/Handler;

.field private final mProperties:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/PropertyDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

.field private final mRootViewFinder:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/mixpanel/android/mpmetrics/ResourceIds;)V
    .locals 2
    .param p2, "resourceIds"    # Lcom/mixpanel/android/mpmetrics/ResourceIds;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/PropertyDescription;",
            ">;",
            "Lcom/mixpanel/android/mpmetrics/ResourceIds;",
            ")V"
        }
    .end annotation

    .prologue
    .line 51
    .local p1, "properties":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/PropertyDescription;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mProperties:Ljava/util/List;

    .line 53
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    .line 54
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mMainThreadHandler:Landroid/os/Handler;

    .line 55
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;

    invoke-direct {v0}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mRootViewFinder:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;

    .line 56
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;

    const/16 v1, 0xff

    invoke-direct {v0, v1}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;-><init>(I)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mClassnameCache:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;

    .line 57
    return-void
.end method

.method private addProperties(Landroid/util/JsonWriter;Landroid/view/View;)V
    .locals 12
    .param p1, "j"    # Landroid/util/JsonWriter;
    .param p2, "v"    # Landroid/view/View;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 236
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    .line 237
    .local v6, "viewClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mProperties:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    .line 278
    return-void

    .line 237
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;

    .line 238
    .local v2, "desc":Lcom/mixpanel/android/viewcrawler/PropertyDescription;
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->targetClass:Ljava/lang/Class;

    invoke-virtual {v8, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_0

    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->accessor:Lcom/mixpanel/android/viewcrawler/Caller;

    if-eqz v8, :cond_0

    .line 239
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->accessor:Lcom/mixpanel/android/viewcrawler/Caller;

    invoke-virtual {v8, p2}, Lcom/mixpanel/android/viewcrawler/Caller;->applyMethod(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v5

    .line 240
    .local v5, "value":Ljava/lang/Object;
    if-eqz v5, :cond_0

    .line 242
    instance-of v8, v5, Ljava/lang/Number;

    if-eqz v8, :cond_2

    .line 243
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->name:Ljava/lang/String;

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    check-cast v5, Ljava/lang/Number;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v8, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    goto :goto_0

    .line 244
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_2
    instance-of v8, v5, Ljava/lang/Boolean;

    if-eqz v8, :cond_3

    .line 245
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->name:Ljava/lang/String;

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    check-cast v5, Ljava/lang/Boolean;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v8, v9}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    goto :goto_0

    .line 246
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_3
    instance-of v8, v5, Landroid/content/res/ColorStateList;

    if-eqz v8, :cond_4

    .line 247
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->name:Ljava/lang/String;

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    check-cast v5, Landroid/content/res/ColorStateList;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    goto :goto_0

    .line 248
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_4
    instance-of v8, v5, Landroid/graphics/drawable/Drawable;

    if-eqz v8, :cond_7

    move-object v3, v5

    .line 249
    check-cast v3, Landroid/graphics/drawable/Drawable;

    .line 250
    .local v3, "drawable":Landroid/graphics/drawable/Drawable;
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 251
    .local v0, "bounds":Landroid/graphics/Rect;
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->name:Ljava/lang/String;

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 252
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 253
    const-string v8, "classes"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 254
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 255
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 256
    .local v4, "klass":Ljava/lang/Class;
    :goto_1
    const-class v8, Ljava/lang/Object;

    if-ne v4, v8, :cond_6

    .line 260
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 261
    const-string v8, "dimensions"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 262
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 263
    const-string v8, "left"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    iget v9, v0, Landroid/graphics/Rect;->left:I

    int-to-long v10, v9

    invoke-virtual {v8, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 264
    const-string v8, "right"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    iget v9, v0, Landroid/graphics/Rect;->right:I

    int-to-long v10, v9

    invoke-virtual {v8, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 265
    const-string v8, "top"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    iget v9, v0, Landroid/graphics/Rect;->top:I

    int-to-long v10, v9

    invoke-virtual {v8, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 266
    const-string v8, "bottom"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    iget v9, v0, Landroid/graphics/Rect;->bottom:I

    int-to-long v10, v9

    invoke-virtual {v8, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 267
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 268
    instance-of v8, v3, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v8, :cond_5

    move-object v1, v3

    .line 269
    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    .line 270
    .local v1, "colorDrawable":Landroid/graphics/drawable/ColorDrawable;
    const-string v8, "color"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v9

    int-to-long v10, v9

    invoke-virtual {v8, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 272
    .end local v1    # "colorDrawable":Landroid/graphics/drawable/ColorDrawable;
    :cond_5
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    goto/16 :goto_0

    .line 257
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 258
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_1

    .line 274
    .end local v0    # "bounds":Landroid/graphics/Rect;
    .end local v3    # "drawable":Landroid/graphics/drawable/Drawable;
    .end local v4    # "klass":Ljava/lang/Class;
    :cond_7
    iget-object v8, v2, Lcom/mixpanel/android/viewcrawler/PropertyDescription;->name:Ljava/lang/String;

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    goto/16 :goto_0
.end method

.method private snapshotView(Landroid/util/JsonWriter;Landroid/view/View;)V
    .locals 24
    .param p1, "j"    # Landroid/util/JsonWriter;
    .param p2, "view"    # Landroid/view/View;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 137
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getId()I

    move-result v17

    .line 139
    .local v17, "viewId":I
    const/16 v19, -0x1

    move/from16 v0, v19

    move/from16 v1, v17

    if-ne v0, v1, :cond_7

    .line 140
    const/16 v18, 0x0

    .line 145
    .local v18, "viewIdName":Ljava/lang/String;
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 146
    const-string v19, "hashCode"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->hashCode()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 147
    const-string v19, "id"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    move/from16 v0, v17

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 148
    const-string v19, "mp_id_name"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 150
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v6

    .line 151
    .local v6, "description":Ljava/lang/CharSequence;
    if-nez v6, :cond_8

    .line 152
    const-string v19, "contentDescription"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    .line 157
    :goto_1
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v14

    .line 158
    .local v14, "tag":Ljava/lang/Object;
    if-nez v14, :cond_9

    .line 159
    const-string v19, "tag"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    .line 164
    :cond_0
    :goto_2
    const-string v19, "top"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 165
    const-string v19, "left"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLeft()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 166
    const-string v19, "width"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getWidth()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 167
    const-string v19, "height"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getHeight()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 168
    const-string v19, "scrollX"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getScrollX()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 169
    const-string v19, "scrollY"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getScrollY()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 170
    const-string v19, "visibility"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getVisibility()I

    move-result v20

    move/from16 v0, v20

    int-to-long v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 172
    const/4 v15, 0x0

    .line 173
    .local v15, "translationX":F
    const/16 v16, 0x0

    .line 174
    .local v16, "translationY":F
    sget v19, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v20, 0xb

    move/from16 v0, v19

    move/from16 v1, v20

    if-lt v0, v1, :cond_1

    .line 175
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTranslationX()F

    move-result v15

    .line 176
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTranslationY()F

    move-result v16

    .line 179
    :cond_1
    const-string v19, "translationX"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    float-to-double v0, v15

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 180
    const-string v19, "translationY"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    move/from16 v0, v16

    float-to-double v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {v19 .. v21}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 182
    const-string v19, "classes"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 183
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 184
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    .line 186
    .local v9, "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mClassnameCache:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$ClassNameCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/String;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 187
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v9

    .line 188
    const-class v19, Ljava/lang/Object;

    move-object/from16 v0, v19

    if-eq v9, v0, :cond_3

    if-nez v9, :cond_2

    .line 189
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 191
    invoke-direct/range {p0 .. p2}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->addProperties(Landroid/util/JsonWriter;Landroid/view/View;)V

    .line 193
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    .line 194
    .local v10, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    instance-of v0, v10, Landroid/widget/RelativeLayout$LayoutParams;

    move/from16 v19, v0

    if-eqz v19, :cond_4

    move-object v11, v10

    .line 195
    check-cast v11, Landroid/widget/RelativeLayout$LayoutParams;

    .line 196
    .local v11, "relativeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    invoke-virtual {v11}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    move-result-object v13

    .line 197
    .local v13, "rules":[I
    const-string v19, "layoutRules"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 198
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 199
    array-length v0, v13

    move/from16 v20, v0

    const/16 v19, 0x0

    :goto_3
    move/from16 v0, v19

    move/from16 v1, v20

    if-lt v0, v1, :cond_a

    .line 202
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 205
    .end local v11    # "relativeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .end local v13    # "rules":[I
    :cond_4
    const-string v19, "subviews"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 206
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 207
    move-object/from16 v0, p2

    instance-of v0, v0, Landroid/view/ViewGroup;

    move/from16 v19, v0

    if-eqz v19, :cond_5

    move-object/from16 v7, p2

    .line 208
    check-cast v7, Landroid/view/ViewGroup;

    .line 209
    .local v7, "group":Landroid/view/ViewGroup;
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    .line 210
    .local v5, "childCount":I
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_4
    if-lt v8, v5, :cond_b

    .line 218
    .end local v5    # "childCount":I
    .end local v7    # "group":Landroid/view/ViewGroup;
    .end local v8    # "i":I
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 219
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 221
    move-object/from16 v0, p2

    instance-of v0, v0, Landroid/view/ViewGroup;

    move/from16 v19, v0

    if-eqz v19, :cond_6

    move-object/from16 v7, p2

    .line 222
    check-cast v7, Landroid/view/ViewGroup;

    .line 223
    .restart local v7    # "group":Landroid/view/ViewGroup;
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    .line 224
    .restart local v5    # "childCount":I
    const/4 v8, 0x0

    .restart local v8    # "i":I
    :goto_5
    if-lt v8, v5, :cond_d

    .line 232
    .end local v5    # "childCount":I
    .end local v7    # "group":Landroid/view/ViewGroup;
    .end local v8    # "i":I
    :cond_6
    return-void

    .line 142
    .end local v6    # "description":Ljava/lang/CharSequence;
    .end local v9    # "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v10    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    .end local v14    # "tag":Ljava/lang/Object;
    .end local v15    # "translationX":F
    .end local v16    # "translationY":F
    .end local v18    # "viewIdName":Ljava/lang/String;
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mResourceIds:Lcom/mixpanel/android/mpmetrics/ResourceIds;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    move/from16 v1, v17

    invoke-interface {v0, v1}, Lcom/mixpanel/android/mpmetrics/ResourceIds;->nameForId(I)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "viewIdName":Ljava/lang/String;
    goto/16 :goto_0

    .line 154
    .restart local v6    # "description":Ljava/lang/CharSequence;
    :cond_8
    const-string v19, "contentDescription"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    goto/16 :goto_1

    .line 160
    .restart local v14    # "tag":Ljava/lang/Object;
    :cond_9
    instance-of v0, v14, Ljava/lang/CharSequence;

    move/from16 v19, v0

    if-eqz v19, :cond_0

    .line 161
    const-string v19, "tag"

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v19

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    goto/16 :goto_2

    .line 199
    .restart local v9    # "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v10    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    .restart local v11    # "relativeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .restart local v13    # "rules":[I
    .restart local v15    # "translationX":F
    .restart local v16    # "translationY":F
    :cond_a
    aget v12, v13, v19

    .line 200
    .local v12, "rule":I
    int-to-long v0, v12

    move-wide/from16 v22, v0

    move-object/from16 v0, p1

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 199
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_3

    .line 211
    .end local v11    # "relativeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .end local v12    # "rule":I
    .end local v13    # "rules":[I
    .restart local v5    # "childCount":I
    .restart local v7    # "group":Landroid/view/ViewGroup;
    .restart local v8    # "i":I
    :cond_b
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 213
    .local v4, "child":Landroid/view/View;
    if-eqz v4, :cond_c

    .line 214
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v19

    move/from16 v0, v19

    int-to-long v0, v0

    move-wide/from16 v20, v0

    move-object/from16 v0, p1

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 210
    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 225
    .end local v4    # "child":Landroid/view/View;
    :cond_d
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 227
    .restart local v4    # "child":Landroid/view/View;
    if-eqz v4, :cond_e

    .line 228
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v4}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->snapshotView(Landroid/util/JsonWriter;Landroid/view/View;)V

    .line 224
    :cond_e
    add-int/lit8 v8, v8, 0x1

    goto :goto_5
.end method


# virtual methods
.method getProperties()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/PropertyDescription;",
            ">;"
        }
    .end annotation

    .prologue
    .line 125
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mProperties:Ljava/util/List;

    return-object v0
.end method

.method snapshotViewHierarchy(Landroid/util/JsonWriter;Landroid/view/View;)V
    .locals 0
    .param p1, "j"    # Landroid/util/JsonWriter;
    .param p2, "rootView"    # Landroid/view/View;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 130
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 131
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->snapshotView(Landroid/util/JsonWriter;Landroid/view/View;)V

    .line 132
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 133
    return-void
.end method

.method public snapshots(Lcom/mixpanel/android/viewcrawler/UIThreadSet;Ljava/io/OutputStream;)V
    .locals 14
    .param p2, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/viewcrawler/UIThreadSet",
            "<",
            "Landroid/app/Activity;",
            ">;",
            "Ljava/io/OutputStream;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 65
    .local p1, "liveActivities":Lcom/mixpanel/android/viewcrawler/UIThreadSet;, "Lcom/mixpanel/android/viewcrawler/UIThreadSet<Landroid/app/Activity;>;"
    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mRootViewFinder:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;

    invoke-virtual {v10, p1}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;->findInActivities(Lcom/mixpanel/android/viewcrawler/UIThreadSet;)V

    .line 66
    new-instance v6, Ljava/util/concurrent/FutureTask;

    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mRootViewFinder:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewFinder;

    invoke-direct {v6, v10}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 67
    .local v6, "infoFuture":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;>;>;"
    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->mMainThreadHandler:Landroid/os/Handler;

    invoke-virtual {v10, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 69
    new-instance v9, Ljava/io/OutputStreamWriter;

    move-object/from16 v0, p2

    invoke-direct {v9, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 70
    .local v9, "writer":Ljava/io/OutputStreamWriter;
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 71
    .local v7, "infoList":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;>;"
    const-string v10, "["

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 74
    const-wide/16 v10, 0x1

    :try_start_0
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v10, v11, v12}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v10

    move-object v0, v10

    check-cast v0, Ljava/util/List;

    move-object v7, v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2

    .line 89
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v5

    .line 90
    .local v5, "infoCount":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-lt v3, v5, :cond_1

    .line 119
    const-string v10, "]"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v9}, Ljava/io/OutputStreamWriter;->flush()V

    .line 121
    return-void

    .line 75
    .end local v3    # "i":I
    .end local v5    # "infoCount":I
    :catch_0
    move-exception v2

    .line 76
    .local v2, "e":Ljava/lang/InterruptedException;
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_0

    .line 77
    const-string v10, "MixpanelAPI.Snapshot"

    const-string v11, "Screenshot interrupted, no screenshot will be sent."

    invoke-static {v10, v11, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 79
    .end local v2    # "e":Ljava/lang/InterruptedException;
    :catch_1
    move-exception v2

    .line 80
    .local v2, "e":Ljava/util/concurrent/TimeoutException;
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_0

    .line 81
    const-string v10, "MixpanelAPI.Snapshot"

    const-string v11, "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent."

    invoke-static {v10, v11, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 83
    .end local v2    # "e":Ljava/util/concurrent/TimeoutException;
    :catch_2
    move-exception v2

    .line 84
    .local v2, "e":Ljava/util/concurrent/ExecutionException;
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_0

    .line 85
    const-string v10, "MixpanelAPI.Snapshot"

    const-string v11, "Exception thrown during screenshot attempt"

    invoke-static {v10, v11, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 91
    .end local v2    # "e":Ljava/util/concurrent/ExecutionException;
    .restart local v3    # "i":I
    .restart local v5    # "infoCount":I
    :cond_1
    if-lez v3, :cond_2

    .line 92
    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 94
    :cond_2
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;

    .line 95
    .local v4, "info":Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;
    const-string v10, "{"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 96
    const-string v10, "\"activity\":"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 97
    iget-object v10, v4, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->activityName:Ljava/lang/String;

    invoke-static {v10}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 98
    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 99
    const-string v10, "\"scale\":"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 100
    const-string v10, "%s"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    iget v13, v4, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->scale:F

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 101
    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 102
    const-string v10, "\"serialized_objects\":"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 104
    new-instance v8, Landroid/util/JsonWriter;

    invoke-direct {v8, v9}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 105
    .local v8, "j":Landroid/util/JsonWriter;
    invoke-virtual {v8}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 106
    const-string v10, "rootObject"

    invoke-virtual {v8, v10}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v10

    iget-object v11, v4, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->rootView:Landroid/view/View;

    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    move-result v11

    int-to-long v12, v11

    invoke-virtual {v10, v12, v13}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 107
    const-string v10, "objects"

    invoke-virtual {v8, v10}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 108
    iget-object v10, v4, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->rootView:Landroid/view/View;

    invoke-virtual {p0, v8, v10}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->snapshotViewHierarchy(Landroid/util/JsonWriter;Landroid/view/View;)V

    .line 109
    invoke-virtual {v8}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 110
    invoke-virtual {v8}, Landroid/util/JsonWriter;->flush()V

    .line 112
    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 113
    const-string v10, "\"screenshot\":"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v9}, Ljava/io/OutputStreamWriter;->flush()V

    .line 115
    iget-object v10, v4, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$RootViewInfo;->screenshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;

    sget-object v11, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v12, 0x64

    move-object/from16 v0, p2

    invoke-virtual {v10, v11, v12, v0}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot$CachedBitmap;->writeBitmapJSON(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)V

    .line 116
    const-string v10, "}"

    invoke-virtual {v9, v10}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 90
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1
.end method
