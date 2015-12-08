.class final Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;
.super Ljava/lang/Object;
.source "DynamicEventTracker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SendDebouncedTask"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;->this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;-><init>(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 79
    .local v2, "now":J
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;->this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    # getter for: Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;
    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->access$0(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Ljava/util/Map;

    move-result-object v6

    monitor-enter v6

    .line 80
    :try_start_0
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;->this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    # getter for: Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;
    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->access$0(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 81
    .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;>;>;"
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    .line 90
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;->this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    # getter for: Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;
    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->access$0(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 92
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;->this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    # getter for: Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mHandler:Landroid/os/Handler;
    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->access$2(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Landroid/os/Handler;

    move-result-object v5

    const-wide/16 v8, 0x1f4

    invoke-virtual {v5, p0, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 79
    :cond_1
    monitor-exit v6

    .line 95
    return-void

    .line 82
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 83
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;

    .line 84
    .local v4, "val":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    iget-wide v8, v4, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;->timeSentMillis:J

    sub-long v8, v2, v8

    const-wide/16 v10, 0x3e8

    cmp-long v5, v8, v10

    if-lez v5, :cond_0

    .line 85
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;->this$0:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    # getter for: Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->access$1(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v5

    iget-object v7, v4, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;->eventName:Ljava/lang/String;

    iget-object v8, v4, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;->properties:Lorg/json/JSONObject;

    invoke-virtual {v5, v7, v8}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 79
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;>;"
    .end local v1    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;>;>;"
    .end local v4    # "val":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    :catchall_0
    move-exception v5

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v5
.end method
