.class public final Lcom/facebook/share/internal/ShareInternalUtility;
.super Ljava/lang/Object;
.source "ShareInternalUtility.java"


# static fields
.field public static final MY_PHOTOS:Ljava/lang/String; = "me/photos"

.field private static final MY_STAGING_RESOURCES:Ljava/lang/String; = "me/staging_resources"

.field private static final STAGING_PARAM:Ljava/lang/String; = "file"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Ljava/util/UUID;Lcom/facebook/share/model/SharePhoto;)Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;
    .locals 1

    .prologue
    .line 478
    invoke-static {p0, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->getAttachment(Ljava/util/UUID;Lcom/facebook/share/model/SharePhoto;)Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;

    move-result-object v0

    return-object v0
.end method

.method private static getAppCallFromActivityResult(IILandroid/content/Intent;)Lcom/facebook/internal/AppCall;
    .locals 2
    .param p0, "requestCode"    # I
    .param p1, "resultCode"    # I
    .param p2, "data"    # Landroid/content/Intent;

    .prologue
    .line 216
    invoke-static {p2}, Lcom/facebook/internal/NativeProtocol;->getCallIdFromIntent(Landroid/content/Intent;)Ljava/util/UUID;

    move-result-object v0

    .line 217
    .local v0, "callId":Ljava/util/UUID;
    if-nez v0, :cond_0

    .line 218
    const/4 v1, 0x0

    .line 221
    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0, p0}, Lcom/facebook/internal/AppCall;->finishPendingCall(Ljava/util/UUID;I)Lcom/facebook/internal/AppCall;

    move-result-object v1

    goto :goto_0
.end method

.method private static getAttachment(Ljava/util/UUID;Lcom/facebook/share/model/SharePhoto;)Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;
    .locals 3
    .param p0, "callId"    # Ljava/util/UUID;
    .param p1, "photo"    # Lcom/facebook/share/model/SharePhoto;

    .prologue
    .line 481
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 482
    .local v1, "bitmap":Landroid/graphics/Bitmap;
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->getImageUrl()Landroid/net/Uri;

    move-result-object v2

    .line 483
    .local v2, "photoUri":Landroid/net/Uri;
    const/4 v0, 0x0

    .line 484
    .local v0, "attachment":Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;
    if-eqz v1, :cond_1

    .line 485
    invoke-static {p0, v1}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->createAttachment(Ljava/util/UUID;Landroid/graphics/Bitmap;)Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;

    move-result-object v0

    .line 494
    :cond_0
    :goto_0
    return-object v0

    .line 488
    :cond_1
    if-eqz v2, :cond_0

    .line 489
    invoke-static {p0, v2}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->createAttachment(Ljava/util/UUID;Landroid/net/Uri;)Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;

    move-result-object v0

    goto :goto_0
.end method

.method public static getFieldNameAndNamespaceFromFullName(Ljava/lang/String;)Landroid/util/Pair;
    .locals 5
    .param p0, "fullName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 466
    const/4 v2, 0x0

    .line 468
    .local v2, "namespace":Ljava/lang/String;
    const/16 v3, 0x3a

    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 469
    .local v1, "index":I
    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v4, v1, 0x1

    if-le v3, v4, :cond_0

    .line 470
    const/4 v3, 0x0

    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 471
    add-int/lit8 v3, v1, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 475
    .local v0, "fieldName":Ljava/lang/String;
    :goto_0
    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3

    .line 473
    .end local v0    # "fieldName":Ljava/lang/String;
    :cond_0
    move-object v0, p0

    .restart local v0    # "fieldName":Ljava/lang/String;
    goto :goto_0
.end method

