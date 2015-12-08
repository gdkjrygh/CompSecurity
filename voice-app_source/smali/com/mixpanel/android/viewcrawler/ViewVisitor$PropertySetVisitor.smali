.class public Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;
.super Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PropertySetVisitor"
.end annotation


# instance fields
.field private final mAccessor:Lcom/mixpanel/android/viewcrawler/Caller;

.field private final mMutator:Lcom/mixpanel/android/viewcrawler/Caller;

.field private final mOriginalValueHolder:[Ljava/lang/Object;

.field private final mOriginalValues:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/mixpanel/android/viewcrawler/Caller;Lcom/mixpanel/android/viewcrawler/Caller;)V
    .locals 1
    .param p2, "mutator"    # Lcom/mixpanel/android/viewcrawler/Caller;
    .param p3, "accessor"    # Lcom/mixpanel/android/viewcrawler/Caller;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;",
            "Lcom/mixpanel/android/viewcrawler/Caller;",
            "Lcom/mixpanel/android/viewcrawler/Caller;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    .local p1, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor;-><init>(Ljava/util/List;)V

    .line 72
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mMutator:Lcom/mixpanel/android/viewcrawler/Caller;

    .line 73
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mAccessor:Lcom/mixpanel/android/viewcrawler/Caller;

    .line 74
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValueHolder:[Ljava/lang/Object;

    .line 75
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    .line 76
    return-void
.end method


# virtual methods
.method public accumulate(Landroid/view/View;)V
    .locals 8
    .param p1, "found"    # Landroid/view/View;

    .prologue
    const/4 v7, 0x0

    .line 92
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mAccessor:Lcom/mixpanel/android/viewcrawler/Caller;

    if-eqz v5, :cond_3

    .line 93
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mMutator:Lcom/mixpanel/android/viewcrawler/Caller;

    invoke-virtual {v5}, Lcom/mixpanel/android/viewcrawler/Caller;->getArgs()[Ljava/lang/Object;

    move-result-object v4

    .line 94
    .local v4, "setArgs":[Ljava/lang/Object;
    const/4 v5, 0x1

    array-length v6, v4

    if-ne v5, v6, :cond_3

    .line 95
    aget-object v3, v4, v7

    .line 96
    .local v3, "desiredValue":Ljava/lang/Object;
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mAccessor:Lcom/mixpanel/android/viewcrawler/Caller;

    invoke-virtual {v5, p1}, Lcom/mixpanel/android/viewcrawler/Caller;->applyMethod(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    .line 98
    .local v1, "currentValue":Ljava/lang/Object;
    if-ne v3, v1, :cond_1

    .line 136
    .end local v1    # "currentValue":Ljava/lang/Object;
    .end local v3    # "desiredValue":Ljava/lang/Object;
    .end local v4    # "setArgs":[Ljava/lang/Object;
    :cond_0
    :goto_0
    return-void

    .line 102
    .restart local v1    # "currentValue":Ljava/lang/Object;
    .restart local v3    # "desiredValue":Ljava/lang/Object;
    .restart local v4    # "setArgs":[Ljava/lang/Object;
    :cond_1
    if-eqz v3, :cond_2

    .line 103
    instance-of v5, v3, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_4

    instance-of v5, v1, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_4

    move-object v2, v3

    .line 104
    check-cast v2, Landroid/graphics/Bitmap;

    .local v2, "desiredBitmap":Landroid/graphics/Bitmap;
    move-object v0, v1

    .line 105
    check-cast v0, Landroid/graphics/Bitmap;

    .line 106
    .local v0, "currentBitmap":Landroid/graphics/Bitmap;
    invoke-virtual {v2, v0}, Landroid/graphics/Bitmap;->sameAs(Landroid/graphics/Bitmap;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 120
    .end local v0    # "currentBitmap":Landroid/graphics/Bitmap;
    .end local v2    # "desiredBitmap":Landroid/graphics/Bitmap;
    .end local v3    # "desiredValue":Ljava/lang/Object;
    :cond_2
    instance-of v5, v1, Landroid/graphics/Bitmap;

    if-nez v5, :cond_3

    .line 121
    instance-of v5, v1, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v5, :cond_3

    .line 122
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    invoke-virtual {v5, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 135
    .end local v1    # "currentValue":Ljava/lang/Object;
    .end local v4    # "setArgs":[Ljava/lang/Object;
    :cond_3
    :goto_1
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mMutator:Lcom/mixpanel/android/viewcrawler/Caller;

    invoke-virtual {v5, p1}, Lcom/mixpanel/android/viewcrawler/Caller;->applyMethod(Landroid/view/View;)Ljava/lang/Object;

    goto :goto_0

    .line 109
    .restart local v1    # "currentValue":Ljava/lang/Object;
    .restart local v3    # "desiredValue":Ljava/lang/Object;
    .restart local v4    # "setArgs":[Ljava/lang/Object;
    :cond_4
    instance-of v5, v3, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v5, :cond_5

    instance-of v5, v1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v5, :cond_5

    .line 110
    check-cast v3, Landroid/graphics/drawable/BitmapDrawable;

    .end local v3    # "desiredValue":Ljava/lang/Object;
    invoke-virtual {v3}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .restart local v2    # "desiredBitmap":Landroid/graphics/Bitmap;
    move-object v5, v1

    .line 111
    check-cast v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 112
    .restart local v0    # "currentBitmap":Landroid/graphics/Bitmap;
    if-eqz v2, :cond_2

    invoke-virtual {v2, v0}, Landroid/graphics/Bitmap;->sameAs(Landroid/graphics/Bitmap;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 115
    .end local v0    # "currentBitmap":Landroid/graphics/Bitmap;
    .end local v2    # "desiredBitmap":Landroid/graphics/Bitmap;
    .restart local v3    # "desiredValue":Ljava/lang/Object;
    :cond_5
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 125
    .end local v3    # "desiredValue":Ljava/lang/Object;
    :cond_6
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValueHolder:[Ljava/lang/Object;

    aput-object v1, v5, v7

    .line 126
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mMutator:Lcom/mixpanel/android/viewcrawler/Caller;

    iget-object v6, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValueHolder:[Ljava/lang/Object;

    invoke-virtual {v5, v6}, Lcom/mixpanel/android/viewcrawler/Caller;->argsAreApplicable([Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 127
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    invoke-virtual {v5, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 129
    :cond_7
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    const/4 v6, 0x0

    invoke-virtual {v5, p1, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public cleanup()V
    .locals 6

    .prologue
    .line 80
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValues:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 88
    return-void

    .line 80
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 81
    .local v1, "original":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Landroid/view/View;Ljava/lang/Object;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 82
    .local v0, "changedView":Landroid/view/View;
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 83
    .local v2, "originalValue":Ljava/lang/Object;
    if-eqz v2, :cond_0

    .line 84
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValueHolder:[Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    .line 85
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mMutator:Lcom/mixpanel/android/viewcrawler/Caller;

    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$PropertySetVisitor;->mOriginalValueHolder:[Ljava/lang/Object;

    invoke-virtual {v4, v0, v5}, Lcom/mixpanel/android/viewcrawler/Caller;->applyMethodWithArguments(Landroid/view/View;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected name()Ljava/lang/String;
    .locals 1

    .prologue
    .line 139
    const-string v0, "Property Mutator"

    return-object v0
.end method

.method public bridge synthetic visit(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor;->visit(Landroid/view/View;)V

    return-void
.end method
