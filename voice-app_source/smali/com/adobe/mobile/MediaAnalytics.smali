.class final Lcom/adobe/mobile/MediaAnalytics;
.super Ljava/lang/Object;
.source "MediaAnalytics.java"


# static fields
.field private static final AD_CLICKED_KEY:Ljava/lang/String; = "a.media.ad.clicked"

.field private static final AD_COMPLETE_KEY:Ljava/lang/String; = "a.media.ad.complete"

.field private static final AD_CPM:Ljava/lang/String; = "a.media.ad.CPM"

.field private static final AD_LENGTH_KEY:Ljava/lang/String; = "a.media.ad.length"

.field private static final AD_MILESTONE_KEY:Ljava/lang/String; = "a.media.ad.milestone"

.field private static final AD_NAME_KEY:Ljava/lang/String; = "a.media.ad.name"

.field private static final AD_OFFSET_MILESTONE_KEY:Ljava/lang/String; = "a.media.ad.offsetMilestone"

.field private static final AD_PLAYER_NAME_KEY:Ljava/lang/String; = "a.media.ad.playerName"

.field private static final AD_POD:Ljava/lang/String; = "a.media.ad.pod"

.field private static final AD_POD_POSITION:Ljava/lang/String; = "a.media.ad.podPosition"

.field private static final AD_SEGMENT_KEY:Ljava/lang/String; = "a.media.ad.segment"

.field private static final AD_SEGMENT_NUM_KEY:Ljava/lang/String; = "a.media.ad.segmentNum"

.field private static final AD_SEGMENT_VIEW_KEY:Ljava/lang/String; = "a.media.ad.segmentView"

.field private static final AD_TIME_PLAYED_KEY:Ljava/lang/String; = "a.media.ad.timePlayed"

.field private static final AD_VIEW_KEY:Ljava/lang/String; = "a.media.ad.view"

.field private static final CHANNEL_KEY:Ljava/lang/String; = "a.media.channel"

.field private static final COMPLETE_KEY:Ljava/lang/String; = "a.media.complete"

.field private static final CONTENT_TYPE_KEY:Ljava/lang/String; = "a.contentType"

.field private static final CONTENT_TYPE_VALUE:Ljava/lang/String; = "video"

.field private static final CONTENT_TYPE_VALUE_AD:Ljava/lang/String; = "videoAd"

.field private static final DEFAULT_PLAYER_NAME:Ljava/lang/String; = "Not_Specified"

.field private static final INITIAL_HIT_PAGE_EVENT:Ljava/lang/String; = "m_s"

.field private static final LENGTH_KEY:Ljava/lang/String; = "a.media.length"

.field protected static final LIVE_EVENT_LENGTH:D = -1.0

.field private static final MEDIA_CLICKED_KEY:Ljava/lang/String; = "a.media.clicked"

.field private static final MEDIA_HIT_PAGE_EVENT:Ljava/lang/String; = "m_i"

.field private static final MEDIA_VIEW_KEY:Ljava/lang/String; = "a.media.view"

.field private static final MILESTONE_KEY:Ljava/lang/String; = "a.media.milestone"

.field private static final NAME_KEY:Ljava/lang/String; = "a.media.name"

.field private static final OFFSET_MILESTONE_KEY:Ljava/lang/String; = "a.media.offsetMilestone"

.field private static final PAGE_EVENT_VAR_OVERRIDE:Ljava/lang/String; = "&&pe"

.field private static final PEV_VALUE_OVERRIDE:Ljava/lang/String; = "video"

.field private static final PEV_VALUE_OVERRIDE_AD:Ljava/lang/String; = "videoAd"

.field private static final PEV_VAR_OVERRIDE:Ljava/lang/String; = "&&pev3"

.field private static final PLAYER_NAME_KEY:Ljava/lang/String; = "a.media.playerName"

.field private static final SEGMENT_KEY:Ljava/lang/String; = "a.media.segment"

