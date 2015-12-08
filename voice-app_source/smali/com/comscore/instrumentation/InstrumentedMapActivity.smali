.class public Lcom/comscore/instrumentation/InstrumentedMapActivity;
.super Lcom/google/android/maps/MapActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/maps/MapActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected isRouteDisplayed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/comscore/instrumentation/InstrumentedMapActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/analytics/comScore;->setAppContext(Landroid/content/Context;)V

    return-void
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onPause()V

    invoke-static {}, Lcom/comscore/analytics/comScore;->onExitForeground()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onResume()V

    invoke-static {}, Lcom/comscore/analytics/comScore;->getCore()Lcom/comscore/analytics/Core;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/comscore/analytics/Core;->setCurrentActivityName(Ljava/lang/String;)V

    invoke-static {}, Lcom/comscore/analytics/comScore;->onEnterForeground()V

    return-void
.end method
