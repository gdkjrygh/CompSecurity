.class final Lcom/adobe/mobile/AnalyticsTrackLocation;
.super Ljava/lang/Object;
.source "AnalyticsTrackLocation.java"


# static fields
.field private static final ACCURACY_KEY:Ljava/lang/String; = "a.loc.acc"

.field private static final LOCATION_ACTION_NAME:Ljava/lang/String; = "Location"

.field private static final LOCATION_LAT_PART1_KEY:Ljava/lang/String; = "a.loc.lat.a"

.field private static final LOCATION_LAT_PART2_KEY:Ljava/lang/String; = "a.loc.lat.b"

.field private static final LOCATION_LAT_PART3_KEY:Ljava/lang/String; = "a.loc.lat.c"

.field private static final LOCATION_LON_PART1_KEY:Ljava/lang/String; = "a.loc.lon.a"

.field private static final LOCATION_LON_PART2_KEY:Ljava/lang/String; = "a.loc.lon.b"

.field private static final LOCATION_LON_PART3_KEY:Ljava/lang/String; = "a.loc.lon.c"

.field private static final POI_DIST_KEY:Ljava/lang/String; = "a.loc.dist"

.field private static final POI_NAME_KEY:Ljava/lang/String; = "a.loc.poi"

.field private static final WHOLE_ONLY_FLOAT_FORMAT:Ljava/lang/String; = "%.0f"

