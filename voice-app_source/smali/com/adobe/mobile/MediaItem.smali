.class final Lcom/adobe/mobile/MediaItem;
.super Ljava/lang/Object;
.source "MediaItem.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/MediaItem$MonitorThread;
    }
.end annotation


# static fields
.field private static final monitorMutex:Ljava/lang/Object;


# instance fields
.field protected CPM:Ljava/lang/String;

.field protected callback:Lcom/adobe/mobile/Media$MediaCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adobe/mobile/Media$MediaCallback",
            "<",
            "Lcom/adobe/mobile/MediaState;",
            ">;"
        }
    .end annotation
.end field

.field protected channel:Ljava/lang/String;

.field private completeCloseOffsetThreshold:I

.field private completeTracked:Z

.field protected currentMediaState:Lcom/adobe/mobile/MediaState;

.field private firstEventList:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected itemClosed:Z

.field protected lastTrackSegmentNumber:I

.field protected length:D

.field protected mediaAd:Z

.field protected mediaAnalytics:Lcom/adobe/mobile/MediaAnalytics;

.field private milestones:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

.field protected name:Ljava/lang/String;

.field private offsetMilestones:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected parentName:Ljava/lang/String;

.field protected parentPod:Ljava/lang/String;

.field protected parentPodPosition:D

.field protected playerID:Ljava/lang/String;

.field protected playerName:Ljava/lang/String;

.field protected previousMediaState:Lcom/adobe/mobile/MediaState;

.field private segmentByMilestones:Z

.field private segmentByOffsetMilestones:Z

.field protected timestamp:D

.field protected trackCalled:Z

.field private trackSecondsThreshold:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MediaItem;->monitorMutex:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/MediaAnalytics;Ljava/lang/String;DLjava/lang/String;)V
    .locals 6
    .param p1, "settings"    # Lcom/adobe/mobile/MediaSettings;
    .param p2, "mediaAnalytics"    # Lcom/adobe/mobile/MediaAnalytics;
    .param p3, "cleanName"    # Ljava/lang/String;
    .param p4, "validLength"    # D
    .param p6, "cleanPlayerName"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->callback:Lcom/adobe/mobile/Media$MediaCallback;

    .line 29
    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    .line 30
    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    .line 46
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->firstEventList:Ljava/util/HashSet;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    .line 51
    iput-boolean v2, p0, Lcom/adobe/mobile/MediaItem;->segmentByMilestones:Z

    .line 52
    iput-boolean v2, p0, Lcom/adobe/mobile/MediaItem;->segmentByOffsetMilestones:Z

    .line 53
    iput v1, p0, Lcom/adobe/mobile/MediaItem;->completeCloseOffsetThreshold:I

    .line 54
    iput v2, p0, Lcom/adobe/mobile/MediaItem;->trackSecondsThreshold:I

    .line 60
    iput-object p3, p0, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    .line 61
    iput-wide p4, p0, Lcom/adobe/mobile/MediaItem;->length:D

    .line 62
    iput-object p6, p0, Lcom/adobe/mobile/MediaItem;->playerName:Ljava/lang/String;

    .line 63
    iput-object p2, p0, Lcom/adobe/mobile/MediaItem;->mediaAnalytics:Lcom/adobe/mobile/MediaAnalytics;

    .line 64
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->playerID:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->playerID:Ljava/lang/String;

    .line 65
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v4

    long-to-double v4, v4

    iput-wide v4, p0, Lcom/adobe/mobile/MediaItem;->timestamp:D

    .line 66
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->channel:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->channel:Ljava/lang/String;

    .line 69
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->milestones:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaItem;->setMilestones(Ljava/lang/String;)V

    .line 70
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->offsetMilestones:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaItem;->setOffsetMilestones(Ljava/lang/String;)V

    .line 71
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaSettings;->segmentByMilestones:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MediaItem;->setSegmentByMilestones(Z)V

    .line 72
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaSettings;->segmentByOffsetMilestones:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_1
    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MediaItem;->setSegmentByOffsetMilestones(Z)V

    .line 73
    iget v0, p2, Lcom/adobe/mobile/MediaAnalytics;->trackSeconds:I

    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MediaItem;->setTrackSecondsThreshold(I)V

    .line 74
    iget v0, p2, Lcom/adobe/mobile/MediaAnalytics;->completeCloseOffsetThreshold:I

    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MediaItem;->setCompleteCloseOffsetThreshold(I)V

    .line 76
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaSettings;->isMediaAd:Z

    if-eqz v0, :cond_0

    .line 77
    iput-boolean v1, p0, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    .line 78
    iget-wide v4, p1, Lcom/adobe/mobile/MediaSettings;->parentPodPosition:D

    iput-wide v4, p0, Lcom/adobe/mobile/MediaItem;->parentPodPosition:D

    .line 79
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->parentName:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->parentName:Ljava/lang/String;

    .line 80
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->parentPod:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->parentPod:Ljava/lang/String;

    .line 81
    iget-object v0, p1, Lcom/adobe/mobile/MediaSettings;->CPM:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->CPM:Ljava/lang/String;

    .line 83
    :cond_0
    iget v0, p1, Lcom/adobe/mobile/MediaSettings;->completeCloseOffsetThreshold:I

    if-lez v0, :cond_1

    iget v1, p1, Lcom/adobe/mobile/MediaSettings;->completeCloseOffsetThreshold:I

    :cond_1
    iput v1, p0, Lcom/adobe/mobile/MediaItem;->completeCloseOffsetThreshold:I

    .line 84
    iget v0, p1, Lcom/adobe/mobile/MediaSettings;->trackSeconds:I

    if-lez v0, :cond_2

    iget v2, p1, Lcom/adobe/mobile/MediaSettings;->trackSeconds:I

    :cond_2
    iput v2, p0, Lcom/adobe/mobile/MediaItem;->trackSecondsThreshold:I

    .line 85
    return-void

    :cond_3
    move v0, v2

    .line 71
    goto :goto_0

    :cond_4
    move v0, v2

    .line 72
    goto :goto_1
