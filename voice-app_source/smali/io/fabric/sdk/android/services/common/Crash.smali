.class public abstract Lio/fabric/sdk/android/services/common/Crash;
.super Ljava/lang/Object;
.source "Crash.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/common/Crash$FatalException;,
        Lio/fabric/sdk/android/services/common/Crash$LoggedException;
    }
.end annotation


# instance fields
.field private final sessionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "sessionId"    # Ljava/lang/String;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/Crash;->sessionId:Ljava/lang/String;

    .line 26
    return-void
.end method


# virtual methods
.method public getSessionId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/Crash;->sessionId:Ljava/lang/String;

    return-object v0
.end method
