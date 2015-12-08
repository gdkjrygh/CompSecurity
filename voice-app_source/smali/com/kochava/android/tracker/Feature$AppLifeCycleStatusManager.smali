.class public Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;
.super Ljava/lang/Object;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kochava/android/tracker/Feature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "AppLifeCycleStatusManager"
.end annotation


# static fields
.field protected static final IS_FOCUSED:Ljava/lang/String; = "is_focused"

.field protected static final IS_IN_BACKGROUND:Ljava/lang/String; = "is_in_background"

.field protected static active:Z

.field protected static resumed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 3524
    sput-boolean v0, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->active:Z

    .line 3525
    sput-boolean v0, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->resumed:Z

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 3519
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static changeStatus(Ljava/lang/String;)V
    .locals 1
    .param p0, "status"    # Ljava/lang/String;

    .prologue
    .line 3529
    new-instance v0, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager$1;

    invoke-direct {v0, p0}, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager$1;-><init>(Ljava/lang/String;)V

    .line 3570
    .local v0, "changeStatusThread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3581
    return-void
.end method
