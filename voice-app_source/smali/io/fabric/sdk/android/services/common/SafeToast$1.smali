.class Lio/fabric/sdk/android/services/common/SafeToast$1;
.super Lio/fabric/sdk/android/services/concurrency/PriorityRunnable;
.source "SafeToast.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/common/SafeToast;->show()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/common/SafeToast;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/common/SafeToast;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/SafeToast$1;->this$0:Lio/fabric/sdk/android/services/common/SafeToast;

    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityRunnable;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/SafeToast$1;->this$0:Lio/fabric/sdk/android/services/common/SafeToast;

    # invokes: Landroid/widget/Toast;->show()V
    invoke-static {v0}, Lio/fabric/sdk/android/services/common/SafeToast;->access$001(Lio/fabric/sdk/android/services/common/SafeToast;)V

    .line 54
    return-void
.end method
