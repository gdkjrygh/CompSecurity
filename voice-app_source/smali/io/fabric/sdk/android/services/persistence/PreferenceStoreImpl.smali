.class public Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;
.super Ljava/lang/Object;
.source "PreferenceStoreImpl.java"

# interfaces
.implements Lio/fabric/sdk/android/services/persistence/PreferenceStore;


# instance fields
.field private final context:Landroid/content/Context;

.field private final preferenceName:Ljava/lang/String;

.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    if-nez p1, :cond_0

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get directory before context has been set. Call Fabric.with() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    iput-object p1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->context:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->preferenceName:Ljava/lang/String;

    .line 39
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->context:Landroid/content/Context;

    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->preferenceName:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 40
    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/Kit;)V
    .locals 2
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 48
    invoke-virtual {p1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 49
    return-void
.end method


# virtual methods
.method public edit()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method public get()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public save(Landroid/content/SharedPreferences$Editor;)Z
    .locals 2
    .param p1, "editor"    # Landroid/content/SharedPreferences$Editor;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 76
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 77
    const/4 v0, 0x1

    .line 79
    :goto_0
    return v0

    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    goto :goto_0
.end method
