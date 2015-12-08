.class public final Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor$PriorityThreadFactory;
.super Ljava/lang/Object;
.source "PriorityThreadPoolExecutor.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "PriorityThreadFactory"
.end annotation


# instance fields
.field private final threadPriority:I


# direct methods
.method public constructor <init>(I)V
    .locals 0
    .param p1, "threadPriority"    # I

    .prologue
    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput p1, p0, Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor$PriorityThreadFactory;->threadPriority:I

    .line 127
    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2
    .param p1, "r"    # Ljava/lang/Runnable;

    .prologue
    .line 131
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 132
    .local v0, "thread":Ljava/lang/Thread;
    iget v1, p0, Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor$PriorityThreadFactory;->threadPriority:I

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 133
    const-string v1, "Queue"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 134
    return-object v0
.end method
