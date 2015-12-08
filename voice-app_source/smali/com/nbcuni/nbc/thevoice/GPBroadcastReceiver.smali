.class public Lcom/nbcuni/nbc/thevoice/GPBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GPBroadcastReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1, "c"    # Landroid/content/Context;
    .param p2, "i"    # Landroid/content/Intent;

    .prologue
    .line 12
    invoke-static {p1, p2}, Lcom/adobe/mobile/Analytics;->processReferrer(Landroid/content/Context;Landroid/content/Intent;)V

    .line 14
    return-void
.end method
