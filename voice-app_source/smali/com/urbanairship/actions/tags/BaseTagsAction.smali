.class public abstract Lcom/urbanairship/actions/tags/BaseTagsAction;
.super Lcom/urbanairship/actions/Action;
.source "BaseTagsAction.java"


# instance fields
.field private final pushManager:Lcom/urbanairship/push/PushManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/urbanairship/actions/tags/BaseTagsAction;-><init>(Lcom/urbanairship/push/PushManager;)V

    .line 45
    return-void
.end method

.method constructor <init>(Lcom/urbanairship/push/PushManager;)V
    .locals 0
    .param p1, "pushManager"    # Lcom/urbanairship/push/PushManager;

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/urbanairship/actions/Action;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/urbanairship/actions/tags/BaseTagsAction;->pushManager:Lcom/urbanairship/push/PushManager;

    .line 49
    return-void
.end method


# virtual methods
.method public acceptsArguments(Lcom/urbanairship/actions/ActionArguments;)Z
    .locals 1
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 61
    invoke-virtual {p0, p1}, Lcom/urbanairship/actions/tags/BaseTagsAction;->getTags(Lcom/urbanairship/actions/ActionArguments;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected getPushManager()Lcom/urbanairship/push/PushManager;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/urbanairship/actions/tags/BaseTagsAction;->pushManager:Lcom/urbanairship/push/PushManager;

    return-object v0
.end method

.method protected getTags(Lcom/urbanairship/actions/ActionArguments;)Ljava/util/Set;
    .locals 5
    .param p1, "arguments"    # Lcom/urbanairship/actions/ActionArguments;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/urbanairship/actions/ActionArguments;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 71
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 73
    .local v3, "value":Ljava/lang/Object;
    if-nez v3, :cond_1

    .line 93
    .end local v3    # "value":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-object v2

    .line 77
    .restart local v3    # "value":Ljava/lang/Object;
    :cond_1
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 78
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 79
    .local v2, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lcom/urbanairship/actions/ActionArguments;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 83
    .end local v2    # "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_2
    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_0

    .line 84
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 86
    .restart local v2    # "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    check-cast v3, Ljava/util/Collection;

    .end local v3    # "value":Ljava/lang/Object;
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 87
    .local v1, "tag":Ljava/lang/Object;
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method
