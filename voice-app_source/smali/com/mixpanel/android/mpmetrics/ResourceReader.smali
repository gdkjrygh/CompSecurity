.class public abstract Lcom/mixpanel/android/mpmetrics/ResourceReader;
.super Ljava/lang/Object;
.source "ResourceReader.java"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/ResourceIds;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/ResourceReader$Drawables;,
        Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;
    }
.end annotation


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.RsrcReader"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mIdNameToId:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mIdToIdName:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mContext:Landroid/content/Context;

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    .line 62
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdToIdName:Landroid/util/SparseArray;

    .line 63
    return-void
.end method

.method private static readClassIds(Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)V
    .locals 12
    .param p1, "namespace"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 82
    .local p0, "platformIdClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p2, "namesToIds":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    .line 83
    .local v3, "fields":[Ljava/lang/reflect/Field;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    array-length v9, v3

    if-lt v4, v9, :cond_0

    .line 105
    .end local v3    # "fields":[Ljava/lang/reflect/Field;
    .end local v4    # "i":I
    :goto_1
    return-void

    .line 84
    .restart local v3    # "fields":[Ljava/lang/reflect/Field;
    .restart local v4    # "i":I
    :cond_0
    aget-object v1, v3, v4

    .line 85
    .local v1, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    .line 86
    .local v5, "modifiers":I
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 87
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    .line 88
    .local v2, "fieldType":Ljava/lang/Class;
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v2, v9, :cond_1

    .line 89
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    .line 90
    .local v6, "name":Ljava/lang/String;
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v8

    .line 92
    .local v8, "value":I
    if-nez p1, :cond_2

    .line 93
    move-object v7, v6

    .line 98
    .local v7, "namespacedName":Ljava/lang/String;
    :goto_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {p2, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .end local v2    # "fieldType":Ljava/lang/Class;
    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "namespacedName":Ljava/lang/String;
    .end local v8    # "value":I
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 95
    .restart local v2    # "fieldType":Ljava/lang/Class;
    .restart local v6    # "name":Ljava/lang/String;
    .restart local v8    # "value":I
    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, ":"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .restart local v7    # "namespacedName":Ljava/lang/String;
    goto :goto_2

    .line 102
    .end local v1    # "field":Ljava/lang/reflect/Field;
    .end local v2    # "fieldType":Ljava/lang/Class;
    .end local v3    # "fields":[Ljava/lang/reflect/Field;
    .end local v4    # "i":I
    .end local v5    # "modifiers":I
    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "namespacedName":Ljava/lang/String;
    .end local v8    # "value":I
    :catch_0
    move-exception v0

    .line 103
    .local v0, "e":Ljava/lang/IllegalAccessException;
    const-string v9, "MixpanelAPI.RsrcReader"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Can\'t read built-in id names from "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method


# virtual methods
.method protected abstract getLocalClassName(Landroid/content/Context;)Ljava/lang/String;
.end method

.method protected abstract getSystemClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end method

.method public idFromName(Ljava/lang/String;)I
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 72
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method protected initialize()V
    .locals 9

    .prologue
    .line 111
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 112
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdToIdName:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->clear()V

    .line 114
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/ResourceReader;->getSystemClass()Ljava/lang/Class;

    move-result-object v4

    .line 115
    .local v4, "sysIdClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v5, "android"

    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    invoke-static {v4, v5, v6}, Lcom/mixpanel/android/mpmetrics/ResourceReader;->readClassIds(Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)V

    .line 117
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v5}, Lcom/mixpanel/android/mpmetrics/ResourceReader;->getLocalClassName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 119
    .local v2, "localClassName":Ljava/lang/String;
    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 120
    .local v3, "rIdClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v5, 0x0

    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    invoke-static {v3, v5, v6}, Lcom/mixpanel/android/mpmetrics/ResourceReader;->readClassIds(Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .end local v3    # "rIdClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    .line 141
    return-void

    .line 121
    :catch_0
    move-exception v0

    .line 122
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    const-string v5, "MixpanelAPI.RsrcReader"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Can\'t load names for Android view ids from \'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\', ids by name will not be available in the events editor."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    const-string v5, "MixpanelAPI.RsrcReader"

    .line 124
    const-string v6, "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn\'t the same as the package declared in your AndroidManifest.xml file.\nIf you\'re using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you\'re not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag."

    .line 123
    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 138
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 139
    .local v1, "idMapping":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;"
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdToIdName:Landroid/util/SparseArray;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v7, v8, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1
.end method

.method public knownIdName(Ljava/lang/String;)Z
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 67
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdNameToId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public nameForId(I)Ljava/lang/String;
    .locals 1
    .param p1, "id"    # I

    .prologue
    .line 77
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader;->mIdToIdName:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
