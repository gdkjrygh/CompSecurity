.class public Lio/fabric/sdk/android/services/settings/SessionSettingsData;
.super Ljava/lang/Object;
.source "SessionSettingsData.java"


# instance fields
.field public final identifierMask:I

.field public final logBufferSize:I

.field public final maxChainedExceptionDepth:I

.field public final maxCustomExceptionEvents:I

.field public final maxCustomKeyValuePairs:I

.field public final sendSessionWithoutCrash:Z


# direct methods
.method public constructor <init>(IIIIIZ)V
    .locals 0
    .param p1, "logBufferSize"    # I
    .param p2, "maxChainedExceptionDepth"    # I
    .param p3, "maxCustomExceptionEvents"    # I
    .param p4, "maxCustomKeyValuePairs"    # I
    .param p5, "identifierMask"    # I
    .param p6, "sendSessionWithoutCrash"    # Z

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, p0, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->logBufferSize:I

    .line 37
    iput p2, p0, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->maxChainedExceptionDepth:I

    .line 38
    iput p3, p0, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->maxCustomExceptionEvents:I

    .line 39
    iput p4, p0, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->maxCustomKeyValuePairs:I

    .line 40
    iput p5, p0, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->identifierMask:I

    .line 41
    iput-boolean p6, p0, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->sendSessionWithoutCrash:Z

    .line 42
    return-void
.end method
