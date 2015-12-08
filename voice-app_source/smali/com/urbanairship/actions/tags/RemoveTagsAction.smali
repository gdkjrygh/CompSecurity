.class public Lcom/urbanairship/actions/tags/RemoveTagsAction;
.super Lcom/urbanairship/actions/tags/BaseTagsAction;
.source "RemoveTagsAction.java"


# static fields
.field public static final DEFAULT_REGISTRY_NAME:Ljava/lang/String; = "remove_tags_action"

.field public static final DEFAULT_REGISTRY_SHORT_NAME:Ljava/lang/String; = "^-t"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0}, Lcom/urbanairship/actions/tags/BaseTagsAction;-><init>()V

    .line 82
    return-void
.end method

.method public constructor <init>(Lcom/urbanairship/push/PushManager;)V
    .locals 0
    .param p1, "pushManager"    # Lcom/urbanairship/push/PushManager;

    .prologue
    .line 89
    invoke-direct {p0, p1}, Lcom/urbanairship/actions/tags/BaseTagsAction;-><init>(Lcom/urbanairship/push/PushManager;)V

    .line 90
    return-void
.end method


# virtual methods
.method public perform(Ljava/lang/String;Lcom/urbanairship/actions/ActionArguments;)Lcom/urbanairship/actions/ActionResult;
    .locals 4
    .param p1, "actionName"    # Ljava/lang/String;
    .param p2, "arguments"    # Lcom/urbanairship/actions/ActionArguments;

    .prologue
    .line 101
    invoke-virtual {p0, p2}, Lcom/urbanairship/actions/tags/RemoveTagsAction;->getTags(Lcom/urbanairship/actions/ActionArguments;)Ljava/util/Set;

    move-result-object v1

    .line 102
    .local v1, "tags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Removing tags: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lcom/urbanairship/actions/tags/RemoveTagsAction;->getPushManager()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getTags()Ljava/util/Set;

    move-result-object v0

    .line 105
    .local v0, "currentTags":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {v0, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 107
    invoke-virtual {p0}, Lcom/urbanairship/actions/tags/RemoveTagsAction;->getPushManager()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/urbanairship/push/PushManager;->setTags(Ljava/util/Set;)V

    .line 109
    invoke-static {}, Lcom/urbanairship/actions/ActionResult;->newEmptyResult()Lcom/urbanairship/actions/ActionResult;

    move-result-object v2

    return-object v2
.end method
