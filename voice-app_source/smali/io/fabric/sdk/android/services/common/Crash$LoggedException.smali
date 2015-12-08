.class public Lio/fabric/sdk/android/services/common/Crash$LoggedException;
.super Lio/fabric/sdk/android/services/common/Crash;
.source "Crash.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/Crash;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LoggedException"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "sessionId"    # Ljava/lang/String;

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/common/Crash;-><init>(Ljava/lang/String;)V

    .line 35
    return-void
.end method
