.class final Lcom/adobe/mobile/Media$7;
.super Ljava/lang/Object;
.source "Media.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Media;->track(Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$fdata:Ljava/util/Map;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/adobe/mobile/Media$7;->val$name:Ljava/lang/String;

    iput-object p2, p0, Lcom/adobe/mobile/Media$7;->val$fdata:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 153
    invoke-static {}, Lcom/adobe/mobile/MediaAnalytics;->sharedInstance()Lcom/adobe/mobile/MediaAnalytics;

    move-result-object v0

    iget-object v1, p0, Lcom/adobe/mobile/Media$7;->val$name:Ljava/lang/String;

    iget-object v2, p0, Lcom/adobe/mobile/Media$7;->val$fdata:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->track(Ljava/lang/String;Ljava/util/Map;)V

    .line 154
    return-void
.end method
