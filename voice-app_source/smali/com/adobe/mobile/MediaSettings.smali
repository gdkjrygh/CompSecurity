.class public Lcom/adobe/mobile/MediaSettings;
.super Ljava/lang/Object;
.source "MediaSettings.java"


# instance fields
.field public CPM:Ljava/lang/String;

.field public channel:Ljava/lang/String;

.field public completeCloseOffsetThreshold:I

.field public isMediaAd:Z

.field public length:D

.field public milestones:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public offsetMilestones:Ljava/lang/String;

.field public parentName:Ljava/lang/String;

.field public parentPod:Ljava/lang/String;

.field public parentPodPosition:D

.field public playerID:Ljava/lang/String;

.field public playerName:Ljava/lang/String;

.field public segmentByMilestones:Z

.field public segmentByOffsetMilestones:Z

.field public trackSeconds:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/adobe/mobile/MediaSettings;->trackSeconds:I

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lcom/adobe/mobile/MediaSettings;->completeCloseOffsetThreshold:I

    .line 45
    return-void
.end method

.method public static adSettingsWith(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)Lcom/adobe/mobile/MediaSettings;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "length"    # D
    .param p3, "playerName"    # Ljava/lang/String;
    .param p4, "parentName"    # Ljava/lang/String;
    .param p5, "parentPod"    # Ljava/lang/String;
    .param p6, "parentPodPosition"    # D
    .param p8, "CPM"    # Ljava/lang/String;

    .prologue
    .line 67
    new-instance v0, Lcom/adobe/mobile/MediaSettings;

    invoke-direct {v0}, Lcom/adobe/mobile/MediaSettings;-><init>()V

    .line 68
    .local v0, "mediaSettings":Lcom/adobe/mobile/MediaSettings;
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/adobe/mobile/MediaSettings;->isMediaAd:Z

    .line 69
    iput-object p0, v0, Lcom/adobe/mobile/MediaSettings;->name:Ljava/lang/String;

    .line 70
    iput-wide p1, v0, Lcom/adobe/mobile/MediaSettings;->length:D

    .line 71
    iput-object p3, v0, Lcom/adobe/mobile/MediaSettings;->playerName:Ljava/lang/String;

    .line 72
    iput-object p4, v0, Lcom/adobe/mobile/MediaSettings;->parentName:Ljava/lang/String;

    .line 73
    iput-object p5, v0, Lcom/adobe/mobile/MediaSettings;->parentPod:Ljava/lang/String;

    .line 74
    iput-wide p6, v0, Lcom/adobe/mobile/MediaSettings;->parentPodPosition:D

    .line 75
    iput-object p8, v0, Lcom/adobe/mobile/MediaSettings;->CPM:Ljava/lang/String;

    .line 77
    return-object v0
.end method

.method public static settingsWith(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/adobe/mobile/MediaSettings;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "length"    # D
    .param p3, "playerName"    # Ljava/lang/String;
    .param p4, "playerID"    # Ljava/lang/String;

    .prologue
    .line 51
    new-instance v0, Lcom/adobe/mobile/MediaSettings;

    invoke-direct {v0}, Lcom/adobe/mobile/MediaSettings;-><init>()V

    .line 52
    .local v0, "mediaSettings":Lcom/adobe/mobile/MediaSettings;
    iput-object p0, v0, Lcom/adobe/mobile/MediaSettings;->name:Ljava/lang/String;

    .line 53
    iput-wide p1, v0, Lcom/adobe/mobile/MediaSettings;->length:D

    .line 54
    iput-object p3, v0, Lcom/adobe/mobile/MediaSettings;->playerName:Ljava/lang/String;

    .line 55
    iput-object p4, v0, Lcom/adobe/mobile/MediaSettings;->playerID:Ljava/lang/String;

    .line 57
    return-object v0
.end method