.method public static getMostSpecificObjectType(Lcom/facebook/share/widget/LikeView$ObjectType;Lcom/facebook/share/widget/LikeView$ObjectType;)Lcom/facebook/share/widget/LikeView$ObjectType;
    .locals 1
    .param p0, "objectType1"    # Lcom/facebook/share/widget/LikeView$ObjectType;
    .param p1, "objectType2"    # Lcom/facebook/share/widget/LikeView$ObjectType;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .prologue
    .line 661
    if-ne p0, p1, :cond_1

    .line 671
    .end local p0    # "objectType1":Lcom/facebook/share/widget/LikeView$ObjectType;
    :cond_0
    :goto_0
    return-object p0

    .line 665
    .restart local p0    # "objectType1":Lcom/facebook/share/widget/LikeView$ObjectType;
    :cond_1
    sget-object v0, Lcom/facebook/share/widget/LikeView$ObjectType;->UNKNOWN:Lcom/facebook/share/widget/LikeView$ObjectType;

    if-ne p0, v0, :cond_2

    move-object p0, p1

    .line 666
    goto :goto_0

    .line 667
    :cond_2
    sget-object v0, Lcom/facebook/share/widget/LikeView$ObjectType;->UNKNOWN:Lcom/facebook/share/widget/LikeView$ObjectType;

    if-eq p1, v0, :cond_0

    .line 671
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public static getNativeDialogCompletionGesture(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1
    .param p0, "result"    # Landroid/os/Bundle;

    .prologue
    .line 125
    const-string v0, "completionGesture"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    const-string v0, "completionGesture"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 128
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.facebook.platform.extra.COMPLETION_GESTURE"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getPhotoUrls(Lcom/facebook/share/model/SharePhotoContent;Ljava/util/UUID;)Ljava/util/List;
    .locals 4
    .param p0, "photoContent"    # Lcom/facebook/share/model/SharePhotoContent;
    .param p1, "appCallId"    # Ljava/util/UUID;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/SharePhotoContent;",
            "Ljava/util/UUID;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 268
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/model/SharePhotoContent;->getPhotos()Ljava/util/List;

    move-result-object v2

    .local v2, "photos":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/share/model/SharePhoto;>;"
    if-nez v2, :cond_1

    .line 269
    .end local v2    # "photos":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/share/model/SharePhoto;>;"
    :cond_0
    const/4 v0, 0x0

    .line 292
    :goto_0
    return-object v0

    .line 274
    .restart local v2    # "photos":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/share/model/SharePhoto;>;"
    :cond_1
    new-instance v3, Lcom/facebook/share/internal/ShareInternalUtility$4;

    invoke-direct {v3, p1}, Lcom/facebook/share/internal/ShareInternalUtility$4;-><init>(Ljava/util/UUID;)V

    .line 272
    invoke-static {v2, v3}, Lcom/facebook/internal/Utility;->map(Ljava/util/List;Lcom/facebook/internal/Utility$Mapper;)Ljava/util/List;

    move-result-object v1

    .line 283
    .local v1, "attachments":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;>;"
    new-instance v3, Lcom/facebook/share/internal/ShareInternalUtility$5;

    invoke-direct {v3}, Lcom/facebook/share/internal/ShareInternalUtility$5;-><init>()V

    .line 281
    invoke-static {v1, v3}, Lcom/facebook/internal/Utility;->map(Ljava/util/List;Lcom/facebook/internal/Utility$Mapper;)Ljava/util/List;

    move-result-object v0

    .line 290
    .local v0, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v1}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->addAttachments(Ljava/util/Collection;)V

    goto :goto_0
.end method

.method public static getShareDialogPostId(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1
    .param p0, "result"    # Landroid/os/Bundle;

    .prologue
    .line 139
    const-string v0, "postId"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const-string v0, "postId"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    :goto_0
    return-object v0

    .line 142
    :cond_0
    const-string v0, "com.facebook.platform.extra.POST_ID"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 143
    const-string v0, "com.facebook.platform.extra.POST_ID"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 145
    :cond_1
    const-string v0, "post_id"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getShareResultProcessor(Lcom/facebook/FacebookCallback;)Lcom/facebook/share/internal/ResultProcessor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)",
            "Lcom/facebook/share/internal/ResultProcessor;"
        }
    .end annotation

    .prologue
    .line 183
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    new-instance v0, Lcom/facebook/share/internal/ShareInternalUtility$1;

    invoke-direct {v0, p0, p0}, Lcom/facebook/share/internal/ShareInternalUtility$1;-><init>(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookCallback;)V

    return-object v0
