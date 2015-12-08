.class public Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;
.super Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AddTextChangeListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;
    }
.end annotation


# instance fields
.field private final mWatching:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/widget/TextView;",
            "Landroid/text/TextWatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V
    .locals 1
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "listener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 474
    .local p1, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;Z)V

    .line 475
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->mWatching:Ljava/util/Map;

    .line 476
    return-void
.end method


# virtual methods
.method public accumulate(Landroid/view/View;)V
    .locals 4
    .param p1, "found"    # Landroid/view/View;

    .prologue
    .line 491
    instance-of v3, p1, Landroid/widget/TextView;

    if-eqz v3, :cond_1

    move-object v0, p1

    .line 492
    check-cast v0, Landroid/widget/TextView;

    .line 493
    .local v0, "foundTextView":Landroid/widget/TextView;
    new-instance v2, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;

    invoke-direct {v2, p0, v0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener$TrackingTextWatcher;-><init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;Landroid/view/View;)V

    .line 494
    .local v2, "watcher":Landroid/text/TextWatcher;
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->mWatching:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/TextWatcher;

    .line 495
    .local v1, "oldWatcher":Landroid/text/TextWatcher;
    if-eqz v1, :cond_0

    .line 496
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 498
    :cond_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 499
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->mWatching:Ljava/util/Map;

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .end local v0    # "foundTextView":Landroid/widget/TextView;
    .end local v1    # "oldWatcher":Landroid/text/TextWatcher;
    .end local v2    # "watcher":Landroid/text/TextWatcher;
    :cond_1
    return-void
.end method

.method public cleanup()V
    .locals 5

    .prologue
    .line 480
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->mWatching:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    .line 486
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->mWatching:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 487
    return-void

    .line 480
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 481
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Landroid/widget/TextView;Landroid/text/TextWatcher;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 482
    .local v1, "v":Landroid/widget/TextView;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/text/TextWatcher;

    .line 483
    .local v2, "watcher":Landroid/text/TextWatcher;
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0
.end method

.method protected name()Ljava/lang/String;
    .locals 2

    .prologue
    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddTextChangeListener;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " on Text Change"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;->visit(Landroid/view/View;)V

    return-void
.end method
