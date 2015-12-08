.class Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
.super Ljava/lang/Object;
.source "DynamicEventTracker.java"

# interfaces
.implements Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;,
        Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;,
        Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    }
.end annotation


# static fields
.field private static final DEBOUNCE_TIME_MILLIS:I = 0x3e8

.field private static LOGTAG:Ljava/lang/String; = null

.field private static final MAX_PROPERTY_LENGTH:I = 0x80


# instance fields
.field private final mDebouncedEvents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;",
            "Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;

.field private final mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

.field private final mTask:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 185
    const-string v0, "MixpanelAPI.DynamicEventTracker"

    sput-object v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->LOGTAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Landroid/os/Handler;)V
    .locals 2
    .param p1, "mixpanel"    # Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    .param p2, "homeHandler"    # Landroid/os/Handler;

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;

    .line 32
    new-instance v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;-><init>(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$SendDebouncedTask;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mTask:Ljava/lang/Runnable;

    .line 33
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mHandler:Landroid/os/Handler;

    .line 34
    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$1(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    return-object v0
.end method

.method static synthetic access$2(Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private static textPropertyFromView(Landroid/view/View;)Ljava/lang/String;
    .locals 12
    .param p0, "v"    # Landroid/view/View;

    .prologue
    const/16 v11, 0x80

    .line 103
    const/4 v5, 0x0

    .line 105
    .local v5, "ret":Ljava/lang/String;
    instance-of v10, p0, Landroid/widget/TextView;

    if-eqz v10, :cond_1

    move-object v8, p0

    .line 106
    check-cast v8, Landroid/widget/TextView;

    .line 107
    .local v8, "textV":Landroid/widget/TextView;
    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    .line 108
    .local v6, "retSequence":Ljava/lang/CharSequence;
    if-eqz v6, :cond_0

    .line 109
    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 135
    .end local v6    # "retSequence":Ljava/lang/CharSequence;
    .end local v8    # "textV":Landroid/widget/TextView;
    :cond_0
    :goto_0
    return-object v5

    .line 111
    :cond_1
    instance-of v10, p0, Landroid/view/ViewGroup;

    if-eqz v10, :cond_0

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .local v0, "builder":Ljava/lang/StringBuilder;
    move-object v9, p0

    .line 113
    check-cast v9, Landroid/view/ViewGroup;

    .line 114
    .local v9, "vGroup":Landroid/view/ViewGroup;
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    .line 115
    .local v2, "childCount":I
    const/4 v7, 0x0

    .line 116
    .local v7, "textSeen":Z
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    if-ge v4, v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-lt v10, v11, :cond_3

    .line 128
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-le v10, v11, :cond_6

    .line 129
    const/4 v10, 0x0

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 130
    goto :goto_0

    .line 117
    :cond_3
    invoke-virtual {v9, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 118
    .local v1, "child":Landroid/view/View;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->textPropertyFromView(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    .line 119
    .local v3, "childText":Ljava/lang/String;
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_5

    .line 120
    if-eqz v7, :cond_4

    .line 121
    const-string v10, ", "

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    const/4 v7, 0x1

    .line 116
    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 130
    .end local v1    # "child":Landroid/view/View;
    .end local v3    # "childText":Ljava/lang/String;
    :cond_6
    if-eqz v7, :cond_0

    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0
.end method


# virtual methods
.method public OnEvent(Landroid/view/View;Ljava/lang/String;Z)V
    .locals 16
    .param p1, "v"    # Landroid/view/View;
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "debounce"    # Z

    .prologue
    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 40
    .local v6, "moment":J
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 42
    .local v8, "properties":Lorg/json/JSONObject;
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->textPropertyFromView(Landroid/view/View;)Ljava/lang/String;

    move-result-object v9

    .line 43
    .local v9, "text":Ljava/lang/String;
    const-string v10, "$text"

    invoke-virtual {v8, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    const-string v10, "$from_binding"

    const/4 v11, 0x1

    invoke-virtual {v8, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 48
    const-string v10, "time"

    const-wide/16 v12, 0x3e8

    div-long v12, v6, v12

    invoke-virtual {v8, v10, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .end local v9    # "text":Ljava/lang/String;
    :goto_0
    if-eqz p3, :cond_1

    .line 54
    new-instance v4, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {v4, v0, v1}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 55
    .local v4, "eventSignature":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;
    new-instance v3, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;

    move-object/from16 v0, p2

    invoke-direct {v3, v0, v8, v6, v7}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;-><init>(Ljava/lang/String;Lorg/json/JSONObject;J)V

    .line 60
    .local v3, "event":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;

    monitor-enter v11

    .line 61
    :try_start_1
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;

    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    .line 62
    .local v5, "needsRestart":Z
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mDebouncedEvents:Ljava/util/Map;

    invoke-interface {v10, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    if-eqz v5, :cond_0

    .line 64
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mHandler:Landroid/os/Handler;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mTask:Ljava/lang/Runnable;

    const-wide/16 v14, 0x3e8

    invoke-virtual {v10, v12, v14, v15}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 60
    :cond_0
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .end local v3    # "event":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    .end local v4    # "eventSignature":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;
    .end local v5    # "needsRestart":Z
    :goto_1
    return-void

    .line 49
    :catch_0
    move-exception v2

    .line 50
    .local v2, "e":Lorg/json/JSONException;
    sget-object v10, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->LOGTAG:Ljava/lang/String;

    const-string v11, "Can\'t format properties from view due to JSON issue"

    invoke-static {v10, v11, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 60
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v3    # "event":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    .restart local v4    # "eventSignature":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;
    :catchall_0
    move-exception v10

    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v10

    .line 68
    .end local v3    # "event":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
    .end local v4    # "eventSignature":Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;
    :cond_1
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-object/from16 v0, p2

    invoke-virtual {v10, v0, v8}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_1
.end method
