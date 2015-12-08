.class public Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;
.super Ljava/lang/Object;
.source "PreferenceStoreStrategy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/persistence/PersistenceStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/persistence/PersistenceStrategy",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final key:Ljava/lang/String;

.field private final serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/services/persistence/SerializationStrategy",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/persistence/PreferenceStore;Lio/fabric/sdk/android/services/persistence/SerializationStrategy;Ljava/lang/String;)V
    .locals 0
    .param p1, "store"    # Lio/fabric/sdk/android/services/persistence/PreferenceStore;
    .param p3, "preferenceKey"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/persistence/PreferenceStore;",
            "Lio/fabric/sdk/android/services/persistence/SerializationStrategy",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 31
    .local p0, "this":Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;, "Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy<TT;>;"
    .local p2, "serializer":Lio/fabric/sdk/android/services/persistence/SerializationStrategy;, "Lio/fabric/sdk/android/services/persistence/SerializationStrategy<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    .line 33
    iput-object p2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;

    .line 34
    iput-object p3, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .prologue
    .line 52
    .local p0, "this":Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;, "Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy<TT;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 53
    return-void
.end method

.method public restore()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 45
    .local p0, "this":Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;, "Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy<TT;>;"
    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 46
    .local v0, "store":Landroid/content/SharedPreferences;
    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;

    iget-object v2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/fabric/sdk/android/services/persistence/SerializationStrategy;->deserialize(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public save(Ljava/lang/Object;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 40
    .local p0, "this":Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;, "Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy<TT;>;"
    .local p1, "object":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    iget-object v3, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;

    invoke-interface {v3, p1}, Lio/fabric/sdk/android/services/persistence/SerializationStrategy;->serialize(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->save(Landroid/content/SharedPreferences$Editor;)Z

    .line 41
    return-void
.end method
