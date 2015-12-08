.class Lcom/urbanairship/analytics/ActivityMonitor;
.super Ljava/lang/Object;
.source "ActivityMonitor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/analytics/ActivityMonitor$Listener;,
        Lcom/urbanairship/analytics/ActivityMonitor$Source;
    }
.end annotation


# static fields
.field private static final BACKGROUND_DELAY_MS:I = 0x7d0


# instance fields
.field private activityStates:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/urbanairship/analytics/ActivityState;",
            ">;"
        }
    .end annotation
.end field

.field private analyticsEnabled:Z

.field private currentSdkVersion:I

.field private isForeground:Z

.field private listener:Lcom/urbanairship/analytics/ActivityMonitor$Listener;

.field private minSdkVersion:I


# direct methods
.method public constructor <init>(IIZ)V
    .locals 1
    .param p1, "minSdkVersion"    # I
    .param p2, "currentSdkVersion"    # I
    .param p3, "analyticsEnabled"    # Z

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/analytics/ActivityMonitor;->activityStates:Landroid/util/SparseArray;

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/urbanairship/analytics/ActivityMonitor;->isForeground:Z

    .line 70
    iput p1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->minSdkVersion:I

    .line 71
    iput p2, p0, Lcom/urbanairship/analytics/ActivityMonitor;->currentSdkVersion:I

    .line 72
    iput-boolean p3, p0, Lcom/urbanairship/analytics/ActivityMonitor;->analyticsEnabled:Z

    .line 73
    return-void
.end method

.method private getActivityState(Landroid/app/Activity;)Lcom/urbanairship/analytics/ActivityState;
    .locals 5
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 114
    iget-object v1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->activityStates:Landroid/util/SparseArray;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/analytics/ActivityState;

    .line 115
    .local v0, "state":Lcom/urbanairship/analytics/ActivityState;
    if-nez v0, :cond_0

    .line 116
    new-instance v0, Lcom/urbanairship/analytics/ActivityState;

    .end local v0    # "state":Lcom/urbanairship/analytics/ActivityState;
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/urbanairship/analytics/ActivityMonitor;->minSdkVersion:I

    iget v3, p0, Lcom/urbanairship/analytics/ActivityMonitor;->currentSdkVersion:I

    iget-boolean v4, p0, Lcom/urbanairship/analytics/ActivityMonitor;->analyticsEnabled:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/urbanairship/analytics/ActivityState;-><init>(Ljava/lang/String;IIZ)V

    .line 117
    .restart local v0    # "state":Lcom/urbanairship/analytics/ActivityState;
    iget-object v1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->activityStates:Landroid/util/SparseArray;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 120
    :cond_0
    return-object v0
.end method


# virtual methods
.method public activityStarted(Landroid/app/Activity;Lcom/urbanairship/analytics/ActivityMonitor$Source;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "source"    # Lcom/urbanairship/analytics/ActivityMonitor$Source;

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/ActivityMonitor;->getActivityState(Landroid/app/Activity;)Lcom/urbanairship/analytics/ActivityState;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/urbanairship/analytics/ActivityState;->setStarted(Lcom/urbanairship/analytics/ActivityMonitor$Source;)V

    .line 88
    invoke-virtual {p0}, Lcom/urbanairship/analytics/ActivityMonitor;->updateForegroundState()V

    .line 89
    return-void
.end method

.method public activityStopped(Landroid/app/Activity;Lcom/urbanairship/analytics/ActivityMonitor$Source;)V
    .locals 4
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "source"    # Lcom/urbanairship/analytics/ActivityMonitor$Source;

    .prologue
    .line 97
    invoke-direct {p0, p1}, Lcom/urbanairship/analytics/ActivityMonitor;->getActivityState(Landroid/app/Activity;)Lcom/urbanairship/analytics/ActivityState;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/urbanairship/analytics/ActivityState;->setStopped(Lcom/urbanairship/analytics/ActivityMonitor$Source;)V

    .line 99
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 100
    .local v0, "handler":Landroid/os/Handler;
    new-instance v1, Lcom/urbanairship/analytics/ActivityMonitor$1;

    invoke-direct {v1, p0}, Lcom/urbanairship/analytics/ActivityMonitor$1;-><init>(Lcom/urbanairship/analytics/ActivityMonitor;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 106
    return-void
.end method

.method setForeground(Z)V
    .locals 1
    .param p1, "isForeground"    # Z

    .prologue
    .line 139
    iget-boolean v0, p0, Lcom/urbanairship/analytics/ActivityMonitor;->isForeground:Z

    if-ne v0, p1, :cond_0

    .line 154
    :goto_0
    return-void

    .line 143
    :cond_0
    iput-boolean p1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->isForeground:Z

    .line 145
    monitor-enter p0

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/urbanairship/analytics/ActivityMonitor;->listener:Lcom/urbanairship/analytics/ActivityMonitor$Listener;

    if-eqz v0, :cond_1

    .line 147
    if-eqz p1, :cond_2

    .line 148
    iget-object v0, p0, Lcom/urbanairship/analytics/ActivityMonitor;->listener:Lcom/urbanairship/analytics/ActivityMonitor$Listener;

    invoke-virtual {v0}, Lcom/urbanairship/analytics/ActivityMonitor$Listener;->onForeground()V

    .line 153
    :cond_1
    :goto_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 150
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/urbanairship/analytics/ActivityMonitor;->listener:Lcom/urbanairship/analytics/ActivityMonitor$Listener;

    invoke-virtual {v0}, Lcom/urbanairship/analytics/ActivityMonitor$Listener;->onBackground()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public setListener(Lcom/urbanairship/analytics/ActivityMonitor$Listener;)V
    .locals 1
    .param p1, "listener"    # Lcom/urbanairship/analytics/ActivityMonitor$Listener;

    .prologue
    .line 76
    monitor-enter p0

    .line 77
    :try_start_0
    iput-object p1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->listener:Lcom/urbanairship/analytics/ActivityMonitor$Listener;

    .line 78
    monitor-exit p0

    .line 79
    return-void

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method updateForegroundState()V
    .locals 2

    .prologue
    .line 128
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->activityStates:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 129
    iget-object v1, p0, Lcom/urbanairship/analytics/ActivityMonitor;->activityStates:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/urbanairship/analytics/ActivityState;

    invoke-virtual {v1}, Lcom/urbanairship/analytics/ActivityState;->isForeground()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 130
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/urbanairship/analytics/ActivityMonitor;->setForeground(Z)V

    .line 136
    :goto_1
    return-void

    .line 128
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 135
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/urbanairship/analytics/ActivityMonitor;->setForeground(Z)V

    goto :goto_1
.end method
