.class Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;
.super Landroid/os/Handler;
.source "AnalyticsMessages.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AnalyticsMessageHandler"
.end annotation


# instance fields
.field private mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

.field private final mDecideChecker:Lcom/mixpanel/android/mpmetrics/DecideChecker;

.field private final mDisableFallback:Z

.field private final mFlushInterval:J

.field private mRetryAfter:J

.field final synthetic this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;Landroid/os/Looper;)V
    .locals 3
    .param p2, "looper"    # Landroid/os/Looper;

    .prologue
    .line 213
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    .line 214
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    .line 216
    new-instance v0, Lcom/mixpanel/android/mpmetrics/DecideChecker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v1

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v2

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/DecideChecker;-><init>(Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MPConfig;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDecideChecker:Lcom/mixpanel/android/mpmetrics/DecideChecker;

    .line 217
    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v0

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableFallback()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDisableFallback:Z

    .line 218
    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v0

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v0

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getFlushInterval(Landroid/content/Context;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mFlushInterval:J

    .line 219
    new-instance v0, Lcom/mixpanel/android/mpmetrics/SystemInformation;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/SystemInformation;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;Lcom/mixpanel/android/mpmetrics/SystemInformation;)V

    .line 220
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J

    .line 221
    return-void
.end method

.method private getDefaultEventProperties()Lorg/json/JSONObject;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 454
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 456
    .local v9, "ret":Lorg/json/JSONObject;
    const-string v11, "mp_lib"

    const-string v12, "android"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 457
    const-string v11, "$lib_version"

    const-string v12, "4.6.0"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 460
    const-string v11, "$os"

    const-string v12, "Android"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 461
    const-string v12, "$os_version"

    sget-object v11, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    if-nez v11, :cond_7

    const-string v11, "UNKNOWN"

    :goto_0
    invoke-virtual {v9, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 463
    const-string v12, "$manufacturer"

    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v11, :cond_8

    const-string v11, "UNKNOWN"

    :goto_1
    invoke-virtual {v9, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 464
    const-string v12, "$brand"

    sget-object v11, Landroid/os/Build;->BRAND:Ljava/lang/String;

    if-nez v11, :cond_9

    const-string v11, "UNKNOWN"

    :goto_2
    invoke-virtual {v9, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 465
    const-string v12, "$model"

    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v11, :cond_a

    const-string v11, "UNKNOWN"

    :goto_3
    invoke-virtual {v9, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 469
    :try_start_0
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v11

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1

    move-result v10

    .line 470
    .local v10, "servicesAvailable":I
    packed-switch v10, :pswitch_data_0

    .line 497
    .end local v10    # "servicesAvailable":I
    :goto_4
    :pswitch_0
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 498
    .local v3, "displayMetrics":Landroid/util/DisplayMetrics;
    const-string v11, "$screen_dpi"

    iget v12, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 499
    const-string v11, "$screen_height"

    iget v12, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 500
    const-string v11, "$screen_width"

    iget v12, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 502
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->getAppVersionName()Ljava/lang/String;

    move-result-object v0

    .line 503
    .local v0, "applicationVersionName":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 504
    const-string v11, "$app_version"

    invoke-virtual {v9, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 506
    :cond_0
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->hasNFC()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 507
    .local v5, "hasNFC":Ljava/lang/Boolean;
    if-eqz v5, :cond_1

    .line 508
    const-string v11, "$has_nfc"

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 510
    :cond_1
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->hasTelephony()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 511
    .local v6, "hasTelephony":Ljava/lang/Boolean;
    if-eqz v6, :cond_2

    .line 512
    const-string v11, "$has_telephone"

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 514
    :cond_2
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->getCurrentNetworkOperator()Ljava/lang/String;

    move-result-object v2

    .line 515
    .local v2, "carrier":Ljava/lang/String;
    if-eqz v2, :cond_3

    .line 516
    const-string v11, "$carrier"

    invoke-virtual {v9, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 518
    :cond_3
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->isWifiConnected()Ljava/lang/Boolean;

    move-result-object v8

    .line 519
    .local v8, "isWifi":Ljava/lang/Boolean;
    if-eqz v8, :cond_4

    .line 520
    const-string v11, "$wifi"

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 522
    :cond_4
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->isBluetoothEnabled()Ljava/lang/Boolean;

    move-result-object v7

    .line 523
    .local v7, "isBluetoothEnabled":Ljava/lang/Boolean;
    if-eqz v7, :cond_5

    .line 524
    const-string v11, "$bluetooth_enabled"

    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 526
    :cond_5
    iget-object v11, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mSystemInformation:Lcom/mixpanel/android/mpmetrics/SystemInformation;
    invoke-static {v11}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$4(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/SystemInformation;

    move-result-object v11

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/SystemInformation;->getBluetoothVersion()Ljava/lang/String;

    move-result-object v1

    .line 527
    .local v1, "bluetoothVersion":Ljava/lang/String;
    if-eqz v1, :cond_6

    .line 528
    const-string v11, "$bluetooth_version"

    invoke-virtual {v9, v11, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 530
    :cond_6
    return-object v9

    .line 461
    .end local v0    # "applicationVersionName":Ljava/lang/String;
    .end local v1    # "bluetoothVersion":Ljava/lang/String;
    .end local v2    # "carrier":Ljava/lang/String;
    .end local v3    # "displayMetrics":Landroid/util/DisplayMetrics;
    .end local v5    # "hasNFC":Ljava/lang/Boolean;
    .end local v6    # "hasTelephony":Ljava/lang/Boolean;
    .end local v7    # "isBluetoothEnabled":Ljava/lang/Boolean;
    .end local v8    # "isWifi":Ljava/lang/Boolean;
    :cond_7
    sget-object v11, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    goto/16 :goto_0

    .line 463
    :cond_8
    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    goto/16 :goto_1

    .line 464
    :cond_9
    sget-object v11, Landroid/os/Build;->BRAND:Ljava/lang/String;

    goto/16 :goto_2

    .line 465
    :cond_a
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    goto/16 :goto_3

    .line 472
    .restart local v10    # "servicesAvailable":I
    :pswitch_1
    :try_start_1
    const-string v11, "$google_play_services"

    const-string v12, "available"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_4

    .line 487
    .end local v10    # "servicesAvailable":I
    :catch_0
    move-exception v4

    .line 490
    .local v4, "e":Ljava/lang/RuntimeException;
    :try_start_2
    const-string v11, "$google_play_services"

    const-string v12, "not configured"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_4

    .line 493
    .end local v4    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v4

    .line 494
    .local v4, "e":Ljava/lang/NoClassDefFoundError;
    const-string v11, "$google_play_services"

    const-string v12, "not included"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 475
    .end local v4    # "e":Ljava/lang/NoClassDefFoundError;
    .restart local v10    # "servicesAvailable":I
    :pswitch_2
    :try_start_3
    const-string v11, "$google_play_services"

    const-string v12, "missing"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 478
    :pswitch_3
    const-string v11, "$google_play_services"

    const-string v12, "out of date"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 481
    :pswitch_4
    const-string v11, "$google_play_services"

    const-string v12, "disabled"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 484
    :pswitch_5
    const-string v11, "$google_play_services"

    const-string v12, "invalid"

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_4

    .line 470
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private prepareEventObject(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;)Lorg/json/JSONObject;
    .locals 7
    .param p1, "eventDescription"    # Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 534
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 535
    .local v0, "eventObj":Lorg/json/JSONObject;
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->getProperties()Lorg/json/JSONObject;

    move-result-object v1

    .line 536
    .local v1, "eventProperties":Lorg/json/JSONObject;
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->getDefaultEventProperties()Lorg/json/JSONObject;

    move-result-object v4

    .line 537
    .local v4, "sendProperties":Lorg/json/JSONObject;
    const-string v5, "token"

    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->getToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 538
    if-eqz v1, :cond_0

    .line 539
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 544
    .end local v2    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_0
    const-string v5, "event"

    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->getEventName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 545
    const-string v5, "properties"

    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 546
    return-object v0

    .line 540
    .restart local v2    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 541
    .local v3, "key":Ljava/lang/String;
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0
.end method

.method private runGCMRegistration(Ljava/lang/String;)V
    .locals 6
    .param p1, "senderID"    # Ljava/lang/String;

    .prologue
    .line 342
    :try_start_0
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v4

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v3

    .line 343
    .local v3, "resultCode":I
    if-eqz v3, :cond_0

    .line 344
    const-string v4, "MixpanelAPI.Messages"

    const-string v5, "Can\'t register for push notifications, Google Play Services are not installed."

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2

    .line 372
    .end local v3    # "resultCode":I
    :goto_0
    return-void

    .line 347
    :catch_0
    move-exception v0

    .line 348
    .local v0, "e":Ljava/lang/RuntimeException;
    :try_start_1
    const-string v4, "MixpanelAPI.Messages"

    const-string v5, "Can\'t register for push notifications, Google Play services are not configured."

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 355
    .end local v0    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v0

    .line 356
    .local v0, "e":Ljava/io/IOException;
    const-string v4, "MixpanelAPI.Messages"

    const-string v5, "Exception when trying to register for GCM"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 353
    .end local v0    # "e":Ljava/io/IOException;
    .restart local v3    # "resultCode":I
    :cond_0
    :try_start_2
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v4

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/gcm/GoogleCloudMessaging;

    move-result-object v1

    .line 354
    .local v1, "gcm":Lcom/google/android/gms/gcm/GoogleCloudMessaging;
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v1, v4}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->register([Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v2

    .line 363
    .local v2, "registrationId":Ljava/lang/String;
    new-instance v4, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler$1;

    invoke-direct {v4, p0, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler$1;-><init>(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->allInstances(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;)V

    goto :goto_0

    .line 358
    .end local v1    # "gcm":Lcom/google/android/gms/gcm/GoogleCloudMessaging;
    .end local v2    # "registrationId":Ljava/lang/String;
    .end local v3    # "resultCode":I
    :catch_2
    move-exception v0

    .line 359
    .local v0, "e":Ljava/lang/NoClassDefFoundError;
    const-string v4, "MixpanelAPI.Messages"

    const-string v5, "Google play services were not part of this build, push notifications cannot be registered or delivered"

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private sendAllData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;)V
    .locals 7
    .param p1, "dbAdapter"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 375
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getPoster()Lcom/mixpanel/android/util/RemoteService;

    move-result-object v0

    .line 376
    .local v0, "poster":Lcom/mixpanel/android/util/RemoteService;
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mixpanel/android/util/RemoteService;->isOnline(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 377
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    const-string v2, "Not flushing data to Mixpanel because the device is not connected to the internet."

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v1, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 391
    :goto_0
    return-void

    .line 381
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v1

    const-string v2, "Sending records to Mixpanel"

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v1, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 382
    iget-boolean v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDisableFallback:Z

    if-eqz v1, :cond_1

    .line 383
    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->EVENTS:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    new-array v2, v5, [Ljava/lang/String;

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v3

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEventsEndpoint()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-direct {p0, p1, v1, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;[Ljava/lang/String;)V

    .line 384
    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->PEOPLE:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    new-array v2, v5, [Ljava/lang/String;

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v3

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getPeopleEndpoint()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-direct {p0, p1, v1, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;[Ljava/lang/String;)V

    goto :goto_0

    .line 386
    :cond_1
    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->EVENTS:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    .line 387
    new-array v2, v6, [Ljava/lang/String;

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v3

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEventsEndpoint()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v3

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEventsFallbackEndpoint()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    .line 386
    invoke-direct {p0, p1, v1, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;[Ljava/lang/String;)V

    .line 388
    sget-object v1, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->PEOPLE:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    .line 389
    new-array v2, v6, [Ljava/lang/String;

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v3

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getPeopleEndpoint()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v3

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getPeopleFallbackEndpoint()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    .line 388
    invoke-direct {p0, p1, v1, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;[Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method private sendData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;[Ljava/lang/String;)V
    .locals 18
    .param p1, "dbAdapter"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter;
    .param p2, "table"    # Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;
    .param p3, "urls"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
        }
    .end annotation

    .prologue
    .line 394
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v13}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v13

    invoke-virtual {v13}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getPoster()Lcom/mixpanel/android/util/RemoteService;

    move-result-object v9

    .line 395
    .local v9, "poster":Lcom/mixpanel/android/util/RemoteService;
    invoke-virtual/range {p1 .. p2}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->generateDataString(Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)[Ljava/lang/String;

    move-result-object v5

    .line 397
    .local v5, "eventsData":[Ljava/lang/String;
    if-eqz v5, :cond_1

    .line 398
    const/4 v13, 0x0

    aget-object v6, v5, v13

    .line 399
    .local v6, "lastId":Ljava/lang/String;
    const/4 v13, 0x1

    aget-object v10, v5, v13

    .line 401
    .local v10, "rawMessage":Ljava/lang/String;
    invoke-static {v10}, Lcom/mixpanel/android/util/Base64Coder;->encodeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 402
    .local v4, "encodedData":Ljava/lang/String;
    new-instance v7, Ljava/util/ArrayList;

    const/4 v13, 0x1

    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    .local v7, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    new-instance v13, Lorg/apache/http/message/BasicNameValuePair;

    const-string v14, "data"

    invoke-direct {v13, v14, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    sget-boolean v13, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v13, :cond_0

    .line 405
    new-instance v13, Lorg/apache/http/message/BasicNameValuePair;

    const-string v14, "verbose"

    const-string v15, "1"

    invoke-direct {v13, v14, v15}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 408
    :cond_0
    const/4 v2, 0x1

    .line 410
    .local v2, "deleteEvents":Z
    move-object/from16 v0, p3

    array-length v14, v0

    const/4 v13, 0x0

    :goto_0
    if-lt v13, v14, :cond_2

    .line 440
    :goto_1
    if-eqz v2, :cond_4

    .line 441
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v13}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v13

    const-string v14, "Not retrying this batch of events, deleting them from DB."

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v13, v14}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 442
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v6, v1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->cleanupEvents(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)V

    .line 450
    .end local v2    # "deleteEvents":Z
    .end local v4    # "encodedData":Ljava/lang/String;
    .end local v6    # "lastId":Ljava/lang/String;
    .end local v7    # "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    .end local v10    # "rawMessage":Ljava/lang/String;
    :cond_1
    :goto_2
    return-void

    .line 410
    .restart local v2    # "deleteEvents":Z
    .restart local v4    # "encodedData":Ljava/lang/String;
    .restart local v6    # "lastId":Ljava/lang/String;
    .restart local v7    # "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    .restart local v10    # "rawMessage":Ljava/lang/String;
    :cond_2
    aget-object v12, p3, v13

    .line 412
    .local v12, "url":Ljava/lang/String;
    :try_start_0
    invoke-interface {v9, v12, v7}, Lcom/mixpanel/android/util/RemoteService;->performRequest(Ljava/lang/String;Ljava/util/List;)[B

    move-result-object v11

    .line 413
    .local v11, "response":[B
    const/4 v2, 0x1

    .line 414
    if-nez v11, :cond_3

    .line 415
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v15}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    const-string v17, "Response was null, unexpected failure posting to "

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, "."

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static/range {v15 .. v16}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_1

    .line 428
    .end local v11    # "response":[B
    :catch_0
    move-exception v3

    .line 429
    .local v3, "e":Ljava/lang/OutOfMemoryError;
    const-string v13, "MixpanelAPI.Messages"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Out of memory when posting to "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "."

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 419
    .end local v3    # "e":Ljava/lang/OutOfMemoryError;
    .restart local v11    # "response":[B
    :cond_3
    :try_start_1
    new-instance v8, Ljava/lang/String;

    const-string v15, "UTF-8"

    invoke-direct {v8, v11, v15}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 424
    .local v8, "parsedResponse":Ljava/lang/String;
    :try_start_2
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v15}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    const-string v17, "Successfully posted to "

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, ": \n"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static/range {v15 .. v16}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 425
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v15}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    const-string v17, "Response was "

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static/range {v15 .. v16}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto/16 :goto_1

    .line 431
    .end local v8    # "parsedResponse":Ljava/lang/String;
    .end local v11    # "response":[B
    :catch_1
    move-exception v3

    .line 432
    .local v3, "e":Ljava/net/MalformedURLException;
    const-string v13, "MixpanelAPI.Messages"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Cannot interpret "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, " as a URL."

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1

    .line 420
    .end local v3    # "e":Ljava/net/MalformedURLException;
    .restart local v11    # "response":[B
    :catch_2
    move-exception v3

    .line 421
    .local v3, "e":Ljava/io/UnsupportedEncodingException;
    :try_start_3
    new-instance v15, Ljava/lang/RuntimeException;

    const-string v16, "UTF not supported on this platform?"

    move-object/from16 v0, v16

    invoke-direct {v15, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v15
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 434
    .end local v3    # "e":Ljava/io/UnsupportedEncodingException;
    .end local v11    # "response":[B
    :catch_3
    move-exception v3

    .line 435
    .local v3, "e":Ljava/io/IOException;
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v15}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    const-string v17, "Cannot post message to "

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, "."

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;Ljava/lang/Throwable;)V
    invoke-static {v15, v0, v3}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$3(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 436
    const/4 v2, 0x0

    .line 410
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 444
    .end local v3    # "e":Ljava/io/IOException;
    .end local v12    # "url":Ljava/lang/String;
    :cond_4
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v13}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v13

    const-string v14, "Retrying this batch of events."

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v13, v14}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 445
    const/4 v13, 0x2

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->hasMessages(I)Z

    move-result v13

    if-nez v13, :cond_1

    .line 446
    const/4 v13, 0x2

    move-object/from16 v0, p0

    iget-wide v14, v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mFlushInterval:J

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v14, v15}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_2
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 13
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    const/4 v12, 0x2

    .line 225
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    if-nez v7, :cond_0

    .line 226
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v8

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;
    invoke-static {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->makeDbAdapter(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    move-result-object v7

    iput-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    .line 227
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v10

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v10

    invoke-virtual {v10}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDataExpiration()I

    move-result v10

    int-to-long v10, v10

    sub-long/2addr v8, v10

    sget-object v10, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->EVENTS:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v7, v8, v9, v10}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->cleanupEvents(JLcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)V

    .line 228
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v10, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v10

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v10}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v10

    invoke-virtual {v10}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDataExpiration()I

    move-result v10

    int-to-long v10, v10

    sub-long/2addr v8, v10

    sget-object v10, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->PEOPLE:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v7, v8, v9, v10}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->cleanupEvents(JLcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)V

    .line 232
    :cond_0
    const/4 v4, -0x3

    .line 234
    .local v4, "returnCode":I
    :try_start_0
    iget v7, p1, Landroid/os/Message;->what:I

    if-nez v7, :cond_4

    .line 235
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lorg/json/JSONObject;

    .line 237
    .local v3, "message":Lorg/json/JSONObject;
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    const-string v8, "Queuing people record for sending later"

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 238
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "    "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 240
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    sget-object v8, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->PEOPLE:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v7, v3, v8}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->addJSON(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)I

    move-result v4

    .line 294
    .end local v3    # "message":Lorg/json/JSONObject;
    :cond_1
    :goto_0
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getBulkUploadLimit()I

    move-result v7

    if-ge v4, v7, :cond_2

    const/4 v7, -0x2

    if-ne v4, v7, :cond_a

    .line 295
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    iget-wide v10, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J

    cmp-long v7, v8, v10

    if-ltz v7, :cond_a

    .line 296
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    const-string v8, "Flushing queue due to bulk upload limit"

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 297
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->updateFlushFrequency()V
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 299
    :try_start_1
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    invoke-direct {p0, v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendAllData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;)V

    .line 300
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDecideChecker:Lcom/mixpanel/android/mpmetrics/DecideChecker;

    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v8

    invoke-virtual {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getPoster()Lcom/mixpanel/android/util/RemoteService;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->runDecideChecks(Lcom/mixpanel/android/util/RemoteService;)V
    :try_end_1
    .catch Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 328
    :cond_3
    :goto_1
    return-void

    .line 242
    :cond_4
    :try_start_2
    iget v7, p1, Landroid/os/Message;->what:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_5

    .line 243
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 245
    .local v2, "eventDescription":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
    :try_start_3
    invoke-direct {p0, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->prepareEventObject(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;)Lorg/json/JSONObject;

    move-result-object v3

    .line 246
    .restart local v3    # "message":Lorg/json/JSONObject;
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    const-string v8, "Queuing event for sending later"

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 247
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "    "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 248
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    sget-object v8, Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;->EVENTS:Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;

    invoke-virtual {v7, v3, v8}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->addJSON(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/MPDbAdapter$Table;)I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    move-result v4

    goto :goto_0

    .line 249
    .end local v3    # "message":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 250
    .local v1, "e":Lorg/json/JSONException;
    :try_start_4
    const-string v7, "MixpanelAPI.Messages"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Exception tracking event "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->getEventName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_0

    .line 316
    .end local v1    # "e":Lorg/json/JSONException;
    .end local v2    # "eventDescription":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
    :catch_1
    move-exception v1

    .line 317
    .local v1, "e":Ljava/lang/RuntimeException;
    const-string v7, "MixpanelAPI.Messages"

    const-string v8, "Worker threw an unhandled exception"

    invoke-static {v7, v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 318
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mHandlerLock:Ljava/lang/Object;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 319
    :try_start_5
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    const/4 v9, 0x0

    invoke-static {v7, v9}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$3(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;Landroid/os/Handler;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 321
    :try_start_6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-virtual {v7}, Landroid/os/Looper;->quit()V

    .line 322
    const-string v7, "MixpanelAPI.Messages"

    const-string v9, "Mixpanel will not process any more analytics messages"

    invoke-static {v7, v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 318
    :goto_2
    :try_start_7
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v7

    .line 253
    .end local v1    # "e":Ljava/lang/RuntimeException;
    :cond_5
    :try_start_8
    iget v7, p1, Landroid/os/Message;->what:I

    if-ne v7, v12, :cond_6

    .line 254
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    const-string v8, "Flushing queue due to scheduled or forced flush"

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 255
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->updateFlushFrequency()V
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)V

    .line 256
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    iget-wide v10, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1

    cmp-long v7, v8, v10

    if-ltz v7, :cond_1

    .line 258
    :try_start_9
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    invoke-direct {p0, v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendAllData(Lcom/mixpanel/android/mpmetrics/MPDbAdapter;)V

    .line 259
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDecideChecker:Lcom/mixpanel/android/mpmetrics/DecideChecker;

    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v8

    invoke-virtual {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getPoster()Lcom/mixpanel/android/util/RemoteService;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->runDecideChecks(Lcom/mixpanel/android/util/RemoteService;)V
    :try_end_9
    .catch Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_0

    .line 260
    :catch_2
    move-exception v1

    .line 261
    .local v1, "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    :try_start_a
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    invoke-virtual {v1}, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;->getRetryAfter()I

    move-result v7

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v10, v7

    add-long/2addr v8, v10

    iput-wide v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J

    goto/16 :goto_0

    .line 265
    .end local v1    # "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    :cond_6
    iget v7, p1, Landroid/os/Message;->what:I

    const/16 v8, 0xc

    if-ne v7, v8, :cond_7

    .line 266
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    const-string v8, "Installing a check for surveys and in-app notifications"

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 267
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/mixpanel/android/mpmetrics/DecideMessages;

    .line 268
    .local v0, "check":Lcom/mixpanel/android/mpmetrics/DecideMessages;
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDecideChecker:Lcom/mixpanel/android/mpmetrics/DecideChecker;

    invoke-virtual {v7, v0}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->addDecideCheck(Lcom/mixpanel/android/mpmetrics/DecideMessages;)V

    .line 269
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    iget-wide v10, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_1

    cmp-long v7, v8, v10

    if-ltz v7, :cond_1

    .line 271
    :try_start_b
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDecideChecker:Lcom/mixpanel/android/mpmetrics/DecideChecker;

    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v8

    invoke-virtual {v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getPoster()Lcom/mixpanel/android/util/RemoteService;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->runDecideChecks(Lcom/mixpanel/android/util/RemoteService;)V
    :try_end_b
    .catch Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_1

    goto/16 :goto_0

    .line 272
    :catch_3
    move-exception v1

    .line 273
    .restart local v1    # "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    :try_start_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    invoke-virtual {v1}, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;->getRetryAfter()I

    move-result v7

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v10, v7

    add-long/2addr v8, v10

    iput-wide v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J

    goto/16 :goto_0

    .line 277
    .end local v0    # "check":Lcom/mixpanel/android/mpmetrics/DecideMessages;
    .end local v1    # "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    :cond_7
    iget v7, p1, Landroid/os/Message;->what:I

    const/16 v8, 0xd

    if-ne v7, v8, :cond_8

    .line 278
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .line 279
    .local v5, "senderId":Ljava/lang/String;
    invoke-direct {p0, v5}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->runGCMRegistration(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 281
    .end local v5    # "senderId":Ljava/lang/String;
    :cond_8
    iget v7, p1, Landroid/os/Message;->what:I

    const/4 v8, 0x5

    if-ne v7, v8, :cond_9

    .line 282
    const-string v7, "MixpanelAPI.Messages"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Worker received a hard kill. Dumping all events and force-killing. Thread id "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Thread;->getId()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->mHandlerLock:Ljava/lang/Object;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_1

    .line 284
    :try_start_d
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mDbAdapter:Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    invoke-virtual {v7}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;->deleteDB()V

    .line 285
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    const/4 v9, 0x0

    invoke-static {v7, v9}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$3(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;Landroid/os/Handler;)V

    .line 286
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-virtual {v7}, Landroid/os/Looper;->quit()V

    .line 283
    monitor-exit v8

    goto/16 :goto_0

    :catchall_1
    move-exception v7

    monitor-exit v8
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :try_start_e
    throw v7

    .line 289
    :cond_9
    const-string v7, "MixpanelAPI.Messages"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Unexpected message received by Mixpanel worker: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 301
    :catch_4
    move-exception v1

    .line 302
    .restart local v1    # "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    invoke-virtual {v1}, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;->getRetryAfter()I

    move-result v7

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v10, v7

    add-long/2addr v8, v10

    iput-wide v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mRetryAfter:J

    goto/16 :goto_1

    .line 304
    .end local v1    # "e":Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
    :cond_a
    if-lez v4, :cond_3

    const/4 v7, 0x2

    invoke-virtual {p0, v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->hasMessages(I)Z

    move-result v7

    if-nez v7, :cond_3

    .line 311
    iget-object v7, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->this$1:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    # getter for: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->this$0:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    invoke-static {v7}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->access$5(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Queue depth "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " - Adding flush in "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-wide v10, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mFlushInterval:J

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    # invokes: Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V
    invoke-static {v7, v8}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V

    .line 312
    iget-wide v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mFlushInterval:J

    const-wide/16 v10, 0x0

    cmp-long v7, v8, v10

    if-ltz v7, :cond_3

    .line 313
    const/4 v7, 0x2

    iget-wide v8, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->mFlushInterval:J

    invoke-virtual {p0, v7, v8, v9}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker$AnalyticsMessageHandler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_1

    goto/16 :goto_1

    .line 323
    .local v1, "e":Ljava/lang/RuntimeException;
    :catch_5
    move-exception v6

    .line 324
    .local v6, "tooLate":Ljava/lang/Exception;
    :try_start_f
    const-string v7, "MixpanelAPI.Messages"

    const-string v9, "Could not halt looper"

    invoke-static {v7, v9, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto/16 :goto_2
.end method
