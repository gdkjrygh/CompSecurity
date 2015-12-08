.class public Lcom/urbanairship/preference/UAPreferenceAdapter;
.super Ljava/lang/Object;
.source "UAPreferenceAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/preference/UAPreferenceAdapter$3;
    }
.end annotation


# static fields
.field private static APID_MAX_RETRIES:I

.field private static APID_RETRY_DELAY:I


# instance fields
.field private apidRetryCount:I

.field private locPrefs:Lcom/urbanairship/location/LocationPreferences;

.field private preferences:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/urbanairship/preference/UAPreference$PreferenceType;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private pushPrefs:Lcom/urbanairship/push/PushPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x4

    sput v0, Lcom/urbanairship/preference/UAPreferenceAdapter;->APID_MAX_RETRIES:I

    .line 63
    const/16 v0, 0x3e8

    sput v0, Lcom/urbanairship/preference/UAPreferenceAdapter;->APID_RETRY_DELAY:I

    return-void
.end method

.method public constructor <init>(Landroid/preference/PreferenceScreen;)V
    .locals 1
    .param p1, "screen"    # Landroid/preference/PreferenceScreen;

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/push/PushManager;->getPreferences()Lcom/urbanairship/push/PushPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    .line 66
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->shared()Lcom/urbanairship/location/UALocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/urbanairship/location/UALocationManager;->getPreferences()Lcom/urbanairship/location/LocationPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->locPrefs:Lcom/urbanairship/location/LocationPreferences;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->preferences:Ljava/util/Map;

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->apidRetryCount:I

    .line 75
    invoke-direct {p0, p1}, Lcom/urbanairship/preference/UAPreferenceAdapter;->checkForUAPreferences(Landroid/preference/PreferenceGroup;)V

    .line 76
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/preference/UAPreferenceAdapter;Lcom/urbanairship/preference/UAPreference;)V
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/preference/UAPreferenceAdapter;
    .param p1, "x1"    # Lcom/urbanairship/preference/UAPreference;

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/urbanairship/preference/UAPreferenceAdapter;->trackPreference(Lcom/urbanairship/preference/UAPreference;)V

    return-void
.end method

.method static synthetic access$100(Lcom/urbanairship/preference/UAPreferenceAdapter;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/preference/UAPreferenceAdapter;

    .prologue
    .line 51
    iget-object v0, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->preferences:Ljava/util/Map;

    return-object v0
.end method

.method private checkForUAPreferences(Landroid/preference/PreferenceGroup;)V
    .locals 3
    .param p1, "group"    # Landroid/preference/PreferenceGroup;

    .prologue
    .line 222
    if-nez p1, :cond_1

    .line 235
    :cond_0
    return-void

    .line 226
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p1}, Landroid/preference/PreferenceGroup;->getPreferenceCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 227
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->getPreference(I)Landroid/preference/Preference;

    move-result-object v1

    .line 229
    .local v1, "preference":Landroid/preference/Preference;
    instance-of v2, v1, Landroid/preference/PreferenceGroup;

    if-eqz v2, :cond_3

    .line 230
    check-cast v1, Landroid/preference/PreferenceGroup;

    .end local v1    # "preference":Landroid/preference/Preference;
    invoke-direct {p0, v1}, Lcom/urbanairship/preference/UAPreferenceAdapter;->checkForUAPreferences(Landroid/preference/PreferenceGroup;)V

    .line 226
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 231
    .restart local v1    # "preference":Landroid/preference/Preference;
    :cond_3
    instance-of v2, v1, Lcom/urbanairship/preference/UAPreference;

    if-eqz v2, :cond_2

    .line 232
    check-cast v1, Lcom/urbanairship/preference/UAPreference;

    .end local v1    # "preference":Landroid/preference/Preference;
    invoke-direct {p0, v1}, Lcom/urbanairship/preference/UAPreferenceAdapter;->trackPreference(Lcom/urbanairship/preference/UAPreference;)V

    goto :goto_1
.end method

