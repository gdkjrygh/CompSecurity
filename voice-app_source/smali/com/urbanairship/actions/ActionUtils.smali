.class public Lcom/urbanairship/actions/ActionUtils;
.super Ljava/lang/Object;
.source "ActionUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs containsRegisteredActions(Landroid/os/Bundle;[Ljava/lang/String;)Z
    .locals 9
    .param p0, "bundle"    # Landroid/os/Bundle;
    .param p1, "actionNames"    # [Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 62
    if-eqz p1, :cond_0

    array-length v8, p1

    if-nez v8, :cond_1

    .line 85
    :cond_0
    :goto_0
    return v7

    .line 67
    :cond_1
    invoke-static {p0}, Lcom/urbanairship/actions/ActionUtils;->parseActionNames(Landroid/os/Bundle;)Ljava/util/Set;

    move-result-object v3

    .line 69
    .local v3, "bundleActionNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_0

    .line 75
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 76
    .local v1, "allActionNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    move-object v2, p1

    .local v2, "arr$":[Ljava/lang/String;
    array-length v6, v2

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_1
    if-ge v5, v6, :cond_3

    aget-object v0, v2, v5

    .line 77
    .local v0, "actionName":Ljava/lang/String;
    invoke-static {}, Lcom/urbanairship/actions/ActionRegistry;->shared()Lcom/urbanairship/actions/ActionRegistry;

    move-result-object v7

    invoke-virtual {v7, v0}, Lcom/urbanairship/actions/ActionRegistry;->getEntry(Ljava/lang/String;)Lcom/urbanairship/actions/ActionRegistry$Entry;

    move-result-object v4

    .line 78
    .local v4, "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    if-eqz v4, :cond_2

    .line 79
    invoke-virtual {v4}, Lcom/urbanairship/actions/ActionRegistry$Entry;->getNames()Ljava/util/List;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 76
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 85
    .end local v0    # "actionName":Ljava/lang/String;
    .end local v4    # "entry":Lcom/urbanairship/actions/ActionRegistry$Entry;
    :cond_3
    invoke-interface {v1, v3}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result v7

    goto :goto_0
.end method

.method public static parseActionNames(Landroid/os/Bundle;)Ljava/util/Set;
    .locals 6
    .param p0, "bundle"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 95
    const-string v4, "com.urbanairship.actions"

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 97
    .local v2, "actionsPayload":Ljava/lang/String;
    invoke-static {v2}, Lcom/urbanairship/util/UAStringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 98
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v4

    .line 109
    :goto_0
    return-object v4

    .line 104
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 105
    .local v0, "actionsJSON":Lorg/json/JSONObject;
    invoke-static {v0}, Lcom/urbanairship/util/JSONUtils;->convertToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    .line 106
    .local v1, "actionsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    goto :goto_0

    .line 107
    .end local v0    # "actionsJSON":Lorg/json/JSONObject;
    .end local v1    # "actionsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :catch_0
    move-exception v3

    .line 108
    .local v3, "e":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid actions payload: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->info(Ljava/lang/String;)V

    .line 109
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v4

    goto :goto_0
.end method
