.class public Lcom/mixpanel/android/mpmetrics/MPConfig;
.super Ljava/lang/Object;
.source "MPConfig.java"


# static fields
.field public static DEBUG:Z = false

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.Conf"

.field static final MAX_NOTIFICATION_CACHE_COUNT:I = 0x2

.field static final REFERRER_PREFS_NAME:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.ReferralInfo"

.field public static final UI_FEATURES_MIN_API:I = 0x10

.field public static final VERSION:Ljava/lang/String; = "4.6.0"

.field private static sInstance:Lcom/mixpanel/android/mpmetrics/MPConfig;

.field private static final sInstanceLock:Ljava/lang/Object;


# instance fields
.field private final mAutoShowMixpanelUpdates:Z

.field private final mBulkUploadLimit:I

.field private final mDataExpiration:I

.field private final mDebugFlushInterval:I

.field private final mDecideEndpoint:Ljava/lang/String;

.field private final mDecideFallbackEndpoint:Ljava/lang/String;

.field private final mDisableAppOpenEvent:Z

.field private final mDisableEmulatorBindingUI:Z

.field private final mDisableFallback:Z

.field private final mDisableGestureBindingUI:Z

.field private final mEditorUrl:Ljava/lang/String;

.field private final mEventsEndpoint:Ljava/lang/String;

.field private final mEventsFallbackEndpoint:Ljava/lang/String;

.field private final mFlushInterval:I

.field private final mMinimumDatabaseLimit:I

.field private final mPeopleEndpoint:Ljava/lang/String;

.field private final mPeopleFallbackEndpoint:Ljava/lang/String;

.field private final mResourcePackageName:Ljava/lang/String;

