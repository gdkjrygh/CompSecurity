.class Lcom/crashlytics/android/answers/AnswersEventsHandler$5;
.super Ljava/lang/Object;
.source "AnswersEventsHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/answers/AnswersEventsHandler;->processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

.field final synthetic val$eventBuilder:Lcom/crashlytics/android/answers/SessionEvent$Builder;

.field final synthetic val$flush:Z


# direct methods
.method constructor <init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;Lcom/crashlytics/android/answers/SessionEvent$Builder;Z)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    iput-object p2, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->val$eventBuilder:Lcom/crashlytics/android/answers/SessionEvent$Builder;

    iput-boolean p3, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->val$flush:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 148
    :try_start_0
    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    iget-object v1, v1, Lcom/crashlytics/android/answers/AnswersEventsHandler;->strategy:Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;

    iget-object v2, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->val$eventBuilder:Lcom/crashlytics/android/answers/SessionEvent$Builder;

    invoke-interface {v1, v2}, Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;->processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V

    .line 149
    iget-boolean v1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->val$flush:Z

    if-eqz v1, :cond_0

    .line 151
    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    iget-object v1, v1, Lcom/crashlytics/android/answers/AnswersEventsHandler;->strategy:Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;

    invoke-interface {v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;->rollFileOver()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 153
    :catch_0
    move-exception v0

    .line 154
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to process event"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
