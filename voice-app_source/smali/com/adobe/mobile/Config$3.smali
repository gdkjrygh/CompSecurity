.class final Lcom/adobe/mobile/Config$3;
.super Ljava/lang/Object;
.source "Config.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Config;->setPrivacyStatus(Lcom/adobe/mobile/MobilePrivacyStatus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$status:Lcom/adobe/mobile/MobilePrivacyStatus;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/MobilePrivacyStatus;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/adobe/mobile/Config$3;->val$status:Lcom/adobe/mobile/MobilePrivacyStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 94
    invoke-static {}, Lcom/adobe/mobile/MobileConfig;->getInstance()Lcom/adobe/mobile/MobileConfig;

    move-result-object v0

    iget-object v1, p0, Lcom/adobe/mobile/Config$3;->val$status:Lcom/adobe/mobile/MobilePrivacyStatus;

    invoke-virtual {v0, v1}, Lcom/adobe/mobile/MobileConfig;->setPrivacyStatus(Lcom/adobe/mobile/MobilePrivacyStatus;)V

    .line 95
    return-void
.end method
