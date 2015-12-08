.class Lcom/mixpanel/android/viewcrawler/EditState;
.super Lcom/mixpanel/android/viewcrawler/UIThreadSet;
.source "EditState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mixpanel/android/viewcrawler/UIThreadSet",
        "<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.EditState"


# instance fields
.field private final mCurrentEdits:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final mIntendedEdits:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mUiThreadHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/UIThreadSet;-><init>()V

    .line 26
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mUiThreadHandler:Landroid/os/Handler;

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    .line 28
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mCurrentEdits:Ljava/util/Set;

    .line 29
    return-void
.end method

.method static synthetic access$2(Lcom/mixpanel/android/viewcrawler/EditState;)V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/EditState;->applyIntendedEdits()V

    return-void
.end method

.method private applyChangesFromList(Landroid/view/View;Ljava/util/List;)V
    .locals 6
    .param p1, "rootView"    # Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 119
    .local p2, "changes":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mCurrentEdits:Ljava/util/Set;

    monitor-enter v5

    .line 120
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    .line 121
    .local v2, "size":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v2, :cond_0

    .line 119
    monitor-exit v5

    .line 127
    return-void

    .line 122
    :cond_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    .line 123
    .local v3, "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    new-instance v0, Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;

    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mUiThreadHandler:Landroid/os/Handler;

    invoke-direct {v0, p1, v3, v4}, Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;-><init>(Landroid/view/View;Lcom/mixpanel/android/viewcrawler/ViewVisitor;Landroid/os/Handler;)V

    .line 124
    .local v0, "binding":Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mCurrentEdits:Ljava/util/Set;

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 121
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 119
    .end local v0    # "binding":Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;
    .end local v1    # "i":I
    .end local v2    # "size":I
    .end local v3    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    :catchall_0
    move-exception v4

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method

.method private applyEditsOnUiThread()V
    .locals 2

    .prologue
    .line 82
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mUiThreadHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 83
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/EditState;->applyIntendedEdits()V

    .line 92
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mUiThreadHandler:Landroid/os/Handler;

    new-instance v1, Lcom/mixpanel/android/viewcrawler/EditState$1;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/viewcrawler/EditState$1;-><init>(Lcom/mixpanel/android/viewcrawler/EditState;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private applyIntendedEdits()V
    .locals 9

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/mixpanel/android/viewcrawler/EditState;->getAll()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 115
    return-void

    .line 96
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 97
    .local v0, "activity":Landroid/app/Activity;
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    .line 98
    .local v1, "activityName":Ljava/lang/String;
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    .line 102
    .local v2, "rootView":Landroid/view/View;
    iget-object v6, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    monitor-enter v6

    .line 103
    :try_start_0
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 104
    .local v3, "specificChanges":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    const/4 v8, 0x0

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 102
    .local v4, "wildcardChanges":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    if-eqz v3, :cond_2

    .line 108
    invoke-direct {p0, v2, v3}, Lcom/mixpanel/android/viewcrawler/EditState;->applyChangesFromList(Landroid/view/View;Ljava/util/List;)V

    .line 111
    :cond_2
    if-eqz v4, :cond_0

    .line 112
    invoke-direct {p0, v2, v4}, Lcom/mixpanel/android/viewcrawler/EditState;->applyChangesFromList(Landroid/view/View;Ljava/util/List;)V

    goto :goto_0

    .line 102
    .end local v3    # "specificChanges":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    .end local v4    # "wildcardChanges":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    :catchall_0
    move-exception v5

    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5
.end method


# virtual methods
.method public add(Landroid/app/Activity;)V
    .locals 0
    .param p1, "newOne"    # Landroid/app/Activity;

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/mixpanel/android/viewcrawler/UIThreadSet;->add(Ljava/lang/Object;)V

    .line 37
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/EditState;->applyEditsOnUiThread()V

    .line 38
    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/mixpanel/android/viewcrawler/EditState;->add(Landroid/app/Activity;)V

    return-void
.end method

.method public remove(Landroid/app/Activity;)V
    .locals 0
    .param p1, "oldOne"    # Landroid/app/Activity;

    .prologue
    .line 45
    invoke-super {p0, p1}, Lcom/mixpanel/android/viewcrawler/UIThreadSet;->remove(Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/mixpanel/android/viewcrawler/EditState;->remove(Landroid/app/Activity;)V

    return-void
.end method

.method public setEdits(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 66
    .local p1, "newEdits":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;>;"
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mCurrentEdits:Ljava/util/Set;

    monitor-enter v2

    .line 67
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mCurrentEdits:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 70
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mCurrentEdits:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 66
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    monitor-enter v2

    .line 74
    :try_start_1
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 75
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditState;->mIntendedEdits:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 73
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/EditState;->applyEditsOnUiThread()V

    .line 79
    return-void

    .line 67
    :cond_0
    :try_start_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;

    .line 68
    .local v0, "stale":Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;
    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;->kill()V

    goto :goto_0

    .line 66
    .end local v0    # "stale":Lcom/mixpanel/android/viewcrawler/EditState$EditBinding;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 73
    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method
