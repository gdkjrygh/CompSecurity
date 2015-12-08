.class public final Lcom/urbanairship/actions/ActionRegistry;
.super Ljava/lang/Object;
.source "ActionRegistry.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/actions/ActionRegistry$Entry;
    }
.end annotation


# static fields
.field private static final LANDING_PAGE_CACHE_OPEN_TIME_LIMIT_MS:J = 0x240c8400L

.field private static instance:Lcom/urbanairship/actions/ActionRegistry;


# instance fields
.field private actionMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/urbanairship/actions/ActionRegistry$Entry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    new-instance v0, Lcom/urbanairship/actions/ActionRegistry;

    invoke-direct {v0}, Lcom/urbanairship/actions/ActionRegistry;-><init>()V

    sput-object v0, Lcom/urbanairship/actions/ActionRegistry;->instance:Lcom/urbanairship/actions/ActionRegistry;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    .line 58
    return-void
.end method

.method public static shared()Lcom/urbanairship/actions/ActionRegistry;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lcom/urbanairship/actions/ActionRegistry;->instance:Lcom/urbanairship/actions/ActionRegistry;

    return-object v0
.end method


# virtual methods
.method public getEntries()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/urbanairship/actions/ActionRegistry$Entry;",
            ">;"
        }
    .end annotation

    .prologue
    .line 144
    iget-object v1, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    monitor-enter v1

    .line 145
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v2, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v1

    return-object v0

    .line 146
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getEntry(Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 130
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    const/4 v0, 0x0

    .line 135
    :goto_0
    return-object v0

    .line 134
    :cond_0
    iget-object v1, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    monitor-enter v1

    .line 135
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/actions/ActionRegistry$Entry;

    monitor-exit v1

    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public varargs registerAction(Lcom/urbanairship/actions/Action;[Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;
    .locals 8
    .param p1, "action"    # Lcom/urbanairship/actions/Action;
    .param p2, "names"    # [Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 80
    if-nez p1, :cond_0

    .line 81
    const-string v6, "Unable to register null action"

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 118
    :goto_0
    return-object v1

    .line 86
    :cond_0
    if-eqz p2, :cond_1

    array-length v6, p2

    if-nez v6, :cond_2

    .line 87
    :cond_1
    const-string v6, "A name is required to register an action"

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_2
    move-object v0, p2

    .local v0, "arr$":[Ljava/lang/String;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_4

    aget-object v5, v0, v3

    .line 93
    .local v5, "name":Ljava/lang/String;
    invoke-static {v5}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 94
    const-string v6, "Unable to register action because one or more of the names was null or empty."

    invoke-static {v6}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 100
    .end local v5    # "name":Ljava/lang/String;
    :cond_4
    iget-object v7, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    monitor-enter v7

    .line 102
    :try_start_0
    new-instance v1, Lcom/urbanairship/actions/ActionRegistry$Entry;

    const/4 v6, 0x0

    invoke-direct {v1, p1, p2, v6}, Lcom/urbanairship/actions/ActionRegistry$Entry;-><init>(Lcom/urbanairship/actions/Action;[Ljava/lang/String;Lcom/urbanairship/actions/ActionRegistry$1;)V

    .line 104
    .local v1, "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    move-object v0, p2

    array-length v4, v0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v4, :cond_7

    aget-object v5, v0, v3

    .line 106
    .restart local v5    # "name":Ljava/lang/String;
    invoke-static {v5}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 104
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 110
    :cond_5
    iget-object v6, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/urbanairship/actions/ActionRegistry$Entry;

    .line 111
    .local v2, "existingEntry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    if-eqz v2, :cond_6

    .line 112
    # invokes: Lcom/urbanairship/actions/ActionRegistry$Entry;->removeName(Ljava/lang/String;)V
    invoke-static {v2, v5}, Lcom/urbanairship/actions/ActionRegistry$Entry;->access$100(Lcom/urbanairship/actions/ActionRegistry$Entry;Ljava/lang/String;)V

    .line 115
    :cond_6
    iget-object v6, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    invoke-interface {v6, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 119
    .end local v1    # "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    .end local v2    # "existingEntry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    .end local v5    # "name":Ljava/lang/String;
    :catchall_0
    move-exception v6

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v6

    .line 118
    .restart local v1    # "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    :cond_7
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public registerDefaultActions()V
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 176
    new-instance v4, Lcom/urbanairship/actions/OpenExternalUrlAction;

    invoke-direct {v4}, Lcom/urbanairship/actions/OpenExternalUrlAction;-><init>()V

    new-array v5, v9, [Ljava/lang/String;

    const-string v6, "open_external_url_action"

    aput-object v6, v5, v7

    const-string v6, "^u"

    aput-object v6, v5, v8

    invoke-virtual {p0, v4, v5}, Lcom/urbanairship/actions/ActionRegistry;->registerAction(Lcom/urbanairship/actions/Action;[Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    .line 180
    new-instance v4, Lcom/urbanairship/actions/DeepLinkAction;

    invoke-direct {v4}, Lcom/urbanairship/actions/DeepLinkAction;-><init>()V

    new-array v5, v9, [Ljava/lang/String;

    const-string v6, "deep_link_action"

    aput-object v6, v5, v7

    const-string v6, "^d"

    aput-object v6, v5, v8

    invoke-virtual {p0, v4, v5}, Lcom/urbanairship/actions/ActionRegistry;->registerAction(Lcom/urbanairship/actions/Action;[Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    .line 184
    new-instance v4, Lcom/urbanairship/actions/LandingPageAction;

    invoke-direct {v4}, Lcom/urbanairship/actions/LandingPageAction;-><init>()V

    new-array v5, v9, [Ljava/lang/String;

    const-string v6, "landing_page_action"

    aput-object v6, v5, v7

    const-string v6, "^p"

    aput-object v6, v5, v8

    invoke-virtual {p0, v4, v5}, Lcom/urbanairship/actions/ActionRegistry;->registerAction(Lcom/urbanairship/actions/Action;[Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    move-result-object v1

    .line 188
    .local v1, "landingPageEntry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    new-instance v4, Lcom/urbanairship/actions/ActionRegistry$1;

    invoke-direct {v4, p0}, Lcom/urbanairship/actions/ActionRegistry$1;-><init>(Lcom/urbanairship/actions/ActionRegistry;)V

    invoke-virtual {v1, v4}, Lcom/urbanairship/actions/ActionRegistry$Entry;->setPredicate(Lcom/android/internal/util/Predicate;)V

    .line 199
    new-instance v2, Lcom/urbanairship/actions/ActionRegistry$2;

    invoke-direct {v2, p0}, Lcom/urbanairship/actions/ActionRegistry$2;-><init>(Lcom/urbanairship/actions/ActionRegistry;)V

    .line 206
    .local v2, "rejectPushReceivedPredicate":Lcom/android/internal/util/Predicate;, "Lcom/android/internal/util/Predicate<Lcom/urbanairship/actions/ActionArguments;>;"
    new-instance v4, Lcom/urbanairship/actions/tags/AddTagsAction;

    invoke-direct {v4}, Lcom/urbanairship/actions/tags/AddTagsAction;-><init>()V

    new-array v5, v9, [Ljava/lang/String;

    const-string v6, "add_tags_action"

    aput-object v6, v5, v7

    const-string v6, "^+t"

    aput-object v6, v5, v8

    invoke-virtual {p0, v4, v5}, Lcom/urbanairship/actions/ActionRegistry;->registerAction(Lcom/urbanairship/actions/Action;[Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    move-result-object v0

    .line 210
    .local v0, "addTagsEntry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    invoke-virtual {v0, v2}, Lcom/urbanairship/actions/ActionRegistry$Entry;->setPredicate(Lcom/android/internal/util/Predicate;)V

    .line 213
    new-instance v4, Lcom/urbanairship/actions/tags/RemoveTagsAction;

    invoke-direct {v4}, Lcom/urbanairship/actions/tags/RemoveTagsAction;-><init>()V

    new-array v5, v9, [Ljava/lang/String;

    const-string v6, "remove_tags_action"

    aput-object v6, v5, v7

    const-string v6, "^-t"

    aput-object v6, v5, v8

    invoke-virtual {p0, v4, v5}, Lcom/urbanairship/actions/ActionRegistry;->registerAction(Lcom/urbanairship/actions/Action;[Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    move-result-object v3

    .line 217
    .local v3, "removeTagsEntry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    invoke-virtual {v3, v2}, Lcom/urbanairship/actions/ActionRegistry$Entry;->setPredicate(Lcom/android/internal/util/Predicate;)V

    .line 218
    return-void
.end method

.method public unregisterAction(Ljava/lang/String;)V
    .locals 5
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 155
    invoke-static {p1}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 169
    :goto_0
    return-void

    .line 159
    :cond_0
    iget-object v4, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    monitor-enter v4

    .line 160
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/urbanairship/actions/ActionRegistry;->getEntry(Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    move-result-object v0

    .line 161
    .local v0, "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    if-nez v0, :cond_1

    .line 162
    monitor-exit v4

    goto :goto_0

    .line 168
    .end local v0    # "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .line 165
    .restart local v0    # "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lcom/urbanairship/actions/ActionRegistry$Entry;->getNames()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 166
    .local v1, "entryName":Ljava/lang/String;
    iget-object v3, p0, Lcom/urbanairship/actions/ActionRegistry;->actionMap:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 168
    .end local v1    # "entryName":Ljava/lang/String;
    :cond_2
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
