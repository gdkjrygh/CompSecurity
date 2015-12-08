.class Lcom/mixpanel/android/mpmetrics/GCMReceiver$2;
.super Ljava/lang/Object;
.source "GCMReceiver.java"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/GCMReceiver;->handleRegistrationIntent(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/GCMReceiver;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/GCMReceiver;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/GCMReceiver$2;->this$0:Lcom/mixpanel/android/mpmetrics/GCMReceiver;

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public process(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V
    .locals 1
    .param p1, "api"    # Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .prologue
    .line 233
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v0

    invoke-interface {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->clearPushRegistrationId()V

    .line 234
    return-void
.end method
