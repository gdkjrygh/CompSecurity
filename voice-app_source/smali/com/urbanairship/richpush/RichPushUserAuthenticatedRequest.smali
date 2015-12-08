.class public Lcom/urbanairship/richpush/RichPushUserAuthenticatedRequest;
.super Lcom/urbanairship/restclient/Request;
.source "RichPushUserAuthenticatedRequest.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "httpMethod"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/urbanairship/restclient/Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    invoke-static {}, Lcom/urbanairship/richpush/RichPushManager;->shared()Lcom/urbanairship/richpush/RichPushManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/richpush/RichPushManager;->getRichPushUser()Lcom/urbanairship/richpush/RichPushUser;

    move-result-object v0

    .line 47
    .local v0, "user":Lcom/urbanairship/richpush/RichPushUser;
    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUser;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/urbanairship/richpush/RichPushUser;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/urbanairship/richpush/RichPushUserAuthenticatedRequest;->setPreemptiveAuth(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    return-void
.end method