.end method

.method private calculateCurrentMilestoneAndSegment()V
    .locals 5

    .prologue
    .line 289
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->isLive()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 326
    :cond_0
    :goto_0
    return-void

    .line 294
    :cond_1
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eqz v3, :cond_0

    .line 299
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->calculateLastPassedMilestoneIndex()I

    move-result v0

    .line 300
    .local v0, "lastPassedMilestoneIndex":I
    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    .line 304
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 305
    .local v1, "milestone":I
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iput v1, v3, Lcom/adobe/mobile/MediaState;->milestone:I

    .line 310
    iget-boolean v3, p0, Lcom/adobe/mobile/MediaItem;->segmentByMilestones:Z

    if-eqz v3, :cond_0

    .line 311
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    add-int/lit8 v4, v0, 0x1

    iput v4, v3, Lcom/adobe/mobile/MediaState;->segmentNum:I

    .line 313
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 314
    .local v2, "segmentBuilder":Ljava/lang/StringBuilder;
    const-string v3, "M:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_2

    .line 320
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    :goto_1
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    goto :goto_0

    .line 322
    :cond_2
    const-string v3, "100"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method private calculateCurrentOffsetMilestoneAndSegment()V
    .locals 6

    .prologue
    .line 330
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_1

    .line 363
    :cond_0
    :goto_0
    return-void

    .line 335
    :cond_1
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->calculateLastPassedOffsetMilestoneIndex()I

    move-result v1

    .line 336
    .local v1, "lastPassedOffsetMilestoneIndex":I
    const/4 v4, -0x1

    if-eq v1, v4, :cond_0

    .line 340
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 341
    .local v2, "milestone":I
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iput v2, v4, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    .line 346
    iget-boolean v4, p0, Lcom/adobe/mobile/MediaItem;->segmentByOffsetMilestones:Z

    if-eqz v4, :cond_0

    .line 347
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    add-int/lit8 v5, v1, 0x1

    iput v5, v4, Lcom/adobe/mobile/MediaState;->segmentNum:I

    .line 349
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .local v3, "segmentBuilder":Ljava/lang/StringBuilder;
    const-string v4, "O:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v1, v4, :cond_2

    .line 356
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    :goto_1
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    goto :goto_0

    .line 358
    :cond_2
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->isLive()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v0, "E"

    .line 359
    .local v0, "end":Ljava/lang/String;
    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 358
    .end local v0    # "end":Ljava/lang/String;
    :cond_3
    iget-wide v4, p0, Lcom/adobe/mobile/MediaItem;->length:D

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method

