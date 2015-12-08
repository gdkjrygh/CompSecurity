.class Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;
.super Ljava/lang/Object;
.source "MixpanelAPI.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->showGivenOrAvailableNotification(Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type:[I


# instance fields
.field final synthetic this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

.field private final synthetic val$notifOrNull:Lcom/mixpanel/android/mpmetrics/InAppNotification;

.field private final synthetic val$parent:Landroid/app/Activity;


# direct methods
.method static synthetic $SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type()[I
    .locals 3

    .prologue
    .line 1828
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->$SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->values()[Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->MINI:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_1
    :try_start_1
    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    :try_start_2
    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    sput-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->$SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/InAppNotification;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$notifOrNull:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$parent:Landroid/app/Activity;

    .line 1828
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 1832
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->getLockObject()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v6

    .line 1833
    .local v6, "lock":Ljava/util/concurrent/locks/ReentrantLock;
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1835
    :try_start_0
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->hasCurrentProposal()Z

    move-result v10

    if-eqz v10, :cond_1

    .line 1836
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_0

    .line 1837
    const-string v10, "MixpanelAPI.API"

    const-string v11, "DisplayState is locked, will not show notifications."

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1915
    :cond_0
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1917
    :goto_0
    return-void

    .line 1842
    :cond_1
    :try_start_1
    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$notifOrNull:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 1843
    .local v8, "toShow":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    if-nez v8, :cond_2

    .line 1844
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    invoke-virtual {v10}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->getNotificationIfAvailable()Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v8

    .line 1846
    :cond_2
    if-nez v8, :cond_4

    .line 1847
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_3

    .line 1848
    const-string v10, "MixpanelAPI.API"

    const-string v11, "No notification available, will not show."

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1915
    :cond_3
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1853
    :cond_4
    :try_start_2
    invoke-virtual {v8}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->getType()Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    move-result-object v2

    .line 1854
    .local v2, "inAppType":Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    sget-object v10, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    if-ne v2, v10, :cond_6

    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$parent:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/ConfigurationChecker;->checkSurveyActivityAvailable(Landroid/content/Context;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 1855
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_5

    .line 1856
    const-string v10, "MixpanelAPI.API"

    const-string v11, "Application is not configured to show takeover notifications, none will be shown."

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1915
    :cond_5
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1861
    :cond_6
    :try_start_3
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$parent:Landroid/app/Activity;

    invoke-static {v10}, Lcom/mixpanel/android/util/ActivityImageUtils;->getHighlightColorFromBackground(Landroid/app/Activity;)I

    move-result v1

    .line 1863
    .local v1, "highlightColor":I
    new-instance v7, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    invoke-direct {v7, v8, v1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;-><init>(Lcom/mixpanel/android/mpmetrics/InAppNotification;I)V

    .line 1864
    .local v7, "proposal":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    invoke-virtual {v10}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->getDistinctId()Ljava/lang/String;

    move-result-object v10

    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->access$2(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v11

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$9(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v10, v11}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->proposeDisplay(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 1865
    .local v5, "intentId":I
    if-gtz v5, :cond_7

    .line 1866
    const-string v10, "MixpanelAPI.API"

    const-string v11, "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel"

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1915
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1870
    :cond_7
    :try_start_4
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->$SWITCH_TABLE$com$mixpanel$android$mpmetrics$InAppNotification$Type()[I

    move-result-object v10

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->ordinal()I

    move-result v11

    aget v10, v10, v11

    packed-switch v10, :pswitch_data_0

    .line 1909
    const-string v10, "MixpanelAPI.API"

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Unrecognized notification type "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " can\'t be shown"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1911
    :goto_1
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->access$2(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v10

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->access$5(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v10

    invoke-virtual {v10}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getTestMode()Z

    move-result v10

    if-nez v10, :cond_8

    .line 1912
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    invoke-virtual {v10, v8}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->trackNotificationSeen(Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1915
    :cond_8
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto/16 :goto_0

    .line 1872
    :pswitch_0
    :try_start_5
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->claimDisplayState(I)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    move-result-object v0

    .line 1873
    .local v0, "claimed":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    if-nez v0, :cond_a

    .line 1874
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_9

    .line 1875
    const-string v10, "MixpanelAPI.API"

    const-string v11, "Notification\'s display proposal was already consumed, no notification will be shown."

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1915
    :cond_9
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto/16 :goto_0

    .line 1879
    :cond_a
    :try_start_6
    new-instance v3, Lcom/mixpanel/android/mpmetrics/InAppFragment;

    invoke-direct {v3}, Lcom/mixpanel/android/mpmetrics/InAppFragment;-><init>()V

    .line 1881
    .local v3, "inapp":Lcom/mixpanel/android/mpmetrics/InAppFragment;
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    # getter for: Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->this$0:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->access$2(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v11

    .line 1883
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->getDisplayState()Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    move-result-object v10

    check-cast v10, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    .line 1880
    invoke-virtual {v3, v11, v5, v10}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->setDisplayState(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;ILcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;)V

    .line 1885
    const/4 v10, 0x1

    invoke-virtual {v3, v10}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->setRetainInstance(Z)V

    .line 1887
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_b

    .line 1888
    const-string v10, "MixpanelAPI.API"

    const-string v11, "Attempting to show mini notification."

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1890
    :cond_b
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$parent:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v10

    invoke-virtual {v10}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v9

    .line 1891
    .local v9, "transaction":Landroid/app/FragmentTransaction;
    const/4 v10, 0x0

    sget v11, Lcom/mixpanel/android/R$anim;->com_mixpanel_android_slide_down:I

    invoke-virtual {v9, v10, v11}, Landroid/app/FragmentTransaction;->setCustomAnimations(II)Landroid/app/FragmentTransaction;

    .line 1892
    const v10, 0x1020002

    invoke-virtual {v9, v10, v3}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 1893
    invoke-virtual {v9}, Landroid/app/FragmentTransaction;->commit()I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_1

    .line 1914
    .end local v0    # "claimed":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
    .end local v1    # "highlightColor":I
    .end local v2    # "inAppType":Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    .end local v3    # "inapp":Lcom/mixpanel/android/mpmetrics/InAppFragment;
    .end local v5    # "intentId":I
    .end local v7    # "proposal":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    .end local v8    # "toShow":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .end local v9    # "transaction":Landroid/app/FragmentTransaction;
    :catchall_0
    move-exception v10

    .line 1915
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1916
    throw v10

    .line 1897
    .restart local v1    # "highlightColor":I
    .restart local v2    # "inAppType":Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    .restart local v5    # "intentId":I
    .restart local v7    # "proposal":Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
    .restart local v8    # "toShow":Lcom/mixpanel/android/mpmetrics/InAppNotification;
    :pswitch_1
    :try_start_7
    sget-boolean v10, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v10, :cond_c

    .line 1898
    const-string v10, "MixpanelAPI.API"

    const-string v11, "Sending intent for takeover notification."

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1901
    :cond_c
    new-instance v4, Landroid/content/Intent;

    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$parent:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    const-class v11, Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-direct {v4, v10, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1902
    .local v4, "intent":Landroid/content/Intent;
    const/high16 v10, 0x10000000

    invoke-virtual {v4, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1903
    const/high16 v10, 0x20000

    invoke-virtual {v4, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1904
    const-string v10, "com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY"

    invoke-virtual {v4, v10, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1905
    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$4;->val$parent:Landroid/app/Activity;

    invoke-virtual {v10, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_1

    .line 1870
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
