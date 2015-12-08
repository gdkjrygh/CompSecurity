.class public Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;
.super Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutUpdateVisitor"
.end annotation


# static fields
.field private static final mHorizontalRules:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final mVerticalRules:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mAlive:Z

.field private final mArgs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;",
            ">;"
        }
    .end annotation
.end field

.field private final mCycleDetector:Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;

.field private final mName:Ljava/lang/String;

.field private final mOnLayoutErrorListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

.field private final mOriginalValues:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "[I>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 328
    new-instance v0, Ljava/util/HashSet;

    new-array v1, v7, [Ljava/lang/Integer;

    .line 329
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 330
    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v6

    .line 328
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mHorizontalRules:Ljava/util/Set;

    .line 332
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Integer;

    .line 333
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 334
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v6

    .line 335
    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v7

    .line 332
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mVerticalRules:Ljava/util/Set;

    .line 336
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;)V
    .locals 2
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "onLayoutErrorListener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 196
    .local p1, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    .local p2, "args":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;>;"
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor;-><init>(Ljava/util/List;)V

    .line 197
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    .line 198
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mArgs:Ljava/util/List;

    .line 199
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mName:Ljava/lang/String;

    .line 200
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mAlive:Z

    .line 201
    iput-object p4, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mOnLayoutErrorListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

    .line 202
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;-><init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mCycleDetector:Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;

    .line 203
    return-void
.end method

