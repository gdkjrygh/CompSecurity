.class public Lcom/comscore/applications/ApplicationMeasurement;
.super Lcom/comscore/measurement/Measurement;


# direct methods
.method protected constructor <init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;)V
    .locals 7

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, v4

    invoke-direct/range {v0 .. v6}, Lcom/comscore/applications/ApplicationMeasurement;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method protected constructor <init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;ZZZ)V
    .locals 32

    invoke-direct/range {p0 .. p1}, Lcom/comscore/measurement/Measurement;-><init>(Lcom/comscore/analytics/Core;)V

    move-object/from16 v0, p1

    move/from16 v1, p6

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->update(Z)V

    if-eqz p6, :cond_3

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getForegroundTransitionsCountDelta(Z)I

    move-result v4

    move-object/from16 v0, p1

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getForegroundTotalTime(Z)J

    move-result-wide v6

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getForegroundTimeDelta(Z)J

    move-result-wide v8

    move-object/from16 v0, p1

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getBackgroundTotalTime(Z)J

    move-result-wide v10

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getBackgroundTimeDelta(Z)J

    move-result-wide v12

    move-object/from16 v0, p1

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getInactiveTotalTime(Z)J

    move-result-wide v14

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getInactiveTimeDelta(Z)J

    move-result-wide v16

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getApplicationSessionTimeDelta(Z)J

    move-result-wide v18

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getActiveUserSessionTimeDelta(Z)J

    move-result-wide v20

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getUserSessionTimeDelta(Z)J

    move-result-wide v22

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getAutoUpdateInterval()J

    move-result-wide v24

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getApplicationSessionCountDelta(Z)I

    move-result v5

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getActiveUserSessionCountDelta(Z)I

    move-result v26

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getUserSessionCountDelta(Z)I

    move-result v27

    move-object/from16 v0, p1

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->getUserInteractionCount(Z)I

    move-result v28

    new-instance v29, Lcom/comscore/measurement/Label;

    const-string v30, "ns_ap_fg"

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const/16 v31, 0x0

    invoke-static/range {v31 .. v31}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v31

    move-object/from16 v0, v29

    move-object/from16 v1, v30

    move-object/from16 v2, v31

    invoke-direct {v0, v1, v4, v2}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v29, "ns_ap_ft"

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    move-object/from16 v0, v29

    invoke-direct {v4, v0, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_dft"

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_bt"

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_dbt"

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_it"

    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_dit"

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    const-wide/32 v6, 0xea60

    cmp-long v4, v24, v6

    if-ltz v4, :cond_0

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_ut"

    invoke-static/range {v24 .. v25}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_0
    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_as"

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v6, v5, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_das"

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    if-ltz v26, :cond_1

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_aus"

    invoke-static/range {v26 .. v26}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_daus"

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_uc"

    invoke-static/range {v28 .. v28}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_1
    if-ltz v27, :cond_2

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_us"

    invoke-static/range {v27 .. v27}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_dus"

    invoke-static/range {v22 .. v23}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_2
    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_usage"

    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/comscore/applications/ApplicationMeasurement;->c:J

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getGenesis()J

    move-result-wide v8

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_3
    if-eqz p3, :cond_4

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Lcom/comscore/applications/ApplicationMeasurement;->setPixelURL(Ljava/lang/String;)V

    :cond_4
    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "c1"

    const-string v6, "19"

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_an"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getAppName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_pn"

    const-string v6, "android"

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "c12"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getVisitorId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getCrossPublisherId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ak"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getCrossPublisherId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getIdHelper()Lcom/comscore/utils/id/IdHelper;

    move-result-object v4

    invoke-virtual {v4}, Lcom/comscore/utils/id/IdHelper;->getMD5AdvertisingId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    const-string v4, "ns_ap_i3"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getIdHelper()Lcom/comscore/utils/id/IdHelper;

    move-result-object v5

    invoke-virtual {v5}, Lcom/comscore/utils/id/IdHelper;->getMD5AdvertisingId()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v5}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_device"

    sget-object v6, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_type"

    invoke-static/range {p2 .. p2}, Lcom/comscore/applications/ApplicationMeasurement;->a(Lcom/comscore/applications/EventType;)Lcom/comscore/metrics/EventType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/comscore/metrics/EventType;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ts"

    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/comscore/applications/ApplicationMeasurement;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_nc"

    const-string v6, "1"

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_pfv"

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_pfm"

    const-string v6, "android"

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_ev"

    invoke-virtual/range {p2 .. p2}, Lcom/comscore/applications/EventType;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_ver"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getCurrentVersion()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v5, v6, v7, v8}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->a(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v4

    iget v5, v4, Landroid/graphics/Point;->x:I

    iget v4, v4, Landroid/graphics/Point;->y:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "x"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/comscore/measurement/Label;

    const-string v6, "ns_ap_res"

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v5, v6, v4, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_lang"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_sv"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getVersion()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    sget-object v4, Lcom/comscore/applications/EventType;->KEEPALIVE:Lcom/comscore/applications/EventType;

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lcom/comscore/applications/EventType;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v4, "ns_ap_oc"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getOfflineCache()Lcom/comscore/utils/OfflineMeasurementsCache;

    move-result-object v5

    invoke-virtual {v5}, Lcom/comscore/utils/OfflineMeasurementsCache;->getEventCount()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v5}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getColdStartId()J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getColdStartCount()I

    move-result v6

    new-instance v7, Lcom/comscore/measurement/Label;

    const-string v8, "ns_ap_id"

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v7, v8, v4, v5}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_cs"

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v4, Lcom/comscore/measurement/Label;

    const-string v5, "ns_ap_bi"

    invoke-virtual/range {p1 .. p1}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/graphics/Point;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xd

    if-lt v2, v3, :cond_0

    invoke-static {v0}, Lcom/comscore/utils/API13;->getDisplaySize(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v2

    iput v2, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    iput v0, v1, Landroid/graphics/Point;->y:I

    move-object v0, v1

    goto :goto_0
.end method

.method private static a(Lcom/comscore/applications/EventType;)Lcom/comscore/metrics/EventType;
    .locals 1

    sget-object v0, Lcom/comscore/applications/EventType;->START:Lcom/comscore/applications/EventType;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/comscore/applications/EventType;->CLOSE:Lcom/comscore/applications/EventType;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/comscore/applications/EventType;->VIEW:Lcom/comscore/applications/EventType;

    if-ne p0, v0, :cond_1

    :cond_0
    sget-object v0, Lcom/comscore/metrics/EventType;->VIEW:Lcom/comscore/metrics/EventType;

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/comscore/metrics/EventType;->HIDDEN:Lcom/comscore/metrics/EventType;

    goto :goto_0
.end method

.method public static newApplicationMeasurement(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/util/HashMap;Ljava/lang/String;)Lcom/comscore/applications/ApplicationMeasurement;
    .locals 8

    const/4 v7, 0x1

    const/4 v4, 0x0

    const/4 v0, 0x0

    sget-object v1, Lcom/comscore/applications/EventType;->START:Lcom/comscore/applications/EventType;

    if-ne p1, v1, :cond_3

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->incrementRunsCount()V

    new-instance v0, Lcom/comscore/applications/AppStartMeasurement;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->handleColdStart()Z

    move-result v1

    invoke-direct {v0, p0, p1, p3, v1}, Lcom/comscore/applications/AppStartMeasurement;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;Z)V

    :cond_0
    :goto_0
    sget-object v1, Lcom/comscore/applications/EventType;->AGGREGATE:Lcom/comscore/applications/EventType;

    if-eq p1, v1, :cond_1

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getLabels()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/comscore/applications/ApplicationMeasurement;->a(Ljava/util/HashMap;)V

    :cond_1
    sget-object v1, Lcom/comscore/applications/EventType;->AGGREGATE:Lcom/comscore/applications/EventType;

    if-ne p1, v1, :cond_9

    :goto_1
    invoke-virtual {v0, p2, v7}, Lcom/comscore/applications/ApplicationMeasurement;->a(Ljava/util/HashMap;Z)V

    const-string v1, "name"

    invoke-virtual {v0, v1}, Lcom/comscore/applications/ApplicationMeasurement;->hasLabel(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getCurrentActivityName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    const-string v1, "name"

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getCurrentActivityName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    return-object v0

    :cond_3
    sget-object v1, Lcom/comscore/applications/EventType;->AGGREGATE:Lcom/comscore/applications/EventType;

    if-ne p1, v1, :cond_4

    new-instance v0, Lcom/comscore/applications/AggregateMeasurement;

    invoke-direct {v0, p0, p1, p3}, Lcom/comscore/applications/AggregateMeasurement;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/comscore/applications/EventType;->CLOSE:Lcom/comscore/applications/EventType;

    if-eq p1, v1, :cond_0

    if-eqz p2, :cond_5

    const-string v0, "ns_st_ev"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "hb"

    if-eq v0, v1, :cond_7

    :cond_5
    move v5, v7

    :goto_3
    if-eqz p2, :cond_6

    const-string v0, "ns_st_ev"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_6
    move v6, v7

    :goto_4
    new-instance v0, Lcom/comscore/applications/ApplicationMeasurement;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/comscore/applications/ApplicationMeasurement;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;ZZZ)V

    goto :goto_0

    :cond_7
    move v5, v4

    goto :goto_3

    :cond_8
    move v6, v4

    goto :goto_4

    :cond_9
    move v7, v4

    goto :goto_1

    :cond_a
    sget-object v1, Lcom/comscore/applications/EventType;->START:Lcom/comscore/applications/EventType;

    if-ne p1, v1, :cond_b

    const-string v1, "name"

    const-string v2, "start"

    invoke-virtual {v0, v1, v2}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_b
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getApplicationState()Lcom/comscore/analytics/ApplicationState;

    move-result-object v1

    sget-object v2, Lcom/comscore/analytics/ApplicationState;->FOREGROUND:Lcom/comscore/analytics/ApplicationState;

    if-ne v1, v2, :cond_c

    const-string v1, "name"

    const-string v2, "foreground"

    invoke-virtual {v0, v1, v2}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_c
    const-string v1, "name"

    const-string v2, "background"

    invoke-virtual {v0, v1, v2}, Lcom/comscore/applications/ApplicationMeasurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2
.end method
