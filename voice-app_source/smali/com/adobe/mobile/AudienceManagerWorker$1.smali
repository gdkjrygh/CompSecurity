.class final Lcom/adobe/mobile/AudienceManagerWorker$1;
.super Ljava/lang/Object;
.source "AudienceManagerWorker.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/AudienceManagerWorker;->GetVisitorProfile()Ljava/util/HashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/HashMap",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 61
    invoke-virtual {p0}, Lcom/adobe/mobile/AudienceManagerWorker$1;->call()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 64
    # getter for: Lcom/adobe/mobile/AudienceManagerWorker;->VisitorProfile_pred:Z
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->access$000()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 66
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "AAMUserProfile"

    const/4 v6, 0x0

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 68
    .local v2, "profile":Ljava/lang/String;
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    if-lez v4, :cond_0

    .line 70
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 71
    .local v3, "profileData":Lorg/json/JSONObject;
    invoke-static {v3}, Lcom/adobe/mobile/StaticMethods;->mapFromJson(Lorg/json/JSONObject;)Ljava/util/HashMap;

    move-result-object v4

    # setter for: Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;
    invoke-static {v4}, Lcom/adobe/mobile/AudienceManagerWorker;->access$102(Ljava/util/HashMap;)Ljava/util/HashMap;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    .end local v3    # "profileData":Lorg/json/JSONObject;
    :goto_0
    const/4 v4, 0x0

    :try_start_2
    # setter for: Lcom/adobe/mobile/AudienceManagerWorker;->VisitorProfile_pred:Z
    invoke-static {v4}, Lcom/adobe/mobile/AudienceManagerWorker;->access$002(Z)Z
    :try_end_2
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_2 .. :try_end_2} :catch_1

    .line 84
    .end local v2    # "profile":Ljava/lang/String;
    :cond_0
    :goto_1
    # getter for: Lcom/adobe/mobile/AudienceManagerWorker;->_visitorProfile:Ljava/util/HashMap;
    invoke-static {}, Lcom/adobe/mobile/AudienceManagerWorker;->access$100()Ljava/util/HashMap;

    move-result-object v4

    return-object v4

    .line 73
    .restart local v2    # "profile":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 74
    .local v1, "ex":Lorg/json/JSONException;
    :try_start_3
    const-string v4, "Audience Manager - Problem accessing profile data (%s)"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v1}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 79
    .end local v1    # "ex":Lorg/json/JSONException;
    .end local v2    # "profile":Ljava/lang/String;
    :catch_1
    move-exception v0

    .line 80
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v4, "Audience Manager - Problem accessing profile data (%s)"

    new-array v5, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method