.end method

.method public static getVideoUrl(Lcom/facebook/share/model/ShareVideoContent;Ljava/util/UUID;)Ljava/lang/String;
    .locals 3
    .param p0, "videoContent"    # Lcom/facebook/share/model/ShareVideoContent;
    .param p1, "appCallId"    # Ljava/util/UUID;

    .prologue
    .line 296
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/model/ShareVideoContent;->getVideo()Lcom/facebook/share/model/ShareVideo;

    move-result-object v2

    if-nez v2, :cond_1

    .line 297
    :cond_0
    const/4 v2, 0x0

    .line 309
    :goto_0
    return-object v2

    .line 303
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareVideoContent;->getVideo()Lcom/facebook/share/model/ShareVideo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/share/model/ShareVideo;->getLocalUrl()Landroid/net/Uri;

    move-result-object v2

    .line 301
    invoke-static {p1, v2}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->createAttachment(Ljava/util/UUID;Landroid/net/Uri;)Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;

    move-result-object v0

    .line 305
    .local v0, "attachment":Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .local v1, "attachments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;>;"
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    invoke-static {v1}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->addAttachments(Ljava/util/Collection;)V

    .line 309
    invoke-virtual {v0}, Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;->getAttachmentUrl()Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public static handleActivityResult(IILandroid/content/Intent;Lcom/facebook/share/internal/ResultProcessor;)Z
    .locals 5
    .param p0, "requestCode"    # I
    .param p1, "resultCode"    # I
    .param p2, "data"    # Landroid/content/Intent;
    .param p3, "resultProcessor"    # Lcom/facebook/share/internal/ResultProcessor;

    .prologue
    const/4 v3, 0x1

    .line 153
    invoke-static {p0, p1, p2}, Lcom/facebook/share/internal/ShareInternalUtility;->getAppCallFromActivityResult(IILandroid/content/Intent;)Lcom/facebook/internal/AppCall;

    move-result-object v0

    .line 154
    .local v0, "appCall":Lcom/facebook/internal/AppCall;
    if-nez v0, :cond_1

    .line 155
    const/4 v3, 0x0

    .line 177
    :cond_0
    :goto_0
    return v3

    .line 158
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/internal/AppCall;->getCallId()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->cleanupAttachmentsForCall(Ljava/util/UUID;)V

    .line 159
    if-eqz p3, :cond_0

    .line 164
    invoke-static {p2}, Lcom/facebook/internal/NativeProtocol;->getErrorDataFromResultIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v4

    .line 163
    invoke-static {v4}, Lcom/facebook/internal/NativeProtocol;->getExceptionFromErrorData(Landroid/os/Bundle;)Lcom/facebook/FacebookException;

    move-result-object v1

    .line 165
    .local v1, "exception":Lcom/facebook/FacebookException;
    if-eqz v1, :cond_3

    .line 166
    instance-of v4, v1, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v4, :cond_2

    .line 167
    invoke-virtual {p3, v0}, Lcom/facebook/share/internal/ResultProcessor;->onCancel(Lcom/facebook/internal/AppCall;)V

    goto :goto_0

    .line 169
    :cond_2
    invoke-virtual {p3, v0, v1}, Lcom/facebook/share/internal/ResultProcessor;->onError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 173
    :cond_3
    invoke-static {p2}, Lcom/facebook/internal/NativeProtocol;->getSuccessResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v2

    .line 174
    .local v2, "results":Landroid/os/Bundle;
    invoke-virtual {p3, v0, v2}, Lcom/facebook/share/internal/ResultProcessor;->onSuccess(Lcom/facebook/internal/AppCall;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public static invokeCallbackWithError(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V
    .locals 0
    .param p1, "error"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 98
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    invoke-static {p0, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    .line 99
    return-void
.end method

.method public static invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V
    .locals 2
    .param p1, "exception"    # Ljava/lang/Exception;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    .prologue
    .line 86
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    instance-of v0, p1, Lcom/facebook/FacebookException;

    if-eqz v0, :cond_0

    .line 87
    check-cast p1, Lcom/facebook/FacebookException;

    .end local p1    # "exception":Ljava/lang/Exception;
    invoke-static {p0, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V

    .line 93
    :goto_0
    return-void

    .line 92
    .restart local p1    # "exception":Ljava/lang/Exception;
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error preparing share content: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-static {p0, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithError(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static invokeCallbackWithResults(Lcom/facebook/FacebookCallback;Ljava/lang/String;Lcom/facebook/GraphResponse;)V
    .locals 3
    .param p1, "postId"    # Ljava/lang/String;
    .param p2, "graphResponse"    # Lcom/facebook/GraphResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/facebook/GraphResponse;",
            ")V"
        }
    .end annotation

    .prologue
    .line 105
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    invoke-virtual {p2}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    .line 106
    .local v1, "requestError":Lcom/facebook/FacebookRequestError;
    if-eqz v1, :cond_1

    .line 107
    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 108
    .local v0, "errorMessage":Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 109
    const-string v0, "Unexpected error sharing."

    .line 111
    :cond_0
    invoke-static {p0, p2, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/GraphResponse;Ljava/lang/String;)V

    .line 115
    .end local v0    # "errorMessage":Ljava/lang/String;
    :goto_0
    return-void

    .line 113
    :cond_1
    invoke-static {p0, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnSuccessCallback(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static invokeOnCancelCallback(Lcom/facebook/FacebookCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 498
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    const-string v0, "cancelled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/share/internal/ShareInternalUtility;->logShareResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    if-eqz p0, :cond_0

    .line 500
    invoke-interface {p0}, Lcom/facebook/FacebookCallback;->onCancel()V

    .line 502
    :cond_0
    return-void
.end method

.method static invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V
    .locals 2
    .param p1, "ex"    # Lcom/facebook/FacebookException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Lcom/facebook/FacebookException;",
            ")V"
        }
    .end annotation

    .prologue
    .line 536
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    const-string v0, "error"

    invoke-virtual {p1}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/share/internal/ShareInternalUtility;->logShareResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    if-eqz p0, :cond_0

    .line 538
    invoke-interface {p0, p1}, Lcom/facebook/FacebookCallback;->onError(Lcom/facebook/FacebookException;)V

    .line 540
    :cond_0
    return-void
.end method

.method static invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/GraphResponse;Ljava/lang/String;)V
    .locals 1
    .param p1, "response"    # Lcom/facebook/GraphResponse;
    .param p2, "message"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Lcom/facebook/GraphResponse;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 517
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    const-string v0, "error"

    invoke-static {v0, p2}, Lcom/facebook/share/internal/ShareInternalUtility;->logShareResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    if-eqz p0, :cond_0

    .line 519
    new-instance v0, Lcom/facebook/FacebookGraphResponseException;

    invoke-direct {v0, p1, p2}, Lcom/facebook/FacebookGraphResponseException;-><init>(Lcom/facebook/GraphResponse;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lcom/facebook/FacebookCallback;->onError(Lcom/facebook/FacebookException;)V

    .line 521
    :cond_0
    return-void
.end method

.method static invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 527
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    const-string v0, "error"

    invoke-static {v0, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->logShareResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    if-eqz p0, :cond_0

    .line 529
    new-instance v0, Lcom/facebook/FacebookException;

    invoke-direct {v0, p1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lcom/facebook/FacebookCallback;->onError(Lcom/facebook/FacebookException;)V

    .line 531
    :cond_0
    return-void
.end method

.method static invokeOnSuccessCallback(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V
    .locals 2
    .param p1, "postId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 507
    .local p0, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    const-string v0, "succeeded"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/share/internal/ShareInternalUtility;->logShareResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    if-eqz p0, :cond_0

    .line 509
    new-instance v0, Lcom/facebook/share/Sharer$Result;

    invoke-direct {v0, p1}, Lcom/facebook/share/Sharer$Result;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lcom/facebook/FacebookCallback;->onSuccess(Ljava/lang/Object;)V

    .line 511
    :cond_0
    return-void
.end method

.method private static logShareResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p0, "shareOutcome"    # Ljava/lang/String;
    .param p1, "errorMessage"    # Ljava/lang/String;

    .prologue
    .line 543
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 544
    .local v0, "context":Landroid/content/Context;
    invoke-static {v0}, Lcom/facebook/appevents/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger;

    move-result-object v1

    .line 545
    .local v1, "logger":Lcom/facebook/appevents/AppEventsLogger;
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 547
    .local v2, "parameters":Landroid/os/Bundle;
    const-string v3, "fb_share_dialog_outcome"

    .line 546
    invoke-virtual {v2, v3, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    if-eqz p1, :cond_0

    .line 552
    const-string v3, "error_message"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    :cond_0
    const-string v3, "fb_share_dialog_result"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v2}, Lcom/facebook/appevents/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 555
    return-void
.end method

.method public static newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Landroid/graphics/Bitmap;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;
    .locals 6
    .param p0, "accessToken"    # Lcom/facebook/AccessToken;
    .param p1, "image"    # Landroid/graphics/Bitmap;
    .param p2, "callback"    # Lcom/facebook/GraphRequest$Callback;

    .prologue
    .line 573
    new-instance v3, Landroid/os/Bundle;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V

    .line 574
    .local v3, "parameters":Landroid/os/Bundle;
    const-string v0, "file"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 576
    new-instance v0, Lcom/facebook/GraphRequest;

    .line 578
    const-string v2, "me/staging_resources"

    .line 580
    sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    move-object v1, p0

    move-object v5, p2

    .line 576
    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    return-object v0
.end method

.method public static newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Landroid/net/Uri;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;
    .locals 7
    .param p0, "accessToken"    # Lcom/facebook/AccessToken;
    .param p1, "imageUri"    # Landroid/net/Uri;
    .param p2, "callback"    # Lcom/facebook/GraphRequest$Callback;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 635
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isFileUri(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 638
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 636
    invoke-static {p0, v0, p2}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Ljava/io/File;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    .line 649
    :goto_0
    return-object v0

    .line 640
    :cond_0
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isContentUri(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 641
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "The image Uri must be either a file:// or content:// Uri"

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 645
    :cond_1
    new-instance v6, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    const-string v0, "image/png"

    invoke-direct {v6, p1, v0}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 646
    .local v6, "resourceWithMimeType":Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;, "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<Landroid/net/Uri;>;"
    new-instance v3, Landroid/os/Bundle;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V

    .line 647
    .local v3, "parameters":Landroid/os/Bundle;
    const-string v0, "file"

    invoke-virtual {v3, v0, v6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 649
    new-instance v0, Lcom/facebook/GraphRequest;

    .line 651
    const-string v2, "me/staging_resources"

    .line 653
    sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    move-object v1, p0

    move-object v5, p2

    .line 649
    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    goto :goto_0
.end method

.method public static newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Ljava/io/File;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;
    .locals 8
    .param p0, "accessToken"    # Lcom/facebook/AccessToken;
    .param p1, "file"    # Ljava/io/File;
    .param p2, "callback"    # Lcom/facebook/GraphRequest$Callback;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 603
    const/high16 v0, 0x10000000

    invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v6

    .line 605
    .local v6, "descriptor":Landroid/os/ParcelFileDescriptor;
    new-instance v7, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    const-string v0, "image/png"

    invoke-direct {v7, v6, v0}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 606
    .local v7, "resourceWithMimeType":Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;, "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<Landroid/os/ParcelFileDescriptor;>;"
    new-instance v3, Landroid/os/Bundle;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V

    .line 607
    .local v3, "parameters":Landroid/os/Bundle;
    const-string v0, "file"

    invoke-virtual {v3, v0, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 609
    new-instance v0, Lcom/facebook/GraphRequest;

    .line 611
    const-string v2, "me/staging_resources"

    .line 613
    sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    move-object v1, p0

    move-object v5, p2

    .line 609
    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    return-object v0
.end method

.method public static registerSharerCallback(ILcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V
    .locals 2
    .param p0, "requestCode"    # I
    .param p1, "callbackManager"    # Lcom/facebook/CallbackManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/CallbackManager;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 245
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/Sharer$Result;>;"
    instance-of v0, p1, Lcom/facebook/internal/CallbackManagerImpl;

    if-nez v0, :cond_0

    .line 246
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Unexpected CallbackManager, please use the provided Factory."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 250
    :cond_0
    check-cast p1, Lcom/facebook/internal/CallbackManagerImpl;

    .line 252
    .end local p1    # "callbackManager":Lcom/facebook/CallbackManager;
    new-instance v0, Lcom/facebook/share/internal/ShareInternalUtility$3;

    invoke-direct {v0, p0, p2}, Lcom/facebook/share/internal/ShareInternalUtility$3;-><init>(ILcom/facebook/FacebookCallback;)V

    .line 250
    invoke-virtual {p1, p0, v0}, Lcom/facebook/internal/CallbackManagerImpl;->registerCallback(ILcom/facebook/internal/CallbackManagerImpl$Callback;)V

    .line 262
    return-void
.end method

.method public static registerStaticShareCallback(I)V
    .locals 1
    .param p0, "requestCode"    # I

    .prologue
    .line 227
    .line 228
    new-instance v0, Lcom/facebook/share/internal/ShareInternalUtility$2;

    invoke-direct {v0, p0}, Lcom/facebook/share/internal/ShareInternalUtility$2;-><init>(I)V

    .line 226
    invoke-static {p0, v0}, Lcom/facebook/internal/CallbackManagerImpl;->registerStaticCallback(ILcom/facebook/internal/CallbackManagerImpl$Callback;)V

    .line 239
    return-void
.end method

.method public static removeNamespacesFromOGJsonArray(Lorg/json/JSONArray;Z)Lorg/json/JSONArray;
    .locals 4
    .param p0, "jsonArray"    # Lorg/json/JSONArray;
    .param p1, "requireNamespace"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 400
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 401
    .local v1, "newArray":Lorg/json/JSONArray;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 411
    return-object v1

    .line 402
    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 403
    .local v2, "value":Ljava/lang/Object;
    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_2

    .line 404
    check-cast v2, Lorg/json/JSONArray;

    .end local v2    # "value":Ljava/lang/Object;
    invoke-static {v2, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->removeNamespacesFromOGJsonArray(Lorg/json/JSONArray;Z)Lorg/json/JSONArray;

    move-result-object v2

    .line 408
    :cond_1
    :goto_1
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 401
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 405
    .restart local v2    # "value":Ljava/lang/Object;
    :cond_2
    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_1

    .line 406
    check-cast v2, Lorg/json/JSONObject;

    .end local v2    # "value":Ljava/lang/Object;
    invoke-static {v2, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->removeNamespacesFromOGJsonObject(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;

    move-result-object v2

    .local v2, "value":Lorg/json/JSONObject;
    goto :goto_1
.end method

.method public static removeNamespacesFromOGJsonObject(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;
    .locals 12
    .param p0, "jsonObject"    # Lorg/json/JSONObject;
    .param p1, "requireNamespace"    # Z

    .prologue
    .line 417
    if-nez p0, :cond_1

    .line 418
    const/4 v8, 0x0

    .line 459
    :cond_0
    :goto_0
    return-object v8

    .line 422
    :cond_1
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 423
    .local v8, "newJsonObject":Lorg/json/JSONObject;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 424
    .local v0, "data":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v6

    .line 425
    .local v6, "names":Lorg/json/JSONArray;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v10

    if-lt v4, v10, :cond_2

    .line 455
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v10

    if-lez v10, :cond_0

    .line 456
    const-string v10, "data"

    invoke-virtual {v8, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 460
    .end local v0    # "data":Lorg/json/JSONObject;
    .end local v4    # "i":I
    .end local v6    # "names":Lorg/json/JSONArray;
    .end local v8    # "newJsonObject":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 461
    .local v1, "e":Lorg/json/JSONException;
    new-instance v10, Lcom/facebook/FacebookException;

    const-string v11, "Failed to create json object from share content"

    invoke-direct {v10, v11}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 426
    .end local v1    # "e":Lorg/json/JSONException;
    .restart local v0    # "data":Lorg/json/JSONObject;
    .restart local v4    # "i":I
    .restart local v6    # "names":Lorg/json/JSONArray;
    .restart local v8    # "newJsonObject":Lorg/json/JSONObject;
    :cond_2
    :try_start_1
    invoke-virtual {v6, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 427
    .local v5, "key":Ljava/lang/String;
    const/4 v9, 0x0

    .line 428
    .local v9, "value":Ljava/lang/Object;
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 429
    instance-of v10, v9, Lorg/json/JSONObject;

    if-eqz v10, :cond_4

    .line 430
    check-cast v9, Lorg/json/JSONObject;

    .end local v9    # "value":Ljava/lang/Object;
    const/4 v10, 0x1

    invoke-static {v9, v10}, Lcom/facebook/share/internal/ShareInternalUtility;->removeNamespacesFromOGJsonObject(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;

    move-result-object v9

    .line 435
    :cond_3
    :goto_2
    invoke-static {v5}, Lcom/facebook/share/internal/ShareInternalUtility;->getFieldNameAndNamespaceFromFullName(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    .line 437
    .local v3, "fieldNameAndNamespace":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    iget-object v7, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .line 438
    .local v7, "namespace":Ljava/lang/String;
    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .line 440
    .local v2, "fieldName":Ljava/lang/String;
    if-eqz p1, :cond_8

    .line 441
    if-eqz v7, :cond_5

    const-string v10, "fbsdk"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 442
    invoke-virtual {v8, v5, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 425
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 431
    .end local v2    # "fieldName":Ljava/lang/String;
    .end local v3    # "fieldNameAndNamespace":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v7    # "namespace":Ljava/lang/String;
    .restart local v9    # "value":Ljava/lang/Object;
    :cond_4
    instance-of v10, v9, Lorg/json/JSONArray;

    if-eqz v10, :cond_3

    .line 432
    check-cast v9, Lorg/json/JSONArray;

    .end local v9    # "value":Ljava/lang/Object;
    const/4 v10, 0x1

    invoke-static {v9, v10}, Lcom/facebook/share/internal/ShareInternalUtility;->removeNamespacesFromOGJsonArray(Lorg/json/JSONArray;Z)Lorg/json/JSONArray;

    move-result-object v9

    .local v9, "value":Lorg/json/JSONArray;
    goto :goto_2

    .line 443
    .end local v9    # "value":Lorg/json/JSONArray;
    .restart local v2    # "fieldName":Ljava/lang/String;
    .restart local v3    # "fieldNameAndNamespace":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v7    # "namespace":Ljava/lang/String;
    :cond_5
    if-eqz v7, :cond_6

    const-string v10, "og"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 444
    :cond_6
    invoke-virtual {v8, v2, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 446
    :cond_7
    invoke-virtual {v0, v2, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 448
    :cond_8
    if-eqz v7, :cond_9

    const-string v10, "fb"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    .line 449
    invoke-virtual {v8, v5, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 451
    :cond_9
    invoke-virtual {v8, v2, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method

.method public static toJSONObjectForCall(Ljava/util/UUID;Lcom/facebook/share/model/ShareOpenGraphContent;)Lorg/json/JSONObject;
    .locals 9
    .param p0, "callId"    # Ljava/util/UUID;
    .param p1, "content"    # Lcom/facebook/share/model/ShareOpenGraphContent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 316
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getAction()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v0

    .line 317
    .local v0, "action":Lcom/facebook/share/model/ShareOpenGraphAction;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .local v2, "attachments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;>;"
    new-instance v7, Lcom/facebook/share/internal/ShareInternalUtility$6;

    invoke-direct {v7, p0, v2}, Lcom/facebook/share/internal/ShareInternalUtility$6;-><init>(Ljava/util/UUID;Ljava/util/ArrayList;)V

    .line 318
    invoke-static {v0, v7}, Lcom/facebook/share/internal/OpenGraphJSONUtility;->toJSONObject(Lcom/facebook/share/model/ShareOpenGraphAction;Lcom/facebook/share/internal/OpenGraphJSONUtility$PhotoJSONProcessor;)Lorg/json/JSONObject;

    move-result-object v1

    .line 347
    .local v1, "actionJSON":Lorg/json/JSONObject;
    invoke-static {v2}, Lcom/facebook/internal/NativeAppCallAttachmentStore;->addAttachments(Ljava/util/Collection;)V

    .line 349
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getPlaceId()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 350
    const-string v7, "place"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 354
    .local v6, "placeTag":Ljava/lang/String;
    invoke-static {v6}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 355
    const-string v7, "place"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getPlaceId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 359
    .end local v6    # "placeTag":Ljava/lang/String;
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getPeopleIds()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 360
    const-string v7, "tags"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 361
    .local v5, "peopleTags":Lorg/json/JSONArray;
    if-nez v5, :cond_2

    .line 362
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 365
    .local v4, "peopleIdSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getPeopleIds()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_3

    .line 368
    const-string v7, "tags"

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 371
    .end local v4    # "peopleIdSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .end local v5    # "peopleTags":Lorg/json/JSONArray;
    :cond_1
    return-object v1

    .line 363
    .restart local v5    # "peopleTags":Lorg/json/JSONArray;
    :cond_2
    invoke-static {v5}, Lcom/facebook/internal/Utility;->jsonArrayToSet(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object v4

    goto :goto_0

    .line 365
    .restart local v4    # "peopleIdSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 366
    .local v3, "peopleId":Ljava/lang/String;
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public static toJSONObjectForWeb(Lcom/facebook/share/model/ShareOpenGraphContent;)Lorg/json/JSONObject;
    .locals 2
    .param p0, "shareOpenGraphContent"    # Lcom/facebook/share/model/ShareOpenGraphContent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 377
    invoke-virtual {p0}, Lcom/facebook/share/model/ShareOpenGraphContent;->getAction()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v0

    .line 381
    .local v0, "action":Lcom/facebook/share/model/ShareOpenGraphAction;
    new-instance v1, Lcom/facebook/share/internal/ShareInternalUtility$7;

    invoke-direct {v1}, Lcom/facebook/share/internal/ShareInternalUtility$7;-><init>()V

    .line 379
    invoke-static {v0, v1}, Lcom/facebook/share/internal/OpenGraphJSONUtility;->toJSONObject(Lcom/facebook/share/model/ShareOpenGraphAction;Lcom/facebook/share/internal/OpenGraphJSONUtility$PhotoJSONProcessor;)Lorg/json/JSONObject;

    move-result-object v1

    return-object v1
.end method