.field private static final SEGMENT_NUM_KEY:Ljava/lang/String; = "a.media.segmentNum"

.field private static final SEGMENT_VIEW_KEY:Ljava/lang/String; = "a.media.segmentView"

.field private static final TIME_PLAYED_KEY:Ljava/lang/String; = "a.media.timePlayed"

.field private static _instance:Lcom/adobe/mobile/MediaAnalytics;

.field private static final _instanceMutex:Ljava/lang/Object;

.field private static final unwantedValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected completeCloseOffsetThreshold:I

.field private final mediaItemList:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected trackSeconds:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 72
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v3, v0, v1

    const/4 v1, 0x1

    const-string v2, ""

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/adobe/mobile/MediaAnalytics;->unwantedValues:Ljava/util/List;

    .line 74
    sput-object v3, Lcom/adobe/mobile/MediaAnalytics;->_instance:Lcom/adobe/mobile/MediaAnalytics;

    .line 75
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MediaAnalytics;->_instanceMutex:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/adobe/mobile/MediaAnalytics;->trackSeconds:I

    .line 26
    const/4 v0, 0x1

    iput v0, p0, Lcom/adobe/mobile/MediaAnalytics;->completeCloseOffsetThreshold:I

    .line 71
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    return-void
.end method

.method private addGenericMediaContextData(Ljava/util/HashMap;Lcom/adobe/mobile/MediaItem;Z)V
    .locals 4
    .param p2, "mediaItem"    # Lcom/adobe/mobile/MediaItem;
    .param p3, "mediaViewed"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/adobe/mobile/MediaItem;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 426
    .local p1, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v1, "&&pe"

    if-eqz p3, :cond_5

    const-string v0, "m_s"

    :goto_0
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    iget-boolean v0, p2, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->parentName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 430
    const-string v0, "&&pev3"

    const-string v1, "videoAd"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    const-string v0, "a.contentType"

    const-string v1, "videoAd"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    const-string v0, "a.media.ad.name"

    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    const-string v0, "a.media.ad.playerName"

    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->getPlayerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    const-string v0, "a.media.name"

    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->parentName:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/adobe/mobile/MediaAnalytics;->cleanName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->isLive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 436
    const-string v0, "a.media.ad.length"

    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->getLength()D

    move-result-wide v2

    double-to-int v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    :cond_0
    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->parentPod:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->parentPod:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 441
    const-string v0, "a.media.ad.pod"

    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->parentPod:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    :cond_1
    iget-wide v0, p2, Lcom/adobe/mobile/MediaItem;->parentPodPosition:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 444
    const-string v0, "a.media.ad.podPosition"

    iget-wide v2, p2, Lcom/adobe/mobile/MediaItem;->parentPodPosition:D

    double-to-int v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    :cond_2
    if-eqz p3, :cond_3

    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->CPM:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 448
    const-string v0, "a.media.ad.CPM"

    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->CPM:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    :cond_3
    :goto_1
    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->channel:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 461
    const-string v0, "a.media.channel"

    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->channel:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    :cond_4
    return-void

    .line 426
    :cond_5
    const-string v0, "m_i"

    goto/16 :goto_0

    .line 451
    :cond_6
    const-string v0, "&&pev3"

    const-string v1, "video"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    const-string v0, "a.contentType"

    const-string v1, "video"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    const-string v0, "a.media.name"

    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    const-string v0, "a.media.playerName"

    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->getPlayerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->isLive()Z

    move-result v0

    if-nez v0, :cond_3

    .line 456
    const-string v0, "a.media.length"

    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->getLength()D

    move-result-wide v2

    double-to-int v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method private addSegmentContextData(Ljava/util/HashMap;Lcom/adobe/mobile/MediaItem;)V
    .locals 3
    .param p2, "mediaItem"    # Lcom/adobe/mobile/MediaItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/adobe/mobile/MediaItem;",
            ")V"
        }
    .end annotation

    .prologue
    .line 400
    .local p1, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->isSegmentByMilestones()Z

    move-result v1

    if-nez v1, :cond_0

    .line 401
    invoke-virtual {p2}, Lcom/adobe/mobile/MediaItem;->isSegmentByOffsetMilestones()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 403
    :cond_0
    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    .line 404
    .local v0, "segmentMediaState":Lcom/adobe/mobile/MediaState;
    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v1, :cond_3

    .line 405
    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->segmentNum:I

    iget v2, p2, Lcom/adobe/mobile/MediaItem;->lastTrackSegmentNumber:I

    if-ne v1, v2, :cond_1

    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v1, v1, Lcom/adobe/mobile/MediaState;->complete:Z

    if-eqz v1, :cond_2

    .line 406
    :cond_1
    iget-boolean v1, p2, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v1, :cond_6

    const-string v1, "a.media.segmentView"

    :goto_0
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    :cond_2
    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->segmentNum:I

    iget-object v2, p2, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v2, v2, Lcom/adobe/mobile/MediaState;->segmentNum:I

    if-eq v1, v2, :cond_3

    .line 409
    iget-object v0, p2, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    .line 413
    :cond_3
    iget v1, v0, Lcom/adobe/mobile/MediaState;->segmentNum:I

    if-lez v1, :cond_4

    .line 414
    iget-boolean v1, p2, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v1, :cond_7

    const-string v1, "a.media.segmentNum"

    :goto_1
    iget v2, v0, Lcom/adobe/mobile/MediaState;->segmentNum:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    :cond_4
    iget-object v1, v0, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 417
    iget-boolean v1, p2, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v1, :cond_8

    const-string v1, "a.media.segment"

    :goto_2
    iget-object v2, v0, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .end local v0    # "segmentMediaState":Lcom/adobe/mobile/MediaState;
    :cond_5
    iget-object v1, p2, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->segmentNum:I

    iput v1, p2, Lcom/adobe/mobile/MediaItem;->lastTrackSegmentNumber:I

    .line 421
    return-void

    .line 406
    .restart local v0    # "segmentMediaState":Lcom/adobe/mobile/MediaState;
    :cond_6
    const-string v1, "a.media.ad.segmentView"

    goto :goto_0

    .line 414
    :cond_7
    const-string v1, "a.media.ad.segmentNum"

    goto :goto_1

    .line 417
    :cond_8
    const-string v1, "a.media.ad.segment"

    goto :goto_2
