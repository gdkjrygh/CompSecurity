.class public Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;
.super Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;
.source "ViewVisitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AddAccessibilityEventVisitor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;
    }
.end annotation


# instance fields
.field private final mEventType:I

.field private final mWatching:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;ILjava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)V
    .locals 1
    .param p2, "accessibilityEventType"    # I
    .param p3, "eventName"    # Ljava/lang/String;
    .param p4, "listener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 359
    .local p1, "path":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;>;"
    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, p4, v0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$EventTriggeringVisitor;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;Z)V

    .line 360
    iput p2, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mEventType:I

    .line 361
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mWatching:Ljava/util/WeakHashMap;

    .line 362
    return-void
.end method

.method static synthetic access$1(Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;)I
    .locals 1

    .prologue
    .line 465
    iget v0, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mEventType:I

    return v0
.end method

.method private getOldDelegate(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 405
    const/4 v4, 0x0

    .line 407
    .local v4, "ret":Landroid/view/View$AccessibilityDelegate;
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 408
    .local v2, "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v5, "getAccessibilityDelegate"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Class;

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 409
    .local v3, "m":Ljava/lang/reflect/Method;
    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v5

    check-cast v0, Landroid/view/View$AccessibilityDelegate;

    move-object v4, v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    .end local v2    # "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "m":Ljava/lang/reflect/Method;
    :goto_0
    return-object v4

    .line 414
    :catch_0
    move-exception v1

    .line 415
    .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    const-string v5, "MixpanelAPI.ViewVisitor"

    const-string v6, "getAccessibilityDelegate threw an exception when called."

    invoke-static {v5, v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 412
    .end local v1    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_1
    move-exception v5

    goto :goto_0

    .line 410
    :catch_2
    move-exception v5

    goto :goto_0
.end method


# virtual methods
.method public accumulate(Landroid/view/View;)V
    .locals 4
    .param p1, "found"    # Landroid/view/View;

    .prologue
    .line 385
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->getOldDelegate(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v2

    .line 386
    .local v2, "realDelegate":Landroid/view/View$AccessibilityDelegate;
    instance-of v3, v2, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;

    if-eqz v3, :cond_0

    move-object v0, v2

    .line 387
    check-cast v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;

    .line 388
    .local v0, "currentTracker":Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;
    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->getEventName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;->willFireEvent(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 397
    .end local v0    # "currentTracker":Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;
    :goto_0
    return-void

    .line 394
    :cond_0
    new-instance v1, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;

    invoke-direct {v1, p0, v2}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;-><init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;Landroid/view/View$AccessibilityDelegate;)V

    .line 395
    .local v1, "newDelegate":Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;
    invoke-virtual {p1, v1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 396
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mWatching:Ljava/util/WeakHashMap;

    invoke-virtual {v3, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public cleanup()V
    .locals 7

    .prologue
    .line 366
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mWatching:Ljava/util/WeakHashMap;

    invoke-virtual {v5}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 380
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mWatching:Ljava/util/WeakHashMap;

    invoke-virtual {v5}, Ljava/util/WeakHashMap;->clear()V

    .line 381
    return-void

    .line 366
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 367
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Landroid/view/View;Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 368
    .local v4, "v":Landroid/view/View;
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;

    .line 369
    .local v3, "toCleanup":Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;
    invoke-direct {p0, v4}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->getOldDelegate(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    .line 370
    .local v0, "currentViewDelegate":Landroid/view/View$AccessibilityDelegate;
    if-ne v0, v3, :cond_2

    .line 371
    invoke-virtual {v3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;->getRealDelegate()Landroid/view/View$AccessibilityDelegate;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    goto :goto_0

    .line 372
    :cond_2
    instance-of v6, v0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;

    if-eqz v6, :cond_0

    move-object v2, v0

    .line 373
    check-cast v2, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;

    .line 374
    .local v2, "newChain":Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;
    invoke-virtual {v2, v3}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;->removeFromDelegateChain(Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor$TrackingAccessibilityDelegate;)V

    goto :goto_0
.end method

.method protected name()Ljava/lang/String;
    .locals 2

    .prologue
    .line 401
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " event when ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mixpanel/android/viewcrawler/ViewVisitor$AddAccessibilityEventVisitor;->mEventType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

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