.method private verifyLayout(Ljava/util/Set;Landroid/util/SparseArray;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/view/View;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 289
    .local p1, "rules":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    .local p2, "idToChild":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/view/View;>;"
    new-instance v3, Ljava/util/TreeMap;

    new-instance v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor$1;

    invoke-direct {v9, p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor$1;-><init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;)V

    invoke-direct {v3, v9}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 303
    .local v3, "dependencyGraph":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Landroid/view/View;Ljava/util/List<Landroid/view/View;>;>;"
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v8

    .line 304
    .local v8, "size":I
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_0
    if-lt v5, v8, :cond_0

    .line 320
    iget-object v9, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mCycleDetector:Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;

    invoke-virtual {v9, v3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;->hasCycle(Ljava/util/TreeMap;)Z

    move-result v9

    return v9

    .line 305
    :cond_0
    invoke-virtual {p2, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 306
    .local v0, "child":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 307
    .local v1, "childLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    invoke-virtual {v1}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    move-result-object v6

    .line 309
    .local v6, "layoutRules":[I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 310
    .local v2, "dependencies":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_1
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    .line 317
    invoke-virtual {v3, v0, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 310
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 311
    .local v7, "rule":I
    aget v4, v6, v7

    .line 312
    .local v4, "dependencyId":I
    if-lez v4, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v9

    if-eq v4, v9, :cond_1

    .line 313
    invoke-virtual {p2, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method


# virtual methods
.method public accumulate(Landroid/view/View;)V
    .locals 17
    .param p1, "found"    # Landroid/view/View;

    .prologue
    .line 233
    move-object/from16 v10, p1

    check-cast v10, Landroid/view/ViewGroup;

    .line 234
    .local v10, "parent":Landroid/view/ViewGroup;
    new-instance v8, Landroid/util/SparseArray;

    invoke-direct {v8}, Landroid/util/SparseArray;-><init>()V

    .line 236
    .local v8, "idToChild":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/view/View;>;"
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    .line 237
    .local v3, "count":I
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_0
    if-lt v7, v3, :cond_0

    .line 245
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mArgs:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v12

    .line 246
    .local v12, "size":I
    const/4 v7, 0x0

    :goto_1
    if-lt v7, v12, :cond_2

    .line 285
    :goto_2
    return-void

    .line 238
    .end local v12    # "size":I
    :cond_0
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 239
    .local v1, "child":Landroid/view/View;
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v2

    .line 240
    .local v2, "childId":I
    if-lez v2, :cond_1

    .line 241
    invoke-virtual {v8, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 237
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 247
    .end local v1    # "child":Landroid/view/View;
    .end local v2    # "childId":I
    .restart local v12    # "size":I
    :cond_2
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mArgs:Ljava/util/List;

    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;

    .line 248
    .local v9, "layoutRule":Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;
    iget v13, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->viewId:I

    invoke-virtual {v8, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 249
    .local v4, "currentChild":Landroid/view/View;
    if-nez v4, :cond_4

    .line 246
    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 253
    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 254
    .local v5, "currentParams":Landroid/widget/RelativeLayout$LayoutParams;
    invoke-virtual {v5}, Landroid/widget/RelativeLayout$LayoutParams;->getRules()[I

    move-result-object v13

    invoke-virtual {v13}, [I->clone()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    .line 256
    .local v6, "currentRules":[I
    iget v13, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->verb:I

    aget v13, v6, v13

    iget v14, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->anchor:I

    if-eq v13, v14, :cond_3

    .line 260
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    invoke-virtual {v13, v4}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    .line 266
    :goto_4
    iget v13, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->verb:I

    iget v14, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->anchor:I

    invoke-virtual {v5, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 269
    sget-object v13, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mHorizontalRules:Ljava/util/Set;

    iget v14, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->verb:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    .line 270
    sget-object v11, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mHorizontalRules:Ljava/util/Set;

    .line 277
    .local v11, "rules":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    :goto_5
    if-eqz v11, :cond_8

    move-object/from16 v0, p0

    invoke-direct {v0, v11, v8}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->verifyLayout(Ljava/util/Set;Landroid/util/SparseArray;)Z

    move-result v13

    if-nez v13, :cond_8

    .line 278
    invoke-virtual/range {p0 .. p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->cleanup()V

    .line 279
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mOnLayoutErrorListener:Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

    new-instance v14, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;

    const-string v15, "circular_dependency"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mName:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-direct/range {v14 .. v16}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v13, v14}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;->onLayoutError(Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;)V

    goto/16 :goto_2

    .line 263
    .end local v11    # "rules":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    :cond_5
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    invoke-virtual {v13, v4, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 271
    :cond_6
    sget-object v13, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mVerticalRules:Ljava/util/Set;

    iget v14, v9, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutRule;->verb:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 272
    sget-object v11, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mVerticalRules:Ljava/util/Set;

    .line 273
    .restart local v11    # "rules":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    goto :goto_5

    .line 274
    .end local v11    # "rules":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    :cond_7
    const/4 v11, 0x0

    .restart local v11    # "rules":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    goto :goto_5

    .line 283
    :cond_8
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3
.end method

.method public cleanup()V
    .locals 7

    .prologue
    .line 208
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    invoke-virtual {v5}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_0

    .line 217
    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mAlive:Z

    .line 218
    return-void

    .line 208
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 209
    .local v2, "original":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Landroid/view/View;[I>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 210
    .local v0, "changedView":Landroid/view/View;
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    .line 211
    .local v4, "originalValue":[I
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 212
    .local v3, "originalParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    array-length v6, v4

    if-lt v1, v6, :cond_1

    .line 215
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 213
    :cond_1
    aget v6, v4, v1

    invoke-virtual {v3, v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 212
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method protected name()Ljava/lang/String;
    .locals 1

    .prologue
    .line 323
    const-string v0, "Layout Update"

    return-object v0
.end method

.method public visit(Landroid/view/View;)V
    .locals 2
    .param p1, "rootView"    # Landroid/view/View;

    .prologue
    .line 225
    iget-boolean v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->mAlive:Z

    if-eqz v0, :cond_0

    .line 226
    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->getPathfinder()Lcom/mixpanel/android/viewcrawler/Pathfinder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutUpdateVisitor;->getPath()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p0}, Lcom/mixpanel/android/viewcrawler/Pathfinder;->findTargetsInRoot(Landroid/view/View;Ljava/util/List;Lcom/mixpanel/android/viewcrawler/Pathfinder$Accumulator;)V

    .line 228
    :cond_0
    return-void
.end method