.end method

.method private cleanName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 479
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    const/4 v0, 0x0

    .line 482
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "\n"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\r"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "--**--"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private hashMapIsNullOrEmpty(Ljava/util/HashMap;)Z
    .locals 1
    .param p1, "val"    # Ljava/util/HashMap;

    .prologue
    .line 503
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isNilOrEmptyString(Ljava/lang/String;)Z
    .locals 1
    .param p1, "val"    # Ljava/lang/String;

    .prologue
    .line 507
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 487
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->cleanName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 488
    .local v0, "cleanName":Ljava/lang/String;
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    invoke-direct {p0, v1}, Lcom/adobe/mobile/MediaAnalytics;->hashMapIsNullOrEmpty(Ljava/util/HashMap;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 489
    :cond_0
    const/4 v1, 0x0

    .line 492
    :goto_0
    return-object v1

    :cond_1
    iget-object v1, p0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/adobe/mobile/MediaItem;

    goto :goto_0
.end method

.method private notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V
    .locals 2
    .param p1, "mediaItem"    # Lcom/adobe/mobile/MediaItem;

    .prologue
    .line 316
    iget-object v0, p1, Lcom/adobe/mobile/MediaItem;->callback:Lcom/adobe/mobile/Media$MediaCallback;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p1, Lcom/adobe/mobile/MediaItem;->callback:Lcom/adobe/mobile/Media$MediaCallback;

    invoke-virtual {p1}, Lcom/adobe/mobile/MediaItem;->getReportMediaState()Lcom/adobe/mobile/MediaState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/adobe/mobile/Media$MediaCallback;->call(Ljava/lang/Object;)V

    .line 320
    :cond_0
    return-void
.end method

.method private removeEmptyValues(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 498
    .local p1, "data":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 499
    .local v0, "cleanValues":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/Object;>;"
    sget-object v1, Lcom/adobe/mobile/MediaAnalytics;->unwantedValues:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 500
    return-void
.end method

.method private removeMediaItemIfComplete(Lcom/adobe/mobile/MediaItem;)V
    .locals 4
    .param p1, "mediaItem"    # Lcom/adobe/mobile/MediaItem;

    .prologue
    .line 471
    iget-object v0, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v0, v0, Lcom/adobe/mobile/MediaState;->percent:D

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    :cond_0
    return-void
.end method

.method protected static sharedInstance()Lcom/adobe/mobile/MediaAnalytics;
    .locals 2

    .prologue
    .line 77
    sget-object v1, Lcom/adobe/mobile/MediaAnalytics;->_instanceMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 78
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/MediaAnalytics;->_instance:Lcom/adobe/mobile/MediaAnalytics;

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/adobe/mobile/MediaAnalytics;

    invoke-direct {v0}, Lcom/adobe/mobile/MediaAnalytics;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MediaAnalytics;->_instance:Lcom/adobe/mobile/MediaAnalytics;

    .line 82
    :cond_0
    sget-object v0, Lcom/adobe/mobile/MediaAnalytics;->_instance:Lcom/adobe/mobile/MediaAnalytics;

    monitor-exit v1

    return-object v0

    .line 83
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private trackMedia(Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 466
    .local p1, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v0, "Media"

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v2

    invoke-static {v0, p1, v2, v3}, Lcom/adobe/mobile/AnalyticsTrackInternal;->trackInternal(Ljava/lang/String;Ljava/util/Map;J)V

    .line 467
    return-void
.end method

.method private trackMediaItemWithContextData(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;)V
    .locals 4
    .param p1, "mediaItem"    # Lcom/adobe/mobile/MediaItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adobe/mobile/MediaItem;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 393
    .local p2, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {p0, p2}, Lcom/adobe/mobile/MediaAnalytics;->trackMedia(Ljava/util/HashMap;)V

    .line 396
    iget-object v0, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/adobe/mobile/MediaState;->setTimePlayedSinceTrack(D)V

    .line 397
    return-void
.end method

.method private trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V
    .locals 6
    .param p1, "mediaItem"    # Lcom/adobe/mobile/MediaItem;
    .param p3, "forceTrack"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adobe/mobile/MediaItem;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .local p2, "data":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v4, 0x1

    .line 335
    if-eqz p2, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 337
    .local v0, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    :goto_0
    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v2}, Lcom/adobe/mobile/MediaAnalytics;->addGenericMediaContextData(Ljava/util/HashMap;Lcom/adobe/mobile/MediaItem;Z)V

    .line 338
    invoke-direct {p0, v0, p1}, Lcom/adobe/mobile/MediaAnalytics;->addSegmentContextData(Ljava/util/HashMap;Lcom/adobe/mobile/MediaItem;)V

    .line 339
    move v1, p3

    .line 342
    .local v1, "track":Z
    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-nez v2, :cond_3

    .line 344
    const-string v2, "&&pe"

    const-string v3, "m_s"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    iget-boolean v2, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v2, :cond_2

    const-string v2, "a.media.view"

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    invoke-direct {p0, p1, v0}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaItemWithContextData(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;)V

    .line 388
    :cond_0
    :goto_2
    return-void

    .line 335
    .end local v0    # "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v1    # "track":Z
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    goto :goto_0

    .line 345
    .restart local v0    # "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .restart local v1    # "track":Z
    :cond_2
    const-string v2, "a.media.ad.view"

    goto :goto_1

    .line 350
    :cond_3
    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v2, v2, Lcom/adobe/mobile/MediaState;->complete:Z

    if-eqz v2, :cond_5

    .line 351
    invoke-virtual {p1}, Lcom/adobe/mobile/MediaItem;->isCompleteTracked()Z

    move-result v2

    if-nez v2, :cond_4

    .line 353
    iget-boolean v2, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v2, :cond_b

    const-string v2, "a.media.complete"

    :goto_3
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    invoke-virtual {p1, v4}, Lcom/adobe/mobile/MediaItem;->setCompleteTracked(Z)V

    .line 356
    const/4 v1, 0x1

    .line 359
    :cond_4
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->removeMediaItemIfComplete(Lcom/adobe/mobile/MediaItem;)V

    .line 362
    :cond_5
    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v2, v2, Lcom/adobe/mobile/MediaState;->clicked:Z

    if-eqz v2, :cond_6

    .line 363
    iget-boolean v2, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v2, :cond_c

    const-string v2, "a.media.clicked"

    :goto_4
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    :cond_6
    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v2, v2, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    iget-object v3, p1, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v3, v3, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    if-le v2, v3, :cond_7

    .line 368
    iget-boolean v2, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v2, :cond_d

    const-string v2, "a.media.offsetMilestone"

    :goto_5
    iget-object v3, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v3, v3, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    const/4 v1, 0x1

    .line 371
    :cond_7
    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v2, v2, Lcom/adobe/mobile/MediaState;->milestone:I

    iget-object v3, p1, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v3, v3, Lcom/adobe/mobile/MediaState;->milestone:I

    if-le v2, v3, :cond_8

    .line 373
    iget-boolean v2, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v2, :cond_e

    const-string v2, "a.media.milestone"

    :goto_6
    iget-object v3, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v3, v3, Lcom/adobe/mobile/MediaState;->milestone:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    const/4 v1, 0x1

    .line 378
    :cond_8
    invoke-virtual {p1}, Lcom/adobe/mobile/MediaItem;->getTrackSecondsThreshold()I

    move-result v2

    if-lez v2, :cond_9

    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v2}, Lcom/adobe/mobile/MediaState;->getTimePlayedSinceTrack()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/adobe/mobile/MediaItem;->getTrackSecondsThreshold()I

    move-result v4

    int-to-double v4, v4

    cmpl-double v2, v2, v4

    if-ltz v2, :cond_9

    .line 379
    const/4 v1, 0x1

    .line 382
    :cond_9
    if-eqz v1, :cond_0

    .line 383
    iget-object v2, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v2}, Lcom/adobe/mobile/MediaState;->getTimePlayedSinceTrack()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_a

    .line 384
    iget-boolean v2, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v2, :cond_f

    const-string v2, "a.media.timePlayed"

    :goto_7
    iget-object v3, p1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v3}, Lcom/adobe/mobile/MediaState;->getTimePlayedSinceTrack()D

    move-result-wide v4

    double-to-int v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    :cond_a
    invoke-direct {p0, p1, v0}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaItemWithContextData(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;)V

    goto/16 :goto_2

    .line 353
    :cond_b
    const-string v2, "a.media.ad.complete"

    goto/16 :goto_3

    .line 363
    :cond_c
    const-string v2, "a.media.ad.clicked"

    goto/16 :goto_4

    .line 368
    :cond_d
    const-string v2, "a.media.ad.offsetMilestone"

    goto :goto_5

    .line 373
    :cond_e
    const-string v2, "a.media.ad.milestone"

    goto :goto_6

    .line 384
    :cond_f
    const-string v2, "a.media.ad.timePlayed"

    goto :goto_7
