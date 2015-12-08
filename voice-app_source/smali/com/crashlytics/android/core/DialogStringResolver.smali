.class Lcom/crashlytics/android/core/DialogStringResolver;
.super Ljava/lang/Object;
.source "DialogStringResolver.java"


# static fields
.field private static final PROMPT_MESSAGE_RES_NAME:Ljava/lang/String; = "com.crashlytics.CrashSubmissionPromptMessage"

.field private static final PROMPT_TITLE_RES_NAME:Ljava/lang/String; = "com.crashlytics.CrashSubmissionPromptTitle"

.field private static final SUBMISSION_ALWAYS_SEND_RES_NAME:Ljava/lang/String; = "com.crashlytics.CrashSubmissionAlwaysSendTitle"

.field private static final SUBMISSION_CANCEL_RES_NAME:Ljava/lang/String; = "com.crashlytics.CrashSubmissionCancelTitle"

.field private static final SUBMISSION_SEND_RES_NAME:Ljava/lang/String; = "com.crashlytics.CrashSubmissionSendTitle"


# instance fields
.field private final context:Landroid/content/Context;

.field private final promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/fabric/sdk/android/services/settings/PromptSettingsData;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "promptData"    # Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/crashlytics/android/core/DialogStringResolver;->context:Landroid/content/Context;

    .line 41
    iput-object p2, p0, Lcom/crashlytics/android/core/DialogStringResolver;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    .line 42
    return-void
.end method

.method private isNullOrEmpty(Ljava/lang/String;)Z
    .locals 1
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 113
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private resourceOrFallbackValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "resourceName"    # Ljava/lang/String;
    .param p2, "settingsValue"    # Ljava/lang/String;

    .prologue
    .line 93
    iget-object v0, p0, Lcom/crashlytics/android/core/DialogStringResolver;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->getStringsFileValue(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/crashlytics/android/core/DialogStringResolver;->stringOrFallback(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private stringOrFallback(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "firstChoice"    # Ljava/lang/String;
    .param p2, "fallback"    # Ljava/lang/String;

    .prologue
    .line 104
    invoke-direct {p0, p1}, Lcom/crashlytics/android/core/DialogStringResolver;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .end local p2    # "fallback":Ljava/lang/String;
    :goto_0
    return-object p2

    .restart local p2    # "fallback":Ljava/lang/String;
    :cond_0
    move-object p2, p1

    goto :goto_0
.end method


# virtual methods
.method public getAlwaysSendButtonTitle()Ljava/lang/String;
    .locals 2

    .prologue
    .line 71
    const-string v0, "com.crashlytics.CrashSubmissionAlwaysSendTitle"

    iget-object v1, p0, Lcom/crashlytics/android/core/DialogStringResolver;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    iget-object v1, v1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->alwaysSendButtonTitle:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/DialogStringResolver;->resourceOrFallbackValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCancelButtonTitle()Ljava/lang/String;
    .locals 2

    .prologue
    .line 80
    const-string v0, "com.crashlytics.CrashSubmissionCancelTitle"

    iget-object v1, p0, Lcom/crashlytics/android/core/DialogStringResolver;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    iget-object v1, v1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->cancelButtonTitle:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/DialogStringResolver;->resourceOrFallbackValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .prologue
    .line 55
    const-string v0, "com.crashlytics.CrashSubmissionPromptMessage"

    iget-object v1, p0, Lcom/crashlytics/android/core/DialogStringResolver;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    iget-object v1, v1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->message:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/DialogStringResolver;->resourceOrFallbackValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSendButtonTitle()Ljava/lang/String;
    .locals 2

    .prologue
    .line 63
    const-string v0, "com.crashlytics.CrashSubmissionSendTitle"

    iget-object v1, p0, Lcom/crashlytics/android/core/DialogStringResolver;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    iget-object v1, v1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->sendButtonTitle:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/DialogStringResolver;->resourceOrFallbackValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 2

    .prologue
    .line 48
    const-string v0, "com.crashlytics.CrashSubmissionPromptTitle"

    iget-object v1, p0, Lcom/crashlytics/android/core/DialogStringResolver;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    iget-object v1, v1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->title:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/DialogStringResolver;->resourceOrFallbackValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
