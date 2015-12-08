.class Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;
.super Ljava/lang/Object;
.source "InstallerPackageNameProvider.java"

# interfaces
.implements Lio/fabric/sdk/android/services/cache/ValueLoader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/cache/ValueLoader",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;->this$0:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic load(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 36
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;->load(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public load(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 40
    .local v2, "pm":Landroid/content/pm/PackageManager;
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 41
    .local v0, "hostAppPackageName":Ljava/lang/String;
    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 45
    .local v1, "installerPackageName":Ljava/lang/String;
    if-nez v1, :cond_0

    const-string v1, ""

    .end local v1    # "installerPackageName":Ljava/lang/String;
    :cond_0
    return-object v1
.end method