.end method

.method private trackMediaViewed(Lcom/adobe/mobile/MediaItem;)V
    .locals 4
    .param p1, "mediaItem"    # Lcom/adobe/mobile/MediaItem;

    .prologue
    const/4 v3, 0x1

    .line 324
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 325
    .local v0, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    iget-boolean v1, p1, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    if-nez v1, :cond_0

    const-string v1, "a.media.view"

    :goto_0
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    invoke-direct {p0, v0, p1, v3}, Lcom/adobe/mobile/MediaAnalytics;->addGenericMediaContextData(Ljava/util/HashMap;Lcom/adobe/mobile/MediaItem;Z)V

    .line 327
    invoke-direct {p0, v0, p1}, Lcom/adobe/mobile/MediaAnalytics;->addSegmentContextData(Ljava/util/HashMap;Lcom/adobe/mobile/MediaItem;)V

    .line 328
    invoke-direct {p0, p1, v0}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaItemWithContextData(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;)V

    .line 330
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->removeMediaItemIfComplete(Lcom/adobe/mobile/MediaItem;)V

    .line 331
    return-void

    .line 325
    :cond_0
    const-string v1, "a.media.ad.view"

    goto :goto_0
.end method


# virtual methods
.method protected declared-synchronized click(Ljava/lang/String;D)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "offset"    # D

    .prologue
    .line 240
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;

    move-result-object v0

    .line 241
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaItem;->isPlaying()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 255
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 245
    :cond_1
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    .line 247
    invoke-virtual {v0, p2, p3}, Lcom/adobe/mobile/MediaItem;->click(D)V

    .line 250
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V

    .line 252
    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v1, :cond_0

    .line 253
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 240
    .end local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method protected final clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 89
    new-instance v0, Ljava/lang/CloneNotSupportedException;

    invoke-direct {v0}, Ljava/lang/CloneNotSupportedException;-><init>()V

    throw v0
