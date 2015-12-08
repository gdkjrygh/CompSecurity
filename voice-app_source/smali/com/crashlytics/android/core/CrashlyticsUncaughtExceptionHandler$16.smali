.class Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$16;
.super Ljava/lang/Object;
.source "CrashlyticsUncaughtExceptionHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->sendSessionReports()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;

.field final synthetic val$toSend:Ljava/io/File;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 1270
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$16;->this$0:Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;

    iput-object p2, p0, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$16;->val$toSend:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 1273
    iget-object v2, p0, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$16;->this$0:Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;

    # getter for: Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->crashlyticsCore:Lcom/crashlytics/android/core/CrashlyticsCore;
    invoke-static {v2}, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->access$900(Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;)Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/crashlytics/android/core/CrashlyticsCore;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->canTryConnection(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1274
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "CrashlyticsCore"

    const-string v4, "Attempting to send crash report at time of crash..."

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1276
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v2

    invoke-virtual {v2}, Lio/fabric/sdk/android/services/settings/Settings;->awaitSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v1

    .line 1278
    .local v1, "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    iget-object v2, p0, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$16;->this$0:Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;

    # getter for: Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->crashlyticsCore:Lcom/crashlytics/android/core/CrashlyticsCore;
    invoke-static {v2}, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->access$900(Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;)Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/crashlytics/android/core/CrashlyticsCore;->getCreateReportSpiCall(Lio/fabric/sdk/android/services/settings/SettingsData;)Lcom/crashlytics/android/core/CreateReportSpiCall;

    move-result-object v0

    .line 1283
    .local v0, "call":Lcom/crashlytics/android/core/CreateReportSpiCall;
    if-eqz v0, :cond_0

    .line 1284
    new-instance v2, Lcom/crashlytics/android/core/ReportUploader;

    invoke-direct {v2, v0}, Lcom/crashlytics/android/core/ReportUploader;-><init>(Lcom/crashlytics/android/core/CreateReportSpiCall;)V

    new-instance v3, Lcom/crashlytics/android/core/SessionReport;

    iget-object v4, p0, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$16;->val$toSend:Ljava/io/File;

    # getter for: Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->SEND_AT_CRASHTIME_HEADER:Ljava/util/Map;
    invoke-static {}, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->access$1400()Ljava/util/Map;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/crashlytics/android/core/SessionReport;-><init>(Ljava/io/File;Ljava/util/Map;)V

    invoke-virtual {v2, v3}, Lcom/crashlytics/android/core/ReportUploader;->forceUpload(Lcom/crashlytics/android/core/Report;)Z

    .line 1288
    .end local v0    # "call":Lcom/crashlytics/android/core/CreateReportSpiCall;
    .end local v1    # "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    :cond_0
    return-void
.end method
