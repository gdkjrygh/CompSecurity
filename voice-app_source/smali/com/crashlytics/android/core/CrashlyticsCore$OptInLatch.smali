.class Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;
.super Ljava/lang/Object;
.source "CrashlyticsCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/CrashlyticsCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OptInLatch"
.end annotation


# instance fields
.field private final latch:Ljava/util/concurrent/CountDownLatch;

.field private send:Z

.field final synthetic this$0:Lcom/crashlytics/android/core/CrashlyticsCore;


# direct methods
.method private constructor <init>(Lcom/crashlytics/android/core/CrashlyticsCore;)V
    .locals 2

    .prologue
    .line 1065
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->this$0:Lcom/crashlytics/android/core/CrashlyticsCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1066
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->send:Z

    .line 1067
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->latch:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method synthetic constructor <init>(Lcom/crashlytics/android/core/CrashlyticsCore;Lcom/crashlytics/android/core/CrashlyticsCore$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/crashlytics/android/core/CrashlyticsCore;
    .param p2, "x1"    # Lcom/crashlytics/android/core/CrashlyticsCore$1;

    .prologue
    .line 1065
    invoke-direct {p0, p1}, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;-><init>(Lcom/crashlytics/android/core/CrashlyticsCore;)V

    return-void
.end method


# virtual methods
.method await()V
    .locals 1

    .prologue
    .line 1080
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1084
    :goto_0
    return-void

    .line 1081
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method getOptIn()Z
    .locals 1

    .prologue
    .line 1075
    iget-boolean v0, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->send:Z

    return v0
.end method

.method setOptIn(Z)V
    .locals 1
    .param p1, "optIn"    # Z

    .prologue
    .line 1070
    iput-boolean p1, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->send:Z

    .line 1071
    iget-object v0, p0, Lcom/crashlytics/android/core/CrashlyticsCore$OptInLatch;->latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1072
    return-void
.end method
