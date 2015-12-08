.class public final Lcom/adobe/mobile/Media;
.super Ljava/lang/Object;
.source "Media.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/Media$MediaCallback;
    }
.end annotation


# static fields
.field private static final NO_ANALYTICS_MESSAGE:Ljava/lang/String; = "Analytics - ADBMobile is not configured correctly to use Analytics."


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public static adSettingsWith(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)Lcom/adobe/mobile/MediaSettings;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "length"    # D
    .param p3, "playerName"    # Ljava/lang/String;
    .param p4, "parentName"    # Ljava/lang/String;
    .param p5, "parentPod"    # Ljava/lang/String;
    .param p6, "parentPodPosition"    # D
    .param p8, "CPM"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-static/range {p0 .. p8}, Lcom/adobe/mobile/MediaSettings;->adSettingsWith(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)Lcom/adobe/mobile/MediaSettings;

    move-result-object v0

    return-object v0
.end method

.method public static click(Ljava/lang/String;D)V
    .locals 3
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "offset"    # D

    .prologue
    .line 134
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Media$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/adobe/mobile/Media$6;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 139
    return-void
.end method

.method public static close(Ljava/lang/String;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 74
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Media$2;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/Media$2;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 79
    return-void
.end method

.method public static complete(Ljava/lang/String;D)V
    .locals 3
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "offset"    # D

    .prologue
    .line 104
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Media$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/adobe/mobile/Media$4;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 109
    return-void
.end method

.method public static open(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/Media$MediaCallback;)V
    .locals 2
    .param p0, "settings"    # Lcom/adobe/mobile/MediaSettings;
    .param p1, "callback"    # Lcom/adobe/mobile/Media$MediaCallback;

    .prologue
    .line 60
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Media$1;

    invoke-direct {v1, p0, p1}, Lcom/adobe/mobile/Media$1;-><init>(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/Media$MediaCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 65
    return-void
.end method

.method public static play(Ljava/lang/String;D)V
    .locals 3
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "offset"    # D

    .prologue
    .line 89
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Media$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/adobe/mobile/Media$3;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 94
    return-void
.end method

.method public static settingsWith(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/adobe/mobile/MediaSettings;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "length"    # D
    .param p3, "playerName"    # Ljava/lang/String;
    .param p4, "playerID"    # Ljava/lang/String;

    .prologue
    .line 39
    invoke-static {p0, p1, p2, p3, p4}, Lcom/adobe/mobile/MediaSettings;->settingsWith(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/adobe/mobile/MediaSettings;

    move-result-object v0

    return-object v0
.end method

.method public static stop(Ljava/lang/String;D)V
    .locals 3
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "offset"    # D

    .prologue
    .line 119
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Media$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/adobe/mobile/Media$5;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 124
    return-void
.end method

.method public static track(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .param p0, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 148
    .local p1, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-static {}, Lcom/adobe/mobile/MediaAnalytics;->sharedInstance()Lcom/adobe/mobile/MediaAnalytics;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/adobe/mobile/MediaAnalytics;->setTrackCalledOnItem(Ljava/lang/String;)V

    .line 150
    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 151
    .local v0, "fdata":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :goto_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMediaExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/adobe/mobile/Media$7;

    invoke-direct {v2, p0, v0}, Lcom/adobe/mobile/Media$7;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 156
    return-void

    .line 150
    .end local v0    # "fdata":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