.method private calculateLastPassedMilestoneIndex()I
    .locals 8

    .prologue
    .line 366
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_1

    .line 367
    const/4 v2, -0x1

    .line 380
    :cond_0
    return v2

    .line 370
    :cond_1
    const/4 v2, -0x1

    .line 373
    .local v2, "returnVal":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 374
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 375
    .local v1, "milestone":I
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v4, v3, Lcom/adobe/mobile/MediaState;->percent:D

    int-to-double v6, v1

    cmpl-double v3, v4, v6

    if-ltz v3, :cond_2

    .line 376
    move v2, v0

    .line 373
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private calculateLastPassedOffsetMilestoneIndex()I
    .locals 8

    .prologue
    .line 384
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_1

    .line 385
    const/4 v2, -0x1

    .line 398
    :cond_0
    return v2

    .line 388
    :cond_1
    const/4 v2, -0x1

    .line 391
    .local v2, "returnVal":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 392
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 393
    .local v1, "milestone":I
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v4, v3, Lcom/adobe/mobile/MediaState;->offset:D

    int-to-double v6, v1

    cmpl-double v3, v4, v6

    if-ltz v3, :cond_2

    .line 394
    move v2, v0

    .line 391
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private setEventFirstTime(Lcom/adobe/mobile/MediaState;)V
    .locals 3
    .param p1, "mediaState"    # Lcom/adobe/mobile/MediaState;

    .prologue
    .line 461
    iget-object v0, p1, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    .line 462
    .local v0, "eventKey":Ljava/lang/String;
    const-string v1, "MILESTONE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 463
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/adobe/mobile/MediaState;->milestone:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 468
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->firstEventList:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 469
    const/4 v1, 0x1

    iput-boolean v1, p1, Lcom/adobe/mobile/MediaState;->eventFirstTime:Z

    .line 470
    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->firstEventList:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 472
    :cond_1
    return-void

    .line 464
    :cond_2
    const-string v1, "OFFSET_MILESTONE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 465
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private setMilestones(Ljava/lang/String;)V
    .locals 8
    .param p1, "milestones"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 497
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 499
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    .line 517
    :cond_0
    :goto_0
    return-void

    .line 504
    :cond_1
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    const-string v4, ","

    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 507
    .local v2, "milestoneStrings":[Ljava/lang/String;
    array-length v4, v2

    :goto_1
    if-ge v3, v4, :cond_3

    aget-object v1, v2, v3

    .line 508
    .local v1, "milestoneString":Ljava/lang/String;
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    double-to-int v0, v6

    .line 510
    .local v0, "milestone":I
    if-lez v0, :cond_2

    const/16 v5, 0x64

    if-gt v0, v5, :cond_2

    iget-object v5, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 511
    iget-object v5, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 516
    .end local v0    # "milestone":I
    .end local v1    # "milestoneString":Ljava/lang/String;
    :cond_3
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->milestones:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_0
.end method

.method private setOffsetMilestones(Ljava/lang/String;)V
    .locals 10
    .param p1, "offsetMilestones"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 520
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 522
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    .line 544
    :cond_0
    :goto_0
    return-void

    .line 527
    :cond_1
    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    const-string v4, ","

    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 530
    .local v2, "milestoneStrings":[Ljava/lang/String;
    array-length v4, v2

    :goto_1
    if-ge v3, v4, :cond_4

    aget-object v1, v2, v3

    .line 531
    .local v1, "milestoneString":Ljava/lang/String;
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    double-to-int v0, v6

    .line 533
    .local v0, "milestone":I
    if-lez v0, :cond_2

    iget-object v5, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 535
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->isLive()Z

    move-result v5

    if-nez v5, :cond_3

    int-to-double v6, v0

    iget-wide v8, p0, Lcom/adobe/mobile/MediaItem;->length:D

    cmpl-double v5, v6, v8

    if-lez v5, :cond_3

    .line 530
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 538
    :cond_3
    iget-object v5, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 543
    .end local v0    # "milestone":I
    .end local v1    # "milestoneString":Ljava/lang/String;
    :cond_4
    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->offsetMilestones:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_0
.end method

.method private updateCurrentMediaStateMediaEventIfNeeded(I)V
    .locals 4
    .param p1, "eventType"    # I

    .prologue
    .line 402
    if-nez p1, :cond_1

    .line 432
    :cond_0
    :goto_0
    return-void

    .line 407
    :cond_1
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v0, v0, Lcom/adobe/mobile/MediaState;->percent:D

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_2

    .line 408
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const-string v1, "CLOSE"

    iput-object v1, v0, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    goto :goto_0

    .line 412
    :cond_2
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v0, :cond_0

    .line 417
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v0, v0, Lcom/adobe/mobile/MediaState;->milestone:I

    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->milestone:I

    if-le v0, v1, :cond_3

    .line 418
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const-string v1, "MILESTONE"

    iput-object v1, v0, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    goto :goto_0

    .line 423
    :cond_3
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v0, v0, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    if-le v0, v1, :cond_4

    .line 424
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const-string v1, "OFFSET_MILESTONE"

    iput-object v1, v0, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    goto :goto_0

    .line 429
    :cond_4
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->getTrackSecondsThreshold()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaState;->getTimePlayedSinceTrack()D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->getTrackSecondsThreshold()I

    move-result v2

    int-to-double v2, v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const-string v1, "SECONDS"

    iput-object v1, v0, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    goto :goto_0
.end method

.method private updateCurrentMediaStateWithOffset(DI)V
    .locals 5
    .param p1, "offset"    # D
    .param p3, "defaultEventType"    # I

    .prologue
    .line 269
    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const/4 v0, 0x6

    if-ne p3, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v1, Lcom/adobe/mobile/MediaState;->clicked:Z

    .line 272
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v1, p0, Lcom/adobe/mobile/MediaItem;->mediaAd:Z

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaState;->ad:Z

    .line 275
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-direct {p0, p1, p2}, Lcom/adobe/mobile/MediaItem;->validateOffset(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/adobe/mobile/MediaState;->setOffset(D)V

    .line 278
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->calculateCurrentOffsetMilestoneAndSegment()V

    .line 279
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->calculateCurrentMilestoneAndSegment()V

    .line 281
    invoke-direct {p0, p3}, Lcom/adobe/mobile/MediaItem;->updateTimePlayed(I)V

    .line 282
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v0, p3}, Lcom/adobe/mobile/MediaState;->setEventType(I)V

    .line 283
    invoke-direct {p0, p3}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateMediaEventIfNeeded(I)V

    .line 284
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-direct {p0, v0}, Lcom/adobe/mobile/MediaItem;->setEventFirstTime(Lcom/adobe/mobile/MediaState;)V

    .line 285
    return-void

    .line 269
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private updateMediaStates()V
    .locals 8

    .prologue
    .line 260
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    .line 263
    new-instance v0, Lcom/adobe/mobile/MediaState;

    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    iget-wide v2, p0, Lcom/adobe/mobile/MediaItem;->length:D

    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->playerName:Ljava/lang/String;

    iget-wide v6, p0, Lcom/adobe/mobile/MediaItem;->timestamp:D

    double-to-long v5, v6

    invoke-direct/range {v0 .. v6}, Lcom/adobe/mobile/MediaState;-><init>(Ljava/lang/String;DLjava/lang/String;J)V

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    .line 264
    return-void
.end method

.method private updateTimePlayed(I)V
    .locals 6
    .param p1, "defaultEventType"    # I

    .prologue
    .line 445
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-nez v2, :cond_0

    .line 457
    :goto_0
    return-void

    .line 449
    :cond_0
    const-wide/16 v0, 0x0

    .line 451
    .local v0, "timePlayed":D
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v2, v2, Lcom/adobe/mobile/MediaState;->offset:D

    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v4, v4, Lcom/adobe/mobile/MediaState;->offset:D

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    .line 453
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v2, v2, Lcom/adobe/mobile/MediaState;->offset:D

    iget-object v4, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v4, v4, Lcom/adobe/mobile/MediaState;->offset:D

    sub-double v0, v2, v4

    .line 455
    :cond_1
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v3}, Lcom/adobe/mobile/MediaState;->getTimePlayed()D

    move-result-wide v4

    add-double/2addr v4, v0

    invoke-virtual {v2, v4, v5}, Lcom/adobe/mobile/MediaState;->setTimePlayed(D)V

    .line 456
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v3}, Lcom/adobe/mobile/MediaState;->getTimePlayedSinceTrack()D

    move-result-wide v4

    add-double/2addr v4, v0

    invoke-virtual {v2, v4, v5}, Lcom/adobe/mobile/MediaState;->setTimePlayedSinceTrack(D)V

    goto :goto_0
