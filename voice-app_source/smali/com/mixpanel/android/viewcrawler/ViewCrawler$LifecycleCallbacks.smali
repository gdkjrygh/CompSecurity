.class Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;
.super Ljava/lang/Object;
.source "ViewCrawler.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Lcom/mixpanel/android/viewcrawler/FlipGesture$OnFlipGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewCrawler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LifecycleCallbacks"
.end annotation


# instance fields
.field private final mEmulatorConnector:Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;

.field private final mFlipGesture:Lcom/mixpanel/android/viewcrawler/FlipGesture;

.field final synthetic this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)V
    .locals 1

    .prologue
    .line 178
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    new-instance v0, Lcom/mixpanel/android/viewcrawler/FlipGesture;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/viewcrawler/FlipGesture;-><init>(Lcom/mixpanel/android/viewcrawler/FlipGesture$OnFlipGestureListener;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->mFlipGesture:Lcom/mixpanel/android/viewcrawler/FlipGesture;

    .line 180
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;

    invoke-direct {v0, p1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;-><init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->mEmulatorConnector:Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;

    .line 181
    return-void
.end method

.method private installConnectionSensor(Landroid/app/Activity;)V
    .locals 4
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 224
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->isInEmulator()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$2(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableEmulatorBindingUI()Z

    move-result v2

    if-nez v2, :cond_1

    .line 225
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->mEmulatorConnector:Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;

    invoke-virtual {v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->start()V

    .line 231
    :cond_0
    :goto_0
    return-void

    .line 226
    :cond_1
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$2(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableGestureBindingUI()Z

    move-result v2

    if-nez v2, :cond_0

    .line 227
    const-string v2, "sensor"

    invoke-virtual {p1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/SensorManager;

    .line 228
    .local v1, "sensorManager":Landroid/hardware/SensorManager;
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    .line 229
    .local v0, "accelerometer":Landroid/hardware/Sensor;
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->mFlipGesture:Lcom/mixpanel/android/viewcrawler/FlipGesture;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_0
.end method

.method private isInEmulator()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 243
    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    const-string v2, "goldfish"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 263
    :cond_0
    :goto_0
    return v0

    .line 247
    :cond_1
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v2, "generic"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 251
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "generic"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 255
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const-string v2, "sdk"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 259
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sdk"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 263
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private uninstallConnectionSensor(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 234
    invoke-direct {p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->isInEmulator()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$2(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableEmulatorBindingUI()Z

    move-result v1

    if-nez v1, :cond_1

    .line 235
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->mEmulatorConnector:Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;

    invoke-virtual {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;->stop()V

    .line 240
    :cond_0
    :goto_0
    return-void

    .line 236
    :cond_1
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$2(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableGestureBindingUI()Z

    move-result v1

    if-nez v1, :cond_0

    .line 237
    const-string v1, "sensor"

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    .line 238
    .local v0, "sensorManager":Landroid/hardware/SensorManager;
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->mFlipGesture:Lcom/mixpanel/android/viewcrawler/FlipGesture;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    goto :goto_0
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 191
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 221
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 205
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;
    invoke-static {v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$1(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/EditState;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/viewcrawler/EditState;->remove(Landroid/app/Activity;)V

    .line 206
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;
    invoke-static {v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$1(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/EditState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/EditState;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->uninstallConnectionSensor(Landroid/app/Activity;)V

    .line 209
    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 199
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->installConnectionSensor(Landroid/app/Activity;)V

    .line 200
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;
    invoke-static {v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$1(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/EditState;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/viewcrawler/EditState;->add(Landroid/app/Activity;)V

    .line 201
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 217
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 195
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 213
    return-void
.end method

.method public onFlipGesture()V
    .locals 3

    .prologue
    .line 185
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 186
    .local v0, "message":Landroid/os/Message;
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;->this$0:Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    # getter for: Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    invoke-static {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 187
    return-void
.end method
