.class Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;
.super Ljava/lang/Object;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CycleDetector"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;)V
    .locals 0

    .prologue
    .line 148
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;-><init>()V

    return-void
.end method

.method private detectSubgraphCycle(Ljava/util/TreeMap;Landroid/view/View;Ljava/util/List;)Z
    .locals 5
    .param p2, "currentNode"    # Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeMap",
            "<",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;>;",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "dependencyGraph":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Landroid/view/View;Ljava/util/List<Landroid/view/View;>;>;"
    .local p3, "dfsStack":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    const/4 v4, 0x0

    .line 171
    invoke-interface {p3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    .line 189
    :goto_0
    return v3

    .line 175
    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 176
    invoke-virtual {p1, p2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 177
    .local v0, "dependencies":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 180
    .local v2, "size":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    if-lt v1, v2, :cond_2

    .line 186
    invoke-interface {p3, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 189
    .end local v0    # "dependencies":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    .end local v1    # "i":I
    .end local v2    # "size":I
    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    .line 181
    .restart local v0    # "dependencies":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    .restart local v1    # "i":I
    .restart local v2    # "size":I
    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-direct {p0, p1, v3, p3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;->detectSubgraphCycle(Ljava/util/TreeMap;Landroid/view/View;Ljava/util/List;)Z

    move-result v3

    if-nez v3, :cond_3

    move v3, v4

    .line 182
    goto :goto_0

    .line 180
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method


# virtual methods
.method public hasCycle(Ljava/util/TreeMap;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeMap",
            "<",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;>;)Z"
        }
    .end annotation

    .prologue
    .line 158
    .local p1, "dependencyGraph":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Landroid/view/View;Ljava/util/List<Landroid/view/View;>;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .local v1, "dfsStack":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    :cond_0
    invoke-virtual {p1}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 166
    const/4 v2, 0x1

    :goto_0
    return v2

    .line 160
    :cond_1
    invoke-virtual {p1}, Ljava/util/TreeMap;->firstKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 161
    .local v0, "currentNode":Landroid/view/View;
    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$CycleDetector;->detectSubgraphCycle(Ljava/util/TreeMap;Landroid/view/View;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 162
    const/4 v2, 0x0

    goto :goto_0
.end method
