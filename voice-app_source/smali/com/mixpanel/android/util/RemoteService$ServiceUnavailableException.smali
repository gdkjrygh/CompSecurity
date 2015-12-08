.class public Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;
.super Ljava/lang/Exception;
.source "RemoteService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/util/RemoteService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ServiceUnavailableException"
.end annotation


# instance fields
.field private final mRetryAfter:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "strRetryAfter"    # Ljava/lang/String;

    .prologue
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 21
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 25
    .local v1, "retry":I
    :goto_0
    iput v1, p0, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;->mRetryAfter:I

    .line 26
    return-void

    .line 22
    .end local v1    # "retry":I
    :catch_0
    move-exception v0

    .line 23
    .local v0, "e":Ljava/lang/NumberFormatException;
    const/4 v1, 0x0

    .restart local v1    # "retry":I
    goto :goto_0
.end method


# virtual methods
.method public getRetryAfter()I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/mixpanel/android/util/RemoteService$ServiceUnavailableException;->mRetryAfter:I

    return v0
.end method
