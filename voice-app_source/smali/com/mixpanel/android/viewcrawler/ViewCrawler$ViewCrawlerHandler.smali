.class Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
.super Landroid/os/Handler;
.source "ViewCrawler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewCrawler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewCrawlerHandler"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mEditorAssetUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mEditorChanges:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

.field private final mEditorEventBindings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

.field private final mPersistentChanges:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;",
            ">;"
        }
    .end annotation
.end field

.field private final mPersistentEventBindings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

.field private final mSeenExperiments:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private mSnapshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

.field private final mStartLock:Ljava/util/concurrent/locks/Lock;

.field private final mToken:Ljava/lang/String;

.field final synthetic this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;)V
    .locals 4
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "token"    # Ljava/lang/String;
    .param p4, "looper"    # Landroid/os/Looper;
    .param p5, "layoutErrorListener"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;

    .prologue
    .line 272
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    .line 273
    invoke-direct {p0, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 274
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mContext:Landroid/content/Context;

    .line 275
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mToken:Ljava/lang/String;

    .line 276
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSnapshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    .line 278
    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {p1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$2(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getResourcePackageName()Ljava/lang/String;

    move-result-object v1

    .line 279
    .local v1, "resourcePackage":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 280
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 283
    :cond_0
    new-instance v0, Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;

    invoke-direct {v0, v1, p2}, Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 285
    .local v0, "resourceIds":Lcom/mixpanel/android/mpmetrics/ResourceIds;
    new-instance v2, Lcom/mixpanel/android/viewcrawler/ImageStore;

    invoke-direct {v2, p2}, Lcom/mixpanel/android/viewcrawler/ImageStore;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

    .line 286
    new-instance v2, Lcom/mixpanel/android/viewcrawler/EditProtocol;

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

    invoke-direct {v2, v0, v3, p5}, Lcom/mixpanel/android/viewcrawler/EditProtocol;-><init>(Lcom/mixpanel/android/mpmetrics/ResourceIds;Lcom/mixpanel/android/viewcrawler/ImageStore;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;)V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    .line 287
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorChanges:Ljava/util/Map;

    .line 288
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorAssetUrls:Ljava/util/List;

    .line 289
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorEventBindings:Ljava/util/List;

    .line 290
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentChanges:Ljava/util/List;

    .line 291
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentEventBindings:Ljava/util/List;

    .line 292
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSeenExperiments:Ljava/util/Set;

    .line 293
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mStartLock:Ljava/util/concurrent/locks/Lock;

    .line 294
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mStartLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 295
    return-void
.end method

.method private connectToEditor()V
    .locals 8

    .prologue
    .line 452
    sget-boolean v3, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v3, :cond_0

    .line 453
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "connecting to editor"

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 456
    :cond_0
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    invoke-virtual {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->isValid()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 457
    sget-boolean v3, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v3, :cond_1

    .line 458
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "There is already a valid connection to an events editor."

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 481
    :cond_1
    :goto_0
    return-void

    .line 463
    :cond_2
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$4(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    if-nez v3, :cond_3

    .line 464
    sget-boolean v3, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v3, :cond_1

    .line 465
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "SSL is not available on this device, no connection will be attempted to the events editor."

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 470
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mContext:Landroid/content/Context;

    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getEditorUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mToken:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 472
    .local v2, "url":Ljava/lang/String;
    :try_start_0
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
    invoke-static {v3}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$4(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    .line 473
    .local v1, "sslSocket":Ljava/net/Socket;
    new-instance v3, Lcom/mixpanel/android/viewcrawler/EditorConnection;

    new-instance v4, Ljava/net/URI;

    invoke-direct {v4, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    new-instance v5, Lcom/mixpanel/android/viewcrawler/ViewCrawler$Editor;

    iget-object v6, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$Editor;-><init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;Lcom/mixpanel/android/viewcrawler/ViewCrawler$Editor;)V

    invoke-direct {v3, v4, v5, v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection;-><init>(Ljava/net/URI;Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;Ljava/net/Socket;)V

    iput-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 474
    .end local v1    # "sslSocket":Ljava/net/Socket;
    :catch_0
    move-exception v0

    .line 475
    .local v0, "e":Ljava/net/URISyntaxException;
    const-string v3, "MixpanelAPI.ViewCrawler"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error parsing URI "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " for editor websocket"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 476
    .end local v0    # "e":Ljava/net/URISyntaxException;
    :catch_1
    move-exception v0

    .line 477
    .local v0, "e":Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;
    const-string v3, "MixpanelAPI.ViewCrawler"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error connecting to URI "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 478
    .end local v0    # "e":Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;
    :catch_2
    move-exception v0

    .line 479
    .local v0, "e":Ljava/io/IOException;
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "Can\'t create SSL Socket to connect to editor service"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0
.end method

.method private getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 3

    .prologue
    .line 933
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mixpanel.viewcrawler.changes"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mToken:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 934
    .local v0, "sharedPrefsName":Ljava/lang/String;
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    return-object v1
.end method

.method private handleEditorBindingsCleared(Lorg/json/JSONObject;)V
    .locals 7
    .param p1, "clearMessage"    # Lorg/json/JSONObject;

    .prologue
    .line 730
    :try_start_0
    const-string v5, "payload"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 731
    .local v4, "payload":Lorg/json/JSONObject;
    const-string v5, "actions"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 734
    .local v0, "actions":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    if-lt v3, v5, :cond_0

    .line 742
    .end local v0    # "actions":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v4    # "payload":Lorg/json/JSONObject;
    :goto_1
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->updateEditState()V

    .line 743
    return-void

    .line 735
    .restart local v0    # "actions":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    .restart local v4    # "payload":Lorg/json/JSONObject;
    :cond_0
    :try_start_1
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 736
    .local v1, "changeId":Ljava/lang/String;
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorChanges:Ljava/util/Map;

    invoke-interface {v5, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 734
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 738
    .end local v0    # "actions":Lorg/json/JSONArray;
    .end local v1    # "changeId":Ljava/lang/String;
    .end local v3    # "i":I
    .end local v4    # "payload":Lorg/json/JSONObject;
    :catch_0
    move-exception v2

    .line 739
    .local v2, "e":Lorg/json/JSONException;
    const-string v5, "MixpanelAPI.ViewCrawler"

    const-string v6, "Bad clear request received"

    invoke-static {v5, v6, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private handleEditorBindingsReceived(Lorg/json/JSONObject;)V
    .locals 10
    .param p1, "message"    # Lorg/json/JSONObject;

    .prologue
    .line 791
    :try_start_0
    const-string v7, "payload"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 792
    .local v5, "payload":Lorg/json/JSONObject;
    const-string v7, "events"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 798
    .local v2, "eventBindings":Lorg/json/JSONArray;
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 800
    .local v3, "eventCount":I
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorEventBindings:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 801
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    if-lt v4, v3, :cond_0

    .line 811
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->updateEditState()V

    .line 812
    .end local v2    # "eventBindings":Lorg/json/JSONArray;
    .end local v3    # "eventCount":I
    .end local v4    # "i":I
    .end local v5    # "payload":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 793
    :catch_0
    move-exception v0

    .line 794
    .local v0, "e":Lorg/json/JSONException;
    const-string v7, "MixpanelAPI.ViewCrawler"

    const-string v8, "Bad event bindings received"

    invoke-static {v7, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 803
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v2    # "eventBindings":Lorg/json/JSONArray;
    .restart local v3    # "eventCount":I
    .restart local v4    # "i":I
    .restart local v5    # "payload":Lorg/json/JSONObject;
    :cond_0
    :try_start_1
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 804
    .local v1, "event":Lorg/json/JSONObject;
    const-string v7, "target_activity"

    invoke-static {v1, v7}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 805
    .local v6, "targetActivity":Ljava/lang/String;
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorEventBindings:Ljava/util/List;

    new-instance v8, Landroid/util/Pair;

    invoke-direct {v8, v6, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 801
    .end local v1    # "event":Lorg/json/JSONObject;
    .end local v6    # "targetActivity":Ljava/lang/String;
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 806
    :catch_1
    move-exception v0

    .line 807
    .restart local v0    # "e":Lorg/json/JSONException;
    const-string v7, "MixpanelAPI.ViewCrawler"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Bad event binding received from editor in "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method

.method private handleEditorChangeReceived(Lorg/json/JSONObject;)V
    .locals 9
    .param p1, "changeMessage"    # Lorg/json/JSONObject;

    .prologue
    .line 709
    :try_start_0
    const-string v7, "payload"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 710
    .local v5, "payload":Lorg/json/JSONObject;
    const-string v7, "actions"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 712
    .local v0, "actions":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lt v3, v7, :cond_0

    .line 719
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->updateEditState()V

    .line 723
    .end local v0    # "actions":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v5    # "payload":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 713
    .restart local v0    # "actions":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    .restart local v5    # "payload":Lorg/json/JSONObject;
    :cond_0
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 714
    .local v1, "change":Lorg/json/JSONObject;
    const-string v7, "target_activity"

    invoke-static {v1, v7}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 715
    .local v6, "targetActivity":Ljava/lang/String;
    const-string v7, "name"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 716
    .local v4, "name":Ljava/lang/String;
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorChanges:Ljava/util/Map;

    new-instance v8, Landroid/util/Pair;

    invoke-direct {v8, v6, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 712
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 720
    .end local v0    # "actions":Lorg/json/JSONArray;
    .end local v1    # "change":Lorg/json/JSONObject;
    .end local v3    # "i":I
    .end local v4    # "name":Ljava/lang/String;
    .end local v5    # "payload":Lorg/json/JSONObject;
    .end local v6    # "targetActivity":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 721
    .local v2, "e":Lorg/json/JSONException;
    const-string v7, "MixpanelAPI.ViewCrawler"

    const-string v8, "Bad change request received"

    invoke-static {v7, v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private handleEditorClosed()V
    .locals 3

    .prologue
    .line 818
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorChanges:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 819
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorEventBindings:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 822
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSnapshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    .line 824
    sget-boolean v1, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v1, :cond_0

    .line 825
    const-string v1, "MixpanelAPI.ViewCrawler"

    const-string v2, "Editor closed- freeing snapshot"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 828
    :cond_0
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->updateEditState()V

    .line 829
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorAssetUrls:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 832
    return-void

    .line 829
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 830
    .local v0, "assetUrl":Ljava/lang/String;
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mImageStore:Lcom/mixpanel/android/viewcrawler/ImageStore;

    invoke-virtual {v2, v0}, Lcom/mixpanel/android/viewcrawler/ImageStore;->deleteStorage(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private handleEditorTweaksReceived(Lorg/json/JSONObject;)V
    .locals 10
    .param p1, "tweaksMessage"    # Lorg/json/JSONObject;

    .prologue
    .line 747
    :try_start_0
    const-string v7, "payload"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 748
    .local v3, "payload":Lorg/json/JSONObject;
    const-string v7, "tweaks"

    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 749
    .local v6, "tweaks":Lorg/json/JSONArray;
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 750
    .local v2, "length":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v2, :cond_0

    .line 760
    .end local v1    # "i":I
    .end local v2    # "length":I
    .end local v3    # "payload":Lorg/json/JSONObject;
    .end local v6    # "tweaks":Lorg/json/JSONArray;
    :goto_1
    return-void

    .line 751
    .restart local v1    # "i":I
    .restart local v2    # "length":I
    .restart local v3    # "payload":Lorg/json/JSONObject;
    .restart local v6    # "tweaks":Lorg/json/JSONArray;
    :cond_0
    invoke-virtual {v6, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 752
    .local v4, "tweakDesc":Lorg/json/JSONObject;
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    invoke-virtual {v7, v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readTweak(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v5

    .line 753
    .local v5, "tweakValue":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    iget-object v7, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;
    invoke-static {v7}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$3(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/Tweaks;

    move-result-object v8

    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v9, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v8, v7, v9}, Lcom/mixpanel/android/mpmetrics/Tweaks;->set(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 750
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 755
    .end local v1    # "i":I
    .end local v2    # "length":I
    .end local v3    # "payload":Lorg/json/JSONObject;
    .end local v4    # "tweakDesc":Lorg/json/JSONObject;
    .end local v5    # "tweakValue":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v6    # "tweaks":Lorg/json/JSONArray;
    :catch_0
    move-exception v0

    .line 756
    .local v0, "e":Lorg/json/JSONException;
    const-string v7, "MixpanelAPI.ViewCrawler"

    const-string v8, "Bad tweaks received"

    invoke-static {v7, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 757
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v0

    .line 758
    .local v0, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v7, "MixpanelAPI.ViewCrawler"

    const-string v8, "Strange tweaks received"

    invoke-static {v7, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private handleEventBindingsReceived(Lorg/json/JSONArray;)V
    .locals 4
    .param p1, "eventBindings"    # Lorg/json/JSONArray;

    .prologue
    .line 778
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 779
    .local v1, "preferences":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 780
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v2, "mixpanel.viewcrawler.bindings"

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 781
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 782
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->initializeChanges()V

    .line 783
    return-void
.end method

.method private handleVariantsReceived(Lorg/json/JSONArray;)V
    .locals 4
    .param p1, "variants"    # Lorg/json/JSONArray;

    .prologue
    .line 766
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 767
    .local v1, "preferences":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 768
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v2, "mixpanel.viewcrawler.changes"

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 769
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 771
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->initializeChanges()V

    .line 772
    return-void
.end method

.method private initializeChanges()V
    .locals 29

    .prologue
    .line 388
    invoke-direct/range {p0 .. p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v13

    .line 389
    .local v13, "preferences":Landroid/content/SharedPreferences;
    const-string v26, "mixpanel.viewcrawler.changes"

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-interface {v13, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 390
    .local v15, "storedChanges":Ljava/lang/String;
    const-string v26, "mixpanel.viewcrawler.bindings"

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-interface {v13, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 392
    .local v14, "storedBindings":Ljava/lang/String;
    if-eqz v15, :cond_0

    .line 393
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentChanges:Ljava/util/List;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Ljava/util/List;->clear()V

    .line 395
    new-instance v24, Lorg/json/JSONArray;

    move-object/from16 v0, v24

    invoke-direct {v0, v15}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 396
    .local v24, "variants":Lorg/json/JSONArray;
    invoke-virtual/range {v24 .. v24}, Lorg/json/JSONArray;->length()I

    move-result v25

    .line 397
    .local v25, "variantsLength":I
    const/16 v23, 0x0

    .local v23, "variantIx":I
    :goto_0
    move/from16 v0, v23

    move/from16 v1, v25

    if-lt v0, v1, :cond_2

    .line 421
    .end local v23    # "variantIx":I
    .end local v24    # "variants":Lorg/json/JSONArray;
    .end local v25    # "variantsLength":I
    :cond_0
    if-eqz v14, :cond_1

    .line 422
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v14}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 424
    .local v4, "bindings":Lorg/json/JSONArray;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentEventBindings:Ljava/util/List;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Ljava/util/List;->clear()V

    .line 425
    const/4 v10, 0x0

    .local v10, "i":I
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v26

    move/from16 v0, v26

    if-lt v10, v0, :cond_5

    .line 445
    .end local v4    # "bindings":Lorg/json/JSONArray;
    .end local v10    # "i":I
    :cond_1
    :goto_2
    invoke-direct/range {p0 .. p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->updateEditState()V

    .line 446
    return-void

    .line 398
    .restart local v23    # "variantIx":I
    .restart local v24    # "variants":Lorg/json/JSONArray;
    .restart local v25    # "variantsLength":I
    :cond_2
    :try_start_1
    move-object/from16 v0, v24

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 399
    .local v12, "nextVariant":Lorg/json/JSONObject;
    const-string v26, "id"

    move-object/from16 v0, v26

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 400
    .local v22, "variantIdPart":I
    const-string v26, "experiment_id"

    move-object/from16 v0, v26

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 401
    .local v9, "experimentIdPart":I
    new-instance v21, Landroid/util/Pair;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v27

    move-object/from16 v0, v21

    move-object/from16 v1, v26

    move-object/from16 v2, v27

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 403
    .local v21, "variantId":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    const-string v26, "actions"

    move-object/from16 v0, v26

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 404
    .local v3, "actions":Lorg/json/JSONArray;
    const/4 v10, 0x0

    .restart local v10    # "i":I
    :goto_3
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v26

    move/from16 v0, v26

    if-lt v10, v0, :cond_3

    .line 411
    const-string v26, "tweaks"

    move-object/from16 v0, v26

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v19

    .line 412
    .local v19, "tweaks":Lorg/json/JSONArray;
    invoke-virtual/range {v19 .. v19}, Lorg/json/JSONArray;->length()I

    move-result v11

    .line 413
    .local v11, "length":I
    const/4 v10, 0x0

    :goto_4
    if-lt v10, v11, :cond_4

    .line 397
    add-int/lit8 v23, v23, 0x1

    goto :goto_0

    .line 405
    .end local v11    # "length":I
    .end local v19    # "tweaks":Lorg/json/JSONArray;
    :cond_3
    invoke-virtual {v3, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 406
    .local v5, "change":Lorg/json/JSONObject;
    const-string v26, "target_activity"

    move-object/from16 v0, v26

    invoke-static {v5, v0}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 407
    .local v16, "targetActivity":Ljava/lang/String;
    new-instance v20, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;

    move-object/from16 v0, v20

    move-object/from16 v1, v16

    move-object/from16 v2, v21

    invoke-direct {v0, v1, v5, v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/util/Pair;)V

    .line 408
    .local v20, "variantChange":Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentChanges:Ljava/util/List;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 414
    .end local v5    # "change":Lorg/json/JSONObject;
    .end local v16    # "targetActivity":Ljava/lang/String;
    .end local v20    # "variantChange":Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;
    .restart local v11    # "length":I
    .restart local v19    # "tweaks":Lorg/json/JSONArray;
    :cond_4
    move-object/from16 v0, v19

    invoke-virtual {v0, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v17

    .line 415
    .local v17, "tweakDesc":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readTweak(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v18

    .line 416
    .local v18, "tweakValue":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    move-object/from16 v26, v0

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;
    invoke-static/range {v26 .. v26}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$3(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/Tweaks;

    move-result-object v27

    move-object/from16 v0, v18

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    move-object/from16 v0, v18

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v28, v0

    move-object/from16 v0, v27

    move-object/from16 v1, v26

    move-object/from16 v2, v28

    invoke-virtual {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/Tweaks;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 413
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 426
    .end local v3    # "actions":Lorg/json/JSONArray;
    .end local v9    # "experimentIdPart":I
    .end local v11    # "length":I
    .end local v12    # "nextVariant":Lorg/json/JSONObject;
    .end local v17    # "tweakDesc":Lorg/json/JSONObject;
    .end local v18    # "tweakValue":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v19    # "tweaks":Lorg/json/JSONArray;
    .end local v21    # "variantId":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    .end local v22    # "variantIdPart":I
    .end local v23    # "variantIx":I
    .end local v24    # "variants":Lorg/json/JSONArray;
    .end local v25    # "variantsLength":I
    .restart local v4    # "bindings":Lorg/json/JSONArray;
    :cond_5
    invoke-virtual {v4, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 427
    .local v8, "event":Lorg/json/JSONObject;
    const-string v26, "target_activity"

    move-object/from16 v0, v26

    invoke-static {v8, v0}, Lcom/mixpanel/android/util/JSONUtils;->optionalStringKey(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 428
    .restart local v16    # "targetActivity":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentEventBindings:Ljava/util/List;

    move-object/from16 v26, v0

    new-instance v27, Landroid/util/Pair;

    move-object/from16 v0, v27

    move-object/from16 v1, v16

    invoke-direct {v0, v1, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface/range {v26 .. v27}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 425
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 431
    .end local v4    # "bindings":Lorg/json/JSONArray;
    .end local v8    # "event":Lorg/json/JSONObject;
    .end local v10    # "i":I
    .end local v16    # "targetActivity":Ljava/lang/String;
    :catch_0
    move-exception v6

    .line 432
    .local v6, "e":Lorg/json/JSONException;
    const-string v26, "MixpanelAPI.ViewCrawler"

    const-string v27, "JSON error when initializing saved changes, clearing persistent memory"

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-static {v0, v1, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 433
    invoke-interface {v13}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    .line 434
    .local v7, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v26, "mixpanel.viewcrawler.changes"

    move-object/from16 v0, v26

    invoke-interface {v7, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 435
    const-string v26, "mixpanel.viewcrawler.bindings"

    move-object/from16 v0, v26

    invoke-interface {v7, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 436
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_2

    .line 437
    .end local v6    # "e":Lorg/json/JSONException;
    .end local v7    # "editor":Landroid/content/SharedPreferences$Editor;
    :catch_1
    move-exception v6

    .line 438
    .local v6, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v26, "MixpanelAPI.ViewCrawler"

    const-string v27, "Bad instructions in saved changes, clearing persistent memory"

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-static {v0, v1, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 439
    invoke-interface {v13}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    .line 440
    .restart local v7    # "editor":Landroid/content/SharedPreferences$Editor;
    const-string v26, "mixpanel.viewcrawler.changes"

    move-object/from16 v0, v26

    invoke-interface {v7, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 441
    const-string v26, "mixpanel.viewcrawler.bindings"

    move-object/from16 v0, v26

    invoke-interface {v7, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 442
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_2
.end method

.method private loadKnownChanges()V
    .locals 13

    .prologue
    .line 359
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v4

    .line 360
    .local v4, "preferences":Landroid/content/SharedPreferences;
    const-string v11, "mixpanel.viewcrawler.changes"

    const/4 v12, 0x0

    invoke-interface {v4, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 362
    .local v6, "storedChanges":Ljava/lang/String;
    if-eqz v6, :cond_0

    .line 364
    :try_start_0
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 365
    .local v9, "variants":Lorg/json/JSONArray;
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v10

    .line 366
    .local v10, "variantsLength":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-lt v3, v10, :cond_1

    .line 382
    .end local v3    # "i":I
    .end local v9    # "variants":Lorg/json/JSONArray;
    .end local v10    # "variantsLength":I
    :cond_0
    :goto_1
    return-void

    .line 367
    .restart local v3    # "i":I
    .restart local v9    # "variants":Lorg/json/JSONArray;
    .restart local v10    # "variantsLength":I
    :cond_1
    invoke-virtual {v9, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 368
    .local v7, "variant":Lorg/json/JSONObject;
    const-string v11, "id"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 369
    .local v8, "variantId":I
    const-string v11, "experiment"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 370
    .local v2, "experimentId":I
    new-instance v5, Landroid/util/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct {v5, v11, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    .local v5, "sight":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    iget-object v11, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSeenExperiments:Ljava/util/Set;

    invoke-interface {v11, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 373
    .end local v2    # "experimentId":I
    .end local v3    # "i":I
    .end local v5    # "sight":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    .end local v7    # "variant":Lorg/json/JSONObject;
    .end local v8    # "variantId":I
    .end local v9    # "variants":Lorg/json/JSONArray;
    .end local v10    # "variantsLength":I
    :catch_0
    move-exception v0

    .line 374
    .local v0, "e":Lorg/json/JSONException;
    const-string v11, "MixpanelAPI.ViewCrawler"

    const-string v12, "Malformed variants found in persistent storage, clearing all variants"

    invoke-static {v11, v12, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 375
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 376
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v11, "mixpanel.viewcrawler.changes"

    invoke-interface {v1, v11}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 377
    const-string v11, "mixpanel.viewcrawler.bindings"

    invoke-interface {v1, v11}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 378
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1
.end method

.method private sendDeviceInfo()V
    .locals 12

    .prologue
    .line 519
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    if-nez v8, :cond_0

    .line 582
    :goto_0
    return-void

    .line 523
    :cond_0
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    invoke-virtual {v8}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->getBufferedOutputStream()Ljava/io/BufferedOutputStream;

    move-result-object v4

    .line 524
    .local v4, "out":Ljava/io/OutputStream;
    new-instance v3, Landroid/util/JsonWriter;

    new-instance v8, Ljava/io/OutputStreamWriter;

    invoke-direct {v8, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v3, v8}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 527
    .local v3, "j":Landroid/util/JsonWriter;
    :try_start_0
    invoke-virtual {v3}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 528
    const-string v8, "type"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    const-string v9, "device_info_response"

    invoke-virtual {v8, v9}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 529
    const-string v8, "payload"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 530
    const-string v8, "device_type"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    const-string v9, "Android"

    invoke-virtual {v8, v9}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 531
    const-string v8, "device_name"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, "/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 532
    const-string v8, "scaled_density"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    iget-object v9, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mScaledDensity:F
    invoke-static {v9}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$5(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)F

    move-result v9

    float-to-double v10, v9

    invoke-virtual {v8, v10, v11}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 533
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mDeviceInfo:Ljava/util/Map;
    invoke-static {v8}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$6(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    .line 537
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;
    invoke-static {v8}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$3(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/Tweaks;

    move-result-object v8

    invoke-virtual {v8}, Lcom/mixpanel/android/mpmetrics/Tweaks;->getAllValues()Ljava/util/Map;

    move-result-object v6

    .line 538
    .local v6, "tweakDescs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    const-string v8, "tweaks"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 539
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    .line 570
    invoke-virtual {v3}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 571
    invoke-virtual {v3}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 572
    invoke-virtual {v3}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 577
    :try_start_1
    invoke-virtual {v3}, Landroid/util/JsonWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 578
    :catch_0
    move-exception v1

    .line 579
    .local v1, "e":Ljava/io/IOException;
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Can\'t close websocket writer"

    invoke-static {v8, v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 533
    .end local v1    # "e":Ljava/io/IOException;
    .end local v6    # "tweakDescs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    :cond_1
    :try_start_2
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 534
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v10

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v10, v8}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 573
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_1
    move-exception v1

    .line 574
    .restart local v1    # "e":Ljava/io/IOException;
    :try_start_3
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Can\'t write device_info to server"

    invoke-static {v8, v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 577
    :try_start_4
    invoke-virtual {v3}, Landroid/util/JsonWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_0

    .line 578
    :catch_2
    move-exception v1

    .line 579
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Can\'t close websocket writer"

    invoke-static {v8, v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 539
    .end local v1    # "e":Ljava/io/IOException;
    .restart local v6    # "tweakDescs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    :cond_2
    :try_start_5
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 540
    .local v5, "tweak":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;

    .line 541
    .local v0, "desc":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 542
    .local v7, "tweakName":Ljava/lang/String;
    invoke-virtual {v3}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 543
    const-string v9, "name"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v9, v7}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 544
    const-string v9, "minimum"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 545
    const-string v9, "maximum"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 546
    iget v9, v0, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->type:I

    packed-switch v9, :pswitch_data_0

    .line 566
    const-string v9, "MixpanelAPI.ViewCrawler"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Unrecognized Tweak Type "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v11, v0, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->type:I

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " encountered."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 568
    :goto_3
    invoke-virtual {v3}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_2

    .line 575
    .end local v0    # "desc":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    .end local v5    # "tweak":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    .end local v6    # "tweakDescs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    .end local v7    # "tweakName":Ljava/lang/String;
    :catchall_0
    move-exception v8

    .line 577
    :try_start_6
    invoke-virtual {v3}, Landroid/util/JsonWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 581
    :goto_4
    throw v8

    .line 548
    .restart local v0    # "desc":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    .restart local v5    # "tweak":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    .restart local v6    # "tweakDescs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    .restart local v7    # "tweakName":Ljava/lang/String;
    :pswitch_0
    :try_start_7
    const-string v9, "type"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const-string v10, "boolean"

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 549
    const-string v9, "value"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->getBooleanValue()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    goto :goto_3

    .line 552
    :pswitch_1
    const-string v9, "type"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const-string v10, "number"

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 553
    const-string v9, "encoding"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const-string v10, "d"

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 554
    const-string v9, "value"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->getNumberValue()Ljava/lang/Number;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    goto :goto_3

    .line 557
    :pswitch_2
    const-string v9, "type"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const-string v10, "number"

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 558
    const-string v9, "encoding"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const-string v10, "l"

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 559
    const-string v9, "value"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->getNumberValue()Ljava/lang/Number;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    goto :goto_3

    .line 562
    :pswitch_3
    const-string v9, "type"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    const-string v10, "string"

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 563
    const-string v9, "value"

    invoke-virtual {v3, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->getStringValue()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_3

    .line 578
    .end local v0    # "desc":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    .end local v5    # "tweak":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    .end local v6    # "tweakDescs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;>;"
    .end local v7    # "tweakName":Ljava/lang/String;
    :catch_3
    move-exception v1

    .line 579
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v9, "MixpanelAPI.ViewCrawler"

    const-string v10, "Can\'t close websocket writer"

    invoke-static {v9, v10, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_4

    .line 546
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private sendError(Ljava/lang/String;)V
    .locals 6
    .param p1, "errorMessage"    # Ljava/lang/String;

    .prologue
    .line 487
    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    if-nez v3, :cond_0

    .line 513
    :goto_0
    return-void

    .line 491
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 493
    .local v1, "errorObject":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "error_message"

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 498
    :goto_1
    new-instance v2, Ljava/io/OutputStreamWriter;

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    invoke-virtual {v3}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->getBufferedOutputStream()Ljava/io/BufferedOutputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 500
    .local v2, "writer":Ljava/io/OutputStreamWriter;
    :try_start_1
    const-string v3, "{\"type\": \"error\", "

    invoke-virtual {v2, v3}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 501
    const-string v3, "\"payload\": "

    invoke-virtual {v2, v3}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 502
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 503
    const-string v3, "}"

    invoke-virtual {v2, v3}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 508
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 509
    :catch_0
    move-exception v0

    .line 510
    .local v0, "e":Ljava/io/IOException;
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "Could not close output writer to editor"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 494
    .end local v0    # "e":Ljava/io/IOException;
    .end local v2    # "writer":Ljava/io/OutputStreamWriter;
    :catch_1
    move-exception v0

    .line 495
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "Apparently impossible JSONException"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 504
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v2    # "writer":Ljava/io/OutputStreamWriter;
    :catch_2
    move-exception v0

    .line 505
    .local v0, "e":Ljava/io/IOException;
    :try_start_3
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "Can\'t write error message to editor"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 508
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_0

    .line 509
    :catch_3
    move-exception v0

    .line 510
    const-string v3, "MixpanelAPI.ViewCrawler"

    const-string v4, "Could not close output writer to editor"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 506
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v3

    .line 508
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 512
    :goto_2
    throw v3

    .line 509
    :catch_4
    move-exception v0

    .line 510
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Could not close output writer to editor"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method

.method private sendLayoutError(Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;)V
    .locals 7
    .param p1, "exception"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;

    .prologue
    .line 679
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    if-nez v4, :cond_0

    .line 702
    :goto_0
    return-void

    .line 683
    :cond_0
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    invoke-virtual {v4}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->getBufferedOutputStream()Ljava/io/BufferedOutputStream;

    move-result-object v2

    .line 684
    .local v2, "out":Ljava/io/OutputStream;
    new-instance v3, Ljava/io/OutputStreamWriter;

    invoke-direct {v3, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 685
    .local v3, "writer":Ljava/io/OutputStreamWriter;
    new-instance v1, Landroid/util/JsonWriter;

    invoke-direct {v1, v3}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 688
    .local v1, "j":Landroid/util/JsonWriter;
    :try_start_0
    invoke-virtual {v1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 689
    const-string v4, "type"

    invoke-virtual {v1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v4

    const-string v5, "layout_error"

    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 690
    const-string v4, "exception_type"

    invoke-virtual {v1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;->getErrorType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 691
    const-string v4, "cid"

    invoke-virtual {v1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 692
    invoke-virtual {v1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 697
    :try_start_1
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 698
    :catch_0
    move-exception v0

    .line 699
    .local v0, "e":Ljava/io/IOException;
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Can\'t close writer."

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 693
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 694
    .restart local v0    # "e":Ljava/io/IOException;
    :try_start_2
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Can\'t write track_message to server"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 697
    :try_start_3
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    .line 698
    :catch_2
    move-exception v0

    .line 699
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Can\'t close writer."

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 695
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 697
    :try_start_4
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 701
    :goto_1
    throw v4

    .line 698
    :catch_3
    move-exception v0

    .line 699
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v5, "MixpanelAPI.ViewCrawler"

    const-string v6, "Can\'t close writer."

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private sendReportTrackToEditor(Ljava/lang/String;)V
    .locals 7
    .param p1, "eventName"    # Ljava/lang/String;

    .prologue
    .line 648
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    if-nez v4, :cond_0

    .line 676
    :goto_0
    return-void

    .line 652
    :cond_0
    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    invoke-virtual {v4}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->getBufferedOutputStream()Ljava/io/BufferedOutputStream;

    move-result-object v2

    .line 653
    .local v2, "out":Ljava/io/OutputStream;
    new-instance v3, Ljava/io/OutputStreamWriter;

    invoke-direct {v3, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 654
    .local v3, "writer":Ljava/io/OutputStreamWriter;
    new-instance v1, Landroid/util/JsonWriter;

    invoke-direct {v1, v3}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 657
    .local v1, "j":Landroid/util/JsonWriter;
    :try_start_0
    invoke-virtual {v1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 658
    const-string v4, "type"

    invoke-virtual {v1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v4

    const-string v5, "track_message"

    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 659
    const-string v4, "payload"

    invoke-virtual {v1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 661
    invoke-virtual {v1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 662
    const-string v4, "event_name"

    invoke-virtual {v1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 663
    invoke-virtual {v1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 665
    invoke-virtual {v1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 666
    invoke-virtual {v1}, Landroid/util/JsonWriter;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 671
    :try_start_1
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 672
    :catch_0
    move-exception v0

    .line 673
    .local v0, "e":Ljava/io/IOException;
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Can\'t close writer."

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 667
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 668
    .restart local v0    # "e":Ljava/io/IOException;
    :try_start_2
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Can\'t write track_message to server"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 671
    :try_start_3
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    .line 672
    :catch_2
    move-exception v0

    .line 673
    const-string v4, "MixpanelAPI.ViewCrawler"

    const-string v5, "Can\'t close writer."

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 669
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 671
    :try_start_4
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 675
    :goto_1
    throw v4

    .line 672
    :catch_3
    move-exception v0

    .line 673
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v5, "MixpanelAPI.ViewCrawler"

    const-string v6, "Can\'t close writer."

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private sendSnapshot(Lorg/json/JSONObject;)V
    .locals 11
    .param p1, "message"    # Lorg/json/JSONObject;

    .prologue
    .line 588
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 590
    .local v6, "startSnapshot":J
    :try_start_0
    const-string v8, "payload"

    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 591
    .local v2, "payload":Lorg/json/JSONObject;
    const-string v8, "config"

    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 592
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    invoke-virtual {v8, v2}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readSnapshotConfig(Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    move-result-object v8

    iput-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSnapshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    .line 593
    sget-boolean v8, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v8, :cond_0

    .line 594
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Initializing snapshot with configuration"

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 607
    :cond_0
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSnapshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    if-nez v8, :cond_1

    .line 608
    const-string v8, "No snapshot configuration (or a malformed snapshot configuration) was sent."

    invoke-direct {p0, v8}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendError(Ljava/lang/String;)V

    .line 609
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration."

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 642
    .end local v2    # "payload":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 597
    :catch_0
    move-exception v0

    .line 598
    .local v0, "e":Lorg/json/JSONException;
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Payload with snapshot config required with snapshot request"

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 599
    const-string v8, "Payload with snapshot config required with snapshot request"

    invoke-direct {p0, v8}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendError(Ljava/lang/String;)V

    goto :goto_0

    .line 601
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v0

    .line 602
    .local v0, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Editor sent malformed message with snapshot request"

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 603
    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v8}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendError(Ljava/lang/String;)V

    goto :goto_0

    .line 614
    .end local v0    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    .restart local v2    # "payload":Lorg/json/JSONObject;
    :cond_1
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorConnection:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    invoke-virtual {v8}, Lcom/mixpanel/android/viewcrawler/EditorConnection;->getBufferedOutputStream()Ljava/io/BufferedOutputStream;

    move-result-object v1

    .line 615
    .local v1, "out":Ljava/io/OutputStream;
    new-instance v3, Ljava/io/OutputStreamWriter;

    invoke-direct {v3, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 618
    .local v3, "writer":Ljava/io/OutputStreamWriter;
    :try_start_1
    const-string v8, "{"

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 619
    const-string v8, "\"type\": \"snapshot_response\","

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 620
    const-string v8, "\"payload\": {"

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 622
    const-string v8, "\"activities\":"

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 623
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->flush()V

    .line 624
    iget-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSnapshot:Lcom/mixpanel/android/viewcrawler/ViewSnapshot;

    iget-object v9, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;
    invoke-static {v9}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$1(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/EditState;

    move-result-object v9

    invoke-virtual {v8, v9, v1}, Lcom/mixpanel/android/viewcrawler/ViewSnapshot;->snapshots(Lcom/mixpanel/android/viewcrawler/UIThreadSet;Ljava/io/OutputStream;)V

    .line 627
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v4, v8, v6

    .line 628
    .local v4, "snapshotTime":J
    const-string v8, ",\"snapshot_time_millis\": "

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 629
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 631
    const-string v8, "}"

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 632
    const-string v8, "}"

    invoke-virtual {v3, v8}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 637
    :try_start_2
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 638
    :catch_2
    move-exception v0

    .line 639
    .local v0, "e":Ljava/io/IOException;
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Can\'t close writer."

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 633
    .end local v0    # "e":Ljava/io/IOException;
    .end local v4    # "snapshotTime":J
    :catch_3
    move-exception v0

    .line 634
    .restart local v0    # "e":Ljava/io/IOException;
    :try_start_3
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Can\'t write snapshot request to server"

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 637
    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_0

    .line 638
    :catch_4
    move-exception v0

    .line 639
    const-string v8, "MixpanelAPI.ViewCrawler"

    const-string v9, "Can\'t close writer."

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 635
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v8

    .line 637
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    .line 641
    :goto_1
    throw v8

    .line 638
    :catch_5
    move-exception v0

    .line 639
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v9, "MixpanelAPI.ViewCrawler"

    const-string v10, "Can\'t close writer."

    invoke-static {v9, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private updateEditState()V
    .locals 19

    .prologue
    .line 844
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 845
    .local v9, "newVisitors":Ljava/util/List;, "Ljava/util/List<Landroid/util/Pair<Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;>;"
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 848
    .local v12, "toTrack":Ljava/util/Set;, "Ljava/util/Set<Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;"
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentChanges:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v11

    .line 849
    .local v11, "size":I
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_0
    if-lt v7, v11, :cond_0

    .line 868
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorChanges:Ljava/util/Map;

    invoke-interface {v15}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_2

    .line 884
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentEventBindings:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v11

    .line 885
    const/4 v7, 0x0

    :goto_2
    if-lt v7, v11, :cond_3

    .line 899
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorEventBindings:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v11

    .line 900
    const/4 v7, 0x0

    :goto_3
    if-lt v7, v11, :cond_4

    .line 913
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 914
    .local v6, "editMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;>;"
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v13

    .line 915
    .local v13, "totalEdits":I
    const/4 v7, 0x0

    :goto_4
    if-lt v7, v13, :cond_5

    .line 927
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;
    invoke-static {v15}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$1(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/EditState;

    move-result-object v15

    invoke-virtual {v15, v6}, Lcom/mixpanel/android/viewcrawler/EditState;->setEdits(Ljava/util/Map;)V

    .line 928
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSeenExperiments:Ljava/util/Set;

    invoke-interface {v15, v12}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 929
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mVariantTracker:Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;
    invoke-static {v15}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$8(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;

    move-result-object v15

    invoke-virtual {v15, v12}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;->trackVariants(Ljava/util/Set;)V

    .line 930
    return-void

    .line 850
    .end local v6    # "editMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;>;"
    .end local v13    # "totalEdits":I
    :cond_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentChanges:Ljava/util/List;

    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;

    .line 852
    .local v2, "changeInfo":Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    iget-object v0, v2, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->change:Lorg/json/JSONObject;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readEdit(Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;

    move-result-object v5

    .line 853
    .local v5, "edit":Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;
    new-instance v15, Landroid/util/Pair;

    iget-object v0, v2, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->activityName:Ljava/lang/String;

    move-object/from16 v16, v0

    iget-object v0, v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;->visitor:Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    move-object/from16 v17, v0

    invoke-direct/range {v15 .. v17}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 854
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mSeenExperiments:Ljava/util/Set;

    iget-object v0, v2, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->variantId:Landroid/util/Pair;

    move-object/from16 v16, v0

    invoke-interface/range {v15 .. v16}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_1

    .line 855
    iget-object v15, v2, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->variantId:Landroid/util/Pair;

    invoke-interface {v12, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_0 .. :try_end_0} :catch_2

    .line 849
    .end local v5    # "edit":Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;
    :cond_1
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 857
    :catch_0
    move-exception v4

    .line 858
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    const-string v16, "Can\'t load assets for an edit, won\'t apply the change now"

    move-object/from16 v0, v16

    invoke-static {v15, v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    .line 859
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
    :catch_1
    move-exception v4

    .line 860
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    invoke-virtual {v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;->getMessage()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    .line 861
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    :catch_2
    move-exception v4

    .line 862
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    const-string v16, "Bad persistent change request cannot be applied."

    move-object/from16 v0, v16

    invoke-static {v15, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    .line 868
    .end local v2    # "changeInfo":Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    :cond_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    .line 870
    .local v3, "changeInfo":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lorg/json/JSONObject;>;"
    :try_start_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    move-object/from16 v17, v0

    iget-object v15, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Lorg/json/JSONObject;

    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readEdit(Lorg/json/JSONObject;)Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;

    move-result-object v5

    .line 871
    .restart local v5    # "edit":Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;
    new-instance v17, Landroid/util/Pair;

    iget-object v15, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v0, v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;->visitor:Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v0, v15, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v17

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 872
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorAssetUrls:Ljava/util/List;

    iget-object v0, v5, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;->imageUrls:Ljava/util/List;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    invoke-interface {v15, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_1 .. :try_end_1} :catch_5

    goto/16 :goto_1

    .line 873
    .end local v5    # "edit":Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;
    :catch_3
    move-exception v4

    .line 874
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    const-string v17, "Can\'t load assets for an edit, won\'t apply the change now"

    move-object/from16 v0, v17

    invoke-static {v15, v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1

    .line 875
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$CantGetEditAssetsException;
    :catch_4
    move-exception v4

    .line 876
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    invoke-virtual {v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;->getMessage()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-static {v15, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 877
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    :catch_5
    move-exception v4

    .line 878
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    const-string v17, "Bad editor change request cannot be applied."

    move-object/from16 v0, v17

    invoke-static {v15, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1

    .line 886
    .end local v3    # "changeInfo":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lorg/json/JSONObject;>;"
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    :cond_3
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mPersistentEventBindings:Ljava/util/List;

    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    .line 888
    .restart local v3    # "changeInfo":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lorg/json/JSONObject;>;"
    :try_start_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    move-object/from16 v16, v0

    iget-object v15, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    move-object/from16 v17, v0

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTracker:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
    invoke-static/range {v17 .. v17}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$7(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v15, v1}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readEventBinding(Lorg/json/JSONObject;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    move-result-object v14

    .line 889
    .local v14, "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    new-instance v16, Landroid/util/Pair;

    iget-object v15, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-direct {v0, v15, v14}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_2 .. :try_end_2} :catch_7

    .line 885
    .end local v14    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_2

    .line 890
    :catch_6
    move-exception v4

    .line 891
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    invoke-virtual {v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;->getMessage()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    .line 892
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    :catch_7
    move-exception v4

    .line 893
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    const-string v16, "Bad persistent event binding cannot be applied."

    move-object/from16 v0, v16

    invoke-static {v15, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    .line 901
    .end local v3    # "changeInfo":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lorg/json/JSONObject;>;"
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    :cond_4
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mEditorEventBindings:Ljava/util/List;

    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    .line 903
    .restart local v3    # "changeInfo":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lorg/json/JSONObject;>;"
    :try_start_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mProtocol:Lcom/mixpanel/android/viewcrawler/EditProtocol;

    move-object/from16 v16, v0

    iget-object v15, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    move-object/from16 v17, v0

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTracker:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
    invoke-static/range {v17 .. v17}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$7(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v15, v1}, Lcom/mixpanel/android/viewcrawler/EditProtocol;->readEventBinding(Lorg/json/JSONObject;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnEventListener;)Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    move-result-object v14

    .line 904
    .restart local v14    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    new-instance v16, Landroid/util/Pair;

    iget-object v15, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-direct {v0, v15, v14}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException; {:try_start_3 .. :try_end_3} :catch_9

    .line 900
    .end local v14    # "visitor":Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    :goto_7
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_3

    .line 905
    :catch_8
    move-exception v4

    .line 906
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    invoke-virtual {v4}, Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;->getMessage()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    .line 907
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$InapplicableInstructionsException;
    :catch_9
    move-exception v4

    .line 908
    .local v4, "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    const-string v15, "MixpanelAPI.ViewCrawler"

    const-string v16, "Bad editor event binding cannot be applied."

    move-object/from16 v0, v16

    invoke-static {v15, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_7

    .line 916
    .end local v3    # "changeInfo":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lorg/json/JSONObject;>;"
    .end local v4    # "e":Lcom/mixpanel/android/viewcrawler/EditProtocol$BadInstructionsException;
    .restart local v6    # "editMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;>;"
    .restart local v13    # "totalEdits":I
    :cond_5
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Pair;

    .line 918
    .local v10, "next":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    iget-object v15, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-interface {v6, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    .line 919
    iget-object v15, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-interface {v6, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 924
    .local v8, "mapElement":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    :goto_8
    iget-object v15, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 915
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_4

    .line 921
    .end local v8    # "mapElement":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    :cond_6
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 922
    .restart local v8    # "mapElement":Ljava/util/List;, "Ljava/util/List<Lcom/mixpanel/android/viewcrawler/ViewVisitor;>;"
    iget-object v15, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    invoke-interface {v6, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 303
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mStartLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 306
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .local v0, "what":I
    packed-switch v0, :pswitch_data_0

    .line 350
    :goto_0
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mStartLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 352
    return-void

    .line 309
    :pswitch_0
    :try_start_1
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->loadKnownChanges()V

    .line 310
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->initializeChanges()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 349
    .end local v0    # "what":I
    :catchall_0
    move-exception v1

    .line 350
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mStartLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 351
    throw v1

    .line 313
    .restart local v0    # "what":I
    :pswitch_1
    :try_start_2
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->connectToEditor()V

    goto :goto_0

    .line 316
    :pswitch_2
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendDeviceInfo()V

    goto :goto_0

    .line 319
    :pswitch_3
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendSnapshot(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 322
    :pswitch_4
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendReportTrackToEditor(Ljava/lang/String;)V

    goto :goto_0

    .line 325
    :pswitch_5
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendLayoutError(Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;)V

    goto :goto_0

    .line 328
    :pswitch_6
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONArray;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleVariantsReceived(Lorg/json/JSONArray;)V

    goto :goto_0

    .line 331
    :pswitch_7
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleEditorChangeReceived(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 334
    :pswitch_8
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONArray;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleEventBindingsReceived(Lorg/json/JSONArray;)V

    goto :goto_0

    .line 337
    :pswitch_9
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleEditorBindingsReceived(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 340
    :pswitch_a
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleEditorBindingsCleared(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 343
    :pswitch_b
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {p0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleEditorTweaksReceived(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 346
    :pswitch_c
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->handleEditorClosed()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_8
        :pswitch_9
        :pswitch_4
        :pswitch_c
        :pswitch_6
        :pswitch_a
        :pswitch_b
        :pswitch_5
    .end packed-switch
.end method

.method public start()V
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->mStartLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 299
    return-void
.end method
