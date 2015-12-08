.class public final Lcom/adobe/mobile/DataListenerWearable;
.super Ljava/lang/Object;
.source "DataListenerWearable.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    .locals 6
    .param p0, "dataEvents"    # Lcom/google/android/gms/wearable/DataEventBuffer;

    .prologue
    .line 31
    if-nez p0, :cond_1

    .line 49
    :cond_0
    return-void

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataEventBuffer;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/DataEvent;

    .line 35
    .local v0, "event":Lcom/google/android/gms/wearable/DataEvent;
    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataEvent;->getType()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    .line 36
    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataEvent;->getDataItem()Lcom/google/android/gms/wearable/DataItem;

    move-result-object v1

    .line 37
    .local v1, "item":Lcom/google/android/gms/wearable/DataItem;
    if-eqz v1, :cond_2

    .line 40
    invoke-interface {v1}, Lcom/google/android/gms/wearable/DataItem;->getUri()Landroid/net/Uri;

    move-result-object v2

    .line 41
    .local v2, "uri":Landroid/net/Uri;
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 44
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/abdmobile/data/config/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 45
    invoke-static {v1}, Lcom/adobe/mobile/ConfigSynchronizer;->restoreConfig(Lcom/google/android/gms/wearable/DataItem;)V

    goto :goto_0
.end method
