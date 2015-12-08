.class Lcom/facebook/internal/Utility$1;
.super Ljava/lang/Object;
.source "Utility.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/Utility;->loadAppSettingsAsync(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$applicationId:Ljava/lang/String;

.field private final synthetic val$context:Landroid/content/Context;

.field private final synthetic val$settingsKey:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/internal/Utility$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/internal/Utility$1;->val$settingsKey:Ljava/lang/String;

    .line 777
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 780
    iget-object v2, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;

    # invokes: Lcom/facebook/internal/Utility;->getAppSettingsQueryResponse(Ljava/lang/String;)Lorg/json/JSONObject;
    invoke-static {v2}, Lcom/facebook/internal/Utility;->access$0(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 781
    .local v0, "resultJSON":Lorg/json/JSONObject;
    if-eqz v0, :cond_0

    .line 782
    iget-object v2, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;

    # invokes: Lcom/facebook/internal/Utility;->parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->access$1(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;

    .line 784
    iget-object v2, p0, Lcom/facebook/internal/Utility$1;->val$context:Landroid/content/Context;

    .line 785
    const-string v3, "com.facebook.internal.preferences.APP_SETTINGS"

    .line 784
    invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 787
    .local v1, "sharedPrefs":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 788
    iget-object v3, p0, Lcom/facebook/internal/Utility$1;->val$settingsKey:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 789
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 792
    .end local v1    # "sharedPrefs":Landroid/content/SharedPreferences;
    :cond_0
    # getter for: Lcom/facebook/internal/Utility;->loadingSettings:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {}, Lcom/facebook/internal/Utility;->access$2()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 793
    return-void
.end method