.end method

.method private validateOffset(D)D
    .locals 5
    .param p1, "offset"    # D

    .prologue
    .line 436
    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaState;->getTimestamp()D

    move-result-wide v0

    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    invoke-virtual {v2}, Lcom/adobe/mobile/MediaState;->getTimestamp()D

    move-result-wide v2

    sub-double/2addr v0, v2

    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v2, v2, Lcom/adobe/mobile/MediaState;->offset:D

    add-double p1, v0, v2

    .line 440
    :cond_0
    return-wide p1
.end method


# virtual methods
.method protected declared-synchronized click(D)V
    .locals 1
    .param p1, "offset"    # D

    .prologue
    .line 179
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->updateMediaStates()V

    .line 182
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 188
    :goto_0
    monitor-exit p0

    return-void

    .line 187
    :cond_0
    const/4 v0, 0x6

    :try_start_1
    invoke-direct {p0, p1, p2, v0}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 179
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized close()V
    .locals 3

    .prologue
    .line 229
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->updateMediaStates()V

    .line 233
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    .line 234
    invoke-virtual {v0}, Lcom/adobe/mobile/MediaState;->getEventType()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 253
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 238
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v0, v0, Lcom/adobe/mobile/MediaState;->eventType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 239
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v0, v0, Lcom/adobe/mobile/MediaState;->offset:D

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V

    .line 247
    :goto_1
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->isCurrentOffsetPastCompleteThreshold()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 248
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaState;->complete:Z

    .line 252
    :cond_2
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->stopMonitor()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 229
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 243
    :cond_3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    const/4 v2, 0x0

    :try_start_2
    invoke-direct {p0, v0, v1, v2}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method protected declared-synchronized complete(D)V
    .locals 3
    .param p1, "offset"    # D

    .prologue
    const/4 v1, 0x5

    .line 192
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->updateMediaStates()V

    .line 196
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    .line 197
    invoke-virtual {v0}, Lcom/adobe/mobile/MediaState;->getEventType()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-ne v0, v1, :cond_1

    .line 214
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 202
    :cond_1
    const/4 v0, 0x5

    :try_start_1
    invoke-direct {p0, p1, p2, v0}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V

    .line 205
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v0, v0, Lcom/adobe/mobile/MediaState;->complete:Z

    if-eqz v0, :cond_2

    .line 206
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->stopMonitor()V

    .line 213
    :cond_2
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaState;->complete:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 192
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected getLength()D
    .locals 2

    .prologue
    .line 583
    iget-wide v0, p0, Lcom/adobe/mobile/MediaItem;->length:D

    return-wide v0
