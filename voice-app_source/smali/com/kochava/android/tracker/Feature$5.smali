.class Lcom/kochava/android/tracker/Feature$5;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->tryUpdate(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;

.field final synthetic val$source:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 1400
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    iput-object p2, p0, Lcom/kochava/android/tracker/Feature$5;->val$source:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 1405
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "Checking watchlist from "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->val$source:Ljava/lang/String;

    move-object/from16 v22, v0

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    const-string v22, "..."

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1407
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1409
    .local v4, "changed_watchlist_values":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "app_short_string"

    invoke-interface/range {v21 .. v22}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v21

    if-nez v21, :cond_7

    .line 1411
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "No previous app_short_string in watchlist, adding "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v22, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;
    invoke-static/range {v22 .. v22}, Lcom/kochava/android/tracker/Feature;->access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1412
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "app_short_string"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1425
    :cond_0
    :goto_0
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "app_limit_tracking"

    invoke-interface/range {v21 .. v22}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v21

    if-nez v21, :cond_8

    .line 1427
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "No previous app_limit_tracking in watchlist, adding "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v22, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z
    invoke-static/range {v22 .. v22}, Lcom/kochava/android/tracker/Feature;->access$2200(Lcom/kochava/android/tracker/Feature;)Z

    move-result v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1428
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "app_limit_tracking"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2200(Lcom/kochava/android/tracker/Feature;)Z

    move-result v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1441
    :cond_1
    :goto_1
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "app_version"

    invoke-interface/range {v21 .. v22}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v21

    if-nez v21, :cond_9

    .line 1443
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "No previous app_version in watchlist, adding "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v22, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;
    invoke-static/range {v22 .. v22}, Lcom/kochava/android/tracker/Feature;->access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1444
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "app_version"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1457
    :cond_2
    :goto_2
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "device_limit_tracking"

    invoke-interface/range {v21 .. v22}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v21

    if-nez v21, :cond_a

    .line 1459
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "No previous device_limit_tracking in watchlist, adding "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2400()Z

    move-result v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1460
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "device_limit_tracking"

    # getter for: Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2400()Z

    move-result v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1474
    :cond_3
    :goto_3
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "adid"

    invoke-interface/range {v21 .. v22}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v21

    if-nez v21, :cond_b

    .line 1476
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "No previous adid in watchlist, adding "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1477
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "adid"

    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1490
    :cond_4
    :goto_4
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "os_version"

    invoke-interface/range {v21 .. v22}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v21

    if-nez v21, :cond_c

    .line 1492
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "No previous os_version in watchlist, adding "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1493
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "os_version"

    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1506
    :cond_5
    :goto_5
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/Set;->isEmpty()Z

    move-result v21

    if-nez v21, :cond_6

    .line 1510
    :try_start_0
    new-instance v20, Lorg/json/JSONObject;

    invoke-direct/range {v20 .. v20}, Lorg/json/JSONObject;-><init>()V

    .line 1511
    .local v20, "updateJsonObject":Lorg/json/JSONObject;
    const-string v21, "action"

    const-string v22, "update"

    invoke-virtual/range {v20 .. v22}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1512
    const-string v21, "kochava_device_id"

    # invokes: Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1800()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v20 .. v22}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1513
    const-string v21, "kochava_app_id"

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$500()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v20 .. v22}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1515
    new-instance v19, Lorg/json/JSONObject;

    invoke-direct/range {v19 .. v19}, Lorg/json/JSONObject;-><init>()V

    .line 1517
    .local v19, "updateChangesJsonObject":Lorg/json/JSONObject;
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_6
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_d

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 1519
    .local v15, "key":Ljava/lang/String;
    invoke-virtual {v4, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v0, v15, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    .line 1559
    .end local v15    # "key":Ljava/lang/String;
    .end local v19    # "updateChangesJsonObject":Lorg/json/JSONObject;
    .end local v20    # "updateJsonObject":Lorg/json/JSONObject;
    :catch_0
    move-exception v11

    .line 1561
    .local v11, "e":Ljava/lang/Exception;
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "Update error: "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual {v11}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1565
    .end local v11    # "e":Ljava/lang/Exception;
    :cond_6
    :goto_7
    return-void

    .line 1416
    :cond_7
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "app_short_string"

    const-string v23, ""

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1417
    .local v7, "compare_app_short_string":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v21, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;
    invoke-static/range {v21 .. v21}, Lcom/kochava/android/tracker/Feature;->access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_0

    .line 1419
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "app_short_string changed! Is now "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v22, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;
    invoke-static/range {v22 .. v22}, Lcom/kochava/android/tracker/Feature;->access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1420
    const-string v21, "app_short_string"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, ""

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1421
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "app_short_string"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_0

    .line 1432
    .end local v7    # "compare_app_short_string":Ljava/lang/String;
    :cond_8
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "app_limit_tracking"

    const/16 v23, 0x0

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 1433
    .local v6, "compare_app_limit_tracking":Z
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v21, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z
    invoke-static/range {v21 .. v21}, Lcom/kochava/android/tracker/Feature;->access$2200(Lcom/kochava/android/tracker/Feature;)Z

    move-result v21

    move/from16 v0, v21

    if-eq v6, v0, :cond_1

    .line 1435
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "app_limit_tracking changed! Is now "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v22, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z
    invoke-static/range {v22 .. v22}, Lcom/kochava/android/tracker/Feature;->access$2200(Lcom/kochava/android/tracker/Feature;)Z

    move-result v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1436
    const-string v21, "app_limit_tracking"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2200(Lcom/kochava/android/tracker/Feature;)Z

    move-result v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, ""

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1437
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "app_limit_tracking"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # getter for: Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2200(Lcom/kochava/android/tracker/Feature;)Z

    move-result v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_1

    .line 1448
    .end local v6    # "compare_app_limit_tracking":Z
    :cond_9
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "app_version"

    const-string v23, ""

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1449
    .local v8, "compare_app_version":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v21, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;
    invoke-static/range {v21 .. v21}, Lcom/kochava/android/tracker/Feature;->access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_2

    .line 1451
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "app_version changed! Is now "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v22, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;
    invoke-static/range {v22 .. v22}, Lcom/kochava/android/tracker/Feature;->access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1452
    const-string v21, "app_version"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, ""

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1453
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "app_version"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$5;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v23, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;
    invoke-static/range {v23 .. v23}, Lcom/kochava/android/tracker/Feature;->access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_2

    .line 1465
    .end local v8    # "compare_app_version":Ljava/lang/String;
    :cond_a
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "device_limit_tracking"

    const/16 v23, 0x0

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    .line 1466
    .local v9, "compare_device_limit_tracking":Z
    # getter for: Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2400()Z

    move-result v21

    move/from16 v0, v21

    if-eq v9, v0, :cond_3

    .line 1468
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "device_limit_tracking changed! Is now "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2400()Z

    move-result v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1469
    const-string v21, "device_limit_tracking"

    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    # getter for: Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2400()Z

    move-result v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, ""

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1470
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "device_limit_tracking"

    # getter for: Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2400()Z

    move-result v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_3

    .line 1481
    .end local v9    # "compare_device_limit_tracking":Z
    :cond_b
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "adid"

    const-string v23, ""

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1482
    .local v5, "compare_adid":Ljava/lang/String;
    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_4

    .line 1484
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "adid changed! Is now "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1485
    const-string v21, "adid"

    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1486
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "adid"

    # getter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$100()Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_4

    .line 1497
    .end local v5    # "compare_adid":Ljava/lang/String;
    :cond_c
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    const-string v22, "os_version"

    const-string v23, ""

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1498
    .local v10, "compare_os_version":Ljava/lang/String;
    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_5

    .line 1500
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "os_version changed! Is now "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1501
    const-string v21, "os_version"

    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1502
    # getter for: Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$800()Landroid/content/SharedPreferences;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    const-string v22, "os_version"

    # invokes: Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$2500()Ljava/lang/String;

    move-result-object v23

    invoke-interface/range {v21 .. v23}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_5

    .line 1522
    .end local v10    # "compare_os_version":Ljava/lang/String;
    .restart local v19    # "updateChangesJsonObject":Lorg/json/JSONObject;
    .restart local v20    # "updateJsonObject":Lorg/json/JSONObject;
    :cond_d
    :try_start_1
    const-string v21, "data"

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1529
    const/16 v21, 0x0

    # invokes: Lcom/kochava/android/tracker/Feature;->createHttpClient(Z)Lorg/apache/http/client/HttpClient;
    invoke-static/range {v21 .. v21}, Lcom/kochava/android/tracker/Feature;->access$200(Z)Lorg/apache/http/client/HttpClient;

    move-result-object v13

    .line 1532
    .local v13, "httpclient":Lorg/apache/http/client/HttpClient;
    invoke-interface {v13}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$300()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v21 .. v22}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 1534
    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v21

    if-eqz v21, :cond_e

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->isEmpty()Z

    move-result v21

    if-eqz v21, :cond_f

    .line 1536
    :cond_e
    const-string v21, "control.kochava.com"

    # setter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static/range {v21 .. v21}, Lcom/kochava/android/tracker/Feature;->access$402(Ljava/lang/String;)Ljava/lang/String;

    .line 1540
    :cond_f
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "posting update to "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    const-string v22, "https://"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    const-string v22, "/track/kvTracker.php"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1541
    new-instance v14, Lorg/apache/http/client/methods/HttpPost;

    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "https://"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    # getter for: Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$400()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    const-string v22, "/track/kvTracker.php"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-direct {v14, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 1544
    .local v14, "httppost":Lorg/apache/http/client/methods/HttpPost;
    new-instance v18, Lorg/apache/http/entity/StringEntity;

    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v21

    const-string v22, "UTF-8"

    move-object/from16 v0, v18

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v2}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1545
    .local v18, "sentity":Lorg/apache/http/entity/StringEntity;
    new-instance v3, Lorg/apache/http/message/BasicHeader;

    const-string v21, "Content-Type"

    const-string v22, "application/xml"

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-direct {v3, v0, v1}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1546
    .local v3, "basicHeader":Lorg/apache/http/message/BasicHeader;
    invoke-virtual {v14}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v21

    const-string v22, "http.protocol.expect-continue"

    const/16 v23, 0x0

    invoke-interface/range {v21 .. v23}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;

    .line 1547
    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Lorg/apache/http/entity/StringEntity;->setContentType(Lorg/apache/http/Header;)V

    .line 1548
    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 1549
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "Trying to post an update: "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1550
    invoke-interface {v13, v14}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v16

    .line 1551
    .local v16, "response":Lorg/apache/http/HttpResponse;
    invoke-interface/range {v16 .. v16}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v12

    .line 1552
    .local v12, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v12, :cond_6

    .line 1554
    invoke-interface {v12}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/StringUtils;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v17

    .line 1555
    .local v17, "result":Ljava/lang/String;
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "Update Result: "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_7
.end method
