.class public Lcom/urbanairship/location/LastLocationFinder;
.super Ljava/lang/Object;
.source "LastLocationFinder.java"


# instance fields
.field private locationManager:Landroid/location/LocationManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 49
    const-string v0, "location"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    invoke-direct {p0, v0}, Lcom/urbanairship/location/LastLocationFinder;-><init>(Landroid/location/LocationManager;)V

    .line 50
    return-void
.end method

.method constructor <init>(Landroid/location/LocationManager;)V
    .locals 0
    .param p1, "locationManager"    # Landroid/location/LocationManager;

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/urbanairship/location/LastLocationFinder;->locationManager:Landroid/location/LocationManager;

    .line 54
    return-void
.end method


# virtual methods
.method public getLastBestLocation(JLandroid/location/Criteria;)Landroid/location/Location;
    .locals 15
    .param p1, "maxAgeInMs"    # J
    .param p3, "criteria"    # Landroid/location/Criteria;

    .prologue
    const/4 v9, 0x0

    .line 64
    const/4 v3, 0x0

    .line 66
    .local v3, "latestLocation":Landroid/location/Location;
    iget-object v10, p0, Lcom/urbanairship/location/LastLocationFinder;->locationManager:Landroid/location/LocationManager;

    const/4 v11, 0x1

    move-object/from16 v0, p3

    invoke-virtual {v10, v0, v11}, Landroid/location/LocationManager;->getProviders(Landroid/location/Criteria;Z)Ljava/util/List;

    move-result-object v8

    .line 68
    .local v8, "providers":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v8, :cond_2

    .line 69
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 70
    .local v5, "provider":Ljava/lang/String;
    iget-object v10, p0, Lcom/urbanairship/location/LastLocationFinder;->locationManager:Landroid/location/LocationManager;

    invoke-virtual {v10, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v4

    .line 71
    .local v4, "location":Landroid/location/Location;
    if-eqz v4, :cond_0

    .line 75
    if-eqz v3, :cond_1

    invoke-virtual {v4}, Landroid/location/Location;->getTime()J

    move-result-wide v10

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v12

    cmp-long v10, v10, v12

    if-lez v10, :cond_0

    .line 76
    :cond_1
    move-object v3, v4

    goto :goto_0

    .line 81
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v4    # "location":Landroid/location/Location;
    .end local v5    # "provider":Ljava/lang/String;
    :cond_2
    if-nez v3, :cond_3

    .line 86
    .end local v3    # "latestLocation":Landroid/location/Location;
    :goto_1
    return-object v9

    .line 85
    .restart local v3    # "latestLocation":Landroid/location/Location;
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v12

    sub-long v6, v10, v12

    .line 86
    .local v6, "locationAge":J
    cmp-long v10, p1, v6

    if-gez v10, :cond_4

    move-object v3, v9

    .end local v3    # "latestLocation":Landroid/location/Location;
    :cond_4
    move-object v9, v3

    goto :goto_1
.end method
