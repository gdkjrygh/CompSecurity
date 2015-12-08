.class Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;
.super Ljava/lang/Object;
.source "ViewCrawler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewCrawler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "VariantTracker"
.end annotation


# instance fields
.field private final mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V
    .locals 0
    .param p1, "mixpanel"    # Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .prologue
    .line 1016
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1017
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .line 1018
    return-void
.end method


# virtual methods
.method public trackVariants(Ljava/util/Set;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 1021
    .local p1, "variants":Ljava/util/Set;, "Ljava/util/Set<Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;"
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v6

    if-nez v6, :cond_0

    .line 1054
    :goto_0
    return-void

    .line 1025
    :cond_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1028
    .local v5, "variantObject":Lorg/json/JSONObject;
    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-nez v6, :cond_1

    .line 1043
    :goto_2
    iget-object v6, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v6}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v6

    const-string v7, "$experiments"

    invoke-interface {v6, v7, v5}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->merge(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1044
    iget-object v6, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    new-instance v7, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker$1;

    invoke-direct {v7, p0, v5}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker$1;-><init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;Lorg/json/JSONObject;)V

    invoke-virtual {v6, v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->updateSuperProperties(Lcom/mixpanel/android/mpmetrics/SuperPropertyUpdate;)V

    goto :goto_0

    .line 1028
    :cond_1
    :try_start_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    .line 1029
    .local v3, "variant":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 1030
    .local v1, "experimentId":I
    iget-object v6, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 1032
    .local v4, "variantId":I
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1033
    .local v2, "trackProps":Lorg/json/JSONObject;
    const-string v6, "$experiment_id"

    invoke-virtual {v2, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1034
    const-string v6, "$variant_id"

    invoke-virtual {v2, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1035
    iget-object v6, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;->mMixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    const-string v8, "$experiment_started"

    invoke-virtual {v6, v8, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1037
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 1039
    .end local v1    # "experimentId":I
    .end local v2    # "trackProps":Lorg/json/JSONObject;
    .end local v3    # "variant":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    .end local v4    # "variantId":I
    :catch_0
    move-exception v0

    .line 1040
    .local v0, "e":Lorg/json/JSONException;
    const-string v6, "MixpanelAPI.ViewCrawler"

    const-string v7, "Could not build JSON for reporting experiment start"

    invoke-static {v6, v7, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method
