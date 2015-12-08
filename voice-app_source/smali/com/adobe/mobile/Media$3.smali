.class final Lcom/adobe/mobile/Media$3;
.super Ljava/lang/Object;
.source "Media.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Media;->play(Ljava/lang/String;D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$offset:D


# direct methods
.method constructor <init>(Ljava/lang/String;D)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/adobe/mobile/Media$3;->val$name:Ljava/lang/String;

    iput-wide p2, p0, Lcom/adobe/mobile/Media$3;->val$offset:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 91
    invoke-static {}, Lcom/adobe/mobile/MediaAnalytics;->sharedInstance()Lcom/adobe/mobile/MediaAnalytics;

    move-result-object v0

    iget-object v1, p0, Lcom/adobe/mobile/Media$3;->val$name:Ljava/lang/String;

    iget-wide v2, p0, Lcom/adobe/mobile/Media$3;->val$offset:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/adobe/mobile/MediaAnalytics;->play(Ljava/lang/String;D)V

    .line 92
    return-void
.end method