.method private getInternalPreference(Lcom/urbanairship/preference/UAPreference$PreferenceType;)Ljava/lang/Object;
    .locals 5
    .param p1, "preferenceType"    # Lcom/urbanairship/preference/UAPreference$PreferenceType;

    .prologue
    const/4 v2, 0x0

    .line 104
    const/4 v0, 0x0

    .line 105
    .local v0, "quietTimes":[Ljava/util/Date;
    const/4 v1, 0x0

    .line 107
    .local v1, "value":Ljava/lang/Object;
    sget-object v3, Lcom/urbanairship/preference/UAPreferenceAdapter$3;->$SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType:[I

    invoke-virtual {p1}, Lcom/urbanairship/preference/UAPreference$PreferenceType;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 145
    .end local v1    # "value":Ljava/lang/Object;
    :goto_0
    return-object v1

    .line 109
    .restart local v1    # "value":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->locPrefs:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/location/LocationPreferences;->isBackgroundLocationEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 110
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 112
    .local v1, "value":Ljava/lang/Object;
    :pswitch_1
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->locPrefs:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/location/LocationPreferences;->isLocationEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 113
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 115
    .local v1, "value":Ljava/lang/Object;
    :pswitch_2
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->locPrefs:Lcom/urbanairship/location/LocationPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/location/LocationPreferences;->isForegroundLocationEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 116
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 118
    .local v1, "value":Ljava/lang/Object;
    :pswitch_3
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 119
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 121
    .local v1, "value":Ljava/lang/Object;
    :pswitch_4
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/push/PushPreferences;->isQuietTimeEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 122
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 124
    .local v1, "value":Ljava/lang/Object;
    :pswitch_5
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getQuietTimeInterval()[Ljava/util/Date;

    move-result-object v0

    .line 125
    if-eqz v0, :cond_0

    const/4 v2, 0x1

    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 126
    .local v1, "value":Ljava/lang/Long;
    :goto_1
    goto :goto_0

    .local v1, "value":Ljava/lang/Object;
    :cond_0
    move-object v1, v2

    .line 125
    goto :goto_1

    .line 128
    :pswitch_6
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getQuietTimeInterval()[Ljava/util/Date;

    move-result-object v0

    .line 129
    if-eqz v0, :cond_1

    const/4 v2, 0x0

    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 130
    .local v1, "value":Ljava/lang/Long;
    :goto_2
    goto :goto_0

    .local v1, "value":Ljava/lang/Object;
    :cond_1
    move-object v1, v2

    .line 129
    goto :goto_2

    .line 132
    :pswitch_7
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/push/PushPreferences;->isSoundEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 133
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 135
    .local v1, "value":Ljava/lang/Object;
    :pswitch_8
    iget-object v2, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v2}, Lcom/urbanairship/push/PushPreferences;->isVibrateEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 136
    .local v1, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 138
    .local v1, "value":Ljava/lang/Object;
    :pswitch_9
    invoke-static {}, Lcom/urbanairship/push/PushManager;->shared()Lcom/urbanairship/push/PushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/push/PushManager;->getAPID()Ljava/lang/String;

    move-result-object v1

    .line 139
    .local v1, "value":Ljava/lang/String;
    goto/16 :goto_0

    .line 141
    .local v1, "value":Ljava/lang/Object;
    :pswitch_a
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v1

    .local v1, "value":Ljava/lang/String;
    goto/16 :goto_0

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private isServiceEnabledForPreferenceType(Lcom/urbanairship/preference/UAPreference$PreferenceType;)Z
    .locals 3
    .param p1, "preferenceType"    # Lcom/urbanairship/preference/UAPreference$PreferenceType;

    .prologue
    const/4 v0, 0x0

    .line 301
    sget-object v1, Lcom/urbanairship/preference/UAPreferenceAdapter$3;->$SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType:[I

    invoke-virtual {p1}, Lcom/urbanairship/preference/UAPreference$PreferenceType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 328
    :cond_0
    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0

    .line 305
    :pswitch_0
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-object v1, v1, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    iget-boolean v1, v1, Lcom/urbanairship/LocationOptions;->locationServiceEnabled:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->locPrefs:Lcom/urbanairship/location/LocationPreferences;

    if-nez v1, :cond_0

    .line 306
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to modify preference "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because the locationService is not enabled. Ignoring preference"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0

    .line 317
    :pswitch_1
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->pushServiceEnabled:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    if-nez v1, :cond_0

    .line 318
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to modify preference "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because the pushService is not enabled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0

    .line 323
    :pswitch_2
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->pushServiceEnabled:Z

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    iget-boolean v1, v1, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    if-nez v1, :cond_0

    goto :goto_0

    .line 301
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private setInternalPreference(Lcom/urbanairship/preference/UAPreference$PreferenceType;Ljava/lang/Object;)V
    .locals 8
    .param p1, "preferenceType"    # Lcom/urbanairship/preference/UAPreference$PreferenceType;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 156
    const/4 v1, 0x0

    .line 158
    .local v1, "quietTimes":[Ljava/util/Date;
    sget-object v3, Lcom/urbanairship/preference/UAPreferenceAdapter$3;->$SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType:[I

    invoke-virtual {p1}, Lcom/urbanairship/preference/UAPreference$PreferenceType;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 213
    .end local p2    # "value":Ljava/lang/Object;
    :goto_0
    :pswitch_0
    return-void

    .line 160
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_1
    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 161
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->enableBackgroundLocation()V

    goto :goto_0

    .line 163
    :cond_0
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->disableBackgroundLocation()V

    goto :goto_0

    .line 167
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 168
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->enableLocation()V

    goto :goto_0

    .line 170
    :cond_1
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->disableLocation()V

    goto :goto_0

    .line 174
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_3
    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 175
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->enableForegroundLocation()V

    goto :goto_0

    .line 177
    :cond_2
    invoke-static {}, Lcom/urbanairship/location/UALocationManager;->disableForegroundLocation()V

    goto :goto_0

    .line 181
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_4
    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 182
    invoke-static {}, Lcom/urbanairship/push/PushManager;->enablePush()V

    goto :goto_0

    .line 184
    :cond_3
    invoke-static {}, Lcom/urbanairship/push/PushManager;->disablePush()V

    goto :goto_0

    .line 188
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_5
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/urbanairship/push/PushPreferences;->setQuietTimeEnabled(Z)V

    goto :goto_0

    .line 191
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_6
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/urbanairship/push/PushPreferences;->setSoundEnabled(Z)V

    goto :goto_0

    .line 194
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_7
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    check-cast p2, Ljava/lang/Boolean;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/urbanairship/push/PushPreferences;->setVibrateEnabled(Z)V

    goto :goto_0

    .line 197
    .restart local p2    # "value":Ljava/lang/Object;
    :pswitch_8
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getQuietTimeInterval()[Ljava/util/Date;

    move-result-object v1

    .line 198
    if-eqz v1, :cond_4

    const/4 v3, 0x0

    aget-object v2, v1, v3

    .line 199
    .local v2, "start":Ljava/util/Date;
    :goto_1
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    new-instance v4, Ljava/util/Date;

    check-cast p2, Ljava/lang/Long;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v2, v4}, Lcom/urbanairship/push/PushPreferences;->setQuietTimeInterval(Ljava/util/Date;Ljava/util/Date;)V

    goto :goto_0

    .line 198
    .end local v2    # "start":Ljava/util/Date;
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_4
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    goto :goto_1

    .line 202
    :pswitch_9
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v3}, Lcom/urbanairship/push/PushPreferences;->getQuietTimeInterval()[Ljava/util/Date;

    move-result-object v1

    .line 203
    if-eqz v1, :cond_5

    const/4 v3, 0x1

    aget-object v0, v1, v3

    .line 204
    .local v0, "end":Ljava/util/Date;
    :goto_2
    iget-object v3, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    new-instance v4, Ljava/util/Date;

    check-cast p2, Ljava/lang/Long;

    .end local p2    # "value":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4, v0}, Lcom/urbanairship/push/PushPreferences;->setQuietTimeInterval(Ljava/util/Date;Ljava/util/Date;)V

    goto/16 :goto_0

    .line 203
    .end local v0    # "end":Ljava/util/Date;
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_5
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    goto :goto_2

    .line 158
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_8
        :pswitch_9
        :pswitch_6
        :pswitch_7
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private trackPreference(Lcom/urbanairship/preference/UAPreference;)V
    .locals 8
    .param p1, "preference"    # Lcom/urbanairship/preference/UAPreference;

    .prologue
    .line 245
    invoke-interface {p1}, Lcom/urbanairship/preference/UAPreference;->getPreferenceType()Lcom/urbanairship/preference/UAPreference$PreferenceType;

    move-result-object v3

    .line 247
    .local v3, "preferenceType":Lcom/urbanairship/preference/UAPreference$PreferenceType;
    if-nez v3, :cond_1

    .line 248
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Preference returned a null preference type. Ignoring preference "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 289
    .end local p1    # "preference":Lcom/urbanairship/preference/UAPreference;
    :cond_0
    :goto_0
    return-void

    .line 252
    .restart local p1    # "preference":Lcom/urbanairship/preference/UAPreference;
    :cond_1
    invoke-direct {p0, v3}, Lcom/urbanairship/preference/UAPreferenceAdapter;->isServiceEnabledForPreferenceType(Lcom/urbanairship/preference/UAPreference$PreferenceType;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 257
    invoke-direct {p0, v3}, Lcom/urbanairship/preference/UAPreferenceAdapter;->getInternalPreference(Lcom/urbanairship/preference/UAPreference$PreferenceType;)Ljava/lang/Object;

    move-result-object v0

    .line 258
    .local v0, "defaultValue":Ljava/lang/Object;
    if-eqz v0, :cond_3

    .line 260
    :try_start_0
    invoke-interface {p1, v0}, Lcom/urbanairship/preference/UAPreference;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 282
    :cond_2
    check-cast p1, Landroid/preference/Preference;

    .end local p1    # "preference":Lcom/urbanairship/preference/UAPreference;
    new-instance v4, Lcom/urbanairship/preference/UAPreferenceAdapter$2;

    invoke-direct {v4, p0, v3}, Lcom/urbanairship/preference/UAPreferenceAdapter$2;-><init>(Lcom/urbanairship/preference/UAPreferenceAdapter;Lcom/urbanairship/preference/UAPreference$PreferenceType;)V

    invoke-virtual {p1, v4}, Landroid/preference/Preference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    goto :goto_0

    .line 261
    .restart local p1    # "preference":Lcom/urbanairship/preference/UAPreference;
    :catch_0
    move-exception v1

    .line 262
    .local v1, "ex":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception setting value "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ". Ignoring preference "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 265
    .end local v1    # "ex":Ljava/lang/Exception;
    :cond_3
    sget-object v4, Lcom/urbanairship/preference/UAPreference$PreferenceType;->APID:Lcom/urbanairship/preference/UAPreference$PreferenceType;

    if-ne v3, v4, :cond_2

    .line 267
    iget-object v4, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->pushPrefs:Lcom/urbanairship/push/PushPreferences;

    invoke-virtual {v4}, Lcom/urbanairship/push/PushPreferences;->isPushEnabled()Z

    move-result v4

    if-eqz v4, :cond_2

    iget v4, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->apidRetryCount:I

    sget v5, Lcom/urbanairship/preference/UAPreferenceAdapter;->APID_MAX_RETRIES:I

    if-ge v4, v5, :cond_2

    .line 268
    iget v4, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->apidRetryCount:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->apidRetryCount:I

    .line 269
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 270
    .local v2, "handler":Landroid/os/Handler;
    new-instance v4, Lcom/urbanairship/preference/UAPreferenceAdapter$1;

    invoke-direct {v4, p0, p1}, Lcom/urbanairship/preference/UAPreferenceAdapter$1;-><init>(Lcom/urbanairship/preference/UAPreferenceAdapter;Lcom/urbanairship/preference/UAPreference;)V

    sget v5, Lcom/urbanairship/preference/UAPreferenceAdapter;->APID_RETRY_DELAY:I

    int-to-long v6, v5

    invoke-virtual {v2, v4, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method


# virtual methods
.method public applyUrbanAirshipPreferences()V
    .locals 6

    .prologue
    .line 84
    iget-object v4, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->preferences:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/urbanairship/preference/UAPreference$PreferenceType;

    .line 85
    .local v2, "preferenceType":Lcom/urbanairship/preference/UAPreference$PreferenceType;
    iget-object v4, p0, Lcom/urbanairship/preference/UAPreferenceAdapter;->preferences:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 86
    .local v3, "value":Ljava/lang/Object;
    if-eqz v3, :cond_0

    .line 91
    :try_start_0
    invoke-direct {p0, v2, v3}, Lcom/urbanairship/preference/UAPreferenceAdapter;->setInternalPreference(Lcom/urbanairship/preference/UAPreference$PreferenceType;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    .local v0, "ex":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to set "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", invalid value "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 96
    .end local v0    # "ex":Ljava/lang/Exception;
    .end local v2    # "preferenceType":Lcom/urbanairship/preference/UAPreference$PreferenceType;
    .end local v3    # "value":Ljava/lang/Object;
    :cond_1
    return-void
.end method
