.class final Lcom/adobe/mobile/Config$1;
.super Ljava/lang/Object;
.source "Config.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Config;->setContext(Landroid/content/Context;Lcom/adobe/mobile/Config$ApplicationType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 61
    invoke-static {}, Lcom/adobe/mobile/WearableFunctionBridge;->syncConfigFromHandheld()V

    .line 62
    return-void
.end method
