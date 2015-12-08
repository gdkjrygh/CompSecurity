.class Lcom/facebook/appevents/AppEventsLogger$7;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/appevents/AppEventsLogger;->buildRequestForSession(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;ZLcom/facebook/appevents/AppEventsLogger$FlushStatistics;)Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$accessTokenAppId:Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;

.field private final synthetic val$flushState:Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;

.field private final synthetic val$postRequest:Lcom/facebook/GraphRequest;

.field private final synthetic val$sessionEventsState:Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;


# direct methods
.method constructor <init>(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/GraphRequest;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$accessTokenAppId:Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;

    iput-object p2, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$postRequest:Lcom/facebook/GraphRequest;

    iput-object p3, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$sessionEventsState:Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;

    iput-object p4, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$flushState:Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;

    .line 943
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 4
    .param p1, "response"    # Lcom/facebook/GraphResponse;

    .prologue
    .line 946
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$accessTokenAppId:Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;

    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$postRequest:Lcom/facebook/GraphRequest;

    iget-object v2, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$sessionEventsState:Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;

    iget-object v3, p0, Lcom/facebook/appevents/AppEventsLogger$7;->val$flushState:Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;

    # invokes: Lcom/facebook/appevents/AppEventsLogger;->handleResponse(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/GraphRequest;Lcom/facebook/GraphResponse;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;)V
    invoke-static {v0, v1, p1, v2, v3}, Lcom/facebook/appevents/AppEventsLogger;->access$10(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/GraphRequest;Lcom/facebook/GraphResponse;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;Lcom/facebook/appevents/AppEventsLogger$FlushStatistics;)V

    .line 947
    return-void
.end method
