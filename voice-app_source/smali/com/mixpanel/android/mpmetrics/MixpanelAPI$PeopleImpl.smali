.class Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;
.super Ljava/lang/Object;
.source "MixpanelAPI.java"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PeopleImpl"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V
    .locals 0

    .prologue
    .line 1348
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)V
    .locals 0

    .prologue
    .line 1348
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)V
    .locals 0

    .prologue
    .line 1348
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    return-void
.end method

.method static synthetic access$2(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    .locals 1

    .prologue
    .line 1348
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    return-object v0
.end method

.method private registerForPushIdAPI19AndOlder(Ljava/lang/String;)V
    .locals 7
    .param p1, "senderID"    # Ljava/lang/String;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .prologue
    .line 1750
    :try_start_0
    sget-boolean v2, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v2, :cond_0

    const-string v2, "MixpanelAPI.API"

    const-string v3, "Registering a new push id"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1751
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.c2dm.intent.REGISTER"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1752
    .local v1, "registrationIntent":Landroid/content/Intent;
    const-string v2, "app"

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$7(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1753
    const-string v2, "sender"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1754
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;
    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$7(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1758
    .end local v1    # "registrationIntent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 1755
    :catch_0
    move-exception v0

    .line 1756
    .local v0, "e":Ljava/lang/SecurityException;
    const-string v2, "MixpanelAPI.API"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private registerForPushIdAPI21AndUp(Ljava/lang/String;)V
    .locals 1
    .param p1, "senderID"    # Ljava/lang/String;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    .line 1744
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$10(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->registerForGCM(Ljava/lang/String;)V

    .line 1745
    return-void
.end method

.method private showGivenOrAvailableNotification(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V
    .locals 2
    .param p1, "notifOrNull"    # Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .param p2, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1821
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 1822
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 1823
    const-string v0, "MixpanelAPI.API"

    const-string v1, "Will not show notifications, os version is too low."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1920
    :cond_0
    :goto_0
    return-void

    .line 1828
    :cond_1
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private showGivenOrAvailableSurvey(Lcom/mixpanel/android/mpmetrics/Survey;Landroid/app/Activity;)V
    .locals 7
    .param p1, "surveyOrNull"    # Lcom/mixpanel/android/mpmetrics/Survey;
    .param p2, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1762
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x10

    if-ge v5, v6, :cond_1

    .line 1763
    sget-boolean v5, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v5, :cond_0

    .line 1764
    const-string v5, "MixpanelAPI.API"

    const-string v6, "Will not show survey, os version is too low."

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1818
    :cond_0
    :goto_0
    return-void

    .line 1769
    :cond_1
    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/ConfigurationChecker;->checkSurveyActivityAvailable(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 1770
    sget-boolean v5, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v5, :cond_0

    .line 1771
    const-string v5, "MixpanelAPI.API"

    const-string v6, "Will not show survey, application isn\'t configured appropriately."

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1776
    :cond_2
    const/4 v1, 0x0

    .line 1777
    .local v1, "listener":Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->getLockObject()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v2

    .line 1778
    .local v2, "lock":Ljava/util/concurrent/locks/ReentrantLock;
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1780
    :try_start_0
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->hasCurrentProposal()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    if-eqz v5, :cond_3

    .line 1814
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1783
    :cond_3
    move-object v4, p1

    .line 1784
    .local v4, "toShow":Lcom/mixpanel/android/mpmetrics/Survey;
    if-nez v4, :cond_4

    .line 1785
    :try_start_1
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->getSurveyIfAvailable()Lcom/mixpanel/android/mpmetrics/Survey;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 1787
    :cond_4
    if-nez v4, :cond_5

    .line 1814
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1792
    :cond_5
    :try_start_2
    new-instance v3, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    invoke-direct {v3, v4}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;-><init>(Lcom/mixpanel/android/mpmetrics/Survey;)V

    .line 1794
    .local v3, "surveyDisplay":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->getDistinctId()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;
    invoke-static {v6}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$9(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->proposeDisplay(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 1795
    .local v0, "intentId":I
    if-gtz v0, :cond_6

    .line 1796
    const-string v5, "MixpanelAPI.API"

    const-string v6, "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel"

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1814
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1800
    :cond_6
    :try_start_3
    new-instance v1, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;

    .end local v1    # "listener":Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;
    invoke-direct {v1, p0, v3, p2, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$3;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;Landroid/app/Activity;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1814
    .restart local v1    # "listener":Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1817
    invoke-static {p2, v1}, Lcom/mixpanel/android/mpmetrics/BackgroundCapture;->captureBackground(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;)V

    goto :goto_0

    .line 1813
    .end local v0    # "intentId":I
    .end local v1    # "listener":Lcom/mixpanel/android/mpmetrics/BackgroundCapture$OnBackgroundCapturedListener;
    .end local v3    # "surveyDisplay":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;
    .end local v4    # "toShow":Lcom/mixpanel/android/mpmetrics/Survey;
    :catchall_0
    move-exception v5

    .line 1814
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1815
    throw v5
.end method

.method private stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "actionType"    # Ljava/lang/String;
    .param p2, "properties"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1728
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1729
    .local v0, "dataObj":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->getDistinctId()Ljava/lang/String;

    move-result-object v1

    .line 1731
    .local v1, "distinctId":Ljava/lang/String;
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1732
    const-string v2, "$token"

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$9(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1733
    const-string v2, "$time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1735
    if-eqz v1, :cond_0

    .line 1736
    const-string v2, "$distinct_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1739
    :cond_0
    return-object v0
.end method


# virtual methods
.method public addOnMixpanelUpdatesReceivedListener(Lcom/mixpanel/android/mpmetrics/OnMixpanelUpdatesReceivedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/mixpanel/android/mpmetrics/OnMixpanelUpdatesReceivedListener;

    .prologue
    .line 1718
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesListener:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$8(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;->addOnMixpanelUpdatesReceivedListener(Lcom/mixpanel/android/mpmetrics/OnMixpanelUpdatesReceivedListener;)V

    .line 1719
    return-void
.end method

.method public append(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 1463
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1464
    .local v2, "properties":Lorg/json/JSONObject;
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1465
    const-string v3, "$append"

    invoke-direct {p0, v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1466
    .local v1, "message":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v3, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1470
    .end local v1    # "message":Lorg/json/JSONObject;
    .end local v2    # "properties":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 1467
    :catch_0
    move-exception v0

    .line 1468
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.API"

    const-string v4, "Exception appending a property"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public checkForSurvey(Lcom/mixpanel/android/mpmetrics/SurveyCallbacks;)V
    .locals 2
    .param p1, "callbacks"    # Lcom/mixpanel/android/mpmetrics/SurveyCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1500
    const-string v0, "MixpanelAPI.API"

    .line 1501
    const-string v1, "MixpanelAPI.checkForSurvey is deprecated. Calling is now a no-op.\n    to query surveys, call MixpanelAPI.getPeople().getSurveyIfAvailable()"

    .line 1499
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1504
    return-void
.end method

.method public checkForSurvey(Lcom/mixpanel/android/mpmetrics/SurveyCallbacks;Landroid/app/Activity;)V
    .locals 2
    .param p1, "callbacks"    # Lcom/mixpanel/android/mpmetrics/SurveyCallbacks;
    .param p2, "parentActivity"    # Landroid/app/Activity;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1511
    const-string v0, "MixpanelAPI.API"

    .line 1512
    const-string v1, "MixpanelAPI.checkForSurvey is deprecated. Calling is now a no-op.\n    to query surveys, call MixpanelAPI.getPeople().getSurveyIfAvailable()"

    .line 1510
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1515
    return-void
.end method

.method public clearCharges()V
    .locals 1

    .prologue
    .line 1631
    const-string v0, "$transactions"

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->unset(Ljava/lang/String;)V

    .line 1632
    return-void
.end method

.method public clearPushRegistrationId()V
    .locals 2

    .prologue
    .line 1661
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->clearPushId()V

    .line 1662
    const-string v0, "$android_devices"

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1663
    return-void
.end method

.method public deleteUser()V
    .locals 4

    .prologue
    .line 1637
    :try_start_0
    const-string v2, "$delete"

    sget-object v3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1638
    .local v1, "message":Lorg/json/JSONObject;
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v2, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1642
    .end local v1    # "message":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 1639
    :catch_0
    move-exception v0

    .line 1640
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "MixpanelAPI.API"

    const-string v3, "Exception deleting a user"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public getDistinctId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1695
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getPeopleDistinctId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNotificationIfAvailable()Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .locals 2

    .prologue
    .line 1519
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$5(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getTestMode()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getNotification(Z)Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v0

    return-object v0
.end method

.method public getSurveyIfAvailable()Lcom/mixpanel/android/mpmetrics/Survey;
    .locals 2

    .prologue
    .line 1541
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$5(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getTestMode()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getSurvey(Z)Lcom/mixpanel/android/mpmetrics/Survey;

    move-result-object v0

    return-object v0
.end method

.method public identify(Ljava/lang/String;)V
    .locals 2
    .param p1, "distinctId"    # Ljava/lang/String;

    .prologue
    .line 1351
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v1

    monitor-enter v1

    .line 1352
    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->setPeopleDistinctId(Ljava/lang/String;)V

    .line 1353
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->setDistinctId(Ljava/lang/String;)V

    .line 1351
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1355
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->pushWaitingPeopleRecord()V
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$2(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    .line 1356
    return-void

    .line 1351
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public increment(Ljava/lang/String;D)V
    .locals 2
    .param p1, "property"    # Ljava/lang/String;
    .param p2, "value"    # D

    .prologue
    .line 1455
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1456
    .local v0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;"
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1457
    invoke-virtual {p0, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->increment(Ljava/util/Map;)V

    .line 1458
    return-void
.end method

.method public increment(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Number;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1431
    .local p1, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Number;>;"
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 1433
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "$add"

    invoke-direct {p0, v3, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    .line 1434
    .local v2, "message":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1438
    .end local v2    # "message":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 1435
    :catch_0
    move-exception v0

    .line 1436
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.API"

    const-string v4, "Exception incrementing properties"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public initPushHandling(Ljava/lang/String;)V
    .locals 4
    .param p1, "senderID"    # Ljava/lang/String;

    .prologue
    .line 1667
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$7(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/ConfigurationChecker;->checkPushConfiguration(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1668
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Can\'t register for push notification services. Push notifications will not work."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1669
    const-string v1, "MixpanelAPI.API"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "See log tagged "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/mixpanel/android/mpmetrics/ConfigurationChecker;->LOGTAG:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " above for details."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1691
    :goto_0
    return-void

    .line 1672
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getPushId()Ljava/lang/String;

    move-result-object v0

    .line 1673
    .local v0, "pushId":Ljava/lang/String;
    if-nez v0, :cond_2

    .line 1674
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_1

    .line 1675
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->registerForPushIdAPI21AndUp(Ljava/lang/String;)V

    goto :goto_0

    .line 1677
    :cond_1
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->registerForPushIdAPI19AndOlder(Ljava/lang/String;)V

    goto :goto_0

    .line 1680
    :cond_2
    new-instance v1, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$1;

    invoke-direct {v1, p0, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$1;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->allInstances(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;)V

    goto :goto_0
.end method

.method public joinExperimentIfAvailable()V
    .locals 2

    .prologue
    .line 1596
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getVariants()Lorg/json/JSONArray;

    move-result-object v0

    .line 1597
    .local v0, "variants":Lorg/json/JSONArray;
    if-eqz v0, :cond_0

    .line 1598
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$6(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;->setVariants(Lorg/json/JSONArray;)V

    .line 1600
    :cond_0
    return-void
.end method

.method public merge(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 5
    .param p1, "property"    # Ljava/lang/String;
    .param p2, "updates"    # Lorg/json/JSONObject;

    .prologue
    .line 1443
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1445
    .local v1, "mergeMessage":Lorg/json/JSONObject;
    :try_start_0
    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1446
    const-string v3, "$merge"

    invoke-direct {p0, v3, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    .line 1447
    .local v2, "message":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1451
    .end local v2    # "message":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 1448
    :catch_0
    move-exception v0

    .line 1449
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.API"

    const-string v4, "Exception merging a property"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public removeOnMixpanelUpdatesReceivedListener(Lcom/mixpanel/android/mpmetrics/OnMixpanelUpdatesReceivedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/mixpanel/android/mpmetrics/OnMixpanelUpdatesReceivedListener;

    .prologue
    .line 1723
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesListener:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$8(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;->removeOnMixpanelUpdatesReceivedListener(Lcom/mixpanel/android/mpmetrics/OnMixpanelUpdatesReceivedListener;)V

    .line 1724
    return-void
.end method

.method public set(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .param p1, "property"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 1391
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->set(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1395
    :goto_0
    return-void

    .line 1392
    :catch_0
    move-exception v0

    .line 1393
    .local v0, "e":Lorg/json/JSONException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "set"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public set(Lorg/json/JSONObject;)V
    .locals 7
    .param p1, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 1375
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDeviceInfo:Ljava/util/Map;
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$3(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Ljava/util/Map;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 1376
    .local v4, "sendProperties":Lorg/json/JSONObject;
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    .line 1381
    const-string v5, "$set"

    invoke-direct {p0, v5, v4}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    .line 1382
    .local v3, "message":Lorg/json/JSONObject;
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v5, v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V

    .line 1386
    .end local v1    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v3    # "message":Lorg/json/JSONObject;
    .end local v4    # "sendProperties":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 1377
    .restart local v1    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .restart local v4    # "sendProperties":Lorg/json/JSONObject;
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1378
    .local v2, "key":Ljava/lang/String;
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1383
    .end local v1    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v2    # "key":Ljava/lang/String;
    .end local v4    # "sendProperties":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 1384
    .local v0, "e":Lorg/json/JSONException;
    const-string v5, "MixpanelAPI.API"

    const-string v6, "Exception setting people properties"

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public setMap(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1360
    .local p1, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez p1, :cond_0

    .line 1361
    const-string v1, "MixpanelAPI.API"

    const-string v2, "setMap does not accept null properties"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1370
    :goto_0
    return-void

    .line 1366
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->set(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1367
    :catch_0
    move-exception v0

    .line 1368
    .local v0, "e":Ljava/lang/NullPointerException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Can\'t have null keys in the properties of setMap!"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public setOnce(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .param p1, "property"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 1423
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->setOnce(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1427
    :goto_0
    return-void

    .line 1424
    :catch_0
    move-exception v0

    .line 1425
    .local v0, "e":Lorg/json/JSONException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "set"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public setOnce(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 1413
    :try_start_0
    const-string v2, "$set_once"

    invoke-direct {p0, v2, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1414
    .local v1, "message":Lorg/json/JSONObject;
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v2, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1418
    .end local v1    # "message":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 1415
    :catch_0
    move-exception v0

    .line 1416
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "MixpanelAPI.API"

    const-string v3, "Exception setting people properties"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public setOnceMap(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1399
    .local p1, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez p1, :cond_0

    .line 1400
    const-string v1, "MixpanelAPI.API"

    const-string v2, "setOnceMap does not accept null properties"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1408
    :goto_0
    return-void

    .line 1404
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->setOnce(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1405
    :catch_0
    move-exception v0

    .line 1406
    .local v0, "e":Ljava/lang/NullPointerException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Can\'t have null keys in the properties setOnceMap!"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public setPushRegistrationId(Ljava/lang/String;)V
    .locals 3
    .param p1, "registrationId"    # Ljava/lang/String;

    .prologue
    .line 1647
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v2

    monitor-enter v2

    .line 1648
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getPeopleDistinctId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1649
    monitor-exit v2

    .line 1657
    :goto_0
    return-void

    .line 1652
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->storePushId(Ljava/lang/String;)V

    .line 1653
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 1654
    .local v0, "ids":Lorg/json/JSONArray;
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1655
    const-string v1, "$android_devices"

    invoke-virtual {p0, v1, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->union(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 1647
    monitor-exit v2

    goto :goto_0

    .end local v0    # "ids":Lorg/json/JSONArray;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public showGivenNotification(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V
    .locals 0
    .param p1, "notif"    # Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .param p2, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1584
    if-eqz p1, :cond_0

    .line 1585
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableNotification(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V

    .line 1587
    :cond_0
    return-void
.end method

.method public showNotificationById(ILandroid/app/Activity;)V
    .locals 3
    .param p1, "id"    # I
    .param p2, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1578
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$5(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getTestMode()Z

    move-result v2

    invoke-virtual {v1, p1, v2}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getNotification(IZ)Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v0

    .line 1579
    .local v0, "notif":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    invoke-virtual {p0, v0, p2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenNotification(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V

    .line 1580
    return-void
.end method

.method public showNotificationIfAvailable(Landroid/app/Activity;)V
    .locals 2
    .param p1, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1569
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 1574
    :goto_0
    return-void

    .line 1573
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableNotification(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V

    goto :goto_0
.end method

.method public showSurvey(Lcom/mixpanel/android/mpmetrics/Survey;Landroid/app/Activity;)V
    .locals 0
    .param p1, "survey"    # Lcom/mixpanel/android/mpmetrics/Survey;
    .param p2, "parent"    # Landroid/app/Activity;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1547
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableSurvey(Lcom/mixpanel/android/mpmetrics/Survey;Landroid/app/Activity;)V

    .line 1548
    return-void
.end method

.method public showSurveyById(ILandroid/app/Activity;)V
    .locals 3
    .param p1, "id"    # I
    .param p2, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1561
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$5(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getTestMode()Z

    move-result v2

    invoke-virtual {v1, p1, v2}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->getSurvey(IZ)Lcom/mixpanel/android/mpmetrics/Survey;

    move-result-object v0

    .line 1562
    .local v0, "s":Lcom/mixpanel/android/mpmetrics/Survey;
    if-eqz v0, :cond_0

    .line 1563
    invoke-direct {p0, v0, p2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableSurvey(Lcom/mixpanel/android/mpmetrics/Survey;Landroid/app/Activity;)V

    .line 1565
    :cond_0
    return-void
.end method

.method public showSurveyIfAvailable(Landroid/app/Activity;)V
    .locals 2
    .param p1, "parent"    # Landroid/app/Activity;

    .prologue
    .line 1552
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 1557
    :goto_0
    return-void

    .line 1556
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableSurvey(Lcom/mixpanel/android/mpmetrics/Survey;Landroid/app/Activity;)V

    goto :goto_0
.end method

.method public trackCharge(DLorg/json/JSONObject;)V
    .locals 9
    .param p1, "amount"    # D
    .param p3, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 1604
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 1605
    .local v4, "now":Ljava/util/Date;
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v6, "yyyy-MM-dd\'T\'HH:mm:ss"

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1606
    .local v0, "dateFormat":Ljava/text/DateFormat;
    const-string v6, "UTC"

    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 1609
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1610
    .local v5, "transactionValue":Lorg/json/JSONObject;
    const-string v6, "$amount"

    invoke-virtual {v5, v6, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1611
    const-string v6, "$time"

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1613
    if-eqz p3, :cond_0

    .line 1614
    invoke-virtual {p3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 1620
    .end local v2    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_0
    const-string v6, "$transactions"

    invoke-virtual {p0, v6, v5}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->append(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1624
    .end local v5    # "transactionValue":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 1615
    .restart local v2    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .restart local v5    # "transactionValue":Lorg/json/JSONObject;
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1616
    .local v3, "key":Ljava/lang/String;
    invoke-virtual {p3, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1621
    .end local v2    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .end local v3    # "key":Ljava/lang/String;
    .end local v5    # "transactionValue":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 1622
    .local v1, "e":Lorg/json/JSONException;
    const-string v6, "MixpanelAPI.API"

    const-string v7, "Exception creating new charge"

    invoke-static {v6, v7, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public trackNotification(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    .locals 2
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "notif"    # Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .prologue
    .line 1591
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {p2}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getCampaignProperties()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1592
    return-void
.end method

.method public trackNotificationSeen(Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    .locals 6
    .param p1, "notif"    # Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .prologue
    .line 1524
    if-nez p1, :cond_0

    .line 1537
    :goto_0
    return-void

    .line 1526
    :cond_0
    const-string v4, "$campaign_delivery"

    invoke-virtual {p0, v4, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->trackNotification(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/InAppNotification;)V

    .line 1527
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v4

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->getDistinctId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->withIdentity(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v3

    .line 1528
    .local v3, "people":Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ss"

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1529
    .local v0, "dateFormat":Ljava/text/DateFormat;
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getCampaignProperties()Lorg/json/JSONObject;

    move-result-object v2

    .line 1531
    .local v2, "notifProperties":Lorg/json/JSONObject;
    :try_start_0
    const-string v4, "$time"

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1535
    :goto_1
    const-string v4, "$campaigns"

    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->append(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1536
    const-string v4, "$notifications"

    invoke-interface {v3, v4, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->append(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 1532
    :catch_0
    move-exception v1

    .line 1533
    .local v1, "e":Lorg/json/JSONException;
    const-string v4, "MixpanelAPI.API"

    const-string v5, "Exception trying to track an in-app notification seen"

    invoke-static {v4, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public union(Ljava/lang/String;Lorg/json/JSONArray;)V
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Lorg/json/JSONArray;

    .prologue
    .line 1475
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1476
    .local v2, "properties":Lorg/json/JSONObject;
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1477
    const-string v3, "$union"

    invoke-direct {p0, v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1478
    .local v1, "message":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v3, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1482
    .end local v1    # "message":Lorg/json/JSONObject;
    .end local v2    # "properties":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 1479
    :catch_0
    move-exception v0

    .line 1480
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.API"

    const-string v4, "Exception unioning a property"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public unset(Ljava/lang/String;)V
    .locals 5
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 1487
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 1488
    .local v2, "names":Lorg/json/JSONArray;
    invoke-virtual {v2, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1489
    const-string v3, "$unset"

    invoke-direct {p0, v3, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->stdPeopleMessage(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1490
    .local v1, "message":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    # invokes: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V
    invoke-static {v3, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1494
    .end local v1    # "message":Lorg/json/JSONObject;
    .end local v2    # "names":Lorg/json/JSONArray;
    :goto_0
    return-void

    .line 1491
    :catch_0
    move-exception v0

    .line 1492
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.API"

    const-string v4, "Exception unsetting a property"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public withIdentity(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;
    .locals 2
    .param p1, "distinctId"    # Ljava/lang/String;

    .prologue
    .line 1700
    if-nez p1, :cond_0

    .line 1701
    const/4 v0, 0x0

    .line 1703
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$2;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-direct {v0, p0, v1, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$2;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Ljava/lang/String;)V

    goto :goto_0
.end method