.end method

.method protected getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 579
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method protected getPlayerID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 591
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->playerID:Ljava/lang/String;

    return-object v0
.end method

.method protected getPlayerName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 587
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->playerName:Ljava/lang/String;

    return-object v0
.end method

.method protected getReportMediaState()Lcom/adobe/mobile/MediaState;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 551
    new-instance v0, Lcom/adobe/mobile/MediaState;

    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    invoke-direct {v0, v2}, Lcom/adobe/mobile/MediaState;-><init>(Lcom/adobe/mobile/MediaState;)V

    .line 552
    .local v0, "reportedState":Lcom/adobe/mobile/MediaState;
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v2, :cond_2

    .line 553
    const/4 v1, 0x0

    .line 554
    .local v1, "usePreviousSegmentInfo":Z
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v2, v2, Lcom/adobe/mobile/MediaState;->milestone:I

    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v3, v3, Lcom/adobe/mobile/MediaState;->milestone:I

    if-gt v2, v3, :cond_0

    .line 555
    iput v4, v0, Lcom/adobe/mobile/MediaState;->milestone:I

    .line 556
    const/4 v1, 0x1

    .line 558
    :cond_0
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v2, v2, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    iget-object v3, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v3, v3, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    if-gt v2, v3, :cond_1

    .line 559
    iput v4, v0, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    .line 560
    const/4 v1, 0x1

    .line 562
    :cond_1
    if-eqz v1, :cond_2

    .line 563
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget-object v2, v2, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    iput-object v2, v0, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    .line 564
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget v2, v2, Lcom/adobe/mobile/MediaState;->segmentNum:I

    iput v2, v0, Lcom/adobe/mobile/MediaState;->segmentNum:I

    .line 565
    iget-object v2, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v2, v2, Lcom/adobe/mobile/MediaState;->segmentLength:D

    iput-wide v2, v0, Lcom/adobe/mobile/MediaState;->segmentLength:D

    .line 568
    .end local v1    # "usePreviousSegmentInfo":Z
    :cond_2
    return-object v0
