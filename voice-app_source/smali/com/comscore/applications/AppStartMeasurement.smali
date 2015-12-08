.class public Lcom/comscore/applications/AppStartMeasurement;
.super Lcom/comscore/applications/ApplicationMeasurement;


# direct methods
.method protected constructor <init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;Z)V
    .locals 8

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/comscore/applications/ApplicationMeasurement;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/lang/String;ZZZ)V

    new-instance v0, Lcom/comscore/measurement/Label;

    const-string v1, "ns_ap_gs"

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getFirstInstallId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v0, Lcom/comscore/measurement/Label;

    const-string v1, "ns_ap_install"

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getInstallId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v0, Lcom/comscore/measurement/Label;

    const-string v1, "ns_ap_runs"

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getRunsCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    if-eqz p4, :cond_0

    new-instance v0, Lcom/comscore/measurement/Label;

    const-string v1, "ns_ap_csf"

    const-string v2, "1"

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_0
    const-string v0, "0"

    invoke-static {}, Lcom/comscore/utils/RootDetector;->isDeviceRooted()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "1"

    :cond_1
    new-instance v1, Lcom/comscore/measurement/Label;

    const-string v2, "ns_ap_jb"

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v1}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    new-instance v0, Lcom/comscore/measurement/Label;

    const-string v1, "ns_ap_lastrun"

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getPreviousGenesis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getPreviousVersion()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    new-instance v1, Lcom/comscore/measurement/Label;

    const-string v2, "ns_ap_updated"

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lcom/comscore/measurement/Label;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v1}, Lcom/comscore/applications/AppStartMeasurement;->setLabel(Lcom/comscore/measurement/Label;)V

    :cond_2
    return-void
.end method
