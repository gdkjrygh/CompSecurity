.class public final Lcom/adobe/mobile/MediaState;
.super Ljava/lang/Object;
.source "MediaState.java"


# instance fields
.field public ad:Z

.field public clicked:Z

.field public complete:Z

.field public eventFirstTime:Z

.field protected eventType:I

.field public length:D

.field public mediaEvent:Ljava/lang/String;

.field public milestone:I

.field public name:Ljava/lang/String;

.field public offset:D

.field public offsetMilestone:I

.field public openTime:Ljava/util/Date;

.field public percent:D

.field public playerName:Ljava/lang/String;

.field public segment:Ljava/lang/String;

.field public segmentLength:D

.field public segmentNum:I

.field public timePlayed:D

.field private timePlayedSinceTrack:D

.field private timestamp:J


# direct methods
.method protected constructor <init>(Lcom/adobe/mobile/MediaState;)V
    .locals 2
    .param p1, "masterState"    # Lcom/adobe/mobile/MediaState;

    .prologue
    const/4 v1, 0x0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->openTime:Ljava/util/Date;

    .line 40
    iput-boolean v1, p0, Lcom/adobe/mobile/MediaState;->complete:Z

    .line 41
    iput-boolean v1, p0, Lcom/adobe/mobile/MediaState;->clicked:Z

    .line 75
    iget-object v0, p1, Lcom/adobe/mobile/MediaState;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->name:Ljava/lang/String;

    .line 76
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->length:D

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->length:D

    .line 77
    iget-object v0, p1, Lcom/adobe/mobile/MediaState;->playerName:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->playerName:Ljava/lang/String;

    .line 78
    iget-object v0, p1, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    .line 79
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaState;->eventFirstTime:Z

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaState;->eventFirstTime:Z

    .line 80
    iget-object v0, p1, Lcom/adobe/mobile/MediaState;->openTime:Ljava/util/Date;

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->openTime:Ljava/util/Date;

    .line 81
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->offset:D

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->offset:D

    .line 82
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->percent:D

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->percent:D

    .line 83
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->timePlayed:D

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->timePlayed:D

    .line 84
    iget v0, p1, Lcom/adobe/mobile/MediaState;->milestone:I

    iput v0, p0, Lcom/adobe/mobile/MediaState;->milestone:I

    .line 85
    iget v0, p1, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    iput v0, p0, Lcom/adobe/mobile/MediaState;->offsetMilestone:I

    .line 86
    iget v0, p1, Lcom/adobe/mobile/MediaState;->segmentNum:I

    iput v0, p0, Lcom/adobe/mobile/MediaState;->segmentNum:I

    .line 87
    iget-object v0, p1, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    .line 88
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->segmentLength:D

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->segmentLength:D

    .line 89
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaState;->complete:Z

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaState;->complete:Z

    .line 90
    iget v0, p1, Lcom/adobe/mobile/MediaState;->eventType:I

    iput v0, p0, Lcom/adobe/mobile/MediaState;->eventType:I

    .line 91
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->timestamp:J

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->timestamp:J

    .line 92
    iget-wide v0, p1, Lcom/adobe/mobile/MediaState;->timePlayedSinceTrack:D

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->timePlayedSinceTrack:D

    .line 93
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaState;->clicked:Z

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaState;->clicked:Z

    .line 94
    iget-boolean v0, p1, Lcom/adobe/mobile/MediaState;->ad:Z

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaState;->ad:Z

    .line 95
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;DLjava/lang/String;J)V
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "length"    # D
    .param p4, "playerName"    # Ljava/lang/String;
    .param p5, "openTime"    # J

    .prologue
    const/4 v2, 0x0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->openTime:Ljava/util/Date;

    .line 40
    iput-boolean v2, p0, Lcom/adobe/mobile/MediaState;->complete:Z

    .line 41
    iput-boolean v2, p0, Lcom/adobe/mobile/MediaState;->clicked:Z

    .line 62
    iput-object p1, p0, Lcom/adobe/mobile/MediaState;->name:Ljava/lang/String;

    .line 63
    iput-wide p2, p0, Lcom/adobe/mobile/MediaState;->length:D

    .line 64
    iput-object p4, p0, Lcom/adobe/mobile/MediaState;->playerName:Ljava/lang/String;

    .line 65
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getTimeSince1970()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->timestamp:J

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->segment:Ljava/lang/String;

    .line 67
    iput v2, p0, Lcom/adobe/mobile/MediaState;->segmentNum:I

    .line 68
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->segmentLength:D

    .line 69
    iget-object v0, p0, Lcom/adobe/mobile/MediaState;->openTime:Ljava/util/Date;

    invoke-virtual {v0, p5, p6}, Ljava/util/Date;->setTime(J)V

    .line 71
    return-void
.end method

.method private checkComplete()V
    .locals 4

    .prologue
    .line 154
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->length:D

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_1

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaState;->complete:Z

    .line 162
    :cond_0
    :goto_0
    return-void

    .line 159
    :cond_1
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->percent:D

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    .line 160
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/adobe/mobile/MediaState;->complete:Z

    goto :goto_0
.end method

