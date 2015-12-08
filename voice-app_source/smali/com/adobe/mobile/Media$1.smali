.class final Lcom/adobe/mobile/Media$1;
.super Ljava/lang/Object;
.source "Media.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Media;->open(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/Media$MediaCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Lcom/adobe/mobile/Media$MediaCallback;

.field final synthetic val$settings:Lcom/adobe/mobile/MediaSettings;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/Media$MediaCallback;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/adobe/mobile/Media$1;->val$settings:Lcom/adobe/mobile/MediaSettings;

    iput-object p2, p0, Lcom/adobe/mobile/Media$1;->val$callback:Lcom/adobe/mobile/Media$MediaCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 62
    invoke-static {}, Lcom/adobe/mobile/MediaAnalytics;->sharedInstance()Lcom/adobe/mobile/MediaAnalytics;

    move-result-object v0

    iget-object v1, p0, Lcom/adobe/mobile/Media$1;->val$settings:Lcom/adobe/mobile/MediaSettings;

    iget-object v2, p0, Lcom/adobe/mobile/Media$1;->val$callback:Lcom/adobe/mobile/Media$MediaCallback;

    invoke-virtual {v0, v1, v2}, Lcom/adobe/mobile/MediaAnalytics;->open(Lcom/adobe/mobile/MediaSettings;Lcom/adobe/mobile/Media$MediaCallback;)V

    .line 63
    return-void
.end method
