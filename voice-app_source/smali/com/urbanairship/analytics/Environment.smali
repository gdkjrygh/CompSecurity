.class public abstract Lcom/urbanairship/analytics/Environment;
.super Ljava/lang/Object;
.source "Environment.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getApid()Ljava/lang/String;
.end method

.method public abstract getCarrier()Ljava/lang/String;
.end method

.method public abstract getConnectionSubType()Ljava/lang/String;
.end method

.method public abstract getConnectionType()Ljava/lang/String;
.end method

.method public abstract getConversionPushId()Ljava/lang/String;
.end method

.method public abstract getLastSendId()Ljava/lang/String;
.end method

.method public abstract getLibVersion()Ljava/lang/String;
.end method

.method public abstract getNotificationTypes()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOsVersion()Ljava/lang/String;
.end method

.method public abstract getPackageVersion()Ljava/lang/String;
.end method

.method public abstract getPushTransport()Ljava/lang/String;
.end method

.method public abstract getQuietTimeInterval()[Ljava/util/Date;
.end method

.method public abstract getSessionId()Ljava/lang/String;
.end method

.method public abstract getTimeMillis()J
.end method

.method public abstract getTimezone()J
.end method

.method public abstract isAppInForeground()Z
.end method

.method public abstract isDaylightSavingsTime()Z
.end method

.method public abstract isPushEnabled()Z
.end method

.method public abstract isQuietTimeEnabled()Z
.end method
