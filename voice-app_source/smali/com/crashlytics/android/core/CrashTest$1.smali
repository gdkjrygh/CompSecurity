.class Lcom/crashlytics/android/core/CrashTest$1;
.super Landroid/os/AsyncTask;
.source "CrashTest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/CrashTest;->crashAsyncTask(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/core/CrashTest;

.field final synthetic val$delayMs:J


# direct methods
.method constructor <init>(Lcom/crashlytics/android/core/CrashTest;J)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashTest$1;->this$0:Lcom/crashlytics/android/core/CrashTest;

    iput-wide p2, p0, Lcom/crashlytics/android/core/CrashTest$1;->val$delayMs:J

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 42
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/crashlytics/android/core/CrashTest$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 46
    :try_start_0
    iget-wide v0, p0, Lcom/crashlytics/android/core/CrashTest$1;->val$delayMs:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    :goto_0
    iget-object v0, p0, Lcom/crashlytics/android/core/CrashTest$1;->this$0:Lcom/crashlytics/android/core/CrashTest;

    const-string v1, "Background thread crash"

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/core/CrashTest;->throwRuntimeException(Ljava/lang/String;)V

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 47
    :catch_0
    move-exception v0

    goto :goto_0
.end method
