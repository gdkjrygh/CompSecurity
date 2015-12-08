.class public Lcom/facebook/share/internal/NativeDialogParameters;
.super Ljava/lang/Object;
.source "NativeDialogParameters.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static create(Lcom/facebook/share/model/ShareLinkContent;Z)Landroid/os/Bundle;
    .locals 3
    .param p0, "linkContent"    # Lcom/facebook/share/model/ShareLinkContent;
    .param p1, "dataErrorsFatal"    # Z

    .prologue
    .line 93
    invoke-static {p0, p1}, Lcom/facebook/share/internal/NativeDialogParameters;->createBaseParameters(Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;

    move-result-object v0

    .line 95
    .local v0, "params":Landroid/os/Bundle;
    const-string v1, "TITLE"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareLinkContent;->getContentTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v1, "DESCRIPTION"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareLinkContent;->getContentDescription()Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v1, "IMAGE"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareLinkContent;->getImageUrl()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/internal/Utility;->putUri(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V

    .line 100
    return-object v0
.end method

.method private static create(Lcom/facebook/share/model/ShareOpenGraphContent;Lorg/json/JSONObject;Z)Landroid/os/Bundle;
    .locals 4
    .param p0, "openGraphContent"    # Lcom/facebook/share/model/ShareOpenGraphContent;
    .param p1, "openGraphActionJSON"    # Lorg/json/JSONObject;
    .param p2, "dataErrorsFatal"    # Z

    .prologue
    .line 132
    invoke-static {p0, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->createBaseParameters(Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;

    move-result-object v0

    .line 136
    .local v0, "params":Landroid/os/Bundle;
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareOpenGraphContent;->getPreviewPropertyName()Ljava/lang/String;

    move-result-object v2

    .line 135
    invoke-static {v2}, Lcom/facebook/share/internal/ShareInternalUtility;->getFieldNameAndNamespaceFromFullName(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v2

    .line 136
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 140
    .local v1, "previewProperty":Ljava/lang/String;
    const-string v2, "PREVIEW_PROPERTY_NAME"

    .line 138
    invoke-static {v0, v2, v1}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v2, "ACTION_TYPE"

    .line 145
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareOpenGraphContent;->getAction()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/share/model/ShareOpenGraphAction;->getActionType()Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const-string v2, "ACTION"

    .line 150
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    .line 147
    invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    return-object v0
.end method

.method private static create(Lcom/facebook/share/model/SharePhotoContent;Ljava/util/List;Z)Landroid/os/Bundle;
    .locals 3
    .param p0, "photoContent"    # Lcom/facebook/share/model/SharePhotoContent;
    .param p2, "dataErrorsFatal"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/SharePhotoContent;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .prologue
    .line 107
    .local p1, "imageUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p0, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->createBaseParameters(Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;

    move-result-object v0

    .line 109
    .local v0, "params":Landroid/os/Bundle;
    const-string v1, "PHOTOS"

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 111
    return-object v0
.end method

.method private static create(Lcom/facebook/share/model/ShareVideoContent;Ljava/lang/String;Z)Landroid/os/Bundle;
    .locals 3
    .param p0, "videoContent"    # Lcom/facebook/share/model/ShareVideoContent;
    .param p1, "videoUrl"    # Ljava/lang/String;
    .param p2, "dataErrorsFatal"    # Z

    .prologue
    .line 118
    invoke-static {p0, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->createBaseParameters(Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;

    move-result-object v0

    .line 120
    .local v0, "params":Landroid/os/Bundle;
    const-string v1, "TITLE"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareVideoContent;->getContentTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v1, "DESCRIPTION"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareVideoContent;->getContentDescription()Ljava/lang/String;

    move-result-object v2

    .line 121
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v1, "VIDEO"

    invoke-static {v0, v1, p1}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    return-object v0
.end method

.method public static create(Ljava/util/UUID;Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;
    .locals 12
    .param p0, "callId"    # Ljava/util/UUID;
    .param p1, "shareContent"    # Lcom/facebook/share/model/ShareContent;
    .param p2, "shouldFailOnDataError"    # Z

    .prologue
    .line 55
    const-string v9, "shareContent"

    invoke-static {p1, v9}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    const-string v9, "callId"

    invoke-static {p0, v9}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    const/4 v2, 0x0

    .line 59
    .local v2, "nativeParams":Landroid/os/Bundle;
    instance-of v9, p1, Lcom/facebook/share/model/ShareLinkContent;

    if-eqz v9, :cond_1

    move-object v1, p1

    .line 60
    check-cast v1, Lcom/facebook/share/model/ShareLinkContent;

    .line 61
    .local v1, "linkContent":Lcom/facebook/share/model/ShareLinkContent;
    invoke-static {v1, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->create(Lcom/facebook/share/model/ShareLinkContent;Z)Landroid/os/Bundle;

    move-result-object v2

    .line 89
    .end local v1    # "linkContent":Lcom/facebook/share/model/ShareLinkContent;
    :cond_0
    :goto_0
    return-object v2

    .line 62
    :cond_1
    instance-of v9, p1, Lcom/facebook/share/model/SharePhotoContent;

    if-eqz v9, :cond_2

    move-object v5, p1

    .line 63
    check-cast v5, Lcom/facebook/share/model/SharePhotoContent;

    .line 64
    .local v5, "photoContent":Lcom/facebook/share/model/SharePhotoContent;
    invoke-static {v5, p0}, Lcom/facebook/share/internal/ShareInternalUtility;->getPhotoUrls(Lcom/facebook/share/model/SharePhotoContent;Ljava/util/UUID;)Ljava/util/List;

    move-result-object v6

    .line 68
    .local v6, "photoUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v5, v6, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->create(Lcom/facebook/share/model/SharePhotoContent;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v2

    .line 69
    goto :goto_0

    .end local v5    # "photoContent":Lcom/facebook/share/model/SharePhotoContent;
    .end local v6    # "photoUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_2
    instance-of v9, p1, Lcom/facebook/share/model/ShareVideoContent;

    if-eqz v9, :cond_3

    move-object v7, p1

    .line 70
    check-cast v7, Lcom/facebook/share/model/ShareVideoContent;

    .line 71
    .local v7, "videoContent":Lcom/facebook/share/model/ShareVideoContent;
    invoke-static {v7, p0}, Lcom/facebook/share/internal/ShareInternalUtility;->getVideoUrl(Lcom/facebook/share/model/ShareVideoContent;Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v8

    .line 73
    .local v8, "videoUrl":Ljava/lang/String;
    invoke-static {v7, v8, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->create(Lcom/facebook/share/model/ShareVideoContent;Ljava/lang/String;Z)Landroid/os/Bundle;

    move-result-object v2

    .line 74
    goto :goto_0

    .end local v7    # "videoContent":Lcom/facebook/share/model/ShareVideoContent;
    .end local v8    # "videoUrl":Ljava/lang/String;
    :cond_3
    instance-of v9, p1, Lcom/facebook/share/model/ShareOpenGraphContent;

    if-eqz v9, :cond_0

    move-object v4, p1

    .line 75
    check-cast v4, Lcom/facebook/share/model/ShareOpenGraphContent;

    .line 77
    .local v4, "openGraphContent":Lcom/facebook/share/model/ShareOpenGraphContent;
    :try_start_0
    invoke-static {p0, v4}, Lcom/facebook/share/internal/ShareInternalUtility;->toJSONObjectForCall(Ljava/util/UUID;Lcom/facebook/share/model/ShareOpenGraphContent;)Lorg/json/JSONObject;

    move-result-object v3

    .line 80
    .local v3, "openGraphActionJSON":Lorg/json/JSONObject;
    const/4 v9, 0x0

    .line 79
    invoke-static {v3, v9}, Lcom/facebook/share/internal/ShareInternalUtility;->removeNamespacesFromOGJsonObject(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;

    move-result-object v3

    .line 81
    invoke-static {v4, v3, p2}, Lcom/facebook/share/internal/NativeDialogParameters;->create(Lcom/facebook/share/model/ShareOpenGraphContent;Lorg/json/JSONObject;Z)Landroid/os/Bundle;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 82
    .end local v3    # "openGraphActionJSON":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 83
    .local v0, "e":Lorg/json/JSONException;
    new-instance v9, Lcom/facebook/FacebookException;

    .line 84
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Unable to create a JSON Object from the provided ShareOpenGraphContent: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 84
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 83
    invoke-direct {v9, v10}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v9
.end method

.method private static createBaseParameters(Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;
    .locals 4
    .param p0, "content"    # Lcom/facebook/share/model/ShareContent;
    .param p1, "dataErrorsFatal"    # Z

    .prologue
    .line 156
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 158
    .local v0, "params":Landroid/os/Bundle;
    const-string v2, "LINK"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareContent;->getContentUrl()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->putUri(Landroid/os/Bundle;Ljava/lang/String;Landroid/net/Uri;)V

    .line 159
    const-string v2, "PLACE"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareContent;->getPlaceId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v2, "REF"

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareContent;->getRef()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->putNonEmptyString(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v2, "DATA_FAILURES_FATAL"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 164
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareContent;->getPeopleIds()Ljava/util/List;

    move-result-object v1

    .line 165
    .local v1, "peopleIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 167
    const-string v2, "FRIENDS"

    .line 168
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 171
    :cond_0
    return-object v0
.end method