.end method

.method public getTrackSecondsThreshold()I
    .locals 1

    .prologue
    .line 607
    iget v0, p0, Lcom/adobe/mobile/MediaItem;->trackSecondsThreshold:I

    return v0
.end method

.method protected isCompleteTracked()Z
    .locals 1

    .prologue
    .line 615
    iget-boolean v0, p0, Lcom/adobe/mobile/MediaItem;->completeTracked:Z

    return v0
.end method

.method protected isCurrentOffsetPastCompleteThreshold()Z
    .locals 6

    .prologue
    .line 488
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-wide v0, v0, Lcom/adobe/mobile/MediaState;->offset:D

    iget-wide v2, p0, Lcom/adobe/mobile/MediaItem;->length:D

    iget v4, p0, Lcom/adobe/mobile/MediaItem;->completeCloseOffsetThreshold:I

    int-to-double v4, v4

    sub-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected isLive()Z
    .locals 4

    .prologue
    .line 492
    iget-wide v0, p0, Lcom/adobe/mobile/MediaItem;->length:D

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected isPlaying()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 476
    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v1, :cond_0

    .line 477
    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->eventType:I

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget v1, v1, Lcom/adobe/mobile/MediaState;->eventType:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v0, 0x1

    .line 480
    :cond_0
    return v0
.end method

.method protected isSegmentByMilestones()Z
    .locals 1

    .prologue
    .line 575
    iget-boolean v0, p0, Lcom/adobe/mobile/MediaItem;->segmentByMilestones:Z

    return v0
.end method

.method protected isSegmentByOffsetMilestones()Z
    .locals 1

    .prologue
    .line 599
    iget-boolean v0, p0, Lcom/adobe/mobile/MediaItem;->segmentByOffsetMilestones:Z

    return v0
.end method

