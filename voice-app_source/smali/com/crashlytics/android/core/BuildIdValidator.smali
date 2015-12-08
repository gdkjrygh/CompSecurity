.class Lcom/crashlytics/android/core/BuildIdValidator;
.super Ljava/lang/Object;
.source "BuildIdValidator.java"


# static fields
.field private static final MESSAGE:Ljava/lang/String; = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app\'s organization."


# instance fields
.field private final buildId:Ljava/lang/String;

.field private final requiringBuildId:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0
    .param p1, "buildId"    # Ljava/lang/String;
    .param p2, "requiringBuildId"    # Z

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/crashlytics/android/core/BuildIdValidator;->buildId:Ljava/lang/String;

    .line 25
    iput-boolean p2, p0, Lcom/crashlytics/android/core/BuildIdValidator;->requiringBuildId:Z

    .line 26
    return-void
.end method


# virtual methods
.method protected getMessage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "apiKey"    # Ljava/lang/String;
    .param p2, "appId"    # Ljava/lang/String;

    .prologue
    .line 66
    const-string v0, "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app\'s organization."

    return-object v0
.end method

.method public validate(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "apiKey"    # Ljava/lang/String;
    .param p2, "appId"    # Ljava/lang/String;

    .prologue
    .line 36
    iget-object v1, p0, Lcom/crashlytics/android/core/BuildIdValidator;->buildId:Ljava/lang/String;

    invoke-static {v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/crashlytics/android/core/BuildIdValidator;->requiringBuildId:Z

    if-eqz v1, :cond_0

    .line 37
    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/core/BuildIdValidator;->getMessage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    .local v0, "message":Ljava/lang/String;
    const-string v1, "CrashlyticsCore"

    const-string v2, "."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     |  | "

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     |  |"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     |  |"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    const-string v1, "CrashlyticsCore"

    const-string v2, ".   \\ |  | /"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    const-string v1, "CrashlyticsCore"

    const-string v2, ".    \\    /"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     \\  /"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    const-string v1, "CrashlyticsCore"

    const-string v2, ".      \\/"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    const-string v1, "CrashlyticsCore"

    const-string v2, "."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    const-string v1, "CrashlyticsCore"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    const-string v1, "CrashlyticsCore"

    const-string v2, "."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    const-string v1, "CrashlyticsCore"

    const-string v2, ".      /\\"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     /  \\"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    const-string v1, "CrashlyticsCore"

    const-string v2, ".    /    \\"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    const-string v1, "CrashlyticsCore"

    const-string v2, ".   / |  | \\"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     |  |"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     |  |"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    const-string v1, "CrashlyticsCore"

    const-string v2, ".     |  |"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    const-string v1, "CrashlyticsCore"

    const-string v2, "."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    new-instance v1, Lcom/crashlytics/android/core/CrashlyticsMissingDependencyException;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/core/CrashlyticsMissingDependencyException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 60
    .end local v0    # "message":Ljava/lang/String;
    :cond_0
    iget-boolean v1, p0, Lcom/crashlytics/android/core/BuildIdValidator;->requiringBuildId:Z

    if-nez v1, :cond_1

    .line 61
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Configured not to require a build ID."

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_1
    return-void
.end method
