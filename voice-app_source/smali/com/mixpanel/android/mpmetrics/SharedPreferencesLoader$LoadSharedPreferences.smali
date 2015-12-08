.class Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;
.super Ljava/lang/Object;
.source "SharedPreferencesLoader.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoadSharedPreferences"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mListener:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;

.field private final mPrefsName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "prefsName"    # Ljava/lang/String;
    .param p3, "listener"    # Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mContext:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mPrefsName:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mListener:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;

    .line 34
    return-void
.end method


# virtual methods
.method public call()Landroid/content/SharedPreferences;
    .locals 4

    .prologue
    .line 38
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mPrefsName:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 39
    .local v0, "ret":Landroid/content/SharedPreferences;
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mListener:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;

    if-eqz v1, :cond_0

    .line 40
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->mListener:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;

    invoke-interface {v1, v0}, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;->onPrefsLoaded(Landroid/content/SharedPreferences;)V

    .line 42
    :cond_0
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$LoadSharedPreferences;->call()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
