.class Lcom/mixpanel/android/mpmetrics/InAppFragment$1;
.super Ljava/lang/Object;
.source "InAppFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/InAppFragment;->onAttach(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$1;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/InAppFragment$1;->this$0:Lcom/mixpanel/android/mpmetrics/InAppFragment;

    # invokes: Lcom/mixpanel/android/mpmetrics/InAppFragment;->remove()V
    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/InAppFragment;->access$0(Lcom/mixpanel/android/mpmetrics/InAppFragment;)V

    .line 68
    return-void
.end method
