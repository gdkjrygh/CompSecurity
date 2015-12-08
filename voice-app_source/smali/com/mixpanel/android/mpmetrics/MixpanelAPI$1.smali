.class Lcom/mixpanel/android/mpmetrics/MixpanelAPI$1;
.super Ljava/lang/Object;
.source "MixpanelAPI.java"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPersistentIdentity(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$1;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .line 1297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrefsLoaded(Landroid/content/SharedPreferences;)V
    .locals 2
    .param p1, "preferences"    # Landroid/content/SharedPreferences;

    .prologue
    .line 1300
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->waitingPeopleRecordsForSending(Landroid/content/SharedPreferences;)Lorg/json/JSONArray;

    move-result-object v0

    .line 1301
    .local v0, "records":Lorg/json/JSONArray;
    if-eqz v0, :cond_0

    .line 1302
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$1;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sendAllPeopleRecords(Lorg/json/JSONArray;)V
    invoke-static {v1, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$11(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONArray;)V

    .line 1304
    :cond_0
    return-void
.end method
