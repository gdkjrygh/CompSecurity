.class Lcom/crashlytics/android/core/ReportUploader$Worker;
.super Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;
.source "ReportUploader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/ReportUploader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Worker"
.end annotation


# instance fields
.field private final delay:F

.field final synthetic this$0:Lcom/crashlytics/android/core/ReportUploader;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/core/ReportUploader;F)V
    .locals 0
    .param p2, "delay"    # F

    .prologue
    .line 124
    iput-object p1, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->this$0:Lcom/crashlytics/android/core/ReportUploader;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/BackgroundPriorityRunnable;-><init>()V

    .line 125
    iput p2, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->delay:F

    .line 126
    return-void
.end method

.method private attemptUploadWithRetry()V
    .locals 14

    .prologue
    .line 141
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v10

    const-string v11, "CrashlyticsCore"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Starting report processing in "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget v13, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->delay:F

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " second(s)..."

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v11, v12}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    iget v10, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->delay:F

    const/4 v11, 0x0

    cmpl-float v10, v10, v11

    if-lez v10, :cond_0

    .line 146
    :try_start_0
    iget v10, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->delay:F

    const/high16 v11, 0x447a0000    # 1000.0f

    mul-float/2addr v10, v11

    float-to-long v10, v10

    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :cond_0
    invoke-static {}, Lcom/crashlytics/android/core/CrashlyticsCore;->getInstance()Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v0

    .line 154
    .local v0, "crashlyticsCore":Lcom/crashlytics/android/core/CrashlyticsCore;
    invoke-virtual {v0}, Lcom/crashlytics/android/core/CrashlyticsCore;->getHandler()Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;

    move-result-object v2

    .line 155
    .local v2, "handler":Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;
    iget-object v10, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->this$0:Lcom/crashlytics/android/core/ReportUploader;

    invoke-virtual {v10}, Lcom/crashlytics/android/core/ReportUploader;->findReports()Ljava/util/List;

    move-result-object v7

    .line 157
    .local v7, "reports":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/Report;>;"
    invoke-virtual {v2}, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->isHandlingException()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 209
    .end local v0    # "crashlyticsCore":Lcom/crashlytics/android/core/CrashlyticsCore;
    .end local v2    # "handler":Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;
    .end local v7    # "reports":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/Report;>;"
    :cond_1
    :goto_0
    return-void

    .line 147
    :catch_0
    move-exception v1

    .line 148
    .local v1, "e":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    .line 162
    .end local v1    # "e":Ljava/lang/InterruptedException;
    .restart local v0    # "crashlyticsCore":Lcom/crashlytics/android/core/CrashlyticsCore;
    .restart local v2    # "handler":Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;
    .restart local v7    # "reports":Ljava/util/List;, "Ljava/util/List<Lcom/crashlytics/android/core/Report;>;"
    :cond_2
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v0}, Lcom/crashlytics/android/core/CrashlyticsCore;->canSendWithUserApproval()Z

    move-result v10

    if-nez v10, :cond_3

    .line 164
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v10

    const-string v11, "CrashlyticsCore"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "User declined to send. Removing "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " Report(s)."

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v11, v12}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/crashlytics/android/core/Report;

    .line 167
    .local v6, "report":Lcom/crashlytics/android/core/Report;
    invoke-interface {v6}, Lcom/crashlytics/android/core/Report;->remove()Z

    goto :goto_1

    .line 172
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v6    # "report":Lcom/crashlytics/android/core/Report;
    :cond_3
    const/4 v8, 0x0

    .line 173
    .local v8, "retryCount":I
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_1

    .line 174
    invoke-static {}, Lcom/crashlytics/android/core/CrashlyticsCore;->getInstance()Lcom/crashlytics/android/core/CrashlyticsCore;

    move-result-object v10

    invoke-virtual {v10}, Lcom/crashlytics/android/core/CrashlyticsCore;->getHandler()Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;

    move-result-object v10

    invoke-virtual {v10}, Lcom/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;->isHandlingException()Z

    move-result v10

    if-nez v10, :cond_1

    .line 187
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v10

    const-string v11, "CrashlyticsCore"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Attempting to send "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " report(s)"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v11, v12}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .restart local v3    # "i$":Ljava/util/Iterator;
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/crashlytics/android/core/Report;

    .line 190
    .restart local v6    # "report":Lcom/crashlytics/android/core/Report;
    iget-object v10, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->this$0:Lcom/crashlytics/android/core/ReportUploader;

    invoke-virtual {v10, v6}, Lcom/crashlytics/android/core/ReportUploader;->forceUpload(Lcom/crashlytics/android/core/Report;)Z

    goto :goto_3

    .line 194
    .end local v6    # "report":Lcom/crashlytics/android/core/Report;
    :cond_5
    iget-object v10, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->this$0:Lcom/crashlytics/android/core/ReportUploader;

    invoke-virtual {v10}, Lcom/crashlytics/android/core/ReportUploader;->findReports()Ljava/util/List;

    move-result-object v7

    .line 195
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_4

    .line 196
    # getter for: Lcom/crashlytics/android/core/ReportUploader;->RETRY_INTERVALS:[S
    invoke-static {}, Lcom/crashlytics/android/core/ReportUploader;->access$100()[S

    move-result-object v10

    add-int/lit8 v9, v8, 0x1

    .end local v8    # "retryCount":I
    .local v9, "retryCount":I
    # getter for: Lcom/crashlytics/android/core/ReportUploader;->RETRY_INTERVALS:[S
    invoke-static {}, Lcom/crashlytics/android/core/ReportUploader;->access$100()[S

    move-result-object v11

    array-length v11, v11

    add-int/lit8 v11, v11, -0x1

    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    aget-short v10, v10, v11

    int-to-long v4, v10

    .line 198
    .local v4, "interval":J
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v10

    const-string v11, "CrashlyticsCore"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Report submisson: scheduling delayed retry in "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " seconds"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v11, v12}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const-wide/16 v10, 0x3e8

    mul-long/2addr v10, v4

    :try_start_1
    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    move v8, v9

    .line 207
    .end local v9    # "retryCount":I
    .restart local v8    # "retryCount":I
    goto/16 :goto_2

    .line 203
    .end local v8    # "retryCount":I
    .restart local v9    # "retryCount":I
    :catch_1
    move-exception v1

    .line 204
    .restart local v1    # "e":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Thread;->interrupt()V

    goto/16 :goto_0
.end method


# virtual methods
.method public onRun()V
    .locals 4

    .prologue
    .line 131
    :try_start_0
    invoke-direct {p0}, Lcom/crashlytics/android/core/ReportUploader$Worker;->attemptUploadWithRetry()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :goto_0
    iget-object v1, p0, Lcom/crashlytics/android/core/ReportUploader$Worker;->this$0:Lcom/crashlytics/android/core/ReportUploader;

    const/4 v2, 0x0

    # setter for: Lcom/crashlytics/android/core/ReportUploader;->uploadThread:Ljava/lang/Thread;
    invoke-static {v1, v2}, Lcom/crashlytics/android/core/ReportUploader;->access$002(Lcom/crashlytics/android/core/ReportUploader;Ljava/lang/Thread;)Ljava/lang/Thread;

    .line 138
    return-void

    .line 132
    :catch_0
    move-exception v0

    .line 133
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "An unexpected error occurred while attempting to upload crash reports."

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