.method protected declared-synchronized monitor(D)V
    .locals 1
    .param p1, "offset"    # D

    .prologue
    .line 161
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->updateMediaStates()V

    .line 164
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->previousMediaState:Lcom/adobe/mobile/MediaState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 175
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 169
    :cond_1
    const/4 v0, 0x3

    :try_start_1
    invoke-direct {p0, p1, p2, v0}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V

    .line 172
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v0, v0, Lcom/adobe/mobile/MediaState;->complete:Z

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->stopMonitor()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 161
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized play(D)V
    .locals 1
    .param p1, "offset"    # D

    .prologue
    .line 143
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->isPlaying()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 148
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->updateMediaStates()V

    .line 151
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V

    .line 154
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->currentMediaState:Lcom/adobe/mobile/MediaState;

    iget-boolean v0, v0, Lcom/adobe/mobile/MediaState;->complete:Z

    if-nez v0, :cond_0

    .line 155
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->startMonitor()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 143
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setCompleteCloseOffsetThreshold(I)V
    .locals 0
    .param p1, "completeCloseOffsetThreshold"    # I

    .prologue
    .line 623
    iput p1, p0, Lcom/adobe/mobile/MediaItem;->completeCloseOffsetThreshold:I

    .line 624
    return-void
.end method

.method protected setCompleteTracked(Z)V
    .locals 0
    .param p1, "completeTracked"    # Z

    .prologue
    .line 619
    iput-boolean p1, p0, Lcom/adobe/mobile/MediaItem;->completeTracked:Z

    .line 620
    return-void
.end method

.method protected setSegmentByMilestones(Z)V
    .locals 0
    .param p1, "segmentByMilestones"    # Z

    .prologue
    .line 595
    iput-boolean p1, p0, Lcom/adobe/mobile/MediaItem;->segmentByMilestones:Z

    .line 596
    return-void
.end method

.method protected setSegmentByOffsetMilestones(Z)V
    .locals 0
    .param p1, "segmentByOffsetMilestones"    # Z

    .prologue
    .line 603
    iput-boolean p1, p0, Lcom/adobe/mobile/MediaItem;->segmentByOffsetMilestones:Z

    .line 604
    return-void
.end method

.method public setTrackSecondsThreshold(I)V
    .locals 0
    .param p1, "trackSecondsThreshold"    # I

    .prologue
    .line 611
    iput p1, p0, Lcom/adobe/mobile/MediaItem;->trackSecondsThreshold:I

    .line 612
    return-void
.end method

.method protected startMonitor()V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    iget-boolean v0, v0, Lcom/adobe/mobile/MediaItem$MonitorThread;->canceled:Z

    if-nez v0, :cond_0

    .line 100
    :goto_0
    return-void

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    if-eqz v0, :cond_1

    .line 95
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->stopMonitor()V

    .line 97
    :cond_1
    new-instance v0, Lcom/adobe/mobile/MediaItem$MonitorThread;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/adobe/mobile/MediaItem$MonitorThread;-><init>(Lcom/adobe/mobile/MediaItem$1;)V

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    .line 98
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    iput-object p0, v0, Lcom/adobe/mobile/MediaItem$MonitorThread;->monitorMediaItem:Lcom/adobe/mobile/MediaItem;

    .line 99
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    invoke-virtual {v0}, Lcom/adobe/mobile/MediaItem$MonitorThread;->start()V

    goto :goto_0
.end method

.method protected declared-synchronized stop(D)V
    .locals 1
    .param p1, "offset"    # D

    .prologue
    .line 218
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/adobe/mobile/MediaItem;->updateMediaStates()V

    .line 221
    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0}, Lcom/adobe/mobile/MediaItem;->updateCurrentMediaStateWithOffset(DI)V

    .line 224
    invoke-virtual {p0}, Lcom/adobe/mobile/MediaItem;->stopMonitor()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    monitor-exit p0

    return-void

    .line 218
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected stopMonitor()V
    .locals 3

    .prologue
    .line 105
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    if-eqz v0, :cond_0

    .line 106
    sget-object v1, Lcom/adobe/mobile/MediaItem;->monitorMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/adobe/mobile/MediaItem$MonitorThread;->canceled:Z

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/adobe/mobile/MediaItem;->monitor:Lcom/adobe/mobile/MediaItem$MonitorThread;

    .line 109
    monitor-exit v1

    .line 111
    :cond_0
    return-void

    .line 109
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
