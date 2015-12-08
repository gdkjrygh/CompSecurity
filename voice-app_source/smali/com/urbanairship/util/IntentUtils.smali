.class public Lcom/urbanairship/util/IntentUtils;
.super Ljava/lang/Object;
.source "IntentUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static scheduleIntent(Landroid/content/Context;Landroid/content/Intent;IJ)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "alarmType"    # I
    .param p3, "delayInMs"    # J

    .prologue
    const/4 v3, 0x0

    .line 61
    const-string v2, "alarm"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 62
    .local v0, "alarmManager":Landroid/app/AlarmManager;
    invoke-static {p0, v3, p1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 63
    .local v1, "pendingIntent":Landroid/app/PendingIntent;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, p3

    invoke-virtual {v0, p2, v2, v3, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 64
    return-void
.end method

.method public static scheduleIntent(Landroid/content/Context;Landroid/content/Intent;J)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "delayInMs"    # J

    .prologue
    .line 48
    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p2, p3}, Lcom/urbanairship/util/IntentUtils;->scheduleIntent(Landroid/content/Context;Landroid/content/Intent;IJ)V

    .line 49
    return-void
.end method
