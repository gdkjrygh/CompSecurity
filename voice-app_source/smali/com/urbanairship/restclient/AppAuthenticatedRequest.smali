.class public Lcom/urbanairship/restclient/AppAuthenticatedRequest;
.super Lcom/urbanairship/restclient/Request;
.source "AppAuthenticatedRequest.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "httpMethod"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Lcom/urbanairship/restclient/Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v3

    invoke-virtual {v3}, Lcom/urbanairship/UAirship;->getAirshipConfigOptions()Lcom/urbanairship/AirshipConfigOptions;

    move-result-object v1

    .line 41
    .local v1, "options":Lcom/urbanairship/AirshipConfigOptions;
    invoke-virtual {v1}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v0

    .line 42
    .local v0, "key":Ljava/lang/String;
    invoke-virtual {v1}, Lcom/urbanairship/AirshipConfigOptions;->getAppSecret()Ljava/lang/String;

    move-result-object v2

    .line 44
    .local v2, "secret":Ljava/lang/String;
    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 45
    invoke-virtual {p0, v0, v2}, Lcom/urbanairship/restclient/AppAuthenticatedRequest;->setPreemptiveAuth(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :cond_0
    return-void
.end method
