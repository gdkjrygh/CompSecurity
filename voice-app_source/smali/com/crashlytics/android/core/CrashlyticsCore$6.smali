.class Lcom/crashlytics/android/core/CrashlyticsCore$6;
.super Ljava/lang/Object;
.source "CrashlyticsCore.java"

# interfaces
.implements Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/CrashlyticsCore;->canSendWithUserApproval()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/core/CrashlyticsCore;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/core/CrashlyticsCore;)V
    .locals 0

    .prologue
    .line 908
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashlyticsCore$6;->this$0:Lcom/crashlytics/android/core/CrashlyticsCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public usingSettings(Lio/fabric/sdk/android/services/settings/SettingsData;)Ljava/lang/Boolean;
    .locals 4
    .param p1, "settingsData"    # Lio/fabric/sdk/android/services/settings/SettingsData;

    .prologue
    .line 911
    const/4 v1, 0x1

    .line 913
    .local v1, "send":Z
    iget-object v2, p0, Lcom/crashlytics/android/core/CrashlyticsCore$6;->this$0:Lcom/crashlytics/android/core/CrashlyticsCore;

    invoke-virtual {v2}, Lcom/crashlytics/android/core/CrashlyticsCore;->getFabric()Lio/fabric/sdk/android/Fabric;

    move-result-object v2

    invoke-virtual {v2}, Lio/fabric/sdk/android/Fabric;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    .line 915
    .local v0, "activity":Landroid/app/Activity;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/crashlytics/android/core/CrashlyticsCore$6;->this$0:Lcom/crashlytics/android/core/CrashlyticsCore;

    invoke-virtual {v2}, Lcom/crashlytics/android/core/CrashlyticsCore;->shouldPromptUserBeforeSendingCrashReports()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 917
    iget-object v2, p0, Lcom/crashlytics/android/core/CrashlyticsCore$6;->this$0:Lcom/crashlytics/android/core/CrashlyticsCore;

    iget-object v3, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    # invokes: Lcom/crashlytics/android/core/CrashlyticsCore;->getSendDecisionFromUser(Landroid/app/Activity;Lio/fabric/sdk/android/services/settings/PromptSettingsData;)Z
    invoke-static {v2, v0, v3}, Lcom/crashlytics/android/core/CrashlyticsCore;->access$100(Lcom/crashlytics/android/core/CrashlyticsCore;Landroid/app/Activity;Lio/fabric/sdk/android/services/settings/PromptSettingsData;)Z

    move-result v1

    .line 920
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    return-object v2
.end method

.method public bridge synthetic usingSettings(Lio/fabric/sdk/android/services/settings/SettingsData;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lio/fabric/sdk/android/services/settings/SettingsData;

    .prologue
    .line 908
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CrashlyticsCore$6;->usingSettings(Lio/fabric/sdk/android/services/settings/SettingsData;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