.field private static final ZERO_PADDED_11_6_FLOAT_FORMAT:Ljava/lang/String; = "% 011.6f"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static trackLocation(Landroid/location/Location;Ljava/util/Map;)V
    .locals 28
    .param p0, "location"    # Landroid/location/Location;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 48
    .local p1, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez p0, :cond_0

    .line 49
    const-string v19, "Analytics - trackLocation failed, invalid location specified"

    const/16 v22, 0x0

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    :goto_0
    return-void

    .line 54
    :cond_0
    sget-object v19, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v22, "% 011.6f"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v25

    aput-object v25, v23, v24

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 55
    .local v8, "latString":Ljava/lang/String;
    sget-object v19, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v22, "% 011.6f"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v25

    aput-object v25, v23, v24

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 58
    .local v9, "lonString":Ljava/lang/String;
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 61
    .local v4, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p1, :cond_1

    .line 62
    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 71
    :cond_1
    const-string v19, "a.loc.lat.a"

    const/16 v22, 0x0

    const/16 v23, 0x6

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    const-string v19, "a.loc.lat.b"

    const/16 v22, 0x6

    const/16 v23, 0x8

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v19, "a.loc.lat.c"

    const/16 v22, 0x8

    const/16 v23, 0xa

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const-string v19, "a.loc.lon.a"

    const/16 v22, 0x0

    const/16 v23, 0x6

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v19, "a.loc.lon.b"

    const/16 v22, 0x6

    const/16 v23, 0x8

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    const-string v19, "a.loc.lon.c"

    const/16 v22, 0x8

    const/16 v23, 0xa

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->hasAccuracy()Z

    move-result v19

    if-eqz v19, :cond_2

    .line 80
    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getAccuracy()F

    move-result v19

    const/16 v22, 0x0

    cmpl-float v19, v19, v22

    if-lez v19, :cond_2

    .line 81
    const-string v19, "a.loc.acc"

    sget-object v22, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v23, "%.0f"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getAccuracy()F

    move-result v26

    invoke-static/range {v26 .. v26}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    aput-object v26, v24, v25

    invoke-static/range {v22 .. v24}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :cond_2
    const-string v19, "a.loc.poi"

    invoke-static/range {v19 .. v19}, Lcom/adobe/mobile/TargetWorker;->removePersistentParameter(Ljava/lang/String;)V

    .line 86
    const-string v19, "a.loc.dist"

    invoke-static/range {v19 .. v19}, Lcom/adobe/mobile/TargetWorker;->removePersistentParameter(Ljava/lang/String;)V

    .line 89
    const-string v19, "a.loc.poi"

    invoke-static/range {v19 .. v19}, Lcom/adobe/mobile/Lifecycle;->removeContextData(Ljava/lang/String;)V

    .line 91
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lcom/adobe/mobile/MobileConfig;->getPointsOfInterest()Ljava/util/List;

    move-result-object v15

    .line 93
    .local v15, "poi":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/Object;>;>;"
    if-eqz v15, :cond_4

    .line 94
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :cond_3
    :goto_1
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_4

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;

    .line 95
    .local v16, "poiArray":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    if-eqz v16, :cond_3

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v19

    const/16 v23, 0x4

    move/from16 v0, v19

    move/from16 v1, v23

    if-ne v0, v1, :cond_3

    .line 104
    const/16 v19, 0x0

    :try_start_0
    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    .line 105
    .local v14, "name":Ljava/lang/String;
    const/16 v19, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Double;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    .line 106
    .local v10, "latitude":D
    const/16 v19, 0x2

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Double;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    .line 107
    .local v12, "longitude":D
    const/16 v19, 0x3

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Double;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Double;->doubleValue()D
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v20

    .line 114
    .local v20, "radius":D
    new-instance v18, Landroid/location/Location;

    const-string v19, "poi"

    invoke-direct/range {v18 .. v19}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 115
    .local v18, "poiLocation":Landroid/location/Location;
    move-object/from16 v0, v18

    invoke-virtual {v0, v10, v11}, Landroid/location/Location;->setLatitude(D)V

    .line 116
    move-object/from16 v0, v18

    invoke-virtual {v0, v12, v13}, Landroid/location/Location;->setLongitude(D)V

    .line 119
    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v19

    move/from16 v0, v19

    float-to-double v6, v0

    .line 122
    .local v6, "distance":D
    cmpg-double v19, v6, v20

    if-gtz v19, :cond_3

    if-eqz v14, :cond_3

    .line 123
    const-string v19, "a.loc.poi"

    move-object/from16 v0, v19

    invoke-virtual {v4, v0, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    const-string v19, "a.loc.poi"

    move-object/from16 v0, v19

    invoke-static {v0, v14}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v19, "a.loc.dist"

    sget-object v22, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v23, "%.0f"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v26

    aput-object v26, v24, v25

    invoke-static/range {v22 .. v24}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    const-string v19, "a.loc.dist"

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-static {v0, v1}, Lcom/adobe/mobile/TargetWorker;->addPersistentParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    new-instance v17, Ljava/util/HashMap;

    invoke-direct/range {v17 .. v17}, Ljava/util/HashMap;-><init>()V

    .line 131
    .local v17, "poiData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v19, "a.loc.poi"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    invoke-static/range {v17 .. v17}, Lcom/adobe/mobile/Lifecycle;->updateContextData(Ljava/util/HashMap;)V

    .line 141
    .end local v6    # "distance":D
    .end local v10    # "latitude":D
    .end local v12    # "longitude":D
    .end local v14    # "name":Ljava/lang/String;
    .end local v16    # "poiArray":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    .end local v17    # "poiData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v18    # "poiLocation":Landroid/location/Location;
    .end local v20    # "radius":D
    :cond_4
    const-string v19, "Location"

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v22

    move-object/from16 v0, v19

    move-wide/from16 v1, v22

    invoke-static {v0, v4, v1, v2}, Lcom/adobe/mobile/AnalyticsTrackInternal;->trackInternal(Ljava/lang/String;Ljava/util/Map;J)V

    goto/16 :goto_0

    .line 108
    .restart local v16    # "poiArray":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    :catch_0
    move-exception v5

    .line 109
    .local v5, "ex":Ljava/lang/ClassCastException;
    const-string v19, "Analytics - Invalid data for point of interest(%s)"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v25

    aput-object v25, v23, v24

    move-object/from16 v0, v19

    move-object/from16 v1, v23

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1
.end method