.end method

.method protected declared-synchronized close(Ljava/lang/String;)V
    .locals 6
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 141
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 142
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-nez v0, :cond_0

    .line 163
    :goto_0
    monitor-exit p0

    return-void

    .line 145
    :cond_0
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    .line 147
    invoke-virtual {v0}, Lcom/adobe/mobile/MediaItem;->close()V

    .line 150
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V

    .line 153
    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-nez v1, :cond_2

    .line 154
    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v1}, Lcom/adobe/mobile/MediaState;->getTimePlayed()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v1, v2, v4

    if-lez v1, :cond_1

    .line 155
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V

    .line 158
    :cond_1
    iget-object v1, p0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 141
    .end local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 161
    .restart local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :cond_2
    const/4 v1, 0x1

    :try_start_2
    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->itemClosed:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method protected declared-synchronized complete(Ljava/lang/String;D)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "offset"    # D

    .prologue
    .line 200
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;

    move-result-object v0

    .line 201
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaItem;->isPlaying()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 216
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 205
    :cond_1
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    .line 207
    invoke-virtual {v0, p2, p3}, Lcom/adobe/mobile/MediaItem;->complete(D)V

    .line 210
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V

    .line 212
    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v1, :cond_0

    .line 214
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 200
    .end local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method protected declared-synchronized monitor(Ljava/lang/String;D)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "offset"    # D

    .prologue
    .line 291
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;

    move-result-object v0

    .line 294
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaItem;->isPlaying()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 313
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 299
    :cond_1
    :try_start_1
    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-eqz v1, :cond_2

    .line 300
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 291
    .end local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 304
    .restart local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :cond_2
    :try_start_2
    invoke-virtual {v0, p2, p3}, Lcom/adobe/mobile/MediaItem;->monitor(D)V

    .line 307
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V

    .line 309
    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-nez v1, :cond_0

    .line 311
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method protected declared-synchronized open(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/Media$MediaCallback;)V
    .locals 16
    .param p1, "settings"    # Lcom/adobe/mobile/MediaSettings;
    .param p2, "callback"    # Lcom/adobe/mobile/Media$MediaCallback;

    .prologue
    .line 95
    monitor-enter p0

    :try_start_0
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/adobe/mobile/MediaSettings;->name:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/adobe/mobile/MediaAnalytics;->cleanName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 97
    .local v5, "cleanMediaName":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 98
    const-string v3, "Analytics - ADBMediaSettings is required with a valid name. Media item not opened"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    :goto_0
    monitor-exit p0

    return-void

    .line 102
    :cond_0
    :try_start_1
    move-object/from16 v0, p1

    iget-boolean v3, v0, Lcom/adobe/mobile/MediaSettings;->isMediaAd:Z

    if-eqz v3, :cond_1

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/adobe/mobile/MediaSettings;->parentName:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 103
    const-string v3, "Analytics - Media ad requires parent name, please specify a parent name. Media item not opened"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 95
    .end local v5    # "cleanMediaName":Ljava/lang/String;
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3

    .line 108
    .restart local v5    # "cleanMediaName":Ljava/lang/String;
    :cond_1
    :try_start_2
    move-object/from16 v0, p1

    iget-wide v12, v0, Lcom/adobe/mobile/MediaSettings;->length:D

    const-wide/16 v14, 0x0

    cmpl-double v3, v12, v14

    if-lez v3, :cond_5

    move-object/from16 v0, p1

    iget-wide v6, v0, Lcom/adobe/mobile/MediaSettings;->length:D

    .line 111
    .local v6, "validLength":D
    :goto_1
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/adobe/mobile/MediaSettings;->playerName:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v8, "Not_Specified"

    .line 114
    .local v8, "cleanPlayerName":Ljava/lang/String;
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 115
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/adobe/mobile/MediaAnalytics;->close(Ljava/lang/String;)V

    .line 118
    :cond_2
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/adobe/mobile/MediaSettings;->playerID:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/adobe/mobile/MediaAnalytics;->isNilOrEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 119
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 120
    .local v10, "key":Ljava/lang/Object;
    move-object v0, v10

    check-cast v0, Ljava/lang/String;

    move-object v11, v0

    .line 121
    .local v11, "mediaName":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    invoke-virtual {v3, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/adobe/mobile/MediaItem;

    invoke-virtual {v3}, Lcom/adobe/mobile/MediaItem;->getPlayerID()Ljava/lang/String;

    move-result-object v9

    .line 122
    .local v9, "existingPlayerID":Ljava/lang/String;
    if-eqz v9, :cond_3

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/adobe/mobile/MediaSettings;->playerID:Ljava/lang/String;

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 123
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/adobe/mobile/MediaAnalytics;->close(Ljava/lang/String;)V

    .line 130
    .end local v9    # "existingPlayerID":Ljava/lang/String;
    .end local v10    # "key":Ljava/lang/Object;
    .end local v11    # "mediaName":Ljava/lang/String;
    :cond_4
    new-instance v2, Lcom/adobe/mobile/MediaItem;

    move-object/from16 v3, p1

    move-object/from16 v4, p0

    invoke-direct/range {v2 .. v8}, Lcom/adobe/mobile/MediaItem;-><init>(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/MediaAnalytics;Ljava/lang/String;DLjava/lang/String;)V

    .line 133
    .local v2, "mediaItem":Lcom/adobe/mobile/MediaItem;
    move-object/from16 v0, p2

    iput-object v0, v2, Lcom/adobe/mobile/MediaItem;->callback:Lcom/adobe/mobile/Media$MediaCallback;

    .line 136
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    invoke-virtual {v3, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 108
    .end local v2    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    .end local v6    # "validLength":D
    .end local v8    # "cleanPlayerName":Ljava/lang/String;
    :cond_5
    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    goto :goto_1

    .line 111
    .restart local v6    # "validLength":D
    :cond_6
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/adobe/mobile/MediaSettings;->playerName:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/adobe/mobile/MediaAnalytics;->cleanName(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v8

    goto :goto_2
.end method

.method protected declared-synchronized play(Ljava/lang/String;D)V
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "offset"    # D

    .prologue
    .line 167
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 168
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-nez v0, :cond_0

    .line 196
    :goto_0
    monitor-exit p0

    return-void

    .line 172
    :cond_0
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    .line 174
    invoke-virtual {v0, p2, p3}, Lcom/adobe/mobile/MediaItem;->play(D)V

    .line 177
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V

    .line 179
    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-nez v1, :cond_1

    .line 180
    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-nez v1, :cond_2

    .line 183
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaViewed(Lcom/adobe/mobile/MediaItem;)V

    .line 193
    :cond_1
    :goto_1
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    .line 195
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->removeMediaItemIfComplete(Lcom/adobe/mobile/MediaItem;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 167
    .end local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 184
    .restart local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :cond_2
    :try_start_2
    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->segmentNum:I

    iget v2, v0, Lcom/adobe/mobile/MediaItem;->lastTrackSegmentNumber:I

    if-eq v1, v2, :cond_3

    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v2, v1, Lcom/adobe/mobile/MediaState;->timePlayed:D

    const-wide/16 v4, 0x0

    cmpl-double v1, v2, v4

    if-lez v1, :cond_3

    .line 186
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V

    goto :goto_1

    .line 189
    :cond_3
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method protected setTrackCalledOnItem(Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 260
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;

    move-result-object v0

    .line 261
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-nez v0, :cond_0

    .line 265
    :goto_0
    return-void

    .line 264
    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    goto :goto_0
.end method

.method protected declared-synchronized stop(Ljava/lang/String;D)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "offset"    # D

    .prologue
    .line 220
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;

    move-result-object v0

    .line 221
    .local v0, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaItem;->isPlaying()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    .line 236
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 225
    :cond_1
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    .line 227
    invoke-virtual {v0, p2, p3}, Lcom/adobe/mobile/MediaItem;->stop(D)V

    .line 230
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->notifyDelegateOfMediaState(Lcom/adobe/mobile/MediaItem;)V

    .line 232
    iget-boolean v1, v0, Lcom/adobe/mobile/MediaItem;->trackCalled:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v1, :cond_0

    .line 234
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 220
    .end local v0    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method protected declared-synchronized track(Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
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
    .line 269
    .local p2, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/adobe/mobile/MediaAnalytics;->mediaItemWithName(Ljava/lang/String;)Lcom/adobe/mobile/MediaItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 270
    .local v1, "mediaItem":Lcom/adobe/mobile/MediaItem;
    if-nez v1, :cond_0

    .line 287
    :goto_0
    monitor-exit p0

    return-void

    .line 274
    :cond_0
    :try_start_1
    iget-object v2, v1, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v2, :cond_1

    .line 276
    if-eqz p2, :cond_3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 278
    .local v0, "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    :goto_1
    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaAnalytics;->removeEmptyValues(Ljava/util/HashMap;)V

    .line 280
    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/adobe/mobile/MediaAnalytics;->trackMediaStateIfNecessary(Lcom/adobe/mobile/MediaItem;Ljava/util/HashMap;Z)V

    .line 282
    .end local v0    # "contextData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_1
    iget-boolean v2, v1, Lcom/adobe/mobile/MediaItem;->itemClosed:Z

    if-eqz v2, :cond_2

    .line 283
    iget-object v2, p0, Lcom/adobe/mobile/MediaAnalytics;->mediaItemList:Ljava/util/HashMap;

    iget-object v3, v1, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/adobe/mobile/MediaItem;->trackCalled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 269
    .end local v1    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 276
    .restart local v1    # "mediaItem":Lcom/adobe/mobile/MediaItem;
    :cond_3
    :try_start_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method