.method private generatePercent()V
    .locals 6

    .prologue
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 147
    iget-wide v2, p0, Lcom/adobe/mobile/MediaState;->length:D

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpl-double v2, v2, v4

    if-eqz v2, :cond_1

    .line 148
    iget-wide v2, p0, Lcom/adobe/mobile/MediaState;->offset:D

    iget-wide v4, p0, Lcom/adobe/mobile/MediaState;->length:D

    div-double/2addr v2, v4

    mul-double/2addr v2, v0

    iput-wide v2, p0, Lcom/adobe/mobile/MediaState;->percent:D

    .line 149
    iget-wide v2, p0, Lcom/adobe/mobile/MediaState;->percent:D

    cmpg-double v2, v2, v0

    if-gez v2, :cond_0

    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->percent:D

    :cond_0
    iput-wide v0, p0, Lcom/adobe/mobile/MediaState;->percent:D

    .line 151
    :cond_1
    return-void
.end method


# virtual methods
.method protected getEventType()I
    .locals 1

    .prologue
    .line 98
    iget v0, p0, Lcom/adobe/mobile/MediaState;->eventType:I

    return v0
.end method

.method protected getTimePlayed()D
    .locals 2

    .prologue
    .line 177
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->timePlayed:D

    return-wide v0
.end method

.method protected getTimePlayedSinceTrack()D
    .locals 2

    .prologue
    .line 169
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->timePlayedSinceTrack:D

    return-wide v0
.end method

.method protected getTimestamp()D
    .locals 2

    .prologue
    .line 165
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->timestamp:J

    long-to-double v0, v0

    return-wide v0
.end method

.method protected setEventType(I)V
    .locals 2
    .param p1, "eventType"    # I

    .prologue
    .line 102
    iput p1, p0, Lcom/adobe/mobile/MediaState;->eventType:I

    .line 105
    iget v1, p0, Lcom/adobe/mobile/MediaState;->eventType:I

    packed-switch v1, :pswitch_data_0

    .line 125
    const-string v0, "CLOSE"

    .line 128
    .local v0, "mediaEvent":Ljava/lang/String;
    :goto_0
    iput-object v0, p0, Lcom/adobe/mobile/MediaState;->mediaEvent:Ljava/lang/String;

    .line 129
    return-void

    .line 107
    .end local v0    # "mediaEvent":Ljava/lang/String;
    :pswitch_0
    const-string v0, "PLAY"

    .line 108
    .restart local v0    # "mediaEvent":Ljava/lang/String;
    goto :goto_0

    .line 110
    .end local v0    # "mediaEvent":Ljava/lang/String;
    :pswitch_1
    const-string v0, "STOP"

    .line 111
    .restart local v0    # "mediaEvent":Ljava/lang/String;
    goto :goto_0

    .line 113
    .end local v0    # "mediaEvent":Ljava/lang/String;
    :pswitch_2
    const-string v0, "MONITOR"

    .line 114
    .restart local v0    # "mediaEvent":Ljava/lang/String;
    goto :goto_0

    .line 116
    .end local v0    # "mediaEvent":Ljava/lang/String;
    :pswitch_3
    const-string v0, "TRACK"

    .line 117
    .restart local v0    # "mediaEvent":Ljava/lang/String;
    goto :goto_0

    .line 119
    .end local v0    # "mediaEvent":Ljava/lang/String;
    :pswitch_4
    const-string v0, "COMPLETE"

    .line 120
    .restart local v0    # "mediaEvent":Ljava/lang/String;
    goto :goto_0

    .line 122
    .end local v0    # "mediaEvent":Ljava/lang/String;
    :pswitch_5
    const-string v0, "CLICK"

    .line 123
    .restart local v0    # "mediaEvent":Ljava/lang/String;
    goto :goto_0

    .line 105
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method protected setOffset(D)V
    .locals 5
    .param p1, "offset"    # D

    .prologue
    const-wide/16 v2, 0x0

    .line 132
    iput-wide p1, p0, Lcom/adobe/mobile/MediaState;->offset:D

    .line 134
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->length:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 135
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->length:D

    cmpg-double v0, p1, v0

    if-gez v0, :cond_2

    .end local p1    # "offset":D
    :goto_0
    iput-wide p1, p0, Lcom/adobe/mobile/MediaState;->offset:D

    .line 138
    :cond_0
    iget-wide v0, p0, Lcom/adobe/mobile/MediaState;->offset:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 139
    iput-wide v2, p0, Lcom/adobe/mobile/MediaState;->offset:D

    .line 142
    :cond_1
    invoke-direct {p0}, Lcom/adobe/mobile/MediaState;->generatePercent()V

    .line 143
    invoke-direct {p0}, Lcom/adobe/mobile/MediaState;->checkComplete()V

    .line 144
    return-void

    .line 135
    .restart local p1    # "offset":D
    :cond_2
    iget-wide p1, p0, Lcom/adobe/mobile/MediaState;->length:D

    goto :goto_0
.end method

.method protected setTimePlayed(D)V
    .locals 1
    .param p1, "timePlayed"    # D

    .prologue
    .line 181
    iput-wide p1, p0, Lcom/adobe/mobile/MediaState;->timePlayed:D

    .line 182
    return-void
.end method

.method protected setTimePlayedSinceTrack(D)V
    .locals 1
    .param p1, "timePlayedSinceTrack"    # D

    .prologue
    .line 173
    iput-wide p1, p0, Lcom/adobe/mobile/MediaState;->timePlayedSinceTrack:D

    .line 174
    return-void
.end method
