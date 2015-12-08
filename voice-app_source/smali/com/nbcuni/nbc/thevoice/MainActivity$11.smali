.class Lcom/nbcuni/nbc/thevoice/MainActivity$11;
.super Landroid/os/Handler;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$11;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    .line 839
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 844
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "attributionData"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 845
    .local v1, "attributionDataString":Ljava/lang/String;
    if-eqz v1, :cond_2

    const-string v3, "false"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 847
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 848
    .local v0, "attrProps":Lorg/json/JSONObject;
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 849
    .local v2, "attributionObject":Lorg/json/JSONObject;
    const-string v3, "tracker"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 850
    const-string v3, "campaign"

    const-string v4, "tracker"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 852
    :cond_0
    const-string v3, "tracker_id"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 853
    const-string v3, "campaign_id"

    const-string v4, "tracker_id"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 854
    :cond_1
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$11;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;

    iget-object v3, v3, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v3, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperProperties(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 858
    .end local v0    # "attrProps":Lorg/json/JSONObject;
    .end local v2    # "attributionObject":Lorg/json/JSONObject;
    :cond_2
    :goto_0
    return-void

    .line 855
    :catch_0
    move-exception v3

    goto :goto_0
.end method