.field private final mTestMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    sput-boolean v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    .line 346
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->sInstanceLock:Ljava/lang/Object;

    .line 347
    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 13
    .param p1, "metaData"    # Landroid/os/Bundle;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    const-string v11, "com.mixpanel.android.MPConfig.EnableDebugLogging"

    invoke-virtual {p1, v11, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    sput-boolean v11, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    .line 118
    const-string v11, "com.mixpanel.android.MPConfig.AutoCheckForSurveys"

    invoke-virtual {p1, v11}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 119
    const-string v11, "MixpanelAPI.Conf"

    const-string v12, "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible."

    invoke-static {v11, v12}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    :cond_0
    const-string v11, "com.mixpanel.android.MPConfig.BulkUploadLimit"

    const/16 v12, 0x28

    invoke-virtual {p1, v11, v12}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    iput v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mBulkUploadLimit:I

    .line 124
    const-string v11, "com.mixpanel.android.MPConfig.FlushInterval"

    const v12, 0xea60

    invoke-virtual {p1, v11, v12}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    iput v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mFlushInterval:I

    .line 125
    const-string v11, "com.mixpanel.android.MPConfig.DebugFlushInterval"

    const/16 v12, 0x3e8

    invoke-virtual {p1, v11, v12}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    iput v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDebugFlushInterval:I

    .line 126
    const-string v11, "com.mixpanel.android.MPConfig.DataExpiration"

    const v12, 0x19bfcc00

    invoke-virtual {p1, v11, v12}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    iput v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDataExpiration:I

    .line 127
    const-string v11, "com.mixpanel.android.MPConfig.MinimumDatabaseLimit"

    const/high16 v12, 0x1400000

    invoke-virtual {p1, v11, v12}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    iput v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mMinimumDatabaseLimit:I

    .line 128
    const-string v11, "com.mixpanel.android.MPConfig.DisableFallback"

    invoke-virtual {p1, v11, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    iput-boolean v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableFallback:Z

    .line 129
    const-string v11, "com.mixpanel.android.MPConfig.ResourcePackageName"

    invoke-virtual {p1, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mResourcePackageName:Ljava/lang/String;

    .line 130
    const-string v11, "com.mixpanel.android.MPConfig.DisableGestureBindingUI"

    invoke-virtual {p1, v11, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    iput-boolean v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableGestureBindingUI:Z

    .line 131
    const-string v11, "com.mixpanel.android.MPConfig.DisableEmulatorBindingUI"

    invoke-virtual {p1, v11, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    iput-boolean v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableEmulatorBindingUI:Z

    .line 132
    const-string v11, "com.mixpanel.android.MPConfig.DisableAppOpenEvent"

    invoke-virtual {p1, v11, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    iput-boolean v11, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableAppOpenEvent:Z

    .line 135
    const-string v11, "com.mixpanel.android.MPConfig.AutoCheckForSurveys"

    invoke-virtual {p1, v11, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    .line 136
    .local v8, "surveysAutoCheck":Z
    const-string v11, "com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates"

    invoke-virtual {p1, v11, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 137
    .local v5, "mixpanelUpdatesAutoShow":Z
    if-eqz v8, :cond_9

    if-eqz v5, :cond_9

    :goto_0
    iput-boolean v9, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mAutoShowMixpanelUpdates:Z

    .line 139
    const-string v9, "com.mixpanel.android.MPConfig.TestMode"

    invoke-virtual {p1, v9, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    iput-boolean v9, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mTestMode:Z

    .line 141
    const-string v9, "com.mixpanel.android.MPConfig.EventsEndpoint"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 142
    .local v3, "eventsEndpoint":Ljava/lang/String;
    if-nez v3, :cond_1

    .line 143
    const-string v3, "https://api.mixpanel.com/track?ip=1"

    .line 145
    :cond_1
    iput-object v3, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mEventsEndpoint:Ljava/lang/String;

    .line 147
    const-string v9, "com.mixpanel.android.MPConfig.EventsFallbackEndpoint"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 148
    .local v4, "eventsFallbackEndpoint":Ljava/lang/String;
    if-nez v4, :cond_2

    .line 149
    const-string v4, "http://api.mixpanel.com/track?ip=1"

    .line 151
    :cond_2
    iput-object v4, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mEventsFallbackEndpoint:Ljava/lang/String;

    .line 153
    const-string v9, "com.mixpanel.android.MPConfig.PeopleEndpoint"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 154
    .local v6, "peopleEndpoint":Ljava/lang/String;
    if-nez v6, :cond_3

    .line 155
    const-string v6, "https://api.mixpanel.com/engage"

    .line 157
    :cond_3
    iput-object v6, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mPeopleEndpoint:Ljava/lang/String;

    .line 159
    const-string v9, "com.mixpanel.android.MPConfig.PeopleFallbackEndpoint"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 160
    .local v7, "peopleFallbackEndpoint":Ljava/lang/String;
    if-nez v7, :cond_4

    .line 161
    const-string v7, "http://api.mixpanel.com/engage"

    .line 163
    :cond_4
    iput-object v7, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mPeopleFallbackEndpoint:Ljava/lang/String;

    .line 165
    const-string v9, "com.mixpanel.android.MPConfig.DecideEndpoint"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    .local v0, "decideEndpoint":Ljava/lang/String;
    if-nez v0, :cond_5

    .line 167
    const-string v0, "https://decide.mixpanel.com/decide"

    .line 169
    :cond_5
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDecideEndpoint:Ljava/lang/String;

    .line 171
    const-string v9, "com.mixpanel.android.MPConfig.DecideFallbackEndpoint"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 172
    .local v1, "decideFallbackEndpoint":Ljava/lang/String;
    if-nez v1, :cond_6

    .line 173
    const-string v1, "http://decide.mixpanel.com/decide"

    .line 175
    :cond_6
    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDecideFallbackEndpoint:Ljava/lang/String;

    .line 177
    const-string v9, "com.mixpanel.android.MPConfig.EditorUrl"

    invoke-virtual {p1, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 178
    .local v2, "editorUrl":Ljava/lang/String;
    if-nez v2, :cond_7

    .line 179
    const-string v2, "wss://switchboard.mixpanel.com/connect/"

    .line 181
    :cond_7
    iput-object v2, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mEditorUrl:Ljava/lang/String;

    .line 183
    sget-boolean v9, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v9, :cond_8

    .line 184
    const-string v9, "MixpanelAPI.Conf"

    .line 185
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Mixpanel configured with:\n    AutoShowMixpanelUpdates "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getAutoShowMixpanelUpdates()Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 187
    const-string v11, "    BulkUploadLimit "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getBulkUploadLimit()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 188
    const-string v11, "    FlushInterval "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0, p2}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getFlushInterval(Landroid/content/Context;)I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 189
    const-string v11, "    DataExpiration "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDataExpiration()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 190
    const-string v11, "    MinimumDatabaseLimit "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getMinimumDatabaseLimit()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 191
    const-string v11, "    DisableFallback "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableFallback()Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 192
    const-string v11, "    DisableAppOpenEvent "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableAppOpenEvent()Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 193
    const-string v11, "    DisableDeviceUIBinding "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableGestureBindingUI()Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 194
    const-string v11, "    DisableEmulatorUIBinding "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableEmulatorBindingUI()Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 195
    const-string v11, "    EnableDebugLogging "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    sget-boolean v11, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 196
    const-string v11, "    TestMode "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getTestMode()Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 197
    const-string v11, "    EventsEndpoint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEventsEndpoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 198
    const-string v11, "    PeopleEndpoint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getPeopleEndpoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 199
    const-string v11, "    DecideEndpoint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDecideEndpoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 200
    const-string v11, "    EventsFallbackEndpoint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEventsFallbackEndpoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 201
    const-string v11, "    PeopleFallbackEndpoint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getPeopleFallbackEndpoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 202
    const-string v11, "    DecideFallbackEndpoint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDecideFallbackEndpoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 203
    const-string v11, "    EditorUrl "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEditorUrl()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 185
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 184
    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    :cond_8
    return-void

    .end local v0    # "decideEndpoint":Ljava/lang/String;
    .end local v1    # "decideFallbackEndpoint":Ljava/lang/String;
    .end local v2    # "editorUrl":Ljava/lang/String;
    .end local v3    # "eventsEndpoint":Ljava/lang/String;
    .end local v4    # "eventsFallbackEndpoint":Ljava/lang/String;
    .end local v6    # "peopleEndpoint":Ljava/lang/String;
    .end local v7    # "peopleFallbackEndpoint":Ljava/lang/String;
    :cond_9
    move v9, v10

    .line 137
    goto/16 :goto_0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 105
    sget-object v2, Lcom/mixpanel/android/mpmetrics/MPConfig;->sInstanceLock:Ljava/lang/Object;

    monitor-enter v2

    .line 106
    :try_start_0
    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->sInstance:Lcom/mixpanel/android/mpmetrics/MPConfig;

    if-nez v1, :cond_0

    .line 107
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 108
    .local v0, "appContext":Landroid/content/Context;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->readConfig(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v1

    sput-object v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->sInstance:Lcom/mixpanel/android/mpmetrics/MPConfig;

    .line 105
    .end local v0    # "appContext":Landroid/content/Context;
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->sInstance:Lcom/mixpanel/android/mpmetrics/MPConfig;

    return-object v1

    .line 105
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method static readConfig(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 7
    .param p0, "appContext"    # Landroid/content/Context;

    .prologue
    .line 312
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 314
    .local v3, "packageName":Ljava/lang/String;
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const/16 v5, 0x80

    invoke-virtual {v4, v3, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 315
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 316
    .local v1, "configBundle":Landroid/os/Bundle;
    if-nez v1, :cond_0

    .line 317
    new-instance v1, Landroid/os/Bundle;

    .end local v1    # "configBundle":Landroid/os/Bundle;
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 319
    .restart local v1    # "configBundle":Landroid/os/Bundle;
    :cond_0
    new-instance v4, Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-direct {v4, v1, p0}, Lcom/mixpanel/android/mpmetrics/MPConfig;-><init>(Landroid/os/Bundle;Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    .line 320
    .end local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .end local v1    # "configBundle":Landroid/os/Bundle;
    :catch_0
    move-exception v2

    .line 321
    .local v2, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Can\'t configure Mixpanel with package name "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
.end method


# virtual methods
.method public getAutoShowMixpanelUpdates()Z
    .locals 1

    .prologue
    .line 286
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mAutoShowMixpanelUpdates:Z

    return v0
.end method

.method public getBulkUploadLimit()I
    .locals 1

    .prologue
    .line 210
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mBulkUploadLimit:I

    return v0
.end method

.method public getDataExpiration()I
    .locals 1

    .prologue
    .line 229
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDataExpiration:I

    return v0
.end method

.method public getDecideEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDecideEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getDecideFallbackEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDecideFallbackEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getDisableAppOpenEvent()Z
    .locals 1

    .prologue
    .line 247
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableAppOpenEvent:Z

    return v0
.end method

.method public getDisableEmulatorBindingUI()Z
    .locals 1

    .prologue
    .line 243
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableEmulatorBindingUI:Z

    return v0
.end method

.method public getDisableFallback()Z
    .locals 1

    .prologue
    .line 235
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableFallback:Z

    return v0
.end method

.method public getDisableGestureBindingUI()Z
    .locals 1

    .prologue
    .line 239
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDisableGestureBindingUI:Z

    return v0
.end method

.method public getEditorUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mEditorUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getEventsEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mEventsEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getEventsFallbackEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mEventsFallbackEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getFlushInterval()I
    .locals 1

    .prologue
    .line 215
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getFlushInterval(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public getFlushInterval(Landroid/content/Context;)I
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 219
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v2, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x2

    iput v2, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    .line 220
    .local v0, "isDebuggable":Z
    :goto_0
    if-eqz v0, :cond_1

    .line 221
    iget v1, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mDebugFlushInterval:I

    .line 223
    :goto_1
    return v1

    .line 219
    .end local v0    # "isDebuggable":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 223
    .restart local v0    # "isDebuggable":Z
    :cond_1
    iget v1, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mFlushInterval:I

    goto :goto_1
.end method

.method public getMinimumDatabaseLimit()I
    .locals 1

    .prologue
    .line 232
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mMinimumDatabaseLimit:I

    return v0
.end method

.method public getPeopleEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mPeopleEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getPeopleFallbackEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mPeopleFallbackEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getResourcePackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mResourcePackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getTestMode()Z
    .locals 1

    .prologue
    .line 251
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/MPConfig;->mTestMode:Z

    return v0
.end method
