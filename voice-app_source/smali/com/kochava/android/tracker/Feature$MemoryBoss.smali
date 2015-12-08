.class public Lcom/kochava/android/tracker/Feature$MemoryBoss;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "MemoryBoss"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method protected constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 3491
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$MemoryBoss;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 3513
    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .prologue
    .line 3496
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1
    .param p1, "level"    # I

    .prologue
    .line 3501
    const/16 v0, 0x14

    if-ne p1, v0, :cond_0

    .line 3503
    const-string v0, "MemoryBoss - Tracking Activity lost focus"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3504
    const-string v0, "is_in_background"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->changeStatus(Ljava/lang/String;)V

    .line 3505
    const/4 v0, 0x1

    # setter for: Lcom/kochava/android/tracker/Feature;->is_in_background:Z
    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->access$3002(Z)Z

    .line 3507
    :cond_0
    return-void
.end method
